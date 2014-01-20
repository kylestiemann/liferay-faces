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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBodyContentChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterBoundingBoxChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterContentBoxChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterCssClassChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterDisabledChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterEventsDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterFilterFnChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterFocusedChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterHeaderDayDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterHeaderExtraDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterHeightChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterHideClassChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterIdChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterInfoDayDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterInfoLabelBigDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterInfoLabelSmallDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterInitializedChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterIsoTimeChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterLocaleChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterNameChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterNextDateChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterPrevDateChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterRenderChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterRenderedChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterSchedulerChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterScrollableChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterSrcNodeChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterStringsChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterTabIndexChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterTriggerNodeChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterUseARIAChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterVisibleChange(renderedAfterEvents, schedulerAgendaView);
		renderAfterWidthChange(renderedAfterEvents, schedulerAgendaView);

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

		renderOnBodyContentChange(renderedOnEvents, schedulerAgendaView);
		renderOnBoundingBoxChange(renderedOnEvents, schedulerAgendaView);
		renderOnContentBoxChange(renderedOnEvents, schedulerAgendaView);
		renderOnCssClassChange(renderedOnEvents, schedulerAgendaView);
		renderOnDestroyedChange(renderedOnEvents, schedulerAgendaView);
		renderOnDisabledChange(renderedOnEvents, schedulerAgendaView);
		renderOnEventsDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		renderOnFilterFnChange(renderedOnEvents, schedulerAgendaView);
		renderOnFocusedChange(renderedOnEvents, schedulerAgendaView);
		renderOnHeaderDayDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		renderOnHeaderExtraDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		renderOnHeightChange(renderedOnEvents, schedulerAgendaView);
		renderOnHideClassChange(renderedOnEvents, schedulerAgendaView);
		renderOnIdChange(renderedOnEvents, schedulerAgendaView);
		renderOnInfoDayDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		renderOnInfoLabelBigDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		renderOnInfoLabelSmallDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		renderOnInitializedChange(renderedOnEvents, schedulerAgendaView);
		renderOnIsoTimeChange(renderedOnEvents, schedulerAgendaView);
		renderOnLocaleChange(renderedOnEvents, schedulerAgendaView);
		renderOnNameChange(renderedOnEvents, schedulerAgendaView);
		renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		renderOnNextDateChange(renderedOnEvents, schedulerAgendaView);
		renderOnPrevDateChange(renderedOnEvents, schedulerAgendaView);
		renderOnRenderChange(renderedOnEvents, schedulerAgendaView);
		renderOnRenderedChange(renderedOnEvents, schedulerAgendaView);
		renderOnSchedulerChange(renderedOnEvents, schedulerAgendaView);
		renderOnScrollableChange(renderedOnEvents, schedulerAgendaView);
		renderOnSrcNodeChange(renderedOnEvents, schedulerAgendaView);
		renderOnStringsChange(renderedOnEvents, schedulerAgendaView);
		renderOnTabIndexChange(renderedOnEvents, schedulerAgendaView);
		renderOnTriggerNodeChange(renderedOnEvents, schedulerAgendaView);
		renderOnUseARIAChange(renderedOnEvents, schedulerAgendaView);
		renderOnVisibleChange(renderedOnEvents, schedulerAgendaView);
		renderOnWidthChange(renderedOnEvents, schedulerAgendaView);

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

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerAgendaView.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerAgendaView.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerAgendaView.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterCssClassChange = schedulerAgendaView.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerAgendaView.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterDisabledChange = schedulerAgendaView.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterEventsDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterEventsDateFormatterChange = schedulerAgendaView.getAfterEventsDateFormatterChange();

		if (afterEventsDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_EVENTS_DATE_FORMATTER_CHANGE, afterEventsDateFormatterChange));
		}
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerAgendaView.getAfterFilterFnChange();

		if (afterFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterFocusedChange = schedulerAgendaView.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeaderDayDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterHeaderDayDateFormatterChange = schedulerAgendaView.getAfterHeaderDayDateFormatterChange();

		if (afterHeaderDayDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_HEADER_DAY_DATE_FORMATTER_CHANGE, afterHeaderDayDateFormatterChange));
		}
	}

	protected void renderAfterHeaderExtraDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterHeaderExtraDateFormatterChange = schedulerAgendaView.getAfterHeaderExtraDateFormatterChange();

		if (afterHeaderExtraDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_HEADER_EXTRA_DATE_FORMATTER_CHANGE, afterHeaderExtraDateFormatterChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterHeightChange = schedulerAgendaView.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterHideClassChange = schedulerAgendaView.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterIdChange = schedulerAgendaView.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInfoDayDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterInfoDayDateFormatterChange = schedulerAgendaView.getAfterInfoDayDateFormatterChange();

		if (afterInfoDayDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_INFO_DAY_DATE_FORMATTER_CHANGE, afterInfoDayDateFormatterChange));
		}
	}

	protected void renderAfterInfoLabelBigDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterInfoLabelBigDateFormatterChange = schedulerAgendaView.getAfterInfoLabelBigDateFormatterChange();

		if (afterInfoLabelBigDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, afterInfoLabelBigDateFormatterChange));
		}
	}

	protected void renderAfterInfoLabelSmallDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterInfoLabelSmallDateFormatterChange = schedulerAgendaView.getAfterInfoLabelSmallDateFormatterChange();

		if (afterInfoLabelSmallDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, afterInfoLabelSmallDateFormatterChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterInitializedChange = schedulerAgendaView.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerAgendaView.getAfterIsoTimeChange();

		if (afterIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterLocaleChange = schedulerAgendaView.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterNameChange = schedulerAgendaView.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerAgendaView.getAfterNavigationDateFormatterChange();

		if (afterNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
		}
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterNextDateChange = schedulerAgendaView.getAfterNextDateChange();

		if (afterNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
		}
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerAgendaView.getAfterPrevDateChange();

		if (afterPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterRenderChange = schedulerAgendaView.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterRenderedChange = schedulerAgendaView.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerAgendaView.getAfterSchedulerChange();

		if (afterSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
		}
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterScrollableChange = schedulerAgendaView.getAfterScrollableChange();

		if (afterScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerAgendaView.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterStringsChange = schedulerAgendaView.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerAgendaView.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerAgendaView.getAfterTriggerNodeChange();

		if (afterTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerAgendaView.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterVisibleChange = schedulerAgendaView.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterWidthChange = schedulerAgendaView.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onBodyContentChange = schedulerAgendaView.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerAgendaView.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onContentBoxChange = schedulerAgendaView.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onCssClassChange = schedulerAgendaView.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onDestroyedChange = schedulerAgendaView.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onDisabledChange = schedulerAgendaView.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnEventsDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onEventsDateFormatterChange = schedulerAgendaView.getOnEventsDateFormatterChange();

		if (onEventsDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_EVENTS_DATE_FORMATTER_CHANGE, onEventsDateFormatterChange));
		}
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onFilterFnChange = schedulerAgendaView.getOnFilterFnChange();

		if (onFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_FILTER_FN_CHANGE, onFilterFnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onFocusedChange = schedulerAgendaView.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeaderDayDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onHeaderDayDateFormatterChange = schedulerAgendaView.getOnHeaderDayDateFormatterChange();

		if (onHeaderDayDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_HEADER_DAY_DATE_FORMATTER_CHANGE, onHeaderDayDateFormatterChange));
		}
	}

	protected void renderOnHeaderExtraDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onHeaderExtraDateFormatterChange = schedulerAgendaView.getOnHeaderExtraDateFormatterChange();

		if (onHeaderExtraDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_HEADER_EXTRA_DATE_FORMATTER_CHANGE, onHeaderExtraDateFormatterChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onHeightChange = schedulerAgendaView.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onHideClassChange = schedulerAgendaView.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onIdChange = schedulerAgendaView.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInfoDayDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onInfoDayDateFormatterChange = schedulerAgendaView.getOnInfoDayDateFormatterChange();

		if (onInfoDayDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_INFO_DAY_DATE_FORMATTER_CHANGE, onInfoDayDateFormatterChange));
		}
	}

	protected void renderOnInfoLabelBigDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onInfoLabelBigDateFormatterChange = schedulerAgendaView.getOnInfoLabelBigDateFormatterChange();

		if (onInfoLabelBigDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, onInfoLabelBigDateFormatterChange));
		}
	}

	protected void renderOnInfoLabelSmallDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onInfoLabelSmallDateFormatterChange = schedulerAgendaView.getOnInfoLabelSmallDateFormatterChange();

		if (onInfoLabelSmallDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, onInfoLabelSmallDateFormatterChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onInitializedChange = schedulerAgendaView.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerAgendaView.getOnIsoTimeChange();

		if (onIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onLocaleChange = schedulerAgendaView.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onNameChange = schedulerAgendaView.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerAgendaView.getOnNavigationDateFormatterChange();

		if (onNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
		}
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onNextDateChange = schedulerAgendaView.getOnNextDateChange();

		if (onNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_NEXT_DATE_CHANGE, onNextDateChange));
		}
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onPrevDateChange = schedulerAgendaView.getOnPrevDateChange();

		if (onPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_PREV_DATE_CHANGE, onPrevDateChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onRenderChange = schedulerAgendaView.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onRenderedChange = schedulerAgendaView.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onSchedulerChange = schedulerAgendaView.getOnSchedulerChange();

		if (onSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_SCHEDULER_CHANGE, onSchedulerChange));
		}
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onScrollableChange = schedulerAgendaView.getOnScrollableChange();

		if (onScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_SCROLLABLE_CHANGE, onScrollableChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerAgendaView.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onStringsChange = schedulerAgendaView.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onTabIndexChange = schedulerAgendaView.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerAgendaView.getOnTriggerNodeChange();

		if (onTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onUseARIAChange = schedulerAgendaView.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onVisibleChange = schedulerAgendaView.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onWidthChange = schedulerAgendaView.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerAgendaView.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}