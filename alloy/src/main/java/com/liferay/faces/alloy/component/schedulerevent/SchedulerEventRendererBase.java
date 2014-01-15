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
package com.liferay.faces.alloy.component.schedulerevent;

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
public abstract class SchedulerEventRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-base-event";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SchedulerEvent schedulerEvent = (SchedulerEvent) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var schedulerEvent = new A.SchedulerEvent");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAllDay(renrederedAttributes, schedulerEvent);
		renderSchedulereventClientId(renrederedAttributes, schedulerEvent);
		renderColor(renrederedAttributes, schedulerEvent);
		renderColorBrightnessFactor(renrederedAttributes, schedulerEvent);
		renderColorSaturationFactor(renrederedAttributes, schedulerEvent);
		renderContent(renrederedAttributes, schedulerEvent);
		renderDestroyed(renrederedAttributes, schedulerEvent);
		renderDisabled(renrederedAttributes, schedulerEvent);
		renderEndDate(renrederedAttributes, schedulerEvent);
		renderSchedulereventId(renrederedAttributes, schedulerEvent);
		renderInitialized(renrederedAttributes, schedulerEvent);
		renderMeeting(renrederedAttributes, schedulerEvent);
		renderNode(renrederedAttributes, schedulerEvent);
		renderReminder(renrederedAttributes, schedulerEvent);
		renderRepeated(renrederedAttributes, schedulerEvent);
		renderScheduler(renrederedAttributes, schedulerEvent);
		renderStartDate(renrederedAttributes, schedulerEvent);
		renderTitleDateFormat(renrederedAttributes, schedulerEvent);
		renderVisible(renrederedAttributes, schedulerEvent);

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

	protected void renderAllDay(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getAllDay() != null) {
			renrederedAttributes.add(renderBoolean("allDay", schedulerEvent.getAllDay()));
		}
	}

	protected void renderSchedulereventClientId(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getSchedulereventClientId() != null) {
			renrederedAttributes.add(renderString("schedulereventClientId", schedulerEvent.getSchedulereventClientId()));
		}
	}

	protected void renderColor(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getColor() != null) {
			renrederedAttributes.add(renderString("color", schedulerEvent.getColor()));
		}
	}

	protected void renderColorBrightnessFactor(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getColorBrightnessFactor() != null) {
			renrederedAttributes.add(renderNumber("colorBrightnessFactor", schedulerEvent.getColorBrightnessFactor()));
		}
	}

	protected void renderColorSaturationFactor(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getColorSaturationFactor() != null) {
			renrederedAttributes.add(renderNumber("colorSaturationFactor", schedulerEvent.getColorSaturationFactor()));
		}
	}

	protected void renderContent(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getContent() != null) {
			renrederedAttributes.add(renderString("content", schedulerEvent.getContent()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", schedulerEvent.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", schedulerEvent.getDisabled()));
		}
	}

	protected void renderEndDate(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getEndDate() != null) {
			renrederedAttributes.add(renderString("endDate", schedulerEvent.getEndDate()));
		}
	}

	protected void renderSchedulereventId(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getSchedulereventId() != null) {
			renrederedAttributes.add(renderString("schedulereventId", schedulerEvent.getSchedulereventId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", schedulerEvent.getInitialized()));
		}
	}

	protected void renderMeeting(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getMeeting() != null) {
			renrederedAttributes.add(renderBoolean("meeting", schedulerEvent.getMeeting()));
		}
	}

	protected void renderNode(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getNode() != null) {
			renrederedAttributes.add(renderString("node", schedulerEvent.getNode()));
		}
	}

	protected void renderReminder(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getReminder() != null) {
			renrederedAttributes.add(renderBoolean("reminder", schedulerEvent.getReminder()));
		}
	}

	protected void renderRepeated(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getRepeated() != null) {
			renrederedAttributes.add(renderBoolean("repeated", schedulerEvent.getRepeated()));
		}
	}

	protected void renderScheduler(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getScheduler() != null) {
			renrederedAttributes.add(renderString("scheduler", schedulerEvent.getScheduler()));
		}
	}

	protected void renderStartDate(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getStartDate() != null) {
			renrederedAttributes.add(renderString("startDate", schedulerEvent.getStartDate()));
		}
	}

	protected void renderTitleDateFormat(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getTitleDateFormat() != null) {
			renrederedAttributes.add(renderString("titleDateFormat", schedulerEvent.getTitleDateFormat()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, SchedulerEvent schedulerEvent) throws IOException {
		if (schedulerEvent.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", schedulerEvent.getVisible()));
		}
	}

}