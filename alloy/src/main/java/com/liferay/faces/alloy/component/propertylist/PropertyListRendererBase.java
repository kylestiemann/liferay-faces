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

		if (propertyList.getAutoSync() != null) {
			renderAutoSync(renderedAttributes, propertyList);
		}
		
		if (propertyList.getBodyConfig() != null) {
			renderBodyConfig(renderedAttributes, propertyList);
		}
		
		if (propertyList.getBodyView() != null) {
			renderBodyView(renderedAttributes, propertyList);
		}
		
		if (propertyList.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, propertyList);
		}
		
		if (propertyList.getCaption() != null) {
			renderCaption(renderedAttributes, propertyList);
		}
		
		if (propertyList.getColumns() != null) {
			renderColumns(renderedAttributes, propertyList);
		}
		
		if (propertyList.getColumnset() != null) {
			renderColumnset(renderedAttributes, propertyList);
		}
		
		if (propertyList.getContentBox() != null) {
			renderContentBox(renderedAttributes, propertyList);
		}
		
		if (propertyList.getData() != null) {
			renderData(renderedAttributes, propertyList);
		}
		
		if (propertyList.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, propertyList);
		}
		
		if (propertyList.getDisabled() != null) {
			renderDisabled(renderedAttributes, propertyList);
		}
		
		if (propertyList.getEditEvent() != null) {
			renderEditEvent(renderedAttributes, propertyList);
		}
		
		if (propertyList.getFocused() != null) {
			renderFocused(renderedAttributes, propertyList);
		}
		
		if (propertyList.getFooterConfig() != null) {
			renderFooterConfig(renderedAttributes, propertyList);
		}
		
		if (propertyList.getFooterView() != null) {
			renderFooterView(renderedAttributes, propertyList);
		}
		
		if (propertyList.getHeaderConfig() != null) {
			renderHeaderConfig(renderedAttributes, propertyList);
		}
		
		if (propertyList.getHeaderView() != null) {
			renderHeaderView(renderedAttributes, propertyList);
		}
		
		if (propertyList.getHeight() != null) {
			renderHeight(renderedAttributes, propertyList);
		}
		
		if (propertyList.getPropertyListId() != null) {
			renderPropertyListId(renderedAttributes, propertyList);
		}
		
		if (propertyList.getInitialized() != null) {
			renderInitialized(renderedAttributes, propertyList);
		}
		
		if (propertyList.getPropertyListLocale() != null) {
			renderPropertyListLocale(renderedAttributes, propertyList);
		}
		
		if (propertyList.getRecordType() != null) {
			renderRecordType(renderedAttributes, propertyList);
		}
		
		if (propertyList.getRecordset() != null) {
			renderRecordset(renderedAttributes, propertyList);
		}
		
		if (propertyList.getRender() != null) {
			renderRender(renderedAttributes, propertyList);
		}
		
		if (propertyList.getRendered() != null) {
			renderRendered(renderedAttributes, propertyList);
		}
		
		if (propertyList.getScrollable() != null) {
			renderScrollable(renderedAttributes, propertyList);
		}
		
		if (propertyList.getShowMessages() != null) {
			renderShowMessages(renderedAttributes, propertyList);
		}
		
		if (propertyList.getSortBy() != null) {
			renderSortBy(renderedAttributes, propertyList);
		}
		
		if (propertyList.getSortable() != null) {
			renderSortable(renderedAttributes, propertyList);
		}
		
		if (propertyList.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, propertyList);
		}
		
		if (propertyList.getStrings() != null) {
			renderStrings(renderedAttributes, propertyList);
		}
		
		if (propertyList.getSummary() != null) {
			renderSummary(renderedAttributes, propertyList);
		}
		
		if (propertyList.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, propertyList);
		}
		
		if (propertyList.getView() != null) {
			renderView(renderedAttributes, propertyList);
		}
		
		if (propertyList.getViewConfig() != null) {
			renderViewConfig(renderedAttributes, propertyList);
		}
		
		if (propertyList.getVisible() != null) {
			renderVisible(renderedAttributes, propertyList);
		}
		
		if (propertyList.getWidth() != null) {
			renderWidth(renderedAttributes, propertyList);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (propertyList.getAfterAutoSyncChange() != null) {
			renderAfterAutoSyncChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterBodyConfigChange() != null) {
			renderAfterBodyConfigChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterBodyViewChange() != null) {
			renderAfterBodyViewChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterCaptionChange() != null) {
			renderAfterCaptionChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterColumnsChange() != null) {
			renderAfterColumnsChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterColumnsetChange() != null) {
			renderAfterColumnsetChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterDataChange() != null) {
			renderAfterDataChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterEditEventChange() != null) {
			renderAfterEditEventChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterFooterConfigChange() != null) {
			renderAfterFooterConfigChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterFooterViewChange() != null) {
			renderAfterFooterViewChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterHeaderConfigChange() != null) {
			renderAfterHeaderConfigChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterHeaderViewChange() != null) {
			renderAfterHeaderViewChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterRecordTypeChange() != null) {
			renderAfterRecordTypeChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterRecordsetChange() != null) {
			renderAfterRecordsetChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterScrollableChange() != null) {
			renderAfterScrollableChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterShowMessagesChange() != null) {
			renderAfterShowMessagesChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterSortByChange() != null) {
			renderAfterSortByChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterSortableChange() != null) {
			renderAfterSortableChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterSummaryChange() != null) {
			renderAfterSummaryChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterViewChange() != null) {
			renderAfterViewChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterViewConfigChange() != null) {
			renderAfterViewConfigChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, propertyList);
		}
		
		if (propertyList.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, propertyList);
		}
		

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

		if (propertyList.getOnAutoSyncChange() != null) {
			renderOnAutoSyncChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnBodyConfigChange() != null) {
			renderOnBodyConfigChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnBodyViewChange() != null) {
			renderOnBodyViewChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnCaptionChange() != null) {
			renderOnCaptionChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnColumnsChange() != null) {
			renderOnColumnsChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnColumnsetChange() != null) {
			renderOnColumnsetChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnDataChange() != null) {
			renderOnDataChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnEditEventChange() != null) {
			renderOnEditEventChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnFooterConfigChange() != null) {
			renderOnFooterConfigChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnFooterViewChange() != null) {
			renderOnFooterViewChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnHeaderConfigChange() != null) {
			renderOnHeaderConfigChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnHeaderViewChange() != null) {
			renderOnHeaderViewChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnRecordTypeChange() != null) {
			renderOnRecordTypeChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnRecordsetChange() != null) {
			renderOnRecordsetChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnScrollableChange() != null) {
			renderOnScrollableChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnShowMessagesChange() != null) {
			renderOnShowMessagesChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnSortByChange() != null) {
			renderOnSortByChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnSortableChange() != null) {
			renderOnSortableChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnSummaryChange() != null) {
			renderOnSummaryChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnViewChange() != null) {
			renderOnViewChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnViewConfigChange() != null) {
			renderOnViewConfigChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, propertyList);
		}
		
		if (propertyList.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, propertyList);
		}
		

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
		renderedAttributes.add(renderString(PropertyList.AUTO_SYNC, autoSync));
	}

	protected void renderBodyConfig(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object bodyConfig = propertyList.getBodyConfig();
		renderedAttributes.add(renderString(PropertyList.BODY_CONFIG, bodyConfig));
	}

	protected void renderBodyView(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object bodyView = propertyList.getBodyView();
		renderedAttributes.add(renderString(PropertyList.BODY_VIEW, bodyView));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String boundingBox = propertyList.getBoundingBox();
		renderedAttributes.add(renderString(PropertyList.BOUNDING_BOX, boundingBox));
	}

	protected void renderCaption(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object caption = propertyList.getCaption();
		renderedAttributes.add(renderString(PropertyList.CAPTION, caption));
	}

	protected void renderColumns(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object columns = propertyList.getColumns();
		renderedAttributes.add(renderString(PropertyList.COLUMNS, columns));
	}

	protected void renderColumnset(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object columnset = propertyList.getColumnset();
		renderedAttributes.add(renderString(PropertyList.COLUMNSET, columnset));
	}

	protected void renderContentBox(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String contentBox = propertyList.getContentBox();
		renderedAttributes.add(renderString(PropertyList.CONTENT_BOX, contentBox));
	}

	protected void renderData(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object data = propertyList.getData();
		renderedAttributes.add(renderString(PropertyList.DATA, data));
	}

	protected void renderDestroyed(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean destroyed = propertyList.getDestroyed();
		renderedAttributes.add(renderBoolean(PropertyList.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean disabled = propertyList.getDisabled();
		renderedAttributes.add(renderBoolean(PropertyList.DISABLED, disabled));
	}

	protected void renderEditEvent(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String editEvent = propertyList.getEditEvent();
		renderedAttributes.add(renderString(PropertyList.EDIT_EVENT, editEvent));
	}

	protected void renderFocused(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean focused = propertyList.getFocused();
		renderedAttributes.add(renderBoolean(PropertyList.FOCUSED, focused));
	}

	protected void renderFooterConfig(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object footerConfig = propertyList.getFooterConfig();
		renderedAttributes.add(renderString(PropertyList.FOOTER_CONFIG, footerConfig));
	}

	protected void renderFooterView(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object footerView = propertyList.getFooterView();
		renderedAttributes.add(renderString(PropertyList.FOOTER_VIEW, footerView));
	}

	protected void renderHeaderConfig(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object headerConfig = propertyList.getHeaderConfig();
		renderedAttributes.add(renderString(PropertyList.HEADER_CONFIG, headerConfig));
	}

	protected void renderHeaderView(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object headerView = propertyList.getHeaderView();
		renderedAttributes.add(renderString(PropertyList.HEADER_VIEW, headerView));
	}

	protected void renderHeight(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object height = propertyList.getHeight();
		renderedAttributes.add(renderString(PropertyList.HEIGHT, height));
	}

	protected void renderPropertyListId(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String propertyListId = propertyList.getPropertyListId();
		renderedAttributes.add(renderString(PropertyList.PROPERTY_LIST_ID, propertyListId));
	}

	protected void renderInitialized(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean initialized = propertyList.getInitialized();
		renderedAttributes.add(renderBoolean(PropertyList.INITIALIZED, initialized));
	}

	protected void renderPropertyListLocale(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String propertyListLocale = propertyList.getPropertyListLocale();
		renderedAttributes.add(renderString(PropertyList.PROPERTY_LIST_LOCALE, propertyListLocale));
	}

	protected void renderRecordType(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object recordType = propertyList.getRecordType();
		renderedAttributes.add(renderString(PropertyList.RECORD_TYPE, recordType));
	}

	protected void renderRecordset(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object recordset = propertyList.getRecordset();
		renderedAttributes.add(renderString(PropertyList.RECORDSET, recordset));
	}

	protected void renderRender(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object render = propertyList.getRender();
		renderedAttributes.add(renderString(PropertyList.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean rendered = propertyList.getRendered();
		renderedAttributes.add(renderBoolean(PropertyList.RENDERED, rendered));
	}

	protected void renderScrollable(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean scrollable = propertyList.getScrollable();
		renderedAttributes.add(renderBoolean(PropertyList.SCROLLABLE, scrollable));
	}

	protected void renderShowMessages(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object showMessages = propertyList.getShowMessages();
		renderedAttributes.add(renderString(PropertyList.SHOW_MESSAGES, showMessages));
	}

	protected void renderSortBy(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object sortBy = propertyList.getSortBy();
		renderedAttributes.add(renderString(PropertyList.SORT_BY, sortBy));
	}

	protected void renderSortable(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object sortable = propertyList.getSortable();
		renderedAttributes.add(renderString(PropertyList.SORTABLE, sortable));
	}

	protected void renderSrcNode(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String srcNode = propertyList.getSrcNode();
		renderedAttributes.add(renderString(PropertyList.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String strings = propertyList.getStrings();
		renderedAttributes.add(renderString(PropertyList.STRINGS, strings));
	}

	protected void renderSummary(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object summary = propertyList.getSummary();
		renderedAttributes.add(renderString(PropertyList.SUMMARY, summary));
	}

	protected void renderTabIndex(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object tabIndex = propertyList.getTabIndex();
		renderedAttributes.add(renderNumber(PropertyList.TAB_INDEX, tabIndex));
	}

	protected void renderView(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object view = propertyList.getView();
		renderedAttributes.add(renderString(PropertyList.VIEW, view));
	}

	protected void renderViewConfig(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Object viewConfig = propertyList.getViewConfig();
		renderedAttributes.add(renderString(PropertyList.VIEW_CONFIG, viewConfig));
	}

	protected void renderVisible(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean visible = propertyList.getVisible();
		renderedAttributes.add(renderBoolean(PropertyList.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String width = propertyList.getWidth();
		renderedAttributes.add(renderString(PropertyList.WIDTH, width));
	}

	protected void renderAfterAutoSyncChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterAutoSyncChange = propertyList.getAfterAutoSyncChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_AUTO_SYNC_CHANGE, afterAutoSyncChange));
	}

	protected void renderAfterBodyConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterBodyConfigChange = propertyList.getAfterBodyConfigChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_BODY_CONFIG_CHANGE, afterBodyConfigChange));
	}

	protected void renderAfterBodyViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterBodyViewChange = propertyList.getAfterBodyViewChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_BODY_VIEW_CHANGE, afterBodyViewChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterBoundingBoxChange = propertyList.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCaptionChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterCaptionChange = propertyList.getAfterCaptionChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_CAPTION_CHANGE, afterCaptionChange));
	}

	protected void renderAfterColumnsChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterColumnsChange = propertyList.getAfterColumnsChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_COLUMNS_CHANGE, afterColumnsChange));
	}

	protected void renderAfterColumnsetChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterColumnsetChange = propertyList.getAfterColumnsetChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_COLUMNSET_CHANGE, afterColumnsetChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterContentBoxChange = propertyList.getAfterContentBoxChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDataChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterDataChange = propertyList.getAfterDataChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_DATA_CHANGE, afterDataChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterDestroyedChange = propertyList.getAfterDestroyedChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterDisabledChange = propertyList.getAfterDisabledChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterEditEventChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterEditEventChange = propertyList.getAfterEditEventChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_EDIT_EVENT_CHANGE, afterEditEventChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterFocusedChange = propertyList.getAfterFocusedChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterFooterConfigChange = propertyList.getAfterFooterConfigChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_FOOTER_CONFIG_CHANGE, afterFooterConfigChange));
	}

	protected void renderAfterFooterViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterFooterViewChange = propertyList.getAfterFooterViewChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_FOOTER_VIEW_CHANGE, afterFooterViewChange));
	}

	protected void renderAfterHeaderConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterHeaderConfigChange = propertyList.getAfterHeaderConfigChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_HEADER_CONFIG_CHANGE, afterHeaderConfigChange));
	}

	protected void renderAfterHeaderViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterHeaderViewChange = propertyList.getAfterHeaderViewChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_HEADER_VIEW_CHANGE, afterHeaderViewChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterHeightChange = propertyList.getAfterHeightChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterIdChange = propertyList.getAfterIdChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterInitializedChange = propertyList.getAfterInitializedChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterLocaleChange = propertyList.getAfterLocaleChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterRecordTypeChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterRecordTypeChange = propertyList.getAfterRecordTypeChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_RECORD_TYPE_CHANGE, afterRecordTypeChange));
	}

	protected void renderAfterRecordsetChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterRecordsetChange = propertyList.getAfterRecordsetChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_RECORDSET_CHANGE, afterRecordsetChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterRenderChange = propertyList.getAfterRenderChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterRenderedChange = propertyList.getAfterRenderedChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterScrollableChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterScrollableChange = propertyList.getAfterScrollableChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_SCROLLABLE_CHANGE, afterScrollableChange));
	}

	protected void renderAfterShowMessagesChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterShowMessagesChange = propertyList.getAfterShowMessagesChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_SHOW_MESSAGES_CHANGE, afterShowMessagesChange));
	}

	protected void renderAfterSortByChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterSortByChange = propertyList.getAfterSortByChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_SORT_BY_CHANGE, afterSortByChange));
	}

	protected void renderAfterSortableChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterSortableChange = propertyList.getAfterSortableChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_SORTABLE_CHANGE, afterSortableChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterSrcNodeChange = propertyList.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterStringsChange = propertyList.getAfterStringsChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterSummaryChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterSummaryChange = propertyList.getAfterSummaryChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_SUMMARY_CHANGE, afterSummaryChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterTabIndexChange = propertyList.getAfterTabIndexChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterViewChange = propertyList.getAfterViewChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_VIEW_CHANGE, afterViewChange));
	}

	protected void renderAfterViewConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterViewConfigChange = propertyList.getAfterViewConfigChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_VIEW_CONFIG_CHANGE, afterViewConfigChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterVisibleChange = propertyList.getAfterVisibleChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String afterWidthChange = propertyList.getAfterWidthChange();
		renderedAttributes.add(renderString(PropertyList.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnAutoSyncChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onAutoSyncChange = propertyList.getOnAutoSyncChange();
		renderedAttributes.add(renderString(PropertyList.ON_AUTO_SYNC_CHANGE, onAutoSyncChange));
	}

	protected void renderOnBodyConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onBodyConfigChange = propertyList.getOnBodyConfigChange();
		renderedAttributes.add(renderString(PropertyList.ON_BODY_CONFIG_CHANGE, onBodyConfigChange));
	}

	protected void renderOnBodyViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onBodyViewChange = propertyList.getOnBodyViewChange();
		renderedAttributes.add(renderString(PropertyList.ON_BODY_VIEW_CHANGE, onBodyViewChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onBoundingBoxChange = propertyList.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(PropertyList.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCaptionChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onCaptionChange = propertyList.getOnCaptionChange();
		renderedAttributes.add(renderString(PropertyList.ON_CAPTION_CHANGE, onCaptionChange));
	}

	protected void renderOnColumnsChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onColumnsChange = propertyList.getOnColumnsChange();
		renderedAttributes.add(renderString(PropertyList.ON_COLUMNS_CHANGE, onColumnsChange));
	}

	protected void renderOnColumnsetChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onColumnsetChange = propertyList.getOnColumnsetChange();
		renderedAttributes.add(renderString(PropertyList.ON_COLUMNSET_CHANGE, onColumnsetChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onContentBoxChange = propertyList.getOnContentBoxChange();
		renderedAttributes.add(renderString(PropertyList.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDataChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onDataChange = propertyList.getOnDataChange();
		renderedAttributes.add(renderString(PropertyList.ON_DATA_CHANGE, onDataChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onDestroyedChange = propertyList.getOnDestroyedChange();
		renderedAttributes.add(renderString(PropertyList.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onDisabledChange = propertyList.getOnDisabledChange();
		renderedAttributes.add(renderString(PropertyList.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnEditEventChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onEditEventChange = propertyList.getOnEditEventChange();
		renderedAttributes.add(renderString(PropertyList.ON_EDIT_EVENT_CHANGE, onEditEventChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onFocusedChange = propertyList.getOnFocusedChange();
		renderedAttributes.add(renderString(PropertyList.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onFooterConfigChange = propertyList.getOnFooterConfigChange();
		renderedAttributes.add(renderString(PropertyList.ON_FOOTER_CONFIG_CHANGE, onFooterConfigChange));
	}

	protected void renderOnFooterViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onFooterViewChange = propertyList.getOnFooterViewChange();
		renderedAttributes.add(renderString(PropertyList.ON_FOOTER_VIEW_CHANGE, onFooterViewChange));
	}

	protected void renderOnHeaderConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onHeaderConfigChange = propertyList.getOnHeaderConfigChange();
		renderedAttributes.add(renderString(PropertyList.ON_HEADER_CONFIG_CHANGE, onHeaderConfigChange));
	}

	protected void renderOnHeaderViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onHeaderViewChange = propertyList.getOnHeaderViewChange();
		renderedAttributes.add(renderString(PropertyList.ON_HEADER_VIEW_CHANGE, onHeaderViewChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onHeightChange = propertyList.getOnHeightChange();
		renderedAttributes.add(renderString(PropertyList.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onIdChange = propertyList.getOnIdChange();
		renderedAttributes.add(renderString(PropertyList.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onInitializedChange = propertyList.getOnInitializedChange();
		renderedAttributes.add(renderString(PropertyList.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onLocaleChange = propertyList.getOnLocaleChange();
		renderedAttributes.add(renderString(PropertyList.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnRecordTypeChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onRecordTypeChange = propertyList.getOnRecordTypeChange();
		renderedAttributes.add(renderString(PropertyList.ON_RECORD_TYPE_CHANGE, onRecordTypeChange));
	}

	protected void renderOnRecordsetChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onRecordsetChange = propertyList.getOnRecordsetChange();
		renderedAttributes.add(renderString(PropertyList.ON_RECORDSET_CHANGE, onRecordsetChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onRenderChange = propertyList.getOnRenderChange();
		renderedAttributes.add(renderString(PropertyList.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onRenderedChange = propertyList.getOnRenderedChange();
		renderedAttributes.add(renderString(PropertyList.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnScrollableChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onScrollableChange = propertyList.getOnScrollableChange();
		renderedAttributes.add(renderString(PropertyList.ON_SCROLLABLE_CHANGE, onScrollableChange));
	}

	protected void renderOnShowMessagesChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onShowMessagesChange = propertyList.getOnShowMessagesChange();
		renderedAttributes.add(renderString(PropertyList.ON_SHOW_MESSAGES_CHANGE, onShowMessagesChange));
	}

	protected void renderOnSortByChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onSortByChange = propertyList.getOnSortByChange();
		renderedAttributes.add(renderString(PropertyList.ON_SORT_BY_CHANGE, onSortByChange));
	}

	protected void renderOnSortableChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onSortableChange = propertyList.getOnSortableChange();
		renderedAttributes.add(renderString(PropertyList.ON_SORTABLE_CHANGE, onSortableChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onSrcNodeChange = propertyList.getOnSrcNodeChange();
		renderedAttributes.add(renderString(PropertyList.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onStringsChange = propertyList.getOnStringsChange();
		renderedAttributes.add(renderString(PropertyList.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnSummaryChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onSummaryChange = propertyList.getOnSummaryChange();
		renderedAttributes.add(renderString(PropertyList.ON_SUMMARY_CHANGE, onSummaryChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onTabIndexChange = propertyList.getOnTabIndexChange();
		renderedAttributes.add(renderString(PropertyList.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnViewChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onViewChange = propertyList.getOnViewChange();
		renderedAttributes.add(renderString(PropertyList.ON_VIEW_CHANGE, onViewChange));
	}

	protected void renderOnViewConfigChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onViewConfigChange = propertyList.getOnViewConfigChange();
		renderedAttributes.add(renderString(PropertyList.ON_VIEW_CONFIG_CHANGE, onViewConfigChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onVisibleChange = propertyList.getOnVisibleChange();
		renderedAttributes.add(renderString(PropertyList.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String onWidthChange = propertyList.getOnWidthChange();
		renderedAttributes.add(renderString(PropertyList.ON_WIDTH_CHANGE, onWidthChange));
	}

}