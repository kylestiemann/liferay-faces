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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNodeCheck);
		renderAfterBoundingBoxChange(renderedAfterEvents, treeNodeCheck);
		renderAfterCacheChange(renderedAfterEvents, treeNodeCheck);
		renderAfterCheckContainerElChange(renderedAfterEvents, treeNodeCheck);
		renderAfterCheckElChange(renderedAfterEvents, treeNodeCheck);
		renderAfterCheckNameChange(renderedAfterEvents, treeNodeCheck);
		renderAfterCheckedChange(renderedAfterEvents, treeNodeCheck);
		renderAfterChildrenChange(renderedAfterEvents, treeNodeCheck);
		renderAfterContainerChange(renderedAfterEvents, treeNodeCheck);
		renderAfterContentBoxChange(renderedAfterEvents, treeNodeCheck);
		renderAfterCssClassesChange(renderedAfterEvents, treeNodeCheck);
		renderAfterDestroyedChange(renderedAfterEvents, treeNodeCheck);
		renderAfterDraggableChange(renderedAfterEvents, treeNodeCheck);
		renderAfterExpandedChange(renderedAfterEvents, treeNodeCheck);
		renderAfterHitAreaElChange(renderedAfterEvents, treeNodeCheck);
		renderAfterIconElChange(renderedAfterEvents, treeNodeCheck);
		renderAfterIdChange(renderedAfterEvents, treeNodeCheck);
		renderAfterIndexChange(renderedAfterEvents, treeNodeCheck);
		renderAfterInitializedChange(renderedAfterEvents, treeNodeCheck);
		renderAfterIoChange(renderedAfterEvents, treeNodeCheck);
		renderAfterLabelChange(renderedAfterEvents, treeNodeCheck);
		renderAfterLabelElChange(renderedAfterEvents, treeNodeCheck);
		renderAfterLeafChange(renderedAfterEvents, treeNodeCheck);
		renderAfterLoadedChange(renderedAfterEvents, treeNodeCheck);
		renderAfterLoadingChange(renderedAfterEvents, treeNodeCheck);
		renderAfterNextSiblingChange(renderedAfterEvents, treeNodeCheck);
		renderAfterOwnerTreeChange(renderedAfterEvents, treeNodeCheck);
		renderAfterPaginatorChange(renderedAfterEvents, treeNodeCheck);
		renderAfterParentNodeChange(renderedAfterEvents, treeNodeCheck);
		renderAfterPrevSiblingChange(renderedAfterEvents, treeNodeCheck);
		renderAfterRenderedChange(renderedAfterEvents, treeNodeCheck);
		renderAfterTabIndexChange(renderedAfterEvents, treeNodeCheck);

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

		renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNodeCheck);
		renderOnBoundingBoxChange(renderedOnEvents, treeNodeCheck);
		renderOnCacheChange(renderedOnEvents, treeNodeCheck);
		renderOnCheckContainerElChange(renderedOnEvents, treeNodeCheck);
		renderOnCheckElChange(renderedOnEvents, treeNodeCheck);
		renderOnCheckNameChange(renderedOnEvents, treeNodeCheck);
		renderOnCheckedChange(renderedOnEvents, treeNodeCheck);
		renderOnChildrenChange(renderedOnEvents, treeNodeCheck);
		renderOnContainerChange(renderedOnEvents, treeNodeCheck);
		renderOnContentBoxChange(renderedOnEvents, treeNodeCheck);
		renderOnCssClassesChange(renderedOnEvents, treeNodeCheck);
		renderOnDestroyedChange(renderedOnEvents, treeNodeCheck);
		renderOnDraggableChange(renderedOnEvents, treeNodeCheck);
		renderOnExpandedChange(renderedOnEvents, treeNodeCheck);
		renderOnHitAreaElChange(renderedOnEvents, treeNodeCheck);
		renderOnIconElChange(renderedOnEvents, treeNodeCheck);
		renderOnIdChange(renderedOnEvents, treeNodeCheck);
		renderOnIndexChange(renderedOnEvents, treeNodeCheck);
		renderOnInitializedChange(renderedOnEvents, treeNodeCheck);
		renderOnIoChange(renderedOnEvents, treeNodeCheck);
		renderOnLabelChange(renderedOnEvents, treeNodeCheck);
		renderOnLabelElChange(renderedOnEvents, treeNodeCheck);
		renderOnLeafChange(renderedOnEvents, treeNodeCheck);
		renderOnLoadedChange(renderedOnEvents, treeNodeCheck);
		renderOnLoadingChange(renderedOnEvents, treeNodeCheck);
		renderOnNextSiblingChange(renderedOnEvents, treeNodeCheck);
		renderOnOwnerTreeChange(renderedOnEvents, treeNodeCheck);
		renderOnPaginatorChange(renderedOnEvents, treeNodeCheck);
		renderOnParentNodeChange(renderedOnEvents, treeNodeCheck);
		renderOnPrevSiblingChange(renderedOnEvents, treeNodeCheck);
		renderOnRenderedChange(renderedOnEvents, treeNodeCheck);
		renderOnTabIndexChange(renderedOnEvents, treeNodeCheck);

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

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNodeCheck.getAfterAlwaysShowHitAreaChange();

		if (afterAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNodeCheck.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCacheChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCacheChange = treeNodeCheck.getAfterCacheChange();

		if (afterCacheChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CACHE_CHANGE, afterCacheChange));
		}
	}

	protected void renderAfterCheckContainerElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCheckContainerElChange = treeNodeCheck.getAfterCheckContainerElChange();

		if (afterCheckContainerElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHECK_CONTAINER_EL_CHANGE, afterCheckContainerElChange));
		}
	}

	protected void renderAfterCheckElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCheckElChange = treeNodeCheck.getAfterCheckElChange();

		if (afterCheckElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHECK_EL_CHANGE, afterCheckElChange));
		}
	}

	protected void renderAfterCheckNameChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCheckNameChange = treeNodeCheck.getAfterCheckNameChange();

		if (afterCheckNameChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHECK_NAME_CHANGE, afterCheckNameChange));
		}
	}

	protected void renderAfterCheckedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCheckedChange = treeNodeCheck.getAfterCheckedChange();

		if (afterCheckedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHECKED_CHANGE, afterCheckedChange));
		}
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterChildrenChange = treeNodeCheck.getAfterChildrenChange();

		if (afterChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CHILDREN_CHANGE, afterChildrenChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterContainerChange = treeNodeCheck.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterContentBoxChange = treeNodeCheck.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterCssClassesChange = treeNodeCheck.getAfterCssClassesChange();

		if (afterCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterDestroyedChange = treeNodeCheck.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterDraggableChange = treeNodeCheck.getAfterDraggableChange();

		if (afterDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
		}
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterExpandedChange = treeNodeCheck.getAfterExpandedChange();

		if (afterExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_EXPANDED_CHANGE, afterExpandedChange));
		}
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterHitAreaElChange = treeNodeCheck.getAfterHitAreaElChange();

		if (afterHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
		}
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterIconElChange = treeNodeCheck.getAfterIconElChange();

		if (afterIconElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_ICON_EL_CHANGE, afterIconElChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterIdChange = treeNodeCheck.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterIndexChange = treeNodeCheck.getAfterIndexChange();

		if (afterIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_INDEX_CHANGE, afterIndexChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterInitializedChange = treeNodeCheck.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIoChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterIoChange = treeNodeCheck.getAfterIoChange();

		if (afterIoChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_IO_CHANGE, afterIoChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLabelChange = treeNodeCheck.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLabelElChange = treeNodeCheck.getAfterLabelElChange();

		if (afterLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
		}
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLeafChange = treeNodeCheck.getAfterLeafChange();

		if (afterLeafChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LEAF_CHANGE, afterLeafChange));
		}
	}

	protected void renderAfterLoadedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLoadedChange = treeNodeCheck.getAfterLoadedChange();

		if (afterLoadedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LOADED_CHANGE, afterLoadedChange));
		}
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterLoadingChange = treeNodeCheck.getAfterLoadingChange();

		if (afterLoadingChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_LOADING_CHANGE, afterLoadingChange));
		}
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterNextSiblingChange = treeNodeCheck.getAfterNextSiblingChange();

		if (afterNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
		}
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNodeCheck.getAfterOwnerTreeChange();

		if (afterOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
		}
	}

	protected void renderAfterPaginatorChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterPaginatorChange = treeNodeCheck.getAfterPaginatorChange();

		if (afterPaginatorChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_PAGINATOR_CHANGE, afterPaginatorChange));
		}
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterParentNodeChange = treeNodeCheck.getAfterParentNodeChange();

		if (afterParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
		}
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNodeCheck.getAfterPrevSiblingChange();

		if (afterPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterRenderedChange = treeNodeCheck.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String afterTabIndexChange = treeNodeCheck.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNodeCheck.getOnAlwaysShowHitAreaChange();

		if (onAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onBoundingBoxChange = treeNodeCheck.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCacheChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCacheChange = treeNodeCheck.getOnCacheChange();

		if (onCacheChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_CACHE_CHANGE, onCacheChange));
		}
	}

	protected void renderOnCheckContainerElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCheckContainerElChange = treeNodeCheck.getOnCheckContainerElChange();

		if (onCheckContainerElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_CHECK_CONTAINER_EL_CHANGE, onCheckContainerElChange));
		}
	}

	protected void renderOnCheckElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCheckElChange = treeNodeCheck.getOnCheckElChange();

		if (onCheckElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_CHECK_EL_CHANGE, onCheckElChange));
		}
	}

	protected void renderOnCheckNameChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCheckNameChange = treeNodeCheck.getOnCheckNameChange();

		if (onCheckNameChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_CHECK_NAME_CHANGE, onCheckNameChange));
		}
	}

	protected void renderOnCheckedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCheckedChange = treeNodeCheck.getOnCheckedChange();

		if (onCheckedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_CHECKED_CHANGE, onCheckedChange));
		}
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onChildrenChange = treeNodeCheck.getOnChildrenChange();

		if (onChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_CHILDREN_CHANGE, onChildrenChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onContainerChange = treeNodeCheck.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onContentBoxChange = treeNodeCheck.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onCssClassesChange = treeNodeCheck.getOnCssClassesChange();

		if (onCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onDestroyedChange = treeNodeCheck.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onDraggableChange = treeNodeCheck.getOnDraggableChange();

		if (onDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_DRAGGABLE_CHANGE, onDraggableChange));
		}
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onExpandedChange = treeNodeCheck.getOnExpandedChange();

		if (onExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_EXPANDED_CHANGE, onExpandedChange));
		}
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onHitAreaElChange = treeNodeCheck.getOnHitAreaElChange();

		if (onHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
		}
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onIconElChange = treeNodeCheck.getOnIconElChange();

		if (onIconElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_ICON_EL_CHANGE, onIconElChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onIdChange = treeNodeCheck.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onIndexChange = treeNodeCheck.getOnIndexChange();

		if (onIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_INDEX_CHANGE, onIndexChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onInitializedChange = treeNodeCheck.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIoChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onIoChange = treeNodeCheck.getOnIoChange();

		if (onIoChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_IO_CHANGE, onIoChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLabelChange = treeNodeCheck.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLabelElChange = treeNodeCheck.getOnLabelElChange();

		if (onLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_LABEL_EL_CHANGE, onLabelElChange));
		}
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLeafChange = treeNodeCheck.getOnLeafChange();

		if (onLeafChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_LEAF_CHANGE, onLeafChange));
		}
	}

	protected void renderOnLoadedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLoadedChange = treeNodeCheck.getOnLoadedChange();

		if (onLoadedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_LOADED_CHANGE, onLoadedChange));
		}
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onLoadingChange = treeNodeCheck.getOnLoadingChange();

		if (onLoadingChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_LOADING_CHANGE, onLoadingChange));
		}
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onNextSiblingChange = treeNodeCheck.getOnNextSiblingChange();

		if (onNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
		}
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onOwnerTreeChange = treeNodeCheck.getOnOwnerTreeChange();

		if (onOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
		}
	}

	protected void renderOnPaginatorChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onPaginatorChange = treeNodeCheck.getOnPaginatorChange();

		if (onPaginatorChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_PAGINATOR_CHANGE, onPaginatorChange));
		}
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onParentNodeChange = treeNodeCheck.getOnParentNodeChange();

		if (onParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_PARENT_NODE_CHANGE, onParentNodeChange));
		}
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onPrevSiblingChange = treeNodeCheck.getOnPrevSiblingChange();

		if (onPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onRenderedChange = treeNodeCheck.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		java.lang.String onTabIndexChange = treeNodeCheck.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeCheck.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

}