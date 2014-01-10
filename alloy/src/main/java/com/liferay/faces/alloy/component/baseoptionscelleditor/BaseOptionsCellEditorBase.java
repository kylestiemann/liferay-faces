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
package com.liferay.faces.alloy.component.baseoptionscelleditor;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class BaseOptionsCellEditorBase extends javax.faces.component.UIPanel {

	private static final String EDITABLE = "editable";
	private static final String ELEMENT_NAME = "elementName";
	private static final String FOOTER_CONTENT = "footerContent";
	private static final String HIDE_ON_SAVE = "hideOnSave";
	private static final String INPUT_FORMATTER = "inputFormatter";
	private static final String OPTIONS = "options";
	private static final String OUTPUT_FORMATTER = "outputFormatter";
	private static final String SELECTED_ATTR_NAME = "selectedAttrName";
	private static final String SHOW_TOOLBAR = "showToolbar";
	private static final String STRINGS = "strings";
	private static final String TAB_INDEX = "tabIndex";
	private static final String TOOLBAR = "toolbar";
	private static final String UNESCAPE_VALUE = "unescapeValue";
	private static final String VALIDATOR = "validator";
	private static final String BASEOPTIONSCELLEDITOR_VALUE = "baseoptionscelleditorValue";
	private static final String VISIBLE = "visible";
	private static final String AFTER_EDITABLE_CHANGE = "afterEditableChange";
	private static final String AFTER_ELEMENT_NAME_CHANGE = "afterElementNameChange";
	private static final String AFTER_FOOTER_CONTENT_CHANGE = "afterFooterContentChange";
	private static final String AFTER_HIDE_ON_SAVE_CHANGE = "afterHideOnSaveChange";
	private static final String AFTER_INPUT_FORMATTER_CHANGE = "afterInputFormatterChange";
	private static final String AFTER_OPTIONS_CHANGE = "afterOptionsChange";
	private static final String AFTER_OUTPUT_FORMATTER_CHANGE = "afterOutputFormatterChange";
	private static final String AFTER_SELECTED_ATTR_NAME_CHANGE = "afterSelectedAttrNameChange";
	private static final String AFTER_SHOW_TOOLBAR_CHANGE = "afterShowToolbarChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_TOOLBAR_CHANGE = "afterToolbarChange";
	private static final String AFTER_UNESCAPE_VALUE_CHANGE = "afterUnescapeValueChange";
	private static final String AFTER_VALIDATOR_CHANGE = "afterValidatorChange";
	private static final String AFTER_VALUE_CHANGE = "afterValueChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String ON_EDITABLE_CHANGE = "onEditableChange";
	private static final String ON_ELEMENT_NAME_CHANGE = "onElementNameChange";
	private static final String ON_FOOTER_CONTENT_CHANGE = "onFooterContentChange";
	private static final String ON_HIDE_ON_SAVE_CHANGE = "onHideOnSaveChange";
	private static final String ON_INPUT_FORMATTER_CHANGE = "onInputFormatterChange";
	private static final String ON_OPTIONS_CHANGE = "onOptionsChange";
	private static final String ON_OUTPUT_FORMATTER_CHANGE = "onOutputFormatterChange";
	private static final String ON_SELECTED_ATTR_NAME_CHANGE = "onSelectedAttrNameChange";
	private static final String ON_SHOW_TOOLBAR_CHANGE = "onShowToolbarChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_TOOLBAR_CHANGE = "onToolbarChange";
	private static final String ON_UNESCAPE_VALUE_CHANGE = "onUnescapeValueChange";
	private static final String ON_VALIDATOR_CHANGE = "onValidatorChange";
	private static final String ON_VALUE_CHANGE = "onValueChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	protected java.lang.Boolean getEditable() {
		return (java.lang.Boolean) getStateHelper().eval(EDITABLE, null);
	}

	protected void setEditable(java.lang.Boolean editable) {
		getStateHelper().put(EDITABLE, editable);
	}

	protected java.lang.String getElementName() {
		return (java.lang.String) getStateHelper().eval(ELEMENT_NAME, null);
	}

	protected void setElementName(java.lang.String elementName) {
		getStateHelper().put(ELEMENT_NAME, elementName);
	}

	protected java.lang.String getFooterContent() {
		return (java.lang.String) getStateHelper().eval(FOOTER_CONTENT, null);
	}

	protected void setFooterContent(java.lang.String footerContent) {
		getStateHelper().put(FOOTER_CONTENT, footerContent);
	}

	protected java.lang.Boolean getHideOnSave() {
		return (java.lang.Boolean) getStateHelper().eval(HIDE_ON_SAVE, null);
	}

	protected void setHideOnSave(java.lang.Boolean hideOnSave) {
		getStateHelper().put(HIDE_ON_SAVE, hideOnSave);
	}

	protected java.lang.Object getInputFormatter() {
		return (java.lang.Object) getStateHelper().eval(INPUT_FORMATTER, null);
	}

	protected void setInputFormatter(java.lang.Object inputFormatter) {
		getStateHelper().put(INPUT_FORMATTER, inputFormatter);
	}

	protected java.lang.Object getOptions() {
		return (java.lang.Object) getStateHelper().eval(OPTIONS, null);
	}

	protected void setOptions(java.lang.Object options) {
		getStateHelper().put(OPTIONS, options);
	}

	protected java.lang.Object getOutputFormatter() {
		return (java.lang.Object) getStateHelper().eval(OUTPUT_FORMATTER, null);
	}

	protected void setOutputFormatter(java.lang.Object outputFormatter) {
		getStateHelper().put(OUTPUT_FORMATTER, outputFormatter);
	}

	protected java.lang.String getSelectedAttrName() {
		return (java.lang.String) getStateHelper().eval(SELECTED_ATTR_NAME, null);
	}

	protected void setSelectedAttrName(java.lang.String selectedAttrName) {
		getStateHelper().put(SELECTED_ATTR_NAME, selectedAttrName);
	}

	protected java.lang.Boolean getShowToolbar() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_TOOLBAR, null);
	}

	protected void setShowToolbar(java.lang.Boolean showToolbar) {
		getStateHelper().put(SHOW_TOOLBAR, showToolbar);
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

	protected java.lang.Object getToolbar() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR, null);
	}

	protected void setToolbar(java.lang.Object toolbar) {
		getStateHelper().put(TOOLBAR, toolbar);
	}

	protected java.lang.Boolean getUnescapeValue() {
		return (java.lang.Boolean) getStateHelper().eval(UNESCAPE_VALUE, null);
	}

	protected void setUnescapeValue(java.lang.Boolean unescapeValue) {
		getStateHelper().put(UNESCAPE_VALUE, unescapeValue);
	}

	protected java.lang.Object getValidator() {
		return (java.lang.Object) getStateHelper().eval(VALIDATOR, null);
	}

	protected void setValidator(java.lang.Object validator) {
		getStateHelper().put(VALIDATOR, validator);
	}

	protected java.lang.String getBaseoptionscelleditorValue() {
		return (java.lang.String) getStateHelper().eval(BASEOPTIONSCELLEDITOR_VALUE, null);
	}

	protected void setBaseoptionscelleditorValue(java.lang.String baseoptionscelleditorValue) {
		getStateHelper().put(BASEOPTIONSCELLEDITOR_VALUE, baseoptionscelleditorValue);
	}

	protected java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	protected void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	protected java.lang.String getAfterEditableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EDITABLE_CHANGE, null);
	}

	protected void setAfterEditableChange(java.lang.String afterEditableChange) {
		getStateHelper().put(AFTER_EDITABLE_CHANGE, afterEditableChange);
	}

	protected java.lang.String getAfterElementNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ELEMENT_NAME_CHANGE, null);
	}

	protected void setAfterElementNameChange(java.lang.String afterElementNameChange) {
		getStateHelper().put(AFTER_ELEMENT_NAME_CHANGE, afterElementNameChange);
	}

	protected java.lang.String getAfterFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOOTER_CONTENT_CHANGE, null);
	}

	protected void setAfterFooterContentChange(java.lang.String afterFooterContentChange) {
		getStateHelper().put(AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange);
	}

	protected java.lang.String getAfterHideOnSaveChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_ON_SAVE_CHANGE, null);
	}

	protected void setAfterHideOnSaveChange(java.lang.String afterHideOnSaveChange) {
		getStateHelper().put(AFTER_HIDE_ON_SAVE_CHANGE, afterHideOnSaveChange);
	}

	protected java.lang.String getAfterInputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INPUT_FORMATTER_CHANGE, null);
	}

	protected void setAfterInputFormatterChange(java.lang.String afterInputFormatterChange) {
		getStateHelper().put(AFTER_INPUT_FORMATTER_CHANGE, afterInputFormatterChange);
	}

	protected java.lang.String getAfterOptionsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OPTIONS_CHANGE, null);
	}

	protected void setAfterOptionsChange(java.lang.String afterOptionsChange) {
		getStateHelper().put(AFTER_OPTIONS_CHANGE, afterOptionsChange);
	}

	protected java.lang.String getAfterOutputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OUTPUT_FORMATTER_CHANGE, null);
	}

	protected void setAfterOutputFormatterChange(java.lang.String afterOutputFormatterChange) {
		getStateHelper().put(AFTER_OUTPUT_FORMATTER_CHANGE, afterOutputFormatterChange);
	}

	protected java.lang.String getAfterSelectedAttrNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_ATTR_NAME_CHANGE, null);
	}

	protected void setAfterSelectedAttrNameChange(java.lang.String afterSelectedAttrNameChange) {
		getStateHelper().put(AFTER_SELECTED_ATTR_NAME_CHANGE, afterSelectedAttrNameChange);
	}

	protected java.lang.String getAfterShowToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_TOOLBAR_CHANGE, null);
	}

	protected void setAfterShowToolbarChange(java.lang.String afterShowToolbarChange) {
		getStateHelper().put(AFTER_SHOW_TOOLBAR_CHANGE, afterShowToolbarChange);
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

	protected java.lang.String getAfterToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_CHANGE, null);
	}

	protected void setAfterToolbarChange(java.lang.String afterToolbarChange) {
		getStateHelper().put(AFTER_TOOLBAR_CHANGE, afterToolbarChange);
	}

	protected java.lang.String getAfterUnescapeValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_UNESCAPE_VALUE_CHANGE, null);
	}

	protected void setAfterUnescapeValueChange(java.lang.String afterUnescapeValueChange) {
		getStateHelper().put(AFTER_UNESCAPE_VALUE_CHANGE, afterUnescapeValueChange);
	}

	protected java.lang.String getAfterValidatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALIDATOR_CHANGE, null);
	}

	protected void setAfterValidatorChange(java.lang.String afterValidatorChange) {
		getStateHelper().put(AFTER_VALIDATOR_CHANGE, afterValidatorChange);
	}

	protected java.lang.String getAfterValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_CHANGE, null);
	}

	protected void setAfterValueChange(java.lang.String afterValueChange) {
		getStateHelper().put(AFTER_VALUE_CHANGE, afterValueChange);
	}

	protected java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	protected void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	protected java.lang.String getOnEditableChange() {
		return (java.lang.String) getStateHelper().eval(ON_EDITABLE_CHANGE, null);
	}

	protected void setOnEditableChange(java.lang.String onEditableChange) {
		getStateHelper().put(ON_EDITABLE_CHANGE, onEditableChange);
	}

	protected java.lang.String getOnElementNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_ELEMENT_NAME_CHANGE, null);
	}

	protected void setOnElementNameChange(java.lang.String onElementNameChange) {
		getStateHelper().put(ON_ELEMENT_NAME_CHANGE, onElementNameChange);
	}

	protected java.lang.String getOnFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOOTER_CONTENT_CHANGE, null);
	}

	protected void setOnFooterContentChange(java.lang.String onFooterContentChange) {
		getStateHelper().put(ON_FOOTER_CONTENT_CHANGE, onFooterContentChange);
	}

	protected java.lang.String getOnHideOnSaveChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_ON_SAVE_CHANGE, null);
	}

	protected void setOnHideOnSaveChange(java.lang.String onHideOnSaveChange) {
		getStateHelper().put(ON_HIDE_ON_SAVE_CHANGE, onHideOnSaveChange);
	}

	protected java.lang.String getOnInputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INPUT_FORMATTER_CHANGE, null);
	}

	protected void setOnInputFormatterChange(java.lang.String onInputFormatterChange) {
		getStateHelper().put(ON_INPUT_FORMATTER_CHANGE, onInputFormatterChange);
	}

	protected java.lang.String getOnOptionsChange() {
		return (java.lang.String) getStateHelper().eval(ON_OPTIONS_CHANGE, null);
	}

	protected void setOnOptionsChange(java.lang.String onOptionsChange) {
		getStateHelper().put(ON_OPTIONS_CHANGE, onOptionsChange);
	}

	protected java.lang.String getOnOutputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_OUTPUT_FORMATTER_CHANGE, null);
	}

	protected void setOnOutputFormatterChange(java.lang.String onOutputFormatterChange) {
		getStateHelper().put(ON_OUTPUT_FORMATTER_CHANGE, onOutputFormatterChange);
	}

	protected java.lang.String getOnSelectedAttrNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_ATTR_NAME_CHANGE, null);
	}

	protected void setOnSelectedAttrNameChange(java.lang.String onSelectedAttrNameChange) {
		getStateHelper().put(ON_SELECTED_ATTR_NAME_CHANGE, onSelectedAttrNameChange);
	}

	protected java.lang.String getOnShowToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_TOOLBAR_CHANGE, null);
	}

	protected void setOnShowToolbarChange(java.lang.String onShowToolbarChange) {
		getStateHelper().put(ON_SHOW_TOOLBAR_CHANGE, onShowToolbarChange);
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

	protected java.lang.String getOnToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_CHANGE, null);
	}

	protected void setOnToolbarChange(java.lang.String onToolbarChange) {
		getStateHelper().put(ON_TOOLBAR_CHANGE, onToolbarChange);
	}

	protected java.lang.String getOnUnescapeValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_UNESCAPE_VALUE_CHANGE, null);
	}

	protected void setOnUnescapeValueChange(java.lang.String onUnescapeValueChange) {
		getStateHelper().put(ON_UNESCAPE_VALUE_CHANGE, onUnescapeValueChange);
	}

	protected java.lang.String getOnValidatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALIDATOR_CHANGE, null);
	}

	protected void setOnValidatorChange(java.lang.String onValidatorChange) {
		getStateHelper().put(ON_VALIDATOR_CHANGE, onValidatorChange);
	}

	protected java.lang.String getOnValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_CHANGE, null);
	}

	protected void setOnValueChange(java.lang.String onValueChange) {
		getStateHelper().put(ON_VALUE_CHANGE, onValueChange);
	}

	protected java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	protected void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

}