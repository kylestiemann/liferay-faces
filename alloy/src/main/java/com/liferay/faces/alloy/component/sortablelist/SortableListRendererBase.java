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
package com.liferay.faces.alloy.component.sortablelist;

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
public abstract class SortableListRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-sortable-list";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SortableList sortableList = (SortableList) uiComponent;
		encodeHTML(facesContext, sortableList);
		encodeJavaScript(facesContext, sortableList);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SortableList sortableList) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SortableList sortableList) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, sortableList);

		bufferedResponseWriter.write("var sortableList = new Y.SortableList");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderDd(bufferedResponseWriter, sortableList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropCondition(bufferedResponseWriter, sortableList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropContainer(bufferedResponseWriter, sortableList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropOn(bufferedResponseWriter, sortableList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHelper(bufferedResponseWriter, sortableList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNodes(bufferedResponseWriter, sortableList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPlaceholder(bufferedResponseWriter, sortableList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderProxy(bufferedResponseWriter, sortableList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSortCondition(bufferedResponseWriter, sortableList);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, sortableList);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDd(ResponseWriter responseWriter, SortableList sortableList) throws IOException {
		renderString(responseWriter, "dd", sortableList.getDd());
	}

	protected void renderDropCondition(ResponseWriter responseWriter, SortableList sortableList) throws IOException {
		renderString(responseWriter, "dropCondition", sortableList.getDropCondition());
	}

	protected void renderDropContainer(ResponseWriter responseWriter, SortableList sortableList) throws IOException {
		renderString(responseWriter, "dropContainer", sortableList.getDropContainer());
	}

	protected void renderDropOn(ResponseWriter responseWriter, SortableList sortableList) throws IOException {
		renderString(responseWriter, "dropOn", sortableList.getDropOn());
	}

	protected void renderHelper(ResponseWriter responseWriter, SortableList sortableList) throws IOException {
		renderString(responseWriter, "helper", sortableList.getHelper());
	}

	protected void renderNodes(ResponseWriter responseWriter, SortableList sortableList) throws IOException {
		renderString(responseWriter, "nodes", sortableList.getNodes());
	}

	protected void renderPlaceholder(ResponseWriter responseWriter, SortableList sortableList) throws IOException {
		renderString(responseWriter, "placeholder", sortableList.getPlaceholder());
	}

	protected void renderProxy(ResponseWriter responseWriter, SortableList sortableList) throws IOException {
		renderString(responseWriter, "proxy", sortableList.getProxy());
	}

	protected void renderSortCondition(ResponseWriter responseWriter, SortableList sortableList) throws IOException {
		renderString(responseWriter, "sortCondition", sortableList.getSortCondition());
	}

}