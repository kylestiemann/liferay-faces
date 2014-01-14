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
package com.liferay.faces.alloy.component.schedulerview;

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
public abstract class SchedulerViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base-view";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SchedulerView schedulerView = (SchedulerView) uiComponent;
		encodeHTML(facesContext, schedulerView);
		encodeJavaScript(facesContext, schedulerView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerView schedulerView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerView schedulerView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerView);

		bufferedResponseWriter.write("var schedulerView = new Y.SchedulerView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderSchedulerviewBodyContent(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderFilterFn(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderIsoTime(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderNavigationDateFormatter(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderNextDate(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderPrevDate(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderScheduler(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderScrollable(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderTriggerNode(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, schedulerView);
		responseWriter.write(StringPool.COMMA);
		renderVisible(responseWriter, schedulerView);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, schedulerView);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderSchedulerviewBodyContent(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "schedulerviewBodyContent", schedulerView.getSchedulerviewBodyContent());
	}

	protected void renderCssClass(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "cssClass", schedulerView.getCssClass());
	}

	protected void renderFilterFn(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "filterFn", schedulerView.getFilterFn());
	}

	protected void renderHeight(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderNumber(responseWriter, "height", schedulerView.getHeight());
	}

	protected void renderHideClass(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "hideClass", schedulerView.getHideClass());
	}

	protected void renderIsoTime(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderBoolean(responseWriter, "isoTime", schedulerView.getIsoTime());
	}

	protected void renderName(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "name", schedulerView.getName());
	}

	protected void renderNavigationDateFormatter(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "navigationDateFormatter", schedulerView.getNavigationDateFormatter());
	}

	protected void renderNextDate(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "nextDate", schedulerView.getNextDate());
	}

	protected void renderPrevDate(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "prevDate", schedulerView.getPrevDate());
	}

	protected void renderRender(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "render", schedulerView.getRender());
	}

	protected void renderScheduler(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "scheduler", schedulerView.getScheduler());
	}

	protected void renderScrollable(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderBoolean(responseWriter, "scrollable", schedulerView.getScrollable());
	}

	protected void renderTriggerNode(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderString(responseWriter, "triggerNode", schedulerView.getTriggerNode());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderBoolean(responseWriter, "useARIA", schedulerView.getUseARIA());
	}

	protected void renderVisible(ResponseWriter responseWriter, SchedulerView schedulerView) throws IOException {
		renderBoolean(responseWriter, "visible", schedulerView.getVisible());
	}

}