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
package com.liferay.faces.alloy.component.availablefield;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AvailableFieldBase extends javax.faces.component.UIPanel {

	private static final String DRAGGABLE = "draggable";
	private static final String ICON_CLASS = "iconClass";
	private static final String AVAILABLEFIELD_ID = "availablefieldId";
	private static final String LABEL = "label";
	private static final String NODE = "node";
	private static final String TYPE = "type";
	private static final String AFTER_DRAGGABLE_CHANGE = "afterDraggableChange";
	private static final String AFTER_ICON_CLASS_CHANGE = "afterIconClassChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	private static final String AFTER_NODE_CHANGE = "afterNodeChange";
	private static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	private static final String ON_DRAGGABLE_CHANGE = "onDraggableChange";
	private static final String ON_ICON_CLASS_CHANGE = "onIconClassChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_LABEL_CHANGE = "onLabelChange";
	private static final String ON_NODE_CHANGE = "onNodeChange";
	private static final String ON_TYPE_CHANGE = "onTypeChange";

	protected java.lang.Boolean getDraggable() {
		return (java.lang.Boolean) getStateHelper().eval(DRAGGABLE, null);
	}

	protected void setDraggable(java.lang.Boolean draggable) {
		getStateHelper().put(DRAGGABLE, draggable);
	}

	protected java.lang.String getIconClass() {
		return (java.lang.String) getStateHelper().eval(ICON_CLASS, null);
	}

	protected void setIconClass(java.lang.String iconClass) {
		getStateHelper().put(ICON_CLASS, iconClass);
	}

	protected java.lang.String getAvailablefieldId() {
		return (java.lang.String) getStateHelper().eval(AVAILABLEFIELD_ID, null);
	}

	protected void setAvailablefieldId(java.lang.String availablefieldId) {
		getStateHelper().put(AVAILABLEFIELD_ID, availablefieldId);
	}

	protected java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(LABEL, null);
	}

	protected void setLabel(java.lang.String label) {
		getStateHelper().put(LABEL, label);
	}

	protected java.lang.Object getNode() {
		return (java.lang.Object) getStateHelper().eval(NODE, null);
	}

	protected void setNode(java.lang.Object node) {
		getStateHelper().put(NODE, node);
	}

	protected java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	protected void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	protected java.lang.String getAfterDraggableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DRAGGABLE_CHANGE, null);
	}

	protected void setAfterDraggableChange(java.lang.String afterDraggableChange) {
		getStateHelper().put(AFTER_DRAGGABLE_CHANGE, afterDraggableChange);
	}

	protected java.lang.String getAfterIconClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_CLASS_CHANGE, null);
	}

	protected void setAfterIconClassChange(java.lang.String afterIconClassChange) {
		getStateHelper().put(AFTER_ICON_CLASS_CHANGE, afterIconClassChange);
	}

	protected java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	protected void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	protected java.lang.String getAfterLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_CHANGE, null);
	}

	protected void setAfterLabelChange(java.lang.String afterLabelChange) {
		getStateHelper().put(AFTER_LABEL_CHANGE, afterLabelChange);
	}

	protected java.lang.String getAfterNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_CHANGE, null);
	}

	protected void setAfterNodeChange(java.lang.String afterNodeChange) {
		getStateHelper().put(AFTER_NODE_CHANGE, afterNodeChange);
	}

	protected java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	protected void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	protected java.lang.String getOnDraggableChange() {
		return (java.lang.String) getStateHelper().eval(ON_DRAGGABLE_CHANGE, null);
	}

	protected void setOnDraggableChange(java.lang.String onDraggableChange) {
		getStateHelper().put(ON_DRAGGABLE_CHANGE, onDraggableChange);
	}

	protected java.lang.String getOnIconClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_CLASS_CHANGE, null);
	}

	protected void setOnIconClassChange(java.lang.String onIconClassChange) {
		getStateHelper().put(ON_ICON_CLASS_CHANGE, onIconClassChange);
	}

	protected java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	protected void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	protected java.lang.String getOnLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_CHANGE, null);
	}

	protected void setOnLabelChange(java.lang.String onLabelChange) {
		getStateHelper().put(ON_LABEL_CHANGE, onLabelChange);
	}

	protected java.lang.String getOnNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_CHANGE, null);
	}

	protected void setOnNodeChange(java.lang.String onNodeChange) {
		getStateHelper().put(ON_NODE_CHANGE, onNodeChange);
	}

	protected java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	protected void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

}