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
package com.liferay.faces.alloy.component.timepicker;

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
public abstract class TimePickerRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-timepicker";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TimePicker timePicker = (TimePicker) uiComponent;
		encodeHTML(facesContext, timePicker);
		encodeJavaScript(facesContext, timePicker);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TimePicker timePicker) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TimePicker timePicker) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, timePicker);

		bufferedResponseWriter.write("var timePicker = new Y.TimePicker");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderActiveInput(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderAutoHide(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderAutocomplete(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainer(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContent(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDateSeparator(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMask(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPopover(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPopoverCssClass(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderValueExtractor(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderValueFormatter(bufferedResponseWriter, timePicker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTimepickerValues(bufferedResponseWriter, timePicker);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, timePicker);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveInput(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "activeInput", timePicker.getActiveInput());
	}

	protected void renderAutoHide(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderBoolean(responseWriter, "autoHide", timePicker.getAutoHide());
	}

	protected void renderAutocomplete(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "autocomplete", timePicker.getAutocomplete());
	}

	protected void renderContainer(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "container", timePicker.getContainer());
	}

	protected void renderContent(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "content", timePicker.getContent());
	}

	protected void renderDateSeparator(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "dateSeparator", timePicker.getDateSeparator());
	}

	protected void renderMask(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "mask", timePicker.getMask());
	}

	protected void renderPopover(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "popover", timePicker.getPopover());
	}

	protected void renderPopoverCssClass(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "popoverCssClass", timePicker.getPopoverCssClass());
	}

	protected void renderValueExtractor(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "valueExtractor", timePicker.getValueExtractor());
	}

	protected void renderValueFormatter(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderString(responseWriter, "valueFormatter", timePicker.getValueFormatter());
	}

	protected void renderTimepickerValues(ResponseWriter responseWriter, TimePicker timePicker) throws IOException {
		renderArray(responseWriter, "timepickerValues", timePicker.getTimepickerValues());
	}

}