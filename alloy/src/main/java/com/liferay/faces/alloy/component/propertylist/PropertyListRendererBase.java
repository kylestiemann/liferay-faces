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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
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
		renderPropertylistId(renderedAttributes, propertyList);
		renderInitialized(renderedAttributes, propertyList);
		renderPropertylistLocale(renderedAttributes, propertyList);
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

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

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

	protected void renderPropertylistId(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String propertylistId = propertyList.getPropertylistId();

		if (propertylistId != null) {
			renderedAttributes.add(renderString(PropertyList.PROPERTYLIST_ID, propertylistId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.Boolean initialized = propertyList.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(PropertyList.INITIALIZED, initialized));
		}
	}

	protected void renderPropertylistLocale(List<String> renderedAttributes, PropertyList propertyList) throws IOException {
		java.lang.String propertylistLocale = propertyList.getPropertylistLocale();

		if (propertylistLocale != null) {
			renderedAttributes.add(renderString(PropertyList.PROPERTYLIST_LOCALE, propertylistLocale));
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

}