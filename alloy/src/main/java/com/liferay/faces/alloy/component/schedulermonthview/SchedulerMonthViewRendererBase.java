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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, schedulerMonthView);

		bufferedResponseWriter.write("var schedulerMonthView = new Y.SchedulerMonthView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderSchedulermonthviewBodyContent(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColHeaderDaysNode(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClass(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisplayDaysInterval(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisplayRows(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFilterFn(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFixedHeight(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderDateFormatter(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeaderTableNode(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHeight(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideClass(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIsoTime(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNavigationDateFormatter(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNextDate(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPrevDate(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRowsContainerNode(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScheduler(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScrollable(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTableGridNode(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTriggerNode(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseARIA(bufferedResponseWriter, schedulerMonthView);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, schedulerMonthView);

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