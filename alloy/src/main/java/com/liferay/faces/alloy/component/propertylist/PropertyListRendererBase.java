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
package com.liferay.faces.alloy.component.propertylist;

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
public abstract class PropertyListRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-property-list";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		PropertyList propertyList = (PropertyList) uiComponent;
		encodeHTML(facesContext, propertyList);
		encodeJavaScript(facesContext, propertyList);
	}

	protected abstract void encodeHTML(FacesContext facesContext, PropertyList propertyList) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, PropertyList propertyList) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, propertyList);

		bufferedResponseWriter.write("var propertyList = new Y.PropertyList");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderColumns(bufferedResponseWriter, propertyList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderEditEvent(bufferedResponseWriter, propertyList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScrollable(bufferedResponseWriter, propertyList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, propertyList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, propertyList);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, propertyList);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderColumns(ResponseWriter responseWriter, PropertyList propertyList) throws IOException {
		renderString(responseWriter, "columns", propertyList.getColumns());
	}

	protected void renderEditEvent(ResponseWriter responseWriter, PropertyList propertyList) throws IOException {
		renderString(responseWriter, "editEvent", propertyList.getEditEvent());
	}

	protected void renderScrollable(ResponseWriter responseWriter, PropertyList propertyList) throws IOException {
		renderBoolean(responseWriter, "scrollable", propertyList.getScrollable());
	}

	protected void renderStrings(ResponseWriter responseWriter, PropertyList propertyList) throws IOException {
		renderString(responseWriter, "strings", propertyList.getStrings());
	}

	protected void renderWidth(ResponseWriter responseWriter, PropertyList propertyList) throws IOException {
		renderString(responseWriter, "width", propertyList.getWidth());
	}

}