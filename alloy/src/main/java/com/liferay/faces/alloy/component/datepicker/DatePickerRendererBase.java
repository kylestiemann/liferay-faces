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
public abstract class DatePickerRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DatePicker datePicker = (DatePicker) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var datePicker = new A.DatePicker");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveInput(renderedAttributes, datePicker);
		renderAutoHide(renderedAttributes, datePicker);
		renderCalendar(renderedAttributes, datePicker);
		renderContainer(renderedAttributes, datePicker);
		renderContent(renderedAttributes, datePicker);
		renderDateSeparator(renderedAttributes, datePicker);
		renderDestroyed(renderedAttributes, datePicker);
		renderInitialized(renderedAttributes, datePicker);
		renderMask(renderedAttributes, datePicker);
		renderPanes(renderedAttributes, datePicker);
		renderPopover(renderedAttributes, datePicker);
		renderPopoverCssClass(renderedAttributes, datePicker);
		renderValueExtractor(renderedAttributes, datePicker);
		renderValueFormatter(renderedAttributes, datePicker);

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

	protected void renderActiveInput(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String activeInput = datePicker.getActiveInput();

		if (activeInput != null) {
			renderedAttributes.add(renderString(DatePicker.ACTIVE_INPUT, activeInput));
		}
	}

	protected void renderAutoHide(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Boolean autoHide = datePicker.getAutoHide();

		if (autoHide != null) {
			renderedAttributes.add(renderBoolean(DatePicker.AUTO_HIDE, autoHide));
		}
	}

	protected void renderCalendar(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String calendar = datePicker.getCalendar();

		if (calendar != null) {
			renderedAttributes.add(renderString(DatePicker.CALENDAR, calendar));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String container = datePicker.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(DatePicker.CONTAINER, container));
		}
	}

	protected void renderContent(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String content = datePicker.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(DatePicker.CONTENT, content));
		}
	}

	protected void renderDateSeparator(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String dateSeparator = datePicker.getDateSeparator();

		if (dateSeparator != null) {
			renderedAttributes.add(renderString(DatePicker.DATE_SEPARATOR, dateSeparator));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Boolean destroyed = datePicker.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DatePicker.DESTROYED, destroyed));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Boolean initialized = datePicker.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DatePicker.INITIALIZED, initialized));
		}
	}

	protected void renderMask(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String mask = datePicker.getMask();

		if (mask != null) {
			renderedAttributes.add(renderString(DatePicker.MASK, mask));
		}
	}

	protected void renderPanes(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Object panes = datePicker.getPanes();

		if (panes != null) {
			renderedAttributes.add(renderNumber(DatePicker.PANES, panes));
		}
	}

	protected void renderPopover(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String popover = datePicker.getPopover();

		if (popover != null) {
			renderedAttributes.add(renderString(DatePicker.POPOVER, popover));
		}
	}

	protected void renderPopoverCssClass(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String popoverCssClass = datePicker.getPopoverCssClass();

		if (popoverCssClass != null) {
			renderedAttributes.add(renderString(DatePicker.POPOVER_CSS_CLASS, popoverCssClass));
		}
	}

	protected void renderValueExtractor(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Object valueExtractor = datePicker.getValueExtractor();

		if (valueExtractor != null) {
			renderedAttributes.add(renderString(DatePicker.VALUE_EXTRACTOR, valueExtractor));
		}
	}

	protected void renderValueFormatter(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Object valueFormatter = datePicker.getValueFormatter();

		if (valueFormatter != null) {
			renderedAttributes.add(renderString(DatePicker.VALUE_FORMATTER, valueFormatter));
		}
	}

}