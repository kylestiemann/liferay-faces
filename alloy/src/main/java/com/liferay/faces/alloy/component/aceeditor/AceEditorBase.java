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
package com.liferay.faces.alloy.component.aceeditor;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class AceEditorBase extends javax.faces.component.UIPanel {

	public static final String BOUNDING_BOX = "boundingBox";
	public static final String CONTENT_BOX = "contentBox";
	public static final String DESTROYED = "destroyed";
	public static final String DISABLED = "disabled";
	public static final String FOCUSED = "focused";
	public static final String HEIGHT = "height";
	public static final String HIGHLIGHT_ACTIVE_LINE = "highlightActiveLine";
	public static final String ACE_EDITOR_ID = "id";
	public static final String INITIALIZED = "initialized";
	public static final String ACE_EDITOR_LOCALE = "locale";
	public static final String MODE = "mode";
	public static final String READ_ONLY = "readOnly";
	public static final String RENDER = "render";
	public static final String RENDERED = "rendered";
	public static final String SHOW_PRINT_MARGIN = "showPrintMargin";
	public static final String SRC_NODE = "srcNode";
	public static final String STRINGS = "strings";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TAB_SIZE = "tabSize";
	public static final String USE_SOFT_TABS = "useSoftTabs";
	public static final String USE_WRAP_MODE = "useWrapMode";
	public static final String ACE_EDITOR_VALUE = "value";
	public static final String VISIBLE = "visible";
	public static final String WIDTH = "width";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	public static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	public static final String AFTER_HIGHLIGHT_ACTIVE_LINE_CHANGE = "afterHighlightActiveLineChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	public static final String AFTER_MODE_CHANGE = "afterModeChange";
	public static final String AFTER_READ_ONLY_CHANGE = "afterReadOnlyChange";
	public static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_SHOW_PRINT_MARGIN_CHANGE = "afterShowPrintMarginChange";
	public static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TAB_SIZE_CHANGE = "afterTabSizeChange";
	public static final String AFTER_USE_SOFT_TABS_CHANGE = "afterUseSoftTabsChange";
	public static final String AFTER_USE_WRAP_MODE_CHANGE = "afterUseWrapModeChange";
	public static final String AFTER_VALUE_CHANGE = "afterValueChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	public static final String ON_HEIGHT_CHANGE = "onHeightChange";
	public static final String ON_HIGHLIGHT_ACTIVE_LINE_CHANGE = "onHighlightActiveLineChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LOCALE_CHANGE = "onLocaleChange";
	public static final String ON_MODE_CHANGE = "onModeChange";
	public static final String ON_READ_ONLY_CHANGE = "onReadOnlyChange";
	public static final String ON_RENDER_CHANGE = "onRenderChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_SHOW_PRINT_MARGIN_CHANGE = "onShowPrintMarginChange";
	public static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TAB_SIZE_CHANGE = "onTabSizeChange";
	public static final String ON_USE_SOFT_TABS_CHANGE = "onUseSoftTabsChange";
	public static final String ON_USE_WRAP_MODE_CHANGE = "onUseWrapModeChange";
	public static final String ON_VALUE_CHANGE = "onValueChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	public static final String ON_WIDTH_CHANGE = "onWidthChange";

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
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

	public java.lang.Boolean getHighlightActiveLine() {
		return (java.lang.Boolean) getStateHelper().eval(HIGHLIGHT_ACTIVE_LINE, null);
	}

	public void setHighlightActiveLine(java.lang.Boolean highlightActiveLine) {
		getStateHelper().put(HIGHLIGHT_ACTIVE_LINE, highlightActiveLine);
	}

	public java.lang.String getAceEditorId() {
		return (java.lang.String) getStateHelper().eval(ACE_EDITOR_ID, null);
	}

	public void setAceEditorId(java.lang.String aceEditorId) {
		getStateHelper().put(ACE_EDITOR_ID, aceEditorId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getAceEditorLocale() {
		return (java.lang.String) getStateHelper().eval(ACE_EDITOR_LOCALE, null);
	}

	public void setAceEditorLocale(java.lang.String aceEditorLocale) {
		getStateHelper().put(ACE_EDITOR_LOCALE, aceEditorLocale);
	}

	public java.lang.String getMode() {
		return (java.lang.String) getStateHelper().eval(MODE, null);
	}

	public void setMode(java.lang.String mode) {
		getStateHelper().put(MODE, mode);
	}

	public java.lang.Boolean getReadOnly() {
		return (java.lang.Boolean) getStateHelper().eval(READ_ONLY, null);
	}

	public void setReadOnly(java.lang.Boolean readOnly) {
		getStateHelper().put(READ_ONLY, readOnly);
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

	public java.lang.Boolean getShowPrintMargin() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_PRINT_MARGIN, null);
	}

	public void setShowPrintMargin(java.lang.Boolean showPrintMargin) {
		getStateHelper().put(SHOW_PRINT_MARGIN, showPrintMargin);
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

	public java.lang.Object getTabSize() {
		return (java.lang.Object) getStateHelper().eval(TAB_SIZE, null);
	}

	public void setTabSize(java.lang.Object tabSize) {
		getStateHelper().put(TAB_SIZE, tabSize);
	}

	public java.lang.Boolean getUseSoftTabs() {
		return (java.lang.Boolean) getStateHelper().eval(USE_SOFT_TABS, null);
	}

	public void setUseSoftTabs(java.lang.Boolean useSoftTabs) {
		getStateHelper().put(USE_SOFT_TABS, useSoftTabs);
	}

	public java.lang.Boolean getUseWrapMode() {
		return (java.lang.Boolean) getStateHelper().eval(USE_WRAP_MODE, null);
	}

	public void setUseWrapMode(java.lang.Boolean useWrapMode) {
		getStateHelper().put(USE_WRAP_MODE, useWrapMode);
	}

	public java.lang.String getAceEditorValue() {
		return (java.lang.String) getStateHelper().eval(ACE_EDITOR_VALUE, null);
	}

	public void setAceEditorValue(java.lang.String aceEditorValue) {
		getStateHelper().put(ACE_EDITOR_VALUE, aceEditorValue);
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

	public java.lang.String getAfterHighlightActiveLineChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHT_ACTIVE_LINE_CHANGE, null);
	}

	public void setAfterHighlightActiveLineChange(java.lang.String afterHighlightActiveLineChange) {
		getStateHelper().put(AFTER_HIGHLIGHT_ACTIVE_LINE_CHANGE, afterHighlightActiveLineChange);
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

	public java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	public void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	public java.lang.String getAfterModeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MODE_CHANGE, null);
	}

	public void setAfterModeChange(java.lang.String afterModeChange) {
		getStateHelper().put(AFTER_MODE_CHANGE, afterModeChange);
	}

	public java.lang.String getAfterReadOnlyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_READ_ONLY_CHANGE, null);
	}

	public void setAfterReadOnlyChange(java.lang.String afterReadOnlyChange) {
		getStateHelper().put(AFTER_READ_ONLY_CHANGE, afterReadOnlyChange);
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

	public java.lang.String getAfterShowPrintMarginChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_PRINT_MARGIN_CHANGE, null);
	}

	public void setAfterShowPrintMarginChange(java.lang.String afterShowPrintMarginChange) {
		getStateHelper().put(AFTER_SHOW_PRINT_MARGIN_CHANGE, afterShowPrintMarginChange);
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

	public java.lang.String getAfterTabSizeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_SIZE_CHANGE, null);
	}

	public void setAfterTabSizeChange(java.lang.String afterTabSizeChange) {
		getStateHelper().put(AFTER_TAB_SIZE_CHANGE, afterTabSizeChange);
	}

	public java.lang.String getAfterUseSoftTabsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_SOFT_TABS_CHANGE, null);
	}

	public void setAfterUseSoftTabsChange(java.lang.String afterUseSoftTabsChange) {
		getStateHelper().put(AFTER_USE_SOFT_TABS_CHANGE, afterUseSoftTabsChange);
	}

	public java.lang.String getAfterUseWrapModeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_WRAP_MODE_CHANGE, null);
	}

	public void setAfterUseWrapModeChange(java.lang.String afterUseWrapModeChange) {
		getStateHelper().put(AFTER_USE_WRAP_MODE_CHANGE, afterUseWrapModeChange);
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

	public java.lang.String getOnHighlightActiveLineChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHT_ACTIVE_LINE_CHANGE, null);
	}

	public void setOnHighlightActiveLineChange(java.lang.String onHighlightActiveLineChange) {
		getStateHelper().put(ON_HIGHLIGHT_ACTIVE_LINE_CHANGE, onHighlightActiveLineChange);
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

	public java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	public void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	public java.lang.String getOnModeChange() {
		return (java.lang.String) getStateHelper().eval(ON_MODE_CHANGE, null);
	}

	public void setOnModeChange(java.lang.String onModeChange) {
		getStateHelper().put(ON_MODE_CHANGE, onModeChange);
	}

	public java.lang.String getOnReadOnlyChange() {
		return (java.lang.String) getStateHelper().eval(ON_READ_ONLY_CHANGE, null);
	}

	public void setOnReadOnlyChange(java.lang.String onReadOnlyChange) {
		getStateHelper().put(ON_READ_ONLY_CHANGE, onReadOnlyChange);
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

	public java.lang.String getOnShowPrintMarginChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_PRINT_MARGIN_CHANGE, null);
	}

	public void setOnShowPrintMarginChange(java.lang.String onShowPrintMarginChange) {
		getStateHelper().put(ON_SHOW_PRINT_MARGIN_CHANGE, onShowPrintMarginChange);
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

	public java.lang.String getOnTabSizeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_SIZE_CHANGE, null);
	}

	public void setOnTabSizeChange(java.lang.String onTabSizeChange) {
		getStateHelper().put(ON_TAB_SIZE_CHANGE, onTabSizeChange);
	}

	public java.lang.String getOnUseSoftTabsChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_SOFT_TABS_CHANGE, null);
	}

	public void setOnUseSoftTabsChange(java.lang.String onUseSoftTabsChange) {
		getStateHelper().put(ON_USE_SOFT_TABS_CHANGE, onUseSoftTabsChange);
	}

	public java.lang.String getOnUseWrapModeChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_WRAP_MODE_CHANGE, null);
	}

	public void setOnUseWrapModeChange(java.lang.String onUseWrapModeChange) {
		getStateHelper().put(ON_USE_WRAP_MODE_CHANGE, onUseWrapModeChange);
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