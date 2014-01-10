/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class SchedulerAgendaViewRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		SchedulerAgendaView schedulerAgendaView = (SchedulerAgendaView) uiComponent;
		encodeHTML(facesContext, schedulerAgendaView);
		encodeJavaScript(facesContext, schedulerAgendaView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerAgendaView schedulerAgendaView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerAgendaView schedulerAgendaView) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", schedulerAgendaView);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-scheduleragendaview',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var schedulerAgendaView = new Y.SchedulerAgendaView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(schedulerAgendaView.getScheduleragendaviewBodyContent() != null)
		{

			responseWriter.write("scheduleragendaviewBodyContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getScheduleragendaviewBodyContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getCssClass() != null)
		{

			responseWriter.write("cssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getEventsDateFormatter() != null)
		{

			responseWriter.write("eventsDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getEventsDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getFilterFn() != null)
		{

			responseWriter.write("filterFn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getFilterFn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getHeaderDayDateFormatter() != null)
		{

			responseWriter.write("headerDayDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getHeaderDayDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getHeaderExtraDateFormatter() != null)
		{

			responseWriter.write("headerExtraDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getHeaderExtraDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getHeight() != null)
		{

			responseWriter.write("height: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getHideClass() != null)
		{

			responseWriter.write("hideClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getHideClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getInfoDayDateFormatter() != null)
		{

			responseWriter.write("infoDayDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getInfoDayDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getInfoLabelBigDateFormatter() != null)
		{

			responseWriter.write("infoLabelBigDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getInfoLabelBigDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getInfoLabelSmallDateFormatter() != null)
		{

			responseWriter.write("infoLabelSmallDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getInfoLabelSmallDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getIsoTime() != null)
		{

			responseWriter.write("isoTime: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getIsoTime().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getNavigationDateFormatter() != null)
		{

			responseWriter.write("navigationDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getNavigationDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getNextDate() != null)
		{

			responseWriter.write("nextDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getNextDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getPrevDate() != null)
		{

			responseWriter.write("prevDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getPrevDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getScheduler() != null)
		{

			responseWriter.write("scheduler: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getScheduler().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getScrollable() != null)
		{

			responseWriter.write("scrollable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getScrollable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getTriggerNode() != null)
		{

			responseWriter.write("triggerNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getTriggerNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getUseARIA() != null)
		{

			responseWriter.write("useARIA: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getUseARIA().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerAgendaView.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerAgendaView.getVisible().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_CLOSE);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.endElement("script");
		responseWriter.write(StringPool.NEW_LINE);
	}

}