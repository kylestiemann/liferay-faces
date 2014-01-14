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
package com.liferay.faces.alloy.component.treeview;

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
public abstract class TreeViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-view";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeView treeView = (TreeView) uiComponent;
		encodeHTML(facesContext, treeView);
		encodeJavaScript(facesContext, treeView);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeView treeView) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeView treeView) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, treeView);

		bufferedResponseWriter.write("var treeView = new Y.TreeView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderTreeviewChildren(responseWriter, treeView);
		responseWriter.write(StringPool.COMMA);
		renderContainer(responseWriter, treeView);
		responseWriter.write(StringPool.COMMA);
		renderIndex(responseWriter, treeView);
		responseWriter.write(StringPool.COMMA);
		renderLastSelected(responseWriter, treeView);
		responseWriter.write(StringPool.COMMA);
		renderLazyLoad(responseWriter, treeView);
		responseWriter.write(StringPool.COMMA);
		renderSelectOnToggle(responseWriter, treeView);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, treeView);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, treeView);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderTreeviewChildren(ResponseWriter responseWriter, TreeView treeView) throws IOException {
		renderArray(responseWriter, "treeviewChildren", treeView.getTreeviewChildren());
	}

	protected void renderContainer(ResponseWriter responseWriter, TreeView treeView) throws IOException {
		renderString(responseWriter, "container", treeView.getContainer());
	}

	protected void renderIndex(ResponseWriter responseWriter, TreeView treeView) throws IOException {
		renderObject(responseWriter, "index", treeView.getIndex());
	}

	protected void renderLastSelected(ResponseWriter responseWriter, TreeView treeView) throws IOException {
		renderString(responseWriter, "lastSelected", treeView.getLastSelected());
	}

	protected void renderLazyLoad(ResponseWriter responseWriter, TreeView treeView) throws IOException {
		renderBoolean(responseWriter, "lazyLoad", treeView.getLazyLoad());
	}

	protected void renderSelectOnToggle(ResponseWriter responseWriter, TreeView treeView) throws IOException {
		renderBoolean(responseWriter, "selectOnToggle", treeView.getSelectOnToggle());
	}

	protected void renderType(ResponseWriter responseWriter, TreeView treeView) throws IOException {
		renderString(responseWriter, "type", treeView.getType());
	}

}