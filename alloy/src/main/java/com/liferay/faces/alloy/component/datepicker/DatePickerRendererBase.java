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
package com.liferay.faces.alloy.component.datepicker;

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
public abstract class DatePickerRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DatePicker datePicker = (DatePicker) uiComponent;
		encodeHTML(facesContext, datePicker);
		encodeJavaScript(facesContext, datePicker);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DatePicker datePicker) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DatePicker datePicker) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, datePicker);

		bufferedResponseWriter.write("var datePicker = new Y.DatePicker");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderActiveInput(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderAutoHide(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderCalendar(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderContainer(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderContent(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderDateSeparator(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderMask(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderPanes(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderPopover(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderPopoverCssClass(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderValueExtractor(responseWriter, datePicker);
		responseWriter.write(StringPool.COMMA);
		renderValueFormatter(responseWriter, datePicker);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, datePicker);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveInput(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "activeInput", datePicker.getActiveInput());
	}

	protected void renderAutoHide(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderBoolean(responseWriter, "autoHide", datePicker.getAutoHide());
	}

	protected void renderCalendar(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "calendar", datePicker.getCalendar());
	}

	protected void renderContainer(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "container", datePicker.getContainer());
	}

	protected void renderContent(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "content", datePicker.getContent());
	}

	protected void renderDateSeparator(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "dateSeparator", datePicker.getDateSeparator());
	}

	protected void renderMask(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "mask", datePicker.getMask());
	}

	protected void renderPanes(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderNumber(responseWriter, "panes", datePicker.getPanes());
	}

	protected void renderPopover(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "popover", datePicker.getPopover());
	}

	protected void renderPopoverCssClass(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "popoverCssClass", datePicker.getPopoverCssClass());
	}

	protected void renderValueExtractor(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "valueExtractor", datePicker.getValueExtractor());
	}

	protected void renderValueFormatter(ResponseWriter responseWriter, DatePicker datePicker) throws IOException {
		renderString(responseWriter, "valueFormatter", datePicker.getValueFormatter());
	}

}