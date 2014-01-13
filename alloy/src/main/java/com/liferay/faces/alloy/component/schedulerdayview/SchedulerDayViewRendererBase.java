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
public abstract class SchedulerDayViewRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		SchedulerDayView schedulerDayView = (SchedulerDayView) uiComponent;
		encodeHTML(facesContext, schedulerDayView);
		encodeJavaScript(facesContext, schedulerDayView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerDayView schedulerDayView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerDayView schedulerDayView) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", schedulerDayView);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-schedulerdayview',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var schedulerDayView = new Y.SchedulerDayView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(schedulerDayView.getSchedulerdayviewBodyContent() != null)
		{

			responseWriter.write("schedulerdayviewBodyContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getSchedulerdayviewBodyContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getColDaysNode() != null)
		{

			responseWriter.write("colDaysNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getColDaysNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getColHeaderDaysNode() != null)
		{

			responseWriter.write("colHeaderDaysNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getColHeaderDaysNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getCssClass() != null)
		{

			responseWriter.write("cssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getDays() != null)
		{

			responseWriter.write("days: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getDays().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getDelegateConfig() != null)
		{

			responseWriter.write("delegateConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getDelegateConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getEventWidth() != null)
		{

			responseWriter.write("eventWidth: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getEventWidth().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getFilterFn() != null)
		{

			responseWriter.write("filterFn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getFilterFn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getHeaderDateFormatter() != null)
		{

			responseWriter.write("headerDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getHeaderDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getHeaderTableNode() != null)
		{

			responseWriter.write("headerTableNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getHeaderTableNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getHeaderView() != null)
		{

			responseWriter.write("headerView: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getHeaderView().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getHeaderViewConfig() != null)
		{

			responseWriter.write("headerViewConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getHeaderViewConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getHeaderViewLabelNode() != null)
		{

			responseWriter.write("headerViewLabelNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getHeaderViewLabelNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getHeight() != null)
		{

			responseWriter.write("height: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getHideClass() != null)
		{

			responseWriter.write("hideClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getHideClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getHourHeight() != null)
		{

			responseWriter.write("hourHeight: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getHourHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getIsoTime() != null)
		{

			responseWriter.write("isoTime: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getIsoTime().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getMarkercellsNode() != null)
		{

			responseWriter.write("markercellsNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getMarkercellsNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getNavigationDateFormatter() != null)
		{

			responseWriter.write("navigationDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getNavigationDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getNextDate() != null)
		{

			responseWriter.write("nextDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getNextDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getPrevDate() != null)
		{

			responseWriter.write("prevDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getPrevDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getResizerNode() != null)
		{

			responseWriter.write("resizerNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getResizerNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getScheduler() != null)
		{

			responseWriter.write("scheduler: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getScheduler().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getScrollable() != null)
		{

			responseWriter.write("scrollable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getScrollable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getTableNode() != null)
		{

			responseWriter.write("tableNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getTableNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getTimesNode() != null)
		{

			responseWriter.write("timesNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getTimesNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getTriggerNode() != null)
		{

			responseWriter.write("triggerNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getTriggerNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getUseARIA() != null)
		{

			responseWriter.write("useARIA: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getUseARIA().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerDayView.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerDayView.getVisible().toString());
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