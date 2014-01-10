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
package com.liferay.faces.alloy.component.schedulerbase;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SchedulerBaseBase extends javax.faces.component.UIPanel {

	private static final String ACTIVE_VIEW = "activeView";
	private static final String CSS_CLASS = "cssClass";
	private static final String DATE = "date";
	private static final String EVENT_RECORDER = "eventRecorder";
	private static final String FIRST_DAY_OF_WEEK = "firstDayOfWeek";
	private static final String HIDE_CLASS = "hideClass";
	private static final String NAVIGATION_DATE_FORMATTER = "navigationDateFormatter";
	private static final String RENDER = "render";
	private static final String STRINGS = "strings";
	private static final String TODAY_DATE = "todayDate";
	private static final String USE_ARIA = "useARIA";
	private static final String VIEW_DATE = "viewDate";
	private static final String VIEWS = "views";
	private static final String AFTER_ACTIVE_VIEW_CHANGE = "afterActiveViewChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_DATE_CHANGE = "afterDateChange";
	private static final String AFTER_EVENT_RECORDER_CHANGE = "afterEventRecorderChange";
	private static final String AFTER_FIRST_DAY_OF_WEEK_CHANGE = "afterFirstDayOfWeekChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_NAVIGATION_DATE_FORMATTER_CHANGE = "afterNavigationDateFormatterChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TODAY_DATE_CHANGE = "afterTodayDateChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String AFTER_VIEW_DATE_CHANGE = "afterViewDateChange";
	private static final String AFTER_VIEWS_CHANGE = "afterViewsChange";
	private static final String ON_ACTIVE_VIEW_CHANGE = "onActiveViewChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_DATE_CHANGE = "onDateChange";
	private static final String ON_EVENT_RECORDER_CHANGE = "onEventRecorderChange";
	private static final String ON_FIRST_DAY_OF_WEEK_CHANGE = "onFirstDayOfWeekChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_NAVIGATION_DATE_FORMATTER_CHANGE = "onNavigationDateFormatterChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TODAY_DATE_CHANGE = "onTodayDateChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	private static final String ON_VIEW_DATE_CHANGE = "onViewDateChange";
	private static final String ON_VIEWS_CHANGE = "onViewsChange";

	protected java.lang.Object getActiveView() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_VIEW, null);
	}

	protected void setActiveView(java.lang.Object activeView) {
		getStateHelper().put(ACTIVE_VIEW, activeView);
	}

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Object getDate() {
		return (java.lang.Object) getStateHelper().eval(DATE, null);
	}

	protected void setDate(java.lang.Object date) {
		getStateHelper().put(DATE, date);
	}

	protected java.lang.Object getEventRecorder() {
		return (java.lang.Object) getStateHelper().eval(EVENT_RECORDER, null);
	}

	protected void setEventRecorder(java.lang.Object eventRecorder) {
		getStateHelper().put(EVENT_RECORDER, eventRecorder);
	}

	protected java.lang.Object getFirstDayOfWeek() {
		return (java.lang.Object) getStateHelper().eval(FIRST_DAY_OF_WEEK, null);
	}

	protected void setFirstDayOfWeek(java.lang.Object firstDayOfWeek) {
		getStateHelper().put(FIRST_DAY_OF_WEEK, firstDayOfWeek);
	}

	protected java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	protected void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	protected java.lang.Object getNavigationDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(NAVIGATION_DATE_FORMATTER, null);
	}

	protected void setNavigationDateFormatter(java.lang.Object navigationDateFormatter) {
		getStateHelper().put(NAVIGATION_DATE_FORMATTER, navigationDateFormatter);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.Object getTodayDate() {
		return (java.lang.Object) getStateHelper().eval(TODAY_DATE, null);
	}

	protected void setTodayDate(java.lang.Object todayDate) {
		getStateHelper().put(TODAY_DATE, todayDate);
	}

	protected java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	protected void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	protected java.lang.Object getViewDate() {
		return (java.lang.Object) getStateHelper().eval(VIEW_DATE, null);
	}

	protected void setViewDate(java.lang.Object viewDate) {
		getStateHelper().put(VIEW_DATE, viewDate);
	}

	protected java.lang.Object getViews() {
		return (java.lang.Object) getStateHelper().eval(VIEWS, null);
	}

	protected void setViews(java.lang.Object views) {
		getStateHelper().put(VIEWS, views);
	}

	protected java.lang.String getAfterActiveViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_VIEW_CHANGE, null);
	}

	protected void setAfterActiveViewChange(java.lang.String afterActiveViewChange) {
		getStateHelper().put(AFTER_ACTIVE_VIEW_CHANGE, afterActiveViewChange);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATE_CHANGE, null);
	}

	protected void setAfterDateChange(java.lang.String afterDateChange) {
		getStateHelper().put(AFTER_DATE_CHANGE, afterDateChange);
	}

	protected java.lang.String getAfterEventRecorderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EVENT_RECORDER_CHANGE, null);
	}

	protected void setAfterEventRecorderChange(java.lang.String afterEventRecorderChange) {
		getStateHelper().put(AFTER_EVENT_RECORDER_CHANGE, afterEventRecorderChange);
	}

	protected java.lang.String getAfterFirstDayOfWeekChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIRST_DAY_OF_WEEK_CHANGE, null);
	}

	protected void setAfterFirstDayOfWeekChange(java.lang.String afterFirstDayOfWeekChange) {
		getStateHelper().put(AFTER_FIRST_DAY_OF_WEEK_CHANGE, afterFirstDayOfWeekChange);
	}

	protected java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	protected void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	protected java.lang.String getAfterNavigationDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, null);
	}

	protected void setAfterNavigationDateFormatterChange(java.lang.String afterNavigationDateFormatterChange) {
		getStateHelper().put(AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterTodayDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TODAY_DATE_CHANGE, null);
	}

	protected void setAfterTodayDateChange(java.lang.String afterTodayDateChange) {
		getStateHelper().put(AFTER_TODAY_DATE_CHANGE, afterTodayDateChange);
	}

	protected java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	protected void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	protected java.lang.String getAfterViewDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VIEW_DATE_CHANGE, null);
	}

	protected void setAfterViewDateChange(java.lang.String afterViewDateChange) {
		getStateHelper().put(AFTER_VIEW_DATE_CHANGE, afterViewDateChange);
	}

	protected java.lang.String getAfterViewsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VIEWS_CHANGE, null);
	}

	protected void setAfterViewsChange(java.lang.String afterViewsChange) {
		getStateHelper().put(AFTER_VIEWS_CHANGE, afterViewsChange);
	}

	protected java.lang.String getOnActiveViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_VIEW_CHANGE, null);
	}

	protected void setOnActiveViewChange(java.lang.String onActiveViewChange) {
		getStateHelper().put(ON_ACTIVE_VIEW_CHANGE, onActiveViewChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATE_CHANGE, null);
	}

	protected void setOnDateChange(java.lang.String onDateChange) {
		getStateHelper().put(ON_DATE_CHANGE, onDateChange);
	}

	protected java.lang.String getOnEventRecorderChange() {
		return (java.lang.String) getStateHelper().eval(ON_EVENT_RECORDER_CHANGE, null);
	}

	protected void setOnEventRecorderChange(java.lang.String onEventRecorderChange) {
		getStateHelper().put(ON_EVENT_RECORDER_CHANGE, onEventRecorderChange);
	}

	protected java.lang.String getOnFirstDayOfWeekChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIRST_DAY_OF_WEEK_CHANGE, null);
	}

	protected void setOnFirstDayOfWeekChange(java.lang.String onFirstDayOfWeekChange) {
		getStateHelper().put(ON_FIRST_DAY_OF_WEEK_CHANGE, onFirstDayOfWeekChange);
	}

	protected java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	protected void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	protected java.lang.String getOnNavigationDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAVIGATION_DATE_FORMATTER_CHANGE, null);
	}

	protected void setOnNavigationDateFormatterChange(java.lang.String onNavigationDateFormatterChange) {
		getStateHelper().put(ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnTodayDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_TODAY_DATE_CHANGE, null);
	}

	protected void setOnTodayDateChange(java.lang.String onTodayDateChange) {
		getStateHelper().put(ON_TODAY_DATE_CHANGE, onTodayDateChange);
	}

	protected java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	protected void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

	protected java.lang.String getOnViewDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_VIEW_DATE_CHANGE, null);
	}

	protected void setOnViewDateChange(java.lang.String onViewDateChange) {
		getStateHelper().put(ON_VIEW_DATE_CHANGE, onViewDateChange);
	}

	protected java.lang.String getOnViewsChange() {
		return (java.lang.String) getStateHelper().eval(ON_VIEWS_CHANGE, null);
	}

	protected void setOnViewsChange(java.lang.String onViewsChange) {
		getStateHelper().put(ON_VIEWS_CHANGE, onViewsChange);
	}

}