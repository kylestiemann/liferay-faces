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
package com.liferay.faces.alloy.component.treeview;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class TreeViewBase extends javax.faces.component.UIPanel {

	public static final String TREE_VIEW_CHILDREN = "children";
	public static final String CONTAINER = "container";
	public static final String DESTROYED = "destroyed";
	public static final String INDEX = "index";
	public static final String INITIALIZED = "initialized";
	public static final String LAST_SELECTED = "lastSelected";
	public static final String LAZY_LOAD = "lazyLoad";
	public static final String SELECT_ON_TOGGLE = "selectOnToggle";
	public static final String TYPE = "type";
	public static final String AFTER_CHILDREN_CHANGE = "afterChildrenChange";
	public static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_INDEX_CHANGE = "afterIndexChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LAST_SELECTED_CHANGE = "afterLastSelectedChange";
	public static final String AFTER_LAZY_LOAD_CHANGE = "afterLazyLoadChange";
	public static final String AFTER_SELECT_ON_TOGGLE_CHANGE = "afterSelectOnToggleChange";
	public static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	public static final String ON_CHILDREN_CHANGE = "onChildrenChange";
	public static final String ON_CONTAINER_CHANGE = "onContainerChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_INDEX_CHANGE = "onIndexChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LAST_SELECTED_CHANGE = "onLastSelectedChange";
	public static final String ON_LAZY_LOAD_CHANGE = "onLazyLoadChange";
	public static final String ON_SELECT_ON_TOGGLE_CHANGE = "onSelectOnToggleChange";
	public static final String ON_TYPE_CHANGE = "onTypeChange";

	public java.lang.Object getTreeViewChildren() {
		return (java.lang.Object) getStateHelper().eval(TREE_VIEW_CHILDREN, null);
	}

	public void setTreeViewChildren(java.lang.Object treeViewChildren) {
		getStateHelper().put(TREE_VIEW_CHILDREN, treeViewChildren);
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

	public java.lang.Boolean getLazyLoad() {
		return (java.lang.Boolean) getStateHelper().eval(LAZY_LOAD, null);
	}

	public void setLazyLoad(java.lang.Boolean lazyLoad) {
		getStateHelper().put(LAZY_LOAD, lazyLoad);
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

	public java.lang.String getAfterLazyLoadChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAZY_LOAD_CHANGE, null);
	}

	public void setAfterLazyLoadChange(java.lang.String afterLazyLoadChange) {
		getStateHelper().put(AFTER_LAZY_LOAD_CHANGE, afterLazyLoadChange);
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

	public java.lang.String getOnLazyLoadChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAZY_LOAD_CHANGE, null);
	}

	public void setOnLazyLoadChange(java.lang.String onLazyLoadChange) {
		getStateHelper().put(ON_LAZY_LOAD_CHANGE, onLazyLoadChange);
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