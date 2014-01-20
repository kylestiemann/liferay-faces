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

		if (schedulerDayView.getSchedulerDayViewBodyContent() != null) {
			renderSchedulerDayViewBodyContent(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getColDaysNode() != null) {
			renderColDaysNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getColHeaderDaysNode() != null) {
			renderColHeaderDaysNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getContentBox() != null) {
			renderContentBox(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getCssClass() != null) {
			renderCssClass(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getDays() != null) {
			renderDays(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getDelegateConfig() != null) {
			renderDelegateConfig(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getDisabled() != null) {
			renderDisabled(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getEventWidth() != null) {
			renderEventWidth(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getFilterFn() != null) {
			renderFilterFn(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getFocused() != null) {
			renderFocused(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getHeaderDateFormatter() != null) {
			renderHeaderDateFormatter(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getHeaderTableNode() != null) {
			renderHeaderTableNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getHeaderView() != null) {
			renderHeaderView(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getHeaderViewConfig() != null) {
			renderHeaderViewConfig(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getHeaderViewLabelNode() != null) {
			renderHeaderViewLabelNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getHeight() != null) {
			renderHeight(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getHideClass() != null) {
			renderHideClass(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getHourHeight() != null) {
			renderHourHeight(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getSchedulerDayViewId() != null) {
			renderSchedulerDayViewId(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getInitialized() != null) {
			renderInitialized(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getIsoTime() != null) {
			renderIsoTime(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getSchedulerDayViewLocale() != null) {
			renderSchedulerDayViewLocale(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getMarkercellsNode() != null) {
			renderMarkercellsNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getName() != null) {
			renderName(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getNavigationDateFormatter() != null) {
			renderNavigationDateFormatter(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getNextDate() != null) {
			renderNextDate(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getPrevDate() != null) {
			renderPrevDate(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getRender() != null) {
			renderRender(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getRendered() != null) {
			renderRendered(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getResizerNode() != null) {
			renderResizerNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getScheduler() != null) {
			renderScheduler(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getScrollable() != null) {
			renderScrollable(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getStrings() != null) {
			renderStrings(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getTableNode() != null) {
			renderTableNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getTimesNode() != null) {
			renderTimesNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getTriggerNode() != null) {
			renderTriggerNode(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getVisible() != null) {
			renderVisible(renderedAttributes, schedulerDayView);
		}
		
		if (schedulerDayView.getWidth() != null) {
			renderWidth(renderedAttributes, schedulerDayView);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerDayView.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterColDaysNodeChange() != null) {
			renderAfterColDaysNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterColHeaderDaysNodeChange() != null) {
			renderAfterColHeaderDaysNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterDaysChange() != null) {
			renderAfterDaysChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterDelegateConfigChange() != null) {
			renderAfterDelegateConfigChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterEventWidthChange() != null) {
			renderAfterEventWidthChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterFilterFnChange() != null) {
			renderAfterFilterFnChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterHeaderDateFormatterChange() != null) {
			renderAfterHeaderDateFormatterChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterHeaderTableNodeChange() != null) {
			renderAfterHeaderTableNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterHeaderViewChange() != null) {
			renderAfterHeaderViewChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterHeaderViewConfigChange() != null) {
			renderAfterHeaderViewConfigChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterHeaderViewLabelNodeChange() != null) {
			renderAfterHeaderViewLabelNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterHourHeightChange() != null) {
			renderAfterHourHeightChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterIsoTimeChange() != null) {
			renderAfterIsoTimeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterMarkercellsNodeChange() != null) {
			renderAfterMarkercellsNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterNavigationDateFormatterChange() != null) {
			renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterNextDateChange() != null) {
			renderAfterNextDateChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterPrevDateChange() != null) {
			renderAfterPrevDateChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterResizerNodeChange() != null) {
			renderAfterResizerNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterSchedulerChange() != null) {
			renderAfterSchedulerChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterScrollableChange() != null) {
			renderAfterScrollableChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterTableNodeChange() != null) {
			renderAfterTableNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterTimesNodeChange() != null) {
			renderAfterTimesNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterTriggerNodeChange() != null) {
			renderAfterTriggerNodeChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, schedulerDayView);
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

		if (schedulerDayView.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnColDaysNodeChange() != null) {
			renderOnColDaysNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnColHeaderDaysNodeChange() != null) {
			renderOnColHeaderDaysNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnDaysChange() != null) {
			renderOnDaysChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnDelegateConfigChange() != null) {
			renderOnDelegateConfigChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnEventWidthChange() != null) {
			renderOnEventWidthChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnFilterFnChange() != null) {
			renderOnFilterFnChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnHeaderDateFormatterChange() != null) {
			renderOnHeaderDateFormatterChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnHeaderTableNodeChange() != null) {
			renderOnHeaderTableNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnHeaderViewChange() != null) {
			renderOnHeaderViewChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnHeaderViewConfigChange() != null) {
			renderOnHeaderViewConfigChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnHeaderViewLabelNodeChange() != null) {
			renderOnHeaderViewLabelNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnHourHeightChange() != null) {
			renderOnHourHeightChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnIsoTimeChange() != null) {
			renderOnIsoTimeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnMarkercellsNodeChange() != null) {
			renderOnMarkercellsNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnNavigationDateFormatterChange() != null) {
			renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnNextDateChange() != null) {
			renderOnNextDateChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnPrevDateChange() != null) {
			renderOnPrevDateChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnResizerNodeChange() != null) {
			renderOnResizerNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnSchedulerChange() != null) {
			renderOnSchedulerChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnScrollableChange() != null) {
			renderOnScrollableChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnTableNodeChange() != null) {
			renderOnTableNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnTimesNodeChange() != null) {
			renderOnTimesNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnTriggerNodeChange() != null) {
			renderOnTriggerNodeChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, schedulerDayView);
		}
		
		if (schedulerDayView.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, schedulerDayView);
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

	protected void renderSchedulerDayViewBodyContent(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String schedulerDayViewBodyContent = schedulerDayView.getSchedulerDayViewBodyContent();
		renderedAttributes.add(renderString(SchedulerDayView.SCHEDULER_DAY_VIEW_BODY_CONTENT, schedulerDayViewBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String boundingBox = schedulerDayView.getBoundingBox();
		renderedAttributes.add(renderString(SchedulerDayView.BOUNDING_BOX, boundingBox));
	}

	protected void renderColDaysNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String colDaysNode = schedulerDayView.getColDaysNode();
		renderedAttributes.add(renderString(SchedulerDayView.COL_DAYS_NODE, colDaysNode));
	}

	protected void renderColHeaderDaysNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String colHeaderDaysNode = schedulerDayView.getColHeaderDaysNode();
		renderedAttributes.add(renderString(SchedulerDayView.COL_HEADER_DAYS_NODE, colHeaderDaysNode));
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String contentBox = schedulerDayView.getContentBox();
		renderedAttributes.add(renderString(SchedulerDayView.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String cssClass = schedulerDayView.getCssClass();
		renderedAttributes.add(renderString(SchedulerDayView.CSS_CLASS, cssClass));
	}

	protected void renderDays(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object days = schedulerDayView.getDays();
		renderedAttributes.add(renderNumber(SchedulerDayView.DAYS, days));
	}

	protected void renderDelegateConfig(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object delegateConfig = schedulerDayView.getDelegateConfig();
		renderedAttributes.add(renderObject(SchedulerDayView.DELEGATE_CONFIG, delegateConfig));
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean destroyed = schedulerDayView.getDestroyed();
		renderedAttributes.add(renderBoolean(SchedulerDayView.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean disabled = schedulerDayView.getDisabled();
		renderedAttributes.add(renderBoolean(SchedulerDayView.DISABLED, disabled));
	}

	protected void renderEventWidth(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object eventWidth = schedulerDayView.getEventWidth();
		renderedAttributes.add(renderNumber(SchedulerDayView.EVENT_WIDTH, eventWidth));
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String filterFn = schedulerDayView.getFilterFn();
		renderedAttributes.add(renderString(SchedulerDayView.FILTER_FN, filterFn));
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean focused = schedulerDayView.getFocused();
		renderedAttributes.add(renderBoolean(SchedulerDayView.FOCUSED, focused));
	}

	protected void renderHeaderDateFormatter(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String headerDateFormatter = schedulerDayView.getHeaderDateFormatter();
		renderedAttributes.add(renderString(SchedulerDayView.HEADER_DATE_FORMATTER, headerDateFormatter));
	}

	protected void renderHeaderTableNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String headerTableNode = schedulerDayView.getHeaderTableNode();
		renderedAttributes.add(renderString(SchedulerDayView.HEADER_TABLE_NODE, headerTableNode));
	}

	protected void renderHeaderView(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean headerView = schedulerDayView.getHeaderView();
		renderedAttributes.add(renderBoolean(SchedulerDayView.HEADER_VIEW, headerView));
	}

	protected void renderHeaderViewConfig(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object headerViewConfig = schedulerDayView.getHeaderViewConfig();
		renderedAttributes.add(renderObject(SchedulerDayView.HEADER_VIEW_CONFIG, headerViewConfig));
	}

	protected void renderHeaderViewLabelNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String headerViewLabelNode = schedulerDayView.getHeaderViewLabelNode();
		renderedAttributes.add(renderString(SchedulerDayView.HEADER_VIEW_LABEL_NODE, headerViewLabelNode));
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object height = schedulerDayView.getHeight();
		renderedAttributes.add(renderNumber(SchedulerDayView.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String hideClass = schedulerDayView.getHideClass();
		renderedAttributes.add(renderString(SchedulerDayView.HIDE_CLASS, hideClass));
	}

	protected void renderHourHeight(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object hourHeight = schedulerDayView.getHourHeight();
		renderedAttributes.add(renderNumber(SchedulerDayView.HOUR_HEIGHT, hourHeight));
	}

	protected void renderSchedulerDayViewId(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String schedulerDayViewId = schedulerDayView.getSchedulerDayViewId();
		renderedAttributes.add(renderString(SchedulerDayView.SCHEDULER_DAY_VIEW_ID, schedulerDayViewId));
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean initialized = schedulerDayView.getInitialized();
		renderedAttributes.add(renderBoolean(SchedulerDayView.INITIALIZED, initialized));
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean isoTime = schedulerDayView.getIsoTime();
		renderedAttributes.add(renderBoolean(SchedulerDayView.ISO_TIME, isoTime));
	}

	protected void renderSchedulerDayViewLocale(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String schedulerDayViewLocale = schedulerDayView.getSchedulerDayViewLocale();
		renderedAttributes.add(renderString(SchedulerDayView.SCHEDULER_DAY_VIEW_LOCALE, schedulerDayViewLocale));
	}

	protected void renderMarkercellsNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String markercellsNode = schedulerDayView.getMarkercellsNode();
		renderedAttributes.add(renderString(SchedulerDayView.MARKERCELLS_NODE, markercellsNode));
	}

	protected void renderName(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String name = schedulerDayView.getName();
		renderedAttributes.add(renderString(SchedulerDayView.NAME, name));
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerDayView.getNavigationDateFormatter();
		renderedAttributes.add(renderString(SchedulerDayView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String nextDate = schedulerDayView.getNextDate();
		renderedAttributes.add(renderString(SchedulerDayView.NEXT_DATE, nextDate));
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String prevDate = schedulerDayView.getPrevDate();
		renderedAttributes.add(renderString(SchedulerDayView.PREV_DATE, prevDate));
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object render = schedulerDayView.getRender();
		renderedAttributes.add(renderString(SchedulerDayView.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean rendered = schedulerDayView.getRendered();
		renderedAttributes.add(renderBoolean(SchedulerDayView.RENDERED, rendered));
	}

	protected void renderResizerNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String resizerNode = schedulerDayView.getResizerNode();
		renderedAttributes.add(renderString(SchedulerDayView.RESIZER_NODE, resizerNode));
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String scheduler = schedulerDayView.getScheduler();
		renderedAttributes.add(renderString(SchedulerDayView.SCHEDULER, scheduler));
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean scrollable = schedulerDayView.getScrollable();
		renderedAttributes.add(renderBoolean(SchedulerDayView.SCROLLABLE, scrollable));
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String srcNode = schedulerDayView.getSrcNode();
		renderedAttributes.add(renderString(SchedulerDayView.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String strings = schedulerDayView.getStrings();
		renderedAttributes.add(renderString(SchedulerDayView.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object tabIndex = schedulerDayView.getTabIndex();
		renderedAttributes.add(renderNumber(SchedulerDayView.TAB_INDEX, tabIndex));
	}

	protected void renderTableNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String tableNode = schedulerDayView.getTableNode();
		renderedAttributes.add(renderString(SchedulerDayView.TABLE_NODE, tableNode));
	}

	protected void renderTimesNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String timesNode = schedulerDayView.getTimesNode();
		renderedAttributes.add(renderString(SchedulerDayView.TIMES_NODE, timesNode));
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String triggerNode = schedulerDayView.getTriggerNode();
		renderedAttributes.add(renderString(SchedulerDayView.TRIGGER_NODE, triggerNode));
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean useARIA = schedulerDayView.getUseARIA();
		renderedAttributes.add(renderBoolean(SchedulerDayView.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Boolean visible = schedulerDayView.getVisible();
		renderedAttributes.add(renderBoolean(SchedulerDayView.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.Object width = schedulerDayView.getWidth();
		renderedAttributes.add(renderString(SchedulerDayView.WIDTH, width));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerDayView.getAfterBodyContentChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerDayView.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterColDaysNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterColDaysNodeChange = schedulerDayView.getAfterColDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_COL_DAYS_NODE_CHANGE, afterColDaysNodeChange));
	}

	protected void renderAfterColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterColHeaderDaysNodeChange = schedulerDayView.getAfterColHeaderDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_COL_HEADER_DAYS_NODE_CHANGE, afterColHeaderDaysNodeChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerDayView.getAfterContentBoxChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterCssClassChange = schedulerDayView.getAfterCssClassChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDaysChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterDaysChange = schedulerDayView.getAfterDaysChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_DAYS_CHANGE, afterDaysChange));
	}

	protected void renderAfterDelegateConfigChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterDelegateConfigChange = schedulerDayView.getAfterDelegateConfigChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerDayView.getAfterDestroyedChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterDisabledChange = schedulerDayView.getAfterDisabledChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterEventWidthChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterEventWidthChange = schedulerDayView.getAfterEventWidthChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_EVENT_WIDTH_CHANGE, afterEventWidthChange));
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerDayView.getAfterFilterFnChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterFocusedChange = schedulerDayView.getAfterFocusedChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderDateFormatterChange = schedulerDayView.getAfterHeaderDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_DATE_FORMATTER_CHANGE, afterHeaderDateFormatterChange));
	}

	protected void renderAfterHeaderTableNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderTableNodeChange = schedulerDayView.getAfterHeaderTableNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_TABLE_NODE_CHANGE, afterHeaderTableNodeChange));
	}

	protected void renderAfterHeaderViewChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderViewChange = schedulerDayView.getAfterHeaderViewChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_VIEW_CHANGE, afterHeaderViewChange));
	}

	protected void renderAfterHeaderViewConfigChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderViewConfigChange = schedulerDayView.getAfterHeaderViewConfigChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_VIEW_CONFIG_CHANGE, afterHeaderViewConfigChange));
	}

	protected void renderAfterHeaderViewLabelNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeaderViewLabelNodeChange = schedulerDayView.getAfterHeaderViewLabelNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEADER_VIEW_LABEL_NODE_CHANGE, afterHeaderViewLabelNodeChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHeightChange = schedulerDayView.getAfterHeightChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHideClassChange = schedulerDayView.getAfterHideClassChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterHourHeightChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterHourHeightChange = schedulerDayView.getAfterHourHeightChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_HOUR_HEIGHT_CHANGE, afterHourHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterIdChange = schedulerDayView.getAfterIdChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterInitializedChange = schedulerDayView.getAfterInitializedChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerDayView.getAfterIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterLocaleChange = schedulerDayView.getAfterLocaleChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMarkercellsNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterMarkercellsNodeChange = schedulerDayView.getAfterMarkercellsNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_MARKERCELLS_NODE_CHANGE, afterMarkercellsNodeChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterNameChange = schedulerDayView.getAfterNameChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerDayView.getAfterNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterNextDateChange = schedulerDayView.getAfterNextDateChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerDayView.getAfterPrevDateChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterRenderChange = schedulerDayView.getAfterRenderChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterRenderedChange = schedulerDayView.getAfterRenderedChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterResizerNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterResizerNodeChange = schedulerDayView.getAfterResizerNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_RESIZER_NODE_CHANGE, afterResizerNodeChange));
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerDayView.getAfterSchedulerChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterScrollableChange = schedulerDayView.getAfterScrollableChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerDayView.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterStringsChange = schedulerDayView.getAfterStringsChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerDayView.getAfterTabIndexChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTableNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterTableNodeChange = schedulerDayView.getAfterTableNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_TABLE_NODE_CHANGE, afterTableNodeChange));
	}

	protected void renderAfterTimesNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterTimesNodeChange = schedulerDayView.getAfterTimesNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_TIMES_NODE_CHANGE, afterTimesNodeChange));
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerDayView.getAfterTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerDayView.getAfterUseARIAChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterVisibleChange = schedulerDayView.getAfterVisibleChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String afterWidthChange = schedulerDayView.getAfterWidthChange();
		renderedAttributes.add(renderString(SchedulerDayView.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onBodyContentChange = schedulerDayView.getOnBodyContentChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerDayView.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnColDaysNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onColDaysNodeChange = schedulerDayView.getOnColDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_COL_DAYS_NODE_CHANGE, onColDaysNodeChange));
	}

	protected void renderOnColHeaderDaysNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onColHeaderDaysNodeChange = schedulerDayView.getOnColHeaderDaysNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_COL_HEADER_DAYS_NODE_CHANGE, onColHeaderDaysNodeChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onContentBoxChange = schedulerDayView.getOnContentBoxChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onCssClassChange = schedulerDayView.getOnCssClassChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDaysChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onDaysChange = schedulerDayView.getOnDaysChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_DAYS_CHANGE, onDaysChange));
	}

	protected void renderOnDelegateConfigChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onDelegateConfigChange = schedulerDayView.getOnDelegateConfigChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onDestroyedChange = schedulerDayView.getOnDestroyedChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onDisabledChange = schedulerDayView.getOnDisabledChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnEventWidthChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onEventWidthChange = schedulerDayView.getOnEventWidthChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_EVENT_WIDTH_CHANGE, onEventWidthChange));
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onFilterFnChange = schedulerDayView.getOnFilterFnChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_FILTER_FN_CHANGE, onFilterFnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onFocusedChange = schedulerDayView.getOnFocusedChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeaderDateFormatterChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderDateFormatterChange = schedulerDayView.getOnHeaderDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_DATE_FORMATTER_CHANGE, onHeaderDateFormatterChange));
	}

	protected void renderOnHeaderTableNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderTableNodeChange = schedulerDayView.getOnHeaderTableNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_TABLE_NODE_CHANGE, onHeaderTableNodeChange));
	}

	protected void renderOnHeaderViewChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderViewChange = schedulerDayView.getOnHeaderViewChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_VIEW_CHANGE, onHeaderViewChange));
	}

	protected void renderOnHeaderViewConfigChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderViewConfigChange = schedulerDayView.getOnHeaderViewConfigChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_VIEW_CONFIG_CHANGE, onHeaderViewConfigChange));
	}

	protected void renderOnHeaderViewLabelNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeaderViewLabelNodeChange = schedulerDayView.getOnHeaderViewLabelNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_HEADER_VIEW_LABEL_NODE_CHANGE, onHeaderViewLabelNodeChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHeightChange = schedulerDayView.getOnHeightChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHideClassChange = schedulerDayView.getOnHideClassChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnHourHeightChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onHourHeightChange = schedulerDayView.getOnHourHeightChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_HOUR_HEIGHT_CHANGE, onHourHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onIdChange = schedulerDayView.getOnIdChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onInitializedChange = schedulerDayView.getOnInitializedChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerDayView.getOnIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onLocaleChange = schedulerDayView.getOnLocaleChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMarkercellsNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onMarkercellsNodeChange = schedulerDayView.getOnMarkercellsNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_MARKERCELLS_NODE_CHANGE, onMarkercellsNodeChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onNameChange = schedulerDayView.getOnNameChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerDayView.getOnNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onNextDateChange = schedulerDayView.getOnNextDateChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_NEXT_DATE_CHANGE, onNextDateChange));
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onPrevDateChange = schedulerDayView.getOnPrevDateChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_PREV_DATE_CHANGE, onPrevDateChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onRenderChange = schedulerDayView.getOnRenderChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onRenderedChange = schedulerDayView.getOnRenderedChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnResizerNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onResizerNodeChange = schedulerDayView.getOnResizerNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_RESIZER_NODE_CHANGE, onResizerNodeChange));
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onSchedulerChange = schedulerDayView.getOnSchedulerChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_SCHEDULER_CHANGE, onSchedulerChange));
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onScrollableChange = schedulerDayView.getOnScrollableChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_SCROLLABLE_CHANGE, onScrollableChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerDayView.getOnSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onStringsChange = schedulerDayView.getOnStringsChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onTabIndexChange = schedulerDayView.getOnTabIndexChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTableNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onTableNodeChange = schedulerDayView.getOnTableNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_TABLE_NODE_CHANGE, onTableNodeChange));
	}

	protected void renderOnTimesNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onTimesNodeChange = schedulerDayView.getOnTimesNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_TIMES_NODE_CHANGE, onTimesNodeChange));
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerDayView.getOnTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onUseARIAChange = schedulerDayView.getOnUseARIAChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onVisibleChange = schedulerDayView.getOnVisibleChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		java.lang.String onWidthChange = schedulerDayView.getOnWidthChange();
		renderedAttributes.add(renderString(SchedulerDayView.ON_WIDTH_CHANGE, onWidthChange));
	}

}