/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class TimePickerRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		TimePicker timePicker = (TimePicker) uiComponent;
		encodeHTML(facesContext, timePicker);
		encodeJavaScript(facesContext, timePicker);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TimePicker timePicker) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TimePicker timePicker) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", timePicker);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-timepicker',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var timePicker = new Y.TimePicker");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(timePicker.getActiveInput() != null)
		{

			responseWriter.write("activeInput: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getActiveInput().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getAutoHide() != null)
		{

			responseWriter.write("autoHide: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getAutoHide().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getAutocomplete() != null)
		{

			responseWriter.write("autocomplete: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getAutocomplete().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getContainer() != null)
		{

			responseWriter.write("container: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getContent() != null)
		{

			responseWriter.write("content: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getDateSeparator() != null)
		{

			responseWriter.write("dateSeparator: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getDateSeparator().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getMask() != null)
		{

			responseWriter.write("mask: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getMask().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getPopover() != null)
		{

			responseWriter.write("popover: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getPopover().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getPopoverCssClass() != null)
		{

			responseWriter.write("popoverCssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getPopoverCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getValueExtractor() != null)
		{

			responseWriter.write("valueExtractor: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getValueExtractor().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getValueFormatter() != null)
		{

			responseWriter.write("valueFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getValueFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(timePicker.getTimepickerValues() != null)
		{

			responseWriter.write("timepickerValues: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(timePicker.getTimepickerValues().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_CLOSE);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.endElement("script");
		responseWriter.write(StringPool.NEW_LINE);
	}

}