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

}