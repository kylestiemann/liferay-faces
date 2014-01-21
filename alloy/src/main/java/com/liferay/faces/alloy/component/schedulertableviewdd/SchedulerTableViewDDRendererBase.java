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
package com.liferay.faces.alloy.component.schedulertableviewdd;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
public abstract class SchedulerTableViewDDRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-scheduler-view-table-dd";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SchedulerTableViewDD schedulerTableViewDD = (SchedulerTableViewDD) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var schedulerTableViewDD = new A.SchedulerTableViewDD");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (schedulerTableViewDD.getDelegateConfig() != null) {
			renderDelegateConfig(renderedAttributes, schedulerTableViewDD);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (schedulerTableViewDD.getAfterDelegateConfigChange() != null) {
			renderAfterDelegateConfigChange(renderedAfterEvents, schedulerTableViewDD);
		}


		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		if (schedulerTableViewDD.getOnDelegateConfigChange() != null) {
			renderOnDelegateConfigChange(renderedOnEvents, schedulerTableViewDD);
		}


		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDelegateConfig(List<String> renderedAttributes, SchedulerTableViewDD schedulerTableViewDD) throws IOException {
		java.lang.Object delegateConfig = schedulerTableViewDD.getDelegateConfig();
		renderedAttributes.add(renderObject(SchedulerTableViewDD.DELEGATE_CONFIG, delegateConfig));
	}

	protected void renderAfterDelegateConfigChange(List<String> renderedAttributes, SchedulerTableViewDD schedulerTableViewDD) throws IOException {
		java.lang.String afterDelegateConfigChange = schedulerTableViewDD.getAfterDelegateConfigChange();
		renderedAttributes.add(renderString(SchedulerTableViewDD.AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange));
	}

	protected void renderOnDelegateConfigChange(List<String> renderedAttributes, SchedulerTableViewDD schedulerTableViewDD) throws IOException {
		java.lang.String onDelegateConfigChange = schedulerTableViewDD.getOnDelegateConfigChange();
		renderedAttributes.add(renderString(SchedulerTableViewDD.ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange));
	}

}