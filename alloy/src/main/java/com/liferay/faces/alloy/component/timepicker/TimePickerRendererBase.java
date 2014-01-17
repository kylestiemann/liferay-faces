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
public abstract class TimePickerRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-timepicker";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TimePicker timePicker = (TimePicker) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var timePicker = new A.TimePicker");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveInput(renderedAttributes, timePicker);
		renderAutoHide(renderedAttributes, timePicker);
		renderAutocomplete(renderedAttributes, timePicker);
		renderContainer(renderedAttributes, timePicker);
		renderContent(renderedAttributes, timePicker);
		renderDateSeparator(renderedAttributes, timePicker);
		renderDestroyed(renderedAttributes, timePicker);
		renderInitialized(renderedAttributes, timePicker);
		renderMask(renderedAttributes, timePicker);
		renderPopover(renderedAttributes, timePicker);
		renderPopoverCssClass(renderedAttributes, timePicker);
		renderValueExtractor(renderedAttributes, timePicker);
		renderValueFormatter(renderedAttributes, timePicker);
		renderTimePickerValues(renderedAttributes, timePicker);

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

	protected void renderActiveInput(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String activeInput = timePicker.getActiveInput();

		if (activeInput != null) {
			renderedAttributes.add(renderString(TimePicker.ACTIVE_INPUT, activeInput));
		}
	}

	protected void renderAutoHide(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Boolean autoHide = timePicker.getAutoHide();

		if (autoHide != null) {
			renderedAttributes.add(renderBoolean(TimePicker.AUTO_HIDE, autoHide));
		}
	}

	protected void renderAutocomplete(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String autocomplete = timePicker.getAutocomplete();

		if (autocomplete != null) {
			renderedAttributes.add(renderString(TimePicker.AUTOCOMPLETE, autocomplete));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String container = timePicker.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TimePicker.CONTAINER, container));
		}
	}

	protected void renderContent(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String content = timePicker.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(TimePicker.CONTENT, content));
		}
	}

	protected void renderDateSeparator(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String dateSeparator = timePicker.getDateSeparator();

		if (dateSeparator != null) {
			renderedAttributes.add(renderString(TimePicker.DATE_SEPARATOR, dateSeparator));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Boolean destroyed = timePicker.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TimePicker.DESTROYED, destroyed));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Boolean initialized = timePicker.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TimePicker.INITIALIZED, initialized));
		}
	}

	protected void renderMask(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String mask = timePicker.getMask();

		if (mask != null) {
			renderedAttributes.add(renderString(TimePicker.MASK, mask));
		}
	}

	protected void renderPopover(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String popover = timePicker.getPopover();

		if (popover != null) {
			renderedAttributes.add(renderString(TimePicker.POPOVER, popover));
		}
	}

	protected void renderPopoverCssClass(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String popoverCssClass = timePicker.getPopoverCssClass();

		if (popoverCssClass != null) {
			renderedAttributes.add(renderString(TimePicker.POPOVER_CSS_CLASS, popoverCssClass));
		}
	}

	protected void renderValueExtractor(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Object valueExtractor = timePicker.getValueExtractor();

		if (valueExtractor != null) {
			renderedAttributes.add(renderString(TimePicker.VALUE_EXTRACTOR, valueExtractor));
		}
	}

	protected void renderValueFormatter(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Object valueFormatter = timePicker.getValueFormatter();

		if (valueFormatter != null) {
			renderedAttributes.add(renderString(TimePicker.VALUE_FORMATTER, valueFormatter));
		}
	}

	protected void renderTimePickerValues(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Object timePickerValues = timePicker.getTimePickerValues();

		if (timePickerValues != null) {
			renderedAttributes.add(renderArray(TimePicker.TIME_PICKER_VALUES, timePickerValues));
		}
	}

}