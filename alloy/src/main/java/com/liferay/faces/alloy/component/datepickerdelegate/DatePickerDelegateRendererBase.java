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
package com.liferay.faces.alloy.component.datepickerdelegate;

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
public abstract class DatePickerDelegateRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker-delegate";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DatePickerDelegate datePickerDelegate = (DatePickerDelegate) uiComponent;
		encodeHTML(facesContext, datePickerDelegate);
		encodeJavaScript(facesContext, datePickerDelegate);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DatePickerDelegate datePickerDelegate) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DatePickerDelegate datePickerDelegate) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, datePickerDelegate);

		bufferedResponseWriter.write("var datePickerDelegate = new A.DatePickerDelegate");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActiveInput(renrederedAttributes, datePickerDelegate);
		renderContainer(renrederedAttributes, datePickerDelegate);
		renderContent(renrederedAttributes, datePickerDelegate);
		renderDateSeparator(renrederedAttributes, datePickerDelegate);
		renderMask(renrederedAttributes, datePickerDelegate);
		renderValueExtractor(renrederedAttributes, datePickerDelegate);
		renderValueFormatter(renrederedAttributes, datePickerDelegate);

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

		handleBuffer(facesContext, datePickerDelegate);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveInput(ArrayList<String> renrederedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		if (datePickerDelegate.getActiveInput() != null) {
			renrederedAttributes.add(renderString("activeInput", datePickerDelegate.getActiveInput()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		if (datePickerDelegate.getContainer() != null) {
			renrederedAttributes.add(renderString("container", datePickerDelegate.getContainer()));
		}
	}

	protected void renderContent(ArrayList<String> renrederedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		if (datePickerDelegate.getContent() != null) {
			renrederedAttributes.add(renderString("content", datePickerDelegate.getContent()));
		}
	}

	protected void renderDateSeparator(ArrayList<String> renrederedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		if (datePickerDelegate.getDateSeparator() != null) {
			renrederedAttributes.add(renderString("dateSeparator", datePickerDelegate.getDateSeparator()));
		}
	}

	protected void renderMask(ArrayList<String> renrederedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		if (datePickerDelegate.getMask() != null) {
			renrederedAttributes.add(renderString("mask", datePickerDelegate.getMask()));
		}
	}

	protected void renderValueExtractor(ArrayList<String> renrederedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		if (datePickerDelegate.getValueExtractor() != null) {
			renrederedAttributes.add(renderString("valueExtractor", datePickerDelegate.getValueExtractor()));
		}
	}

	protected void renderValueFormatter(ArrayList<String> renrederedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		if (datePickerDelegate.getValueFormatter() != null) {
			renrederedAttributes.add(renderString("valueFormatter", datePickerDelegate.getValueFormatter()));
		}
	}

}