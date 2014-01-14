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

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		AvailableField availableField = (AvailableField) uiComponent;
		encodeHTML(facesContext, availableField);
		encodeJavaScript(facesContext, availableField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, AvailableField availableField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, AvailableField availableField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, availableField);

		bufferedResponseWriter.write("var availableField = new Y.AvailableField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderDraggable(responseWriter, availableField);
		responseWriter.write(StringPool.COMMA);
		renderIconClass(responseWriter, availableField);
		responseWriter.write(StringPool.COMMA);
		renderAvailablefieldId(responseWriter, availableField);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, availableField);
		responseWriter.write(StringPool.COMMA);
		renderNode(responseWriter, availableField);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, availableField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, availableField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDraggable(ResponseWriter responseWriter, AvailableField availableField) throws IOException {
		renderBoolean(responseWriter, "draggable", availableField.getDraggable());
	}

	protected void renderIconClass(ResponseWriter responseWriter, AvailableField availableField) throws IOException {
		renderString(responseWriter, "iconClass", availableField.getIconClass());
	}

	protected void renderAvailablefieldId(ResponseWriter responseWriter, AvailableField availableField) throws IOException {
		renderString(responseWriter, "availablefieldId", availableField.getAvailablefieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, AvailableField availableField) throws IOException {
		renderString(responseWriter, "label", availableField.getLabel());
	}

	protected void renderNode(ResponseWriter responseWriter, AvailableField availableField) throws IOException {
		renderString(responseWriter, "node", availableField.getNode());
	}

	protected void renderType(ResponseWriter responseWriter, AvailableField availableField) throws IOException {
		renderString(responseWriter, "type", availableField.getType());
	}

}