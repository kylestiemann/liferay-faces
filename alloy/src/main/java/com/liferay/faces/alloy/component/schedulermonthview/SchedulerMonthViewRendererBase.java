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
package com.liferay.faces.alloy.component.schedulermonthview;

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
public abstract class SchedulerMonthViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-month";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerMonthView schedulerMonthView = (SchedulerMonthView) uiComponent;
		encodeHTML(facesContext, schedulerMonthView);
		encodeJavaScript(facesContext, schedulerMonthView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerMonthView schedulerMonthView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerMonthView schedulerMonthView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerMonthView);

		bufferedResponseWriter.write("var schedulerMonthView = new Y.SchedulerMonthView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderSchedulermonthviewBodyContent(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderColHeaderDaysNode(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderDisplayDaysInterval(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderDisplayRows(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderFilterFn(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderFixedHeight(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderDateFormatter(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderTableNode(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderIsoTime(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderNavigationDateFormatter(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderNextDate(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderPrevDate(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderRowsContainerNode(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderScheduler(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderScrollable(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderTableGridNode(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderTriggerNode(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, schedulerMonthView);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, schedulerMonthView);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerMonthView);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderSchedulermonthviewBodyContent(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "schedulermonthviewBodyContent", schedulerMonthView.getSchedulermonthviewBodyContent());
	}

	protected void renderColHeaderDaysNode(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "colHeaderDaysNode", schedulerMonthView.getColHeaderDaysNode());
	}

	protected void renderCssClass(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "cssClass", schedulerMonthView.getCssClass());
	}

	protected void renderDisplayDaysInterval(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderNumber(responseWriter, "displayDaysInterval", schedulerMonthView.getDisplayDaysInterval());
	}

	protected void renderDisplayRows(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderNumber(responseWriter, "displayRows", schedulerMonthView.getDisplayRows());
	}

	protected void renderFilterFn(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "filterFn", schedulerMonthView.getFilterFn());
	}

	protected void renderFixedHeight(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderBoolean(responseWriter, "fixedHeight", schedulerMonthView.getFixedHeight());
	}

	protected void renderHeaderDateFormatter(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "headerDateFormatter", schedulerMonthView.getHeaderDateFormatter());
	}

	protected void renderHeaderTableNode(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "headerTableNode", schedulerMonthView.getHeaderTableNode());
	}

	protected void renderHeight(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderNumber(responseWriter, "height", schedulerMonthView.getHeight());
	}

	protected void renderHideClass(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "hideClass", schedulerMonthView.getHideClass());
	}

	protected void renderIsoTime(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderBoolean(responseWriter, "isoTime", schedulerMonthView.getIsoTime());
	}

	protected void renderName(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "name", schedulerMonthView.getName());
	}

	protected void renderNavigationDateFormatter(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "navigationDateFormatter", schedulerMonthView.getNavigationDateFormatter());
	}

	protected void renderNextDate(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "nextDate", schedulerMonthView.getNextDate());
	}

	protected void renderPrevDate(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "prevDate", schedulerMonthView.getPrevDate());
	}

	protected void renderRender(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "render", schedulerMonthView.getRender());
	}

	protected void renderRowsContainerNode(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "rowsContainerNode", schedulerMonthView.getRowsContainerNode());
	}

	protected void renderScheduler(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "scheduler", schedulerMonthView.getScheduler());
	}

	protected void renderScrollable(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderBoolean(responseWriter, "scrollable", schedulerMonthView.getScrollable());
	}

	protected void renderStrings(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "strings", schedulerMonthView.getStrings());
	}

	protected void renderTableGridNode(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "tableGridNode", schedulerMonthView.getTableGridNode());
	}

	protected void renderTriggerNode(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderString(responseWriter, "triggerNode", schedulerMonthView.getTriggerNode());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderBoolean(responseWriter, "useARIA", schedulerMonthView.getUseARIA());
	}

	protected void renderVisible(ResponseWriter responseWriter, SchedulerMonthView schedulerMonthView) throws IOException {
		renderBoolean(responseWriter, "visible", schedulerMonthView.getVisible());
	}

}