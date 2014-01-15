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
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class SchedulerDayViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-day";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SchedulerDayView schedulerDayView = (SchedulerDayView) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var schedulerDayView = new A.SchedulerDayView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderSchedulerdayviewBodyContent(renrederedAttributes, schedulerDayView);
		renderBoundingBox(renrederedAttributes, schedulerDayView);
		renderColDaysNode(renrederedAttributes, schedulerDayView);
		renderColHeaderDaysNode(renrederedAttributes, schedulerDayView);
		renderContentBox(renrederedAttributes, schedulerDayView);
		renderCssClass(renrederedAttributes, schedulerDayView);
		renderDays(renrederedAttributes, schedulerDayView);
		renderDelegateConfig(renrederedAttributes, schedulerDayView);
		renderDestroyed(renrederedAttributes, schedulerDayView);
		renderDisabled(renrederedAttributes, schedulerDayView);
		renderEventWidth(renrederedAttributes, schedulerDayView);
		renderFilterFn(renrederedAttributes, schedulerDayView);
		renderFocused(renrederedAttributes, schedulerDayView);
		renderHeaderDateFormatter(renrederedAttributes, schedulerDayView);
		renderHeaderTableNode(renrederedAttributes, schedulerDayView);
		renderHeaderView(renrederedAttributes, schedulerDayView);
		renderHeaderViewConfig(renrederedAttributes, schedulerDayView);
		renderHeaderViewLabelNode(renrederedAttributes, schedulerDayView);
		renderHeight(renrederedAttributes, schedulerDayView);
		renderHideClass(renrederedAttributes, schedulerDayView);
		renderHourHeight(renrederedAttributes, schedulerDayView);
		renderSchedulerdayviewId(renrederedAttributes, schedulerDayView);
		renderInitialized(renrederedAttributes, schedulerDayView);
		renderIsoTime(renrederedAttributes, schedulerDayView);
		renderSchedulerdayviewLocale(renrederedAttributes, schedulerDayView);
		renderMarkercellsNode(renrederedAttributes, schedulerDayView);
		renderName(renrederedAttributes, schedulerDayView);
		renderNavigationDateFormatter(renrederedAttributes, schedulerDayView);
		renderNextDate(renrederedAttributes, schedulerDayView);
		renderPrevDate(renrederedAttributes, schedulerDayView);
		renderRender(renrederedAttributes, schedulerDayView);
		renderRendered(renrederedAttributes, schedulerDayView);
		renderResizerNode(renrederedAttributes, schedulerDayView);
		renderScheduler(renrederedAttributes, schedulerDayView);
		renderScrollable(renrederedAttributes, schedulerDayView);
		renderSrcNode(renrederedAttributes, schedulerDayView);
		renderStrings(renrederedAttributes, schedulerDayView);
		renderTabIndex(renrederedAttributes, schedulerDayView);
		renderTableNode(renrederedAttributes, schedulerDayView);
		renderTimesNode(renrederedAttributes, schedulerDayView);
		renderTriggerNode(renrederedAttributes, schedulerDayView);
		renderUseARIA(renrederedAttributes, schedulerDayView);
		renderVisible(renrederedAttributes, schedulerDayView);
		renderWidth(renrederedAttributes, schedulerDayView);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderSchedulerdayviewBodyContent(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getSchedulerdayviewBodyContent() != null) {
			renrederedAttributes.add(renderString("schedulerdayviewBodyContent", schedulerDayView.getSchedulerdayviewBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", schedulerDayView.getBoundingBox()));
		}
	}

	protected void renderColDaysNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getColDaysNode() != null) {
			renrederedAttributes.add(renderString("colDaysNode", schedulerDayView.getColDaysNode()));
		}
	}

	protected void renderColHeaderDaysNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getColHeaderDaysNode() != null) {
			renrederedAttributes.add(renderString("colHeaderDaysNode", schedulerDayView.getColHeaderDaysNode()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", schedulerDayView.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", schedulerDayView.getCssClass()));
		}
	}

	protected void renderDays(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getDays() != null) {
			renrederedAttributes.add(renderNumber("days", schedulerDayView.getDays()));
		}
	}

	protected void renderDelegateConfig(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getDelegateConfig() != null) {
			renrederedAttributes.add(renderObject("delegateConfig", schedulerDayView.getDelegateConfig()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", schedulerDayView.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", schedulerDayView.getDisabled()));
		}
	}

	protected void renderEventWidth(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getEventWidth() != null) {
			renrederedAttributes.add(renderNumber("eventWidth", schedulerDayView.getEventWidth()));
		}
	}

	protected void renderFilterFn(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getFilterFn() != null) {
			renrederedAttributes.add(renderString("filterFn", schedulerDayView.getFilterFn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", schedulerDayView.getFocused()));
		}
	}

	protected void renderHeaderDateFormatter(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getHeaderDateFormatter() != null) {
			renrederedAttributes.add(renderString("headerDateFormatter", schedulerDayView.getHeaderDateFormatter()));
		}
	}

	protected void renderHeaderTableNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getHeaderTableNode() != null) {
			renrederedAttributes.add(renderString("headerTableNode", schedulerDayView.getHeaderTableNode()));
		}
	}

	protected void renderHeaderView(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getHeaderView() != null) {
			renrederedAttributes.add(renderBoolean("headerView", schedulerDayView.getHeaderView()));
		}
	}

	protected void renderHeaderViewConfig(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getHeaderViewConfig() != null) {
			renrederedAttributes.add(renderObject("headerViewConfig", schedulerDayView.getHeaderViewConfig()));
		}
	}

	protected void renderHeaderViewLabelNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getHeaderViewLabelNode() != null) {
			renrederedAttributes.add(renderString("headerViewLabelNode", schedulerDayView.getHeaderViewLabelNode()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", schedulerDayView.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", schedulerDayView.getHideClass()));
		}
	}

	protected void renderHourHeight(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getHourHeight() != null) {
			renrederedAttributes.add(renderNumber("hourHeight", schedulerDayView.getHourHeight()));
		}
	}

	protected void renderSchedulerdayviewId(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getSchedulerdayviewId() != null) {
			renrederedAttributes.add(renderString("schedulerdayviewId", schedulerDayView.getSchedulerdayviewId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", schedulerDayView.getInitialized()));
		}
	}

	protected void renderIsoTime(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getIsoTime() != null) {
			renrederedAttributes.add(renderBoolean("isoTime", schedulerDayView.getIsoTime()));
		}
	}

	protected void renderSchedulerdayviewLocale(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getSchedulerdayviewLocale() != null) {
			renrederedAttributes.add(renderString("schedulerdayviewLocale", schedulerDayView.getSchedulerdayviewLocale()));
		}
	}

	protected void renderMarkercellsNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getMarkercellsNode() != null) {
			renrederedAttributes.add(renderString("markercellsNode", schedulerDayView.getMarkercellsNode()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getName() != null) {
			renrederedAttributes.add(renderString("name", schedulerDayView.getName()));
		}
	}

	protected void renderNavigationDateFormatter(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getNavigationDateFormatter() != null) {
			renrederedAttributes.add(renderString("navigationDateFormatter", schedulerDayView.getNavigationDateFormatter()));
		}
	}

	protected void renderNextDate(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getNextDate() != null) {
			renrederedAttributes.add(renderString("nextDate", schedulerDayView.getNextDate()));
		}
	}

	protected void renderPrevDate(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getPrevDate() != null) {
			renrederedAttributes.add(renderString("prevDate", schedulerDayView.getPrevDate()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getRender() != null) {
			renrederedAttributes.add(renderString("render", schedulerDayView.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", schedulerDayView.getRendered()));
		}
	}

	protected void renderResizerNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getResizerNode() != null) {
			renrederedAttributes.add(renderString("resizerNode", schedulerDayView.getResizerNode()));
		}
	}

	protected void renderScheduler(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getScheduler() != null) {
			renrederedAttributes.add(renderString("scheduler", schedulerDayView.getScheduler()));
		}
	}

	protected void renderScrollable(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getScrollable() != null) {
			renrederedAttributes.add(renderBoolean("scrollable", schedulerDayView.getScrollable()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", schedulerDayView.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getStrings() != null) {
			renrederedAttributes.add(renderString("strings", schedulerDayView.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", schedulerDayView.getTabIndex()));
		}
	}

	protected void renderTableNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getTableNode() != null) {
			renrederedAttributes.add(renderString("tableNode", schedulerDayView.getTableNode()));
		}
	}

	protected void renderTimesNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getTimesNode() != null) {
			renrederedAttributes.add(renderString("timesNode", schedulerDayView.getTimesNode()));
		}
	}

	protected void renderTriggerNode(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getTriggerNode() != null) {
			renrederedAttributes.add(renderString("triggerNode", schedulerDayView.getTriggerNode()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", schedulerDayView.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", schedulerDayView.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, SchedulerDayView schedulerDayView) throws IOException {
		if (schedulerDayView.getWidth() != null) {
			renrederedAttributes.add(renderString("width", schedulerDayView.getWidth()));
		}
	}

}