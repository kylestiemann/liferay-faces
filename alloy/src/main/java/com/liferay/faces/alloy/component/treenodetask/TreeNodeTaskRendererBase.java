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

		if (treeNodeTask.getAlwaysShowHitArea() != null) {
			renderAlwaysShowHitArea(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getCache() != null) {
			renderCache(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getCheckContainerEl() != null) {
			renderCheckContainerEl(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getCheckEl() != null) {
			renderCheckEl(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getCheckName() != null) {
			renderCheckName(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getChecked() != null) {
			renderChecked(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getTreeNodeTaskChildren() != null) {
			renderTreeNodeTaskChildren(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getContainer() != null) {
			renderContainer(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getContentBox() != null) {
			renderContentBox(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getCssClasses() != null) {
			renderCssClasses(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getDraggable() != null) {
			renderDraggable(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getExpanded() != null) {
			renderExpanded(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getHitAreaEl() != null) {
			renderHitAreaEl(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getIconEl() != null) {
			renderIconEl(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getTreeNodeTaskId() != null) {
			renderTreeNodeTaskId(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getIndex() != null) {
			renderIndex(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getInitialized() != null) {
			renderInitialized(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getIo() != null) {
			renderIo(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getLabel() != null) {
			renderLabel(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getLabelEl() != null) {
			renderLabelEl(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getLeaf() != null) {
			renderLeaf(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getLoaded() != null) {
			renderLoaded(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getLoading() != null) {
			renderLoading(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getNextSibling() != null) {
			renderNextSibling(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getOwnerTree() != null) {
			renderOwnerTree(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getPaginator() != null) {
			renderPaginator(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getParentNode() != null) {
			renderParentNode(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getPrevSibling() != null) {
			renderPrevSibling(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getRendered() != null) {
			renderRendered(renderedAttributes, treeNodeTask);
		}
		
		if (treeNodeTask.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, treeNodeTask);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (treeNodeTask.getAfterAlwaysShowHitAreaChange() != null) {
			renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterCacheChange() != null) {
			renderAfterCacheChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterCheckContainerElChange() != null) {
			renderAfterCheckContainerElChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterCheckElChange() != null) {
			renderAfterCheckElChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterCheckNameChange() != null) {
			renderAfterCheckNameChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterCheckedChange() != null) {
			renderAfterCheckedChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterChildrenChange() != null) {
			renderAfterChildrenChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterCssClassesChange() != null) {
			renderAfterCssClassesChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterDraggableChange() != null) {
			renderAfterDraggableChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterExpandedChange() != null) {
			renderAfterExpandedChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterHitAreaElChange() != null) {
			renderAfterHitAreaElChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterIconElChange() != null) {
			renderAfterIconElChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterIndexChange() != null) {
			renderAfterIndexChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterIoChange() != null) {
			renderAfterIoChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterLabelElChange() != null) {
			renderAfterLabelElChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterLeafChange() != null) {
			renderAfterLeafChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterLoadedChange() != null) {
			renderAfterLoadedChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterLoadingChange() != null) {
			renderAfterLoadingChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterNextSiblingChange() != null) {
			renderAfterNextSiblingChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterOwnerTreeChange() != null) {
			renderAfterOwnerTreeChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterPaginatorChange() != null) {
			renderAfterPaginatorChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterParentNodeChange() != null) {
			renderAfterParentNodeChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterPrevSiblingChange() != null) {
			renderAfterPrevSiblingChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, treeNodeTask);
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

		if (treeNodeTask.getOnAlwaysShowHitAreaChange() != null) {
			renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnCacheChange() != null) {
			renderOnCacheChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnCheckContainerElChange() != null) {
			renderOnCheckContainerElChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnCheckElChange() != null) {
			renderOnCheckElChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnCheckNameChange() != null) {
			renderOnCheckNameChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnCheckedChange() != null) {
			renderOnCheckedChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnChildrenChange() != null) {
			renderOnChildrenChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnCssClassesChange() != null) {
			renderOnCssClassesChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnDraggableChange() != null) {
			renderOnDraggableChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnExpandedChange() != null) {
			renderOnExpandedChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnHitAreaElChange() != null) {
			renderOnHitAreaElChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnIconElChange() != null) {
			renderOnIconElChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnIndexChange() != null) {
			renderOnIndexChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnIoChange() != null) {
			renderOnIoChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnLabelElChange() != null) {
			renderOnLabelElChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnLeafChange() != null) {
			renderOnLeafChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnLoadedChange() != null) {
			renderOnLoadedChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnLoadingChange() != null) {
			renderOnLoadingChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnNextSiblingChange() != null) {
			renderOnNextSiblingChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnOwnerTreeChange() != null) {
			renderOnOwnerTreeChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnPaginatorChange() != null) {
			renderOnPaginatorChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnParentNodeChange() != null) {
			renderOnParentNodeChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnPrevSiblingChange() != null) {
			renderOnPrevSiblingChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, treeNodeTask);
		}
		
		if (treeNodeTask.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, treeNodeTask);
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

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNodeTask.getAlwaysShowHitArea();
		renderedAttributes.add(renderBoolean(TreeNodeTask.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String boundingBox = treeNodeTask.getBoundingBox();
		renderedAttributes.add(renderString(TreeNodeTask.BOUNDING_BOX, boundingBox));
	}

	protected void renderCache(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean cache = treeNodeTask.getCache();
		renderedAttributes.add(renderBoolean(TreeNodeTask.CACHE, cache));
	}

	protected void renderCheckContainerEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String checkContainerEl = treeNodeTask.getCheckContainerEl();
		renderedAttributes.add(renderString(TreeNodeTask.CHECK_CONTAINER_EL, checkContainerEl));
	}

	protected void renderCheckEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String checkEl = treeNodeTask.getCheckEl();
		renderedAttributes.add(renderString(TreeNodeTask.CHECK_EL, checkEl));
	}

	protected void renderCheckName(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String checkName = treeNodeTask.getCheckName();
		renderedAttributes.add(renderString(TreeNodeTask.CHECK_NAME, checkName));
	}

	protected void renderChecked(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean checked = treeNodeTask.getChecked();
		renderedAttributes.add(renderBoolean(TreeNodeTask.CHECKED, checked));
	}

	protected void renderTreeNodeTaskChildren(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object treeNodeTaskChildren = treeNodeTask.getTreeNodeTaskChildren();
		renderedAttributes.add(renderArray(TreeNodeTask.TREE_NODE_TASK_CHILDREN, treeNodeTaskChildren));
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String container = treeNodeTask.getContainer();
		renderedAttributes.add(renderString(TreeNodeTask.CONTAINER, container));
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String contentBox = treeNodeTask.getContentBox();
		renderedAttributes.add(renderString(TreeNodeTask.CONTENT_BOX, contentBox));
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object cssClasses = treeNodeTask.getCssClasses();
		renderedAttributes.add(renderObject(TreeNodeTask.CSS_CLASSES, cssClasses));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean destroyed = treeNodeTask.getDestroyed();
		renderedAttributes.add(renderBoolean(TreeNodeTask.DESTROYED, destroyed));
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean draggable = treeNodeTask.getDraggable();
		renderedAttributes.add(renderBoolean(TreeNodeTask.DRAGGABLE, draggable));
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean expanded = treeNodeTask.getExpanded();
		renderedAttributes.add(renderBoolean(TreeNodeTask.EXPANDED, expanded));
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String hitAreaEl = treeNodeTask.getHitAreaEl();
		renderedAttributes.add(renderString(TreeNodeTask.HIT_AREA_EL, hitAreaEl));
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String iconEl = treeNodeTask.getIconEl();
		renderedAttributes.add(renderString(TreeNodeTask.ICON_EL, iconEl));
	}

	protected void renderTreeNodeTaskId(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String treeNodeTaskId = treeNodeTask.getTreeNodeTaskId();
		renderedAttributes.add(renderString(TreeNodeTask.TREE_NODE_TASK_ID, treeNodeTaskId));
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object index = treeNodeTask.getIndex();
		renderedAttributes.add(renderObject(TreeNodeTask.INDEX, index));
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean initialized = treeNodeTask.getInitialized();
		renderedAttributes.add(renderBoolean(TreeNodeTask.INITIALIZED, initialized));
	}

	protected void renderIo(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object io = treeNodeTask.getIo();
		renderedAttributes.add(renderObject(TreeNodeTask.IO, io));
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String label = treeNodeTask.getLabel();
		renderedAttributes.add(renderString(TreeNodeTask.LABEL, label));
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String labelEl = treeNodeTask.getLabelEl();
		renderedAttributes.add(renderString(TreeNodeTask.LABEL_EL, labelEl));
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean leaf = treeNodeTask.getLeaf();
		renderedAttributes.add(renderBoolean(TreeNodeTask.LEAF, leaf));
	}

	protected void renderLoaded(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean loaded = treeNodeTask.getLoaded();
		renderedAttributes.add(renderBoolean(TreeNodeTask.LOADED, loaded));
	}

	protected void renderLoading(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean loading = treeNodeTask.getLoading();
		renderedAttributes.add(renderBoolean(TreeNodeTask.LOADING, loading));
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object nextSibling = treeNodeTask.getNextSibling();
		renderedAttributes.add(renderString(TreeNodeTask.NEXT_SIBLING, nextSibling));
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object ownerTree = treeNodeTask.getOwnerTree();
		renderedAttributes.add(renderString(TreeNodeTask.OWNER_TREE, ownerTree));
	}

	protected void renderPaginator(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object paginator = treeNodeTask.getPaginator();
		renderedAttributes.add(renderObject(TreeNodeTask.PAGINATOR, paginator));
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object parentNode = treeNodeTask.getParentNode();
		renderedAttributes.add(renderString(TreeNodeTask.PARENT_NODE, parentNode));
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Object prevSibling = treeNodeTask.getPrevSibling();
		renderedAttributes.add(renderString(TreeNodeTask.PREV_SIBLING, prevSibling));
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.Boolean rendered = treeNodeTask.getRendered();
		renderedAttributes.add(renderBoolean(TreeNodeTask.RENDERED, rendered));
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String tabIndex = treeNodeTask.getTabIndex();
		renderedAttributes.add(renderString(TreeNodeTask.TAB_INDEX, tabIndex));
	}

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNodeTask.getAfterAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNodeTask.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCacheChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCacheChange = treeNodeTask.getAfterCacheChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_CACHE_CHANGE, afterCacheChange));
	}

	protected void renderAfterCheckContainerElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCheckContainerElChange = treeNodeTask.getAfterCheckContainerElChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHECK_CONTAINER_EL_CHANGE, afterCheckContainerElChange));
	}

	protected void renderAfterCheckElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCheckElChange = treeNodeTask.getAfterCheckElChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHECK_EL_CHANGE, afterCheckElChange));
	}

	protected void renderAfterCheckNameChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCheckNameChange = treeNodeTask.getAfterCheckNameChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHECK_NAME_CHANGE, afterCheckNameChange));
	}

	protected void renderAfterCheckedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCheckedChange = treeNodeTask.getAfterCheckedChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHECKED_CHANGE, afterCheckedChange));
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterChildrenChange = treeNodeTask.getAfterChildrenChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_CHILDREN_CHANGE, afterChildrenChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterContainerChange = treeNodeTask.getAfterContainerChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterContentBoxChange = treeNodeTask.getAfterContentBoxChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterCssClassesChange = treeNodeTask.getAfterCssClassesChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterDestroyedChange = treeNodeTask.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterDraggableChange = treeNodeTask.getAfterDraggableChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterExpandedChange = treeNodeTask.getAfterExpandedChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_EXPANDED_CHANGE, afterExpandedChange));
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterHitAreaElChange = treeNodeTask.getAfterHitAreaElChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterIconElChange = treeNodeTask.getAfterIconElChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_ICON_EL_CHANGE, afterIconElChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterIdChange = treeNodeTask.getAfterIdChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterIndexChange = treeNodeTask.getAfterIndexChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_INDEX_CHANGE, afterIndexChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterInitializedChange = treeNodeTask.getAfterInitializedChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIoChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterIoChange = treeNodeTask.getAfterIoChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_IO_CHANGE, afterIoChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLabelChange = treeNodeTask.getAfterLabelChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLabelElChange = treeNodeTask.getAfterLabelElChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLeafChange = treeNodeTask.getAfterLeafChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_LEAF_CHANGE, afterLeafChange));
	}

	protected void renderAfterLoadedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLoadedChange = treeNodeTask.getAfterLoadedChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_LOADED_CHANGE, afterLoadedChange));
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterLoadingChange = treeNodeTask.getAfterLoadingChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_LOADING_CHANGE, afterLoadingChange));
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterNextSiblingChange = treeNodeTask.getAfterNextSiblingChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNodeTask.getAfterOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
	}

	protected void renderAfterPaginatorChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterPaginatorChange = treeNodeTask.getAfterPaginatorChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_PAGINATOR_CHANGE, afterPaginatorChange));
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterParentNodeChange = treeNodeTask.getAfterParentNodeChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNodeTask.getAfterPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterRenderedChange = treeNodeTask.getAfterRenderedChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String afterTabIndexChange = treeNodeTask.getAfterTabIndexChange();
		renderedAttributes.add(renderString(TreeNodeTask.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNodeTask.getOnAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onBoundingBoxChange = treeNodeTask.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCacheChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCacheChange = treeNodeTask.getOnCacheChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_CACHE_CHANGE, onCacheChange));
	}

	protected void renderOnCheckContainerElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCheckContainerElChange = treeNodeTask.getOnCheckContainerElChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_CHECK_CONTAINER_EL_CHANGE, onCheckContainerElChange));
	}

	protected void renderOnCheckElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCheckElChange = treeNodeTask.getOnCheckElChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_CHECK_EL_CHANGE, onCheckElChange));
	}

	protected void renderOnCheckNameChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCheckNameChange = treeNodeTask.getOnCheckNameChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_CHECK_NAME_CHANGE, onCheckNameChange));
	}

	protected void renderOnCheckedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCheckedChange = treeNodeTask.getOnCheckedChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_CHECKED_CHANGE, onCheckedChange));
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onChildrenChange = treeNodeTask.getOnChildrenChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_CHILDREN_CHANGE, onChildrenChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onContainerChange = treeNodeTask.getOnContainerChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onContentBoxChange = treeNodeTask.getOnContentBoxChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onCssClassesChange = treeNodeTask.getOnCssClassesChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onDestroyedChange = treeNodeTask.getOnDestroyedChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onDraggableChange = treeNodeTask.getOnDraggableChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_DRAGGABLE_CHANGE, onDraggableChange));
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onExpandedChange = treeNodeTask.getOnExpandedChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_EXPANDED_CHANGE, onExpandedChange));
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onHitAreaElChange = treeNodeTask.getOnHitAreaElChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onIconElChange = treeNodeTask.getOnIconElChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_ICON_EL_CHANGE, onIconElChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onIdChange = treeNodeTask.getOnIdChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onIndexChange = treeNodeTask.getOnIndexChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_INDEX_CHANGE, onIndexChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onInitializedChange = treeNodeTask.getOnInitializedChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIoChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onIoChange = treeNodeTask.getOnIoChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_IO_CHANGE, onIoChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLabelChange = treeNodeTask.getOnLabelChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLabelElChange = treeNodeTask.getOnLabelElChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_LABEL_EL_CHANGE, onLabelElChange));
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLeafChange = treeNodeTask.getOnLeafChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_LEAF_CHANGE, onLeafChange));
	}

	protected void renderOnLoadedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLoadedChange = treeNodeTask.getOnLoadedChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_LOADED_CHANGE, onLoadedChange));
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onLoadingChange = treeNodeTask.getOnLoadingChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_LOADING_CHANGE, onLoadingChange));
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onNextSiblingChange = treeNodeTask.getOnNextSiblingChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onOwnerTreeChange = treeNodeTask.getOnOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
	}

	protected void renderOnPaginatorChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onPaginatorChange = treeNodeTask.getOnPaginatorChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_PAGINATOR_CHANGE, onPaginatorChange));
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onParentNodeChange = treeNodeTask.getOnParentNodeChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_PARENT_NODE_CHANGE, onParentNodeChange));
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onPrevSiblingChange = treeNodeTask.getOnPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onRenderedChange = treeNodeTask.getOnRenderedChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		java.lang.String onTabIndexChange = treeNodeTask.getOnTabIndexChange();
		renderedAttributes.add(renderString(TreeNodeTask.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

}