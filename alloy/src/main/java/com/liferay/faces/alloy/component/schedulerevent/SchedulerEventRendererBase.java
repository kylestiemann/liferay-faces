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
public abstract class SchedulerEventRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base-event";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerEvent schedulerEvent = (SchedulerEvent) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerEvent = new A.SchedulerEvent");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAllDay(renderedAttributes, schedulerEvent);
		renderSchedulerEventClientId(renderedAttributes, schedulerEvent);
		renderColor(renderedAttributes, schedulerEvent);
		renderColorBrightnessFactor(renderedAttributes, schedulerEvent);
		renderColorSaturationFactor(renderedAttributes, schedulerEvent);
		renderContent(renderedAttributes, schedulerEvent);
		renderDestroyed(renderedAttributes, schedulerEvent);
		renderDisabled(renderedAttributes, schedulerEvent);
		renderEndDate(renderedAttributes, schedulerEvent);
		renderSchedulerEventId(renderedAttributes, schedulerEvent);
		renderInitialized(renderedAttributes, schedulerEvent);
		renderMeeting(renderedAttributes, schedulerEvent);
		renderNode(renderedAttributes, schedulerEvent);
		renderReminder(renderedAttributes, schedulerEvent);
		renderRepeated(renderedAttributes, schedulerEvent);
		renderScheduler(renderedAttributes, schedulerEvent);
		renderStartDate(renderedAttributes, schedulerEvent);
		renderTitleDateFormat(renderedAttributes, schedulerEvent);
		renderVisible(renderedAttributes, schedulerEvent);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAllDayChange(renderedAfterEvents, schedulerEvent);
		renderAfterClientIdChange(renderedAfterEvents, schedulerEvent);
		renderAfterColorChange(renderedAfterEvents, schedulerEvent);
		renderAfterColorBrightnessFactorChange(renderedAfterEvents, schedulerEvent);
		renderAfterColorSaturationFactorChange(renderedAfterEvents, schedulerEvent);
		renderAfterContentChange(renderedAfterEvents, schedulerEvent);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerEvent);
		renderAfterDisabledChange(renderedAfterEvents, schedulerEvent);
		renderAfterEndDateChange(renderedAfterEvents, schedulerEvent);
		renderAfterIdChange(renderedAfterEvents, schedulerEvent);
		renderAfterInitializedChange(renderedAfterEvents, schedulerEvent);
		renderAfterMeetingChange(renderedAfterEvents, schedulerEvent);
		renderAfterNodeChange(renderedAfterEvents, schedulerEvent);
		renderAfterReminderChange(renderedAfterEvents, schedulerEvent);
		renderAfterRepeatedChange(renderedAfterEvents, schedulerEvent);
		renderAfterSchedulerChange(renderedAfterEvents, schedulerEvent);
		renderAfterStartDateChange(renderedAfterEvents, schedulerEvent);
		renderAfterTitleDateFormatChange(renderedAfterEvents, schedulerEvent);
		renderAfterVisibleChange(renderedAfterEvents, schedulerEvent);

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

		renderOnAllDayChange(renderedOnEvents, schedulerEvent);
		renderOnClientIdChange(renderedOnEvents, schedulerEvent);
		renderOnColorChange(renderedOnEvents, schedulerEvent);
		renderOnColorBrightnessFactorChange(renderedOnEvents, schedulerEvent);
		renderOnColorSaturationFactorChange(renderedOnEvents, schedulerEvent);
		renderOnContentChange(renderedOnEvents, schedulerEvent);
		renderOnDestroyedChange(renderedOnEvents, schedulerEvent);
		renderOnDisabledChange(renderedOnEvents, schedulerEvent);
		renderOnEndDateChange(renderedOnEvents, schedulerEvent);
		renderOnIdChange(renderedOnEvents, schedulerEvent);
		renderOnInitializedChange(renderedOnEvents, schedulerEvent);
		renderOnMeetingChange(renderedOnEvents, schedulerEvent);
		renderOnNodeChange(renderedOnEvents, schedulerEvent);
		renderOnReminderChange(renderedOnEvents, schedulerEvent);
		renderOnRepeatedChange(renderedOnEvents, schedulerEvent);
		renderOnSchedulerChange(renderedOnEvents, schedulerEvent);
		renderOnStartDateChange(renderedOnEvents, schedulerEvent);
		renderOnTitleDateFormatChange(renderedOnEvents, schedulerEvent);
		renderOnVisibleChange(renderedOnEvents, schedulerEvent);

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

	protected void renderAllDay(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean allDay = schedulerEvent.getAllDay();

		if (allDay != null) {
			renderedAttributes.add(renderBoolean(SchedulerEvent.ALL_DAY, allDay));
		}
	}

	protected void renderSchedulerEventClientId(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String schedulerEventClientId = schedulerEvent.getSchedulerEventClientId();

		if (schedulerEventClientId != null) {
			renderedAttributes.add(renderString(SchedulerEvent.SCHEDULER_EVENT_CLIENT_ID, schedulerEventClientId));
		}
	}

	protected void renderColor(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String color = schedulerEvent.getColor();

		if (color != null) {
			renderedAttributes.add(renderString(SchedulerEvent.COLOR, color));
		}
	}

	protected void renderColorBrightnessFactor(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Object colorBrightnessFactor = schedulerEvent.getColorBrightnessFactor();

		if (colorBrightnessFactor != null) {
			renderedAttributes.add(renderNumber(SchedulerEvent.COLOR_BRIGHTNESS_FACTOR, colorBrightnessFactor));
		}
	}

	protected void renderColorSaturationFactor(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Object colorSaturationFactor = schedulerEvent.getColorSaturationFactor();

		if (colorSaturationFactor != null) {
			renderedAttributes.add(renderNumber(SchedulerEvent.COLOR_SATURATION_FACTOR, colorSaturationFactor));
		}
	}

	protected void renderContent(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String content = schedulerEvent.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(SchedulerEvent.CONTENT, content));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean destroyed = schedulerEvent.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerEvent.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean disabled = schedulerEvent.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerEvent.DISABLED, disabled));
		}
	}

	protected void renderEndDate(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String endDate = schedulerEvent.getEndDate();

		if (endDate != null) {
			renderedAttributes.add(renderString(SchedulerEvent.END_DATE, endDate));
		}
	}

	protected void renderSchedulerEventId(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Object schedulerEventId = schedulerEvent.getSchedulerEventId();

		if (schedulerEventId != null) {
			renderedAttributes.add(renderString(SchedulerEvent.SCHEDULER_EVENT_ID, schedulerEventId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean initialized = schedulerEvent.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerEvent.INITIALIZED, initialized));
		}
	}

	protected void renderMeeting(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean meeting = schedulerEvent.getMeeting();

		if (meeting != null) {
			renderedAttributes.add(renderBoolean(SchedulerEvent.MEETING, meeting));
		}
	}

	protected void renderNode(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String node = schedulerEvent.getNode();

		if (node != null) {
			renderedAttributes.add(renderString(SchedulerEvent.NODE, node));
		}
	}

	protected void renderReminder(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean reminder = schedulerEvent.getReminder();

		if (reminder != null) {
			renderedAttributes.add(renderBoolean(SchedulerEvent.REMINDER, reminder));
		}
	}

	protected void renderRepeated(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean repeated = schedulerEvent.getRepeated();

		if (repeated != null) {
			renderedAttributes.add(renderBoolean(SchedulerEvent.REPEATED, repeated));
		}
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String scheduler = schedulerEvent.getScheduler();

		if (scheduler != null) {
			renderedAttributes.add(renderString(SchedulerEvent.SCHEDULER, scheduler));
		}
	}

	protected void renderStartDate(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String startDate = schedulerEvent.getStartDate();

		if (startDate != null) {
			renderedAttributes.add(renderString(SchedulerEvent.START_DATE, startDate));
		}
	}

	protected void renderTitleDateFormat(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Object titleDateFormat = schedulerEvent.getTitleDateFormat();

		if (titleDateFormat != null) {
			renderedAttributes.add(renderString(SchedulerEvent.TITLE_DATE_FORMAT, titleDateFormat));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean visible = schedulerEvent.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerEvent.VISIBLE, visible));
		}
	}

	protected void renderAfterAllDayChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterAllDayChange = schedulerEvent.getAfterAllDayChange();

		if (afterAllDayChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_ALL_DAY_CHANGE, afterAllDayChange));
		}
	}

	protected void renderAfterClientIdChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterClientIdChange = schedulerEvent.getAfterClientIdChange();

		if (afterClientIdChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_CLIENT_ID_CHANGE, afterClientIdChange));
		}
	}

	protected void renderAfterColorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterColorChange = schedulerEvent.getAfterColorChange();

		if (afterColorChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_COLOR_CHANGE, afterColorChange));
		}
	}

	protected void renderAfterColorBrightnessFactorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterColorBrightnessFactorChange = schedulerEvent.getAfterColorBrightnessFactorChange();

		if (afterColorBrightnessFactorChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE, afterColorBrightnessFactorChange));
		}
	}

	protected void renderAfterColorSaturationFactorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterColorSaturationFactorChange = schedulerEvent.getAfterColorSaturationFactorChange();

		if (afterColorSaturationFactorChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_COLOR_SATURATION_FACTOR_CHANGE, afterColorSaturationFactorChange));
		}
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterContentChange = schedulerEvent.getAfterContentChange();

		if (afterContentChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_CONTENT_CHANGE, afterContentChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterDestroyedChange = schedulerEvent.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterDisabledChange = schedulerEvent.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterEndDateChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterEndDateChange = schedulerEvent.getAfterEndDateChange();

		if (afterEndDateChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_END_DATE_CHANGE, afterEndDateChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterIdChange = schedulerEvent.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterInitializedChange = schedulerEvent.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterMeetingChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterMeetingChange = schedulerEvent.getAfterMeetingChange();

		if (afterMeetingChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_MEETING_CHANGE, afterMeetingChange));
		}
	}

	protected void renderAfterNodeChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterNodeChange = schedulerEvent.getAfterNodeChange();

		if (afterNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_NODE_CHANGE, afterNodeChange));
		}
	}

	protected void renderAfterReminderChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterReminderChange = schedulerEvent.getAfterReminderChange();

		if (afterReminderChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_REMINDER_CHANGE, afterReminderChange));
		}
	}

	protected void renderAfterRepeatedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterRepeatedChange = schedulerEvent.getAfterRepeatedChange();

		if (afterRepeatedChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_REPEATED_CHANGE, afterRepeatedChange));
		}
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterSchedulerChange = schedulerEvent.getAfterSchedulerChange();

		if (afterSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
		}
	}

	protected void renderAfterStartDateChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterStartDateChange = schedulerEvent.getAfterStartDateChange();

		if (afterStartDateChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_START_DATE_CHANGE, afterStartDateChange));
		}
	}

	protected void renderAfterTitleDateFormatChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterTitleDateFormatChange = schedulerEvent.getAfterTitleDateFormatChange();

		if (afterTitleDateFormatChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_TITLE_DATE_FORMAT_CHANGE, afterTitleDateFormatChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterVisibleChange = schedulerEvent.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderOnAllDayChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onAllDayChange = schedulerEvent.getOnAllDayChange();

		if (onAllDayChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_ALL_DAY_CHANGE, onAllDayChange));
		}
	}

	protected void renderOnClientIdChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onClientIdChange = schedulerEvent.getOnClientIdChange();

		if (onClientIdChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_CLIENT_ID_CHANGE, onClientIdChange));
		}
	}

	protected void renderOnColorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onColorChange = schedulerEvent.getOnColorChange();

		if (onColorChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_COLOR_CHANGE, onColorChange));
		}
	}

	protected void renderOnColorBrightnessFactorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onColorBrightnessFactorChange = schedulerEvent.getOnColorBrightnessFactorChange();

		if (onColorBrightnessFactorChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_COLOR_BRIGHTNESS_FACTOR_CHANGE, onColorBrightnessFactorChange));
		}
	}

	protected void renderOnColorSaturationFactorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onColorSaturationFactorChange = schedulerEvent.getOnColorSaturationFactorChange();

		if (onColorSaturationFactorChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_COLOR_SATURATION_FACTOR_CHANGE, onColorSaturationFactorChange));
		}
	}

	protected void renderOnContentChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onContentChange = schedulerEvent.getOnContentChange();

		if (onContentChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_CONTENT_CHANGE, onContentChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onDestroyedChange = schedulerEvent.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onDisabledChange = schedulerEvent.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnEndDateChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onEndDateChange = schedulerEvent.getOnEndDateChange();

		if (onEndDateChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_END_DATE_CHANGE, onEndDateChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onIdChange = schedulerEvent.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onInitializedChange = schedulerEvent.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnMeetingChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onMeetingChange = schedulerEvent.getOnMeetingChange();

		if (onMeetingChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_MEETING_CHANGE, onMeetingChange));
		}
	}

	protected void renderOnNodeChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onNodeChange = schedulerEvent.getOnNodeChange();

		if (onNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_NODE_CHANGE, onNodeChange));
		}
	}

	protected void renderOnReminderChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onReminderChange = schedulerEvent.getOnReminderChange();

		if (onReminderChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_REMINDER_CHANGE, onReminderChange));
		}
	}

	protected void renderOnRepeatedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onRepeatedChange = schedulerEvent.getOnRepeatedChange();

		if (onRepeatedChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_REPEATED_CHANGE, onRepeatedChange));
		}
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onSchedulerChange = schedulerEvent.getOnSchedulerChange();

		if (onSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_SCHEDULER_CHANGE, onSchedulerChange));
		}
	}

	protected void renderOnStartDateChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onStartDateChange = schedulerEvent.getOnStartDateChange();

		if (onStartDateChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_START_DATE_CHANGE, onStartDateChange));
		}
	}

	protected void renderOnTitleDateFormatChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onTitleDateFormatChange = schedulerEvent.getOnTitleDateFormatChange();

		if (onTitleDateFormatChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_TITLE_DATE_FORMAT_CHANGE, onTitleDateFormatChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onVisibleChange = schedulerEvent.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerEvent.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

}