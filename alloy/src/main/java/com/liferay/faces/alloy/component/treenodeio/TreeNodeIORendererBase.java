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
package com.liferay.faces.alloy.component.treenodeio;

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
public abstract class TreeNodeIORendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeNodeIO treeNodeIO = (TreeNodeIO) uiComponent;
		encodeHTML(facesContext, treeNodeIO);
		encodeJavaScript(facesContext, treeNodeIO);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeIO treeNodeIO) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeIO treeNodeIO) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, treeNodeIO);

		bufferedResponseWriter.write("var treeNodeIO = new Y.TreeNodeIO");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlwaysShowHitArea(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBoundingBox(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCache(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTreenodeioChildren(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainer(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContentBox(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClasses(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDraggable(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderExpanded(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHitAreaEl(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIconEl(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTreenodeioId(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIndex(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIo(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelEl(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLeaf(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoaded(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoading(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNextSibling(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOwnerTree(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPaginator(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderParentNode(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPrevSibling(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRendered(bufferedResponseWriter, treeNodeIO);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, treeNodeIO);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, treeNodeIO);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderBoolean(responseWriter, "alwaysShowHitArea", treeNodeIO.getAlwaysShowHitArea());
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "boundingBox", treeNodeIO.getBoundingBox());
	}

	protected void renderCache(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderBoolean(responseWriter, "cache", treeNodeIO.getCache());
	}

	protected void renderTreenodeioChildren(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderArray(responseWriter, "treenodeioChildren", treeNodeIO.getTreenodeioChildren());
	}

	protected void renderContainer(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "container", treeNodeIO.getContainer());
	}

	protected void renderContentBox(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "contentBox", treeNodeIO.getContentBox());
	}

	protected void renderCssClasses(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderObject(responseWriter, "cssClasses", treeNodeIO.getCssClasses());
	}

	protected void renderDraggable(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderBoolean(responseWriter, "draggable", treeNodeIO.getDraggable());
	}

	protected void renderExpanded(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderBoolean(responseWriter, "expanded", treeNodeIO.getExpanded());
	}

	protected void renderHitAreaEl(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "hitAreaEl", treeNodeIO.getHitAreaEl());
	}

	protected void renderIconEl(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "iconEl", treeNodeIO.getIconEl());
	}

	protected void renderTreenodeioId(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "treenodeioId", treeNodeIO.getTreenodeioId());
	}

	protected void renderIndex(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderObject(responseWriter, "index", treeNodeIO.getIndex());
	}

	protected void renderIo(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderObject(responseWriter, "io", treeNodeIO.getIo());
	}

	protected void renderLabel(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "label", treeNodeIO.getLabel());
	}

	protected void renderLabelEl(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "labelEl", treeNodeIO.getLabelEl());
	}

	protected void renderLeaf(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderBoolean(responseWriter, "leaf", treeNodeIO.getLeaf());
	}

	protected void renderLoaded(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderBoolean(responseWriter, "loaded", treeNodeIO.getLoaded());
	}

	protected void renderLoading(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderBoolean(responseWriter, "loading", treeNodeIO.getLoading());
	}

	protected void renderNextSibling(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "nextSibling", treeNodeIO.getNextSibling());
	}

	protected void renderOwnerTree(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "ownerTree", treeNodeIO.getOwnerTree());
	}

	protected void renderPaginator(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderObject(responseWriter, "paginator", treeNodeIO.getPaginator());
	}

	protected void renderParentNode(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "parentNode", treeNodeIO.getParentNode());
	}

	protected void renderPrevSibling(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "prevSibling", treeNodeIO.getPrevSibling());
	}

	protected void renderRendered(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderBoolean(responseWriter, "rendered", treeNodeIO.getRendered());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, TreeNodeIO treeNodeIO) throws IOException {
		renderString(responseWriter, "tabIndex", treeNodeIO.getTabIndex());
	}

}