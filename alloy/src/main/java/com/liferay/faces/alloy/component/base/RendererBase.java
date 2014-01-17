/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.component.base;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.Renderer;

import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.context.ExtFacesContext;
import com.liferay.faces.util.lang.StringPool;
import com.liferay.faces.util.portal.ScriptDataUtil;
import com.liferay.faces.util.portal.WebKeys;
import com.liferay.portal.kernel.servlet.taglib.aui.ScriptData;
import com.liferay.portal.model.Portlet;


/**
 * @author  Neil Griffin
 */
public abstract class RendererBase extends Renderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {
		super.encodeBegin(facesContext, uiComponent);

		encodeHTMLBegin(facesContext, uiComponent);
	}

	@Override
	public void encodeEnd(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		encodeHTMLEnd(facesContext, uiComponent);
		encodeJavaScript(facesContext, uiComponent);
	}

	protected void encodeHTMLBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {
		//no-op
	}

	protected void encodeHTMLEnd(FacesContext facesContext, UIComponent uiComponent) throws IOException {
		// no-op
	}

	protected abstract void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		encodeJavaScriptBegin(facesContext);
		encodeJavaScriptMain(facesContext, uiComponent);
		encodeJavaScriptCustom(facesContext, uiComponent);
		encodeJavaScriptEnd(facesContext);

		handleBuffer(facesContext, uiComponent);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected void encodeJavaScriptBegin(FacesContext facesContext) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		if (facesContext.getPartialViewContext().isAjaxRequest()) {

			responseWriter.write("YUI().use");
			responseWriter.write(StringPool.OPEN_PARENTHESIS);
			responseWriter.write(StringPool.NEW_LINE);
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(getModule());
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.NEW_LINE);
			responseWriter.write("function(Y) ");
			responseWriter.write(StringPool.OPEN_CURLY_BRACE);
			responseWriter.write(StringPool.NEW_LINE);
		}
	}

	protected void encodeJavaScriptCustom(FacesContext facesContext, UIComponent uiComponent) throws IOException {
		// no-op
	}

	protected void encodeJavaScriptEnd(FacesContext facesContext) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		if (facesContext.getPartialViewContext().isAjaxRequest()) {

			responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
			responseWriter.write(StringPool.NEW_LINE);
			responseWriter.write(StringPool.CLOSE_PARENTHESIS);
			responseWriter.write(StringPool.SEMICOLON);
		}

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_CLOSE);
		responseWriter.write(StringPool.NEW_LINE);
	}

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
	
	protected abstract String getModule();

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
		
		return null;
	}

	protected String renderMap(
			String attributeName, Map<String, String> attributeValue)
		throws IOException {

		StringBuilder sb = new StringBuilder();

		sb.append(attributeName);
		sb.append(StringPool.COLON);
		sb.append(StringPool.OPEN_CURLY_BRACE);

		Set<String> keys = attributeValue.keySet();

		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String key = it.next();

			sb.append(renderString(key, attributeValue.get(key)));

			if (it.hasNext()) {
				sb.append(StringPool.COMMA);
			}
		}

		sb.append(StringPool.CLOSE_CURLY_BRACE);

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
