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
package com.liferay.faces.alloy.component.thumbrating;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ThumbRatingBase extends javax.faces.component.UIPanel {

	private static final String CAN_RESET = "canReset";
	private static final String CSS_CLASS = "cssClass";
	private static final String CSS_CLASSES = "cssClasses";
	private static final String DEFAULT_SELECTED = "defaultSelected";
	private static final String DISABLED = "disabled";
	private static final String ELEMENTS = "elements";
	private static final String HIDDEN_INPUT = "hiddenInput";
	private static final String HIDE_CLASS = "hideClass";
	private static final String INPUT_NAME = "inputName";
	private static final String LABEL = "label";
	private static final String LABEL_NODE = "labelNode";
	private static final String RENDER = "render";
	private static final String SELECTED_INDEX = "selectedIndex";
	private static final String SHOW_TITLE = "showTitle";
	private static final String SIZE = "size";
	private static final String TITLE = "title";
	private static final String USE_ARIA = "useARIA";
	private static final String THUMBRATING_VALUE = "thumbratingValue";
	private static final String AFTER_CAN_RESET_CHANGE = "afterCanResetChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_CSS_CLASSES_CHANGE = "afterCssClassesChange";
	private static final String AFTER_DEFAULT_SELECTED_CHANGE = "afterDefaultSelectedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_ELEMENTS_CHANGE = "afterElementsChange";
	private static final String AFTER_HIDDEN_INPUT_CHANGE = "afterHiddenInputChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_INPUT_NAME_CHANGE = "afterInputNameChange";
	private static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	private static final String AFTER_LABEL_NODE_CHANGE = "afterLabelNodeChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_SELECTED_INDEX_CHANGE = "afterSelectedIndexChange";
	private static final String AFTER_SHOW_TITLE_CHANGE = "afterShowTitleChange";
	private static final String AFTER_SIZE_CHANGE = "afterSizeChange";
	private static final String AFTER_TITLE_CHANGE = "afterTitleChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String AFTER_VALUE_CHANGE = "afterValueChange";
	private static final String ON_CAN_RESET_CHANGE = "onCanResetChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_CSS_CLASSES_CHANGE = "onCssClassesChange";
	private static final String ON_DEFAULT_SELECTED_CHANGE = "onDefaultSelectedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_ELEMENTS_CHANGE = "onElementsChange";
	private static final String ON_HIDDEN_INPUT_CHANGE = "onHiddenInputChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_INPUT_NAME_CHANGE = "onInputNameChange";
	private static final String ON_LABEL_CHANGE = "onLabelChange";
	private static final String ON_LABEL_NODE_CHANGE = "onLabelNodeChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_SELECTED_INDEX_CHANGE = "onSelectedIndexChange";
	private static final String ON_SHOW_TITLE_CHANGE = "onShowTitleChange";
	private static final String ON_SIZE_CHANGE = "onSizeChange";
	private static final String ON_TITLE_CHANGE = "onTitleChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	private static final String ON_VALUE_CHANGE = "onValueChange";

	protected java.lang.Boolean getCanReset() {
		return (java.lang.Boolean) getStateHelper().eval(CAN_RESET, null);
	}

	protected void setCanReset(java.lang.Boolean canReset) {
		getStateHelper().put(CAN_RESET, canReset);
	}

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Object getCssClasses() {
		return (java.lang.Object) getStateHelper().eval(CSS_CLASSES, null);
	}

	protected void setCssClasses(java.lang.Object cssClasses) {
		getStateHelper().put(CSS_CLASSES, cssClasses);
	}

	protected java.lang.Object getDefaultSelected() {
		return (java.lang.Object) getStateHelper().eval(DEFAULT_SELECTED, null);
	}

	protected void setDefaultSelected(java.lang.Object defaultSelected) {
		getStateHelper().put(DEFAULT_SELECTED, defaultSelected);
	}

	protected java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	protected void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	protected java.lang.Object getElements() {
		return (java.lang.Object) getStateHelper().eval(ELEMENTS, null);
	}

	protected void setElements(java.lang.Object elements) {
		getStateHelper().put(ELEMENTS, elements);
	}

	protected java.lang.Object getHiddenInput() {
		return (java.lang.Object) getStateHelper().eval(HIDDEN_INPUT, null);
	}

	protected void setHiddenInput(java.lang.Object hiddenInput) {
		getStateHelper().put(HIDDEN_INPUT, hiddenInput);
	}

	protected java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	protected void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	protected java.lang.String getInputName() {
		return (java.lang.String) getStateHelper().eval(INPUT_NAME, null);
	}

	protected void setInputName(java.lang.String inputName) {
		getStateHelper().put(INPUT_NAME, inputName);
	}

	protected java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(LABEL, null);
	}

	protected void setLabel(java.lang.String label) {
		getStateHelper().put(LABEL, label);
	}

	protected java.lang.String getLabelNode() {
		return (java.lang.String) getStateHelper().eval(LABEL_NODE, null);
	}

	protected void setLabelNode(java.lang.String labelNode) {
		getStateHelper().put(LABEL_NODE, labelNode);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Object getSelectedIndex() {
		return (java.lang.Object) getStateHelper().eval(SELECTED_INDEX, null);
	}

	protected void setSelectedIndex(java.lang.Object selectedIndex) {
		getStateHelper().put(SELECTED_INDEX, selectedIndex);
	}

	protected java.lang.Boolean getShowTitle() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_TITLE, null);
	}

	protected void setShowTitle(java.lang.Boolean showTitle) {
		getStateHelper().put(SHOW_TITLE, showTitle);
	}

	protected java.lang.Object getSize() {
		return (java.lang.Object) getStateHelper().eval(SIZE, null);
	}

	protected void setSize(java.lang.Object size) {
		getStateHelper().put(SIZE, size);
	}

	protected java.lang.String getTitle() {
		return (java.lang.String) getStateHelper().eval(TITLE, null);
	}

	protected void setTitle(java.lang.String title) {
		getStateHelper().put(TITLE, title);
	}

	protected java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	protected void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	protected java.lang.String getThumbratingValue() {
		return (java.lang.String) getStateHelper().eval(THUMBRATING_VALUE, null);
	}

	protected void setThumbratingValue(java.lang.String thumbratingValue) {
		getStateHelper().put(THUMBRATING_VALUE, thumbratingValue);
	}

	protected java.lang.String getAfterCanResetChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CAN_RESET_CHANGE, null);
	}

	protected void setAfterCanResetChange(java.lang.String afterCanResetChange) {
		getStateHelper().put(AFTER_CAN_RESET_CHANGE, afterCanResetChange);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterCssClassesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASSES_CHANGE, null);
	}

	protected void setAfterCssClassesChange(java.lang.String afterCssClassesChange) {
		getStateHelper().put(AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange);
	}

	protected java.lang.String getAfterDefaultSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DEFAULT_SELECTED_CHANGE, null);
	}

	protected void setAfterDefaultSelectedChange(java.lang.String afterDefaultSelectedChange) {
		getStateHelper().put(AFTER_DEFAULT_SELECTED_CHANGE, afterDefaultSelectedChange);
	}

	protected java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	protected void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	protected java.lang.String getAfterElementsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ELEMENTS_CHANGE, null);
	}

	protected void setAfterElementsChange(java.lang.String afterElementsChange) {
		getStateHelper().put(AFTER_ELEMENTS_CHANGE, afterElementsChange);
	}

	protected java.lang.String getAfterHiddenInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDDEN_INPUT_CHANGE, null);
	}

	protected void setAfterHiddenInputChange(java.lang.String afterHiddenInputChange) {
		getStateHelper().put(AFTER_HIDDEN_INPUT_CHANGE, afterHiddenInputChange);
	}

	protected java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	protected void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	protected java.lang.String getAfterInputNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INPUT_NAME_CHANGE, null);
	}

	protected void setAfterInputNameChange(java.lang.String afterInputNameChange) {
		getStateHelper().put(AFTER_INPUT_NAME_CHANGE, afterInputNameChange);
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

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterSelectedIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_INDEX_CHANGE, null);
	}

	protected void setAfterSelectedIndexChange(java.lang.String afterSelectedIndexChange) {
		getStateHelper().put(AFTER_SELECTED_INDEX_CHANGE, afterSelectedIndexChange);
	}

	protected java.lang.String getAfterShowTitleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_TITLE_CHANGE, null);
	}

	protected void setAfterShowTitleChange(java.lang.String afterShowTitleChange) {
		getStateHelper().put(AFTER_SHOW_TITLE_CHANGE, afterShowTitleChange);
	}

	protected java.lang.String getAfterSizeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SIZE_CHANGE, null);
	}

	protected void setAfterSizeChange(java.lang.String afterSizeChange) {
		getStateHelper().put(AFTER_SIZE_CHANGE, afterSizeChange);
	}

	protected java.lang.String getAfterTitleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TITLE_CHANGE, null);
	}

	protected void setAfterTitleChange(java.lang.String afterTitleChange) {
		getStateHelper().put(AFTER_TITLE_CHANGE, afterTitleChange);
	}

	protected java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	protected void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	protected java.lang.String getAfterValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_CHANGE, null);
	}

	protected void setAfterValueChange(java.lang.String afterValueChange) {
		getStateHelper().put(AFTER_VALUE_CHANGE, afterValueChange);
	}

	protected java.lang.String getOnCanResetChange() {
		return (java.lang.String) getStateHelper().eval(ON_CAN_RESET_CHANGE, null);
	}

	protected void setOnCanResetChange(java.lang.String onCanResetChange) {
		getStateHelper().put(ON_CAN_RESET_CHANGE, onCanResetChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnCssClassesChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASSES_CHANGE, null);
	}

	protected void setOnCssClassesChange(java.lang.String onCssClassesChange) {
		getStateHelper().put(ON_CSS_CLASSES_CHANGE, onCssClassesChange);
	}

	protected java.lang.String getOnDefaultSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DEFAULT_SELECTED_CHANGE, null);
	}

	protected void setOnDefaultSelectedChange(java.lang.String onDefaultSelectedChange) {
		getStateHelper().put(ON_DEFAULT_SELECTED_CHANGE, onDefaultSelectedChange);
	}

	protected java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	protected void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	protected java.lang.String getOnElementsChange() {
		return (java.lang.String) getStateHelper().eval(ON_ELEMENTS_CHANGE, null);
	}

	protected void setOnElementsChange(java.lang.String onElementsChange) {
		getStateHelper().put(ON_ELEMENTS_CHANGE, onElementsChange);
	}

	protected java.lang.String getOnHiddenInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDDEN_INPUT_CHANGE, null);
	}

	protected void setOnHiddenInputChange(java.lang.String onHiddenInputChange) {
		getStateHelper().put(ON_HIDDEN_INPUT_CHANGE, onHiddenInputChange);
	}

	protected java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	protected void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	protected java.lang.String getOnInputNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_INPUT_NAME_CHANGE, null);
	}

	protected void setOnInputNameChange(java.lang.String onInputNameChange) {
		getStateHelper().put(ON_INPUT_NAME_CHANGE, onInputNameChange);
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

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnSelectedIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_INDEX_CHANGE, null);
	}

	protected void setOnSelectedIndexChange(java.lang.String onSelectedIndexChange) {
		getStateHelper().put(ON_SELECTED_INDEX_CHANGE, onSelectedIndexChange);
	}

	protected java.lang.String getOnShowTitleChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_TITLE_CHANGE, null);
	}

	protected void setOnShowTitleChange(java.lang.String onShowTitleChange) {
		getStateHelper().put(ON_SHOW_TITLE_CHANGE, onShowTitleChange);
	}

	protected java.lang.String getOnSizeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SIZE_CHANGE, null);
	}

	protected void setOnSizeChange(java.lang.String onSizeChange) {
		getStateHelper().put(ON_SIZE_CHANGE, onSizeChange);
	}

	protected java.lang.String getOnTitleChange() {
		return (java.lang.String) getStateHelper().eval(ON_TITLE_CHANGE, null);
	}

	protected void setOnTitleChange(java.lang.String onTitleChange) {
		getStateHelper().put(ON_TITLE_CHANGE, onTitleChange);
	}

	protected java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	protected void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

	protected java.lang.String getOnValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_CHANGE, null);
	}

	protected void setOnValueChange(java.lang.String onValueChange) {
		getStateHelper().put(ON_VALUE_CHANGE, onValueChange);
	}

}