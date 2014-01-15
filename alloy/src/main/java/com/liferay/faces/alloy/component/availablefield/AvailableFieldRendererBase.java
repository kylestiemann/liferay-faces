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
public abstract class AvailableFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		AvailableField availableField = (AvailableField) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var availableField = new A.AvailableField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderDestroyed(renrederedAttributes, availableField);
		renderDraggable(renrederedAttributes, availableField);
		renderIconClass(renrederedAttributes, availableField);
		renderAvailablefieldId(renrederedAttributes, availableField);
		renderInitialized(renrederedAttributes, availableField);
		renderLabel(renrederedAttributes, availableField);
		renderNode(renrederedAttributes, availableField);
		renderType(renrederedAttributes, availableField);

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

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, AvailableField availableField) throws IOException {
		if (availableField.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", availableField.getDestroyed()));
		}
	}

	protected void renderDraggable(ArrayList<String> renrederedAttributes, AvailableField availableField) throws IOException {
		if (availableField.getDraggable() != null) {
			renrederedAttributes.add(renderBoolean("draggable", availableField.getDraggable()));
		}
	}

	protected void renderIconClass(ArrayList<String> renrederedAttributes, AvailableField availableField) throws IOException {
		if (availableField.getIconClass() != null) {
			renrederedAttributes.add(renderString("iconClass", availableField.getIconClass()));
		}
	}

	protected void renderAvailablefieldId(ArrayList<String> renrederedAttributes, AvailableField availableField) throws IOException {
		if (availableField.getAvailablefieldId() != null) {
			renrederedAttributes.add(renderString("availablefieldId", availableField.getAvailablefieldId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, AvailableField availableField) throws IOException {
		if (availableField.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", availableField.getInitialized()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, AvailableField availableField) throws IOException {
		if (availableField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", availableField.getLabel()));
		}
	}

	protected void renderNode(ArrayList<String> renrederedAttributes, AvailableField availableField) throws IOException {
		if (availableField.getNode() != null) {
			renrederedAttributes.add(renderString("node", availableField.getNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, AvailableField availableField) throws IOException {
		if (availableField.getType() != null) {
			renrederedAttributes.add(renderString("type", availableField.getType()));
		}
	}

}