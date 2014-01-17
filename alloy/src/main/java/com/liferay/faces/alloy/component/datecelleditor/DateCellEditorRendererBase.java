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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DateCellEditorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-edit";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DateCellEditor dateCellEditor = (DateCellEditor) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var dateCellEditor = new A.DateCellEditor");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderDateCellEditorBodyContent(renderedAttributes, dateCellEditor);
		renderCalendar(renderedAttributes, dateCellEditor);
		renderDateFormat(renderedAttributes, dateCellEditor);
		renderInputFormatter(renderedAttributes, dateCellEditor);
		renderOutputFormatter(renderedAttributes, dateCellEditor);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDateCellEditorBodyContent(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String dateCellEditorBodyContent = dateCellEditor.getDateCellEditorBodyContent();

		if (dateCellEditorBodyContent != null) {
			renderedAttributes.add(renderString(DateCellEditor.DATE_CELL_EDITOR_BODY_CONTENT, dateCellEditorBodyContent));
		}
	}

	protected void renderCalendar(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.Object calendar = dateCellEditor.getCalendar();

		if (calendar != null) {
			renderedAttributes.add(renderObject(DateCellEditor.CALENDAR, calendar));
		}
	}

	protected void renderDateFormat(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String dateFormat = dateCellEditor.getDateFormat();

		if (dateFormat != null) {
			renderedAttributes.add(renderString(DateCellEditor.DATE_FORMAT, dateFormat));
		}
	}

	protected void renderInputFormatter(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.Object inputFormatter = dateCellEditor.getInputFormatter();

		if (inputFormatter != null) {
			renderedAttributes.add(renderString(DateCellEditor.INPUT_FORMATTER, inputFormatter));
		}
	}

	protected void renderOutputFormatter(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.Object outputFormatter = dateCellEditor.getOutputFormatter();

		if (outputFormatter != null) {
			renderedAttributes.add(renderString(DateCellEditor.OUTPUT_FORMATTER, outputFormatter));
		}
	}

}