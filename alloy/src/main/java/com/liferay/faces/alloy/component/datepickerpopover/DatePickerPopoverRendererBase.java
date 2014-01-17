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

		renderAutoHide(renderedAttributes, datePickerPopover);
		renderPopover(renderedAttributes, datePickerPopover);
		renderPopoverCssClass(renderedAttributes, datePickerPopover);

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

	protected void renderAutoHide(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.Boolean autoHide = datePickerPopover.getAutoHide();

		if (autoHide != null) {
			renderedAttributes.add(renderBoolean(DatePickerPopover.AUTO_HIDE, autoHide));
		}
	}

	protected void renderPopover(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String popover = datePickerPopover.getPopover();

		if (popover != null) {
			renderedAttributes.add(renderString(DatePickerPopover.POPOVER, popover));
		}
	}

	protected void renderPopoverCssClass(List<String> renderedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		java.lang.String popoverCssClass = datePickerPopover.getPopoverCssClass();

		if (popoverCssClass != null) {
			renderedAttributes.add(renderString(DatePickerPopover.POPOVER_CSS_CLASS, popoverCssClass));
		}
	}

}