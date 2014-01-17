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
public abstract class DatePickerNativeRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker-native";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DatePickerNative datePickerNative = (DatePickerNative) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var datePickerNative = new A.DatePickerNative");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveInput(renderedAttributes, datePickerNative);
		renderContainer(renderedAttributes, datePickerNative);
		renderContent(renderedAttributes, datePickerNative);
		renderDateSeparator(renderedAttributes, datePickerNative);
		renderDestroyed(renderedAttributes, datePickerNative);
		renderInitialized(renderedAttributes, datePickerNative);
		renderMask(renderedAttributes, datePickerNative);
		renderNativeMask(renderedAttributes, datePickerNative);
		renderNativeType(renderedAttributes, datePickerNative);
		renderValueExtractor(renderedAttributes, datePickerNative);
		renderValueFormatter(renderedAttributes, datePickerNative);

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

	protected void renderActiveInput(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String activeInput = datePickerNative.getActiveInput();

		if (activeInput != null) {
			renderedAttributes.add(renderString(DatePickerNative.ACTIVE_INPUT, activeInput));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String container = datePickerNative.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(DatePickerNative.CONTAINER, container));
		}
	}

	protected void renderContent(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String content = datePickerNative.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(DatePickerNative.CONTENT, content));
		}
	}

	protected void renderDateSeparator(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String dateSeparator = datePickerNative.getDateSeparator();

		if (dateSeparator != null) {
			renderedAttributes.add(renderString(DatePickerNative.DATE_SEPARATOR, dateSeparator));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.Boolean destroyed = datePickerNative.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DatePickerNative.DESTROYED, destroyed));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.Boolean initialized = datePickerNative.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DatePickerNative.INITIALIZED, initialized));
		}
	}

	protected void renderMask(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String mask = datePickerNative.getMask();

		if (mask != null) {
			renderedAttributes.add(renderString(DatePickerNative.MASK, mask));
		}
	}

	protected void renderNativeMask(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String nativeMask = datePickerNative.getNativeMask();

		if (nativeMask != null) {
			renderedAttributes.add(renderString(DatePickerNative.NATIVE_MASK, nativeMask));
		}
	}

	protected void renderNativeType(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String nativeType = datePickerNative.getNativeType();

		if (nativeType != null) {
			renderedAttributes.add(renderString(DatePickerNative.NATIVE_TYPE, nativeType));
		}
	}

	protected void renderValueExtractor(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.Object valueExtractor = datePickerNative.getValueExtractor();

		if (valueExtractor != null) {
			renderedAttributes.add(renderString(DatePickerNative.VALUE_EXTRACTOR, valueExtractor));
		}
	}

	protected void renderValueFormatter(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.Object valueFormatter = datePickerNative.getValueFormatter();

		if (valueFormatter != null) {
			renderedAttributes.add(renderString(DatePickerNative.VALUE_FORMATTER, valueFormatter));
		}
	}

}