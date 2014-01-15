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

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DatePickerBase extends javax.faces.component.UIPanel {

	private static final String ACTIVE_INPUT = "activeInput";
	private static final String AUTO_HIDE = "autoHide";
	private static final String CALENDAR = "calendar";
	private static final String CONTAINER = "container";
	private static final String CONTENT = "content";
	private static final String DATE_SEPARATOR = "dateSeparator";
	private static final String DESTROYED = "destroyed";
	private static final String INITIALIZED = "initialized";
	private static final String MASK = "mask";
	private static final String PANES = "panes";
	private static final String POPOVER = "popover";
	private static final String POPOVER_CSS_CLASS = "popoverCssClass";
	private static final String VALUE_EXTRACTOR = "valueExtractor";
	private static final String VALUE_FORMATTER = "valueFormatter";
	private static final String AFTER_ACTIVE_INPUT_CHANGE = "afterActiveInputChange";
	private static final String AFTER_AUTO_HIDE_CHANGE = "afterAutoHideChange";
	private static final String AFTER_CALENDAR_CHANGE = "afterCalendarChange";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_CONTENT_CHANGE = "afterContentChange";
	private static final String AFTER_DATE_SEPARATOR_CHANGE = "afterDateSeparatorChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_MASK_CHANGE = "afterMaskChange";
	private static final String AFTER_PANES_CHANGE = "afterPanesChange";
	private static final String AFTER_POPOVER_CHANGE = "afterPopoverChange";
	private static final String AFTER_POPOVER_CSS_CLASS_CHANGE = "afterPopoverCssClassChange";
	private static final String AFTER_VALUE_EXTRACTOR_CHANGE = "afterValueExtractorChange";
	private static final String AFTER_VALUE_FORMATTER_CHANGE = "afterValueFormatterChange";
	private static final String ON_ACTIVE_INPUT_CHANGE = "onActiveInputChange";
	private static final String ON_AUTO_HIDE_CHANGE = "onAutoHideChange";
	private static final String ON_CALENDAR_CHANGE = "onCalendarChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_CONTENT_CHANGE = "onContentChange";
	private static final String ON_DATE_SEPARATOR_CHANGE = "onDateSeparatorChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_MASK_CHANGE = "onMaskChange";
	private static final String ON_PANES_CHANGE = "onPanesChange";
	private static final String ON_POPOVER_CHANGE = "onPopoverChange";
	private static final String ON_POPOVER_CSS_CLASS_CHANGE = "onPopoverCssClassChange";
	private static final String ON_VALUE_EXTRACTOR_CHANGE = "onValueExtractorChange";
	private static final String ON_VALUE_FORMATTER_CHANGE = "onValueFormatterChange";

	public java.lang.String getActiveInput() {
		return (java.lang.String) getStateHelper().eval(ACTIVE_INPUT, null);
	}

	public void setActiveInput(java.lang.String activeInput) {
		getStateHelper().put(ACTIVE_INPUT, activeInput);
	}

	public java.lang.Boolean getAutoHide() {
		return (java.lang.Boolean) getStateHelper().eval(AUTO_HIDE, null);
	}

	public void setAutoHide(java.lang.Boolean autoHide) {
		getStateHelper().put(AUTO_HIDE, autoHide);
	}

	public java.lang.String getCalendar() {
		return (java.lang.String) getStateHelper().eval(CALENDAR, null);
	}

	public void setCalendar(java.lang.String calendar) {
		getStateHelper().put(CALENDAR, calendar);
	}

	public java.lang.String getContainer() {
		return (java.lang.String) getStateHelper().eval(CONTAINER, null);
	}

	public void setContainer(java.lang.String container) {
		getStateHelper().put(CONTAINER, container);
	}

	public java.lang.String getContent() {
		return (java.lang.String) getStateHelper().eval(CONTENT, null);
	}

	public void setContent(java.lang.String content) {
		getStateHelper().put(CONTENT, content);
	}

	public java.lang.String getDateSeparator() {
		return (java.lang.String) getStateHelper().eval(DATE_SEPARATOR, null);
	}

	public void setDateSeparator(java.lang.String dateSeparator) {
		getStateHelper().put(DATE_SEPARATOR, dateSeparator);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getMask() {
		return (java.lang.String) getStateHelper().eval(MASK, null);
	}

	public void setMask(java.lang.String mask) {
		getStateHelper().put(MASK, mask);
	}

	public java.lang.Object getPanes() {
		return (java.lang.Object) getStateHelper().eval(PANES, null);
	}

	public void setPanes(java.lang.Object panes) {
		getStateHelper().put(PANES, panes);
	}

	public java.lang.String getPopover() {
		return (java.lang.String) getStateHelper().eval(POPOVER, null);
	}

	public void setPopover(java.lang.String popover) {
		getStateHelper().put(POPOVER, popover);
	}

	public java.lang.String getPopoverCssClass() {
		return (java.lang.String) getStateHelper().eval(POPOVER_CSS_CLASS, null);
	}

	public void setPopoverCssClass(java.lang.String popoverCssClass) {
		getStateHelper().put(POPOVER_CSS_CLASS, popoverCssClass);
	}

	public java.lang.Object getValueExtractor() {
		return (java.lang.Object) getStateHelper().eval(VALUE_EXTRACTOR, null);
	}

	public void setValueExtractor(java.lang.Object valueExtractor) {
		getStateHelper().put(VALUE_EXTRACTOR, valueExtractor);
	}

	public java.lang.Object getValueFormatter() {
		return (java.lang.Object) getStateHelper().eval(VALUE_FORMATTER, null);
	}

	public void setValueFormatter(java.lang.Object valueFormatter) {
		getStateHelper().put(VALUE_FORMATTER, valueFormatter);
	}

	public java.lang.String getAfterActiveInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_INPUT_CHANGE, null);
	}

	public void setAfterActiveInputChange(java.lang.String afterActiveInputChange) {
		getStateHelper().put(AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange);
	}

	public java.lang.String getAfterAutoHideChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AUTO_HIDE_CHANGE, null);
	}

	public void setAfterAutoHideChange(java.lang.String afterAutoHideChange) {
		getStateHelper().put(AFTER_AUTO_HIDE_CHANGE, afterAutoHideChange);
	}

	public java.lang.String getAfterCalendarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CALENDAR_CHANGE, null);
	}

	public void setAfterCalendarChange(java.lang.String afterCalendarChange) {
		getStateHelper().put(AFTER_CALENDAR_CHANGE, afterCalendarChange);
	}

	public java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	public void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	public java.lang.String getAfterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_CHANGE, null);
	}

	public void setAfterContentChange(java.lang.String afterContentChange) {
		getStateHelper().put(AFTER_CONTENT_CHANGE, afterContentChange);
	}

	public java.lang.String getAfterDateSeparatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATE_SEPARATOR_CHANGE, null);
	}

	public void setAfterDateSeparatorChange(java.lang.String afterDateSeparatorChange) {
		getStateHelper().put(AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterMaskChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MASK_CHANGE, null);
	}

	public void setAfterMaskChange(java.lang.String afterMaskChange) {
		getStateHelper().put(AFTER_MASK_CHANGE, afterMaskChange);
	}

	public java.lang.String getAfterPanesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PANES_CHANGE, null);
	}

	public void setAfterPanesChange(java.lang.String afterPanesChange) {
		getStateHelper().put(AFTER_PANES_CHANGE, afterPanesChange);
	}

	public java.lang.String getAfterPopoverChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POPOVER_CHANGE, null);
	}

	public void setAfterPopoverChange(java.lang.String afterPopoverChange) {
		getStateHelper().put(AFTER_POPOVER_CHANGE, afterPopoverChange);
	}

	public java.lang.String getAfterPopoverCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POPOVER_CSS_CLASS_CHANGE, null);
	}

	public void setAfterPopoverCssClassChange(java.lang.String afterPopoverCssClassChange) {
		getStateHelper().put(AFTER_POPOVER_CSS_CLASS_CHANGE, afterPopoverCssClassChange);
	}

	public java.lang.String getAfterValueExtractorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_EXTRACTOR_CHANGE, null);
	}

	public void setAfterValueExtractorChange(java.lang.String afterValueExtractorChange) {
		getStateHelper().put(AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange);
	}

	public java.lang.String getAfterValueFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_FORMATTER_CHANGE, null);
	}

	public void setAfterValueFormatterChange(java.lang.String afterValueFormatterChange) {
		getStateHelper().put(AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange);
	}

	public java.lang.String getOnActiveInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_INPUT_CHANGE, null);
	}

	public void setOnActiveInputChange(java.lang.String onActiveInputChange) {
		getStateHelper().put(ON_ACTIVE_INPUT_CHANGE, onActiveInputChange);
	}

	public java.lang.String getOnAutoHideChange() {
		return (java.lang.String) getStateHelper().eval(ON_AUTO_HIDE_CHANGE, null);
	}

	public void setOnAutoHideChange(java.lang.String onAutoHideChange) {
		getStateHelper().put(ON_AUTO_HIDE_CHANGE, onAutoHideChange);
	}

	public java.lang.String getOnCalendarChange() {
		return (java.lang.String) getStateHelper().eval(ON_CALENDAR_CHANGE, null);
	}

	public void setOnCalendarChange(java.lang.String onCalendarChange) {
		getStateHelper().put(ON_CALENDAR_CHANGE, onCalendarChange);
	}

	public java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	public void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	public java.lang.String getOnContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_CHANGE, null);
	}

	public void setOnContentChange(java.lang.String onContentChange) {
		getStateHelper().put(ON_CONTENT_CHANGE, onContentChange);
	}

	public java.lang.String getOnDateSeparatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATE_SEPARATOR_CHANGE, null);
	}

	public void setOnDateSeparatorChange(java.lang.String onDateSeparatorChange) {
		getStateHelper().put(ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnMaskChange() {
		return (java.lang.String) getStateHelper().eval(ON_MASK_CHANGE, null);
	}

	public void setOnMaskChange(java.lang.String onMaskChange) {
		getStateHelper().put(ON_MASK_CHANGE, onMaskChange);
	}

	public java.lang.String getOnPanesChange() {
		return (java.lang.String) getStateHelper().eval(ON_PANES_CHANGE, null);
	}

	public void setOnPanesChange(java.lang.String onPanesChange) {
		getStateHelper().put(ON_PANES_CHANGE, onPanesChange);
	}

	public java.lang.String getOnPopoverChange() {
		return (java.lang.String) getStateHelper().eval(ON_POPOVER_CHANGE, null);
	}

	public void setOnPopoverChange(java.lang.String onPopoverChange) {
		getStateHelper().put(ON_POPOVER_CHANGE, onPopoverChange);
	}

	public java.lang.String getOnPopoverCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_POPOVER_CSS_CLASS_CHANGE, null);
	}

	public void setOnPopoverCssClassChange(java.lang.String onPopoverCssClassChange) {
		getStateHelper().put(ON_POPOVER_CSS_CLASS_CHANGE, onPopoverCssClassChange);
	}

	public java.lang.String getOnValueExtractorChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_EXTRACTOR_CHANGE, null);
	}

	public void setOnValueExtractorChange(java.lang.String onValueExtractorChange) {
		getStateHelper().put(ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange);
	}

	public java.lang.String getOnValueFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_FORMATTER_CHANGE, null);
	}

	public void setOnValueFormatterChange(java.lang.String onValueFormatterChange) {
		getStateHelper().put(ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange);
	}

}