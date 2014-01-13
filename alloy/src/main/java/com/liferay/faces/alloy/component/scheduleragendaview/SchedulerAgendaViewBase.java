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
package com.liferay.faces.alloy.component.scheduleragendaview;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SchedulerAgendaViewBase extends javax.faces.component.UIPanel {

	private static final String SCHEDULERAGENDAVIEW_BODY_CONTENT = "scheduleragendaviewBodyContent";
	private static final String CSS_CLASS = "cssClass";
	private static final String EVENTS_DATE_FORMATTER = "eventsDateFormatter";
	private static final String FILTER_FN = "filterFn";
	private static final String HEADER_DAY_DATE_FORMATTER = "headerDayDateFormatter";
	private static final String HEADER_EXTRA_DATE_FORMATTER = "headerExtraDateFormatter";
	private static final String HEIGHT = "height";
	private static final String HIDE_CLASS = "hideClass";
	private static final String INFO_DAY_DATE_FORMATTER = "infoDayDateFormatter";
	private static final String INFO_LABEL_BIG_DATE_FORMATTER = "infoLabelBigDateFormatter";
	private static final String INFO_LABEL_SMALL_DATE_FORMATTER = "infoLabelSmallDateFormatter";
	private static final String ISO_TIME = "isoTime";
	private static final String NAME = "name";
	private static final String NAVIGATION_DATE_FORMATTER = "navigationDateFormatter";
	private static final String NEXT_DATE = "nextDate";
	private static final String PREV_DATE = "prevDate";
	private static final String RENDER = "render";
	private static final String SCHEDULER = "scheduler";
	private static final String SCROLLABLE = "scrollable";
	private static final String STRINGS = "strings";
	private static final String TRIGGER_NODE = "triggerNode";
	private static final String USE_ARIA = "useARIA";
	private static final String VISIBLE = "visible";
	private static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_EVENTS_DATE_FORMATTER_CHANGE = "afterEventsDateFormatterChange";
	private static final String AFTER_FILTER_FN_CHANGE = "afterFilterFnChange";
	private static final String AFTER_HEADER_DAY_DATE_FORMATTER_CHANGE = "afterHeaderDayDateFormatterChange";
	private static final String AFTER_HEADER_EXTRA_DATE_FORMATTER_CHANGE = "afterHeaderExtraDateFormatterChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_INFO_DAY_DATE_FORMATTER_CHANGE = "afterInfoDayDateFormatterChange";
	private static final String AFTER_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE = "afterInfoLabelBigDateFormatterChange";
	private static final String AFTER_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE = "afterInfoLabelSmallDateFormatterChange";
	private static final String AFTER_ISO_TIME_CHANGE = "afterIsoTimeChange";
	private static final String AFTER_NAME_CHANGE = "afterNameChange";
	private static final String AFTER_NAVIGATION_DATE_FORMATTER_CHANGE = "afterNavigationDateFormatterChange";
	private static final String AFTER_NEXT_DATE_CHANGE = "afterNextDateChange";
	private static final String AFTER_PREV_DATE_CHANGE = "afterPrevDateChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_SCHEDULER_CHANGE = "afterSchedulerChange";
	private static final String AFTER_SCROLLABLE_CHANGE = "afterScrollableChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TRIGGER_NODE_CHANGE = "afterTriggerNodeChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_EVENTS_DATE_FORMATTER_CHANGE = "onEventsDateFormatterChange";
	private static final String ON_FILTER_FN_CHANGE = "onFilterFnChange";
	private static final String ON_HEADER_DAY_DATE_FORMATTER_CHANGE = "onHeaderDayDateFormatterChange";
	private static final String ON_HEADER_EXTRA_DATE_FORMATTER_CHANGE = "onHeaderExtraDateFormatterChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_INFO_DAY_DATE_FORMATTER_CHANGE = "onInfoDayDateFormatterChange";
	private static final String ON_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE = "onInfoLabelBigDateFormatterChange";
	private static final String ON_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE = "onInfoLabelSmallDateFormatterChange";
	private static final String ON_ISO_TIME_CHANGE = "onIsoTimeChange";
	private static final String ON_NAME_CHANGE = "onNameChange";
	private static final String ON_NAVIGATION_DATE_FORMATTER_CHANGE = "onNavigationDateFormatterChange";
	private static final String ON_NEXT_DATE_CHANGE = "onNextDateChange";
	private static final String ON_PREV_DATE_CHANGE = "onPrevDateChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_SCHEDULER_CHANGE = "onSchedulerChange";
	private static final String ON_SCROLLABLE_CHANGE = "onScrollableChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TRIGGER_NODE_CHANGE = "onTriggerNodeChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	protected java.lang.String getScheduleragendaviewBodyContent() {
		return (java.lang.String) getStateHelper().eval(SCHEDULERAGENDAVIEW_BODY_CONTENT, null);
	}

	protected void setScheduleragendaviewBodyContent(java.lang.String scheduleragendaviewBodyContent) {
		getStateHelper().put(SCHEDULERAGENDAVIEW_BODY_CONTENT, scheduleragendaviewBodyContent);
	}

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Object getEventsDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(EVENTS_DATE_FORMATTER, null);
	}

	protected void setEventsDateFormatter(java.lang.Object eventsDateFormatter) {
		getStateHelper().put(EVENTS_DATE_FORMATTER, eventsDateFormatter);
	}

	protected java.lang.Object getFilterFn() {
		return (java.lang.Object) getStateHelper().eval(FILTER_FN, null);
	}

	protected void setFilterFn(java.lang.Object filterFn) {
		getStateHelper().put(FILTER_FN, filterFn);
	}

	protected java.lang.Object getHeaderDayDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(HEADER_DAY_DATE_FORMATTER, null);
	}

	protected void setHeaderDayDateFormatter(java.lang.Object headerDayDateFormatter) {
		getStateHelper().put(HEADER_DAY_DATE_FORMATTER, headerDayDateFormatter);
	}

	protected java.lang.Object getHeaderExtraDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(HEADER_EXTRA_DATE_FORMATTER, null);
	}

	protected void setHeaderExtraDateFormatter(java.lang.Object headerExtraDateFormatter) {
		getStateHelper().put(HEADER_EXTRA_DATE_FORMATTER, headerExtraDateFormatter);
	}

	protected java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	protected void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	protected java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	protected void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	protected java.lang.Object getInfoDayDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(INFO_DAY_DATE_FORMATTER, null);
	}

	protected void setInfoDayDateFormatter(java.lang.Object infoDayDateFormatter) {
		getStateHelper().put(INFO_DAY_DATE_FORMATTER, infoDayDateFormatter);
	}

	protected java.lang.Object getInfoLabelBigDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(INFO_LABEL_BIG_DATE_FORMATTER, null);
	}

	protected void setInfoLabelBigDateFormatter(java.lang.Object infoLabelBigDateFormatter) {
		getStateHelper().put(INFO_LABEL_BIG_DATE_FORMATTER, infoLabelBigDateFormatter);
	}

	protected java.lang.Object getInfoLabelSmallDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(INFO_LABEL_SMALL_DATE_FORMATTER, null);
	}

	protected void setInfoLabelSmallDateFormatter(java.lang.Object infoLabelSmallDateFormatter) {
		getStateHelper().put(INFO_LABEL_SMALL_DATE_FORMATTER, infoLabelSmallDateFormatter);
	}

	protected java.lang.Boolean getIsoTime() {
		return (java.lang.Boolean) getStateHelper().eval(ISO_TIME, null);
	}

	protected void setIsoTime(java.lang.Boolean isoTime) {
		getStateHelper().put(ISO_TIME, isoTime);
	}

	protected java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	protected void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	protected java.lang.Object getNavigationDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(NAVIGATION_DATE_FORMATTER, null);
	}

	protected void setNavigationDateFormatter(java.lang.Object navigationDateFormatter) {
		getStateHelper().put(NAVIGATION_DATE_FORMATTER, navigationDateFormatter);
	}

	protected java.lang.Object getNextDate() {
		return (java.lang.Object) getStateHelper().eval(NEXT_DATE, null);
	}

	protected void setNextDate(java.lang.Object nextDate) {
		getStateHelper().put(NEXT_DATE, nextDate);
	}

	protected java.lang.Object getPrevDate() {
		return (java.lang.Object) getStateHelper().eval(PREV_DATE, null);
	}

	protected void setPrevDate(java.lang.Object prevDate) {
		getStateHelper().put(PREV_DATE, prevDate);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Object getScheduler() {
		return (java.lang.Object) getStateHelper().eval(SCHEDULER, null);
	}

	protected void setScheduler(java.lang.Object scheduler) {
		getStateHelper().put(SCHEDULER, scheduler);
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

	protected java.lang.Object getTriggerNode() {
		return (java.lang.Object) getStateHelper().eval(TRIGGER_NODE, null);
	}

	protected void setTriggerNode(java.lang.Object triggerNode) {
		getStateHelper().put(TRIGGER_NODE, triggerNode);
	}

	protected java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	protected void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	protected java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	protected void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	protected java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	protected void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterEventsDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EVENTS_DATE_FORMATTER_CHANGE, null);
	}

	protected void setAfterEventsDateFormatterChange(java.lang.String afterEventsDateFormatterChange) {
		getStateHelper().put(AFTER_EVENTS_DATE_FORMATTER_CHANGE, afterEventsDateFormatterChange);
	}

	protected java.lang.String getAfterFilterFnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILTER_FN_CHANGE, null);
	}

	protected void setAfterFilterFnChange(java.lang.String afterFilterFnChange) {
		getStateHelper().put(AFTER_FILTER_FN_CHANGE, afterFilterFnChange);
	}

	protected java.lang.String getAfterHeaderDayDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_DAY_DATE_FORMATTER_CHANGE, null);
	}

	protected void setAfterHeaderDayDateFormatterChange(java.lang.String afterHeaderDayDateFormatterChange) {
		getStateHelper().put(AFTER_HEADER_DAY_DATE_FORMATTER_CHANGE, afterHeaderDayDateFormatterChange);
	}

	protected java.lang.String getAfterHeaderExtraDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_EXTRA_DATE_FORMATTER_CHANGE, null);
	}

	protected void setAfterHeaderExtraDateFormatterChange(java.lang.String afterHeaderExtraDateFormatterChange) {
		getStateHelper().put(AFTER_HEADER_EXTRA_DATE_FORMATTER_CHANGE, afterHeaderExtraDateFormatterChange);
	}

	protected java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	protected void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	protected java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	protected void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	protected java.lang.String getAfterInfoDayDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_DAY_DATE_FORMATTER_CHANGE, null);
	}

	protected void setAfterInfoDayDateFormatterChange(java.lang.String afterInfoDayDateFormatterChange) {
		getStateHelper().put(AFTER_INFO_DAY_DATE_FORMATTER_CHANGE, afterInfoDayDateFormatterChange);
	}

	protected java.lang.String getAfterInfoLabelBigDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, null);
	}

	protected void setAfterInfoLabelBigDateFormatterChange(java.lang.String afterInfoLabelBigDateFormatterChange) {
		getStateHelper().put(AFTER_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, afterInfoLabelBigDateFormatterChange);
	}

	protected java.lang.String getAfterInfoLabelSmallDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, null);
	}

	protected void setAfterInfoLabelSmallDateFormatterChange(java.lang.String afterInfoLabelSmallDateFormatterChange) {
		getStateHelper().put(AFTER_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, afterInfoLabelSmallDateFormatterChange);
	}

	protected java.lang.String getAfterIsoTimeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ISO_TIME_CHANGE, null);
	}

	protected void setAfterIsoTimeChange(java.lang.String afterIsoTimeChange) {
		getStateHelper().put(AFTER_ISO_TIME_CHANGE, afterIsoTimeChange);
	}

	protected java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	protected void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	protected java.lang.String getAfterNavigationDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, null);
	}

	protected void setAfterNavigationDateFormatterChange(java.lang.String afterNavigationDateFormatterChange) {
		getStateHelper().put(AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange);
	}

	protected java.lang.String getAfterNextDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NEXT_DATE_CHANGE, null);
	}

	protected void setAfterNextDateChange(java.lang.String afterNextDateChange) {
		getStateHelper().put(AFTER_NEXT_DATE_CHANGE, afterNextDateChange);
	}

	protected java.lang.String getAfterPrevDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREV_DATE_CHANGE, null);
	}

	protected void setAfterPrevDateChange(java.lang.String afterPrevDateChange) {
		getStateHelper().put(AFTER_PREV_DATE_CHANGE, afterPrevDateChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCHEDULER_CHANGE, null);
	}

	protected void setAfterSchedulerChange(java.lang.String afterSchedulerChange) {
		getStateHelper().put(AFTER_SCHEDULER_CHANGE, afterSchedulerChange);
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

	protected java.lang.String getAfterTriggerNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_NODE_CHANGE, null);
	}

	protected void setAfterTriggerNodeChange(java.lang.String afterTriggerNodeChange) {
		getStateHelper().put(AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange);
	}

	protected java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	protected void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	protected java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	protected void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	protected java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	protected void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnEventsDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_EVENTS_DATE_FORMATTER_CHANGE, null);
	}

	protected void setOnEventsDateFormatterChange(java.lang.String onEventsDateFormatterChange) {
		getStateHelper().put(ON_EVENTS_DATE_FORMATTER_CHANGE, onEventsDateFormatterChange);
	}

	protected java.lang.String getOnFilterFnChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILTER_FN_CHANGE, null);
	}

	protected void setOnFilterFnChange(java.lang.String onFilterFnChange) {
		getStateHelper().put(ON_FILTER_FN_CHANGE, onFilterFnChange);
	}

	protected java.lang.String getOnHeaderDayDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_DAY_DATE_FORMATTER_CHANGE, null);
	}

	protected void setOnHeaderDayDateFormatterChange(java.lang.String onHeaderDayDateFormatterChange) {
		getStateHelper().put(ON_HEADER_DAY_DATE_FORMATTER_CHANGE, onHeaderDayDateFormatterChange);
	}

	protected java.lang.String getOnHeaderExtraDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_EXTRA_DATE_FORMATTER_CHANGE, null);
	}

	protected void setOnHeaderExtraDateFormatterChange(java.lang.String onHeaderExtraDateFormatterChange) {
		getStateHelper().put(ON_HEADER_EXTRA_DATE_FORMATTER_CHANGE, onHeaderExtraDateFormatterChange);
	}

	protected java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	protected void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	protected java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	protected void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	protected java.lang.String getOnInfoDayDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_DAY_DATE_FORMATTER_CHANGE, null);
	}

	protected void setOnInfoDayDateFormatterChange(java.lang.String onInfoDayDateFormatterChange) {
		getStateHelper().put(ON_INFO_DAY_DATE_FORMATTER_CHANGE, onInfoDayDateFormatterChange);
	}

	protected java.lang.String getOnInfoLabelBigDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, null);
	}

	protected void setOnInfoLabelBigDateFormatterChange(java.lang.String onInfoLabelBigDateFormatterChange) {
		getStateHelper().put(ON_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, onInfoLabelBigDateFormatterChange);
	}

	protected java.lang.String getOnInfoLabelSmallDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, null);
	}

	protected void setOnInfoLabelSmallDateFormatterChange(java.lang.String onInfoLabelSmallDateFormatterChange) {
		getStateHelper().put(ON_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, onInfoLabelSmallDateFormatterChange);
	}

	protected java.lang.String getOnIsoTimeChange() {
		return (java.lang.String) getStateHelper().eval(ON_ISO_TIME_CHANGE, null);
	}

	protected void setOnIsoTimeChange(java.lang.String onIsoTimeChange) {
		getStateHelper().put(ON_ISO_TIME_CHANGE, onIsoTimeChange);
	}

	protected java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	protected void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	protected java.lang.String getOnNavigationDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAVIGATION_DATE_FORMATTER_CHANGE, null);
	}

	protected void setOnNavigationDateFormatterChange(java.lang.String onNavigationDateFormatterChange) {
		getStateHelper().put(ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange);
	}

	protected java.lang.String getOnNextDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_NEXT_DATE_CHANGE, null);
	}

	protected void setOnNextDateChange(java.lang.String onNextDateChange) {
		getStateHelper().put(ON_NEXT_DATE_CHANGE, onNextDateChange);
	}

	protected java.lang.String getOnPrevDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREV_DATE_CHANGE, null);
	}

	protected void setOnPrevDateChange(java.lang.String onPrevDateChange) {
		getStateHelper().put(ON_PREV_DATE_CHANGE, onPrevDateChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCHEDULER_CHANGE, null);
	}

	protected void setOnSchedulerChange(java.lang.String onSchedulerChange) {
		getStateHelper().put(ON_SCHEDULER_CHANGE, onSchedulerChange);
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

	protected java.lang.String getOnTriggerNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_NODE_CHANGE, null);
	}

	protected void setOnTriggerNodeChange(java.lang.String onTriggerNodeChange) {
		getStateHelper().put(ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange);
	}

	protected java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	protected void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

	protected java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	protected void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

}