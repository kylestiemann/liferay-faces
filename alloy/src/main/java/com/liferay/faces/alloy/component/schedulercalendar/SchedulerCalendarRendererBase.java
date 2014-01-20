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

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterColorChange(renderedAfterEvents, schedulerCalendar);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerCalendar);
		renderAfterDisabledChange(renderedAfterEvents, schedulerCalendar);
		renderAfterInitializedChange(renderedAfterEvents, schedulerCalendar);
		renderAfterNameChange(renderedAfterEvents, schedulerCalendar);
		renderAfterPaletteChange(renderedAfterEvents, schedulerCalendar);
		renderAfterSchedulerChange(renderedAfterEvents, schedulerCalendar);
		renderAfterVisibleChange(renderedAfterEvents, schedulerCalendar);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnColorChange(renderedOnEvents, schedulerCalendar);
		renderOnDestroyedChange(renderedOnEvents, schedulerCalendar);
		renderOnDisabledChange(renderedOnEvents, schedulerCalendar);
		renderOnInitializedChange(renderedOnEvents, schedulerCalendar);
		renderOnNameChange(renderedOnEvents, schedulerCalendar);
		renderOnPaletteChange(renderedOnEvents, schedulerCalendar);
		renderOnSchedulerChange(renderedOnEvents, schedulerCalendar);
		renderOnVisibleChange(renderedOnEvents, schedulerCalendar);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
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

	protected void renderAfterColorChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String afterColorChange = schedulerCalendar.getAfterColorChange();

		if (afterColorChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.AFTER_COLOR_CHANGE, afterColorChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String afterDestroyedChange = schedulerCalendar.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String afterDisabledChange = schedulerCalendar.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String afterInitializedChange = schedulerCalendar.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String afterNameChange = schedulerCalendar.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterPaletteChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String afterPaletteChange = schedulerCalendar.getAfterPaletteChange();

		if (afterPaletteChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.AFTER_PALETTE_CHANGE, afterPaletteChange));
		}
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String afterSchedulerChange = schedulerCalendar.getAfterSchedulerChange();

		if (afterSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String afterVisibleChange = schedulerCalendar.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderOnColorChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String onColorChange = schedulerCalendar.getOnColorChange();

		if (onColorChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.ON_COLOR_CHANGE, onColorChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String onDestroyedChange = schedulerCalendar.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String onDisabledChange = schedulerCalendar.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String onInitializedChange = schedulerCalendar.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String onNameChange = schedulerCalendar.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnPaletteChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String onPaletteChange = schedulerCalendar.getOnPaletteChange();

		if (onPaletteChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.ON_PALETTE_CHANGE, onPaletteChange));
		}
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String onSchedulerChange = schedulerCalendar.getOnSchedulerChange();

		if (onSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.ON_SCHEDULER_CHANGE, onSchedulerChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerCalendar schedulerCalendar) throws IOException {
		java.lang.String onVisibleChange = schedulerCalendar.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerCalendar.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

}