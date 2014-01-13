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

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeNodeIOBase extends javax.faces.component.UIPanel {

	private static final String ALWAYS_SHOW_HIT_AREA = "alwaysShowHitArea";
	private static final String BOUNDING_BOX = "boundingBox";
	private static final String CACHE = "cache";
	private static final String TREENODEIO_CHILDREN = "treenodeioChildren";
	private static final String CONTAINER = "container";
	private static final String CONTENT_BOX = "contentBox";
	private static final String CSS_CLASSES = "cssClasses";
	private static final String DRAGGABLE = "draggable";
	private static final String EXPANDED = "expanded";
	private static final String HIT_AREA_EL = "hitAreaEl";
	private static final String ICON_EL = "iconEl";
	private static final String TREENODEIO_ID = "treenodeioId";
	private static final String INDEX = "index";
	private static final String IO = "io";
	private static final String LABEL = "label";
	private static final String LABEL_EL = "labelEl";
	private static final String LEAF = "leaf";
	private static final String LOADED = "loaded";
	private static final String LOADING = "loading";
	private static final String NEXT_SIBLING = "nextSibling";
	private static final String OWNER_TREE = "ownerTree";
	private static final String PAGINATOR = "paginator";
	private static final String PARENT_NODE = "parentNode";
	private static final String PREV_SIBLING = "prevSibling";
	private static final String RENDERED = "rendered";
	private static final String TAB_INDEX = "tabIndex";
	private static final String AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE = "afterAlwaysShowHitAreaChange";
	private static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	private static final String AFTER_CACHE_CHANGE = "afterCacheChange";
	private static final String AFTER_CHILDREN_CHANGE = "afterChildrenChange";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	private static final String AFTER_CSS_CLASSES_CHANGE = "afterCssClassesChange";
	private static final String AFTER_DRAGGABLE_CHANGE = "afterDraggableChange";
	private static final String AFTER_EXPANDED_CHANGE = "afterExpandedChange";
	private static final String AFTER_HIT_AREA_EL_CHANGE = "afterHitAreaElChange";
	private static final String AFTER_ICON_EL_CHANGE = "afterIconElChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INDEX_CHANGE = "afterIndexChange";
	private static final String AFTER_IO_CHANGE = "afterIoChange";
	private static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	private static final String AFTER_LABEL_EL_CHANGE = "afterLabelElChange";
	private static final String AFTER_LEAF_CHANGE = "afterLeafChange";
	private static final String AFTER_LOADED_CHANGE = "afterLoadedChange";
	private static final String AFTER_LOADING_CHANGE = "afterLoadingChange";
	private static final String AFTER_NEXT_SIBLING_CHANGE = "afterNextSiblingChange";
	private static final String AFTER_OWNER_TREE_CHANGE = "afterOwnerTreeChange";
	private static final String AFTER_PAGINATOR_CHANGE = "afterPaginatorChange";
	private static final String AFTER_PARENT_NODE_CHANGE = "afterParentNodeChange";
	private static final String AFTER_PREV_SIBLING_CHANGE = "afterPrevSiblingChange";
	private static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String ON_ALWAYS_SHOW_HIT_AREA_CHANGE = "onAlwaysShowHitAreaChange";
	private static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	private static final String ON_CACHE_CHANGE = "onCacheChange";
	private static final String ON_CHILDREN_CHANGE = "onChildrenChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	private static final String ON_CSS_CLASSES_CHANGE = "onCssClassesChange";
	private static final String ON_DRAGGABLE_CHANGE = "onDraggableChange";
	private static final String ON_EXPANDED_CHANGE = "onExpandedChange";
	private static final String ON_HIT_AREA_EL_CHANGE = "onHitAreaElChange";
	private static final String ON_ICON_EL_CHANGE = "onIconElChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INDEX_CHANGE = "onIndexChange";
	private static final String ON_IO_CHANGE = "onIoChange";
	private static final String ON_LABEL_CHANGE = "onLabelChange";
	private static final String ON_LABEL_EL_CHANGE = "onLabelElChange";
	private static final String ON_LEAF_CHANGE = "onLeafChange";
	private static final String ON_LOADED_CHANGE = "onLoadedChange";
	private static final String ON_LOADING_CHANGE = "onLoadingChange";
	private static final String ON_NEXT_SIBLING_CHANGE = "onNextSiblingChange";
	private static final String ON_OWNER_TREE_CHANGE = "onOwnerTreeChange";
	private static final String ON_PAGINATOR_CHANGE = "onPaginatorChange";
	private static final String ON_PARENT_NODE_CHANGE = "onParentNodeChange";
	private static final String ON_PREV_SIBLING_CHANGE = "onPrevSiblingChange";
	private static final String ON_RENDERED_CHANGE = "onRenderedChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";

	protected java.lang.Boolean getAlwaysShowHitArea() {
		return (java.lang.Boolean) getStateHelper().eval(ALWAYS_SHOW_HIT_AREA, null);
	}

	protected void setAlwaysShowHitArea(java.lang.Boolean alwaysShowHitArea) {
		getStateHelper().put(ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea);
	}

	protected java.lang.Object getBoundingBox() {
		return (java.lang.Object) getStateHelper().eval(BOUNDING_BOX, null);
	}

	protected void setBoundingBox(java.lang.Object boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	protected java.lang.Boolean getCache() {
		return (java.lang.Boolean) getStateHelper().eval(CACHE, null);
	}

	protected void setCache(java.lang.Boolean cache) {
		getStateHelper().put(CACHE, cache);
	}

	protected java.lang.Object getTreenodeioChildren() {
		return (java.lang.Object) getStateHelper().eval(TREENODEIO_CHILDREN, null);
	}

	protected void setTreenodeioChildren(java.lang.Object treenodeioChildren) {
		getStateHelper().put(TREENODEIO_CHILDREN, treenodeioChildren);
	}

	protected java.lang.String getContainer() {
		return (java.lang.String) getStateHelper().eval(CONTAINER, null);
	}

	protected void setContainer(java.lang.String container) {
		getStateHelper().put(CONTAINER, container);
	}

	protected java.lang.Object getContentBox() {
		return (java.lang.Object) getStateHelper().eval(CONTENT_BOX, null);
	}

	protected void setContentBox(java.lang.Object contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	protected java.lang.Object getCssClasses() {
		return (java.lang.Object) getStateHelper().eval(CSS_CLASSES, null);
	}

	protected void setCssClasses(java.lang.Object cssClasses) {
		getStateHelper().put(CSS_CLASSES, cssClasses);
	}

	protected java.lang.Boolean getDraggable() {
		return (java.lang.Boolean) getStateHelper().eval(DRAGGABLE, null);
	}

	protected void setDraggable(java.lang.Boolean draggable) {
		getStateHelper().put(DRAGGABLE, draggable);
	}

	protected java.lang.Boolean getExpanded() {
		return (java.lang.Boolean) getStateHelper().eval(EXPANDED, null);
	}

	protected void setExpanded(java.lang.Boolean expanded) {
		getStateHelper().put(EXPANDED, expanded);
	}

	protected java.lang.String getHitAreaEl() {
		return (java.lang.String) getStateHelper().eval(HIT_AREA_EL, null);
	}

	protected void setHitAreaEl(java.lang.String hitAreaEl) {
		getStateHelper().put(HIT_AREA_EL, hitAreaEl);
	}

	protected java.lang.String getIconEl() {
		return (java.lang.String) getStateHelper().eval(ICON_EL, null);
	}

	protected void setIconEl(java.lang.String iconEl) {
		getStateHelper().put(ICON_EL, iconEl);
	}

	protected java.lang.String getTreenodeioId() {
		return (java.lang.String) getStateHelper().eval(TREENODEIO_ID, null);
	}

	protected void setTreenodeioId(java.lang.String treenodeioId) {
		getStateHelper().put(TREENODEIO_ID, treenodeioId);
	}

	protected java.lang.Object getIndex() {
		return (java.lang.Object) getStateHelper().eval(INDEX, null);
	}

	protected void setIndex(java.lang.Object index) {
		getStateHelper().put(INDEX, index);
	}

	protected java.lang.Object getIo() {
		return (java.lang.Object) getStateHelper().eval(IO, null);
	}

	protected void setIo(java.lang.Object io) {
		getStateHelper().put(IO, io);
	}

	protected java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(LABEL, null);
	}

	protected void setLabel(java.lang.String label) {
		getStateHelper().put(LABEL, label);
	}

	protected java.lang.String getLabelEl() {
		return (java.lang.String) getStateHelper().eval(LABEL_EL, null);
	}

	protected void setLabelEl(java.lang.String labelEl) {
		getStateHelper().put(LABEL_EL, labelEl);
	}

	protected java.lang.Boolean getLeaf() {
		return (java.lang.Boolean) getStateHelper().eval(LEAF, null);
	}

	protected void setLeaf(java.lang.Boolean leaf) {
		getStateHelper().put(LEAF, leaf);
	}

	protected java.lang.Boolean getLoaded() {
		return (java.lang.Boolean) getStateHelper().eval(LOADED, null);
	}

	protected void setLoaded(java.lang.Boolean loaded) {
		getStateHelper().put(LOADED, loaded);
	}

	protected java.lang.Boolean getLoading() {
		return (java.lang.Boolean) getStateHelper().eval(LOADING, null);
	}

	protected void setLoading(java.lang.Boolean loading) {
		getStateHelper().put(LOADING, loading);
	}

	protected java.lang.Object getNextSibling() {
		return (java.lang.Object) getStateHelper().eval(NEXT_SIBLING, null);
	}

	protected void setNextSibling(java.lang.Object nextSibling) {
		getStateHelper().put(NEXT_SIBLING, nextSibling);
	}

	protected java.lang.Object getOwnerTree() {
		return (java.lang.Object) getStateHelper().eval(OWNER_TREE, null);
	}

	protected void setOwnerTree(java.lang.Object ownerTree) {
		getStateHelper().put(OWNER_TREE, ownerTree);
	}

	protected java.lang.Object getPaginator() {
		return (java.lang.Object) getStateHelper().eval(PAGINATOR, null);
	}

	protected void setPaginator(java.lang.Object paginator) {
		getStateHelper().put(PAGINATOR, paginator);
	}

	protected java.lang.Object getParentNode() {
		return (java.lang.Object) getStateHelper().eval(PARENT_NODE, null);
	}

	protected void setParentNode(java.lang.Object parentNode) {
		getStateHelper().put(PARENT_NODE, parentNode);
	}

	protected java.lang.Object getPrevSibling() {
		return (java.lang.Object) getStateHelper().eval(PREV_SIBLING, null);
	}

	protected void setPrevSibling(java.lang.Object prevSibling) {
		getStateHelper().put(PREV_SIBLING, prevSibling);
	}

	protected java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	protected void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	protected java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	protected void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	protected java.lang.String getAfterAlwaysShowHitAreaChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, null);
	}

	protected void setAfterAlwaysShowHitAreaChange(java.lang.String afterAlwaysShowHitAreaChange) {
		getStateHelper().put(AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange);
	}

	protected java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	protected void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	protected java.lang.String getAfterCacheChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CACHE_CHANGE, null);
	}

	protected void setAfterCacheChange(java.lang.String afterCacheChange) {
		getStateHelper().put(AFTER_CACHE_CHANGE, afterCacheChange);
	}

	protected java.lang.String getAfterChildrenChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CHILDREN_CHANGE, null);
	}

	protected void setAfterChildrenChange(java.lang.String afterChildrenChange) {
		getStateHelper().put(AFTER_CHILDREN_CHANGE, afterChildrenChange);
	}

	protected java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	protected void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	protected java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	protected void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	protected java.lang.String getAfterCssClassesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASSES_CHANGE, null);
	}

	protected void setAfterCssClassesChange(java.lang.String afterCssClassesChange) {
		getStateHelper().put(AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange);
	}

	protected java.lang.String getAfterDraggableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DRAGGABLE_CHANGE, null);
	}

	protected void setAfterDraggableChange(java.lang.String afterDraggableChange) {
		getStateHelper().put(AFTER_DRAGGABLE_CHANGE, afterDraggableChange);
	}

	protected java.lang.String getAfterExpandedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EXPANDED_CHANGE, null);
	}

	protected void setAfterExpandedChange(java.lang.String afterExpandedChange) {
		getStateHelper().put(AFTER_EXPANDED_CHANGE, afterExpandedChange);
	}

	protected java.lang.String getAfterHitAreaElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIT_AREA_EL_CHANGE, null);
	}

	protected void setAfterHitAreaElChange(java.lang.String afterHitAreaElChange) {
		getStateHelper().put(AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange);
	}

	protected java.lang.String getAfterIconElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_EL_CHANGE, null);
	}

	protected void setAfterIconElChange(java.lang.String afterIconElChange) {
		getStateHelper().put(AFTER_ICON_EL_CHANGE, afterIconElChange);
	}

	protected java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	protected void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	protected java.lang.String getAfterIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INDEX_CHANGE, null);
	}

	protected void setAfterIndexChange(java.lang.String afterIndexChange) {
		getStateHelper().put(AFTER_INDEX_CHANGE, afterIndexChange);
	}

	protected java.lang.String getAfterIoChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_IO_CHANGE, null);
	}

	protected void setAfterIoChange(java.lang.String afterIoChange) {
		getStateHelper().put(AFTER_IO_CHANGE, afterIoChange);
	}

	protected java.lang.String getAfterLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_CHANGE, null);
	}

	protected void setAfterLabelChange(java.lang.String afterLabelChange) {
		getStateHelper().put(AFTER_LABEL_CHANGE, afterLabelChange);
	}

	protected java.lang.String getAfterLabelElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_EL_CHANGE, null);
	}

	protected void setAfterLabelElChange(java.lang.String afterLabelElChange) {
		getStateHelper().put(AFTER_LABEL_EL_CHANGE, afterLabelElChange);
	}

	protected java.lang.String getAfterLeafChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LEAF_CHANGE, null);
	}

	protected void setAfterLeafChange(java.lang.String afterLeafChange) {
		getStateHelper().put(AFTER_LEAF_CHANGE, afterLeafChange);
	}

	protected java.lang.String getAfterLoadedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADED_CHANGE, null);
	}

	protected void setAfterLoadedChange(java.lang.String afterLoadedChange) {
		getStateHelper().put(AFTER_LOADED_CHANGE, afterLoadedChange);
	}

	protected java.lang.String getAfterLoadingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADING_CHANGE, null);
	}

	protected void setAfterLoadingChange(java.lang.String afterLoadingChange) {
		getStateHelper().put(AFTER_LOADING_CHANGE, afterLoadingChange);
	}

	protected java.lang.String getAfterNextSiblingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NEXT_SIBLING_CHANGE, null);
	}

	protected void setAfterNextSiblingChange(java.lang.String afterNextSiblingChange) {
		getStateHelper().put(AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange);
	}

	protected java.lang.String getAfterOwnerTreeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OWNER_TREE_CHANGE, null);
	}

	protected void setAfterOwnerTreeChange(java.lang.String afterOwnerTreeChange) {
		getStateHelper().put(AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange);
	}

	protected java.lang.String getAfterPaginatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PAGINATOR_CHANGE, null);
	}

	protected void setAfterPaginatorChange(java.lang.String afterPaginatorChange) {
		getStateHelper().put(AFTER_PAGINATOR_CHANGE, afterPaginatorChange);
	}

	protected java.lang.String getAfterParentNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PARENT_NODE_CHANGE, null);
	}

	protected void setAfterParentNodeChange(java.lang.String afterParentNodeChange) {
		getStateHelper().put(AFTER_PARENT_NODE_CHANGE, afterParentNodeChange);
	}

	protected java.lang.String getAfterPrevSiblingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREV_SIBLING_CHANGE, null);
	}

	protected void setAfterPrevSiblingChange(java.lang.String afterPrevSiblingChange) {
		getStateHelper().put(AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange);
	}

	protected java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	protected void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	protected java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	protected void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	protected java.lang.String getOnAlwaysShowHitAreaChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALWAYS_SHOW_HIT_AREA_CHANGE, null);
	}

	protected void setOnAlwaysShowHitAreaChange(java.lang.String onAlwaysShowHitAreaChange) {
		getStateHelper().put(ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange);
	}

	protected java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	protected void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	protected java.lang.String getOnCacheChange() {
		return (java.lang.String) getStateHelper().eval(ON_CACHE_CHANGE, null);
	}

	protected void setOnCacheChange(java.lang.String onCacheChange) {
		getStateHelper().put(ON_CACHE_CHANGE, onCacheChange);
	}

	protected java.lang.String getOnChildrenChange() {
		return (java.lang.String) getStateHelper().eval(ON_CHILDREN_CHANGE, null);
	}

	protected void setOnChildrenChange(java.lang.String onChildrenChange) {
		getStateHelper().put(ON_CHILDREN_CHANGE, onChildrenChange);
	}

	protected java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	protected void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	protected java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	protected void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	protected java.lang.String getOnCssClassesChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASSES_CHANGE, null);
	}

	protected void setOnCssClassesChange(java.lang.String onCssClassesChange) {
		getStateHelper().put(ON_CSS_CLASSES_CHANGE, onCssClassesChange);
	}

	protected java.lang.String getOnDraggableChange() {
		return (java.lang.String) getStateHelper().eval(ON_DRAGGABLE_CHANGE, null);
	}

	protected void setOnDraggableChange(java.lang.String onDraggableChange) {
		getStateHelper().put(ON_DRAGGABLE_CHANGE, onDraggableChange);
	}

	protected java.lang.String getOnExpandedChange() {
		return (java.lang.String) getStateHelper().eval(ON_EXPANDED_CHANGE, null);
	}

	protected void setOnExpandedChange(java.lang.String onExpandedChange) {
		getStateHelper().put(ON_EXPANDED_CHANGE, onExpandedChange);
	}

	protected java.lang.String getOnHitAreaElChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIT_AREA_EL_CHANGE, null);
	}

	protected void setOnHitAreaElChange(java.lang.String onHitAreaElChange) {
		getStateHelper().put(ON_HIT_AREA_EL_CHANGE, onHitAreaElChange);
	}

	protected java.lang.String getOnIconElChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_EL_CHANGE, null);
	}

	protected void setOnIconElChange(java.lang.String onIconElChange) {
		getStateHelper().put(ON_ICON_EL_CHANGE, onIconElChange);
	}

	protected java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	protected void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	protected java.lang.String getOnIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_INDEX_CHANGE, null);
	}

	protected void setOnIndexChange(java.lang.String onIndexChange) {
		getStateHelper().put(ON_INDEX_CHANGE, onIndexChange);
	}

	protected java.lang.String getOnIoChange() {
		return (java.lang.String) getStateHelper().eval(ON_IO_CHANGE, null);
	}

	protected void setOnIoChange(java.lang.String onIoChange) {
		getStateHelper().put(ON_IO_CHANGE, onIoChange);
	}

	protected java.lang.String getOnLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_CHANGE, null);
	}

	protected void setOnLabelChange(java.lang.String onLabelChange) {
		getStateHelper().put(ON_LABEL_CHANGE, onLabelChange);
	}

	protected java.lang.String getOnLabelElChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_EL_CHANGE, null);
	}

	protected void setOnLabelElChange(java.lang.String onLabelElChange) {
		getStateHelper().put(ON_LABEL_EL_CHANGE, onLabelElChange);
	}

	protected java.lang.String getOnLeafChange() {
		return (java.lang.String) getStateHelper().eval(ON_LEAF_CHANGE, null);
	}

	protected void setOnLeafChange(java.lang.String onLeafChange) {
		getStateHelper().put(ON_LEAF_CHANGE, onLeafChange);
	}

	protected java.lang.String getOnLoadedChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADED_CHANGE, null);
	}

	protected void setOnLoadedChange(java.lang.String onLoadedChange) {
		getStateHelper().put(ON_LOADED_CHANGE, onLoadedChange);
	}

	protected java.lang.String getOnLoadingChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADING_CHANGE, null);
	}

	protected void setOnLoadingChange(java.lang.String onLoadingChange) {
		getStateHelper().put(ON_LOADING_CHANGE, onLoadingChange);
	}

	protected java.lang.String getOnNextSiblingChange() {
		return (java.lang.String) getStateHelper().eval(ON_NEXT_SIBLING_CHANGE, null);
	}

	protected void setOnNextSiblingChange(java.lang.String onNextSiblingChange) {
		getStateHelper().put(ON_NEXT_SIBLING_CHANGE, onNextSiblingChange);
	}

	protected java.lang.String getOnOwnerTreeChange() {
		return (java.lang.String) getStateHelper().eval(ON_OWNER_TREE_CHANGE, null);
	}

	protected void setOnOwnerTreeChange(java.lang.String onOwnerTreeChange) {
		getStateHelper().put(ON_OWNER_TREE_CHANGE, onOwnerTreeChange);
	}

	protected java.lang.String getOnPaginatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_PAGINATOR_CHANGE, null);
	}

	protected void setOnPaginatorChange(java.lang.String onPaginatorChange) {
		getStateHelper().put(ON_PAGINATOR_CHANGE, onPaginatorChange);
	}

	protected java.lang.String getOnParentNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_PARENT_NODE_CHANGE, null);
	}

	protected void setOnParentNodeChange(java.lang.String onParentNodeChange) {
		getStateHelper().put(ON_PARENT_NODE_CHANGE, onParentNodeChange);
	}

	protected java.lang.String getOnPrevSiblingChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREV_SIBLING_CHANGE, null);
	}

	protected void setOnPrevSiblingChange(java.lang.String onPrevSiblingChange) {
		getStateHelper().put(ON_PREV_SIBLING_CHANGE, onPrevSiblingChange);
	}

	protected java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	protected void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	protected java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	protected void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

}