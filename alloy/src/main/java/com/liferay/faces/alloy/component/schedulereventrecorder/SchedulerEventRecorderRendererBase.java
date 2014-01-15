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
public abstract class SchedulerEventRecorderRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-event-recorder";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SchedulerEventRecorder schedulerEventRecorder = (SchedulerEventRecorder) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var schedulerEventRecorder = new A.SchedulerEventRecorder");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAllDay(renrederedAttributes, schedulerEventRecorder);
		renderSchedulereventrecorderClientId(renrederedAttributes, schedulerEventRecorder);
		renderColor(renrederedAttributes, schedulerEventRecorder);
		renderColorBrightnessFactor(renrederedAttributes, schedulerEventRecorder);
		renderColorSaturationFactor(renrederedAttributes, schedulerEventRecorder);
		renderContent(renrederedAttributes, schedulerEventRecorder);
		renderDateFormat(renrederedAttributes, schedulerEventRecorder);
		renderDestroyed(renrederedAttributes, schedulerEventRecorder);
		renderDisabled(renrederedAttributes, schedulerEventRecorder);
		renderDuration(renrederedAttributes, schedulerEventRecorder);
		renderEndDate(renrederedAttributes, schedulerEventRecorder);
		renderEvent(renrederedAttributes, schedulerEventRecorder);
		renderEventClass(renrederedAttributes, schedulerEventRecorder);
		renderSchedulereventrecorderId(renrederedAttributes, schedulerEventRecorder);
		renderInitialized(renrederedAttributes, schedulerEventRecorder);
		renderMeeting(renrederedAttributes, schedulerEventRecorder);
		renderNode(renrederedAttributes, schedulerEventRecorder);
		renderPopover(renrederedAttributes, schedulerEventRecorder);
		renderReminder(renrederedAttributes, schedulerEventRecorder);
		renderRepeated(renrederedAttributes, schedulerEventRecorder);
		renderScheduler(renrederedAttributes, schedulerEventRecorder);
		renderStartDate(renrederedAttributes, schedulerEventRecorder);
		renderStrings(renrederedAttributes, schedulerEventRecorder);
		renderTemplate(renrederedAttributes, schedulerEventRecorder);
		renderTitleDateFormat(renrederedAttributes, schedulerEventRecorder);
		renderVisible(renrederedAttributes, schedulerEventRecorder);

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

	protected void renderAllDay(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getAllDay() != null) {
			renrederedAttributes.add(renderBoolean("allDay", schedulerEventRecorder.getAllDay()));
		}
	}

	protected void renderSchedulereventrecorderClientId(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getSchedulereventrecorderClientId() != null) {
			renrederedAttributes.add(renderString("schedulereventrecorderClientId", schedulerEventRecorder.getSchedulereventrecorderClientId()));
		}
	}

	protected void renderColor(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getColor() != null) {
			renrederedAttributes.add(renderString("color", schedulerEventRecorder.getColor()));
		}
	}

	protected void renderColorBrightnessFactor(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getColorBrightnessFactor() != null) {
			renrederedAttributes.add(renderNumber("colorBrightnessFactor", schedulerEventRecorder.getColorBrightnessFactor()));
		}
	}

	protected void renderColorSaturationFactor(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getColorSaturationFactor() != null) {
			renrederedAttributes.add(renderNumber("colorSaturationFactor", schedulerEventRecorder.getColorSaturationFactor()));
		}
	}

	protected void renderContent(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getContent() != null) {
			renrederedAttributes.add(renderString("content", schedulerEventRecorder.getContent()));
		}
	}

	protected void renderDateFormat(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getDateFormat() != null) {
			renrederedAttributes.add(renderString("dateFormat", schedulerEventRecorder.getDateFormat()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", schedulerEventRecorder.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", schedulerEventRecorder.getDisabled()));
		}
	}

	protected void renderDuration(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getDuration() != null) {
			renrederedAttributes.add(renderNumber("duration", schedulerEventRecorder.getDuration()));
		}
	}

	protected void renderEndDate(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getEndDate() != null) {
			renrederedAttributes.add(renderString("endDate", schedulerEventRecorder.getEndDate()));
		}
	}

	protected void renderEvent(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getEvent() != null) {
			renrederedAttributes.add(renderString("event", schedulerEventRecorder.getEvent()));
		}
	}

	protected void renderEventClass(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getEventClass() != null) {
			renrederedAttributes.add(renderString("eventClass", schedulerEventRecorder.getEventClass()));
		}
	}

	protected void renderSchedulereventrecorderId(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getSchedulereventrecorderId() != null) {
			renrederedAttributes.add(renderString("schedulereventrecorderId", schedulerEventRecorder.getSchedulereventrecorderId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", schedulerEventRecorder.getInitialized()));
		}
	}

	protected void renderMeeting(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getMeeting() != null) {
			renrederedAttributes.add(renderBoolean("meeting", schedulerEventRecorder.getMeeting()));
		}
	}

	protected void renderNode(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getNode() != null) {
			renrederedAttributes.add(renderString("node", schedulerEventRecorder.getNode()));
		}
	}

	protected void renderPopover(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getPopover() != null) {
			renrederedAttributes.add(renderObject("popover", schedulerEventRecorder.getPopover()));
		}
	}

	protected void renderReminder(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getReminder() != null) {
			renrederedAttributes.add(renderBoolean("reminder", schedulerEventRecorder.getReminder()));
		}
	}

	protected void renderRepeated(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getRepeated() != null) {
			renrederedAttributes.add(renderBoolean("repeated", schedulerEventRecorder.getRepeated()));
		}
	}

	protected void renderScheduler(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getScheduler() != null) {
			renrederedAttributes.add(renderString("scheduler", schedulerEventRecorder.getScheduler()));
		}
	}

	protected void renderStartDate(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getStartDate() != null) {
			renrederedAttributes.add(renderString("startDate", schedulerEventRecorder.getStartDate()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", schedulerEventRecorder.getStrings()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", schedulerEventRecorder.getTemplate()));
		}
	}

	protected void renderTitleDateFormat(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getTitleDateFormat() != null) {
			renrederedAttributes.add(renderString("titleDateFormat", schedulerEventRecorder.getTitleDateFormat()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, SchedulerEventRecorder schedulerEventRecorder) throws IOException {
		if (schedulerEventRecorder.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", schedulerEventRecorder.getVisible()));
		}
	}

}