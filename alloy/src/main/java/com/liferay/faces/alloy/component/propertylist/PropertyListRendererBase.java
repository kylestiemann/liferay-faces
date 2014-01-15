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
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class PropertyListRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-property-list";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		PropertyList propertyList = (PropertyList) uiComponent;
		encodeHTML(facesContext, propertyList);
		encodeJavaScript(facesContext, propertyList);
	}

	protected abstract void encodeHTML(FacesContext facesContext, PropertyList propertyList) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, PropertyList propertyList) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, propertyList);

		bufferedResponseWriter.write("var propertyList = new A.PropertyList");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAutoSync(renrederedAttributes, propertyList);
		renderBodyConfig(renrederedAttributes, propertyList);
		renderBodyView(renrederedAttributes, propertyList);
		renderBoundingBox(renrederedAttributes, propertyList);
		renderCaption(renrederedAttributes, propertyList);
		renderColumns(renrederedAttributes, propertyList);
		renderColumnset(renrederedAttributes, propertyList);
		renderContentBox(renrederedAttributes, propertyList);
		renderData(renrederedAttributes, propertyList);
		renderDestroyed(renrederedAttributes, propertyList);
		renderDisabled(renrederedAttributes, propertyList);
		renderEditEvent(renrederedAttributes, propertyList);
		renderFocused(renrederedAttributes, propertyList);
		renderFooterConfig(renrederedAttributes, propertyList);
		renderFooterView(renrederedAttributes, propertyList);
		renderHeaderConfig(renrederedAttributes, propertyList);
		renderHeaderView(renrederedAttributes, propertyList);
		renderHeight(renrederedAttributes, propertyList);
		renderPropertylistId(renrederedAttributes, propertyList);
		renderInitialized(renrederedAttributes, propertyList);
		renderPropertylistLocale(renrederedAttributes, propertyList);
		renderRecordType(renrederedAttributes, propertyList);
		renderRecordset(renrederedAttributes, propertyList);
		renderRender(renrederedAttributes, propertyList);
		renderRendered(renrederedAttributes, propertyList);
		renderScrollable(renrederedAttributes, propertyList);
		renderShowMessages(renrederedAttributes, propertyList);
		renderSortBy(renrederedAttributes, propertyList);
		renderSortable(renrederedAttributes, propertyList);
		renderSrcNode(renrederedAttributes, propertyList);
		renderStrings(renrederedAttributes, propertyList);
		renderSummary(renrederedAttributes, propertyList);
		renderTabIndex(renrederedAttributes, propertyList);
		renderView(renrederedAttributes, propertyList);
		renderViewConfig(renrederedAttributes, propertyList);
		renderVisible(renrederedAttributes, propertyList);
		renderWidth(renrederedAttributes, propertyList);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, propertyList);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAutoSync(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getAutoSync() != null) {
			renrederedAttributes.add(renderString("autoSync", propertyList.getAutoSync()));
		}
	}

	protected void renderBodyConfig(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getBodyConfig() != null) {
			renrederedAttributes.add(renderString("bodyConfig", propertyList.getBodyConfig()));
		}
	}

	protected void renderBodyView(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getBodyView() != null) {
			renrederedAttributes.add(renderString("bodyView", propertyList.getBodyView()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", propertyList.getBoundingBox()));
		}
	}

	protected void renderCaption(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getCaption() != null) {
			renrederedAttributes.add(renderString("caption", propertyList.getCaption()));
		}
	}

	protected void renderColumns(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getColumns() != null) {
			renrederedAttributes.add(renderString("columns", propertyList.getColumns()));
		}
	}

	protected void renderColumnset(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getColumnset() != null) {
			renrederedAttributes.add(renderString("columnset", propertyList.getColumnset()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", propertyList.getContentBox()));
		}
	}

	protected void renderData(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getData() != null) {
			renrederedAttributes.add(renderString("data", propertyList.getData()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", propertyList.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", propertyList.getDisabled()));
		}
	}

	protected void renderEditEvent(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getEditEvent() != null) {
			renrederedAttributes.add(renderString("editEvent", propertyList.getEditEvent()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", propertyList.getFocused()));
		}
	}

	protected void renderFooterConfig(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getFooterConfig() != null) {
			renrederedAttributes.add(renderString("footerConfig", propertyList.getFooterConfig()));
		}
	}

	protected void renderFooterView(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getFooterView() != null) {
			renrederedAttributes.add(renderString("footerView", propertyList.getFooterView()));
		}
	}

	protected void renderHeaderConfig(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getHeaderConfig() != null) {
			renrederedAttributes.add(renderString("headerConfig", propertyList.getHeaderConfig()));
		}
	}

	protected void renderHeaderView(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getHeaderView() != null) {
			renrederedAttributes.add(renderString("headerView", propertyList.getHeaderView()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getHeight() != null) {
			renrederedAttributes.add(renderString("height", propertyList.getHeight()));
		}
	}

	protected void renderPropertylistId(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getPropertylistId() != null) {
			renrederedAttributes.add(renderString("propertylistId", propertyList.getPropertylistId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", propertyList.getInitialized()));
		}
	}

	protected void renderPropertylistLocale(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getPropertylistLocale() != null) {
			renrederedAttributes.add(renderString("propertylistLocale", propertyList.getPropertylistLocale()));
		}
	}

	protected void renderRecordType(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getRecordType() != null) {
			renrederedAttributes.add(renderString("recordType", propertyList.getRecordType()));
		}
	}

	protected void renderRecordset(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getRecordset() != null) {
			renrederedAttributes.add(renderString("recordset", propertyList.getRecordset()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getRender() != null) {
			renrederedAttributes.add(renderString("render", propertyList.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", propertyList.getRendered()));
		}
	}

	protected void renderScrollable(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getScrollable() != null) {
			renrederedAttributes.add(renderBoolean("scrollable", propertyList.getScrollable()));
		}
	}

	protected void renderShowMessages(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getShowMessages() != null) {
			renrederedAttributes.add(renderString("showMessages", propertyList.getShowMessages()));
		}
	}

	protected void renderSortBy(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getSortBy() != null) {
			renrederedAttributes.add(renderString("sortBy", propertyList.getSortBy()));
		}
	}

	protected void renderSortable(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getSortable() != null) {
			renrederedAttributes.add(renderString("sortable", propertyList.getSortable()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", propertyList.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getStrings() != null) {
			renrederedAttributes.add(renderString("strings", propertyList.getStrings()));
		}
	}

	protected void renderSummary(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getSummary() != null) {
			renrederedAttributes.add(renderString("summary", propertyList.getSummary()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", propertyList.getTabIndex()));
		}
	}

	protected void renderView(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getView() != null) {
			renrederedAttributes.add(renderString("view", propertyList.getView()));
		}
	}

	protected void renderViewConfig(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getViewConfig() != null) {
			renrederedAttributes.add(renderString("viewConfig", propertyList.getViewConfig()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", propertyList.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, PropertyList propertyList) throws IOException {
		if (propertyList.getWidth() != null) {
			renrederedAttributes.add(renderString("width", propertyList.getWidth()));
		}
	}

}