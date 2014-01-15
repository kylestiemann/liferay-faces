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
public abstract class DatePickerPopoverRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker-popover";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DatePickerPopover datePickerPopover = (DatePickerPopover) uiComponent;
		encodeHTML(facesContext, datePickerPopover);
		encodeJavaScript(facesContext, datePickerPopover);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DatePickerPopover datePickerPopover) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DatePickerPopover datePickerPopover) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, datePickerPopover);

		bufferedResponseWriter.write("var datePickerPopover = new A.DatePickerPopover");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAutoHide(renrederedAttributes, datePickerPopover);
		renderPopover(renrederedAttributes, datePickerPopover);
		renderPopoverCssClass(renrederedAttributes, datePickerPopover);

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

		endJavaScript(facesContext);

		handleBuffer(facesContext, datePickerPopover);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAutoHide(ArrayList<String> renrederedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		if (datePickerPopover.getAutoHide() != null) {
			renrederedAttributes.add(renderBoolean("autoHide", datePickerPopover.getAutoHide()));
		}
	}

	protected void renderPopover(ArrayList<String> renrederedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		if (datePickerPopover.getPopover() != null) {
			renrederedAttributes.add(renderString("popover", datePickerPopover.getPopover()));
		}
	}

	protected void renderPopoverCssClass(ArrayList<String> renrederedAttributes, DatePickerPopover datePickerPopover) throws IOException {
		if (datePickerPopover.getPopoverCssClass() != null) {
			renrederedAttributes.add(renderString("popoverCssClass", datePickerPopover.getPopoverCssClass()));
		}
	}

}