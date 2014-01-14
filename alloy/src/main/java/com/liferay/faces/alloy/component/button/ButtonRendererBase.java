/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.alloy.component.button;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class ButtonRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Button button = (Button) uiComponent;
		encodeHTML(facesContext, button);
		encodeJavaScript(facesContext, button);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Button button) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Button button) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, button);

		bufferedResponseWriter.write("var button = new Y.Button");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBoundingBox(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContentBox(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClass(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDestroyed(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFocused(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIcon(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIconAlign(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIconElement(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderButtonId(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInitialized(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderButtonLocale(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPrimary(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRendered(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSrcNode(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, button);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, button);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, button);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "boundingBox", button.getBoundingBox());
	}

	protected void renderContentBox(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "contentBox", button.getContentBox());
	}

	protected void renderCssClass(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "cssClass", button.getCssClass());
	}

	protected void renderDestroyed(ResponseWriter responseWriter, Button button) throws IOException {
		renderBoolean(responseWriter, "destroyed", button.getDestroyed());
	}

	protected void renderDisabled(ResponseWriter responseWriter, Button button) throws IOException {
		renderBoolean(responseWriter, "disabled", button.getDisabled());
	}

	protected void renderFocused(ResponseWriter responseWriter, Button button) throws IOException {
		renderBoolean(responseWriter, "focused", button.getFocused());
	}

	protected void renderHeight(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "height", button.getHeight());
	}

	protected void renderIcon(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "icon", button.getIcon());
	}

	protected void renderIconAlign(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "iconAlign", button.getIconAlign());
	}

	protected void renderIconElement(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "iconElement", button.getIconElement());
	}

	protected void renderButtonId(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "buttonId", button.getButtonId());
	}

	protected void renderInitialized(ResponseWriter responseWriter, Button button) throws IOException {
		renderBoolean(responseWriter, "initialized", button.getInitialized());
	}

	protected void renderLabel(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "label", button.getLabel());
	}

	protected void renderButtonLocale(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "buttonLocale", button.getButtonLocale());
	}

	protected void renderPrimary(ResponseWriter responseWriter, Button button) throws IOException {
		renderBoolean(responseWriter, "primary", button.getPrimary());
	}

	protected void renderRender(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "render", button.getRender());
	}

	protected void renderRendered(ResponseWriter responseWriter, Button button) throws IOException {
		renderBoolean(responseWriter, "rendered", button.getRendered());
	}

	protected void renderSrcNode(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "srcNode", button.getSrcNode());
	}

	protected void renderStrings(ResponseWriter responseWriter, Button button) throws IOException {
		renderObject(responseWriter, "strings", button.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, Button button) throws IOException {
		renderNumber(responseWriter, "tabIndex", button.getTabIndex());
	}

	protected void renderVisible(ResponseWriter responseWriter, Button button) throws IOException {
		renderBoolean(responseWriter, "visible", button.getVisible());
	}

	protected void renderWidth(ResponseWriter responseWriter, Button button) throws IOException {
		renderString(responseWriter, "width", button.getWidth());
	}

}