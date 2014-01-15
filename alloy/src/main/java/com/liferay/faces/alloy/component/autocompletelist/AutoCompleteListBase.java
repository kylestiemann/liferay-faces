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
package com.liferay.faces.alloy.component.autocompletelist;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AutoCompleteListBase extends javax.faces.component.UIPanel {

	private static final String ACTIVATE_FIRST_ITEM = "activateFirstItem";
	private static final String ACTIVE_ITEM = "activeItem";
	private static final String ALIGN = "align";
	private static final String ALIGN_ON = "alignOn";
	private static final String ALWAYS_SHOW_LIST = "alwaysShowList";
	private static final String AUTOCOMPLETELIST_BODY_CONTENT = "autocompletelistBodyContent";
	private static final String BOUNDING_BOX = "boundingBox";
	private static final String CENTERED = "centered";
	private static final String CIRCULAR = "circular";
	private static final String CONSTRAIN = "constrain";
	private static final String CONTENT_BOX = "contentBox";
	private static final String DESTROYED = "destroyed";
	private static final String DISABLED = "disabled";
	private static final String FILL_HEIGHT = "fillHeight";
	private static final String FOCUSED = "focused";
	private static final String FOOTER_CONTENT = "footerContent";
	private static final String HEADER_CONTENT = "headerContent";
	private static final String HEIGHT = "height";
	private static final String HIDE_ON = "hideOn";
	private static final String HOST = "host";
	private static final String HOVERED_ITEM = "hoveredItem";
	private static final String AUTOCOMPLETELIST_ID = "autocompletelistId";
	private static final String INITIALIZED = "initialized";
	private static final String LIST_NODE = "listNode";
	private static final String LOADING_MESSAGE = "loadingMessage";
	private static final String AUTOCOMPLETELIST_LOCALE = "autocompletelistLocale";
	private static final String PREVENT_OVERLAP = "preventOverlap";
	private static final String RENDER = "render";
	private static final String RENDERED = "rendered";
	private static final String RESULTS = "results";
	private static final String SCROLL_INTO_VIEW = "scrollIntoView";
	private static final String SELECTED_ENTRY = "selectedEntry";
	private static final String SHIM = "shim";
	private static final String SRC_NODE = "srcNode";
	private static final String STRINGS = "strings";
	private static final String TAB_INDEX = "tabIndex";
	private static final String TAB_SELECT = "tabSelect";
	private static final String VISIBLE = "visible";
	private static final String WIDTH = "width";
	private static final String X = "x";
	private static final String XY = "xy";
	private static final String Y = "y";
	private static final String Z_INDEX = "zIndex";
	private static final String AFTER_ACTIVATE_FIRST_ITEM_CHANGE = "afterActivateFirstItemChange";
	private static final String AFTER_ACTIVE_ITEM_CHANGE = "afterActiveItemChange";
	private static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	private static final String AFTER_ALIGN_ON_CHANGE = "afterAlignOnChange";
	private static final String AFTER_ALWAYS_SHOW_LIST_CHANGE = "afterAlwaysShowListChange";
	private static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	private static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	private static final String AFTER_CENTERED_CHANGE = "afterCenteredChange";
	private static final String AFTER_CIRCULAR_CHANGE = "afterCircularChange";
	private static final String AFTER_CONSTRAIN_CHANGE = "afterConstrainChange";
	private static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_FILL_HEIGHT_CHANGE = "afterFillHeightChange";
	private static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	private static final String AFTER_FOOTER_CONTENT_CHANGE = "afterFooterContentChange";
	private static final String AFTER_HEADER_CONTENT_CHANGE = "afterHeaderContentChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HIDE_ON_CHANGE = "afterHideOnChange";
	private static final String AFTER_HOST_CHANGE = "afterHostChange";
	private static final String AFTER_HOVERED_ITEM_CHANGE = "afterHoveredItemChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_LIST_NODE_CHANGE = "afterListNodeChange";
	private static final String AFTER_LOADING_MESSAGE_CHANGE = "afterLoadingMessageChange";
	private static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	private static final String AFTER_PREVENT_OVERLAP_CHANGE = "afterPreventOverlapChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	private static final String AFTER_RESULTS_CHANGE = "afterResultsChange";
	private static final String AFTER_SCROLL_INTO_VIEW_CHANGE = "afterScrollIntoViewChange";
	private static final String AFTER_SELECTED_ENTRY_CHANGE = "afterSelectedEntryChange";
	private static final String AFTER_SHIM_CHANGE = "afterShimChange";
	private static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_TAB_SELECT_CHANGE = "afterTabSelectChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String AFTER_XCHANGE = "afterXChange";
	private static final String AFTER_XY_CHANGE = "afterXyChange";
	private static final String AFTER_YCHANGE = "afterYChange";
	private static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	private static final String ON_ACTIVATE_FIRST_ITEM_CHANGE = "onActivateFirstItemChange";
	private static final String ON_ACTIVE_ITEM_CHANGE = "onActiveItemChange";
	private static final String ON_ALIGN_CHANGE = "onAlignChange";
	private static final String ON_ALIGN_ON_CHANGE = "onAlignOnChange";
	private static final String ON_ALWAYS_SHOW_LIST_CHANGE = "onAlwaysShowListChange";
	private static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	private static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	private static final String ON_CENTERED_CHANGE = "onCenteredChange";
	private static final String ON_CIRCULAR_CHANGE = "onCircularChange";
	private static final String ON_CONSTRAIN_CHANGE = "onConstrainChange";
	private static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_FILL_HEIGHT_CHANGE = "onFillHeightChange";
	private static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	private static final String ON_FOOTER_CONTENT_CHANGE = "onFooterContentChange";
	private static final String ON_HEADER_CONTENT_CHANGE = "onHeaderContentChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HIDE_ON_CHANGE = "onHideOnChange";
	private static final String ON_HOST_CHANGE = "onHostChange";
	private static final String ON_HOVERED_ITEM_CHANGE = "onHoveredItemChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_LIST_NODE_CHANGE = "onListNodeChange";
	private static final String ON_LOADING_MESSAGE_CHANGE = "onLoadingMessageChange";
	private static final String ON_LOCALE_CHANGE = "onLocaleChange";
	private static final String ON_PREVENT_OVERLAP_CHANGE = "onPreventOverlapChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_RENDERED_CHANGE = "onRenderedChange";
	private static final String ON_RESULTS_CHANGE = "onResultsChange";
	private static final String ON_SCROLL_INTO_VIEW_CHANGE = "onScrollIntoViewChange";
	private static final String ON_SELECTED_ENTRY_CHANGE = "onSelectedEntryChange";
	private static final String ON_SHIM_CHANGE = "onShimChange";
	private static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_TAB_SELECT_CHANGE = "onTabSelectChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";
	private static final String ON_XCHANGE = "onXChange";
	private static final String ON_XY_CHANGE = "onXyChange";
	private static final String ON_YCHANGE = "onYChange";
	private static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	public java.lang.Boolean getActivateFirstItem() {
		return (java.lang.Boolean) getStateHelper().eval(ACTIVATE_FIRST_ITEM, null);
	}

	public void setActivateFirstItem(java.lang.Boolean activateFirstItem) {
		getStateHelper().put(ACTIVATE_FIRST_ITEM, activateFirstItem);
	}

	public java.lang.Object getActiveItem() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_ITEM, null);
	}

	public void setActiveItem(java.lang.Object activeItem) {
		getStateHelper().put(ACTIVE_ITEM, activeItem);
	}

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

	public java.lang.Boolean getAlwaysShowList() {
		return (java.lang.Boolean) getStateHelper().eval(ALWAYS_SHOW_LIST, null);
	}

	public void setAlwaysShowList(java.lang.Boolean alwaysShowList) {
		getStateHelper().put(ALWAYS_SHOW_LIST, alwaysShowList);
	}

	public java.lang.Object getAutocompletelistBodyContent() {
		return (java.lang.Object) getStateHelper().eval(AUTOCOMPLETELIST_BODY_CONTENT, null);
	}

	public void setAutocompletelistBodyContent(java.lang.Object autocompletelistBodyContent) {
		getStateHelper().put(AUTOCOMPLETELIST_BODY_CONTENT, autocompletelistBodyContent);
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

	public java.lang.Boolean getCircular() {
		return (java.lang.Boolean) getStateHelper().eval(CIRCULAR, null);
	}

	public void setCircular(java.lang.Boolean circular) {
		getStateHelper().put(CIRCULAR, circular);
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

	public java.lang.Object getFooterContent() {
		return (java.lang.Object) getStateHelper().eval(FOOTER_CONTENT, null);
	}

	public void setFooterContent(java.lang.Object footerContent) {
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

	public java.lang.Object getHideOn() {
		return (java.lang.Object) getStateHelper().eval(HIDE_ON, null);
	}

	public void setHideOn(java.lang.Object hideOn) {
		getStateHelper().put(HIDE_ON, hideOn);
	}

	public java.lang.Object getHost() {
		return (java.lang.Object) getStateHelper().eval(HOST, null);
	}

	public void setHost(java.lang.Object host) {
		getStateHelper().put(HOST, host);
	}

	public java.lang.Object getHoveredItem() {
		return (java.lang.Object) getStateHelper().eval(HOVERED_ITEM, null);
	}

	public void setHoveredItem(java.lang.Object hoveredItem) {
		getStateHelper().put(HOVERED_ITEM, hoveredItem);
	}

	public java.lang.String getAutocompletelistId() {
		return (java.lang.String) getStateHelper().eval(AUTOCOMPLETELIST_ID, null);
	}

	public void setAutocompletelistId(java.lang.String autocompletelistId) {
		getStateHelper().put(AUTOCOMPLETELIST_ID, autocompletelistId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Object getListNode() {
		return (java.lang.Object) getStateHelper().eval(LIST_NODE, null);
	}

	public void setListNode(java.lang.Object listNode) {
		getStateHelper().put(LIST_NODE, listNode);
	}

	public java.lang.String getLoadingMessage() {
		return (java.lang.String) getStateHelper().eval(LOADING_MESSAGE, null);
	}

	public void setLoadingMessage(java.lang.String loadingMessage) {
		getStateHelper().put(LOADING_MESSAGE, loadingMessage);
	}

	public java.lang.String getAutocompletelistLocale() {
		return (java.lang.String) getStateHelper().eval(AUTOCOMPLETELIST_LOCALE, null);
	}

	public void setAutocompletelistLocale(java.lang.String autocompletelistLocale) {
		getStateHelper().put(AUTOCOMPLETELIST_LOCALE, autocompletelistLocale);
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

	public java.lang.Object getResults() {
		return (java.lang.Object) getStateHelper().eval(RESULTS, null);
	}

	public void setResults(java.lang.Object results) {
		getStateHelper().put(RESULTS, results);
	}

	public java.lang.Boolean getScrollIntoView() {
		return (java.lang.Boolean) getStateHelper().eval(SCROLL_INTO_VIEW, null);
	}

	public void setScrollIntoView(java.lang.Boolean scrollIntoView) {
		getStateHelper().put(SCROLL_INTO_VIEW, scrollIntoView);
	}

	public java.lang.String getSelectedEntry() {
		return (java.lang.String) getStateHelper().eval(SELECTED_ENTRY, null);
	}

	public void setSelectedEntry(java.lang.String selectedEntry) {
		getStateHelper().put(SELECTED_ENTRY, selectedEntry);
	}

	public java.lang.Boolean getShim() {
		return (java.lang.Boolean) getStateHelper().eval(SHIM, null);
	}

	public void setShim(java.lang.Boolean shim) {
		getStateHelper().put(SHIM, shim);
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

	public java.lang.Boolean getTabSelect() {
		return (java.lang.Boolean) getStateHelper().eval(TAB_SELECT, null);
	}

	public void setTabSelect(java.lang.Boolean tabSelect) {
		getStateHelper().put(TAB_SELECT, tabSelect);
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

	public java.lang.String getAfterActivateFirstItemChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVATE_FIRST_ITEM_CHANGE, null);
	}

	public void setAfterActivateFirstItemChange(java.lang.String afterActivateFirstItemChange) {
		getStateHelper().put(AFTER_ACTIVATE_FIRST_ITEM_CHANGE, afterActivateFirstItemChange);
	}

	public java.lang.String getAfterActiveItemChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_ITEM_CHANGE, null);
	}

	public void setAfterActiveItemChange(java.lang.String afterActiveItemChange) {
		getStateHelper().put(AFTER_ACTIVE_ITEM_CHANGE, afterActiveItemChange);
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

	public java.lang.String getAfterAlwaysShowListChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALWAYS_SHOW_LIST_CHANGE, null);
	}

	public void setAfterAlwaysShowListChange(java.lang.String afterAlwaysShowListChange) {
		getStateHelper().put(AFTER_ALWAYS_SHOW_LIST_CHANGE, afterAlwaysShowListChange);
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

	public java.lang.String getAfterCircularChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CIRCULAR_CHANGE, null);
	}

	public void setAfterCircularChange(java.lang.String afterCircularChange) {
		getStateHelper().put(AFTER_CIRCULAR_CHANGE, afterCircularChange);
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

	public java.lang.String getAfterHideOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_ON_CHANGE, null);
	}

	public void setAfterHideOnChange(java.lang.String afterHideOnChange) {
		getStateHelper().put(AFTER_HIDE_ON_CHANGE, afterHideOnChange);
	}

	public java.lang.String getAfterHostChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HOST_CHANGE, null);
	}

	public void setAfterHostChange(java.lang.String afterHostChange) {
		getStateHelper().put(AFTER_HOST_CHANGE, afterHostChange);
	}

	public java.lang.String getAfterHoveredItemChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HOVERED_ITEM_CHANGE, null);
	}

	public void setAfterHoveredItemChange(java.lang.String afterHoveredItemChange) {
		getStateHelper().put(AFTER_HOVERED_ITEM_CHANGE, afterHoveredItemChange);
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

	public java.lang.String getAfterListNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LIST_NODE_CHANGE, null);
	}

	public void setAfterListNodeChange(java.lang.String afterListNodeChange) {
		getStateHelper().put(AFTER_LIST_NODE_CHANGE, afterListNodeChange);
	}

	public java.lang.String getAfterLoadingMessageChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOADING_MESSAGE_CHANGE, null);
	}

	public void setAfterLoadingMessageChange(java.lang.String afterLoadingMessageChange) {
		getStateHelper().put(AFTER_LOADING_MESSAGE_CHANGE, afterLoadingMessageChange);
	}

	public java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	public void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
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

	public java.lang.String getAfterResultsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESULTS_CHANGE, null);
	}

	public void setAfterResultsChange(java.lang.String afterResultsChange) {
		getStateHelper().put(AFTER_RESULTS_CHANGE, afterResultsChange);
	}

	public java.lang.String getAfterScrollIntoViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCROLL_INTO_VIEW_CHANGE, null);
	}

	public void setAfterScrollIntoViewChange(java.lang.String afterScrollIntoViewChange) {
		getStateHelper().put(AFTER_SCROLL_INTO_VIEW_CHANGE, afterScrollIntoViewChange);
	}

	public java.lang.String getAfterSelectedEntryChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_ENTRY_CHANGE, null);
	}

	public void setAfterSelectedEntryChange(java.lang.String afterSelectedEntryChange) {
		getStateHelper().put(AFTER_SELECTED_ENTRY_CHANGE, afterSelectedEntryChange);
	}

	public java.lang.String getAfterShimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHIM_CHANGE, null);
	}

	public void setAfterShimChange(java.lang.String afterShimChange) {
		getStateHelper().put(AFTER_SHIM_CHANGE, afterShimChange);
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

	public java.lang.String getAfterTabSelectChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_SELECT_CHANGE, null);
	}

	public void setAfterTabSelectChange(java.lang.String afterTabSelectChange) {
		getStateHelper().put(AFTER_TAB_SELECT_CHANGE, afterTabSelectChange);
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

	public java.lang.String getOnActivateFirstItemChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVATE_FIRST_ITEM_CHANGE, null);
	}

	public void setOnActivateFirstItemChange(java.lang.String onActivateFirstItemChange) {
		getStateHelper().put(ON_ACTIVATE_FIRST_ITEM_CHANGE, onActivateFirstItemChange);
	}

	public java.lang.String getOnActiveItemChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_ITEM_CHANGE, null);
	}

	public void setOnActiveItemChange(java.lang.String onActiveItemChange) {
		getStateHelper().put(ON_ACTIVE_ITEM_CHANGE, onActiveItemChange);
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

	public java.lang.String getOnAlwaysShowListChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALWAYS_SHOW_LIST_CHANGE, null);
	}

	public void setOnAlwaysShowListChange(java.lang.String onAlwaysShowListChange) {
		getStateHelper().put(ON_ALWAYS_SHOW_LIST_CHANGE, onAlwaysShowListChange);
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

	public java.lang.String getOnCircularChange() {
		return (java.lang.String) getStateHelper().eval(ON_CIRCULAR_CHANGE, null);
	}

	public void setOnCircularChange(java.lang.String onCircularChange) {
		getStateHelper().put(ON_CIRCULAR_CHANGE, onCircularChange);
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

	public java.lang.String getOnHideOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_ON_CHANGE, null);
	}

	public void setOnHideOnChange(java.lang.String onHideOnChange) {
		getStateHelper().put(ON_HIDE_ON_CHANGE, onHideOnChange);
	}

	public java.lang.String getOnHostChange() {
		return (java.lang.String) getStateHelper().eval(ON_HOST_CHANGE, null);
	}

	public void setOnHostChange(java.lang.String onHostChange) {
		getStateHelper().put(ON_HOST_CHANGE, onHostChange);
	}

	public java.lang.String getOnHoveredItemChange() {
		return (java.lang.String) getStateHelper().eval(ON_HOVERED_ITEM_CHANGE, null);
	}

	public void setOnHoveredItemChange(java.lang.String onHoveredItemChange) {
		getStateHelper().put(ON_HOVERED_ITEM_CHANGE, onHoveredItemChange);
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

	public java.lang.String getOnListNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_LIST_NODE_CHANGE, null);
	}

	public void setOnListNodeChange(java.lang.String onListNodeChange) {
		getStateHelper().put(ON_LIST_NODE_CHANGE, onListNodeChange);
	}

	public java.lang.String getOnLoadingMessageChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOADING_MESSAGE_CHANGE, null);
	}

	public void setOnLoadingMessageChange(java.lang.String onLoadingMessageChange) {
		getStateHelper().put(ON_LOADING_MESSAGE_CHANGE, onLoadingMessageChange);
	}

	public java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	public void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
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

	public java.lang.String getOnResultsChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESULTS_CHANGE, null);
	}

	public void setOnResultsChange(java.lang.String onResultsChange) {
		getStateHelper().put(ON_RESULTS_CHANGE, onResultsChange);
	}

	public java.lang.String getOnScrollIntoViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCROLL_INTO_VIEW_CHANGE, null);
	}

	public void setOnScrollIntoViewChange(java.lang.String onScrollIntoViewChange) {
		getStateHelper().put(ON_SCROLL_INTO_VIEW_CHANGE, onScrollIntoViewChange);
	}

	public java.lang.String getOnSelectedEntryChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_ENTRY_CHANGE, null);
	}

	public void setOnSelectedEntryChange(java.lang.String onSelectedEntryChange) {
		getStateHelper().put(ON_SELECTED_ENTRY_CHANGE, onSelectedEntryChange);
	}

	public java.lang.String getOnShimChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHIM_CHANGE, null);
	}

	public void setOnShimChange(java.lang.String onShimChange) {
		getStateHelper().put(ON_SHIM_CHANGE, onShimChange);
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

	public java.lang.String getOnTabSelectChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_SELECT_CHANGE, null);
	}

	public void setOnTabSelectChange(java.lang.String onTabSelectChange) {
		getStateHelper().put(ON_TAB_SELECT_CHANGE, onTabSelectChange);
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