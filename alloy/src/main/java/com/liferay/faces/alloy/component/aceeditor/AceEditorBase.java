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
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AceEditorBase extends javax.faces.component.UIPanel {

	private static final String HEIGHT = "height";
	private static final String HIGHLIGHT_ACTIVE_LINE = "highlightActiveLine";
	private static final String MODE = "mode";
	private static final String READ_ONLY = "readOnly";
	private static final String SHOW_PRINT_MARGIN = "showPrintMargin";
	private static final String TAB_SIZE = "tabSize";
	private static final String USE_SOFT_TABS = "useSoftTabs";
	private static final String USE_WRAP_MODE = "useWrapMode";
	private static final String ACEEDITOR_VALUE = "aceeditorValue";
	private static final String WIDTH = "width";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HIGHLIGHT_ACTIVE_LINE_CHANGE = "afterHighlightActiveLineChange";
	private static final String AFTER_MODE_CHANGE = "afterModeChange";
	private static final String AFTER_READ_ONLY_CHANGE = "afterReadOnlyChange";
	private static final String AFTER_SHOW_PRINT_MARGIN_CHANGE = "afterShowPrintMarginChange";
	private static final String AFTER_TAB_SIZE_CHANGE = "afterTabSizeChange";
	private static final String AFTER_USE_SOFT_TABS_CHANGE = "afterUseSoftTabsChange";
	private static final String AFTER_USE_WRAP_MODE_CHANGE = "afterUseWrapModeChange";
	private static final String AFTER_VALUE_CHANGE = "afterValueChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HIGHLIGHT_ACTIVE_LINE_CHANGE = "onHighlightActiveLineChange";
	private static final String ON_MODE_CHANGE = "onModeChange";
	private static final String ON_READ_ONLY_CHANGE = "onReadOnlyChange";
	private static final String ON_SHOW_PRINT_MARGIN_CHANGE = "onShowPrintMarginChange";
	private static final String ON_TAB_SIZE_CHANGE = "onTabSizeChange";
	private static final String ON_USE_SOFT_TABS_CHANGE = "onUseSoftTabsChange";
	private static final String ON_USE_WRAP_MODE_CHANGE = "onUseWrapModeChange";
	private static final String ON_VALUE_CHANGE = "onValueChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";

	protected java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	protected void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	protected java.lang.Boolean getHighlightActiveLine() {
		return (java.lang.Boolean) getStateHelper().eval(HIGHLIGHT_ACTIVE_LINE, null);
	}

	protected void setHighlightActiveLine(java.lang.Boolean highlightActiveLine) {
		getStateHelper().put(HIGHLIGHT_ACTIVE_LINE, highlightActiveLine);
	}

	protected java.lang.String getMode() {
		return (java.lang.String) getStateHelper().eval(MODE, null);
	}

	protected void setMode(java.lang.String mode) {
		getStateHelper().put(MODE, mode);
	}

	protected java.lang.Boolean getReadOnly() {
		return (java.lang.Boolean) getStateHelper().eval(READ_ONLY, null);
	}

	protected void setReadOnly(java.lang.Boolean readOnly) {
		getStateHelper().put(READ_ONLY, readOnly);
	}

	protected java.lang.Boolean getShowPrintMargin() {
		return (java.lang.Boolean) getStateHelper().eval(SHOW_PRINT_MARGIN, null);
	}

	protected void setShowPrintMargin(java.lang.Boolean showPrintMargin) {
		getStateHelper().put(SHOW_PRINT_MARGIN, showPrintMargin);
	}

	protected java.lang.Object getTabSize() {
		return (java.lang.Object) getStateHelper().eval(TAB_SIZE, null);
	}

	protected void setTabSize(java.lang.Object tabSize) {
		getStateHelper().put(TAB_SIZE, tabSize);
	}

	protected java.lang.Boolean getUseSoftTabs() {
		return (java.lang.Boolean) getStateHelper().eval(USE_SOFT_TABS, null);
	}

	protected void setUseSoftTabs(java.lang.Boolean useSoftTabs) {
		getStateHelper().put(USE_SOFT_TABS, useSoftTabs);
	}

	protected java.lang.Boolean getUseWrapMode() {
		return (java.lang.Boolean) getStateHelper().eval(USE_WRAP_MODE, null);
	}

	protected void setUseWrapMode(java.lang.Boolean useWrapMode) {
		getStateHelper().put(USE_WRAP_MODE, useWrapMode);
	}

	protected java.lang.String getAceeditorValue() {
		return (java.lang.String) getStateHelper().eval(ACEEDITOR_VALUE, null);
	}

	protected void setAceeditorValue(java.lang.String aceeditorValue) {
		getStateHelper().put(ACEEDITOR_VALUE, aceeditorValue);
	}

	protected java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	protected void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	protected java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	protected void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	protected java.lang.String getAfterHighlightActiveLineChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHT_ACTIVE_LINE_CHANGE, null);
	}

	protected void setAfterHighlightActiveLineChange(java.lang.String afterHighlightActiveLineChange) {
		getStateHelper().put(AFTER_HIGHLIGHT_ACTIVE_LINE_CHANGE, afterHighlightActiveLineChange);
	}

	protected java.lang.String getAfterModeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MODE_CHANGE, null);
	}

	protected void setAfterModeChange(java.lang.String afterModeChange) {
		getStateHelper().put(AFTER_MODE_CHANGE, afterModeChange);
	}

	protected java.lang.String getAfterReadOnlyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_READ_ONLY_CHANGE, null);
	}

	protected void setAfterReadOnlyChange(java.lang.String afterReadOnlyChange) {
		getStateHelper().put(AFTER_READ_ONLY_CHANGE, afterReadOnlyChange);
	}

	protected java.lang.String getAfterShowPrintMarginChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_PRINT_MARGIN_CHANGE, null);
	}

	protected void setAfterShowPrintMarginChange(java.lang.String afterShowPrintMarginChange) {
		getStateHelper().put(AFTER_SHOW_PRINT_MARGIN_CHANGE, afterShowPrintMarginChange);
	}

	protected java.lang.String getAfterTabSizeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_SIZE_CHANGE, null);
	}

	protected void setAfterTabSizeChange(java.lang.String afterTabSizeChange) {
		getStateHelper().put(AFTER_TAB_SIZE_CHANGE, afterTabSizeChange);
	}

	protected java.lang.String getAfterUseSoftTabsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_SOFT_TABS_CHANGE, null);
	}

	protected void setAfterUseSoftTabsChange(java.lang.String afterUseSoftTabsChange) {
		getStateHelper().put(AFTER_USE_SOFT_TABS_CHANGE, afterUseSoftTabsChange);
	}

	protected java.lang.String getAfterUseWrapModeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_WRAP_MODE_CHANGE, null);
	}

	protected void setAfterUseWrapModeChange(java.lang.String afterUseWrapModeChange) {
		getStateHelper().put(AFTER_USE_WRAP_MODE_CHANGE, afterUseWrapModeChange);
	}

	protected java.lang.String getAfterValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_CHANGE, null);
	}

	protected void setAfterValueChange(java.lang.String afterValueChange) {
		getStateHelper().put(AFTER_VALUE_CHANGE, afterValueChange);
	}

	protected java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	protected void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	protected java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	protected void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	protected java.lang.String getOnHighlightActiveLineChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHT_ACTIVE_LINE_CHANGE, null);
	}

	protected void setOnHighlightActiveLineChange(java.lang.String onHighlightActiveLineChange) {
		getStateHelper().put(ON_HIGHLIGHT_ACTIVE_LINE_CHANGE, onHighlightActiveLineChange);
	}

	protected java.lang.String getOnModeChange() {
		return (java.lang.String) getStateHelper().eval(ON_MODE_CHANGE, null);
	}

	protected void setOnModeChange(java.lang.String onModeChange) {
		getStateHelper().put(ON_MODE_CHANGE, onModeChange);
	}

	protected java.lang.String getOnReadOnlyChange() {
		return (java.lang.String) getStateHelper().eval(ON_READ_ONLY_CHANGE, null);
	}

	protected void setOnReadOnlyChange(java.lang.String onReadOnlyChange) {
		getStateHelper().put(ON_READ_ONLY_CHANGE, onReadOnlyChange);
	}

	protected java.lang.String getOnShowPrintMarginChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_PRINT_MARGIN_CHANGE, null);
	}

	protected void setOnShowPrintMarginChange(java.lang.String onShowPrintMarginChange) {
		getStateHelper().put(ON_SHOW_PRINT_MARGIN_CHANGE, onShowPrintMarginChange);
	}

	protected java.lang.String getOnTabSizeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_SIZE_CHANGE, null);
	}

	protected void setOnTabSizeChange(java.lang.String onTabSizeChange) {
		getStateHelper().put(ON_TAB_SIZE_CHANGE, onTabSizeChange);
	}

	protected java.lang.String getOnUseSoftTabsChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_SOFT_TABS_CHANGE, null);
	}

	protected void setOnUseSoftTabsChange(java.lang.String onUseSoftTabsChange) {
		getStateHelper().put(ON_USE_SOFT_TABS_CHANGE, onUseSoftTabsChange);
	}

	protected java.lang.String getOnUseWrapModeChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_WRAP_MODE_CHANGE, null);
	}

	protected void setOnUseWrapModeChange(java.lang.String onUseWrapModeChange) {
		getStateHelper().put(ON_USE_WRAP_MODE_CHANGE, onUseWrapModeChange);
	}

	protected java.lang.String getOnValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_CHANGE, null);
	}

	protected void setOnValueChange(java.lang.String onValueChange) {
		getStateHelper().put(ON_VALUE_CHANGE, onValueChange);
	}

	protected java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	protected void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

}