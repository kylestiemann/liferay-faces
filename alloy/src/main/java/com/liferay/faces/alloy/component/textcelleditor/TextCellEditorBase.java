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
package com.liferay.faces.alloy.component.textcelleditor;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TextCellEditorBase extends javax.faces.component.UIPanel {

	public static final String ALIGN = "align";
	public static final String ALIGN_ON = "alignOn";
	public static final String TEXT_CELL_EDITOR_BODY_CONTENT = "bodyContent";
	public static final String BOUNDING_BOX = "boundingBox";
	public static final String CENTERED = "centered";
	public static final String CONSTRAIN = "constrain";
	public static final String CONTENT_BOX = "contentBox";
	public static final String DESTROYED = "destroyed";
	public static final String DISABLED = "disabled";
	public static final String EDITABLE = "editable";
	public static final String ELEMENT_NAME = "elementName";
	public static final String FILL_HEIGHT = "fillHeight";
	public static final String FOCUSED = "focused";
	public static final String FOOTER_CONTENT = "footerContent";
	public static final String HEADER_CONTENT = "headerContent";
	public static final String HEIGHT = "height";
	public static final String HIDE_ON_SAVE = "hideOnSave";
	public static final String TEXT_CELL_EDITOR_ID = "id";
	public static final String INITIALIZED = "initialized";
	public static final String INPUT_FORMATTER = "inputFormatter";
	public static final String TEXT_CELL_EDITOR_LOCALE = "locale";
	public static final String OUTPUT_FORMATTER = "outputFormatter";
	public static final String PREVENT_OVERLAP = "preventOverlap";
	public static final String RENDER = "render";
	public static final String RENDERED = "rendered";
	public static final String SHIM = "shim";
	public static final String SHOW_TOOLBAR = "showToolbar";
	public static final String SRC_NODE = "srcNode";
	public static final String STRINGS = "strings";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TOOLBAR = "toolbar";
	public static final String UNESCAPE_VALUE = "unescapeValue";
	public static final String VALIDATOR = "validator";
	public static final String TEXT_CELL_EDITOR_VALUE = "value";
	public static final String VISIBLE = "visible";
	public static final String WIDTH = "width";
	public static final String X = "x";
	public static final String XY = "xy";
	public static final String Y = "y";
	public static final String Z_INDEX = "zIndex";
	public static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	public static final String AFTER_ALIGN_ON_CHANGE = "afterAlignOnChange";
	public static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CENTERED_CHANGE = "afterCenteredChange";
	public static final String AFTER_CONSTRAIN_CHANGE = "afterConstrainChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_EDITABLE_CHANGE = "afterEditableChange";
	public static final String AFTER_ELEMENT_NAME_CHANGE = "afterElementNameChange";
	public static final String AFTER_FILL_HEIGHT_CHANGE = "afterFillHeightChange";
	public static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	public static final String AFTER_FOOTER_CONTENT_CHANGE = "afterFooterContentChange";
	public static final String AFTER_HEADER_CONTENT_CHANGE = "afterHeaderContentChange";
	public static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	public static final String AFTER_HIDE_ON_SAVE_CHANGE = "afterHideOnSaveChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_INPUT_FORMATTER_CHANGE = "afterInputFormatterChange";
	public static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	public static final String AFTER_OUTPUT_FORMATTER_CHANGE = "afterOutputFormatterChange";
	public static final String AFTER_PREVENT_OVERLAP_CHANGE = "afterPreventOverlapChange";
	public static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_SHIM_CHANGE = "afterShimChange";
	public static final String AFTER_SHOW_TOOLBAR_CHANGE = "afterShowToolbarChange";
	public static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TOOLBAR_CHANGE = "afterToolbarChange";
	public static final String AFTER_UNESCAPE_VALUE_CHANGE = "afterUnescapeValueChange";
	public static final String AFTER_VALIDATOR_CHANGE = "afterValidatorChange";
	public static final String AFTER_VALUE_CHANGE = "afterValueChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	public static final String AFTER_XCHANGE = "afterXChange";
	public static final String AFTER_XY_CHANGE = "afterXyChange";
	public static final String AFTER_YCHANGE = "afterYChange";
	public static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	public static final String ON_ALIGN_CHANGE = "onAlignChange";
	public static final String ON_ALIGN_ON_CHANGE = "onAlignOnChange";
	public static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CENTERED_CHANGE = "onCenteredChange";
	public static final String ON_CONSTRAIN_CHANGE = "onConstrainChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_EDITABLE_CHANGE = "onEditableChange";
	public static final String ON_ELEMENT_NAME_CHANGE = "onElementNameChange";
	public static final String ON_FILL_HEIGHT_CHANGE = "onFillHeightChange";
	public static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	public static final String ON_FOOTER_CONTENT_CHANGE = "onFooterContentChange";
	public static final String ON_HEADER_CONTENT_CHANGE = "onHeaderContentChange";
	public static final String ON_HEIGHT_CHANGE = "onHeightChange";
	public static final String ON_HIDE_ON_SAVE_CHANGE = "onHideOnSaveChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_INPUT_FORMATTER_CHANGE = "onInputFormatterChange";
	public static final String ON_LOCALE_CHANGE = "onLocaleChange";
	public static final String ON_OUTPUT_FORMATTER_CHANGE = "onOutputFormatterChange";
	public static final String ON_PREVENT_OVERLAP_CHANGE = "onPreventOverlapChange";
	public static final String ON_RENDER_CHANGE = "onRenderChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_SHIM_CHANGE = "onShimChange";
	public static final String ON_SHOW_TOOLBAR_CHANGE = "onShowToolbarChange";
	public static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TOOLBAR_CHANGE = "onToolbarChange";
	public static final String ON_UNESCAPE_VALUE_CHANGE = "onUnescapeValueChange";
	public static final String ON_VALIDATOR_CHANGE = "onValidatorChange";
	public static final String ON_VALUE_CHANGE = "onValueChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	public static final String ON_WIDTH_CHANGE = "onWidthChange";
	public static final String ON_XCHANGE = "onXChange";
	public static final String ON_XY_CHANGE = "onXyChange";
	public static final String ON_YCHANGE = "onYChange";
	public static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	public java.lang.Object getAlign() {
		return (java.lang.Object) getStateHelper().eval(ALIGN, null);
	}

	public void setAlign(java.lang.Object align) {
		getStateHelper().put(ALIGN, align);
	}

	public java.lang.Object getAlignOn() {
		return (java.lang.Object) getStateHelper().eval(ALIGN_ON, null);
	}

	public void setAlignOn(java.lang.Object alignOn) {
		getStateHelper().put(ALIGN_ON, alignOn);
	}

	public java.lang.Object getTextCellEditorBodyContent() {
		return (java.lang.Object) getStateHelper().eval(TEXT_CELL_EDITOR_BODY_CONTENT, null);
	}

	public void setTextCellEditorBodyContent(java.lang.Object textCellEditorBodyContent) {
		getStateHelper().put(TEXT_CELL_EDITOR_BODY_CONTENT, textCellEditorBodyContent);
	}

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.Object getCentered() {
		return (java.lang.Object) getStateHelper().eval(CENTERED, null);
	}

	public void setCentered(java.lang.Object centered) {
		getStateHelper().put(CENTERED, centered);
	}

	public java.lang.Object getConstrain() {
		return (java.lang.Object) getStateHelper().eval(CONSTRAIN, null);
	}

	public void setConstrain(java.lang.Object constrain) {
		getStateHelper().put(CONSTRAIN, constrain);
	}

	public java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	public void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
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

	public java.lang.Boolean getEditable() {
		return (java.lang.Boolean) getStateHelper().eval(EDITABLE, null);
	}

	public void setEditable(java.lang.Boolean editable) {
		getStateHelper().put(EDITABLE, editable);
	}

	public java.lang.String getElementName() {
		return (java.lang.String) getStateHelper().eval(ELEMENT_NAME, null);
	}

	public void setElementName(java.lang.String elementName) {
		getStateHelper().put(ELEMENT_NAME, elementName);
	}

	public java.lang.Object getFillHeight() {
		return (java.lang.Object) getStateHelper().eval(FILL_HEIGHT, null);
	}

	public void setFillHeight(java.lang.Object fillHeight) {
		getStateHelper().put(FILL_HEIGHT, fillHeight);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.String getFooterContent() {
		return (java.lang.String) getStateHelper().eval(FOOTER_CONTENT, null);
	}

	public void setFooterContent(java.lang.String footerContent) {
		getStateHelper().put(FOOTER_CONTENT, footerContent);
	}

	public java.lang.Object getHeaderContent() {
		return (java.lang.Object) getStateHelper().eval(HEADER_CONTENT, null);
	}

	public void setHeaderContent(java.lang.Object headerContent) {
		getStateHelper().put(HEADER_CONTENT, headerContent);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	public void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	public java.lang.Boolean getHideOnSave() {
		return (java.lang.Boolean) getStateHelper().eval(HIDE_ON_SAVE, null);
	}

	public void setHideOnSave(java.lang.Boolean hideOnSave) {
		getStateHelper().put(HIDE_ON_SAVE, hideOnSave);
	}

	public java.lang.String getTextCellEditorId() {
		return (java.lang.String) getStateHelper().eval(TEXT_CELL_EDITOR_ID, null);
	}

	public void setTextCellEditorId(java.lang.String textCellEditorId) {
		getStateHelper().put(TEXT_CELL_EDITOR_ID, textCellEditorId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Object getInputFormatter() {
		return (java.lang.Object) getStateHelper().eval(INPUT_FORMATTER, null);
	}

	public void setInputFormatter(java.lang.Object inputFormatter) {
		getStateHelper().put(INPUT_FORMATTER, inputFormatter);
	}

	public java.lang.String getTextCellEditorLocale() {
		return (java.lang.String) getStateHelper().eval(TEXT_CELL_EDITOR_LOCALE, null);
	}

	public void setTextCellEditorLocale(java.lang.String textCellEditorLocale) {
		getStateHelper().put(TEXT_CELL_EDITOR_LOCALE, textCellEditorLocale);
	}

	public java.lang.Object getOutputFormatter() {
		return (java.lang.Object) getStateHelper().eval(OUTPUT_FORMATTER, null);
	}

	public void setOutputFormatter(java.lang.Object outputFormatter) {
		getStateHelper().put(OUTPUT_FORMATTER, outputFormatter);
	}

	public java.lang.Boolean getPreventOverlap() {
		return (java.lang.Boolean) getStateHelper().eval(PREVENT_OVERLAP, null);
	}

	public void setPreventOverlap(java.lang.Boolean preventOverlap) {
		getStateHelper().put(PREVENT_OVERLAP, preventOverlap);
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

	public java.lang.Boolean getShim() {
		return (java.lang.Boolean) getStateHelper().eval(SHIM, null);
	}

	public void setShim(java.lang.Boolean shim) {
		getStateHelper().put(SHIM, shim);
	}

	public java.lang.Boolean getShowToolbar() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_TOOLBAR, null);
	}

	public void setShowToolbar(java.lang.Boolean showToolbar) {
		getStateHelper().put(SHOW_TOOLBAR, showToolbar);
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

	public java.lang.Object getToolbar() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR, null);
	}

	public void setToolbar(java.lang.Object toolbar) {
		getStateHelper().put(TOOLBAR, toolbar);
	}

	public java.lang.Boolean getUnescapeValue() {
		return (java.lang.Boolean) getStateHelper().eval(UNESCAPE_VALUE, null);
	}

	public void setUnescapeValue(java.lang.Boolean unescapeValue) {
		getStateHelper().put(UNESCAPE_VALUE, unescapeValue);
	}

	public java.lang.Object getValidator() {
		return (java.lang.Object) getStateHelper().eval(VALIDATOR, null);
	}

	public void setValidator(java.lang.Object validator) {
		getStateHelper().put(VALIDATOR, validator);
	}

	public java.lang.String getTextCellEditorValue() {
		return (java.lang.String) getStateHelper().eval(TEXT_CELL_EDITOR_VALUE, null);
	}

	public void setTextCellEditorValue(java.lang.String textCellEditorValue) {
		getStateHelper().put(TEXT_CELL_EDITOR_VALUE, textCellEditorValue);
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

	public java.lang.Object getX() {
		return (java.lang.Object) getStateHelper().eval(X, null);
	}

	public void setX(java.lang.Object x) {
		getStateHelper().put(X, x);
	}

	public java.lang.Object getXy() {
		return (java.lang.Object) getStateHelper().eval(XY, null);
	}

	public void setXy(java.lang.Object xy) {
		getStateHelper().put(XY, xy);
	}

	public java.lang.Object getY() {
		return (java.lang.Object) getStateHelper().eval(Y, null);
	}

	public void setY(java.lang.Object y) {
		getStateHelper().put(Y, y);
	}

	public java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	public void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	public java.lang.String getAfterAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_CHANGE, null);
	}

	public void setAfterAlignChange(java.lang.String afterAlignChange) {
		getStateHelper().put(AFTER_ALIGN_CHANGE, afterAlignChange);
	}

	public java.lang.String getAfterAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_ON_CHANGE, null);
	}

	public void setAfterAlignOnChange(java.lang.String afterAlignOnChange) {
		getStateHelper().put(AFTER_ALIGN_ON_CHANGE, afterAlignOnChange);
	}

	public java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	public void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterCenteredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CENTERED_CHANGE, null);
	}

	public void setAfterCenteredChange(java.lang.String afterCenteredChange) {
		getStateHelper().put(AFTER_CENTERED_CHANGE, afterCenteredChange);
	}

	public java.lang.String getAfterConstrainChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONSTRAIN_CHANGE, null);
	}

	public void setAfterConstrainChange(java.lang.String afterConstrainChange) {
		getStateHelper().put(AFTER_CONSTRAIN_CHANGE, afterConstrainChange);
	}

	public java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
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

	public java.lang.String getAfterEditableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EDITABLE_CHANGE, null);
	}

	public void setAfterEditableChange(java.lang.String afterEditableChange) {
		getStateHelper().put(AFTER_EDITABLE_CHANGE, afterEditableChange);
	}

	public java.lang.String getAfterElementNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ELEMENT_NAME_CHANGE, null);
	}

	public void setAfterElementNameChange(java.lang.String afterElementNameChange) {
		getStateHelper().put(AFTER_ELEMENT_NAME_CHANGE, afterElementNameChange);
	}

	public java.lang.String getAfterFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILL_HEIGHT_CHANGE, null);
	}

	public void setAfterFillHeightChange(java.lang.String afterFillHeightChange) {
		getStateHelper().put(AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOOTER_CONTENT_CHANGE, null);
	}

	public void setAfterFooterContentChange(java.lang.String afterFooterContentChange) {
		getStateHelper().put(AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange);
	}

	public java.lang.String getAfterHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_CONTENT_CHANGE, null);
	}

	public void setAfterHeaderContentChange(java.lang.String afterHeaderContentChange) {
		getStateHelper().put(AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange);
	}

	public java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	public java.lang.String getAfterHideOnSaveChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_ON_SAVE_CHANGE, null);
	}

	public void setAfterHideOnSaveChange(java.lang.String afterHideOnSaveChange) {
		getStateHelper().put(AFTER_HIDE_ON_SAVE_CHANGE, afterHideOnSaveChange);
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

	public java.lang.String getAfterInputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INPUT_FORMATTER_CHANGE, null);
	}

	public void setAfterInputFormatterChange(java.lang.String afterInputFormatterChange) {
		getStateHelper().put(AFTER_INPUT_FORMATTER_CHANGE, afterInputFormatterChange);
	}

	public java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	public void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	public java.lang.String getAfterOutputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OUTPUT_FORMATTER_CHANGE, null);
	}

	public void setAfterOutputFormatterChange(java.lang.String afterOutputFormatterChange) {
		getStateHelper().put(AFTER_OUTPUT_FORMATTER_CHANGE, afterOutputFormatterChange);
	}

	public java.lang.String getAfterPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREVENT_OVERLAP_CHANGE, null);
	}

	public void setAfterPreventOverlapChange(java.lang.String afterPreventOverlapChange) {
		getStateHelper().put(AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange);
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

	public java.lang.String getAfterShimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHIM_CHANGE, null);
	}

	public void setAfterShimChange(java.lang.String afterShimChange) {
		getStateHelper().put(AFTER_SHIM_CHANGE, afterShimChange);
	}

	public java.lang.String getAfterShowToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_TOOLBAR_CHANGE, null);
	}

	public void setAfterShowToolbarChange(java.lang.String afterShowToolbarChange) {
		getStateHelper().put(AFTER_SHOW_TOOLBAR_CHANGE, afterShowToolbarChange);
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

	public java.lang.String getAfterToolbarChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_CHANGE, null);
	}

	public void setAfterToolbarChange(java.lang.String afterToolbarChange) {
		getStateHelper().put(AFTER_TOOLBAR_CHANGE, afterToolbarChange);
	}

	public java.lang.String getAfterUnescapeValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_UNESCAPE_VALUE_CHANGE, null);
	}

	public void setAfterUnescapeValueChange(java.lang.String afterUnescapeValueChange) {
		getStateHelper().put(AFTER_UNESCAPE_VALUE_CHANGE, afterUnescapeValueChange);
	}

	public java.lang.String getAfterValidatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALIDATOR_CHANGE, null);
	}

	public void setAfterValidatorChange(java.lang.String afterValidatorChange) {
		getStateHelper().put(AFTER_VALIDATOR_CHANGE, afterValidatorChange);
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

	public java.lang.String getAfterXChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XCHANGE, null);
	}

	public void setAfterXChange(java.lang.String afterXChange) {
		getStateHelper().put(AFTER_XCHANGE, afterXChange);
	}

	public java.lang.String getAfterXyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XY_CHANGE, null);
	}

	public void setAfterXyChange(java.lang.String afterXyChange) {
		getStateHelper().put(AFTER_XY_CHANGE, afterXyChange);
	}

	public java.lang.String getAfterYChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YCHANGE, null);
	}

	public void setAfterYChange(java.lang.String afterYChange) {
		getStateHelper().put(AFTER_YCHANGE, afterYChange);
	}

	public java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	public void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	public java.lang.String getOnAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_CHANGE, null);
	}

	public void setOnAlignChange(java.lang.String onAlignChange) {
		getStateHelper().put(ON_ALIGN_CHANGE, onAlignChange);
	}

	public java.lang.String getOnAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_ON_CHANGE, null);
	}

	public void setOnAlignOnChange(java.lang.String onAlignOnChange) {
		getStateHelper().put(ON_ALIGN_ON_CHANGE, onAlignOnChange);
	}

	public java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	public void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnCenteredChange() {
		return (java.lang.String) getStateHelper().eval(ON_CENTERED_CHANGE, null);
	}

	public void setOnCenteredChange(java.lang.String onCenteredChange) {
		getStateHelper().put(ON_CENTERED_CHANGE, onCenteredChange);
	}

	public java.lang.String getOnConstrainChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONSTRAIN_CHANGE, null);
	}

	public void setOnConstrainChange(java.lang.String onConstrainChange) {
		getStateHelper().put(ON_CONSTRAIN_CHANGE, onConstrainChange);
	}

	public java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
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

	public java.lang.String getOnEditableChange() {
		return (java.lang.String) getStateHelper().eval(ON_EDITABLE_CHANGE, null);
	}

	public void setOnEditableChange(java.lang.String onEditableChange) {
		getStateHelper().put(ON_EDITABLE_CHANGE, onEditableChange);
	}

	public java.lang.String getOnElementNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_ELEMENT_NAME_CHANGE, null);
	}

	public void setOnElementNameChange(java.lang.String onElementNameChange) {
		getStateHelper().put(ON_ELEMENT_NAME_CHANGE, onElementNameChange);
	}

	public java.lang.String getOnFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILL_HEIGHT_CHANGE, null);
	}

	public void setOnFillHeightChange(java.lang.String onFillHeightChange) {
		getStateHelper().put(ON_FILL_HEIGHT_CHANGE, onFillHeightChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOOTER_CONTENT_CHANGE, null);
	}

	public void setOnFooterContentChange(java.lang.String onFooterContentChange) {
		getStateHelper().put(ON_FOOTER_CONTENT_CHANGE, onFooterContentChange);
	}

	public java.lang.String getOnHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_CONTENT_CHANGE, null);
	}

	public void setOnHeaderContentChange(java.lang.String onHeaderContentChange) {
		getStateHelper().put(ON_HEADER_CONTENT_CHANGE, onHeaderContentChange);
	}

	public java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	public java.lang.String getOnHideOnSaveChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_ON_SAVE_CHANGE, null);
	}

	public void setOnHideOnSaveChange(java.lang.String onHideOnSaveChange) {
		getStateHelper().put(ON_HIDE_ON_SAVE_CHANGE, onHideOnSaveChange);
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

	public java.lang.String getOnInputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_INPUT_FORMATTER_CHANGE, null);
	}

	public void setOnInputFormatterChange(java.lang.String onInputFormatterChange) {
		getStateHelper().put(ON_INPUT_FORMATTER_CHANGE, onInputFormatterChange);
	}

	public java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	public void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	public java.lang.String getOnOutputFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_OUTPUT_FORMATTER_CHANGE, null);
	}

	public void setOnOutputFormatterChange(java.lang.String onOutputFormatterChange) {
		getStateHelper().put(ON_OUTPUT_FORMATTER_CHANGE, onOutputFormatterChange);
	}

	public java.lang.String getOnPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREVENT_OVERLAP_CHANGE, null);
	}

	public void setOnPreventOverlapChange(java.lang.String onPreventOverlapChange) {
		getStateHelper().put(ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange);
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

	public java.lang.String getOnShimChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHIM_CHANGE, null);
	}

	public void setOnShimChange(java.lang.String onShimChange) {
		getStateHelper().put(ON_SHIM_CHANGE, onShimChange);
	}

	public java.lang.String getOnShowToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_TOOLBAR_CHANGE, null);
	}

	public void setOnShowToolbarChange(java.lang.String onShowToolbarChange) {
		getStateHelper().put(ON_SHOW_TOOLBAR_CHANGE, onShowToolbarChange);
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

	public java.lang.String getOnToolbarChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_CHANGE, null);
	}

	public void setOnToolbarChange(java.lang.String onToolbarChange) {
		getStateHelper().put(ON_TOOLBAR_CHANGE, onToolbarChange);
	}

	public java.lang.String getOnUnescapeValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_UNESCAPE_VALUE_CHANGE, null);
	}

	public void setOnUnescapeValueChange(java.lang.String onUnescapeValueChange) {
		getStateHelper().put(ON_UNESCAPE_VALUE_CHANGE, onUnescapeValueChange);
	}

	public java.lang.String getOnValidatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALIDATOR_CHANGE, null);
	}

	public void setOnValidatorChange(java.lang.String onValidatorChange) {
		getStateHelper().put(ON_VALIDATOR_CHANGE, onValidatorChange);
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

	public java.lang.String getOnXChange() {
		return (java.lang.String) getStateHelper().eval(ON_XCHANGE, null);
	}

	public void setOnXChange(java.lang.String onXChange) {
		getStateHelper().put(ON_XCHANGE, onXChange);
	}

	public java.lang.String getOnXyChange() {
		return (java.lang.String) getStateHelper().eval(ON_XY_CHANGE, null);
	}

	public void setOnXyChange(java.lang.String onXyChange) {
		getStateHelper().put(ON_XY_CHANGE, onXyChange);
	}

	public java.lang.String getOnYChange() {
		return (java.lang.String) getStateHelper().eval(ON_YCHANGE, null);
	}

	public void setOnYChange(java.lang.String onYChange) {
		getStateHelper().put(ON_YCHANGE, onYChange);
	}

	public java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	public void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}