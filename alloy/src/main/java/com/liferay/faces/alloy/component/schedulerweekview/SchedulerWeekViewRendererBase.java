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
package com.liferay.faces.alloy.component.schedulerweekview;

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
public abstract class SchedulerWeekViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-week";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerWeekView schedulerWeekView = (SchedulerWeekView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerWeekView = new A.SchedulerWeekView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderSchedulerWeekViewBodyContent(renderedAttributes, schedulerWeekView);
		renderBoundingBox(renderedAttributes, schedulerWeekView);
		renderColDaysNode(renderedAttributes, schedulerWeekView);
		renderColHeaderDaysNode(renderedAttributes, schedulerWeekView);
		renderContentBox(renderedAttributes, schedulerWeekView);
		renderCssClass(renderedAttributes, schedulerWeekView);
		renderDays(renderedAttributes, schedulerWeekView);
		renderDelegateConfig(renderedAttributes, schedulerWeekView);
		renderDestroyed(renderedAttributes, schedulerWeekView);
		renderDisabled(renderedAttributes, schedulerWeekView);
		renderEventWidth(renderedAttributes, schedulerWeekView);
		renderFilterFn(renderedAttributes, schedulerWeekView);
		renderFocused(renderedAttributes, schedulerWeekView);
		renderHeaderDateFormatter(renderedAttributes, schedulerWeekView);
		renderHeaderTableNode(renderedAttributes, schedulerWeekView);
		renderHeaderView(renderedAttributes, schedulerWeekView);
		renderHeaderViewConfig(renderedAttributes, schedulerWeekView);
		renderHeaderViewLabelNode(renderedAttributes, schedulerWeekView);
		renderHeight(renderedAttributes, schedulerWeekView);
		renderHideClass(renderedAttributes, schedulerWeekView);
		renderHourHeight(renderedAttributes, schedulerWeekView);
		renderSchedulerWeekViewId(renderedAttributes, schedulerWeekView);
		renderInitialized(renderedAttributes, schedulerWeekView);
		renderIsoTime(renderedAttributes, schedulerWeekView);
		renderSchedulerWeekViewLocale(renderedAttributes, schedulerWeekView);
		renderMarkercellsNode(renderedAttributes, schedulerWeekView);
		renderName(renderedAttributes, schedulerWeekView);
		renderNavigationDateFormatter(renderedAttributes, schedulerWeekView);
		renderNextDate(renderedAttributes, schedulerWeekView);
		renderPrevDate(renderedAttributes, schedulerWeekView);
		renderRender(renderedAttributes, schedulerWeekView);
		renderRendered(renderedAttributes, schedulerWeekView);
		renderResizerNode(renderedAttributes, schedulerWeekView);
		renderScheduler(renderedAttributes, schedulerWeekView);
		renderScrollable(renderedAttributes, schedulerWeekView);
		renderSrcNode(renderedAttributes, schedulerWeekView);
		renderStrings(renderedAttributes, schedulerWeekView);
		renderTabIndex(renderedAttributes, schedulerWeekView);
		renderTableNode(renderedAttributes, schedulerWeekView);
		renderTimesNode(renderedAttributes, schedulerWeekView);
		renderTriggerNode(renderedAttributes, schedulerWeekView);
		renderUseARIA(renderedAttributes, schedulerWeekView);
		renderVisible(renderedAttributes, schedulerWeekView);
		renderWidth(renderedAttributes, schedulerWeekView);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBodyContentChange(renderedAfterEvents, schedulerWeekView);
		renderAfterBoundingBoxChange(renderedAfterEvents, schedulerWeekView);
		renderAfterColDaysNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterColHeaderDaysNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterContentBoxChange(renderedAfterEvents, schedulerWeekView);
		renderAfterCssClassChange(renderedAfterEvents, schedulerWeekView);
		renderAfterDaysChange(renderedAfterEvents, schedulerWeekView);
		renderAfterDelegateConfigChange(renderedAfterEvents, schedulerWeekView);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerWeekView);
		renderAfterDisabledChange(renderedAfterEvents, schedulerWeekView);
		renderAfterEventWidthChange(renderedAfterEvents, schedulerWeekView);
		renderAfterFilterFnChange(renderedAfterEvents, schedulerWeekView);
		renderAfterFocusedChange(renderedAfterEvents, schedulerWeekView);
		renderAfterHeaderDateFormatterChange(renderedAfterEvents, schedulerWeekView);
		renderAfterHeaderTableNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterHeaderViewChange(renderedAfterEvents, schedulerWeekView);
		renderAfterHeaderViewConfigChange(renderedAfterEvents, schedulerWeekView);
		renderAfterHeaderViewLabelNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterHeightChange(renderedAfterEvents, schedulerWeekView);
		renderAfterHideClassChange(renderedAfterEvents, schedulerWeekView);
		renderAfterHourHeightChange(renderedAfterEvents, schedulerWeekView);
		renderAfterIdChange(renderedAfterEvents, schedulerWeekView);
		renderAfterInitializedChange(renderedAfterEvents, schedulerWeekView);
		renderAfterIsoTimeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterLocaleChange(renderedAfterEvents, schedulerWeekView);
		renderAfterMarkercellsNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterNameChange(renderedAfterEvents, schedulerWeekView);
		renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerWeekView);
		renderAfterNextDateChange(renderedAfterEvents, schedulerWeekView);
		renderAfterPrevDateChange(renderedAfterEvents, schedulerWeekView);
		renderAfterRenderChange(renderedAfterEvents, schedulerWeekView);
		renderAfterRenderedChange(renderedAfterEvents, schedulerWeekView);
		renderAfterResizerNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterSchedulerChange(renderedAfterEvents, schedulerWeekView);
		renderAfterScrollableChange(renderedAfterEvents, schedulerWeekView);
		renderAfterSrcNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterStringsChange(renderedAfterEvents, schedulerWeekView);
		renderAfterTabIndexChange(renderedAfterEvents, schedulerWeekView);
		renderAfterTableNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterTimesNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterTriggerNodeChange(renderedAfterEvents, schedulerWeekView);
		renderAfterUseARIAChange(renderedAfterEvents, schedulerWeekView);
		renderAfterVisibleChange(renderedAfterEvents, schedulerWeekView);
		renderAfterWidthChange(renderedAfterEvents, schedulerWeekView);

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

		renderOnBodyContentChange(renderedOnEvents, schedulerWeekView);
		renderOnBoundingBoxChange(renderedOnEvents, schedulerWeekView);
		renderOnColDaysNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnColHeaderDaysNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnContentBoxChange(renderedOnEvents, schedulerWeekView);
		renderOnCssClassChange(renderedOnEvents, schedulerWeekView);
		renderOnDaysChange(renderedOnEvents, schedulerWeekView);
		renderOnDelegateConfigChange(renderedOnEvents, schedulerWeekView);
		renderOnDestroyedChange(renderedOnEvents, schedulerWeekView);
		renderOnDisabledChange(renderedOnEvents, schedulerWeekView);
		renderOnEventWidthChange(renderedOnEvents, schedulerWeekView);
		renderOnFilterFnChange(renderedOnEvents, schedulerWeekView);
		renderOnFocusedChange(renderedOnEvents, schedulerWeekView);
		renderOnHeaderDateFormatterChange(renderedOnEvents, schedulerWeekView);
		renderOnHeaderTableNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnHeaderViewChange(renderedOnEvents, schedulerWeekView);
		renderOnHeaderViewConfigChange(renderedOnEvents, schedulerWeekView);
		renderOnHeaderViewLabelNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnHeightChange(renderedOnEvents, schedulerWeekView);
		renderOnHideClassChange(renderedOnEvents, schedulerWeekView);
		renderOnHourHeightChange(renderedOnEvents, schedulerWeekView);
		renderOnIdChange(renderedOnEvents, schedulerWeekView);
		renderOnInitializedChange(renderedOnEvents, schedulerWeekView);
		renderOnIsoTimeChange(renderedOnEvents, schedulerWeekView);
		renderOnLocaleChange(renderedOnEvents, schedulerWeekView);
		renderOnMarkercellsNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnNameChange(renderedOnEvents, schedulerWeekView);
		renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerWeekView);
		renderOnNextDateChange(renderedOnEvents, schedulerWeekView);
		renderOnPrevDateChange(renderedOnEvents, schedulerWeekView);
		renderOnRenderChange(renderedOnEvents, schedulerWeekView);
		renderOnRenderedChange(renderedOnEvents, schedulerWeekView);
		renderOnResizerNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnSchedulerChange(renderedOnEvents, schedulerWeekView);
		renderOnScrollableChange(renderedOnEvents, schedulerWeekView);
		renderOnSrcNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnStringsChange(renderedOnEvents, schedulerWeekView);
		renderOnTabIndexChange(renderedOnEvents, schedulerWeekView);
		renderOnTableNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnTimesNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnTriggerNodeChange(renderedOnEvents, schedulerWeekView);
		renderOnUseARIAChange(renderedOnEvents, schedulerWeekView);
		renderOnVisibleChange(renderedOnEvents, schedulerWeekView);
		renderOnWidthChange(renderedOnEvents, schedulerWeekView);

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

	protected void renderSchedulerWeekViewBodyContent(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String schedulerWeekViewBodyContent = schedulerWeekView.getSchedulerWeekViewBodyContent();

		if (schedulerWeekViewBodyContent != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.SCHEDULER_WEEK_VIEW_BODY_CONTENT, schedulerWeekViewBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String boundingBox = schedulerWeekView.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderColDaysNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String colDaysNode = schedulerWeekView.getColDaysNode();

		if (colDaysNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.COL_DAYS_NODE, colDaysNode));
		}
	}

	protected void renderColHeaderDaysNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String colHeaderDaysNode = schedulerWeekView.getColHeaderDaysNode();

		if (colHeaderDaysNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.COL_HEADER_DAYS_NODE, colHeaderDaysNode));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String contentBox = schedulerWeekView.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String cssClass = schedulerWeekView.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.CSS_CLASS, cssClass));
		}
	}

	protected void renderDays(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object days = schedulerWeekView.getDays();

		if (days != null) {
			renderedAttributes.add(renderNumber(SchedulerWeekView.DAYS, days));
		}
	}

	protected void renderDelegateConfig(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object delegateConfig = schedulerWeekView.getDelegateConfig();

		if (delegateConfig != null) {
			renderedAttributes.add(renderObject(SchedulerWeekView.DELEGATE_CONFIG, delegateConfig));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean destroyed = schedulerWeekView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean disabled = schedulerWeekView.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.DISABLED, disabled));
		}
	}

	protected void renderEventWidth(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object eventWidth = schedulerWeekView.getEventWidth();

		if (eventWidth != null) {
			renderedAttributes.add(renderNumber(SchedulerWeekView.EVENT_WIDTH, eventWidth));
		}
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String filterFn = schedulerWeekView.getFilterFn();

		if (filterFn != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.FILTER_FN, filterFn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean focused = schedulerWeekView.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.FOCUSED, focused));
		}
	}

	protected void renderHeaderDateFormatter(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String headerDateFormatter = schedulerWeekView.getHeaderDateFormatter();

		if (headerDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.HEADER_DATE_FORMATTER, headerDateFormatter));
		}
	}

	protected void renderHeaderTableNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String headerTableNode = schedulerWeekView.getHeaderTableNode();

		if (headerTableNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.HEADER_TABLE_NODE, headerTableNode));
		}
	}

	protected void renderHeaderView(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean headerView = schedulerWeekView.getHeaderView();

		if (headerView != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.HEADER_VIEW, headerView));
		}
	}

	protected void renderHeaderViewConfig(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String headerViewConfig = schedulerWeekView.getHeaderViewConfig();

		if (headerViewConfig != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.HEADER_VIEW_CONFIG, headerViewConfig));
		}
	}

	protected void renderHeaderViewLabelNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String headerViewLabelNode = schedulerWeekView.getHeaderViewLabelNode();

		if (headerViewLabelNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.HEADER_VIEW_LABEL_NODE, headerViewLabelNode));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object height = schedulerWeekView.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(SchedulerWeekView.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String hideClass = schedulerWeekView.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.HIDE_CLASS, hideClass));
		}
	}

	protected void renderHourHeight(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object hourHeight = schedulerWeekView.getHourHeight();

		if (hourHeight != null) {
			renderedAttributes.add(renderNumber(SchedulerWeekView.HOUR_HEIGHT, hourHeight));
		}
	}

	protected void renderSchedulerWeekViewId(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String schedulerWeekViewId = schedulerWeekView.getSchedulerWeekViewId();

		if (schedulerWeekViewId != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.SCHEDULER_WEEK_VIEW_ID, schedulerWeekViewId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean initialized = schedulerWeekView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.INITIALIZED, initialized));
		}
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean isoTime = schedulerWeekView.getIsoTime();

		if (isoTime != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.ISO_TIME, isoTime));
		}
	}

	protected void renderSchedulerWeekViewLocale(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String schedulerWeekViewLocale = schedulerWeekView.getSchedulerWeekViewLocale();

		if (schedulerWeekViewLocale != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.SCHEDULER_WEEK_VIEW_LOCALE, schedulerWeekViewLocale));
		}
	}

	protected void renderMarkercellsNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String markercellsNode = schedulerWeekView.getMarkercellsNode();

		if (markercellsNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.MARKERCELLS_NODE, markercellsNode));
		}
	}

	protected void renderName(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String name = schedulerWeekView.getName();

		if (name != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.NAME, name));
		}
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerWeekView.getNavigationDateFormatter();

		if (navigationDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
		}
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String nextDate = schedulerWeekView.getNextDate();

		if (nextDate != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.NEXT_DATE, nextDate));
		}
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String prevDate = schedulerWeekView.getPrevDate();

		if (prevDate != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.PREV_DATE, prevDate));
		}
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object render = schedulerWeekView.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean rendered = schedulerWeekView.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.RENDERED, rendered));
		}
	}

	protected void renderResizerNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String resizerNode = schedulerWeekView.getResizerNode();

		if (resizerNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.RESIZER_NODE, resizerNode));
		}
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String scheduler = schedulerWeekView.getScheduler();

		if (scheduler != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.SCHEDULER, scheduler));
		}
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean scrollable = schedulerWeekView.getScrollable();

		if (scrollable != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.SCROLLABLE, scrollable));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String srcNode = schedulerWeekView.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String strings = schedulerWeekView.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object tabIndex = schedulerWeekView.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(SchedulerWeekView.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTableNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String tableNode = schedulerWeekView.getTableNode();

		if (tableNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.TABLE_NODE, tableNode));
		}
	}

	protected void renderTimesNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String timesNode = schedulerWeekView.getTimesNode();

		if (timesNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.TIMES_NODE, timesNode));
		}
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String triggerNode = schedulerWeekView.getTriggerNode();

		if (triggerNode != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.TRIGGER_NODE, triggerNode));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean useARIA = schedulerWeekView.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean visible = schedulerWeekView.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerWeekView.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object width = schedulerWeekView.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.WIDTH, width));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerWeekView.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerWeekView.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterColDaysNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterColDaysNodeChange = schedulerWeekView.getAfterColDaysNodeChange();

		if (afterColDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_COL_DAYS_NODE_CHANGE, afterColDaysNodeChange));
		}
	}

	protected void renderAfterColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterColHeaderDaysNodeChange = schedulerWeekView.getAfterColHeaderDaysNodeChange();

		if (afterColHeaderDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_COL_HEADER_DAYS_NODE_CHANGE, afterColHeaderDaysNodeChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerWeekView.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterCssClassChange = schedulerWeekView.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDaysChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterDaysChange = schedulerWeekView.getAfterDaysChange();

		if (afterDaysChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_DAYS_CHANGE, afterDaysChange));
		}
	}

	protected void renderAfterDelegateConfigChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterDelegateConfigChange = schedulerWeekView.getAfterDelegateConfigChange();

		if (afterDelegateConfigChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerWeekView.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterDisabledChange = schedulerWeekView.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterEventWidthChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterEventWidthChange = schedulerWeekView.getAfterEventWidthChange();

		if (afterEventWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_EVENT_WIDTH_CHANGE, afterEventWidthChange));
		}
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerWeekView.getAfterFilterFnChange();

		if (afterFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterFocusedChange = schedulerWeekView.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderDateFormatterChange = schedulerWeekView.getAfterHeaderDateFormatterChange();

		if (afterHeaderDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_DATE_FORMATTER_CHANGE, afterHeaderDateFormatterChange));
		}
	}

	protected void renderAfterHeaderTableNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderTableNodeChange = schedulerWeekView.getAfterHeaderTableNodeChange();

		if (afterHeaderTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_TABLE_NODE_CHANGE, afterHeaderTableNodeChange));
		}
	}

	protected void renderAfterHeaderViewChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderViewChange = schedulerWeekView.getAfterHeaderViewChange();

		if (afterHeaderViewChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_VIEW_CHANGE, afterHeaderViewChange));
		}
	}

	protected void renderAfterHeaderViewConfigChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderViewConfigChange = schedulerWeekView.getAfterHeaderViewConfigChange();

		if (afterHeaderViewConfigChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_VIEW_CONFIG_CHANGE, afterHeaderViewConfigChange));
		}
	}

	protected void renderAfterHeaderViewLabelNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderViewLabelNodeChange = schedulerWeekView.getAfterHeaderViewLabelNodeChange();

		if (afterHeaderViewLabelNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_VIEW_LABEL_NODE_CHANGE, afterHeaderViewLabelNodeChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeightChange = schedulerWeekView.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHideClassChange = schedulerWeekView.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterHourHeightChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHourHeightChange = schedulerWeekView.getAfterHourHeightChange();

		if (afterHourHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HOUR_HEIGHT_CHANGE, afterHourHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterIdChange = schedulerWeekView.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterInitializedChange = schedulerWeekView.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerWeekView.getAfterIsoTimeChange();

		if (afterIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterLocaleChange = schedulerWeekView.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMarkercellsNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterMarkercellsNodeChange = schedulerWeekView.getAfterMarkercellsNodeChange();

		if (afterMarkercellsNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_MARKERCELLS_NODE_CHANGE, afterMarkercellsNodeChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterNameChange = schedulerWeekView.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerWeekView.getAfterNavigationDateFormatterChange();

		if (afterNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
		}
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterNextDateChange = schedulerWeekView.getAfterNextDateChange();

		if (afterNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
		}
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerWeekView.getAfterPrevDateChange();

		if (afterPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterRenderChange = schedulerWeekView.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterRenderedChange = schedulerWeekView.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterResizerNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterResizerNodeChange = schedulerWeekView.getAfterResizerNodeChange();

		if (afterResizerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_RESIZER_NODE_CHANGE, afterResizerNodeChange));
		}
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerWeekView.getAfterSchedulerChange();

		if (afterSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
		}
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterScrollableChange = schedulerWeekView.getAfterScrollableChange();

		if (afterScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerWeekView.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterStringsChange = schedulerWeekView.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerWeekView.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTableNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterTableNodeChange = schedulerWeekView.getAfterTableNodeChange();

		if (afterTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_TABLE_NODE_CHANGE, afterTableNodeChange));
		}
	}

	protected void renderAfterTimesNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterTimesNodeChange = schedulerWeekView.getAfterTimesNodeChange();

		if (afterTimesNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_TIMES_NODE_CHANGE, afterTimesNodeChange));
		}
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerWeekView.getAfterTriggerNodeChange();

		if (afterTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerWeekView.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterVisibleChange = schedulerWeekView.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterWidthChange = schedulerWeekView.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onBodyContentChange = schedulerWeekView.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerWeekView.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnColDaysNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onColDaysNodeChange = schedulerWeekView.getOnColDaysNodeChange();

		if (onColDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_COL_DAYS_NODE_CHANGE, onColDaysNodeChange));
		}
	}

	protected void renderOnColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onColHeaderDaysNodeChange = schedulerWeekView.getOnColHeaderDaysNodeChange();

		if (onColHeaderDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_COL_HEADER_DAYS_NODE_CHANGE, onColHeaderDaysNodeChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onContentBoxChange = schedulerWeekView.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onCssClassChange = schedulerWeekView.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDaysChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onDaysChange = schedulerWeekView.getOnDaysChange();

		if (onDaysChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_DAYS_CHANGE, onDaysChange));
		}
	}

	protected void renderOnDelegateConfigChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onDelegateConfigChange = schedulerWeekView.getOnDelegateConfigChange();

		if (onDelegateConfigChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onDestroyedChange = schedulerWeekView.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onDisabledChange = schedulerWeekView.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnEventWidthChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onEventWidthChange = schedulerWeekView.getOnEventWidthChange();

		if (onEventWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_EVENT_WIDTH_CHANGE, onEventWidthChange));
		}
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onFilterFnChange = schedulerWeekView.getOnFilterFnChange();

		if (onFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_FILTER_FN_CHANGE, onFilterFnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onFocusedChange = schedulerWeekView.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderDateFormatterChange = schedulerWeekView.getOnHeaderDateFormatterChange();

		if (onHeaderDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_DATE_FORMATTER_CHANGE, onHeaderDateFormatterChange));
		}
	}

	protected void renderOnHeaderTableNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderTableNodeChange = schedulerWeekView.getOnHeaderTableNodeChange();

		if (onHeaderTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_TABLE_NODE_CHANGE, onHeaderTableNodeChange));
		}
	}

	protected void renderOnHeaderViewChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderViewChange = schedulerWeekView.getOnHeaderViewChange();

		if (onHeaderViewChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_VIEW_CHANGE, onHeaderViewChange));
		}
	}

	protected void renderOnHeaderViewConfigChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderViewConfigChange = schedulerWeekView.getOnHeaderViewConfigChange();

		if (onHeaderViewConfigChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_VIEW_CONFIG_CHANGE, onHeaderViewConfigChange));
		}
	}

	protected void renderOnHeaderViewLabelNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderViewLabelNodeChange = schedulerWeekView.getOnHeaderViewLabelNodeChange();

		if (onHeaderViewLabelNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_VIEW_LABEL_NODE_CHANGE, onHeaderViewLabelNodeChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeightChange = schedulerWeekView.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHideClassChange = schedulerWeekView.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnHourHeightChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHourHeightChange = schedulerWeekView.getOnHourHeightChange();

		if (onHourHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_HOUR_HEIGHT_CHANGE, onHourHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onIdChange = schedulerWeekView.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onInitializedChange = schedulerWeekView.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerWeekView.getOnIsoTimeChange();

		if (onIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onLocaleChange = schedulerWeekView.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMarkercellsNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onMarkercellsNodeChange = schedulerWeekView.getOnMarkercellsNodeChange();

		if (onMarkercellsNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_MARKERCELLS_NODE_CHANGE, onMarkercellsNodeChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onNameChange = schedulerWeekView.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerWeekView.getOnNavigationDateFormatterChange();

		if (onNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
		}
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onNextDateChange = schedulerWeekView.getOnNextDateChange();

		if (onNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_NEXT_DATE_CHANGE, onNextDateChange));
		}
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onPrevDateChange = schedulerWeekView.getOnPrevDateChange();

		if (onPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_PREV_DATE_CHANGE, onPrevDateChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onRenderChange = schedulerWeekView.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onRenderedChange = schedulerWeekView.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnResizerNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onResizerNodeChange = schedulerWeekView.getOnResizerNodeChange();

		if (onResizerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_RESIZER_NODE_CHANGE, onResizerNodeChange));
		}
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onSchedulerChange = schedulerWeekView.getOnSchedulerChange();

		if (onSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_SCHEDULER_CHANGE, onSchedulerChange));
		}
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onScrollableChange = schedulerWeekView.getOnScrollableChange();

		if (onScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_SCROLLABLE_CHANGE, onScrollableChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerWeekView.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onStringsChange = schedulerWeekView.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onTabIndexChange = schedulerWeekView.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTableNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onTableNodeChange = schedulerWeekView.getOnTableNodeChange();

		if (onTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_TABLE_NODE_CHANGE, onTableNodeChange));
		}
	}

	protected void renderOnTimesNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onTimesNodeChange = schedulerWeekView.getOnTimesNodeChange();

		if (onTimesNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_TIMES_NODE_CHANGE, onTimesNodeChange));
		}
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerWeekView.getOnTriggerNodeChange();

		if (onTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onUseARIAChange = schedulerWeekView.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onVisibleChange = schedulerWeekView.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onWidthChange = schedulerWeekView.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerWeekView.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}