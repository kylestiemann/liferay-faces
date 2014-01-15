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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, datePicker);

		bufferedResponseWriter.write("var datePicker = new A.DatePicker");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActiveInput(renrederedAttributes, datePicker);
		renderAutoHide(renrederedAttributes, datePicker);
		renderCalendar(renrederedAttributes, datePicker);
		renderContainer(renrederedAttributes, datePicker);
		renderContent(renrederedAttributes, datePicker);
		renderDateSeparator(renrederedAttributes, datePicker);
		renderDestroyed(renrederedAttributes, datePicker);
		renderInitialized(renrederedAttributes, datePicker);
		renderMask(renrederedAttributes, datePicker);
		renderPanes(renrederedAttributes, datePicker);
		renderPopover(renrederedAttributes, datePicker);
		renderPopoverCssClass(renrederedAttributes, datePicker);
		renderValueExtractor(renrederedAttributes, datePicker);
		renderValueFormatter(renrederedAttributes, datePicker);

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

		handleBuffer(facesContext, datePicker);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveInput(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getActiveInput() != null) {
			renrederedAttributes.add(renderString("activeInput", datePicker.getActiveInput()));
		}
	}

	protected void renderAutoHide(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getAutoHide() != null) {
			renrederedAttributes.add(renderBoolean("autoHide", datePicker.getAutoHide()));
		}
	}

	protected void renderCalendar(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getCalendar() != null) {
			renrederedAttributes.add(renderString("calendar", datePicker.getCalendar()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getContainer() != null) {
			renrederedAttributes.add(renderString("container", datePicker.getContainer()));
		}
	}

	protected void renderContent(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getContent() != null) {
			renrederedAttributes.add(renderString("content", datePicker.getContent()));
		}
	}

	protected void renderDateSeparator(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getDateSeparator() != null) {
			renrederedAttributes.add(renderString("dateSeparator", datePicker.getDateSeparator()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", datePicker.getDestroyed()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", datePicker.getInitialized()));
		}
	}

	protected void renderMask(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getMask() != null) {
			renrederedAttributes.add(renderString("mask", datePicker.getMask()));
		}
	}

	protected void renderPanes(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getPanes() != null) {
			renrederedAttributes.add(renderNumber("panes", datePicker.getPanes()));
		}
	}

	protected void renderPopover(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getPopover() != null) {
			renrederedAttributes.add(renderString("popover", datePicker.getPopover()));
		}
	}

	protected void renderPopoverCssClass(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getPopoverCssClass() != null) {
			renrederedAttributes.add(renderString("popoverCssClass", datePicker.getPopoverCssClass()));
		}
	}

	protected void renderValueExtractor(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getValueExtractor() != null) {
			renrederedAttributes.add(renderString("valueExtractor", datePicker.getValueExtractor()));
		}
	}

	protected void renderValueFormatter(ArrayList<String> renrederedAttributes, DatePicker datePicker) throws IOException {
		if (datePicker.getValueFormatter() != null) {
			renrederedAttributes.add(renderString("valueFormatter", datePicker.getValueFormatter()));
		}
	}

}