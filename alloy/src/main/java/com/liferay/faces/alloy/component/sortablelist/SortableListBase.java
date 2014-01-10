/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SortableListBase extends javax.faces.component.UIPanel {

	private static final String DD = "dd";
	private static final String DROP_CONDITION = "dropCondition";
	private static final String DROP_CONTAINER = "dropContainer";
	private static final String DROP_ON = "dropOn";
	private static final String HELPER = "helper";
	private static final String NODES = "nodes";
	private static final String PLACEHOLDER = "placeholder";
	private static final String PROXY = "proxy";
	private static final String SORT_CONDITION = "sortCondition";
	private static final String AFTER_DD_CHANGE = "afterDdChange";
	private static final String AFTER_DROP_CONDITION_CHANGE = "afterDropConditionChange";
	private static final String AFTER_DROP_CONTAINER_CHANGE = "afterDropContainerChange";
	private static final String AFTER_DROP_ON_CHANGE = "afterDropOnChange";
	private static final String AFTER_HELPER_CHANGE = "afterHelperChange";
	private static final String AFTER_NODES_CHANGE = "afterNodesChange";
	private static final String AFTER_PLACEHOLDER_CHANGE = "afterPlaceholderChange";
	private static final String AFTER_PROXY_CHANGE = "afterProxyChange";
	private static final String AFTER_SORT_CONDITION_CHANGE = "afterSortConditionChange";
	private static final String ON_DD_CHANGE = "onDdChange";
	private static final String ON_DROP_CONDITION_CHANGE = "onDropConditionChange";
	private static final String ON_DROP_CONTAINER_CHANGE = "onDropContainerChange";
	private static final String ON_DROP_ON_CHANGE = "onDropOnChange";
	private static final String ON_HELPER_CHANGE = "onHelperChange";
	private static final String ON_NODES_CHANGE = "onNodesChange";
	private static final String ON_PLACEHOLDER_CHANGE = "onPlaceholderChange";
	private static final String ON_PROXY_CHANGE = "onProxyChange";
	private static final String ON_SORT_CONDITION_CHANGE = "onSortConditionChange";

	protected java.lang.Object getDd() {
		return (java.lang.Object) getStateHelper().eval(DD, null);
	}

	protected void setDd(java.lang.Object dd) {
		getStateHelper().put(DD, dd);
	}

	protected java.lang.Object getDropCondition() {
		return (java.lang.Object) getStateHelper().eval(DROP_CONDITION, null);
	}

	protected void setDropCondition(java.lang.Object dropCondition) {
		getStateHelper().put(DROP_CONDITION, dropCondition);
	}

	protected java.lang.Object getDropContainer() {
		return (java.lang.Object) getStateHelper().eval(DROP_CONTAINER, null);
	}

	protected void setDropContainer(java.lang.Object dropContainer) {
		getStateHelper().put(DROP_CONTAINER, dropContainer);
	}

	protected java.lang.String getDropOn() {
		return (java.lang.String) getStateHelper().eval(DROP_ON, null);
	}

	protected void setDropOn(java.lang.String dropOn) {
		getStateHelper().put(DROP_ON, dropOn);
	}

	protected java.lang.Object getHelper() {
		return (java.lang.Object) getStateHelper().eval(HELPER, null);
	}

	protected void setHelper(java.lang.Object helper) {
		getStateHelper().put(HELPER, helper);
	}

	protected java.lang.Object getNodes() {
		return (java.lang.Object) getStateHelper().eval(NODES, null);
	}

	protected void setNodes(java.lang.Object nodes) {
		getStateHelper().put(NODES, nodes);
	}

	protected java.lang.Object getPlaceholder() {
		return (java.lang.Object) getStateHelper().eval(PLACEHOLDER, null);
	}

	protected void setPlaceholder(java.lang.Object placeholder) {
		getStateHelper().put(PLACEHOLDER, placeholder);
	}

	protected java.lang.Object getProxy() {
		return (java.lang.Object) getStateHelper().eval(PROXY, null);
	}

	protected void setProxy(java.lang.Object proxy) {
		getStateHelper().put(PROXY, proxy);
	}

	protected java.lang.Object getSortCondition() {
		return (java.lang.Object) getStateHelper().eval(SORT_CONDITION, null);
	}

	protected void setSortCondition(java.lang.Object sortCondition) {
		getStateHelper().put(SORT_CONDITION, sortCondition);
	}

	protected java.lang.String getAfterDdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DD_CHANGE, null);
	}

	protected void setAfterDdChange(java.lang.String afterDdChange) {
		getStateHelper().put(AFTER_DD_CHANGE, afterDdChange);
	}

	protected java.lang.String getAfterDropConditionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONDITION_CHANGE, null);
	}

	protected void setAfterDropConditionChange(java.lang.String afterDropConditionChange) {
		getStateHelper().put(AFTER_DROP_CONDITION_CHANGE, afterDropConditionChange);
	}

	protected java.lang.String getAfterDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_CONTAINER_CHANGE, null);
	}

	protected void setAfterDropContainerChange(java.lang.String afterDropContainerChange) {
		getStateHelper().put(AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange);
	}

	protected java.lang.String getAfterDropOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_ON_CHANGE, null);
	}

	protected void setAfterDropOnChange(java.lang.String afterDropOnChange) {
		getStateHelper().put(AFTER_DROP_ON_CHANGE, afterDropOnChange);
	}

	protected java.lang.String getAfterHelperChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HELPER_CHANGE, null);
	}

	protected void setAfterHelperChange(java.lang.String afterHelperChange) {
		getStateHelper().put(AFTER_HELPER_CHANGE, afterHelperChange);
	}

	protected java.lang.String getAfterNodesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODES_CHANGE, null);
	}

	protected void setAfterNodesChange(java.lang.String afterNodesChange) {
		getStateHelper().put(AFTER_NODES_CHANGE, afterNodesChange);
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

	protected java.lang.String getAfterSortConditionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SORT_CONDITION_CHANGE, null);
	}

	protected void setAfterSortConditionChange(java.lang.String afterSortConditionChange) {
		getStateHelper().put(AFTER_SORT_CONDITION_CHANGE, afterSortConditionChange);
	}

	protected java.lang.String getOnDdChange() {
		return (java.lang.String) getStateHelper().eval(ON_DD_CHANGE, null);
	}

	protected void setOnDdChange(java.lang.String onDdChange) {
		getStateHelper().put(ON_DD_CHANGE, onDdChange);
	}

	protected java.lang.String getOnDropConditionChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONDITION_CHANGE, null);
	}

	protected void setOnDropConditionChange(java.lang.String onDropConditionChange) {
		getStateHelper().put(ON_DROP_CONDITION_CHANGE, onDropConditionChange);
	}

	protected java.lang.String getOnDropContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_CONTAINER_CHANGE, null);
	}

	protected void setOnDropContainerChange(java.lang.String onDropContainerChange) {
		getStateHelper().put(ON_DROP_CONTAINER_CHANGE, onDropContainerChange);
	}

	protected java.lang.String getOnDropOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_ON_CHANGE, null);
	}

	protected void setOnDropOnChange(java.lang.String onDropOnChange) {
		getStateHelper().put(ON_DROP_ON_CHANGE, onDropOnChange);
	}

	protected java.lang.String getOnHelperChange() {
		return (java.lang.String) getStateHelper().eval(ON_HELPER_CHANGE, null);
	}

	protected void setOnHelperChange(java.lang.String onHelperChange) {
		getStateHelper().put(ON_HELPER_CHANGE, onHelperChange);
	}

	protected java.lang.String getOnNodesChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODES_CHANGE, null);
	}

	protected void setOnNodesChange(java.lang.String onNodesChange) {
		getStateHelper().put(ON_NODES_CHANGE, onNodesChange);
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

	protected java.lang.String getOnSortConditionChange() {
		return (java.lang.String) getStateHelper().eval(ON_SORT_CONDITION_CHANGE, null);
	}

	protected void setOnSortConditionChange(java.lang.String onSortConditionChange) {
		getStateHelper().put(ON_SORT_CONDITION_CHANGE, onSortConditionChange);
	}

}