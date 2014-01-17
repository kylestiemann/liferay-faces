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

}