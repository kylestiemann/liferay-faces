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
package com.liferay.faces.alloy.component.datatableselection;

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
public abstract class DataTableSelectionRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-selection";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DataTableSelection dataTableSelection = (DataTableSelection) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var dataTableSelection = new A.DataTableSelection");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveCell(renderedAttributes, dataTableSelection);
		renderActiveCoord(renderedAttributes, dataTableSelection);
		renderActiveRow(renderedAttributes, dataTableSelection);
		renderSelection(renderedAttributes, dataTableSelection);
		renderTabIndex(renderedAttributes, dataTableSelection);

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

	protected void renderActiveCell(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String activeCell = dataTableSelection.getActiveCell();

		if (activeCell != null) {
			renderedAttributes.add(renderString(DataTableSelection.ACTIVE_CELL, activeCell));
		}
	}

	protected void renderActiveCoord(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.Object activeCoord = dataTableSelection.getActiveCoord();

		if (activeCoord != null) {
			renderedAttributes.add(renderArray(DataTableSelection.ACTIVE_COORD, activeCoord));
		}
	}

	protected void renderActiveRow(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String activeRow = dataTableSelection.getActiveRow();

		if (activeRow != null) {
			renderedAttributes.add(renderString(DataTableSelection.ACTIVE_ROW, activeRow));
		}
	}

	protected void renderSelection(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String selection = dataTableSelection.getSelection();

		if (selection != null) {
			renderedAttributes.add(renderString(DataTableSelection.SELECTION, selection));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.Object tabIndex = dataTableSelection.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(DataTableSelection.TAB_INDEX, tabIndex));
		}
	}

}