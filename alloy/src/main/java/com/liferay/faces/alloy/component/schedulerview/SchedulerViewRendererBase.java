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

		if (schedulerView.getSchedulerViewBodyContent() != null) {
			renderSchedulerViewBodyContent(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getContentBox() != null) {
			renderContentBox(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getCssClass() != null) {
			renderCssClass(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getDisabled() != null) {
			renderDisabled(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getFilterFn() != null) {
			renderFilterFn(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getFocused() != null) {
			renderFocused(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getHeight() != null) {
			renderHeight(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getHideClass() != null) {
			renderHideClass(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getSchedulerViewId() != null) {
			renderSchedulerViewId(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getInitialized() != null) {
			renderInitialized(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getIsoTime() != null) {
			renderIsoTime(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getSchedulerViewLocale() != null) {
			renderSchedulerViewLocale(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getName() != null) {
			renderName(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getNavigationDateFormatter() != null) {
			renderNavigationDateFormatter(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getNextDate() != null) {
			renderNextDate(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getPrevDate() != null) {
			renderPrevDate(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getRender() != null) {
			renderRender(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getRendered() != null) {
			renderRendered(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getScheduler() != null) {
			renderScheduler(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getScrollable() != null) {
			renderScrollable(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getStrings() != null) {
			renderStrings(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getTriggerNode() != null) {
			renderTriggerNode(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getVisible() != null) {
			renderVisible(renderedAttributes, schedulerView);
		}
		
		if (schedulerView.getWidth() != null) {
			renderWidth(renderedAttributes, schedulerView);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerView.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterFilterFnChange() != null) {
			renderAfterFilterFnChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterIsoTimeChange() != null) {
			renderAfterIsoTimeChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterNavigationDateFormatterChange() != null) {
			renderAfterNavigationDateFormatterChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterNextDateChange() != null) {
			renderAfterNextDateChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterPrevDateChange() != null) {
			renderAfterPrevDateChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterSchedulerChange() != null) {
			renderAfterSchedulerChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterScrollableChange() != null) {
			renderAfterScrollableChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterTriggerNodeChange() != null) {
			renderAfterTriggerNodeChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, schedulerView);
		}
		
		if (schedulerView.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, schedulerView);
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

		if (schedulerView.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnFilterFnChange() != null) {
			renderOnFilterFnChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnIsoTimeChange() != null) {
			renderOnIsoTimeChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnNavigationDateFormatterChange() != null) {
			renderOnNavigationDateFormatterChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnNextDateChange() != null) {
			renderOnNextDateChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnPrevDateChange() != null) {
			renderOnPrevDateChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnSchedulerChange() != null) {
			renderOnSchedulerChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnScrollableChange() != null) {
			renderOnScrollableChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnTriggerNodeChange() != null) {
			renderOnTriggerNodeChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, schedulerView);
		}
		
		if (schedulerView.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, schedulerView);
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

	protected void renderSchedulerViewBodyContent(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String schedulerViewBodyContent = schedulerView.getSchedulerViewBodyContent();
		renderedAttributes.add(renderString(SchedulerView.SCHEDULER_VIEW_BODY_CONTENT, schedulerViewBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String boundingBox = schedulerView.getBoundingBox();
		renderedAttributes.add(renderString(SchedulerView.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String contentBox = schedulerView.getContentBox();
		renderedAttributes.add(renderString(SchedulerView.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String cssClass = schedulerView.getCssClass();
		renderedAttributes.add(renderString(SchedulerView.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean destroyed = schedulerView.getDestroyed();
		renderedAttributes.add(renderBoolean(SchedulerView.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean disabled = schedulerView.getDisabled();
		renderedAttributes.add(renderBoolean(SchedulerView.DISABLED, disabled));
	}

	protected void renderFilterFn(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String filterFn = schedulerView.getFilterFn();
		renderedAttributes.add(renderString(SchedulerView.FILTER_FN, filterFn));
	}

	protected void renderFocused(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean focused = schedulerView.getFocused();
		renderedAttributes.add(renderBoolean(SchedulerView.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object height = schedulerView.getHeight();
		renderedAttributes.add(renderNumber(SchedulerView.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String hideClass = schedulerView.getHideClass();
		renderedAttributes.add(renderString(SchedulerView.HIDE_CLASS, hideClass));
	}

	protected void renderSchedulerViewId(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String schedulerViewId = schedulerView.getSchedulerViewId();
		renderedAttributes.add(renderString(SchedulerView.SCHEDULER_VIEW_ID, schedulerViewId));
	}

	protected void renderInitialized(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean initialized = schedulerView.getInitialized();
		renderedAttributes.add(renderBoolean(SchedulerView.INITIALIZED, initialized));
	}

	protected void renderIsoTime(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean isoTime = schedulerView.getIsoTime();
		renderedAttributes.add(renderBoolean(SchedulerView.ISO_TIME, isoTime));
	}

	protected void renderSchedulerViewLocale(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String schedulerViewLocale = schedulerView.getSchedulerViewLocale();
		renderedAttributes.add(renderString(SchedulerView.SCHEDULER_VIEW_LOCALE, schedulerViewLocale));
	}

	protected void renderName(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String name = schedulerView.getName();
		renderedAttributes.add(renderString(SchedulerView.NAME, name));
	}

	protected void renderNavigationDateFormatter(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object navigationDateFormatter = schedulerView.getNavigationDateFormatter();
		renderedAttributes.add(renderString(SchedulerView.NAVIGATION_DATE_FORMATTER, navigationDateFormatter));
	}

	protected void renderNextDate(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String nextDate = schedulerView.getNextDate();
		renderedAttributes.add(renderString(SchedulerView.NEXT_DATE, nextDate));
	}

	protected void renderPrevDate(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String prevDate = schedulerView.getPrevDate();
		renderedAttributes.add(renderString(SchedulerView.PREV_DATE, prevDate));
	}

	protected void renderRender(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object render = schedulerView.getRender();
		renderedAttributes.add(renderString(SchedulerView.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean rendered = schedulerView.getRendered();
		renderedAttributes.add(renderBoolean(SchedulerView.RENDERED, rendered));
	}

	protected void renderScheduler(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String scheduler = schedulerView.getScheduler();
		renderedAttributes.add(renderString(SchedulerView.SCHEDULER, scheduler));
	}

	protected void renderScrollable(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean scrollable = schedulerView.getScrollable();
		renderedAttributes.add(renderBoolean(SchedulerView.SCROLLABLE, scrollable));
	}

	protected void renderSrcNode(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String srcNode = schedulerView.getSrcNode();
		renderedAttributes.add(renderString(SchedulerView.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object strings = schedulerView.getStrings();
		renderedAttributes.add(renderObject(SchedulerView.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object tabIndex = schedulerView.getTabIndex();
		renderedAttributes.add(renderNumber(SchedulerView.TAB_INDEX, tabIndex));
	}

	protected void renderTriggerNode(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String triggerNode = schedulerView.getTriggerNode();
		renderedAttributes.add(renderString(SchedulerView.TRIGGER_NODE, triggerNode));
	}

	protected void renderUseARIA(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean useARIA = schedulerView.getUseARIA();
		renderedAttributes.add(renderBoolean(SchedulerView.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Boolean visible = schedulerView.getVisible();
		renderedAttributes.add(renderBoolean(SchedulerView.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.Object width = schedulerView.getWidth();
		renderedAttributes.add(renderString(SchedulerView.WIDTH, width));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterBodyContentChange = schedulerView.getAfterBodyContentChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterBoundingBoxChange = schedulerView.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterContentBoxChange = schedulerView.getAfterContentBoxChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterCssClassChange = schedulerView.getAfterCssClassChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterDestroyedChange = schedulerView.getAfterDestroyedChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterDisabledChange = schedulerView.getAfterDisabledChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFilterFnChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterFilterFnChange = schedulerView.getAfterFilterFnChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_FILTER_FN_CHANGE, afterFilterFnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterFocusedChange = schedulerView.getAfterFocusedChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterHeightChange = schedulerView.getAfterHeightChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterHideClassChange = schedulerView.getAfterHideClassChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterIdChange = schedulerView.getAfterIdChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterInitializedChange = schedulerView.getAfterInitializedChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIsoTimeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterIsoTimeChange = schedulerView.getAfterIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_ISO_TIME_CHANGE, afterIsoTimeChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterLocaleChange = schedulerView.getAfterLocaleChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterNameChange = schedulerView.getAfterNameChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterNavigationDateFormatterChange = schedulerView.getAfterNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_NAVIGATION_DATE_FORMATTER_CHANGE, afterNavigationDateFormatterChange));
	}

	protected void renderAfterNextDateChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterNextDateChange = schedulerView.getAfterNextDateChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_NEXT_DATE_CHANGE, afterNextDateChange));
	}

	protected void renderAfterPrevDateChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterPrevDateChange = schedulerView.getAfterPrevDateChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_PREV_DATE_CHANGE, afterPrevDateChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterRenderChange = schedulerView.getAfterRenderChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterRenderedChange = schedulerView.getAfterRenderedChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSchedulerChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterSchedulerChange = schedulerView.getAfterSchedulerChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_SCHEDULER_CHANGE, afterSchedulerChange));
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterScrollableChange = schedulerView.getAfterScrollableChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterSrcNodeChange = schedulerView.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterStringsChange = schedulerView.getAfterStringsChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterTabIndexChange = schedulerView.getAfterTabIndexChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTriggerNodeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterTriggerNodeChange = schedulerView.getAfterTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_TRIGGER_NODE_CHANGE, afterTriggerNodeChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterUseARIAChange = schedulerView.getAfterUseARIAChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterVisibleChange = schedulerView.getAfterVisibleChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String afterWidthChange = schedulerView.getAfterWidthChange();
		renderedAttributes.add(renderString(SchedulerView.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onBodyContentChange = schedulerView.getOnBodyContentChange();
		renderedAttributes.add(renderString(SchedulerView.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onBoundingBoxChange = schedulerView.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(SchedulerView.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onContentBoxChange = schedulerView.getOnContentBoxChange();
		renderedAttributes.add(renderString(SchedulerView.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onCssClassChange = schedulerView.getOnCssClassChange();
		renderedAttributes.add(renderString(SchedulerView.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onDestroyedChange = schedulerView.getOnDestroyedChange();
		renderedAttributes.add(renderString(SchedulerView.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onDisabledChange = schedulerView.getOnDisabledChange();
		renderedAttributes.add(renderString(SchedulerView.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFilterFnChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onFilterFnChange = schedulerView.getOnFilterFnChange();
		renderedAttributes.add(renderString(SchedulerView.ON_FILTER_FN_CHANGE, onFilterFnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onFocusedChange = schedulerView.getOnFocusedChange();
		renderedAttributes.add(renderString(SchedulerView.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onHeightChange = schedulerView.getOnHeightChange();
		renderedAttributes.add(renderString(SchedulerView.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onHideClassChange = schedulerView.getOnHideClassChange();
		renderedAttributes.add(renderString(SchedulerView.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onIdChange = schedulerView.getOnIdChange();
		renderedAttributes.add(renderString(SchedulerView.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onInitializedChange = schedulerView.getOnInitializedChange();
		renderedAttributes.add(renderString(SchedulerView.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIsoTimeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onIsoTimeChange = schedulerView.getOnIsoTimeChange();
		renderedAttributes.add(renderString(SchedulerView.ON_ISO_TIME_CHANGE, onIsoTimeChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onLocaleChange = schedulerView.getOnLocaleChange();
		renderedAttributes.add(renderString(SchedulerView.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onNameChange = schedulerView.getOnNameChange();
		renderedAttributes.add(renderString(SchedulerView.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnNavigationDateFormatterChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onNavigationDateFormatterChange = schedulerView.getOnNavigationDateFormatterChange();
		renderedAttributes.add(renderString(SchedulerView.ON_NAVIGATION_DATE_FORMATTER_CHANGE, onNavigationDateFormatterChange));
	}

	protected void renderOnNextDateChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onNextDateChange = schedulerView.getOnNextDateChange();
		renderedAttributes.add(renderString(SchedulerView.ON_NEXT_DATE_CHANGE, onNextDateChange));
	}

	protected void renderOnPrevDateChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onPrevDateChange = schedulerView.getOnPrevDateChange();
		renderedAttributes.add(renderString(SchedulerView.ON_PREV_DATE_CHANGE, onPrevDateChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onRenderChange = schedulerView.getOnRenderChange();
		renderedAttributes.add(renderString(SchedulerView.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onRenderedChange = schedulerView.getOnRenderedChange();
		renderedAttributes.add(renderString(SchedulerView.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSchedulerChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onSchedulerChange = schedulerView.getOnSchedulerChange();
		renderedAttributes.add(renderString(SchedulerView.ON_SCHEDULER_CHANGE, onSchedulerChange));
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onScrollableChange = schedulerView.getOnScrollableChange();
		renderedAttributes.add(renderString(SchedulerView.ON_SCROLLABLE_CHANGE, onScrollableChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onSrcNodeChange = schedulerView.getOnSrcNodeChange();
		renderedAttributes.add(renderString(SchedulerView.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onStringsChange = schedulerView.getOnStringsChange();
		renderedAttributes.add(renderString(SchedulerView.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onTabIndexChange = schedulerView.getOnTabIndexChange();
		renderedAttributes.add(renderString(SchedulerView.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTriggerNodeChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onTriggerNodeChange = schedulerView.getOnTriggerNodeChange();
		renderedAttributes.add(renderString(SchedulerView.ON_TRIGGER_NODE_CHANGE, onTriggerNodeChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onUseARIAChange = schedulerView.getOnUseARIAChange();
		renderedAttributes.add(renderString(SchedulerView.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onVisibleChange = schedulerView.getOnVisibleChange();
		renderedAttributes.add(renderString(SchedulerView.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String onWidthChange = schedulerView.getOnWidthChange();
		renderedAttributes.add(renderString(SchedulerView.ON_WIDTH_CHANGE, onWidthChange));
	}

}