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

}