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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeNodeRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeNode treeNode = (TreeNode) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeNode = new A.TreeNode");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renderedAttributes, treeNode);
		renderBoundingBox(renderedAttributes, treeNode);
		renderTreeNodeChildren(renderedAttributes, treeNode);
		renderContainer(renderedAttributes, treeNode);
		renderContentBox(renderedAttributes, treeNode);
		renderCssClasses(renderedAttributes, treeNode);
		renderDestroyed(renderedAttributes, treeNode);
		renderDraggable(renderedAttributes, treeNode);
		renderExpanded(renderedAttributes, treeNode);
		renderHitAreaEl(renderedAttributes, treeNode);
		renderIconEl(renderedAttributes, treeNode);
		renderTreeNodeId(renderedAttributes, treeNode);
		renderIndex(renderedAttributes, treeNode);
		renderInitialized(renderedAttributes, treeNode);
		renderLabel(renderedAttributes, treeNode);
		renderLabelEl(renderedAttributes, treeNode);
		renderLeaf(renderedAttributes, treeNode);
		renderNextSibling(renderedAttributes, treeNode);
		renderOwnerTree(renderedAttributes, treeNode);
		renderParentNode(renderedAttributes, treeNode);
		renderPrevSibling(renderedAttributes, treeNode);
		renderRendered(renderedAttributes, treeNode);
		renderTabIndex(renderedAttributes, treeNode);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNode.getAlwaysShowHitArea();

		if (alwaysShowHitArea != null) {
			renderedAttributes.add(renderBoolean(TreeNode.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String boundingBox = treeNode.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(TreeNode.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderTreeNodeChildren(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object treeNodeChildren = treeNode.getTreeNodeChildren();

		if (treeNodeChildren != null) {
			renderedAttributes.add(renderArray(TreeNode.TREE_NODE_CHILDREN, treeNodeChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String container = treeNode.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeNode.CONTAINER, container));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String contentBox = treeNode.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(TreeNode.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object cssClasses = treeNode.getCssClasses();

		if (cssClasses != null) {
			renderedAttributes.add(renderObject(TreeNode.CSS_CLASSES, cssClasses));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean destroyed = treeNode.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeNode.DESTROYED, destroyed));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean draggable = treeNode.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderBoolean(TreeNode.DRAGGABLE, draggable));
		}
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean expanded = treeNode.getExpanded();

		if (expanded != null) {
			renderedAttributes.add(renderBoolean(TreeNode.EXPANDED, expanded));
		}
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String hitAreaEl = treeNode.getHitAreaEl();

		if (hitAreaEl != null) {
			renderedAttributes.add(renderString(TreeNode.HIT_AREA_EL, hitAreaEl));
		}
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String iconEl = treeNode.getIconEl();

		if (iconEl != null) {
			renderedAttributes.add(renderString(TreeNode.ICON_EL, iconEl));
		}
	}

	protected void renderTreeNodeId(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String treeNodeId = treeNode.getTreeNodeId();

		if (treeNodeId != null) {
			renderedAttributes.add(renderString(TreeNode.TREE_NODE_ID, treeNodeId));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object index = treeNode.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeNode.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean initialized = treeNode.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeNode.INITIALIZED, initialized));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String label = treeNode.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(TreeNode.LABEL, label));
		}
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String labelEl = treeNode.getLabelEl();

		if (labelEl != null) {
			renderedAttributes.add(renderString(TreeNode.LABEL_EL, labelEl));
		}
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean leaf = treeNode.getLeaf();

		if (leaf != null) {
			renderedAttributes.add(renderBoolean(TreeNode.LEAF, leaf));
		}
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object nextSibling = treeNode.getNextSibling();

		if (nextSibling != null) {
			renderedAttributes.add(renderString(TreeNode.NEXT_SIBLING, nextSibling));
		}
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object ownerTree = treeNode.getOwnerTree();

		if (ownerTree != null) {
			renderedAttributes.add(renderString(TreeNode.OWNER_TREE, ownerTree));
		}
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object parentNode = treeNode.getParentNode();

		if (parentNode != null) {
			renderedAttributes.add(renderString(TreeNode.PARENT_NODE, parentNode));
		}
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Object prevSibling = treeNode.getPrevSibling();

		if (prevSibling != null) {
			renderedAttributes.add(renderString(TreeNode.PREV_SIBLING, prevSibling));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.Boolean rendered = treeNode.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(TreeNode.RENDERED, rendered));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNode treeNode) throws IOException {
		java.lang.String tabIndex = treeNode.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderString(TreeNode.TAB_INDEX, tabIndex));
		}
	}

}