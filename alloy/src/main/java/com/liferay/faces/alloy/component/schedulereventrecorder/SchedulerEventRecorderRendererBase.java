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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
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

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

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

}