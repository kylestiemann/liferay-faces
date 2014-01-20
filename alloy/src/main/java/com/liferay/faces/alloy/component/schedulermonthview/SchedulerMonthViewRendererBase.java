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
package com.liferay.faces.alloy.component.schedulermonthview;

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
public abstract class SchedulerMonthViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-month";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerMonthView schedulerMonthView = (SchedulerMonthView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerMonthView = new A.SchedulerMonthView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderSchedulerMonthViewBodyContent(renderedAttributes, schedulerMonthView);
		renderBoundingBox(renderedAttributes, schedulerMonthView);
		renderColHeaderDaysNode(renderedAttributes, schedulerMonthView);
		renderContentBox(renderedAttributes, schedulerMonthView);
		renderCssClass(renderedAttributes, schedulerMonthView);
		renderDestroyed(renderedAttributes, schedulerMonthView);
		renderDisabled(renderedAttributes, schedulerMonthView);
		renderDisplayDaysInterval(renderedAttributes, schedulerMonthView);
		renderDisplayRows(renderedAttributes, schedulerMonthView);
		renderFilterFn(renderedAttributes, schedulerMonthView);
		renderFixedHeight(renderedAttributes, schedulerMonthView);
		renderFocused(renderedAttributes, schedulerMonthView);
		renderHeaderDateFormatter(renderedAttributes, schedulerMonthView);
		renderHeaderTableNode(renderedAttributes, schedulerMonthView);
		renderHeight(renderedAttributes, schedulerMonthView);
		renderHideClass(renderedAttributes, schedulerMonthView);
		renderSchedulerMonthViewId(renderedAttributes, schedulerMonthView);
		renderInitialized(renderedAttributes, schedulerMonthView);
		renderIsoTime(renderedAttributes, schedulerMonthView);
		renderSchedulerMonthViewLocale(renderedAttributes, schedulerMonthView);
		renderName(renderedAttributes, schedulerMonthView);
		renderNavigationDateFormatter(renderedAttributes, schedulerMonthView);
		renderNextDate(renderedAttributes, schedulerMonthView);
		renderPrevDate(renderedAttributes, schedulerMonthView);
		renderRender(renderedAttributes, schedulerMonthView);
		renderRendered(renderedAttributes, schedulerMonthView);
		renderRowsContainerNode(renderedAttributes, schedulerMonthView);
		renderScheduler(renderedAttributes, schedulerMonthView);
		renderScrollable(renderedAttributes, schedulerMonthView);
		renderSrcNode(renderedAttributes, schedulerMonthView);
		renderStrings(renderedAttributes, schedulerMonthView);
		renderTabIndex(renderedAttributes, schedulerMonthView);
		renderTableGridNode(renderedAttributes, schedulerMonthView);
		renderTriggerNode(renderedAttributes, schedulerMonthView);
		renderUseARIA(renderedAttributes, schedulerMonthView);
		renderVisible(renderedAttributes, schedulerMonthView);
		renderWidth(renderedAttributes, schedulerMonthView);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBodyContentChange(renderedAfterEvents, schedulerMonthView);
		renderAfterBoundingBoxChange(renderedAfterEvents, schedulerMonthView);
		renderAfterColHeaderDaysNodeChange(renderedAfterEvents, schedulerMonthView);
		renderAfterContentBoxChange(renderedAfterEvents, schedulerMonthView);
		renderAfterCssClassChange(renderedAfterEvents, schedulerMonthView);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerMonthView);
		renderAfterDisabledChange(renderedAfterEvents, schedulerMonthView);
		renderAfterDisplayDaysIntervalChange(renderedAfterEvents, schedulerMonthView);
		renderAfterDisplayRowsChange(renderedAfterEvents, schedulerMonthView);
		renderAfterFilterFnChange(renderedAfterEvents, schedulerMonthView);
		renderAfterFixedHeightChange(renderedAfterEvents, schedulerMonthView);
		renderAfterFocusedChange(renderedAfterEvents, schedulerMonthView);
		renderAfterHeaderDateFormatterChange(renderedAfterEvents, schedulerMonthView);
		renderAfterHeaderTableNodeChange(renderedAfterEvents, schedulerMonthView);
		renderAfterHeightChange(renderedAfterEvents, schedulerMonthView);
		renderAfterHideClassChange(renderedAfterEvents, schedulerMonthView);
		renderAfterIdChange(renderedAfterEvents, schedulerMonthView);
		renderAfterInitializedChange(renderedAfterEvents, schedulerMonthView);
		renderAfterIsoTimeChange(renderedAfterEvents, schedulerMonthView);
		renderAfterLocaleChange(renderedAfterEvents, schedulerMonthView);
		renderAfterNameChange(renderedAfterEvents, schedulerMonthView);
		renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerMonthView);
		renderAfterNextDateChange(renderedAfterEvents, schedulerMonthView);
		renderAfterPrevDateChange(renderedAfterEvents, schedulerMonthView);
		renderAfterRenderChange(renderedAfterEvents, schedulerMonthView);
		renderAfterRenderedChange(renderedAfterEvents, schedulerMonthView);
		renderAfterRowsContainerNodeChange(renderedAfterEvents, schedulerMonthView);
		renderAfterSchedulerChange(renderedAfterEvents, schedulerMonthView);
		renderAfterScrollableChange(renderedAfterEvents, schedulerMonthView);
		renderAfterSrcNodeChange(renderedAfterEvents, schedulerMonthView);
		renderAfterStringsChange(renderedAfterEvents, schedulerMonthView);
		renderAfterTabIndexChange(renderedAfterEvents, schedulerMonthView);
		renderAfterTableGridNodeChange(renderedAfterEvents, schedulerMonthView);
		renderAfterTriggerNodeChange(renderedAfterEvents, schedulerMonthView);
		renderAfterUseARIAChange(renderedAfterEvents, schedulerMonthView);
		renderAfterVisibleChange(renderedAfterEvents, schedulerMonthView);
		renderAfterWidthChange(renderedAfterEvents, schedulerMonthView);

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

		renderOnBodyContentChange(renderedOnEvents, schedulerMonthView);
		renderOnBoundingBoxChange(renderedOnEvents, schedulerMonthView);
		renderOnColHeaderDaysNodeChange(renderedOnEvents, schedulerMonthView);
		renderOnContentBoxChange(renderedOnEvents, schedulerMonthView);
		renderOnCssClassChange(renderedOnEvents, schedulerMonthView);
		renderOnDestroyedChange(renderedOnEvents, schedulerMonthView);
		renderOnDisabledChange(renderedOnEvents, schedulerMonthView);
		renderOnDisplayDaysIntervalChange(renderedOnEvents, schedulerMonthView);
		renderOnDisplayRowsChange(renderedOnEvents, schedulerMonthView);
		renderOnFilterFnChange(renderedOnEvents, schedulerMonthView);
		renderOnFixedHeightChange(renderedOnEvents, schedulerMonthView);
		renderOnFocusedChange(renderedOnEvents, schedulerMonthView);
		renderOnHeaderDateFormatterChange(renderedOnEvents, schedulerMonthView);
		renderOnHeaderTableNodeChange(renderedOnEvents, schedulerMonthView);
		renderOnHeightChange(renderedOnEvents, schedulerMonthView);
		renderOnHideClassChange(renderedOnEvents, schedulerMonthView);
		renderOnIdChange(renderedOnEvents, schedulerMonthView);
		renderOnInitializedChange(renderedOnEvents, schedulerMonthView);
		renderOnIsoTimeChange(renderedOnEvents, schedulerMonthView);
		renderOnLocaleChange(renderedOnEvents, schedulerMonthView);
		renderOnNameChange(renderedOnEvents, schedulerMonthView);
		renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerMonthView);
		renderOnNextDateChange(renderedOnEvents, schedulerMonthView);
		renderOnPrevDateChange(renderedOnEvents, schedulerMonthView);
		renderOnRenderChange(renderedOnEvents, schedulerMonthView);
		renderOnRenderedChange(renderedOnEvents, schedulerMonthView);
		renderOnRowsContainerNodeChange(renderedOnEvents, schedulerMonthView);
		renderOnSchedulerChange(renderedOnEvents, schedulerMonthView);
		renderOnScrollableChange(renderedOnEvents, schedulerMonthView);
		renderOnSrcNodeChange(renderedOnEvents, schedulerMonthView);
		renderOnStringsChange(renderedOnEvents, schedulerMonthView);
		renderOnTabIndexChange(renderedOnEvents, schedulerMonthView);
		renderOnTableGridNodeChange(renderedOnEvents, schedulerMonthView);
		renderOnTriggerNodeChange(renderedOnEvents, schedulerMonthView);
		renderOnUseARIAChange(renderedOnEvents, schedulerMonthView);
		renderOnVisibleChange(renderedOnEvents, schedulerMonthView);
		renderOnWidthChange(renderedOnEvents, schedulerMonthView);

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

	protected void renderSchedulerMonthViewBodyContent(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String schedulerMonthViewBodyContent = schedulerMonthView.getSchedulerMonthViewBodyContent();

		if (schedulerMonthViewBodyContent != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.SCHEDULER_MONTH_VIEW_BODY_CONTENT, schedulerMonthViewBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String boundingBox = schedulerMonthView.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderColHeaderDaysNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String colHeaderDaysNode = schedulerMonthView.getColHeaderDaysNode();

		if (colHeaderDaysNode != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.COL_HEADER_DAYS_NODE, colHeaderDaysNode));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String contentBox = schedulerMonthView.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String cssClass = schedulerMonthView.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean destroyed = schedulerMonthView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean disabled = schedulerMonthView.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.DISABLED, disabled));
		}
	}

	protected void renderDisplayDaysInterval(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object displayDaysInterval = schedulerMonthView.getDisplayDaysInterval();

		if (displayDaysInterval != null) {
			renderedAttributes.add(renderNumber(SchedulerMonthView.DISPLAY_DAYS_INTERVAL, displayDaysInterval));
		}
	}

	protected void renderDisplayRows(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object displayRows = schedulerMonthView.getDisplayRows();

		if (displayRows != null) {
			renderedAttributes.add(renderNumber(SchedulerMonthView.DISPLAY_ROWS, displayRows));
		}
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String filterFn = schedulerMonthView.getFilterFn();

		if (filterFn != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.FILTER_FN, filterFn));
		}
	}

	protected void renderFixedHeight(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean fixedHeight = schedulerMonthView.getFixedHeight();

		if (fixedHeight != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.FIXED_HEIGHT, fixedHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean focused = schedulerMonthView.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.FOCUSED, focused));
		}
	}

	protected void renderHeaderDateFormatter(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String headerDateFormatter = schedulerMonthView.getHeaderDateFormatter();

		if (headerDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.HEADER_DATE_FORMATTER, headerDateFormatter));
		}
	}

	protected void renderHeaderTableNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String headerTableNode = schedulerMonthView.getHeaderTableNode();

		if (headerTableNode != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.HEADER_TABLE_NODE, headerTableNode));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object height = schedulerMonthView.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(SchedulerMonthView.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String hideClass = schedulerMonthView.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.HIDE_CLASS, hideClass));
		}
	}

	protected void renderSchedulerMonthViewId(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String schedulerMonthViewId = schedulerMonthView.getSchedulerMonthViewId();

		if (schedulerMonthViewId != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.SCHEDULER_MONTH_VIEW_ID, schedulerMonthViewId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean initialized = schedulerMonthView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.INITIALIZED, initialized));
		}
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean isoTime = schedulerMonthView.getIsoTime();

		if (isoTime != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.ISO_TIME, isoTime));
		}
	}

	protected void renderSchedulerMonthViewLocale(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String schedulerMonthViewLocale = schedulerMonthView.getSchedulerMonthViewLocale();

		if (schedulerMonthViewLocale != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.SCHEDULER_MONTH_VIEW_LOCALE, schedulerMonthViewLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String name = schedulerMonthView.getName();

		if (name != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.NAME, name));
		}
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerMonthView.getNavigationDateFormatter();

		if (navigationDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
		}
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String nextDate = schedulerMonthView.getNextDate();

		if (nextDate != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.NEXT_DATE, nextDate));
		}
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String prevDate = schedulerMonthView.getPrevDate();

		if (prevDate != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.PREV_DATE, prevDate));
		}
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object render = schedulerMonthView.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean rendered = schedulerMonthView.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.RENDERED, rendered));
		}
	}

	protected void renderRowsContainerNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String rowsContainerNode = schedulerMonthView.getRowsContainerNode();

		if (rowsContainerNode != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ROWS_CONTAINER_NODE, rowsContainerNode));
		}
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String scheduler = schedulerMonthView.getScheduler();

		if (scheduler != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.SCHEDULER, scheduler));
		}
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean scrollable = schedulerMonthView.getScrollable();

		if (scrollable != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.SCROLLABLE, scrollable));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String srcNode = schedulerMonthView.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String strings = schedulerMonthView.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object tabIndex = schedulerMonthView.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(SchedulerMonthView.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTableGridNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String tableGridNode = schedulerMonthView.getTableGridNode();

		if (tableGridNode != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.TABLE_GRID_NODE, tableGridNode));
		}
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String triggerNode = schedulerMonthView.getTriggerNode();

		if (triggerNode != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.TRIGGER_NODE, triggerNode));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean useARIA = schedulerMonthView.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean visible = schedulerMonthView.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerMonthView.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object width = schedulerMonthView.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.WIDTH, width));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerMonthView.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerMonthView.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterColHeaderDaysNodeChange = schedulerMonthView.getAfterColHeaderDaysNodeChange();

		if (afterColHeaderDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_COL_HEADER_DAYS_NODE_CHANGE, afterColHeaderDaysNodeChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerMonthView.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterCssClassChange = schedulerMonthView.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerMonthView.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterDisabledChange = schedulerMonthView.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDisplayDaysIntervalChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterDisplayDaysIntervalChange = schedulerMonthView.getAfterDisplayDaysIntervalChange();

		if (afterDisplayDaysIntervalChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_DISPLAY_DAYS_INTERVAL_CHANGE, afterDisplayDaysIntervalChange));
		}
	}

	protected void renderAfterDisplayRowsChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterDisplayRowsChange = schedulerMonthView.getAfterDisplayRowsChange();

		if (afterDisplayRowsChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_DISPLAY_ROWS_CHANGE, afterDisplayRowsChange));
		}
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerMonthView.getAfterFilterFnChange();

		if (afterFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
		}
	}

	protected void renderAfterFixedHeightChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterFixedHeightChange = schedulerMonthView.getAfterFixedHeightChange();

		if (afterFixedHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_FIXED_HEIGHT_CHANGE, afterFixedHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterFocusedChange = schedulerMonthView.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterHeaderDateFormatterChange = schedulerMonthView.getAfterHeaderDateFormatterChange();

		if (afterHeaderDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_HEADER_DATE_FORMATTER_CHANGE, afterHeaderDateFormatterChange));
		}
	}

	protected void renderAfterHeaderTableNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterHeaderTableNodeChange = schedulerMonthView.getAfterHeaderTableNodeChange();

		if (afterHeaderTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_HEADER_TABLE_NODE_CHANGE, afterHeaderTableNodeChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterHeightChange = schedulerMonthView.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterHideClassChange = schedulerMonthView.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterIdChange = schedulerMonthView.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterInitializedChange = schedulerMonthView.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerMonthView.getAfterIsoTimeChange();

		if (afterIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterLocaleChange = schedulerMonthView.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterNameChange = schedulerMonthView.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerMonthView.getAfterNavigationDateFormatterChange();

		if (afterNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
		}
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterNextDateChange = schedulerMonthView.getAfterNextDateChange();

		if (afterNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
		}
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerMonthView.getAfterPrevDateChange();

		if (afterPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterRenderChange = schedulerMonthView.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterRenderedChange = schedulerMonthView.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRowsContainerNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterRowsContainerNodeChange = schedulerMonthView.getAfterRowsContainerNodeChange();

		if (afterRowsContainerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_ROWS_CONTAINER_NODE_CHANGE, afterRowsContainerNodeChange));
		}
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerMonthView.getAfterSchedulerChange();

		if (afterSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
		}
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterScrollableChange = schedulerMonthView.getAfterScrollableChange();

		if (afterScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerMonthView.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterStringsChange = schedulerMonthView.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerMonthView.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTableGridNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterTableGridNodeChange = schedulerMonthView.getAfterTableGridNodeChange();

		if (afterTableGridNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_TABLE_GRID_NODE_CHANGE, afterTableGridNodeChange));
		}
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerMonthView.getAfterTriggerNodeChange();

		if (afterTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerMonthView.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterVisibleChange = schedulerMonthView.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterWidthChange = schedulerMonthView.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onBodyContentChange = schedulerMonthView.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerMonthView.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onColHeaderDaysNodeChange = schedulerMonthView.getOnColHeaderDaysNodeChange();

		if (onColHeaderDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_COL_HEADER_DAYS_NODE_CHANGE, onColHeaderDaysNodeChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onContentBoxChange = schedulerMonthView.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onCssClassChange = schedulerMonthView.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onDestroyedChange = schedulerMonthView.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onDisabledChange = schedulerMonthView.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDisplayDaysIntervalChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onDisplayDaysIntervalChange = schedulerMonthView.getOnDisplayDaysIntervalChange();

		if (onDisplayDaysIntervalChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_DISPLAY_DAYS_INTERVAL_CHANGE, onDisplayDaysIntervalChange));
		}
	}

	protected void renderOnDisplayRowsChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onDisplayRowsChange = schedulerMonthView.getOnDisplayRowsChange();

		if (onDisplayRowsChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_DISPLAY_ROWS_CHANGE, onDisplayRowsChange));
		}
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onFilterFnChange = schedulerMonthView.getOnFilterFnChange();

		if (onFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_FILTER_FN_CHANGE, onFilterFnChange));
		}
	}

	protected void renderOnFixedHeightChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onFixedHeightChange = schedulerMonthView.getOnFixedHeightChange();

		if (onFixedHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_FIXED_HEIGHT_CHANGE, onFixedHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onFocusedChange = schedulerMonthView.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onHeaderDateFormatterChange = schedulerMonthView.getOnHeaderDateFormatterChange();

		if (onHeaderDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_HEADER_DATE_FORMATTER_CHANGE, onHeaderDateFormatterChange));
		}
	}

	protected void renderOnHeaderTableNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onHeaderTableNodeChange = schedulerMonthView.getOnHeaderTableNodeChange();

		if (onHeaderTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_HEADER_TABLE_NODE_CHANGE, onHeaderTableNodeChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onHeightChange = schedulerMonthView.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onHideClassChange = schedulerMonthView.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onIdChange = schedulerMonthView.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onInitializedChange = schedulerMonthView.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerMonthView.getOnIsoTimeChange();

		if (onIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onLocaleChange = schedulerMonthView.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onNameChange = schedulerMonthView.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerMonthView.getOnNavigationDateFormatterChange();

		if (onNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
		}
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onNextDateChange = schedulerMonthView.getOnNextDateChange();

		if (onNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_NEXT_DATE_CHANGE, onNextDateChange));
		}
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onPrevDateChange = schedulerMonthView.getOnPrevDateChange();

		if (onPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_PREV_DATE_CHANGE, onPrevDateChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onRenderChange = schedulerMonthView.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onRenderedChange = schedulerMonthView.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRowsContainerNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onRowsContainerNodeChange = schedulerMonthView.getOnRowsContainerNodeChange();

		if (onRowsContainerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_ROWS_CONTAINER_NODE_CHANGE, onRowsContainerNodeChange));
		}
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onSchedulerChange = schedulerMonthView.getOnSchedulerChange();

		if (onSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_SCHEDULER_CHANGE, onSchedulerChange));
		}
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onScrollableChange = schedulerMonthView.getOnScrollableChange();

		if (onScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_SCROLLABLE_CHANGE, onScrollableChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerMonthView.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onStringsChange = schedulerMonthView.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onTabIndexChange = schedulerMonthView.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTableGridNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onTableGridNodeChange = schedulerMonthView.getOnTableGridNodeChange();

		if (onTableGridNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_TABLE_GRID_NODE_CHANGE, onTableGridNodeChange));
		}
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerMonthView.getOnTriggerNodeChange();

		if (onTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onUseARIAChange = schedulerMonthView.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onVisibleChange = schedulerMonthView.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onWidthChange = schedulerMonthView.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerMonthView.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}