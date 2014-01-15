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
package com.liferay.faces.alloy.component.schedulermonthview;

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
public abstract class SchedulerMonthViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-month";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SchedulerMonthView schedulerMonthView = (SchedulerMonthView) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var schedulerMonthView = new A.SchedulerMonthView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderSchedulermonthviewBodyContent(renrederedAttributes, schedulerMonthView);
		renderBoundingBox(renrederedAttributes, schedulerMonthView);
		renderColHeaderDaysNode(renrederedAttributes, schedulerMonthView);
		renderContentBox(renrederedAttributes, schedulerMonthView);
		renderCssClass(renrederedAttributes, schedulerMonthView);
		renderDestroyed(renrederedAttributes, schedulerMonthView);
		renderDisabled(renrederedAttributes, schedulerMonthView);
		renderDisplayDaysInterval(renrederedAttributes, schedulerMonthView);
		renderDisplayRows(renrederedAttributes, schedulerMonthView);
		renderFilterFn(renrederedAttributes, schedulerMonthView);
		renderFixedHeight(renrederedAttributes, schedulerMonthView);
		renderFocused(renrederedAttributes, schedulerMonthView);
		renderHeaderDateFormatter(renrederedAttributes, schedulerMonthView);
		renderHeaderTableNode(renrederedAttributes, schedulerMonthView);
		renderHeight(renrederedAttributes, schedulerMonthView);
		renderHideClass(renrederedAttributes, schedulerMonthView);
		renderSchedulermonthviewId(renrederedAttributes, schedulerMonthView);
		renderInitialized(renrederedAttributes, schedulerMonthView);
		renderIsoTime(renrederedAttributes, schedulerMonthView);
		renderSchedulermonthviewLocale(renrederedAttributes, schedulerMonthView);
		renderName(renrederedAttributes, schedulerMonthView);
		renderNavigationDateFormatter(renrederedAttributes, schedulerMonthView);
		renderNextDate(renrederedAttributes, schedulerMonthView);
		renderPrevDate(renrederedAttributes, schedulerMonthView);
		renderRender(renrederedAttributes, schedulerMonthView);
		renderRendered(renrederedAttributes, schedulerMonthView);
		renderRowsContainerNode(renrederedAttributes, schedulerMonthView);
		renderScheduler(renrederedAttributes, schedulerMonthView);
		renderScrollable(renrederedAttributes, schedulerMonthView);
		renderSrcNode(renrederedAttributes, schedulerMonthView);
		renderStrings(renrederedAttributes, schedulerMonthView);
		renderTabIndex(renrederedAttributes, schedulerMonthView);
		renderTableGridNode(renrederedAttributes, schedulerMonthView);
		renderTriggerNode(renrederedAttributes, schedulerMonthView);
		renderUseARIA(renrederedAttributes, schedulerMonthView);
		renderVisible(renrederedAttributes, schedulerMonthView);
		renderWidth(renrederedAttributes, schedulerMonthView);

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

	protected void renderSchedulermonthviewBodyContent(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getSchedulermonthviewBodyContent() != null) {
			renrederedAttributes.add(renderString("schedulermonthviewBodyContent", schedulerMonthView.getSchedulermonthviewBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", schedulerMonthView.getBoundingBox()));
		}
	}

	protected void renderColHeaderDaysNode(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getColHeaderDaysNode() != null) {
			renrederedAttributes.add(renderString("colHeaderDaysNode", schedulerMonthView.getColHeaderDaysNode()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", schedulerMonthView.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", schedulerMonthView.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", schedulerMonthView.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", schedulerMonthView.getDisabled()));
		}
	}

	protected void renderDisplayDaysInterval(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getDisplayDaysInterval() != null) {
			renrederedAttributes.add(renderNumber("displayDaysInterval", schedulerMonthView.getDisplayDaysInterval()));
		}
	}

	protected void renderDisplayRows(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getDisplayRows() != null) {
			renrederedAttributes.add(renderNumber("displayRows", schedulerMonthView.getDisplayRows()));
		}
	}

	protected void renderFilterFn(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getFilterFn() != null) {
			renrederedAttributes.add(renderString("filterFn", schedulerMonthView.getFilterFn()));
		}
	}

	protected void renderFixedHeight(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getFixedHeight() != null) {
			renrederedAttributes.add(renderBoolean("fixedHeight", schedulerMonthView.getFixedHeight()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", schedulerMonthView.getFocused()));
		}
	}

	protected void renderHeaderDateFormatter(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getHeaderDateFormatter() != null) {
			renrederedAttributes.add(renderString("headerDateFormatter", schedulerMonthView.getHeaderDateFormatter()));
		}
	}

	protected void renderHeaderTableNode(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getHeaderTableNode() != null) {
			renrederedAttributes.add(renderString("headerTableNode", schedulerMonthView.getHeaderTableNode()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", schedulerMonthView.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", schedulerMonthView.getHideClass()));
		}
	}

	protected void renderSchedulermonthviewId(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getSchedulermonthviewId() != null) {
			renrederedAttributes.add(renderString("schedulermonthviewId", schedulerMonthView.getSchedulermonthviewId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", schedulerMonthView.getInitialized()));
		}
	}

	protected void renderIsoTime(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getIsoTime() != null) {
			renrederedAttributes.add(renderBoolean("isoTime", schedulerMonthView.getIsoTime()));
		}
	}

	protected void renderSchedulermonthviewLocale(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getSchedulermonthviewLocale() != null) {
			renrederedAttributes.add(renderString("schedulermonthviewLocale", schedulerMonthView.getSchedulermonthviewLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getName() != null) {
			renrederedAttributes.add(renderString("name", schedulerMonthView.getName()));
		}
	}

	protected void renderNavigationDateFormatter(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getNavigationDateFormatter() != null) {
			renrederedAttributes.add(renderString("navigationDateFormatter", schedulerMonthView.getNavigationDateFormatter()));
		}
	}

	protected void renderNextDate(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getNextDate() != null) {
			renrederedAttributes.add(renderString("nextDate", schedulerMonthView.getNextDate()));
		}
	}

	protected void renderPrevDate(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getPrevDate() != null) {
			renrederedAttributes.add(renderString("prevDate", schedulerMonthView.getPrevDate()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getRender() != null) {
			renrederedAttributes.add(renderString("render", schedulerMonthView.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", schedulerMonthView.getRendered()));
		}
	}

	protected void renderRowsContainerNode(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getRowsContainerNode() != null) {
			renrederedAttributes.add(renderString("rowsContainerNode", schedulerMonthView.getRowsContainerNode()));
		}
	}

	protected void renderScheduler(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getScheduler() != null) {
			renrederedAttributes.add(renderString("scheduler", schedulerMonthView.getScheduler()));
		}
	}

	protected void renderScrollable(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getScrollable() != null) {
			renrederedAttributes.add(renderBoolean("scrollable", schedulerMonthView.getScrollable()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", schedulerMonthView.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getStrings() != null) {
			renrederedAttributes.add(renderString("strings", schedulerMonthView.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", schedulerMonthView.getTabIndex()));
		}
	}

	protected void renderTableGridNode(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getTableGridNode() != null) {
			renrederedAttributes.add(renderString("tableGridNode", schedulerMonthView.getTableGridNode()));
		}
	}

	protected void renderTriggerNode(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getTriggerNode() != null) {
			renrederedAttributes.add(renderString("triggerNode", schedulerMonthView.getTriggerNode()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", schedulerMonthView.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", schedulerMonthView.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, SchedulerMonthView schedulerMonthView) throws IOException {
		if (schedulerMonthView.getWidth() != null) {
			renrederedAttributes.add(renderString("width", schedulerMonthView.getWidth()));
		}
	}

}