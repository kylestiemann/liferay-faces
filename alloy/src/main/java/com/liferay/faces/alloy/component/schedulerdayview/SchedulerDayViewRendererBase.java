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
package com.liferay.faces.alloy.component.schedulerdayview;

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
public abstract class SchedulerDayViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-day";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerDayView schedulerDayView = (SchedulerDayView) uiComponent;
		encodeHTML(facesContext, schedulerDayView);
		encodeJavaScript(facesContext, schedulerDayView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerDayView schedulerDayView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerDayView schedulerDayView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerDayView);

		bufferedResponseWriter.write("var schedulerDayView = new Y.SchedulerDayView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderSchedulerdayviewBodyContent(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderColDaysNode(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderColHeaderDaysNode(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderDays(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderDelegateConfig(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderEventWidth(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderFilterFn(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderDateFormatter(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderTableNode(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderView(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderViewConfig(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderViewLabelNode(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderHourHeight(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderIsoTime(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderMarkercellsNode(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderNavigationDateFormatter(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderNextDate(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderPrevDate(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderResizerNode(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderScheduler(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderScrollable(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderTableNode(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderTimesNode(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderTriggerNode(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, schedulerDayView);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, schedulerDayView);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerDayView);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderSchedulerdayviewBodyContent(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "schedulerdayviewBodyContent", schedulerDayView.getSchedulerdayviewBodyContent());
	}

	protected void renderColDaysNode(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "colDaysNode", schedulerDayView.getColDaysNode());
	}

	protected void renderColHeaderDaysNode(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "colHeaderDaysNode", schedulerDayView.getColHeaderDaysNode());
	}

	protected void renderCssClass(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "cssClass", schedulerDayView.getCssClass());
	}

	protected void renderDays(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderNumber(responseWriter, "days", schedulerDayView.getDays());
	}

	protected void renderDelegateConfig(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderObject(responseWriter, "delegateConfig", schedulerDayView.getDelegateConfig());
	}

	protected void renderEventWidth(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderNumber(responseWriter, "eventWidth", schedulerDayView.getEventWidth());
	}

	protected void renderFilterFn(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "filterFn", schedulerDayView.getFilterFn());
	}

	protected void renderHeaderDateFormatter(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "headerDateFormatter", schedulerDayView.getHeaderDateFormatter());
	}

	protected void renderHeaderTableNode(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "headerTableNode", schedulerDayView.getHeaderTableNode());
	}

	protected void renderHeaderView(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderBoolean(responseWriter, "headerView", schedulerDayView.getHeaderView());
	}

	protected void renderHeaderViewConfig(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderObject(responseWriter, "headerViewConfig", schedulerDayView.getHeaderViewConfig());
	}

	protected void renderHeaderViewLabelNode(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "headerViewLabelNode", schedulerDayView.getHeaderViewLabelNode());
	}

	protected void renderHeight(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderNumber(responseWriter, "height", schedulerDayView.getHeight());
	}

	protected void renderHideClass(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "hideClass", schedulerDayView.getHideClass());
	}

	protected void renderHourHeight(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderNumber(responseWriter, "hourHeight", schedulerDayView.getHourHeight());
	}

	protected void renderIsoTime(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderBoolean(responseWriter, "isoTime", schedulerDayView.getIsoTime());
	}

	protected void renderMarkercellsNode(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "markercellsNode", schedulerDayView.getMarkercellsNode());
	}

	protected void renderName(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "name", schedulerDayView.getName());
	}

	protected void renderNavigationDateFormatter(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "navigationDateFormatter", schedulerDayView.getNavigationDateFormatter());
	}

	protected void renderNextDate(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "nextDate", schedulerDayView.getNextDate());
	}

	protected void renderPrevDate(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "prevDate", schedulerDayView.getPrevDate());
	}

	protected void renderRender(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "render", schedulerDayView.getRender());
	}

	protected void renderResizerNode(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "resizerNode", schedulerDayView.getResizerNode());
	}

	protected void renderScheduler(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "scheduler", schedulerDayView.getScheduler());
	}

	protected void renderScrollable(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderBoolean(responseWriter, "scrollable", schedulerDayView.getScrollable());
	}

	protected void renderStrings(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "strings", schedulerDayView.getStrings());
	}

	protected void renderTableNode(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "tableNode", schedulerDayView.getTableNode());
	}

	protected void renderTimesNode(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "timesNode", schedulerDayView.getTimesNode());
	}

	protected void renderTriggerNode(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderString(responseWriter, "triggerNode", schedulerDayView.getTriggerNode());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderBoolean(responseWriter, "useARIA", schedulerDayView.getUseARIA());
	}

	protected void renderVisible(ResponseWriter responseWriter, SchedulerDayView schedulerDayView) throws IOException {
		renderBoolean(responseWriter, "visible", schedulerDayView.getVisible());
	}

}