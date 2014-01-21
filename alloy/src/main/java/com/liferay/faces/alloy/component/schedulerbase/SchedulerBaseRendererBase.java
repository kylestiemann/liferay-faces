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

		if (schedulerBase.getActiveView() != null) {
			renderActiveView(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getContentBox() != null) {
			renderContentBox(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getCssClass() != null) {
			renderCssClass(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getDate() != null) {
			renderDate(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getDisabled() != null) {
			renderDisabled(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getEventRecorder() != null) {
			renderEventRecorder(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getFirstDayOfWeek() != null) {
			renderFirstDayOfWeek(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getFocused() != null) {
			renderFocused(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getHeight() != null) {
			renderHeight(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getHideClass() != null) {
			renderHideClass(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getSchedulerBaseId() != null) {
			renderSchedulerBaseId(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getInitialized() != null) {
			renderInitialized(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getSchedulerBaseLocale() != null) {
			renderSchedulerBaseLocale(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getNavigationDateFormatter() != null) {
			renderNavigationDateFormatter(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getRender() != null) {
			renderRender(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getRendered() != null) {
			renderRendered(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getStrings() != null) {
			renderStrings(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getTodayDate() != null) {
			renderTodayDate(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getViewDate() != null) {
			renderViewDate(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getViews() != null) {
			renderViews(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getVisible() != null) {
			renderVisible(renderedAttributes, schedulerBase);
		}

		if (schedulerBase.getWidth() != null) {
			renderWidth(renderedAttributes, schedulerBase);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerBase.getAfterActiveViewChange() != null) {
			renderAfterActiveViewChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterDateChange() != null) {
			renderAfterDateChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterEventRecorderChange() != null) {
			renderAfterEventRecorderChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterFirstDayOfWeekChange() != null) {
			renderAfterFirstDayOfWeekChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterNavigationDateFormatterChange() != null) {
			renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterTodayDateChange() != null) {
			renderAfterTodayDateChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterViewDateChange() != null) {
			renderAfterViewDateChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterViewsChange() != null) {
			renderAfterViewsChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, schedulerBase);
		}

		if (schedulerBase.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, schedulerBase);
		}


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

		if (schedulerBase.getOnActiveViewChange() != null) {
			renderOnActiveViewChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnDateChange() != null) {
			renderOnDateChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnEventRecorderChange() != null) {
			renderOnEventRecorderChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnFirstDayOfWeekChange() != null) {
			renderOnFirstDayOfWeekChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnNavigationDateFormatterChange() != null) {
			renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnTodayDateChange() != null) {
			renderOnTodayDateChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnViewDateChange() != null) {
			renderOnViewDateChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnViewsChange() != null) {
			renderOnViewsChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, schedulerBase);
		}

		if (schedulerBase.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, schedulerBase);
		}


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
		renderedAttributes.add(renderString(SchedulerBase.ACTIVE_VIEW, activeView));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String boundingBox = schedulerBase.getBoundingBox();
		renderedAttributes.add(renderString(SchedulerBase.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String contentBox = schedulerBase.getContentBox();
		renderedAttributes.add(renderString(SchedulerBase.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String cssClass = schedulerBase.getCssClass();
		renderedAttributes.add(renderString(SchedulerBase.CSS_CLASS, cssClass));
	}

	protected void renderDate(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object date = schedulerBase.getDate();
		renderedAttributes.add(renderString(SchedulerBase.DATE, date));
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean destroyed = schedulerBase.getDestroyed();
		renderedAttributes.add(renderBoolean(SchedulerBase.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean disabled = schedulerBase.getDisabled();
		renderedAttributes.add(renderBoolean(SchedulerBase.DISABLED, disabled));
	}

	protected void renderEventRecorder(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String eventRecorder = schedulerBase.getEventRecorder();
		renderedAttributes.add(renderString(SchedulerBase.EVENT_RECORDER, eventRecorder));
	}

	protected void renderFirstDayOfWeek(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object firstDayOfWeek = schedulerBase.getFirstDayOfWeek();
		renderedAttributes.add(renderNumber(SchedulerBase.FIRST_DAY_OF_WEEK, firstDayOfWeek));
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean focused = schedulerBase.getFocused();
		renderedAttributes.add(renderBoolean(SchedulerBase.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object height = schedulerBase.getHeight();
		renderedAttributes.add(renderString(SchedulerBase.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String hideClass = schedulerBase.getHideClass();
		renderedAttributes.add(renderString(SchedulerBase.HIDE_CLASS, hideClass));
	}

	protected void renderSchedulerBaseId(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String schedulerBaseId = schedulerBase.getSchedulerBaseId();
		renderedAttributes.add(renderString(SchedulerBase.SCHEDULER_BASE_ID, schedulerBaseId));
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean initialized = schedulerBase.getInitialized();
		renderedAttributes.add(renderBoolean(SchedulerBase.INITIALIZED, initialized));
	}

	protected void renderSchedulerBaseLocale(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String schedulerBaseLocale = schedulerBase.getSchedulerBaseLocale();
		renderedAttributes.add(renderString(SchedulerBase.SCHEDULER_BASE_LOCALE, schedulerBaseLocale));
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerBase.getNavigationDateFormatter();
		renderedAttributes.add(renderString(SchedulerBase.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object render = schedulerBase.getRender();
		renderedAttributes.add(renderString(SchedulerBase.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean rendered = schedulerBase.getRendered();
		renderedAttributes.add(renderBoolean(SchedulerBase.RENDERED, rendered));
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String srcNode = schedulerBase.getSrcNode();
		renderedAttributes.add(renderString(SchedulerBase.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object strings = schedulerBase.getStrings();
		renderedAttributes.add(renderObject(SchedulerBase.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object tabIndex = schedulerBase.getTabIndex();
		renderedAttributes.add(renderNumber(SchedulerBase.TAB_INDEX, tabIndex));
	}

	protected void renderTodayDate(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object todayDate = schedulerBase.getTodayDate();
		renderedAttributes.add(renderString(SchedulerBase.TODAY_DATE, todayDate));
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean useARIA = schedulerBase.getUseARIA();
		renderedAttributes.add(renderBoolean(SchedulerBase.USE_ARIA, useARIA));
	}

	protected void renderViewDate(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String viewDate = schedulerBase.getViewDate();
		renderedAttributes.add(renderString(SchedulerBase.VIEW_DATE, viewDate));
	}

	protected void renderViews(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String views = schedulerBase.getViews();
		renderedAttributes.add(renderString(SchedulerBase.VIEWS, views));
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Boolean visible = schedulerBase.getVisible();
		renderedAttributes.add(renderBoolean(SchedulerBase.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.Object width = schedulerBase.getWidth();
		renderedAttributes.add(renderString(SchedulerBase.WIDTH, width));
	}

	protected void renderAfterActiveViewChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterActiveViewChange = schedulerBase.getAfterActiveViewChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_ACTIVE_VIEW_CHANGE, afterActiveViewChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerBase.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterContentBoxChange = schedulerBase.getAfterContentBoxChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterCssClassChange = schedulerBase.getAfterCssClassChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterDateChange = schedulerBase.getAfterDateChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_DATE_CHANGE, afterDateChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterDestroyedChange = schedulerBase.getAfterDestroyedChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterDisabledChange = schedulerBase.getAfterDisabledChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterEventRecorderChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterEventRecorderChange = schedulerBase.getAfterEventRecorderChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_EVENT_RECORDER_CHANGE, afterEventRecorderChange));
	}

	protected void renderAfterFirstDayOfWeekChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterFirstDayOfWeekChange = schedulerBase.getAfterFirstDayOfWeekChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_FIRST_DAY_OF_WEEK_CHANGE, afterFirstDayOfWeekChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterFocusedChange = schedulerBase.getAfterFocusedChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterHeightChange = schedulerBase.getAfterHeightChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterHideClassChange = schedulerBase.getAfterHideClassChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterIdChange = schedulerBase.getAfterIdChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterInitializedChange = schedulerBase.getAfterInitializedChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterLocaleChange = schedulerBase.getAfterLocaleChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerBase.getAfterNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterRenderChange = schedulerBase.getAfterRenderChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterRenderedChange = schedulerBase.getAfterRenderedChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerBase.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterStringsChange = schedulerBase.getAfterStringsChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterTabIndexChange = schedulerBase.getAfterTabIndexChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTodayDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterTodayDateChange = schedulerBase.getAfterTodayDateChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_TODAY_DATE_CHANGE, afterTodayDateChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterUseARIAChange = schedulerBase.getAfterUseARIAChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterViewDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterViewDateChange = schedulerBase.getAfterViewDateChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_VIEW_DATE_CHANGE, afterViewDateChange));
	}

	protected void renderAfterViewsChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterViewsChange = schedulerBase.getAfterViewsChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_VIEWS_CHANGE, afterViewsChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterVisibleChange = schedulerBase.getAfterVisibleChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String afterWidthChange = schedulerBase.getAfterWidthChange();
		renderedAttributes.add(renderString(SchedulerBase.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnActiveViewChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onActiveViewChange = schedulerBase.getOnActiveViewChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_ACTIVE_VIEW_CHANGE, onActiveViewChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerBase.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onContentBoxChange = schedulerBase.getOnContentBoxChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onCssClassChange = schedulerBase.getOnCssClassChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onDateChange = schedulerBase.getOnDateChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_DATE_CHANGE, onDateChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onDestroyedChange = schedulerBase.getOnDestroyedChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onDisabledChange = schedulerBase.getOnDisabledChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnEventRecorderChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onEventRecorderChange = schedulerBase.getOnEventRecorderChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_EVENT_RECORDER_CHANGE, onEventRecorderChange));
	}

	protected void renderOnFirstDayOfWeekChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onFirstDayOfWeekChange = schedulerBase.getOnFirstDayOfWeekChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_FIRST_DAY_OF_WEEK_CHANGE, onFirstDayOfWeekChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onFocusedChange = schedulerBase.getOnFocusedChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onHeightChange = schedulerBase.getOnHeightChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onHideClassChange = schedulerBase.getOnHideClassChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onIdChange = schedulerBase.getOnIdChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onInitializedChange = schedulerBase.getOnInitializedChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onLocaleChange = schedulerBase.getOnLocaleChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerBase.getOnNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onRenderChange = schedulerBase.getOnRenderChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onRenderedChange = schedulerBase.getOnRenderedChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onSrcNodeChange = schedulerBase.getOnSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onStringsChange = schedulerBase.getOnStringsChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onTabIndexChange = schedulerBase.getOnTabIndexChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTodayDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onTodayDateChange = schedulerBase.getOnTodayDateChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_TODAY_DATE_CHANGE, onTodayDateChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onUseARIAChange = schedulerBase.getOnUseARIAChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnViewDateChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onViewDateChange = schedulerBase.getOnViewDateChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_VIEW_DATE_CHANGE, onViewDateChange));
	}

	protected void renderOnViewsChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onViewsChange = schedulerBase.getOnViewsChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_VIEWS_CHANGE, onViewsChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onVisibleChange = schedulerBase.getOnVisibleChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerBase schedulerBase) throws IOException {
		java.lang.String onWidthChange = schedulerBase.getOnWidthChange();
		renderedAttributes.add(renderString(SchedulerBase.ON_WIDTH_CHANGE, onWidthChange));
	}

}