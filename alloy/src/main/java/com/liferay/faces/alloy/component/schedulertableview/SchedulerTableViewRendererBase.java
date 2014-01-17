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

		renderSchedulertableviewBodyContent(renderedAttributes, schedulerTableView);
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
		renderSchedulertableviewId(renderedAttributes, schedulerTableView);
		renderInitialized(renderedAttributes, schedulerTableView);
		renderIsoTime(renderedAttributes, schedulerTableView);
		renderSchedulertableviewLocale(renderedAttributes, schedulerTableView);
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

	protected void renderSchedulertableviewBodyContent(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String schedulertableviewBodyContent = schedulerTableView.getSchedulertableviewBodyContent();

		if (schedulertableviewBodyContent != null) {
			renderedAttributes.add(renderString(SchedulerTableView.SCHEDULERTABLEVIEW_BODY_CONTENT, schedulertableviewBodyContent));
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

	protected void renderSchedulertableviewId(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String schedulertableviewId = schedulerTableView.getSchedulertableviewId();

		if (schedulertableviewId != null) {
			renderedAttributes.add(renderString(SchedulerTableView.SCHEDULERTABLEVIEW_ID, schedulertableviewId));
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

	protected void renderSchedulertableviewLocale(List<String> renderedAttributes, SchedulerTableView schedulerTableView) throws IOException {
		java.lang.String schedulertableviewLocale = schedulerTableView.getSchedulertableviewLocale();

		if (schedulertableviewLocale != null) {
			renderedAttributes.add(renderString(SchedulerTableView.SCHEDULERTABLEVIEW_LOCALE, schedulertableviewLocale));
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

}