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
public abstract class TreeNodeTaskRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeNodeTask treeNodeTask = (TreeNodeTask) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeNodeTask = new A.TreeNodeTask");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renderedAttributes, treeNodeTask);
		renderBoundingBox(renderedAttributes, treeNodeTask);
		renderCache(renderedAttributes, treeNodeTask);
		renderCheckContainerEl(renderedAttributes, treeNodeTask);
		renderCheckEl(renderedAttributes, treeNodeTask);
		renderCheckName(renderedAttributes, treeNodeTask);
		renderChecked(renderedAttributes, treeNodeTask);
		renderTreeNodeTaskChildren(renderedAttributes, treeNodeTask);
		renderContainer(renderedAttributes, treeNodeTask);
		renderContentBox(renderedAttributes, treeNodeTask);
		renderCssClasses(renderedAttributes, treeNodeTask);
		renderDestroyed(renderedAttributes, treeNodeTask);
		renderDraggable(renderedAttributes, treeNodeTask);
		renderExpanded(renderedAttributes, treeNodeTask);
		renderHitAreaEl(renderedAttributes, treeNodeTask);
		renderIconEl(renderedAttributes, treeNodeTask);
		renderTreeNodeTaskId(renderedAttributes, treeNodeTask);
		renderIndex(renderedAttributes, treeNodeTask);
		renderInitialized(renderedAttributes, treeNodeTask);
		renderIo(renderedAttributes, treeNodeTask);
		renderLabel(renderedAttributes, treeNodeTask);
		renderLabelEl(renderedAttributes, treeNodeTask);
		renderLeaf(renderedAttributes, treeNodeTask);
		renderLoaded(renderedAttributes, treeNodeTask);
		renderLoading(renderedAttributes, treeNodeTask);
		renderNextSibling(renderedAttributes, treeNodeTask);
		renderOwnerTree(renderedAttributes, treeNodeTask);
		renderPaginator(renderedAttributes, treeNodeTask);
		renderParentNode(renderedAttributes, treeNodeTask);
		renderPrevSibling(renderedAttributes, treeNodeTask);
		renderRendered(renderedAttributes, treeNodeTask);
		renderTabIndex(renderedAttributes, treeNodeTask);

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

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNodeTask.getAlwaysShowHitArea();

		if (alwaysShowHitArea != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String boundingBox = treeNodeTask.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(TreeNodeTask.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCache(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean cache = treeNodeTask.getCache();

		if (cache != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.CACHE, cache));
		}
	}

	protected void renderCheckContainerEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String checkContainerEl = treeNodeTask.getCheckContainerEl();

		if (checkContainerEl != null) {
			renderedAttributes.add(renderString(TreeNodeTask.CHECK_CONTAINER_EL, checkContainerEl));
		}
	}

	protected void renderCheckEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String checkEl = treeNodeTask.getCheckEl();

		if (checkEl != null) {
			renderedAttributes.add(renderString(TreeNodeTask.CHECK_EL, checkEl));
		}
	}

	protected void renderCheckName(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String checkName = treeNodeTask.getCheckName();

		if (checkName != null) {
			renderedAttributes.add(renderString(TreeNodeTask.CHECK_NAME, checkName));
		}
	}

	protected void renderChecked(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean checked = treeNodeTask.getChecked();

		if (checked != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.CHECKED, checked));
		}
	}

	protected void renderTreeNodeTaskChildren(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object treeNodeTaskChildren = treeNodeTask.getTreeNodeTaskChildren();

		if (treeNodeTaskChildren != null) {
			renderedAttributes.add(renderArray(TreeNodeTask.TREE_NODE_TASK_CHILDREN, treeNodeTaskChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String container = treeNodeTask.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeNodeTask.CONTAINER, container));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String contentBox = treeNodeTask.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(TreeNodeTask.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object cssClasses = treeNodeTask.getCssClasses();

		if (cssClasses != null) {
			renderedAttributes.add(renderObject(TreeNodeTask.CSS_CLASSES, cssClasses));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean destroyed = treeNodeTask.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.DESTROYED, destroyed));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean draggable = treeNodeTask.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.DRAGGABLE, draggable));
		}
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean expanded = treeNodeTask.getExpanded();

		if (expanded != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.EXPANDED, expanded));
		}
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String hitAreaEl = treeNodeTask.getHitAreaEl();

		if (hitAreaEl != null) {
			renderedAttributes.add(renderString(TreeNodeTask.HIT_AREA_EL, hitAreaEl));
		}
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String iconEl = treeNodeTask.getIconEl();

		if (iconEl != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ICON_EL, iconEl));
		}
	}

	protected void renderTreeNodeTaskId(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String treeNodeTaskId = treeNodeTask.getTreeNodeTaskId();

		if (treeNodeTaskId != null) {
			renderedAttributes.add(renderString(TreeNodeTask.TREE_NODE_TASK_ID, treeNodeTaskId));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object index = treeNodeTask.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeNodeTask.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean initialized = treeNodeTask.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.INITIALIZED, initialized));
		}
	}

	protected void renderIo(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object io = treeNodeTask.getIo();

		if (io != null) {
			renderedAttributes.add(renderObject(TreeNodeTask.IO, io));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String label = treeNodeTask.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(TreeNodeTask.LABEL, label));
		}
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String labelEl = treeNodeTask.getLabelEl();

		if (labelEl != null) {
			renderedAttributes.add(renderString(TreeNodeTask.LABEL_EL, labelEl));
		}
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean leaf = treeNodeTask.getLeaf();

		if (leaf != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.LEAF, leaf));
		}
	}

	protected void renderLoaded(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean loaded = treeNodeTask.getLoaded();

		if (loaded != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.LOADED, loaded));
		}
	}

	protected void renderLoading(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean loading = treeNodeTask.getLoading();

		if (loading != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.LOADING, loading));
		}
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object nextSibling = treeNodeTask.getNextSibling();

		if (nextSibling != null) {
			renderedAttributes.add(renderString(TreeNodeTask.NEXT_SIBLING, nextSibling));
		}
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object ownerTree = treeNodeTask.getOwnerTree();

		if (ownerTree != null) {
			renderedAttributes.add(renderString(TreeNodeTask.OWNER_TREE, ownerTree));
		}
	}

	protected void renderPaginator(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object paginator = treeNodeTask.getPaginator();

		if (paginator != null) {
			renderedAttributes.add(renderObject(TreeNodeTask.PAGINATOR, paginator));
		}
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object parentNode = treeNodeTask.getParentNode();

		if (parentNode != null) {
			renderedAttributes.add(renderString(TreeNodeTask.PARENT_NODE, parentNode));
		}
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object prevSibling = treeNodeTask.getPrevSibling();

		if (prevSibling != null) {
			renderedAttributes.add(renderString(TreeNodeTask.PREV_SIBLING, prevSibling));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean rendered = treeNodeTask.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(TreeNodeTask.RENDERED, rendered));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String tabIndex = treeNodeTask.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderString(TreeNodeTask.TAB_INDEX, tabIndex));
		}
	}

}