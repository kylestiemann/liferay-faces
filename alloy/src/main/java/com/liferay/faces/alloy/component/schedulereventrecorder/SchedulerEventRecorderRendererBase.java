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

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
public abstract class SchedulerEventRecorderRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-event-recorder";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerEventRecorder schedulerEventRecorder = (SchedulerEventRecorder) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerEventRecorder = new A.SchedulerEventRecorder");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAllDay(renderedAttributes, schedulerEventRecorder);
		renderSchedulerEventRecorderClientId(renderedAttributes, schedulerEventRecorder);
		renderColor(renderedAttributes, schedulerEventRecorder);
		renderColorBrightnessFactor(renderedAttributes, schedulerEventRecorder);
		renderColorSaturationFactor(renderedAttributes, schedulerEventRecorder);
		renderContent(renderedAttributes, schedulerEventRecorder);
		renderDateFormat(renderedAttributes, schedulerEventRecorder);
		renderDestroyed(renderedAttributes, schedulerEventRecorder);
		renderDisabled(renderedAttributes, schedulerEventRecorder);
		renderDuration(renderedAttributes, schedulerEventRecorder);
		renderEndDate(renderedAttributes, schedulerEventRecorder);
		renderEvent(renderedAttributes, schedulerEventRecorder);
		renderEventClass(renderedAttributes, schedulerEventRecorder);
		renderSchedulerEventRecorderId(renderedAttributes, schedulerEventRecorder);
		renderInitialized(renderedAttributes, schedulerEventRecorder);
		renderMeeting(renderedAttributes, schedulerEventRecorder);
		renderNode(renderedAttributes, schedulerEventRecorder);
		renderPopover(renderedAttributes, schedulerEventRecorder);
		renderReminder(renderedAttributes, schedulerEventRecorder);
		renderRepeated(renderedAttributes, schedulerEventRecorder);
		renderScheduler(renderedAttributes, schedulerEventRecorder);
		renderStartDate(renderedAttributes, schedulerEventRecorder);
		renderStrings(renderedAttributes, schedulerEventRecorder);
		renderTemplate(renderedAttributes, schedulerEventRecorder);
		renderTitleDateFormat(renderedAttributes, schedulerEventRecorder);
		renderVisible(renderedAttributes, schedulerEventRecorder);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAllDayChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterClientIdChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterColorChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterColorBrightnessFactorChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterColorSaturationFactorChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterContentChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterDateFormatChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterDisabledChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterDurationChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterEndDateChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterEventChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterEventClassChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterIdChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterInitializedChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterMeetingChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterNodeChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterPopoverChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterReminderChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterRepeatedChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterSchedulerChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterStartDateChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterStringsChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterTemplateChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterTitleDateFormatChange(renderedAfterEvents, schedulerEventRecorder);
		renderAfterVisibleChange(renderedAfterEvents, schedulerEventRecorder);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnAllDayChange(renderedOnEvents, schedulerEventRecorder);
		renderOnClientIdChange(renderedOnEvents, schedulerEventRecorder);
		renderOnColorChange(renderedOnEvents, schedulerEventRecorder);
		renderOnColorBrightnessFactorChange(renderedOnEvents, schedulerEventRecorder);
		renderOnColorSaturationFactorChange(renderedOnEvents, schedulerEventRecorder);
		renderOnContentChange(renderedOnEvents, schedulerEventRecorder);
		renderOnDateFormatChange(renderedOnEvents, schedulerEventRecorder);
		renderOnDestroyedChange(renderedOnEvents, schedulerEventRecorder);
		renderOnDisabledChange(renderedOnEvents, schedulerEventRecorder);
		renderOnDurationChange(renderedOnEvents, schedulerEventRecorder);
		renderOnEndDateChange(renderedOnEvents, schedulerEventRecorder);
		renderOnEventChange(renderedOnEvents, schedulerEventRecorder);
		renderOnEventClassChange(renderedOnEvents, schedulerEventRecorder);
		renderOnIdChange(renderedOnEvents, schedulerEventRecorder);
		renderOnInitializedChange(renderedOnEvents, schedulerEventRecorder);
		renderOnMeetingChange(renderedOnEvents, schedulerEventRecorder);
		renderOnNodeChange(renderedOnEvents, schedulerEventRecorder);
		renderOnPopoverChange(renderedOnEvents, schedulerEventRecorder);
		renderOnReminderChange(renderedOnEvents, schedulerEventRecorder);
		renderOnRepeatedChange(renderedOnEvents, schedulerEventRecorder);
		renderOnSchedulerChange(renderedOnEvents, schedulerEventRecorder);
		renderOnStartDateChange(renderedOnEvents, schedulerEventRecorder);
		renderOnStringsChange(renderedOnEvents, schedulerEventRecorder);
		renderOnTemplateChange(renderedOnEvents, schedulerEventRecorder);
		renderOnTitleDateFormatChange(renderedOnEvents, schedulerEventRecorder);
		renderOnVisibleChange(renderedOnEvents, schedulerEventRecorder);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAllDay(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean allDay = schedulerEventRecorder.getAllDay();

		if (allDay != null) {
			renderedAttributes.add(renderBoolean(SchedulerEventRecorder.ALL_DAY, allDay));
		}
	}

	protected void renderSchedulerEventRecorderClientId(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String schedulerEventRecorderClientId = schedulerEventRecorder.getSchedulerEventRecorderClientId();

		if (schedulerEventRecorderClientId != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.SCHEDULER_EVENT_RECORDER_CLIENT_ID, schedulerEventRecorderClientId));
		}
	}

	protected void renderColor(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String color = schedulerEventRecorder.getColor();

		if (color != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.COLOR, color));
		}
	}

	protected void renderColorBrightnessFactor(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object colorBrightnessFactor = schedulerEventRecorder.getColorBrightnessFactor();

		if (colorBrightnessFactor != null) {
			renderedAttributes.add(renderNumber(SchedulerEventRecorder.COLOR_BRIGHTNESS_FACTOR, colorBrightnessFactor));
		}
	}

	protected void renderColorSaturationFactor(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object colorSaturationFactor = schedulerEventRecorder.getColorSaturationFactor();

		if (colorSaturationFactor != null) {
			renderedAttributes.add(renderNumber(SchedulerEventRecorder.COLOR_SATURATION_FACTOR, colorSaturationFactor));
		}
	}

	protected void renderContent(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String content = schedulerEventRecorder.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.CONTENT, content));
		}
	}

	protected void renderDateFormat(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String dateFormat = schedulerEventRecorder.getDateFormat();

		if (dateFormat != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.DATE_FORMAT, dateFormat));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean destroyed = schedulerEventRecorder.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerEventRecorder.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean disabled = schedulerEventRecorder.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerEventRecorder.DISABLED, disabled));
		}
	}

	protected void renderDuration(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object duration = schedulerEventRecorder.getDuration();

		if (duration != null) {
			renderedAttributes.add(renderNumber(SchedulerEventRecorder.DURATION, duration));
		}
	}

	protected void renderEndDate(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String endDate = schedulerEventRecorder.getEndDate();

		if (endDate != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.END_DATE, endDate));
		}
	}

	protected void renderEvent(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String event = schedulerEventRecorder.getEvent();

		if (event != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.EVENT, event));
		}
	}

	protected void renderEventClass(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String eventClass = schedulerEventRecorder.getEventClass();

		if (eventClass != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.EVENT_CLASS, eventClass));
		}
	}

	protected void renderSchedulerEventRecorderId(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object schedulerEventRecorderId = schedulerEventRecorder.getSchedulerEventRecorderId();

		if (schedulerEventRecorderId != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.SCHEDULER_EVENT_RECORDER_ID, schedulerEventRecorderId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean initialized = schedulerEventRecorder.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerEventRecorder.INITIALIZED, initialized));
		}
	}

	protected void renderMeeting(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean meeting = schedulerEventRecorder.getMeeting();

		if (meeting != null) {
			renderedAttributes.add(renderBoolean(SchedulerEventRecorder.MEETING, meeting));
		}
	}

	protected void renderNode(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String node = schedulerEventRecorder.getNode();

		if (node != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.NODE, node));
		}
	}

	protected void renderPopover(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object popover = schedulerEventRecorder.getPopover();

		if (popover != null) {
			renderedAttributes.add(renderObject(SchedulerEventRecorder.POPOVER, popover));
		}
	}

	protected void renderReminder(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean reminder = schedulerEventRecorder.getReminder();

		if (reminder != null) {
			renderedAttributes.add(renderBoolean(SchedulerEventRecorder.REMINDER, reminder));
		}
	}

	protected void renderRepeated(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean repeated = schedulerEventRecorder.getRepeated();

		if (repeated != null) {
			renderedAttributes.add(renderBoolean(SchedulerEventRecorder.REPEATED, repeated));
		}
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String scheduler = schedulerEventRecorder.getScheduler();

		if (scheduler != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.SCHEDULER, scheduler));
		}
	}

	protected void renderStartDate(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String startDate = schedulerEventRecorder.getStartDate();

		if (startDate != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.START_DATE, startDate));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object strings = schedulerEventRecorder.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(SchedulerEventRecorder.STRINGS, strings));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String template = schedulerEventRecorder.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.TEMPLATE, template));
		}
	}

	protected void renderTitleDateFormat(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object titleDateFormat = schedulerEventRecorder.getTitleDateFormat();

		if (titleDateFormat != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.TITLE_DATE_FORMAT, titleDateFormat));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean visible = schedulerEventRecorder.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerEventRecorder.VISIBLE, visible));
		}
	}

	protected void renderAfterAllDayChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterAllDayChange = schedulerEventRecorder.getAfterAllDayChange();

		if (afterAllDayChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_ALL_DAY_CHANGE, afterAllDayChange));
		}
	}

	protected void renderAfterClientIdChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterClientIdChange = schedulerEventRecorder.getAfterClientIdChange();

		if (afterClientIdChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_CLIENT_ID_CHANGE, afterClientIdChange));
		}
	}

	protected void renderAfterColorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterColorChange = schedulerEventRecorder.getAfterColorChange();

		if (afterColorChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_COLOR_CHANGE, afterColorChange));
		}
	}

	protected void renderAfterColorBrightnessFactorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterColorBrightnessFactorChange = schedulerEventRecorder.getAfterColorBrightnessFactorChange();

		if (afterColorBrightnessFactorChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE, afterColorBrightnessFactorChange));
		}
	}

	protected void renderAfterColorSaturationFactorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterColorSaturationFactorChange = schedulerEventRecorder.getAfterColorSaturationFactorChange();

		if (afterColorSaturationFactorChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_COLOR_SATURATION_FACTOR_CHANGE, afterColorSaturationFactorChange));
		}
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterContentChange = schedulerEventRecorder.getAfterContentChange();

		if (afterContentChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_CONTENT_CHANGE, afterContentChange));
		}
	}

	protected void renderAfterDateFormatChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterDateFormatChange = schedulerEventRecorder.getAfterDateFormatChange();

		if (afterDateFormatChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_DATE_FORMAT_CHANGE, afterDateFormatChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterDestroyedChange = schedulerEventRecorder.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterDisabledChange = schedulerEventRecorder.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDurationChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterDurationChange = schedulerEventRecorder.getAfterDurationChange();

		if (afterDurationChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_DURATION_CHANGE, afterDurationChange));
		}
	}

	protected void renderAfterEndDateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterEndDateChange = schedulerEventRecorder.getAfterEndDateChange();

		if (afterEndDateChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_END_DATE_CHANGE, afterEndDateChange));
		}
	}

	protected void renderAfterEventChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterEventChange = schedulerEventRecorder.getAfterEventChange();

		if (afterEventChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_EVENT_CHANGE, afterEventChange));
		}
	}

	protected void renderAfterEventClassChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterEventClassChange = schedulerEventRecorder.getAfterEventClassChange();

		if (afterEventClassChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_EVENT_CLASS_CHANGE, afterEventClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterIdChange = schedulerEventRecorder.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterInitializedChange = schedulerEventRecorder.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterMeetingChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterMeetingChange = schedulerEventRecorder.getAfterMeetingChange();

		if (afterMeetingChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_MEETING_CHANGE, afterMeetingChange));
		}
	}

	protected void renderAfterNodeChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterNodeChange = schedulerEventRecorder.getAfterNodeChange();

		if (afterNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_NODE_CHANGE, afterNodeChange));
		}
	}

	protected void renderAfterPopoverChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterPopoverChange = schedulerEventRecorder.getAfterPopoverChange();

		if (afterPopoverChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_POPOVER_CHANGE, afterPopoverChange));
		}
	}

	protected void renderAfterReminderChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterReminderChange = schedulerEventRecorder.getAfterReminderChange();

		if (afterReminderChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_REMINDER_CHANGE, afterReminderChange));
		}
	}

	protected void renderAfterRepeatedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterRepeatedChange = schedulerEventRecorder.getAfterRepeatedChange();

		if (afterRepeatedChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_REPEATED_CHANGE, afterRepeatedChange));
		}
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterSchedulerChange = schedulerEventRecorder.getAfterSchedulerChange();

		if (afterSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
		}
	}

	protected void renderAfterStartDateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterStartDateChange = schedulerEventRecorder.getAfterStartDateChange();

		if (afterStartDateChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_START_DATE_CHANGE, afterStartDateChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterStringsChange = schedulerEventRecorder.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterTemplateChange = schedulerEventRecorder.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTitleDateFormatChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterTitleDateFormatChange = schedulerEventRecorder.getAfterTitleDateFormatChange();

		if (afterTitleDateFormatChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_TITLE_DATE_FORMAT_CHANGE, afterTitleDateFormatChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterVisibleChange = schedulerEventRecorder.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderOnAllDayChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onAllDayChange = schedulerEventRecorder.getOnAllDayChange();

		if (onAllDayChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_ALL_DAY_CHANGE, onAllDayChange));
		}
	}

	protected void renderOnClientIdChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onClientIdChange = schedulerEventRecorder.getOnClientIdChange();

		if (onClientIdChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_CLIENT_ID_CHANGE, onClientIdChange));
		}
	}

	protected void renderOnColorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onColorChange = schedulerEventRecorder.getOnColorChange();

		if (onColorChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_COLOR_CHANGE, onColorChange));
		}
	}

	protected void renderOnColorBrightnessFactorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onColorBrightnessFactorChange = schedulerEventRecorder.getOnColorBrightnessFactorChange();

		if (onColorBrightnessFactorChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_COLOR_BRIGHTNESS_FACTOR_CHANGE, onColorBrightnessFactorChange));
		}
	}

	protected void renderOnColorSaturationFactorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onColorSaturationFactorChange = schedulerEventRecorder.getOnColorSaturationFactorChange();

		if (onColorSaturationFactorChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_COLOR_SATURATION_FACTOR_CHANGE, onColorSaturationFactorChange));
		}
	}

	protected void renderOnContentChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onContentChange = schedulerEventRecorder.getOnContentChange();

		if (onContentChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_CONTENT_CHANGE, onContentChange));
		}
	}

	protected void renderOnDateFormatChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onDateFormatChange = schedulerEventRecorder.getOnDateFormatChange();

		if (onDateFormatChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_DATE_FORMAT_CHANGE, onDateFormatChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onDestroyedChange = schedulerEventRecorder.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onDisabledChange = schedulerEventRecorder.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDurationChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onDurationChange = schedulerEventRecorder.getOnDurationChange();

		if (onDurationChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_DURATION_CHANGE, onDurationChange));
		}
	}

	protected void renderOnEndDateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onEndDateChange = schedulerEventRecorder.getOnEndDateChange();

		if (onEndDateChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_END_DATE_CHANGE, onEndDateChange));
		}
	}

	protected void renderOnEventChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onEventChange = schedulerEventRecorder.getOnEventChange();

		if (onEventChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_EVENT_CHANGE, onEventChange));
		}
	}

	protected void renderOnEventClassChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onEventClassChange = schedulerEventRecorder.getOnEventClassChange();

		if (onEventClassChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_EVENT_CLASS_CHANGE, onEventClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onIdChange = schedulerEventRecorder.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onInitializedChange = schedulerEventRecorder.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnMeetingChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onMeetingChange = schedulerEventRecorder.getOnMeetingChange();

		if (onMeetingChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_MEETING_CHANGE, onMeetingChange));
		}
	}

	protected void renderOnNodeChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onNodeChange = schedulerEventRecorder.getOnNodeChange();

		if (onNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_NODE_CHANGE, onNodeChange));
		}
	}

	protected void renderOnPopoverChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onPopoverChange = schedulerEventRecorder.getOnPopoverChange();

		if (onPopoverChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_POPOVER_CHANGE, onPopoverChange));
		}
	}

	protected void renderOnReminderChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onReminderChange = schedulerEventRecorder.getOnReminderChange();

		if (onReminderChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_REMINDER_CHANGE, onReminderChange));
		}
	}

	protected void renderOnRepeatedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onRepeatedChange = schedulerEventRecorder.getOnRepeatedChange();

		if (onRepeatedChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_REPEATED_CHANGE, onRepeatedChange));
		}
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onSchedulerChange = schedulerEventRecorder.getOnSchedulerChange();

		if (onSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_SCHEDULER_CHANGE, onSchedulerChange));
		}
	}

	protected void renderOnStartDateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onStartDateChange = schedulerEventRecorder.getOnStartDateChange();

		if (onStartDateChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_START_DATE_CHANGE, onStartDateChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onStringsChange = schedulerEventRecorder.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onTemplateChange = schedulerEventRecorder.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTitleDateFormatChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onTitleDateFormatChange = schedulerEventRecorder.getOnTitleDateFormatChange();

		if (onTitleDateFormatChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_TITLE_DATE_FORMAT_CHANGE, onTitleDateFormatChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onVisibleChange = schedulerEventRecorder.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerEventRecorder.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

}