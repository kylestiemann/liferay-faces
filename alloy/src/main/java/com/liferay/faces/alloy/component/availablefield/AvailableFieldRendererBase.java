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
package com.liferay.faces.alloy.component.availablefield;

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
public abstract class AvailableFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		AvailableField availableField = (AvailableField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var availableField = new A.AvailableField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (availableField.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, availableField);
		}
		
		if (availableField.getDraggable() != null) {
			renderDraggable(renderedAttributes, availableField);
		}
		
		if (availableField.getIconClass() != null) {
			renderIconClass(renderedAttributes, availableField);
		}
		
		if (availableField.getAvailableFieldId() != null) {
			renderAvailableFieldId(renderedAttributes, availableField);
		}
		
		if (availableField.getInitialized() != null) {
			renderInitialized(renderedAttributes, availableField);
		}
		
		if (availableField.getLabel() != null) {
			renderLabel(renderedAttributes, availableField);
		}
		
		if (availableField.getNode() != null) {
			renderNode(renderedAttributes, availableField);
		}
		
		if (availableField.getType() != null) {
			renderType(renderedAttributes, availableField);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (availableField.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, availableField);
		}
		
		if (availableField.getAfterDraggableChange() != null) {
			renderAfterDraggableChange(renderedAfterEvents, availableField);
		}
		
		if (availableField.getAfterIconClassChange() != null) {
			renderAfterIconClassChange(renderedAfterEvents, availableField);
		}
		
		if (availableField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, availableField);
		}
		
		if (availableField.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, availableField);
		}
		
		if (availableField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, availableField);
		}
		
		if (availableField.getAfterNodeChange() != null) {
			renderAfterNodeChange(renderedAfterEvents, availableField);
		}
		
		if (availableField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, availableField);
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

		if (availableField.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, availableField);
		}
		
		if (availableField.getOnDraggableChange() != null) {
			renderOnDraggableChange(renderedOnEvents, availableField);
		}
		
		if (availableField.getOnIconClassChange() != null) {
			renderOnIconClassChange(renderedOnEvents, availableField);
		}
		
		if (availableField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, availableField);
		}
		
		if (availableField.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, availableField);
		}
		
		if (availableField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, availableField);
		}
		
		if (availableField.getOnNodeChange() != null) {
			renderOnNodeChange(renderedOnEvents, availableField);
		}
		
		if (availableField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, availableField);
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

	protected void renderDestroyed(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.Boolean destroyed = availableField.getDestroyed();
		renderedAttributes.add(renderBoolean(AvailableField.DESTROYED, destroyed));
	}

	protected void renderDraggable(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.Boolean draggable = availableField.getDraggable();
		renderedAttributes.add(renderBoolean(AvailableField.DRAGGABLE, draggable));
	}

	protected void renderIconClass(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String iconClass = availableField.getIconClass();
		renderedAttributes.add(renderString(AvailableField.ICON_CLASS, iconClass));
	}

	protected void renderAvailableFieldId(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String availableFieldId = availableField.getAvailableFieldId();
		renderedAttributes.add(renderString(AvailableField.AVAILABLE_FIELD_ID, availableFieldId));
	}

	protected void renderInitialized(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.Boolean initialized = availableField.getInitialized();
		renderedAttributes.add(renderBoolean(AvailableField.INITIALIZED, initialized));
	}

	protected void renderLabel(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String label = availableField.getLabel();
		renderedAttributes.add(renderString(AvailableField.LABEL, label));
	}

	protected void renderNode(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.Object node = availableField.getNode();
		renderedAttributes.add(renderString(AvailableField.NODE, node));
	}

	protected void renderType(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String type = availableField.getType();
		renderedAttributes.add(renderString(AvailableField.TYPE, type));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String afterDestroyedChange = availableField.getAfterDestroyedChange();
		renderedAttributes.add(renderString(AvailableField.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String afterDraggableChange = availableField.getAfterDraggableChange();
		renderedAttributes.add(renderString(AvailableField.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
	}

	protected void renderAfterIconClassChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String afterIconClassChange = availableField.getAfterIconClassChange();
		renderedAttributes.add(renderString(AvailableField.AFTER_ICON_CLASS_CHANGE, afterIconClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String afterIdChange = availableField.getAfterIdChange();
		renderedAttributes.add(renderString(AvailableField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String afterInitializedChange = availableField.getAfterInitializedChange();
		renderedAttributes.add(renderString(AvailableField.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String afterLabelChange = availableField.getAfterLabelChange();
		renderedAttributes.add(renderString(AvailableField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterNodeChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String afterNodeChange = availableField.getAfterNodeChange();
		renderedAttributes.add(renderString(AvailableField.AFTER_NODE_CHANGE, afterNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String afterTypeChange = availableField.getAfterTypeChange();
		renderedAttributes.add(renderString(AvailableField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String onDestroyedChange = availableField.getOnDestroyedChange();
		renderedAttributes.add(renderString(AvailableField.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String onDraggableChange = availableField.getOnDraggableChange();
		renderedAttributes.add(renderString(AvailableField.ON_DRAGGABLE_CHANGE, onDraggableChange));
	}

	protected void renderOnIconClassChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String onIconClassChange = availableField.getOnIconClassChange();
		renderedAttributes.add(renderString(AvailableField.ON_ICON_CLASS_CHANGE, onIconClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String onIdChange = availableField.getOnIdChange();
		renderedAttributes.add(renderString(AvailableField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String onInitializedChange = availableField.getOnInitializedChange();
		renderedAttributes.add(renderString(AvailableField.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String onLabelChange = availableField.getOnLabelChange();
		renderedAttributes.add(renderString(AvailableField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnNodeChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String onNodeChange = availableField.getOnNodeChange();
		renderedAttributes.add(renderString(AvailableField.ON_NODE_CHANGE, onNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String onTypeChange = availableField.getOnTypeChange();
		renderedAttributes.add(renderString(AvailableField.ON_TYPE_CHANGE, onTypeChange));
	}

}