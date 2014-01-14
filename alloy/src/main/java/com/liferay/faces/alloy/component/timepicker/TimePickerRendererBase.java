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
	private static final String  AUI_TIMEPICKER = "aui-timepicker";

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
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, timePicker, AUI_TIMEPICKER);

		bufferedResponseWriter.write("var timePicker = new Y.TimePicker");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);

		if(timePicker.getActiveInput() != null)
		{

			bufferedResponseWriter.write("activeInput: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getActiveInput().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getAutoHide() != null)
		{

			bufferedResponseWriter.write("autoHide: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getAutoHide().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getAutocomplete() != null)
		{

			bufferedResponseWriter.write("autocomplete: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getAutocomplete().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getContainer() != null)
		{

			bufferedResponseWriter.write("container: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getContainer().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getContent() != null)
		{

			bufferedResponseWriter.write("content: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getContent().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getDateSeparator() != null)
		{

			bufferedResponseWriter.write("dateSeparator: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getDateSeparator().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getMask() != null)
		{

			bufferedResponseWriter.write("mask: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getMask().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getPopover() != null)
		{

			bufferedResponseWriter.write("popover: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getPopover().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getPopoverCssClass() != null)
		{

			bufferedResponseWriter.write("popoverCssClass: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getPopoverCssClass().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getValueExtractor() != null)
		{

			bufferedResponseWriter.write("valueExtractor: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getValueExtractor().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getValueFormatter() != null)
		{

			bufferedResponseWriter.write("valueFormatter: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getValueFormatter().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getTimepickerValues() != null)
		{

			bufferedResponseWriter.write("timepickerValues: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(timePicker.getTimepickerValues().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);
		
		endJavaScript(facesContext);
		
		handleBuffer(facesContext, timePicker, AUI_TIMEPICKER);
		
		facesContext.setResponseWriter(backupResponseWriter);
	}

}