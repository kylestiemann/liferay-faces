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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterActiveInputChange(renderedAfterEvents, datePickerNative);
		renderAfterContainerChange(renderedAfterEvents, datePickerNative);
		renderAfterContentChange(renderedAfterEvents, datePickerNative);
		renderAfterDateSeparatorChange(renderedAfterEvents, datePickerNative);
		renderAfterDestroyedChange(renderedAfterEvents, datePickerNative);
		renderAfterInitializedChange(renderedAfterEvents, datePickerNative);
		renderAfterMaskChange(renderedAfterEvents, datePickerNative);
		renderAfterNativeMaskChange(renderedAfterEvents, datePickerNative);
		renderAfterNativeTypeChange(renderedAfterEvents, datePickerNative);
		renderAfterValueExtractorChange(renderedAfterEvents, datePickerNative);
		renderAfterValueFormatterChange(renderedAfterEvents, datePickerNative);

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

		renderOnActiveInputChange(renderedOnEvents, datePickerNative);
		renderOnContainerChange(renderedOnEvents, datePickerNative);
		renderOnContentChange(renderedOnEvents, datePickerNative);
		renderOnDateSeparatorChange(renderedOnEvents, datePickerNative);
		renderOnDestroyedChange(renderedOnEvents, datePickerNative);
		renderOnInitializedChange(renderedOnEvents, datePickerNative);
		renderOnMaskChange(renderedOnEvents, datePickerNative);
		renderOnNativeMaskChange(renderedOnEvents, datePickerNative);
		renderOnNativeTypeChange(renderedOnEvents, datePickerNative);
		renderOnValueExtractorChange(renderedOnEvents, datePickerNative);
		renderOnValueFormatterChange(renderedOnEvents, datePickerNative);

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

	protected void renderAfterActiveInputChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterActiveInputChange = datePickerNative.getAfterActiveInputChange();

		if (afterActiveInputChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterContainerChange = datePickerNative.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterContentChange = datePickerNative.getAfterContentChange();

		if (afterContentChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_CONTENT_CHANGE, afterContentChange));
		}
	}

	protected void renderAfterDateSeparatorChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterDateSeparatorChange = datePickerNative.getAfterDateSeparatorChange();

		if (afterDateSeparatorChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterDestroyedChange = datePickerNative.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterInitializedChange = datePickerNative.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterMaskChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterMaskChange = datePickerNative.getAfterMaskChange();

		if (afterMaskChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_MASK_CHANGE, afterMaskChange));
		}
	}

	protected void renderAfterNativeMaskChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterNativeMaskChange = datePickerNative.getAfterNativeMaskChange();

		if (afterNativeMaskChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_NATIVE_MASK_CHANGE, afterNativeMaskChange));
		}
	}

	protected void renderAfterNativeTypeChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterNativeTypeChange = datePickerNative.getAfterNativeTypeChange();

		if (afterNativeTypeChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_NATIVE_TYPE_CHANGE, afterNativeTypeChange));
		}
	}

	protected void renderAfterValueExtractorChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterValueExtractorChange = datePickerNative.getAfterValueExtractorChange();

		if (afterValueExtractorChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange));
		}
	}

	protected void renderAfterValueFormatterChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterValueFormatterChange = datePickerNative.getAfterValueFormatterChange();

		if (afterValueFormatterChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange));
		}
	}

	protected void renderOnActiveInputChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onActiveInputChange = datePickerNative.getOnActiveInputChange();

		if (onActiveInputChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_ACTIVE_INPUT_CHANGE, onActiveInputChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onContainerChange = datePickerNative.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnContentChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onContentChange = datePickerNative.getOnContentChange();

		if (onContentChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_CONTENT_CHANGE, onContentChange));
		}
	}

	protected void renderOnDateSeparatorChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onDateSeparatorChange = datePickerNative.getOnDateSeparatorChange();

		if (onDateSeparatorChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onDestroyedChange = datePickerNative.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onInitializedChange = datePickerNative.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnMaskChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onMaskChange = datePickerNative.getOnMaskChange();

		if (onMaskChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_MASK_CHANGE, onMaskChange));
		}
	}

	protected void renderOnNativeMaskChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onNativeMaskChange = datePickerNative.getOnNativeMaskChange();

		if (onNativeMaskChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_NATIVE_MASK_CHANGE, onNativeMaskChange));
		}
	}

	protected void renderOnNativeTypeChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onNativeTypeChange = datePickerNative.getOnNativeTypeChange();

		if (onNativeTypeChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_NATIVE_TYPE_CHANGE, onNativeTypeChange));
		}
	}

	protected void renderOnValueExtractorChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onValueExtractorChange = datePickerNative.getOnValueExtractorChange();

		if (onValueExtractorChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange));
		}
	}

	protected void renderOnValueFormatterChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onValueFormatterChange = datePickerNative.getOnValueFormatterChange();

		if (onValueFormatterChange != null) {
			renderedAttributes.add(renderString(DatePickerNative.ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange));
		}
	}

}