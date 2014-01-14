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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class SchedulerEventRecorderRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-event-recorder";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerEventRecorder schedulerEventRecorder = (SchedulerEventRecorder) uiComponent;
		encodeHTML(facesContext, schedulerEventRecorder);
		encodeJavaScript(facesContext, schedulerEventRecorder);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerEventRecorder schedulerEventRecorder) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerEventRecorder schedulerEventRecorder) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerEventRecorder);

		bufferedResponseWriter.write("var schedulerEventRecorder = new Y.SchedulerEventRecorder");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAllDay(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderColor(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderColorBrightnessFactor(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderColorSaturationFactor(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderContent(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderDateFormat(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderDuration(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderEndDate(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderEvent(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderEventClass(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderMeeting(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderNode(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderPopover(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderReminder(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderRepeated(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderScheduler(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderStartDate(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderTemplate(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderTitleDateFormat(responseWriter, schedulerEventRecorder);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, schedulerEventRecorder);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerEventRecorder);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAllDay(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderBoolean(responseWriter, "allDay", schedulerEventRecorder.getAllDay());
	}

	protected void renderColor(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "color", schedulerEventRecorder.getColor());
	}

	protected void renderColorBrightnessFactor(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderNumber(responseWriter, "colorBrightnessFactor", schedulerEventRecorder.getColorBrightnessFactor());
	}

	protected void renderColorSaturationFactor(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderNumber(responseWriter, "colorSaturationFactor", schedulerEventRecorder.getColorSaturationFactor());
	}

	protected void renderContent(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "content", schedulerEventRecorder.getContent());
	}

	protected void renderDateFormat(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "dateFormat", schedulerEventRecorder.getDateFormat());
	}

	protected void renderDisabled(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderBoolean(responseWriter, "disabled", schedulerEventRecorder.getDisabled());
	}

	protected void renderDuration(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderNumber(responseWriter, "duration", schedulerEventRecorder.getDuration());
	}

	protected void renderEndDate(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "endDate", schedulerEventRecorder.getEndDate());
	}

	protected void renderEvent(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "event", schedulerEventRecorder.getEvent());
	}

	protected void renderEventClass(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "eventClass", schedulerEventRecorder.getEventClass());
	}

	protected void renderMeeting(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderBoolean(responseWriter, "meeting", schedulerEventRecorder.getMeeting());
	}

	protected void renderNode(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "node", schedulerEventRecorder.getNode());
	}

	protected void renderPopover(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderObject(responseWriter, "popover", schedulerEventRecorder.getPopover());
	}

	protected void renderReminder(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderBoolean(responseWriter, "reminder", schedulerEventRecorder.getReminder());
	}

	protected void renderRepeated(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderBoolean(responseWriter, "repeated", schedulerEventRecorder.getRepeated());
	}

	protected void renderScheduler(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "scheduler", schedulerEventRecorder.getScheduler());
	}

	protected void renderStartDate(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "startDate", schedulerEventRecorder.getStartDate());
	}

	protected void renderStrings(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderObject(responseWriter, "strings", schedulerEventRecorder.getStrings());
	}

	protected void renderTemplate(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "template", schedulerEventRecorder.getTemplate());
	}

	protected void renderTitleDateFormat(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderString(responseWriter, "titleDateFormat", schedulerEventRecorder.getTitleDateFormat());
	}

	protected void renderVisible(ResponseWriter responseWriter, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		renderBoolean(responseWriter, "visible", schedulerEventRecorder.getVisible());
	}

}