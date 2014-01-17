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
public abstract class TreeNodeCheckRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeNodeCheck treeNodeCheck = (TreeNodeCheck) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeNodeCheck = new A.TreeNodeCheck");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renderedAttributes, treeNodeCheck);
		renderBoundingBox(renderedAttributes, treeNodeCheck);
		renderCache(renderedAttributes, treeNodeCheck);
		renderCheckContainerEl(renderedAttributes, treeNodeCheck);
		renderCheckEl(renderedAttributes, treeNodeCheck);
		renderCheckName(renderedAttributes, treeNodeCheck);
		renderChecked(renderedAttributes, treeNodeCheck);
		renderTreeNodeCheckChildren(renderedAttributes, treeNodeCheck);
		renderContainer(renderedAttributes, treeNodeCheck);
		renderContentBox(renderedAttributes, treeNodeCheck);
		renderCssClasses(renderedAttributes, treeNodeCheck);
		renderDestroyed(renderedAttributes, treeNodeCheck);
		renderDraggable(renderedAttributes, treeNodeCheck);
		renderExpanded(renderedAttributes, treeNodeCheck);
		renderHitAreaEl(renderedAttributes, treeNodeCheck);
		renderIconEl(renderedAttributes, treeNodeCheck);
		renderTreeNodeCheckId(renderedAttributes, treeNodeCheck);
		renderIndex(renderedAttributes, treeNodeCheck);
		renderInitialized(renderedAttributes, treeNodeCheck);
		renderIo(renderedAttributes, treeNodeCheck);
		renderLabel(renderedAttributes, treeNodeCheck);
		renderLabelEl(renderedAttributes, treeNodeCheck);
		renderLeaf(renderedAttributes, treeNodeCheck);
		renderLoaded(renderedAttributes, treeNodeCheck);
		renderLoading(renderedAttributes, treeNodeCheck);
		renderNextSibling(renderedAttributes, treeNodeCheck);
		renderOwnerTree(renderedAttributes, treeNodeCheck);
		renderPaginator(renderedAttributes, treeNodeCheck);
		renderParentNode(renderedAttributes, treeNodeCheck);
		renderPrevSibling(renderedAttributes, treeNodeCheck);
		renderRendered(renderedAttributes, treeNodeCheck);
		renderTabIndex(renderedAttributes, treeNodeCheck);

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

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNodeCheck.getAlwaysShowHitArea();

		if (alwaysShowHitArea != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String boundingBox = treeNodeCheck.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCache(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean cache = treeNodeCheck.getCache();

		if (cache != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.CACHE, cache));
		}
	}

	protected void renderCheckContainerEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String checkContainerEl = treeNodeCheck.getCheckContainerEl();

		if (checkContainerEl != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.CHECK_CONTAINER_EL, checkContainerEl));
		}
	}

	protected void renderCheckEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String checkEl = treeNodeCheck.getCheckEl();

		if (checkEl != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.CHECK_EL, checkEl));
		}
	}

	protected void renderCheckName(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String checkName = treeNodeCheck.getCheckName();

		if (checkName != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.CHECK_NAME, checkName));
		}
	}

	protected void renderChecked(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean checked = treeNodeCheck.getChecked();

		if (checked != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.CHECKED, checked));
		}
	}

	protected void renderTreeNodeCheckChildren(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object treeNodeCheckChildren = treeNodeCheck.getTreeNodeCheckChildren();

		if (treeNodeCheckChildren != null) {
			renderedAttributes.add(renderArray(TreeNodeCheck.TREE_NODE_CHECK_CHILDREN, treeNodeCheckChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String container = treeNodeCheck.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.CONTAINER, container));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String contentBox = treeNodeCheck.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object cssClasses = treeNodeCheck.getCssClasses();

		if (cssClasses != null) {
			renderedAttributes.add(renderObject(TreeNodeCheck.CSS_CLASSES, cssClasses));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean destroyed = treeNodeCheck.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.DESTROYED, destroyed));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean draggable = treeNodeCheck.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.DRAGGABLE, draggable));
		}
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean expanded = treeNodeCheck.getExpanded();

		if (expanded != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.EXPANDED, expanded));
		}
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String hitAreaEl = treeNodeCheck.getHitAreaEl();

		if (hitAreaEl != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.HIT_AREA_EL, hitAreaEl));
		}
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String iconEl = treeNodeCheck.getIconEl();

		if (iconEl != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ICON_EL, iconEl));
		}
	}

	protected void renderTreeNodeCheckId(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String treeNodeCheckId = treeNodeCheck.getTreeNodeCheckId();

		if (treeNodeCheckId != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.TREE_NODE_CHECK_ID, treeNodeCheckId));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object index = treeNodeCheck.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeNodeCheck.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean initialized = treeNodeCheck.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.INITIALIZED, initialized));
		}
	}

	protected void renderIo(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object io = treeNodeCheck.getIo();

		if (io != null) {
			renderedAttributes.add(renderObject(TreeNodeCheck.IO, io));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String label = treeNodeCheck.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.LABEL, label));
		}
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String labelEl = treeNodeCheck.getLabelEl();

		if (labelEl != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.LABEL_EL, labelEl));
		}
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean leaf = treeNodeCheck.getLeaf();

		if (leaf != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.LEAF, leaf));
		}
	}

	protected void renderLoaded(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean loaded = treeNodeCheck.getLoaded();

		if (loaded != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.LOADED, loaded));
		}
	}

	protected void renderLoading(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean loading = treeNodeCheck.getLoading();

		if (loading != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.LOADING, loading));
		}
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object nextSibling = treeNodeCheck.getNextSibling();

		if (nextSibling != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.NEXT_SIBLING, nextSibling));
		}
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object ownerTree = treeNodeCheck.getOwnerTree();

		if (ownerTree != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.OWNER_TREE, ownerTree));
		}
	}

	protected void renderPaginator(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object paginator = treeNodeCheck.getPaginator();

		if (paginator != null) {
			renderedAttributes.add(renderObject(TreeNodeCheck.PAGINATOR, paginator));
		}
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object parentNode = treeNodeCheck.getParentNode();

		if (parentNode != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.PARENT_NODE, parentNode));
		}
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object prevSibling = treeNodeCheck.getPrevSibling();

		if (prevSibling != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.PREV_SIBLING, prevSibling));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean rendered = treeNodeCheck.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(TreeNodeCheck.RENDERED, rendered));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String tabIndex = treeNodeCheck.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.TAB_INDEX, tabIndex));
		}
	}

}