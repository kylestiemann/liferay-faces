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
package com.liferay.faces.alloy.component.scheduleragendaview;

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
public abstract class SchedulerAgendaViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-agenda";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerAgendaView schedulerAgendaView = (SchedulerAgendaView) uiComponent;
		encodeHTML(facesContext, schedulerAgendaView);
		encodeJavaScript(facesContext, schedulerAgendaView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerAgendaView schedulerAgendaView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerAgendaView schedulerAgendaView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, schedulerAgendaView);

		bufferedResponseWriter.write("var schedulerAgendaView = new Y.SchedulerAgendaView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderScheduleragendaviewBodyContent(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClass(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderEventsDateFormatter(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFilterFn(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderDayDateFormatter(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderExtraDateFormatter(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideClass(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInfoDayDateFormatter(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInfoLabelBigDateFormatter(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInfoLabelSmallDateFormatter(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIsoTime(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNavigationDateFormatter(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNextDate(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPrevDate(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScheduler(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScrollable(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTriggerNode(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseARIA(bufferedResponseWriter, schedulerAgendaView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, schedulerAgendaView);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerAgendaView);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderScheduleragendaviewBodyContent(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "scheduleragendaviewBodyContent", schedulerAgendaView.getScheduleragendaviewBodyContent());
	}

	protected void renderCssClass(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "cssClass", schedulerAgendaView.getCssClass());
	}

	protected void renderEventsDateFormatter(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "eventsDateFormatter", schedulerAgendaView.getEventsDateFormatter());
	}

	protected void renderFilterFn(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "filterFn", schedulerAgendaView.getFilterFn());
	}

	protected void renderHeaderDayDateFormatter(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "headerDayDateFormatter", schedulerAgendaView.getHeaderDayDateFormatter());
	}

	protected void renderHeaderExtraDateFormatter(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "headerExtraDateFormatter", schedulerAgendaView.getHeaderExtraDateFormatter());
	}

	protected void renderHeight(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderNumber(responseWriter, "height", schedulerAgendaView.getHeight());
	}

	protected void renderHideClass(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "hideClass", schedulerAgendaView.getHideClass());
	}

	protected void renderInfoDayDateFormatter(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "infoDayDateFormatter", schedulerAgendaView.getInfoDayDateFormatter());
	}

	protected void renderInfoLabelBigDateFormatter(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "infoLabelBigDateFormatter", schedulerAgendaView.getInfoLabelBigDateFormatter());
	}

	protected void renderInfoLabelSmallDateFormatter(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "infoLabelSmallDateFormatter", schedulerAgendaView.getInfoLabelSmallDateFormatter());
	}

	protected void renderIsoTime(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderBoolean(responseWriter, "isoTime", schedulerAgendaView.getIsoTime());
	}

	protected void renderName(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "name", schedulerAgendaView.getName());
	}

	protected void renderNavigationDateFormatter(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "navigationDateFormatter", schedulerAgendaView.getNavigationDateFormatter());
	}

	protected void renderNextDate(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "nextDate", schedulerAgendaView.getNextDate());
	}

	protected void renderPrevDate(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "prevDate", schedulerAgendaView.getPrevDate());
	}

	protected void renderRender(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "render", schedulerAgendaView.getRender());
	}

	protected void renderScheduler(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "scheduler", schedulerAgendaView.getScheduler());
	}

	protected void renderScrollable(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderBoolean(responseWriter, "scrollable", schedulerAgendaView.getScrollable());
	}

	protected void renderStrings(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "strings", schedulerAgendaView.getStrings());
	}

	protected void renderTriggerNode(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderString(responseWriter, "triggerNode", schedulerAgendaView.getTriggerNode());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderBoolean(responseWriter, "useARIA", schedulerAgendaView.getUseARIA());
	}

	protected void renderVisible(ResponseWriter responseWriter, SchedulerAgendaView schedulerAgendaView) throws IOException {
		renderBoolean(responseWriter, "visible", schedulerAgendaView.getVisible());
	}

}