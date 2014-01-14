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
package com.liferay.faces.alloy.component.datecelleditor;

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
public abstract class DateCellEditorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-edit";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DateCellEditor dateCellEditor = (DateCellEditor) uiComponent;
		encodeHTML(facesContext, dateCellEditor);
		encodeJavaScript(facesContext, dateCellEditor);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DateCellEditor dateCellEditor) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DateCellEditor dateCellEditor) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, dateCellEditor);

		bufferedResponseWriter.write("var dateCellEditor = new Y.DateCellEditor");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderDatecelleditorBodyContent(bufferedResponseWriter, dateCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCalendar(bufferedResponseWriter, dateCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDateFormat(bufferedResponseWriter, dateCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInputFormatter(bufferedResponseWriter, dateCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOutputFormatter(bufferedResponseWriter, dateCellEditor);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, dateCellEditor);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDatecelleditorBodyContent(ResponseWriter responseWriter, DateCellEditor dateCellEditor) throws IOException {
		renderString(responseWriter, "datecelleditorBodyContent", dateCellEditor.getDatecelleditorBodyContent());
	}

	protected void renderCalendar(ResponseWriter responseWriter, DateCellEditor dateCellEditor) throws IOException {
		renderObject(responseWriter, "calendar", dateCellEditor.getCalendar());
	}

	protected void renderDateFormat(ResponseWriter responseWriter, DateCellEditor dateCellEditor) throws IOException {
		renderString(responseWriter, "dateFormat", dateCellEditor.getDateFormat());
	}

	protected void renderInputFormatter(ResponseWriter responseWriter, DateCellEditor dateCellEditor) throws IOException {
		renderString(responseWriter, "inputFormatter", dateCellEditor.getInputFormatter());
	}

	protected void renderOutputFormatter(ResponseWriter responseWriter, DateCellEditor dateCellEditor) throws IOException {
		renderString(responseWriter, "outputFormatter", dateCellEditor.getOutputFormatter());
	}

}