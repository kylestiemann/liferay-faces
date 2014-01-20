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

		if (schedulerEventRecorder.getAllDay() != null) {
			renderAllDay(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getSchedulerEventRecorderClientId() != null) {
			renderSchedulerEventRecorderClientId(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getColor() != null) {
			renderColor(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getColorBrightnessFactor() != null) {
			renderColorBrightnessFactor(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getColorSaturationFactor() != null) {
			renderColorSaturationFactor(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getContent() != null) {
			renderContent(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getDateFormat() != null) {
			renderDateFormat(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getDisabled() != null) {
			renderDisabled(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getDuration() != null) {
			renderDuration(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getEndDate() != null) {
			renderEndDate(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getEvent() != null) {
			renderEvent(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getEventClass() != null) {
			renderEventClass(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getSchedulerEventRecorderId() != null) {
			renderSchedulerEventRecorderId(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getInitialized() != null) {
			renderInitialized(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getMeeting() != null) {
			renderMeeting(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getNode() != null) {
			renderNode(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getPopover() != null) {
			renderPopover(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getReminder() != null) {
			renderReminder(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getRepeated() != null) {
			renderRepeated(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getScheduler() != null) {
			renderScheduler(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getStartDate() != null) {
			renderStartDate(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getStrings() != null) {
			renderStrings(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getTemplate() != null) {
			renderTemplate(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getTitleDateFormat() != null) {
			renderTitleDateFormat(renderedAttributes, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getVisible() != null) {
			renderVisible(renderedAttributes, schedulerEventRecorder);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerEventRecorder.getAfterAllDayChange() != null) {
			renderAfterAllDayChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterClientIdChange() != null) {
			renderAfterClientIdChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterColorChange() != null) {
			renderAfterColorChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterColorBrightnessFactorChange() != null) {
			renderAfterColorBrightnessFactorChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterColorSaturationFactorChange() != null) {
			renderAfterColorSaturationFactorChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterContentChange() != null) {
			renderAfterContentChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterDateFormatChange() != null) {
			renderAfterDateFormatChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterDurationChange() != null) {
			renderAfterDurationChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterEndDateChange() != null) {
			renderAfterEndDateChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterEventChange() != null) {
			renderAfterEventChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterEventClassChange() != null) {
			renderAfterEventClassChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterMeetingChange() != null) {
			renderAfterMeetingChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterNodeChange() != null) {
			renderAfterNodeChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterPopoverChange() != null) {
			renderAfterPopoverChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterReminderChange() != null) {
			renderAfterReminderChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterRepeatedChange() != null) {
			renderAfterRepeatedChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterSchedulerChange() != null) {
			renderAfterSchedulerChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterStartDateChange() != null) {
			renderAfterStartDateChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterTitleDateFormatChange() != null) {
			renderAfterTitleDateFormatChange(renderedAfterEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, schedulerEventRecorder);
		}
		

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

		if (schedulerEventRecorder.getOnAllDayChange() != null) {
			renderOnAllDayChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnClientIdChange() != null) {
			renderOnClientIdChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnColorChange() != null) {
			renderOnColorChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnColorBrightnessFactorChange() != null) {
			renderOnColorBrightnessFactorChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnColorSaturationFactorChange() != null) {
			renderOnColorSaturationFactorChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnContentChange() != null) {
			renderOnContentChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnDateFormatChange() != null) {
			renderOnDateFormatChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnDurationChange() != null) {
			renderOnDurationChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnEndDateChange() != null) {
			renderOnEndDateChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnEventChange() != null) {
			renderOnEventChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnEventClassChange() != null) {
			renderOnEventClassChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnMeetingChange() != null) {
			renderOnMeetingChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnNodeChange() != null) {
			renderOnNodeChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnPopoverChange() != null) {
			renderOnPopoverChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnReminderChange() != null) {
			renderOnReminderChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnRepeatedChange() != null) {
			renderOnRepeatedChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnSchedulerChange() != null) {
			renderOnSchedulerChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnStartDateChange() != null) {
			renderOnStartDateChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnTitleDateFormatChange() != null) {
			renderOnTitleDateFormatChange(renderedOnEvents, schedulerEventRecorder);
		}
		
		if (schedulerEventRecorder.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, schedulerEventRecorder);
		}
		

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
		renderedAttributes.add(renderBoolean(SchedulerEventRecorder.ALL_DAY, allDay));
	}

	protected void renderSchedulerEventRecorderClientId(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String schedulerEventRecorderClientId = schedulerEventRecorder.getSchedulerEventRecorderClientId();
		renderedAttributes.add(renderString(SchedulerEventRecorder.SCHEDULER_EVENT_RECORDER_CLIENT_ID, schedulerEventRecorderClientId));
	}

	protected void renderColor(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String color = schedulerEventRecorder.getColor();
		renderedAttributes.add(renderString(SchedulerEventRecorder.COLOR, color));
	}

	protected void renderColorBrightnessFactor(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object colorBrightnessFactor = schedulerEventRecorder.getColorBrightnessFactor();
		renderedAttributes.add(renderNumber(SchedulerEventRecorder.COLOR_BRIGHTNESS_FACTOR, colorBrightnessFactor));
	}

	protected void renderColorSaturationFactor(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object colorSaturationFactor = schedulerEventRecorder.getColorSaturationFactor();
		renderedAttributes.add(renderNumber(SchedulerEventRecorder.COLOR_SATURATION_FACTOR, colorSaturationFactor));
	}

	protected void renderContent(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String content = schedulerEventRecorder.getContent();
		renderedAttributes.add(renderString(SchedulerEventRecorder.CONTENT, content));
	}

	protected void renderDateFormat(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String dateFormat = schedulerEventRecorder.getDateFormat();
		renderedAttributes.add(renderString(SchedulerEventRecorder.DATE_FORMAT, dateFormat));
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean destroyed = schedulerEventRecorder.getDestroyed();
		renderedAttributes.add(renderBoolean(SchedulerEventRecorder.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean disabled = schedulerEventRecorder.getDisabled();
		renderedAttributes.add(renderBoolean(SchedulerEventRecorder.DISABLED, disabled));
	}

	protected void renderDuration(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object duration = schedulerEventRecorder.getDuration();
		renderedAttributes.add(renderNumber(SchedulerEventRecorder.DURATION, duration));
	}

	protected void renderEndDate(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String endDate = schedulerEventRecorder.getEndDate();
		renderedAttributes.add(renderString(SchedulerEventRecorder.END_DATE, endDate));
	}

	protected void renderEvent(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String event = schedulerEventRecorder.getEvent();
		renderedAttributes.add(renderString(SchedulerEventRecorder.EVENT, event));
	}

	protected void renderEventClass(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String eventClass = schedulerEventRecorder.getEventClass();
		renderedAttributes.add(renderString(SchedulerEventRecorder.EVENT_CLASS, eventClass));
	}

	protected void renderSchedulerEventRecorderId(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object schedulerEventRecorderId = schedulerEventRecorder.getSchedulerEventRecorderId();
		renderedAttributes.add(renderString(SchedulerEventRecorder.SCHEDULER_EVENT_RECORDER_ID, schedulerEventRecorderId));
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean initialized = schedulerEventRecorder.getInitialized();
		renderedAttributes.add(renderBoolean(SchedulerEventRecorder.INITIALIZED, initialized));
	}

	protected void renderMeeting(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean meeting = schedulerEventRecorder.getMeeting();
		renderedAttributes.add(renderBoolean(SchedulerEventRecorder.MEETING, meeting));
	}

	protected void renderNode(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String node = schedulerEventRecorder.getNode();
		renderedAttributes.add(renderString(SchedulerEventRecorder.NODE, node));
	}

	protected void renderPopover(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object popover = schedulerEventRecorder.getPopover();
		renderedAttributes.add(renderObject(SchedulerEventRecorder.POPOVER, popover));
	}

	protected void renderReminder(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean reminder = schedulerEventRecorder.getReminder();
		renderedAttributes.add(renderBoolean(SchedulerEventRecorder.REMINDER, reminder));
	}

	protected void renderRepeated(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean repeated = schedulerEventRecorder.getRepeated();
		renderedAttributes.add(renderBoolean(SchedulerEventRecorder.REPEATED, repeated));
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String scheduler = schedulerEventRecorder.getScheduler();
		renderedAttributes.add(renderString(SchedulerEventRecorder.SCHEDULER, scheduler));
	}

	protected void renderStartDate(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String startDate = schedulerEventRecorder.getStartDate();
		renderedAttributes.add(renderString(SchedulerEventRecorder.START_DATE, startDate));
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object strings = schedulerEventRecorder.getStrings();
		renderedAttributes.add(renderObject(SchedulerEventRecorder.STRINGS, strings));
	}

	protected void renderTemplate(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String template = schedulerEventRecorder.getTemplate();
		renderedAttributes.add(renderString(SchedulerEventRecorder.TEMPLATE, template));
	}

	protected void renderTitleDateFormat(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Object titleDateFormat = schedulerEventRecorder.getTitleDateFormat();
		renderedAttributes.add(renderString(SchedulerEventRecorder.TITLE_DATE_FORMAT, titleDateFormat));
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.Boolean visible = schedulerEventRecorder.getVisible();
		renderedAttributes.add(renderBoolean(SchedulerEventRecorder.VISIBLE, visible));
	}

	protected void renderAfterAllDayChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterAllDayChange = schedulerEventRecorder.getAfterAllDayChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_ALL_DAY_CHANGE, afterAllDayChange));
	}

	protected void renderAfterClientIdChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterClientIdChange = schedulerEventRecorder.getAfterClientIdChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_CLIENT_ID_CHANGE, afterClientIdChange));
	}

	protected void renderAfterColorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterColorChange = schedulerEventRecorder.getAfterColorChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_COLOR_CHANGE, afterColorChange));
	}

	protected void renderAfterColorBrightnessFactorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterColorBrightnessFactorChange = schedulerEventRecorder.getAfterColorBrightnessFactorChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE, afterColorBrightnessFactorChange));
	}

	protected void renderAfterColorSaturationFactorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterColorSaturationFactorChange = schedulerEventRecorder.getAfterColorSaturationFactorChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_COLOR_SATURATION_FACTOR_CHANGE, afterColorSaturationFactorChange));
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterContentChange = schedulerEventRecorder.getAfterContentChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_CONTENT_CHANGE, afterContentChange));
	}

	protected void renderAfterDateFormatChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterDateFormatChange = schedulerEventRecorder.getAfterDateFormatChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_DATE_FORMAT_CHANGE, afterDateFormatChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterDestroyedChange = schedulerEventRecorder.getAfterDestroyedChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterDisabledChange = schedulerEventRecorder.getAfterDisabledChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDurationChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterDurationChange = schedulerEventRecorder.getAfterDurationChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_DURATION_CHANGE, afterDurationChange));
	}

	protected void renderAfterEndDateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterEndDateChange = schedulerEventRecorder.getAfterEndDateChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_END_DATE_CHANGE, afterEndDateChange));
	}

	protected void renderAfterEventChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterEventChange = schedulerEventRecorder.getAfterEventChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_EVENT_CHANGE, afterEventChange));
	}

	protected void renderAfterEventClassChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterEventClassChange = schedulerEventRecorder.getAfterEventClassChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_EVENT_CLASS_CHANGE, afterEventClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterIdChange = schedulerEventRecorder.getAfterIdChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterInitializedChange = schedulerEventRecorder.getAfterInitializedChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterMeetingChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterMeetingChange = schedulerEventRecorder.getAfterMeetingChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_MEETING_CHANGE, afterMeetingChange));
	}

	protected void renderAfterNodeChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterNodeChange = schedulerEventRecorder.getAfterNodeChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_NODE_CHANGE, afterNodeChange));
	}

	protected void renderAfterPopoverChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterPopoverChange = schedulerEventRecorder.getAfterPopoverChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_POPOVER_CHANGE, afterPopoverChange));
	}

	protected void renderAfterReminderChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterReminderChange = schedulerEventRecorder.getAfterReminderChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_REMINDER_CHANGE, afterReminderChange));
	}

	protected void renderAfterRepeatedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterRepeatedChange = schedulerEventRecorder.getAfterRepeatedChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_REPEATED_CHANGE, afterRepeatedChange));
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterSchedulerChange = schedulerEventRecorder.getAfterSchedulerChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
	}

	protected void renderAfterStartDateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterStartDateChange = schedulerEventRecorder.getAfterStartDateChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_START_DATE_CHANGE, afterStartDateChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterStringsChange = schedulerEventRecorder.getAfterStringsChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterTemplateChange = schedulerEventRecorder.getAfterTemplateChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTitleDateFormatChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterTitleDateFormatChange = schedulerEventRecorder.getAfterTitleDateFormatChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_TITLE_DATE_FORMAT_CHANGE, afterTitleDateFormatChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String afterVisibleChange = schedulerEventRecorder.getAfterVisibleChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderOnAllDayChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onAllDayChange = schedulerEventRecorder.getOnAllDayChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_ALL_DAY_CHANGE, onAllDayChange));
	}

	protected void renderOnClientIdChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onClientIdChange = schedulerEventRecorder.getOnClientIdChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_CLIENT_ID_CHANGE, onClientIdChange));
	}

	protected void renderOnColorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onColorChange = schedulerEventRecorder.getOnColorChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_COLOR_CHANGE, onColorChange));
	}

	protected void renderOnColorBrightnessFactorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onColorBrightnessFactorChange = schedulerEventRecorder.getOnColorBrightnessFactorChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_COLOR_BRIGHTNESS_FACTOR_CHANGE, onColorBrightnessFactorChange));
	}

	protected void renderOnColorSaturationFactorChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onColorSaturationFactorChange = schedulerEventRecorder.getOnColorSaturationFactorChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_COLOR_SATURATION_FACTOR_CHANGE, onColorSaturationFactorChange));
	}

	protected void renderOnContentChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onContentChange = schedulerEventRecorder.getOnContentChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_CONTENT_CHANGE, onContentChange));
	}

	protected void renderOnDateFormatChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onDateFormatChange = schedulerEventRecorder.getOnDateFormatChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_DATE_FORMAT_CHANGE, onDateFormatChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onDestroyedChange = schedulerEventRecorder.getOnDestroyedChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onDisabledChange = schedulerEventRecorder.getOnDisabledChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDurationChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onDurationChange = schedulerEventRecorder.getOnDurationChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_DURATION_CHANGE, onDurationChange));
	}

	protected void renderOnEndDateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onEndDateChange = schedulerEventRecorder.getOnEndDateChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_END_DATE_CHANGE, onEndDateChange));
	}

	protected void renderOnEventChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onEventChange = schedulerEventRecorder.getOnEventChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_EVENT_CHANGE, onEventChange));
	}

	protected void renderOnEventClassChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onEventClassChange = schedulerEventRecorder.getOnEventClassChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_EVENT_CLASS_CHANGE, onEventClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onIdChange = schedulerEventRecorder.getOnIdChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onInitializedChange = schedulerEventRecorder.getOnInitializedChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnMeetingChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onMeetingChange = schedulerEventRecorder.getOnMeetingChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_MEETING_CHANGE, onMeetingChange));
	}

	protected void renderOnNodeChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onNodeChange = schedulerEventRecorder.getOnNodeChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_NODE_CHANGE, onNodeChange));
	}

	protected void renderOnPopoverChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onPopoverChange = schedulerEventRecorder.getOnPopoverChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_POPOVER_CHANGE, onPopoverChange));
	}

	protected void renderOnReminderChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onReminderChange = schedulerEventRecorder.getOnReminderChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_REMINDER_CHANGE, onReminderChange));
	}

	protected void renderOnRepeatedChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onRepeatedChange = schedulerEventRecorder.getOnRepeatedChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_REPEATED_CHANGE, onRepeatedChange));
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onSchedulerChange = schedulerEventRecorder.getOnSchedulerChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_SCHEDULER_CHANGE, onSchedulerChange));
	}

	protected void renderOnStartDateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onStartDateChange = schedulerEventRecorder.getOnStartDateChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_START_DATE_CHANGE, onStartDateChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onStringsChange = schedulerEventRecorder.getOnStringsChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onTemplateChange = schedulerEventRecorder.getOnTemplateChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTitleDateFormatChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onTitleDateFormatChange = schedulerEventRecorder.getOnTitleDateFormatChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_TITLE_DATE_FORMAT_CHANGE, onTitleDateFormatChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		java.lang.String onVisibleChange = schedulerEventRecorder.getOnVisibleChange();
		renderedAttributes.add(renderString(SchedulerEventRecorder.ON_VISIBLE_CHANGE, onVisibleChange));
	}

}