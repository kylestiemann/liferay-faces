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
import java.util.ArrayList;
import java.util.Iterator;

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

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		TimePicker timePicker = (TimePicker) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var timePicker = new A.TimePicker");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActiveInput(renrederedAttributes, timePicker);
		renderAutoHide(renrederedAttributes, timePicker);
		renderAutocomplete(renrederedAttributes, timePicker);
		renderContainer(renrederedAttributes, timePicker);
		renderContent(renrederedAttributes, timePicker);
		renderDateSeparator(renrederedAttributes, timePicker);
		renderDestroyed(renrederedAttributes, timePicker);
		renderInitialized(renrederedAttributes, timePicker);
		renderMask(renrederedAttributes, timePicker);
		renderPopover(renrederedAttributes, timePicker);
		renderPopoverCssClass(renrederedAttributes, timePicker);
		renderValueExtractor(renrederedAttributes, timePicker);
		renderValueFormatter(renrederedAttributes, timePicker);
		renderTimepickerValues(renrederedAttributes, timePicker);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveInput(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getActiveInput() != null) {
			renrederedAttributes.add(renderString("activeInput", timePicker.getActiveInput()));
		}
	}

	protected void renderAutoHide(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getAutoHide() != null) {
			renrederedAttributes.add(renderBoolean("autoHide", timePicker.getAutoHide()));
		}
	}

	protected void renderAutocomplete(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getAutocomplete() != null) {
			renrederedAttributes.add(renderString("autocomplete", timePicker.getAutocomplete()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getContainer() != null) {
			renrederedAttributes.add(renderString("container", timePicker.getContainer()));
		}
	}

	protected void renderContent(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getContent() != null) {
			renrederedAttributes.add(renderString("content", timePicker.getContent()));
		}
	}

	protected void renderDateSeparator(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getDateSeparator() != null) {
			renrederedAttributes.add(renderString("dateSeparator", timePicker.getDateSeparator()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", timePicker.getDestroyed()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", timePicker.getInitialized()));
		}
	}

	protected void renderMask(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getMask() != null) {
			renrederedAttributes.add(renderString("mask", timePicker.getMask()));
		}
	}

	protected void renderPopover(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getPopover() != null) {
			renrederedAttributes.add(renderString("popover", timePicker.getPopover()));
		}
	}

	protected void renderPopoverCssClass(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getPopoverCssClass() != null) {
			renrederedAttributes.add(renderString("popoverCssClass", timePicker.getPopoverCssClass()));
		}
	}

	protected void renderValueExtractor(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getValueExtractor() != null) {
			renrederedAttributes.add(renderString("valueExtractor", timePicker.getValueExtractor()));
		}
	}

	protected void renderValueFormatter(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getValueFormatter() != null) {
			renrederedAttributes.add(renderString("valueFormatter", timePicker.getValueFormatter()));
		}
	}

	protected void renderTimepickerValues(ArrayList<String> renrederedAttributes, TimePicker timePicker) throws IOException {
		if (timePicker.getTimepickerValues() != null) {
			renrederedAttributes.add(renderArray("timepickerValues", timePicker.getTimepickerValues()));
		}
	}

}