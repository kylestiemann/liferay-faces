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
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SortableLayoutBase extends javax.faces.component.UIPanel {

	private static final String DELEGATE_CONFIG = "delegateConfig";
	private static final String DRAG_NODES = "dragNodes";
	private static final String DROP_CONTAINER = "dropContainer";
	private static final String DROP_NODES = "dropNodes";
	private static final String GROUPS = "groups";
	private static final String LAZY_START = "lazyStart";
	private static final String PLACEHOLDER = "placeholder";
	private static final String PROXY = "proxy";
	private static final String PROXY_NODE = "proxyNode";
	private static final String AFTER_DELEGATE_CONFIG_CHANGE = "afterDelegateConfigChange";
	private static final String AFTER_DRAG_NODES_CHANGE = "afterDragNodesChange";
	private static final String AFTER_DROP_CONTAINER_CHANGE = "afterDropContainerChange";
	private static final String AFTER_DROP_NODES_CHANGE = "afterDropNodesChange";
	private static final String AFTER_GROUPS_CHANGE = "afterGroupsChange";
	private static final String AFTER_LAZY_START_CHANGE = "afterLazyStartChange";
	private static final String AFTER_PLACEHOLDER_CHANGE = "afterPlaceholderChange";
	private static final String AFTER_PROXY_CHANGE = "afterProxyChange";
	private static final String AFTER_PROXY_NODE_CHANGE = "afterProxyNodeChange";
	private static final String ON_DELEGATE_CONFIG_CHANGE = "onDelegateConfigChange";
	private static final String ON_DRAG_NODES_CHANGE = "onDragNodesChange";
	private static final String ON_DROP_CONTAINER_CHANGE = "onDropContainerChange";
	private static final String ON_DROP_NODES_CHANGE = "onDropNodesChange";
	private static final String ON_GROUPS_CHANGE = "onGroupsChange";
	private static final String ON_LAZY_START_CHANGE = "onLazyStartChange";
	private static final String ON_PLACEHOLDER_CHANGE = "onPlaceholderChange";
	private static final String ON_PROXY_CHANGE = "onProxyChange";
	private static final String ON_PROXY_NODE_CHANGE = "onProxyNodeChange";

	protected java.lang.Object getDelegateConfig() {
		return (java.lang.Object) getStateHelper().eval(DELEGATE_CONFIG, null);
	}

	protected void setDelegateConfig(java.lang.Object delegateConfig) {
		getStateHelper().put(DELEGATE_CONFIG, delegateConfig);
	}

	protected java.lang.String getDragNodes() {
		return (java.lang.String) getStateHelper().eval(DRAG_NODES, null);
	}

	protected void setDragNodes(java.lang.String dragNodes) {
		getStateHelper().put(DRAG_NODES, dragNodes);
	}

	protected java.lang.Object getDropContainer() {
		return (java.lang.Object) getStateHelper().eval(DROP_CONTAINER, null);
	}

	protected void setDropContainer(java.lang.Object dropContainer) {
		getStateHelper().put(DROP_CONTAINER, dropContainer);
	}

	protected java.lang.String getDropNodes() {
		return (java.lang.String) getStateHelper().eval(DROP_NODES, null);
	}

	protected void setDropNodes(java.lang.String dropNodes) {
		getStateHelper().put(DROP_NODES, dropNodes);
	}

	protected java.lang.String getGroups() {
		return (java.lang.String) getStateHelper().eval(GROUPS, null);
	}

	protected void setGroups(java.lang.String groups) {
		getStateHelper().put(GROUPS, groups);
	}

	protected java.lang.Boolean getLazyStart() {
		return (java.lang.Boolean) getStateHelper().eval(LAZY_START, null);
	}

	protected void setLazyStart(java.lang.Boolean lazyStart) {
		getStateHelper().put(LAZY_START, lazyStart);
	}

	protected java.lang.String getPlaceholder() {
		return (java.lang.String) getStateHelper().eval(PLACEHOLDER, null);
	}

	protected void setPlaceholder(java.lang.String placeholder) {
		getStateHelper().put(PLACEHOLDER, placeholder);
	}

	protected java.lang.String getProxy() {
		return (java.lang.String) getStateHelper().eval(PROXY, null);
	}

	protected void setProxy(java.lang.String proxy) {
		getStateHelper().put(PROXY, proxy);
	}

	protected java.lang.String getProxyNode() {
		return (java.lang.String) getStateHelper().eval(PROXY_NODE, null);
	}

	protected void setProxyNode(java.lang.String proxyNode) {
		getStateHelper().put(PROXY_NODE, proxyNode);
	}

	protected java.lang.String getAfterDelegateConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DELEGATE_CONFIG_CHANGE, null);
	}

	protected void setAfterDelegateConfigChange(java.lang.String afterDelegateConfigChange) {
		getStateHelper().put(AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange);
	}

	protected java.lang.String getAfterDragNodesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DRAG_NODES_CHANGE, null);
	}

	protected void setAfterDragNodesChange(java.lang.String afterDragNodesChange) {
		getStateHelper().put(AFTER_DRAG_NODES_CHANGE, afterDragNodesChange);
	}

	protected java.lang.String getAfterDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONTAINER_CHANGE, null);
	}

	protected void setAfterDropContainerChange(java.lang.String afterDropContainerChange) {
		getStateHelper().put(AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange);
	}

	protected java.lang.String getAfterDropNodesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_NODES_CHANGE, null);
	}

	protected void setAfterDropNodesChange(java.lang.String afterDropNodesChange) {
		getStateHelper().put(AFTER_DROP_NODES_CHANGE, afterDropNodesChange);
	}

	protected java.lang.String getAfterGroupsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GROUPS_CHANGE, null);
	}

	protected void setAfterGroupsChange(java.lang.String afterGroupsChange) {
		getStateHelper().put(AFTER_GROUPS_CHANGE, afterGroupsChange);
	}

	protected java.lang.String getAfterLazyStartChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LAZY_START_CHANGE, null);
	}

	protected void setAfterLazyStartChange(java.lang.String afterLazyStartChange) {
		getStateHelper().put(AFTER_LAZY_START_CHANGE, afterLazyStartChange);
	}

	protected java.lang.String getAfterPlaceholderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PLACEHOLDER_CHANGE, null);
	}

	protected void setAfterPlaceholderChange(java.lang.String afterPlaceholderChange) {
		getStateHelper().put(AFTER_PLACEHOLDER_CHANGE, afterPlaceholderChange);
	}

	protected java.lang.String getAfterProxyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PROXY_CHANGE, null);
	}

	protected void setAfterProxyChange(java.lang.String afterProxyChange) {
		getStateHelper().put(AFTER_PROXY_CHANGE, afterProxyChange);
	}

	protected java.lang.String getAfterProxyNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PROXY_NODE_CHANGE, null);
	}

	protected void setAfterProxyNodeChange(java.lang.String afterProxyNodeChange) {
		getStateHelper().put(AFTER_PROXY_NODE_CHANGE, afterProxyNodeChange);
	}

	protected java.lang.String getOnDelegateConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_DELEGATE_CONFIG_CHANGE, null);
	}

	protected void setOnDelegateConfigChange(java.lang.String onDelegateConfigChange) {
		getStateHelper().put(ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange);
	}

	protected java.lang.String getOnDragNodesChange() {
		return (java.lang.String) getStateHelper().eval(ON_DRAG_NODES_CHANGE, null);
	}

	protected void setOnDragNodesChange(java.lang.String onDragNodesChange) {
		getStateHelper().put(ON_DRAG_NODES_CHANGE, onDragNodesChange);
	}

	protected java.lang.String getOnDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONTAINER_CHANGE, null);
	}

	protected void setOnDropContainerChange(java.lang.String onDropContainerChange) {
		getStateHelper().put(ON_DROP_CONTAINER_CHANGE, onDropContainerChange);
	}

	protected java.lang.String getOnDropNodesChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_NODES_CHANGE, null);
	}

	protected void setOnDropNodesChange(java.lang.String onDropNodesChange) {
		getStateHelper().put(ON_DROP_NODES_CHANGE, onDropNodesChange);
	}

	protected java.lang.String getOnGroupsChange() {
		return (java.lang.String) getStateHelper().eval(ON_GROUPS_CHANGE, null);
	}

	protected void setOnGroupsChange(java.lang.String onGroupsChange) {
		getStateHelper().put(ON_GROUPS_CHANGE, onGroupsChange);
	}

	protected java.lang.String getOnLazyStartChange() {
		return (java.lang.String) getStateHelper().eval(ON_LAZY_START_CHANGE, null);
	}

	protected void setOnLazyStartChange(java.lang.String onLazyStartChange) {
		getStateHelper().put(ON_LAZY_START_CHANGE, onLazyStartChange);
	}

	protected java.lang.String getOnPlaceholderChange() {
		return (java.lang.String) getStateHelper().eval(ON_PLACEHOLDER_CHANGE, null);
	}

	protected void setOnPlaceholderChange(java.lang.String onPlaceholderChange) {
		getStateHelper().put(ON_PLACEHOLDER_CHANGE, onPlaceholderChange);
	}

	protected java.lang.String getOnProxyChange() {
		return (java.lang.String) getStateHelper().eval(ON_PROXY_CHANGE, null);
	}

	protected void setOnProxyChange(java.lang.String onProxyChange) {
		getStateHelper().put(ON_PROXY_CHANGE, onProxyChange);
	}

	protected java.lang.String getOnProxyNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_PROXY_NODE_CHANGE, null);
	}

	protected void setOnProxyNodeChange(java.lang.String onProxyNodeChange) {
		getStateHelper().put(ON_PROXY_NODE_CHANGE, onProxyNodeChange);
	}

}