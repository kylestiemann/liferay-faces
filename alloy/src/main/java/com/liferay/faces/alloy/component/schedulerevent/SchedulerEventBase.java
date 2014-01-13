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
package com.liferay.faces.alloy.component.schedulerevent;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SchedulerEventBase extends javax.faces.component.UIPanel {

	private static final String ALL_DAY = "allDay";
	private static final String COLOR = "color";
	private static final String COLOR_BRIGHTNESS_FACTOR = "colorBrightnessFactor";
	private static final String COLOR_SATURATION_FACTOR = "colorSaturationFactor";
	private static final String CONTENT = "content";
	private static final String DISABLED = "disabled";
	private static final String END_DATE = "endDate";
	private static final String MEETING = "meeting";
	private static final String NODE = "node";
	private static final String REMINDER = "reminder";
	private static final String REPEATED = "repeated";
	private static final String SCHEDULER = "scheduler";
	private static final String START_DATE = "startDate";
	private static final String TITLE_DATE_FORMAT = "titleDateFormat";
	private static final String VISIBLE = "visible";
	private static final String AFTER_ALL_DAY_CHANGE = "afterAllDayChange";
	private static final String AFTER_COLOR_CHANGE = "afterColorChange";
	private static final String AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE = "afterColorBrightnessFactorChange";
	private static final String AFTER_COLOR_SATURATION_FACTOR_CHANGE = "afterColorSaturationFactorChange";
	private static final String AFTER_CONTENT_CHANGE = "afterContentChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_END_DATE_CHANGE = "afterEndDateChange";
	private static final String AFTER_MEETING_CHANGE = "afterMeetingChange";
	private static final String AFTER_NODE_CHANGE = "afterNodeChange";
	private static final String AFTER_REMINDER_CHANGE = "afterReminderChange";
	private static final String AFTER_REPEATED_CHANGE = "afterRepeatedChange";
	private static final String AFTER_SCHEDULER_CHANGE = "afterSchedulerChange";
	private static final String AFTER_START_DATE_CHANGE = "afterStartDateChange";
	private static final String AFTER_TITLE_DATE_FORMAT_CHANGE = "afterTitleDateFormatChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String ON_ALL_DAY_CHANGE = "onAllDayChange";
	private static final String ON_COLOR_CHANGE = "onColorChange";
	private static final String ON_COLOR_BRIGHTNESS_FACTOR_CHANGE = "onColorBrightnessFactorChange";
	private static final String ON_COLOR_SATURATION_FACTOR_CHANGE = "onColorSaturationFactorChange";
	private static final String ON_CONTENT_CHANGE = "onContentChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_END_DATE_CHANGE = "onEndDateChange";
	private static final String ON_MEETING_CHANGE = "onMeetingChange";
	private static final String ON_NODE_CHANGE = "onNodeChange";
	private static final String ON_REMINDER_CHANGE = "onReminderChange";
	private static final String ON_REPEATED_CHANGE = "onRepeatedChange";
	private static final String ON_SCHEDULER_CHANGE = "onSchedulerChange";
	private static final String ON_START_DATE_CHANGE = "onStartDateChange";
	private static final String ON_TITLE_DATE_FORMAT_CHANGE = "onTitleDateFormatChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	protected java.lang.Boolean getAllDay() {
		return (java.lang.Boolean) getStateHelper().eval(ALL_DAY, null);
	}

	protected void setAllDay(java.lang.Boolean allDay) {
		getStateHelper().put(ALL_DAY, allDay);
	}

	protected java.lang.String getColor() {
		return (java.lang.String) getStateHelper().eval(COLOR, null);
	}

	protected void setColor(java.lang.String color) {
		getStateHelper().put(COLOR, color);
	}

	protected java.lang.Object getColorBrightnessFactor() {
		return (java.lang.Object) getStateHelper().eval(COLOR_BRIGHTNESS_FACTOR, null);
	}

	protected void setColorBrightnessFactor(java.lang.Object colorBrightnessFactor) {
		getStateHelper().put(COLOR_BRIGHTNESS_FACTOR, colorBrightnessFactor);
	}

	protected java.lang.Object getColorSaturationFactor() {
		return (java.lang.Object) getStateHelper().eval(COLOR_SATURATION_FACTOR, null);
	}

	protected void setColorSaturationFactor(java.lang.Object colorSaturationFactor) {
		getStateHelper().put(COLOR_SATURATION_FACTOR, colorSaturationFactor);
	}

	protected java.lang.Object getContent() {
		return (java.lang.Object) getStateHelper().eval(CONTENT, null);
	}

	protected void setContent(java.lang.Object content) {
		getStateHelper().put(CONTENT, content);
	}

	protected java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	protected void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	protected java.lang.Object getEndDate() {
		return (java.lang.Object) getStateHelper().eval(END_DATE, null);
	}

	protected void setEndDate(java.lang.Object endDate) {
		getStateHelper().put(END_DATE, endDate);
	}

	protected java.lang.Boolean getMeeting() {
		return (java.lang.Boolean) getStateHelper().eval(MEETING, null);
	}

	protected void setMeeting(java.lang.Boolean meeting) {
		getStateHelper().put(MEETING, meeting);
	}

	protected java.lang.Object getNode() {
		return (java.lang.Object) getStateHelper().eval(NODE, null);
	}

	protected void setNode(java.lang.Object node) {
		getStateHelper().put(NODE, node);
	}

	protected java.lang.Boolean getReminder() {
		return (java.lang.Boolean) getStateHelper().eval(REMINDER, null);
	}

	protected void setReminder(java.lang.Boolean reminder) {
		getStateHelper().put(REMINDER, reminder);
	}

	protected java.lang.Boolean getRepeated() {
		return (java.lang.Boolean) getStateHelper().eval(REPEATED, null);
	}

	protected void setRepeated(java.lang.Boolean repeated) {
		getStateHelper().put(REPEATED, repeated);
	}

	protected java.lang.Object getScheduler() {
		return (java.lang.Object) getStateHelper().eval(SCHEDULER, null);
	}

	protected void setScheduler(java.lang.Object scheduler) {
		getStateHelper().put(SCHEDULER, scheduler);
	}

	protected java.lang.Object getStartDate() {
		return (java.lang.Object) getStateHelper().eval(START_DATE, null);
	}

	protected void setStartDate(java.lang.Object startDate) {
		getStateHelper().put(START_DATE, startDate);
	}

	protected java.lang.Object getTitleDateFormat() {
		return (java.lang.Object) getStateHelper().eval(TITLE_DATE_FORMAT, null);
	}

	protected void setTitleDateFormat(java.lang.Object titleDateFormat) {
		getStateHelper().put(TITLE_DATE_FORMAT, titleDateFormat);
	}

	protected java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	protected void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	protected java.lang.String getAfterAllDayChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALL_DAY_CHANGE, null);
	}

	protected void setAfterAllDayChange(java.lang.String afterAllDayChange) {
		getStateHelper().put(AFTER_ALL_DAY_CHANGE, afterAllDayChange);
	}

	protected java.lang.String getAfterColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_CHANGE, null);
	}

	protected void setAfterColorChange(java.lang.String afterColorChange) {
		getStateHelper().put(AFTER_COLOR_CHANGE, afterColorChange);
	}

	protected java.lang.String getAfterColorBrightnessFactorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE, null);
	}

	protected void setAfterColorBrightnessFactorChange(java.lang.String afterColorBrightnessFactorChange) {
		getStateHelper().put(AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE, afterColorBrightnessFactorChange);
	}

	protected java.lang.String getAfterColorSaturationFactorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_SATURATION_FACTOR_CHANGE, null);
	}

	protected void setAfterColorSaturationFactorChange(java.lang.String afterColorSaturationFactorChange) {
		getStateHelper().put(AFTER_COLOR_SATURATION_FACTOR_CHANGE, afterColorSaturationFactorChange);
	}

	protected java.lang.String getAfterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_CHANGE, null);
	}

	protected void setAfterContentChange(java.lang.String afterContentChange) {
		getStateHelper().put(AFTER_CONTENT_CHANGE, afterContentChange);
	}

	protected java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	protected void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	protected java.lang.String getAfterEndDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_END_DATE_CHANGE, null);
	}

	protected void setAfterEndDateChange(java.lang.String afterEndDateChange) {
		getStateHelper().put(AFTER_END_DATE_CHANGE, afterEndDateChange);
	}

	protected java.lang.String getAfterMeetingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MEETING_CHANGE, null);
	}

	protected void setAfterMeetingChange(java.lang.String afterMeetingChange) {
		getStateHelper().put(AFTER_MEETING_CHANGE, afterMeetingChange);
	}

	protected java.lang.String getAfterNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_CHANGE, null);
	}

	protected void setAfterNodeChange(java.lang.String afterNodeChange) {
		getStateHelper().put(AFTER_NODE_CHANGE, afterNodeChange);
	}

	protected java.lang.String getAfterReminderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REMINDER_CHANGE, null);
	}

	protected void setAfterReminderChange(java.lang.String afterReminderChange) {
		getStateHelper().put(AFTER_REMINDER_CHANGE, afterReminderChange);
	}

	protected java.lang.String getAfterRepeatedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REPEATED_CHANGE, null);
	}

	protected void setAfterRepeatedChange(java.lang.String afterRepeatedChange) {
		getStateHelper().put(AFTER_REPEATED_CHANGE, afterRepeatedChange);
	}

	protected java.lang.String getAfterSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCHEDULER_CHANGE, null);
	}

	protected void setAfterSchedulerChange(java.lang.String afterSchedulerChange) {
		getStateHelper().put(AFTER_SCHEDULER_CHANGE, afterSchedulerChange);
	}

	protected java.lang.String getAfterStartDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_START_DATE_CHANGE, null);
	}

	protected void setAfterStartDateChange(java.lang.String afterStartDateChange) {
		getStateHelper().put(AFTER_START_DATE_CHANGE, afterStartDateChange);
	}

	protected java.lang.String getAfterTitleDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TITLE_DATE_FORMAT_CHANGE, null);
	}

	protected void setAfterTitleDateFormatChange(java.lang.String afterTitleDateFormatChange) {
		getStateHelper().put(AFTER_TITLE_DATE_FORMAT_CHANGE, afterTitleDateFormatChange);
	}

	protected java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	protected void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	protected java.lang.String getOnAllDayChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALL_DAY_CHANGE, null);
	}

	protected void setOnAllDayChange(java.lang.String onAllDayChange) {
		getStateHelper().put(ON_ALL_DAY_CHANGE, onAllDayChange);
	}

	protected java.lang.String getOnColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_CHANGE, null);
	}

	protected void setOnColorChange(java.lang.String onColorChange) {
		getStateHelper().put(ON_COLOR_CHANGE, onColorChange);
	}

	protected java.lang.String getOnColorBrightnessFactorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_BRIGHTNESS_FACTOR_CHANGE, null);
	}

	protected void setOnColorBrightnessFactorChange(java.lang.String onColorBrightnessFactorChange) {
		getStateHelper().put(ON_COLOR_BRIGHTNESS_FACTOR_CHANGE, onColorBrightnessFactorChange);
	}

	protected java.lang.String getOnColorSaturationFactorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_SATURATION_FACTOR_CHANGE, null);
	}

	protected void setOnColorSaturationFactorChange(java.lang.String onColorSaturationFactorChange) {
		getStateHelper().put(ON_COLOR_SATURATION_FACTOR_CHANGE, onColorSaturationFactorChange);
	}

	protected java.lang.String getOnContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_CHANGE, null);
	}

	protected void setOnContentChange(java.lang.String onContentChange) {
		getStateHelper().put(ON_CONTENT_CHANGE, onContentChange);
	}

	protected java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	protected void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	protected java.lang.String getOnEndDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_END_DATE_CHANGE, null);
	}

	protected void setOnEndDateChange(java.lang.String onEndDateChange) {
		getStateHelper().put(ON_END_DATE_CHANGE, onEndDateChange);
	}

	protected java.lang.String getOnMeetingChange() {
		return (java.lang.String) getStateHelper().eval(ON_MEETING_CHANGE, null);
	}

	protected void setOnMeetingChange(java.lang.String onMeetingChange) {
		getStateHelper().put(ON_MEETING_CHANGE, onMeetingChange);
	}

	protected java.lang.String getOnNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_CHANGE, null);
	}

	protected void setOnNodeChange(java.lang.String onNodeChange) {
		getStateHelper().put(ON_NODE_CHANGE, onNodeChange);
	}

	protected java.lang.String getOnReminderChange() {
		return (java.lang.String) getStateHelper().eval(ON_REMINDER_CHANGE, null);
	}

	protected void setOnReminderChange(java.lang.String onReminderChange) {
		getStateHelper().put(ON_REMINDER_CHANGE, onReminderChange);
	}

	protected java.lang.String getOnRepeatedChange() {
		return (java.lang.String) getStateHelper().eval(ON_REPEATED_CHANGE, null);
	}

	protected void setOnRepeatedChange(java.lang.String onRepeatedChange) {
		getStateHelper().put(ON_REPEATED_CHANGE, onRepeatedChange);
	}

	protected java.lang.String getOnSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCHEDULER_CHANGE, null);
	}

	protected void setOnSchedulerChange(java.lang.String onSchedulerChange) {
		getStateHelper().put(ON_SCHEDULER_CHANGE, onSchedulerChange);
	}

	protected java.lang.String getOnStartDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_START_DATE_CHANGE, null);
	}

	protected void setOnStartDateChange(java.lang.String onStartDateChange) {
		getStateHelper().put(ON_START_DATE_CHANGE, onStartDateChange);
	}

	protected java.lang.String getOnTitleDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(ON_TITLE_DATE_FORMAT_CHANGE, null);
	}

	protected void setOnTitleDateFormatChange(java.lang.String onTitleDateFormatChange) {
		getStateHelper().put(ON_TITLE_DATE_FORMAT_CHANGE, onTitleDateFormatChange);
	}

	protected java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	protected void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

}