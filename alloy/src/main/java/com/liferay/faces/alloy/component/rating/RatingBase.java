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
package com.liferay.faces.alloy.component.rating;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class RatingBase extends javax.faces.component.UIPanel {

	public static final String BOUNDING_BOX = "boundingBox";
	public static final String CAN_RESET = "canReset";
	public static final String CONTENT_BOX = "contentBox";
	public static final String CSS_CLASS = "cssClass";
	public static final String CSS_CLASSES = "cssClasses";
	public static final String DEFAULT_SELECTED = "defaultSelected";
	public static final String DESTROYED = "destroyed";
	public static final String DISABLED = "disabled";
	public static final String ELEMENTS = "elements";
	public static final String FOCUSED = "focused";
	public static final String HEIGHT = "height";
	public static final String HIDDEN_INPUT = "hiddenInput";
	public static final String HIDE_CLASS = "hideClass";
	public static final String RATING_ID = "id";
	public static final String INITIALIZED = "initialized";
	public static final String INPUT_NAME = "inputName";
	public static final String LABEL = "label";
	public static final String LABEL_NODE = "labelNode";
	public static final String RATING_LOCALE = "locale";
	public static final String RENDER = "render";
	public static final String RENDERED = "rendered";
	public static final String SELECTED_INDEX = "selectedIndex";
	public static final String SHOW_TITLE = "showTitle";
	public static final String SIZE = "size";
	public static final String SRC_NODE = "srcNode";
	public static final String STRINGS = "strings";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TITLE = "title";
	public static final String USE_ARIA = "useARIA";
	public static final String RATING_VALUE = "value";
	public static final String VISIBLE = "visible";
	public static final String WIDTH = "width";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CAN_RESET_CHANGE = "afterCanResetChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	public static final String AFTER_CSS_CLASSES_CHANGE = "afterCssClassesChange";
	public static final String AFTER_DEFAULT_SELECTED_CHANGE = "afterDefaultSelectedChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_ELEMENTS_CHANGE = "afterElementsChange";
	public static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	public static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	public static final String AFTER_HIDDEN_INPUT_CHANGE = "afterHiddenInputChange";
	public static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_INPUT_NAME_CHANGE = "afterInputNameChange";
	public static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	public static final String AFTER_LABEL_NODE_CHANGE = "afterLabelNodeChange";
	public static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	public static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_SELECTED_INDEX_CHANGE = "afterSelectedIndexChange";
	public static final String AFTER_SHOW_TITLE_CHANGE = "afterShowTitleChange";
	public static final String AFTER_SIZE_CHANGE = "afterSizeChange";
	public static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TITLE_CHANGE = "afterTitleChange";
	public static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	public static final String AFTER_VALUE_CHANGE = "afterValueChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CAN_RESET_CHANGE = "onCanResetChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	public static final String ON_CSS_CLASSES_CHANGE = "onCssClassesChange";
	public static final String ON_DEFAULT_SELECTED_CHANGE = "onDefaultSelectedChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_ELEMENTS_CHANGE = "onElementsChange";
	public static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	public static final String ON_HEIGHT_CHANGE = "onHeightChange";
	public static final String ON_HIDDEN_INPUT_CHANGE = "onHiddenInputChange";
	public static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_INPUT_NAME_CHANGE = "onInputNameChange";
	public static final String ON_LABEL_CHANGE = "onLabelChange";
	public static final String ON_LABEL_NODE_CHANGE = "onLabelNodeChange";
	public static final String ON_LOCALE_CHANGE = "onLocaleChange";
	public static final String ON_RENDER_CHANGE = "onRenderChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_SELECTED_INDEX_CHANGE = "onSelectedIndexChange";
	public static final String ON_SHOW_TITLE_CHANGE = "onShowTitleChange";
	public static final String ON_SIZE_CHANGE = "onSizeChange";
	public static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TITLE_CHANGE = "onTitleChange";
	public static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	public static final String ON_VALUE_CHANGE = "onValueChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	public static final String ON_WIDTH_CHANGE = "onWidthChange";

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.Boolean getCanReset() {
		return (java.lang.Boolean) getStateHelper().eval(CAN_RESET, null);
	}

	public void setCanReset(java.lang.Boolean canReset) {
		getStateHelper().put(CAN_RESET, canReset);
	}

	public java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	public void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	public java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	public void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	public java.lang.Object getCssClasses() {
		return (java.lang.Object) getStateHelper().eval(CSS_CLASSES, null);
	}

	public void setCssClasses(java.lang.Object cssClasses) {
		getStateHelper().put(CSS_CLASSES, cssClasses);
	}

	public java.lang.Object getDefaultSelected() {
		return (java.lang.Object) getStateHelper().eval(DEFAULT_SELECTED, null);
	}

	public void setDefaultSelected(java.lang.Object defaultSelected) {
		getStateHelper().put(DEFAULT_SELECTED, defaultSelected);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	public void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	public java.lang.Object getElements() {
		return (java.lang.Object) getStateHelper().eval(ELEMENTS, null);
	}

	public void setElements(java.lang.Object elements) {
		getStateHelper().put(ELEMENTS, elements);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	public void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	public java.lang.Object getHiddenInput() {
		return (java.lang.Object) getStateHelper().eval(HIDDEN_INPUT, null);
	}

	public void setHiddenInput(java.lang.Object hiddenInput) {
		getStateHelper().put(HIDDEN_INPUT, hiddenInput);
	}

	public java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	public void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	public java.lang.String getRatingId() {
		return (java.lang.String) getStateHelper().eval(RATING_ID, null);
	}

	public void setRatingId(java.lang.String ratingId) {
		getStateHelper().put(RATING_ID, ratingId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getInputName() {
		return (java.lang.String) getStateHelper().eval(INPUT_NAME, null);
	}

	public void setInputName(java.lang.String inputName) {
		getStateHelper().put(INPUT_NAME, inputName);
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

	public java.lang.String getRatingLocale() {
		return (java.lang.String) getStateHelper().eval(RATING_LOCALE, null);
	}

	public void setRatingLocale(java.lang.String ratingLocale) {
		getStateHelper().put(RATING_LOCALE, ratingLocale);
	}

	public java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	public void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	public java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	public void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	public java.lang.Object getSelectedIndex() {
		return (java.lang.Object) getStateHelper().eval(SELECTED_INDEX, null);
	}

	public void setSelectedIndex(java.lang.Object selectedIndex) {
		getStateHelper().put(SELECTED_INDEX, selectedIndex);
	}

	public java.lang.Boolean getShowTitle() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_TITLE, null);
	}

	public void setShowTitle(java.lang.Boolean showTitle) {
		getStateHelper().put(SHOW_TITLE, showTitle);
	}

	public java.lang.Object getSize() {
		return (java.lang.Object) getStateHelper().eval(SIZE, null);
	}

	public void setSize(java.lang.Object size) {
		getStateHelper().put(SIZE, size);
	}

	public java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	public void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
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

	public java.lang.String getTitle() {
		return (java.lang.String) getStateHelper().eval(TITLE, null);
	}

	public void setTitle(java.lang.String title) {
		getStateHelper().put(TITLE, title);
	}

	public java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	public void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	public java.lang.String getRatingValue() {
		return (java.lang.String) getStateHelper().eval(RATING_VALUE, null);
	}

	public void setRatingValue(java.lang.String ratingValue) {
		getStateHelper().put(RATING_VALUE, ratingValue);
	}

	public java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	public void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	public java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	public void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterCanResetChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CAN_RESET_CHANGE, null);
	}

	public void setAfterCanResetChange(java.lang.String afterCanResetChange) {
		getStateHelper().put(AFTER_CAN_RESET_CHANGE, afterCanResetChange);
	}

	public java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	public java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	public void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	public java.lang.String getAfterCssClassesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASSES_CHANGE, null);
	}

	public void setAfterCssClassesChange(java.lang.String afterCssClassesChange) {
		getStateHelper().put(AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange);
	}

	public java.lang.String getAfterDefaultSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DEFAULT_SELECTED_CHANGE, null);
	}

	public void setAfterDefaultSelectedChange(java.lang.String afterDefaultSelectedChange) {
		getStateHelper().put(AFTER_DEFAULT_SELECTED_CHANGE, afterDefaultSelectedChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	public java.lang.String getAfterElementsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ELEMENTS_CHANGE, null);
	}

	public void setAfterElementsChange(java.lang.String afterElementsChange) {
		getStateHelper().put(AFTER_ELEMENTS_CHANGE, afterElementsChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	public java.lang.String getAfterHiddenInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDDEN_INPUT_CHANGE, null);
	}

	public void setAfterHiddenInputChange(java.lang.String afterHiddenInputChange) {
		getStateHelper().put(AFTER_HIDDEN_INPUT_CHANGE, afterHiddenInputChange);
	}

	public java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	public void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
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

	public java.lang.String getAfterInputNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INPUT_NAME_CHANGE, null);
	}

	public void setAfterInputNameChange(java.lang.String afterInputNameChange) {
		getStateHelper().put(AFTER_INPUT_NAME_CHANGE, afterInputNameChange);
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

	public java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	public void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	public java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	public void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	public java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	public void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	public java.lang.String getAfterSelectedIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_INDEX_CHANGE, null);
	}

	public void setAfterSelectedIndexChange(java.lang.String afterSelectedIndexChange) {
		getStateHelper().put(AFTER_SELECTED_INDEX_CHANGE, afterSelectedIndexChange);
	}

	public java.lang.String getAfterShowTitleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_TITLE_CHANGE, null);
	}

	public void setAfterShowTitleChange(java.lang.String afterShowTitleChange) {
		getStateHelper().put(AFTER_SHOW_TITLE_CHANGE, afterShowTitleChange);
	}

	public java.lang.String getAfterSizeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SIZE_CHANGE, null);
	}

	public void setAfterSizeChange(java.lang.String afterSizeChange) {
		getStateHelper().put(AFTER_SIZE_CHANGE, afterSizeChange);
	}

	public java.lang.String getAfterSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SRC_NODE_CHANGE, null);
	}

	public void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		getStateHelper().put(AFTER_SRC_NODE_CHANGE, afterSrcNodeChange);
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

	public java.lang.String getAfterTitleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TITLE_CHANGE, null);
	}

	public void setAfterTitleChange(java.lang.String afterTitleChange) {
		getStateHelper().put(AFTER_TITLE_CHANGE, afterTitleChange);
	}

	public java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	public void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	public java.lang.String getAfterValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_CHANGE, null);
	}

	public void setAfterValueChange(java.lang.String afterValueChange) {
		getStateHelper().put(AFTER_VALUE_CHANGE, afterValueChange);
	}

	public java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	public java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	public void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnCanResetChange() {
		return (java.lang.String) getStateHelper().eval(ON_CAN_RESET_CHANGE, null);
	}

	public void setOnCanResetChange(java.lang.String onCanResetChange) {
		getStateHelper().put(ON_CAN_RESET_CHANGE, onCanResetChange);
	}

	public java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	public java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	public void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	public java.lang.String getOnCssClassesChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASSES_CHANGE, null);
	}

	public void setOnCssClassesChange(java.lang.String onCssClassesChange) {
		getStateHelper().put(ON_CSS_CLASSES_CHANGE, onCssClassesChange);
	}

	public java.lang.String getOnDefaultSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DEFAULT_SELECTED_CHANGE, null);
	}

	public void setOnDefaultSelectedChange(java.lang.String onDefaultSelectedChange) {
		getStateHelper().put(ON_DEFAULT_SELECTED_CHANGE, onDefaultSelectedChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	public java.lang.String getOnElementsChange() {
		return (java.lang.String) getStateHelper().eval(ON_ELEMENTS_CHANGE, null);
	}

	public void setOnElementsChange(java.lang.String onElementsChange) {
		getStateHelper().put(ON_ELEMENTS_CHANGE, onElementsChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	public java.lang.String getOnHiddenInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDDEN_INPUT_CHANGE, null);
	}

	public void setOnHiddenInputChange(java.lang.String onHiddenInputChange) {
		getStateHelper().put(ON_HIDDEN_INPUT_CHANGE, onHiddenInputChange);
	}

	public java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	public void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
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

	public java.lang.String getOnInputNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_INPUT_NAME_CHANGE, null);
	}

	public void setOnInputNameChange(java.lang.String onInputNameChange) {
		getStateHelper().put(ON_INPUT_NAME_CHANGE, onInputNameChange);
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

	public java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	public void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	public java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	public void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	public java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	public void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	public java.lang.String getOnSelectedIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_INDEX_CHANGE, null);
	}

	public void setOnSelectedIndexChange(java.lang.String onSelectedIndexChange) {
		getStateHelper().put(ON_SELECTED_INDEX_CHANGE, onSelectedIndexChange);
	}

	public java.lang.String getOnShowTitleChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_TITLE_CHANGE, null);
	}

	public void setOnShowTitleChange(java.lang.String onShowTitleChange) {
		getStateHelper().put(ON_SHOW_TITLE_CHANGE, onShowTitleChange);
	}

	public java.lang.String getOnSizeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SIZE_CHANGE, null);
	}

	public void setOnSizeChange(java.lang.String onSizeChange) {
		getStateHelper().put(ON_SIZE_CHANGE, onSizeChange);
	}

	public java.lang.String getOnSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SRC_NODE_CHANGE, null);
	}

	public void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		getStateHelper().put(ON_SRC_NODE_CHANGE, onSrcNodeChange);
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

	public java.lang.String getOnTitleChange() {
		return (java.lang.String) getStateHelper().eval(ON_TITLE_CHANGE, null);
	}

	public void setOnTitleChange(java.lang.String onTitleChange) {
		getStateHelper().put(ON_TITLE_CHANGE, onTitleChange);
	}

	public java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	public void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

	public java.lang.String getOnValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_CHANGE, null);
	}

	public void setOnValueChange(java.lang.String onValueChange) {
		getStateHelper().put(ON_VALUE_CHANGE, onValueChange);
	}

	public java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

	public java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	public void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

}