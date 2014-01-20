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

		if (datePicker.getActiveInput() != null) {
			renderActiveInput(renderedAttributes, datePicker);
		}
		
		if (datePicker.getAutoHide() != null) {
			renderAutoHide(renderedAttributes, datePicker);
		}
		
		if (datePicker.getCalendar() != null) {
			renderCalendar(renderedAttributes, datePicker);
		}
		
		if (datePicker.getContainer() != null) {
			renderContainer(renderedAttributes, datePicker);
		}
		
		if (datePicker.getContent() != null) {
			renderContent(renderedAttributes, datePicker);
		}
		
		if (datePicker.getDateSeparator() != null) {
			renderDateSeparator(renderedAttributes, datePicker);
		}
		
		if (datePicker.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, datePicker);
		}
		
		if (datePicker.getInitialized() != null) {
			renderInitialized(renderedAttributes, datePicker);
		}
		
		if (datePicker.getMask() != null) {
			renderMask(renderedAttributes, datePicker);
		}
		
		if (datePicker.getPanes() != null) {
			renderPanes(renderedAttributes, datePicker);
		}
		
		if (datePicker.getPopover() != null) {
			renderPopover(renderedAttributes, datePicker);
		}
		
		if (datePicker.getPopoverCssClass() != null) {
			renderPopoverCssClass(renderedAttributes, datePicker);
		}
		
		if (datePicker.getValueExtractor() != null) {
			renderValueExtractor(renderedAttributes, datePicker);
		}
		
		if (datePicker.getValueFormatter() != null) {
			renderValueFormatter(renderedAttributes, datePicker);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (datePicker.getAfterActiveInputChange() != null) {
			renderAfterActiveInputChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterAutoHideChange() != null) {
			renderAfterAutoHideChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterCalendarChange() != null) {
			renderAfterCalendarChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterContentChange() != null) {
			renderAfterContentChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterDateSeparatorChange() != null) {
			renderAfterDateSeparatorChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterMaskChange() != null) {
			renderAfterMaskChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterPanesChange() != null) {
			renderAfterPanesChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterPopoverChange() != null) {
			renderAfterPopoverChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterPopoverCssClassChange() != null) {
			renderAfterPopoverCssClassChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterValueExtractorChange() != null) {
			renderAfterValueExtractorChange(renderedAfterEvents, datePicker);
		}
		
		if (datePicker.getAfterValueFormatterChange() != null) {
			renderAfterValueFormatterChange(renderedAfterEvents, datePicker);
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

		if (datePicker.getOnActiveInputChange() != null) {
			renderOnActiveInputChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnAutoHideChange() != null) {
			renderOnAutoHideChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnCalendarChange() != null) {
			renderOnCalendarChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnContentChange() != null) {
			renderOnContentChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnDateSeparatorChange() != null) {
			renderOnDateSeparatorChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnMaskChange() != null) {
			renderOnMaskChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnPanesChange() != null) {
			renderOnPanesChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnPopoverChange() != null) {
			renderOnPopoverChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnPopoverCssClassChange() != null) {
			renderOnPopoverCssClassChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnValueExtractorChange() != null) {
			renderOnValueExtractorChange(renderedOnEvents, datePicker);
		}
		
		if (datePicker.getOnValueFormatterChange() != null) {
			renderOnValueFormatterChange(renderedOnEvents, datePicker);
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

	protected void renderActiveInput(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String activeInput = datePicker.getActiveInput();
		renderedAttributes.add(renderString(DatePicker.ACTIVE_INPUT, activeInput));
	}

	protected void renderAutoHide(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Boolean autoHide = datePicker.getAutoHide();
		renderedAttributes.add(renderBoolean(DatePicker.AUTO_HIDE, autoHide));
	}

	protected void renderCalendar(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String calendar = datePicker.getCalendar();
		renderedAttributes.add(renderString(DatePicker.CALENDAR, calendar));
	}

	protected void renderContainer(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String container = datePicker.getContainer();
		renderedAttributes.add(renderString(DatePicker.CONTAINER, container));
	}

	protected void renderContent(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String content = datePicker.getContent();
		renderedAttributes.add(renderString(DatePicker.CONTENT, content));
	}

	protected void renderDateSeparator(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String dateSeparator = datePicker.getDateSeparator();
		renderedAttributes.add(renderString(DatePicker.DATE_SEPARATOR, dateSeparator));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Boolean destroyed = datePicker.getDestroyed();
		renderedAttributes.add(renderBoolean(DatePicker.DESTROYED, destroyed));
	}

	protected void renderInitialized(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Boolean initialized = datePicker.getInitialized();
		renderedAttributes.add(renderBoolean(DatePicker.INITIALIZED, initialized));
	}

	protected void renderMask(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String mask = datePicker.getMask();
		renderedAttributes.add(renderString(DatePicker.MASK, mask));
	}

	protected void renderPanes(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Object panes = datePicker.getPanes();
		renderedAttributes.add(renderNumber(DatePicker.PANES, panes));
	}

	protected void renderPopover(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String popover = datePicker.getPopover();
		renderedAttributes.add(renderString(DatePicker.POPOVER, popover));
	}

	protected void renderPopoverCssClass(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String popoverCssClass = datePicker.getPopoverCssClass();
		renderedAttributes.add(renderString(DatePicker.POPOVER_CSS_CLASS, popoverCssClass));
	}

	protected void renderValueExtractor(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Object valueExtractor = datePicker.getValueExtractor();
		renderedAttributes.add(renderString(DatePicker.VALUE_EXTRACTOR, valueExtractor));
	}

	protected void renderValueFormatter(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.Object valueFormatter = datePicker.getValueFormatter();
		renderedAttributes.add(renderString(DatePicker.VALUE_FORMATTER, valueFormatter));
	}

	protected void renderAfterActiveInputChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterActiveInputChange = datePicker.getAfterActiveInputChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange));
	}

	protected void renderAfterAutoHideChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterAutoHideChange = datePicker.getAfterAutoHideChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_AUTO_HIDE_CHANGE, afterAutoHideChange));
	}

	protected void renderAfterCalendarChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterCalendarChange = datePicker.getAfterCalendarChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_CALENDAR_CHANGE, afterCalendarChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterContainerChange = datePicker.getAfterContainerChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterContentChange = datePicker.getAfterContentChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_CONTENT_CHANGE, afterContentChange));
	}

	protected void renderAfterDateSeparatorChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterDateSeparatorChange = datePicker.getAfterDateSeparatorChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterDestroyedChange = datePicker.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterInitializedChange = datePicker.getAfterInitializedChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterMaskChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterMaskChange = datePicker.getAfterMaskChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_MASK_CHANGE, afterMaskChange));
	}

	protected void renderAfterPanesChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterPanesChange = datePicker.getAfterPanesChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_PANES_CHANGE, afterPanesChange));
	}

	protected void renderAfterPopoverChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterPopoverChange = datePicker.getAfterPopoverChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_POPOVER_CHANGE, afterPopoverChange));
	}

	protected void renderAfterPopoverCssClassChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterPopoverCssClassChange = datePicker.getAfterPopoverCssClassChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_POPOVER_CSS_CLASS_CHANGE, afterPopoverCssClassChange));
	}

	protected void renderAfterValueExtractorChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterValueExtractorChange = datePicker.getAfterValueExtractorChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange));
	}

	protected void renderAfterValueFormatterChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String afterValueFormatterChange = datePicker.getAfterValueFormatterChange();
		renderedAttributes.add(renderString(DatePicker.AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange));
	}

	protected void renderOnActiveInputChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onActiveInputChange = datePicker.getOnActiveInputChange();
		renderedAttributes.add(renderString(DatePicker.ON_ACTIVE_INPUT_CHANGE, onActiveInputChange));
	}

	protected void renderOnAutoHideChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onAutoHideChange = datePicker.getOnAutoHideChange();
		renderedAttributes.add(renderString(DatePicker.ON_AUTO_HIDE_CHANGE, onAutoHideChange));
	}

	protected void renderOnCalendarChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onCalendarChange = datePicker.getOnCalendarChange();
		renderedAttributes.add(renderString(DatePicker.ON_CALENDAR_CHANGE, onCalendarChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onContainerChange = datePicker.getOnContainerChange();
		renderedAttributes.add(renderString(DatePicker.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnContentChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onContentChange = datePicker.getOnContentChange();
		renderedAttributes.add(renderString(DatePicker.ON_CONTENT_CHANGE, onContentChange));
	}

	protected void renderOnDateSeparatorChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onDateSeparatorChange = datePicker.getOnDateSeparatorChange();
		renderedAttributes.add(renderString(DatePicker.ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onDestroyedChange = datePicker.getOnDestroyedChange();
		renderedAttributes.add(renderString(DatePicker.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onInitializedChange = datePicker.getOnInitializedChange();
		renderedAttributes.add(renderString(DatePicker.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnMaskChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onMaskChange = datePicker.getOnMaskChange();
		renderedAttributes.add(renderString(DatePicker.ON_MASK_CHANGE, onMaskChange));
	}

	protected void renderOnPanesChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onPanesChange = datePicker.getOnPanesChange();
		renderedAttributes.add(renderString(DatePicker.ON_PANES_CHANGE, onPanesChange));
	}

	protected void renderOnPopoverChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onPopoverChange = datePicker.getOnPopoverChange();
		renderedAttributes.add(renderString(DatePicker.ON_POPOVER_CHANGE, onPopoverChange));
	}

	protected void renderOnPopoverCssClassChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onPopoverCssClassChange = datePicker.getOnPopoverCssClassChange();
		renderedAttributes.add(renderString(DatePicker.ON_POPOVER_CSS_CLASS_CHANGE, onPopoverCssClassChange));
	}

	protected void renderOnValueExtractorChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onValueExtractorChange = datePicker.getOnValueExtractorChange();
		renderedAttributes.add(renderString(DatePicker.ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange));
	}

	protected void renderOnValueFormatterChange(List<String> renderedAttributes, DatePicker datePicker) throws IOException {
		java.lang.String onValueFormatterChange = datePicker.getOnValueFormatterChange();
		renderedAttributes.add(renderString(DatePicker.ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange));
	}

}