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
public abstract class SchedulerWeekViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-week";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SchedulerWeekView schedulerWeekView = (SchedulerWeekView) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var schedulerWeekView = new A.SchedulerWeekView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderSchedulerweekviewBodyContent(renrederedAttributes, schedulerWeekView);
		renderBoundingBox(renrederedAttributes, schedulerWeekView);
		renderColDaysNode(renrederedAttributes, schedulerWeekView);
		renderColHeaderDaysNode(renrederedAttributes, schedulerWeekView);
		renderContentBox(renrederedAttributes, schedulerWeekView);
		renderCssClass(renrederedAttributes, schedulerWeekView);
		renderDays(renrederedAttributes, schedulerWeekView);
		renderDelegateConfig(renrederedAttributes, schedulerWeekView);
		renderDestroyed(renrederedAttributes, schedulerWeekView);
		renderDisabled(renrederedAttributes, schedulerWeekView);
		renderEventWidth(renrederedAttributes, schedulerWeekView);
		renderFilterFn(renrederedAttributes, schedulerWeekView);
		renderFocused(renrederedAttributes, schedulerWeekView);
		renderHeaderDateFormatter(renrederedAttributes, schedulerWeekView);
		renderHeaderTableNode(renrederedAttributes, schedulerWeekView);
		renderHeaderView(renrederedAttributes, schedulerWeekView);
		renderHeaderViewConfig(renrederedAttributes, schedulerWeekView);
		renderHeaderViewLabelNode(renrederedAttributes, schedulerWeekView);
		renderHeight(renrederedAttributes, schedulerWeekView);
		renderHideClass(renrederedAttributes, schedulerWeekView);
		renderHourHeight(renrederedAttributes, schedulerWeekView);
		renderSchedulerweekviewId(renrederedAttributes, schedulerWeekView);
		renderInitialized(renrederedAttributes, schedulerWeekView);
		renderIsoTime(renrederedAttributes, schedulerWeekView);
		renderSchedulerweekviewLocale(renrederedAttributes, schedulerWeekView);
		renderMarkercellsNode(renrederedAttributes, schedulerWeekView);
		renderName(renrederedAttributes, schedulerWeekView);
		renderNavigationDateFormatter(renrederedAttributes, schedulerWeekView);
		renderNextDate(renrederedAttributes, schedulerWeekView);
		renderPrevDate(renrederedAttributes, schedulerWeekView);
		renderRender(renrederedAttributes, schedulerWeekView);
		renderRendered(renrederedAttributes, schedulerWeekView);
		renderResizerNode(renrederedAttributes, schedulerWeekView);
		renderScheduler(renrederedAttributes, schedulerWeekView);
		renderScrollable(renrederedAttributes, schedulerWeekView);
		renderSrcNode(renrederedAttributes, schedulerWeekView);
		renderStrings(renrederedAttributes, schedulerWeekView);
		renderTabIndex(renrederedAttributes, schedulerWeekView);
		renderTableNode(renrederedAttributes, schedulerWeekView);
		renderTimesNode(renrederedAttributes, schedulerWeekView);
		renderTriggerNode(renrederedAttributes, schedulerWeekView);
		renderUseARIA(renrederedAttributes, schedulerWeekView);
		renderVisible(renrederedAttributes, schedulerWeekView);
		renderWidth(renrederedAttributes, schedulerWeekView);

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

	protected void renderSchedulerweekviewBodyContent(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getSchedulerweekviewBodyContent() != null) {
			renrederedAttributes.add(renderString("schedulerweekviewBodyContent", schedulerWeekView.getSchedulerweekviewBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", schedulerWeekView.getBoundingBox()));
		}
	}

	protected void renderColDaysNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getColDaysNode() != null) {
			renrederedAttributes.add(renderString("colDaysNode", schedulerWeekView.getColDaysNode()));
		}
	}

	protected void renderColHeaderDaysNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getColHeaderDaysNode() != null) {
			renrederedAttributes.add(renderString("colHeaderDaysNode", schedulerWeekView.getColHeaderDaysNode()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", schedulerWeekView.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", schedulerWeekView.getCssClass()));
		}
	}

	protected void renderDays(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getDays() != null) {
			renrederedAttributes.add(renderNumber("days", schedulerWeekView.getDays()));
		}
	}

	protected void renderDelegateConfig(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getDelegateConfig() != null) {
			renrederedAttributes.add(renderObject("delegateConfig", schedulerWeekView.getDelegateConfig()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", schedulerWeekView.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", schedulerWeekView.getDisabled()));
		}
	}

	protected void renderEventWidth(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getEventWidth() != null) {
			renrederedAttributes.add(renderNumber("eventWidth", schedulerWeekView.getEventWidth()));
		}
	}

	protected void renderFilterFn(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getFilterFn() != null) {
			renrederedAttributes.add(renderString("filterFn", schedulerWeekView.getFilterFn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", schedulerWeekView.getFocused()));
		}
	}

	protected void renderHeaderDateFormatter(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getHeaderDateFormatter() != null) {
			renrederedAttributes.add(renderString("headerDateFormatter", schedulerWeekView.getHeaderDateFormatter()));
		}
	}

	protected void renderHeaderTableNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getHeaderTableNode() != null) {
			renrederedAttributes.add(renderString("headerTableNode", schedulerWeekView.getHeaderTableNode()));
		}
	}

	protected void renderHeaderView(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getHeaderView() != null) {
			renrederedAttributes.add(renderBoolean("headerView", schedulerWeekView.getHeaderView()));
		}
	}

	protected void renderHeaderViewConfig(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getHeaderViewConfig() != null) {
			renrederedAttributes.add(renderString("headerViewConfig", schedulerWeekView.getHeaderViewConfig()));
		}
	}

	protected void renderHeaderViewLabelNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getHeaderViewLabelNode() != null) {
			renrederedAttributes.add(renderString("headerViewLabelNode", schedulerWeekView.getHeaderViewLabelNode()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", schedulerWeekView.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", schedulerWeekView.getHideClass()));
		}
	}

	protected void renderHourHeight(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getHourHeight() != null) {
			renrederedAttributes.add(renderNumber("hourHeight", schedulerWeekView.getHourHeight()));
		}
	}

	protected void renderSchedulerweekviewId(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getSchedulerweekviewId() != null) {
			renrederedAttributes.add(renderString("schedulerweekviewId", schedulerWeekView.getSchedulerweekviewId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", schedulerWeekView.getInitialized()));
		}
	}

	protected void renderIsoTime(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getIsoTime() != null) {
			renrederedAttributes.add(renderBoolean("isoTime", schedulerWeekView.getIsoTime()));
		}
	}

	protected void renderSchedulerweekviewLocale(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getSchedulerweekviewLocale() != null) {
			renrederedAttributes.add(renderString("schedulerweekviewLocale", schedulerWeekView.getSchedulerweekviewLocale()));
		}
	}

	protected void renderMarkercellsNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getMarkercellsNode() != null) {
			renrederedAttributes.add(renderString("markercellsNode", schedulerWeekView.getMarkercellsNode()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getName() != null) {
			renrederedAttributes.add(renderString("name", schedulerWeekView.getName()));
		}
	}

	protected void renderNavigationDateFormatter(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getNavigationDateFormatter() != null) {
			renrederedAttributes.add(renderString("navigationDateFormatter", schedulerWeekView.getNavigationDateFormatter()));
		}
	}

	protected void renderNextDate(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getNextDate() != null) {
			renrederedAttributes.add(renderString("nextDate", schedulerWeekView.getNextDate()));
		}
	}

	protected void renderPrevDate(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getPrevDate() != null) {
			renrederedAttributes.add(renderString("prevDate", schedulerWeekView.getPrevDate()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getRender() != null) {
			renrederedAttributes.add(renderString("render", schedulerWeekView.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", schedulerWeekView.getRendered()));
		}
	}

	protected void renderResizerNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getResizerNode() != null) {
			renrederedAttributes.add(renderString("resizerNode", schedulerWeekView.getResizerNode()));
		}
	}

	protected void renderScheduler(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getScheduler() != null) {
			renrederedAttributes.add(renderString("scheduler", schedulerWeekView.getScheduler()));
		}
	}

	protected void renderScrollable(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getScrollable() != null) {
			renrederedAttributes.add(renderBoolean("scrollable", schedulerWeekView.getScrollable()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", schedulerWeekView.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getStrings() != null) {
			renrederedAttributes.add(renderString("strings", schedulerWeekView.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", schedulerWeekView.getTabIndex()));
		}
	}

	protected void renderTableNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getTableNode() != null) {
			renrederedAttributes.add(renderString("tableNode", schedulerWeekView.getTableNode()));
		}
	}

	protected void renderTimesNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getTimesNode() != null) {
			renrederedAttributes.add(renderString("timesNode", schedulerWeekView.getTimesNode()));
		}
	}

	protected void renderTriggerNode(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getTriggerNode() != null) {
			renrederedAttributes.add(renderString("triggerNode", schedulerWeekView.getTriggerNode()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", schedulerWeekView.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", schedulerWeekView.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, SchedulerWeekView schedulerWeekView) throws IOException {
		if (schedulerWeekView.getWidth() != null) {
			renrederedAttributes.add(renderString("width", schedulerWeekView.getWidth()));
		}
	}

}