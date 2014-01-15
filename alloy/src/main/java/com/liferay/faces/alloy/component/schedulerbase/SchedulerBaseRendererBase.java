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
import java.util.ArrayList;
import java.util.Iterator;

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

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SchedulerBase schedulerBase = (SchedulerBase) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var schedulerBase = new A.SchedulerBase");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActiveView(renrederedAttributes, schedulerBase);
		renderBoundingBox(renrederedAttributes, schedulerBase);
		renderContentBox(renrederedAttributes, schedulerBase);
		renderCssClass(renrederedAttributes, schedulerBase);
		renderDate(renrederedAttributes, schedulerBase);
		renderDestroyed(renrederedAttributes, schedulerBase);
		renderDisabled(renrederedAttributes, schedulerBase);
		renderEventRecorder(renrederedAttributes, schedulerBase);
		renderFirstDayOfWeek(renrederedAttributes, schedulerBase);
		renderFocused(renrederedAttributes, schedulerBase);
		renderHeight(renrederedAttributes, schedulerBase);
		renderHideClass(renrederedAttributes, schedulerBase);
		renderSchedulerbaseId(renrederedAttributes, schedulerBase);
		renderInitialized(renrederedAttributes, schedulerBase);
		renderSchedulerbaseLocale(renrederedAttributes, schedulerBase);
		renderNavigationDateFormatter(renrederedAttributes, schedulerBase);
		renderRender(renrederedAttributes, schedulerBase);
		renderRendered(renrederedAttributes, schedulerBase);
		renderSrcNode(renrederedAttributes, schedulerBase);
		renderStrings(renrederedAttributes, schedulerBase);
		renderTabIndex(renrederedAttributes, schedulerBase);
		renderTodayDate(renrederedAttributes, schedulerBase);
		renderUseARIA(renrederedAttributes, schedulerBase);
		renderViewDate(renrederedAttributes, schedulerBase);
		renderViews(renrederedAttributes, schedulerBase);
		renderVisible(renrederedAttributes, schedulerBase);
		renderWidth(renrederedAttributes, schedulerBase);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveView(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getActiveView() != null) {
			renrederedAttributes.add(renderString("activeView", schedulerBase.getActiveView()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", schedulerBase.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", schedulerBase.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", schedulerBase.getCssClass()));
		}
	}

	protected void renderDate(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getDate() != null) {
			renrederedAttributes.add(renderString("date", schedulerBase.getDate()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", schedulerBase.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", schedulerBase.getDisabled()));
		}
	}

	protected void renderEventRecorder(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getEventRecorder() != null) {
			renrederedAttributes.add(renderString("eventRecorder", schedulerBase.getEventRecorder()));
		}
	}

	protected void renderFirstDayOfWeek(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getFirstDayOfWeek() != null) {
			renrederedAttributes.add(renderNumber("firstDayOfWeek", schedulerBase.getFirstDayOfWeek()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", schedulerBase.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getHeight() != null) {
			renrederedAttributes.add(renderString("height", schedulerBase.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", schedulerBase.getHideClass()));
		}
	}

	protected void renderSchedulerbaseId(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getSchedulerbaseId() != null) {
			renrederedAttributes.add(renderString("schedulerbaseId", schedulerBase.getSchedulerbaseId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", schedulerBase.getInitialized()));
		}
	}

	protected void renderSchedulerbaseLocale(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getSchedulerbaseLocale() != null) {
			renrederedAttributes.add(renderString("schedulerbaseLocale", schedulerBase.getSchedulerbaseLocale()));
		}
	}

	protected void renderNavigationDateFormatter(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getNavigationDateFormatter() != null) {
			renrederedAttributes.add(renderString("navigationDateFormatter", schedulerBase.getNavigationDateFormatter()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getRender() != null) {
			renrederedAttributes.add(renderString("render", schedulerBase.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", schedulerBase.getRendered()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", schedulerBase.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", schedulerBase.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", schedulerBase.getTabIndex()));
		}
	}

	protected void renderTodayDate(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getTodayDate() != null) {
			renrederedAttributes.add(renderString("todayDate", schedulerBase.getTodayDate()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", schedulerBase.getUseARIA()));
		}
	}

	protected void renderViewDate(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getViewDate() != null) {
			renrederedAttributes.add(renderString("viewDate", schedulerBase.getViewDate()));
		}
	}

	protected void renderViews(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getViews() != null) {
			renrederedAttributes.add(renderString("views", schedulerBase.getViews()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", schedulerBase.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, SchedulerBase schedulerBase) throws IOException {
		if (schedulerBase.getWidth() != null) {
			renrederedAttributes.add(renderString("width", schedulerBase.getWidth()));
		}
	}

}