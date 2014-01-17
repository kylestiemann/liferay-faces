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
public abstract class DatePickerDelegateRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker-delegate";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DatePickerDelegate datePickerDelegate = (DatePickerDelegate) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var datePickerDelegate = new A.DatePickerDelegate");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveInput(renderedAttributes, datePickerDelegate);
		renderContainer(renderedAttributes, datePickerDelegate);
		renderContent(renderedAttributes, datePickerDelegate);
		renderDateSeparator(renderedAttributes, datePickerDelegate);
		renderMask(renderedAttributes, datePickerDelegate);
		renderValueExtractor(renderedAttributes, datePickerDelegate);
		renderValueFormatter(renderedAttributes, datePickerDelegate);

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

	protected void renderActiveInput(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String activeInput = datePickerDelegate.getActiveInput();

		if (activeInput != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.ACTIVE_INPUT, activeInput));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String container = datePickerDelegate.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.CONTAINER, container));
		}
	}

	protected void renderContent(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String content = datePickerDelegate.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.CONTENT, content));
		}
	}

	protected void renderDateSeparator(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String dateSeparator = datePickerDelegate.getDateSeparator();

		if (dateSeparator != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.DATE_SEPARATOR, dateSeparator));
		}
	}

	protected void renderMask(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String mask = datePickerDelegate.getMask();

		if (mask != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.MASK, mask));
		}
	}

	protected void renderValueExtractor(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.Object valueExtractor = datePickerDelegate.getValueExtractor();

		if (valueExtractor != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.VALUE_EXTRACTOR, valueExtractor));
		}
	}

	protected void renderValueFormatter(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.Object valueFormatter = datePickerDelegate.getValueFormatter();

		if (valueFormatter != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.VALUE_FORMATTER, valueFormatter));
		}
	}

}