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
package com.liferay.faces.alloy.component.schedulereventrecorder;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SchedulerEventRecorderBase extends javax.faces.component.UIPanel {

	private static final String ALL_DAY = "allDay";
	private static final String SCHEDULEREVENTRECORDER_CLIENT_ID = "schedulereventrecorderClientId";
	private static final String COLOR = "color";
	private static final String COLOR_BRIGHTNESS_FACTOR = "colorBrightnessFactor";
	private static final String COLOR_SATURATION_FACTOR = "colorSaturationFactor";
	private static final String CONTENT = "content";
	private static final String DATE_FORMAT = "dateFormat";
	private static final String DESTROYED = "destroyed";
	private static final String DISABLED = "disabled";
	private static final String DURATION = "duration";
	private static final String END_DATE = "endDate";
	private static final String EVENT = "event";
	private static final String EVENT_CLASS = "eventClass";
	private static final String SCHEDULEREVENTRECORDER_ID = "schedulereventrecorderId";
	private static final String INITIALIZED = "initialized";
	private static final String MEETING = "meeting";
	private static final String NODE = "node";
	private static final String POPOVER = "popover";
	private static final String REMINDER = "reminder";
	private static final String REPEATED = "repeated";
	private static final String SCHEDULER = "scheduler";
	private static final String START_DATE = "startDate";
	private static final String STRINGS = "strings";
	private static final String TEMPLATE = "template";
	private static final String TITLE_DATE_FORMAT = "titleDateFormat";
	private static final String VISIBLE = "visible";
	private static final String AFTER_ALL_DAY_CHANGE = "afterAllDayChange";
	private static final String AFTER_CLIENT_ID_CHANGE = "afterClientIdChange";
	private static final String AFTER_COLOR_CHANGE = "afterColorChange";
	private static final String AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE = "afterColorBrightnessFactorChange";
	private static final String AFTER_COLOR_SATURATION_FACTOR_CHANGE = "afterColorSaturationFactorChange";
	private static final String AFTER_CONTENT_CHANGE = "afterContentChange";
	private static final String AFTER_DATE_FORMAT_CHANGE = "afterDateFormatChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_DURATION_CHANGE = "afterDurationChange";
	private static final String AFTER_END_DATE_CHANGE = "afterEndDateChange";
	private static final String AFTER_EVENT_CHANGE = "afterEventChange";
	private static final String AFTER_EVENT_CLASS_CHANGE = "afterEventClassChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_MEETING_CHANGE = "afterMeetingChange";
	private static final String AFTER_NODE_CHANGE = "afterNodeChange";
	private static final String AFTER_POPOVER_CHANGE = "afterPopoverChange";
	private static final String AFTER_REMINDER_CHANGE = "afterReminderChange";
	private static final String AFTER_REPEATED_CHANGE = "afterRepeatedChange";
	private static final String AFTER_SCHEDULER_CHANGE = "afterSchedulerChange";
	private static final String AFTER_START_DATE_CHANGE = "afterStartDateChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TEMPLATE_CHANGE = "afterTemplateChange";
	private static final String AFTER_TITLE_DATE_FORMAT_CHANGE = "afterTitleDateFormatChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String ON_ALL_DAY_CHANGE = "onAllDayChange";
	private static final String ON_CLIENT_ID_CHANGE = "onClientIdChange";
	private static final String ON_COLOR_CHANGE = "onColorChange";
	private static final String ON_COLOR_BRIGHTNESS_FACTOR_CHANGE = "onColorBrightnessFactorChange";
	private static final String ON_COLOR_SATURATION_FACTOR_CHANGE = "onColorSaturationFactorChange";
	private static final String ON_CONTENT_CHANGE = "onContentChange";
	private static final String ON_DATE_FORMAT_CHANGE = "onDateFormatChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_DURATION_CHANGE = "onDurationChange";
	private static final String ON_END_DATE_CHANGE = "onEndDateChange";
	private static final String ON_EVENT_CHANGE = "onEventChange";
	private static final String ON_EVENT_CLASS_CHANGE = "onEventClassChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_MEETING_CHANGE = "onMeetingChange";
	private static final String ON_NODE_CHANGE = "onNodeChange";
	private static final String ON_POPOVER_CHANGE = "onPopoverChange";
	private static final String ON_REMINDER_CHANGE = "onReminderChange";
	private static final String ON_REPEATED_CHANGE = "onRepeatedChange";
	private static final String ON_SCHEDULER_CHANGE = "onSchedulerChange";
	private static final String ON_START_DATE_CHANGE = "onStartDateChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TEMPLATE_CHANGE = "onTemplateChange";
	private static final String ON_TITLE_DATE_FORMAT_CHANGE = "onTitleDateFormatChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	public java.lang.Boolean getAllDay() {
		return (java.lang.Boolean) getStateHelper().eval(ALL_DAY, null);
	}

	public void setAllDay(java.lang.Boolean allDay) {
		getStateHelper().put(ALL_DAY, allDay);
	}

	public java.lang.String getSchedulereventrecorderClientId() {
		return (java.lang.String) getStateHelper().eval(SCHEDULEREVENTRECORDER_CLIENT_ID, null);
	}

	public void setSchedulereventrecorderClientId(java.lang.String schedulereventrecorderClientId) {
		getStateHelper().put(SCHEDULEREVENTRECORDER_CLIENT_ID, schedulereventrecorderClientId);
	}

	public java.lang.String getColor() {
		return (java.lang.String) getStateHelper().eval(COLOR, null);
	}

	public void setColor(java.lang.String color) {
		getStateHelper().put(COLOR, color);
	}

	public java.lang.Object getColorBrightnessFactor() {
		return (java.lang.Object) getStateHelper().eval(COLOR_BRIGHTNESS_FACTOR, null);
	}

	public void setColorBrightnessFactor(java.lang.Object colorBrightnessFactor) {
		getStateHelper().put(COLOR_BRIGHTNESS_FACTOR, colorBrightnessFactor);
	}

	public java.lang.Object getColorSaturationFactor() {
		return (java.lang.Object) getStateHelper().eval(COLOR_SATURATION_FACTOR, null);
	}

	public void setColorSaturationFactor(java.lang.Object colorSaturationFactor) {
		getStateHelper().put(COLOR_SATURATION_FACTOR, colorSaturationFactor);
	}

	public java.lang.String getContent() {
		return (java.lang.String) getStateHelper().eval(CONTENT, null);
	}

	public void setContent(java.lang.String content) {
		getStateHelper().put(CONTENT, content);
	}

	public java.lang.String getDateFormat() {
		return (java.lang.String) getStateHelper().eval(DATE_FORMAT, null);
	}

	public void setDateFormat(java.lang.String dateFormat) {
		getStateHelper().put(DATE_FORMAT, dateFormat);
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

	public java.lang.Object getDuration() {
		return (java.lang.Object) getStateHelper().eval(DURATION, null);
	}

	public void setDuration(java.lang.Object duration) {
		getStateHelper().put(DURATION, duration);
	}

	public java.lang.String getEndDate() {
		return (java.lang.String) getStateHelper().eval(END_DATE, null);
	}

	public void setEndDate(java.lang.String endDate) {
		getStateHelper().put(END_DATE, endDate);
	}

	public java.lang.String getEvent() {
		return (java.lang.String) getStateHelper().eval(EVENT, null);
	}

	public void setEvent(java.lang.String event) {
		getStateHelper().put(EVENT, event);
	}

	public java.lang.String getEventClass() {
		return (java.lang.String) getStateHelper().eval(EVENT_CLASS, null);
	}

	public void setEventClass(java.lang.String eventClass) {
		getStateHelper().put(EVENT_CLASS, eventClass);
	}

	public java.lang.Object getSchedulereventrecorderId() {
		return (java.lang.Object) getStateHelper().eval(SCHEDULEREVENTRECORDER_ID, null);
	}

	public void setSchedulereventrecorderId(java.lang.Object schedulereventrecorderId) {
		getStateHelper().put(SCHEDULEREVENTRECORDER_ID, schedulereventrecorderId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Boolean getMeeting() {
		return (java.lang.Boolean) getStateHelper().eval(MEETING, null);
	}

	public void setMeeting(java.lang.Boolean meeting) {
		getStateHelper().put(MEETING, meeting);
	}

	public java.lang.String getNode() {
		return (java.lang.String) getStateHelper().eval(NODE, null);
	}

	public void setNode(java.lang.String node) {
		getStateHelper().put(NODE, node);
	}

	public java.lang.Object getPopover() {
		return (java.lang.Object) getStateHelper().eval(POPOVER, null);
	}

	public void setPopover(java.lang.Object popover) {
		getStateHelper().put(POPOVER, popover);
	}

	public java.lang.Boolean getReminder() {
		return (java.lang.Boolean) getStateHelper().eval(REMINDER, null);
	}

	public void setReminder(java.lang.Boolean reminder) {
		getStateHelper().put(REMINDER, reminder);
	}

	public java.lang.Boolean getRepeated() {
		return (java.lang.Boolean) getStateHelper().eval(REPEATED, null);
	}

	public void setRepeated(java.lang.Boolean repeated) {
		getStateHelper().put(REPEATED, repeated);
	}

	public java.lang.String getScheduler() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER, null);
	}

	public void setScheduler(java.lang.String scheduler) {
		getStateHelper().put(SCHEDULER, scheduler);
	}

	public java.lang.String getStartDate() {
		return (java.lang.String) getStateHelper().eval(START_DATE, null);
	}

	public void setStartDate(java.lang.String startDate) {
		getStateHelper().put(START_DATE, startDate);
	}

	public java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	public void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	public java.lang.String getTemplate() {
		return (java.lang.String) getStateHelper().eval(TEMPLATE, null);
	}

	public void setTemplate(java.lang.String template) {
		getStateHelper().put(TEMPLATE, template);
	}

	public java.lang.Object getTitleDateFormat() {
		return (java.lang.Object) getStateHelper().eval(TITLE_DATE_FORMAT, null);
	}

	public void setTitleDateFormat(java.lang.Object titleDateFormat) {
		getStateHelper().put(TITLE_DATE_FORMAT, titleDateFormat);
	}

	public java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	public void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	public java.lang.String getAfterAllDayChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALL_DAY_CHANGE, null);
	}

	public void setAfterAllDayChange(java.lang.String afterAllDayChange) {
		getStateHelper().put(AFTER_ALL_DAY_CHANGE, afterAllDayChange);
	}

	public java.lang.String getAfterClientIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CLIENT_ID_CHANGE, null);
	}

	public void setAfterClientIdChange(java.lang.String afterClientIdChange) {
		getStateHelper().put(AFTER_CLIENT_ID_CHANGE, afterClientIdChange);
	}

	public java.lang.String getAfterColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_CHANGE, null);
	}

	public void setAfterColorChange(java.lang.String afterColorChange) {
		getStateHelper().put(AFTER_COLOR_CHANGE, afterColorChange);
	}

	public java.lang.String getAfterColorBrightnessFactorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE, null);
	}

	public void setAfterColorBrightnessFactorChange(java.lang.String afterColorBrightnessFactorChange) {
		getStateHelper().put(AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE, afterColorBrightnessFactorChange);
	}

	public java.lang.String getAfterColorSaturationFactorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_SATURATION_FACTOR_CHANGE, null);
	}

	public void setAfterColorSaturationFactorChange(java.lang.String afterColorSaturationFactorChange) {
		getStateHelper().put(AFTER_COLOR_SATURATION_FACTOR_CHANGE, afterColorSaturationFactorChange);
	}

	public java.lang.String getAfterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_CHANGE, null);
	}

	public void setAfterContentChange(java.lang.String afterContentChange) {
		getStateHelper().put(AFTER_CONTENT_CHANGE, afterContentChange);
	}

	public java.lang.String getAfterDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATE_FORMAT_CHANGE, null);
	}

	public void setAfterDateFormatChange(java.lang.String afterDateFormatChange) {
		getStateHelper().put(AFTER_DATE_FORMAT_CHANGE, afterDateFormatChange);
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

	public java.lang.String getAfterDurationChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DURATION_CHANGE, null);
	}

	public void setAfterDurationChange(java.lang.String afterDurationChange) {
		getStateHelper().put(AFTER_DURATION_CHANGE, afterDurationChange);
	}

	public java.lang.String getAfterEndDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_END_DATE_CHANGE, null);
	}

	public void setAfterEndDateChange(java.lang.String afterEndDateChange) {
		getStateHelper().put(AFTER_END_DATE_CHANGE, afterEndDateChange);
	}

	public java.lang.String getAfterEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EVENT_CHANGE, null);
	}

	public void setAfterEventChange(java.lang.String afterEventChange) {
		getStateHelper().put(AFTER_EVENT_CHANGE, afterEventChange);
	}

	public java.lang.String getAfterEventClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EVENT_CLASS_CHANGE, null);
	}

	public void setAfterEventClassChange(java.lang.String afterEventClassChange) {
		getStateHelper().put(AFTER_EVENT_CLASS_CHANGE, afterEventClassChange);
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

	public java.lang.String getAfterMeetingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MEETING_CHANGE, null);
	}

	public void setAfterMeetingChange(java.lang.String afterMeetingChange) {
		getStateHelper().put(AFTER_MEETING_CHANGE, afterMeetingChange);
	}

	public java.lang.String getAfterNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_CHANGE, null);
	}

	public void setAfterNodeChange(java.lang.String afterNodeChange) {
		getStateHelper().put(AFTER_NODE_CHANGE, afterNodeChange);
	}

	public java.lang.String getAfterPopoverChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POPOVER_CHANGE, null);
	}

	public void setAfterPopoverChange(java.lang.String afterPopoverChange) {
		getStateHelper().put(AFTER_POPOVER_CHANGE, afterPopoverChange);
	}

	public java.lang.String getAfterReminderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REMINDER_CHANGE, null);
	}

	public void setAfterReminderChange(java.lang.String afterReminderChange) {
		getStateHelper().put(AFTER_REMINDER_CHANGE, afterReminderChange);
	}

	public java.lang.String getAfterRepeatedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REPEATED_CHANGE, null);
	}

	public void setAfterRepeatedChange(java.lang.String afterRepeatedChange) {
		getStateHelper().put(AFTER_REPEATED_CHANGE, afterRepeatedChange);
	}

	public java.lang.String getAfterSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCHEDULER_CHANGE, null);
	}

	public void setAfterSchedulerChange(java.lang.String afterSchedulerChange) {
		getStateHelper().put(AFTER_SCHEDULER_CHANGE, afterSchedulerChange);
	}

	public java.lang.String getAfterStartDateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_START_DATE_CHANGE, null);
	}

	public void setAfterStartDateChange(java.lang.String afterStartDateChange) {
		getStateHelper().put(AFTER_START_DATE_CHANGE, afterStartDateChange);
	}

	public java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	public void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	public java.lang.String getAfterTemplateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TEMPLATE_CHANGE, null);
	}

	public void setAfterTemplateChange(java.lang.String afterTemplateChange) {
		getStateHelper().put(AFTER_TEMPLATE_CHANGE, afterTemplateChange);
	}

	public java.lang.String getAfterTitleDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TITLE_DATE_FORMAT_CHANGE, null);
	}

	public void setAfterTitleDateFormatChange(java.lang.String afterTitleDateFormatChange) {
		getStateHelper().put(AFTER_TITLE_DATE_FORMAT_CHANGE, afterTitleDateFormatChange);
	}

	public java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	public java.lang.String getOnAllDayChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALL_DAY_CHANGE, null);
	}

	public void setOnAllDayChange(java.lang.String onAllDayChange) {
		getStateHelper().put(ON_ALL_DAY_CHANGE, onAllDayChange);
	}

	public java.lang.String getOnClientIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_CLIENT_ID_CHANGE, null);
	}

	public void setOnClientIdChange(java.lang.String onClientIdChange) {
		getStateHelper().put(ON_CLIENT_ID_CHANGE, onClientIdChange);
	}

	public java.lang.String getOnColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_CHANGE, null);
	}

	public void setOnColorChange(java.lang.String onColorChange) {
		getStateHelper().put(ON_COLOR_CHANGE, onColorChange);
	}

	public java.lang.String getOnColorBrightnessFactorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_BRIGHTNESS_FACTOR_CHANGE, null);
	}

	public void setOnColorBrightnessFactorChange(java.lang.String onColorBrightnessFactorChange) {
		getStateHelper().put(ON_COLOR_BRIGHTNESS_FACTOR_CHANGE, onColorBrightnessFactorChange);
	}

	public java.lang.String getOnColorSaturationFactorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_SATURATION_FACTOR_CHANGE, null);
	}

	public void setOnColorSaturationFactorChange(java.lang.String onColorSaturationFactorChange) {
		getStateHelper().put(ON_COLOR_SATURATION_FACTOR_CHANGE, onColorSaturationFactorChange);
	}

	public java.lang.String getOnContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_CHANGE, null);
	}

	public void setOnContentChange(java.lang.String onContentChange) {
		getStateHelper().put(ON_CONTENT_CHANGE, onContentChange);
	}

	public java.lang.String getOnDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATE_FORMAT_CHANGE, null);
	}

	public void setOnDateFormatChange(java.lang.String onDateFormatChange) {
		getStateHelper().put(ON_DATE_FORMAT_CHANGE, onDateFormatChange);
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

	public java.lang.String getOnDurationChange() {
		return (java.lang.String) getStateHelper().eval(ON_DURATION_CHANGE, null);
	}

	public void setOnDurationChange(java.lang.String onDurationChange) {
		getStateHelper().put(ON_DURATION_CHANGE, onDurationChange);
	}

	public java.lang.String getOnEndDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_END_DATE_CHANGE, null);
	}

	public void setOnEndDateChange(java.lang.String onEndDateChange) {
		getStateHelper().put(ON_END_DATE_CHANGE, onEndDateChange);
	}

	public java.lang.String getOnEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_EVENT_CHANGE, null);
	}

	public void setOnEventChange(java.lang.String onEventChange) {
		getStateHelper().put(ON_EVENT_CHANGE, onEventChange);
	}

	public java.lang.String getOnEventClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_EVENT_CLASS_CHANGE, null);
	}

	public void setOnEventClassChange(java.lang.String onEventClassChange) {
		getStateHelper().put(ON_EVENT_CLASS_CHANGE, onEventClassChange);
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

	public java.lang.String getOnMeetingChange() {
		return (java.lang.String) getStateHelper().eval(ON_MEETING_CHANGE, null);
	}

	public void setOnMeetingChange(java.lang.String onMeetingChange) {
		getStateHelper().put(ON_MEETING_CHANGE, onMeetingChange);
	}

	public java.lang.String getOnNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_CHANGE, null);
	}

	public void setOnNodeChange(java.lang.String onNodeChange) {
		getStateHelper().put(ON_NODE_CHANGE, onNodeChange);
	}

	public java.lang.String getOnPopoverChange() {
		return (java.lang.String) getStateHelper().eval(ON_POPOVER_CHANGE, null);
	}

	public void setOnPopoverChange(java.lang.String onPopoverChange) {
		getStateHelper().put(ON_POPOVER_CHANGE, onPopoverChange);
	}

	public java.lang.String getOnReminderChange() {
		return (java.lang.String) getStateHelper().eval(ON_REMINDER_CHANGE, null);
	}

	public void setOnReminderChange(java.lang.String onReminderChange) {
		getStateHelper().put(ON_REMINDER_CHANGE, onReminderChange);
	}

	public java.lang.String getOnRepeatedChange() {
		return (java.lang.String) getStateHelper().eval(ON_REPEATED_CHANGE, null);
	}

	public void setOnRepeatedChange(java.lang.String onRepeatedChange) {
		getStateHelper().put(ON_REPEATED_CHANGE, onRepeatedChange);
	}

	public java.lang.String getOnSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCHEDULER_CHANGE, null);
	}

	public void setOnSchedulerChange(java.lang.String onSchedulerChange) {
		getStateHelper().put(ON_SCHEDULER_CHANGE, onSchedulerChange);
	}

	public java.lang.String getOnStartDateChange() {
		return (java.lang.String) getStateHelper().eval(ON_START_DATE_CHANGE, null);
	}

	public void setOnStartDateChange(java.lang.String onStartDateChange) {
		getStateHelper().put(ON_START_DATE_CHANGE, onStartDateChange);
	}

	public java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	public void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	public java.lang.String getOnTemplateChange() {
		return (java.lang.String) getStateHelper().eval(ON_TEMPLATE_CHANGE, null);
	}

	public void setOnTemplateChange(java.lang.String onTemplateChange) {
		getStateHelper().put(ON_TEMPLATE_CHANGE, onTemplateChange);
	}

	public java.lang.String getOnTitleDateFormatChange() {
		return (java.lang.String) getStateHelper().eval(ON_TITLE_DATE_FORMAT_CHANGE, null);
	}

	public void setOnTitleDateFormatChange(java.lang.String onTitleDateFormatChange) {
		getStateHelper().put(ON_TITLE_DATE_FORMAT_CHANGE, onTitleDateFormatChange);
	}

	public java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

}