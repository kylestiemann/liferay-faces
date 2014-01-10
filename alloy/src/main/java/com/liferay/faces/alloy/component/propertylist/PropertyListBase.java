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
package com.liferay.faces.alloy.component.propertylist;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class PropertyListBase extends javax.faces.component.UIPanel {

	private static final String COLUMNS = "columns";
	private static final String EDIT_EVENT = "editEvent";
	private static final String SCROLLABLE = "scrollable";
	private static final String STRINGS = "strings";
	private static final String WIDTH = "width";
	private static final String AFTER_COLUMNS_CHANGE = "afterColumnsChange";
	private static final String AFTER_EDIT_EVENT_CHANGE = "afterEditEventChange";
	private static final String AFTER_SCROLLABLE_CHANGE = "afterScrollableChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String ON_COLUMNS_CHANGE = "onColumnsChange";
	private static final String ON_EDIT_EVENT_CHANGE = "onEditEventChange";
	private static final String ON_SCROLLABLE_CHANGE = "onScrollableChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";

	protected java.lang.Object getColumns() {
		return (java.lang.Object) getStateHelper().eval(COLUMNS, null);
	}

	protected void setColumns(java.lang.Object columns) {
		getStateHelper().put(COLUMNS, columns);
	}

	protected java.lang.String getEditEvent() {
		return (java.lang.String) getStateHelper().eval(EDIT_EVENT, null);
	}

	protected void setEditEvent(java.lang.String editEvent) {
		getStateHelper().put(EDIT_EVENT, editEvent);
	}

	protected java.lang.Boolean getScrollable() {
		return (java.lang.Boolean) getStateHelper().eval(SCROLLABLE, null);
	}

	protected void setScrollable(java.lang.Boolean scrollable) {
		getStateHelper().put(SCROLLABLE, scrollable);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	protected void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	protected java.lang.String getAfterColumnsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLUMNS_CHANGE, null);
	}

	protected void setAfterColumnsChange(java.lang.String afterColumnsChange) {
		getStateHelper().put(AFTER_COLUMNS_CHANGE, afterColumnsChange);
	}

	protected java.lang.String getAfterEditEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EDIT_EVENT_CHANGE, null);
	}

	protected void setAfterEditEventChange(java.lang.String afterEditEventChange) {
		getStateHelper().put(AFTER_EDIT_EVENT_CHANGE, afterEditEventChange);
	}

	protected java.lang.String getAfterScrollableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCROLLABLE_CHANGE, null);
	}

	protected void setAfterScrollableChange(java.lang.String afterScrollableChange) {
		getStateHelper().put(AFTER_SCROLLABLE_CHANGE, afterScrollableChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	protected void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	protected java.lang.String getOnColumnsChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLUMNS_CHANGE, null);
	}

	protected void setOnColumnsChange(java.lang.String onColumnsChange) {
		getStateHelper().put(ON_COLUMNS_CHANGE, onColumnsChange);
	}

	protected java.lang.String getOnEditEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_EDIT_EVENT_CHANGE, null);
	}

	protected void setOnEditEventChange(java.lang.String onEditEventChange) {
		getStateHelper().put(ON_EDIT_EVENT_CHANGE, onEditEventChange);
	}

	protected java.lang.String getOnScrollableChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCROLLABLE_CHANGE, null);
	}

	protected void setOnScrollableChange(java.lang.String onScrollableChange) {
		getStateHelper().put(ON_SCROLLABLE_CHANGE, onScrollableChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	protected void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

}