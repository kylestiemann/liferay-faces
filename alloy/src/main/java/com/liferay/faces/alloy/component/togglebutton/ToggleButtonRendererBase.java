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
package com.liferay.faces.alloy.component.togglebutton;

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
public abstract class ToggleButtonRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ToggleButton toggleButton = (ToggleButton) uiComponent;
		encodeHTML(facesContext, toggleButton);
		encodeJavaScript(facesContext, toggleButton);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ToggleButton toggleButton) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ToggleButton toggleButton) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, toggleButton);

		bufferedResponseWriter.write("var toggleButton = new Y.ToggleButton");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderCssClass(responseWriter, toggleButton);
		responseWriter.write(StringPool.COMMA);
		renderIcon(responseWriter, toggleButton);
		responseWriter.write(StringPool.COMMA);
		renderIconAlign(responseWriter, toggleButton);
		responseWriter.write(StringPool.COMMA);
		renderIconElement(responseWriter, toggleButton);
		responseWriter.write(StringPool.COMMA);
		renderPrimary(responseWriter, toggleButton);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, toggleButton);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCssClass(ResponseWriter responseWriter, ToggleButton toggleButton) throws IOException {
		renderString(responseWriter, "cssClass", toggleButton.getCssClass());
	}

	protected void renderIcon(ResponseWriter responseWriter, ToggleButton toggleButton) throws IOException {
		renderString(responseWriter, "icon", toggleButton.getIcon());
	}

	protected void renderIconAlign(ResponseWriter responseWriter, ToggleButton toggleButton) throws IOException {
		renderString(responseWriter, "iconAlign", toggleButton.getIconAlign());
	}

	protected void renderIconElement(ResponseWriter responseWriter, ToggleButton toggleButton) throws IOException {
		renderString(responseWriter, "iconElement", toggleButton.getIconElement());
	}

	protected void renderPrimary(ResponseWriter responseWriter, ToggleButton toggleButton) throws IOException {
		renderBoolean(responseWriter, "primary", toggleButton.getPrimary());
	}

}