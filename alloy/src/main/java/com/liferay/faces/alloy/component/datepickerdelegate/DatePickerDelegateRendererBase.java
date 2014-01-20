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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterActiveInputChange(renderedAfterEvents, datePickerDelegate);
		renderAfterContainerChange(renderedAfterEvents, datePickerDelegate);
		renderAfterContentChange(renderedAfterEvents, datePickerDelegate);
		renderAfterDateSeparatorChange(renderedAfterEvents, datePickerDelegate);
		renderAfterMaskChange(renderedAfterEvents, datePickerDelegate);
		renderAfterValueExtractorChange(renderedAfterEvents, datePickerDelegate);
		renderAfterValueFormatterChange(renderedAfterEvents, datePickerDelegate);

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

		renderOnActiveInputChange(renderedOnEvents, datePickerDelegate);
		renderOnContainerChange(renderedOnEvents, datePickerDelegate);
		renderOnContentChange(renderedOnEvents, datePickerDelegate);
		renderOnDateSeparatorChange(renderedOnEvents, datePickerDelegate);
		renderOnMaskChange(renderedOnEvents, datePickerDelegate);
		renderOnValueExtractorChange(renderedOnEvents, datePickerDelegate);
		renderOnValueFormatterChange(renderedOnEvents, datePickerDelegate);

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

	protected void renderAfterActiveInputChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String afterActiveInputChange = datePickerDelegate.getAfterActiveInputChange();

		if (afterActiveInputChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String afterContainerChange = datePickerDelegate.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String afterContentChange = datePickerDelegate.getAfterContentChange();

		if (afterContentChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.AFTER_CONTENT_CHANGE, afterContentChange));
		}
	}

	protected void renderAfterDateSeparatorChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String afterDateSeparatorChange = datePickerDelegate.getAfterDateSeparatorChange();

		if (afterDateSeparatorChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange));
		}
	}

	protected void renderAfterMaskChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String afterMaskChange = datePickerDelegate.getAfterMaskChange();

		if (afterMaskChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.AFTER_MASK_CHANGE, afterMaskChange));
		}
	}

	protected void renderAfterValueExtractorChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String afterValueExtractorChange = datePickerDelegate.getAfterValueExtractorChange();

		if (afterValueExtractorChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange));
		}
	}

	protected void renderAfterValueFormatterChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String afterValueFormatterChange = datePickerDelegate.getAfterValueFormatterChange();

		if (afterValueFormatterChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange));
		}
	}

	protected void renderOnActiveInputChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String onActiveInputChange = datePickerDelegate.getOnActiveInputChange();

		if (onActiveInputChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.ON_ACTIVE_INPUT_CHANGE, onActiveInputChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String onContainerChange = datePickerDelegate.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnContentChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String onContentChange = datePickerDelegate.getOnContentChange();

		if (onContentChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.ON_CONTENT_CHANGE, onContentChange));
		}
	}

	protected void renderOnDateSeparatorChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String onDateSeparatorChange = datePickerDelegate.getOnDateSeparatorChange();

		if (onDateSeparatorChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange));
		}
	}

	protected void renderOnMaskChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String onMaskChange = datePickerDelegate.getOnMaskChange();

		if (onMaskChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.ON_MASK_CHANGE, onMaskChange));
		}
	}

	protected void renderOnValueExtractorChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String onValueExtractorChange = datePickerDelegate.getOnValueExtractorChange();

		if (onValueExtractorChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange));
		}
	}

	protected void renderOnValueFormatterChange(List<String> renderedAttributes, DatePickerDelegate datePickerDelegate) throws IOException {
		java.lang.String onValueFormatterChange = datePickerDelegate.getOnValueFormatterChange();

		if (onValueFormatterChange != null) {
			renderedAttributes.add(renderString(DatePickerDelegate.ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange));
		}
	}

}