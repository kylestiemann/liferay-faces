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
package com.liferay.faces.alloy.component.tabview;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TabViewBase extends javax.faces.component.UIPanel {

	private static final String ACTIVE_DESCENDANT = "activeDescendant";
	private static final String BOUNDING_BOX = "boundingBox";
	private static final String CONTENT_BOX = "contentBox";
	private static final String DEFAULT_CHILD_TYPE = "defaultChildType";
	private static final String DESTROYED = "destroyed";
	private static final String DISABLED = "disabled";
	private static final String FOCUSED = "focused";
	private static final String HEIGHT = "height";
	private static final String TABVIEW_ID = "tabviewId";
	private static final String INITIALIZED = "initialized";
	private static final String TABVIEW_LOCALE = "tabviewLocale";
	private static final String MULTIPLE = "multiple";
	private static final String RENDER = "render";
	private static final String RENDERED = "rendered";
	private static final String SELECTION = "selection";
	private static final String SRC_NODE = "srcNode";
	private static final String STACKED = "stacked";
	private static final String STRINGS = "strings";
	private static final String TAB_INDEX = "tabIndex";
	private static final String TYPE = "type";
	private static final String VISIBLE = "visible";
	private static final String WIDTH = "width";
	private static final String AFTER_ACTIVE_DESCENDANT_CHANGE = "afterActiveDescendantChange";
	private static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	private static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	private static final String AFTER_DEFAULT_CHILD_TYPE_CHANGE = "afterDefaultChildTypeChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	private static final String AFTER_MULTIPLE_CHANGE = "afterMultipleChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	private static final String AFTER_SELECTION_CHANGE = "afterSelectionChange";
	private static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	private static final String AFTER_STACKED_CHANGE = "afterStackedChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String ON_ACTIVE_DESCENDANT_CHANGE = "onActiveDescendantChange";
	private static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	private static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	private static final String ON_DEFAULT_CHILD_TYPE_CHANGE = "onDefaultChildTypeChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_LOCALE_CHANGE = "onLocaleChange";
	private static final String ON_MULTIPLE_CHANGE = "onMultipleChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_RENDERED_CHANGE = "onRenderedChange";
	private static final String ON_SELECTION_CHANGE = "onSelectionChange";
	private static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	private static final String ON_STACKED_CHANGE = "onStackedChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_TYPE_CHANGE = "onTypeChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";

	public java.lang.Object getActiveDescendant() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_DESCENDANT, null);
	}

	public void setActiveDescendant(java.lang.Object activeDescendant) {
		getStateHelper().put(ACTIVE_DESCENDANT, activeDescendant);
	}

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

	public java.lang.Object getDefaultChildType() {
		return (java.lang.Object) getStateHelper().eval(DEFAULT_CHILD_TYPE, null);
	}

	public void setDefaultChildType(java.lang.Object defaultChildType) {
		getStateHelper().put(DEFAULT_CHILD_TYPE, defaultChildType);
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

	public java.lang.String getTabviewId() {
		return (java.lang.String) getStateHelper().eval(TABVIEW_ID, null);
	}

	public void setTabviewId(java.lang.String tabviewId) {
		getStateHelper().put(TABVIEW_ID, tabviewId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getTabviewLocale() {
		return (java.lang.String) getStateHelper().eval(TABVIEW_LOCALE, null);
	}

	public void setTabviewLocale(java.lang.String tabviewLocale) {
		getStateHelper().put(TABVIEW_LOCALE, tabviewLocale);
	}

	public java.lang.Boolean getMultiple() {
		return (java.lang.Boolean) getStateHelper().eval(MULTIPLE, null);
	}

	public void setMultiple(java.lang.Boolean multiple) {
		getStateHelper().put(MULTIPLE, multiple);
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

	public java.lang.Object getSelection() {
		return (java.lang.Object) getStateHelper().eval(SELECTION, null);
	}

	public void setSelection(java.lang.Object selection) {
		getStateHelper().put(SELECTION, selection);
	}

	public java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	public void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
	}

	public java.lang.Object getStacked() {
		return (java.lang.Object) getStateHelper().eval(STACKED, null);
	}

	public void setStacked(java.lang.Object stacked) {
		getStateHelper().put(STACKED, stacked);
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

	public java.lang.Object getType() {
		return (java.lang.Object) getStateHelper().eval(TYPE, null);
	}

	public void setType(java.lang.Object type) {
		getStateHelper().put(TYPE, type);
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

	public java.lang.String getAfterActiveDescendantChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_DESCENDANT_CHANGE, null);
	}

	public void setAfterActiveDescendantChange(java.lang.String afterActiveDescendantChange) {
		getStateHelper().put(AFTER_ACTIVE_DESCENDANT_CHANGE, afterActiveDescendantChange);
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

	public java.lang.String getAfterDefaultChildTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DEFAULT_CHILD_TYPE_CHANGE, null);
	}

	public void setAfterDefaultChildTypeChange(java.lang.String afterDefaultChildTypeChange) {
		getStateHelper().put(AFTER_DEFAULT_CHILD_TYPE_CHANGE, afterDefaultChildTypeChange);
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

	public java.lang.String getAfterMultipleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MULTIPLE_CHANGE, null);
	}

	public void setAfterMultipleChange(java.lang.String afterMultipleChange) {
		getStateHelper().put(AFTER_MULTIPLE_CHANGE, afterMultipleChange);
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

	public java.lang.String getAfterSelectionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTION_CHANGE, null);
	}

	public void setAfterSelectionChange(java.lang.String afterSelectionChange) {
		getStateHelper().put(AFTER_SELECTION_CHANGE, afterSelectionChange);
	}

	public java.lang.String getAfterSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SRC_NODE_CHANGE, null);
	}

	public void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		getStateHelper().put(AFTER_SRC_NODE_CHANGE, afterSrcNodeChange);
	}

	public java.lang.String getAfterStackedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STACKED_CHANGE, null);
	}

	public void setAfterStackedChange(java.lang.String afterStackedChange) {
		getStateHelper().put(AFTER_STACKED_CHANGE, afterStackedChange);
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

	public java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	public void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
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

	public java.lang.String getOnActiveDescendantChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_DESCENDANT_CHANGE, null);
	}

	public void setOnActiveDescendantChange(java.lang.String onActiveDescendantChange) {
		getStateHelper().put(ON_ACTIVE_DESCENDANT_CHANGE, onActiveDescendantChange);
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

	public java.lang.String getOnDefaultChildTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_DEFAULT_CHILD_TYPE_CHANGE, null);
	}

	public void setOnDefaultChildTypeChange(java.lang.String onDefaultChildTypeChange) {
		getStateHelper().put(ON_DEFAULT_CHILD_TYPE_CHANGE, onDefaultChildTypeChange);
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

	public java.lang.String getOnMultipleChange() {
		return (java.lang.String) getStateHelper().eval(ON_MULTIPLE_CHANGE, null);
	}

	public void setOnMultipleChange(java.lang.String onMultipleChange) {
		getStateHelper().put(ON_MULTIPLE_CHANGE, onMultipleChange);
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

	public java.lang.String getOnSelectionChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTION_CHANGE, null);
	}

	public void setOnSelectionChange(java.lang.String onSelectionChange) {
		getStateHelper().put(ON_SELECTION_CHANGE, onSelectionChange);
	}

	public java.lang.String getOnSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SRC_NODE_CHANGE, null);
	}

	public void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		getStateHelper().put(ON_SRC_NODE_CHANGE, onSrcNodeChange);
	}

	public java.lang.String getOnStackedChange() {
		return (java.lang.String) getStateHelper().eval(ON_STACKED_CHANGE, null);
	}

	public void setOnStackedChange(java.lang.String onStackedChange) {
		getStateHelper().put(ON_STACKED_CHANGE, onStackedChange);
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

	public java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	public void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
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