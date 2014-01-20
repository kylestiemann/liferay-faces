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

		if (schedulerEvent.getAllDay() != null) {
			renderAllDay(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getSchedulerEventClientId() != null) {
			renderSchedulerEventClientId(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getColor() != null) {
			renderColor(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getColorBrightnessFactor() != null) {
			renderColorBrightnessFactor(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getColorSaturationFactor() != null) {
			renderColorSaturationFactor(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getContent() != null) {
			renderContent(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getDisabled() != null) {
			renderDisabled(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getEndDate() != null) {
			renderEndDate(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getSchedulerEventId() != null) {
			renderSchedulerEventId(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getInitialized() != null) {
			renderInitialized(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getMeeting() != null) {
			renderMeeting(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getNode() != null) {
			renderNode(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getReminder() != null) {
			renderReminder(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getRepeated() != null) {
			renderRepeated(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getScheduler() != null) {
			renderScheduler(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getStartDate() != null) {
			renderStartDate(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getTitleDateFormat() != null) {
			renderTitleDateFormat(renderedAttributes, schedulerEvent);
		}
		
		if (schedulerEvent.getVisible() != null) {
			renderVisible(renderedAttributes, schedulerEvent);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerEvent.getAfterAllDayChange() != null) {
			renderAfterAllDayChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterClientIdChange() != null) {
			renderAfterClientIdChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterColorChange() != null) {
			renderAfterColorChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterColorBrightnessFactorChange() != null) {
			renderAfterColorBrightnessFactorChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterColorSaturationFactorChange() != null) {
			renderAfterColorSaturationFactorChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterContentChange() != null) {
			renderAfterContentChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterEndDateChange() != null) {
			renderAfterEndDateChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterMeetingChange() != null) {
			renderAfterMeetingChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterNodeChange() != null) {
			renderAfterNodeChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterReminderChange() != null) {
			renderAfterReminderChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterRepeatedChange() != null) {
			renderAfterRepeatedChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterSchedulerChange() != null) {
			renderAfterSchedulerChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterStartDateChange() != null) {
			renderAfterStartDateChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterTitleDateFormatChange() != null) {
			renderAfterTitleDateFormatChange(renderedAfterEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, schedulerEvent);
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

		if (schedulerEvent.getOnAllDayChange() != null) {
			renderOnAllDayChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnClientIdChange() != null) {
			renderOnClientIdChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnColorChange() != null) {
			renderOnColorChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnColorBrightnessFactorChange() != null) {
			renderOnColorBrightnessFactorChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnColorSaturationFactorChange() != null) {
			renderOnColorSaturationFactorChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnContentChange() != null) {
			renderOnContentChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnEndDateChange() != null) {
			renderOnEndDateChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnMeetingChange() != null) {
			renderOnMeetingChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnNodeChange() != null) {
			renderOnNodeChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnReminderChange() != null) {
			renderOnReminderChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnRepeatedChange() != null) {
			renderOnRepeatedChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnSchedulerChange() != null) {
			renderOnSchedulerChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnStartDateChange() != null) {
			renderOnStartDateChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnTitleDateFormatChange() != null) {
			renderOnTitleDateFormatChange(renderedOnEvents, schedulerEvent);
		}
		
		if (schedulerEvent.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, schedulerEvent);
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

	protected void renderAllDay(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean allDay = schedulerEvent.getAllDay();
		renderedAttributes.add(renderBoolean(SchedulerEvent.ALL_DAY, allDay));
	}

	protected void renderSchedulerEventClientId(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String schedulerEventClientId = schedulerEvent.getSchedulerEventClientId();
		renderedAttributes.add(renderString(SchedulerEvent.SCHEDULER_EVENT_CLIENT_ID, schedulerEventClientId));
	}

	protected void renderColor(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String color = schedulerEvent.getColor();
		renderedAttributes.add(renderString(SchedulerEvent.COLOR, color));
	}

	protected void renderColorBrightnessFactor(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Object colorBrightnessFactor = schedulerEvent.getColorBrightnessFactor();
		renderedAttributes.add(renderNumber(SchedulerEvent.COLOR_BRIGHTNESS_FACTOR, colorBrightnessFactor));
	}

	protected void renderColorSaturationFactor(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Object colorSaturationFactor = schedulerEvent.getColorSaturationFactor();
		renderedAttributes.add(renderNumber(SchedulerEvent.COLOR_SATURATION_FACTOR, colorSaturationFactor));
	}

	protected void renderContent(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String content = schedulerEvent.getContent();
		renderedAttributes.add(renderString(SchedulerEvent.CONTENT, content));
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean destroyed = schedulerEvent.getDestroyed();
		renderedAttributes.add(renderBoolean(SchedulerEvent.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean disabled = schedulerEvent.getDisabled();
		renderedAttributes.add(renderBoolean(SchedulerEvent.DISABLED, disabled));
	}

	protected void renderEndDate(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String endDate = schedulerEvent.getEndDate();
		renderedAttributes.add(renderString(SchedulerEvent.END_DATE, endDate));
	}

	protected void renderSchedulerEventId(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Object schedulerEventId = schedulerEvent.getSchedulerEventId();
		renderedAttributes.add(renderString(SchedulerEvent.SCHEDULER_EVENT_ID, schedulerEventId));
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean initialized = schedulerEvent.getInitialized();
		renderedAttributes.add(renderBoolean(SchedulerEvent.INITIALIZED, initialized));
	}

	protected void renderMeeting(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean meeting = schedulerEvent.getMeeting();
		renderedAttributes.add(renderBoolean(SchedulerEvent.MEETING, meeting));
	}

	protected void renderNode(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String node = schedulerEvent.getNode();
		renderedAttributes.add(renderString(SchedulerEvent.NODE, node));
	}

	protected void renderReminder(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean reminder = schedulerEvent.getReminder();
		renderedAttributes.add(renderBoolean(SchedulerEvent.REMINDER, reminder));
	}

	protected void renderRepeated(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean repeated = schedulerEvent.getRepeated();
		renderedAttributes.add(renderBoolean(SchedulerEvent.REPEATED, repeated));
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String scheduler = schedulerEvent.getScheduler();
		renderedAttributes.add(renderString(SchedulerEvent.SCHEDULER, scheduler));
	}

	protected void renderStartDate(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String startDate = schedulerEvent.getStartDate();
		renderedAttributes.add(renderString(SchedulerEvent.START_DATE, startDate));
	}

	protected void renderTitleDateFormat(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Object titleDateFormat = schedulerEvent.getTitleDateFormat();
		renderedAttributes.add(renderString(SchedulerEvent.TITLE_DATE_FORMAT, titleDateFormat));
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.Boolean visible = schedulerEvent.getVisible();
		renderedAttributes.add(renderBoolean(SchedulerEvent.VISIBLE, visible));
	}

	protected void renderAfterAllDayChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterAllDayChange = schedulerEvent.getAfterAllDayChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_ALL_DAY_CHANGE, afterAllDayChange));
	}

	protected void renderAfterClientIdChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterClientIdChange = schedulerEvent.getAfterClientIdChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_CLIENT_ID_CHANGE, afterClientIdChange));
	}

	protected void renderAfterColorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterColorChange = schedulerEvent.getAfterColorChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_COLOR_CHANGE, afterColorChange));
	}

	protected void renderAfterColorBrightnessFactorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterColorBrightnessFactorChange = schedulerEvent.getAfterColorBrightnessFactorChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_COLOR_BRIGHTNESS_FACTOR_CHANGE, afterColorBrightnessFactorChange));
	}

	protected void renderAfterColorSaturationFactorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterColorSaturationFactorChange = schedulerEvent.getAfterColorSaturationFactorChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_COLOR_SATURATION_FACTOR_CHANGE, afterColorSaturationFactorChange));
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterContentChange = schedulerEvent.getAfterContentChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_CONTENT_CHANGE, afterContentChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterDestroyedChange = schedulerEvent.getAfterDestroyedChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterDisabledChange = schedulerEvent.getAfterDisabledChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterEndDateChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterEndDateChange = schedulerEvent.getAfterEndDateChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_END_DATE_CHANGE, afterEndDateChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterIdChange = schedulerEvent.getAfterIdChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterInitializedChange = schedulerEvent.getAfterInitializedChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterMeetingChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterMeetingChange = schedulerEvent.getAfterMeetingChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_MEETING_CHANGE, afterMeetingChange));
	}

	protected void renderAfterNodeChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterNodeChange = schedulerEvent.getAfterNodeChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_NODE_CHANGE, afterNodeChange));
	}

	protected void renderAfterReminderChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterReminderChange = schedulerEvent.getAfterReminderChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_REMINDER_CHANGE, afterReminderChange));
	}

	protected void renderAfterRepeatedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterRepeatedChange = schedulerEvent.getAfterRepeatedChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_REPEATED_CHANGE, afterRepeatedChange));
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterSchedulerChange = schedulerEvent.getAfterSchedulerChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
	}

	protected void renderAfterStartDateChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterStartDateChange = schedulerEvent.getAfterStartDateChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_START_DATE_CHANGE, afterStartDateChange));
	}

	protected void renderAfterTitleDateFormatChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterTitleDateFormatChange = schedulerEvent.getAfterTitleDateFormatChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_TITLE_DATE_FORMAT_CHANGE, afterTitleDateFormatChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String afterVisibleChange = schedulerEvent.getAfterVisibleChange();
		renderedAttributes.add(renderString(SchedulerEvent.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderOnAllDayChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onAllDayChange = schedulerEvent.getOnAllDayChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_ALL_DAY_CHANGE, onAllDayChange));
	}

	protected void renderOnClientIdChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onClientIdChange = schedulerEvent.getOnClientIdChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_CLIENT_ID_CHANGE, onClientIdChange));
	}

	protected void renderOnColorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onColorChange = schedulerEvent.getOnColorChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_COLOR_CHANGE, onColorChange));
	}

	protected void renderOnColorBrightnessFactorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onColorBrightnessFactorChange = schedulerEvent.getOnColorBrightnessFactorChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_COLOR_BRIGHTNESS_FACTOR_CHANGE, onColorBrightnessFactorChange));
	}

	protected void renderOnColorSaturationFactorChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onColorSaturationFactorChange = schedulerEvent.getOnColorSaturationFactorChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_COLOR_SATURATION_FACTOR_CHANGE, onColorSaturationFactorChange));
	}

	protected void renderOnContentChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onContentChange = schedulerEvent.getOnContentChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_CONTENT_CHANGE, onContentChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onDestroyedChange = schedulerEvent.getOnDestroyedChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onDisabledChange = schedulerEvent.getOnDisabledChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnEndDateChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onEndDateChange = schedulerEvent.getOnEndDateChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_END_DATE_CHANGE, onEndDateChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onIdChange = schedulerEvent.getOnIdChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onInitializedChange = schedulerEvent.getOnInitializedChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnMeetingChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onMeetingChange = schedulerEvent.getOnMeetingChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_MEETING_CHANGE, onMeetingChange));
	}

	protected void renderOnNodeChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onNodeChange = schedulerEvent.getOnNodeChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_NODE_CHANGE, onNodeChange));
	}

	protected void renderOnReminderChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onReminderChange = schedulerEvent.getOnReminderChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_REMINDER_CHANGE, onReminderChange));
	}

	protected void renderOnRepeatedChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onRepeatedChange = schedulerEvent.getOnRepeatedChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_REPEATED_CHANGE, onRepeatedChange));
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onSchedulerChange = schedulerEvent.getOnSchedulerChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_SCHEDULER_CHANGE, onSchedulerChange));
	}

	protected void renderOnStartDateChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onStartDateChange = schedulerEvent.getOnStartDateChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_START_DATE_CHANGE, onStartDateChange));
	}

	protected void renderOnTitleDateFormatChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onTitleDateFormatChange = schedulerEvent.getOnTitleDateFormatChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_TITLE_DATE_FORMAT_CHANGE, onTitleDateFormatChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		java.lang.String onVisibleChange = schedulerEvent.getOnVisibleChange();
		renderedAttributes.add(renderString(SchedulerEvent.ON_VISIBLE_CHANGE, onVisibleChange));
	}

}