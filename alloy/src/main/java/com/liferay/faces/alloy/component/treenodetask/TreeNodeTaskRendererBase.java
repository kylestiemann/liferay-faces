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
package com.liferay.faces.alloy.component.treenodetask;

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
public abstract class TreeNodeTaskRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeNodeTask treeNodeTask = (TreeNodeTask) uiComponent;
		encodeHTML(facesContext, treeNodeTask);
		encodeJavaScript(facesContext, treeNodeTask);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeTask treeNodeTask) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeTask treeNodeTask) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, treeNodeTask);

		bufferedResponseWriter.write("var treeNodeTask = new Y.TreeNodeTask");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlwaysShowHitArea(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBoundingBox(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCache(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCheckContainerEl(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCheckEl(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCheckName(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderChecked(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTreenodetaskChildren(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainer(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContentBox(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClasses(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDraggable(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderExpanded(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHitAreaEl(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIconEl(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTreenodetaskId(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIndex(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIo(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelEl(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLeaf(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoaded(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoading(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNextSibling(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOwnerTree(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPaginator(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderParentNode(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPrevSibling(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRendered(bufferedResponseWriter, treeNodeTask);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, treeNodeTask);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, treeNodeTask);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderBoolean(responseWriter, "alwaysShowHitArea", treeNodeTask.getAlwaysShowHitArea());
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "boundingBox", treeNodeTask.getBoundingBox());
	}

	protected void renderCache(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderBoolean(responseWriter, "cache", treeNodeTask.getCache());
	}

	protected void renderCheckContainerEl(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "checkContainerEl", treeNodeTask.getCheckContainerEl());
	}

	protected void renderCheckEl(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "checkEl", treeNodeTask.getCheckEl());
	}

	protected void renderCheckName(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "checkName", treeNodeTask.getCheckName());
	}

	protected void renderChecked(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderBoolean(responseWriter, "checked", treeNodeTask.getChecked());
	}

	protected void renderTreenodetaskChildren(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderArray(responseWriter, "treenodetaskChildren", treeNodeTask.getTreenodetaskChildren());
	}

	protected void renderContainer(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "container", treeNodeTask.getContainer());
	}

	protected void renderContentBox(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "contentBox", treeNodeTask.getContentBox());
	}

	protected void renderCssClasses(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderObject(responseWriter, "cssClasses", treeNodeTask.getCssClasses());
	}

	protected void renderDraggable(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderBoolean(responseWriter, "draggable", treeNodeTask.getDraggable());
	}

	protected void renderExpanded(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderBoolean(responseWriter, "expanded", treeNodeTask.getExpanded());
	}

	protected void renderHitAreaEl(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "hitAreaEl", treeNodeTask.getHitAreaEl());
	}

	protected void renderIconEl(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "iconEl", treeNodeTask.getIconEl());
	}

	protected void renderTreenodetaskId(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "treenodetaskId", treeNodeTask.getTreenodetaskId());
	}

	protected void renderIndex(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderObject(responseWriter, "index", treeNodeTask.getIndex());
	}

	protected void renderIo(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderObject(responseWriter, "io", treeNodeTask.getIo());
	}

	protected void renderLabel(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "label", treeNodeTask.getLabel());
	}

	protected void renderLabelEl(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "labelEl", treeNodeTask.getLabelEl());
	}

	protected void renderLeaf(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderBoolean(responseWriter, "leaf", treeNodeTask.getLeaf());
	}

	protected void renderLoaded(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderBoolean(responseWriter, "loaded", treeNodeTask.getLoaded());
	}

	protected void renderLoading(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderBoolean(responseWriter, "loading", treeNodeTask.getLoading());
	}

	protected void renderNextSibling(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "nextSibling", treeNodeTask.getNextSibling());
	}

	protected void renderOwnerTree(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "ownerTree", treeNodeTask.getOwnerTree());
	}

	protected void renderPaginator(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderObject(responseWriter, "paginator", treeNodeTask.getPaginator());
	}

	protected void renderParentNode(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "parentNode", treeNodeTask.getParentNode());
	}

	protected void renderPrevSibling(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "prevSibling", treeNodeTask.getPrevSibling());
	}

	protected void renderRendered(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderBoolean(responseWriter, "rendered", treeNodeTask.getRendered());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, TreeNodeTask treeNodeTask) throws IOException {
		renderString(responseWriter, "tabIndex", treeNodeTask.getTabIndex());
	}

}