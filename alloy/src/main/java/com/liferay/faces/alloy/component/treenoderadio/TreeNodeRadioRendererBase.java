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
package com.liferay.faces.alloy.component.treenoderadio;

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
public abstract class TreeNodeRadioRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeNodeRadio treeNodeRadio = (TreeNodeRadio) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeNodeRadio = new A.TreeNodeRadio");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renderedAttributes, treeNodeRadio);
		renderBoundingBox(renderedAttributes, treeNodeRadio);
		renderCache(renderedAttributes, treeNodeRadio);
		renderCheckContainerEl(renderedAttributes, treeNodeRadio);
		renderCheckEl(renderedAttributes, treeNodeRadio);
		renderCheckName(renderedAttributes, treeNodeRadio);
		renderChecked(renderedAttributes, treeNodeRadio);
		renderTreenoderadioChildren(renderedAttributes, treeNodeRadio);
		renderContainer(renderedAttributes, treeNodeRadio);
		renderContentBox(renderedAttributes, treeNodeRadio);
		renderCssClasses(renderedAttributes, treeNodeRadio);
		renderDestroyed(renderedAttributes, treeNodeRadio);
		renderDraggable(renderedAttributes, treeNodeRadio);
		renderExpanded(renderedAttributes, treeNodeRadio);
		renderHitAreaEl(renderedAttributes, treeNodeRadio);
		renderIconEl(renderedAttributes, treeNodeRadio);
		renderTreenoderadioId(renderedAttributes, treeNodeRadio);
		renderIndex(renderedAttributes, treeNodeRadio);
		renderInitialized(renderedAttributes, treeNodeRadio);
		renderIo(renderedAttributes, treeNodeRadio);
		renderLabel(renderedAttributes, treeNodeRadio);
		renderLabelEl(renderedAttributes, treeNodeRadio);
		renderLeaf(renderedAttributes, treeNodeRadio);
		renderLoaded(renderedAttributes, treeNodeRadio);
		renderLoading(renderedAttributes, treeNodeRadio);
		renderNextSibling(renderedAttributes, treeNodeRadio);
		renderOwnerTree(renderedAttributes, treeNodeRadio);
		renderPaginator(renderedAttributes, treeNodeRadio);
		renderParentNode(renderedAttributes, treeNodeRadio);
		renderPrevSibling(renderedAttributes, treeNodeRadio);
		renderRendered(renderedAttributes, treeNodeRadio);
		renderTabIndex(renderedAttributes, treeNodeRadio);

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

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNodeRadio.getAlwaysShowHitArea();

		if (alwaysShowHitArea != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String boundingBox = treeNodeRadio.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCache(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean cache = treeNodeRadio.getCache();

		if (cache != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.CACHE, cache));
		}
	}

	protected void renderCheckContainerEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String checkContainerEl = treeNodeRadio.getCheckContainerEl();

		if (checkContainerEl != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.CHECK_CONTAINER_EL, checkContainerEl));
		}
	}

	protected void renderCheckEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String checkEl = treeNodeRadio.getCheckEl();

		if (checkEl != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.CHECK_EL, checkEl));
		}
	}

	protected void renderCheckName(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String checkName = treeNodeRadio.getCheckName();

		if (checkName != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.CHECK_NAME, checkName));
		}
	}

	protected void renderChecked(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean checked = treeNodeRadio.getChecked();

		if (checked != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.CHECKED, checked));
		}
	}

	protected void renderTreenoderadioChildren(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object treenoderadioChildren = treeNodeRadio.getTreenoderadioChildren();

		if (treenoderadioChildren != null) {
			renderedAttributes.add(renderArray(TreeNodeRadio.TREENODERADIO_CHILDREN, treenoderadioChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String container = treeNodeRadio.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.CONTAINER, container));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String contentBox = treeNodeRadio.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object cssClasses = treeNodeRadio.getCssClasses();

		if (cssClasses != null) {
			renderedAttributes.add(renderObject(TreeNodeRadio.CSS_CLASSES, cssClasses));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean destroyed = treeNodeRadio.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.DESTROYED, destroyed));
		}
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean draggable = treeNodeRadio.getDraggable();

		if (draggable != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.DRAGGABLE, draggable));
		}
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean expanded = treeNodeRadio.getExpanded();

		if (expanded != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.EXPANDED, expanded));
		}
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String hitAreaEl = treeNodeRadio.getHitAreaEl();

		if (hitAreaEl != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.HIT_AREA_EL, hitAreaEl));
		}
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String iconEl = treeNodeRadio.getIconEl();

		if (iconEl != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ICON_EL, iconEl));
		}
	}

	protected void renderTreenoderadioId(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String treenoderadioId = treeNodeRadio.getTreenoderadioId();

		if (treenoderadioId != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.TREENODERADIO_ID, treenoderadioId));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object index = treeNodeRadio.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeNodeRadio.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean initialized = treeNodeRadio.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.INITIALIZED, initialized));
		}
	}

	protected void renderIo(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object io = treeNodeRadio.getIo();

		if (io != null) {
			renderedAttributes.add(renderObject(TreeNodeRadio.IO, io));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String label = treeNodeRadio.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.LABEL, label));
		}
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String labelEl = treeNodeRadio.getLabelEl();

		if (labelEl != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.LABEL_EL, labelEl));
		}
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean leaf = treeNodeRadio.getLeaf();

		if (leaf != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.LEAF, leaf));
		}
	}

	protected void renderLoaded(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean loaded = treeNodeRadio.getLoaded();

		if (loaded != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.LOADED, loaded));
		}
	}

	protected void renderLoading(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean loading = treeNodeRadio.getLoading();

		if (loading != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.LOADING, loading));
		}
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object nextSibling = treeNodeRadio.getNextSibling();

		if (nextSibling != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.NEXT_SIBLING, nextSibling));
		}
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object ownerTree = treeNodeRadio.getOwnerTree();

		if (ownerTree != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.OWNER_TREE, ownerTree));
		}
	}

	protected void renderPaginator(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object paginator = treeNodeRadio.getPaginator();

		if (paginator != null) {
			renderedAttributes.add(renderObject(TreeNodeRadio.PAGINATOR, paginator));
		}
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object parentNode = treeNodeRadio.getParentNode();

		if (parentNode != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.PARENT_NODE, parentNode));
		}
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object prevSibling = treeNodeRadio.getPrevSibling();

		if (prevSibling != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.PREV_SIBLING, prevSibling));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean rendered = treeNodeRadio.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(TreeNodeRadio.RENDERED, rendered));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String tabIndex = treeNodeRadio.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.TAB_INDEX, tabIndex));
		}
	}

}