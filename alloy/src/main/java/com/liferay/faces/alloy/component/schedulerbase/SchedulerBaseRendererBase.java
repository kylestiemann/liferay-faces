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
public abstract class SchedulerBaseRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerBase schedulerBase = (SchedulerBase) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerBase = new A.SchedulerBase");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveView(renderedAttributes, schedulerBase);
		renderBoundingBox(renderedAttributes, schedulerBase);
		renderContentBox(renderedAttributes, schedulerBase);
		renderCssClass(renderedAttributes, schedulerBase);
		renderDate(renderedAttributes, schedulerBase);
		renderDestroyed(renderedAttributes, schedulerBase);
		renderDisabled(renderedAttributes, schedulerBase);
		renderEventRecorder(renderedAttributes, schedulerBase);
		renderFirstDayOfWeek(renderedAttributes, schedulerBase);
		renderFocused(renderedAttributes, schedulerBase);
		renderHeight(renderedAttributes, schedulerBase);
		renderHideClass(renderedAttributes, schedulerBase);
		renderSchedulerbaseId(renderedAttributes, schedulerBase);
		renderInitialized(renderedAttributes, schedulerBase);
		renderSchedulerbaseLocale(renderedAttributes, schedulerBase);
		renderNavigationDateFormatter(renderedAttributes, schedulerBase);
		renderRender(renderedAttributes, schedulerBase);
		renderRendered(renderedAttributes, schedulerBase);
		renderSrcNode(renderedAttributes, schedulerBase);
		renderStrings(renderedAttributes, schedulerBase);
		renderTabIndex(renderedAttributes, schedulerBase);
		renderTodayDate(renderedAttributes, schedulerBase);
		renderUseARIA(renderedAttributes, schedulerBase);
		renderViewDate(renderedAttributes, schedulerBase);
		renderViews(renderedAttributes, schedulerBase);
		renderVisible(renderedAttributes, schedulerBase);
		renderWidth(renderedAttributes, schedulerBase);

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

	protected void renderActiveView(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object activeView = schedulerBase.getActiveView();

		if (activeView != null) {
			renderedAttributes.add(renderString(SchedulerBase.ACTIVE_VIEW, activeView));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String boundingBox = schedulerBase.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(SchedulerBase.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String contentBox = schedulerBase.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(SchedulerBase.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String cssClass = schedulerBase.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(SchedulerBase.CSS_CLASS, cssClass));
		}
	}

	protected void renderDate(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object date = schedulerBase.getDate();

		if (date != null) {
			renderedAttributes.add(renderString(SchedulerBase.DATE, date));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean destroyed = schedulerBase.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerBase.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean disabled = schedulerBase.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerBase.DISABLED, disabled));
		}
	}

	protected void renderEventRecorder(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String eventRecorder = schedulerBase.getEventRecorder();

		if (eventRecorder != null) {
			renderedAttributes.add(renderString(SchedulerBase.EVENT_RECORDER, eventRecorder));
		}
	}

	protected void renderFirstDayOfWeek(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object firstDayOfWeek = schedulerBase.getFirstDayOfWeek();

		if (firstDayOfWeek != null) {
			renderedAttributes.add(renderNumber(SchedulerBase.FIRST_DAY_OF_WEEK, firstDayOfWeek));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean focused = schedulerBase.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(SchedulerBase.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object height = schedulerBase.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(SchedulerBase.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String hideClass = schedulerBase.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(SchedulerBase.HIDE_CLASS, hideClass));
		}
	}

	protected void renderSchedulerbaseId(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String schedulerbaseId = schedulerBase.getSchedulerbaseId();

		if (schedulerbaseId != null) {
			renderedAttributes.add(renderString(SchedulerBase.SCHEDULERBASE_ID, schedulerbaseId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean initialized = schedulerBase.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerBase.INITIALIZED, initialized));
		}
	}

	protected void renderSchedulerbaseLocale(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String schedulerbaseLocale = schedulerBase.getSchedulerbaseLocale();

		if (schedulerbaseLocale != null) {
			renderedAttributes.add(renderString(SchedulerBase.SCHEDULERBASE_LOCALE, schedulerbaseLocale));
		}
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerBase.getNavigationDateFormatter();

		if (navigationDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerBase.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
		}
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object render = schedulerBase.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(SchedulerBase.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean rendered = schedulerBase.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(SchedulerBase.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String srcNode = schedulerBase.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(SchedulerBase.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object strings = schedulerBase.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(SchedulerBase.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object tabIndex = schedulerBase.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(SchedulerBase.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTodayDate(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object todayDate = schedulerBase.getTodayDate();

		if (todayDate != null) {
			renderedAttributes.add(renderString(SchedulerBase.TODAY_DATE, todayDate));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean useARIA = schedulerBase.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(SchedulerBase.USE_ARIA, useARIA));
		}
	}

	protected void renderViewDate(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String viewDate = schedulerBase.getViewDate();

		if (viewDate != null) {
			renderedAttributes.add(renderString(SchedulerBase.VIEW_DATE, viewDate));
		}
	}

	protected void renderViews(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String views = schedulerBase.getViews();

		if (views != null) {
			renderedAttributes.add(renderString(SchedulerBase.VIEWS, views));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean visible = schedulerBase.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerBase.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object width = schedulerBase.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(SchedulerBase.WIDTH, width));
		}
	}

}