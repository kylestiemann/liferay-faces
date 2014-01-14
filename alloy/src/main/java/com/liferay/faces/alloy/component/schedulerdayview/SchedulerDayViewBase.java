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
package com.liferay.faces.alloy.component.schedulerdayview;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SchedulerDayViewBase extends javax.faces.component.UIPanel {

	private static final String SCHEDULERDAYVIEW_BODY_CONTENT = "schedulerdayviewBodyContent";
	private static final String COL_DAYS_NODE = "colDaysNode";
	private static final String COL_HEADER_DAYS_NODE = "colHeaderDaysNode";
	private static final String CSS_CLASS = "cssClass";
	private static final String DAYS = "days";
	private static final String DELEGATE_CONFIG = "delegateConfig";
	private static final String EVENT_WIDTH = "eventWidth";
	private static final String FILTER_FN = "filterFn";
	private static final String HEADER_DATE_FORMATTER = "headerDateFormatter";
	private static final String HEADER_TABLE_NODE = "headerTableNode";
	private static final String HEADER_VIEW = "headerView";
	private static final String HEADER_VIEW_CONFIG = "headerViewConfig";
	private static final String HEADER_VIEW_LABEL_NODE = "headerViewLabelNode";
	private static final String HEIGHT = "height";
	private static final String HIDE_CLASS = "hideClass";
	private static final String HOUR_HEIGHT = "hourHeight";
	private static final String ISO_TIME = "isoTime";
	private static final String MARKERCELLS_NODE = "markercellsNode";
	private static final String NAME = "name";
	private static final String NAVIGATION_DATE_FORMATTER = "navigationDateFormatter";
	private static final String NEXT_DATE = "nextDate";
	private static final String PREV_DATE = "prevDate";
	private static final String RENDER = "render";
	private static final String RESIZER_NODE = "resizerNode";
	private static final String SCHEDULER = "scheduler";
	private static final String SCROLLABLE = "scrollable";
	private static final String STRINGS = "strings";
	private static final String TABLE_NODE = "tableNode";
	private static final String TIMES_NODE = "timesNode";
	private static final String TRIGGER_NODE = "triggerNode";
	private static final String USE_ARIA = "useARIA";
	private static final String VISIBLE = "visible";
	private static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	private static final String AFTER_COL_DAYS_NODE_CHANGE = "afterColDaysNodeChange";
	private static final String AFTER_COL_HEADER_DAYS_NODE_CHANGE = "afterColHeaderDaysNodeChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_DAYS_CHANGE = "afterDaysChange";
	private static final String AFTER_DELEGATE_CONFIG_CHANGE = "afterDelegateConfigChange";
	private static final String AFTER_EVENT_WIDTH_CHANGE = "afterEventWidthChange";
	private static final String AFTER_FILTER_FN_CHANGE = "afterFilterFnChange";
	private static final String AFTER_HEADER_DATE_FORMATTER_CHANGE = "afterHeaderDateFormatterChange";
	private static final String AFTER_HEADER_TABLE_NODE_CHANGE = "afterHeaderTableNodeChange";
	private static final String AFTER_HEADER_VIEW_CHANGE = "afterHeaderViewChange";
	private static final String AFTER_HEADER_VIEW_CONFIG_CHANGE = "afterHeaderViewConfigChange";
	private static final String AFTER_HEADER_VIEW_LABEL_NODE_CHANGE = "afterHeaderViewLabelNodeChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_HOUR_HEIGHT_CHANGE = "afterHourHeightChange";
	private static final String AFTER_ISO_TIME_CHANGE = "afterIsoTimeChange";
	private static final String AFTER_MARKERCELLS_NODE_CHANGE = "afterMarkercellsNodeChange";
	private static final String AFTER_NAME_CHANGE = "afterNameChange";
	private static final String AFTER_NAVIGATION_DATE_FORMATTER_CHANGE = "afterNavigationDateFormatterChange";
	private static final String AFTER_NEXT_DATE_CHANGE = "afterNextDateChange";
	private static final String AFTER_PREV_DATE_CHANGE = "afterPrevDateChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_RESIZER_NODE_CHANGE = "afterResizerNodeChange";
	private static final String AFTER_SCHEDULER_CHANGE = "afterSchedulerChange";
	private static final String AFTER_SCROLLABLE_CHANGE = "afterScrollableChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TABLE_NODE_CHANGE = "afterTableNodeChange";
	private static final String AFTER_TIMES_NODE_CHANGE = "afterTimesNodeChange";
	private static final String AFTER_TRIGGER_NODE_CHANGE = "afterTriggerNodeChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	private static final String ON_COL_DAYS_NODE_CHANGE = "onColDaysNodeChange";
	private static final String ON_COL_HEADER_DAYS_NODE_CHANGE = "onColHeaderDaysNodeChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_DAYS_CHANGE = "onDaysChange";
	private static final String ON_DELEGATE_CONFIG_CHANGE = "onDelegateConfigChange";
	private static final String ON_EVENT_WIDTH_CHANGE = "onEventWidthChange";
	private static final String ON_FILTER_FN_CHANGE = "onFilterFnChange";
	private static final String ON_HEADER_DATE_FORMATTER_CHANGE = "onHeaderDateFormatterChange";
	private static final String ON_HEADER_TABLE_NODE_CHANGE = "onHeaderTableNodeChange";
	private static final String ON_HEADER_VIEW_CHANGE = "onHeaderViewChange";
	private static final String ON_HEADER_VIEW_CONFIG_CHANGE = "onHeaderViewConfigChange";
	private static final String ON_HEADER_VIEW_LABEL_NODE_CHANGE = "onHeaderViewLabelNodeChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_HOUR_HEIGHT_CHANGE = "onHourHeightChange";
	private static final String ON_ISO_TIME_CHANGE = "onIsoTimeChange";
	private static final String ON_MARKERCELLS_NODE_CHANGE = "onMarkercellsNodeChange";
	private static final String ON_NAME_CHANGE = "onNameChange";
	private static final String ON_NAVIGATION_DATE_FORMATTER_CHANGE = "onNavigationDateFormatterChange";
	private static final String ON_NEXT_DATE_CHANGE = "onNextDateChange";
	private static final String ON_PREV_DATE_CHANGE = "onPrevDateChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_RESIZER_NODE_CHANGE = "onResizerNodeChange";
	private static final String ON_SCHEDULER_CHANGE = "onSchedulerChange";
	private static final String ON_SCROLLABLE_CHANGE = "onScrollableChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TABLE_NODE_CHANGE = "onTableNodeChange";
	private static final String ON_TIMES_NODE_CHANGE = "onTimesNodeChange";
	private static final String ON_TRIGGER_NODE_CHANGE = "onTriggerNodeChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	protected java.lang.String getSchedulerdayviewBodyContent() {
		return (java.lang.String) getStateHelper().eval(SCHEDULERDAYVIEW_BODY_CONTENT, null);
	}

	protected void setSchedulerdayviewBodyContent(java.lang.String schedulerdayviewBodyContent) {
		getStateHelper().put(SCHEDULERDAYVIEW_BODY_CONTENT, schedulerdayviewBodyContent);
	}

	protected java.lang.String getColDaysNode() {
		return (java.lang.String) getStateHelper().eval(COL_DAYS_NODE, null);
	}

	protected void setColDaysNode(java.lang.String colDaysNode) {
		getStateHelper().put(COL_DAYS_NODE, colDaysNode);
	}

	protected java.lang.String getColHeaderDaysNode() {
		return (java.lang.String) getStateHelper().eval(COL_HEADER_DAYS_NODE, null);
	}

	protected void setColHeaderDaysNode(java.lang.String colHeaderDaysNode) {
		getStateHelper().put(COL_HEADER_DAYS_NODE, colHeaderDaysNode);
	}

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Object getDays() {
		return (java.lang.Object) getStateHelper().eval(DAYS, null);
	}

	protected void setDays(java.lang.Object days) {
		getStateHelper().put(DAYS, days);
	}

	protected java.lang.Object getDelegateConfig() {
		return (java.lang.Object) getStateHelper().eval(DELEGATE_CONFIG, null);
	}

	protected void setDelegateConfig(java.lang.Object delegateConfig) {
		getStateHelper().put(DELEGATE_CONFIG, delegateConfig);
	}

	protected java.lang.Object getEventWidth() {
		return (java.lang.Object) getStateHelper().eval(EVENT_WIDTH, null);
	}

	protected void setEventWidth(java.lang.Object eventWidth) {
		getStateHelper().put(EVENT_WIDTH, eventWidth);
	}

	protected java.lang.String getFilterFn() {
		return (java.lang.String) getStateHelper().eval(FILTER_FN, null);
	}

	protected void setFilterFn(java.lang.String filterFn) {
		getStateHelper().put(FILTER_FN, filterFn);
	}

	protected java.lang.String getHeaderDateFormatter() {
		return (java.lang.String) getStateHelper().eval(HEADER_DATE_FORMATTER, null);
	}

	protected void setHeaderDateFormatter(java.lang.String headerDateFormatter) {
		getStateHelper().put(HEADER_DATE_FORMATTER, headerDateFormatter);
	}

	protected java.lang.String getHeaderTableNode() {
		return (java.lang.String) getStateHelper().eval(HEADER_TABLE_NODE, null);
	}

	protected void setHeaderTableNode(java.lang.String headerTableNode) {
		getStateHelper().put(HEADER_TABLE_NODE, headerTableNode);
	}

	protected java.lang.Boolean getHeaderView() {
		return (java.lang.Boolean) getStateHelper().eval(HEADER_VIEW, null);
	}

	protected void setHeaderView(java.lang.Boolean headerView) {
		getStateHelper().put(HEADER_VIEW, headerView);
	}

	protected java.lang.Object getHeaderViewConfig() {
		return (java.lang.Object) getStateHelper().eval(HEADER_VIEW_CONFIG, null);
	}

	protected void setHeaderViewConfig(java.lang.Object headerViewConfig) {
		getStateHelper().put(HEADER_VIEW_CONFIG, headerViewConfig);
	}

	protected java.lang.String getHeaderViewLabelNode() {
		return (java.lang.String) getStateHelper().eval(HEADER_VIEW_LABEL_NODE, null);
	}

	protected void setHeaderViewLabelNode(java.lang.String headerViewLabelNode) {
		getStateHelper().put(HEADER_VIEW_LABEL_NODE, headerViewLabelNode);
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

	protected java.lang.Object getHourHeight() {
		return (java.lang.Object) getStateHelper().eval(HOUR_HEIGHT, null);
	}

	protected void setHourHeight(java.lang.Object hourHeight) {
		getStateHelper().put(HOUR_HEIGHT, hourHeight);
	}

	protected java.lang.Boolean getIsoTime() {
		return (java.lang.Boolean) getStateHelper().eval(ISO_TIME, null);
	}

	protected void setIsoTime(java.lang.Boolean isoTime) {
		getStateHelper().put(ISO_TIME, isoTime);
	}

	protected java.lang.String getMarkercellsNode() {
		return (java.lang.String) getStateHelper().eval(MARKERCELLS_NODE, null);
	}

	protected void setMarkercellsNode(java.lang.String markercellsNode) {
		getStateHelper().put(MARKERCELLS_NODE, markercellsNode);
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

	protected java.lang.String getNextDate() {
		return (java.lang.String) getStateHelper().eval(NEXT_DATE, null);
	}

	protected void setNextDate(java.lang.String nextDate) {
		getStateHelper().put(NEXT_DATE, nextDate);
	}

	protected java.lang.String getPrevDate() {
		return (java.lang.String) getStateHelper().eval(PREV_DATE, null);
	}

	protected void setPrevDate(java.lang.String prevDate) {
		getStateHelper().put(PREV_DATE, prevDate);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.String getResizerNode() {
		return (java.lang.String) getStateHelper().eval(RESIZER_NODE, null);
	}

	protected void setResizerNode(java.lang.String resizerNode) {
		getStateHelper().put(RESIZER_NODE, resizerNode);
	}

	protected java.lang.String getScheduler() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER, null);
	}

	protected void setScheduler(java.lang.String scheduler) {
		getStateHelper().put(SCHEDULER, scheduler);
	}

	protected java.lang.Boolean getScrollable() {
		return (java.lang.Boolean) getStateHelper().eval(SCROLLABLE, null);
	}

	protected void setScrollable(java.lang.Boolean scrollable) {
		getStateHelper().put(SCROLLABLE, scrollable);
	}

	protected java.lang.String getStrings() {
		return (java.lang.String) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.String strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.String getTableNode() {
		return (java.lang.String) getStateHelper().eval(TABLE_NODE, null);
	}

	protected void setTableNode(java.lang.String tableNode) {
		getStateHelper().put(TABLE_NODE, tableNode);
	}

	protected java.lang.String getTimesNode() {
		return (java.lang.String) getStateHelper().eval(TIMES_NODE, null);
	}

	protected void setTimesNode(java.lang.String timesNode) {
		getStateHelper().put(TIMES_NODE, timesNode);
	}

	protected java.lang.String getTriggerNode() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_NODE, null);
	}

	protected void setTriggerNode(java.lang.String triggerNode) {
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

	protected java.lang.String getAfterColDaysNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COL_DAYS_NODE_CHANGE, null);
	}

	protected void setAfterColDaysNodeChange(java.lang.String afterColDaysNodeChange) {
		getStateHelper().put(AFTER_COL_DAYS_NODE_CHANGE, afterColDaysNodeChange);
	}

	protected java.lang.String getAfterColHeaderDaysNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COL_HEADER_DAYS_NODE_CHANGE, null);
	}

	protected void setAfterColHeaderDaysNodeChange(java.lang.String afterColHeaderDaysNodeChange) {
		getStateHelper().put(AFTER_COL_HEADER_DAYS_NODE_CHANGE, afterColHeaderDaysNodeChange);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterDaysChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DAYS_CHANGE, null);
	}

	protected void setAfterDaysChange(java.lang.String afterDaysChange) {
		getStateHelper().put(AFTER_DAYS_CHANGE, afterDaysChange);
	}

	protected java.lang.String getAfterDelegateConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DELEGATE_CONFIG_CHANGE, null);
	}

	protected void setAfterDelegateConfigChange(java.lang.String afterDelegateConfigChange) {
		getStateHelper().put(AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange);
	}

	protected java.lang.String getAfterEventWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EVENT_WIDTH_CHANGE, null);
	}

	protected void setAfterEventWidthChange(java.lang.String afterEventWidthChange) {
		getStateHelper().put(AFTER_EVENT_WIDTH_CHANGE, afterEventWidthChange);
	}

	protected java.lang.String getAfterFilterFnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILTER_FN_CHANGE, null);
	}

	protected void setAfterFilterFnChange(java.lang.String afterFilterFnChange) {
		getStateHelper().put(AFTER_FILTER_FN_CHANGE, afterFilterFnChange);
	}

	protected java.lang.String getAfterHeaderDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_DATE_FORMATTER_CHANGE, null);
	}

	protected void setAfterHeaderDateFormatterChange(java.lang.String afterHeaderDateFormatterChange) {
		getStateHelper().put(AFTER_HEADER_DATE_FORMATTER_CHANGE, afterHeaderDateFormatterChange);
	}

	protected java.lang.String getAfterHeaderTableNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_TABLE_NODE_CHANGE, null);
	}

	protected void setAfterHeaderTableNodeChange(java.lang.String afterHeaderTableNodeChange) {
		getStateHelper().put(AFTER_HEADER_TABLE_NODE_CHANGE, afterHeaderTableNodeChange);
	}

	protected java.lang.String getAfterHeaderViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_VIEW_CHANGE, null);
	}

	protected void setAfterHeaderViewChange(java.lang.String afterHeaderViewChange) {
		getStateHelper().put(AFTER_HEADER_VIEW_CHANGE, afterHeaderViewChange);
	}

	protected java.lang.String getAfterHeaderViewConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_VIEW_CONFIG_CHANGE, null);
	}

	protected void setAfterHeaderViewConfigChange(java.lang.String afterHeaderViewConfigChange) {
		getStateHelper().put(AFTER_HEADER_VIEW_CONFIG_CHANGE, afterHeaderViewConfigChange);
	}

	protected java.lang.String getAfterHeaderViewLabelNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_VIEW_LABEL_NODE_CHANGE, null);
	}

	protected void setAfterHeaderViewLabelNodeChange(java.lang.String afterHeaderViewLabelNodeChange) {
		getStateHelper().put(AFTER_HEADER_VIEW_LABEL_NODE_CHANGE, afterHeaderViewLabelNodeChange);
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

	protected java.lang.String getAfterHourHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HOUR_HEIGHT_CHANGE, null);
	}

	protected void setAfterHourHeightChange(java.lang.String afterHourHeightChange) {
		getStateHelper().put(AFTER_HOUR_HEIGHT_CHANGE, afterHourHeightChange);
	}

	protected java.lang.String getAfterIsoTimeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ISO_TIME_CHANGE, null);
	}

	protected void setAfterIsoTimeChange(java.lang.String afterIsoTimeChange) {
		getStateHelper().put(AFTER_ISO_TIME_CHANGE, afterIsoTimeChange);
	}

	protected java.lang.String getAfterMarkercellsNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MARKERCELLS_NODE_CHANGE, null);
	}

	protected void setAfterMarkercellsNodeChange(java.lang.String afterMarkercellsNodeChange) {
		getStateHelper().put(AFTER_MARKERCELLS_NODE_CHANGE, afterMarkercellsNodeChange);
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

	protected java.lang.String getAfterResizerNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESIZER_NODE_CHANGE, null);
	}

	protected void setAfterResizerNodeChange(java.lang.String afterResizerNodeChange) {
		getStateHelper().put(AFTER_RESIZER_NODE_CHANGE, afterResizerNodeChange);
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

	protected java.lang.String getAfterTableNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TABLE_NODE_CHANGE, null);
	}

	protected void setAfterTableNodeChange(java.lang.String afterTableNodeChange) {
		getStateHelper().put(AFTER_TABLE_NODE_CHANGE, afterTableNodeChange);
	}

	protected java.lang.String getAfterTimesNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TIMES_NODE_CHANGE, null);
	}

	protected void setAfterTimesNodeChange(java.lang.String afterTimesNodeChange) {
		getStateHelper().put(AFTER_TIMES_NODE_CHANGE, afterTimesNodeChange);
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

	protected java.lang.String getOnColDaysNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_COL_DAYS_NODE_CHANGE, null);
	}

	protected void setOnColDaysNodeChange(java.lang.String onColDaysNodeChange) {
		getStateHelper().put(ON_COL_DAYS_NODE_CHANGE, onColDaysNodeChange);
	}

	protected java.lang.String getOnColHeaderDaysNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_COL_HEADER_DAYS_NODE_CHANGE, null);
	}

	protected void setOnColHeaderDaysNodeChange(java.lang.String onColHeaderDaysNodeChange) {
		getStateHelper().put(ON_COL_HEADER_DAYS_NODE_CHANGE, onColHeaderDaysNodeChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnDaysChange() {
		return (java.lang.String) getStateHelper().eval(ON_DAYS_CHANGE, null);
	}

	protected void setOnDaysChange(java.lang.String onDaysChange) {
		getStateHelper().put(ON_DAYS_CHANGE, onDaysChange);
	}

	protected java.lang.String getOnDelegateConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_DELEGATE_CONFIG_CHANGE, null);
	}

	protected void setOnDelegateConfigChange(java.lang.String onDelegateConfigChange) {
		getStateHelper().put(ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange);
	}

	protected java.lang.String getOnEventWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_EVENT_WIDTH_CHANGE, null);
	}

	protected void setOnEventWidthChange(java.lang.String onEventWidthChange) {
		getStateHelper().put(ON_EVENT_WIDTH_CHANGE, onEventWidthChange);
	}

	protected java.lang.String getOnFilterFnChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILTER_FN_CHANGE, null);
	}

	protected void setOnFilterFnChange(java.lang.String onFilterFnChange) {
		getStateHelper().put(ON_FILTER_FN_CHANGE, onFilterFnChange);
	}

	protected java.lang.String getOnHeaderDateFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_DATE_FORMATTER_CHANGE, null);
	}

	protected void setOnHeaderDateFormatterChange(java.lang.String onHeaderDateFormatterChange) {
		getStateHelper().put(ON_HEADER_DATE_FORMATTER_CHANGE, onHeaderDateFormatterChange);
	}

	protected java.lang.String getOnHeaderTableNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_TABLE_NODE_CHANGE, null);
	}

	protected void setOnHeaderTableNodeChange(java.lang.String onHeaderTableNodeChange) {
		getStateHelper().put(ON_HEADER_TABLE_NODE_CHANGE, onHeaderTableNodeChange);
	}

	protected java.lang.String getOnHeaderViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_VIEW_CHANGE, null);
	}

	protected void setOnHeaderViewChange(java.lang.String onHeaderViewChange) {
		getStateHelper().put(ON_HEADER_VIEW_CHANGE, onHeaderViewChange);
	}

	protected java.lang.String getOnHeaderViewConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_VIEW_CONFIG_CHANGE, null);
	}

	protected void setOnHeaderViewConfigChange(java.lang.String onHeaderViewConfigChange) {
		getStateHelper().put(ON_HEADER_VIEW_CONFIG_CHANGE, onHeaderViewConfigChange);
	}

	protected java.lang.String getOnHeaderViewLabelNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_VIEW_LABEL_NODE_CHANGE, null);
	}

	protected void setOnHeaderViewLabelNodeChange(java.lang.String onHeaderViewLabelNodeChange) {
		getStateHelper().put(ON_HEADER_VIEW_LABEL_NODE_CHANGE, onHeaderViewLabelNodeChange);
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

	protected java.lang.String getOnHourHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HOUR_HEIGHT_CHANGE, null);
	}

	protected void setOnHourHeightChange(java.lang.String onHourHeightChange) {
		getStateHelper().put(ON_HOUR_HEIGHT_CHANGE, onHourHeightChange);
	}

	protected java.lang.String getOnIsoTimeChange() {
		return (java.lang.String) getStateHelper().eval(ON_ISO_TIME_CHANGE, null);
	}

	protected void setOnIsoTimeChange(java.lang.String onIsoTimeChange) {
		getStateHelper().put(ON_ISO_TIME_CHANGE, onIsoTimeChange);
	}

	protected java.lang.String getOnMarkercellsNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_MARKERCELLS_NODE_CHANGE, null);
	}

	protected void setOnMarkercellsNodeChange(java.lang.String onMarkercellsNodeChange) {
		getStateHelper().put(ON_MARKERCELLS_NODE_CHANGE, onMarkercellsNodeChange);
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

	protected java.lang.String getOnResizerNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESIZER_NODE_CHANGE, null);
	}

	protected void setOnResizerNodeChange(java.lang.String onResizerNodeChange) {
		getStateHelper().put(ON_RESIZER_NODE_CHANGE, onResizerNodeChange);
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

	protected java.lang.String getOnTableNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TABLE_NODE_CHANGE, null);
	}

	protected void setOnTableNodeChange(java.lang.String onTableNodeChange) {
		getStateHelper().put(ON_TABLE_NODE_CHANGE, onTableNodeChange);
	}

	protected java.lang.String getOnTimesNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TIMES_NODE_CHANGE, null);
	}

	protected void setOnTimesNodeChange(java.lang.String onTimesNodeChange) {
		getStateHelper().put(ON_TIMES_NODE_CHANGE, onTimesNodeChange);
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