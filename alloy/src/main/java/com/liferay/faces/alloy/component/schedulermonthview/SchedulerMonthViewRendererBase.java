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
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class SchedulerMonthViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String  AUI_SCHEDULER_VIEW_MONTH = "aui-scheduler-view-month";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		SchedulerMonthView schedulerMonthView = (SchedulerMonthView) uiComponent;
		encodeHTML(facesContext, schedulerMonthView);
		encodeJavaScript(facesContext, schedulerMonthView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerMonthView schedulerMonthView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerMonthView schedulerMonthView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, schedulerMonthView, AUI_SCHEDULER_VIEW_MONTH);

		bufferedResponseWriter.write("var schedulerMonthView = new Y.SchedulerMonthView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);

		if(schedulerMonthView.getSchedulermonthviewBodyContent() != null)
		{

			bufferedResponseWriter.write("schedulermonthviewBodyContent: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getSchedulermonthviewBodyContent().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getColHeaderDaysNode() != null)
		{

			bufferedResponseWriter.write("colHeaderDaysNode: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getColHeaderDaysNode().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getCssClass() != null)
		{

			bufferedResponseWriter.write("cssClass: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getCssClass().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getDisplayDaysInterval() != null)
		{

			bufferedResponseWriter.write("displayDaysInterval: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getDisplayDaysInterval().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getDisplayRows() != null)
		{

			bufferedResponseWriter.write("displayRows: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getDisplayRows().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getFilterFn() != null)
		{

			bufferedResponseWriter.write("filterFn: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getFilterFn().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getFixedHeight() != null)
		{

			bufferedResponseWriter.write("fixedHeight: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getFixedHeight().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getHeaderDateFormatter() != null)
		{

			bufferedResponseWriter.write("headerDateFormatter: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getHeaderDateFormatter().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getHeaderTableNode() != null)
		{

			bufferedResponseWriter.write("headerTableNode: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getHeaderTableNode().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getHeight() != null)
		{

			bufferedResponseWriter.write("height: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getHeight().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getHideClass() != null)
		{

			bufferedResponseWriter.write("hideClass: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getHideClass().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getIsoTime() != null)
		{

			bufferedResponseWriter.write("isoTime: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getIsoTime().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getName() != null)
		{

			bufferedResponseWriter.write("name: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getName().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getNavigationDateFormatter() != null)
		{

			bufferedResponseWriter.write("navigationDateFormatter: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getNavigationDateFormatter().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getNextDate() != null)
		{

			bufferedResponseWriter.write("nextDate: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getNextDate().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getPrevDate() != null)
		{

			bufferedResponseWriter.write("prevDate: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getPrevDate().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getRender() != null)
		{

			bufferedResponseWriter.write("render: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getRender().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getRowsContainerNode() != null)
		{

			bufferedResponseWriter.write("rowsContainerNode: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getRowsContainerNode().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getScheduler() != null)
		{

			bufferedResponseWriter.write("scheduler: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getScheduler().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getScrollable() != null)
		{

			bufferedResponseWriter.write("scrollable: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getScrollable().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getStrings() != null)
		{

			bufferedResponseWriter.write("strings: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getStrings().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getTableGridNode() != null)
		{

			bufferedResponseWriter.write("tableGridNode: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getTableGridNode().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getTriggerNode() != null)
		{

			bufferedResponseWriter.write("triggerNode: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getTriggerNode().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getUseARIA() != null)
		{

			bufferedResponseWriter.write("useARIA: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getUseARIA().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerMonthView.getVisible() != null)
		{

			bufferedResponseWriter.write("visible: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(schedulerMonthView.getVisible().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);
		
		endJavaScript(facesContext);
		
		handleBuffer(facesContext, schedulerMonthView, AUI_SCHEDULER_VIEW_MONTH);
		
		facesContext.setResponseWriter(backupResponseWriter);
	}

}