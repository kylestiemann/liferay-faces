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

		if (schedulerAgendaView.getSchedulerAgendaViewBodyContent() != null) {
			renderSchedulerAgendaViewBodyContent(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getContentBox() != null) {
			renderContentBox(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getCssClass() != null) {
			renderCssClass(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getDisabled() != null) {
			renderDisabled(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getEventsDateFormatter() != null) {
			renderEventsDateFormatter(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getFilterFn() != null) {
			renderFilterFn(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getFocused() != null) {
			renderFocused(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getHeaderDayDateFormatter() != null) {
			renderHeaderDayDateFormatter(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getHeaderExtraDateFormatter() != null) {
			renderHeaderExtraDateFormatter(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getHeight() != null) {
			renderHeight(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getHideClass() != null) {
			renderHideClass(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getSchedulerAgendaViewId() != null) {
			renderSchedulerAgendaViewId(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getInfoDayDateFormatter() != null) {
			renderInfoDayDateFormatter(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getInfoLabelBigDateFormatter() != null) {
			renderInfoLabelBigDateFormatter(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getInfoLabelSmallDateFormatter() != null) {
			renderInfoLabelSmallDateFormatter(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getInitialized() != null) {
			renderInitialized(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getIsoTime() != null) {
			renderIsoTime(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getSchedulerAgendaViewLocale() != null) {
			renderSchedulerAgendaViewLocale(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getName() != null) {
			renderName(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getNavigationDateFormatter() != null) {
			renderNavigationDateFormatter(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getNextDate() != null) {
			renderNextDate(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getPrevDate() != null) {
			renderPrevDate(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getRender() != null) {
			renderRender(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getRendered() != null) {
			renderRendered(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getScheduler() != null) {
			renderScheduler(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getScrollable() != null) {
			renderScrollable(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getStrings() != null) {
			renderStrings(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getTriggerNode() != null) {
			renderTriggerNode(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getVisible() != null) {
			renderVisible(renderedAttributes, schedulerAgendaView);
		}

		if (schedulerAgendaView.getWidth() != null) {
			renderWidth(renderedAttributes, schedulerAgendaView);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerAgendaView.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterEventsDateFormatterChange() != null) {
			renderAfterEventsDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterFilterFnChange() != null) {
			renderAfterFilterFnChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterHeaderDayDateFormatterChange() != null) {
			renderAfterHeaderDayDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterHeaderExtraDateFormatterChange() != null) {
			renderAfterHeaderExtraDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterInfoDayDateFormatterChange() != null) {
			renderAfterInfoDayDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterInfoLabelBigDateFormatterChange() != null) {
			renderAfterInfoLabelBigDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterInfoLabelSmallDateFormatterChange() != null) {
			renderAfterInfoLabelSmallDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterIsoTimeChange() != null) {
			renderAfterIsoTimeChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterNavigationDateFormatterChange() != null) {
			renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterNextDateChange() != null) {
			renderAfterNextDateChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterPrevDateChange() != null) {
			renderAfterPrevDateChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterSchedulerChange() != null) {
			renderAfterSchedulerChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterScrollableChange() != null) {
			renderAfterScrollableChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterTriggerNodeChange() != null) {
			renderAfterTriggerNodeChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, schedulerAgendaView);
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

		if (schedulerAgendaView.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnEventsDateFormatterChange() != null) {
			renderOnEventsDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnFilterFnChange() != null) {
			renderOnFilterFnChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnHeaderDayDateFormatterChange() != null) {
			renderOnHeaderDayDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnHeaderExtraDateFormatterChange() != null) {
			renderOnHeaderExtraDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnInfoDayDateFormatterChange() != null) {
			renderOnInfoDayDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnInfoLabelBigDateFormatterChange() != null) {
			renderOnInfoLabelBigDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnInfoLabelSmallDateFormatterChange() != null) {
			renderOnInfoLabelSmallDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnIsoTimeChange() != null) {
			renderOnIsoTimeChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnNavigationDateFormatterChange() != null) {
			renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnNextDateChange() != null) {
			renderOnNextDateChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnPrevDateChange() != null) {
			renderOnPrevDateChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnSchedulerChange() != null) {
			renderOnSchedulerChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnScrollableChange() != null) {
			renderOnScrollableChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnTriggerNodeChange() != null) {
			renderOnTriggerNodeChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, schedulerAgendaView);
		}

		if (schedulerAgendaView.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, schedulerAgendaView);
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

	protected void renderSchedulerAgendaViewBodyContent(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String schedulerAgendaViewBodyContent = schedulerAgendaView.getSchedulerAgendaViewBodyContent();
		renderedAttributes.add(renderString(SchedulerAgendaView.SCHEDULER_AGENDA_VIEW_BODY_CONTENT, schedulerAgendaViewBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String boundingBox = schedulerAgendaView.getBoundingBox();
		renderedAttributes.add(renderString(SchedulerAgendaView.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String contentBox = schedulerAgendaView.getContentBox();
		renderedAttributes.add(renderString(SchedulerAgendaView.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String cssClass = schedulerAgendaView.getCssClass();
		renderedAttributes.add(renderString(SchedulerAgendaView.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean destroyed = schedulerAgendaView.getDestroyed();
		renderedAttributes.add(renderBoolean(SchedulerAgendaView.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean disabled = schedulerAgendaView.getDisabled();
		renderedAttributes.add(renderBoolean(SchedulerAgendaView.DISABLED, disabled));
	}

	protected void renderEventsDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object eventsDateFormatter = schedulerAgendaView.getEventsDateFormatter();
		renderedAttributes.add(renderString(SchedulerAgendaView.EVENTS_DATE_FORMATTER, eventsDateFormatter));
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String filterFn = schedulerAgendaView.getFilterFn();
		renderedAttributes.add(renderString(SchedulerAgendaView.FILTER_FN, filterFn));
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean focused = schedulerAgendaView.getFocused();
		renderedAttributes.add(renderBoolean(SchedulerAgendaView.FOCUSED, focused));
	}

	protected void renderHeaderDayDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object headerDayDateFormatter = schedulerAgendaView.getHeaderDayDateFormatter();
		renderedAttributes.add(renderString(SchedulerAgendaView.HEADER_DAY_DATE_FORMATTER, headerDayDateFormatter));
	}

	protected void renderHeaderExtraDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object headerExtraDateFormatter = schedulerAgendaView.getHeaderExtraDateFormatter();
		renderedAttributes.add(renderString(SchedulerAgendaView.HEADER_EXTRA_DATE_FORMATTER, headerExtraDateFormatter));
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object height = schedulerAgendaView.getHeight();
		renderedAttributes.add(renderNumber(SchedulerAgendaView.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String hideClass = schedulerAgendaView.getHideClass();
		renderedAttributes.add(renderString(SchedulerAgendaView.HIDE_CLASS, hideClass));
	}

	protected void renderSchedulerAgendaViewId(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String schedulerAgendaViewId = schedulerAgendaView.getSchedulerAgendaViewId();
		renderedAttributes.add(renderString(SchedulerAgendaView.SCHEDULER_AGENDA_VIEW_ID, schedulerAgendaViewId));
	}

	protected void renderInfoDayDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object infoDayDateFormatter = schedulerAgendaView.getInfoDayDateFormatter();
		renderedAttributes.add(renderString(SchedulerAgendaView.INFO_DAY_DATE_FORMATTER, infoDayDateFormatter));
	}

	protected void renderInfoLabelBigDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object infoLabelBigDateFormatter = schedulerAgendaView.getInfoLabelBigDateFormatter();
		renderedAttributes.add(renderString(SchedulerAgendaView.INFO_LABEL_BIG_DATE_FORMATTER, infoLabelBigDateFormatter));
	}

	protected void renderInfoLabelSmallDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object infoLabelSmallDateFormatter = schedulerAgendaView.getInfoLabelSmallDateFormatter();
		renderedAttributes.add(renderString(SchedulerAgendaView.INFO_LABEL_SMALL_DATE_FORMATTER, infoLabelSmallDateFormatter));
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean initialized = schedulerAgendaView.getInitialized();
		renderedAttributes.add(renderBoolean(SchedulerAgendaView.INITIALIZED, initialized));
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean isoTime = schedulerAgendaView.getIsoTime();
		renderedAttributes.add(renderBoolean(SchedulerAgendaView.ISO_TIME, isoTime));
	}

	protected void renderSchedulerAgendaViewLocale(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String schedulerAgendaViewLocale = schedulerAgendaView.getSchedulerAgendaViewLocale();
		renderedAttributes.add(renderString(SchedulerAgendaView.SCHEDULER_AGENDA_VIEW_LOCALE, schedulerAgendaViewLocale));
	}

	protected void renderName(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String name = schedulerAgendaView.getName();
		renderedAttributes.add(renderString(SchedulerAgendaView.NAME, name));
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerAgendaView.getNavigationDateFormatter();
		renderedAttributes.add(renderString(SchedulerAgendaView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String nextDate = schedulerAgendaView.getNextDate();
		renderedAttributes.add(renderString(SchedulerAgendaView.NEXT_DATE, nextDate));
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String prevDate = schedulerAgendaView.getPrevDate();
		renderedAttributes.add(renderString(SchedulerAgendaView.PREV_DATE, prevDate));
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object render = schedulerAgendaView.getRender();
		renderedAttributes.add(renderString(SchedulerAgendaView.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean rendered = schedulerAgendaView.getRendered();
		renderedAttributes.add(renderBoolean(SchedulerAgendaView.RENDERED, rendered));
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String scheduler = schedulerAgendaView.getScheduler();
		renderedAttributes.add(renderString(SchedulerAgendaView.SCHEDULER, scheduler));
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean scrollable = schedulerAgendaView.getScrollable();
		renderedAttributes.add(renderBoolean(SchedulerAgendaView.SCROLLABLE, scrollable));
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String srcNode = schedulerAgendaView.getSrcNode();
		renderedAttributes.add(renderString(SchedulerAgendaView.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String strings = schedulerAgendaView.getStrings();
		renderedAttributes.add(renderString(SchedulerAgendaView.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object tabIndex = schedulerAgendaView.getTabIndex();
		renderedAttributes.add(renderNumber(SchedulerAgendaView.TAB_INDEX, tabIndex));
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String triggerNode = schedulerAgendaView.getTriggerNode();
		renderedAttributes.add(renderString(SchedulerAgendaView.TRIGGER_NODE, triggerNode));
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean useARIA = schedulerAgendaView.getUseARIA();
		renderedAttributes.add(renderBoolean(SchedulerAgendaView.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Boolean visible = schedulerAgendaView.getVisible();
		renderedAttributes.add(renderBoolean(SchedulerAgendaView.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.Object width = schedulerAgendaView.getWidth();
		renderedAttributes.add(renderString(SchedulerAgendaView.WIDTH, width));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerAgendaView.getAfterBodyContentChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerAgendaView.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerAgendaView.getAfterContentBoxChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterCssClassChange = schedulerAgendaView.getAfterCssClassChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerAgendaView.getAfterDestroyedChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterDisabledChange = schedulerAgendaView.getAfterDisabledChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterEventsDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterEventsDateFormatterChange = schedulerAgendaView.getAfterEventsDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_EVENTS_DATE_FORMATTER_CHANGE, afterEventsDateFormatterChange));
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerAgendaView.getAfterFilterFnChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterFocusedChange = schedulerAgendaView.getAfterFocusedChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeaderDayDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterHeaderDayDateFormatterChange = schedulerAgendaView.getAfterHeaderDayDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_HEADER_DAY_DATE_FORMATTER_CHANGE, afterHeaderDayDateFormatterChange));
	}

	protected void renderAfterHeaderExtraDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterHeaderExtraDateFormatterChange = schedulerAgendaView.getAfterHeaderExtraDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_HEADER_EXTRA_DATE_FORMATTER_CHANGE, afterHeaderExtraDateFormatterChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterHeightChange = schedulerAgendaView.getAfterHeightChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterHideClassChange = schedulerAgendaView.getAfterHideClassChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterIdChange = schedulerAgendaView.getAfterIdChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInfoDayDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterInfoDayDateFormatterChange = schedulerAgendaView.getAfterInfoDayDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_INFO_DAY_DATE_FORMATTER_CHANGE, afterInfoDayDateFormatterChange));
	}

	protected void renderAfterInfoLabelBigDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterInfoLabelBigDateFormatterChange = schedulerAgendaView.getAfterInfoLabelBigDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, afterInfoLabelBigDateFormatterChange));
	}

	protected void renderAfterInfoLabelSmallDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterInfoLabelSmallDateFormatterChange = schedulerAgendaView.getAfterInfoLabelSmallDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, afterInfoLabelSmallDateFormatterChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterInitializedChange = schedulerAgendaView.getAfterInitializedChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerAgendaView.getAfterIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterLocaleChange = schedulerAgendaView.getAfterLocaleChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterNameChange = schedulerAgendaView.getAfterNameChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerAgendaView.getAfterNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterNextDateChange = schedulerAgendaView.getAfterNextDateChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerAgendaView.getAfterPrevDateChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterRenderChange = schedulerAgendaView.getAfterRenderChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterRenderedChange = schedulerAgendaView.getAfterRenderedChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerAgendaView.getAfterSchedulerChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterScrollableChange = schedulerAgendaView.getAfterScrollableChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerAgendaView.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterStringsChange = schedulerAgendaView.getAfterStringsChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerAgendaView.getAfterTabIndexChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerAgendaView.getAfterTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerAgendaView.getAfterUseARIAChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterVisibleChange = schedulerAgendaView.getAfterVisibleChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String afterWidthChange = schedulerAgendaView.getAfterWidthChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onBodyContentChange = schedulerAgendaView.getOnBodyContentChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerAgendaView.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onContentBoxChange = schedulerAgendaView.getOnContentBoxChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onCssClassChange = schedulerAgendaView.getOnCssClassChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onDestroyedChange = schedulerAgendaView.getOnDestroyedChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onDisabledChange = schedulerAgendaView.getOnDisabledChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnEventsDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onEventsDateFormatterChange = schedulerAgendaView.getOnEventsDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_EVENTS_DATE_FORMATTER_CHANGE, onEventsDateFormatterChange));
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onFilterFnChange = schedulerAgendaView.getOnFilterFnChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_FILTER_FN_CHANGE, onFilterFnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onFocusedChange = schedulerAgendaView.getOnFocusedChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeaderDayDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onHeaderDayDateFormatterChange = schedulerAgendaView.getOnHeaderDayDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_HEADER_DAY_DATE_FORMATTER_CHANGE, onHeaderDayDateFormatterChange));
	}

	protected void renderOnHeaderExtraDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onHeaderExtraDateFormatterChange = schedulerAgendaView.getOnHeaderExtraDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_HEADER_EXTRA_DATE_FORMATTER_CHANGE, onHeaderExtraDateFormatterChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onHeightChange = schedulerAgendaView.getOnHeightChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onHideClassChange = schedulerAgendaView.getOnHideClassChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onIdChange = schedulerAgendaView.getOnIdChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInfoDayDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onInfoDayDateFormatterChange = schedulerAgendaView.getOnInfoDayDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_INFO_DAY_DATE_FORMATTER_CHANGE, onInfoDayDateFormatterChange));
	}

	protected void renderOnInfoLabelBigDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onInfoLabelBigDateFormatterChange = schedulerAgendaView.getOnInfoLabelBigDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_INFO_LABEL_BIG_DATE_FORMATTER_CHANGE, onInfoLabelBigDateFormatterChange));
	}

	protected void renderOnInfoLabelSmallDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onInfoLabelSmallDateFormatterChange = schedulerAgendaView.getOnInfoLabelSmallDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_INFO_LABEL_SMALL_DATE_FORMATTER_CHANGE, onInfoLabelSmallDateFormatterChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onInitializedChange = schedulerAgendaView.getOnInitializedChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerAgendaView.getOnIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onLocaleChange = schedulerAgendaView.getOnLocaleChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onNameChange = schedulerAgendaView.getOnNameChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerAgendaView.getOnNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onNextDateChange = schedulerAgendaView.getOnNextDateChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_NEXT_DATE_CHANGE, onNextDateChange));
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onPrevDateChange = schedulerAgendaView.getOnPrevDateChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_PREV_DATE_CHANGE, onPrevDateChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onRenderChange = schedulerAgendaView.getOnRenderChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onRenderedChange = schedulerAgendaView.getOnRenderedChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onSchedulerChange = schedulerAgendaView.getOnSchedulerChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_SCHEDULER_CHANGE, onSchedulerChange));
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onScrollableChange = schedulerAgendaView.getOnScrollableChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_SCROLLABLE_CHANGE, onScrollableChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerAgendaView.getOnSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onStringsChange = schedulerAgendaView.getOnStringsChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onTabIndexChange = schedulerAgendaView.getOnTabIndexChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerAgendaView.getOnTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onUseARIAChange = schedulerAgendaView.getOnUseARIAChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onVisibleChange = schedulerAgendaView.getOnVisibleChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		java.lang.String onWidthChange = schedulerAgendaView.getOnWidthChange();
		renderedAttributes.add(renderString(SchedulerAgendaView.ON_WIDTH_CHANGE, onWidthChange));
	}

}