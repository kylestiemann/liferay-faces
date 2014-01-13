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
package com.liferay.faces.alloy.component.formbuilderfieldsetfield;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class FormBuilderFieldsetFieldBase extends javax.faces.component.UIPanel {

	private static final String ACCEPT_CHILDREN = "acceptChildren";
	private static final String BUILDER = "builder";
	private static final String CONTROLS_TOOLBAR = "controlsToolbar";
	private static final String DATA_TYPE = "dataType";
	private static final String DISABLED = "disabled";
	private static final String DROP_ZONE_NODE = "dropZoneNode";
	private static final String HIDDEN_ATTRIBUTES = "hiddenAttributes";
	private static final String FORMBUILDERFIELDSETFIELD_ID = "formbuilderfieldsetfieldId";
	private static final String LABEL = "label";
	private static final String LABEL_NODE = "labelNode";
	private static final String LOCALIZATION_MAP = "localizationMap";
	private static final String NAME = "name";
	private static final String FORMBUILDERFIELDSETFIELD_PARENT = "formbuilderfieldsetfieldParent";
	private static final String PREDEFINED_VALUE = "predefinedValue";
	private static final String READ_ONLY = "readOnly";
	private static final String READ_ONLY_ATTRIBUTES = "readOnlyAttributes";
	private static final String REQUIRED = "required";
	private static final String REQUIRED_FLAG_NODE = "requiredFlagNode";
	private static final String SELECTED = "selected";
	private static final String SHOW_LABEL = "showLabel";
	private static final String STRINGS = "strings";
	private static final String TAB_INDEX = "tabIndex";
	private static final String TEMPLATE = "template";
	private static final String TEMPLATE_NODE = "templateNode";
	private static final String TIP = "tip";
	private static final String TIP_FLAG_NODE = "tipFlagNode";
	private static final String TYPE = "type";
	private static final String UNIQUE = "unique";
	private static final String Z_INDEX = "zIndex";
	private static final String AFTER_ACCEPT_CHILDREN_CHANGE = "afterAcceptChildrenChange";
	private static final String AFTER_BUILDER_CHANGE = "afterBuilderChange";
	private static final String AFTER_CONTROLS_TOOLBAR_CHANGE = "afterControlsToolbarChange";
	private static final String AFTER_DATA_TYPE_CHANGE = "afterDataTypeChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_DROP_ZONE_NODE_CHANGE = "afterDropZoneNodeChange";
	private static final String AFTER_HIDDEN_ATTRIBUTES_CHANGE = "afterHiddenAttributesChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	private static final String AFTER_LABEL_NODE_CHANGE = "afterLabelNodeChange";
	private static final String AFTER_LOCALIZATION_MAP_CHANGE = "afterLocalizationMapChange";
	private static final String AFTER_NAME_CHANGE = "afterNameChange";
	private static final String AFTER_PARENT_CHANGE = "afterParentChange";
	private static final String AFTER_PREDEFINED_VALUE_CHANGE = "afterPredefinedValueChange";
	private static final String AFTER_READ_ONLY_CHANGE = "afterReadOnlyChange";
	private static final String AFTER_READ_ONLY_ATTRIBUTES_CHANGE = "afterReadOnlyAttributesChange";
	private static final String AFTER_REQUIRED_CHANGE = "afterRequiredChange";
	private static final String AFTER_REQUIRED_FLAG_NODE_CHANGE = "afterRequiredFlagNodeChange";
	private static final String AFTER_SELECTED_CHANGE = "afterSelectedChange";
	private static final String AFTER_SHOW_LABEL_CHANGE = "afterShowLabelChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_TEMPLATE_CHANGE = "afterTemplateChange";
	private static final String AFTER_TEMPLATE_NODE_CHANGE = "afterTemplateNodeChange";
	private static final String AFTER_TIP_CHANGE = "afterTipChange";
	private static final String AFTER_TIP_FLAG_NODE_CHANGE = "afterTipFlagNodeChange";
	private static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	private static final String AFTER_UNIQUE_CHANGE = "afterUniqueChange";
	private static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	private static final String ON_ACCEPT_CHILDREN_CHANGE = "onAcceptChildrenChange";
	private static final String ON_BUILDER_CHANGE = "onBuilderChange";
	private static final String ON_CONTROLS_TOOLBAR_CHANGE = "onControlsToolbarChange";
	private static final String ON_DATA_TYPE_CHANGE = "onDataTypeChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_DROP_ZONE_NODE_CHANGE = "onDropZoneNodeChange";
	private static final String ON_HIDDEN_ATTRIBUTES_CHANGE = "onHiddenAttributesChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_LABEL_CHANGE = "onLabelChange";
	private static final String ON_LABEL_NODE_CHANGE = "onLabelNodeChange";
	private static final String ON_LOCALIZATION_MAP_CHANGE = "onLocalizationMapChange";
	private static final String ON_NAME_CHANGE = "onNameChange";
	private static final String ON_PARENT_CHANGE = "onParentChange";
	private static final String ON_PREDEFINED_VALUE_CHANGE = "onPredefinedValueChange";
	private static final String ON_READ_ONLY_CHANGE = "onReadOnlyChange";
	private static final String ON_READ_ONLY_ATTRIBUTES_CHANGE = "onReadOnlyAttributesChange";
	private static final String ON_REQUIRED_CHANGE = "onRequiredChange";
	private static final String ON_REQUIRED_FLAG_NODE_CHANGE = "onRequiredFlagNodeChange";
	private static final String ON_SELECTED_CHANGE = "onSelectedChange";
	private static final String ON_SHOW_LABEL_CHANGE = "onShowLabelChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_TEMPLATE_CHANGE = "onTemplateChange";
	private static final String ON_TEMPLATE_NODE_CHANGE = "onTemplateNodeChange";
	private static final String ON_TIP_CHANGE = "onTipChange";
	private static final String ON_TIP_FLAG_NODE_CHANGE = "onTipFlagNodeChange";
	private static final String ON_TYPE_CHANGE = "onTypeChange";
	private static final String ON_UNIQUE_CHANGE = "onUniqueChange";
	private static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	protected java.lang.Boolean getAcceptChildren() {
		return (java.lang.Boolean) getStateHelper().eval(ACCEPT_CHILDREN, null);
	}

	protected void setAcceptChildren(java.lang.Boolean acceptChildren) {
		getStateHelper().put(ACCEPT_CHILDREN, acceptChildren);
	}

	protected java.lang.Boolean getBuilder() {
		return (java.lang.Boolean) getStateHelper().eval(BUILDER, null);
	}

	protected void setBuilder(java.lang.Boolean builder) {
		getStateHelper().put(BUILDER, builder);
	}

	protected java.lang.Object getControlsToolbar() {
		return (java.lang.Object) getStateHelper().eval(CONTROLS_TOOLBAR, null);
	}

	protected void setControlsToolbar(java.lang.Object controlsToolbar) {
		getStateHelper().put(CONTROLS_TOOLBAR, controlsToolbar);
	}

	protected java.lang.Object getDataType() {
		return (java.lang.Object) getStateHelper().eval(DATA_TYPE, null);
	}

	protected void setDataType(java.lang.Object dataType) {
		getStateHelper().put(DATA_TYPE, dataType);
	}

	protected java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	protected void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	protected java.lang.Object getDropZoneNode() {
		return (java.lang.Object) getStateHelper().eval(DROP_ZONE_NODE, null);
	}

	protected void setDropZoneNode(java.lang.Object dropZoneNode) {
		getStateHelper().put(DROP_ZONE_NODE, dropZoneNode);
	}

	protected java.lang.Object getHiddenAttributes() {
		return (java.lang.Object) getStateHelper().eval(HIDDEN_ATTRIBUTES, null);
	}

	protected void setHiddenAttributes(java.lang.Object hiddenAttributes) {
		getStateHelper().put(HIDDEN_ATTRIBUTES, hiddenAttributes);
	}

	protected java.lang.Object getFormbuilderfieldsetfieldId() {
		return (java.lang.Object) getStateHelper().eval(FORMBUILDERFIELDSETFIELD_ID, null);
	}

	protected void setFormbuilderfieldsetfieldId(java.lang.Object formbuilderfieldsetfieldId) {
		getStateHelper().put(FORMBUILDERFIELDSETFIELD_ID, formbuilderfieldsetfieldId);
	}

	protected java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(LABEL, null);
	}

	protected void setLabel(java.lang.String label) {
		getStateHelper().put(LABEL, label);
	}

	protected java.lang.Object getLabelNode() {
		return (java.lang.Object) getStateHelper().eval(LABEL_NODE, null);
	}

	protected void setLabelNode(java.lang.Object labelNode) {
		getStateHelper().put(LABEL_NODE, labelNode);
	}

	protected java.lang.Object getLocalizationMap() {
		return (java.lang.Object) getStateHelper().eval(LOCALIZATION_MAP, null);
	}

	protected void setLocalizationMap(java.lang.Object localizationMap) {
		getStateHelper().put(LOCALIZATION_MAP, localizationMap);
	}

	protected java.lang.Object getName() {
		return (java.lang.Object) getStateHelper().eval(NAME, null);
	}

	protected void setName(java.lang.Object name) {
		getStateHelper().put(NAME, name);
	}

	protected java.lang.Object getFormbuilderfieldsetfieldParent() {
		return (java.lang.Object) getStateHelper().eval(FORMBUILDERFIELDSETFIELD_PARENT, null);
	}

	protected void setFormbuilderfieldsetfieldParent(java.lang.Object formbuilderfieldsetfieldParent) {
		getStateHelper().put(FORMBUILDERFIELDSETFIELD_PARENT, formbuilderfieldsetfieldParent);
	}

	protected java.lang.String getPredefinedValue() {
		return (java.lang.String) getStateHelper().eval(PREDEFINED_VALUE, null);
	}

	protected void setPredefinedValue(java.lang.String predefinedValue) {
		getStateHelper().put(PREDEFINED_VALUE, predefinedValue);
	}

	protected java.lang.Boolean getReadOnly() {
		return (java.lang.Boolean) getStateHelper().eval(READ_ONLY, null);
	}

	protected void setReadOnly(java.lang.Boolean readOnly) {
		getStateHelper().put(READ_ONLY, readOnly);
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

	protected java.lang.Object getRequiredFlagNode() {
		return (java.lang.Object) getStateHelper().eval(REQUIRED_FLAG_NODE, null);
	}

	protected void setRequiredFlagNode(java.lang.Object requiredFlagNode) {
		getStateHelper().put(REQUIRED_FLAG_NODE, requiredFlagNode);
	}

	protected java.lang.Boolean getSelected() {
		return (java.lang.Boolean) getStateHelper().eval(SELECTED, null);
	}

	protected void setSelected(java.lang.Boolean selected) {
		getStateHelper().put(SELECTED, selected);
	}

	protected java.lang.Boolean getShowLabel() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_LABEL, null);
	}

	protected void setShowLabel(java.lang.Boolean showLabel) {
		getStateHelper().put(SHOW_LABEL, showLabel);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	protected void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	protected java.lang.Object getTemplate() {
		return (java.lang.Object) getStateHelper().eval(TEMPLATE, null);
	}

	protected void setTemplate(java.lang.Object template) {
		getStateHelper().put(TEMPLATE, template);
	}

	protected java.lang.Object getTemplateNode() {
		return (java.lang.Object) getStateHelper().eval(TEMPLATE_NODE, null);
	}

	protected void setTemplateNode(java.lang.Object templateNode) {
		getStateHelper().put(TEMPLATE_NODE, templateNode);
	}

	protected java.lang.String getTip() {
		return (java.lang.String) getStateHelper().eval(TIP, null);
	}

	protected void setTip(java.lang.String tip) {
		getStateHelper().put(TIP, tip);
	}

	protected java.lang.Object getTipFlagNode() {
		return (java.lang.Object) getStateHelper().eval(TIP_FLAG_NODE, null);
	}

	protected void setTipFlagNode(java.lang.Object tipFlagNode) {
		getStateHelper().put(TIP_FLAG_NODE, tipFlagNode);
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

	protected java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	protected void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	protected java.lang.String getAfterAcceptChildrenChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACCEPT_CHILDREN_CHANGE, null);
	}

	protected void setAfterAcceptChildrenChange(java.lang.String afterAcceptChildrenChange) {
		getStateHelper().put(AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange);
	}

	protected java.lang.String getAfterBuilderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BUILDER_CHANGE, null);
	}

	protected void setAfterBuilderChange(java.lang.String afterBuilderChange) {
		getStateHelper().put(AFTER_BUILDER_CHANGE, afterBuilderChange);
	}

	protected java.lang.String getAfterControlsToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTROLS_TOOLBAR_CHANGE, null);
	}

	protected void setAfterControlsToolbarChange(java.lang.String afterControlsToolbarChange) {
		getStateHelper().put(AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange);
	}

	protected java.lang.String getAfterDataTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATA_TYPE_CHANGE, null);
	}

	protected void setAfterDataTypeChange(java.lang.String afterDataTypeChange) {
		getStateHelper().put(AFTER_DATA_TYPE_CHANGE, afterDataTypeChange);
	}

	protected java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	protected void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	protected java.lang.String getAfterDropZoneNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_ZONE_NODE_CHANGE, null);
	}

	protected void setAfterDropZoneNodeChange(java.lang.String afterDropZoneNodeChange) {
		getStateHelper().put(AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange);
	}

	protected java.lang.String getAfterHiddenAttributesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDDEN_ATTRIBUTES_CHANGE, null);
	}

	protected void setAfterHiddenAttributesChange(java.lang.String afterHiddenAttributesChange) {
		getStateHelper().put(AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange);
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

	protected java.lang.String getAfterLabelNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_NODE_CHANGE, null);
	}

	protected void setAfterLabelNodeChange(java.lang.String afterLabelNodeChange) {
		getStateHelper().put(AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange);
	}

	protected java.lang.String getAfterLocalizationMapChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALIZATION_MAP_CHANGE, null);
	}

	protected void setAfterLocalizationMapChange(java.lang.String afterLocalizationMapChange) {
		getStateHelper().put(AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange);
	}

	protected java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	protected void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	protected java.lang.String getAfterParentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PARENT_CHANGE, null);
	}

	protected void setAfterParentChange(java.lang.String afterParentChange) {
		getStateHelper().put(AFTER_PARENT_CHANGE, afterParentChange);
	}

	protected java.lang.String getAfterPredefinedValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREDEFINED_VALUE_CHANGE, null);
	}

	protected void setAfterPredefinedValueChange(java.lang.String afterPredefinedValueChange) {
		getStateHelper().put(AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange);
	}

	protected java.lang.String getAfterReadOnlyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_READ_ONLY_CHANGE, null);
	}

	protected void setAfterReadOnlyChange(java.lang.String afterReadOnlyChange) {
		getStateHelper().put(AFTER_READ_ONLY_CHANGE, afterReadOnlyChange);
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

	protected java.lang.String getAfterRequiredFlagNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REQUIRED_FLAG_NODE_CHANGE, null);
	}

	protected void setAfterRequiredFlagNodeChange(java.lang.String afterRequiredFlagNodeChange) {
		getStateHelper().put(AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange);
	}

	protected java.lang.String getAfterSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_CHANGE, null);
	}

	protected void setAfterSelectedChange(java.lang.String afterSelectedChange) {
		getStateHelper().put(AFTER_SELECTED_CHANGE, afterSelectedChange);
	}

	protected java.lang.String getAfterShowLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_LABEL_CHANGE, null);
	}

	protected void setAfterShowLabelChange(java.lang.String afterShowLabelChange) {
		getStateHelper().put(AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	protected void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	protected java.lang.String getAfterTemplateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TEMPLATE_CHANGE, null);
	}

	protected void setAfterTemplateChange(java.lang.String afterTemplateChange) {
		getStateHelper().put(AFTER_TEMPLATE_CHANGE, afterTemplateChange);
	}

	protected java.lang.String getAfterTemplateNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TEMPLATE_NODE_CHANGE, null);
	}

	protected void setAfterTemplateNodeChange(java.lang.String afterTemplateNodeChange) {
		getStateHelper().put(AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange);
	}

	protected java.lang.String getAfterTipChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TIP_CHANGE, null);
	}

	protected void setAfterTipChange(java.lang.String afterTipChange) {
		getStateHelper().put(AFTER_TIP_CHANGE, afterTipChange);
	}

	protected java.lang.String getAfterTipFlagNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TIP_FLAG_NODE_CHANGE, null);
	}

	protected void setAfterTipFlagNodeChange(java.lang.String afterTipFlagNodeChange) {
		getStateHelper().put(AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange);
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

	protected java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	protected void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	protected java.lang.String getOnAcceptChildrenChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACCEPT_CHILDREN_CHANGE, null);
	}

	protected void setOnAcceptChildrenChange(java.lang.String onAcceptChildrenChange) {
		getStateHelper().put(ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange);
	}

	protected java.lang.String getOnBuilderChange() {
		return (java.lang.String) getStateHelper().eval(ON_BUILDER_CHANGE, null);
	}

	protected void setOnBuilderChange(java.lang.String onBuilderChange) {
		getStateHelper().put(ON_BUILDER_CHANGE, onBuilderChange);
	}

	protected java.lang.String getOnControlsToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTROLS_TOOLBAR_CHANGE, null);
	}

	protected void setOnControlsToolbarChange(java.lang.String onControlsToolbarChange) {
		getStateHelper().put(ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange);
	}

	protected java.lang.String getOnDataTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATA_TYPE_CHANGE, null);
	}

	protected void setOnDataTypeChange(java.lang.String onDataTypeChange) {
		getStateHelper().put(ON_DATA_TYPE_CHANGE, onDataTypeChange);
	}

	protected java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	protected void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	protected java.lang.String getOnDropZoneNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_ZONE_NODE_CHANGE, null);
	}

	protected void setOnDropZoneNodeChange(java.lang.String onDropZoneNodeChange) {
		getStateHelper().put(ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange);
	}

	protected java.lang.String getOnHiddenAttributesChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDDEN_ATTRIBUTES_CHANGE, null);
	}

	protected void setOnHiddenAttributesChange(java.lang.String onHiddenAttributesChange) {
		getStateHelper().put(ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange);
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

	protected java.lang.String getOnLabelNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_NODE_CHANGE, null);
	}

	protected void setOnLabelNodeChange(java.lang.String onLabelNodeChange) {
		getStateHelper().put(ON_LABEL_NODE_CHANGE, onLabelNodeChange);
	}

	protected java.lang.String getOnLocalizationMapChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALIZATION_MAP_CHANGE, null);
	}

	protected void setOnLocalizationMapChange(java.lang.String onLocalizationMapChange) {
		getStateHelper().put(ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange);
	}

	protected java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	protected void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	protected java.lang.String getOnParentChange() {
		return (java.lang.String) getStateHelper().eval(ON_PARENT_CHANGE, null);
	}

	protected void setOnParentChange(java.lang.String onParentChange) {
		getStateHelper().put(ON_PARENT_CHANGE, onParentChange);
	}

	protected java.lang.String getOnPredefinedValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREDEFINED_VALUE_CHANGE, null);
	}

	protected void setOnPredefinedValueChange(java.lang.String onPredefinedValueChange) {
		getStateHelper().put(ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange);
	}

	protected java.lang.String getOnReadOnlyChange() {
		return (java.lang.String) getStateHelper().eval(ON_READ_ONLY_CHANGE, null);
	}

	protected void setOnReadOnlyChange(java.lang.String onReadOnlyChange) {
		getStateHelper().put(ON_READ_ONLY_CHANGE, onReadOnlyChange);
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

	protected java.lang.String getOnRequiredFlagNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_REQUIRED_FLAG_NODE_CHANGE, null);
	}

	protected void setOnRequiredFlagNodeChange(java.lang.String onRequiredFlagNodeChange) {
		getStateHelper().put(ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange);
	}

	protected java.lang.String getOnSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_CHANGE, null);
	}

	protected void setOnSelectedChange(java.lang.String onSelectedChange) {
		getStateHelper().put(ON_SELECTED_CHANGE, onSelectedChange);
	}

	protected java.lang.String getOnShowLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_LABEL_CHANGE, null);
	}

	protected void setOnShowLabelChange(java.lang.String onShowLabelChange) {
		getStateHelper().put(ON_SHOW_LABEL_CHANGE, onShowLabelChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	protected void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	protected java.lang.String getOnTemplateChange() {
		return (java.lang.String) getStateHelper().eval(ON_TEMPLATE_CHANGE, null);
	}

	protected void setOnTemplateChange(java.lang.String onTemplateChange) {
		getStateHelper().put(ON_TEMPLATE_CHANGE, onTemplateChange);
	}

	protected java.lang.String getOnTemplateNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TEMPLATE_NODE_CHANGE, null);
	}

	protected void setOnTemplateNodeChange(java.lang.String onTemplateNodeChange) {
		getStateHelper().put(ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange);
	}

	protected java.lang.String getOnTipChange() {
		return (java.lang.String) getStateHelper().eval(ON_TIP_CHANGE, null);
	}

	protected void setOnTipChange(java.lang.String onTipChange) {
		getStateHelper().put(ON_TIP_CHANGE, onTipChange);
	}

	protected java.lang.String getOnTipFlagNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TIP_FLAG_NODE_CHANGE, null);
	}

	protected void setOnTipFlagNodeChange(java.lang.String onTipFlagNodeChange) {
		getStateHelper().put(ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange);
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

	protected java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	protected void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}