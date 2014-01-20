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
package com.liferay.faces.alloy.component.tab;

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
public abstract class TabRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tabview";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Tab tab = (Tab) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var tab = new A.Tab");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderContent(renderedAttributes, tab);
		renderDisabled(renderedAttributes, tab);
		renderLabel(renderedAttributes, tab);
		renderPanelNode(renderedAttributes, tab);
		renderTriggerEvent(renderedAttributes, tab);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterContentChange(renderedAfterEvents, tab);
		renderAfterDisabledChange(renderedAfterEvents, tab);
		renderAfterLabelChange(renderedAfterEvents, tab);
		renderAfterPanelNodeChange(renderedAfterEvents, tab);
		renderAfterTriggerEventChange(renderedAfterEvents, tab);

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

		renderOnContentChange(renderedOnEvents, tab);
		renderOnDisabledChange(renderedOnEvents, tab);
		renderOnLabelChange(renderedOnEvents, tab);
		renderOnPanelNodeChange(renderedOnEvents, tab);
		renderOnTriggerEventChange(renderedOnEvents, tab);

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

	protected void renderContent(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.Object content = tab.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(Tab.CONTENT, content));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String disabled = tab.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderString(Tab.DISABLED, disabled));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.Object label = tab.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(Tab.LABEL, label));
		}
	}

	protected void renderPanelNode(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.Object panelNode = tab.getPanelNode();

		if (panelNode != null) {
			renderedAttributes.add(renderString(Tab.PANEL_NODE, panelNode));
		}
	}

	protected void renderTriggerEvent(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String triggerEvent = tab.getTriggerEvent();

		if (triggerEvent != null) {
			renderedAttributes.add(renderString(Tab.TRIGGER_EVENT, triggerEvent));
		}
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String afterContentChange = tab.getAfterContentChange();

		if (afterContentChange != null) {
			renderedAttributes.add(renderString(Tab.AFTER_CONTENT_CHANGE, afterContentChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String afterDisabledChange = tab.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Tab.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String afterLabelChange = tab.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(Tab.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterPanelNodeChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String afterPanelNodeChange = tab.getAfterPanelNodeChange();

		if (afterPanelNodeChange != null) {
			renderedAttributes.add(renderString(Tab.AFTER_PANEL_NODE_CHANGE, afterPanelNodeChange));
		}
	}

	protected void renderAfterTriggerEventChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String afterTriggerEventChange = tab.getAfterTriggerEventChange();

		if (afterTriggerEventChange != null) {
			renderedAttributes.add(renderString(Tab.AFTER_TRIGGER_EVENT_CHANGE, afterTriggerEventChange));
		}
	}

	protected void renderOnContentChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String onContentChange = tab.getOnContentChange();

		if (onContentChange != null) {
			renderedAttributes.add(renderString(Tab.ON_CONTENT_CHANGE, onContentChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String onDisabledChange = tab.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Tab.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String onLabelChange = tab.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(Tab.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnPanelNodeChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String onPanelNodeChange = tab.getOnPanelNodeChange();

		if (onPanelNodeChange != null) {
			renderedAttributes.add(renderString(Tab.ON_PANEL_NODE_CHANGE, onPanelNodeChange));
		}
	}

	protected void renderOnTriggerEventChange(List<String> renderedAttributes, Tab tab) throws IOException {
		java.lang.String onTriggerEventChange = tab.getOnTriggerEventChange();

		if (onTriggerEventChange != null) {
			renderedAttributes.add(renderString(Tab.ON_TRIGGER_EVENT_CHANGE, onTriggerEventChange));
		}
	}

}