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

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
public abstract class PropertyListRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-property-list";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		PropertyList propertyList = (PropertyList) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var propertyList = new A.PropertyList");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAutoSync(renderedAttributes, propertyList);
		renderBodyConfig(renderedAttributes, propertyList);
		renderBodyView(renderedAttributes, propertyList);
		renderBoundingBox(renderedAttributes, propertyList);
		renderCaption(renderedAttributes, propertyList);
		renderColumns(renderedAttributes, propertyList);
		renderColumnset(renderedAttributes, propertyList);
		renderContentBox(renderedAttributes, propertyList);
		renderData(renderedAttributes, propertyList);
		renderDestroyed(renderedAttributes, propertyList);
		renderDisabled(renderedAttributes, propertyList);
		renderEditEvent(renderedAttributes, propertyList);
		renderFocused(renderedAttributes, propertyList);
		renderFooterConfig(renderedAttributes, propertyList);
		renderFooterView(renderedAttributes, propertyList);
		renderHeaderConfig(renderedAttributes, propertyList);
		renderHeaderView(renderedAttributes, propertyList);
		renderHeight(renderedAttributes, propertyList);
		renderPropertyListId(renderedAttributes, propertyList);
		renderInitialized(renderedAttributes, propertyList);
		renderPropertyListLocale(renderedAttributes, propertyList);
		renderRecordType(renderedAttributes, propertyList);
		renderRecordset(renderedAttributes, propertyList);
		renderRender(renderedAttributes, propertyList);
		renderRendered(renderedAttributes, propertyList);
		renderScrollable(renderedAttributes, propertyList);
		renderShowMessages(renderedAttributes, propertyList);
		renderSortBy(renderedAttributes, propertyList);
		renderSortable(renderedAttributes, propertyList);
		renderSrcNode(renderedAttributes, propertyList);
		renderStrings(renderedAttributes, propertyList);
		renderSummary(renderedAttributes, propertyList);
		renderTabIndex(renderedAttributes, propertyList);
		renderView(renderedAttributes, propertyList);
		renderViewConfig(renderedAttributes, propertyList);
		renderVisible(renderedAttributes, propertyList);
		renderWidth(renderedAttributes, propertyList);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAutoSyncChange(renderedAfterEvents, propertyList);
		renderAfterBodyConfigChange(renderedAfterEvents, propertyList);
		renderAfterBodyViewChange(renderedAfterEvents, propertyList);
		renderAfterBoundingBoxChange(renderedAfterEvents, propertyList);
		renderAfterCaptionChange(renderedAfterEvents, propertyList);
		renderAfterColumnsChange(renderedAfterEvents, propertyList);
		renderAfterColumnsetChange(renderedAfterEvents, propertyList);
		renderAfterContentBoxChange(renderedAfterEvents, propertyList);
		renderAfterDataChange(renderedAfterEvents, propertyList);
		renderAfterDestroyedChange(renderedAfterEvents, propertyList);
		renderAfterDisabledChange(renderedAfterEvents, propertyList);
		renderAfterEditEventChange(renderedAfterEvents, propertyList);
		renderAfterFocusedChange(renderedAfterEvents, propertyList);
		renderAfterFooterConfigChange(renderedAfterEvents, propertyList);
		renderAfterFooterViewChange(renderedAfterEvents, propertyList);
		renderAfterHeaderConfigChange(renderedAfterEvents, propertyList);
		renderAfterHeaderViewChange(renderedAfterEvents, propertyList);
		renderAfterHeightChange(renderedAfterEvents, propertyList);
		renderAfterIdChange(renderedAfterEvents, propertyList);
		renderAfterInitializedChange(renderedAfterEvents, propertyList);
		renderAfterLocaleChange(renderedAfterEvents, propertyList);
		renderAfterRecordTypeChange(renderedAfterEvents, propertyList);
		renderAfterRecordsetChange(renderedAfterEvents, propertyList);
		renderAfterRenderChange(renderedAfterEvents, propertyList);
		renderAfterRenderedChange(renderedAfterEvents, propertyList);
		renderAfterScrollableChange(renderedAfterEvents, propertyList);
		renderAfterShowMessagesChange(renderedAfterEvents, propertyList);
		renderAfterSortByChange(renderedAfterEvents, propertyList);
		renderAfterSortableChange(renderedAfterEvents, propertyList);
		renderAfterSrcNodeChange(renderedAfterEvents, propertyList);
		renderAfterStringsChange(renderedAfterEvents, propertyList);
		renderAfterSummaryChange(renderedAfterEvents, propertyList);
		renderAfterTabIndexChange(renderedAfterEvents, propertyList);
		renderAfterViewChange(renderedAfterEvents, propertyList);
		renderAfterViewConfigChange(renderedAfterEvents, propertyList);
		renderAfterVisibleChange(renderedAfterEvents, propertyList);
		renderAfterWidthChange(renderedAfterEvents, propertyList);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnAutoSyncChange(renderedOnEvents, propertyList);
		renderOnBodyConfigChange(renderedOnEvents, propertyList);
		renderOnBodyViewChange(renderedOnEvents, propertyList);
		renderOnBoundingBoxChange(renderedOnEvents, propertyList);
		renderOnCaptionChange(renderedOnEvents, propertyList);
		renderOnColumnsChange(renderedOnEvents, propertyList);
		renderOnColumnsetChange(renderedOnEvents, propertyList);
		renderOnContentBoxChange(renderedOnEvents, propertyList);
		renderOnDataChange(renderedOnEvents, propertyList);
		renderOnDestroyedChange(renderedOnEvents, propertyList);
		renderOnDisabledChange(renderedOnEvents, propertyList);
		renderOnEditEventChange(renderedOnEvents, propertyList);
		renderOnFocusedChange(renderedOnEvents, propertyList);
		renderOnFooterConfigChange(renderedOnEvents, propertyList);
		renderOnFooterViewChange(renderedOnEvents, propertyList);
		renderOnHeaderConfigChange(renderedOnEvents, propertyList);
		renderOnHeaderViewChange(renderedOnEvents, propertyList);
		renderOnHeightChange(renderedOnEvents, propertyList);
		renderOnIdChange(renderedOnEvents, propertyList);
		renderOnInitializedChange(renderedOnEvents, propertyList);
		renderOnLocaleChange(renderedOnEvents, propertyList);
		renderOnRecordTypeChange(renderedOnEvents, propertyList);
		renderOnRecordsetChange(renderedOnEvents, propertyList);
		renderOnRenderChange(renderedOnEvents, propertyList);
		renderOnRenderedChange(renderedOnEvents, propertyList);
		renderOnScrollableChange(renderedOnEvents, propertyList);
		renderOnShowMessagesChange(renderedOnEvents, propertyList);
		renderOnSortByChange(renderedOnEvents, propertyList);
		renderOnSortableChange(renderedOnEvents, propertyList);
		renderOnSrcNodeChange(renderedOnEvents, propertyList);
		renderOnStringsChange(renderedOnEvents, propertyList);
		renderOnSummaryChange(renderedOnEvents, propertyList);
		renderOnTabIndexChange(renderedOnEvents, propertyList);
		renderOnViewChange(renderedOnEvents, propertyList);
		renderOnViewConfigChange(renderedOnEvents, propertyList);
		renderOnVisibleChange(renderedOnEvents, propertyList);
		renderOnWidthChange(renderedOnEvents, propertyList);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAutoSync(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object autoSync = propertyList.getAutoSync();

		if (autoSync != null) {
			renderedAttributes.add(renderString(PropertyList.AUTO_SYNC, autoSync));
		}
	}

	protected void renderBodyConfig(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object bodyConfig = propertyList.getBodyConfig();

		if (bodyConfig != null) {
			renderedAttributes.add(renderString(PropertyList.BODY_CONFIG, bodyConfig));
		}
	}

	protected void renderBodyView(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object bodyView = propertyList.getBodyView();

		if (bodyView != null) {
			renderedAttributes.add(renderString(PropertyList.BODY_VIEW, bodyView));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String boundingBox = propertyList.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(PropertyList.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCaption(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object caption = propertyList.getCaption();

		if (caption != null) {
			renderedAttributes.add(renderString(PropertyList.CAPTION, caption));
		}
	}

	protected void renderColumns(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object columns = propertyList.getColumns();

		if (columns != null) {
			renderedAttributes.add(renderString(PropertyList.COLUMNS, columns));
		}
	}

	protected void renderColumnset(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object columnset = propertyList.getColumnset();

		if (columnset != null) {
			renderedAttributes.add(renderString(PropertyList.COLUMNSET, columnset));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String contentBox = propertyList.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(PropertyList.CONTENT_BOX, contentBox));
		}
	}

	protected void renderData(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object data = propertyList.getData();

		if (data != null) {
			renderedAttributes.add(renderString(PropertyList.DATA, data));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean destroyed = propertyList.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(PropertyList.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean disabled = propertyList.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(PropertyList.DISABLED, disabled));
		}
	}

	protected void renderEditEvent(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String editEvent = propertyList.getEditEvent();

		if (editEvent != null) {
			renderedAttributes.add(renderString(PropertyList.EDIT_EVENT, editEvent));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean focused = propertyList.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(PropertyList.FOCUSED, focused));
		}
	}

	protected void renderFooterConfig(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object footerConfig = propertyList.getFooterConfig();

		if (footerConfig != null) {
			renderedAttributes.add(renderString(PropertyList.FOOTER_CONFIG, footerConfig));
		}
	}

	protected void renderFooterView(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object footerView = propertyList.getFooterView();

		if (footerView != null) {
			renderedAttributes.add(renderString(PropertyList.FOOTER_VIEW, footerView));
		}
	}

	protected void renderHeaderConfig(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object headerConfig = propertyList.getHeaderConfig();

		if (headerConfig != null) {
			renderedAttributes.add(renderString(PropertyList.HEADER_CONFIG, headerConfig));
		}
	}

	protected void renderHeaderView(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object headerView = propertyList.getHeaderView();

		if (headerView != null) {
			renderedAttributes.add(renderString(PropertyList.HEADER_VIEW, headerView));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object height = propertyList.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(PropertyList.HEIGHT, height));
		}
	}

	protected void renderPropertyListId(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String propertyListId = propertyList.getPropertyListId();

		if (propertyListId != null) {
			renderedAttributes.add(renderString(PropertyList.PROPERTY_LIST_ID, propertyListId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean initialized = propertyList.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(PropertyList.INITIALIZED, initialized));
		}
	}

	protected void renderPropertyListLocale(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String propertyListLocale = propertyList.getPropertyListLocale();

		if (propertyListLocale != null) {
			renderedAttributes.add(renderString(PropertyList.PROPERTY_LIST_LOCALE, propertyListLocale));
		}
	}

	protected void renderRecordType(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object recordType = propertyList.getRecordType();

		if (recordType != null) {
			renderedAttributes.add(renderString(PropertyList.RECORD_TYPE, recordType));
		}
	}

	protected void renderRecordset(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object recordset = propertyList.getRecordset();

		if (recordset != null) {
			renderedAttributes.add(renderString(PropertyList.RECORDSET, recordset));
		}
	}

	protected void renderRender(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object render = propertyList.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(PropertyList.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean rendered = propertyList.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(PropertyList.RENDERED, rendered));
		}
	}

	protected void renderScrollable(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean scrollable = propertyList.getScrollable();

		if (scrollable != null) {
			renderedAttributes.add(renderBoolean(PropertyList.SCROLLABLE, scrollable));
		}
	}

	protected void renderShowMessages(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object showMessages = propertyList.getShowMessages();

		if (showMessages != null) {
			renderedAttributes.add(renderString(PropertyList.SHOW_MESSAGES, showMessages));
		}
	}

	protected void renderSortBy(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object sortBy = propertyList.getSortBy();

		if (sortBy != null) {
			renderedAttributes.add(renderString(PropertyList.SORT_BY, sortBy));
		}
	}

	protected void renderSortable(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object sortable = propertyList.getSortable();

		if (sortable != null) {
			renderedAttributes.add(renderString(PropertyList.SORTABLE, sortable));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String srcNode = propertyList.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(PropertyList.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String strings = propertyList.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderString(PropertyList.STRINGS, strings));
		}
	}

	protected void renderSummary(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object summary = propertyList.getSummary();

		if (summary != null) {
			renderedAttributes.add(renderString(PropertyList.SUMMARY, summary));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object tabIndex = propertyList.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(PropertyList.TAB_INDEX, tabIndex));
		}
	}

	protected void renderView(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object view = propertyList.getView();

		if (view != null) {
			renderedAttributes.add(renderString(PropertyList.VIEW, view));
		}
	}

	protected void renderViewConfig(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object viewConfig = propertyList.getViewConfig();

		if (viewConfig != null) {
			renderedAttributes.add(renderString(PropertyList.VIEW_CONFIG, viewConfig));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean visible = propertyList.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(PropertyList.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String width = propertyList.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(PropertyList.WIDTH, width));
		}
	}

	protected void renderAfterAutoSyncChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterAutoSyncChange = propertyList.getAfterAutoSyncChange();

		if (afterAutoSyncChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_AUTO_SYNC_CHANGE, afterAutoSyncChange));
		}
	}

	protected void renderAfterBodyConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterBodyConfigChange = propertyList.getAfterBodyConfigChange();

		if (afterBodyConfigChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_BODY_CONFIG_CHANGE, afterBodyConfigChange));
		}
	}

	protected void renderAfterBodyViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterBodyViewChange = propertyList.getAfterBodyViewChange();

		if (afterBodyViewChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_BODY_VIEW_CHANGE, afterBodyViewChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterBoundingBoxChange = propertyList.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCaptionChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterCaptionChange = propertyList.getAfterCaptionChange();

		if (afterCaptionChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_CAPTION_CHANGE, afterCaptionChange));
		}
	}

	protected void renderAfterColumnsChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterColumnsChange = propertyList.getAfterColumnsChange();

		if (afterColumnsChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_COLUMNS_CHANGE, afterColumnsChange));
		}
	}

	protected void renderAfterColumnsetChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterColumnsetChange = propertyList.getAfterColumnsetChange();

		if (afterColumnsetChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_COLUMNSET_CHANGE, afterColumnsetChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterContentBoxChange = propertyList.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDataChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterDataChange = propertyList.getAfterDataChange();

		if (afterDataChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_DATA_CHANGE, afterDataChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterDestroyedChange = propertyList.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterDisabledChange = propertyList.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterEditEventChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterEditEventChange = propertyList.getAfterEditEventChange();

		if (afterEditEventChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_EDIT_EVENT_CHANGE, afterEditEventChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterFocusedChange = propertyList.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterFooterConfigChange = propertyList.getAfterFooterConfigChange();

		if (afterFooterConfigChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_FOOTER_CONFIG_CHANGE, afterFooterConfigChange));
		}
	}

	protected void renderAfterFooterViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterFooterViewChange = propertyList.getAfterFooterViewChange();

		if (afterFooterViewChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_FOOTER_VIEW_CHANGE, afterFooterViewChange));
		}
	}

	protected void renderAfterHeaderConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterHeaderConfigChange = propertyList.getAfterHeaderConfigChange();

		if (afterHeaderConfigChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_HEADER_CONFIG_CHANGE, afterHeaderConfigChange));
		}
	}

	protected void renderAfterHeaderViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterHeaderViewChange = propertyList.getAfterHeaderViewChange();

		if (afterHeaderViewChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_HEADER_VIEW_CHANGE, afterHeaderViewChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterHeightChange = propertyList.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterIdChange = propertyList.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterInitializedChange = propertyList.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterLocaleChange = propertyList.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterRecordTypeChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterRecordTypeChange = propertyList.getAfterRecordTypeChange();

		if (afterRecordTypeChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_RECORD_TYPE_CHANGE, afterRecordTypeChange));
		}
	}

	protected void renderAfterRecordsetChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterRecordsetChange = propertyList.getAfterRecordsetChange();

		if (afterRecordsetChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_RECORDSET_CHANGE, afterRecordsetChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterRenderChange = propertyList.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterRenderedChange = propertyList.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterScrollableChange = propertyList.getAfterScrollableChange();

		if (afterScrollableChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
		}
	}

	protected void renderAfterShowMessagesChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterShowMessagesChange = propertyList.getAfterShowMessagesChange();

		if (afterShowMessagesChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_SHOW_MESSAGES_CHANGE, afterShowMessagesChange));
		}
	}

	protected void renderAfterSortByChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterSortByChange = propertyList.getAfterSortByChange();

		if (afterSortByChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_SORT_BY_CHANGE, afterSortByChange));
		}
	}

	protected void renderAfterSortableChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterSortableChange = propertyList.getAfterSortableChange();

		if (afterSortableChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_SORTABLE_CHANGE, afterSortableChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterSrcNodeChange = propertyList.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterStringsChange = propertyList.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterSummaryChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterSummaryChange = propertyList.getAfterSummaryChange();

		if (afterSummaryChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_SUMMARY_CHANGE, afterSummaryChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterTabIndexChange = propertyList.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterViewChange = propertyList.getAfterViewChange();

		if (afterViewChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_VIEW_CHANGE, afterViewChange));
		}
	}

	protected void renderAfterViewConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterViewConfigChange = propertyList.getAfterViewConfigChange();

		if (afterViewConfigChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_VIEW_CONFIG_CHANGE, afterViewConfigChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterVisibleChange = propertyList.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterWidthChange = propertyList.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(PropertyList.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnAutoSyncChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onAutoSyncChange = propertyList.getOnAutoSyncChange();

		if (onAutoSyncChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_AUTO_SYNC_CHANGE, onAutoSyncChange));
		}
	}

	protected void renderOnBodyConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onBodyConfigChange = propertyList.getOnBodyConfigChange();

		if (onBodyConfigChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_BODY_CONFIG_CHANGE, onBodyConfigChange));
		}
	}

	protected void renderOnBodyViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onBodyViewChange = propertyList.getOnBodyViewChange();

		if (onBodyViewChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_BODY_VIEW_CHANGE, onBodyViewChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onBoundingBoxChange = propertyList.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCaptionChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onCaptionChange = propertyList.getOnCaptionChange();

		if (onCaptionChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_CAPTION_CHANGE, onCaptionChange));
		}
	}

	protected void renderOnColumnsChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onColumnsChange = propertyList.getOnColumnsChange();

		if (onColumnsChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_COLUMNS_CHANGE, onColumnsChange));
		}
	}

	protected void renderOnColumnsetChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onColumnsetChange = propertyList.getOnColumnsetChange();

		if (onColumnsetChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_COLUMNSET_CHANGE, onColumnsetChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onContentBoxChange = propertyList.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDataChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onDataChange = propertyList.getOnDataChange();

		if (onDataChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_DATA_CHANGE, onDataChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onDestroyedChange = propertyList.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onDisabledChange = propertyList.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnEditEventChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onEditEventChange = propertyList.getOnEditEventChange();

		if (onEditEventChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_EDIT_EVENT_CHANGE, onEditEventChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onFocusedChange = propertyList.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onFooterConfigChange = propertyList.getOnFooterConfigChange();

		if (onFooterConfigChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_FOOTER_CONFIG_CHANGE, onFooterConfigChange));
		}
	}

	protected void renderOnFooterViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onFooterViewChange = propertyList.getOnFooterViewChange();

		if (onFooterViewChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_FOOTER_VIEW_CHANGE, onFooterViewChange));
		}
	}

	protected void renderOnHeaderConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onHeaderConfigChange = propertyList.getOnHeaderConfigChange();

		if (onHeaderConfigChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_HEADER_CONFIG_CHANGE, onHeaderConfigChange));
		}
	}

	protected void renderOnHeaderViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onHeaderViewChange = propertyList.getOnHeaderViewChange();

		if (onHeaderViewChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_HEADER_VIEW_CHANGE, onHeaderViewChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onHeightChange = propertyList.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onIdChange = propertyList.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onInitializedChange = propertyList.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onLocaleChange = propertyList.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnRecordTypeChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onRecordTypeChange = propertyList.getOnRecordTypeChange();

		if (onRecordTypeChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_RECORD_TYPE_CHANGE, onRecordTypeChange));
		}
	}

	protected void renderOnRecordsetChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onRecordsetChange = propertyList.getOnRecordsetChange();

		if (onRecordsetChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_RECORDSET_CHANGE, onRecordsetChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onRenderChange = propertyList.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onRenderedChange = propertyList.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onScrollableChange = propertyList.getOnScrollableChange();

		if (onScrollableChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_SCROLLABLE_CHANGE, onScrollableChange));
		}
	}

	protected void renderOnShowMessagesChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onShowMessagesChange = propertyList.getOnShowMessagesChange();

		if (onShowMessagesChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_SHOW_MESSAGES_CHANGE, onShowMessagesChange));
		}
	}

	protected void renderOnSortByChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onSortByChange = propertyList.getOnSortByChange();

		if (onSortByChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_SORT_BY_CHANGE, onSortByChange));
		}
	}

	protected void renderOnSortableChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onSortableChange = propertyList.getOnSortableChange();

		if (onSortableChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_SORTABLE_CHANGE, onSortableChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onSrcNodeChange = propertyList.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onStringsChange = propertyList.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnSummaryChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onSummaryChange = propertyList.getOnSummaryChange();

		if (onSummaryChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_SUMMARY_CHANGE, onSummaryChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onTabIndexChange = propertyList.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onViewChange = propertyList.getOnViewChange();

		if (onViewChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_VIEW_CHANGE, onViewChange));
		}
	}

	protected void renderOnViewConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onViewConfigChange = propertyList.getOnViewConfigChange();

		if (onViewConfigChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_VIEW_CONFIG_CHANGE, onViewConfigChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onVisibleChange = propertyList.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onWidthChange = propertyList.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(PropertyList.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}