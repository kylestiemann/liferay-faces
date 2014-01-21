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

		if (treeNodeRadio.getAlwaysShowHitArea() != null) {
			renderAlwaysShowHitArea(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getCache() != null) {
			renderCache(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getCheckContainerEl() != null) {
			renderCheckContainerEl(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getCheckEl() != null) {
			renderCheckEl(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getCheckName() != null) {
			renderCheckName(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getChecked() != null) {
			renderChecked(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getTreeNodeRadioChildren() != null) {
			renderTreeNodeRadioChildren(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getContainer() != null) {
			renderContainer(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getContentBox() != null) {
			renderContentBox(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getCssClasses() != null) {
			renderCssClasses(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getDraggable() != null) {
			renderDraggable(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getExpanded() != null) {
			renderExpanded(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getHitAreaEl() != null) {
			renderHitAreaEl(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getIconEl() != null) {
			renderIconEl(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getTreeNodeRadioId() != null) {
			renderTreeNodeRadioId(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getIndex() != null) {
			renderIndex(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getInitialized() != null) {
			renderInitialized(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getIo() != null) {
			renderIo(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getLabel() != null) {
			renderLabel(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getLabelEl() != null) {
			renderLabelEl(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getLeaf() != null) {
			renderLeaf(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getLoaded() != null) {
			renderLoaded(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getLoading() != null) {
			renderLoading(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getNextSibling() != null) {
			renderNextSibling(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getOwnerTree() != null) {
			renderOwnerTree(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getPaginator() != null) {
			renderPaginator(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getParentNode() != null) {
			renderParentNode(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getPrevSibling() != null) {
			renderPrevSibling(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getRendered() != null) {
			renderRendered(renderedAttributes, treeNodeRadio);
		}

		if (treeNodeRadio.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, treeNodeRadio);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (treeNodeRadio.getAfterAlwaysShowHitAreaChange() != null) {
			renderAfterAlwaysShowHitAreaChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterCacheChange() != null) {
			renderAfterCacheChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterCheckContainerElChange() != null) {
			renderAfterCheckContainerElChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterCheckElChange() != null) {
			renderAfterCheckElChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterCheckNameChange() != null) {
			renderAfterCheckNameChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterCheckedChange() != null) {
			renderAfterCheckedChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterChildrenChange() != null) {
			renderAfterChildrenChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterCssClassesChange() != null) {
			renderAfterCssClassesChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterDraggableChange() != null) {
			renderAfterDraggableChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterExpandedChange() != null) {
			renderAfterExpandedChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterHitAreaElChange() != null) {
			renderAfterHitAreaElChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterIconElChange() != null) {
			renderAfterIconElChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterIndexChange() != null) {
			renderAfterIndexChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterIoChange() != null) {
			renderAfterIoChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterLabelElChange() != null) {
			renderAfterLabelElChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterLeafChange() != null) {
			renderAfterLeafChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterLoadedChange() != null) {
			renderAfterLoadedChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterLoadingChange() != null) {
			renderAfterLoadingChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterNextSiblingChange() != null) {
			renderAfterNextSiblingChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterOwnerTreeChange() != null) {
			renderAfterOwnerTreeChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterPaginatorChange() != null) {
			renderAfterPaginatorChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterParentNodeChange() != null) {
			renderAfterParentNodeChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterPrevSiblingChange() != null) {
			renderAfterPrevSiblingChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, treeNodeRadio);
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

		if (treeNodeRadio.getOnAlwaysShowHitAreaChange() != null) {
			renderOnAlwaysShowHitAreaChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnCacheChange() != null) {
			renderOnCacheChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnCheckContainerElChange() != null) {
			renderOnCheckContainerElChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnCheckElChange() != null) {
			renderOnCheckElChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnCheckNameChange() != null) {
			renderOnCheckNameChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnCheckedChange() != null) {
			renderOnCheckedChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnChildrenChange() != null) {
			renderOnChildrenChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnCssClassesChange() != null) {
			renderOnCssClassesChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnDraggableChange() != null) {
			renderOnDraggableChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnExpandedChange() != null) {
			renderOnExpandedChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnHitAreaElChange() != null) {
			renderOnHitAreaElChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnIconElChange() != null) {
			renderOnIconElChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnIndexChange() != null) {
			renderOnIndexChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnIoChange() != null) {
			renderOnIoChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnLabelElChange() != null) {
			renderOnLabelElChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnLeafChange() != null) {
			renderOnLeafChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnLoadedChange() != null) {
			renderOnLoadedChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnLoadingChange() != null) {
			renderOnLoadingChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnNextSiblingChange() != null) {
			renderOnNextSiblingChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnOwnerTreeChange() != null) {
			renderOnOwnerTreeChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnPaginatorChange() != null) {
			renderOnPaginatorChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnParentNodeChange() != null) {
			renderOnParentNodeChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnPrevSiblingChange() != null) {
			renderOnPrevSiblingChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, treeNodeRadio);
		}

		if (treeNodeRadio.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, treeNodeRadio);
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

	protected void renderAlwaysShowHitArea(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean alwaysShowHitArea = treeNodeRadio.getAlwaysShowHitArea();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String boundingBox = treeNodeRadio.getBoundingBox();
		renderedAttributes.add(renderString(TreeNodeRadio.BOUNDING_BOX, boundingBox));
	}

	protected void renderCache(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean cache = treeNodeRadio.getCache();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.CACHE, cache));
	}

	protected void renderCheckContainerEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String checkContainerEl = treeNodeRadio.getCheckContainerEl();
		renderedAttributes.add(renderString(TreeNodeRadio.CHECK_CONTAINER_EL, checkContainerEl));
	}

	protected void renderCheckEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String checkEl = treeNodeRadio.getCheckEl();
		renderedAttributes.add(renderString(TreeNodeRadio.CHECK_EL, checkEl));
	}

	protected void renderCheckName(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String checkName = treeNodeRadio.getCheckName();
		renderedAttributes.add(renderString(TreeNodeRadio.CHECK_NAME, checkName));
	}

	protected void renderChecked(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean checked = treeNodeRadio.getChecked();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.CHECKED, checked));
	}

	protected void renderTreeNodeRadioChildren(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object treeNodeRadioChildren = treeNodeRadio.getTreeNodeRadioChildren();
		renderedAttributes.add(renderArray(TreeNodeRadio.TREE_NODE_RADIO_CHILDREN, treeNodeRadioChildren));
	}

	protected void renderContainer(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String container = treeNodeRadio.getContainer();
		renderedAttributes.add(renderString(TreeNodeRadio.CONTAINER, container));
	}

	protected void renderContentBox(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String contentBox = treeNodeRadio.getContentBox();
		renderedAttributes.add(renderString(TreeNodeRadio.CONTENT_BOX, contentBox));
	}

	protected void renderCssClasses(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object cssClasses = treeNodeRadio.getCssClasses();
		renderedAttributes.add(renderObject(TreeNodeRadio.CSS_CLASSES, cssClasses));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean destroyed = treeNodeRadio.getDestroyed();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.DESTROYED, destroyed));
	}

	protected void renderDraggable(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean draggable = treeNodeRadio.getDraggable();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.DRAGGABLE, draggable));
	}

	protected void renderExpanded(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean expanded = treeNodeRadio.getExpanded();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.EXPANDED, expanded));
	}

	protected void renderHitAreaEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String hitAreaEl = treeNodeRadio.getHitAreaEl();
		renderedAttributes.add(renderString(TreeNodeRadio.HIT_AREA_EL, hitAreaEl));
	}

	protected void renderIconEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String iconEl = treeNodeRadio.getIconEl();
		renderedAttributes.add(renderString(TreeNodeRadio.ICON_EL, iconEl));
	}

	protected void renderTreeNodeRadioId(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String treeNodeRadioId = treeNodeRadio.getTreeNodeRadioId();
		renderedAttributes.add(renderString(TreeNodeRadio.TREE_NODE_RADIO_ID, treeNodeRadioId));
	}

	protected void renderIndex(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object index = treeNodeRadio.getIndex();
		renderedAttributes.add(renderObject(TreeNodeRadio.INDEX, index));
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean initialized = treeNodeRadio.getInitialized();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.INITIALIZED, initialized));
	}

	protected void renderIo(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object io = treeNodeRadio.getIo();
		renderedAttributes.add(renderObject(TreeNodeRadio.IO, io));
	}

	protected void renderLabel(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String label = treeNodeRadio.getLabel();
		renderedAttributes.add(renderString(TreeNodeRadio.LABEL, label));
	}

	protected void renderLabelEl(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String labelEl = treeNodeRadio.getLabelEl();
		renderedAttributes.add(renderString(TreeNodeRadio.LABEL_EL, labelEl));
	}

	protected void renderLeaf(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean leaf = treeNodeRadio.getLeaf();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.LEAF, leaf));
	}

	protected void renderLoaded(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean loaded = treeNodeRadio.getLoaded();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.LOADED, loaded));
	}

	protected void renderLoading(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean loading = treeNodeRadio.getLoading();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.LOADING, loading));
	}

	protected void renderNextSibling(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object nextSibling = treeNodeRadio.getNextSibling();
		renderedAttributes.add(renderString(TreeNodeRadio.NEXT_SIBLING, nextSibling));
	}

	protected void renderOwnerTree(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object ownerTree = treeNodeRadio.getOwnerTree();
		renderedAttributes.add(renderString(TreeNodeRadio.OWNER_TREE, ownerTree));
	}

	protected void renderPaginator(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object paginator = treeNodeRadio.getPaginator();
		renderedAttributes.add(renderObject(TreeNodeRadio.PAGINATOR, paginator));
	}

	protected void renderParentNode(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object parentNode = treeNodeRadio.getParentNode();
		renderedAttributes.add(renderString(TreeNodeRadio.PARENT_NODE, parentNode));
	}

	protected void renderPrevSibling(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Object prevSibling = treeNodeRadio.getPrevSibling();
		renderedAttributes.add(renderString(TreeNodeRadio.PREV_SIBLING, prevSibling));
	}

	protected void renderRendered(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.Boolean rendered = treeNodeRadio.getRendered();
		renderedAttributes.add(renderBoolean(TreeNodeRadio.RENDERED, rendered));
	}

	protected void renderTabIndex(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String tabIndex = treeNodeRadio.getTabIndex();
		renderedAttributes.add(renderString(TreeNodeRadio.TAB_INDEX, tabIndex));
	}

	protected void renderAfterAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterAlwaysShowHitAreaChange = treeNodeRadio.getAfterAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterBoundingBoxChange = treeNodeRadio.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCacheChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCacheChange = treeNodeRadio.getAfterCacheChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CACHE_CHANGE, afterCacheChange));
	}

	protected void renderAfterCheckContainerElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCheckContainerElChange = treeNodeRadio.getAfterCheckContainerElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHECK_CONTAINER_EL_CHANGE, afterCheckContainerElChange));
	}

	protected void renderAfterCheckElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCheckElChange = treeNodeRadio.getAfterCheckElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHECK_EL_CHANGE, afterCheckElChange));
	}

	protected void renderAfterCheckNameChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCheckNameChange = treeNodeRadio.getAfterCheckNameChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHECK_NAME_CHANGE, afterCheckNameChange));
	}

	protected void renderAfterCheckedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCheckedChange = treeNodeRadio.getAfterCheckedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHECKED_CHANGE, afterCheckedChange));
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterChildrenChange = treeNodeRadio.getAfterChildrenChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CHILDREN_CHANGE, afterChildrenChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterContainerChange = treeNodeRadio.getAfterContainerChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterContentBoxChange = treeNodeRadio.getAfterContentBoxChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterCssClassesChange = treeNodeRadio.getAfterCssClassesChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterDestroyedChange = treeNodeRadio.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDraggableChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterDraggableChange = treeNodeRadio.getAfterDraggableChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_DRAGGABLE_CHANGE, afterDraggableChange));
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterExpandedChange = treeNodeRadio.getAfterExpandedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_EXPANDED_CHANGE, afterExpandedChange));
	}

	protected void renderAfterHitAreaElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterHitAreaElChange = treeNodeRadio.getAfterHitAreaElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange));
	}

	protected void renderAfterIconElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterIconElChange = treeNodeRadio.getAfterIconElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_ICON_EL_CHANGE, afterIconElChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterIdChange = treeNodeRadio.getAfterIdChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterIndexChange = treeNodeRadio.getAfterIndexChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_INDEX_CHANGE, afterIndexChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterInitializedChange = treeNodeRadio.getAfterInitializedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterIoChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterIoChange = treeNodeRadio.getAfterIoChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_IO_CHANGE, afterIoChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLabelChange = treeNodeRadio.getAfterLabelChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLabelElChange = treeNodeRadio.getAfterLabelElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LABEL_EL_CHANGE, afterLabelElChange));
	}

	protected void renderAfterLeafChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLeafChange = treeNodeRadio.getAfterLeafChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LEAF_CHANGE, afterLeafChange));
	}

	protected void renderAfterLoadedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLoadedChange = treeNodeRadio.getAfterLoadedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LOADED_CHANGE, afterLoadedChange));
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterLoadingChange = treeNodeRadio.getAfterLoadingChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_LOADING_CHANGE, afterLoadingChange));
	}

	protected void renderAfterNextSiblingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterNextSiblingChange = treeNodeRadio.getAfterNextSiblingChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange));
	}

	protected void renderAfterOwnerTreeChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterOwnerTreeChange = treeNodeRadio.getAfterOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange));
	}

	protected void renderAfterPaginatorChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterPaginatorChange = treeNodeRadio.getAfterPaginatorChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_PAGINATOR_CHANGE, afterPaginatorChange));
	}

	protected void renderAfterParentNodeChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterParentNodeChange = treeNodeRadio.getAfterParentNodeChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_PARENT_NODE_CHANGE, afterParentNodeChange));
	}

	protected void renderAfterPrevSiblingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterPrevSiblingChange = treeNodeRadio.getAfterPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterRenderedChange = treeNodeRadio.getAfterRenderedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String afterTabIndexChange = treeNodeRadio.getAfterTabIndexChange();
		renderedAttributes.add(renderString(TreeNodeRadio.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderOnAlwaysShowHitAreaChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onAlwaysShowHitAreaChange = treeNodeRadio.getOnAlwaysShowHitAreaChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onBoundingBoxChange = treeNodeRadio.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCacheChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCacheChange = treeNodeRadio.getOnCacheChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_CACHE_CHANGE, onCacheChange));
	}

	protected void renderOnCheckContainerElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCheckContainerElChange = treeNodeRadio.getOnCheckContainerElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_CHECK_CONTAINER_EL_CHANGE, onCheckContainerElChange));
	}

	protected void renderOnCheckElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCheckElChange = treeNodeRadio.getOnCheckElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_CHECK_EL_CHANGE, onCheckElChange));
	}

	protected void renderOnCheckNameChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCheckNameChange = treeNodeRadio.getOnCheckNameChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_CHECK_NAME_CHANGE, onCheckNameChange));
	}

	protected void renderOnCheckedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCheckedChange = treeNodeRadio.getOnCheckedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_CHECKED_CHANGE, onCheckedChange));
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onChildrenChange = treeNodeRadio.getOnChildrenChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_CHILDREN_CHANGE, onChildrenChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onContainerChange = treeNodeRadio.getOnContainerChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onContentBoxChange = treeNodeRadio.getOnContentBoxChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onCssClassesChange = treeNodeRadio.getOnCssClassesChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onDestroyedChange = treeNodeRadio.getOnDestroyedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDraggableChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onDraggableChange = treeNodeRadio.getOnDraggableChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_DRAGGABLE_CHANGE, onDraggableChange));
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onExpandedChange = treeNodeRadio.getOnExpandedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_EXPANDED_CHANGE, onExpandedChange));
	}

	protected void renderOnHitAreaElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onHitAreaElChange = treeNodeRadio.getOnHitAreaElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_HIT_AREA_EL_CHANGE, onHitAreaElChange));
	}

	protected void renderOnIconElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onIconElChange = treeNodeRadio.getOnIconElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_ICON_EL_CHANGE, onIconElChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onIdChange = treeNodeRadio.getOnIdChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onIndexChange = treeNodeRadio.getOnIndexChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_INDEX_CHANGE, onIndexChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onInitializedChange = treeNodeRadio.getOnInitializedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnIoChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onIoChange = treeNodeRadio.getOnIoChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_IO_CHANGE, onIoChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLabelChange = treeNodeRadio.getOnLabelChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelElChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLabelElChange = treeNodeRadio.getOnLabelElChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_LABEL_EL_CHANGE, onLabelElChange));
	}

	protected void renderOnLeafChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLeafChange = treeNodeRadio.getOnLeafChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_LEAF_CHANGE, onLeafChange));
	}

	protected void renderOnLoadedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLoadedChange = treeNodeRadio.getOnLoadedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_LOADED_CHANGE, onLoadedChange));
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onLoadingChange = treeNodeRadio.getOnLoadingChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_LOADING_CHANGE, onLoadingChange));
	}

	protected void renderOnNextSiblingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onNextSiblingChange = treeNodeRadio.getOnNextSiblingChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_NEXT_SIBLING_CHANGE, onNextSiblingChange));
	}

	protected void renderOnOwnerTreeChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onOwnerTreeChange = treeNodeRadio.getOnOwnerTreeChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_OWNER_TREE_CHANGE, onOwnerTreeChange));
	}

	protected void renderOnPaginatorChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onPaginatorChange = treeNodeRadio.getOnPaginatorChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_PAGINATOR_CHANGE, onPaginatorChange));
	}

	protected void renderOnParentNodeChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onParentNodeChange = treeNodeRadio.getOnParentNodeChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_PARENT_NODE_CHANGE, onParentNodeChange));
	}

	protected void renderOnPrevSiblingChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onPrevSiblingChange = treeNodeRadio.getOnPrevSiblingChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_PREV_SIBLING_CHANGE, onPrevSiblingChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onRenderedChange = treeNodeRadio.getOnRenderedChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		java.lang.String onTabIndexChange = treeNodeRadio.getOnTabIndexChange();
		renderedAttributes.add(renderString(TreeNodeRadio.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

}