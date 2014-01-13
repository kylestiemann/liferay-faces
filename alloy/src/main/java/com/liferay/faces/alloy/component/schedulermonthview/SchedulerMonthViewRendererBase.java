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
public abstract class SchedulerMonthViewRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		SchedulerMonthView schedulerMonthView = (SchedulerMonthView) uiComponent;
		encodeHTML(facesContext, schedulerMonthView);
		encodeJavaScript(facesContext, schedulerMonthView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerMonthView schedulerMonthView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerMonthView schedulerMonthView) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", schedulerMonthView);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-schedulermonthview',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var schedulerMonthView = new Y.SchedulerMonthView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(schedulerMonthView.getSchedulermonthviewBodyContent() != null)
		{

			responseWriter.write("schedulermonthviewBodyContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getSchedulermonthviewBodyContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getColHeaderDaysNode() != null)
		{

			responseWriter.write("colHeaderDaysNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getColHeaderDaysNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getCssClass() != null)
		{

			responseWriter.write("cssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getDisplayDaysInterval() != null)
		{

			responseWriter.write("displayDaysInterval: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getDisplayDaysInterval().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getDisplayRows() != null)
		{

			responseWriter.write("displayRows: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getDisplayRows().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getFilterFn() != null)
		{

			responseWriter.write("filterFn: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getFilterFn().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getFixedHeight() != null)
		{

			responseWriter.write("fixedHeight: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getFixedHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getHeaderDateFormatter() != null)
		{

			responseWriter.write("headerDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getHeaderDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getHeaderTableNode() != null)
		{

			responseWriter.write("headerTableNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getHeaderTableNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getHeight() != null)
		{

			responseWriter.write("height: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getHideClass() != null)
		{

			responseWriter.write("hideClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getHideClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getIsoTime() != null)
		{

			responseWriter.write("isoTime: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getIsoTime().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getNavigationDateFormatter() != null)
		{

			responseWriter.write("navigationDateFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getNavigationDateFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getNextDate() != null)
		{

			responseWriter.write("nextDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getNextDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getPrevDate() != null)
		{

			responseWriter.write("prevDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getPrevDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getRowsContainerNode() != null)
		{

			responseWriter.write("rowsContainerNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getRowsContainerNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getScheduler() != null)
		{

			responseWriter.write("scheduler: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getScheduler().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getScrollable() != null)
		{

			responseWriter.write("scrollable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getScrollable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getTableGridNode() != null)
		{

			responseWriter.write("tableGridNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getTableGridNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getTriggerNode() != null)
		{

			responseWriter.write("triggerNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getTriggerNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getUseARIA() != null)
		{

			responseWriter.write("useARIA: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getUseARIA().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerMonthView.getVisible().toString());
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