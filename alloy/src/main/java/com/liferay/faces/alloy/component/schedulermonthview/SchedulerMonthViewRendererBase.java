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

		if (schedulerMonthView.getSchedulerMonthViewBodyContent() != null) {
			renderSchedulerMonthViewBodyContent(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getColHeaderDaysNode() != null) {
			renderColHeaderDaysNode(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getContentBox() != null) {
			renderContentBox(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getCssClass() != null) {
			renderCssClass(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getDisabled() != null) {
			renderDisabled(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getDisplayDaysInterval() != null) {
			renderDisplayDaysInterval(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getDisplayRows() != null) {
			renderDisplayRows(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getFilterFn() != null) {
			renderFilterFn(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getFixedHeight() != null) {
			renderFixedHeight(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getFocused() != null) {
			renderFocused(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getHeaderDateFormatter() != null) {
			renderHeaderDateFormatter(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getHeaderTableNode() != null) {
			renderHeaderTableNode(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getHeight() != null) {
			renderHeight(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getHideClass() != null) {
			renderHideClass(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getSchedulerMonthViewId() != null) {
			renderSchedulerMonthViewId(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getInitialized() != null) {
			renderInitialized(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getIsoTime() != null) {
			renderIsoTime(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getSchedulerMonthViewLocale() != null) {
			renderSchedulerMonthViewLocale(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getName() != null) {
			renderName(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getNavigationDateFormatter() != null) {
			renderNavigationDateFormatter(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getNextDate() != null) {
			renderNextDate(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getPrevDate() != null) {
			renderPrevDate(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getRender() != null) {
			renderRender(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getRendered() != null) {
			renderRendered(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getRowsContainerNode() != null) {
			renderRowsContainerNode(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getScheduler() != null) {
			renderScheduler(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getScrollable() != null) {
			renderScrollable(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getStrings() != null) {
			renderStrings(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getTableGridNode() != null) {
			renderTableGridNode(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getTriggerNode() != null) {
			renderTriggerNode(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getVisible() != null) {
			renderVisible(renderedAttributes, schedulerMonthView);
		}
		
		if (schedulerMonthView.getWidth() != null) {
			renderWidth(renderedAttributes, schedulerMonthView);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerMonthView.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterColHeaderDaysNodeChange() != null) {
			renderAfterColHeaderDaysNodeChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterDisplayDaysIntervalChange() != null) {
			renderAfterDisplayDaysIntervalChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterDisplayRowsChange() != null) {
			renderAfterDisplayRowsChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterFilterFnChange() != null) {
			renderAfterFilterFnChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterFixedHeightChange() != null) {
			renderAfterFixedHeightChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterHeaderDateFormatterChange() != null) {
			renderAfterHeaderDateFormatterChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterHeaderTableNodeChange() != null) {
			renderAfterHeaderTableNodeChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterIsoTimeChange() != null) {
			renderAfterIsoTimeChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterNavigationDateFormatterChange() != null) {
			renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterNextDateChange() != null) {
			renderAfterNextDateChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterPrevDateChange() != null) {
			renderAfterPrevDateChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterRowsContainerNodeChange() != null) {
			renderAfterRowsContainerNodeChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterSchedulerChange() != null) {
			renderAfterSchedulerChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterScrollableChange() != null) {
			renderAfterScrollableChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterTableGridNodeChange() != null) {
			renderAfterTableGridNodeChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterTriggerNodeChange() != null) {
			renderAfterTriggerNodeChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, schedulerMonthView);
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

		if (schedulerMonthView.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnColHeaderDaysNodeChange() != null) {
			renderOnColHeaderDaysNodeChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnDisplayDaysIntervalChange() != null) {
			renderOnDisplayDaysIntervalChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnDisplayRowsChange() != null) {
			renderOnDisplayRowsChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnFilterFnChange() != null) {
			renderOnFilterFnChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnFixedHeightChange() != null) {
			renderOnFixedHeightChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnHeaderDateFormatterChange() != null) {
			renderOnHeaderDateFormatterChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnHeaderTableNodeChange() != null) {
			renderOnHeaderTableNodeChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnIsoTimeChange() != null) {
			renderOnIsoTimeChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnNavigationDateFormatterChange() != null) {
			renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnNextDateChange() != null) {
			renderOnNextDateChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnPrevDateChange() != null) {
			renderOnPrevDateChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnRowsContainerNodeChange() != null) {
			renderOnRowsContainerNodeChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnSchedulerChange() != null) {
			renderOnSchedulerChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnScrollableChange() != null) {
			renderOnScrollableChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnTableGridNodeChange() != null) {
			renderOnTableGridNodeChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnTriggerNodeChange() != null) {
			renderOnTriggerNodeChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, schedulerMonthView);
		}
		
		if (schedulerMonthView.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, schedulerMonthView);
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

	protected void renderSchedulerMonthViewBodyContent(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String schedulerMonthViewBodyContent = schedulerMonthView.getSchedulerMonthViewBodyContent();
		renderedAttributes.add(renderString(SchedulerMonthView.SCHEDULER_MONTH_VIEW_BODY_CONTENT, schedulerMonthViewBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String boundingBox = schedulerMonthView.getBoundingBox();
		renderedAttributes.add(renderString(SchedulerMonthView.BOUNDING_BOX, boundingBox));
	}

	protected void renderColHeaderDaysNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String colHeaderDaysNode = schedulerMonthView.getColHeaderDaysNode();
		renderedAttributes.add(renderString(SchedulerMonthView.COL_HEADER_DAYS_NODE, colHeaderDaysNode));
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String contentBox = schedulerMonthView.getContentBox();
		renderedAttributes.add(renderString(SchedulerMonthView.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String cssClass = schedulerMonthView.getCssClass();
		renderedAttributes.add(renderString(SchedulerMonthView.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean destroyed = schedulerMonthView.getDestroyed();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean disabled = schedulerMonthView.getDisabled();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.DISABLED, disabled));
	}

	protected void renderDisplayDaysInterval(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object displayDaysInterval = schedulerMonthView.getDisplayDaysInterval();
		renderedAttributes.add(renderNumber(SchedulerMonthView.DISPLAY_DAYS_INTERVAL, displayDaysInterval));
	}

	protected void renderDisplayRows(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object displayRows = schedulerMonthView.getDisplayRows();
		renderedAttributes.add(renderNumber(SchedulerMonthView.DISPLAY_ROWS, displayRows));
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String filterFn = schedulerMonthView.getFilterFn();
		renderedAttributes.add(renderString(SchedulerMonthView.FILTER_FN, filterFn));
	}

	protected void renderFixedHeight(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean fixedHeight = schedulerMonthView.getFixedHeight();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.FIXED_HEIGHT, fixedHeight));
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean focused = schedulerMonthView.getFocused();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.FOCUSED, focused));
	}

	protected void renderHeaderDateFormatter(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String headerDateFormatter = schedulerMonthView.getHeaderDateFormatter();
		renderedAttributes.add(renderString(SchedulerMonthView.HEADER_DATE_FORMATTER, headerDateFormatter));
	}

	protected void renderHeaderTableNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String headerTableNode = schedulerMonthView.getHeaderTableNode();
		renderedAttributes.add(renderString(SchedulerMonthView.HEADER_TABLE_NODE, headerTableNode));
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object height = schedulerMonthView.getHeight();
		renderedAttributes.add(renderNumber(SchedulerMonthView.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String hideClass = schedulerMonthView.getHideClass();
		renderedAttributes.add(renderString(SchedulerMonthView.HIDE_CLASS, hideClass));
	}

	protected void renderSchedulerMonthViewId(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String schedulerMonthViewId = schedulerMonthView.getSchedulerMonthViewId();
		renderedAttributes.add(renderString(SchedulerMonthView.SCHEDULER_MONTH_VIEW_ID, schedulerMonthViewId));
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean initialized = schedulerMonthView.getInitialized();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.INITIALIZED, initialized));
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean isoTime = schedulerMonthView.getIsoTime();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.ISO_TIME, isoTime));
	}

	protected void renderSchedulerMonthViewLocale(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String schedulerMonthViewLocale = schedulerMonthView.getSchedulerMonthViewLocale();
		renderedAttributes.add(renderString(SchedulerMonthView.SCHEDULER_MONTH_VIEW_LOCALE, schedulerMonthViewLocale));
	}

	protected void renderName(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String name = schedulerMonthView.getName();
		renderedAttributes.add(renderString(SchedulerMonthView.NAME, name));
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerMonthView.getNavigationDateFormatter();
		renderedAttributes.add(renderString(SchedulerMonthView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String nextDate = schedulerMonthView.getNextDate();
		renderedAttributes.add(renderString(SchedulerMonthView.NEXT_DATE, nextDate));
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String prevDate = schedulerMonthView.getPrevDate();
		renderedAttributes.add(renderString(SchedulerMonthView.PREV_DATE, prevDate));
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object render = schedulerMonthView.getRender();
		renderedAttributes.add(renderString(SchedulerMonthView.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean rendered = schedulerMonthView.getRendered();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.RENDERED, rendered));
	}

	protected void renderRowsContainerNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String rowsContainerNode = schedulerMonthView.getRowsContainerNode();
		renderedAttributes.add(renderString(SchedulerMonthView.ROWS_CONTAINER_NODE, rowsContainerNode));
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String scheduler = schedulerMonthView.getScheduler();
		renderedAttributes.add(renderString(SchedulerMonthView.SCHEDULER, scheduler));
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean scrollable = schedulerMonthView.getScrollable();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.SCROLLABLE, scrollable));
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String srcNode = schedulerMonthView.getSrcNode();
		renderedAttributes.add(renderString(SchedulerMonthView.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String strings = schedulerMonthView.getStrings();
		renderedAttributes.add(renderString(SchedulerMonthView.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object tabIndex = schedulerMonthView.getTabIndex();
		renderedAttributes.add(renderNumber(SchedulerMonthView.TAB_INDEX, tabIndex));
	}

	protected void renderTableGridNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String tableGridNode = schedulerMonthView.getTableGridNode();
		renderedAttributes.add(renderString(SchedulerMonthView.TABLE_GRID_NODE, tableGridNode));
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String triggerNode = schedulerMonthView.getTriggerNode();
		renderedAttributes.add(renderString(SchedulerMonthView.TRIGGER_NODE, triggerNode));
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean useARIA = schedulerMonthView.getUseARIA();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Boolean visible = schedulerMonthView.getVisible();
		renderedAttributes.add(renderBoolean(SchedulerMonthView.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.Object width = schedulerMonthView.getWidth();
		renderedAttributes.add(renderString(SchedulerMonthView.WIDTH, width));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerMonthView.getAfterBodyContentChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerMonthView.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterColHeaderDaysNodeChange = schedulerMonthView.getAfterColHeaderDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_COL_HEADER_DAYS_NODE_CHANGE, afterColHeaderDaysNodeChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerMonthView.getAfterContentBoxChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterCssClassChange = schedulerMonthView.getAfterCssClassChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerMonthView.getAfterDestroyedChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterDisabledChange = schedulerMonthView.getAfterDisabledChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDisplayDaysIntervalChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterDisplayDaysIntervalChange = schedulerMonthView.getAfterDisplayDaysIntervalChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_DISPLAY_DAYS_INTERVAL_CHANGE, afterDisplayDaysIntervalChange));
	}

	protected void renderAfterDisplayRowsChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterDisplayRowsChange = schedulerMonthView.getAfterDisplayRowsChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_DISPLAY_ROWS_CHANGE, afterDisplayRowsChange));
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerMonthView.getAfterFilterFnChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
	}

	protected void renderAfterFixedHeightChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterFixedHeightChange = schedulerMonthView.getAfterFixedHeightChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_FIXED_HEIGHT_CHANGE, afterFixedHeightChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterFocusedChange = schedulerMonthView.getAfterFocusedChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterHeaderDateFormatterChange = schedulerMonthView.getAfterHeaderDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_HEADER_DATE_FORMATTER_CHANGE, afterHeaderDateFormatterChange));
	}

	protected void renderAfterHeaderTableNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterHeaderTableNodeChange = schedulerMonthView.getAfterHeaderTableNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_HEADER_TABLE_NODE_CHANGE, afterHeaderTableNodeChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterHeightChange = schedulerMonthView.getAfterHeightChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterHideClassChange = schedulerMonthView.getAfterHideClassChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterIdChange = schedulerMonthView.getAfterIdChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterInitializedChange = schedulerMonthView.getAfterInitializedChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerMonthView.getAfterIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterLocaleChange = schedulerMonthView.getAfterLocaleChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterNameChange = schedulerMonthView.getAfterNameChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerMonthView.getAfterNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterNextDateChange = schedulerMonthView.getAfterNextDateChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerMonthView.getAfterPrevDateChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterRenderChange = schedulerMonthView.getAfterRenderChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterRenderedChange = schedulerMonthView.getAfterRenderedChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRowsContainerNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterRowsContainerNodeChange = schedulerMonthView.getAfterRowsContainerNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_ROWS_CONTAINER_NODE_CHANGE, afterRowsContainerNodeChange));
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerMonthView.getAfterSchedulerChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterScrollableChange = schedulerMonthView.getAfterScrollableChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerMonthView.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterStringsChange = schedulerMonthView.getAfterStringsChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerMonthView.getAfterTabIndexChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTableGridNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterTableGridNodeChange = schedulerMonthView.getAfterTableGridNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_TABLE_GRID_NODE_CHANGE, afterTableGridNodeChange));
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerMonthView.getAfterTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerMonthView.getAfterUseARIAChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterVisibleChange = schedulerMonthView.getAfterVisibleChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String afterWidthChange = schedulerMonthView.getAfterWidthChange();
		renderedAttributes.add(renderString(SchedulerMonthView.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onBodyContentChange = schedulerMonthView.getOnBodyContentChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerMonthView.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onColHeaderDaysNodeChange = schedulerMonthView.getOnColHeaderDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_COL_HEADER_DAYS_NODE_CHANGE, onColHeaderDaysNodeChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onContentBoxChange = schedulerMonthView.getOnContentBoxChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onCssClassChange = schedulerMonthView.getOnCssClassChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onDestroyedChange = schedulerMonthView.getOnDestroyedChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onDisabledChange = schedulerMonthView.getOnDisabledChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDisplayDaysIntervalChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onDisplayDaysIntervalChange = schedulerMonthView.getOnDisplayDaysIntervalChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_DISPLAY_DAYS_INTERVAL_CHANGE, onDisplayDaysIntervalChange));
	}

	protected void renderOnDisplayRowsChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onDisplayRowsChange = schedulerMonthView.getOnDisplayRowsChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_DISPLAY_ROWS_CHANGE, onDisplayRowsChange));
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onFilterFnChange = schedulerMonthView.getOnFilterFnChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_FILTER_FN_CHANGE, onFilterFnChange));
	}

	protected void renderOnFixedHeightChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onFixedHeightChange = schedulerMonthView.getOnFixedHeightChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_FIXED_HEIGHT_CHANGE, onFixedHeightChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onFocusedChange = schedulerMonthView.getOnFocusedChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onHeaderDateFormatterChange = schedulerMonthView.getOnHeaderDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_HEADER_DATE_FORMATTER_CHANGE, onHeaderDateFormatterChange));
	}

	protected void renderOnHeaderTableNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onHeaderTableNodeChange = schedulerMonthView.getOnHeaderTableNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_HEADER_TABLE_NODE_CHANGE, onHeaderTableNodeChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onHeightChange = schedulerMonthView.getOnHeightChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onHideClassChange = schedulerMonthView.getOnHideClassChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onIdChange = schedulerMonthView.getOnIdChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onInitializedChange = schedulerMonthView.getOnInitializedChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerMonthView.getOnIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onLocaleChange = schedulerMonthView.getOnLocaleChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onNameChange = schedulerMonthView.getOnNameChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerMonthView.getOnNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onNextDateChange = schedulerMonthView.getOnNextDateChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_NEXT_DATE_CHANGE, onNextDateChange));
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onPrevDateChange = schedulerMonthView.getOnPrevDateChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_PREV_DATE_CHANGE, onPrevDateChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onRenderChange = schedulerMonthView.getOnRenderChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onRenderedChange = schedulerMonthView.getOnRenderedChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRowsContainerNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onRowsContainerNodeChange = schedulerMonthView.getOnRowsContainerNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_ROWS_CONTAINER_NODE_CHANGE, onRowsContainerNodeChange));
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onSchedulerChange = schedulerMonthView.getOnSchedulerChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_SCHEDULER_CHANGE, onSchedulerChange));
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onScrollableChange = schedulerMonthView.getOnScrollableChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_SCROLLABLE_CHANGE, onScrollableChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerMonthView.getOnSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onStringsChange = schedulerMonthView.getOnStringsChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onTabIndexChange = schedulerMonthView.getOnTabIndexChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTableGridNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onTableGridNodeChange = schedulerMonthView.getOnTableGridNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_TABLE_GRID_NODE_CHANGE, onTableGridNodeChange));
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerMonthView.getOnTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onUseARIAChange = schedulerMonthView.getOnUseARIAChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onVisibleChange = schedulerMonthView.getOnVisibleChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		java.lang.String onWidthChange = schedulerMonthView.getOnWidthChange();
		renderedAttributes.add(renderString(SchedulerMonthView.ON_WIDTH_CHANGE, onWidthChange));
	}

}