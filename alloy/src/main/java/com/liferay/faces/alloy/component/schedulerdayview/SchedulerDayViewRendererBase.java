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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, schedulerDayView);

		bufferedResponseWriter.write("var schedulerDayView = new Y.SchedulerDayView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderSchedulerdayviewBodyContent(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColDaysNode(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColHeaderDaysNode(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClass(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDays(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDelegateConfig(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderEventWidth(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFilterFn(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderDateFormatter(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderTableNode(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderView(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderViewConfig(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderViewLabelNode(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideClass(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHourHeight(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIsoTime(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMarkercellsNode(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNavigationDateFormatter(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNextDate(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPrevDate(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderResizerNode(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScheduler(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScrollable(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTableNode(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTimesNode(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTriggerNode(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseARIA(bufferedResponseWriter, schedulerDayView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, schedulerDayView);

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