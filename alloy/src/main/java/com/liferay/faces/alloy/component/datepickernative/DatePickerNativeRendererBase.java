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
public abstract class DatePickerNativeRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker-native";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DatePickerNative datePickerNative = (DatePickerNative) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var datePickerNative = new A.DatePickerNative");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActiveInput(renrederedAttributes, datePickerNative);
		renderContainer(renrederedAttributes, datePickerNative);
		renderContent(renrederedAttributes, datePickerNative);
		renderDateSeparator(renrederedAttributes, datePickerNative);
		renderDestroyed(renrederedAttributes, datePickerNative);
		renderInitialized(renrederedAttributes, datePickerNative);
		renderMask(renrederedAttributes, datePickerNative);
		renderNativeMask(renrederedAttributes, datePickerNative);
		renderNativeType(renrederedAttributes, datePickerNative);
		renderValueExtractor(renrederedAttributes, datePickerNative);
		renderValueFormatter(renrederedAttributes, datePickerNative);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveInput(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getActiveInput() != null) {
			renrederedAttributes.add(renderString("activeInput", datePickerNative.getActiveInput()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getContainer() != null) {
			renrederedAttributes.add(renderString("container", datePickerNative.getContainer()));
		}
	}

	protected void renderContent(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getContent() != null) {
			renrederedAttributes.add(renderString("content", datePickerNative.getContent()));
		}
	}

	protected void renderDateSeparator(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getDateSeparator() != null) {
			renrederedAttributes.add(renderString("dateSeparator", datePickerNative.getDateSeparator()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", datePickerNative.getDestroyed()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", datePickerNative.getInitialized()));
		}
	}

	protected void renderMask(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getMask() != null) {
			renrederedAttributes.add(renderString("mask", datePickerNative.getMask()));
		}
	}

	protected void renderNativeMask(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getNativeMask() != null) {
			renrederedAttributes.add(renderString("nativeMask", datePickerNative.getNativeMask()));
		}
	}

	protected void renderNativeType(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getNativeType() != null) {
			renrederedAttributes.add(renderString("nativeType", datePickerNative.getNativeType()));
		}
	}

	protected void renderValueExtractor(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getValueExtractor() != null) {
			renrederedAttributes.add(renderString("valueExtractor", datePickerNative.getValueExtractor()));
		}
	}

	protected void renderValueFormatter(ArrayList<String> renrederedAttributes, DatePickerNative datePickerNative) throws IOException {
		if (datePickerNative.getValueFormatter() != null) {
			renrederedAttributes.add(renderString("valueFormatter", datePickerNative.getValueFormatter()));
		}
	}

}