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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, treeViewDD);

		bufferedResponseWriter.write("var treeViewDD = new Y.TreeViewDD");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderTreeviewddChildren(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainer(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropAction(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHelper(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIndex(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLastSelected(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLastY(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLazyLoad(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNode(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNodeContent(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderScrollDelay(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelectOnToggle(bufferedResponseWriter, treeViewDD);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, treeViewDD);

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