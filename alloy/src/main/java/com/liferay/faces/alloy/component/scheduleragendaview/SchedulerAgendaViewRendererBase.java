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
public abstract class SchedulerAgendaViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-agenda";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SchedulerAgendaView schedulerAgendaView = (SchedulerAgendaView) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var schedulerAgendaView = new A.SchedulerAgendaView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderScheduleragendaviewBodyContent(renrederedAttributes, schedulerAgendaView);
		renderBoundingBox(renrederedAttributes, schedulerAgendaView);
		renderContentBox(renrederedAttributes, schedulerAgendaView);
		renderCssClass(renrederedAttributes, schedulerAgendaView);
		renderDestroyed(renrederedAttributes, schedulerAgendaView);
		renderDisabled(renrederedAttributes, schedulerAgendaView);
		renderEventsDateFormatter(renrederedAttributes, schedulerAgendaView);
		renderFilterFn(renrederedAttributes, schedulerAgendaView);
		renderFocused(renrederedAttributes, schedulerAgendaView);
		renderHeaderDayDateFormatter(renrederedAttributes, schedulerAgendaView);
		renderHeaderExtraDateFormatter(renrederedAttributes, schedulerAgendaView);
		renderHeight(renrederedAttributes, schedulerAgendaView);
		renderHideClass(renrederedAttributes, schedulerAgendaView);
		renderScheduleragendaviewId(renrederedAttributes, schedulerAgendaView);
		renderInfoDayDateFormatter(renrederedAttributes, schedulerAgendaView);
		renderInfoLabelBigDateFormatter(renrederedAttributes, schedulerAgendaView);
		renderInfoLabelSmallDateFormatter(renrederedAttributes, schedulerAgendaView);
		renderInitialized(renrederedAttributes, schedulerAgendaView);
		renderIsoTime(renrederedAttributes, schedulerAgendaView);
		renderScheduleragendaviewLocale(renrederedAttributes, schedulerAgendaView);
		renderName(renrederedAttributes, schedulerAgendaView);
		renderNavigationDateFormatter(renrederedAttributes, schedulerAgendaView);
		renderNextDate(renrederedAttributes, schedulerAgendaView);
		renderPrevDate(renrederedAttributes, schedulerAgendaView);
		renderRender(renrederedAttributes, schedulerAgendaView);
		renderRendered(renrederedAttributes, schedulerAgendaView);
		renderScheduler(renrederedAttributes, schedulerAgendaView);
		renderScrollable(renrederedAttributes, schedulerAgendaView);
		renderSrcNode(renrederedAttributes, schedulerAgendaView);
		renderStrings(renrederedAttributes, schedulerAgendaView);
		renderTabIndex(renrederedAttributes, schedulerAgendaView);
		renderTriggerNode(renrederedAttributes, schedulerAgendaView);
		renderUseARIA(renrederedAttributes, schedulerAgendaView);
		renderVisible(renrederedAttributes, schedulerAgendaView);
		renderWidth(renrederedAttributes, schedulerAgendaView);

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

	protected void renderScheduleragendaviewBodyContent(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getScheduleragendaviewBodyContent() != null) {
			renrederedAttributes.add(renderString("scheduleragendaviewBodyContent", schedulerAgendaView.getScheduleragendaviewBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", schedulerAgendaView.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", schedulerAgendaView.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", schedulerAgendaView.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", schedulerAgendaView.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", schedulerAgendaView.getDisabled()));
		}
	}

	protected void renderEventsDateFormatter(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getEventsDateFormatter() != null) {
			renrederedAttributes.add(renderString("eventsDateFormatter", schedulerAgendaView.getEventsDateFormatter()));
		}
	}

	protected void renderFilterFn(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getFilterFn() != null) {
			renrederedAttributes.add(renderString("filterFn", schedulerAgendaView.getFilterFn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", schedulerAgendaView.getFocused()));
		}
	}

	protected void renderHeaderDayDateFormatter(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getHeaderDayDateFormatter() != null) {
			renrederedAttributes.add(renderString("headerDayDateFormatter", schedulerAgendaView.getHeaderDayDateFormatter()));
		}
	}

	protected void renderHeaderExtraDateFormatter(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getHeaderExtraDateFormatter() != null) {
			renrederedAttributes.add(renderString("headerExtraDateFormatter", schedulerAgendaView.getHeaderExtraDateFormatter()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getHeight() != null) {
			renrederedAttributes.add(renderNumber("height", schedulerAgendaView.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", schedulerAgendaView.getHideClass()));
		}
	}

	protected void renderScheduleragendaviewId(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getScheduleragendaviewId() != null) {
			renrederedAttributes.add(renderString("scheduleragendaviewId", schedulerAgendaView.getScheduleragendaviewId()));
		}
	}

	protected void renderInfoDayDateFormatter(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getInfoDayDateFormatter() != null) {
			renrederedAttributes.add(renderString("infoDayDateFormatter", schedulerAgendaView.getInfoDayDateFormatter()));
		}
	}

	protected void renderInfoLabelBigDateFormatter(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getInfoLabelBigDateFormatter() != null) {
			renrederedAttributes.add(renderString("infoLabelBigDateFormatter", schedulerAgendaView.getInfoLabelBigDateFormatter()));
		}
	}

	protected void renderInfoLabelSmallDateFormatter(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getInfoLabelSmallDateFormatter() != null) {
			renrederedAttributes.add(renderString("infoLabelSmallDateFormatter", schedulerAgendaView.getInfoLabelSmallDateFormatter()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", schedulerAgendaView.getInitialized()));
		}
	}

	protected void renderIsoTime(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getIsoTime() != null) {
			renrederedAttributes.add(renderBoolean("isoTime", schedulerAgendaView.getIsoTime()));
		}
	}

	protected void renderScheduleragendaviewLocale(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getScheduleragendaviewLocale() != null) {
			renrederedAttributes.add(renderString("scheduleragendaviewLocale", schedulerAgendaView.getScheduleragendaviewLocale()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getName() != null) {
			renrederedAttributes.add(renderString("name", schedulerAgendaView.getName()));
		}
	}

	protected void renderNavigationDateFormatter(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getNavigationDateFormatter() != null) {
			renrederedAttributes.add(renderString("navigationDateFormatter", schedulerAgendaView.getNavigationDateFormatter()));
		}
	}

	protected void renderNextDate(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getNextDate() != null) {
			renrederedAttributes.add(renderString("nextDate", schedulerAgendaView.getNextDate()));
		}
	}

	protected void renderPrevDate(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getPrevDate() != null) {
			renrederedAttributes.add(renderString("prevDate", schedulerAgendaView.getPrevDate()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getRender() != null) {
			renrederedAttributes.add(renderString("render", schedulerAgendaView.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", schedulerAgendaView.getRendered()));
		}
	}

	protected void renderScheduler(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getScheduler() != null) {
			renrederedAttributes.add(renderString("scheduler", schedulerAgendaView.getScheduler()));
		}
	}

	protected void renderScrollable(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getScrollable() != null) {
			renrederedAttributes.add(renderBoolean("scrollable", schedulerAgendaView.getScrollable()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", schedulerAgendaView.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getStrings() != null) {
			renrederedAttributes.add(renderString("strings", schedulerAgendaView.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", schedulerAgendaView.getTabIndex()));
		}
	}

	protected void renderTriggerNode(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getTriggerNode() != null) {
			renrederedAttributes.add(renderString("triggerNode", schedulerAgendaView.getTriggerNode()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", schedulerAgendaView.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", schedulerAgendaView.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, SchedulerAgendaView schedulerAgendaView) throws IOException {
		if (schedulerAgendaView.getWidth() != null) {
			renrederedAttributes.add(renderString("width", schedulerAgendaView.getWidth()));
		}
	}

}