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
package com.liferay.faces.alloy.component.datepickerpopover;

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
public abstract class DatePickerPopoverRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker-popover";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DatePickerPopover datePickerPopover = (DatePickerPopover) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var datePickerPopover = new A.DatePickerPopover");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (datePickerPopover.getAutoHide() != null) {
			renderAutoHide(renderedAttributes, datePickerPopover);
		}

		if (datePickerPopover.getPopover() != null) {
			renderPopover(renderedAttributes, datePickerPopover);
		}

		if (datePickerPopover.getPopoverCssClass() != null) {
			renderPopoverCssClass(renderedAttributes, datePickerPopover);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (datePickerPopover.getAfterAutoHideChange() != null) {
			renderAfterAutoHideChange(renderedAfterEvents, datePickerPopover);
		}

		if (datePickerPopover.getAfterPopoverChange() != null) {
			renderAfterPopoverChange(renderedAfterEvents, datePickerPopover);
		}

		if (datePickerPopover.getAfterPopoverCssClassChange() != null) {
			renderAfterPopoverCssClassChange(renderedAfterEvents, datePickerPopover);
		}


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

		if (datePickerPopover.getOnAutoHideChange() != null) {
			renderOnAutoHideChange(renderedOnEvents, datePickerPopover);
		}

		if (datePickerPopover.getOnPopoverChange() != null) {
			renderOnPopoverChange(renderedOnEvents, datePickerPopover);
		}

		if (datePickerPopover.getOnPopoverCssClassChange() != null) {
			renderOnPopoverCssClassChange(renderedOnEvents, datePickerPopover);
		}


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

	protected void renderAutoHide(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.Boolean autoHide = datePickerPopover.getAutoHide();
		renderedAttributes.add(renderBoolean(DatePickerPopover.AUTO_HIDE, autoHide));
	}

	protected void renderPopover(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String popover = datePickerPopover.getPopover();
		renderedAttributes.add(renderString(DatePickerPopover.POPOVER, popover));
	}

	protected void renderPopoverCssClass(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String popoverCssClass = datePickerPopover.getPopoverCssClass();
		renderedAttributes.add(renderString(DatePickerPopover.POPOVER_CSS_CLASS, popoverCssClass));
	}

	protected void renderAfterAutoHideChange(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String afterAutoHideChange = datePickerPopover.getAfterAutoHideChange();
		renderedAttributes.add(renderString(DatePickerPopover.AFTER_AUTO_HIDE_CHANGE, afterAutoHideChange));
	}

	protected void renderAfterPopoverChange(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String afterPopoverChange = datePickerPopover.getAfterPopoverChange();
		renderedAttributes.add(renderString(DatePickerPopover.AFTER_POPOVER_CHANGE, afterPopoverChange));
	}

	protected void renderAfterPopoverCssClassChange(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String afterPopoverCssClassChange = datePickerPopover.getAfterPopoverCssClassChange();
		renderedAttributes.add(renderString(DatePickerPopover.AFTER_POPOVER_CSS_CLASS_CHANGE, afterPopoverCssClassChange));
	}

	protected void renderOnAutoHideChange(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String onAutoHideChange = datePickerPopover.getOnAutoHideChange();
		renderedAttributes.add(renderString(DatePickerPopover.ON_AUTO_HIDE_CHANGE, onAutoHideChange));
	}

	protected void renderOnPopoverChange(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String onPopoverChange = datePickerPopover.getOnPopoverChange();
		renderedAttributes.add(renderString(DatePickerPopover.ON_POPOVER_CHANGE, onPopoverChange));
	}

	protected void renderOnPopoverCssClassChange(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String onPopoverCssClassChange = datePickerPopover.getOnPopoverCssClassChange();
		renderedAttributes.add(renderString(DatePickerPopover.ON_POPOVER_CSS_CLASS_CHANGE, onPopoverCssClassChange));
	}

}