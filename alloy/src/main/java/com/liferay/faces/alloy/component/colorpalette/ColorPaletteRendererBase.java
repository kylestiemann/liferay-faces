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
package com.liferay.faces.alloy.component.colorpalette;

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
public abstract class ColorPaletteRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-color-palette";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ColorPalette colorPalette = (ColorPalette) uiComponent;
		encodeHTML(facesContext, colorPalette);
		encodeJavaScript(facesContext, colorPalette);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ColorPalette colorPalette) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ColorPalette colorPalette) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, colorPalette);

		bufferedResponseWriter.write("var colorPalette = new Y.ColorPalette");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderColumns(bufferedResponseWriter, colorPalette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainerNode(bufferedResponseWriter, colorPalette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormatter(bufferedResponseWriter, colorPalette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderItems(bufferedResponseWriter, colorPalette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, colorPalette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToggleSelection(bufferedResponseWriter, colorPalette);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, colorPalette);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderColumns(ResponseWriter responseWriter, ColorPalette colorPalette) throws IOException {
		renderNumber(responseWriter, "columns", colorPalette.getColumns());
	}

	protected void renderContainerNode(ResponseWriter responseWriter, ColorPalette colorPalette) throws IOException {
		renderString(responseWriter, "containerNode", colorPalette.getContainerNode());
	}

	protected void renderFormatter(ResponseWriter responseWriter, ColorPalette colorPalette) throws IOException {
		renderString(responseWriter, "formatter", colorPalette.getFormatter());
	}

	protected void renderItems(ResponseWriter responseWriter, ColorPalette colorPalette) throws IOException {
		renderArray(responseWriter, "items", colorPalette.getItems());
	}

	protected void renderSelected(ResponseWriter responseWriter, ColorPalette colorPalette) throws IOException {
		renderNumber(responseWriter, "selected", colorPalette.getSelected());
	}

	protected void renderToggleSelection(ResponseWriter responseWriter, ColorPalette colorPalette) throws IOException {
		renderBoolean(responseWriter, "toggleSelection", colorPalette.getToggleSelection());
	}

}