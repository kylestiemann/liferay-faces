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
package com.liferay.faces.alloy.component.sortablelayout;

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
public abstract class SortableLayoutRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-sortable-layout";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		SortableLayout sortableLayout = (SortableLayout) uiComponent;
		encodeHTML(facesContext, sortableLayout);
		encodeJavaScript(facesContext, sortableLayout);
	}

	protected abstract void encodeHTML(FacesContext facesContext, SortableLayout sortableLayout) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, SortableLayout sortableLayout) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, sortableLayout);

		bufferedResponseWriter.write("var sortableLayout = new Y.SortableLayout");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderDelegateConfig(bufferedResponseWriter, sortableLayout);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDragNodes(bufferedResponseWriter, sortableLayout);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropContainer(bufferedResponseWriter, sortableLayout);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropNodes(bufferedResponseWriter, sortableLayout);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGroups(bufferedResponseWriter, sortableLayout);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLazyStart(bufferedResponseWriter, sortableLayout);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPlaceholder(bufferedResponseWriter, sortableLayout);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderProxy(bufferedResponseWriter, sortableLayout);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderProxyNode(bufferedResponseWriter, sortableLayout);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, sortableLayout);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDelegateConfig(ResponseWriter responseWriter, SortableLayout sortableLayout) throws IOException {
		renderObject(responseWriter, "delegateConfig", sortableLayout.getDelegateConfig());
	}

	protected void renderDragNodes(ResponseWriter responseWriter, SortableLayout sortableLayout) throws IOException {
		renderString(responseWriter, "dragNodes", sortableLayout.getDragNodes());
	}

	protected void renderDropContainer(ResponseWriter responseWriter, SortableLayout sortableLayout) throws IOException {
		renderString(responseWriter, "dropContainer", sortableLayout.getDropContainer());
	}

	protected void renderDropNodes(ResponseWriter responseWriter, SortableLayout sortableLayout) throws IOException {
		renderString(responseWriter, "dropNodes", sortableLayout.getDropNodes());
	}

	protected void renderGroups(ResponseWriter responseWriter, SortableLayout sortableLayout) throws IOException {
		renderString(responseWriter, "groups", sortableLayout.getGroups());
	}

	protected void renderLazyStart(ResponseWriter responseWriter, SortableLayout sortableLayout) throws IOException {
		renderBoolean(responseWriter, "lazyStart", sortableLayout.getLazyStart());
	}

	protected void renderPlaceholder(ResponseWriter responseWriter, SortableLayout sortableLayout) throws IOException {
		renderString(responseWriter, "placeholder", sortableLayout.getPlaceholder());
	}

	protected void renderProxy(ResponseWriter responseWriter, SortableLayout sortableLayout) throws IOException {
		renderString(responseWriter, "proxy", sortableLayout.getProxy());
	}

	protected void renderProxyNode(ResponseWriter responseWriter, SortableLayout sortableLayout) throws IOException {
		renderString(responseWriter, "proxyNode", sortableLayout.getProxyNode());
	}

}