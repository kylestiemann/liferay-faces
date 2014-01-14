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
package com.liferay.faces.alloy.component.treenode;

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
public abstract class TreeNodeRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeNode treeNode = (TreeNode) uiComponent;
		encodeHTML(facesContext, treeNode);
		encodeJavaScript(facesContext, treeNode);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNode treeNode) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNode treeNode) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, treeNode);

		bufferedResponseWriter.write("var treeNode = new Y.TreeNode");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlwaysShowHitArea(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBoundingBox(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTreenodeChildren(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainer(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContentBox(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClasses(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDraggable(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderExpanded(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHitAreaEl(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIconEl(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTreenodeId(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIndex(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelEl(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLeaf(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNextSibling(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOwnerTree(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderParentNode(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPrevSibling(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRendered(bufferedResponseWriter, treeNode);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, treeNode);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, treeNode);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderBoolean(responseWriter, "alwaysShowHitArea", treeNode.getAlwaysShowHitArea());
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "boundingBox", treeNode.getBoundingBox());
	}

	protected void renderTreenodeChildren(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderArray(responseWriter, "treenodeChildren", treeNode.getTreenodeChildren());
	}

	protected void renderContainer(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "container", treeNode.getContainer());
	}

	protected void renderContentBox(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "contentBox", treeNode.getContentBox());
	}

	protected void renderCssClasses(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderObject(responseWriter, "cssClasses", treeNode.getCssClasses());
	}

	protected void renderDraggable(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderBoolean(responseWriter, "draggable", treeNode.getDraggable());
	}

	protected void renderExpanded(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderBoolean(responseWriter, "expanded", treeNode.getExpanded());
	}

	protected void renderHitAreaEl(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "hitAreaEl", treeNode.getHitAreaEl());
	}

	protected void renderIconEl(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "iconEl", treeNode.getIconEl());
	}

	protected void renderTreenodeId(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "treenodeId", treeNode.getTreenodeId());
	}

	protected void renderIndex(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderObject(responseWriter, "index", treeNode.getIndex());
	}

	protected void renderLabel(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "label", treeNode.getLabel());
	}

	protected void renderLabelEl(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "labelEl", treeNode.getLabelEl());
	}

	protected void renderLeaf(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderBoolean(responseWriter, "leaf", treeNode.getLeaf());
	}

	protected void renderNextSibling(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "nextSibling", treeNode.getNextSibling());
	}

	protected void renderOwnerTree(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "ownerTree", treeNode.getOwnerTree());
	}

	protected void renderParentNode(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "parentNode", treeNode.getParentNode());
	}

	protected void renderPrevSibling(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "prevSibling", treeNode.getPrevSibling());
	}

	protected void renderRendered(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderBoolean(responseWriter, "rendered", treeNode.getRendered());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, TreeNode treeNode) throws IOException {
		renderString(responseWriter, "tabIndex", treeNode.getTabIndex());
	}

}