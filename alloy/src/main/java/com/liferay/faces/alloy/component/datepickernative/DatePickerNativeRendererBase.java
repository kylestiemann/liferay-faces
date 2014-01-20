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

		if (datePickerNative.getActiveInput() != null) {
			renderActiveInput(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getContainer() != null) {
			renderContainer(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getContent() != null) {
			renderContent(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getDateSeparator() != null) {
			renderDateSeparator(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getInitialized() != null) {
			renderInitialized(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getMask() != null) {
			renderMask(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getNativeMask() != null) {
			renderNativeMask(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getNativeType() != null) {
			renderNativeType(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getValueExtractor() != null) {
			renderValueExtractor(renderedAttributes, datePickerNative);
		}
		
		if (datePickerNative.getValueFormatter() != null) {
			renderValueFormatter(renderedAttributes, datePickerNative);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (datePickerNative.getAfterActiveInputChange() != null) {
			renderAfterActiveInputChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterContentChange() != null) {
			renderAfterContentChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterDateSeparatorChange() != null) {
			renderAfterDateSeparatorChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterMaskChange() != null) {
			renderAfterMaskChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterNativeMaskChange() != null) {
			renderAfterNativeMaskChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterNativeTypeChange() != null) {
			renderAfterNativeTypeChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterValueExtractorChange() != null) {
			renderAfterValueExtractorChange(renderedAfterEvents, datePickerNative);
		}
		
		if (datePickerNative.getAfterValueFormatterChange() != null) {
			renderAfterValueFormatterChange(renderedAfterEvents, datePickerNative);
		}
		

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

		if (datePickerNative.getOnActiveInputChange() != null) {
			renderOnActiveInputChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnContentChange() != null) {
			renderOnContentChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnDateSeparatorChange() != null) {
			renderOnDateSeparatorChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnMaskChange() != null) {
			renderOnMaskChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnNativeMaskChange() != null) {
			renderOnNativeMaskChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnNativeTypeChange() != null) {
			renderOnNativeTypeChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnValueExtractorChange() != null) {
			renderOnValueExtractorChange(renderedOnEvents, datePickerNative);
		}
		
		if (datePickerNative.getOnValueFormatterChange() != null) {
			renderOnValueFormatterChange(renderedOnEvents, datePickerNative);
		}
		

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
		renderedAttributes.add(renderString(DatePickerNative.ACTIVE_INPUT, activeInput));
	}

	protected void renderContainer(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String container = datePickerNative.getContainer();
		renderedAttributes.add(renderString(DatePickerNative.CONTAINER, container));
	}

	protected void renderContent(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String content = datePickerNative.getContent();
		renderedAttributes.add(renderString(DatePickerNative.CONTENT, content));
	}

	protected void renderDateSeparator(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String dateSeparator = datePickerNative.getDateSeparator();
		renderedAttributes.add(renderString(DatePickerNative.DATE_SEPARATOR, dateSeparator));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.Boolean destroyed = datePickerNative.getDestroyed();
		renderedAttributes.add(renderBoolean(DatePickerNative.DESTROYED, destroyed));
	}

	protected void renderInitialized(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.Boolean initialized = datePickerNative.getInitialized();
		renderedAttributes.add(renderBoolean(DatePickerNative.INITIALIZED, initialized));
	}

	protected void renderMask(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String mask = datePickerNative.getMask();
		renderedAttributes.add(renderString(DatePickerNative.MASK, mask));
	}

	protected void renderNativeMask(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String nativeMask = datePickerNative.getNativeMask();
		renderedAttributes.add(renderString(DatePickerNative.NATIVE_MASK, nativeMask));
	}

	protected void renderNativeType(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String nativeType = datePickerNative.getNativeType();
		renderedAttributes.add(renderString(DatePickerNative.NATIVE_TYPE, nativeType));
	}

	protected void renderValueExtractor(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.Object valueExtractor = datePickerNative.getValueExtractor();
		renderedAttributes.add(renderString(DatePickerNative.VALUE_EXTRACTOR, valueExtractor));
	}

	protected void renderValueFormatter(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.Object valueFormatter = datePickerNative.getValueFormatter();
		renderedAttributes.add(renderString(DatePickerNative.VALUE_FORMATTER, valueFormatter));
	}

	protected void renderAfterActiveInputChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterActiveInputChange = datePickerNative.getAfterActiveInputChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterContainerChange = datePickerNative.getAfterContainerChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterContentChange = datePickerNative.getAfterContentChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_CONTENT_CHANGE, afterContentChange));
	}

	protected void renderAfterDateSeparatorChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterDateSeparatorChange = datePickerNative.getAfterDateSeparatorChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterDestroyedChange = datePickerNative.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterInitializedChange = datePickerNative.getAfterInitializedChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterMaskChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterMaskChange = datePickerNative.getAfterMaskChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_MASK_CHANGE, afterMaskChange));
	}

	protected void renderAfterNativeMaskChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterNativeMaskChange = datePickerNative.getAfterNativeMaskChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_NATIVE_MASK_CHANGE, afterNativeMaskChange));
	}

	protected void renderAfterNativeTypeChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterNativeTypeChange = datePickerNative.getAfterNativeTypeChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_NATIVE_TYPE_CHANGE, afterNativeTypeChange));
	}

	protected void renderAfterValueExtractorChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterValueExtractorChange = datePickerNative.getAfterValueExtractorChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange));
	}

	protected void renderAfterValueFormatterChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String afterValueFormatterChange = datePickerNative.getAfterValueFormatterChange();
		renderedAttributes.add(renderString(DatePickerNative.AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange));
	}

	protected void renderOnActiveInputChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onActiveInputChange = datePickerNative.getOnActiveInputChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_ACTIVE_INPUT_CHANGE, onActiveInputChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onContainerChange = datePickerNative.getOnContainerChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnContentChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onContentChange = datePickerNative.getOnContentChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_CONTENT_CHANGE, onContentChange));
	}

	protected void renderOnDateSeparatorChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onDateSeparatorChange = datePickerNative.getOnDateSeparatorChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onDestroyedChange = datePickerNative.getOnDestroyedChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onInitializedChange = datePickerNative.getOnInitializedChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnMaskChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onMaskChange = datePickerNative.getOnMaskChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_MASK_CHANGE, onMaskChange));
	}

	protected void renderOnNativeMaskChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onNativeMaskChange = datePickerNative.getOnNativeMaskChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_NATIVE_MASK_CHANGE, onNativeMaskChange));
	}

	protected void renderOnNativeTypeChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onNativeTypeChange = datePickerNative.getOnNativeTypeChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_NATIVE_TYPE_CHANGE, onNativeTypeChange));
	}

	protected void renderOnValueExtractorChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onValueExtractorChange = datePickerNative.getOnValueExtractorChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange));
	}

	protected void renderOnValueFormatterChange(List<String> renderedAttributes, DatePickerNative datePickerNative) throws IOException {
		java.lang.String onValueFormatterChange = datePickerNative.getOnValueFormatterChange();
		renderedAttributes.add(renderString(DatePickerNative.ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange));
	}

}