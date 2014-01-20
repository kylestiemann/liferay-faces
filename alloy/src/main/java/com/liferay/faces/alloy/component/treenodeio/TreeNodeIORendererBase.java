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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNodeIO);
		renderAfterBoundingBoxChange(renderedAfterEvents, treeNodeIO);
		renderAfterCacheChange(renderedAfterEvents, treeNodeIO);
		renderAfterChildrenChange(renderedAfterEvents, treeNodeIO);
		renderAfterContainerChange(renderedAfterEvents, treeNodeIO);
		renderAfterContentBoxChange(renderedAfterEvents, treeNodeIO);
		renderAfterCssClassesChange(renderedAfterEvents, treeNodeIO);
		renderAfterDestroyedChange(renderedAfterEvents, treeNodeIO);
		renderAfterDraggableChange(renderedAfterEvents, treeNodeIO);
		renderAfterExpandedChange(renderedAfterEvents, treeNodeIO);
		renderAfterHitAreaElChange(renderedAfterEvents, treeNodeIO);
		renderAfterIconElChange(renderedAfterEvents, treeNodeIO);
		renderAfterIdChange(renderedAfterEvents, treeNodeIO);
		renderAfterIndexChange(renderedAfterEvents, treeNodeIO);
		renderAfterInitializedChange(renderedAfterEvents, treeNodeIO);
		renderAfterIoChange(renderedAfterEvents, treeNodeIO);
		renderAfterLabelChange(renderedAfterEvents, treeNodeIO);
		renderAfterLabelElChange(renderedAfterEvents, treeNodeIO);
		renderAfterLeafChange(renderedAfterEvents, treeNodeIO);
		renderAfterLoadedChange(renderedAfterEvents, treeNodeIO);
		renderAfterLoadingChange(renderedAfterEvents, treeNodeIO);
		renderAfterNextSiblingChange(renderedAfterEvents, treeNodeIO);
		renderAfterOwnerTreeChange(renderedAfterEvents, treeNodeIO);
		renderAfterPaginatorChange(renderedAfterEvents, treeNodeIO);
		renderAfterParentNodeChange(renderedAfterEvents, treeNodeIO);
		renderAfterPrevSiblingChange(renderedAfterEvents, treeNodeIO);
		renderAfterRenderedChange(renderedAfterEvents, treeNodeIO);
		renderAfterTabIndexChange(renderedAfterEvents, treeNodeIO);

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

		renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNodeIO);
		renderOnBoundingBoxChange(renderedOnEvents, treeNodeIO);
		renderOnCacheChange(renderedOnEvents, treeNodeIO);
		renderOnChildrenChange(renderedOnEvents, treeNodeIO);
		renderOnContainerChange(renderedOnEvents, treeNodeIO);
		renderOnContentBoxChange(renderedOnEvents, treeNodeIO);
		renderOnCssClassesChange(renderedOnEvents, treeNodeIO);
		renderOnDestroyedChange(renderedOnEvents, treeNodeIO);
		renderOnDraggableChange(renderedOnEvents, treeNodeIO);
		renderOnExpandedChange(renderedOnEvents, treeNodeIO);
		renderOnHitAreaElChange(renderedOnEvents, treeNodeIO);
		renderOnIconElChange(renderedOnEvents, treeNodeIO);
		renderOnIdChange(renderedOnEvents, treeNodeIO);
		renderOnIndexChange(renderedOnEvents, treeNodeIO);
		renderOnInitializedChange(renderedOnEvents, treeNodeIO);
		renderOnIoChange(renderedOnEvents, treeNodeIO);
		renderOnLabelChange(renderedOnEvents, treeNodeIO);
		renderOnLabelElChange(renderedOnEvents, treeNodeIO);
		renderOnLeafChange(renderedOnEvents, treeNodeIO);
		renderOnLoadedChange(renderedOnEvents, treeNodeIO);
		renderOnLoadingChange(renderedOnEvents, treeNodeIO);
		renderOnNextSiblingChange(renderedOnEvents, treeNodeIO);
		renderOnOwnerTreeChange(renderedOnEvents, treeNodeIO);
		renderOnPaginatorChange(renderedOnEvents, treeNodeIO);
		renderOnParentNodeChange(renderedOnEvents, treeNodeIO);
		renderOnPrevSiblingChange(renderedOnEvents, treeNodeIO);
		renderOnRenderedChange(renderedOnEvents, treeNodeIO);
		renderOnTabIndexChange(renderedOnEvents, treeNodeIO);

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

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNodeIO.getAfterAlwaysShowHitAreaChange();

		if (afterAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNodeIO.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCacheChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterCacheChange = treeNodeIO.getAfterCacheChange();

		if (afterCacheChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_CACHE_CHANGE, afterCacheChange));
		}
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterChildrenChange = treeNodeIO.getAfterChildrenChange();

		if (afterChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_CHILDREN_CHANGE, afterChildrenChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterContainerChange = treeNodeIO.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterContentBoxChange = treeNodeIO.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterCssClassesChange = treeNodeIO.getAfterCssClassesChange();

		if (afterCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterDestroyedChange = treeNodeIO.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterDraggableChange = treeNodeIO.getAfterDraggableChange();

		if (afterDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
		}
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterExpandedChange = treeNodeIO.getAfterExpandedChange();

		if (afterExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_EXPANDED_CHANGE, afterExpandedChange));
		}
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterHitAreaElChange = treeNodeIO.getAfterHitAreaElChange();

		if (afterHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
		}
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterIconElChange = treeNodeIO.getAfterIconElChange();

		if (afterIconElChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_ICON_EL_CHANGE, afterIconElChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterIdChange = treeNodeIO.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterIndexChange = treeNodeIO.getAfterIndexChange();

		if (afterIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_INDEX_CHANGE, afterIndexChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterInitializedChange = treeNodeIO.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIoChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterIoChange = treeNodeIO.getAfterIoChange();

		if (afterIoChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_IO_CHANGE, afterIoChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLabelChange = treeNodeIO.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLabelElChange = treeNodeIO.getAfterLabelElChange();

		if (afterLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
		}
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLeafChange = treeNodeIO.getAfterLeafChange();

		if (afterLeafChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_LEAF_CHANGE, afterLeafChange));
		}
	}

	protected void renderAfterLoadedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLoadedChange = treeNodeIO.getAfterLoadedChange();

		if (afterLoadedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_LOADED_CHANGE, afterLoadedChange));
		}
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLoadingChange = treeNodeIO.getAfterLoadingChange();

		if (afterLoadingChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_LOADING_CHANGE, afterLoadingChange));
		}
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterNextSiblingChange = treeNodeIO.getAfterNextSiblingChange();

		if (afterNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
		}
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNodeIO.getAfterOwnerTreeChange();

		if (afterOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
		}
	}

	protected void renderAfterPaginatorChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterPaginatorChange = treeNodeIO.getAfterPaginatorChange();

		if (afterPaginatorChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_PAGINATOR_CHANGE, afterPaginatorChange));
		}
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterParentNodeChange = treeNodeIO.getAfterParentNodeChange();

		if (afterParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
		}
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNodeIO.getAfterPrevSiblingChange();

		if (afterPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterRenderedChange = treeNodeIO.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterTabIndexChange = treeNodeIO.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNodeIO.getOnAlwaysShowHitAreaChange();

		if (onAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onBoundingBoxChange = treeNodeIO.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCacheChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onCacheChange = treeNodeIO.getOnCacheChange();

		if (onCacheChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_CACHE_CHANGE, onCacheChange));
		}
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onChildrenChange = treeNodeIO.getOnChildrenChange();

		if (onChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_CHILDREN_CHANGE, onChildrenChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onContainerChange = treeNodeIO.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onContentBoxChange = treeNodeIO.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onCssClassesChange = treeNodeIO.getOnCssClassesChange();

		if (onCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onDestroyedChange = treeNodeIO.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onDraggableChange = treeNodeIO.getOnDraggableChange();

		if (onDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_DRAGGABLE_CHANGE, onDraggableChange));
		}
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onExpandedChange = treeNodeIO.getOnExpandedChange();

		if (onExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_EXPANDED_CHANGE, onExpandedChange));
		}
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onHitAreaElChange = treeNodeIO.getOnHitAreaElChange();

		if (onHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
		}
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onIconElChange = treeNodeIO.getOnIconElChange();

		if (onIconElChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_ICON_EL_CHANGE, onIconElChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onIdChange = treeNodeIO.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onIndexChange = treeNodeIO.getOnIndexChange();

		if (onIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_INDEX_CHANGE, onIndexChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onInitializedChange = treeNodeIO.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIoChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onIoChange = treeNodeIO.getOnIoChange();

		if (onIoChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_IO_CHANGE, onIoChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLabelChange = treeNodeIO.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLabelElChange = treeNodeIO.getOnLabelElChange();

		if (onLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_LABEL_EL_CHANGE, onLabelElChange));
		}
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLeafChange = treeNodeIO.getOnLeafChange();

		if (onLeafChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_LEAF_CHANGE, onLeafChange));
		}
	}

	protected void renderOnLoadedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLoadedChange = treeNodeIO.getOnLoadedChange();

		if (onLoadedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_LOADED_CHANGE, onLoadedChange));
		}
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLoadingChange = treeNodeIO.getOnLoadingChange();

		if (onLoadingChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_LOADING_CHANGE, onLoadingChange));
		}
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onNextSiblingChange = treeNodeIO.getOnNextSiblingChange();

		if (onNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
		}
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onOwnerTreeChange = treeNodeIO.getOnOwnerTreeChange();

		if (onOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
		}
	}

	protected void renderOnPaginatorChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onPaginatorChange = treeNodeIO.getOnPaginatorChange();

		if (onPaginatorChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_PAGINATOR_CHANGE, onPaginatorChange));
		}
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onParentNodeChange = treeNodeIO.getOnParentNodeChange();

		if (onParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_PARENT_NODE_CHANGE, onParentNodeChange));
		}
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onPrevSiblingChange = treeNodeIO.getOnPrevSiblingChange();

		if (onPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onRenderedChange = treeNodeIO.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onTabIndexChange = treeNodeIO.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeIO.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

}