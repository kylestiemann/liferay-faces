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
package com.liferay.faces.alloy.component.timepickerbase;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TimePickerBaseBase extends javax.faces.component.UIPanel {

	private static final String AUTOCOMPLETE = "autocomplete";
	private static final String DATE_SEPARATOR = "dateSeparator";
	private static final String MASK = "mask";
	private static final String POPOVER_CSS_CLASS = "popoverCssClass";
	private static final String TIMEPICKERBASE_VALUES = "timepickerbaseValues";
	private static final String AFTER_AUTOCOMPLETE_CHANGE = "afterAutocompleteChange";
	private static final String AFTER_DATE_SEPARATOR_CHANGE = "afterDateSeparatorChange";
	private static final String AFTER_MASK_CHANGE = "afterMaskChange";
	private static final String AFTER_POPOVER_CSS_CLASS_CHANGE = "afterPopoverCssClassChange";
	private static final String AFTER_VALUES_CHANGE = "afterValuesChange";
	private static final String ON_AUTOCOMPLETE_CHANGE = "onAutocompleteChange";
	private static final String ON_DATE_SEPARATOR_CHANGE = "onDateSeparatorChange";
	private static final String ON_MASK_CHANGE = "onMaskChange";
	private static final String ON_POPOVER_CSS_CLASS_CHANGE = "onPopoverCssClassChange";
	private static final String ON_VALUES_CHANGE = "onValuesChange";

	protected java.lang.Object getAutocomplete() {
		return (java.lang.Object) getStateHelper().eval(AUTOCOMPLETE, null);
	}

	protected void setAutocomplete(java.lang.Object autocomplete) {
		getStateHelper().put(AUTOCOMPLETE, autocomplete);
	}

	protected java.lang.Object getDateSeparator() {
		return (java.lang.Object) getStateHelper().eval(DATE_SEPARATOR, null);
	}

	protected void setDateSeparator(java.lang.Object dateSeparator) {
		getStateHelper().put(DATE_SEPARATOR, dateSeparator);
	}

	protected java.lang.Object getMask() {
		return (java.lang.Object) getStateHelper().eval(MASK, null);
	}

	protected void setMask(java.lang.Object mask) {
		getStateHelper().put(MASK, mask);
	}

	protected java.lang.Object getPopoverCssClass() {
		return (java.lang.Object) getStateHelper().eval(POPOVER_CSS_CLASS, null);
	}

	protected void setPopoverCssClass(java.lang.Object popoverCssClass) {
		getStateHelper().put(POPOVER_CSS_CLASS, popoverCssClass);
	}

	protected java.lang.Object getTimepickerbaseValues() {
		return (java.lang.Object) getStateHelper().eval(TIMEPICKERBASE_VALUES, null);
	}

	protected void setTimepickerbaseValues(java.lang.Object timepickerbaseValues) {
		getStateHelper().put(TIMEPICKERBASE_VALUES, timepickerbaseValues);
	}

	protected java.lang.String getAfterAutocompleteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AUTOCOMPLETE_CHANGE, null);
	}

	protected void setAfterAutocompleteChange(java.lang.String afterAutocompleteChange) {
		getStateHelper().put(AFTER_AUTOCOMPLETE_CHANGE, afterAutocompleteChange);
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

	protected java.lang.String getAfterPopoverCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POPOVER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterPopoverCssClassChange(java.lang.String afterPopoverCssClassChange) {
		getStateHelper().put(AFTER_POPOVER_CSS_CLASS_CHANGE, afterPopoverCssClassChange);
	}

	protected java.lang.String getAfterValuesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUES_CHANGE, null);
	}

	protected void setAfterValuesChange(java.lang.String afterValuesChange) {
		getStateHelper().put(AFTER_VALUES_CHANGE, afterValuesChange);
	}

	protected java.lang.String getOnAutocompleteChange() {
		return (java.lang.String) getStateHelper().eval(ON_AUTOCOMPLETE_CHANGE, null);
	}

	protected void setOnAutocompleteChange(java.lang.String onAutocompleteChange) {
		getStateHelper().put(ON_AUTOCOMPLETE_CHANGE, onAutocompleteChange);
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

	protected java.lang.String getOnPopoverCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_POPOVER_CSS_CLASS_CHANGE, null);
	}

	protected void setOnPopoverCssClassChange(java.lang.String onPopoverCssClassChange) {
		getStateHelper().put(ON_POPOVER_CSS_CLASS_CHANGE, onPopoverCssClassChange);
	}

	protected java.lang.String getOnValuesChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUES_CHANGE, null);
	}

	protected void setOnValuesChange(java.lang.String onValuesChange) {
		getStateHelper().put(ON_VALUES_CHANGE, onValuesChange);
	}

}