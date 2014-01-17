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
package com.liferay.faces.alloy.component.schedulercalendar;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SchedulerCalendarRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base-calendar";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerCalendar schedulerCalendar = (SchedulerCalendar) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerCalendar = new A.SchedulerCalendar");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderColor(renderedAttributes, schedulerCalendar);
		renderDestroyed(renderedAttributes, schedulerCalendar);
		renderDisabled(renderedAttributes, schedulerCalendar);
		renderInitialized(renderedAttributes, schedulerCalendar);
		renderName(renderedAttributes, schedulerCalendar);
		renderPalette(renderedAttributes, schedulerCalendar);
		renderScheduler(renderedAttributes, schedulerCalendar);
		renderVisible(renderedAttributes, schedulerCalendar);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderColor(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String color = schedulerCalendar.getColor();

		if (color != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.COLOR, color));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.Boolean destroyed = schedulerCalendar.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerCalendar.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.Boolean disabled = schedulerCalendar.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerCalendar.DISABLED, disabled));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.Boolean initialized = schedulerCalendar.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerCalendar.INITIALIZED, initialized));
		}
	}

	protected void renderName(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String name = schedulerCalendar.getName();

		if (name != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.NAME, name));
		}
	}

	protected void renderPalette(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.Object palette = schedulerCalendar.getPalette();

		if (palette != null) {
			renderedAttributes.add(renderArray(SchedulerCalendar.PALETTE, palette));
		}
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String scheduler = schedulerCalendar.getScheduler();

		if (scheduler != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.SCHEDULER, scheduler));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.Boolean visible = schedulerCalendar.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerCalendar.VISIBLE, visible));
		}
	}

}