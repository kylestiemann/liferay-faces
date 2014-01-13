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
package com.liferay.faces.alloy.component.datepickerbase;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DatePickerBaseBase extends javax.faces.component.UIPanel {

	private static final String AUTO_HIDE = "autoHide";
	private static final String CALENDAR = "calendar";
	private static final String PANES = "panes";
	private static final String AFTER_AUTO_HIDE_CHANGE = "afterAutoHideChange";
	private static final String AFTER_CALENDAR_CHANGE = "afterCalendarChange";
	private static final String AFTER_PANES_CHANGE = "afterPanesChange";
	private static final String ON_AUTO_HIDE_CHANGE = "onAutoHideChange";
	private static final String ON_CALENDAR_CHANGE = "onCalendarChange";
	private static final String ON_PANES_CHANGE = "onPanesChange";

	protected java.lang.Boolean getAutoHide() {
		return (java.lang.Boolean) getStateHelper().eval(AUTO_HIDE, null);
	}

	protected void setAutoHide(java.lang.Boolean autoHide) {
		getStateHelper().put(AUTO_HIDE, autoHide);
	}

	protected java.lang.Object getCalendar() {
		return (java.lang.Object) getStateHelper().eval(CALENDAR, null);
	}

	protected void setCalendar(java.lang.Object calendar) {
		getStateHelper().put(CALENDAR, calendar);
	}

	protected java.lang.Object getPanes() {
		return (java.lang.Object) getStateHelper().eval(PANES, null);
	}

	protected void setPanes(java.lang.Object panes) {
		getStateHelper().put(PANES, panes);
	}

	protected java.lang.String getAfterAutoHideChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AUTO_HIDE_CHANGE, null);
	}

	protected void setAfterAutoHideChange(java.lang.String afterAutoHideChange) {
		getStateHelper().put(AFTER_AUTO_HIDE_CHANGE, afterAutoHideChange);
	}

	protected java.lang.String getAfterCalendarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CALENDAR_CHANGE, null);
	}

	protected void setAfterCalendarChange(java.lang.String afterCalendarChange) {
		getStateHelper().put(AFTER_CALENDAR_CHANGE, afterCalendarChange);
	}

	protected java.lang.String getAfterPanesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PANES_CHANGE, null);
	}

	protected void setAfterPanesChange(java.lang.String afterPanesChange) {
		getStateHelper().put(AFTER_PANES_CHANGE, afterPanesChange);
	}

	protected java.lang.String getOnAutoHideChange() {
		return (java.lang.String) getStateHelper().eval(ON_AUTO_HIDE_CHANGE, null);
	}

	protected void setOnAutoHideChange(java.lang.String onAutoHideChange) {
		getStateHelper().put(ON_AUTO_HIDE_CHANGE, onAutoHideChange);
	}

	protected java.lang.String getOnCalendarChange() {
		return (java.lang.String) getStateHelper().eval(ON_CALENDAR_CHANGE, null);
	}

	protected void setOnCalendarChange(java.lang.String onCalendarChange) {
		getStateHelper().put(ON_CALENDAR_CHANGE, onCalendarChange);
	}

	protected java.lang.String getOnPanesChange() {
		return (java.lang.String) getStateHelper().eval(ON_PANES_CHANGE, null);
	}

	protected void setOnPanesChange(java.lang.String onPanesChange) {
		getStateHelper().put(ON_PANES_CHANGE, onPanesChange);
	}

}