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
public abstract class SchedulerEventRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base-event";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerEvent schedulerEvent = (SchedulerEvent) uiComponent;
		encodeHTML(facesContext, schedulerEvent);
		encodeJavaScript(facesContext, schedulerEvent);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerEvent schedulerEvent) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerEvent schedulerEvent) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerEvent);

		bufferedResponseWriter.write("var schedulerEvent = new Y.SchedulerEvent");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAllDay(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderColor(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderColorBrightnessFactor(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderColorSaturationFactor(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderContent(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderEndDate(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderMeeting(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderNode(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderReminder(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderRepeated(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderScheduler(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderStartDate(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderTitleDateFormat(responseWriter, schedulerEvent);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, schedulerEvent);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerEvent);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAllDay(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderBoolean(responseWriter, "allDay", schedulerEvent.getAllDay());
	}

	protected void renderColor(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderString(responseWriter, "color", schedulerEvent.getColor());
	}

	protected void renderColorBrightnessFactor(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderNumber(responseWriter, "colorBrightnessFactor", schedulerEvent.getColorBrightnessFactor());
	}

	protected void renderColorSaturationFactor(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderNumber(responseWriter, "colorSaturationFactor", schedulerEvent.getColorSaturationFactor());
	}

	protected void renderContent(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderString(responseWriter, "content", schedulerEvent.getContent());
	}

	protected void renderDisabled(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderBoolean(responseWriter, "disabled", schedulerEvent.getDisabled());
	}

	protected void renderEndDate(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderString(responseWriter, "endDate", schedulerEvent.getEndDate());
	}

	protected void renderMeeting(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderBoolean(responseWriter, "meeting", schedulerEvent.getMeeting());
	}

	protected void renderNode(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderString(responseWriter, "node", schedulerEvent.getNode());
	}

	protected void renderReminder(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderBoolean(responseWriter, "reminder", schedulerEvent.getReminder());
	}

	protected void renderRepeated(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderBoolean(responseWriter, "repeated", schedulerEvent.getRepeated());
	}

	protected void renderScheduler(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderString(responseWriter, "scheduler", schedulerEvent.getScheduler());
	}

	protected void renderStartDate(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderString(responseWriter, "startDate", schedulerEvent.getStartDate());
	}

	protected void renderTitleDateFormat(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderString(responseWriter, "titleDateFormat", schedulerEvent.getTitleDateFormat());
	}

	protected void renderVisible(ResponseWriter responseWriter, SchedulerEvent schedulerEvent) throws IOException {
		renderBoolean(responseWriter, "visible", schedulerEvent.getVisible());
	}

}