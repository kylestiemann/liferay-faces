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
package com.liferay.faces.alloy.component.schedulerdayview;

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
public abstract class SchedulerDayViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-day";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerDayView schedulerDayView = (SchedulerDayView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerDayView = new A.SchedulerDayView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderSchedulerDayViewBodyContent(renderedAttributes, schedulerDayView);
		renderBoundingBox(renderedAttributes, schedulerDayView);
		renderColDaysNode(renderedAttributes, schedulerDayView);
		renderColHeaderDaysNode(renderedAttributes, schedulerDayView);
		renderContentBox(renderedAttributes, schedulerDayView);
		renderCssClass(renderedAttributes, schedulerDayView);
		renderDays(renderedAttributes, schedulerDayView);
		renderDelegateConfig(renderedAttributes, schedulerDayView);
		renderDestroyed(renderedAttributes, schedulerDayView);
		renderDisabled(renderedAttributes, schedulerDayView);
		renderEventWidth(renderedAttributes, schedulerDayView);
		renderFilterFn(renderedAttributes, schedulerDayView);
		renderFocused(renderedAttributes, schedulerDayView);
		renderHeaderDateFormatter(renderedAttributes, schedulerDayView);
		renderHeaderTableNode(renderedAttributes, schedulerDayView);
		renderHeaderView(renderedAttributes, schedulerDayView);
		renderHeaderViewConfig(renderedAttributes, schedulerDayView);
		renderHeaderViewLabelNode(renderedAttributes, schedulerDayView);
		renderHeight(renderedAttributes, schedulerDayView);
		renderHideClass(renderedAttributes, schedulerDayView);
		renderHourHeight(renderedAttributes, schedulerDayView);
		renderSchedulerDayViewId(renderedAttributes, schedulerDayView);
		renderInitialized(renderedAttributes, schedulerDayView);
		renderIsoTime(renderedAttributes, schedulerDayView);
		renderSchedulerDayViewLocale(renderedAttributes, schedulerDayView);
		renderMarkercellsNode(renderedAttributes, schedulerDayView);
		renderName(renderedAttributes, schedulerDayView);
		renderNavigationDateFormatter(renderedAttributes, schedulerDayView);
		renderNextDate(renderedAttributes, schedulerDayView);
		renderPrevDate(renderedAttributes, schedulerDayView);
		renderRender(renderedAttributes, schedulerDayView);
		renderRendered(renderedAttributes, schedulerDayView);
		renderResizerNode(renderedAttributes, schedulerDayView);
		renderScheduler(renderedAttributes, schedulerDayView);
		renderScrollable(renderedAttributes, schedulerDayView);
		renderSrcNode(renderedAttributes, schedulerDayView);
		renderStrings(renderedAttributes, schedulerDayView);
		renderTabIndex(renderedAttributes, schedulerDayView);
		renderTableNode(renderedAttributes, schedulerDayView);
		renderTimesNode(renderedAttributes, schedulerDayView);
		renderTriggerNode(renderedAttributes, schedulerDayView);
		renderUseARIA(renderedAttributes, schedulerDayView);
		renderVisible(renderedAttributes, schedulerDayView);
		renderWidth(renderedAttributes, schedulerDayView);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBodyContentChange(renderedAfterEvents, schedulerDayView);
		renderAfterBoundingBoxChange(renderedAfterEvents, schedulerDayView);
		renderAfterColDaysNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterColHeaderDaysNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterContentBoxChange(renderedAfterEvents, schedulerDayView);
		renderAfterCssClassChange(renderedAfterEvents, schedulerDayView);
		renderAfterDaysChange(renderedAfterEvents, schedulerDayView);
		renderAfterDelegateConfigChange(renderedAfterEvents, schedulerDayView);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerDayView);
		renderAfterDisabledChange(renderedAfterEvents, schedulerDayView);
		renderAfterEventWidthChange(renderedAfterEvents, schedulerDayView);
		renderAfterFilterFnChange(renderedAfterEvents, schedulerDayView);
		renderAfterFocusedChange(renderedAfterEvents, schedulerDayView);
		renderAfterHeaderDateFormatterChange(renderedAfterEvents, schedulerDayView);
		renderAfterHeaderTableNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterHeaderViewChange(renderedAfterEvents, schedulerDayView);
		renderAfterHeaderViewConfigChange(renderedAfterEvents, schedulerDayView);
		renderAfterHeaderViewLabelNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterHeightChange(renderedAfterEvents, schedulerDayView);
		renderAfterHideClassChange(renderedAfterEvents, schedulerDayView);
		renderAfterHourHeightChange(renderedAfterEvents, schedulerDayView);
		renderAfterIdChange(renderedAfterEvents, schedulerDayView);
		renderAfterInitializedChange(renderedAfterEvents, schedulerDayView);
		renderAfterIsoTimeChange(renderedAfterEvents, schedulerDayView);
		renderAfterLocaleChange(renderedAfterEvents, schedulerDayView);
		renderAfterMarkercellsNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterNameChange(renderedAfterEvents, schedulerDayView);
		renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerDayView);
		renderAfterNextDateChange(renderedAfterEvents, schedulerDayView);
		renderAfterPrevDateChange(renderedAfterEvents, schedulerDayView);
		renderAfterRenderChange(renderedAfterEvents, schedulerDayView);
		renderAfterRenderedChange(renderedAfterEvents, schedulerDayView);
		renderAfterResizerNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterSchedulerChange(renderedAfterEvents, schedulerDayView);
		renderAfterScrollableChange(renderedAfterEvents, schedulerDayView);
		renderAfterSrcNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterStringsChange(renderedAfterEvents, schedulerDayView);
		renderAfterTabIndexChange(renderedAfterEvents, schedulerDayView);
		renderAfterTableNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterTimesNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterTriggerNodeChange(renderedAfterEvents, schedulerDayView);
		renderAfterUseARIAChange(renderedAfterEvents, schedulerDayView);
		renderAfterVisibleChange(renderedAfterEvents, schedulerDayView);
		renderAfterWidthChange(renderedAfterEvents, schedulerDayView);

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

		renderOnBodyContentChange(renderedOnEvents, schedulerDayView);
		renderOnBoundingBoxChange(renderedOnEvents, schedulerDayView);
		renderOnColDaysNodeChange(renderedOnEvents, schedulerDayView);
		renderOnColHeaderDaysNodeChange(renderedOnEvents, schedulerDayView);
		renderOnContentBoxChange(renderedOnEvents, schedulerDayView);
		renderOnCssClassChange(renderedOnEvents, schedulerDayView);
		renderOnDaysChange(renderedOnEvents, schedulerDayView);
		renderOnDelegateConfigChange(renderedOnEvents, schedulerDayView);
		renderOnDestroyedChange(renderedOnEvents, schedulerDayView);
		renderOnDisabledChange(renderedOnEvents, schedulerDayView);
		renderOnEventWidthChange(renderedOnEvents, schedulerDayView);
		renderOnFilterFnChange(renderedOnEvents, schedulerDayView);
		renderOnFocusedChange(renderedOnEvents, schedulerDayView);
		renderOnHeaderDateFormatterChange(renderedOnEvents, schedulerDayView);
		renderOnHeaderTableNodeChange(renderedOnEvents, schedulerDayView);
		renderOnHeaderViewChange(renderedOnEvents, schedulerDayView);
		renderOnHeaderViewConfigChange(renderedOnEvents, schedulerDayView);
		renderOnHeaderViewLabelNodeChange(renderedOnEvents, schedulerDayView);
		renderOnHeightChange(renderedOnEvents, schedulerDayView);
		renderOnHideClassChange(renderedOnEvents, schedulerDayView);
		renderOnHourHeightChange(renderedOnEvents, schedulerDayView);
		renderOnIdChange(renderedOnEvents, schedulerDayView);
		renderOnInitializedChange(renderedOnEvents, schedulerDayView);
		renderOnIsoTimeChange(renderedOnEvents, schedulerDayView);
		renderOnLocaleChange(renderedOnEvents, schedulerDayView);
		renderOnMarkercellsNodeChange(renderedOnEvents, schedulerDayView);
		renderOnNameChange(renderedOnEvents, schedulerDayView);
		renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerDayView);
		renderOnNextDateChange(renderedOnEvents, schedulerDayView);
		renderOnPrevDateChange(renderedOnEvents, schedulerDayView);
		renderOnRenderChange(renderedOnEvents, schedulerDayView);
		renderOnRenderedChange(renderedOnEvents, schedulerDayView);
		renderOnResizerNodeChange(renderedOnEvents, schedulerDayView);
		renderOnSchedulerChange(renderedOnEvents, schedulerDayView);
		renderOnScrollableChange(renderedOnEvents, schedulerDayView);
		renderOnSrcNodeChange(renderedOnEvents, schedulerDayView);
		renderOnStringsChange(renderedOnEvents, schedulerDayView);
		renderOnTabIndexChange(renderedOnEvents, schedulerDayView);
		renderOnTableNodeChange(renderedOnEvents, schedulerDayView);
		renderOnTimesNodeChange(renderedOnEvents, schedulerDayView);
		renderOnTriggerNodeChange(renderedOnEvents, schedulerDayView);
		renderOnUseARIAChange(renderedOnEvents, schedulerDayView);
		renderOnVisibleChange(renderedOnEvents, schedulerDayView);
		renderOnWidthChange(renderedOnEvents, schedulerDayView);

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

	protected void renderSchedulerDayViewBodyContent(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String schedulerDayViewBodyContent = schedulerDayView.getSchedulerDayViewBodyContent();

		if (schedulerDayViewBodyContent != null) {
			renderedAttributes.add(renderString(SchedulerDayView.SCHEDULER_DAY_VIEW_BODY_CONTENT, schedulerDayViewBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String boundingBox = schedulerDayView.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(SchedulerDayView.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderColDaysNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String colDaysNode = schedulerDayView.getColDaysNode();

		if (colDaysNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.COL_DAYS_NODE, colDaysNode));
		}
	}

	protected void renderColHeaderDaysNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String colHeaderDaysNode = schedulerDayView.getColHeaderDaysNode();

		if (colHeaderDaysNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.COL_HEADER_DAYS_NODE, colHeaderDaysNode));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String contentBox = schedulerDayView.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(SchedulerDayView.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String cssClass = schedulerDayView.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(SchedulerDayView.CSS_CLASS, cssClass));
		}
	}

	protected void renderDays(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object days = schedulerDayView.getDays();

		if (days != null) {
			renderedAttributes.add(renderNumber(SchedulerDayView.DAYS, days));
		}
	}

	protected void renderDelegateConfig(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object delegateConfig = schedulerDayView.getDelegateConfig();

		if (delegateConfig != null) {
			renderedAttributes.add(renderObject(SchedulerDayView.DELEGATE_CONFIG, delegateConfig));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean destroyed = schedulerDayView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean disabled = schedulerDayView.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.DISABLED, disabled));
		}
	}

	protected void renderEventWidth(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object eventWidth = schedulerDayView.getEventWidth();

		if (eventWidth != null) {
			renderedAttributes.add(renderNumber(SchedulerDayView.EVENT_WIDTH, eventWidth));
		}
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String filterFn = schedulerDayView.getFilterFn();

		if (filterFn != null) {
			renderedAttributes.add(renderString(SchedulerDayView.FILTER_FN, filterFn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean focused = schedulerDayView.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.FOCUSED, focused));
		}
	}

	protected void renderHeaderDateFormatter(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String headerDateFormatter = schedulerDayView.getHeaderDateFormatter();

		if (headerDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerDayView.HEADER_DATE_FORMATTER, headerDateFormatter));
		}
	}

	protected void renderHeaderTableNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String headerTableNode = schedulerDayView.getHeaderTableNode();

		if (headerTableNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.HEADER_TABLE_NODE, headerTableNode));
		}
	}

	protected void renderHeaderView(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean headerView = schedulerDayView.getHeaderView();

		if (headerView != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.HEADER_VIEW, headerView));
		}
	}

	protected void renderHeaderViewConfig(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object headerViewConfig = schedulerDayView.getHeaderViewConfig();

		if (headerViewConfig != null) {
			renderedAttributes.add(renderObject(SchedulerDayView.HEADER_VIEW_CONFIG, headerViewConfig));
		}
	}

	protected void renderHeaderViewLabelNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String headerViewLabelNode = schedulerDayView.getHeaderViewLabelNode();

		if (headerViewLabelNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.HEADER_VIEW_LABEL_NODE, headerViewLabelNode));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object height = schedulerDayView.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(SchedulerDayView.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String hideClass = schedulerDayView.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(SchedulerDayView.HIDE_CLASS, hideClass));
		}
	}

	protected void renderHourHeight(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object hourHeight = schedulerDayView.getHourHeight();

		if (hourHeight != null) {
			renderedAttributes.add(renderNumber(SchedulerDayView.HOUR_HEIGHT, hourHeight));
		}
	}

	protected void renderSchedulerDayViewId(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String schedulerDayViewId = schedulerDayView.getSchedulerDayViewId();

		if (schedulerDayViewId != null) {
			renderedAttributes.add(renderString(SchedulerDayView.SCHEDULER_DAY_VIEW_ID, schedulerDayViewId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean initialized = schedulerDayView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.INITIALIZED, initialized));
		}
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean isoTime = schedulerDayView.getIsoTime();

		if (isoTime != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.ISO_TIME, isoTime));
		}
	}

	protected void renderSchedulerDayViewLocale(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String schedulerDayViewLocale = schedulerDayView.getSchedulerDayViewLocale();

		if (schedulerDayViewLocale != null) {
			renderedAttributes.add(renderString(SchedulerDayView.SCHEDULER_DAY_VIEW_LOCALE, schedulerDayViewLocale));
		}
	}

	protected void renderMarkercellsNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String markercellsNode = schedulerDayView.getMarkercellsNode();

		if (markercellsNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.MARKERCELLS_NODE, markercellsNode));
		}
	}

	protected void renderName(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String name = schedulerDayView.getName();

		if (name != null) {
			renderedAttributes.add(renderString(SchedulerDayView.NAME, name));
		}
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerDayView.getNavigationDateFormatter();

		if (navigationDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerDayView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
		}
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String nextDate = schedulerDayView.getNextDate();

		if (nextDate != null) {
			renderedAttributes.add(renderString(SchedulerDayView.NEXT_DATE, nextDate));
		}
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String prevDate = schedulerDayView.getPrevDate();

		if (prevDate != null) {
			renderedAttributes.add(renderString(SchedulerDayView.PREV_DATE, prevDate));
		}
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object render = schedulerDayView.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(SchedulerDayView.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean rendered = schedulerDayView.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.RENDERED, rendered));
		}
	}

	protected void renderResizerNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String resizerNode = schedulerDayView.getResizerNode();

		if (resizerNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.RESIZER_NODE, resizerNode));
		}
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String scheduler = schedulerDayView.getScheduler();

		if (scheduler != null) {
			renderedAttributes.add(renderString(SchedulerDayView.SCHEDULER, scheduler));
		}
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean scrollable = schedulerDayView.getScrollable();

		if (scrollable != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.SCROLLABLE, scrollable));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String srcNode = schedulerDayView.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String strings = schedulerDayView.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderString(SchedulerDayView.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object tabIndex = schedulerDayView.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(SchedulerDayView.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTableNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String tableNode = schedulerDayView.getTableNode();

		if (tableNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.TABLE_NODE, tableNode));
		}
	}

	protected void renderTimesNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String timesNode = schedulerDayView.getTimesNode();

		if (timesNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.TIMES_NODE, timesNode));
		}
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String triggerNode = schedulerDayView.getTriggerNode();

		if (triggerNode != null) {
			renderedAttributes.add(renderString(SchedulerDayView.TRIGGER_NODE, triggerNode));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean useARIA = schedulerDayView.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean visible = schedulerDayView.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerDayView.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object width = schedulerDayView.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(SchedulerDayView.WIDTH, width));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerDayView.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerDayView.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterColDaysNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterColDaysNodeChange = schedulerDayView.getAfterColDaysNodeChange();

		if (afterColDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_COL_DAYS_NODE_CHANGE, afterColDaysNodeChange));
		}
	}

	protected void renderAfterColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterColHeaderDaysNodeChange = schedulerDayView.getAfterColHeaderDaysNodeChange();

		if (afterColHeaderDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_COL_HEADER_DAYS_NODE_CHANGE, afterColHeaderDaysNodeChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerDayView.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterCssClassChange = schedulerDayView.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDaysChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterDaysChange = schedulerDayView.getAfterDaysChange();

		if (afterDaysChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_DAYS_CHANGE, afterDaysChange));
		}
	}

	protected void renderAfterDelegateConfigChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterDelegateConfigChange = schedulerDayView.getAfterDelegateConfigChange();

		if (afterDelegateConfigChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerDayView.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterDisabledChange = schedulerDayView.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterEventWidthChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterEventWidthChange = schedulerDayView.getAfterEventWidthChange();

		if (afterEventWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_EVENT_WIDTH_CHANGE, afterEventWidthChange));
		}
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerDayView.getAfterFilterFnChange();

		if (afterFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterFocusedChange = schedulerDayView.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderDateFormatterChange = schedulerDayView.getAfterHeaderDateFormatterChange();

		if (afterHeaderDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_DATE_FORMATTER_CHANGE, afterHeaderDateFormatterChange));
		}
	}

	protected void renderAfterHeaderTableNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderTableNodeChange = schedulerDayView.getAfterHeaderTableNodeChange();

		if (afterHeaderTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_TABLE_NODE_CHANGE, afterHeaderTableNodeChange));
		}
	}

	protected void renderAfterHeaderViewChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderViewChange = schedulerDayView.getAfterHeaderViewChange();

		if (afterHeaderViewChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_VIEW_CHANGE, afterHeaderViewChange));
		}
	}

	protected void renderAfterHeaderViewConfigChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderViewConfigChange = schedulerDayView.getAfterHeaderViewConfigChange();

		if (afterHeaderViewConfigChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_VIEW_CONFIG_CHANGE, afterHeaderViewConfigChange));
		}
	}

	protected void renderAfterHeaderViewLabelNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderViewLabelNodeChange = schedulerDayView.getAfterHeaderViewLabelNodeChange();

		if (afterHeaderViewLabelNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_VIEW_LABEL_NODE_CHANGE, afterHeaderViewLabelNodeChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeightChange = schedulerDayView.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHideClassChange = schedulerDayView.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterHourHeightChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHourHeightChange = schedulerDayView.getAfterHourHeightChange();

		if (afterHourHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_HOUR_HEIGHT_CHANGE, afterHourHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterIdChange = schedulerDayView.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterInitializedChange = schedulerDayView.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerDayView.getAfterIsoTimeChange();

		if (afterIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterLocaleChange = schedulerDayView.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMarkercellsNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterMarkercellsNodeChange = schedulerDayView.getAfterMarkercellsNodeChange();

		if (afterMarkercellsNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_MARKERCELLS_NODE_CHANGE, afterMarkercellsNodeChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterNameChange = schedulerDayView.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerDayView.getAfterNavigationDateFormatterChange();

		if (afterNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
		}
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterNextDateChange = schedulerDayView.getAfterNextDateChange();

		if (afterNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
		}
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerDayView.getAfterPrevDateChange();

		if (afterPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterRenderChange = schedulerDayView.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterRenderedChange = schedulerDayView.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterResizerNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterResizerNodeChange = schedulerDayView.getAfterResizerNodeChange();

		if (afterResizerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_RESIZER_NODE_CHANGE, afterResizerNodeChange));
		}
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerDayView.getAfterSchedulerChange();

		if (afterSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
		}
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterScrollableChange = schedulerDayView.getAfterScrollableChange();

		if (afterScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerDayView.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterStringsChange = schedulerDayView.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerDayView.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTableNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterTableNodeChange = schedulerDayView.getAfterTableNodeChange();

		if (afterTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_TABLE_NODE_CHANGE, afterTableNodeChange));
		}
	}

	protected void renderAfterTimesNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterTimesNodeChange = schedulerDayView.getAfterTimesNodeChange();

		if (afterTimesNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_TIMES_NODE_CHANGE, afterTimesNodeChange));
		}
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerDayView.getAfterTriggerNodeChange();

		if (afterTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerDayView.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterVisibleChange = schedulerDayView.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterWidthChange = schedulerDayView.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onBodyContentChange = schedulerDayView.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerDayView.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnColDaysNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onColDaysNodeChange = schedulerDayView.getOnColDaysNodeChange();

		if (onColDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_COL_DAYS_NODE_CHANGE, onColDaysNodeChange));
		}
	}

	protected void renderOnColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onColHeaderDaysNodeChange = schedulerDayView.getOnColHeaderDaysNodeChange();

		if (onColHeaderDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_COL_HEADER_DAYS_NODE_CHANGE, onColHeaderDaysNodeChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onContentBoxChange = schedulerDayView.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onCssClassChange = schedulerDayView.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDaysChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onDaysChange = schedulerDayView.getOnDaysChange();

		if (onDaysChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_DAYS_CHANGE, onDaysChange));
		}
	}

	protected void renderOnDelegateConfigChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onDelegateConfigChange = schedulerDayView.getOnDelegateConfigChange();

		if (onDelegateConfigChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onDestroyedChange = schedulerDayView.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onDisabledChange = schedulerDayView.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnEventWidthChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onEventWidthChange = schedulerDayView.getOnEventWidthChange();

		if (onEventWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_EVENT_WIDTH_CHANGE, onEventWidthChange));
		}
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onFilterFnChange = schedulerDayView.getOnFilterFnChange();

		if (onFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_FILTER_FN_CHANGE, onFilterFnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onFocusedChange = schedulerDayView.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderDateFormatterChange = schedulerDayView.getOnHeaderDateFormatterChange();

		if (onHeaderDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_DATE_FORMATTER_CHANGE, onHeaderDateFormatterChange));
		}
	}

	protected void renderOnHeaderTableNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderTableNodeChange = schedulerDayView.getOnHeaderTableNodeChange();

		if (onHeaderTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_TABLE_NODE_CHANGE, onHeaderTableNodeChange));
		}
	}

	protected void renderOnHeaderViewChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderViewChange = schedulerDayView.getOnHeaderViewChange();

		if (onHeaderViewChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_VIEW_CHANGE, onHeaderViewChange));
		}
	}

	protected void renderOnHeaderViewConfigChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderViewConfigChange = schedulerDayView.getOnHeaderViewConfigChange();

		if (onHeaderViewConfigChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_VIEW_CONFIG_CHANGE, onHeaderViewConfigChange));
		}
	}

	protected void renderOnHeaderViewLabelNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderViewLabelNodeChange = schedulerDayView.getOnHeaderViewLabelNodeChange();

		if (onHeaderViewLabelNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_VIEW_LABEL_NODE_CHANGE, onHeaderViewLabelNodeChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeightChange = schedulerDayView.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHideClassChange = schedulerDayView.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnHourHeightChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHourHeightChange = schedulerDayView.getOnHourHeightChange();

		if (onHourHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_HOUR_HEIGHT_CHANGE, onHourHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onIdChange = schedulerDayView.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onInitializedChange = schedulerDayView.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerDayView.getOnIsoTimeChange();

		if (onIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onLocaleChange = schedulerDayView.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMarkercellsNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onMarkercellsNodeChange = schedulerDayView.getOnMarkercellsNodeChange();

		if (onMarkercellsNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_MARKERCELLS_NODE_CHANGE, onMarkercellsNodeChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onNameChange = schedulerDayView.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerDayView.getOnNavigationDateFormatterChange();

		if (onNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
		}
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onNextDateChange = schedulerDayView.getOnNextDateChange();

		if (onNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_NEXT_DATE_CHANGE, onNextDateChange));
		}
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onPrevDateChange = schedulerDayView.getOnPrevDateChange();

		if (onPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_PREV_DATE_CHANGE, onPrevDateChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onRenderChange = schedulerDayView.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onRenderedChange = schedulerDayView.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnResizerNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onResizerNodeChange = schedulerDayView.getOnResizerNodeChange();

		if (onResizerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_RESIZER_NODE_CHANGE, onResizerNodeChange));
		}
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onSchedulerChange = schedulerDayView.getOnSchedulerChange();

		if (onSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_SCHEDULER_CHANGE, onSchedulerChange));
		}
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onScrollableChange = schedulerDayView.getOnScrollableChange();

		if (onScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_SCROLLABLE_CHANGE, onScrollableChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerDayView.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onStringsChange = schedulerDayView.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onTabIndexChange = schedulerDayView.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTableNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onTableNodeChange = schedulerDayView.getOnTableNodeChange();

		if (onTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_TABLE_NODE_CHANGE, onTableNodeChange));
		}
	}

	protected void renderOnTimesNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onTimesNodeChange = schedulerDayView.getOnTimesNodeChange();

		if (onTimesNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_TIMES_NODE_CHANGE, onTimesNodeChange));
		}
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerDayView.getOnTriggerNodeChange();

		if (onTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onUseARIAChange = schedulerDayView.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onVisibleChange = schedulerDayView.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onWidthChange = schedulerDayView.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerDayView.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}