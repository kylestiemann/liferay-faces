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
package com.liferay.faces.alloy.component.availablefield;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AvailableFieldBase extends javax.faces.component.UIPanel {

	private static final String DESTROYED = "destroyed";
	private static final String DRAGGABLE = "draggable";
	private static final String ICON_CLASS = "iconClass";
	private static final String AVAILABLEFIELD_ID = "availablefieldId";
	private static final String INITIALIZED = "initialized";
	private static final String LABEL = "label";
	private static final String NODE = "node";
	private static final String TYPE = "type";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DRAGGABLE_CHANGE = "afterDraggableChange";
	private static final String AFTER_ICON_CLASS_CHANGE = "afterIconClassChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	private static final String AFTER_NODE_CHANGE = "afterNodeChange";
	private static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DRAGGABLE_CHANGE = "onDraggableChange";
	private static final String ON_ICON_CLASS_CHANGE = "onIconClassChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_LABEL_CHANGE = "onLabelChange";
	private static final String ON_NODE_CHANGE = "onNodeChange";
	private static final String ON_TYPE_CHANGE = "onTypeChange";

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

	public java.lang.String getIconClass() {
		return (java.lang.String) getStateHelper().eval(ICON_CLASS, null);
	}

	public void setIconClass(java.lang.String iconClass) {
		getStateHelper().put(ICON_CLASS, iconClass);
	}

	public java.lang.String getAvailablefieldId() {
		return (java.lang.String) getStateHelper().eval(AVAILABLEFIELD_ID, null);
	}

	public void setAvailablefieldId(java.lang.String availablefieldId) {
		getStateHelper().put(AVAILABLEFIELD_ID, availablefieldId);
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

	public java.lang.Object getNode() {
		return (java.lang.Object) getStateHelper().eval(NODE, null);
	}

	public void setNode(java.lang.Object node) {
		getStateHelper().put(NODE, node);
	}

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	public void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
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

	public java.lang.String getAfterIconClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_CLASS_CHANGE, null);
	}

	public void setAfterIconClassChange(java.lang.String afterIconClassChange) {
		getStateHelper().put(AFTER_ICON_CLASS_CHANGE, afterIconClassChange);
	}

	public java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	public void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
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

	public java.lang.String getAfterNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_CHANGE, null);
	}

	public void setAfterNodeChange(java.lang.String afterNodeChange) {
		getStateHelper().put(AFTER_NODE_CHANGE, afterNodeChange);
	}

	public java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	public void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
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

	public java.lang.String getOnIconClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_CLASS_CHANGE, null);
	}

	public void setOnIconClassChange(java.lang.String onIconClassChange) {
		getStateHelper().put(ON_ICON_CLASS_CHANGE, onIconClassChange);
	}

	public java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	public void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
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

	public java.lang.String getOnNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_CHANGE, null);
	}

	public void setOnNodeChange(java.lang.String onNodeChange) {
		getStateHelper().put(ON_NODE_CHANGE, onNodeChange);
	}

	public java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	public void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

}