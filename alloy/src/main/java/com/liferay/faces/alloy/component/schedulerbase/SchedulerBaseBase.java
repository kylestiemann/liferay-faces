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
package com.liferay.faces.alloy.component.schedulerbase;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SchedulerBaseBase extends javax.faces.component.UIPanel {

	public static final String ACTIVE_VIEW = "activeView";
	public static final String BOUNDING_BOX = "boundingBox";
	public static final String CONTENT_BOX = "contentBox";
	public static final String CSS_CLASS = "cssClass";
	public static final String DATE = "date";
	public static final String DESTROYED = "destroyed";
	public static final String DISABLED = "disabled";
	public static final String EVENT_RECORDER = "eventRecorder";
	public static final String FIRST_DAY_OF_WEEK = "firstDayOfWeek";
	public static final String FOCUSED = "focused";
	public static final String HEIGHT = "height";
	public static final String HIDE_CLASS = "hideClass";
	public static final String SCHEDULER_BASE_ID = "id";
	public static final String INITIALIZED = "initialized";
	public static final String SCHEDULER_BASE_LOCALE = "locale";
	public static final String NAVIGATION_DATE_FORMATTER = "navigationDateFormatter";
	public static final String RENDER = "render";
	public static final String RENDERED = "rendered";
	public static final String SRC_NODE = "srcNode";
	public static final String STRINGS = "strings";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TODAY_DATE = "todayDate";
	public static final String USE_ARIA = "useARIA";
	public static final String VIEW_DATE = "viewDate";
	public static final String VIEWS = "views";
	public static final String VISIBLE = "visible";
	public static final String WIDTH = "width";
	public static final String AFTER_ACTIVE_VIEW_CHANGE = "afterActiveViewChange";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	public static final String AFTER_DATE_CHANGE = "afterDateChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_EVENT_RECORDER_CHANGE = "afterEventRecorderChange";
	public static final String AFTER_FIRST_DAY_OF_WEEK_CHANGE = "afterFirstDayOfWeekChange";
	public static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	public static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	public static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	public static final String AFTER_NAVIGATION_DATE_FORMATTER_CHANGE = "afterNavigationDateFormatterChange";
	public static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TODAY_DATE_CHANGE = "afterTodayDateChange";
	public static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	public static final String AFTER_VIEW_DATE_CHANGE = "afterViewDateChange";
	public static final String AFTER_VIEWS_CHANGE = "afterViewsChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	public static final String ON_ACTIVE_VIEW_CHANGE = "onActiveViewChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	public static final String ON_DATE_CHANGE = "onDateChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_EVENT_RECORDER_CHANGE = "onEventRecorderChange";
	public static final String ON_FIRST_DAY_OF_WEEK_CHANGE = "onFirstDayOfWeekChange";
	public static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	public static final String ON_HEIGHT_CHANGE = "onHeightChange";
	public static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LOCALE_CHANGE = "onLocaleChange";
	public static final String ON_NAVIGATION_DATE_FORMATTER_CHANGE = "onNavigationDateFormatterChange";
	public static final String ON_RENDER_CHANGE = "onRenderChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TODAY_DATE_CHANGE = "onTodayDateChange";
	public static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	public static final String ON_VIEW_DATE_CHANGE = "onViewDateChange";
	public static final String ON_VIEWS_CHANGE = "onViewsChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	public static final String ON_WIDTH_CHANGE = "onWidthChange";

	public java.lang.Object getActiveView() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_VIEW, null);
	}

	public void setActiveView(java.lang.Object activeView) {
		getStateHelper().put(ACTIVE_VIEW, activeView);
	}

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	public void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	public java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	public void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	public java.lang.Object getDate() {
		return (java.lang.Object) getStateHelper().eval(DATE, null);
	}

	public void setDate(java.lang.Object date) {
		getStateHelper().put(DATE, date);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	public void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	public java.lang.String getEventRecorder() {
		return (java.lang.String) getStateHelper().eval(EVENT_RECORDER, null);
	}

	public void setEventRecorder(java.lang.String eventRecorder) {
		getStateHelper().put(EVENT_RECORDER, eventRecorder);
	}

	public java.lang.Object getFirstDayOfWeek() {
		return (java.lang.Object) getStateHelper().eval(FIRST_DAY_OF_WEEK, null);
	}

	public void setFirstDayOfWeek(java.lang.Object firstDayOfWeek) {
		getStateHelper().put(FIRST_DAY_OF_WEEK, firstDayOfWeek);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	public void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	public java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	public void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	public java.lang.String getSchedulerBaseId() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER_BASE_ID, null);
	}

	public void setSchedulerBaseId(java.lang.String schedulerBaseId) {
		getStateHelper().put(SCHEDULER_BASE_ID, schedulerBaseId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getSchedulerBaseLocale() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER_BASE_LOCALE, null);
	}

	public void setSchedulerBaseLocale(java.lang.String schedulerBaseLocale) {
		getStateHelper().put(SCHEDULER_BASE_LOCALE, schedulerBaseLocale);
	}

	public java.lang.Object getNavigationDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(NAVIGATION_DATE_FORMATTER, null);
	}

	public void setNavigationDateFormatter(java.lang.Object navigationDateFormatter) {
		getStateHelper().put(NAVIGATION_DATE_FORMATTER, navigationDateFormatter);
	}

	public java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	public void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	public java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	public void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	public java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	public void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
	}

	public java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	public void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.Object getTodayDate() {
		return (java.lang.Object) getStateHelper().eval(TODAY_DATE, null);
	}

	public void setTodayDate(java.lang.Object todayDate) {
		getStateHelper().put(TODAY_DATE, todayDate);
	}

	public java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	public void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	public java.lang.String getViewDate() {
		return (java.lang.String) getStateHelper().eval(VIEW_DATE, null);
	}

	public void setViewDate(java.lang.String viewDate) {
		getStateHelper().put(VIEW_DATE, viewDate);
	}

	public java.lang.String getViews() {
		return (java.lang.String) getStateHelper().eval(VIEWS, null);
	}

	public void setViews(java.lang.String views) {
		getStateHelper().put(VIEWS, views);
	}

	public java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	public void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	public java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	public void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	public java.lang.String getAfterActiveViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_VIEW_CHANGE, null);
	}

	public void setAfterActiveViewChange(java.lang.String afterActiveViewChange) {
		getStateHelper().put(AFTER_ACTIVE_VIEW_CHANGE, afterActiveViewChange);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	public java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	public void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	public java.lang.String getAfterDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATE_CHANGE, null);
	}

	public void setAfterDateChange(java.lang.String afterDateChange) {
		getStateHelper().put(AFTER_DATE_CHANGE, afterDateChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	public java.lang.String getAfterEventRecorderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EVENT_RECORDER_CHANGE, null);
	}

	public void setAfterEventRecorderChange(java.lang.String afterEventRecorderChange) {
		getStateHelper().put(AFTER_EVENT_RECORDER_CHANGE, afterEventRecorderChange);
	}

	public java.lang.String getAfterFirstDayOfWeekChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIRST_DAY_OF_WEEK_CHANGE, null);
	}

	public void setAfterFirstDayOfWeekChange(java.lang.String afterFirstDayOfWeekChange) {
		getStateHelper().put(AFTER_FIRST_DAY_OF_WEEK_CHANGE, afterFirstDayOfWeekChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	public java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	public void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	public java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	public void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	public void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	public java.lang.String getAfterNavigationDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, null);
	}

	public void setAfterNavigationDateFormatterChange(java.lang.String afterNavigationDateFormatterChange) {
		getStateHelper().put(AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange);
	}

	public java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	public void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	public java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	public void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	public java.lang.String getAfterSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SRC_NODE_CHANGE, null);
	}

	public void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		getStateHelper().put(AFTER_SRC_NODE_CHANGE, afterSrcNodeChange);
	}

	public java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	public void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	public java.lang.String getAfterTodayDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TODAY_DATE_CHANGE, null);
	}

	public void setAfterTodayDateChange(java.lang.String afterTodayDateChange) {
		getStateHelper().put(AFTER_TODAY_DATE_CHANGE, afterTodayDateChange);
	}

	public java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	public void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	public java.lang.String getAfterViewDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VIEW_DATE_CHANGE, null);
	}

	public void setAfterViewDateChange(java.lang.String afterViewDateChange) {
		getStateHelper().put(AFTER_VIEW_DATE_CHANGE, afterViewDateChange);
	}

	public java.lang.String getAfterViewsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VIEWS_CHANGE, null);
	}

	public void setAfterViewsChange(java.lang.String afterViewsChange) {
		getStateHelper().put(AFTER_VIEWS_CHANGE, afterViewsChange);
	}

	public java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	public java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	public void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	public java.lang.String getOnActiveViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_VIEW_CHANGE, null);
	}

	public void setOnActiveViewChange(java.lang.String onActiveViewChange) {
		getStateHelper().put(ON_ACTIVE_VIEW_CHANGE, onActiveViewChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	public java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	public void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	public java.lang.String getOnDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATE_CHANGE, null);
	}

	public void setOnDateChange(java.lang.String onDateChange) {
		getStateHelper().put(ON_DATE_CHANGE, onDateChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	public java.lang.String getOnEventRecorderChange() {
		return (java.lang.String) getStateHelper().eval(ON_EVENT_RECORDER_CHANGE, null);
	}

	public void setOnEventRecorderChange(java.lang.String onEventRecorderChange) {
		getStateHelper().put(ON_EVENT_RECORDER_CHANGE, onEventRecorderChange);
	}

	public java.lang.String getOnFirstDayOfWeekChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIRST_DAY_OF_WEEK_CHANGE, null);
	}

	public void setOnFirstDayOfWeekChange(java.lang.String onFirstDayOfWeekChange) {
		getStateHelper().put(ON_FIRST_DAY_OF_WEEK_CHANGE, onFirstDayOfWeekChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	public java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	public void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	public java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	public void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	public void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	public java.lang.String getOnNavigationDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAVIGATION_DATE_FORMATTER_CHANGE, null);
	}

	public void setOnNavigationDateFormatterChange(java.lang.String onNavigationDateFormatterChange) {
		getStateHelper().put(ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange);
	}

	public java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	public void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	public java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	public void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	public java.lang.String getOnSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SRC_NODE_CHANGE, null);
	}

	public void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		getStateHelper().put(ON_SRC_NODE_CHANGE, onSrcNodeChange);
	}

	public java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	public void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	public java.lang.String getOnTodayDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_TODAY_DATE_CHANGE, null);
	}

	public void setOnTodayDateChange(java.lang.String onTodayDateChange) {
		getStateHelper().put(ON_TODAY_DATE_CHANGE, onTodayDateChange);
	}

	public java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	public void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

	public java.lang.String getOnViewDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_VIEW_DATE_CHANGE, null);
	}

	public void setOnViewDateChange(java.lang.String onViewDateChange) {
		getStateHelper().put(ON_VIEW_DATE_CHANGE, onViewDateChange);
	}

	public java.lang.String getOnViewsChange() {
		return (java.lang.String) getStateHelper().eval(ON_VIEWS_CHANGE, null);
	}

	public void setOnViewsChange(java.lang.String onViewsChange) {
		getStateHelper().put(ON_VIEWS_CHANGE, onViewsChange);
	}

	public java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

	public java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	public void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

}