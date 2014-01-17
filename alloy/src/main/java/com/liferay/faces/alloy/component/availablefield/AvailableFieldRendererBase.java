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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
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

		renderDestroyed(renderedAttributes, availableField);
		renderDraggable(renderedAttributes, availableField);
		renderIconClass(renderedAttributes, availableField);
		renderAvailablefieldId(renderedAttributes, availableField);
		renderInitialized(renderedAttributes, availableField);
		renderLabel(renderedAttributes, availableField);
		renderNode(renderedAttributes, availableField);
		renderType(renderedAttributes, availableField);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

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

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(AvailableField.DESTROYED, destroyed));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.Boolean draggable = availableField.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderBoolean(AvailableField.DRAGGABLE, draggable));
		}
	}

	protected void renderIconClass(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String iconClass = availableField.getIconClass();

		if (iconClass != null) {
			renderedAttributes.add(renderString(AvailableField.ICON_CLASS, iconClass));
		}
	}

	protected void renderAvailablefieldId(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String availablefieldId = availableField.getAvailablefieldId();

		if (availablefieldId != null) {
			renderedAttributes.add(renderString(AvailableField.AVAILABLEFIELD_ID, availablefieldId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.Boolean initialized = availableField.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(AvailableField.INITIALIZED, initialized));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String label = availableField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(AvailableField.LABEL, label));
		}
	}

	protected void renderNode(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.Object node = availableField.getNode();

		if (node != null) {
			renderedAttributes.add(renderString(AvailableField.NODE, node));
		}
	}

	protected void renderType(List<String> renderedAttributes, AvailableField availableField) throws IOException {
		java.lang.String type = availableField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(AvailableField.TYPE, type));
		}
	}

}