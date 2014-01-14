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

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, datePickerDelegate);

		bufferedResponseWriter.write("var datePickerDelegate = new Y.DatePickerDelegate");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderActiveInput(responseWriter, datePickerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderContainer(responseWriter, datePickerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderContent(responseWriter, datePickerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderDateSeparator(responseWriter, datePickerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderMask(responseWriter, datePickerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderValueExtractor(responseWriter, datePickerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderValueFormatter(responseWriter, datePickerDelegate);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, datePickerDelegate);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveInput(ResponseWriter responseWriter, DatePickerDelegate datePickerDelegate) throws IOException {
		renderString(responseWriter, "activeInput", datePickerDelegate.getActiveInput());
	}

	protected void renderContainer(ResponseWriter responseWriter, DatePickerDelegate datePickerDelegate) throws IOException {
		renderString(responseWriter, "container", datePickerDelegate.getContainer());
	}

	protected void renderContent(ResponseWriter responseWriter, DatePickerDelegate datePickerDelegate) throws IOException {
		renderString(responseWriter, "content", datePickerDelegate.getContent());
	}

	protected void renderDateSeparator(ResponseWriter responseWriter, DatePickerDelegate datePickerDelegate) throws IOException {
		renderString(responseWriter, "dateSeparator", datePickerDelegate.getDateSeparator());
	}

	protected void renderMask(ResponseWriter responseWriter, DatePickerDelegate datePickerDelegate) throws IOException {
		renderString(responseWriter, "mask", datePickerDelegate.getMask());
	}

	protected void renderValueExtractor(ResponseWriter responseWriter, DatePickerDelegate datePickerDelegate) throws IOException {
		renderString(responseWriter, "valueExtractor", datePickerDelegate.getValueExtractor());
	}

	protected void renderValueFormatter(ResponseWriter responseWriter, DatePickerDelegate datePickerDelegate) throws IOException {
		renderString(responseWriter, "valueFormatter", datePickerDelegate.getValueFormatter());
	}

}