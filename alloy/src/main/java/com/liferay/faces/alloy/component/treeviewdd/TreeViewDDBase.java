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
package com.liferay.faces.alloy.component.treeviewdd;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeViewDDBase extends javax.faces.component.UIPanel {

	public static final String TREEVIEWDD_CHILDREN = "treeviewddChildren";
	public static final String CONTAINER = "container";
	public static final String DESTROYED = "destroyed";
	public static final String DROP_ACTION = "dropAction";
	public static final String HELPER = "helper";
	public static final String INDEX = "index";
	public static final String INITIALIZED = "initialized";
	public static final String LAST_SELECTED = "lastSelected";
	public static final String LAST_Y = "lastY";
	public static final String LAZY_LOAD = "lazyLoad";
	public static final String NODE = "node";
	public static final String NODE_CONTENT = "nodeContent";
	public static final String SCROLL_DELAY = "scrollDelay";
	public static final String SELECT_ON_TOGGLE = "selectOnToggle";
	public static final String TYPE = "type";
	public static final String AFTER_CHILDREN_CHANGE = "afterChildrenChange";
	public static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DROP_ACTION_CHANGE = "afterDropActionChange";
	public static final String AFTER_HELPER_CHANGE = "afterHelperChange";
	public static final String AFTER_INDEX_CHANGE = "afterIndexChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LAST_SELECTED_CHANGE = "afterLastSelectedChange";
	public static final String AFTER_LAST_YCHANGE = "afterLastYChange";
	public static final String AFTER_LAZY_LOAD_CHANGE = "afterLazyLoadChange";
	public static final String AFTER_NODE_CHANGE = "afterNodeChange";
	public static final String AFTER_NODE_CONTENT_CHANGE = "afterNodeContentChange";
	public static final String AFTER_SCROLL_DELAY_CHANGE = "afterScrollDelayChange";
	public static final String AFTER_SELECT_ON_TOGGLE_CHANGE = "afterSelectOnToggleChange";
	public static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	public static final String ON_CHILDREN_CHANGE = "onChildrenChange";
	public static final String ON_CONTAINER_CHANGE = "onContainerChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DROP_ACTION_CHANGE = "onDropActionChange";
	public static final String ON_HELPER_CHANGE = "onHelperChange";
	public static final String ON_INDEX_CHANGE = "onIndexChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LAST_SELECTED_CHANGE = "onLastSelectedChange";
	public static final String ON_LAST_YCHANGE = "onLastYChange";
	public static final String ON_LAZY_LOAD_CHANGE = "onLazyLoadChange";
	public static final String ON_NODE_CHANGE = "onNodeChange";
	public static final String ON_NODE_CONTENT_CHANGE = "onNodeContentChange";
	public static final String ON_SCROLL_DELAY_CHANGE = "onScrollDelayChange";
	public static final String ON_SELECT_ON_TOGGLE_CHANGE = "onSelectOnToggleChange";
	public static final String ON_TYPE_CHANGE = "onTypeChange";

	public java.lang.Object getTreeviewddChildren() {
		return (java.lang.Object) getStateHelper().eval(TREEVIEWDD_CHILDREN, null);
	}

	public void setTreeviewddChildren(java.lang.Object treeviewddChildren) {
		getStateHelper().put(TREEVIEWDD_CHILDREN, treeviewddChildren);
	}

	public java.lang.String getContainer() {
		return (java.lang.String) getStateHelper().eval(CONTAINER, null);
	}

	public void setContainer(java.lang.String container) {
		getStateHelper().put(CONTAINER, container);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.String getDropAction() {
		return (java.lang.String) getStateHelper().eval(DROP_ACTION, null);
	}

	public void setDropAction(java.lang.String dropAction) {
		getStateHelper().put(DROP_ACTION, dropAction);
	}

	public java.lang.String getHelper() {
		return (java.lang.String) getStateHelper().eval(HELPER, null);
	}

	public void setHelper(java.lang.String helper) {
		getStateHelper().put(HELPER, helper);
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

	public java.lang.Object getLastSelected() {
		return (java.lang.Object) getStateHelper().eval(LAST_SELECTED, null);
	}

	public void setLastSelected(java.lang.Object lastSelected) {
		getStateHelper().put(LAST_SELECTED, lastSelected);
	}

	public java.lang.Object getLastY() {
		return (java.lang.Object) getStateHelper().eval(LAST_Y, null);
	}

	public void setLastY(java.lang.Object lastY) {
		getStateHelper().put(LAST_Y, lastY);
	}

	public java.lang.Boolean getLazyLoad() {
		return (java.lang.Boolean) getStateHelper().eval(LAZY_LOAD, null);
	}

	public void setLazyLoad(java.lang.Boolean lazyLoad) {
		getStateHelper().put(LAZY_LOAD, lazyLoad);
	}

	public java.lang.String getNode() {
		return (java.lang.String) getStateHelper().eval(NODE, null);
	}

	public void setNode(java.lang.String node) {
		getStateHelper().put(NODE, node);
	}

	public java.lang.Object getNodeContent() {
		return (java.lang.Object) getStateHelper().eval(NODE_CONTENT, null);
	}

	public void setNodeContent(java.lang.Object nodeContent) {
		getStateHelper().put(NODE_CONTENT, nodeContent);
	}

	public java.lang.Object getScrollDelay() {
		return (java.lang.Object) getStateHelper().eval(SCROLL_DELAY, null);
	}

	public void setScrollDelay(java.lang.Object scrollDelay) {
		getStateHelper().put(SCROLL_DELAY, scrollDelay);
	}

	public java.lang.Boolean getSelectOnToggle() {
		return (java.lang.Boolean) getStateHelper().eval(SELECT_ON_TOGGLE, null);
	}

	public void setSelectOnToggle(java.lang.Boolean selectOnToggle) {
		getStateHelper().put(SELECT_ON_TOGGLE, selectOnToggle);
	}

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	public void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
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

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDropActionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_ACTION_CHANGE, null);
	}

	public void setAfterDropActionChange(java.lang.String afterDropActionChange) {
		getStateHelper().put(AFTER_DROP_ACTION_CHANGE, afterDropActionChange);
	}

	public java.lang.String getAfterHelperChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HELPER_CHANGE, null);
	}

	public void setAfterHelperChange(java.lang.String afterHelperChange) {
		getStateHelper().put(AFTER_HELPER_CHANGE, afterHelperChange);
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

	public java.lang.String getAfterLastSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAST_SELECTED_CHANGE, null);
	}

	public void setAfterLastSelectedChange(java.lang.String afterLastSelectedChange) {
		getStateHelper().put(AFTER_LAST_SELECTED_CHANGE, afterLastSelectedChange);
	}

	public java.lang.String getAfterLastYChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAST_YCHANGE, null);
	}

	public void setAfterLastYChange(java.lang.String afterLastYChange) {
		getStateHelper().put(AFTER_LAST_YCHANGE, afterLastYChange);
	}

	public java.lang.String getAfterLazyLoadChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAZY_LOAD_CHANGE, null);
	}

	public void setAfterLazyLoadChange(java.lang.String afterLazyLoadChange) {
		getStateHelper().put(AFTER_LAZY_LOAD_CHANGE, afterLazyLoadChange);
	}

	public java.lang.String getAfterNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_CHANGE, null);
	}

	public void setAfterNodeChange(java.lang.String afterNodeChange) {
		getStateHelper().put(AFTER_NODE_CHANGE, afterNodeChange);
	}

	public java.lang.String getAfterNodeContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_CONTENT_CHANGE, null);
	}

	public void setAfterNodeContentChange(java.lang.String afterNodeContentChange) {
		getStateHelper().put(AFTER_NODE_CONTENT_CHANGE, afterNodeContentChange);
	}

	public java.lang.String getAfterScrollDelayChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCROLL_DELAY_CHANGE, null);
	}

	public void setAfterScrollDelayChange(java.lang.String afterScrollDelayChange) {
		getStateHelper().put(AFTER_SCROLL_DELAY_CHANGE, afterScrollDelayChange);
	}

	public java.lang.String getAfterSelectOnToggleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECT_ON_TOGGLE_CHANGE, null);
	}

	public void setAfterSelectOnToggleChange(java.lang.String afterSelectOnToggleChange) {
		getStateHelper().put(AFTER_SELECT_ON_TOGGLE_CHANGE, afterSelectOnToggleChange);
	}

	public java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	public void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
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

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDropActionChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_ACTION_CHANGE, null);
	}

	public void setOnDropActionChange(java.lang.String onDropActionChange) {
		getStateHelper().put(ON_DROP_ACTION_CHANGE, onDropActionChange);
	}

	public java.lang.String getOnHelperChange() {
		return (java.lang.String) getStateHelper().eval(ON_HELPER_CHANGE, null);
	}

	public void setOnHelperChange(java.lang.String onHelperChange) {
		getStateHelper().put(ON_HELPER_CHANGE, onHelperChange);
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

	public java.lang.String getOnLastSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAST_SELECTED_CHANGE, null);
	}

	public void setOnLastSelectedChange(java.lang.String onLastSelectedChange) {
		getStateHelper().put(ON_LAST_SELECTED_CHANGE, onLastSelectedChange);
	}

	public java.lang.String getOnLastYChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAST_YCHANGE, null);
	}

	public void setOnLastYChange(java.lang.String onLastYChange) {
		getStateHelper().put(ON_LAST_YCHANGE, onLastYChange);
	}

	public java.lang.String getOnLazyLoadChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAZY_LOAD_CHANGE, null);
	}

	public void setOnLazyLoadChange(java.lang.String onLazyLoadChange) {
		getStateHelper().put(ON_LAZY_LOAD_CHANGE, onLazyLoadChange);
	}

	public java.lang.String getOnNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_CHANGE, null);
	}

	public void setOnNodeChange(java.lang.String onNodeChange) {
		getStateHelper().put(ON_NODE_CHANGE, onNodeChange);
	}

	public java.lang.String getOnNodeContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_CONTENT_CHANGE, null);
	}

	public void setOnNodeContentChange(java.lang.String onNodeContentChange) {
		getStateHelper().put(ON_NODE_CONTENT_CHANGE, onNodeContentChange);
	}

	public java.lang.String getOnScrollDelayChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCROLL_DELAY_CHANGE, null);
	}

	public void setOnScrollDelayChange(java.lang.String onScrollDelayChange) {
		getStateHelper().put(ON_SCROLL_DELAY_CHANGE, onScrollDelayChange);
	}

	public java.lang.String getOnSelectOnToggleChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECT_ON_TOGGLE_CHANGE, null);
	}

	public void setOnSelectOnToggleChange(java.lang.String onSelectOnToggleChange) {
		getStateHelper().put(ON_SELECT_ON_TOGGLE_CHANGE, onSelectOnToggleChange);
	}

	public java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	public void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

}