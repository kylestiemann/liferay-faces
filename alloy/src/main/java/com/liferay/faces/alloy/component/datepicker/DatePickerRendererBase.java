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
package com.liferay.faces.alloy.component.datepicker;

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
public abstract class DatePickerRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datepicker";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DatePicker datePicker = (DatePicker) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var datePicker = new A.DatePicker");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveInput(renderedAttributes, datePicker);
		renderAutoHide(renderedAttributes, datePicker);
		renderCalendar(renderedAttributes, datePicker);
		renderContainer(renderedAttributes, datePicker);
		renderContent(renderedAttributes, datePicker);
		renderDateSeparator(renderedAttributes, datePicker);
		renderDestroyed(renderedAttributes, datePicker);
		renderInitialized(renderedAttributes, datePicker);
		renderMask(renderedAttributes, datePicker);
		renderPanes(renderedAttributes, datePicker);
		renderPopover(renderedAttributes, datePicker);
		renderPopoverCssClass(renderedAttributes, datePicker);
		renderValueExtractor(renderedAttributes, datePicker);
		renderValueFormatter(renderedAttributes, datePicker);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterActiveInputChange(renderedAfterEvents, datePicker);
		renderAfterAutoHideChange(renderedAfterEvents, datePicker);
		renderAfterCalendarChange(renderedAfterEvents, datePicker);
		renderAfterContainerChange(renderedAfterEvents, datePicker);
		renderAfterContentChange(renderedAfterEvents, datePicker);
		renderAfterDateSeparatorChange(renderedAfterEvents, datePicker);
		renderAfterDestroyedChange(renderedAfterEvents, datePicker);
		renderAfterInitializedChange(renderedAfterEvents, datePicker);
		renderAfterMaskChange(renderedAfterEvents, datePicker);
		renderAfterPanesChange(renderedAfterEvents, datePicker);
		renderAfterPopoverChange(renderedAfterEvents, datePicker);
		renderAfterPopoverCssClassChange(renderedAfterEvents, datePicker);
		renderAfterValueExtractorChange(renderedAfterEvents, datePicker);
		renderAfterValueFormatterChange(renderedAfterEvents, datePicker);

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

		renderOnActiveInputChange(renderedOnEvents, datePicker);
		renderOnAutoHideChange(renderedOnEvents, datePicker);
		renderOnCalendarChange(renderedOnEvents, datePicker);
		renderOnContainerChange(renderedOnEvents, datePicker);
		renderOnContentChange(renderedOnEvents, datePicker);
		renderOnDateSeparatorChange(renderedOnEvents, datePicker);
		renderOnDestroyedChange(renderedOnEvents, datePicker);
		renderOnInitializedChange(renderedOnEvents, datePicker);
		renderOnMaskChange(renderedOnEvents, datePicker);
		renderOnPanesChange(renderedOnEvents, datePicker);
		renderOnPopoverChange(renderedOnEvents, datePicker);
		renderOnPopoverCssClassChange(renderedOnEvents, datePicker);
		renderOnValueExtractorChange(renderedOnEvents, datePicker);
		renderOnValueFormatterChange(renderedOnEvents, datePicker);

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

	protected void renderActiveInput(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String activeInput = datePicker.getActiveInput();

		if (activeInput != null) {
			renderedAttributes.add(renderString(DatePicker.ACTIVE_INPUT, activeInput));
		}
	}

	protected void renderAutoHide(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Boolean autoHide = datePicker.getAutoHide();

		if (autoHide != null) {
			renderedAttributes.add(renderBoolean(DatePicker.AUTO_HIDE, autoHide));
		}
	}

	protected void renderCalendar(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String calendar = datePicker.getCalendar();

		if (calendar != null) {
			renderedAttributes.add(renderString(DatePicker.CALENDAR, calendar));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String container = datePicker.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(DatePicker.CONTAINER, container));
		}
	}

	protected void renderContent(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String content = datePicker.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(DatePicker.CONTENT, content));
		}
	}

	protected void renderDateSeparator(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String dateSeparator = datePicker.getDateSeparator();

		if (dateSeparator != null) {
			renderedAttributes.add(renderString(DatePicker.DATE_SEPARATOR, dateSeparator));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Boolean destroyed = datePicker.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DatePicker.DESTROYED, destroyed));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Boolean initialized = datePicker.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DatePicker.INITIALIZED, initialized));
		}
	}

	protected void renderMask(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String mask = datePicker.getMask();

		if (mask != null) {
			renderedAttributes.add(renderString(DatePicker.MASK, mask));
		}
	}

	protected void renderPanes(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Object panes = datePicker.getPanes();

		if (panes != null) {
			renderedAttributes.add(renderNumber(DatePicker.PANES, panes));
		}
	}

	protected void renderPopover(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String popover = datePicker.getPopover();

		if (popover != null) {
			renderedAttributes.add(renderString(DatePicker.POPOVER, popover));
		}
	}

	protected void renderPopoverCssClass(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String popoverCssClass = datePicker.getPopoverCssClass();

		if (popoverCssClass != null) {
			renderedAttributes.add(renderString(DatePicker.POPOVER_CSS_CLASS, popoverCssClass));
		}
	}

	protected void renderValueExtractor(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Object valueExtractor = datePicker.getValueExtractor();

		if (valueExtractor != null) {
			renderedAttributes.add(renderString(DatePicker.VALUE_EXTRACTOR, valueExtractor));
		}
	}

	protected void renderValueFormatter(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Object valueFormatter = datePicker.getValueFormatter();

		if (valueFormatter != null) {
			renderedAttributes.add(renderString(DatePicker.VALUE_FORMATTER, valueFormatter));
		}
	}

	protected void renderAfterActiveInputChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterActiveInputChange = datePicker.getAfterActiveInputChange();

		if (afterActiveInputChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange));
		}
	}

	protected void renderAfterAutoHideChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterAutoHideChange = datePicker.getAfterAutoHideChange();

		if (afterAutoHideChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_AUTO_HIDE_CHANGE, afterAutoHideChange));
		}
	}

	protected void renderAfterCalendarChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterCalendarChange = datePicker.getAfterCalendarChange();

		if (afterCalendarChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_CALENDAR_CHANGE, afterCalendarChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterContainerChange = datePicker.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterContentChange = datePicker.getAfterContentChange();

		if (afterContentChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_CONTENT_CHANGE, afterContentChange));
		}
	}

	protected void renderAfterDateSeparatorChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterDateSeparatorChange = datePicker.getAfterDateSeparatorChange();

		if (afterDateSeparatorChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterDestroyedChange = datePicker.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterInitializedChange = datePicker.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterMaskChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterMaskChange = datePicker.getAfterMaskChange();

		if (afterMaskChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_MASK_CHANGE, afterMaskChange));
		}
	}

	protected void renderAfterPanesChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterPanesChange = datePicker.getAfterPanesChange();

		if (afterPanesChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_PANES_CHANGE, afterPanesChange));
		}
	}

	protected void renderAfterPopoverChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterPopoverChange = datePicker.getAfterPopoverChange();

		if (afterPopoverChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_POPOVER_CHANGE, afterPopoverChange));
		}
	}

	protected void renderAfterPopoverCssClassChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterPopoverCssClassChange = datePicker.getAfterPopoverCssClassChange();

		if (afterPopoverCssClassChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_POPOVER_CSS_CLASS_CHANGE, afterPopoverCssClassChange));
		}
	}

	protected void renderAfterValueExtractorChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterValueExtractorChange = datePicker.getAfterValueExtractorChange();

		if (afterValueExtractorChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange));
		}
	}

	protected void renderAfterValueFormatterChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterValueFormatterChange = datePicker.getAfterValueFormatterChange();

		if (afterValueFormatterChange != null) {
			renderedAttributes.add(renderString(DatePicker.AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange));
		}
	}

	protected void renderOnActiveInputChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onActiveInputChange = datePicker.getOnActiveInputChange();

		if (onActiveInputChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_ACTIVE_INPUT_CHANGE, onActiveInputChange));
		}
	}

	protected void renderOnAutoHideChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onAutoHideChange = datePicker.getOnAutoHideChange();

		if (onAutoHideChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_AUTO_HIDE_CHANGE, onAutoHideChange));
		}
	}

	protected void renderOnCalendarChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onCalendarChange = datePicker.getOnCalendarChange();

		if (onCalendarChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_CALENDAR_CHANGE, onCalendarChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onContainerChange = datePicker.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnContentChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onContentChange = datePicker.getOnContentChange();

		if (onContentChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_CONTENT_CHANGE, onContentChange));
		}
	}

	protected void renderOnDateSeparatorChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onDateSeparatorChange = datePicker.getOnDateSeparatorChange();

		if (onDateSeparatorChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onDestroyedChange = datePicker.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onInitializedChange = datePicker.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnMaskChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onMaskChange = datePicker.getOnMaskChange();

		if (onMaskChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_MASK_CHANGE, onMaskChange));
		}
	}

	protected void renderOnPanesChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onPanesChange = datePicker.getOnPanesChange();

		if (onPanesChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_PANES_CHANGE, onPanesChange));
		}
	}

	protected void renderOnPopoverChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onPopoverChange = datePicker.getOnPopoverChange();

		if (onPopoverChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_POPOVER_CHANGE, onPopoverChange));
		}
	}

	protected void renderOnPopoverCssClassChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onPopoverCssClassChange = datePicker.getOnPopoverCssClassChange();

		if (onPopoverCssClassChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_POPOVER_CSS_CLASS_CHANGE, onPopoverCssClassChange));
		}
	}

	protected void renderOnValueExtractorChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onValueExtractorChange = datePicker.getOnValueExtractorChange();

		if (onValueExtractorChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange));
		}
	}

	protected void renderOnValueFormatterChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onValueFormatterChange = datePicker.getOnValueFormatterChange();

		if (onValueFormatterChange != null) {
			renderedAttributes.add(renderString(DatePicker.ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange));
		}
	}

}