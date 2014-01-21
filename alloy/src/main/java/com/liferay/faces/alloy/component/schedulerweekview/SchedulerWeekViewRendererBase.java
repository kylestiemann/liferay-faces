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

		if (schedulerWeekView.getSchedulerWeekViewBodyContent() != null) {
			renderSchedulerWeekViewBodyContent(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getColDaysNode() != null) {
			renderColDaysNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getColHeaderDaysNode() != null) {
			renderColHeaderDaysNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getContentBox() != null) {
			renderContentBox(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getCssClass() != null) {
			renderCssClass(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getDays() != null) {
			renderDays(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getDelegateConfig() != null) {
			renderDelegateConfig(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getDisabled() != null) {
			renderDisabled(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getEventWidth() != null) {
			renderEventWidth(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getFilterFn() != null) {
			renderFilterFn(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getFocused() != null) {
			renderFocused(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getHeaderDateFormatter() != null) {
			renderHeaderDateFormatter(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getHeaderTableNode() != null) {
			renderHeaderTableNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getHeaderView() != null) {
			renderHeaderView(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getHeaderViewConfig() != null) {
			renderHeaderViewConfig(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getHeaderViewLabelNode() != null) {
			renderHeaderViewLabelNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getHeight() != null) {
			renderHeight(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getHideClass() != null) {
			renderHideClass(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getHourHeight() != null) {
			renderHourHeight(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getSchedulerWeekViewId() != null) {
			renderSchedulerWeekViewId(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getInitialized() != null) {
			renderInitialized(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getIsoTime() != null) {
			renderIsoTime(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getSchedulerWeekViewLocale() != null) {
			renderSchedulerWeekViewLocale(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getMarkercellsNode() != null) {
			renderMarkercellsNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getName() != null) {
			renderName(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getNavigationDateFormatter() != null) {
			renderNavigationDateFormatter(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getNextDate() != null) {
			renderNextDate(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getPrevDate() != null) {
			renderPrevDate(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getRender() != null) {
			renderRender(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getRendered() != null) {
			renderRendered(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getResizerNode() != null) {
			renderResizerNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getScheduler() != null) {
			renderScheduler(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getScrollable() != null) {
			renderScrollable(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getStrings() != null) {
			renderStrings(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getTableNode() != null) {
			renderTableNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getTimesNode() != null) {
			renderTimesNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getTriggerNode() != null) {
			renderTriggerNode(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getVisible() != null) {
			renderVisible(renderedAttributes, schedulerWeekView);
		}

		if (schedulerWeekView.getWidth() != null) {
			renderWidth(renderedAttributes, schedulerWeekView);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerWeekView.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterColDaysNodeChange() != null) {
			renderAfterColDaysNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterColHeaderDaysNodeChange() != null) {
			renderAfterColHeaderDaysNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterDaysChange() != null) {
			renderAfterDaysChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterDelegateConfigChange() != null) {
			renderAfterDelegateConfigChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterEventWidthChange() != null) {
			renderAfterEventWidthChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterFilterFnChange() != null) {
			renderAfterFilterFnChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterHeaderDateFormatterChange() != null) {
			renderAfterHeaderDateFormatterChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterHeaderTableNodeChange() != null) {
			renderAfterHeaderTableNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterHeaderViewChange() != null) {
			renderAfterHeaderViewChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterHeaderViewConfigChange() != null) {
			renderAfterHeaderViewConfigChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterHeaderViewLabelNodeChange() != null) {
			renderAfterHeaderViewLabelNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterHourHeightChange() != null) {
			renderAfterHourHeightChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterIsoTimeChange() != null) {
			renderAfterIsoTimeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterMarkercellsNodeChange() != null) {
			renderAfterMarkercellsNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterNavigationDateFormatterChange() != null) {
			renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterNextDateChange() != null) {
			renderAfterNextDateChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterPrevDateChange() != null) {
			renderAfterPrevDateChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterResizerNodeChange() != null) {
			renderAfterResizerNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterSchedulerChange() != null) {
			renderAfterSchedulerChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterScrollableChange() != null) {
			renderAfterScrollableChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterTableNodeChange() != null) {
			renderAfterTableNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterTimesNodeChange() != null) {
			renderAfterTimesNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterTriggerNodeChange() != null) {
			renderAfterTriggerNodeChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, schedulerWeekView);
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

		if (schedulerWeekView.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnColDaysNodeChange() != null) {
			renderOnColDaysNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnColHeaderDaysNodeChange() != null) {
			renderOnColHeaderDaysNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnDaysChange() != null) {
			renderOnDaysChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnDelegateConfigChange() != null) {
			renderOnDelegateConfigChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnEventWidthChange() != null) {
			renderOnEventWidthChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnFilterFnChange() != null) {
			renderOnFilterFnChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnHeaderDateFormatterChange() != null) {
			renderOnHeaderDateFormatterChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnHeaderTableNodeChange() != null) {
			renderOnHeaderTableNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnHeaderViewChange() != null) {
			renderOnHeaderViewChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnHeaderViewConfigChange() != null) {
			renderOnHeaderViewConfigChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnHeaderViewLabelNodeChange() != null) {
			renderOnHeaderViewLabelNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnHourHeightChange() != null) {
			renderOnHourHeightChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnIsoTimeChange() != null) {
			renderOnIsoTimeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnMarkercellsNodeChange() != null) {
			renderOnMarkercellsNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnNavigationDateFormatterChange() != null) {
			renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnNextDateChange() != null) {
			renderOnNextDateChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnPrevDateChange() != null) {
			renderOnPrevDateChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnResizerNodeChange() != null) {
			renderOnResizerNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnSchedulerChange() != null) {
			renderOnSchedulerChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnScrollableChange() != null) {
			renderOnScrollableChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnTableNodeChange() != null) {
			renderOnTableNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnTimesNodeChange() != null) {
			renderOnTimesNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnTriggerNodeChange() != null) {
			renderOnTriggerNodeChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, schedulerWeekView);
		}

		if (schedulerWeekView.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, schedulerWeekView);
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

	protected void renderSchedulerWeekViewBodyContent(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String schedulerWeekViewBodyContent = schedulerWeekView.getSchedulerWeekViewBodyContent();
		renderedAttributes.add(renderString(SchedulerWeekView.SCHEDULER_WEEK_VIEW_BODY_CONTENT, schedulerWeekViewBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String boundingBox = schedulerWeekView.getBoundingBox();
		renderedAttributes.add(renderString(SchedulerWeekView.BOUNDING_BOX, boundingBox));
	}

	protected void renderColDaysNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String colDaysNode = schedulerWeekView.getColDaysNode();
		renderedAttributes.add(renderString(SchedulerWeekView.COL_DAYS_NODE, colDaysNode));
	}

	protected void renderColHeaderDaysNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String colHeaderDaysNode = schedulerWeekView.getColHeaderDaysNode();
		renderedAttributes.add(renderString(SchedulerWeekView.COL_HEADER_DAYS_NODE, colHeaderDaysNode));
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String contentBox = schedulerWeekView.getContentBox();
		renderedAttributes.add(renderString(SchedulerWeekView.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String cssClass = schedulerWeekView.getCssClass();
		renderedAttributes.add(renderString(SchedulerWeekView.CSS_CLASS, cssClass));
	}

	protected void renderDays(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object days = schedulerWeekView.getDays();
		renderedAttributes.add(renderNumber(SchedulerWeekView.DAYS, days));
	}

	protected void renderDelegateConfig(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object delegateConfig = schedulerWeekView.getDelegateConfig();
		renderedAttributes.add(renderObject(SchedulerWeekView.DELEGATE_CONFIG, delegateConfig));
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean destroyed = schedulerWeekView.getDestroyed();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean disabled = schedulerWeekView.getDisabled();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.DISABLED, disabled));
	}

	protected void renderEventWidth(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object eventWidth = schedulerWeekView.getEventWidth();
		renderedAttributes.add(renderNumber(SchedulerWeekView.EVENT_WIDTH, eventWidth));
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String filterFn = schedulerWeekView.getFilterFn();
		renderedAttributes.add(renderString(SchedulerWeekView.FILTER_FN, filterFn));
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean focused = schedulerWeekView.getFocused();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.FOCUSED, focused));
	}

	protected void renderHeaderDateFormatter(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String headerDateFormatter = schedulerWeekView.getHeaderDateFormatter();
		renderedAttributes.add(renderString(SchedulerWeekView.HEADER_DATE_FORMATTER, headerDateFormatter));
	}

	protected void renderHeaderTableNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String headerTableNode = schedulerWeekView.getHeaderTableNode();
		renderedAttributes.add(renderString(SchedulerWeekView.HEADER_TABLE_NODE, headerTableNode));
	}

	protected void renderHeaderView(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean headerView = schedulerWeekView.getHeaderView();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.HEADER_VIEW, headerView));
	}

	protected void renderHeaderViewConfig(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String headerViewConfig = schedulerWeekView.getHeaderViewConfig();
		renderedAttributes.add(renderString(SchedulerWeekView.HEADER_VIEW_CONFIG, headerViewConfig));
	}

	protected void renderHeaderViewLabelNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String headerViewLabelNode = schedulerWeekView.getHeaderViewLabelNode();
		renderedAttributes.add(renderString(SchedulerWeekView.HEADER_VIEW_LABEL_NODE, headerViewLabelNode));
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object height = schedulerWeekView.getHeight();
		renderedAttributes.add(renderNumber(SchedulerWeekView.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String hideClass = schedulerWeekView.getHideClass();
		renderedAttributes.add(renderString(SchedulerWeekView.HIDE_CLASS, hideClass));
	}

	protected void renderHourHeight(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object hourHeight = schedulerWeekView.getHourHeight();
		renderedAttributes.add(renderNumber(SchedulerWeekView.HOUR_HEIGHT, hourHeight));
	}

	protected void renderSchedulerWeekViewId(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String schedulerWeekViewId = schedulerWeekView.getSchedulerWeekViewId();
		renderedAttributes.add(renderString(SchedulerWeekView.SCHEDULER_WEEK_VIEW_ID, schedulerWeekViewId));
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean initialized = schedulerWeekView.getInitialized();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.INITIALIZED, initialized));
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean isoTime = schedulerWeekView.getIsoTime();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.ISO_TIME, isoTime));
	}

	protected void renderSchedulerWeekViewLocale(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String schedulerWeekViewLocale = schedulerWeekView.getSchedulerWeekViewLocale();
		renderedAttributes.add(renderString(SchedulerWeekView.SCHEDULER_WEEK_VIEW_LOCALE, schedulerWeekViewLocale));
	}

	protected void renderMarkercellsNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String markercellsNode = schedulerWeekView.getMarkercellsNode();
		renderedAttributes.add(renderString(SchedulerWeekView.MARKERCELLS_NODE, markercellsNode));
	}

	protected void renderName(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String name = schedulerWeekView.getName();
		renderedAttributes.add(renderString(SchedulerWeekView.NAME, name));
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerWeekView.getNavigationDateFormatter();
		renderedAttributes.add(renderString(SchedulerWeekView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String nextDate = schedulerWeekView.getNextDate();
		renderedAttributes.add(renderString(SchedulerWeekView.NEXT_DATE, nextDate));
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String prevDate = schedulerWeekView.getPrevDate();
		renderedAttributes.add(renderString(SchedulerWeekView.PREV_DATE, prevDate));
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object render = schedulerWeekView.getRender();
		renderedAttributes.add(renderString(SchedulerWeekView.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean rendered = schedulerWeekView.getRendered();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.RENDERED, rendered));
	}

	protected void renderResizerNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String resizerNode = schedulerWeekView.getResizerNode();
		renderedAttributes.add(renderString(SchedulerWeekView.RESIZER_NODE, resizerNode));
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String scheduler = schedulerWeekView.getScheduler();
		renderedAttributes.add(renderString(SchedulerWeekView.SCHEDULER, scheduler));
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean scrollable = schedulerWeekView.getScrollable();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.SCROLLABLE, scrollable));
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String srcNode = schedulerWeekView.getSrcNode();
		renderedAttributes.add(renderString(SchedulerWeekView.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String strings = schedulerWeekView.getStrings();
		renderedAttributes.add(renderString(SchedulerWeekView.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object tabIndex = schedulerWeekView.getTabIndex();
		renderedAttributes.add(renderNumber(SchedulerWeekView.TAB_INDEX, tabIndex));
	}

	protected void renderTableNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String tableNode = schedulerWeekView.getTableNode();
		renderedAttributes.add(renderString(SchedulerWeekView.TABLE_NODE, tableNode));
	}

	protected void renderTimesNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String timesNode = schedulerWeekView.getTimesNode();
		renderedAttributes.add(renderString(SchedulerWeekView.TIMES_NODE, timesNode));
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String triggerNode = schedulerWeekView.getTriggerNode();
		renderedAttributes.add(renderString(SchedulerWeekView.TRIGGER_NODE, triggerNode));
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean useARIA = schedulerWeekView.getUseARIA();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Boolean visible = schedulerWeekView.getVisible();
		renderedAttributes.add(renderBoolean(SchedulerWeekView.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.Object width = schedulerWeekView.getWidth();
		renderedAttributes.add(renderString(SchedulerWeekView.WIDTH, width));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerWeekView.getAfterBodyContentChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerWeekView.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterColDaysNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterColDaysNodeChange = schedulerWeekView.getAfterColDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_COL_DAYS_NODE_CHANGE, afterColDaysNodeChange));
	}

	protected void renderAfterColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterColHeaderDaysNodeChange = schedulerWeekView.getAfterColHeaderDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_COL_HEADER_DAYS_NODE_CHANGE, afterColHeaderDaysNodeChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerWeekView.getAfterContentBoxChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterCssClassChange = schedulerWeekView.getAfterCssClassChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDaysChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterDaysChange = schedulerWeekView.getAfterDaysChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_DAYS_CHANGE, afterDaysChange));
	}

	protected void renderAfterDelegateConfigChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterDelegateConfigChange = schedulerWeekView.getAfterDelegateConfigChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerWeekView.getAfterDestroyedChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterDisabledChange = schedulerWeekView.getAfterDisabledChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterEventWidthChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterEventWidthChange = schedulerWeekView.getAfterEventWidthChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_EVENT_WIDTH_CHANGE, afterEventWidthChange));
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerWeekView.getAfterFilterFnChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterFocusedChange = schedulerWeekView.getAfterFocusedChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderDateFormatterChange = schedulerWeekView.getAfterHeaderDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_DATE_FORMATTER_CHANGE, afterHeaderDateFormatterChange));
	}

	protected void renderAfterHeaderTableNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderTableNodeChange = schedulerWeekView.getAfterHeaderTableNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_TABLE_NODE_CHANGE, afterHeaderTableNodeChange));
	}

	protected void renderAfterHeaderViewChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderViewChange = schedulerWeekView.getAfterHeaderViewChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_VIEW_CHANGE, afterHeaderViewChange));
	}

	protected void renderAfterHeaderViewConfigChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderViewConfigChange = schedulerWeekView.getAfterHeaderViewConfigChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_VIEW_CONFIG_CHANGE, afterHeaderViewConfigChange));
	}

	protected void renderAfterHeaderViewLabelNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeaderViewLabelNodeChange = schedulerWeekView.getAfterHeaderViewLabelNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEADER_VIEW_LABEL_NODE_CHANGE, afterHeaderViewLabelNodeChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHeightChange = schedulerWeekView.getAfterHeightChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHideClassChange = schedulerWeekView.getAfterHideClassChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterHourHeightChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterHourHeightChange = schedulerWeekView.getAfterHourHeightChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_HOUR_HEIGHT_CHANGE, afterHourHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterIdChange = schedulerWeekView.getAfterIdChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterInitializedChange = schedulerWeekView.getAfterInitializedChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerWeekView.getAfterIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterLocaleChange = schedulerWeekView.getAfterLocaleChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMarkercellsNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterMarkercellsNodeChange = schedulerWeekView.getAfterMarkercellsNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_MARKERCELLS_NODE_CHANGE, afterMarkercellsNodeChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterNameChange = schedulerWeekView.getAfterNameChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerWeekView.getAfterNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterNextDateChange = schedulerWeekView.getAfterNextDateChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerWeekView.getAfterPrevDateChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterRenderChange = schedulerWeekView.getAfterRenderChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterRenderedChange = schedulerWeekView.getAfterRenderedChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterResizerNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterResizerNodeChange = schedulerWeekView.getAfterResizerNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_RESIZER_NODE_CHANGE, afterResizerNodeChange));
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerWeekView.getAfterSchedulerChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterScrollableChange = schedulerWeekView.getAfterScrollableChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerWeekView.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterStringsChange = schedulerWeekView.getAfterStringsChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerWeekView.getAfterTabIndexChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTableNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterTableNodeChange = schedulerWeekView.getAfterTableNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_TABLE_NODE_CHANGE, afterTableNodeChange));
	}

	protected void renderAfterTimesNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterTimesNodeChange = schedulerWeekView.getAfterTimesNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_TIMES_NODE_CHANGE, afterTimesNodeChange));
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerWeekView.getAfterTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerWeekView.getAfterUseARIAChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterVisibleChange = schedulerWeekView.getAfterVisibleChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String afterWidthChange = schedulerWeekView.getAfterWidthChange();
		renderedAttributes.add(renderString(SchedulerWeekView.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onBodyContentChange = schedulerWeekView.getOnBodyContentChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerWeekView.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnColDaysNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onColDaysNodeChange = schedulerWeekView.getOnColDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_COL_DAYS_NODE_CHANGE, onColDaysNodeChange));
	}

	protected void renderOnColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onColHeaderDaysNodeChange = schedulerWeekView.getOnColHeaderDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_COL_HEADER_DAYS_NODE_CHANGE, onColHeaderDaysNodeChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onContentBoxChange = schedulerWeekView.getOnContentBoxChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onCssClassChange = schedulerWeekView.getOnCssClassChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDaysChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onDaysChange = schedulerWeekView.getOnDaysChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_DAYS_CHANGE, onDaysChange));
	}

	protected void renderOnDelegateConfigChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onDelegateConfigChange = schedulerWeekView.getOnDelegateConfigChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onDestroyedChange = schedulerWeekView.getOnDestroyedChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onDisabledChange = schedulerWeekView.getOnDisabledChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnEventWidthChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onEventWidthChange = schedulerWeekView.getOnEventWidthChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_EVENT_WIDTH_CHANGE, onEventWidthChange));
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onFilterFnChange = schedulerWeekView.getOnFilterFnChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_FILTER_FN_CHANGE, onFilterFnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onFocusedChange = schedulerWeekView.getOnFocusedChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderDateFormatterChange = schedulerWeekView.getOnHeaderDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_DATE_FORMATTER_CHANGE, onHeaderDateFormatterChange));
	}

	protected void renderOnHeaderTableNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderTableNodeChange = schedulerWeekView.getOnHeaderTableNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_TABLE_NODE_CHANGE, onHeaderTableNodeChange));
	}

	protected void renderOnHeaderViewChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderViewChange = schedulerWeekView.getOnHeaderViewChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_VIEW_CHANGE, onHeaderViewChange));
	}

	protected void renderOnHeaderViewConfigChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderViewConfigChange = schedulerWeekView.getOnHeaderViewConfigChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_VIEW_CONFIG_CHANGE, onHeaderViewConfigChange));
	}

	protected void renderOnHeaderViewLabelNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeaderViewLabelNodeChange = schedulerWeekView.getOnHeaderViewLabelNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_HEADER_VIEW_LABEL_NODE_CHANGE, onHeaderViewLabelNodeChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHeightChange = schedulerWeekView.getOnHeightChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHideClassChange = schedulerWeekView.getOnHideClassChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnHourHeightChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onHourHeightChange = schedulerWeekView.getOnHourHeightChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_HOUR_HEIGHT_CHANGE, onHourHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onIdChange = schedulerWeekView.getOnIdChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onInitializedChange = schedulerWeekView.getOnInitializedChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerWeekView.getOnIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onLocaleChange = schedulerWeekView.getOnLocaleChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMarkercellsNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onMarkercellsNodeChange = schedulerWeekView.getOnMarkercellsNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_MARKERCELLS_NODE_CHANGE, onMarkercellsNodeChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onNameChange = schedulerWeekView.getOnNameChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerWeekView.getOnNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onNextDateChange = schedulerWeekView.getOnNextDateChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_NEXT_DATE_CHANGE, onNextDateChange));
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onPrevDateChange = schedulerWeekView.getOnPrevDateChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_PREV_DATE_CHANGE, onPrevDateChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onRenderChange = schedulerWeekView.getOnRenderChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onRenderedChange = schedulerWeekView.getOnRenderedChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnResizerNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onResizerNodeChange = schedulerWeekView.getOnResizerNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_RESIZER_NODE_CHANGE, onResizerNodeChange));
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onSchedulerChange = schedulerWeekView.getOnSchedulerChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_SCHEDULER_CHANGE, onSchedulerChange));
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onScrollableChange = schedulerWeekView.getOnScrollableChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_SCROLLABLE_CHANGE, onScrollableChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerWeekView.getOnSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onStringsChange = schedulerWeekView.getOnStringsChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onTabIndexChange = schedulerWeekView.getOnTabIndexChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTableNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onTableNodeChange = schedulerWeekView.getOnTableNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_TABLE_NODE_CHANGE, onTableNodeChange));
	}

	protected void renderOnTimesNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onTimesNodeChange = schedulerWeekView.getOnTimesNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_TIMES_NODE_CHANGE, onTimesNodeChange));
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerWeekView.getOnTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onUseARIAChange = schedulerWeekView.getOnUseARIAChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onVisibleChange = schedulerWeekView.getOnVisibleChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		java.lang.String onWidthChange = schedulerWeekView.getOnWidthChange();
		renderedAttributes.add(renderString(SchedulerWeekView.ON_WIDTH_CHANGE, onWidthChange));
	}

}