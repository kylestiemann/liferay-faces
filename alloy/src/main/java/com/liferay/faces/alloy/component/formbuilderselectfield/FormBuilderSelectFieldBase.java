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
package com.liferay.faces.alloy.component.formbuilderselectfield;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class FormBuilderSelectFieldBase extends javax.faces.component.UIPanel {

	public static final String ACCEPT_CHILDREN = "acceptChildren";
	public static final String BUILDER = "builder";
	public static final String CONTROLS_TOOLBAR = "controlsToolbar";
	public static final String DATA_TYPE = "dataType";
	public static final String DISABLED = "disabled";
	public static final String DROP_ZONE_NODE = "dropZoneNode";
	public static final String HIDDEN_ATTRIBUTES = "hiddenAttributes";
	public static final String FORM_BUILDER_SELECT_FIELD_ID = "id";
	public static final String LABEL = "label";
	public static final String LABEL_NODE = "labelNode";
	public static final String LOCALIZATION_MAP = "localizationMap";
	public static final String MULTIPLE = "multiple";
	public static final String NAME = "name";
	public static final String OPTION_TEMPLATE = "optionTemplate";
	public static final String OPTIONS = "options";
	public static final String FORM_BUILDER_SELECT_FIELD_PARENT = "parent";
	public static final String PREDEFINED_VALUE = "predefinedValue";
	public static final String READ_ONLY = "readOnly";
	public static final String READ_ONLY_ATTRIBUTES = "readOnlyAttributes";
	public static final String REQUIRED = "required";
	public static final String REQUIRED_FLAG_NODE = "requiredFlagNode";
	public static final String SELECTED = "selected";
	public static final String SHOW_LABEL = "showLabel";
	public static final String STRINGS = "strings";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TEMPLATE = "template";
	public static final String TEMPLATE_NODE = "templateNode";
	public static final String TIP = "tip";
	public static final String TIP_FLAG_NODE = "tipFlagNode";
	public static final String TYPE = "type";
	public static final String UNIQUE = "unique";
	public static final String Z_INDEX = "zIndex";
	public static final String AFTER_ACCEPT_CHILDREN_CHANGE = "afterAcceptChildrenChange";
	public static final String AFTER_BUILDER_CHANGE = "afterBuilderChange";
	public static final String AFTER_CONTROLS_TOOLBAR_CHANGE = "afterControlsToolbarChange";
	public static final String AFTER_DATA_TYPE_CHANGE = "afterDataTypeChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_DROP_ZONE_NODE_CHANGE = "afterDropZoneNodeChange";
	public static final String AFTER_HIDDEN_ATTRIBUTES_CHANGE = "afterHiddenAttributesChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	public static final String AFTER_LABEL_NODE_CHANGE = "afterLabelNodeChange";
	public static final String AFTER_LOCALIZATION_MAP_CHANGE = "afterLocalizationMapChange";
	public static final String AFTER_MULTIPLE_CHANGE = "afterMultipleChange";
	public static final String AFTER_NAME_CHANGE = "afterNameChange";
	public static final String AFTER_OPTION_TEMPLATE_CHANGE = "afterOptionTemplateChange";
	public static final String AFTER_OPTIONS_CHANGE = "afterOptionsChange";
	public static final String AFTER_PARENT_CHANGE = "afterParentChange";
	public static final String AFTER_PREDEFINED_VALUE_CHANGE = "afterPredefinedValueChange";
	public static final String AFTER_READ_ONLY_CHANGE = "afterReadOnlyChange";
	public static final String AFTER_READ_ONLY_ATTRIBUTES_CHANGE = "afterReadOnlyAttributesChange";
	public static final String AFTER_REQUIRED_CHANGE = "afterRequiredChange";
	public static final String AFTER_REQUIRED_FLAG_NODE_CHANGE = "afterRequiredFlagNodeChange";
	public static final String AFTER_SELECTED_CHANGE = "afterSelectedChange";
	public static final String AFTER_SHOW_LABEL_CHANGE = "afterShowLabelChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TEMPLATE_CHANGE = "afterTemplateChange";
	public static final String AFTER_TEMPLATE_NODE_CHANGE = "afterTemplateNodeChange";
	public static final String AFTER_TIP_CHANGE = "afterTipChange";
	public static final String AFTER_TIP_FLAG_NODE_CHANGE = "afterTipFlagNodeChange";
	public static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	public static final String AFTER_UNIQUE_CHANGE = "afterUniqueChange";
	public static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	public static final String ON_ACCEPT_CHILDREN_CHANGE = "onAcceptChildrenChange";
	public static final String ON_BUILDER_CHANGE = "onBuilderChange";
	public static final String ON_CONTROLS_TOOLBAR_CHANGE = "onControlsToolbarChange";
	public static final String ON_DATA_TYPE_CHANGE = "onDataTypeChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_DROP_ZONE_NODE_CHANGE = "onDropZoneNodeChange";
	public static final String ON_HIDDEN_ATTRIBUTES_CHANGE = "onHiddenAttributesChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_LABEL_CHANGE = "onLabelChange";
	public static final String ON_LABEL_NODE_CHANGE = "onLabelNodeChange";
	public static final String ON_LOCALIZATION_MAP_CHANGE = "onLocalizationMapChange";
	public static final String ON_MULTIPLE_CHANGE = "onMultipleChange";
	public static final String ON_NAME_CHANGE = "onNameChange";
	public static final String ON_OPTION_TEMPLATE_CHANGE = "onOptionTemplateChange";
	public static final String ON_OPTIONS_CHANGE = "onOptionsChange";
	public static final String ON_PARENT_CHANGE = "onParentChange";
	public static final String ON_PREDEFINED_VALUE_CHANGE = "onPredefinedValueChange";
	public static final String ON_READ_ONLY_CHANGE = "onReadOnlyChange";
	public static final String ON_READ_ONLY_ATTRIBUTES_CHANGE = "onReadOnlyAttributesChange";
	public static final String ON_REQUIRED_CHANGE = "onRequiredChange";
	public static final String ON_REQUIRED_FLAG_NODE_CHANGE = "onRequiredFlagNodeChange";
	public static final String ON_SELECTED_CHANGE = "onSelectedChange";
	public static final String ON_SHOW_LABEL_CHANGE = "onShowLabelChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TEMPLATE_CHANGE = "onTemplateChange";
	public static final String ON_TEMPLATE_NODE_CHANGE = "onTemplateNodeChange";
	public static final String ON_TIP_CHANGE = "onTipChange";
	public static final String ON_TIP_FLAG_NODE_CHANGE = "onTipFlagNodeChange";
	public static final String ON_TYPE_CHANGE = "onTypeChange";
	public static final String ON_UNIQUE_CHANGE = "onUniqueChange";
	public static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	public java.lang.Boolean getAcceptChildren() {
		return (java.lang.Boolean) getStateHelper().eval(ACCEPT_CHILDREN, null);
	}

	public void setAcceptChildren(java.lang.Boolean acceptChildren) {
		getStateHelper().put(ACCEPT_CHILDREN, acceptChildren);
	}

	public java.lang.Boolean getBuilder() {
		return (java.lang.Boolean) getStateHelper().eval(BUILDER, null);
	}

	public void setBuilder(java.lang.Boolean builder) {
		getStateHelper().put(BUILDER, builder);
	}

	public java.lang.Object getControlsToolbar() {
		return (java.lang.Object) getStateHelper().eval(CONTROLS_TOOLBAR, null);
	}

	public void setControlsToolbar(java.lang.Object controlsToolbar) {
		getStateHelper().put(CONTROLS_TOOLBAR, controlsToolbar);
	}

	public java.lang.String getDataType() {
		return (java.lang.String) getStateHelper().eval(DATA_TYPE, null);
	}

	public void setDataType(java.lang.String dataType) {
		getStateHelper().put(DATA_TYPE, dataType);
	}

	public java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	public void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	public java.lang.String getDropZoneNode() {
		return (java.lang.String) getStateHelper().eval(DROP_ZONE_NODE, null);
	}

	public void setDropZoneNode(java.lang.String dropZoneNode) {
		getStateHelper().put(DROP_ZONE_NODE, dropZoneNode);
	}

	public java.lang.Object getHiddenAttributes() {
		return (java.lang.Object) getStateHelper().eval(HIDDEN_ATTRIBUTES, null);
	}

	public void setHiddenAttributes(java.lang.Object hiddenAttributes) {
		getStateHelper().put(HIDDEN_ATTRIBUTES, hiddenAttributes);
	}

	public java.lang.String getFormBuilderSelectFieldId() {
		return (java.lang.String) getStateHelper().eval(FORM_BUILDER_SELECT_FIELD_ID, null);
	}

	public void setFormBuilderSelectFieldId(java.lang.String formBuilderSelectFieldId) {
		getStateHelper().put(FORM_BUILDER_SELECT_FIELD_ID, formBuilderSelectFieldId);
	}

	public java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(LABEL, null);
	}

	public void setLabel(java.lang.String label) {
		getStateHelper().put(LABEL, label);
	}

	public java.lang.String getLabelNode() {
		return (java.lang.String) getStateHelper().eval(LABEL_NODE, null);
	}

	public void setLabelNode(java.lang.String labelNode) {
		getStateHelper().put(LABEL_NODE, labelNode);
	}

	public java.lang.Object getLocalizationMap() {
		return (java.lang.Object) getStateHelper().eval(LOCALIZATION_MAP, null);
	}

	public void setLocalizationMap(java.lang.Object localizationMap) {
		getStateHelper().put(LOCALIZATION_MAP, localizationMap);
	}

	public java.lang.Boolean getMultiple() {
		return (java.lang.Boolean) getStateHelper().eval(MULTIPLE, null);
	}

	public void setMultiple(java.lang.Boolean multiple) {
		getStateHelper().put(MULTIPLE, multiple);
	}

	public java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	public void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	public java.lang.String getOptionTemplate() {
		return (java.lang.String) getStateHelper().eval(OPTION_TEMPLATE, null);
	}

	public void setOptionTemplate(java.lang.String optionTemplate) {
		getStateHelper().put(OPTION_TEMPLATE, optionTemplate);
	}

	public java.lang.Object getOptions() {
		return (java.lang.Object) getStateHelper().eval(OPTIONS, null);
	}

	public void setOptions(java.lang.Object options) {
		getStateHelper().put(OPTIONS, options);
	}

	public java.lang.String getFormBuilderSelectFieldParent() {
		return (java.lang.String) getStateHelper().eval(FORM_BUILDER_SELECT_FIELD_PARENT, null);
	}

	public void setFormBuilderSelectFieldParent(java.lang.String formBuilderSelectFieldParent) {
		getStateHelper().put(FORM_BUILDER_SELECT_FIELD_PARENT, formBuilderSelectFieldParent);
	}

	public java.lang.String getPredefinedValue() {
		return (java.lang.String) getStateHelper().eval(PREDEFINED_VALUE, null);
	}

	public void setPredefinedValue(java.lang.String predefinedValue) {
		getStateHelper().put(PREDEFINED_VALUE, predefinedValue);
	}

	public java.lang.Boolean getReadOnly() {
		return (java.lang.Boolean) getStateHelper().eval(READ_ONLY, null);
	}

	public void setReadOnly(java.lang.Boolean readOnly) {
		getStateHelper().put(READ_ONLY, readOnly);
	}

	public java.lang.Object getReadOnlyAttributes() {
		return (java.lang.Object) getStateHelper().eval(READ_ONLY_ATTRIBUTES, null);
	}

	public void setReadOnlyAttributes(java.lang.Object readOnlyAttributes) {
		getStateHelper().put(READ_ONLY_ATTRIBUTES, readOnlyAttributes);
	}

	public java.lang.Boolean getRequired() {
		return (java.lang.Boolean) getStateHelper().eval(REQUIRED, null);
	}

	public void setRequired(java.lang.Boolean required) {
		getStateHelper().put(REQUIRED, required);
	}

	public java.lang.String getRequiredFlagNode() {
		return (java.lang.String) getStateHelper().eval(REQUIRED_FLAG_NODE, null);
	}

	public void setRequiredFlagNode(java.lang.String requiredFlagNode) {
		getStateHelper().put(REQUIRED_FLAG_NODE, requiredFlagNode);
	}

	public java.lang.Boolean getSelected() {
		return (java.lang.Boolean) getStateHelper().eval(SELECTED, null);
	}

	public void setSelected(java.lang.Boolean selected) {
		getStateHelper().put(SELECTED, selected);
	}

	public java.lang.Boolean getShowLabel() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_LABEL, null);
	}

	public void setShowLabel(java.lang.Boolean showLabel) {
		getStateHelper().put(SHOW_LABEL, showLabel);
	}

	public java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	public void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.String getTemplate() {
		return (java.lang.String) getStateHelper().eval(TEMPLATE, null);
	}

	public void setTemplate(java.lang.String template) {
		getStateHelper().put(TEMPLATE, template);
	}

	public java.lang.String getTemplateNode() {
		return (java.lang.String) getStateHelper().eval(TEMPLATE_NODE, null);
	}

	public void setTemplateNode(java.lang.String templateNode) {
		getStateHelper().put(TEMPLATE_NODE, templateNode);
	}

	public java.lang.String getTip() {
		return (java.lang.String) getStateHelper().eval(TIP, null);
	}

	public void setTip(java.lang.String tip) {
		getStateHelper().put(TIP, tip);
	}

	public java.lang.String getTipFlagNode() {
		return (java.lang.String) getStateHelper().eval(TIP_FLAG_NODE, null);
	}

	public void setTipFlagNode(java.lang.String tipFlagNode) {
		getStateHelper().put(TIP_FLAG_NODE, tipFlagNode);
	}

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	public void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	public java.lang.Boolean getUnique() {
		return (java.lang.Boolean) getStateHelper().eval(UNIQUE, null);
	}

	public void setUnique(java.lang.Boolean unique) {
		getStateHelper().put(UNIQUE, unique);
	}

	public java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	public void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	public java.lang.String getAfterAcceptChildrenChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACCEPT_CHILDREN_CHANGE, null);
	}

	public void setAfterAcceptChildrenChange(java.lang.String afterAcceptChildrenChange) {
		getStateHelper().put(AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange);
	}

	public java.lang.String getAfterBuilderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BUILDER_CHANGE, null);
	}

	public void setAfterBuilderChange(java.lang.String afterBuilderChange) {
		getStateHelper().put(AFTER_BUILDER_CHANGE, afterBuilderChange);
	}

	public java.lang.String getAfterControlsToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTROLS_TOOLBAR_CHANGE, null);
	}

	public void setAfterControlsToolbarChange(java.lang.String afterControlsToolbarChange) {
		getStateHelper().put(AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange);
	}

	public java.lang.String getAfterDataTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATA_TYPE_CHANGE, null);
	}

	public void setAfterDataTypeChange(java.lang.String afterDataTypeChange) {
		getStateHelper().put(AFTER_DATA_TYPE_CHANGE, afterDataTypeChange);
	}

	public java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	public java.lang.String getAfterDropZoneNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DROP_ZONE_NODE_CHANGE, null);
	}

	public void setAfterDropZoneNodeChange(java.lang.String afterDropZoneNodeChange) {
		getStateHelper().put(AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange);
	}

	public java.lang.String getAfterHiddenAttributesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDDEN_ATTRIBUTES_CHANGE, null);
	}

	public void setAfterHiddenAttributesChange(java.lang.String afterHiddenAttributesChange) {
		getStateHelper().put(AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange);
	}

	public java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	public void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	public java.lang.String getAfterLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_CHANGE, null);
	}

	public void setAfterLabelChange(java.lang.String afterLabelChange) {
		getStateHelper().put(AFTER_LABEL_CHANGE, afterLabelChange);
	}

	public java.lang.String getAfterLabelNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_NODE_CHANGE, null);
	}

	public void setAfterLabelNodeChange(java.lang.String afterLabelNodeChange) {
		getStateHelper().put(AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange);
	}

	public java.lang.String getAfterLocalizationMapChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALIZATION_MAP_CHANGE, null);
	}

	public void setAfterLocalizationMapChange(java.lang.String afterLocalizationMapChange) {
		getStateHelper().put(AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange);
	}

	public java.lang.String getAfterMultipleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MULTIPLE_CHANGE, null);
	}

	public void setAfterMultipleChange(java.lang.String afterMultipleChange) {
		getStateHelper().put(AFTER_MULTIPLE_CHANGE, afterMultipleChange);
	}

	public java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	public void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	public java.lang.String getAfterOptionTemplateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OPTION_TEMPLATE_CHANGE, null);
	}

	public void setAfterOptionTemplateChange(java.lang.String afterOptionTemplateChange) {
		getStateHelper().put(AFTER_OPTION_TEMPLATE_CHANGE, afterOptionTemplateChange);
	}

	public java.lang.String getAfterOptionsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OPTIONS_CHANGE, null);
	}

	public void setAfterOptionsChange(java.lang.String afterOptionsChange) {
		getStateHelper().put(AFTER_OPTIONS_CHANGE, afterOptionsChange);
	}

	public java.lang.String getAfterParentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PARENT_CHANGE, null);
	}

	public void setAfterParentChange(java.lang.String afterParentChange) {
		getStateHelper().put(AFTER_PARENT_CHANGE, afterParentChange);
	}

	public java.lang.String getAfterPredefinedValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREDEFINED_VALUE_CHANGE, null);
	}

	public void setAfterPredefinedValueChange(java.lang.String afterPredefinedValueChange) {
		getStateHelper().put(AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange);
	}

	public java.lang.String getAfterReadOnlyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_READ_ONLY_CHANGE, null);
	}

	public void setAfterReadOnlyChange(java.lang.String afterReadOnlyChange) {
		getStateHelper().put(AFTER_READ_ONLY_CHANGE, afterReadOnlyChange);
	}

	public java.lang.String getAfterReadOnlyAttributesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_READ_ONLY_ATTRIBUTES_CHANGE, null);
	}

	public void setAfterReadOnlyAttributesChange(java.lang.String afterReadOnlyAttributesChange) {
		getStateHelper().put(AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange);
	}

	public java.lang.String getAfterRequiredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REQUIRED_CHANGE, null);
	}

	public void setAfterRequiredChange(java.lang.String afterRequiredChange) {
		getStateHelper().put(AFTER_REQUIRED_CHANGE, afterRequiredChange);
	}

	public java.lang.String getAfterRequiredFlagNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REQUIRED_FLAG_NODE_CHANGE, null);
	}

	public void setAfterRequiredFlagNodeChange(java.lang.String afterRequiredFlagNodeChange) {
		getStateHelper().put(AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange);
	}

	public java.lang.String getAfterSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_CHANGE, null);
	}

	public void setAfterSelectedChange(java.lang.String afterSelectedChange) {
		getStateHelper().put(AFTER_SELECTED_CHANGE, afterSelectedChange);
	}

	public java.lang.String getAfterShowLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_LABEL_CHANGE, null);
	}

	public void setAfterShowLabelChange(java.lang.String afterShowLabelChange) {
		getStateHelper().put(AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange);
	}

	public java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	public void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	public java.lang.String getAfterTemplateChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TEMPLATE_CHANGE, null);
	}

	public void setAfterTemplateChange(java.lang.String afterTemplateChange) {
		getStateHelper().put(AFTER_TEMPLATE_CHANGE, afterTemplateChange);
	}

	public java.lang.String getAfterTemplateNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TEMPLATE_NODE_CHANGE, null);
	}

	public void setAfterTemplateNodeChange(java.lang.String afterTemplateNodeChange) {
		getStateHelper().put(AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange);
	}

	public java.lang.String getAfterTipChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TIP_CHANGE, null);
	}

	public void setAfterTipChange(java.lang.String afterTipChange) {
		getStateHelper().put(AFTER_TIP_CHANGE, afterTipChange);
	}

	public java.lang.String getAfterTipFlagNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TIP_FLAG_NODE_CHANGE, null);
	}

	public void setAfterTipFlagNodeChange(java.lang.String afterTipFlagNodeChange) {
		getStateHelper().put(AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange);
	}

	public java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	public void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	public java.lang.String getAfterUniqueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_UNIQUE_CHANGE, null);
	}

	public void setAfterUniqueChange(java.lang.String afterUniqueChange) {
		getStateHelper().put(AFTER_UNIQUE_CHANGE, afterUniqueChange);
	}

	public java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	public void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	public java.lang.String getOnAcceptChildrenChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACCEPT_CHILDREN_CHANGE, null);
	}

	public void setOnAcceptChildrenChange(java.lang.String onAcceptChildrenChange) {
		getStateHelper().put(ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange);
	}

	public java.lang.String getOnBuilderChange() {
		return (java.lang.String) getStateHelper().eval(ON_BUILDER_CHANGE, null);
	}

	public void setOnBuilderChange(java.lang.String onBuilderChange) {
		getStateHelper().put(ON_BUILDER_CHANGE, onBuilderChange);
	}

	public java.lang.String getOnControlsToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTROLS_TOOLBAR_CHANGE, null);
	}

	public void setOnControlsToolbarChange(java.lang.String onControlsToolbarChange) {
		getStateHelper().put(ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange);
	}

	public java.lang.String getOnDataTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATA_TYPE_CHANGE, null);
	}

	public void setOnDataTypeChange(java.lang.String onDataTypeChange) {
		getStateHelper().put(ON_DATA_TYPE_CHANGE, onDataTypeChange);
	}

	public java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	public java.lang.String getOnDropZoneNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_DROP_ZONE_NODE_CHANGE, null);
	}

	public void setOnDropZoneNodeChange(java.lang.String onDropZoneNodeChange) {
		getStateHelper().put(ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange);
	}

	public java.lang.String getOnHiddenAttributesChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDDEN_ATTRIBUTES_CHANGE, null);
	}

	public void setOnHiddenAttributesChange(java.lang.String onHiddenAttributesChange) {
		getStateHelper().put(ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange);
	}

	public java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	public void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	public java.lang.String getOnLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_CHANGE, null);
	}

	public void setOnLabelChange(java.lang.String onLabelChange) {
		getStateHelper().put(ON_LABEL_CHANGE, onLabelChange);
	}

	public java.lang.String getOnLabelNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_NODE_CHANGE, null);
	}

	public void setOnLabelNodeChange(java.lang.String onLabelNodeChange) {
		getStateHelper().put(ON_LABEL_NODE_CHANGE, onLabelNodeChange);
	}

	public java.lang.String getOnLocalizationMapChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALIZATION_MAP_CHANGE, null);
	}

	public void setOnLocalizationMapChange(java.lang.String onLocalizationMapChange) {
		getStateHelper().put(ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange);
	}

	public java.lang.String getOnMultipleChange() {
		return (java.lang.String) getStateHelper().eval(ON_MULTIPLE_CHANGE, null);
	}

	public void setOnMultipleChange(java.lang.String onMultipleChange) {
		getStateHelper().put(ON_MULTIPLE_CHANGE, onMultipleChange);
	}

	public java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	public void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	public java.lang.String getOnOptionTemplateChange() {
		return (java.lang.String) getStateHelper().eval(ON_OPTION_TEMPLATE_CHANGE, null);
	}

	public void setOnOptionTemplateChange(java.lang.String onOptionTemplateChange) {
		getStateHelper().put(ON_OPTION_TEMPLATE_CHANGE, onOptionTemplateChange);
	}

	public java.lang.String getOnOptionsChange() {
		return (java.lang.String) getStateHelper().eval(ON_OPTIONS_CHANGE, null);
	}

	public void setOnOptionsChange(java.lang.String onOptionsChange) {
		getStateHelper().put(ON_OPTIONS_CHANGE, onOptionsChange);
	}

	public java.lang.String getOnParentChange() {
		return (java.lang.String) getStateHelper().eval(ON_PARENT_CHANGE, null);
	}

	public void setOnParentChange(java.lang.String onParentChange) {
		getStateHelper().put(ON_PARENT_CHANGE, onParentChange);
	}

	public java.lang.String getOnPredefinedValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREDEFINED_VALUE_CHANGE, null);
	}

	public void setOnPredefinedValueChange(java.lang.String onPredefinedValueChange) {
		getStateHelper().put(ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange);
	}

	public java.lang.String getOnReadOnlyChange() {
		return (java.lang.String) getStateHelper().eval(ON_READ_ONLY_CHANGE, null);
	}

	public void setOnReadOnlyChange(java.lang.String onReadOnlyChange) {
		getStateHelper().put(ON_READ_ONLY_CHANGE, onReadOnlyChange);
	}

	public java.lang.String getOnReadOnlyAttributesChange() {
		return (java.lang.String) getStateHelper().eval(ON_READ_ONLY_ATTRIBUTES_CHANGE, null);
	}

	public void setOnReadOnlyAttributesChange(java.lang.String onReadOnlyAttributesChange) {
		getStateHelper().put(ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange);
	}

	public java.lang.String getOnRequiredChange() {
		return (java.lang.String) getStateHelper().eval(ON_REQUIRED_CHANGE, null);
	}

	public void setOnRequiredChange(java.lang.String onRequiredChange) {
		getStateHelper().put(ON_REQUIRED_CHANGE, onRequiredChange);
	}

	public java.lang.String getOnRequiredFlagNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_REQUIRED_FLAG_NODE_CHANGE, null);
	}

	public void setOnRequiredFlagNodeChange(java.lang.String onRequiredFlagNodeChange) {
		getStateHelper().put(ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange);
	}

	public java.lang.String getOnSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_CHANGE, null);
	}

	public void setOnSelectedChange(java.lang.String onSelectedChange) {
		getStateHelper().put(ON_SELECTED_CHANGE, onSelectedChange);
	}

	public java.lang.String getOnShowLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_LABEL_CHANGE, null);
	}

	public void setOnShowLabelChange(java.lang.String onShowLabelChange) {
		getStateHelper().put(ON_SHOW_LABEL_CHANGE, onShowLabelChange);
	}

	public java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	public void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	public java.lang.String getOnTemplateChange() {
		return (java.lang.String) getStateHelper().eval(ON_TEMPLATE_CHANGE, null);
	}

	public void setOnTemplateChange(java.lang.String onTemplateChange) {
		getStateHelper().put(ON_TEMPLATE_CHANGE, onTemplateChange);
	}

	public java.lang.String getOnTemplateNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TEMPLATE_NODE_CHANGE, null);
	}

	public void setOnTemplateNodeChange(java.lang.String onTemplateNodeChange) {
		getStateHelper().put(ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange);
	}

	public java.lang.String getOnTipChange() {
		return (java.lang.String) getStateHelper().eval(ON_TIP_CHANGE, null);
	}

	public void setOnTipChange(java.lang.String onTipChange) {
		getStateHelper().put(ON_TIP_CHANGE, onTipChange);
	}

	public java.lang.String getOnTipFlagNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TIP_FLAG_NODE_CHANGE, null);
	}

	public void setOnTipFlagNodeChange(java.lang.String onTipFlagNodeChange) {
		getStateHelper().put(ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange);
	}

	public java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	public void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

	public java.lang.String getOnUniqueChange() {
		return (java.lang.String) getStateHelper().eval(ON_UNIQUE_CHANGE, null);
	}

	public void setOnUniqueChange(java.lang.String onUniqueChange) {
		getStateHelper().put(ON_UNIQUE_CHANGE, onUniqueChange);
	}

	public java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	public void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}