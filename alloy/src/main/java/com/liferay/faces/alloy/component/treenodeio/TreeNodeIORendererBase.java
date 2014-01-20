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

		if (treeNodeIO.getAlwaysShowHitArea() != null) {
			renderAlwaysShowHitArea(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getCache() != null) {
			renderCache(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getTreeNodeIOChildren() != null) {
			renderTreeNodeIOChildren(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getContainer() != null) {
			renderContainer(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getContentBox() != null) {
			renderContentBox(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getCssClasses() != null) {
			renderCssClasses(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getDraggable() != null) {
			renderDraggable(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getExpanded() != null) {
			renderExpanded(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getHitAreaEl() != null) {
			renderHitAreaEl(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getIconEl() != null) {
			renderIconEl(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getTreeNodeIOId() != null) {
			renderTreeNodeIOId(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getIndex() != null) {
			renderIndex(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getInitialized() != null) {
			renderInitialized(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getIo() != null) {
			renderIo(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getLabel() != null) {
			renderLabel(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getLabelEl() != null) {
			renderLabelEl(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getLeaf() != null) {
			renderLeaf(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getLoaded() != null) {
			renderLoaded(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getLoading() != null) {
			renderLoading(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getNextSibling() != null) {
			renderNextSibling(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getOwnerTree() != null) {
			renderOwnerTree(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getPaginator() != null) {
			renderPaginator(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getParentNode() != null) {
			renderParentNode(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getPrevSibling() != null) {
			renderPrevSibling(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getRendered() != null) {
			renderRendered(renderedAttributes, treeNodeIO);
		}
		
		if (treeNodeIO.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, treeNodeIO);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (treeNodeIO.getAfterAlwaysShowHitAreaChange() != null) {
			renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterCacheChange() != null) {
			renderAfterCacheChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterChildrenChange() != null) {
			renderAfterChildrenChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterCssClassesChange() != null) {
			renderAfterCssClassesChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterDraggableChange() != null) {
			renderAfterDraggableChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterExpandedChange() != null) {
			renderAfterExpandedChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterHitAreaElChange() != null) {
			renderAfterHitAreaElChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterIconElChange() != null) {
			renderAfterIconElChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterIndexChange() != null) {
			renderAfterIndexChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterIoChange() != null) {
			renderAfterIoChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterLabelElChange() != null) {
			renderAfterLabelElChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterLeafChange() != null) {
			renderAfterLeafChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterLoadedChange() != null) {
			renderAfterLoadedChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterLoadingChange() != null) {
			renderAfterLoadingChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterNextSiblingChange() != null) {
			renderAfterNextSiblingChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterOwnerTreeChange() != null) {
			renderAfterOwnerTreeChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterPaginatorChange() != null) {
			renderAfterPaginatorChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterParentNodeChange() != null) {
			renderAfterParentNodeChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterPrevSiblingChange() != null) {
			renderAfterPrevSiblingChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, treeNodeIO);
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

		if (treeNodeIO.getOnAlwaysShowHitAreaChange() != null) {
			renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnCacheChange() != null) {
			renderOnCacheChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnChildrenChange() != null) {
			renderOnChildrenChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnCssClassesChange() != null) {
			renderOnCssClassesChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnDraggableChange() != null) {
			renderOnDraggableChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnExpandedChange() != null) {
			renderOnExpandedChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnHitAreaElChange() != null) {
			renderOnHitAreaElChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnIconElChange() != null) {
			renderOnIconElChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnIndexChange() != null) {
			renderOnIndexChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnIoChange() != null) {
			renderOnIoChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnLabelElChange() != null) {
			renderOnLabelElChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnLeafChange() != null) {
			renderOnLeafChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnLoadedChange() != null) {
			renderOnLoadedChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnLoadingChange() != null) {
			renderOnLoadingChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnNextSiblingChange() != null) {
			renderOnNextSiblingChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnOwnerTreeChange() != null) {
			renderOnOwnerTreeChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnPaginatorChange() != null) {
			renderOnPaginatorChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnParentNodeChange() != null) {
			renderOnParentNodeChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnPrevSiblingChange() != null) {
			renderOnPrevSiblingChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, treeNodeIO);
		}
		
		if (treeNodeIO.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, treeNodeIO);
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

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNodeIO.getAlwaysShowHitArea();
		renderedAttributes.add(renderBoolean(TreeNodeIO.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String boundingBox = treeNodeIO.getBoundingBox();
		renderedAttributes.add(renderString(TreeNodeIO.BOUNDING_BOX, boundingBox));
	}

	protected void renderCache(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean cache = treeNodeIO.getCache();
		renderedAttributes.add(renderBoolean(TreeNodeIO.CACHE, cache));
	}

	protected void renderTreeNodeIOChildren(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object treeNodeIOChildren = treeNodeIO.getTreeNodeIOChildren();
		renderedAttributes.add(renderArray(TreeNodeIO.TREE_NODE_IOCHILDREN, treeNodeIOChildren));
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String container = treeNodeIO.getContainer();
		renderedAttributes.add(renderString(TreeNodeIO.CONTAINER, container));
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String contentBox = treeNodeIO.getContentBox();
		renderedAttributes.add(renderString(TreeNodeIO.CONTENT_BOX, contentBox));
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object cssClasses = treeNodeIO.getCssClasses();
		renderedAttributes.add(renderObject(TreeNodeIO.CSS_CLASSES, cssClasses));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean destroyed = treeNodeIO.getDestroyed();
		renderedAttributes.add(renderBoolean(TreeNodeIO.DESTROYED, destroyed));
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean draggable = treeNodeIO.getDraggable();
		renderedAttributes.add(renderBoolean(TreeNodeIO.DRAGGABLE, draggable));
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean expanded = treeNodeIO.getExpanded();
		renderedAttributes.add(renderBoolean(TreeNodeIO.EXPANDED, expanded));
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String hitAreaEl = treeNodeIO.getHitAreaEl();
		renderedAttributes.add(renderString(TreeNodeIO.HIT_AREA_EL, hitAreaEl));
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String iconEl = treeNodeIO.getIconEl();
		renderedAttributes.add(renderString(TreeNodeIO.ICON_EL, iconEl));
	}

	protected void renderTreeNodeIOId(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String treeNodeIOId = treeNodeIO.getTreeNodeIOId();
		renderedAttributes.add(renderString(TreeNodeIO.TREE_NODE_IOID, treeNodeIOId));
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object index = treeNodeIO.getIndex();
		renderedAttributes.add(renderObject(TreeNodeIO.INDEX, index));
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean initialized = treeNodeIO.getInitialized();
		renderedAttributes.add(renderBoolean(TreeNodeIO.INITIALIZED, initialized));
	}

	protected void renderIo(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object io = treeNodeIO.getIo();
		renderedAttributes.add(renderObject(TreeNodeIO.IO, io));
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String label = treeNodeIO.getLabel();
		renderedAttributes.add(renderString(TreeNodeIO.LABEL, label));
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String labelEl = treeNodeIO.getLabelEl();
		renderedAttributes.add(renderString(TreeNodeIO.LABEL_EL, labelEl));
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean leaf = treeNodeIO.getLeaf();
		renderedAttributes.add(renderBoolean(TreeNodeIO.LEAF, leaf));
	}

	protected void renderLoaded(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean loaded = treeNodeIO.getLoaded();
		renderedAttributes.add(renderBoolean(TreeNodeIO.LOADED, loaded));
	}

	protected void renderLoading(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean loading = treeNodeIO.getLoading();
		renderedAttributes.add(renderBoolean(TreeNodeIO.LOADING, loading));
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object nextSibling = treeNodeIO.getNextSibling();
		renderedAttributes.add(renderString(TreeNodeIO.NEXT_SIBLING, nextSibling));
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object ownerTree = treeNodeIO.getOwnerTree();
		renderedAttributes.add(renderString(TreeNodeIO.OWNER_TREE, ownerTree));
	}

	protected void renderPaginator(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object paginator = treeNodeIO.getPaginator();
		renderedAttributes.add(renderObject(TreeNodeIO.PAGINATOR, paginator));
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object parentNode = treeNodeIO.getParentNode();
		renderedAttributes.add(renderString(TreeNodeIO.PARENT_NODE, parentNode));
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Object prevSibling = treeNodeIO.getPrevSibling();
		renderedAttributes.add(renderString(TreeNodeIO.PREV_SIBLING, prevSibling));
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.Boolean rendered = treeNodeIO.getRendered();
		renderedAttributes.add(renderBoolean(TreeNodeIO.RENDERED, rendered));
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String tabIndex = treeNodeIO.getTabIndex();
		renderedAttributes.add(renderString(TreeNodeIO.TAB_INDEX, tabIndex));
	}

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNodeIO.getAfterAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNodeIO.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCacheChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterCacheChange = treeNodeIO.getAfterCacheChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_CACHE_CHANGE, afterCacheChange));
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterChildrenChange = treeNodeIO.getAfterChildrenChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_CHILDREN_CHANGE, afterChildrenChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterContainerChange = treeNodeIO.getAfterContainerChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterContentBoxChange = treeNodeIO.getAfterContentBoxChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterCssClassesChange = treeNodeIO.getAfterCssClassesChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterDestroyedChange = treeNodeIO.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterDraggableChange = treeNodeIO.getAfterDraggableChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterExpandedChange = treeNodeIO.getAfterExpandedChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_EXPANDED_CHANGE, afterExpandedChange));
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterHitAreaElChange = treeNodeIO.getAfterHitAreaElChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterIconElChange = treeNodeIO.getAfterIconElChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_ICON_EL_CHANGE, afterIconElChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterIdChange = treeNodeIO.getAfterIdChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterIndexChange = treeNodeIO.getAfterIndexChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_INDEX_CHANGE, afterIndexChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterInitializedChange = treeNodeIO.getAfterInitializedChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIoChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterIoChange = treeNodeIO.getAfterIoChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_IO_CHANGE, afterIoChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLabelChange = treeNodeIO.getAfterLabelChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLabelElChange = treeNodeIO.getAfterLabelElChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLeafChange = treeNodeIO.getAfterLeafChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_LEAF_CHANGE, afterLeafChange));
	}

	protected void renderAfterLoadedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLoadedChange = treeNodeIO.getAfterLoadedChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_LOADED_CHANGE, afterLoadedChange));
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterLoadingChange = treeNodeIO.getAfterLoadingChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_LOADING_CHANGE, afterLoadingChange));
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterNextSiblingChange = treeNodeIO.getAfterNextSiblingChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNodeIO.getAfterOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
	}

	protected void renderAfterPaginatorChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterPaginatorChange = treeNodeIO.getAfterPaginatorChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_PAGINATOR_CHANGE, afterPaginatorChange));
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterParentNodeChange = treeNodeIO.getAfterParentNodeChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNodeIO.getAfterPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterRenderedChange = treeNodeIO.getAfterRenderedChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String afterTabIndexChange = treeNodeIO.getAfterTabIndexChange();
		renderedAttributes.add(renderString(TreeNodeIO.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNodeIO.getOnAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onBoundingBoxChange = treeNodeIO.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCacheChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onCacheChange = treeNodeIO.getOnCacheChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_CACHE_CHANGE, onCacheChange));
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onChildrenChange = treeNodeIO.getOnChildrenChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_CHILDREN_CHANGE, onChildrenChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onContainerChange = treeNodeIO.getOnContainerChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onContentBoxChange = treeNodeIO.getOnContentBoxChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onCssClassesChange = treeNodeIO.getOnCssClassesChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onDestroyedChange = treeNodeIO.getOnDestroyedChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onDraggableChange = treeNodeIO.getOnDraggableChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_DRAGGABLE_CHANGE, onDraggableChange));
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onExpandedChange = treeNodeIO.getOnExpandedChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_EXPANDED_CHANGE, onExpandedChange));
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onHitAreaElChange = treeNodeIO.getOnHitAreaElChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onIconElChange = treeNodeIO.getOnIconElChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_ICON_EL_CHANGE, onIconElChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onIdChange = treeNodeIO.getOnIdChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onIndexChange = treeNodeIO.getOnIndexChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_INDEX_CHANGE, onIndexChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onInitializedChange = treeNodeIO.getOnInitializedChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIoChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onIoChange = treeNodeIO.getOnIoChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_IO_CHANGE, onIoChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLabelChange = treeNodeIO.getOnLabelChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLabelElChange = treeNodeIO.getOnLabelElChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_LABEL_EL_CHANGE, onLabelElChange));
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLeafChange = treeNodeIO.getOnLeafChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_LEAF_CHANGE, onLeafChange));
	}

	protected void renderOnLoadedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLoadedChange = treeNodeIO.getOnLoadedChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_LOADED_CHANGE, onLoadedChange));
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onLoadingChange = treeNodeIO.getOnLoadingChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_LOADING_CHANGE, onLoadingChange));
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onNextSiblingChange = treeNodeIO.getOnNextSiblingChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onOwnerTreeChange = treeNodeIO.getOnOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
	}

	protected void renderOnPaginatorChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onPaginatorChange = treeNodeIO.getOnPaginatorChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_PAGINATOR_CHANGE, onPaginatorChange));
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onParentNodeChange = treeNodeIO.getOnParentNodeChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_PARENT_NODE_CHANGE, onParentNodeChange));
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onPrevSiblingChange = treeNodeIO.getOnPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onRenderedChange = treeNodeIO.getOnRenderedChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		java.lang.String onTabIndexChange = treeNodeIO.getOnTabIndexChange();
		renderedAttributes.add(renderString(TreeNodeIO.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

}