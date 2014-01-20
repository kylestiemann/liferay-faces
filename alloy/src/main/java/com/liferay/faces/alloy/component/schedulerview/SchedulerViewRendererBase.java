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
package com.liferay.faces.alloy.component.schedulerview;

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
public abstract class SchedulerViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base-view";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerView schedulerView = (SchedulerView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerView = new A.SchedulerView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderSchedulerViewBodyContent(renderedAttributes, schedulerView);
		renderBoundingBox(renderedAttributes, schedulerView);
		renderContentBox(renderedAttributes, schedulerView);
		renderCssClass(renderedAttributes, schedulerView);
		renderDestroyed(renderedAttributes, schedulerView);
		renderDisabled(renderedAttributes, schedulerView);
		renderFilterFn(renderedAttributes, schedulerView);
		renderFocused(renderedAttributes, schedulerView);
		renderHeight(renderedAttributes, schedulerView);
		renderHideClass(renderedAttributes, schedulerView);
		renderSchedulerViewId(renderedAttributes, schedulerView);
		renderInitialized(renderedAttributes, schedulerView);
		renderIsoTime(renderedAttributes, schedulerView);
		renderSchedulerViewLocale(renderedAttributes, schedulerView);
		renderName(renderedAttributes, schedulerView);
		renderNavigationDateFormatter(renderedAttributes, schedulerView);
		renderNextDate(renderedAttributes, schedulerView);
		renderPrevDate(renderedAttributes, schedulerView);
		renderRender(renderedAttributes, schedulerView);
		renderRendered(renderedAttributes, schedulerView);
		renderScheduler(renderedAttributes, schedulerView);
		renderScrollable(renderedAttributes, schedulerView);
		renderSrcNode(renderedAttributes, schedulerView);
		renderStrings(renderedAttributes, schedulerView);
		renderTabIndex(renderedAttributes, schedulerView);
		renderTriggerNode(renderedAttributes, schedulerView);
		renderUseARIA(renderedAttributes, schedulerView);
		renderVisible(renderedAttributes, schedulerView);
		renderWidth(renderedAttributes, schedulerView);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBodyContentChange(renderedAfterEvents, schedulerView);
		renderAfterBoundingBoxChange(renderedAfterEvents, schedulerView);
		renderAfterContentBoxChange(renderedAfterEvents, schedulerView);
		renderAfterCssClassChange(renderedAfterEvents, schedulerView);
		renderAfterDestroyedChange(renderedAfterEvents, schedulerView);
		renderAfterDisabledChange(renderedAfterEvents, schedulerView);
		renderAfterFilterFnChange(renderedAfterEvents, schedulerView);
		renderAfterFocusedChange(renderedAfterEvents, schedulerView);
		renderAfterHeightChange(renderedAfterEvents, schedulerView);
		renderAfterHideClassChange(renderedAfterEvents, schedulerView);
		renderAfterIdChange(renderedAfterEvents, schedulerView);
		renderAfterInitializedChange(renderedAfterEvents, schedulerView);
		renderAfterIsoTimeChange(renderedAfterEvents, schedulerView);
		renderAfterLocaleChange(renderedAfterEvents, schedulerView);
		renderAfterNameChange(renderedAfterEvents, schedulerView);
		renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerView);
		renderAfterNextDateChange(renderedAfterEvents, schedulerView);
		renderAfterPrevDateChange(renderedAfterEvents, schedulerView);
		renderAfterRenderChange(renderedAfterEvents, schedulerView);
		renderAfterRenderedChange(renderedAfterEvents, schedulerView);
		renderAfterSchedulerChange(renderedAfterEvents, schedulerView);
		renderAfterScrollableChange(renderedAfterEvents, schedulerView);
		renderAfterSrcNodeChange(renderedAfterEvents, schedulerView);
		renderAfterStringsChange(renderedAfterEvents, schedulerView);
		renderAfterTabIndexChange(renderedAfterEvents, schedulerView);
		renderAfterTriggerNodeChange(renderedAfterEvents, schedulerView);
		renderAfterUseARIAChange(renderedAfterEvents, schedulerView);
		renderAfterVisibleChange(renderedAfterEvents, schedulerView);
		renderAfterWidthChange(renderedAfterEvents, schedulerView);

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

		renderOnBodyContentChange(renderedOnEvents, schedulerView);
		renderOnBoundingBoxChange(renderedOnEvents, schedulerView);
		renderOnContentBoxChange(renderedOnEvents, schedulerView);
		renderOnCssClassChange(renderedOnEvents, schedulerView);
		renderOnDestroyedChange(renderedOnEvents, schedulerView);
		renderOnDisabledChange(renderedOnEvents, schedulerView);
		renderOnFilterFnChange(renderedOnEvents, schedulerView);
		renderOnFocusedChange(renderedOnEvents, schedulerView);
		renderOnHeightChange(renderedOnEvents, schedulerView);
		renderOnHideClassChange(renderedOnEvents, schedulerView);
		renderOnIdChange(renderedOnEvents, schedulerView);
		renderOnInitializedChange(renderedOnEvents, schedulerView);
		renderOnIsoTimeChange(renderedOnEvents, schedulerView);
		renderOnLocaleChange(renderedOnEvents, schedulerView);
		renderOnNameChange(renderedOnEvents, schedulerView);
		renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerView);
		renderOnNextDateChange(renderedOnEvents, schedulerView);
		renderOnPrevDateChange(renderedOnEvents, schedulerView);
		renderOnRenderChange(renderedOnEvents, schedulerView);
		renderOnRenderedChange(renderedOnEvents, schedulerView);
		renderOnSchedulerChange(renderedOnEvents, schedulerView);
		renderOnScrollableChange(renderedOnEvents, schedulerView);
		renderOnSrcNodeChange(renderedOnEvents, schedulerView);
		renderOnStringsChange(renderedOnEvents, schedulerView);
		renderOnTabIndexChange(renderedOnEvents, schedulerView);
		renderOnTriggerNodeChange(renderedOnEvents, schedulerView);
		renderOnUseARIAChange(renderedOnEvents, schedulerView);
		renderOnVisibleChange(renderedOnEvents, schedulerView);
		renderOnWidthChange(renderedOnEvents, schedulerView);

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

	protected void renderSchedulerViewBodyContent(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String schedulerViewBodyContent = schedulerView.getSchedulerViewBodyContent();

		if (schedulerViewBodyContent != null) {
			renderedAttributes.add(renderString(SchedulerView.SCHEDULER_VIEW_BODY_CONTENT, schedulerViewBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String boundingBox = schedulerView.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(SchedulerView.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String contentBox = schedulerView.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(SchedulerView.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String cssClass = schedulerView.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(SchedulerView.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean destroyed = schedulerView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SchedulerView.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean disabled = schedulerView.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(SchedulerView.DISABLED, disabled));
		}
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String filterFn = schedulerView.getFilterFn();

		if (filterFn != null) {
			renderedAttributes.add(renderString(SchedulerView.FILTER_FN, filterFn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean focused = schedulerView.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(SchedulerView.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object height = schedulerView.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(SchedulerView.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String hideClass = schedulerView.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(SchedulerView.HIDE_CLASS, hideClass));
		}
	}

	protected void renderSchedulerViewId(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String schedulerViewId = schedulerView.getSchedulerViewId();

		if (schedulerViewId != null) {
			renderedAttributes.add(renderString(SchedulerView.SCHEDULER_VIEW_ID, schedulerViewId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean initialized = schedulerView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SchedulerView.INITIALIZED, initialized));
		}
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean isoTime = schedulerView.getIsoTime();

		if (isoTime != null) {
			renderedAttributes.add(renderBoolean(SchedulerView.ISO_TIME, isoTime));
		}
	}

	protected void renderSchedulerViewLocale(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String schedulerViewLocale = schedulerView.getSchedulerViewLocale();

		if (schedulerViewLocale != null) {
			renderedAttributes.add(renderString(SchedulerView.SCHEDULER_VIEW_LOCALE, schedulerViewLocale));
		}
	}

	protected void renderName(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String name = schedulerView.getName();

		if (name != null) {
			renderedAttributes.add(renderString(SchedulerView.NAME, name));
		}
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerView.getNavigationDateFormatter();

		if (navigationDateFormatter != null) {
			renderedAttributes.add(renderString(SchedulerView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
		}
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String nextDate = schedulerView.getNextDate();

		if (nextDate != null) {
			renderedAttributes.add(renderString(SchedulerView.NEXT_DATE, nextDate));
		}
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String prevDate = schedulerView.getPrevDate();

		if (prevDate != null) {
			renderedAttributes.add(renderString(SchedulerView.PREV_DATE, prevDate));
		}
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object render = schedulerView.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(SchedulerView.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean rendered = schedulerView.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(SchedulerView.RENDERED, rendered));
		}
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String scheduler = schedulerView.getScheduler();

		if (scheduler != null) {
			renderedAttributes.add(renderString(SchedulerView.SCHEDULER, scheduler));
		}
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean scrollable = schedulerView.getScrollable();

		if (scrollable != null) {
			renderedAttributes.add(renderBoolean(SchedulerView.SCROLLABLE, scrollable));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String srcNode = schedulerView.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(SchedulerView.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object strings = schedulerView.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(SchedulerView.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object tabIndex = schedulerView.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(SchedulerView.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String triggerNode = schedulerView.getTriggerNode();

		if (triggerNode != null) {
			renderedAttributes.add(renderString(SchedulerView.TRIGGER_NODE, triggerNode));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean useARIA = schedulerView.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(SchedulerView.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean visible = schedulerView.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(SchedulerView.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object width = schedulerView.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(SchedulerView.WIDTH, width));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerView.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerView.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerView.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterCssClassChange = schedulerView.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerView.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterDisabledChange = schedulerView.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerView.getAfterFilterFnChange();

		if (afterFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterFocusedChange = schedulerView.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterHeightChange = schedulerView.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterHideClassChange = schedulerView.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterIdChange = schedulerView.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterInitializedChange = schedulerView.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerView.getAfterIsoTimeChange();

		if (afterIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterLocaleChange = schedulerView.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterNameChange = schedulerView.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerView.getAfterNavigationDateFormatterChange();

		if (afterNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
		}
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterNextDateChange = schedulerView.getAfterNextDateChange();

		if (afterNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
		}
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerView.getAfterPrevDateChange();

		if (afterPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterRenderChange = schedulerView.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterRenderedChange = schedulerView.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerView.getAfterSchedulerChange();

		if (afterSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
		}
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterScrollableChange = schedulerView.getAfterScrollableChange();

		if (afterScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerView.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterStringsChange = schedulerView.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerView.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerView.getAfterTriggerNodeChange();

		if (afterTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerView.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterVisibleChange = schedulerView.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterWidthChange = schedulerView.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerView.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onBodyContentChange = schedulerView.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerView.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onContentBoxChange = schedulerView.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onCssClassChange = schedulerView.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onDestroyedChange = schedulerView.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onDisabledChange = schedulerView.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onFilterFnChange = schedulerView.getOnFilterFnChange();

		if (onFilterFnChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_FILTER_FN_CHANGE, onFilterFnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onFocusedChange = schedulerView.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onHeightChange = schedulerView.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onHideClassChange = schedulerView.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onIdChange = schedulerView.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onInitializedChange = schedulerView.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerView.getOnIsoTimeChange();

		if (onIsoTimeChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onLocaleChange = schedulerView.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onNameChange = schedulerView.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerView.getOnNavigationDateFormatterChange();

		if (onNavigationDateFormatterChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
		}
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onNextDateChange = schedulerView.getOnNextDateChange();

		if (onNextDateChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_NEXT_DATE_CHANGE, onNextDateChange));
		}
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onPrevDateChange = schedulerView.getOnPrevDateChange();

		if (onPrevDateChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_PREV_DATE_CHANGE, onPrevDateChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onRenderChange = schedulerView.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onRenderedChange = schedulerView.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onSchedulerChange = schedulerView.getOnSchedulerChange();

		if (onSchedulerChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_SCHEDULER_CHANGE, onSchedulerChange));
		}
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onScrollableChange = schedulerView.getOnScrollableChange();

		if (onScrollableChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_SCROLLABLE_CHANGE, onScrollableChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerView.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onStringsChange = schedulerView.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onTabIndexChange = schedulerView.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerView.getOnTriggerNodeChange();

		if (onTriggerNodeChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onUseARIAChange = schedulerView.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onVisibleChange = schedulerView.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onWidthChange = schedulerView.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(SchedulerView.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}