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
package com.liferay.faces.alloy.component.datatablehighlight;

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
public abstract class DataTableHighlightRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-highlight";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DataTableHighlight dataTableHighlight = (DataTableHighlight) uiComponent;
		encodeHTML(facesContext, dataTableHighlight);
		encodeJavaScript(facesContext, dataTableHighlight);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DataTableHighlight dataTableHighlight) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DataTableHighlight dataTableHighlight) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, dataTableHighlight);

		bufferedResponseWriter.write("var dataTableHighlight = new Y.DataTableHighlight");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderActiveBorderWidth(responseWriter, dataTableHighlight);
		responseWriter.write(StringPool.COMMA);
		renderHighlightRange(responseWriter, dataTableHighlight);
		responseWriter.write(StringPool.COMMA);
		renderOverlayActiveNode(responseWriter, dataTableHighlight);
		responseWriter.write(StringPool.COMMA);
		renderOverlayNode(responseWriter, dataTableHighlight);
		responseWriter.write(StringPool.COMMA);
		renderRangeBorderWidth(responseWriter, dataTableHighlight);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, dataTableHighlight);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, dataTableHighlight);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveBorderWidth(ResponseWriter responseWriter, DataTableHighlight dataTableHighlight) throws IOException {
		renderNumber(responseWriter, "activeBorderWidth", dataTableHighlight.getActiveBorderWidth());
	}

	protected void renderHighlightRange(ResponseWriter responseWriter, DataTableHighlight dataTableHighlight) throws IOException {
		renderBoolean(responseWriter, "highlightRange", dataTableHighlight.getHighlightRange());
	}

	protected void renderOverlayActiveNode(ResponseWriter responseWriter, DataTableHighlight dataTableHighlight) throws IOException {
		renderString(responseWriter, "overlayActiveNode", dataTableHighlight.getOverlayActiveNode());
	}

	protected void renderOverlayNode(ResponseWriter responseWriter, DataTableHighlight dataTableHighlight) throws IOException {
		renderString(responseWriter, "overlayNode", dataTableHighlight.getOverlayNode());
	}

	protected void renderRangeBorderWidth(ResponseWriter responseWriter, DataTableHighlight dataTableHighlight) throws IOException {
		renderNumber(responseWriter, "rangeBorderWidth", dataTableHighlight.getRangeBorderWidth());
	}

	protected void renderType(ResponseWriter responseWriter, DataTableHighlight dataTableHighlight) throws IOException {
		renderString(responseWriter, "type", dataTableHighlight.getType());
	}

}