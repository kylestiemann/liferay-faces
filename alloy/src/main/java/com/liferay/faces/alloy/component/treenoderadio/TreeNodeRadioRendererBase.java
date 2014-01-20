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
		renderTreeNodeRadioChildren(renderedAttributes, treeNodeRadio);
		renderContainer(renderedAttributes, treeNodeRadio);
		renderContentBox(renderedAttributes, treeNodeRadio);
		renderCssClasses(renderedAttributes, treeNodeRadio);
		renderDestroyed(renderedAttributes, treeNodeRadio);
		renderDraggable(renderedAttributes, treeNodeRadio);
		renderExpanded(renderedAttributes, treeNodeRadio);
		renderHitAreaEl(renderedAttributes, treeNodeRadio);
		renderIconEl(renderedAttributes, treeNodeRadio);
		renderTreeNodeRadioId(renderedAttributes, treeNodeRadio);
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNodeRadio);
		renderAfterBoundingBoxChange(renderedAfterEvents, treeNodeRadio);
		renderAfterCacheChange(renderedAfterEvents, treeNodeRadio);
		renderAfterCheckContainerElChange(renderedAfterEvents, treeNodeRadio);
		renderAfterCheckElChange(renderedAfterEvents, treeNodeRadio);
		renderAfterCheckNameChange(renderedAfterEvents, treeNodeRadio);
		renderAfterCheckedChange(renderedAfterEvents, treeNodeRadio);
		renderAfterChildrenChange(renderedAfterEvents, treeNodeRadio);
		renderAfterContainerChange(renderedAfterEvents, treeNodeRadio);
		renderAfterContentBoxChange(renderedAfterEvents, treeNodeRadio);
		renderAfterCssClassesChange(renderedAfterEvents, treeNodeRadio);
		renderAfterDestroyedChange(renderedAfterEvents, treeNodeRadio);
		renderAfterDraggableChange(renderedAfterEvents, treeNodeRadio);
		renderAfterExpandedChange(renderedAfterEvents, treeNodeRadio);
		renderAfterHitAreaElChange(renderedAfterEvents, treeNodeRadio);
		renderAfterIconElChange(renderedAfterEvents, treeNodeRadio);
		renderAfterIdChange(renderedAfterEvents, treeNodeRadio);
		renderAfterIndexChange(renderedAfterEvents, treeNodeRadio);
		renderAfterInitializedChange(renderedAfterEvents, treeNodeRadio);
		renderAfterIoChange(renderedAfterEvents, treeNodeRadio);
		renderAfterLabelChange(renderedAfterEvents, treeNodeRadio);
		renderAfterLabelElChange(renderedAfterEvents, treeNodeRadio);
		renderAfterLeafChange(renderedAfterEvents, treeNodeRadio);
		renderAfterLoadedChange(renderedAfterEvents, treeNodeRadio);
		renderAfterLoadingChange(renderedAfterEvents, treeNodeRadio);
		renderAfterNextSiblingChange(renderedAfterEvents, treeNodeRadio);
		renderAfterOwnerTreeChange(renderedAfterEvents, treeNodeRadio);
		renderAfterPaginatorChange(renderedAfterEvents, treeNodeRadio);
		renderAfterParentNodeChange(renderedAfterEvents, treeNodeRadio);
		renderAfterPrevSiblingChange(renderedAfterEvents, treeNodeRadio);
		renderAfterRenderedChange(renderedAfterEvents, treeNodeRadio);
		renderAfterTabIndexChange(renderedAfterEvents, treeNodeRadio);

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

		renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNodeRadio);
		renderOnBoundingBoxChange(renderedOnEvents, treeNodeRadio);
		renderOnCacheChange(renderedOnEvents, treeNodeRadio);
		renderOnCheckContainerElChange(renderedOnEvents, treeNodeRadio);
		renderOnCheckElChange(renderedOnEvents, treeNodeRadio);
		renderOnCheckNameChange(renderedOnEvents, treeNodeRadio);
		renderOnCheckedChange(renderedOnEvents, treeNodeRadio);
		renderOnChildrenChange(renderedOnEvents, treeNodeRadio);
		renderOnContainerChange(renderedOnEvents, treeNodeRadio);
		renderOnContentBoxChange(renderedOnEvents, treeNodeRadio);
		renderOnCssClassesChange(renderedOnEvents, treeNodeRadio);
		renderOnDestroyedChange(renderedOnEvents, treeNodeRadio);
		renderOnDraggableChange(renderedOnEvents, treeNodeRadio);
		renderOnExpandedChange(renderedOnEvents, treeNodeRadio);
		renderOnHitAreaElChange(renderedOnEvents, treeNodeRadio);
		renderOnIconElChange(renderedOnEvents, treeNodeRadio);
		renderOnIdChange(renderedOnEvents, treeNodeRadio);
		renderOnIndexChange(renderedOnEvents, treeNodeRadio);
		renderOnInitializedChange(renderedOnEvents, treeNodeRadio);
		renderOnIoChange(renderedOnEvents, treeNodeRadio);
		renderOnLabelChange(renderedOnEvents, treeNodeRadio);
		renderOnLabelElChange(renderedOnEvents, treeNodeRadio);
		renderOnLeafChange(renderedOnEvents, treeNodeRadio);
		renderOnLoadedChange(renderedOnEvents, treeNodeRadio);
		renderOnLoadingChange(renderedOnEvents, treeNodeRadio);
		renderOnNextSiblingChange(renderedOnEvents, treeNodeRadio);
		renderOnOwnerTreeChange(renderedOnEvents, treeNodeRadio);
		renderOnPaginatorChange(renderedOnEvents, treeNodeRadio);
		renderOnParentNodeChange(renderedOnEvents, treeNodeRadio);
		renderOnPrevSiblingChange(renderedOnEvents, treeNodeRadio);
		renderOnRenderedChange(renderedOnEvents, treeNodeRadio);
		renderOnTabIndexChange(renderedOnEvents, treeNodeRadio);

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

	protected void renderTreeNodeRadioChildren(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object treeNodeRadioChildren = treeNodeRadio.getTreeNodeRadioChildren();

		if (treeNodeRadioChildren != null) {
			renderedAttributes.add(renderArray(TreeNodeRadio.TREE_NODE_RADIO_CHILDREN, treeNodeRadioChildren));
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

	protected void renderTreeNodeRadioId(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String treeNodeRadioId = treeNodeRadio.getTreeNodeRadioId();

		if (treeNodeRadioId != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.TREE_NODE_RADIO_ID, treeNodeRadioId));
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

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNodeRadio.getAfterAlwaysShowHitAreaChange();

		if (afterAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNodeRadio.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCacheChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCacheChange = treeNodeRadio.getAfterCacheChange();

		if (afterCacheChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CACHE_CHANGE, afterCacheChange));
		}
	}

	protected void renderAfterCheckContainerElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCheckContainerElChange = treeNodeRadio.getAfterCheckContainerElChange();

		if (afterCheckContainerElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHECK_CONTAINER_EL_CHANGE, afterCheckContainerElChange));
		}
	}

	protected void renderAfterCheckElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCheckElChange = treeNodeRadio.getAfterCheckElChange();

		if (afterCheckElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHECK_EL_CHANGE, afterCheckElChange));
		}
	}

	protected void renderAfterCheckNameChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCheckNameChange = treeNodeRadio.getAfterCheckNameChange();

		if (afterCheckNameChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHECK_NAME_CHANGE, afterCheckNameChange));
		}
	}

	protected void renderAfterCheckedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCheckedChange = treeNodeRadio.getAfterCheckedChange();

		if (afterCheckedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHECKED_CHANGE, afterCheckedChange));
		}
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterChildrenChange = treeNodeRadio.getAfterChildrenChange();

		if (afterChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHILDREN_CHANGE, afterChildrenChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterContainerChange = treeNodeRadio.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterContentBoxChange = treeNodeRadio.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCssClassesChange = treeNodeRadio.getAfterCssClassesChange();

		if (afterCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterDestroyedChange = treeNodeRadio.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterDraggableChange = treeNodeRadio.getAfterDraggableChange();

		if (afterDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
		}
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterExpandedChange = treeNodeRadio.getAfterExpandedChange();

		if (afterExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_EXPANDED_CHANGE, afterExpandedChange));
		}
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterHitAreaElChange = treeNodeRadio.getAfterHitAreaElChange();

		if (afterHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
		}
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterIconElChange = treeNodeRadio.getAfterIconElChange();

		if (afterIconElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_ICON_EL_CHANGE, afterIconElChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterIdChange = treeNodeRadio.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterIndexChange = treeNodeRadio.getAfterIndexChange();

		if (afterIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_INDEX_CHANGE, afterIndexChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterInitializedChange = treeNodeRadio.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterIoChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterIoChange = treeNodeRadio.getAfterIoChange();

		if (afterIoChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_IO_CHANGE, afterIoChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLabelChange = treeNodeRadio.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLabelElChange = treeNodeRadio.getAfterLabelElChange();

		if (afterLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
		}
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLeafChange = treeNodeRadio.getAfterLeafChange();

		if (afterLeafChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LEAF_CHANGE, afterLeafChange));
		}
	}

	protected void renderAfterLoadedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLoadedChange = treeNodeRadio.getAfterLoadedChange();

		if (afterLoadedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LOADED_CHANGE, afterLoadedChange));
		}
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLoadingChange = treeNodeRadio.getAfterLoadingChange();

		if (afterLoadingChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LOADING_CHANGE, afterLoadingChange));
		}
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterNextSiblingChange = treeNodeRadio.getAfterNextSiblingChange();

		if (afterNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
		}
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNodeRadio.getAfterOwnerTreeChange();

		if (afterOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
		}
	}

	protected void renderAfterPaginatorChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterPaginatorChange = treeNodeRadio.getAfterPaginatorChange();

		if (afterPaginatorChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_PAGINATOR_CHANGE, afterPaginatorChange));
		}
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterParentNodeChange = treeNodeRadio.getAfterParentNodeChange();

		if (afterParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
		}
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNodeRadio.getAfterPrevSiblingChange();

		if (afterPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterRenderedChange = treeNodeRadio.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterTabIndexChange = treeNodeRadio.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNodeRadio.getOnAlwaysShowHitAreaChange();

		if (onAlwaysShowHitAreaChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onBoundingBoxChange = treeNodeRadio.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCacheChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCacheChange = treeNodeRadio.getOnCacheChange();

		if (onCacheChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_CACHE_CHANGE, onCacheChange));
		}
	}

	protected void renderOnCheckContainerElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCheckContainerElChange = treeNodeRadio.getOnCheckContainerElChange();

		if (onCheckContainerElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_CHECK_CONTAINER_EL_CHANGE, onCheckContainerElChange));
		}
	}

	protected void renderOnCheckElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCheckElChange = treeNodeRadio.getOnCheckElChange();

		if (onCheckElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_CHECK_EL_CHANGE, onCheckElChange));
		}
	}

	protected void renderOnCheckNameChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCheckNameChange = treeNodeRadio.getOnCheckNameChange();

		if (onCheckNameChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_CHECK_NAME_CHANGE, onCheckNameChange));
		}
	}

	protected void renderOnCheckedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCheckedChange = treeNodeRadio.getOnCheckedChange();

		if (onCheckedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_CHECKED_CHANGE, onCheckedChange));
		}
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onChildrenChange = treeNodeRadio.getOnChildrenChange();

		if (onChildrenChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_CHILDREN_CHANGE, onChildrenChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onContainerChange = treeNodeRadio.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onContentBoxChange = treeNodeRadio.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCssClassesChange = treeNodeRadio.getOnCssClassesChange();

		if (onCssClassesChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onDestroyedChange = treeNodeRadio.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onDraggableChange = treeNodeRadio.getOnDraggableChange();

		if (onDraggableChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_DRAGGABLE_CHANGE, onDraggableChange));
		}
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onExpandedChange = treeNodeRadio.getOnExpandedChange();

		if (onExpandedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_EXPANDED_CHANGE, onExpandedChange));
		}
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onHitAreaElChange = treeNodeRadio.getOnHitAreaElChange();

		if (onHitAreaElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
		}
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onIconElChange = treeNodeRadio.getOnIconElChange();

		if (onIconElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_ICON_EL_CHANGE, onIconElChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onIdChange = treeNodeRadio.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onIndexChange = treeNodeRadio.getOnIndexChange();

		if (onIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_INDEX_CHANGE, onIndexChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onInitializedChange = treeNodeRadio.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnIoChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onIoChange = treeNodeRadio.getOnIoChange();

		if (onIoChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_IO_CHANGE, onIoChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLabelChange = treeNodeRadio.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLabelElChange = treeNodeRadio.getOnLabelElChange();

		if (onLabelElChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_LABEL_EL_CHANGE, onLabelElChange));
		}
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLeafChange = treeNodeRadio.getOnLeafChange();

		if (onLeafChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_LEAF_CHANGE, onLeafChange));
		}
	}

	protected void renderOnLoadedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLoadedChange = treeNodeRadio.getOnLoadedChange();

		if (onLoadedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_LOADED_CHANGE, onLoadedChange));
		}
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLoadingChange = treeNodeRadio.getOnLoadingChange();

		if (onLoadingChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_LOADING_CHANGE, onLoadingChange));
		}
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onNextSiblingChange = treeNodeRadio.getOnNextSiblingChange();

		if (onNextSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
		}
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onOwnerTreeChange = treeNodeRadio.getOnOwnerTreeChange();

		if (onOwnerTreeChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
		}
	}

	protected void renderOnPaginatorChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onPaginatorChange = treeNodeRadio.getOnPaginatorChange();

		if (onPaginatorChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_PAGINATOR_CHANGE, onPaginatorChange));
		}
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onParentNodeChange = treeNodeRadio.getOnParentNodeChange();

		if (onParentNodeChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_PARENT_NODE_CHANGE, onParentNodeChange));
		}
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onPrevSiblingChange = treeNodeRadio.getOnPrevSiblingChange();

		if (onPrevSiblingChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onRenderedChange = treeNodeRadio.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onTabIndexChange = treeNodeRadio.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(TreeNodeRadio.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

}