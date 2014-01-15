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
public abstract class DataTableSelectionRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-selection";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DataTableSelection dataTableSelection = (DataTableSelection) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var dataTableSelection = new A.DataTableSelection");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActiveCell(renrederedAttributes, dataTableSelection);
		renderActiveCoord(renrederedAttributes, dataTableSelection);
		renderActiveRow(renrederedAttributes, dataTableSelection);
		renderSelection(renrederedAttributes, dataTableSelection);
		renderTabIndex(renrederedAttributes, dataTableSelection);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveCell(ArrayList<String> renrederedAttributes, DataTableSelection dataTableSelection) throws IOException {
		if (dataTableSelection.getActiveCell() != null) {
			renrederedAttributes.add(renderString("activeCell", dataTableSelection.getActiveCell()));
		}
	}

	protected void renderActiveCoord(ArrayList<String> renrederedAttributes, DataTableSelection dataTableSelection) throws IOException {
		if (dataTableSelection.getActiveCoord() != null) {
			renrederedAttributes.add(renderArray("activeCoord", dataTableSelection.getActiveCoord()));
		}
	}

	protected void renderActiveRow(ArrayList<String> renrederedAttributes, DataTableSelection dataTableSelection) throws IOException {
		if (dataTableSelection.getActiveRow() != null) {
			renrederedAttributes.add(renderString("activeRow", dataTableSelection.getActiveRow()));
		}
	}

	protected void renderSelection(ArrayList<String> renrederedAttributes, DataTableSelection dataTableSelection) throws IOException {
		if (dataTableSelection.getSelection() != null) {
			renrederedAttributes.add(renderString("selection", dataTableSelection.getSelection()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, DataTableSelection dataTableSelection) throws IOException {
		if (dataTableSelection.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", dataTableSelection.getTabIndex()));
		}
	}

}