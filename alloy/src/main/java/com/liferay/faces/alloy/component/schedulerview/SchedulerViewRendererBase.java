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

		renderSchedulerviewBodyContent(renderedAttributes, schedulerView);
		renderBoundingBox(renderedAttributes, schedulerView);
		renderContentBox(renderedAttributes, schedulerView);
		renderCssClass(renderedAttributes, schedulerView);
		renderDestroyed(renderedAttributes, schedulerView);
		renderDisabled(renderedAttributes, schedulerView);
		renderFilterFn(renderedAttributes, schedulerView);
		renderFocused(renderedAttributes, schedulerView);
		renderHeight(renderedAttributes, schedulerView);
		renderHideClass(renderedAttributes, schedulerView);
		renderSchedulerviewId(renderedAttributes, schedulerView);
		renderInitialized(renderedAttributes, schedulerView);
		renderIsoTime(renderedAttributes, schedulerView);
		renderSchedulerviewLocale(renderedAttributes, schedulerView);
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

	protected void renderSchedulerviewBodyContent(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String schedulerviewBodyContent = schedulerView.getSchedulerviewBodyContent();

		if (schedulerviewBodyContent != null) {
			renderedAttributes.add(renderString(SchedulerView.SCHEDULERVIEW_BODY_CONTENT, schedulerviewBodyContent));
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

	protected void renderSchedulerviewId(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String schedulerviewId = schedulerView.getSchedulerviewId();

		if (schedulerviewId != null) {
			renderedAttributes.add(renderString(SchedulerView.SCHEDULERVIEW_ID, schedulerviewId));
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

	protected void renderSchedulerviewLocale(List<String> renderedAttributes, SchedulerView schedulerView) throws IOException {
		java.lang.String schedulerviewLocale = schedulerView.getSchedulerviewLocale();

		if (schedulerviewLocale != null) {
			renderedAttributes.add(renderString(SchedulerView.SCHEDULERVIEW_LOCALE, schedulerviewLocale));
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

}