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
package com.liferay.faces.alloy.component.sortablelayout;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class SortableLayoutBase extends javax.faces.component.UIPanel {

	public static final String DELEGATE_CONFIG = "delegateConfig";
	public static final String DESTROYED = "destroyed";
	public static final String DRAG_NODES = "dragNodes";
	public static final String DROP_CONTAINER = "dropContainer";
	public static final String DROP_NODES = "dropNodes";
	public static final String GROUPS = "groups";
	public static final String INITIALIZED = "initialized";
	public static final String LAZY_START = "lazyStart";
	public static final String PLACEHOLDER = "placeholder";
	public static final String PROXY = "proxy";
	public static final String PROXY_NODE = "proxyNode";
	public static final String AFTER_DELEGATE_CONFIG_CHANGE = "afterDelegateConfigChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DRAG_NODES_CHANGE = "afterDragNodesChange";
	public static final String AFTER_DROP_CONTAINER_CHANGE = "afterDropContainerChange";
	public static final String AFTER_DROP_NODES_CHANGE = "afterDropNodesChange";
	public static final String AFTER_GROUPS_CHANGE = "afterGroupsChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LAZY_START_CHANGE = "afterLazyStartChange";
	public static final String AFTER_PLACEHOLDER_CHANGE = "afterPlaceholderChange";
	public static final String AFTER_PROXY_CHANGE = "afterProxyChange";
	public static final String AFTER_PROXY_NODE_CHANGE = "afterProxyNodeChange";
	public static final String ON_DELEGATE_CONFIG_CHANGE = "onDelegateConfigChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DRAG_NODES_CHANGE = "onDragNodesChange";
	public static final String ON_DROP_CONTAINER_CHANGE = "onDropContainerChange";
	public static final String ON_DROP_NODES_CHANGE = "onDropNodesChange";
	public static final String ON_GROUPS_CHANGE = "onGroupsChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LAZY_START_CHANGE = "onLazyStartChange";
	public static final String ON_PLACEHOLDER_CHANGE = "onPlaceholderChange";
	public static final String ON_PROXY_CHANGE = "onProxyChange";
	public static final String ON_PROXY_NODE_CHANGE = "onProxyNodeChange";

	public java.lang.Object getDelegateConfig() {
		return (java.lang.Object) getStateHelper().eval(DELEGATE_CONFIG, null);
	}

	public void setDelegateConfig(java.lang.Object delegateConfig) {
		getStateHelper().put(DELEGATE_CONFIG, delegateConfig);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.String getDragNodes() {
		return (java.lang.String) getStateHelper().eval(DRAG_NODES, null);
	}

	public void setDragNodes(java.lang.String dragNodes) {
		getStateHelper().put(DRAG_NODES, dragNodes);
	}

	public java.lang.Object getDropContainer() {
		return (java.lang.Object) getStateHelper().eval(DROP_CONTAINER, null);
	}

	public void setDropContainer(java.lang.Object dropContainer) {
		getStateHelper().put(DROP_CONTAINER, dropContainer);
	}

	public java.lang.String getDropNodes() {
		return (java.lang.String) getStateHelper().eval(DROP_NODES, null);
	}

	public void setDropNodes(java.lang.String dropNodes) {
		getStateHelper().put(DROP_NODES, dropNodes);
	}

	public java.lang.String getGroups() {
		return (java.lang.String) getStateHelper().eval(GROUPS, null);
	}

	public void setGroups(java.lang.String groups) {
		getStateHelper().put(GROUPS, groups);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Boolean getLazyStart() {
		return (java.lang.Boolean) getStateHelper().eval(LAZY_START, null);
	}

	public void setLazyStart(java.lang.Boolean lazyStart) {
		getStateHelper().put(LAZY_START, lazyStart);
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

	public java.lang.String getProxyNode() {
		return (java.lang.String) getStateHelper().eval(PROXY_NODE, null);
	}

	public void setProxyNode(java.lang.String proxyNode) {
		getStateHelper().put(PROXY_NODE, proxyNode);
	}

	public java.lang.String getAfterDelegateConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DELEGATE_CONFIG_CHANGE, null);
	}

	public void setAfterDelegateConfigChange(java.lang.String afterDelegateConfigChange) {
		getStateHelper().put(AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDragNodesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DRAG_NODES_CHANGE, null);
	}

	public void setAfterDragNodesChange(java.lang.String afterDragNodesChange) {
		getStateHelper().put(AFTER_DRAG_NODES_CHANGE, afterDragNodesChange);
	}

	public java.lang.String getAfterDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONTAINER_CHANGE, null);
	}

	public void setAfterDropContainerChange(java.lang.String afterDropContainerChange) {
		getStateHelper().put(AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange);
	}

	public java.lang.String getAfterDropNodesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_NODES_CHANGE, null);
	}

	public void setAfterDropNodesChange(java.lang.String afterDropNodesChange) {
		getStateHelper().put(AFTER_DROP_NODES_CHANGE, afterDropNodesChange);
	}

	public java.lang.String getAfterGroupsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GROUPS_CHANGE, null);
	}

	public void setAfterGroupsChange(java.lang.String afterGroupsChange) {
		getStateHelper().put(AFTER_GROUPS_CHANGE, afterGroupsChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterLazyStartChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAZY_START_CHANGE, null);
	}

	public void setAfterLazyStartChange(java.lang.String afterLazyStartChange) {
		getStateHelper().put(AFTER_LAZY_START_CHANGE, afterLazyStartChange);
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

	public java.lang.String getAfterProxyNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PROXY_NODE_CHANGE, null);
	}

	public void setAfterProxyNodeChange(java.lang.String afterProxyNodeChange) {
		getStateHelper().put(AFTER_PROXY_NODE_CHANGE, afterProxyNodeChange);
	}

	public java.lang.String getOnDelegateConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_DELEGATE_CONFIG_CHANGE, null);
	}

	public void setOnDelegateConfigChange(java.lang.String onDelegateConfigChange) {
		getStateHelper().put(ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDragNodesChange() {
		return (java.lang.String) getStateHelper().eval(ON_DRAG_NODES_CHANGE, null);
	}

	public void setOnDragNodesChange(java.lang.String onDragNodesChange) {
		getStateHelper().put(ON_DRAG_NODES_CHANGE, onDragNodesChange);
	}

	public java.lang.String getOnDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONTAINER_CHANGE, null);
	}

	public void setOnDropContainerChange(java.lang.String onDropContainerChange) {
		getStateHelper().put(ON_DROP_CONTAINER_CHANGE, onDropContainerChange);
	}

	public java.lang.String getOnDropNodesChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_NODES_CHANGE, null);
	}

	public void setOnDropNodesChange(java.lang.String onDropNodesChange) {
		getStateHelper().put(ON_DROP_NODES_CHANGE, onDropNodesChange);
	}

	public java.lang.String getOnGroupsChange() {
		return (java.lang.String) getStateHelper().eval(ON_GROUPS_CHANGE, null);
	}

	public void setOnGroupsChange(java.lang.String onGroupsChange) {
		getStateHelper().put(ON_GROUPS_CHANGE, onGroupsChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnLazyStartChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAZY_START_CHANGE, null);
	}

	public void setOnLazyStartChange(java.lang.String onLazyStartChange) {
		getStateHelper().put(ON_LAZY_START_CHANGE, onLazyStartChange);
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

	public java.lang.String getOnProxyNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_PROXY_NODE_CHANGE, null);
	}

	public void setOnProxyNodeChange(java.lang.String onProxyNodeChange) {
		getStateHelper().put(ON_PROXY_NODE_CHANGE, onProxyNodeChange);
	}

}