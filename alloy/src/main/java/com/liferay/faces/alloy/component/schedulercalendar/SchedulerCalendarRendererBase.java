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
package com.liferay.faces.alloy.component.schedulercalendar;

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
public abstract class SchedulerCalendarRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base-calendar";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerCalendar schedulerCalendar = (SchedulerCalendar) uiComponent;
		encodeHTML(facesContext, schedulerCalendar);
		encodeJavaScript(facesContext, schedulerCalendar);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerCalendar schedulerCalendar) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerCalendar schedulerCalendar) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerCalendar);

		bufferedResponseWriter.write("var schedulerCalendar = new Y.SchedulerCalendar");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderColor(responseWriter, schedulerCalendar);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, schedulerCalendar);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, schedulerCalendar);
		responseWriter.write(StringPool.COMMA);
		renderPalette(responseWriter, schedulerCalendar);
		responseWriter.write(StringPool.COMMA);
		renderScheduler(responseWriter, schedulerCalendar);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, schedulerCalendar);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerCalendar);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderColor(ResponseWriter responseWriter, SchedulerCalendar schedulerCalendar) throws IOException {
		renderString(responseWriter, "color", schedulerCalendar.getColor());
	}

	protected void renderDisabled(ResponseWriter responseWriter, SchedulerCalendar schedulerCalendar) throws IOException {
		renderBoolean(responseWriter, "disabled", schedulerCalendar.getDisabled());
	}

	protected void renderName(ResponseWriter responseWriter, SchedulerCalendar schedulerCalendar) throws IOException {
		renderString(responseWriter, "name", schedulerCalendar.getName());
	}

	protected void renderPalette(ResponseWriter responseWriter, SchedulerCalendar schedulerCalendar) throws IOException {
		renderArray(responseWriter, "palette", schedulerCalendar.getPalette());
	}

	protected void renderScheduler(ResponseWriter responseWriter, SchedulerCalendar schedulerCalendar) throws IOException {
		renderString(responseWriter, "scheduler", schedulerCalendar.getScheduler());
	}

	protected void renderVisible(ResponseWriter responseWriter, SchedulerCalendar schedulerCalendar) throws IOException {
		renderBoolean(responseWriter, "visible", schedulerCalendar.getVisible());
	}

}