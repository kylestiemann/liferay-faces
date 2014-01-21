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

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
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

		if (treeNodeCheck.getAlwaysShowHitArea() != null) {
			renderAlwaysShowHitArea(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getCache() != null) {
			renderCache(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getCheckContainerEl() != null) {
			renderCheckContainerEl(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getCheckEl() != null) {
			renderCheckEl(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getCheckName() != null) {
			renderCheckName(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getChecked() != null) {
			renderChecked(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getTreeNodeCheckChildren() != null) {
			renderTreeNodeCheckChildren(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getContainer() != null) {
			renderContainer(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getContentBox() != null) {
			renderContentBox(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getCssClasses() != null) {
			renderCssClasses(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getDraggable() != null) {
			renderDraggable(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getExpanded() != null) {
			renderExpanded(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getHitAreaEl() != null) {
			renderHitAreaEl(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getIconEl() != null) {
			renderIconEl(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getTreeNodeCheckId() != null) {
			renderTreeNodeCheckId(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getIndex() != null) {
			renderIndex(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getInitialized() != null) {
			renderInitialized(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getIo() != null) {
			renderIo(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getLabel() != null) {
			renderLabel(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getLabelEl() != null) {
			renderLabelEl(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getLeaf() != null) {
			renderLeaf(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getLoaded() != null) {
			renderLoaded(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getLoading() != null) {
			renderLoading(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getNextSibling() != null) {
			renderNextSibling(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getOwnerTree() != null) {
			renderOwnerTree(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getPaginator() != null) {
			renderPaginator(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getParentNode() != null) {
			renderParentNode(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getPrevSibling() != null) {
			renderPrevSibling(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getRendered() != null) {
			renderRendered(renderedAttributes, treeNodeCheck);
		}

		if (treeNodeCheck.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, treeNodeCheck);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (treeNodeCheck.getAfterAlwaysShowHitAreaChange() != null) {
			renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterCacheChange() != null) {
			renderAfterCacheChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterCheckContainerElChange() != null) {
			renderAfterCheckContainerElChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterCheckElChange() != null) {
			renderAfterCheckElChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterCheckNameChange() != null) {
			renderAfterCheckNameChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterCheckedChange() != null) {
			renderAfterCheckedChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterChildrenChange() != null) {
			renderAfterChildrenChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterCssClassesChange() != null) {
			renderAfterCssClassesChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterDraggableChange() != null) {
			renderAfterDraggableChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterExpandedChange() != null) {
			renderAfterExpandedChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterHitAreaElChange() != null) {
			renderAfterHitAreaElChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterIconElChange() != null) {
			renderAfterIconElChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterIndexChange() != null) {
			renderAfterIndexChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterIoChange() != null) {
			renderAfterIoChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterLabelElChange() != null) {
			renderAfterLabelElChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterLeafChange() != null) {
			renderAfterLeafChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterLoadedChange() != null) {
			renderAfterLoadedChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterLoadingChange() != null) {
			renderAfterLoadingChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterNextSiblingChange() != null) {
			renderAfterNextSiblingChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterOwnerTreeChange() != null) {
			renderAfterOwnerTreeChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterPaginatorChange() != null) {
			renderAfterPaginatorChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterParentNodeChange() != null) {
			renderAfterParentNodeChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterPrevSiblingChange() != null) {
			renderAfterPrevSiblingChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, treeNodeCheck);
		}


		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		if (treeNodeCheck.getOnAlwaysShowHitAreaChange() != null) {
			renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnCacheChange() != null) {
			renderOnCacheChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnCheckContainerElChange() != null) {
			renderOnCheckContainerElChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnCheckElChange() != null) {
			renderOnCheckElChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnCheckNameChange() != null) {
			renderOnCheckNameChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnCheckedChange() != null) {
			renderOnCheckedChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnChildrenChange() != null) {
			renderOnChildrenChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnCssClassesChange() != null) {
			renderOnCssClassesChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnDraggableChange() != null) {
			renderOnDraggableChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnExpandedChange() != null) {
			renderOnExpandedChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnHitAreaElChange() != null) {
			renderOnHitAreaElChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnIconElChange() != null) {
			renderOnIconElChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnIndexChange() != null) {
			renderOnIndexChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnIoChange() != null) {
			renderOnIoChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnLabelElChange() != null) {
			renderOnLabelElChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnLeafChange() != null) {
			renderOnLeafChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnLoadedChange() != null) {
			renderOnLoadedChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnLoadingChange() != null) {
			renderOnLoadingChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnNextSiblingChange() != null) {
			renderOnNextSiblingChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnOwnerTreeChange() != null) {
			renderOnOwnerTreeChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnPaginatorChange() != null) {
			renderOnPaginatorChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnParentNodeChange() != null) {
			renderOnParentNodeChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnPrevSiblingChange() != null) {
			renderOnPrevSiblingChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, treeNodeCheck);
		}

		if (treeNodeCheck.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, treeNodeCheck);
		}


		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
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
		renderedAttributes.add(renderBoolean(TreeNodeCheck.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String boundingBox = treeNodeCheck.getBoundingBox();
		renderedAttributes.add(renderString(TreeNodeCheck.BOUNDING_BOX, boundingBox));
	}

	protected void renderCache(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean cache = treeNodeCheck.getCache();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.CACHE, cache));
	}

	protected void renderCheckContainerEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String checkContainerEl = treeNodeCheck.getCheckContainerEl();
		renderedAttributes.add(renderString(TreeNodeCheck.CHECK_CONTAINER_EL, checkContainerEl));
	}

	protected void renderCheckEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String checkEl = treeNodeCheck.getCheckEl();
		renderedAttributes.add(renderString(TreeNodeCheck.CHECK_EL, checkEl));
	}

	protected void renderCheckName(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String checkName = treeNodeCheck.getCheckName();
		renderedAttributes.add(renderString(TreeNodeCheck.CHECK_NAME, checkName));
	}

	protected void renderChecked(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean checked = treeNodeCheck.getChecked();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.CHECKED, checked));
	}

	protected void renderTreeNodeCheckChildren(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object treeNodeCheckChildren = treeNodeCheck.getTreeNodeCheckChildren();
		renderedAttributes.add(renderArray(TreeNodeCheck.TREE_NODE_CHECK_CHILDREN, treeNodeCheckChildren));
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String container = treeNodeCheck.getContainer();
		renderedAttributes.add(renderString(TreeNodeCheck.CONTAINER, container));
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String contentBox = treeNodeCheck.getContentBox();
		renderedAttributes.add(renderString(TreeNodeCheck.CONTENT_BOX, contentBox));
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object cssClasses = treeNodeCheck.getCssClasses();
		renderedAttributes.add(renderObject(TreeNodeCheck.CSS_CLASSES, cssClasses));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean destroyed = treeNodeCheck.getDestroyed();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.DESTROYED, destroyed));
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean draggable = treeNodeCheck.getDraggable();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.DRAGGABLE, draggable));
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean expanded = treeNodeCheck.getExpanded();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.EXPANDED, expanded));
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String hitAreaEl = treeNodeCheck.getHitAreaEl();
		renderedAttributes.add(renderString(TreeNodeCheck.HIT_AREA_EL, hitAreaEl));
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String iconEl = treeNodeCheck.getIconEl();
		renderedAttributes.add(renderString(TreeNodeCheck.ICON_EL, iconEl));
	}

	protected void renderTreeNodeCheckId(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String treeNodeCheckId = treeNodeCheck.getTreeNodeCheckId();
		renderedAttributes.add(renderString(TreeNodeCheck.TREE_NODE_CHECK_ID, treeNodeCheckId));
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object index = treeNodeCheck.getIndex();
		renderedAttributes.add(renderObject(TreeNodeCheck.INDEX, index));
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean initialized = treeNodeCheck.getInitialized();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.INITIALIZED, initialized));
	}

	protected void renderIo(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object io = treeNodeCheck.getIo();
		renderedAttributes.add(renderObject(TreeNodeCheck.IO, io));
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String label = treeNodeCheck.getLabel();
		renderedAttributes.add(renderString(TreeNodeCheck.LABEL, label));
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String labelEl = treeNodeCheck.getLabelEl();
		renderedAttributes.add(renderString(TreeNodeCheck.LABEL_EL, labelEl));
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean leaf = treeNodeCheck.getLeaf();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.LEAF, leaf));
	}

	protected void renderLoaded(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean loaded = treeNodeCheck.getLoaded();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.LOADED, loaded));
	}

	protected void renderLoading(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean loading = treeNodeCheck.getLoading();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.LOADING, loading));
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object nextSibling = treeNodeCheck.getNextSibling();
		renderedAttributes.add(renderString(TreeNodeCheck.NEXT_SIBLING, nextSibling));
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object ownerTree = treeNodeCheck.getOwnerTree();
		renderedAttributes.add(renderString(TreeNodeCheck.OWNER_TREE, ownerTree));
	}

	protected void renderPaginator(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object paginator = treeNodeCheck.getPaginator();
		renderedAttributes.add(renderObject(TreeNodeCheck.PAGINATOR, paginator));
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object parentNode = treeNodeCheck.getParentNode();
		renderedAttributes.add(renderString(TreeNodeCheck.PARENT_NODE, parentNode));
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Object prevSibling = treeNodeCheck.getPrevSibling();
		renderedAttributes.add(renderString(TreeNodeCheck.PREV_SIBLING, prevSibling));
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.Boolean rendered = treeNodeCheck.getRendered();
		renderedAttributes.add(renderBoolean(TreeNodeCheck.RENDERED, rendered));
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String tabIndex = treeNodeCheck.getTabIndex();
		renderedAttributes.add(renderString(TreeNodeCheck.TAB_INDEX, tabIndex));
	}

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNodeCheck.getAfterAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNodeCheck.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCacheChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCacheChange = treeNodeCheck.getAfterCacheChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CACHE_CHANGE, afterCacheChange));
	}

	protected void renderAfterCheckContainerElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCheckContainerElChange = treeNodeCheck.getAfterCheckContainerElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHECK_CONTAINER_EL_CHANGE, afterCheckContainerElChange));
	}

	protected void renderAfterCheckElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCheckElChange = treeNodeCheck.getAfterCheckElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHECK_EL_CHANGE, afterCheckElChange));
	}

	protected void renderAfterCheckNameChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCheckNameChange = treeNodeCheck.getAfterCheckNameChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHECK_NAME_CHANGE, afterCheckNameChange));
	}

	protected void renderAfterCheckedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCheckedChange = treeNodeCheck.getAfterCheckedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHECKED_CHANGE, afterCheckedChange));
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterChildrenChange = treeNodeCheck.getAfterChildrenChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHILDREN_CHANGE, afterChildrenChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterContainerChange = treeNodeCheck.getAfterContainerChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterContentBoxChange = treeNodeCheck.getAfterContentBoxChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCssClassesChange = treeNodeCheck.getAfterCssClassesChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterDestroyedChange = treeNodeCheck.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterDraggableChange = treeNodeCheck.getAfterDraggableChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterExpandedChange = treeNodeCheck.getAfterExpandedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_EXPANDED_CHANGE, afterExpandedChange));
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterHitAreaElChange = treeNodeCheck.getAfterHitAreaElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterIconElChange = treeNodeCheck.getAfterIconElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_ICON_EL_CHANGE, afterIconElChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterIdChange = treeNodeCheck.getAfterIdChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterIndexChange = treeNodeCheck.getAfterIndexChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_INDEX_CHANGE, afterIndexChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterInitializedChange = treeNodeCheck.getAfterInitializedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIoChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterIoChange = treeNodeCheck.getAfterIoChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_IO_CHANGE, afterIoChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLabelChange = treeNodeCheck.getAfterLabelChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLabelElChange = treeNodeCheck.getAfterLabelElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLeafChange = treeNodeCheck.getAfterLeafChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LEAF_CHANGE, afterLeafChange));
	}

	protected void renderAfterLoadedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLoadedChange = treeNodeCheck.getAfterLoadedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LOADED_CHANGE, afterLoadedChange));
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLoadingChange = treeNodeCheck.getAfterLoadingChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LOADING_CHANGE, afterLoadingChange));
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterNextSiblingChange = treeNodeCheck.getAfterNextSiblingChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNodeCheck.getAfterOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
	}

	protected void renderAfterPaginatorChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterPaginatorChange = treeNodeCheck.getAfterPaginatorChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_PAGINATOR_CHANGE, afterPaginatorChange));
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterParentNodeChange = treeNodeCheck.getAfterParentNodeChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNodeCheck.getAfterPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterRenderedChange = treeNodeCheck.getAfterRenderedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterTabIndexChange = treeNodeCheck.getAfterTabIndexChange();
		renderedAttributes.add(renderString(TreeNodeCheck.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNodeCheck.getOnAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onBoundingBoxChange = treeNodeCheck.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCacheChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCacheChange = treeNodeCheck.getOnCacheChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_CACHE_CHANGE, onCacheChange));
	}

	protected void renderOnCheckContainerElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCheckContainerElChange = treeNodeCheck.getOnCheckContainerElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_CHECK_CONTAINER_EL_CHANGE, onCheckContainerElChange));
	}

	protected void renderOnCheckElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCheckElChange = treeNodeCheck.getOnCheckElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_CHECK_EL_CHANGE, onCheckElChange));
	}

	protected void renderOnCheckNameChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCheckNameChange = treeNodeCheck.getOnCheckNameChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_CHECK_NAME_CHANGE, onCheckNameChange));
	}

	protected void renderOnCheckedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCheckedChange = treeNodeCheck.getOnCheckedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_CHECKED_CHANGE, onCheckedChange));
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onChildrenChange = treeNodeCheck.getOnChildrenChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_CHILDREN_CHANGE, onChildrenChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onContainerChange = treeNodeCheck.getOnContainerChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onContentBoxChange = treeNodeCheck.getOnContentBoxChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCssClassesChange = treeNodeCheck.getOnCssClassesChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onDestroyedChange = treeNodeCheck.getOnDestroyedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onDraggableChange = treeNodeCheck.getOnDraggableChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_DRAGGABLE_CHANGE, onDraggableChange));
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onExpandedChange = treeNodeCheck.getOnExpandedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_EXPANDED_CHANGE, onExpandedChange));
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onHitAreaElChange = treeNodeCheck.getOnHitAreaElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onIconElChange = treeNodeCheck.getOnIconElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_ICON_EL_CHANGE, onIconElChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onIdChange = treeNodeCheck.getOnIdChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onIndexChange = treeNodeCheck.getOnIndexChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_INDEX_CHANGE, onIndexChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onInitializedChange = treeNodeCheck.getOnInitializedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIoChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onIoChange = treeNodeCheck.getOnIoChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_IO_CHANGE, onIoChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLabelChange = treeNodeCheck.getOnLabelChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLabelElChange = treeNodeCheck.getOnLabelElChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_LABEL_EL_CHANGE, onLabelElChange));
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLeafChange = treeNodeCheck.getOnLeafChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_LEAF_CHANGE, onLeafChange));
	}

	protected void renderOnLoadedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLoadedChange = treeNodeCheck.getOnLoadedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_LOADED_CHANGE, onLoadedChange));
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLoadingChange = treeNodeCheck.getOnLoadingChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_LOADING_CHANGE, onLoadingChange));
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onNextSiblingChange = treeNodeCheck.getOnNextSiblingChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onOwnerTreeChange = treeNodeCheck.getOnOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
	}

	protected void renderOnPaginatorChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onPaginatorChange = treeNodeCheck.getOnPaginatorChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_PAGINATOR_CHANGE, onPaginatorChange));
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onParentNodeChange = treeNodeCheck.getOnParentNodeChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_PARENT_NODE_CHANGE, onParentNodeChange));
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onPrevSiblingChange = treeNodeCheck.getOnPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onRenderedChange = treeNodeCheck.getOnRenderedChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onTabIndexChange = treeNodeCheck.getOnTabIndexChange();
		renderedAttributes.add(renderString(TreeNodeCheck.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

}