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
package com.liferay.faces.alloy.component.schedulertableview;

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
public abstract class SchedulerTableViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-table";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerTableView schedulerTableView = (SchedulerTableView) uiComponent;
		encodeHTML(facesContext, schedulerTableView);
		encodeJavaScript(facesContext, schedulerTableView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerTableView schedulerTableView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerTableView schedulerTableView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerTableView);

		bufferedResponseWriter.write("var schedulerTableView = new Y.SchedulerTableView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderSchedulertableviewBodyContent(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderColHeaderDaysNode(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderDisplayDaysInterval(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderDisplayRows(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderFilterFn(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderFixedHeight(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderDateFormatter(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderHeaderTableNode(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderIsoTime(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderNavigationDateFormatter(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderNextDate(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderPrevDate(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderRowsContainerNode(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderScheduler(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderScrollable(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderTableGridNode(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderTriggerNode(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, schedulerTableView);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, schedulerTableView);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerTableView);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderSchedulertableviewBodyContent(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "schedulertableviewBodyContent", schedulerTableView.getSchedulertableviewBodyContent());
	}

	protected void renderColHeaderDaysNode(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "colHeaderDaysNode", schedulerTableView.getColHeaderDaysNode());
	}

	protected void renderCssClass(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "cssClass", schedulerTableView.getCssClass());
	}

	protected void renderDisplayDaysInterval(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderNumber(responseWriter, "displayDaysInterval", schedulerTableView.getDisplayDaysInterval());
	}

	protected void renderDisplayRows(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderNumber(responseWriter, "displayRows", schedulerTableView.getDisplayRows());
	}

	protected void renderFilterFn(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "filterFn", schedulerTableView.getFilterFn());
	}

	protected void renderFixedHeight(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderBoolean(responseWriter, "fixedHeight", schedulerTableView.getFixedHeight());
	}

	protected void renderHeaderDateFormatter(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "headerDateFormatter", schedulerTableView.getHeaderDateFormatter());
	}

	protected void renderHeaderTableNode(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "headerTableNode", schedulerTableView.getHeaderTableNode());
	}

	protected void renderHeight(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderNumber(responseWriter, "height", schedulerTableView.getHeight());
	}

	protected void renderHideClass(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "hideClass", schedulerTableView.getHideClass());
	}

	protected void renderIsoTime(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderBoolean(responseWriter, "isoTime", schedulerTableView.getIsoTime());
	}

	protected void renderName(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "name", schedulerTableView.getName());
	}

	protected void renderNavigationDateFormatter(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "navigationDateFormatter", schedulerTableView.getNavigationDateFormatter());
	}

	protected void renderNextDate(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "nextDate", schedulerTableView.getNextDate());
	}

	protected void renderPrevDate(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "prevDate", schedulerTableView.getPrevDate());
	}

	protected void renderRender(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "render", schedulerTableView.getRender());
	}

	protected void renderRowsContainerNode(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "rowsContainerNode", schedulerTableView.getRowsContainerNode());
	}

	protected void renderScheduler(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "scheduler", schedulerTableView.getScheduler());
	}

	protected void renderScrollable(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderBoolean(responseWriter, "scrollable", schedulerTableView.getScrollable());
	}

	protected void renderStrings(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "strings", schedulerTableView.getStrings());
	}

	protected void renderTableGridNode(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "tableGridNode", schedulerTableView.getTableGridNode());
	}

	protected void renderTriggerNode(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderString(responseWriter, "triggerNode", schedulerTableView.getTriggerNode());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderBoolean(responseWriter, "useARIA", schedulerTableView.getUseARIA());
	}

	protected void renderVisible(ResponseWriter responseWriter, SchedulerTableView schedulerTableView) throws IOException {
		renderBoolean(responseWriter, "visible", schedulerTableView.getVisible());
	}

}