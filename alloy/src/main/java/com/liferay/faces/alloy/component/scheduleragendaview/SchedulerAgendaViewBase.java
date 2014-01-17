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

	public static final String SCHEDULER_AGENDA_VIEW_BODY_CONTENT = "bodyContent";
	public static final String BOUNDING_BOX = "boundingBox";
	public static final String CONTENT_BOX = "contentBox";
	public static final String CSS_CLASS = "cssClass";
	public static final String DESTROYED = "destroyed";
	public static final String DISABLED = "disabled";
	public static final String EVENTS_DATE_FORMATTER = "eventsDateFormatter";
	public static final String FILTER_FN = "filterFn";
	public static final String FOCUSED = "focused";
	public static final String HEADER_DAY_DATE_FORMATTER = "headerDayDateFormatter";
	public static final String HEADER_EXTRA_DATE_FORMATTER = "headerExtraDateFormatter";
	public static final String HEIGHT = "height";
	public static final String HIDE_CLASS = "hideClass";
	public static final String SCHEDULER_AGENDA_VIEW_ID = "id";
	public static final String INFO_DAY_DATE_FORMATTER = "infoDayDateFormatter";
	public static final String INFO_LABEL_BIG_DATE_FORMATTER = "infoLabelBigDateFormatter";
	public static final String INFO_LABEL_SMALL_DATE_FORMATTER = "infoLabelSmallDateFormatter";
	public static final String INITIALIZED = "initialized";
	public static final String ISO_TIME = "isoTime";
	public static final String SCHEDULER_AGENDA_VIEW_LOCALE = "locale";
	public static final String NAME = "name";
	public static final String NAVIGATION_DATE_FORMATTER = "navigationDateFormatter";
	public static final String NEXT_DATE = "nextDate";
	public static final String PREV_DATE = "prevDate";
	public static final String RENDER = "render";
	public static final String RENDERED = "rendered";
	public static final String SCHEDULER = "scheduler";
	public static final String SCROLLABLE = "scrollable";
	public static final String SRC_NODE = "srcNode";
	public static final String STRINGS = "strings";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TRIGGER_NODE = "triggerNode";
	public static final String USE_ARIA = "useARIA";
	public static final String VISIBLE = "visible";
	public static final String WIDTH = "width";
	public static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_EVENTS_DATE_FORMATTER_CHANGE = "afterEventsDateFormatterChange";
	public static final String AFTER_FILTER_FN_CHANGE = "afterFilterFnChange";
	public static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	public static final String AFTER_HEADER_DAY_DATE_FORMATTER_CHANGE = "afterHeaderDayDateFormatterChange";
	public static final String AFTER_HEADER_EXTRA_DATE_FORMATTER_CHANGE = "afterHeaderExtraDateFormatterChange";
	public static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	public static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_INFO_DAY_DATE_FORMATTER_CHANGE = "afterInfoDayDateFormatterChange";
	public static final String AFTER_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE = "afterInfoLabelBigDateFormatterChange";
	public static final String AFTER_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE = "afterInfoLabelSmallDateFormatterChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_ISO_TIME_CHANGE = "afterIsoTimeChange";
	public static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	public static final String AFTER_NAME_CHANGE = "afterNameChange";
	public static final String AFTER_NAVIGATION_DATE_FORMATTER_CHANGE = "afterNavigationDateFormatterChange";
	public static final String AFTER_NEXT_DATE_CHANGE = "afterNextDateChange";
	public static final String AFTER_PREV_DATE_CHANGE = "afterPrevDateChange";
	public static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_SCHEDULER_CHANGE = "afterSchedulerChange";
	public static final String AFTER_SCROLLABLE_CHANGE = "afterScrollableChange";
	public static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TRIGGER_NODE_CHANGE = "afterTriggerNodeChange";
	public static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	public static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_EVENTS_DATE_FORMATTER_CHANGE = "onEventsDateFormatterChange";
	public static final String ON_FILTER_FN_CHANGE = "onFilterFnChange";
	public static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	public static final String ON_HEADER_DAY_DATE_FORMATTER_CHANGE = "onHeaderDayDateFormatterChange";
	public static final String ON_HEADER_EXTRA_DATE_FORMATTER_CHANGE = "onHeaderExtraDateFormatterChange";
	public static final String ON_HEIGHT_CHANGE = "onHeightChange";
	public static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_INFO_DAY_DATE_FORMATTER_CHANGE = "onInfoDayDateFormatterChange";
	public static final String ON_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE = "onInfoLabelBigDateFormatterChange";
	public static final String ON_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE = "onInfoLabelSmallDateFormatterChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_ISO_TIME_CHANGE = "onIsoTimeChange";
	public static final String ON_LOCALE_CHANGE = "onLocaleChange";
	public static final String ON_NAME_CHANGE = "onNameChange";
	public static final String ON_NAVIGATION_DATE_FORMATTER_CHANGE = "onNavigationDateFormatterChange";
	public static final String ON_NEXT_DATE_CHANGE = "onNextDateChange";
	public static final String ON_PREV_DATE_CHANGE = "onPrevDateChange";
	public static final String ON_RENDER_CHANGE = "onRenderChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_SCHEDULER_CHANGE = "onSchedulerChange";
	public static final String ON_SCROLLABLE_CHANGE = "onScrollableChange";
	public static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TRIGGER_NODE_CHANGE = "onTriggerNodeChange";
	public static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	public static final String ON_WIDTH_CHANGE = "onWidthChange";

	public java.lang.String getSchedulerAgendaViewBodyContent() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER_AGENDA_VIEW_BODY_CONTENT, null);
	}

	public void setSchedulerAgendaViewBodyContent(java.lang.String schedulerAgendaViewBodyContent) {
		getStateHelper().put(SCHEDULER_AGENDA_VIEW_BODY_CONTENT, schedulerAgendaViewBodyContent);
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

	public java.lang.Object getEventsDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(EVENTS_DATE_FORMATTER, null);
	}

	public void setEventsDateFormatter(java.lang.Object eventsDateFormatter) {
		getStateHelper().put(EVENTS_DATE_FORMATTER, eventsDateFormatter);
	}

	public java.lang.String getFilterFn() {
		return (java.lang.String) getStateHelper().eval(FILTER_FN, null);
	}

	public void setFilterFn(java.lang.String filterFn) {
		getStateHelper().put(FILTER_FN, filterFn);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.Object getHeaderDayDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(HEADER_DAY_DATE_FORMATTER, null);
	}

	public void setHeaderDayDateFormatter(java.lang.Object headerDayDateFormatter) {
		getStateHelper().put(HEADER_DAY_DATE_FORMATTER, headerDayDateFormatter);
	}

	public java.lang.Object getHeaderExtraDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(HEADER_EXTRA_DATE_FORMATTER, null);
	}

	public void setHeaderExtraDateFormatter(java.lang.Object headerExtraDateFormatter) {
		getStateHelper().put(HEADER_EXTRA_DATE_FORMATTER, headerExtraDateFormatter);
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

	public java.lang.String getSchedulerAgendaViewId() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER_AGENDA_VIEW_ID, null);
	}

	public void setSchedulerAgendaViewId(java.lang.String schedulerAgendaViewId) {
		getStateHelper().put(SCHEDULER_AGENDA_VIEW_ID, schedulerAgendaViewId);
	}

	public java.lang.Object getInfoDayDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(INFO_DAY_DATE_FORMATTER, null);
	}

	public void setInfoDayDateFormatter(java.lang.Object infoDayDateFormatter) {
		getStateHelper().put(INFO_DAY_DATE_FORMATTER, infoDayDateFormatter);
	}

	public java.lang.Object getInfoLabelBigDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(INFO_LABEL_BIG_DATE_FORMATTER, null);
	}

	public void setInfoLabelBigDateFormatter(java.lang.Object infoLabelBigDateFormatter) {
		getStateHelper().put(INFO_LABEL_BIG_DATE_FORMATTER, infoLabelBigDateFormatter);
	}

	public java.lang.Object getInfoLabelSmallDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(INFO_LABEL_SMALL_DATE_FORMATTER, null);
	}

	public void setInfoLabelSmallDateFormatter(java.lang.Object infoLabelSmallDateFormatter) {
		getStateHelper().put(INFO_LABEL_SMALL_DATE_FORMATTER, infoLabelSmallDateFormatter);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Boolean getIsoTime() {
		return (java.lang.Boolean) getStateHelper().eval(ISO_TIME, null);
	}

	public void setIsoTime(java.lang.Boolean isoTime) {
		getStateHelper().put(ISO_TIME, isoTime);
	}

	public java.lang.String getSchedulerAgendaViewLocale() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER_AGENDA_VIEW_LOCALE, null);
	}

	public void setSchedulerAgendaViewLocale(java.lang.String schedulerAgendaViewLocale) {
		getStateHelper().put(SCHEDULER_AGENDA_VIEW_LOCALE, schedulerAgendaViewLocale);
	}

	public java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	public void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	public java.lang.Object getNavigationDateFormatter() {
		return (java.lang.Object) getStateHelper().eval(NAVIGATION_DATE_FORMATTER, null);
	}

	public void setNavigationDateFormatter(java.lang.Object navigationDateFormatter) {
		getStateHelper().put(NAVIGATION_DATE_FORMATTER, navigationDateFormatter);
	}

	public java.lang.String getNextDate() {
		return (java.lang.String) getStateHelper().eval(NEXT_DATE, null);
	}

	public void setNextDate(java.lang.String nextDate) {
		getStateHelper().put(NEXT_DATE, nextDate);
	}

	public java.lang.String getPrevDate() {
		return (java.lang.String) getStateHelper().eval(PREV_DATE, null);
	}

	public void setPrevDate(java.lang.String prevDate) {
		getStateHelper().put(PREV_DATE, prevDate);
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

	public java.lang.String getScheduler() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER, null);
	}

	public void setScheduler(java.lang.String scheduler) {
		getStateHelper().put(SCHEDULER, scheduler);
	}

	public java.lang.Boolean getScrollable() {
		return (java.lang.Boolean) getStateHelper().eval(SCROLLABLE, null);
	}

	public void setScrollable(java.lang.Boolean scrollable) {
		getStateHelper().put(SCROLLABLE, scrollable);
	}

	public java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	public void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
	}

	public java.lang.String getStrings() {
		return (java.lang.String) getStateHelper().eval(STRINGS, null);
	}

	public void setStrings(java.lang.String strings) {
		getStateHelper().put(STRINGS, strings);
	}

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.String getTriggerNode() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_NODE, null);
	}

	public void setTriggerNode(java.lang.String triggerNode) {
		getStateHelper().put(TRIGGER_NODE, triggerNode);
	}

	public java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	public void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
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

	public java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	public void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
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

	public java.lang.String getAfterEventsDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EVENTS_DATE_FORMATTER_CHANGE, null);
	}

	public void setAfterEventsDateFormatterChange(java.lang.String afterEventsDateFormatterChange) {
		getStateHelper().put(AFTER_EVENTS_DATE_FORMATTER_CHANGE, afterEventsDateFormatterChange);
	}

	public java.lang.String getAfterFilterFnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILTER_FN_CHANGE, null);
	}

	public void setAfterFilterFnChange(java.lang.String afterFilterFnChange) {
		getStateHelper().put(AFTER_FILTER_FN_CHANGE, afterFilterFnChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterHeaderDayDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_DAY_DATE_FORMATTER_CHANGE, null);
	}

	public void setAfterHeaderDayDateFormatterChange(java.lang.String afterHeaderDayDateFormatterChange) {
		getStateHelper().put(AFTER_HEADER_DAY_DATE_FORMATTER_CHANGE, afterHeaderDayDateFormatterChange);
	}

	public java.lang.String getAfterHeaderExtraDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_EXTRA_DATE_FORMATTER_CHANGE, null);
	}

	public void setAfterHeaderExtraDateFormatterChange(java.lang.String afterHeaderExtraDateFormatterChange) {
		getStateHelper().put(AFTER_HEADER_EXTRA_DATE_FORMATTER_CHANGE, afterHeaderExtraDateFormatterChange);
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

	public java.lang.String getAfterInfoDayDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_DAY_DATE_FORMATTER_CHANGE, null);
	}

	public void setAfterInfoDayDateFormatterChange(java.lang.String afterInfoDayDateFormatterChange) {
		getStateHelper().put(AFTER_INFO_DAY_DATE_FORMATTER_CHANGE, afterInfoDayDateFormatterChange);
	}

	public java.lang.String getAfterInfoLabelBigDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, null);
	}

	public void setAfterInfoLabelBigDateFormatterChange(java.lang.String afterInfoLabelBigDateFormatterChange) {
		getStateHelper().put(AFTER_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, afterInfoLabelBigDateFormatterChange);
	}

	public java.lang.String getAfterInfoLabelSmallDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, null);
	}

	public void setAfterInfoLabelSmallDateFormatterChange(java.lang.String afterInfoLabelSmallDateFormatterChange) {
		getStateHelper().put(AFTER_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, afterInfoLabelSmallDateFormatterChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterIsoTimeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ISO_TIME_CHANGE, null);
	}

	public void setAfterIsoTimeChange(java.lang.String afterIsoTimeChange) {
		getStateHelper().put(AFTER_ISO_TIME_CHANGE, afterIsoTimeChange);
	}

	public java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	public void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	public java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	public void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	public java.lang.String getAfterNavigationDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, null);
	}

	public void setAfterNavigationDateFormatterChange(java.lang.String afterNavigationDateFormatterChange) {
		getStateHelper().put(AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange);
	}

	public java.lang.String getAfterNextDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NEXT_DATE_CHANGE, null);
	}

	public void setAfterNextDateChange(java.lang.String afterNextDateChange) {
		getStateHelper().put(AFTER_NEXT_DATE_CHANGE, afterNextDateChange);
	}

	public java.lang.String getAfterPrevDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREV_DATE_CHANGE, null);
	}

	public void setAfterPrevDateChange(java.lang.String afterPrevDateChange) {
		getStateHelper().put(AFTER_PREV_DATE_CHANGE, afterPrevDateChange);
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

	public java.lang.String getAfterSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCHEDULER_CHANGE, null);
	}

	public void setAfterSchedulerChange(java.lang.String afterSchedulerChange) {
		getStateHelper().put(AFTER_SCHEDULER_CHANGE, afterSchedulerChange);
	}

	public java.lang.String getAfterScrollableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCROLLABLE_CHANGE, null);
	}

	public void setAfterScrollableChange(java.lang.String afterScrollableChange) {
		getStateHelper().put(AFTER_SCROLLABLE_CHANGE, afterScrollableChange);
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

	public java.lang.String getAfterTriggerNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_NODE_CHANGE, null);
	}

	public void setAfterTriggerNodeChange(java.lang.String afterTriggerNodeChange) {
		getStateHelper().put(AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange);
	}

	public java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	public void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
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

	public java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	public void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
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

	public java.lang.String getOnEventsDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_EVENTS_DATE_FORMATTER_CHANGE, null);
	}

	public void setOnEventsDateFormatterChange(java.lang.String onEventsDateFormatterChange) {
		getStateHelper().put(ON_EVENTS_DATE_FORMATTER_CHANGE, onEventsDateFormatterChange);
	}

	public java.lang.String getOnFilterFnChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILTER_FN_CHANGE, null);
	}

	public void setOnFilterFnChange(java.lang.String onFilterFnChange) {
		getStateHelper().put(ON_FILTER_FN_CHANGE, onFilterFnChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnHeaderDayDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_DAY_DATE_FORMATTER_CHANGE, null);
	}

	public void setOnHeaderDayDateFormatterChange(java.lang.String onHeaderDayDateFormatterChange) {
		getStateHelper().put(ON_HEADER_DAY_DATE_FORMATTER_CHANGE, onHeaderDayDateFormatterChange);
	}

	public java.lang.String getOnHeaderExtraDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_EXTRA_DATE_FORMATTER_CHANGE, null);
	}

	public void setOnHeaderExtraDateFormatterChange(java.lang.String onHeaderExtraDateFormatterChange) {
		getStateHelper().put(ON_HEADER_EXTRA_DATE_FORMATTER_CHANGE, onHeaderExtraDateFormatterChange);
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

	public java.lang.String getOnInfoDayDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_DAY_DATE_FORMATTER_CHANGE, null);
	}

	public void setOnInfoDayDateFormatterChange(java.lang.String onInfoDayDateFormatterChange) {
		getStateHelper().put(ON_INFO_DAY_DATE_FORMATTER_CHANGE, onInfoDayDateFormatterChange);
	}

	public java.lang.String getOnInfoLabelBigDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, null);
	}

	public void setOnInfoLabelBigDateFormatterChange(java.lang.String onInfoLabelBigDateFormatterChange) {
		getStateHelper().put(ON_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, onInfoLabelBigDateFormatterChange);
	}

	public java.lang.String getOnInfoLabelSmallDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, null);
	}

	public void setOnInfoLabelSmallDateFormatterChange(java.lang.String onInfoLabelSmallDateFormatterChange) {
		getStateHelper().put(ON_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, onInfoLabelSmallDateFormatterChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnIsoTimeChange() {
		return (java.lang.String) getStateHelper().eval(ON_ISO_TIME_CHANGE, null);
	}

	public void setOnIsoTimeChange(java.lang.String onIsoTimeChange) {
		getStateHelper().put(ON_ISO_TIME_CHANGE, onIsoTimeChange);
	}

	public java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	public void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	public java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	public void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	public java.lang.String getOnNavigationDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAVIGATION_DATE_FORMATTER_CHANGE, null);
	}

	public void setOnNavigationDateFormatterChange(java.lang.String onNavigationDateFormatterChange) {
		getStateHelper().put(ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange);
	}

	public java.lang.String getOnNextDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_NEXT_DATE_CHANGE, null);
	}

	public void setOnNextDateChange(java.lang.String onNextDateChange) {
		getStateHelper().put(ON_NEXT_DATE_CHANGE, onNextDateChange);
	}

	public java.lang.String getOnPrevDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREV_DATE_CHANGE, null);
	}

	public void setOnPrevDateChange(java.lang.String onPrevDateChange) {
		getStateHelper().put(ON_PREV_DATE_CHANGE, onPrevDateChange);
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

	public java.lang.String getOnSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCHEDULER_CHANGE, null);
	}

	public void setOnSchedulerChange(java.lang.String onSchedulerChange) {
		getStateHelper().put(ON_SCHEDULER_CHANGE, onSchedulerChange);
	}

	public java.lang.String getOnScrollableChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCROLLABLE_CHANGE, null);
	}

	public void setOnScrollableChange(java.lang.String onScrollableChange) {
		getStateHelper().put(ON_SCROLLABLE_CHANGE, onScrollableChange);
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

	public java.lang.String getOnTriggerNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_NODE_CHANGE, null);
	}

	public void setOnTriggerNodeChange(java.lang.String onTriggerNodeChange) {
		getStateHelper().put(ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange);
	}

	public java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	public void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
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