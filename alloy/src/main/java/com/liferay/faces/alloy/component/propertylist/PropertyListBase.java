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
package com.liferay.faces.alloy.component.propertylist;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class PropertyListBase extends javax.faces.component.UIPanel {

	private static final String AUTO_SYNC = "autoSync";
	private static final String BODY_CONFIG = "bodyConfig";
	private static final String BODY_VIEW = "bodyView";
	private static final String BOUNDING_BOX = "boundingBox";
	private static final String CAPTION = "caption";
	private static final String COLUMNS = "columns";
	private static final String COLUMNSET = "columnset";
	private static final String CONTENT_BOX = "contentBox";
	private static final String DATA = "data";
	private static final String DESTROYED = "destroyed";
	private static final String DISABLED = "disabled";
	private static final String EDIT_EVENT = "editEvent";
	private static final String FOCUSED = "focused";
	private static final String FOOTER_CONFIG = "footerConfig";
	private static final String FOOTER_VIEW = "footerView";
	private static final String HEADER_CONFIG = "headerConfig";
	private static final String HEADER_VIEW = "headerView";
	private static final String HEIGHT = "height";
	private static final String PROPERTYLIST_ID = "propertylistId";
	private static final String INITIALIZED = "initialized";
	private static final String PROPERTYLIST_LOCALE = "propertylistLocale";
	private static final String RECORD_TYPE = "recordType";
	private static final String RECORDSET = "recordset";
	private static final String RENDER = "render";
	private static final String RENDERED = "rendered";
	private static final String SCROLLABLE = "scrollable";
	private static final String SHOW_MESSAGES = "showMessages";
	private static final String SORT_BY = "sortBy";
	private static final String SORTABLE = "sortable";
	private static final String SRC_NODE = "srcNode";
	private static final String STRINGS = "strings";
	private static final String SUMMARY = "summary";
	private static final String TAB_INDEX = "tabIndex";
	private static final String VIEW = "view";
	private static final String VIEW_CONFIG = "viewConfig";
	private static final String VISIBLE = "visible";
	private static final String WIDTH = "width";
	private static final String AFTER_AUTO_SYNC_CHANGE = "afterAutoSyncChange";
	private static final String AFTER_BODY_CONFIG_CHANGE = "afterBodyConfigChange";
	private static final String AFTER_BODY_VIEW_CHANGE = "afterBodyViewChange";
	private static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	private static final String AFTER_CAPTION_CHANGE = "afterCaptionChange";
	private static final String AFTER_COLUMNS_CHANGE = "afterColumnsChange";
	private static final String AFTER_COLUMNSET_CHANGE = "afterColumnsetChange";
	private static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	private static final String AFTER_DATA_CHANGE = "afterDataChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_EDIT_EVENT_CHANGE = "afterEditEventChange";
	private static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	private static final String AFTER_FOOTER_CONFIG_CHANGE = "afterFooterConfigChange";
	private static final String AFTER_FOOTER_VIEW_CHANGE = "afterFooterViewChange";
	private static final String AFTER_HEADER_CONFIG_CHANGE = "afterHeaderConfigChange";
	private static final String AFTER_HEADER_VIEW_CHANGE = "afterHeaderViewChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	private static final String AFTER_RECORD_TYPE_CHANGE = "afterRecordTypeChange";
	private static final String AFTER_RECORDSET_CHANGE = "afterRecordsetChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	private static final String AFTER_SCROLLABLE_CHANGE = "afterScrollableChange";
	private static final String AFTER_SHOW_MESSAGES_CHANGE = "afterShowMessagesChange";
	private static final String AFTER_SORT_BY_CHANGE = "afterSortByChange";
	private static final String AFTER_SORTABLE_CHANGE = "afterSortableChange";
	private static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_SUMMARY_CHANGE = "afterSummaryChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_VIEW_CHANGE = "afterViewChange";
	private static final String AFTER_VIEW_CONFIG_CHANGE = "afterViewConfigChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String ON_AUTO_SYNC_CHANGE = "onAutoSyncChange";
	private static final String ON_BODY_CONFIG_CHANGE = "onBodyConfigChange";
	private static final String ON_BODY_VIEW_CHANGE = "onBodyViewChange";
	private static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	private static final String ON_CAPTION_CHANGE = "onCaptionChange";
	private static final String ON_COLUMNS_CHANGE = "onColumnsChange";
	private static final String ON_COLUMNSET_CHANGE = "onColumnsetChange";
	private static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	private static final String ON_DATA_CHANGE = "onDataChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_EDIT_EVENT_CHANGE = "onEditEventChange";
	private static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	private static final String ON_FOOTER_CONFIG_CHANGE = "onFooterConfigChange";
	private static final String ON_FOOTER_VIEW_CHANGE = "onFooterViewChange";
	private static final String ON_HEADER_CONFIG_CHANGE = "onHeaderConfigChange";
	private static final String ON_HEADER_VIEW_CHANGE = "onHeaderViewChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_LOCALE_CHANGE = "onLocaleChange";
	private static final String ON_RECORD_TYPE_CHANGE = "onRecordTypeChange";
	private static final String ON_RECORDSET_CHANGE = "onRecordsetChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_RENDERED_CHANGE = "onRenderedChange";
	private static final String ON_SCROLLABLE_CHANGE = "onScrollableChange";
	private static final String ON_SHOW_MESSAGES_CHANGE = "onShowMessagesChange";
	private static final String ON_SORT_BY_CHANGE = "onSortByChange";
	private static final String ON_SORTABLE_CHANGE = "onSortableChange";
	private static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_SUMMARY_CHANGE = "onSummaryChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_VIEW_CHANGE = "onViewChange";
	private static final String ON_VIEW_CONFIG_CHANGE = "onViewConfigChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";

	public java.lang.Object getAutoSync() {
		return (java.lang.Object) getStateHelper().eval(AUTO_SYNC, null);
	}

	public void setAutoSync(java.lang.Object autoSync) {
		getStateHelper().put(AUTO_SYNC, autoSync);
	}

	public java.lang.Object getBodyConfig() {
		return (java.lang.Object) getStateHelper().eval(BODY_CONFIG, null);
	}

	public void setBodyConfig(java.lang.Object bodyConfig) {
		getStateHelper().put(BODY_CONFIG, bodyConfig);
	}

	public java.lang.Object getBodyView() {
		return (java.lang.Object) getStateHelper().eval(BODY_VIEW, null);
	}

	public void setBodyView(java.lang.Object bodyView) {
		getStateHelper().put(BODY_VIEW, bodyView);
	}

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.Object getCaption() {
		return (java.lang.Object) getStateHelper().eval(CAPTION, null);
	}

	public void setCaption(java.lang.Object caption) {
		getStateHelper().put(CAPTION, caption);
	}

	public java.lang.Object getColumns() {
		return (java.lang.Object) getStateHelper().eval(COLUMNS, null);
	}

	public void setColumns(java.lang.Object columns) {
		getStateHelper().put(COLUMNS, columns);
	}

	public java.lang.Object getColumnset() {
		return (java.lang.Object) getStateHelper().eval(COLUMNSET, null);
	}

	public void setColumnset(java.lang.Object columnset) {
		getStateHelper().put(COLUMNSET, columnset);
	}

	public java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	public void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	public java.lang.Object getData() {
		return (java.lang.Object) getStateHelper().eval(DATA, null);
	}

	public void setData(java.lang.Object data) {
		getStateHelper().put(DATA, data);
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

	public java.lang.String getEditEvent() {
		return (java.lang.String) getStateHelper().eval(EDIT_EVENT, null);
	}

	public void setEditEvent(java.lang.String editEvent) {
		getStateHelper().put(EDIT_EVENT, editEvent);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.Object getFooterConfig() {
		return (java.lang.Object) getStateHelper().eval(FOOTER_CONFIG, null);
	}

	public void setFooterConfig(java.lang.Object footerConfig) {
		getStateHelper().put(FOOTER_CONFIG, footerConfig);
	}

	public java.lang.Object getFooterView() {
		return (java.lang.Object) getStateHelper().eval(FOOTER_VIEW, null);
	}

	public void setFooterView(java.lang.Object footerView) {
		getStateHelper().put(FOOTER_VIEW, footerView);
	}

	public java.lang.Object getHeaderConfig() {
		return (java.lang.Object) getStateHelper().eval(HEADER_CONFIG, null);
	}

	public void setHeaderConfig(java.lang.Object headerConfig) {
		getStateHelper().put(HEADER_CONFIG, headerConfig);
	}

	public java.lang.Object getHeaderView() {
		return (java.lang.Object) getStateHelper().eval(HEADER_VIEW, null);
	}

	public void setHeaderView(java.lang.Object headerView) {
		getStateHelper().put(HEADER_VIEW, headerView);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	public void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	public java.lang.String getPropertylistId() {
		return (java.lang.String) getStateHelper().eval(PROPERTYLIST_ID, null);
	}

	public void setPropertylistId(java.lang.String propertylistId) {
		getStateHelper().put(PROPERTYLIST_ID, propertylistId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getPropertylistLocale() {
		return (java.lang.String) getStateHelper().eval(PROPERTYLIST_LOCALE, null);
	}

	public void setPropertylistLocale(java.lang.String propertylistLocale) {
		getStateHelper().put(PROPERTYLIST_LOCALE, propertylistLocale);
	}

	public java.lang.Object getRecordType() {
		return (java.lang.Object) getStateHelper().eval(RECORD_TYPE, null);
	}

	public void setRecordType(java.lang.Object recordType) {
		getStateHelper().put(RECORD_TYPE, recordType);
	}

	public java.lang.Object getRecordset() {
		return (java.lang.Object) getStateHelper().eval(RECORDSET, null);
	}

	public void setRecordset(java.lang.Object recordset) {
		getStateHelper().put(RECORDSET, recordset);
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

	public java.lang.Boolean getScrollable() {
		return (java.lang.Boolean) getStateHelper().eval(SCROLLABLE, null);
	}

	public void setScrollable(java.lang.Boolean scrollable) {
		getStateHelper().put(SCROLLABLE, scrollable);
	}

	public java.lang.Object getShowMessages() {
		return (java.lang.Object) getStateHelper().eval(SHOW_MESSAGES, null);
	}

	public void setShowMessages(java.lang.Object showMessages) {
		getStateHelper().put(SHOW_MESSAGES, showMessages);
	}

	public java.lang.Object getSortBy() {
		return (java.lang.Object) getStateHelper().eval(SORT_BY, null);
	}

	public void setSortBy(java.lang.Object sortBy) {
		getStateHelper().put(SORT_BY, sortBy);
	}

	public java.lang.Object getSortable() {
		return (java.lang.Object) getStateHelper().eval(SORTABLE, null);
	}

	public void setSortable(java.lang.Object sortable) {
		getStateHelper().put(SORTABLE, sortable);
	}

	public java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	public void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
	}

	public java.lang.String getStrings() {
		return (java.lang.String) getStateHelper().eval(STRINGS, null);
	}

	public void setStrings(java.lang.String strings) {
		getStateHelper().put(STRINGS, strings);
	}

	public java.lang.Object getSummary() {
		return (java.lang.Object) getStateHelper().eval(SUMMARY, null);
	}

	public void setSummary(java.lang.Object summary) {
		getStateHelper().put(SUMMARY, summary);
	}

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.Object getView() {
		return (java.lang.Object) getStateHelper().eval(VIEW, null);
	}

	public void setView(java.lang.Object view) {
		getStateHelper().put(VIEW, view);
	}

	public java.lang.Object getViewConfig() {
		return (java.lang.Object) getStateHelper().eval(VIEW_CONFIG, null);
	}

	public void setViewConfig(java.lang.Object viewConfig) {
		getStateHelper().put(VIEW_CONFIG, viewConfig);
	}

	public java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	public void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	public java.lang.String getWidth() {
		return (java.lang.String) getStateHelper().eval(WIDTH, null);
	}

	public void setWidth(java.lang.String width) {
		getStateHelper().put(WIDTH, width);
	}

	public java.lang.String getAfterAutoSyncChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AUTO_SYNC_CHANGE, null);
	}

	public void setAfterAutoSyncChange(java.lang.String afterAutoSyncChange) {
		getStateHelper().put(AFTER_AUTO_SYNC_CHANGE, afterAutoSyncChange);
	}

	public java.lang.String getAfterBodyConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONFIG_CHANGE, null);
	}

	public void setAfterBodyConfigChange(java.lang.String afterBodyConfigChange) {
		getStateHelper().put(AFTER_BODY_CONFIG_CHANGE, afterBodyConfigChange);
	}

	public java.lang.String getAfterBodyViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_VIEW_CHANGE, null);
	}

	public void setAfterBodyViewChange(java.lang.String afterBodyViewChange) {
		getStateHelper().put(AFTER_BODY_VIEW_CHANGE, afterBodyViewChange);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterCaptionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CAPTION_CHANGE, null);
	}

	public void setAfterCaptionChange(java.lang.String afterCaptionChange) {
		getStateHelper().put(AFTER_CAPTION_CHANGE, afterCaptionChange);
	}

	public java.lang.String getAfterColumnsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLUMNS_CHANGE, null);
	}

	public void setAfterColumnsChange(java.lang.String afterColumnsChange) {
		getStateHelper().put(AFTER_COLUMNS_CHANGE, afterColumnsChange);
	}

	public java.lang.String getAfterColumnsetChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLUMNSET_CHANGE, null);
	}

	public void setAfterColumnsetChange(java.lang.String afterColumnsetChange) {
		getStateHelper().put(AFTER_COLUMNSET_CHANGE, afterColumnsetChange);
	}

	public java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	public java.lang.String getAfterDataChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATA_CHANGE, null);
	}

	public void setAfterDataChange(java.lang.String afterDataChange) {
		getStateHelper().put(AFTER_DATA_CHANGE, afterDataChange);
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

	public java.lang.String getAfterEditEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EDIT_EVENT_CHANGE, null);
	}

	public void setAfterEditEventChange(java.lang.String afterEditEventChange) {
		getStateHelper().put(AFTER_EDIT_EVENT_CHANGE, afterEditEventChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterFooterConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOOTER_CONFIG_CHANGE, null);
	}

	public void setAfterFooterConfigChange(java.lang.String afterFooterConfigChange) {
		getStateHelper().put(AFTER_FOOTER_CONFIG_CHANGE, afterFooterConfigChange);
	}

	public java.lang.String getAfterFooterViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOOTER_VIEW_CHANGE, null);
	}

	public void setAfterFooterViewChange(java.lang.String afterFooterViewChange) {
		getStateHelper().put(AFTER_FOOTER_VIEW_CHANGE, afterFooterViewChange);
	}

	public java.lang.String getAfterHeaderConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_CONFIG_CHANGE, null);
	}

	public void setAfterHeaderConfigChange(java.lang.String afterHeaderConfigChange) {
		getStateHelper().put(AFTER_HEADER_CONFIG_CHANGE, afterHeaderConfigChange);
	}

	public java.lang.String getAfterHeaderViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_VIEW_CHANGE, null);
	}

	public void setAfterHeaderViewChange(java.lang.String afterHeaderViewChange) {
		getStateHelper().put(AFTER_HEADER_VIEW_CHANGE, afterHeaderViewChange);
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

	public java.lang.String getAfterRecordTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RECORD_TYPE_CHANGE, null);
	}

	public void setAfterRecordTypeChange(java.lang.String afterRecordTypeChange) {
		getStateHelper().put(AFTER_RECORD_TYPE_CHANGE, afterRecordTypeChange);
	}

	public java.lang.String getAfterRecordsetChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RECORDSET_CHANGE, null);
	}

	public void setAfterRecordsetChange(java.lang.String afterRecordsetChange) {
		getStateHelper().put(AFTER_RECORDSET_CHANGE, afterRecordsetChange);
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

	public java.lang.String getAfterScrollableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCROLLABLE_CHANGE, null);
	}

	public void setAfterScrollableChange(java.lang.String afterScrollableChange) {
		getStateHelper().put(AFTER_SCROLLABLE_CHANGE, afterScrollableChange);
	}

	public java.lang.String getAfterShowMessagesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_MESSAGES_CHANGE, null);
	}

	public void setAfterShowMessagesChange(java.lang.String afterShowMessagesChange) {
		getStateHelper().put(AFTER_SHOW_MESSAGES_CHANGE, afterShowMessagesChange);
	}

	public java.lang.String getAfterSortByChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SORT_BY_CHANGE, null);
	}

	public void setAfterSortByChange(java.lang.String afterSortByChange) {
		getStateHelper().put(AFTER_SORT_BY_CHANGE, afterSortByChange);
	}

	public java.lang.String getAfterSortableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SORTABLE_CHANGE, null);
	}

	public void setAfterSortableChange(java.lang.String afterSortableChange) {
		getStateHelper().put(AFTER_SORTABLE_CHANGE, afterSortableChange);
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

	public java.lang.String getAfterSummaryChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SUMMARY_CHANGE, null);
	}

	public void setAfterSummaryChange(java.lang.String afterSummaryChange) {
		getStateHelper().put(AFTER_SUMMARY_CHANGE, afterSummaryChange);
	}

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	public java.lang.String getAfterViewChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VIEW_CHANGE, null);
	}

	public void setAfterViewChange(java.lang.String afterViewChange) {
		getStateHelper().put(AFTER_VIEW_CHANGE, afterViewChange);
	}

	public java.lang.String getAfterViewConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VIEW_CONFIG_CHANGE, null);
	}

	public void setAfterViewConfigChange(java.lang.String afterViewConfigChange) {
		getStateHelper().put(AFTER_VIEW_CONFIG_CHANGE, afterViewConfigChange);
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

	public java.lang.String getOnAutoSyncChange() {
		return (java.lang.String) getStateHelper().eval(ON_AUTO_SYNC_CHANGE, null);
	}

	public void setOnAutoSyncChange(java.lang.String onAutoSyncChange) {
		getStateHelper().put(ON_AUTO_SYNC_CHANGE, onAutoSyncChange);
	}

	public java.lang.String getOnBodyConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONFIG_CHANGE, null);
	}

	public void setOnBodyConfigChange(java.lang.String onBodyConfigChange) {
		getStateHelper().put(ON_BODY_CONFIG_CHANGE, onBodyConfigChange);
	}

	public java.lang.String getOnBodyViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_VIEW_CHANGE, null);
	}

	public void setOnBodyViewChange(java.lang.String onBodyViewChange) {
		getStateHelper().put(ON_BODY_VIEW_CHANGE, onBodyViewChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnCaptionChange() {
		return (java.lang.String) getStateHelper().eval(ON_CAPTION_CHANGE, null);
	}

	public void setOnCaptionChange(java.lang.String onCaptionChange) {
		getStateHelper().put(ON_CAPTION_CHANGE, onCaptionChange);
	}

	public java.lang.String getOnColumnsChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLUMNS_CHANGE, null);
	}

	public void setOnColumnsChange(java.lang.String onColumnsChange) {
		getStateHelper().put(ON_COLUMNS_CHANGE, onColumnsChange);
	}

	public java.lang.String getOnColumnsetChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLUMNSET_CHANGE, null);
	}

	public void setOnColumnsetChange(java.lang.String onColumnsetChange) {
		getStateHelper().put(ON_COLUMNSET_CHANGE, onColumnsetChange);
	}

	public java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	public java.lang.String getOnDataChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATA_CHANGE, null);
	}

	public void setOnDataChange(java.lang.String onDataChange) {
		getStateHelper().put(ON_DATA_CHANGE, onDataChange);
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

	public java.lang.String getOnEditEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_EDIT_EVENT_CHANGE, null);
	}

	public void setOnEditEventChange(java.lang.String onEditEventChange) {
		getStateHelper().put(ON_EDIT_EVENT_CHANGE, onEditEventChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnFooterConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOOTER_CONFIG_CHANGE, null);
	}

	public void setOnFooterConfigChange(java.lang.String onFooterConfigChange) {
		getStateHelper().put(ON_FOOTER_CONFIG_CHANGE, onFooterConfigChange);
	}

	public java.lang.String getOnFooterViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOOTER_VIEW_CHANGE, null);
	}

	public void setOnFooterViewChange(java.lang.String onFooterViewChange) {
		getStateHelper().put(ON_FOOTER_VIEW_CHANGE, onFooterViewChange);
	}

	public java.lang.String getOnHeaderConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_CONFIG_CHANGE, null);
	}

	public void setOnHeaderConfigChange(java.lang.String onHeaderConfigChange) {
		getStateHelper().put(ON_HEADER_CONFIG_CHANGE, onHeaderConfigChange);
	}

	public java.lang.String getOnHeaderViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_VIEW_CHANGE, null);
	}

	public void setOnHeaderViewChange(java.lang.String onHeaderViewChange) {
		getStateHelper().put(ON_HEADER_VIEW_CHANGE, onHeaderViewChange);
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

	public java.lang.String getOnRecordTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_RECORD_TYPE_CHANGE, null);
	}

	public void setOnRecordTypeChange(java.lang.String onRecordTypeChange) {
		getStateHelper().put(ON_RECORD_TYPE_CHANGE, onRecordTypeChange);
	}

	public java.lang.String getOnRecordsetChange() {
		return (java.lang.String) getStateHelper().eval(ON_RECORDSET_CHANGE, null);
	}

	public void setOnRecordsetChange(java.lang.String onRecordsetChange) {
		getStateHelper().put(ON_RECORDSET_CHANGE, onRecordsetChange);
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

	public java.lang.String getOnScrollableChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCROLLABLE_CHANGE, null);
	}

	public void setOnScrollableChange(java.lang.String onScrollableChange) {
		getStateHelper().put(ON_SCROLLABLE_CHANGE, onScrollableChange);
	}

	public java.lang.String getOnShowMessagesChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_MESSAGES_CHANGE, null);
	}

	public void setOnShowMessagesChange(java.lang.String onShowMessagesChange) {
		getStateHelper().put(ON_SHOW_MESSAGES_CHANGE, onShowMessagesChange);
	}

	public java.lang.String getOnSortByChange() {
		return (java.lang.String) getStateHelper().eval(ON_SORT_BY_CHANGE, null);
	}

	public void setOnSortByChange(java.lang.String onSortByChange) {
		getStateHelper().put(ON_SORT_BY_CHANGE, onSortByChange);
	}

	public java.lang.String getOnSortableChange() {
		return (java.lang.String) getStateHelper().eval(ON_SORTABLE_CHANGE, null);
	}

	public void setOnSortableChange(java.lang.String onSortableChange) {
		getStateHelper().put(ON_SORTABLE_CHANGE, onSortableChange);
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

	public java.lang.String getOnSummaryChange() {
		return (java.lang.String) getStateHelper().eval(ON_SUMMARY_CHANGE, null);
	}

	public void setOnSummaryChange(java.lang.String onSummaryChange) {
		getStateHelper().put(ON_SUMMARY_CHANGE, onSummaryChange);
	}

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	public java.lang.String getOnViewChange() {
		return (java.lang.String) getStateHelper().eval(ON_VIEW_CHANGE, null);
	}

	public void setOnViewChange(java.lang.String onViewChange) {
		getStateHelper().put(ON_VIEW_CHANGE, onViewChange);
	}

	public java.lang.String getOnViewConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_VIEW_CONFIG_CHANGE, null);
	}

	public void setOnViewConfigChange(java.lang.String onViewConfigChange) {
		getStateHelper().put(ON_VIEW_CONFIG_CHANGE, onViewConfigChange);
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