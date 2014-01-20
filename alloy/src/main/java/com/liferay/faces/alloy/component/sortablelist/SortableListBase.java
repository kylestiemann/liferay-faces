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
package com.liferay.faces.alloy.component.sortablelist;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class SortableListBase extends javax.faces.component.UIPanel {

	public static final String DD = "dd";
	public static final String DESTROYED = "destroyed";
	public static final String DROP_CONDITION = "dropCondition";
	public static final String DROP_CONTAINER = "dropContainer";
	public static final String DROP_ON = "dropOn";
	public static final String HELPER = "helper";
	public static final String INITIALIZED = "initialized";
	public static final String NODES = "nodes";
	public static final String PLACEHOLDER = "placeholder";
	public static final String PROXY = "proxy";
	public static final String SORT_CONDITION = "sortCondition";
	public static final String AFTER_DD_CHANGE = "afterDdChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DROP_CONDITION_CHANGE = "afterDropConditionChange";
	public static final String AFTER_DROP_CONTAINER_CHANGE = "afterDropContainerChange";
	public static final String AFTER_DROP_ON_CHANGE = "afterDropOnChange";
	public static final String AFTER_HELPER_CHANGE = "afterHelperChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_NODES_CHANGE = "afterNodesChange";
	public static final String AFTER_PLACEHOLDER_CHANGE = "afterPlaceholderChange";
	public static final String AFTER_PROXY_CHANGE = "afterProxyChange";
	public static final String AFTER_SORT_CONDITION_CHANGE = "afterSortConditionChange";
	public static final String ON_DD_CHANGE = "onDdChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DROP_CONDITION_CHANGE = "onDropConditionChange";
	public static final String ON_DROP_CONTAINER_CHANGE = "onDropContainerChange";
	public static final String ON_DROP_ON_CHANGE = "onDropOnChange";
	public static final String ON_HELPER_CHANGE = "onHelperChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_NODES_CHANGE = "onNodesChange";
	public static final String ON_PLACEHOLDER_CHANGE = "onPlaceholderChange";
	public static final String ON_PROXY_CHANGE = "onProxyChange";
	public static final String ON_SORT_CONDITION_CHANGE = "onSortConditionChange";

	public java.lang.String getDd() {
		return (java.lang.String) getStateHelper().eval(DD, null);
	}

	public void setDd(java.lang.String dd) {
		getStateHelper().put(DD, dd);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Object getDropCondition() {
		return (java.lang.Object) getStateHelper().eval(DROP_CONDITION, null);
	}

	public void setDropCondition(java.lang.Object dropCondition) {
		getStateHelper().put(DROP_CONDITION, dropCondition);
	}

	public java.lang.Object getDropContainer() {
		return (java.lang.Object) getStateHelper().eval(DROP_CONTAINER, null);
	}

	public void setDropContainer(java.lang.Object dropContainer) {
		getStateHelper().put(DROP_CONTAINER, dropContainer);
	}

	public java.lang.String getDropOn() {
		return (java.lang.String) getStateHelper().eval(DROP_ON, null);
	}

	public void setDropOn(java.lang.String dropOn) {
		getStateHelper().put(DROP_ON, dropOn);
	}

	public java.lang.String getHelper() {
		return (java.lang.String) getStateHelper().eval(HELPER, null);
	}

	public void setHelper(java.lang.String helper) {
		getStateHelper().put(HELPER, helper);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getNodes() {
		return (java.lang.String) getStateHelper().eval(NODES, null);
	}

	public void setNodes(java.lang.String nodes) {
		getStateHelper().put(NODES, nodes);
	}

	public java.lang.String getPlaceholder() {
		return (java.lang.String) getStateHelper().eval(PLACEHOLDER, null);
	}

	public void setPlaceholder(java.lang.String placeholder) {
		getStateHelper().put(PLACEHOLDER, placeholder);
	}

	public java.lang.String getProxy() {
		return (java.lang.String) getStateHelper().eval(PROXY, null);
	}

	public void setProxy(java.lang.String proxy) {
		getStateHelper().put(PROXY, proxy);
	}

	public java.lang.Object getSortCondition() {
		return (java.lang.Object) getStateHelper().eval(SORT_CONDITION, null);
	}

	public void setSortCondition(java.lang.Object sortCondition) {
		getStateHelper().put(SORT_CONDITION, sortCondition);
	}

	public java.lang.String getAfterDdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DD_CHANGE, null);
	}

	public void setAfterDdChange(java.lang.String afterDdChange) {
		getStateHelper().put(AFTER_DD_CHANGE, afterDdChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDropConditionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONDITION_CHANGE, null);
	}

	public void setAfterDropConditionChange(java.lang.String afterDropConditionChange) {
		getStateHelper().put(AFTER_DROP_CONDITION_CHANGE, afterDropConditionChange);
	}

	public java.lang.String getAfterDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONTAINER_CHANGE, null);
	}

	public void setAfterDropContainerChange(java.lang.String afterDropContainerChange) {
		getStateHelper().put(AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange);
	}

	public java.lang.String getAfterDropOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_ON_CHANGE, null);
	}

	public void setAfterDropOnChange(java.lang.String afterDropOnChange) {
		getStateHelper().put(AFTER_DROP_ON_CHANGE, afterDropOnChange);
	}

	public java.lang.String getAfterHelperChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HELPER_CHANGE, null);
	}

	public void setAfterHelperChange(java.lang.String afterHelperChange) {
		getStateHelper().put(AFTER_HELPER_CHANGE, afterHelperChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterNodesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODES_CHANGE, null);
	}

	public void setAfterNodesChange(java.lang.String afterNodesChange) {
		getStateHelper().put(AFTER_NODES_CHANGE, afterNodesChange);
	}

	public java.lang.String getAfterPlaceholderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PLACEHOLDER_CHANGE, null);
	}

	public void setAfterPlaceholderChange(java.lang.String afterPlaceholderChange) {
		getStateHelper().put(AFTER_PLACEHOLDER_CHANGE, afterPlaceholderChange);
	}

	public java.lang.String getAfterProxyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PROXY_CHANGE, null);
	}

	public void setAfterProxyChange(java.lang.String afterProxyChange) {
		getStateHelper().put(AFTER_PROXY_CHANGE, afterProxyChange);
	}

	public java.lang.String getAfterSortConditionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SORT_CONDITION_CHANGE, null);
	}

	public void setAfterSortConditionChange(java.lang.String afterSortConditionChange) {
		getStateHelper().put(AFTER_SORT_CONDITION_CHANGE, afterSortConditionChange);
	}

	public java.lang.String getOnDdChange() {
		return (java.lang.String) getStateHelper().eval(ON_DD_CHANGE, null);
	}

	public void setOnDdChange(java.lang.String onDdChange) {
		getStateHelper().put(ON_DD_CHANGE, onDdChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDropConditionChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONDITION_CHANGE, null);
	}

	public void setOnDropConditionChange(java.lang.String onDropConditionChange) {
		getStateHelper().put(ON_DROP_CONDITION_CHANGE, onDropConditionChange);
	}

	public java.lang.String getOnDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONTAINER_CHANGE, null);
	}

	public void setOnDropContainerChange(java.lang.String onDropContainerChange) {
		getStateHelper().put(ON_DROP_CONTAINER_CHANGE, onDropContainerChange);
	}

	public java.lang.String getOnDropOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_ON_CHANGE, null);
	}

	public void setOnDropOnChange(java.lang.String onDropOnChange) {
		getStateHelper().put(ON_DROP_ON_CHANGE, onDropOnChange);
	}

	public java.lang.String getOnHelperChange() {
		return (java.lang.String) getStateHelper().eval(ON_HELPER_CHANGE, null);
	}

	public void setOnHelperChange(java.lang.String onHelperChange) {
		getStateHelper().put(ON_HELPER_CHANGE, onHelperChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnNodesChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODES_CHANGE, null);
	}

	public void setOnNodesChange(java.lang.String onNodesChange) {
		getStateHelper().put(ON_NODES_CHANGE, onNodesChange);
	}

	public java.lang.String getOnPlaceholderChange() {
		return (java.lang.String) getStateHelper().eval(ON_PLACEHOLDER_CHANGE, null);
	}

	public void setOnPlaceholderChange(java.lang.String onPlaceholderChange) {
		getStateHelper().put(ON_PLACEHOLDER_CHANGE, onPlaceholderChange);
	}

	public java.lang.String getOnProxyChange() {
		return (java.lang.String) getStateHelper().eval(ON_PROXY_CHANGE, null);
	}

	public void setOnProxyChange(java.lang.String onProxyChange) {
		getStateHelper().put(ON_PROXY_CHANGE, onProxyChange);
	}

	public java.lang.String getOnSortConditionChange() {
		return (java.lang.String) getStateHelper().eval(ON_SORT_CONDITION_CHANGE, null);
	}

	public void setOnSortConditionChange(java.lang.String onSortConditionChange) {
		getStateHelper().put(ON_SORT_CONDITION_CHANGE, onSortConditionChange);
	}

}