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
package com.liferay.faces.alloy.component.timepicker;

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
public abstract class TimePickerRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-timepicker";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TimePicker timePicker = (TimePicker) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var timePicker = new A.TimePicker");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveInput(renderedAttributes, timePicker);
		renderAutoHide(renderedAttributes, timePicker);
		renderAutocomplete(renderedAttributes, timePicker);
		renderContainer(renderedAttributes, timePicker);
		renderContent(renderedAttributes, timePicker);
		renderDateSeparator(renderedAttributes, timePicker);
		renderDestroyed(renderedAttributes, timePicker);
		renderInitialized(renderedAttributes, timePicker);
		renderMask(renderedAttributes, timePicker);
		renderPopover(renderedAttributes, timePicker);
		renderPopoverCssClass(renderedAttributes, timePicker);
		renderValueExtractor(renderedAttributes, timePicker);
		renderValueFormatter(renderedAttributes, timePicker);
		renderTimePickerValues(renderedAttributes, timePicker);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterActiveInputChange(renderedAfterEvents, timePicker);
		renderAfterAutoHideChange(renderedAfterEvents, timePicker);
		renderAfterAutocompleteChange(renderedAfterEvents, timePicker);
		renderAfterContainerChange(renderedAfterEvents, timePicker);
		renderAfterContentChange(renderedAfterEvents, timePicker);
		renderAfterDateSeparatorChange(renderedAfterEvents, timePicker);
		renderAfterDestroyedChange(renderedAfterEvents, timePicker);
		renderAfterInitializedChange(renderedAfterEvents, timePicker);
		renderAfterMaskChange(renderedAfterEvents, timePicker);
		renderAfterPopoverChange(renderedAfterEvents, timePicker);
		renderAfterPopoverCssClassChange(renderedAfterEvents, timePicker);
		renderAfterValueExtractorChange(renderedAfterEvents, timePicker);
		renderAfterValueFormatterChange(renderedAfterEvents, timePicker);
		renderAfterValuesChange(renderedAfterEvents, timePicker);

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

		renderOnActiveInputChange(renderedOnEvents, timePicker);
		renderOnAutoHideChange(renderedOnEvents, timePicker);
		renderOnAutocompleteChange(renderedOnEvents, timePicker);
		renderOnContainerChange(renderedOnEvents, timePicker);
		renderOnContentChange(renderedOnEvents, timePicker);
		renderOnDateSeparatorChange(renderedOnEvents, timePicker);
		renderOnDestroyedChange(renderedOnEvents, timePicker);
		renderOnInitializedChange(renderedOnEvents, timePicker);
		renderOnMaskChange(renderedOnEvents, timePicker);
		renderOnPopoverChange(renderedOnEvents, timePicker);
		renderOnPopoverCssClassChange(renderedOnEvents, timePicker);
		renderOnValueExtractorChange(renderedOnEvents, timePicker);
		renderOnValueFormatterChange(renderedOnEvents, timePicker);
		renderOnValuesChange(renderedOnEvents, timePicker);

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

	protected void renderActiveInput(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String activeInput = timePicker.getActiveInput();

		if (activeInput != null) {
			renderedAttributes.add(renderString(TimePicker.ACTIVE_INPUT, activeInput));
		}
	}

	protected void renderAutoHide(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Boolean autoHide = timePicker.getAutoHide();

		if (autoHide != null) {
			renderedAttributes.add(renderBoolean(TimePicker.AUTO_HIDE, autoHide));
		}
	}

	protected void renderAutocomplete(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String autocomplete = timePicker.getAutocomplete();

		if (autocomplete != null) {
			renderedAttributes.add(renderString(TimePicker.AUTOCOMPLETE, autocomplete));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String container = timePicker.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TimePicker.CONTAINER, container));
		}
	}

	protected void renderContent(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String content = timePicker.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(TimePicker.CONTENT, content));
		}
	}

	protected void renderDateSeparator(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String dateSeparator = timePicker.getDateSeparator();

		if (dateSeparator != null) {
			renderedAttributes.add(renderString(TimePicker.DATE_SEPARATOR, dateSeparator));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Boolean destroyed = timePicker.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TimePicker.DESTROYED, destroyed));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Boolean initialized = timePicker.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TimePicker.INITIALIZED, initialized));
		}
	}

	protected void renderMask(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String mask = timePicker.getMask();

		if (mask != null) {
			renderedAttributes.add(renderString(TimePicker.MASK, mask));
		}
	}

	protected void renderPopover(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String popover = timePicker.getPopover();

		if (popover != null) {
			renderedAttributes.add(renderString(TimePicker.POPOVER, popover));
		}
	}

	protected void renderPopoverCssClass(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String popoverCssClass = timePicker.getPopoverCssClass();

		if (popoverCssClass != null) {
			renderedAttributes.add(renderString(TimePicker.POPOVER_CSS_CLASS, popoverCssClass));
		}
	}

	protected void renderValueExtractor(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Object valueExtractor = timePicker.getValueExtractor();

		if (valueExtractor != null) {
			renderedAttributes.add(renderString(TimePicker.VALUE_EXTRACTOR, valueExtractor));
		}
	}

	protected void renderValueFormatter(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Object valueFormatter = timePicker.getValueFormatter();

		if (valueFormatter != null) {
			renderedAttributes.add(renderString(TimePicker.VALUE_FORMATTER, valueFormatter));
		}
	}

	protected void renderTimePickerValues(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Object timePickerValues = timePicker.getTimePickerValues();

		if (timePickerValues != null) {
			renderedAttributes.add(renderArray(TimePicker.TIME_PICKER_VALUES, timePickerValues));
		}
	}

	protected void renderAfterActiveInputChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterActiveInputChange = timePicker.getAfterActiveInputChange();

		if (afterActiveInputChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange));
		}
	}

	protected void renderAfterAutoHideChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterAutoHideChange = timePicker.getAfterAutoHideChange();

		if (afterAutoHideChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_AUTO_HIDE_CHANGE, afterAutoHideChange));
		}
	}

	protected void renderAfterAutocompleteChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterAutocompleteChange = timePicker.getAfterAutocompleteChange();

		if (afterAutocompleteChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_AUTOCOMPLETE_CHANGE, afterAutocompleteChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterContainerChange = timePicker.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterContentChange = timePicker.getAfterContentChange();

		if (afterContentChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_CONTENT_CHANGE, afterContentChange));
		}
	}

	protected void renderAfterDateSeparatorChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterDateSeparatorChange = timePicker.getAfterDateSeparatorChange();

		if (afterDateSeparatorChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterDestroyedChange = timePicker.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterInitializedChange = timePicker.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterMaskChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterMaskChange = timePicker.getAfterMaskChange();

		if (afterMaskChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_MASK_CHANGE, afterMaskChange));
		}
	}

	protected void renderAfterPopoverChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterPopoverChange = timePicker.getAfterPopoverChange();

		if (afterPopoverChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_POPOVER_CHANGE, afterPopoverChange));
		}
	}

	protected void renderAfterPopoverCssClassChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterPopoverCssClassChange = timePicker.getAfterPopoverCssClassChange();

		if (afterPopoverCssClassChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_POPOVER_CSS_CLASS_CHANGE, afterPopoverCssClassChange));
		}
	}

	protected void renderAfterValueExtractorChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterValueExtractorChange = timePicker.getAfterValueExtractorChange();

		if (afterValueExtractorChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange));
		}
	}

	protected void renderAfterValueFormatterChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterValueFormatterChange = timePicker.getAfterValueFormatterChange();

		if (afterValueFormatterChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange));
		}
	}

	protected void renderAfterValuesChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterValuesChange = timePicker.getAfterValuesChange();

		if (afterValuesChange != null) {
			renderedAttributes.add(renderString(TimePicker.AFTER_VALUES_CHANGE, afterValuesChange));
		}
	}

	protected void renderOnActiveInputChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onActiveInputChange = timePicker.getOnActiveInputChange();

		if (onActiveInputChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_ACTIVE_INPUT_CHANGE, onActiveInputChange));
		}
	}

	protected void renderOnAutoHideChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onAutoHideChange = timePicker.getOnAutoHideChange();

		if (onAutoHideChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_AUTO_HIDE_CHANGE, onAutoHideChange));
		}
	}

	protected void renderOnAutocompleteChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onAutocompleteChange = timePicker.getOnAutocompleteChange();

		if (onAutocompleteChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_AUTOCOMPLETE_CHANGE, onAutocompleteChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onContainerChange = timePicker.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnContentChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onContentChange = timePicker.getOnContentChange();

		if (onContentChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_CONTENT_CHANGE, onContentChange));
		}
	}

	protected void renderOnDateSeparatorChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onDateSeparatorChange = timePicker.getOnDateSeparatorChange();

		if (onDateSeparatorChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onDestroyedChange = timePicker.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onInitializedChange = timePicker.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnMaskChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onMaskChange = timePicker.getOnMaskChange();

		if (onMaskChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_MASK_CHANGE, onMaskChange));
		}
	}

	protected void renderOnPopoverChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onPopoverChange = timePicker.getOnPopoverChange();

		if (onPopoverChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_POPOVER_CHANGE, onPopoverChange));
		}
	}

	protected void renderOnPopoverCssClassChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onPopoverCssClassChange = timePicker.getOnPopoverCssClassChange();

		if (onPopoverCssClassChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_POPOVER_CSS_CLASS_CHANGE, onPopoverCssClassChange));
		}
	}

	protected void renderOnValueExtractorChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onValueExtractorChange = timePicker.getOnValueExtractorChange();

		if (onValueExtractorChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange));
		}
	}

	protected void renderOnValueFormatterChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onValueFormatterChange = timePicker.getOnValueFormatterChange();

		if (onValueFormatterChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange));
		}
	}

	protected void renderOnValuesChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onValuesChange = timePicker.getOnValuesChange();

		if (onValuesChange != null) {
			renderedAttributes.add(renderString(TimePicker.ON_VALUES_CHANGE, onValuesChange));
		}
	}

}