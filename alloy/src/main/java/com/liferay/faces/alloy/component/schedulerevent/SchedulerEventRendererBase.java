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
package com.liferay.faces.alloy.component.schedulerevent;

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
public abstract class SchedulerEventRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		SchedulerEvent schedulerEvent = (SchedulerEvent) uiComponent;
		encodeHTML(facesContext, schedulerEvent);
		encodeJavaScript(facesContext, schedulerEvent);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SchedulerEvent schedulerEvent) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SchedulerEvent schedulerEvent) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", schedulerEvent);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-schedulerevent',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var schedulerEvent = new Y.SchedulerEvent");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(schedulerEvent.getAllDay() != null)
		{

			responseWriter.write("allDay: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getAllDay().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getColor() != null)
		{

			responseWriter.write("color: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getColor().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getColorBrightnessFactor() != null)
		{

			responseWriter.write("colorBrightnessFactor: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getColorBrightnessFactor().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getColorSaturationFactor() != null)
		{

			responseWriter.write("colorSaturationFactor: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getColorSaturationFactor().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getContent() != null)
		{

			responseWriter.write("content: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getEndDate() != null)
		{

			responseWriter.write("endDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getEndDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getMeeting() != null)
		{

			responseWriter.write("meeting: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getMeeting().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getNode() != null)
		{

			responseWriter.write("node: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getReminder() != null)
		{

			responseWriter.write("reminder: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getReminder().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getRepeated() != null)
		{

			responseWriter.write("repeated: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getRepeated().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getScheduler() != null)
		{

			responseWriter.write("scheduler: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getScheduler().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getStartDate() != null)
		{

			responseWriter.write("startDate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getStartDate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getTitleDateFormat() != null)
		{

			responseWriter.write("titleDateFormat: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getTitleDateFormat().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(schedulerEvent.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(schedulerEvent.getVisible().toString());
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