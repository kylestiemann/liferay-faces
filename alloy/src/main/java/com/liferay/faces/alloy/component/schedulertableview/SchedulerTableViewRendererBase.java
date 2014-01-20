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
package com.liferay.faces.alloy.component.schedulertableview;

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
public abstract class SchedulerTableViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-table";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerTableView schedulerTableView = (SchedulerTableView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerTableView = new A.SchedulerTableView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderSchedulerTableViewBodyContent(renderedAttributes, schedulerTableView);
		renderBoundingBox(renderedAttributes, schedulerTableView);
		renderColHeaderDaysNode(renderedAttributes, schedulerTableView);
		renderContentBox(renderedAttributes, schedulerTableView);
		renderCssClass(renderedAttributes, schedulerTableView);
		renderDestroyed(renderedAttributes, schedulerTableView);
		renderDisabled(renderedAttributes, schedulerTableView);
		renderDisplayDaysInterval(renderedAttributes, schedulerTableView);
		renderDisplayRows(renderedAttributes, schedulerTableView);
		renderFilterFn(renderedAttributes, schedulerTableView);
		renderFixedHeight(renderedAttributes, schedulerTableView);
		renderFocused(renderedAttributes, schedulerTableView);
		renderHeaderDateFormatter(renderedAttributes, schedulerTableView);
		renderHeaderTableNode(renderedAttributes, schedulerTableView);
		renderHeight(renderedAttributes, schedulerTableView);
		renderHideClass(renderedAttributes, schedulerTableView);
		renderSchedulerTableViewId(renderedAttributes, schedulerTableView);
		renderInitialized(renderedAttributes, schedulerTableView);
		renderIsoTime(renderedAttributes, schedulerTableView);
		renderSchedulerTableViewLocale(renderedAttributes, schedulerTableView);
		renderName(renderedAttributes, schedulerTableView);
		renderNavigationDateFormatter(renderedAttributes, schedulerTableView);
		renderNextDate(renderedAttributes, schedulerTableView);
		renderPrevDate(renderedAttributes, schedulerTableView);
		renderRender(renderedAttributes, schedulerTableView);
		renderRendered(renderedAttributes, schedulerTableView);
		renderRowsContainerNode(renderedAttributes, schedulerTableView);
		renderScheduler(renderedAttributes, schedulerTableView);
		renderScrollable(renderedAttributes, schedulerTableView);
		renderSrcNode(renderedAttributes, schedulerTableView);
		renderStrings(renderedAttributes, schedulerTableView);
		renderTabIndex(renderedAttributes, schedulerTableView);
		renderTableGridNode(renderedAttributes, schedulerTableView);
		renderTriggerNode(renderedAttributes, schedulerTableView);
		renderUseARIA(renderedAttributes, schedulerTableView);
		renderVisible(renderedAttributes, schedulerTableView);
		renderWidth(renderedAttributes, schedulerTableView);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBodyContentChange(renderedAfterEvents, schedulerTableView);
		renderAfterBoundingBoxChange(renderedAfterEvents, schedulerTableView);
		renderAfterColHeaderDaysNodeChange(renderedAfterEvents, schedulerTableView);
		renderAfterContentBoxChange(renderedAfterEvents, schedulerTableView);
		renderAfterCssClassChange(renderedAfterEvents, schedulerTableView);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerTableView);
		renderAfterDisabledChange(renderedAfterEvents, schedulerTableView);
		renderAfterDisplayDaysIntervalChange(renderedAfterEvents, schedulerTableView);
		renderAfterDisplayRowsChange(renderedAfterEvents, schedulerTableView);
		renderAfterFilterFnChange(renderedAfterEvents, schedulerTableView);
		renderAfterFixedHeightChange(renderedAfterEvents, schedulerTableView);
		renderAfterFocusedChange(renderedAfterEvents, schedulerTableView);
		renderAfterHeaderDateFormatterChange(renderedAfterEvents, schedulerTableView);
		renderAfterHeaderTableNodeChange(renderedAfterEvents, schedulerTableView);
		renderAfterHeightChange(renderedAfterEvents, schedulerTableView);
		renderAfterHideClassChange(renderedAfterEvents, schedulerTableView);
		renderAfterIdChange(renderedAfterEvents, schedulerTableView);
		renderAfterInitializedChange(renderedAfterEvents, schedulerTableView);
		renderAfterIsoTimeChange(renderedAfterEvents, schedulerTableView);
		renderAfterLocaleChange(renderedAfterEvents, schedulerTableView);
		renderAfterNameChange(renderedAfterEvents, schedulerTableView);
		renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerTableView);
		renderAfterNextDateChange(renderedAfterEvents, schedulerTableView);
		renderAfterPrevDateChange(renderedAfterEvents, schedulerTableView);
		renderAfterRenderChange(renderedAfterEvents, schedulerTableView);
		renderAfterRenderedChange(renderedAfterEvents, schedulerTableView);
		renderAfterRowsContainerNodeChange(renderedAfterEvents, schedulerTableView);
		renderAfterSchedulerChange(renderedAfterEvents, schedulerTableView);
		renderAfterScrollableChange(renderedAfterEvents, schedulerTableView);
		renderAfterSrcNodeChange(renderedAfterEvents, schedulerTableView);
		renderAfterStringsChange(renderedAfterEvents, schedulerTableView);
		renderAfterTabIndexChange(renderedAfterEvents, schedulerTableView);
		renderAfterTableGridNodeChange(renderedAfterEvents, schedulerTableView);
		renderAfterTriggerNodeChange(renderedAfterEvents, schedulerTableView);
		renderAfterUseARIAChange(renderedAfterEvents, schedulerTableView);
		renderAfterVisibleChange(renderedAfterEvents, schedulerTableView);
		renderAfterWidthChange(renderedAfterEvents, schedulerTableView);

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

		renderOnBodyContentChange(renderedOnEvents, schedulerTableView);
		renderOnBoundingBoxChange(renderedOnEvents, schedulerTableView);
		renderOnColHeaderDaysNodeChange(renderedOnEvents, schedulerTableView);
		renderOnContentBoxChange(renderedOnEvents, schedulerTableView);
		renderOnCssClassChange(renderedOnEvents, schedulerTableView);
		renderOnDestroyedChange(renderedOnEvents, schedulerTableView);
		renderOnDisabledChange(renderedOnEvents, schedulerTableView);
		renderOnDisplayDaysIntervalChange(renderedOnEvents, schedulerTableView);
		renderOnDisplayRowsChange(renderedOnEvents, schedulerTableView);
		renderOnFilterFnChange(renderedOnEvents, schedulerTableView);
		renderOnFixedHeightChange(renderedOnEvents, schedulerTableView);
		renderOnFocusedChange(renderedOnEvents, schedulerTableView);
		renderOnHeaderDateFormatterChange(renderedOnEvents, schedulerTableView);
		renderOnHeaderTableNodeChange(renderedOnEvents, schedulerTableView);
		renderOnHeightChange(renderedOnEvents, schedulerTableView);
		renderOnHideClassChange(renderedOnEvents, schedulerTableView);
		renderOnIdChange(renderedOnEvents, schedulerTableView);
		renderOnInitializedChange(renderedOnEvents, schedulerTableView);
		renderOnIsoTimeChange(renderedOnEvents, schedulerTableView);
		renderOnLocaleChange(renderedOnEvents, schedulerTableView);
		renderOnNameChange(renderedOnEvents, schedulerTableView);
		renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerTableView);
		renderOnNextDateChange(renderedOnEvents, schedulerTableView);
		renderOnPrevDateChange(renderedOnEvents, schedulerTableView);
		renderOnRenderChange(renderedOnEvents, schedulerTableView);
		renderOnRenderedChange(renderedOnEvents, schedulerTableView);
		renderOnRowsContainerNodeChange(renderedOnEvents, schedulerTableView);
		renderOnSchedulerChange(renderedOnEvents, schedulerTableView);
		renderOnScrollableChange(renderedOnEvents, schedulerTableView);
		renderOnSrcNodeChange(renderedOnEvents, schedulerTableView);
		renderOnStringsChange(renderedOnEvents, schedulerTableView);
		renderOnTabIndexChange(renderedOnEvents, schedulerTableView);
		renderOnTableGridNodeChange(renderedOnEvents, schedulerTableView);
		renderOnTriggerNodeChange(renderedOnEvents, schedulerTableView);
		renderOnUseARIAChange(renderedOnEvents, schedulerTableView);
		renderOnVisibleChange(renderedOnEvents, schedulerTableView);
		renderOnWidthChange(renderedOnEvents, schedulerTableView);

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

	protected void renderSchedulerTableViewBodyContent(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String schedulerTableViewBodyContent = schedulerTableView.getSchedulerTableViewBodyContent();

		if (schedulerTableViewBodyContent != null) {
			renderedAttributes.add(renderString(SchedulerTableView.SCHEDULER_TABLE_VIEW_BODY_CONTENT, schedulerTableViewBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String boundingBox = schedulerTableView.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(SchedulerTableView.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderColHeaderDaysNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String colHeaderDaysNode = schedulerTableView.getColHeaderDaysNode();

		if (colHeaderDaysNode != null) {
			renderedAttributes.add(renderString(SchedulerTableView.COL_HEADER_DAYS_NODE, colHeaderDaysNode));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String contentBox = schedulerTableView.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(SchedulerTableView.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String cssClass = schedulerTableView.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(SchedulerTableView.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean destroyed = schedulerTableView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean disabled = schedulerTableView.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.DISABLED, disabled));
		}
	}

	protected void renderDisplayDaysInterval(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object displayDaysInterval = schedulerTableView.getDisplayDaysInterval();

		if (displayDaysInterval != null) {
			renderedAttributes.add(renderNumber(SchedulerTableView.DISPLAY_DAYS_INTERVAL, displayDaysInterval));
		}
	}

	protected void renderDisplayRows(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object displayRows = schedulerTableView.getDisplayRows();

		if (displayRows != null) {
			renderedAttributes.add(renderNumber(SchedulerTableView.DISPLAY_ROWS, displayRows));
		}
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String filterFn = schedulerTableView.getFilterFn();

		if (filterFn != null) {
			renderedAttributes.add(renderString(SchedulerTableView.FILTER_FN, filterFn));
		}
	}

	protected void renderFixedHeight(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean fixedHeight = schedulerTableView.getFixedHeight();

		if (fixedHeight != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.FIXED_HEIGHT, fixedHeight));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean focused = schedulerTableView.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.FOCUSED, focused));
		}
	}

	protected void renderHeaderDateFormatter(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String headerDateFormatter = schedulerTableView.getHeaderDateFormatter();

		if (headerDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerTableView.HEADER_DATE_FORMATTER, headerDateFormatter));
		}
	}

	protected void renderHeaderTableNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String headerTableNode = schedulerTableView.getHeaderTableNode();

		if (headerTableNode != null) {
			renderedAttributes.add(renderString(SchedulerTableView.HEADER_TABLE_NODE, headerTableNode));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object height = schedulerTableView.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(SchedulerTableView.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String hideClass = schedulerTableView.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(SchedulerTableView.HIDE_CLASS, hideClass));
		}
	}

	protected void renderSchedulerTableViewId(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String schedulerTableViewId = schedulerTableView.getSchedulerTableViewId();

		if (schedulerTableViewId != null) {
			renderedAttributes.add(renderString(SchedulerTableView.SCHEDULER_TABLE_VIEW_ID, schedulerTableViewId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean initialized = schedulerTableView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.INITIALIZED, initialized));
		}
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean isoTime = schedulerTableView.getIsoTime();

		if (isoTime != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.ISO_TIME, isoTime));
		}
	}

	protected void renderSchedulerTableViewLocale(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String schedulerTableViewLocale = schedulerTableView.getSchedulerTableViewLocale();

		if (schedulerTableViewLocale != null) {
			renderedAttributes.add(renderString(SchedulerTableView.SCHEDULER_TABLE_VIEW_LOCALE, schedulerTableViewLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String name = schedulerTableView.getName();

		if (name != null) {
			renderedAttributes.add(renderString(SchedulerTableView.NAME, name));
		}
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerTableView.getNavigationDateFormatter();

		if (navigationDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerTableView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
		}
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String nextDate = schedulerTableView.getNextDate();

		if (nextDate != null) {
			renderedAttributes.add(renderString(SchedulerTableView.NEXT_DATE, nextDate));
		}
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String prevDate = schedulerTableView.getPrevDate();

		if (prevDate != null) {
			renderedAttributes.add(renderString(SchedulerTableView.PREV_DATE, prevDate));
		}
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object render = schedulerTableView.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(SchedulerTableView.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean rendered = schedulerTableView.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.RENDERED, rendered));
		}
	}

	protected void renderRowsContainerNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String rowsContainerNode = schedulerTableView.getRowsContainerNode();

		if (rowsContainerNode != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ROWS_CONTAINER_NODE, rowsContainerNode));
		}
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String scheduler = schedulerTableView.getScheduler();

		if (scheduler != null) {
			renderedAttributes.add(renderString(SchedulerTableView.SCHEDULER, scheduler));
		}
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean scrollable = schedulerTableView.getScrollable();

		if (scrollable != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.SCROLLABLE, scrollable));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String srcNode = schedulerTableView.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(SchedulerTableView.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String strings = schedulerTableView.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderString(SchedulerTableView.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object tabIndex = schedulerTableView.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(SchedulerTableView.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTableGridNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String tableGridNode = schedulerTableView.getTableGridNode();

		if (tableGridNode != null) {
			renderedAttributes.add(renderString(SchedulerTableView.TABLE_GRID_NODE, tableGridNode));
		}
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String triggerNode = schedulerTableView.getTriggerNode();

		if (triggerNode != null) {
			renderedAttributes.add(renderString(SchedulerTableView.TRIGGER_NODE, triggerNode));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean useARIA = schedulerTableView.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean visible = schedulerTableView.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerTableView.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object width = schedulerTableView.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(SchedulerTableView.WIDTH, width));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerTableView.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerTableView.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterColHeaderDaysNodeChange = schedulerTableView.getAfterColHeaderDaysNodeChange();

		if (afterColHeaderDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_COL_HEADER_DAYS_NODE_CHANGE, afterColHeaderDaysNodeChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerTableView.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterCssClassChange = schedulerTableView.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerTableView.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterDisabledChange = schedulerTableView.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDisplayDaysIntervalChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterDisplayDaysIntervalChange = schedulerTableView.getAfterDisplayDaysIntervalChange();

		if (afterDisplayDaysIntervalChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_DISPLAY_DAYS_INTERVAL_CHANGE, afterDisplayDaysIntervalChange));
		}
	}

	protected void renderAfterDisplayRowsChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterDisplayRowsChange = schedulerTableView.getAfterDisplayRowsChange();

		if (afterDisplayRowsChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_DISPLAY_ROWS_CHANGE, afterDisplayRowsChange));
		}
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerTableView.getAfterFilterFnChange();

		if (afterFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
		}
	}

	protected void renderAfterFixedHeightChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterFixedHeightChange = schedulerTableView.getAfterFixedHeightChange();

		if (afterFixedHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_FIXED_HEIGHT_CHANGE, afterFixedHeightChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterFocusedChange = schedulerTableView.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterHeaderDateFormatterChange = schedulerTableView.getAfterHeaderDateFormatterChange();

		if (afterHeaderDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_HEADER_DATE_FORMATTER_CHANGE, afterHeaderDateFormatterChange));
		}
	}

	protected void renderAfterHeaderTableNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterHeaderTableNodeChange = schedulerTableView.getAfterHeaderTableNodeChange();

		if (afterHeaderTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_HEADER_TABLE_NODE_CHANGE, afterHeaderTableNodeChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterHeightChange = schedulerTableView.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterHideClassChange = schedulerTableView.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterIdChange = schedulerTableView.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterInitializedChange = schedulerTableView.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerTableView.getAfterIsoTimeChange();

		if (afterIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterLocaleChange = schedulerTableView.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterNameChange = schedulerTableView.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerTableView.getAfterNavigationDateFormatterChange();

		if (afterNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
		}
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterNextDateChange = schedulerTableView.getAfterNextDateChange();

		if (afterNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
		}
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerTableView.getAfterPrevDateChange();

		if (afterPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterRenderChange = schedulerTableView.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterRenderedChange = schedulerTableView.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRowsContainerNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterRowsContainerNodeChange = schedulerTableView.getAfterRowsContainerNodeChange();

		if (afterRowsContainerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_ROWS_CONTAINER_NODE_CHANGE, afterRowsContainerNodeChange));
		}
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerTableView.getAfterSchedulerChange();

		if (afterSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
		}
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterScrollableChange = schedulerTableView.getAfterScrollableChange();

		if (afterScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerTableView.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterStringsChange = schedulerTableView.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerTableView.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTableGridNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterTableGridNodeChange = schedulerTableView.getAfterTableGridNodeChange();

		if (afterTableGridNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_TABLE_GRID_NODE_CHANGE, afterTableGridNodeChange));
		}
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerTableView.getAfterTriggerNodeChange();

		if (afterTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerTableView.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterVisibleChange = schedulerTableView.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterWidthChange = schedulerTableView.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onBodyContentChange = schedulerTableView.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerTableView.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onColHeaderDaysNodeChange = schedulerTableView.getOnColHeaderDaysNodeChange();

		if (onColHeaderDaysNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_COL_HEADER_DAYS_NODE_CHANGE, onColHeaderDaysNodeChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onContentBoxChange = schedulerTableView.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onCssClassChange = schedulerTableView.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onDestroyedChange = schedulerTableView.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onDisabledChange = schedulerTableView.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDisplayDaysIntervalChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onDisplayDaysIntervalChange = schedulerTableView.getOnDisplayDaysIntervalChange();

		if (onDisplayDaysIntervalChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_DISPLAY_DAYS_INTERVAL_CHANGE, onDisplayDaysIntervalChange));
		}
	}

	protected void renderOnDisplayRowsChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onDisplayRowsChange = schedulerTableView.getOnDisplayRowsChange();

		if (onDisplayRowsChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_DISPLAY_ROWS_CHANGE, onDisplayRowsChange));
		}
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onFilterFnChange = schedulerTableView.getOnFilterFnChange();

		if (onFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_FILTER_FN_CHANGE, onFilterFnChange));
		}
	}

	protected void renderOnFixedHeightChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onFixedHeightChange = schedulerTableView.getOnFixedHeightChange();

		if (onFixedHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_FIXED_HEIGHT_CHANGE, onFixedHeightChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onFocusedChange = schedulerTableView.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onHeaderDateFormatterChange = schedulerTableView.getOnHeaderDateFormatterChange();

		if (onHeaderDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_HEADER_DATE_FORMATTER_CHANGE, onHeaderDateFormatterChange));
		}
	}

	protected void renderOnHeaderTableNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onHeaderTableNodeChange = schedulerTableView.getOnHeaderTableNodeChange();

		if (onHeaderTableNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_HEADER_TABLE_NODE_CHANGE, onHeaderTableNodeChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onHeightChange = schedulerTableView.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onHideClassChange = schedulerTableView.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onIdChange = schedulerTableView.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onInitializedChange = schedulerTableView.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerTableView.getOnIsoTimeChange();

		if (onIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onLocaleChange = schedulerTableView.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onNameChange = schedulerTableView.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerTableView.getOnNavigationDateFormatterChange();

		if (onNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
		}
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onNextDateChange = schedulerTableView.getOnNextDateChange();

		if (onNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_NEXT_DATE_CHANGE, onNextDateChange));
		}
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onPrevDateChange = schedulerTableView.getOnPrevDateChange();

		if (onPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_PREV_DATE_CHANGE, onPrevDateChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onRenderChange = schedulerTableView.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onRenderedChange = schedulerTableView.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRowsContainerNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onRowsContainerNodeChange = schedulerTableView.getOnRowsContainerNodeChange();

		if (onRowsContainerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_ROWS_CONTAINER_NODE_CHANGE, onRowsContainerNodeChange));
		}
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onSchedulerChange = schedulerTableView.getOnSchedulerChange();

		if (onSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_SCHEDULER_CHANGE, onSchedulerChange));
		}
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onScrollableChange = schedulerTableView.getOnScrollableChange();

		if (onScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_SCROLLABLE_CHANGE, onScrollableChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerTableView.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onStringsChange = schedulerTableView.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onTabIndexChange = schedulerTableView.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTableGridNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onTableGridNodeChange = schedulerTableView.getOnTableGridNodeChange();

		if (onTableGridNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_TABLE_GRID_NODE_CHANGE, onTableGridNodeChange));
		}
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerTableView.getOnTriggerNodeChange();

		if (onTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onUseARIAChange = schedulerTableView.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onVisibleChange = schedulerTableView.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onWidthChange = schedulerTableView.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerTableView.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}