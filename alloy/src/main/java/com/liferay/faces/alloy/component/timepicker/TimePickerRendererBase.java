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

		if (timePicker.getActiveInput() != null) {
			renderActiveInput(renderedAttributes, timePicker);
		}
		
		if (timePicker.getAutoHide() != null) {
			renderAutoHide(renderedAttributes, timePicker);
		}
		
		if (timePicker.getAutocomplete() != null) {
			renderAutocomplete(renderedAttributes, timePicker);
		}
		
		if (timePicker.getContainer() != null) {
			renderContainer(renderedAttributes, timePicker);
		}
		
		if (timePicker.getContent() != null) {
			renderContent(renderedAttributes, timePicker);
		}
		
		if (timePicker.getDateSeparator() != null) {
			renderDateSeparator(renderedAttributes, timePicker);
		}
		
		if (timePicker.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, timePicker);
		}
		
		if (timePicker.getInitialized() != null) {
			renderInitialized(renderedAttributes, timePicker);
		}
		
		if (timePicker.getMask() != null) {
			renderMask(renderedAttributes, timePicker);
		}
		
		if (timePicker.getPopover() != null) {
			renderPopover(renderedAttributes, timePicker);
		}
		
		if (timePicker.getPopoverCssClass() != null) {
			renderPopoverCssClass(renderedAttributes, timePicker);
		}
		
		if (timePicker.getValueExtractor() != null) {
			renderValueExtractor(renderedAttributes, timePicker);
		}
		
		if (timePicker.getValueFormatter() != null) {
			renderValueFormatter(renderedAttributes, timePicker);
		}
		
		if (timePicker.getTimePickerValues() != null) {
			renderTimePickerValues(renderedAttributes, timePicker);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (timePicker.getAfterActiveInputChange() != null) {
			renderAfterActiveInputChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterAutoHideChange() != null) {
			renderAfterAutoHideChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterAutocompleteChange() != null) {
			renderAfterAutocompleteChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterContentChange() != null) {
			renderAfterContentChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterDateSeparatorChange() != null) {
			renderAfterDateSeparatorChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterMaskChange() != null) {
			renderAfterMaskChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterPopoverChange() != null) {
			renderAfterPopoverChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterPopoverCssClassChange() != null) {
			renderAfterPopoverCssClassChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterValueExtractorChange() != null) {
			renderAfterValueExtractorChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterValueFormatterChange() != null) {
			renderAfterValueFormatterChange(renderedAfterEvents, timePicker);
		}
		
		if (timePicker.getAfterValuesChange() != null) {
			renderAfterValuesChange(renderedAfterEvents, timePicker);
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

		if (timePicker.getOnActiveInputChange() != null) {
			renderOnActiveInputChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnAutoHideChange() != null) {
			renderOnAutoHideChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnAutocompleteChange() != null) {
			renderOnAutocompleteChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnContentChange() != null) {
			renderOnContentChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnDateSeparatorChange() != null) {
			renderOnDateSeparatorChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnMaskChange() != null) {
			renderOnMaskChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnPopoverChange() != null) {
			renderOnPopoverChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnPopoverCssClassChange() != null) {
			renderOnPopoverCssClassChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnValueExtractorChange() != null) {
			renderOnValueExtractorChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnValueFormatterChange() != null) {
			renderOnValueFormatterChange(renderedOnEvents, timePicker);
		}
		
		if (timePicker.getOnValuesChange() != null) {
			renderOnValuesChange(renderedOnEvents, timePicker);
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

	protected void renderActiveInput(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String activeInput = timePicker.getActiveInput();
		renderedAttributes.add(renderString(TimePicker.ACTIVE_INPUT, activeInput));
	}

	protected void renderAutoHide(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Boolean autoHide = timePicker.getAutoHide();
		renderedAttributes.add(renderBoolean(TimePicker.AUTO_HIDE, autoHide));
	}

	protected void renderAutocomplete(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String autocomplete = timePicker.getAutocomplete();
		renderedAttributes.add(renderString(TimePicker.AUTOCOMPLETE, autocomplete));
	}

	protected void renderContainer(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String container = timePicker.getContainer();
		renderedAttributes.add(renderString(TimePicker.CONTAINER, container));
	}

	protected void renderContent(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String content = timePicker.getContent();
		renderedAttributes.add(renderString(TimePicker.CONTENT, content));
	}

	protected void renderDateSeparator(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String dateSeparator = timePicker.getDateSeparator();
		renderedAttributes.add(renderString(TimePicker.DATE_SEPARATOR, dateSeparator));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Boolean destroyed = timePicker.getDestroyed();
		renderedAttributes.add(renderBoolean(TimePicker.DESTROYED, destroyed));
	}

	protected void renderInitialized(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Boolean initialized = timePicker.getInitialized();
		renderedAttributes.add(renderBoolean(TimePicker.INITIALIZED, initialized));
	}

	protected void renderMask(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String mask = timePicker.getMask();
		renderedAttributes.add(renderString(TimePicker.MASK, mask));
	}

	protected void renderPopover(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String popover = timePicker.getPopover();
		renderedAttributes.add(renderString(TimePicker.POPOVER, popover));
	}

	protected void renderPopoverCssClass(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String popoverCssClass = timePicker.getPopoverCssClass();
		renderedAttributes.add(renderString(TimePicker.POPOVER_CSS_CLASS, popoverCssClass));
	}

	protected void renderValueExtractor(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Object valueExtractor = timePicker.getValueExtractor();
		renderedAttributes.add(renderString(TimePicker.VALUE_EXTRACTOR, valueExtractor));
	}

	protected void renderValueFormatter(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Object valueFormatter = timePicker.getValueFormatter();
		renderedAttributes.add(renderString(TimePicker.VALUE_FORMATTER, valueFormatter));
	}

	protected void renderTimePickerValues(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.Object timePickerValues = timePicker.getTimePickerValues();
		renderedAttributes.add(renderArray(TimePicker.TIME_PICKER_VALUES, timePickerValues));
	}

	protected void renderAfterActiveInputChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterActiveInputChange = timePicker.getAfterActiveInputChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange));
	}

	protected void renderAfterAutoHideChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterAutoHideChange = timePicker.getAfterAutoHideChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_AUTO_HIDE_CHANGE, afterAutoHideChange));
	}

	protected void renderAfterAutocompleteChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterAutocompleteChange = timePicker.getAfterAutocompleteChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_AUTOCOMPLETE_CHANGE, afterAutocompleteChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterContainerChange = timePicker.getAfterContainerChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterContentChange = timePicker.getAfterContentChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_CONTENT_CHANGE, afterContentChange));
	}

	protected void renderAfterDateSeparatorChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterDateSeparatorChange = timePicker.getAfterDateSeparatorChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterDestroyedChange = timePicker.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterInitializedChange = timePicker.getAfterInitializedChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterMaskChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterMaskChange = timePicker.getAfterMaskChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_MASK_CHANGE, afterMaskChange));
	}

	protected void renderAfterPopoverChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterPopoverChange = timePicker.getAfterPopoverChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_POPOVER_CHANGE, afterPopoverChange));
	}

	protected void renderAfterPopoverCssClassChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterPopoverCssClassChange = timePicker.getAfterPopoverCssClassChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_POPOVER_CSS_CLASS_CHANGE, afterPopoverCssClassChange));
	}

	protected void renderAfterValueExtractorChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterValueExtractorChange = timePicker.getAfterValueExtractorChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange));
	}

	protected void renderAfterValueFormatterChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterValueFormatterChange = timePicker.getAfterValueFormatterChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange));
	}

	protected void renderAfterValuesChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String afterValuesChange = timePicker.getAfterValuesChange();
		renderedAttributes.add(renderString(TimePicker.AFTER_VALUES_CHANGE, afterValuesChange));
	}

	protected void renderOnActiveInputChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onActiveInputChange = timePicker.getOnActiveInputChange();
		renderedAttributes.add(renderString(TimePicker.ON_ACTIVE_INPUT_CHANGE, onActiveInputChange));
	}

	protected void renderOnAutoHideChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onAutoHideChange = timePicker.getOnAutoHideChange();
		renderedAttributes.add(renderString(TimePicker.ON_AUTO_HIDE_CHANGE, onAutoHideChange));
	}

	protected void renderOnAutocompleteChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onAutocompleteChange = timePicker.getOnAutocompleteChange();
		renderedAttributes.add(renderString(TimePicker.ON_AUTOCOMPLETE_CHANGE, onAutocompleteChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onContainerChange = timePicker.getOnContainerChange();
		renderedAttributes.add(renderString(TimePicker.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnContentChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onContentChange = timePicker.getOnContentChange();
		renderedAttributes.add(renderString(TimePicker.ON_CONTENT_CHANGE, onContentChange));
	}

	protected void renderOnDateSeparatorChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onDateSeparatorChange = timePicker.getOnDateSeparatorChange();
		renderedAttributes.add(renderString(TimePicker.ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onDestroyedChange = timePicker.getOnDestroyedChange();
		renderedAttributes.add(renderString(TimePicker.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onInitializedChange = timePicker.getOnInitializedChange();
		renderedAttributes.add(renderString(TimePicker.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnMaskChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onMaskChange = timePicker.getOnMaskChange();
		renderedAttributes.add(renderString(TimePicker.ON_MASK_CHANGE, onMaskChange));
	}

	protected void renderOnPopoverChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onPopoverChange = timePicker.getOnPopoverChange();
		renderedAttributes.add(renderString(TimePicker.ON_POPOVER_CHANGE, onPopoverChange));
	}

	protected void renderOnPopoverCssClassChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onPopoverCssClassChange = timePicker.getOnPopoverCssClassChange();
		renderedAttributes.add(renderString(TimePicker.ON_POPOVER_CSS_CLASS_CHANGE, onPopoverCssClassChange));
	}

	protected void renderOnValueExtractorChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onValueExtractorChange = timePicker.getOnValueExtractorChange();
		renderedAttributes.add(renderString(TimePicker.ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange));
	}

	protected void renderOnValueFormatterChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onValueFormatterChange = timePicker.getOnValueFormatterChange();
		renderedAttributes.add(renderString(TimePicker.ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange));
	}

	protected void renderOnValuesChange(List<String> renderedAttributes, TimePicker timePicker) throws IOException {
		java.lang.String onValuesChange = timePicker.getOnValuesChange();
		renderedAttributes.add(renderString(TimePicker.ON_VALUES_CHANGE, onValuesChange));
	}

}