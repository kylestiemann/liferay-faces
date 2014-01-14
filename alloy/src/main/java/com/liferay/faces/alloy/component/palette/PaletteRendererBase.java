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
package com.liferay.faces.alloy.component.palette;

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
public abstract class PaletteRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-palette";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Palette palette = (Palette) uiComponent;
		encodeHTML(facesContext, palette);
		encodeJavaScript(facesContext, palette);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Palette palette) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Palette palette) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, palette);

		bufferedResponseWriter.write("var palette = new Y.Palette");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderColumns(bufferedResponseWriter, palette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainerNode(bufferedResponseWriter, palette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormatter(bufferedResponseWriter, palette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderItems(bufferedResponseWriter, palette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, palette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToggleSelection(bufferedResponseWriter, palette);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, palette);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderColumns(ResponseWriter responseWriter, Palette palette) throws IOException {
		renderNumber(responseWriter, "columns", palette.getColumns());
	}

	protected void renderContainerNode(ResponseWriter responseWriter, Palette palette) throws IOException {
		renderString(responseWriter, "containerNode", palette.getContainerNode());
	}

	protected void renderFormatter(ResponseWriter responseWriter, Palette palette) throws IOException {
		renderString(responseWriter, "formatter", palette.getFormatter());
	}

	protected void renderItems(ResponseWriter responseWriter, Palette palette) throws IOException {
		renderArray(responseWriter, "items", palette.getItems());
	}

	protected void renderSelected(ResponseWriter responseWriter, Palette palette) throws IOException {
		renderNumber(responseWriter, "selected", palette.getSelected());
	}

	protected void renderToggleSelection(ResponseWriter responseWriter, Palette palette) throws IOException {
		renderBoolean(responseWriter, "toggleSelection", palette.getToggleSelection());
	}

}