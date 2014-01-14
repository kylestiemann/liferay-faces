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
package com.liferay.faces.alloy.component.datepickernative;

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
public abstract class DatePickerNativeRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker-native";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DatePickerNative datePickerNative = (DatePickerNative) uiComponent;
		encodeHTML(facesContext, datePickerNative);
		encodeJavaScript(facesContext, datePickerNative);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DatePickerNative datePickerNative) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DatePickerNative datePickerNative) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, datePickerNative);

		bufferedResponseWriter.write("var datePickerNative = new Y.DatePickerNative");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderActiveInput(responseWriter, datePickerNative);
		responseWriter.write(StringPool.COMMA);
		renderContainer(responseWriter, datePickerNative);
		responseWriter.write(StringPool.COMMA);
		renderContent(responseWriter, datePickerNative);
		responseWriter.write(StringPool.COMMA);
		renderDateSeparator(responseWriter, datePickerNative);
		responseWriter.write(StringPool.COMMA);
		renderMask(responseWriter, datePickerNative);
		responseWriter.write(StringPool.COMMA);
		renderNativeMask(responseWriter, datePickerNative);
		responseWriter.write(StringPool.COMMA);
		renderNativeType(responseWriter, datePickerNative);
		responseWriter.write(StringPool.COMMA);
		renderValueExtractor(responseWriter, datePickerNative);
		responseWriter.write(StringPool.COMMA);
		renderValueFormatter(responseWriter, datePickerNative);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, datePickerNative);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveInput(ResponseWriter responseWriter, DatePickerNative datePickerNative) throws IOException {
		renderString(responseWriter, "activeInput", datePickerNative.getActiveInput());
	}

	protected void renderContainer(ResponseWriter responseWriter, DatePickerNative datePickerNative) throws IOException {
		renderString(responseWriter, "container", datePickerNative.getContainer());
	}

	protected void renderContent(ResponseWriter responseWriter, DatePickerNative datePickerNative) throws IOException {
		renderString(responseWriter, "content", datePickerNative.getContent());
	}

	protected void renderDateSeparator(ResponseWriter responseWriter, DatePickerNative datePickerNative) throws IOException {
		renderString(responseWriter, "dateSeparator", datePickerNative.getDateSeparator());
	}

	protected void renderMask(ResponseWriter responseWriter, DatePickerNative datePickerNative) throws IOException {
		renderString(responseWriter, "mask", datePickerNative.getMask());
	}

	protected void renderNativeMask(ResponseWriter responseWriter, DatePickerNative datePickerNative) throws IOException {
		renderString(responseWriter, "nativeMask", datePickerNative.getNativeMask());
	}

	protected void renderNativeType(ResponseWriter responseWriter, DatePickerNative datePickerNative) throws IOException {
		renderString(responseWriter, "nativeType", datePickerNative.getNativeType());
	}

	protected void renderValueExtractor(ResponseWriter responseWriter, DatePickerNative datePickerNative) throws IOException {
		renderString(responseWriter, "valueExtractor", datePickerNative.getValueExtractor());
	}

	protected void renderValueFormatter(ResponseWriter responseWriter, DatePickerNative datePickerNative) throws IOException {
		renderString(responseWriter, "valueFormatter", datePickerNative.getValueFormatter());
	}

}