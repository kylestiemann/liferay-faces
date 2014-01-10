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
package com.liferay.faces.alloy.component.treedata;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeDataBase extends javax.faces.component.UIPanel {

	private static final String TREEDATA_CHILDREN = "treedataChildren";
	private static final String CONTAINER = "container";
	private static final String INDEX = "index";
	private static final String AFTER_CHILDREN_CHANGE = "afterChildrenChange";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_INDEX_CHANGE = "afterIndexChange";
	private static final String ON_CHILDREN_CHANGE = "onChildrenChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_INDEX_CHANGE = "onIndexChange";

	protected java.lang.Object getTreedataChildren() {
		return (java.lang.Object) getStateHelper().eval(TREEDATA_CHILDREN, null);
	}

	protected void setTreedataChildren(java.lang.Object treedataChildren) {
		getStateHelper().put(TREEDATA_CHILDREN, treedataChildren);
	}

	protected java.lang.String getContainer() {
		return (java.lang.String) getStateHelper().eval(CONTAINER, null);
	}

	protected void setContainer(java.lang.String container) {
		getStateHelper().put(CONTAINER, container);
	}

	protected java.lang.Object getIndex() {
		return (java.lang.Object) getStateHelper().eval(INDEX, null);
	}

	protected void setIndex(java.lang.Object index) {
		getStateHelper().put(INDEX, index);
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

	protected java.lang.String getAfterIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INDEX_CHANGE, null);
	}

	protected void setAfterIndexChange(java.lang.String afterIndexChange) {
		getStateHelper().put(AFTER_INDEX_CHANGE, afterIndexChange);
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

	protected java.lang.String getOnIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_INDEX_CHANGE, null);
	}

	protected void setOnIndexChange(java.lang.String onIndexChange) {
		getStateHelper().put(ON_INDEX_CHANGE, onIndexChange);
	}

}