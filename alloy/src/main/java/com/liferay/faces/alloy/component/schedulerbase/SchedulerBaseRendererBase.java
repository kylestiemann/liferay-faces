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
package com.liferay.faces.alloy.component.schedulerbase;

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
public abstract class SchedulerBaseRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerBase schedulerBase = (SchedulerBase) uiComponent;
		encodeHTML(facesContext, schedulerBase);
		encodeJavaScript(facesContext, schedulerBase);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerBase schedulerBase) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerBase schedulerBase) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerBase);

		bufferedResponseWriter.write("var schedulerBase = new Y.SchedulerBase");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderActiveView(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderDate(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderEventRecorder(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderFirstDayOfWeek(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderNavigationDateFormatter(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderTodayDate(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderViewDate(responseWriter, schedulerBase);
		responseWriter.write(StringPool.COMMA);
		renderViews(responseWriter, schedulerBase);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerBase);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveView(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "activeView", schedulerBase.getActiveView());
	}

	protected void renderCssClass(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "cssClass", schedulerBase.getCssClass());
	}

	protected void renderDate(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "date", schedulerBase.getDate());
	}

	protected void renderEventRecorder(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "eventRecorder", schedulerBase.getEventRecorder());
	}

	protected void renderFirstDayOfWeek(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderNumber(responseWriter, "firstDayOfWeek", schedulerBase.getFirstDayOfWeek());
	}

	protected void renderHideClass(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "hideClass", schedulerBase.getHideClass());
	}

	protected void renderNavigationDateFormatter(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "navigationDateFormatter", schedulerBase.getNavigationDateFormatter());
	}

	protected void renderRender(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "render", schedulerBase.getRender());
	}

	protected void renderStrings(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderObject(responseWriter, "strings", schedulerBase.getStrings());
	}

	protected void renderTodayDate(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "todayDate", schedulerBase.getTodayDate());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderBoolean(responseWriter, "useARIA", schedulerBase.getUseARIA());
	}

	protected void renderViewDate(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "viewDate", schedulerBase.getViewDate());
	}

	protected void renderViews(ResponseWriter responseWriter, SchedulerBase schedulerBase) throws IOException {
		renderString(responseWriter, "views", schedulerBase.getViews());
	}

}