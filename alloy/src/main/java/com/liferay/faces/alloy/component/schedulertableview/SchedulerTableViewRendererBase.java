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

		if (schedulerTableView.getSchedulerTableViewBodyContent() != null) {
			renderSchedulerTableViewBodyContent(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getColHeaderDaysNode() != null) {
			renderColHeaderDaysNode(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getContentBox() != null) {
			renderContentBox(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getCssClass() != null) {
			renderCssClass(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getDisabled() != null) {
			renderDisabled(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getDisplayDaysInterval() != null) {
			renderDisplayDaysInterval(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getDisplayRows() != null) {
			renderDisplayRows(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getFilterFn() != null) {
			renderFilterFn(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getFixedHeight() != null) {
			renderFixedHeight(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getFocused() != null) {
			renderFocused(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getHeaderDateFormatter() != null) {
			renderHeaderDateFormatter(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getHeaderTableNode() != null) {
			renderHeaderTableNode(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getHeight() != null) {
			renderHeight(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getHideClass() != null) {
			renderHideClass(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getSchedulerTableViewId() != null) {
			renderSchedulerTableViewId(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getInitialized() != null) {
			renderInitialized(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getIsoTime() != null) {
			renderIsoTime(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getSchedulerTableViewLocale() != null) {
			renderSchedulerTableViewLocale(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getName() != null) {
			renderName(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getNavigationDateFormatter() != null) {
			renderNavigationDateFormatter(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getNextDate() != null) {
			renderNextDate(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getPrevDate() != null) {
			renderPrevDate(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getRender() != null) {
			renderRender(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getRendered() != null) {
			renderRendered(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getRowsContainerNode() != null) {
			renderRowsContainerNode(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getScheduler() != null) {
			renderScheduler(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getScrollable() != null) {
			renderScrollable(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getStrings() != null) {
			renderStrings(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getTableGridNode() != null) {
			renderTableGridNode(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getTriggerNode() != null) {
			renderTriggerNode(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getVisible() != null) {
			renderVisible(renderedAttributes, schedulerTableView);
		}
		
		if (schedulerTableView.getWidth() != null) {
			renderWidth(renderedAttributes, schedulerTableView);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerTableView.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterColHeaderDaysNodeChange() != null) {
			renderAfterColHeaderDaysNodeChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterDisplayDaysIntervalChange() != null) {
			renderAfterDisplayDaysIntervalChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterDisplayRowsChange() != null) {
			renderAfterDisplayRowsChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterFilterFnChange() != null) {
			renderAfterFilterFnChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterFixedHeightChange() != null) {
			renderAfterFixedHeightChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterHeaderDateFormatterChange() != null) {
			renderAfterHeaderDateFormatterChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterHeaderTableNodeChange() != null) {
			renderAfterHeaderTableNodeChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterIsoTimeChange() != null) {
			renderAfterIsoTimeChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterNavigationDateFormatterChange() != null) {
			renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterNextDateChange() != null) {
			renderAfterNextDateChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterPrevDateChange() != null) {
			renderAfterPrevDateChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterRowsContainerNodeChange() != null) {
			renderAfterRowsContainerNodeChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterSchedulerChange() != null) {
			renderAfterSchedulerChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterScrollableChange() != null) {
			renderAfterScrollableChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterTableGridNodeChange() != null) {
			renderAfterTableGridNodeChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterTriggerNodeChange() != null) {
			renderAfterTriggerNodeChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, schedulerTableView);
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

		if (schedulerTableView.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnColHeaderDaysNodeChange() != null) {
			renderOnColHeaderDaysNodeChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnDisplayDaysIntervalChange() != null) {
			renderOnDisplayDaysIntervalChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnDisplayRowsChange() != null) {
			renderOnDisplayRowsChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnFilterFnChange() != null) {
			renderOnFilterFnChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnFixedHeightChange() != null) {
			renderOnFixedHeightChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnHeaderDateFormatterChange() != null) {
			renderOnHeaderDateFormatterChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnHeaderTableNodeChange() != null) {
			renderOnHeaderTableNodeChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnIsoTimeChange() != null) {
			renderOnIsoTimeChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnNavigationDateFormatterChange() != null) {
			renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnNextDateChange() != null) {
			renderOnNextDateChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnPrevDateChange() != null) {
			renderOnPrevDateChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnRowsContainerNodeChange() != null) {
			renderOnRowsContainerNodeChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnSchedulerChange() != null) {
			renderOnSchedulerChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnScrollableChange() != null) {
			renderOnScrollableChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnTableGridNodeChange() != null) {
			renderOnTableGridNodeChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnTriggerNodeChange() != null) {
			renderOnTriggerNodeChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, schedulerTableView);
		}
		
		if (schedulerTableView.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, schedulerTableView);
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

	protected void renderSchedulerTableViewBodyContent(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String schedulerTableViewBodyContent = schedulerTableView.getSchedulerTableViewBodyContent();
		renderedAttributes.add(renderString(SchedulerTableView.SCHEDULER_TABLE_VIEW_BODY_CONTENT, schedulerTableViewBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String boundingBox = schedulerTableView.getBoundingBox();
		renderedAttributes.add(renderString(SchedulerTableView.BOUNDING_BOX, boundingBox));
	}

	protected void renderColHeaderDaysNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String colHeaderDaysNode = schedulerTableView.getColHeaderDaysNode();
		renderedAttributes.add(renderString(SchedulerTableView.COL_HEADER_DAYS_NODE, colHeaderDaysNode));
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String contentBox = schedulerTableView.getContentBox();
		renderedAttributes.add(renderString(SchedulerTableView.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String cssClass = schedulerTableView.getCssClass();
		renderedAttributes.add(renderString(SchedulerTableView.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean destroyed = schedulerTableView.getDestroyed();
		renderedAttributes.add(renderBoolean(SchedulerTableView.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean disabled = schedulerTableView.getDisabled();
		renderedAttributes.add(renderBoolean(SchedulerTableView.DISABLED, disabled));
	}

	protected void renderDisplayDaysInterval(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object displayDaysInterval = schedulerTableView.getDisplayDaysInterval();
		renderedAttributes.add(renderNumber(SchedulerTableView.DISPLAY_DAYS_INTERVAL, displayDaysInterval));
	}

	protected void renderDisplayRows(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object displayRows = schedulerTableView.getDisplayRows();
		renderedAttributes.add(renderNumber(SchedulerTableView.DISPLAY_ROWS, displayRows));
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String filterFn = schedulerTableView.getFilterFn();
		renderedAttributes.add(renderString(SchedulerTableView.FILTER_FN, filterFn));
	}

	protected void renderFixedHeight(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean fixedHeight = schedulerTableView.getFixedHeight();
		renderedAttributes.add(renderBoolean(SchedulerTableView.FIXED_HEIGHT, fixedHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean focused = schedulerTableView.getFocused();
		renderedAttributes.add(renderBoolean(SchedulerTableView.FOCUSED, focused));
	}

	protected void renderHeaderDateFormatter(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String headerDateFormatter = schedulerTableView.getHeaderDateFormatter();
		renderedAttributes.add(renderString(SchedulerTableView.HEADER_DATE_FORMATTER, headerDateFormatter));
	}

	protected void renderHeaderTableNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String headerTableNode = schedulerTableView.getHeaderTableNode();
		renderedAttributes.add(renderString(SchedulerTableView.HEADER_TABLE_NODE, headerTableNode));
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object height = schedulerTableView.getHeight();
		renderedAttributes.add(renderNumber(SchedulerTableView.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String hideClass = schedulerTableView.getHideClass();
		renderedAttributes.add(renderString(SchedulerTableView.HIDE_CLASS, hideClass));
	}

	protected void renderSchedulerTableViewId(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String schedulerTableViewId = schedulerTableView.getSchedulerTableViewId();
		renderedAttributes.add(renderString(SchedulerTableView.SCHEDULER_TABLE_VIEW_ID, schedulerTableViewId));
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean initialized = schedulerTableView.getInitialized();
		renderedAttributes.add(renderBoolean(SchedulerTableView.INITIALIZED, initialized));
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean isoTime = schedulerTableView.getIsoTime();
		renderedAttributes.add(renderBoolean(SchedulerTableView.ISO_TIME, isoTime));
	}

	protected void renderSchedulerTableViewLocale(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String schedulerTableViewLocale = schedulerTableView.getSchedulerTableViewLocale();
		renderedAttributes.add(renderString(SchedulerTableView.SCHEDULER_TABLE_VIEW_LOCALE, schedulerTableViewLocale));
	}

	protected void renderName(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String name = schedulerTableView.getName();
		renderedAttributes.add(renderString(SchedulerTableView.NAME, name));
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerTableView.getNavigationDateFormatter();
		renderedAttributes.add(renderString(SchedulerTableView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String nextDate = schedulerTableView.getNextDate();
		renderedAttributes.add(renderString(SchedulerTableView.NEXT_DATE, nextDate));
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String prevDate = schedulerTableView.getPrevDate();
		renderedAttributes.add(renderString(SchedulerTableView.PREV_DATE, prevDate));
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object render = schedulerTableView.getRender();
		renderedAttributes.add(renderString(SchedulerTableView.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean rendered = schedulerTableView.getRendered();
		renderedAttributes.add(renderBoolean(SchedulerTableView.RENDERED, rendered));
	}

	protected void renderRowsContainerNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String rowsContainerNode = schedulerTableView.getRowsContainerNode();
		renderedAttributes.add(renderString(SchedulerTableView.ROWS_CONTAINER_NODE, rowsContainerNode));
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String scheduler = schedulerTableView.getScheduler();
		renderedAttributes.add(renderString(SchedulerTableView.SCHEDULER, scheduler));
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean scrollable = schedulerTableView.getScrollable();
		renderedAttributes.add(renderBoolean(SchedulerTableView.SCROLLABLE, scrollable));
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String srcNode = schedulerTableView.getSrcNode();
		renderedAttributes.add(renderString(SchedulerTableView.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String strings = schedulerTableView.getStrings();
		renderedAttributes.add(renderString(SchedulerTableView.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object tabIndex = schedulerTableView.getTabIndex();
		renderedAttributes.add(renderNumber(SchedulerTableView.TAB_INDEX, tabIndex));
	}

	protected void renderTableGridNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String tableGridNode = schedulerTableView.getTableGridNode();
		renderedAttributes.add(renderString(SchedulerTableView.TABLE_GRID_NODE, tableGridNode));
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String triggerNode = schedulerTableView.getTriggerNode();
		renderedAttributes.add(renderString(SchedulerTableView.TRIGGER_NODE, triggerNode));
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean useARIA = schedulerTableView.getUseARIA();
		renderedAttributes.add(renderBoolean(SchedulerTableView.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Boolean visible = schedulerTableView.getVisible();
		renderedAttributes.add(renderBoolean(SchedulerTableView.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.Object width = schedulerTableView.getWidth();
		renderedAttributes.add(renderString(SchedulerTableView.WIDTH, width));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerTableView.getAfterBodyContentChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerTableView.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterColHeaderDaysNodeChange = schedulerTableView.getAfterColHeaderDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_COL_HEADER_DAYS_NODE_CHANGE, afterColHeaderDaysNodeChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerTableView.getAfterContentBoxChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterCssClassChange = schedulerTableView.getAfterCssClassChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerTableView.getAfterDestroyedChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterDisabledChange = schedulerTableView.getAfterDisabledChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDisplayDaysIntervalChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterDisplayDaysIntervalChange = schedulerTableView.getAfterDisplayDaysIntervalChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_DISPLAY_DAYS_INTERVAL_CHANGE, afterDisplayDaysIntervalChange));
	}

	protected void renderAfterDisplayRowsChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterDisplayRowsChange = schedulerTableView.getAfterDisplayRowsChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_DISPLAY_ROWS_CHANGE, afterDisplayRowsChange));
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerTableView.getAfterFilterFnChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
	}

	protected void renderAfterFixedHeightChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterFixedHeightChange = schedulerTableView.getAfterFixedHeightChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_FIXED_HEIGHT_CHANGE, afterFixedHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterFocusedChange = schedulerTableView.getAfterFocusedChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterHeaderDateFormatterChange = schedulerTableView.getAfterHeaderDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_HEADER_DATE_FORMATTER_CHANGE, afterHeaderDateFormatterChange));
	}

	protected void renderAfterHeaderTableNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterHeaderTableNodeChange = schedulerTableView.getAfterHeaderTableNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_HEADER_TABLE_NODE_CHANGE, afterHeaderTableNodeChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterHeightChange = schedulerTableView.getAfterHeightChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterHideClassChange = schedulerTableView.getAfterHideClassChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterIdChange = schedulerTableView.getAfterIdChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterInitializedChange = schedulerTableView.getAfterInitializedChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerTableView.getAfterIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterLocaleChange = schedulerTableView.getAfterLocaleChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterNameChange = schedulerTableView.getAfterNameChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerTableView.getAfterNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterNextDateChange = schedulerTableView.getAfterNextDateChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerTableView.getAfterPrevDateChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterRenderChange = schedulerTableView.getAfterRenderChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterRenderedChange = schedulerTableView.getAfterRenderedChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRowsContainerNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterRowsContainerNodeChange = schedulerTableView.getAfterRowsContainerNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_ROWS_CONTAINER_NODE_CHANGE, afterRowsContainerNodeChange));
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerTableView.getAfterSchedulerChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterScrollableChange = schedulerTableView.getAfterScrollableChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerTableView.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterStringsChange = schedulerTableView.getAfterStringsChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerTableView.getAfterTabIndexChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTableGridNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterTableGridNodeChange = schedulerTableView.getAfterTableGridNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_TABLE_GRID_NODE_CHANGE, afterTableGridNodeChange));
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerTableView.getAfterTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerTableView.getAfterUseARIAChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterVisibleChange = schedulerTableView.getAfterVisibleChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String afterWidthChange = schedulerTableView.getAfterWidthChange();
		renderedAttributes.add(renderString(SchedulerTableView.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onBodyContentChange = schedulerTableView.getOnBodyContentChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerTableView.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onColHeaderDaysNodeChange = schedulerTableView.getOnColHeaderDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_COL_HEADER_DAYS_NODE_CHANGE, onColHeaderDaysNodeChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onContentBoxChange = schedulerTableView.getOnContentBoxChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onCssClassChange = schedulerTableView.getOnCssClassChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onDestroyedChange = schedulerTableView.getOnDestroyedChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onDisabledChange = schedulerTableView.getOnDisabledChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDisplayDaysIntervalChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onDisplayDaysIntervalChange = schedulerTableView.getOnDisplayDaysIntervalChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_DISPLAY_DAYS_INTERVAL_CHANGE, onDisplayDaysIntervalChange));
	}

	protected void renderOnDisplayRowsChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onDisplayRowsChange = schedulerTableView.getOnDisplayRowsChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_DISPLAY_ROWS_CHANGE, onDisplayRowsChange));
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onFilterFnChange = schedulerTableView.getOnFilterFnChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_FILTER_FN_CHANGE, onFilterFnChange));
	}

	protected void renderOnFixedHeightChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onFixedHeightChange = schedulerTableView.getOnFixedHeightChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_FIXED_HEIGHT_CHANGE, onFixedHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onFocusedChange = schedulerTableView.getOnFocusedChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onHeaderDateFormatterChange = schedulerTableView.getOnHeaderDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_HEADER_DATE_FORMATTER_CHANGE, onHeaderDateFormatterChange));
	}

	protected void renderOnHeaderTableNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onHeaderTableNodeChange = schedulerTableView.getOnHeaderTableNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_HEADER_TABLE_NODE_CHANGE, onHeaderTableNodeChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onHeightChange = schedulerTableView.getOnHeightChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onHideClassChange = schedulerTableView.getOnHideClassChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onIdChange = schedulerTableView.getOnIdChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onInitializedChange = schedulerTableView.getOnInitializedChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerTableView.getOnIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onLocaleChange = schedulerTableView.getOnLocaleChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onNameChange = schedulerTableView.getOnNameChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerTableView.getOnNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onNextDateChange = schedulerTableView.getOnNextDateChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_NEXT_DATE_CHANGE, onNextDateChange));
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onPrevDateChange = schedulerTableView.getOnPrevDateChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_PREV_DATE_CHANGE, onPrevDateChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onRenderChange = schedulerTableView.getOnRenderChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onRenderedChange = schedulerTableView.getOnRenderedChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRowsContainerNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onRowsContainerNodeChange = schedulerTableView.getOnRowsContainerNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_ROWS_CONTAINER_NODE_CHANGE, onRowsContainerNodeChange));
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onSchedulerChange = schedulerTableView.getOnSchedulerChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_SCHEDULER_CHANGE, onSchedulerChange));
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onScrollableChange = schedulerTableView.getOnScrollableChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_SCROLLABLE_CHANGE, onScrollableChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerTableView.getOnSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onStringsChange = schedulerTableView.getOnStringsChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onTabIndexChange = schedulerTableView.getOnTabIndexChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTableGridNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onTableGridNodeChange = schedulerTableView.getOnTableGridNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_TABLE_GRID_NODE_CHANGE, onTableGridNodeChange));
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerTableView.getOnTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onUseARIAChange = schedulerTableView.getOnUseARIAChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onVisibleChange = schedulerTableView.getOnVisibleChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String onWidthChange = schedulerTableView.getOnWidthChange();
		renderedAttributes.add(renderString(SchedulerTableView.ON_WIDTH_CHANGE, onWidthChange));
	}

}