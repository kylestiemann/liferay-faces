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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNodeTask);
		renderAfterBoundingBoxChange(renderedAfterEvents, treeNodeTask);
		renderAfterCacheChange(renderedAfterEvents, treeNodeTask);
		renderAfterCheckContainerElChange(renderedAfterEvents, treeNodeTask);
		renderAfterCheckElChange(renderedAfterEvents, treeNodeTask);
		renderAfterCheckNameChange(renderedAfterEvents, treeNodeTask);
		renderAfterCheckedChange(renderedAfterEvents, treeNodeTask);
		renderAfterChildrenChange(renderedAfterEvents, treeNodeTask);
		renderAfterContainerChange(renderedAfterEvents, treeNodeTask);
		renderAfterContentBoxChange(renderedAfterEvents, treeNodeTask);
		renderAfterCssClassesChange(renderedAfterEvents, treeNodeTask);
		renderAfterDestroyedChange(renderedAfterEvents, treeNodeTask);
		renderAfterDraggableChange(renderedAfterEvents, treeNodeTask);
		renderAfterExpandedChange(renderedAfterEvents, treeNodeTask);
		renderAfterHitAreaElChange(renderedAfterEvents, treeNodeTask);
		renderAfterIconElChange(renderedAfterEvents, treeNodeTask);
		renderAfterIdChange(renderedAfterEvents, treeNodeTask);
		renderAfterIndexChange(renderedAfterEvents, treeNodeTask);
		renderAfterInitializedChange(renderedAfterEvents, treeNodeTask);
		renderAfterIoChange(renderedAfterEvents, treeNodeTask);
		renderAfterLabelChange(renderedAfterEvents, treeNodeTask);
		renderAfterLabelElChange(renderedAfterEvents, treeNodeTask);
		renderAfterLeafChange(renderedAfterEvents, treeNodeTask);
		renderAfterLoadedChange(renderedAfterEvents, treeNodeTask);
		renderAfterLoadingChange(renderedAfterEvents, treeNodeTask);
		renderAfterNextSiblingChange(renderedAfterEvents, treeNodeTask);
		renderAfterOwnerTreeChange(renderedAfterEvents, treeNodeTask);
		renderAfterPaginatorChange(renderedAfterEvents, treeNodeTask);
		renderAfterParentNodeChange(renderedAfterEvents, treeNodeTask);
		renderAfterPrevSiblingChange(renderedAfterEvents, treeNodeTask);
		renderAfterRenderedChange(renderedAfterEvents, treeNodeTask);
		renderAfterTabIndexChange(renderedAfterEvents, treeNodeTask);

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

		renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNodeTask);
		renderOnBoundingBoxChange(renderedOnEvents, treeNodeTask);
		renderOnCacheChange(renderedOnEvents, treeNodeTask);
		renderOnCheckContainerElChange(renderedOnEvents, treeNodeTask);
		renderOnCheckElChange(renderedOnEvents, treeNodeTask);
		renderOnCheckNameChange(renderedOnEvents, treeNodeTask);
		renderOnCheckedChange(renderedOnEvents, treeNodeTask);
		renderOnChildrenChange(renderedOnEvents, treeNodeTask);
		renderOnContainerChange(renderedOnEvents, treeNodeTask);
		renderOnContentBoxChange(renderedOnEvents, treeNodeTask);
		renderOnCssClassesChange(renderedOnEvents, treeNodeTask);
		renderOnDestroyedChange(renderedOnEvents, treeNodeTask);
		renderOnDraggableChange(renderedOnEvents, treeNodeTask);
		renderOnExpandedChange(renderedOnEvents, treeNodeTask);
		renderOnHitAreaElChange(renderedOnEvents, treeNodeTask);
		renderOnIconElChange(renderedOnEvents, treeNodeTask);
		renderOnIdChange(renderedOnEvents, treeNodeTask);
		renderOnIndexChange(renderedOnEvents, treeNodeTask);
		renderOnInitializedChange(renderedOnEvents, treeNodeTask);
		renderOnIoChange(renderedOnEvents, treeNodeTask);
		renderOnLabelChange(renderedOnEvents, treeNodeTask);
		renderOnLabelElChange(renderedOnEvents, treeNodeTask);
		renderOnLeafChange(renderedOnEvents, treeNodeTask);
		renderOnLoadedChange(renderedOnEvents, treeNodeTask);
		renderOnLoadingChange(renderedOnEvents, treeNodeTask);
		renderOnNextSiblingChange(renderedOnEvents, treeNodeTask);
		renderOnOwnerTreeChange(renderedOnEvents, treeNodeTask);
		renderOnPaginatorChange(renderedOnEvents, treeNodeTask);
		renderOnParentNodeChange(renderedOnEvents, treeNodeTask);
		renderOnPrevSiblingChange(renderedOnEvents, treeNodeTask);
		renderOnRenderedChange(renderedOnEvents, treeNodeTask);
		renderOnTabIndexChange(renderedOnEvents, treeNodeTask);

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

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNodeTask.getAfterAlwaysShowHitAreaChange();

		if (afterAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNodeTask.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCacheChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCacheChange = treeNodeTask.getAfterCacheChange();

		if (afterCacheChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_CACHE_CHANGE, afterCacheChange));
		}
	}

	protected void renderAfterCheckContainerElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCheckContainerElChange = treeNodeTask.getAfterCheckContainerElChange();

		if (afterCheckContainerElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHECK_CONTAINER_EL_CHANGE, afterCheckContainerElChange));
		}
	}

	protected void renderAfterCheckElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCheckElChange = treeNodeTask.getAfterCheckElChange();

		if (afterCheckElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHECK_EL_CHANGE, afterCheckElChange));
		}
	}

	protected void renderAfterCheckNameChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCheckNameChange = treeNodeTask.getAfterCheckNameChange();

		if (afterCheckNameChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHECK_NAME_CHANGE, afterCheckNameChange));
		}
	}

	protected void renderAfterCheckedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCheckedChange = treeNodeTask.getAfterCheckedChange();

		if (afterCheckedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHECKED_CHANGE, afterCheckedChange));
		}
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterChildrenChange = treeNodeTask.getAfterChildrenChange();

		if (afterChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHILDREN_CHANGE, afterChildrenChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterContainerChange = treeNodeTask.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterContentBoxChange = treeNodeTask.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCssClassesChange = treeNodeTask.getAfterCssClassesChange();

		if (afterCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterDestroyedChange = treeNodeTask.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterDraggableChange = treeNodeTask.getAfterDraggableChange();

		if (afterDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
		}
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterExpandedChange = treeNodeTask.getAfterExpandedChange();

		if (afterExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_EXPANDED_CHANGE, afterExpandedChange));
		}
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterHitAreaElChange = treeNodeTask.getAfterHitAreaElChange();

		if (afterHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
		}
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterIconElChange = treeNodeTask.getAfterIconElChange();

		if (afterIconElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_ICON_EL_CHANGE, afterIconElChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterIdChange = treeNodeTask.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterIndexChange = treeNodeTask.getAfterIndexChange();

		if (afterIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_INDEX_CHANGE, afterIndexChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterInitializedChange = treeNodeTask.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIoChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterIoChange = treeNodeTask.getAfterIoChange();

		if (afterIoChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_IO_CHANGE, afterIoChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLabelChange = treeNodeTask.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLabelElChange = treeNodeTask.getAfterLabelElChange();

		if (afterLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
		}
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLeafChange = treeNodeTask.getAfterLeafChange();

		if (afterLeafChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_LEAF_CHANGE, afterLeafChange));
		}
	}

	protected void renderAfterLoadedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLoadedChange = treeNodeTask.getAfterLoadedChange();

		if (afterLoadedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_LOADED_CHANGE, afterLoadedChange));
		}
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLoadingChange = treeNodeTask.getAfterLoadingChange();

		if (afterLoadingChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_LOADING_CHANGE, afterLoadingChange));
		}
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterNextSiblingChange = treeNodeTask.getAfterNextSiblingChange();

		if (afterNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
		}
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNodeTask.getAfterOwnerTreeChange();

		if (afterOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
		}
	}

	protected void renderAfterPaginatorChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterPaginatorChange = treeNodeTask.getAfterPaginatorChange();

		if (afterPaginatorChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_PAGINATOR_CHANGE, afterPaginatorChange));
		}
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterParentNodeChange = treeNodeTask.getAfterParentNodeChange();

		if (afterParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
		}
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNodeTask.getAfterPrevSiblingChange();

		if (afterPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterRenderedChange = treeNodeTask.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterTabIndexChange = treeNodeTask.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNodeTask.getOnAlwaysShowHitAreaChange();

		if (onAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onBoundingBoxChange = treeNodeTask.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCacheChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCacheChange = treeNodeTask.getOnCacheChange();

		if (onCacheChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_CACHE_CHANGE, onCacheChange));
		}
	}

	protected void renderOnCheckContainerElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCheckContainerElChange = treeNodeTask.getOnCheckContainerElChange();

		if (onCheckContainerElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_CHECK_CONTAINER_EL_CHANGE, onCheckContainerElChange));
		}
	}

	protected void renderOnCheckElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCheckElChange = treeNodeTask.getOnCheckElChange();

		if (onCheckElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_CHECK_EL_CHANGE, onCheckElChange));
		}
	}

	protected void renderOnCheckNameChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCheckNameChange = treeNodeTask.getOnCheckNameChange();

		if (onCheckNameChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_CHECK_NAME_CHANGE, onCheckNameChange));
		}
	}

	protected void renderOnCheckedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCheckedChange = treeNodeTask.getOnCheckedChange();

		if (onCheckedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_CHECKED_CHANGE, onCheckedChange));
		}
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onChildrenChange = treeNodeTask.getOnChildrenChange();

		if (onChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_CHILDREN_CHANGE, onChildrenChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onContainerChange = treeNodeTask.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onContentBoxChange = treeNodeTask.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCssClassesChange = treeNodeTask.getOnCssClassesChange();

		if (onCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onDestroyedChange = treeNodeTask.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onDraggableChange = treeNodeTask.getOnDraggableChange();

		if (onDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_DRAGGABLE_CHANGE, onDraggableChange));
		}
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onExpandedChange = treeNodeTask.getOnExpandedChange();

		if (onExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_EXPANDED_CHANGE, onExpandedChange));
		}
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onHitAreaElChange = treeNodeTask.getOnHitAreaElChange();

		if (onHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
		}
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onIconElChange = treeNodeTask.getOnIconElChange();

		if (onIconElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_ICON_EL_CHANGE, onIconElChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onIdChange = treeNodeTask.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onIndexChange = treeNodeTask.getOnIndexChange();

		if (onIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_INDEX_CHANGE, onIndexChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onInitializedChange = treeNodeTask.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIoChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onIoChange = treeNodeTask.getOnIoChange();

		if (onIoChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_IO_CHANGE, onIoChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLabelChange = treeNodeTask.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLabelElChange = treeNodeTask.getOnLabelElChange();

		if (onLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_LABEL_EL_CHANGE, onLabelElChange));
		}
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLeafChange = treeNodeTask.getOnLeafChange();

		if (onLeafChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_LEAF_CHANGE, onLeafChange));
		}
	}

	protected void renderOnLoadedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLoadedChange = treeNodeTask.getOnLoadedChange();

		if (onLoadedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_LOADED_CHANGE, onLoadedChange));
		}
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLoadingChange = treeNodeTask.getOnLoadingChange();

		if (onLoadingChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_LOADING_CHANGE, onLoadingChange));
		}
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onNextSiblingChange = treeNodeTask.getOnNextSiblingChange();

		if (onNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
		}
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onOwnerTreeChange = treeNodeTask.getOnOwnerTreeChange();

		if (onOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
		}
	}

	protected void renderOnPaginatorChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onPaginatorChange = treeNodeTask.getOnPaginatorChange();

		if (onPaginatorChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_PAGINATOR_CHANGE, onPaginatorChange));
		}
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onParentNodeChange = treeNodeTask.getOnParentNodeChange();

		if (onParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_PARENT_NODE_CHANGE, onParentNodeChange));
		}
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onPrevSiblingChange = treeNodeTask.getOnPrevSiblingChange();

		if (onPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onRenderedChange = treeNodeTask.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onTabIndexChange = treeNodeTask.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeTask.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

}