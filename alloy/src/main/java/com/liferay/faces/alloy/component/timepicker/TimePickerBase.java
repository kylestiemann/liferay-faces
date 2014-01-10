/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TimePickerBase extends javax.faces.component.UIPanel {

	private static final String ACTIVE_INPUT = "activeInput";
	private static final String AUTO_HIDE = "autoHide";
	private static final String AUTOCOMPLETE = "autocomplete";
	private static final String CONTAINER = "container";
	private static final String CONTENT = "content";
	private static final String DATE_SEPARATOR = "dateSeparator";
	private static final String MASK = "mask";
	private static final String POPOVER = "popover";
	private static final String POPOVER_CSS_CLASS = "popoverCssClass";
	private static final String VALUE_EXTRACTOR = "valueExtractor";
	private static final String VALUE_FORMATTER = "valueFormatter";
	private static final String TIMEPICKER_VALUES = "timepickerValues";
	private static final String AFTER_ACTIVE_INPUT_CHANGE = "afterActiveInputChange";
	private static final String AFTER_AUTO_HIDE_CHANGE = "afterAutoHideChange";
	private static final String AFTER_AUTOCOMPLETE_CHANGE = "afterAutocompleteChange";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_CONTENT_CHANGE = "afterContentChange";
	private static final String AFTER_DATE_SEPARATOR_CHANGE = "afterDateSeparatorChange";
	private static final String AFTER_MASK_CHANGE = "afterMaskChange";
	private static final String AFTER_POPOVER_CHANGE = "afterPopoverChange";
	private static final String AFTER_POPOVER_CSS_CLASS_CHANGE = "afterPopoverCssClassChange";
	private static final String AFTER_VALUE_EXTRACTOR_CHANGE = "afterValueExtractorChange";
	private static final String AFTER_VALUE_FORMATTER_CHANGE = "afterValueFormatterChange";
	private static final String AFTER_VALUES_CHANGE = "afterValuesChange";
	private static final String ON_ACTIVE_INPUT_CHANGE = "onActiveInputChange";
	private static final String ON_AUTO_HIDE_CHANGE = "onAutoHideChange";
	private static final String ON_AUTOCOMPLETE_CHANGE = "onAutocompleteChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_CONTENT_CHANGE = "onContentChange";
	private static final String ON_DATE_SEPARATOR_CHANGE = "onDateSeparatorChange";
	private static final String ON_MASK_CHANGE = "onMaskChange";
	private static final String ON_POPOVER_CHANGE = "onPopoverChange";
	private static final String ON_POPOVER_CSS_CLASS_CHANGE = "onPopoverCssClassChange";
	private static final String ON_VALUE_EXTRACTOR_CHANGE = "onValueExtractorChange";
	private static final String ON_VALUE_FORMATTER_CHANGE = "onValueFormatterChange";
	private static final String ON_VALUES_CHANGE = "onValuesChange";

	protected java.lang.Object getActiveInput() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_INPUT, null);
	}

	protected void setActiveInput(java.lang.Object activeInput) {
		getStateHelper().put(ACTIVE_INPUT, activeInput);
	}

	protected java.lang.Boolean getAutoHide() {
		return (java.lang.Boolean) getStateHelper().eval(AUTO_HIDE, null);
	}

	protected void setAutoHide(java.lang.Boolean autoHide) {
		getStateHelper().put(AUTO_HIDE, autoHide);
	}

	protected java.lang.Object getAutocomplete() {
		return (java.lang.Object) getStateHelper().eval(AUTOCOMPLETE, null);
	}

	protected void setAutocomplete(java.lang.Object autocomplete) {
		getStateHelper().put(AUTOCOMPLETE, autocomplete);
	}

	protected java.lang.Object getContainer() {
		return (java.lang.Object) getStateHelper().eval(CONTAINER, null);
	}

	protected void setContainer(java.lang.Object container) {
		getStateHelper().put(CONTAINER, container);
	}

	protected java.lang.String getContent() {
		return (java.lang.String) getStateHelper().eval(CONTENT, null);
	}

	protected void setContent(java.lang.String content) {
		getStateHelper().put(CONTENT, content);
	}

	protected java.lang.String getDateSeparator() {
		return (java.lang.String) getStateHelper().eval(DATE_SEPARATOR, null);
	}

	protected void setDateSeparator(java.lang.String dateSeparator) {
		getStateHelper().put(DATE_SEPARATOR, dateSeparator);
	}

	protected java.lang.String getMask() {
		return (java.lang.String) getStateHelper().eval(MASK, null);
	}

	protected void setMask(java.lang.String mask) {
		getStateHelper().put(MASK, mask);
	}

	protected java.lang.Object getPopover() {
		return (java.lang.Object) getStateHelper().eval(POPOVER, null);
	}

	protected void setPopover(java.lang.Object popover) {
		getStateHelper().put(POPOVER, popover);
	}

	protected java.lang.String getPopoverCssClass() {
		return (java.lang.String) getStateHelper().eval(POPOVER_CSS_CLASS, null);
	}

	protected void setPopoverCssClass(java.lang.String popoverCssClass) {
		getStateHelper().put(POPOVER_CSS_CLASS, popoverCssClass);
	}

	protected java.lang.Object getValueExtractor() {
		return (java.lang.Object) getStateHelper().eval(VALUE_EXTRACTOR, null);
	}

	protected void setValueExtractor(java.lang.Object valueExtractor) {
		getStateHelper().put(VALUE_EXTRACTOR, valueExtractor);
	}

	protected java.lang.Object getValueFormatter() {
		return (java.lang.Object) getStateHelper().eval(VALUE_FORMATTER, null);
	}

	protected void setValueFormatter(java.lang.Object valueFormatter) {
		getStateHelper().put(VALUE_FORMATTER, valueFormatter);
	}

	protected java.lang.Object getTimepickerValues() {
		return (java.lang.Object) getStateHelper().eval(TIMEPICKER_VALUES, null);
	}

	protected void setTimepickerValues(java.lang.Object timepickerValues) {
		getStateHelper().put(TIMEPICKER_VALUES, timepickerValues);
	}

	protected java.lang.String getAfterActiveInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_INPUT_CHANGE, null);
	}

	protected void setAfterActiveInputChange(java.lang.String afterActiveInputChange) {
		getStateHelper().put(AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange);
	}

	protected java.lang.String getAfterAutoHideChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AUTO_HIDE_CHANGE, null);
	}

	protected void setAfterAutoHideChange(java.lang.String afterAutoHideChange) {
		getStateHelper().put(AFTER_AUTO_HIDE_CHANGE, afterAutoHideChange);
	}

	protected java.lang.String getAfterAutocompleteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AUTOCOMPLETE_CHANGE, null);
	}

	protected void setAfterAutocompleteChange(java.lang.String afterAutocompleteChange) {
		getStateHelper().put(AFTER_AUTOCOMPLETE_CHANGE, afterAutocompleteChange);
	}

	protected java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	protected void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	protected java.lang.String getAfterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_CHANGE, null);
	}

	protected void setAfterContentChange(java.lang.String afterContentChange) {
		getStateHelper().put(AFTER_CONTENT_CHANGE, afterContentChange);
	}

	protected java.lang.String getAfterDateSeparatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATE_SEPARATOR_CHANGE, null);
	}

	protected void setAfterDateSeparatorChange(java.lang.String afterDateSeparatorChange) {
		getStateHelper().put(AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange);
	}

	protected java.lang.String getAfterMaskChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MASK_CHANGE, null);
	}

	protected void setAfterMaskChange(java.lang.String afterMaskChange) {
		getStateHelper().put(AFTER_MASK_CHANGE, afterMaskChange);
	}

	protected java.lang.String getAfterPopoverChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POPOVER_CHANGE, null);
	}

	protected void setAfterPopoverChange(java.lang.String afterPopoverChange) {
		getStateHelper().put(AFTER_POPOVER_CHANGE, afterPopoverChange);
	}

	protected java.lang.String getAfterPopoverCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POPOVER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterPopoverCssClassChange(java.lang.String afterPopoverCssClassChange) {
		getStateHelper().put(AFTER_POPOVER_CSS_CLASS_CHANGE, afterPopoverCssClassChange);
	}

	protected java.lang.String getAfterValueExtractorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_EXTRACTOR_CHANGE, null);
	}

	protected void setAfterValueExtractorChange(java.lang.String afterValueExtractorChange) {
		getStateHelper().put(AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange);
	}

	protected java.lang.String getAfterValueFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_FORMATTER_CHANGE, null);
	}

	protected void setAfterValueFormatterChange(java.lang.String afterValueFormatterChange) {
		getStateHelper().put(AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange);
	}

	protected java.lang.String getAfterValuesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUES_CHANGE, null);
	}

	protected void setAfterValuesChange(java.lang.String afterValuesChange) {
		getStateHelper().put(AFTER_VALUES_CHANGE, afterValuesChange);
	}

	protected java.lang.String getOnActiveInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_INPUT_CHANGE, null);
	}

	protected void setOnActiveInputChange(java.lang.String onActiveInputChange) {
		getStateHelper().put(ON_ACTIVE_INPUT_CHANGE, onActiveInputChange);
	}

	protected java.lang.String getOnAutoHideChange() {
		return (java.lang.String) getStateHelper().eval(ON_AUTO_HIDE_CHANGE, null);
	}

	protected void setOnAutoHideChange(java.lang.String onAutoHideChange) {
		getStateHelper().put(ON_AUTO_HIDE_CHANGE, onAutoHideChange);
	}

	protected java.lang.String getOnAutocompleteChange() {
		return (java.lang.String) getStateHelper().eval(ON_AUTOCOMPLETE_CHANGE, null);
	}

	protected void setOnAutocompleteChange(java.lang.String onAutocompleteChange) {
		getStateHelper().put(ON_AUTOCOMPLETE_CHANGE, onAutocompleteChange);
	}

	protected java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	protected void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	protected java.lang.String getOnContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_CHANGE, null);
	}

	protected void setOnContentChange(java.lang.String onContentChange) {
		getStateHelper().put(ON_CONTENT_CHANGE, onContentChange);
	}

	protected java.lang.String getOnDateSeparatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATE_SEPARATOR_CHANGE, null);
	}

	protected void setOnDateSeparatorChange(java.lang.String onDateSeparatorChange) {
		getStateHelper().put(ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange);
	}

	protected java.lang.String getOnMaskChange() {
		return (java.lang.String) getStateHelper().eval(ON_MASK_CHANGE, null);
	}

	protected void setOnMaskChange(java.lang.String onMaskChange) {
		getStateHelper().put(ON_MASK_CHANGE, onMaskChange);
	}

	protected java.lang.String getOnPopoverChange() {
		return (java.lang.String) getStateHelper().eval(ON_POPOVER_CHANGE, null);
	}

	protected void setOnPopoverChange(java.lang.String onPopoverChange) {
		getStateHelper().put(ON_POPOVER_CHANGE, onPopoverChange);
	}

	protected java.lang.String getOnPopoverCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_POPOVER_CSS_CLASS_CHANGE, null);
	}

	protected void setOnPopoverCssClassChange(java.lang.String onPopoverCssClassChange) {
		getStateHelper().put(ON_POPOVER_CSS_CLASS_CHANGE, onPopoverCssClassChange);
	}

	protected java.lang.String getOnValueExtractorChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_EXTRACTOR_CHANGE, null);
	}

	protected void setOnValueExtractorChange(java.lang.String onValueExtractorChange) {
		getStateHelper().put(ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange);
	}

	protected java.lang.String getOnValueFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_FORMATTER_CHANGE, null);
	}

	protected void setOnValueFormatterChange(java.lang.String onValueFormatterChange) {
		getStateHelper().put(ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange);
	}

	protected java.lang.String getOnValuesChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUES_CHANGE, null);
	}

	protected void setOnValuesChange(java.lang.String onValuesChange) {
		getStateHelper().put(ON_VALUES_CHANGE, onValuesChange);
	}

}