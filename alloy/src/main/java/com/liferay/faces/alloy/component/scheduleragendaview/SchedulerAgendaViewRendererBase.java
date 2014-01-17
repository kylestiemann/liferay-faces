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
package com.liferay.faces.alloy.component.scheduleragendaview;

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
public abstract class SchedulerAgendaViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-agenda";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerAgendaView schedulerAgendaView = (SchedulerAgendaView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerAgendaView = new A.SchedulerAgendaView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderSchedulerAgendaViewBodyContent(renderedAttributes, schedulerAgendaView);
		renderBoundingBox(renderedAttributes, schedulerAgendaView);
		renderContentBox(renderedAttributes, schedulerAgendaView);
		renderCssClass(renderedAttributes, schedulerAgendaView);
		renderDestroyed(renderedAttributes, schedulerAgendaView);
		renderDisabled(renderedAttributes, schedulerAgendaView);
		renderEventsDateFormatter(renderedAttributes, schedulerAgendaView);
		renderFilterFn(renderedAttributes, schedulerAgendaView);
		renderFocused(renderedAttributes, schedulerAgendaView);
		renderHeaderDayDateFormatter(renderedAttributes, schedulerAgendaView);
		renderHeaderExtraDateFormatter(renderedAttributes, schedulerAgendaView);
		renderHeight(renderedAttributes, schedulerAgendaView);
		renderHideClass(renderedAttributes, schedulerAgendaView);
		renderSchedulerAgendaViewId(renderedAttributes, schedulerAgendaView);
		renderInfoDayDateFormatter(renderedAttributes, schedulerAgendaView);
		renderInfoLabelBigDateFormatter(renderedAttributes, schedulerAgendaView);
		renderInfoLabelSmallDateFormatter(renderedAttributes, schedulerAgendaView);
		renderInitialized(renderedAttributes, schedulerAgendaView);
		renderIsoTime(renderedAttributes, schedulerAgendaView);
		renderSchedulerAgendaViewLocale(renderedAttributes, schedulerAgendaView);
		renderName(renderedAttributes, schedulerAgendaView);
		renderNavigationDateFormatter(renderedAttributes, schedulerAgendaView);
		renderNextDate(renderedAttributes, schedulerAgendaView);
		renderPrevDate(renderedAttributes, schedulerAgendaView);
		renderRender(renderedAttributes, schedulerAgendaView);
		renderRendered(renderedAttributes, schedulerAgendaView);
		renderScheduler(renderedAttributes, schedulerAgendaView);
		renderScrollable(renderedAttributes, schedulerAgendaView);
		renderSrcNode(renderedAttributes, schedulerAgendaView);
		renderStrings(renderedAttributes, schedulerAgendaView);
		renderTabIndex(renderedAttributes, schedulerAgendaView);
		renderTriggerNode(renderedAttributes, schedulerAgendaView);
		renderUseARIA(renderedAttributes, schedulerAgendaView);
		renderVisible(renderedAttributes, schedulerAgendaView);
		renderWidth(renderedAttributes, schedulerAgendaView);

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

	protected void renderSchedulerAgendaViewBodyContent(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String schedulerAgendaViewBodyContent = schedulerAgendaView.getSchedulerAgendaViewBodyContent();

		if (schedulerAgendaViewBodyContent != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.SCHEDULER_AGENDA_VIEW_BODY_CONTENT, schedulerAgendaViewBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String boundingBox = schedulerAgendaView.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String contentBox = schedulerAgendaView.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String cssClass = schedulerAgendaView.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean destroyed = schedulerAgendaView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerAgendaView.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean disabled = schedulerAgendaView.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerAgendaView.DISABLED, disabled));
		}
	}

	protected void renderEventsDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object eventsDateFormatter = schedulerAgendaView.getEventsDateFormatter();

		if (eventsDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.EVENTS_DATE_FORMATTER, eventsDateFormatter));
		}
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String filterFn = schedulerAgendaView.getFilterFn();

		if (filterFn != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.FILTER_FN, filterFn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean focused = schedulerAgendaView.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(SchedulerAgendaView.FOCUSED, focused));
		}
	}

	protected void renderHeaderDayDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object headerDayDateFormatter = schedulerAgendaView.getHeaderDayDateFormatter();

		if (headerDayDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.HEADER_DAY_DATE_FORMATTER, headerDayDateFormatter));
		}
	}

	protected void renderHeaderExtraDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object headerExtraDateFormatter = schedulerAgendaView.getHeaderExtraDateFormatter();

		if (headerExtraDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.HEADER_EXTRA_DATE_FORMATTER, headerExtraDateFormatter));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object height = schedulerAgendaView.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(SchedulerAgendaView.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String hideClass = schedulerAgendaView.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.HIDE_CLASS, hideClass));
		}
	}

	protected void renderSchedulerAgendaViewId(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String schedulerAgendaViewId = schedulerAgendaView.getSchedulerAgendaViewId();

		if (schedulerAgendaViewId != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.SCHEDULER_AGENDA_VIEW_ID, schedulerAgendaViewId));
		}
	}

	protected void renderInfoDayDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object infoDayDateFormatter = schedulerAgendaView.getInfoDayDateFormatter();

		if (infoDayDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.INFO_DAY_DATE_FORMATTER, infoDayDateFormatter));
		}
	}

	protected void renderInfoLabelBigDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object infoLabelBigDateFormatter = schedulerAgendaView.getInfoLabelBigDateFormatter();

		if (infoLabelBigDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.INFO_LABEL_BIG_DATE_FORMATTER, infoLabelBigDateFormatter));
		}
	}

	protected void renderInfoLabelSmallDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object infoLabelSmallDateFormatter = schedulerAgendaView.getInfoLabelSmallDateFormatter();

		if (infoLabelSmallDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.INFO_LABEL_SMALL_DATE_FORMATTER, infoLabelSmallDateFormatter));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean initialized = schedulerAgendaView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerAgendaView.INITIALIZED, initialized));
		}
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean isoTime = schedulerAgendaView.getIsoTime();

		if (isoTime != null) {
			renderedAttributes.add(renderBoolean(SchedulerAgendaView.ISO_TIME, isoTime));
		}
	}

	protected void renderSchedulerAgendaViewLocale(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String schedulerAgendaViewLocale = schedulerAgendaView.getSchedulerAgendaViewLocale();

		if (schedulerAgendaViewLocale != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.SCHEDULER_AGENDA_VIEW_LOCALE, schedulerAgendaViewLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String name = schedulerAgendaView.getName();

		if (name != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.NAME, name));
		}
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerAgendaView.getNavigationDateFormatter();

		if (navigationDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
		}
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String nextDate = schedulerAgendaView.getNextDate();

		if (nextDate != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.NEXT_DATE, nextDate));
		}
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String prevDate = schedulerAgendaView.getPrevDate();

		if (prevDate != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.PREV_DATE, prevDate));
		}
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object render = schedulerAgendaView.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean rendered = schedulerAgendaView.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(SchedulerAgendaView.RENDERED, rendered));
		}
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String scheduler = schedulerAgendaView.getScheduler();

		if (scheduler != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.SCHEDULER, scheduler));
		}
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean scrollable = schedulerAgendaView.getScrollable();

		if (scrollable != null) {
			renderedAttributes.add(renderBoolean(SchedulerAgendaView.SCROLLABLE, scrollable));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String srcNode = schedulerAgendaView.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String strings = schedulerAgendaView.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object tabIndex = schedulerAgendaView.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(SchedulerAgendaView.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String triggerNode = schedulerAgendaView.getTriggerNode();

		if (triggerNode != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.TRIGGER_NODE, triggerNode));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean useARIA = schedulerAgendaView.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(SchedulerAgendaView.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean visible = schedulerAgendaView.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerAgendaView.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object width = schedulerAgendaView.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.WIDTH, width));
		}
	}

}