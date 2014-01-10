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
package com.liferay.faces.alloy.component.schedulerweekview;

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
public abstract class SchedulerWeekViewRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		SchedulerWeekView schedulerWeekView = (SchedulerWeekView) uiComponent;
		encodeHTML(facesContext, schedulerWeekView);
		encodeJavaScript(facesContext, schedulerWeekView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerWeekView schedulerWeekView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerWeekView schedulerWeekView) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", schedulerWeekView);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-schedulerweekview',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var schedulerWeekView = new Y.SchedulerWeekView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(schedulerWeekView.getSchedulerweekviewBodyContent() != null)
		{

			responseWriter.write("schedulerweekviewBodyContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getSchedulerweekviewBodyContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getColDaysNode() != null)
		{

			responseWriter.write("colDaysNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getColDaysNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getColHeaderDaysNode() != null)
		{

			responseWriter.write("colHeaderDaysNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getColHeaderDaysNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getCssClass() != null)
		{

			responseWriter.write("cssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getDays() != null)
		{

			responseWriter.write("days: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getDays().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getDelegateConfig() != null)
		{

			responseWriter.write("delegateConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getDelegateConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getEventWidth() != null)
		{

			responseWriter.write("eventWidth: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getEventWidth().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getFilterFn() != null)
		{

			responseWriter.write("filterFn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getFilterFn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getHeaderDateFormatter() != null)
		{

			responseWriter.write("headerDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getHeaderDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getHeaderTableNode() != null)
		{

			responseWriter.write("headerTableNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getHeaderTableNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getHeaderView() != null)
		{

			responseWriter.write("headerView: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getHeaderView().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getHeaderViewConfig() != null)
		{

			responseWriter.write("headerViewConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getHeaderViewConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getHeaderViewLabelNode() != null)
		{

			responseWriter.write("headerViewLabelNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getHeaderViewLabelNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getHeight() != null)
		{

			responseWriter.write("height: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getHideClass() != null)
		{

			responseWriter.write("hideClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getHideClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getHourHeight() != null)
		{

			responseWriter.write("hourHeight: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getHourHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getIsoTime() != null)
		{

			responseWriter.write("isoTime: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getIsoTime().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getMarkercellsNode() != null)
		{

			responseWriter.write("markercellsNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getMarkercellsNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getNavigationDateFormatter() != null)
		{

			responseWriter.write("navigationDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getNavigationDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getNextDate() != null)
		{

			responseWriter.write("nextDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getNextDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getPrevDate() != null)
		{

			responseWriter.write("prevDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getPrevDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getResizerNode() != null)
		{

			responseWriter.write("resizerNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getResizerNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getScheduler() != null)
		{

			responseWriter.write("scheduler: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getScheduler().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getScrollable() != null)
		{

			responseWriter.write("scrollable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getScrollable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getTableNode() != null)
		{

			responseWriter.write("tableNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getTableNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getTimesNode() != null)
		{

			responseWriter.write("timesNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getTimesNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getTriggerNode() != null)
		{

			responseWriter.write("triggerNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getTriggerNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getUseARIA() != null)
		{

			responseWriter.write("useARIA: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getUseARIA().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerWeekView.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerWeekView.getVisible().toString());
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