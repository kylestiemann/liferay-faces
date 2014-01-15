package com.liferay.faces.alloy.component.base;

import java.io.IOException;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.render.Renderer;

import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.context.ExtFacesContext;
import com.liferay.faces.util.lang.StringPool;
import com.liferay.faces.util.portal.ScriptDataUtil;
import com.liferay.faces.util.portal.WebKeys;
import com.liferay.portal.kernel.servlet.taglib.aui.ScriptData;
import com.liferay.portal.model.Portlet;

public abstract class AUIRenderer extends Renderer {
	
	protected void beginJavaScript(FacesContext facesContext, UIComponent uiComponent) throws IOException {
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();
		
		bufferedResponseWriter.write(StringPool.FORWARD_SLASH);
		bufferedResponseWriter.write(StringPool.FORWARD_SLASH);
		bufferedResponseWriter.write(StringPool.SPACE);
		bufferedResponseWriter.write(StringPool.CDATA_OPEN);
		bufferedResponseWriter.write(StringPool.NEW_LINE);
		
		if (facesContext.getPartialViewContext().isAjaxRequest()) {
			
			bufferedResponseWriter.write("YUI().use");
			bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(getModule());
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
			bufferedResponseWriter.write("function(Y) ");
			bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}
	}
	
	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {
		super.encodeBegin(facesContext, uiComponent);
	}
	
	protected void endJavaScript(FacesContext facesContext) throws IOException {
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();
		
		if (facesContext.getPartialViewContext().isAjaxRequest()) {

			bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
			bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
			bufferedResponseWriter.write(StringPool.SEMICOLON);
		}
		
		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.FORWARD_SLASH);
		bufferedResponseWriter.write(StringPool.FORWARD_SLASH);
		bufferedResponseWriter.write(StringPool.SPACE);
		bufferedResponseWriter.write(StringPool.CDATA_CLOSE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);
	}
	
	protected abstract String getModule();

	protected void handleBuffer(FacesContext facesContext, UIComponent uiComponent) {

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		// If running in an Ajax request, then it is not possible to render the scripts at the bottom of the
		// portal page. Instead, store the script in the JavaScript map so that PartialViewContextCleanupImpl
		// knows to include it in the <eval>...</eval> section of the JSF partial-response.
		if (facesContext.getPartialViewContext().isAjaxRequest()) {
			Map<String, String> javaScriptMap = ExtFacesContext.getInstance().getJavaScriptMap();
			javaScriptMap.put(uiComponent.getClientId(facesContext), bufferedResponseWriter.toString());
		}

		// Otherwise, render the script at the bottom of the portal page by setting the WebKeys.AUI_SCRIPT_DATA
		// request attribute.
		else {
			ExternalContext externalContext = facesContext.getExternalContext();
			ScriptData scriptData = (ScriptData) externalContext.getRequestMap().get(WebKeys.AUI_SCRIPT_DATA);

			if (scriptData == null) {
				scriptData = new ScriptData();
				externalContext.getRequestMap().put(WebKeys.AUI_SCRIPT_DATA, scriptData);
			}

			String portletId = StringPool.BLANK;
			Portlet portlet = (Portlet) facesContext.getExternalContext().getRequestMap().get(WebKeys.RENDER_PORTLET);

			if (portlet != null) {
				portletId = portlet.getPortletId();
			}

			ScriptDataUtil.append(scriptData, portletId, bufferedResponseWriter.toString(), getModule());
		}
	}

	protected String renderArray(String attributeName, Object attributeValue)
		throws IOException {

		StringBuilder sb = new StringBuilder();

		sb.append(attributeName);
		sb.append(StringPool.COLON);
		sb.append(String.valueOf(attributeValue));
		
		return sb.toString();
	}

	protected String renderBoolean(String attributeName, Object attributeValue)
		throws IOException {

		StringBuilder sb = new StringBuilder();

		sb.append(attributeName);
		sb.append(StringPool.COLON);
		sb.append(String.valueOf(attributeValue));
		
		return sb.toString();
	}

	protected String renderNumber(String attributeName, Object attributeValue)
		throws IOException {

		StringBuilder sb = new StringBuilder();

		sb.append(attributeName);
		sb.append(StringPool.COLON);
		sb.append(String.valueOf(attributeValue));
		
		return sb.toString();
	}

	protected String renderObject(String attributeName, Object attributeValue)
		throws IOException {

		StringBuilder sb = new StringBuilder();

		sb.append(attributeName);
		sb.append(StringPool.COLON);
		sb.append(StringPool.QUOTE);
		sb.append(String.valueOf(attributeValue));
		sb.append(StringPool.QUOTE);
		
		return sb.toString();
	}

	protected String renderString(String attributeName, Object attributeValue)
		throws IOException {
		
		StringBuilder sb = new StringBuilder();

		sb.append(attributeName);
		sb.append(StringPool.COLON);
		sb.append(StringPool.QUOTE);
		sb.append(String.valueOf(attributeValue));
		sb.append(StringPool.QUOTE);
		
		return sb.toString();
	}

}