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
		renderSchedulerBaseId(renderedAttributes, schedulerBase);
		renderInitialized(renderedAttributes, schedulerBase);
		renderSchedulerBaseLocale(renderedAttributes, schedulerBase);
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterActiveViewChange(renderedAfterEvents, schedulerBase);
		renderAfterBoundingBoxChange(renderedAfterEvents, schedulerBase);
		renderAfterContentBoxChange(renderedAfterEvents, schedulerBase);
		renderAfterCssClassChange(renderedAfterEvents, schedulerBase);
		renderAfterDateChange(renderedAfterEvents, schedulerBase);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerBase);
		renderAfterDisabledChange(renderedAfterEvents, schedulerBase);
		renderAfterEventRecorderChange(renderedAfterEvents, schedulerBase);
		renderAfterFirstDayOfWeekChange(renderedAfterEvents, schedulerBase);
		renderAfterFocusedChange(renderedAfterEvents, schedulerBase);
		renderAfterHeightChange(renderedAfterEvents, schedulerBase);
		renderAfterHideClassChange(renderedAfterEvents, schedulerBase);
		renderAfterIdChange(renderedAfterEvents, schedulerBase);
		renderAfterInitializedChange(renderedAfterEvents, schedulerBase);
		renderAfterLocaleChange(renderedAfterEvents, schedulerBase);
		renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerBase);
		renderAfterRenderChange(renderedAfterEvents, schedulerBase);
		renderAfterRenderedChange(renderedAfterEvents, schedulerBase);
		renderAfterSrcNodeChange(renderedAfterEvents, schedulerBase);
		renderAfterStringsChange(renderedAfterEvents, schedulerBase);
		renderAfterTabIndexChange(renderedAfterEvents, schedulerBase);
		renderAfterTodayDateChange(renderedAfterEvents, schedulerBase);
		renderAfterUseARIAChange(renderedAfterEvents, schedulerBase);
		renderAfterViewDateChange(renderedAfterEvents, schedulerBase);
		renderAfterViewsChange(renderedAfterEvents, schedulerBase);
		renderAfterVisibleChange(renderedAfterEvents, schedulerBase);
		renderAfterWidthChange(renderedAfterEvents, schedulerBase);

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

		renderOnActiveViewChange(renderedOnEvents, schedulerBase);
		renderOnBoundingBoxChange(renderedOnEvents, schedulerBase);
		renderOnContentBoxChange(renderedOnEvents, schedulerBase);
		renderOnCssClassChange(renderedOnEvents, schedulerBase);
		renderOnDateChange(renderedOnEvents, schedulerBase);
		renderOnDestroyedChange(renderedOnEvents, schedulerBase);
		renderOnDisabledChange(renderedOnEvents, schedulerBase);
		renderOnEventRecorderChange(renderedOnEvents, schedulerBase);
		renderOnFirstDayOfWeekChange(renderedOnEvents, schedulerBase);
		renderOnFocusedChange(renderedOnEvents, schedulerBase);
		renderOnHeightChange(renderedOnEvents, schedulerBase);
		renderOnHideClassChange(renderedOnEvents, schedulerBase);
		renderOnIdChange(renderedOnEvents, schedulerBase);
		renderOnInitializedChange(renderedOnEvents, schedulerBase);
		renderOnLocaleChange(renderedOnEvents, schedulerBase);
		renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerBase);
		renderOnRenderChange(renderedOnEvents, schedulerBase);
		renderOnRenderedChange(renderedOnEvents, schedulerBase);
		renderOnSrcNodeChange(renderedOnEvents, schedulerBase);
		renderOnStringsChange(renderedOnEvents, schedulerBase);
		renderOnTabIndexChange(renderedOnEvents, schedulerBase);
		renderOnTodayDateChange(renderedOnEvents, schedulerBase);
		renderOnUseARIAChange(renderedOnEvents, schedulerBase);
		renderOnViewDateChange(renderedOnEvents, schedulerBase);
		renderOnViewsChange(renderedOnEvents, schedulerBase);
		renderOnVisibleChange(renderedOnEvents, schedulerBase);
		renderOnWidthChange(renderedOnEvents, schedulerBase);

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

	protected void renderSchedulerBaseId(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String schedulerBaseId = schedulerBase.getSchedulerBaseId();

		if (schedulerBaseId != null) {
			renderedAttributes.add(renderString(SchedulerBase.SCHEDULER_BASE_ID, schedulerBaseId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean initialized = schedulerBase.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerBase.INITIALIZED, initialized));
		}
	}

	protected void renderSchedulerBaseLocale(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String schedulerBaseLocale = schedulerBase.getSchedulerBaseLocale();

		if (schedulerBaseLocale != null) {
			renderedAttributes.add(renderString(SchedulerBase.SCHEDULER_BASE_LOCALE, schedulerBaseLocale));
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

	protected void renderAfterActiveViewChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterActiveViewChange = schedulerBase.getAfterActiveViewChange();

		if (afterActiveViewChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_ACTIVE_VIEW_CHANGE, afterActiveViewChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerBase.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterContentBoxChange = schedulerBase.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterCssClassChange = schedulerBase.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterDateChange = schedulerBase.getAfterDateChange();

		if (afterDateChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_DATE_CHANGE, afterDateChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterDestroyedChange = schedulerBase.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterDisabledChange = schedulerBase.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterEventRecorderChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterEventRecorderChange = schedulerBase.getAfterEventRecorderChange();

		if (afterEventRecorderChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_EVENT_RECORDER_CHANGE, afterEventRecorderChange));
		}
	}

	protected void renderAfterFirstDayOfWeekChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterFirstDayOfWeekChange = schedulerBase.getAfterFirstDayOfWeekChange();

		if (afterFirstDayOfWeekChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_FIRST_DAY_OF_WEEK_CHANGE, afterFirstDayOfWeekChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterFocusedChange = schedulerBase.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterHeightChange = schedulerBase.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterHideClassChange = schedulerBase.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterIdChange = schedulerBase.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterInitializedChange = schedulerBase.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterLocaleChange = schedulerBase.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerBase.getAfterNavigationDateFormatterChange();

		if (afterNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterRenderChange = schedulerBase.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterRenderedChange = schedulerBase.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerBase.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterStringsChange = schedulerBase.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterTabIndexChange = schedulerBase.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTodayDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterTodayDateChange = schedulerBase.getAfterTodayDateChange();

		if (afterTodayDateChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_TODAY_DATE_CHANGE, afterTodayDateChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterUseARIAChange = schedulerBase.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterViewDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterViewDateChange = schedulerBase.getAfterViewDateChange();

		if (afterViewDateChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_VIEW_DATE_CHANGE, afterViewDateChange));
		}
	}

	protected void renderAfterViewsChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterViewsChange = schedulerBase.getAfterViewsChange();

		if (afterViewsChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_VIEWS_CHANGE, afterViewsChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterVisibleChange = schedulerBase.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterWidthChange = schedulerBase.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnActiveViewChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onActiveViewChange = schedulerBase.getOnActiveViewChange();

		if (onActiveViewChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_ACTIVE_VIEW_CHANGE, onActiveViewChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerBase.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onContentBoxChange = schedulerBase.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onCssClassChange = schedulerBase.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onDateChange = schedulerBase.getOnDateChange();

		if (onDateChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_DATE_CHANGE, onDateChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onDestroyedChange = schedulerBase.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onDisabledChange = schedulerBase.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnEventRecorderChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onEventRecorderChange = schedulerBase.getOnEventRecorderChange();

		if (onEventRecorderChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_EVENT_RECORDER_CHANGE, onEventRecorderChange));
		}
	}

	protected void renderOnFirstDayOfWeekChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onFirstDayOfWeekChange = schedulerBase.getOnFirstDayOfWeekChange();

		if (onFirstDayOfWeekChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_FIRST_DAY_OF_WEEK_CHANGE, onFirstDayOfWeekChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onFocusedChange = schedulerBase.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onHeightChange = schedulerBase.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onHideClassChange = schedulerBase.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onIdChange = schedulerBase.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onInitializedChange = schedulerBase.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onLocaleChange = schedulerBase.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerBase.getOnNavigationDateFormatterChange();

		if (onNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onRenderChange = schedulerBase.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onRenderedChange = schedulerBase.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onSrcNodeChange = schedulerBase.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onStringsChange = schedulerBase.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onTabIndexChange = schedulerBase.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTodayDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onTodayDateChange = schedulerBase.getOnTodayDateChange();

		if (onTodayDateChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_TODAY_DATE_CHANGE, onTodayDateChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onUseARIAChange = schedulerBase.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnViewDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onViewDateChange = schedulerBase.getOnViewDateChange();

		if (onViewDateChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_VIEW_DATE_CHANGE, onViewDateChange));
		}
	}

	protected void renderOnViewsChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onViewsChange = schedulerBase.getOnViewsChange();

		if (onViewsChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_VIEWS_CHANGE, onViewsChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onVisibleChange = schedulerBase.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onWidthChange = schedulerBase.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerBase.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}