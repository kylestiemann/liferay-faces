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
package com.liferay.faces.alloy.component.schedulerweekview;

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
public abstract class SchedulerWeekViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-week";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerWeekView schedulerWeekView = (SchedulerWeekView) uiComponent;
		encodeHTML(facesContext, schedulerWeekView);
		encodeJavaScript(facesContext, schedulerWeekView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerWeekView schedulerWeekView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerWeekView schedulerWeekView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerWeekView);

		bufferedResponseWriter.write("var schedulerWeekView = new Y.SchedulerWeekView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderSchedulerweekviewBodyContent(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderColDaysNode(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderColHeaderDaysNode(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderDays(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderDelegateConfig(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderEventWidth(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderFilterFn(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderDateFormatter(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderTableNode(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderView(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderViewConfig(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderViewLabelNode(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderHourHeight(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderIsoTime(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderMarkercellsNode(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderNavigationDateFormatter(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderNextDate(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderPrevDate(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderResizerNode(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderScheduler(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderScrollable(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderTableNode(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderTimesNode(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderTriggerNode(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, schedulerWeekView);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, schedulerWeekView);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerWeekView);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderSchedulerweekviewBodyContent(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "schedulerweekviewBodyContent", schedulerWeekView.getSchedulerweekviewBodyContent());
	}

	protected void renderColDaysNode(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "colDaysNode", schedulerWeekView.getColDaysNode());
	}

	protected void renderColHeaderDaysNode(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "colHeaderDaysNode", schedulerWeekView.getColHeaderDaysNode());
	}

	protected void renderCssClass(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "cssClass", schedulerWeekView.getCssClass());
	}

	protected void renderDays(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderNumber(responseWriter, "days", schedulerWeekView.getDays());
	}

	protected void renderDelegateConfig(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderObject(responseWriter, "delegateConfig", schedulerWeekView.getDelegateConfig());
	}

	protected void renderEventWidth(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderNumber(responseWriter, "eventWidth", schedulerWeekView.getEventWidth());
	}

	protected void renderFilterFn(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "filterFn", schedulerWeekView.getFilterFn());
	}

	protected void renderHeaderDateFormatter(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "headerDateFormatter", schedulerWeekView.getHeaderDateFormatter());
	}

	protected void renderHeaderTableNode(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "headerTableNode", schedulerWeekView.getHeaderTableNode());
	}

	protected void renderHeaderView(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderBoolean(responseWriter, "headerView", schedulerWeekView.getHeaderView());
	}

	protected void renderHeaderViewConfig(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "headerViewConfig", schedulerWeekView.getHeaderViewConfig());
	}

	protected void renderHeaderViewLabelNode(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "headerViewLabelNode", schedulerWeekView.getHeaderViewLabelNode());
	}

	protected void renderHeight(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderNumber(responseWriter, "height", schedulerWeekView.getHeight());
	}

	protected void renderHideClass(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "hideClass", schedulerWeekView.getHideClass());
	}

	protected void renderHourHeight(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderNumber(responseWriter, "hourHeight", schedulerWeekView.getHourHeight());
	}

	protected void renderIsoTime(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderBoolean(responseWriter, "isoTime", schedulerWeekView.getIsoTime());
	}

	protected void renderMarkercellsNode(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "markercellsNode", schedulerWeekView.getMarkercellsNode());
	}

	protected void renderName(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "name", schedulerWeekView.getName());
	}

	protected void renderNavigationDateFormatter(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "navigationDateFormatter", schedulerWeekView.getNavigationDateFormatter());
	}

	protected void renderNextDate(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "nextDate", schedulerWeekView.getNextDate());
	}

	protected void renderPrevDate(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "prevDate", schedulerWeekView.getPrevDate());
	}

	protected void renderRender(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "render", schedulerWeekView.getRender());
	}

	protected void renderResizerNode(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "resizerNode", schedulerWeekView.getResizerNode());
	}

	protected void renderScheduler(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "scheduler", schedulerWeekView.getScheduler());
	}

	protected void renderScrollable(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderBoolean(responseWriter, "scrollable", schedulerWeekView.getScrollable());
	}

	protected void renderStrings(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "strings", schedulerWeekView.getStrings());
	}

	protected void renderTableNode(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "tableNode", schedulerWeekView.getTableNode());
	}

	protected void renderTimesNode(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "timesNode", schedulerWeekView.getTimesNode());
	}

	protected void renderTriggerNode(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderString(responseWriter, "triggerNode", schedulerWeekView.getTriggerNode());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderBoolean(responseWriter, "useARIA", schedulerWeekView.getUseARIA());
	}

	protected void renderVisible(ResponseWriter responseWriter, SchedulerWeekView schedulerWeekView) throws IOException {
		renderBoolean(responseWriter, "visible", schedulerWeekView.getVisible());
	}

}