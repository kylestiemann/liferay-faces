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
package com.liferay.faces.alloy.component.treeviewdd;

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
public abstract class TreeViewDDRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-view";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeViewDD treeViewDD = (TreeViewDD) uiComponent;
		encodeHTML(facesContext, treeViewDD);
		encodeJavaScript(facesContext, treeViewDD);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeViewDD treeViewDD) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeViewDD treeViewDD) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, treeViewDD);

		bufferedResponseWriter.write("var treeViewDD = new Y.TreeViewDD");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderTreeviewddChildren(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderContainer(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderDropAction(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderHelper(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderIndex(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderLastSelected(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderLastY(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderLazyLoad(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderNode(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderNodeContent(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderScrollDelay(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderSelectOnToggle(responseWriter, treeViewDD);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, treeViewDD);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, treeViewDD);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderTreeviewddChildren(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderArray(responseWriter, "treeviewddChildren", treeViewDD.getTreeviewddChildren());
	}

	protected void renderContainer(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderString(responseWriter, "container", treeViewDD.getContainer());
	}

	protected void renderDropAction(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderString(responseWriter, "dropAction", treeViewDD.getDropAction());
	}

	protected void renderHelper(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderString(responseWriter, "helper", treeViewDD.getHelper());
	}

	protected void renderIndex(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderObject(responseWriter, "index", treeViewDD.getIndex());
	}

	protected void renderLastSelected(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderString(responseWriter, "lastSelected", treeViewDD.getLastSelected());
	}

	protected void renderLastY(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderNumber(responseWriter, "lastY", treeViewDD.getLastY());
	}

	protected void renderLazyLoad(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderBoolean(responseWriter, "lazyLoad", treeViewDD.getLazyLoad());
	}

	protected void renderNode(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderString(responseWriter, "node", treeViewDD.getNode());
	}

	protected void renderNodeContent(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderString(responseWriter, "nodeContent", treeViewDD.getNodeContent());
	}

	protected void renderScrollDelay(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderNumber(responseWriter, "scrollDelay", treeViewDD.getScrollDelay());
	}

	protected void renderSelectOnToggle(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderBoolean(responseWriter, "selectOnToggle", treeViewDD.getSelectOnToggle());
	}

	protected void renderType(ResponseWriter responseWriter, TreeViewDD treeViewDD) throws IOException {
		renderString(responseWriter, "type", treeViewDD.getType());
	}

}