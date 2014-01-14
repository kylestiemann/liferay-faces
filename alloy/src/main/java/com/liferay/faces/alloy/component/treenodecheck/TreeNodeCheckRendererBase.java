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
package com.liferay.faces.alloy.component.treenodecheck;

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
public abstract class TreeNodeCheckRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeNodeCheck treeNodeCheck = (TreeNodeCheck) uiComponent;
		encodeHTML(facesContext, treeNodeCheck);
		encodeJavaScript(facesContext, treeNodeCheck);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeCheck treeNodeCheck) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeCheck treeNodeCheck) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, treeNodeCheck);

		bufferedResponseWriter.write("var treeNodeCheck = new Y.TreeNodeCheck");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlwaysShowHitArea(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderBoundingBox(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderCache(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderCheckContainerEl(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderCheckEl(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderCheckName(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderChecked(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderTreenodecheckChildren(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderContainer(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderContentBox(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderCssClasses(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderDraggable(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderExpanded(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderHitAreaEl(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderIconEl(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderTreenodecheckId(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderIndex(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderIo(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderLabelEl(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderLeaf(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderLoaded(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderLoading(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderNextSibling(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderOwnerTree(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderPaginator(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderParentNode(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderPrevSibling(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderRendered(responseWriter, treeNodeCheck);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, treeNodeCheck);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, treeNodeCheck);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderBoolean(responseWriter, "alwaysShowHitArea", treeNodeCheck.getAlwaysShowHitArea());
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "boundingBox", treeNodeCheck.getBoundingBox());
	}

	protected void renderCache(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderBoolean(responseWriter, "cache", treeNodeCheck.getCache());
	}

	protected void renderCheckContainerEl(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "checkContainerEl", treeNodeCheck.getCheckContainerEl());
	}

	protected void renderCheckEl(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "checkEl", treeNodeCheck.getCheckEl());
	}

	protected void renderCheckName(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "checkName", treeNodeCheck.getCheckName());
	}

	protected void renderChecked(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderBoolean(responseWriter, "checked", treeNodeCheck.getChecked());
	}

	protected void renderTreenodecheckChildren(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderArray(responseWriter, "treenodecheckChildren", treeNodeCheck.getTreenodecheckChildren());
	}

	protected void renderContainer(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "container", treeNodeCheck.getContainer());
	}

	protected void renderContentBox(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "contentBox", treeNodeCheck.getContentBox());
	}

	protected void renderCssClasses(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderObject(responseWriter, "cssClasses", treeNodeCheck.getCssClasses());
	}

	protected void renderDraggable(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderBoolean(responseWriter, "draggable", treeNodeCheck.getDraggable());
	}

	protected void renderExpanded(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderBoolean(responseWriter, "expanded", treeNodeCheck.getExpanded());
	}

	protected void renderHitAreaEl(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "hitAreaEl", treeNodeCheck.getHitAreaEl());
	}

	protected void renderIconEl(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "iconEl", treeNodeCheck.getIconEl());
	}

	protected void renderTreenodecheckId(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "treenodecheckId", treeNodeCheck.getTreenodecheckId());
	}

	protected void renderIndex(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderObject(responseWriter, "index", treeNodeCheck.getIndex());
	}

	protected void renderIo(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderObject(responseWriter, "io", treeNodeCheck.getIo());
	}

	protected void renderLabel(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "label", treeNodeCheck.getLabel());
	}

	protected void renderLabelEl(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "labelEl", treeNodeCheck.getLabelEl());
	}

	protected void renderLeaf(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderBoolean(responseWriter, "leaf", treeNodeCheck.getLeaf());
	}

	protected void renderLoaded(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderBoolean(responseWriter, "loaded", treeNodeCheck.getLoaded());
	}

	protected void renderLoading(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderBoolean(responseWriter, "loading", treeNodeCheck.getLoading());
	}

	protected void renderNextSibling(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "nextSibling", treeNodeCheck.getNextSibling());
	}

	protected void renderOwnerTree(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "ownerTree", treeNodeCheck.getOwnerTree());
	}

	protected void renderPaginator(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderObject(responseWriter, "paginator", treeNodeCheck.getPaginator());
	}

	protected void renderParentNode(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "parentNode", treeNodeCheck.getParentNode());
	}

	protected void renderPrevSibling(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "prevSibling", treeNodeCheck.getPrevSibling());
	}

	protected void renderRendered(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderBoolean(responseWriter, "rendered", treeNodeCheck.getRendered());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, TreeNodeCheck treeNodeCheck) throws IOException {
		renderString(responseWriter, "tabIndex", treeNodeCheck.getTabIndex());
	}

}