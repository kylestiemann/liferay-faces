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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, schedulerEvent);

		bufferedResponseWriter.write("var schedulerEvent = new Y.SchedulerEvent");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAllDay(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColor(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColorBrightnessFactor(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColorSaturationFactor(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContent(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderEndDate(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMeeting(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNode(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReminder(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRepeated(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScheduler(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStartDate(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTitleDateFormat(bufferedResponseWriter, schedulerEvent);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, schedulerEvent);

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