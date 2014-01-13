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
package com.liferay.faces.alloy.component.schedulereventrecorder;

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
public abstract class SchedulerEventRecorderRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		SchedulerEventRecorder schedulerEventRecorder = (SchedulerEventRecorder) uiComponent;
		encodeHTML(facesContext, schedulerEventRecorder);
		encodeJavaScript(facesContext, schedulerEventRecorder);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerEventRecorder schedulerEventRecorder) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerEventRecorder schedulerEventRecorder) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", schedulerEventRecorder);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-schedulereventrecorder',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var schedulerEventRecorder = new Y.SchedulerEventRecorder");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(schedulerEventRecorder.getAllDay() != null)
		{

			responseWriter.write("allDay: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getAllDay().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getColor() != null)
		{

			responseWriter.write("color: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getColor().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getColorBrightnessFactor() != null)
		{

			responseWriter.write("colorBrightnessFactor: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getColorBrightnessFactor().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getColorSaturationFactor() != null)
		{

			responseWriter.write("colorSaturationFactor: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getColorSaturationFactor().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getContent() != null)
		{

			responseWriter.write("content: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getDateFormat() != null)
		{

			responseWriter.write("dateFormat: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getDateFormat().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getDuration() != null)
		{

			responseWriter.write("duration: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getDuration().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getEndDate() != null)
		{

			responseWriter.write("endDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getEndDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getEvent() != null)
		{

			responseWriter.write("event: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getEvent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getEventClass() != null)
		{

			responseWriter.write("eventClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getEventClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getMeeting() != null)
		{

			responseWriter.write("meeting: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getMeeting().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getNode() != null)
		{

			responseWriter.write("node: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getPopover() != null)
		{

			responseWriter.write("popover: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getPopover().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getReminder() != null)
		{

			responseWriter.write("reminder: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getReminder().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getRepeated() != null)
		{

			responseWriter.write("repeated: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getRepeated().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getScheduler() != null)
		{

			responseWriter.write("scheduler: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getScheduler().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getStartDate() != null)
		{

			responseWriter.write("startDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getStartDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getTemplate() != null)
		{

			responseWriter.write("template: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getTemplate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getTitleDateFormat() != null)
		{

			responseWriter.write("titleDateFormat: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getTitleDateFormat().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEventRecorder.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEventRecorder.getVisible().toString());
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