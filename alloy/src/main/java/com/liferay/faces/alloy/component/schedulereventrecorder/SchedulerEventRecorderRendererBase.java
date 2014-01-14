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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, schedulerEventRecorder);

		bufferedResponseWriter.write("var schedulerEventRecorder = new Y.SchedulerEventRecorder");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAllDay(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColor(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColorBrightnessFactor(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColorSaturationFactor(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContent(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDateFormat(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDuration(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderEndDate(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderEvent(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderEventClass(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMeeting(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNode(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPopover(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReminder(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRepeated(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScheduler(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStartDate(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplate(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTitleDateFormat(bufferedResponseWriter, schedulerEventRecorder);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, schedulerEventRecorder);

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