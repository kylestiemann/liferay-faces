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
package com.liferay.faces.alloy.component.treenode;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeNodeBase extends javax.faces.component.UIPanel {

	public static final String ALWAYS_SHOW_HIT_AREA = "alwaysShowHitArea";
	public static final String BOUNDING_BOX = "boundingBox";
	public static final String TREE_NODE_CHILDREN = "children";
	public static final String CONTAINER = "container";
	public static final String CONTENT_BOX = "contentBox";
	public static final String CSS_CLASSES = "cssClasses";
	public static final String DESTROYED = "destroyed";
	public static final String DRAGGABLE = "draggable";
	public static final String EXPANDED = "expanded";
	public static final String HIT_AREA_EL = "hitAreaEl";
	public static final String ICON_EL = "iconEl";
	public static final String TREE_NODE_ID = "id";
	public static final String INDEX = "index";
	public static final String INITIALIZED = "initialized";
	public static final String LABEL = "label";
	public static final String LABEL_EL = "labelEl";
	public static final String LEAF = "leaf";
	public static final String NEXT_SIBLING = "nextSibling";
	public static final String OWNER_TREE = "ownerTree";
	public static final String PARENT_NODE = "parentNode";
	public static final String PREV_SIBLING = "prevSibling";
	public static final String RENDERED = "rendered";
	public static final String TAB_INDEX = "tabIndex";
	public static final String AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE = "afterAlwaysShowHitAreaChange";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CHILDREN_CHANGE = "afterChildrenChange";
	public static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_CSS_CLASSES_CHANGE = "afterCssClassesChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DRAGGABLE_CHANGE = "afterDraggableChange";
	public static final String AFTER_EXPANDED_CHANGE = "afterExpandedChange";
	public static final String AFTER_HIT_AREA_EL_CHANGE = "afterHitAreaElChange";
	public static final String AFTER_ICON_EL_CHANGE = "afterIconElChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_INDEX_CHANGE = "afterIndexChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	public static final String AFTER_LABEL_EL_CHANGE = "afterLabelElChange";
	public static final String AFTER_LEAF_CHANGE = "afterLeafChange";
	public static final String AFTER_NEXT_SIBLING_CHANGE = "afterNextSiblingChange";
	public static final String AFTER_OWNER_TREE_CHANGE = "afterOwnerTreeChange";
	public static final String AFTER_PARENT_NODE_CHANGE = "afterParentNodeChange";
	public static final String AFTER_PREV_SIBLING_CHANGE = "afterPrevSiblingChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String ON_ALWAYS_SHOW_HIT_AREA_CHANGE = "onAlwaysShowHitAreaChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CHILDREN_CHANGE = "onChildrenChange";
	public static final String ON_CONTAINER_CHANGE = "onContainerChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_CSS_CLASSES_CHANGE = "onCssClassesChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DRAGGABLE_CHANGE = "onDraggableChange";
	public static final String ON_EXPANDED_CHANGE = "onExpandedChange";
	public static final String ON_HIT_AREA_EL_CHANGE = "onHitAreaElChange";
	public static final String ON_ICON_EL_CHANGE = "onIconElChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_INDEX_CHANGE = "onIndexChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LABEL_CHANGE = "onLabelChange";
	public static final String ON_LABEL_EL_CHANGE = "onLabelElChange";
	public static final String ON_LEAF_CHANGE = "onLeafChange";
	public static final String ON_NEXT_SIBLING_CHANGE = "onNextSiblingChange";
	public static final String ON_OWNER_TREE_CHANGE = "onOwnerTreeChange";
	public static final String ON_PARENT_NODE_CHANGE = "onParentNodeChange";
	public static final String ON_PREV_SIBLING_CHANGE = "onPrevSiblingChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";

	public java.lang.Boolean getAlwaysShowHitArea() {
		return (java.lang.Boolean) getStateHelper().eval(ALWAYS_SHOW_HIT_AREA, null);
	}

	public void setAlwaysShowHitArea(java.lang.Boolean alwaysShowHitArea) {
		getStateHelper().put(ALWAYS_SHOW_HIT_AREA, alwaysShowHitArea);
	}

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.Object getTreeNodeChildren() {
		return (java.lang.Object) getStateHelper().eval(TREE_NODE_CHILDREN, null);
	}

	public void setTreeNodeChildren(java.lang.Object treeNodeChildren) {
		getStateHelper().put(TREE_NODE_CHILDREN, treeNodeChildren);
	}

	public java.lang.String getContainer() {
		return (java.lang.String) getStateHelper().eval(CONTAINER, null);
	}

	public void setContainer(java.lang.String container) {
		getStateHelper().put(CONTAINER, container);
	}

	public java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	public void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	public java.lang.Object getCssClasses() {
		return (java.lang.Object) getStateHelper().eval(CSS_CLASSES, null);
	}

	public void setCssClasses(java.lang.Object cssClasses) {
		getStateHelper().put(CSS_CLASSES, cssClasses);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getDraggable() {
		return (java.lang.Boolean) getStateHelper().eval(DRAGGABLE, null);
	}

	public void setDraggable(java.lang.Boolean draggable) {
		getStateHelper().put(DRAGGABLE, draggable);
	}

	public java.lang.Boolean getExpanded() {
		return (java.lang.Boolean) getStateHelper().eval(EXPANDED, null);
	}

	public void setExpanded(java.lang.Boolean expanded) {
		getStateHelper().put(EXPANDED, expanded);
	}

	public java.lang.String getHitAreaEl() {
		return (java.lang.String) getStateHelper().eval(HIT_AREA_EL, null);
	}

	public void setHitAreaEl(java.lang.String hitAreaEl) {
		getStateHelper().put(HIT_AREA_EL, hitAreaEl);
	}

	public java.lang.String getIconEl() {
		return (java.lang.String) getStateHelper().eval(ICON_EL, null);
	}

	public void setIconEl(java.lang.String iconEl) {
		getStateHelper().put(ICON_EL, iconEl);
	}

	public java.lang.String getTreeNodeId() {
		return (java.lang.String) getStateHelper().eval(TREE_NODE_ID, null);
	}

	public void setTreeNodeId(java.lang.String treeNodeId) {
		getStateHelper().put(TREE_NODE_ID, treeNodeId);
	}

	public java.lang.Object getIndex() {
		return (java.lang.Object) getStateHelper().eval(INDEX, null);
	}

	public void setIndex(java.lang.Object index) {
		getStateHelper().put(INDEX, index);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(LABEL, null);
	}

	public void setLabel(java.lang.String label) {
		getStateHelper().put(LABEL, label);
	}

	public java.lang.String getLabelEl() {
		return (java.lang.String) getStateHelper().eval(LABEL_EL, null);
	}

	public void setLabelEl(java.lang.String labelEl) {
		getStateHelper().put(LABEL_EL, labelEl);
	}

	public java.lang.Boolean getLeaf() {
		return (java.lang.Boolean) getStateHelper().eval(LEAF, null);
	}

	public void setLeaf(java.lang.Boolean leaf) {
		getStateHelper().put(LEAF, leaf);
	}

	public java.lang.Object getNextSibling() {
		return (java.lang.Object) getStateHelper().eval(NEXT_SIBLING, null);
	}

	public void setNextSibling(java.lang.Object nextSibling) {
		getStateHelper().put(NEXT_SIBLING, nextSibling);
	}

	public java.lang.Object getOwnerTree() {
		return (java.lang.Object) getStateHelper().eval(OWNER_TREE, null);
	}

	public void setOwnerTree(java.lang.Object ownerTree) {
		getStateHelper().put(OWNER_TREE, ownerTree);
	}

	public java.lang.Object getParentNode() {
		return (java.lang.Object) getStateHelper().eval(PARENT_NODE, null);
	}

	public void setParentNode(java.lang.Object parentNode) {
		getStateHelper().put(PARENT_NODE, parentNode);
	}

	public java.lang.Object getPrevSibling() {
		return (java.lang.Object) getStateHelper().eval(PREV_SIBLING, null);
	}

	public void setPrevSibling(java.lang.Object prevSibling) {
		getStateHelper().put(PREV_SIBLING, prevSibling);
	}

	public java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	public void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	public java.lang.String getTabIndex() {
		return (java.lang.String) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.String tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.String getAfterAlwaysShowHitAreaChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, null);
	}

	public void setAfterAlwaysShowHitAreaChange(java.lang.String afterAlwaysShowHitAreaChange) {
		getStateHelper().put(AFTER_ALWAYS_SHOW_HIT_AREA_CHANGE, afterAlwaysShowHitAreaChange);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterChildrenChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CHILDREN_CHANGE, null);
	}

	public void setAfterChildrenChange(java.lang.String afterChildrenChange) {
		getStateHelper().put(AFTER_CHILDREN_CHANGE, afterChildrenChange);
	}

	public java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	public void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	public java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	public java.lang.String getAfterCssClassesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASSES_CHANGE, null);
	}

	public void setAfterCssClassesChange(java.lang.String afterCssClassesChange) {
		getStateHelper().put(AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDraggableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DRAGGABLE_CHANGE, null);
	}

	public void setAfterDraggableChange(java.lang.String afterDraggableChange) {
		getStateHelper().put(AFTER_DRAGGABLE_CHANGE, afterDraggableChange);
	}

	public java.lang.String getAfterExpandedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EXPANDED_CHANGE, null);
	}

	public void setAfterExpandedChange(java.lang.String afterExpandedChange) {
		getStateHelper().put(AFTER_EXPANDED_CHANGE, afterExpandedChange);
	}

	public java.lang.String getAfterHitAreaElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIT_AREA_EL_CHANGE, null);
	}

	public void setAfterHitAreaElChange(java.lang.String afterHitAreaElChange) {
		getStateHelper().put(AFTER_HIT_AREA_EL_CHANGE, afterHitAreaElChange);
	}

	public java.lang.String getAfterIconElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_EL_CHANGE, null);
	}

	public void setAfterIconElChange(java.lang.String afterIconElChange) {
		getStateHelper().put(AFTER_ICON_EL_CHANGE, afterIconElChange);
	}

	public java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	public void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	public java.lang.String getAfterIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INDEX_CHANGE, null);
	}

	public void setAfterIndexChange(java.lang.String afterIndexChange) {
		getStateHelper().put(AFTER_INDEX_CHANGE, afterIndexChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_CHANGE, null);
	}

	public void setAfterLabelChange(java.lang.String afterLabelChange) {
		getStateHelper().put(AFTER_LABEL_CHANGE, afterLabelChange);
	}

	public java.lang.String getAfterLabelElChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_EL_CHANGE, null);
	}

	public void setAfterLabelElChange(java.lang.String afterLabelElChange) {
		getStateHelper().put(AFTER_LABEL_EL_CHANGE, afterLabelElChange);
	}

	public java.lang.String getAfterLeafChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LEAF_CHANGE, null);
	}

	public void setAfterLeafChange(java.lang.String afterLeafChange) {
		getStateHelper().put(AFTER_LEAF_CHANGE, afterLeafChange);
	}

	public java.lang.String getAfterNextSiblingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NEXT_SIBLING_CHANGE, null);
	}

	public void setAfterNextSiblingChange(java.lang.String afterNextSiblingChange) {
		getStateHelper().put(AFTER_NEXT_SIBLING_CHANGE, afterNextSiblingChange);
	}

	public java.lang.String getAfterOwnerTreeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OWNER_TREE_CHANGE, null);
	}

	public void setAfterOwnerTreeChange(java.lang.String afterOwnerTreeChange) {
		getStateHelper().put(AFTER_OWNER_TREE_CHANGE, afterOwnerTreeChange);
	}

	public java.lang.String getAfterParentNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PARENT_NODE_CHANGE, null);
	}

	public void setAfterParentNodeChange(java.lang.String afterParentNodeChange) {
		getStateHelper().put(AFTER_PARENT_NODE_CHANGE, afterParentNodeChange);
	}

	public java.lang.String getAfterPrevSiblingChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREV_SIBLING_CHANGE, null);
	}

	public void setAfterPrevSiblingChange(java.lang.String afterPrevSiblingChange) {
		getStateHelper().put(AFTER_PREV_SIBLING_CHANGE, afterPrevSiblingChange);
	}

	public java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	public void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	public java.lang.String getOnAlwaysShowHitAreaChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALWAYS_SHOW_HIT_AREA_CHANGE, null);
	}

	public void setOnAlwaysShowHitAreaChange(java.lang.String onAlwaysShowHitAreaChange) {
		getStateHelper().put(ON_ALWAYS_SHOW_HIT_AREA_CHANGE, onAlwaysShowHitAreaChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnChildrenChange() {
		return (java.lang.String) getStateHelper().eval(ON_CHILDREN_CHANGE, null);
	}

	public void setOnChildrenChange(java.lang.String onChildrenChange) {
		getStateHelper().put(ON_CHILDREN_CHANGE, onChildrenChange);
	}

	public java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	public void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	public java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	public java.lang.String getOnCssClassesChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASSES_CHANGE, null);
	}

	public void setOnCssClassesChange(java.lang.String onCssClassesChange) {
		getStateHelper().put(ON_CSS_CLASSES_CHANGE, onCssClassesChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDraggableChange() {
		return (java.lang.String) getStateHelper().eval(ON_DRAGGABLE_CHANGE, null);
	}

	public void setOnDraggableChange(java.lang.String onDraggableChange) {
		getStateHelper().put(ON_DRAGGABLE_CHANGE, onDraggableChange);
	}

	public java.lang.String getOnExpandedChange() {
		return (java.lang.String) getStateHelper().eval(ON_EXPANDED_CHANGE, null);
	}

	public void setOnExpandedChange(java.lang.String onExpandedChange) {
		getStateHelper().put(ON_EXPANDED_CHANGE, onExpandedChange);
	}

	public java.lang.String getOnHitAreaElChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIT_AREA_EL_CHANGE, null);
	}

	public void setOnHitAreaElChange(java.lang.String onHitAreaElChange) {
		getStateHelper().put(ON_HIT_AREA_EL_CHANGE, onHitAreaElChange);
	}

	public java.lang.String getOnIconElChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_EL_CHANGE, null);
	}

	public void setOnIconElChange(java.lang.String onIconElChange) {
		getStateHelper().put(ON_ICON_EL_CHANGE, onIconElChange);
	}

	public java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	public void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	public java.lang.String getOnIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_INDEX_CHANGE, null);
	}

	public void setOnIndexChange(java.lang.String onIndexChange) {
		getStateHelper().put(ON_INDEX_CHANGE, onIndexChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_CHANGE, null);
	}

	public void setOnLabelChange(java.lang.String onLabelChange) {
		getStateHelper().put(ON_LABEL_CHANGE, onLabelChange);
	}

	public java.lang.String getOnLabelElChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_EL_CHANGE, null);
	}

	public void setOnLabelElChange(java.lang.String onLabelElChange) {
		getStateHelper().put(ON_LABEL_EL_CHANGE, onLabelElChange);
	}

	public java.lang.String getOnLeafChange() {
		return (java.lang.String) getStateHelper().eval(ON_LEAF_CHANGE, null);
	}

	public void setOnLeafChange(java.lang.String onLeafChange) {
		getStateHelper().put(ON_LEAF_CHANGE, onLeafChange);
	}

	public java.lang.String getOnNextSiblingChange() {
		return (java.lang.String) getStateHelper().eval(ON_NEXT_SIBLING_CHANGE, null);
	}

	public void setOnNextSiblingChange(java.lang.String onNextSiblingChange) {
		getStateHelper().put(ON_NEXT_SIBLING_CHANGE, onNextSiblingChange);
	}

	public java.lang.String getOnOwnerTreeChange() {
		return (java.lang.String) getStateHelper().eval(ON_OWNER_TREE_CHANGE, null);
	}

	public void setOnOwnerTreeChange(java.lang.String onOwnerTreeChange) {
		getStateHelper().put(ON_OWNER_TREE_CHANGE, onOwnerTreeChange);
	}

	public java.lang.String getOnParentNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_PARENT_NODE_CHANGE, null);
	}

	public void setOnParentNodeChange(java.lang.String onParentNodeChange) {
		getStateHelper().put(ON_PARENT_NODE_CHANGE, onParentNodeChange);
	}

	public java.lang.String getOnPrevSiblingChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREV_SIBLING_CHANGE, null);
	}

	public void setOnPrevSiblingChange(java.lang.String onPrevSiblingChange) {
		getStateHelper().put(ON_PREV_SIBLING_CHANGE, onPrevSiblingChange);
	}

	public java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	public void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

}