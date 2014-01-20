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

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBodyContentChange(renderedAfterEvents, dateCellEditor);
		renderAfterCalendarChange(renderedAfterEvents, dateCellEditor);
		renderAfterDateFormatChange(renderedAfterEvents, dateCellEditor);
		renderAfterInputFormatterChange(renderedAfterEvents, dateCellEditor);
		renderAfterOutputFormatterChange(renderedAfterEvents, dateCellEditor);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnBodyContentChange(renderedOnEvents, dateCellEditor);
		renderOnCalendarChange(renderedOnEvents, dateCellEditor);
		renderOnDateFormatChange(renderedOnEvents, dateCellEditor);
		renderOnInputFormatterChange(renderedOnEvents, dateCellEditor);
		renderOnOutputFormatterChange(renderedOnEvents, dateCellEditor);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
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

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String afterBodyContentChange = dateCellEditor.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterCalendarChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String afterCalendarChange = dateCellEditor.getAfterCalendarChange();

		if (afterCalendarChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.AFTER_CALENDAR_CHANGE, afterCalendarChange));
		}
	}

	protected void renderAfterDateFormatChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String afterDateFormatChange = dateCellEditor.getAfterDateFormatChange();

		if (afterDateFormatChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.AFTER_DATE_FORMAT_CHANGE, afterDateFormatChange));
		}
	}

	protected void renderAfterInputFormatterChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String afterInputFormatterChange = dateCellEditor.getAfterInputFormatterChange();

		if (afterInputFormatterChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.AFTER_INPUT_FORMATTER_CHANGE, afterInputFormatterChange));
		}
	}

	protected void renderAfterOutputFormatterChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String afterOutputFormatterChange = dateCellEditor.getAfterOutputFormatterChange();

		if (afterOutputFormatterChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.AFTER_OUTPUT_FORMATTER_CHANGE, afterOutputFormatterChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String onBodyContentChange = dateCellEditor.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnCalendarChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String onCalendarChange = dateCellEditor.getOnCalendarChange();

		if (onCalendarChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.ON_CALENDAR_CHANGE, onCalendarChange));
		}
	}

	protected void renderOnDateFormatChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String onDateFormatChange = dateCellEditor.getOnDateFormatChange();

		if (onDateFormatChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.ON_DATE_FORMAT_CHANGE, onDateFormatChange));
		}
	}

	protected void renderOnInputFormatterChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String onInputFormatterChange = dateCellEditor.getOnInputFormatterChange();

		if (onInputFormatterChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.ON_INPUT_FORMATTER_CHANGE, onInputFormatterChange));
		}
	}

	protected void renderOnOutputFormatterChange(List<String> renderedAttributes, DateCellEditor dateCellEditor) throws IOException {
		java.lang.String onOutputFormatterChange = dateCellEditor.getOnOutputFormatterChange();

		if (onOutputFormatterChange != null) {
			renderedAttributes.add(renderString(DateCellEditor.ON_OUTPUT_FORMATTER_CHANGE, onOutputFormatterChange));
		}
	}

}