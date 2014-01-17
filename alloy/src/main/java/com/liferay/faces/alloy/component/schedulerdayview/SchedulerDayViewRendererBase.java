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

		renderSchedulerdayviewBodyContent(renderedAttributes, schedulerDayView);
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
		renderSchedulerdayviewId(renderedAttributes, schedulerDayView);
		renderInitialized(renderedAttributes, schedulerDayView);
		renderIsoTime(renderedAttributes, schedulerDayView);
		renderSchedulerdayviewLocale(renderedAttributes, schedulerDayView);
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

	protected void renderSchedulerdayviewBodyContent(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String schedulerdayviewBodyContent = schedulerDayView.getSchedulerdayviewBodyContent();

		if (schedulerdayviewBodyContent != null) {
			renderedAttributes.add(renderString(SchedulerDayView.SCHEDULERDAYVIEW_BODY_CONTENT, schedulerdayviewBodyContent));
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

	protected void renderSchedulerdayviewId(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String schedulerdayviewId = schedulerDayView.getSchedulerdayviewId();

		if (schedulerdayviewId != null) {
			renderedAttributes.add(renderString(SchedulerDayView.SCHEDULERDAYVIEW_ID, schedulerdayviewId));
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

	protected void renderSchedulerdayviewLocale(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String schedulerdayviewLocale = schedulerDayView.getSchedulerdayviewLocale();

		if (schedulerdayviewLocale != null) {
			renderedAttributes.add(renderString(SchedulerDayView.SCHEDULERDAYVIEW_LOCALE, schedulerdayviewLocale));
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

}