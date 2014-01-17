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
public abstract class TreeNodeIORendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeNodeIO treeNodeIO = (TreeNodeIO) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeNodeIO = new A.TreeNodeIO");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renderedAttributes, treeNodeIO);
		renderBoundingBox(renderedAttributes, treeNodeIO);
		renderCache(renderedAttributes, treeNodeIO);
		renderTreeNodeIOChildren(renderedAttributes, treeNodeIO);
		renderContainer(renderedAttributes, treeNodeIO);
		renderContentBox(renderedAttributes, treeNodeIO);
		renderCssClasses(renderedAttributes, treeNodeIO);
		renderDestroyed(renderedAttributes, treeNodeIO);
		renderDraggable(renderedAttributes, treeNodeIO);
		renderExpanded(renderedAttributes, treeNodeIO);
		renderHitAreaEl(renderedAttributes, treeNodeIO);
		renderIconEl(renderedAttributes, treeNodeIO);
		renderTreeNodeIOId(renderedAttributes, treeNodeIO);
		renderIndex(renderedAttributes, treeNodeIO);
		renderInitialized(renderedAttributes, treeNodeIO);
		renderIo(renderedAttributes, treeNodeIO);
		renderLabel(renderedAttributes, treeNodeIO);
		renderLabelEl(renderedAttributes, treeNodeIO);
		renderLeaf(renderedAttributes, treeNodeIO);
		renderLoaded(renderedAttributes, treeNodeIO);
		renderLoading(renderedAttributes, treeNodeIO);
		renderNextSibling(renderedAttributes, treeNodeIO);
		renderOwnerTree(renderedAttributes, treeNodeIO);
		renderPaginator(renderedAttributes, treeNodeIO);
		renderParentNode(renderedAttributes, treeNodeIO);
		renderPrevSibling(renderedAttributes, treeNodeIO);
		renderRendered(renderedAttributes, treeNodeIO);
		renderTabIndex(renderedAttributes, treeNodeIO);

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

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNodeIO.getAlwaysShowHitArea();

		if (alwaysShowHitArea != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String boundingBox = treeNodeIO.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(TreeNodeIO.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCache(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean cache = treeNodeIO.getCache();

		if (cache != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.CACHE, cache));
		}
	}

	protected void renderTreeNodeIOChildren(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object treeNodeIOChildren = treeNodeIO.getTreeNodeIOChildren();

		if (treeNodeIOChildren != null) {
			renderedAttributes.add(renderArray(TreeNodeIO.TREE_NODE_IOCHILDREN, treeNodeIOChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String container = treeNodeIO.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeNodeIO.CONTAINER, container));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String contentBox = treeNodeIO.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(TreeNodeIO.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object cssClasses = treeNodeIO.getCssClasses();

		if (cssClasses != null) {
			renderedAttributes.add(renderObject(TreeNodeIO.CSS_CLASSES, cssClasses));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean destroyed = treeNodeIO.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.DESTROYED, destroyed));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean draggable = treeNodeIO.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.DRAGGABLE, draggable));
		}
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean expanded = treeNodeIO.getExpanded();

		if (expanded != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.EXPANDED, expanded));
		}
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String hitAreaEl = treeNodeIO.getHitAreaEl();

		if (hitAreaEl != null) {
			renderedAttributes.add(renderString(TreeNodeIO.HIT_AREA_EL, hitAreaEl));
		}
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String iconEl = treeNodeIO.getIconEl();

		if (iconEl != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ICON_EL, iconEl));
		}
	}

	protected void renderTreeNodeIOId(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String treeNodeIOId = treeNodeIO.getTreeNodeIOId();

		if (treeNodeIOId != null) {
			renderedAttributes.add(renderString(TreeNodeIO.TREE_NODE_IOID, treeNodeIOId));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object index = treeNodeIO.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeNodeIO.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean initialized = treeNodeIO.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.INITIALIZED, initialized));
		}
	}

	protected void renderIo(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object io = treeNodeIO.getIo();

		if (io != null) {
			renderedAttributes.add(renderObject(TreeNodeIO.IO, io));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String label = treeNodeIO.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(TreeNodeIO.LABEL, label));
		}
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String labelEl = treeNodeIO.getLabelEl();

		if (labelEl != null) {
			renderedAttributes.add(renderString(TreeNodeIO.LABEL_EL, labelEl));
		}
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean leaf = treeNodeIO.getLeaf();

		if (leaf != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.LEAF, leaf));
		}
	}

	protected void renderLoaded(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean loaded = treeNodeIO.getLoaded();

		if (loaded != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.LOADED, loaded));
		}
	}

	protected void renderLoading(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean loading = treeNodeIO.getLoading();

		if (loading != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.LOADING, loading));
		}
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object nextSibling = treeNodeIO.getNextSibling();

		if (nextSibling != null) {
			renderedAttributes.add(renderString(TreeNodeIO.NEXT_SIBLING, nextSibling));
		}
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object ownerTree = treeNodeIO.getOwnerTree();

		if (ownerTree != null) {
			renderedAttributes.add(renderString(TreeNodeIO.OWNER_TREE, ownerTree));
		}
	}

	protected void renderPaginator(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object paginator = treeNodeIO.getPaginator();

		if (paginator != null) {
			renderedAttributes.add(renderObject(TreeNodeIO.PAGINATOR, paginator));
		}
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object parentNode = treeNodeIO.getParentNode();

		if (parentNode != null) {
			renderedAttributes.add(renderString(TreeNodeIO.PARENT_NODE, parentNode));
		}
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object prevSibling = treeNodeIO.getPrevSibling();

		if (prevSibling != null) {
			renderedAttributes.add(renderString(TreeNodeIO.PREV_SIBLING, prevSibling));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean rendered = treeNodeIO.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(TreeNodeIO.RENDERED, rendered));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String tabIndex = treeNodeIO.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderString(TreeNodeIO.TAB_INDEX, tabIndex));
		}
	}

}