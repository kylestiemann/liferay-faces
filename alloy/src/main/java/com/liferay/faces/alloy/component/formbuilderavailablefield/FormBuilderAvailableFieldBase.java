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
package com.liferay.faces.alloy.component.formbuilderavailablefield;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class FormBuilderAvailableFieldBase extends javax.faces.component.UIPanel {

	private static final String DRAGGABLE = "draggable";
	private static final String HIDDEN_ATTRIBUTES = "hiddenAttributes";
	private static final String ICON_CLASS = "iconClass";
	private static final String FORMBUILDERAVAILABLEFIELD_ID = "formbuilderavailablefieldId";
	private static final String LABEL = "label";
	private static final String NAME = "name";
	private static final String NODE = "node";
	private static final String OPTIONS = "options";
	private static final String PREDEFINED_VALUE = "predefinedValue";
	private static final String READ_ONLY_ATTRIBUTES = "readOnlyAttributes";
	private static final String REQUIRED = "required";
	private static final String SHOW_LABEL = "showLabel";
	private static final String TIP = "tip";
	private static final String TYPE = "type";
	private static final String UNIQUE = "unique";
	private static final String WIDTH = "width";
	private static final String AFTER_DRAGGABLE_CHANGE = "afterDraggableChange";
	private static final String AFTER_HIDDEN_ATTRIBUTES_CHANGE = "afterHiddenAttributesChange";
	private static final String AFTER_ICON_CLASS_CHANGE = "afterIconClassChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	private static final String AFTER_NAME_CHANGE = "afterNameChange";
	private static final String AFTER_NODE_CHANGE = "afterNodeChange";
	private static final String AFTER_OPTIONS_CHANGE = "afterOptionsChange";
	private static final String AFTER_PREDEFINED_VALUE_CHANGE = "afterPredefinedValueChange";
	private static final String AFTER_READ_ONLY_ATTRIBUTES_CHANGE = "afterReadOnlyAttributesChange";
	private static final String AFTER_REQUIRED_CHANGE = "afterRequiredChange";
	private static final String AFTER_SHOW_LABEL_CHANGE = "afterShowLabelChange";
	private static final String AFTER_TIP_CHANGE = "afterTipChange";
	private static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	private static final String AFTER_UNIQUE_CHANGE = "afterUniqueChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String ON_DRAGGABLE_CHANGE = "onDraggableChange";
	private static final String ON_HIDDEN_ATTRIBUTES_CHANGE = "onHiddenAttributesChange";
	private static final String ON_ICON_CLASS_CHANGE = "onIconClassChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_LABEL_CHANGE = "onLabelChange";
	private static final String ON_NAME_CHANGE = "onNameChange";
	private static final String ON_NODE_CHANGE = "onNodeChange";
	private static final String ON_OPTIONS_CHANGE = "onOptionsChange";
	private static final String ON_PREDEFINED_VALUE_CHANGE = "onPredefinedValueChange";
	private static final String ON_READ_ONLY_ATTRIBUTES_CHANGE = "onReadOnlyAttributesChange";
	private static final String ON_REQUIRED_CHANGE = "onRequiredChange";
	private static final String ON_SHOW_LABEL_CHANGE = "onShowLabelChange";
	private static final String ON_TIP_CHANGE = "onTipChange";
	private static final String ON_TYPE_CHANGE = "onTypeChange";
	private static final String ON_UNIQUE_CHANGE = "onUniqueChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";

	protected java.lang.Boolean getDraggable() {
		return (java.lang.Boolean) getStateHelper().eval(DRAGGABLE, null);
	}

	protected void setDraggable(java.lang.Boolean draggable) {
		getStateHelper().put(DRAGGABLE, draggable);
	}

	protected java.lang.Object getHiddenAttributes() {
		return (java.lang.Object) getStateHelper().eval(HIDDEN_ATTRIBUTES, null);
	}

	protected void setHiddenAttributes(java.lang.Object hiddenAttributes) {
		getStateHelper().put(HIDDEN_ATTRIBUTES, hiddenAttributes);
	}

	protected java.lang.String getIconClass() {
		return (java.lang.String) getStateHelper().eval(ICON_CLASS, null);
	}

	protected void setIconClass(java.lang.String iconClass) {
		getStateHelper().put(ICON_CLASS, iconClass);
	}

	protected java.lang.String getFormbuilderavailablefieldId() {
		return (java.lang.String) getStateHelper().eval(FORMBUILDERAVAILABLEFIELD_ID, null);
	}

	protected void setFormbuilderavailablefieldId(java.lang.String formbuilderavailablefieldId) {
		getStateHelper().put(FORMBUILDERAVAILABLEFIELD_ID, formbuilderavailablefieldId);
	}

	protected java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(LABEL, null);
	}

	protected void setLabel(java.lang.String label) {
		getStateHelper().put(LABEL, label);
	}

	protected java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	protected void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	protected java.lang.Object getNode() {
		return (java.lang.Object) getStateHelper().eval(NODE, null);
	}

	protected void setNode(java.lang.Object node) {
		getStateHelper().put(NODE, node);
	}

	protected java.lang.Object getOptions() {
		return (java.lang.Object) getStateHelper().eval(OPTIONS, null);
	}

	protected void setOptions(java.lang.Object options) {
		getStateHelper().put(OPTIONS, options);
	}

	protected java.lang.String getPredefinedValue() {
		return (java.lang.String) getStateHelper().eval(PREDEFINED_VALUE, null);
	}

	protected void setPredefinedValue(java.lang.String predefinedValue) {
		getStateHelper().put(PREDEFINED_VALUE, predefinedValue);
	}

	protected java.lang.Object getReadOnlyAttributes() {
		return (java.lang.Object) getStateHelper().eval(READ_ONLY_ATTRIBUTES, null);
	}

	protected void setReadOnlyAttributes(java.lang.Object readOnlyAttributes) {
		getStateHelper().put(READ_ONLY_ATTRIBUTES, readOnlyAttributes);
	}

	protected java.lang.Boolean getRequired() {
		return (java.lang.Boolean) getStateHelper().eval(REQUIRED, null);
	}

	protected void setRequired(java.lang.Boolean required) {
		getStateHelper().put(REQUIRED, required);
	}

	protected java.lang.Boolean getShowLabel() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_LABEL, null);
	}

	protected void setShowLabel(java.lang.Boolean showLabel) {
		getStateHelper().put(SHOW_LABEL, showLabel);
	}

	protected java.lang.String getTip() {
		return (java.lang.String) getStateHelper().eval(TIP, null);
	}

	protected void setTip(java.lang.String tip) {
		getStateHelper().put(TIP, tip);
	}

	protected java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	protected void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	protected java.lang.Boolean getUnique() {
		return (java.lang.Boolean) getStateHelper().eval(UNIQUE, null);
	}

	protected void setUnique(java.lang.Boolean unique) {
		getStateHelper().put(UNIQUE, unique);
	}

	protected java.lang.String getWidth() {
		return (java.lang.String) getStateHelper().eval(WIDTH, null);
	}

	protected void setWidth(java.lang.String width) {
		getStateHelper().put(WIDTH, width);
	}

	protected java.lang.String getAfterDraggableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DRAGGABLE_CHANGE, null);
	}

	protected void setAfterDraggableChange(java.lang.String afterDraggableChange) {
		getStateHelper().put(AFTER_DRAGGABLE_CHANGE, afterDraggableChange);
	}

	protected java.lang.String getAfterHiddenAttributesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDDEN_ATTRIBUTES_CHANGE, null);
	}

	protected void setAfterHiddenAttributesChange(java.lang.String afterHiddenAttributesChange) {
		getStateHelper().put(AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange);
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

	protected java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	protected void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	protected java.lang.String getAfterNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NODE_CHANGE, null);
	}

	protected void setAfterNodeChange(java.lang.String afterNodeChange) {
		getStateHelper().put(AFTER_NODE_CHANGE, afterNodeChange);
	}

	protected java.lang.String getAfterOptionsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OPTIONS_CHANGE, null);
	}

	protected void setAfterOptionsChange(java.lang.String afterOptionsChange) {
		getStateHelper().put(AFTER_OPTIONS_CHANGE, afterOptionsChange);
	}

	protected java.lang.String getAfterPredefinedValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREDEFINED_VALUE_CHANGE, null);
	}

	protected void setAfterPredefinedValueChange(java.lang.String afterPredefinedValueChange) {
		getStateHelper().put(AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange);
	}

	protected java.lang.String getAfterReadOnlyAttributesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_READ_ONLY_ATTRIBUTES_CHANGE, null);
	}

	protected void setAfterReadOnlyAttributesChange(java.lang.String afterReadOnlyAttributesChange) {
		getStateHelper().put(AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange);
	}

	protected java.lang.String getAfterRequiredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REQUIRED_CHANGE, null);
	}

	protected void setAfterRequiredChange(java.lang.String afterRequiredChange) {
		getStateHelper().put(AFTER_REQUIRED_CHANGE, afterRequiredChange);
	}

	protected java.lang.String getAfterShowLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_LABEL_CHANGE, null);
	}

	protected void setAfterShowLabelChange(java.lang.String afterShowLabelChange) {
		getStateHelper().put(AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange);
	}

	protected java.lang.String getAfterTipChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TIP_CHANGE, null);
	}

	protected void setAfterTipChange(java.lang.String afterTipChange) {
		getStateHelper().put(AFTER_TIP_CHANGE, afterTipChange);
	}

	protected java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	protected void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	protected java.lang.String getAfterUniqueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_UNIQUE_CHANGE, null);
	}

	protected void setAfterUniqueChange(java.lang.String afterUniqueChange) {
		getStateHelper().put(AFTER_UNIQUE_CHANGE, afterUniqueChange);
	}

	protected java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	protected void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	protected java.lang.String getOnDraggableChange() {
		return (java.lang.String) getStateHelper().eval(ON_DRAGGABLE_CHANGE, null);
	}

	protected void setOnDraggableChange(java.lang.String onDraggableChange) {
		getStateHelper().put(ON_DRAGGABLE_CHANGE, onDraggableChange);
	}

	protected java.lang.String getOnHiddenAttributesChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDDEN_ATTRIBUTES_CHANGE, null);
	}

	protected void setOnHiddenAttributesChange(java.lang.String onHiddenAttributesChange) {
		getStateHelper().put(ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange);
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

	protected java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	protected void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	protected java.lang.String getOnNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_NODE_CHANGE, null);
	}

	protected void setOnNodeChange(java.lang.String onNodeChange) {
		getStateHelper().put(ON_NODE_CHANGE, onNodeChange);
	}

	protected java.lang.String getOnOptionsChange() {
		return (java.lang.String) getStateHelper().eval(ON_OPTIONS_CHANGE, null);
	}

	protected void setOnOptionsChange(java.lang.String onOptionsChange) {
		getStateHelper().put(ON_OPTIONS_CHANGE, onOptionsChange);
	}

	protected java.lang.String getOnPredefinedValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREDEFINED_VALUE_CHANGE, null);
	}

	protected void setOnPredefinedValueChange(java.lang.String onPredefinedValueChange) {
		getStateHelper().put(ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange);
	}

	protected java.lang.String getOnReadOnlyAttributesChange() {
		return (java.lang.String) getStateHelper().eval(ON_READ_ONLY_ATTRIBUTES_CHANGE, null);
	}

	protected void setOnReadOnlyAttributesChange(java.lang.String onReadOnlyAttributesChange) {
		getStateHelper().put(ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange);
	}

	protected java.lang.String getOnRequiredChange() {
		return (java.lang.String) getStateHelper().eval(ON_REQUIRED_CHANGE, null);
	}

	protected void setOnRequiredChange(java.lang.String onRequiredChange) {
		getStateHelper().put(ON_REQUIRED_CHANGE, onRequiredChange);
	}

	protected java.lang.String getOnShowLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_LABEL_CHANGE, null);
	}

	protected void setOnShowLabelChange(java.lang.String onShowLabelChange) {
		getStateHelper().put(ON_SHOW_LABEL_CHANGE, onShowLabelChange);
	}

	protected java.lang.String getOnTipChange() {
		return (java.lang.String) getStateHelper().eval(ON_TIP_CHANGE, null);
	}

	protected void setOnTipChange(java.lang.String onTipChange) {
		getStateHelper().put(ON_TIP_CHANGE, onTipChange);
	}

	protected java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	protected void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

	protected java.lang.String getOnUniqueChange() {
		return (java.lang.String) getStateHelper().eval(ON_UNIQUE_CHANGE, null);
	}

	protected void setOnUniqueChange(java.lang.String onUniqueChange) {
		getStateHelper().put(ON_UNIQUE_CHANGE, onUniqueChange);
	}

	protected java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	protected void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

}