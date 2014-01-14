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

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		DataTableSelection dataTableSelection = (DataTableSelection) uiComponent;
		encodeHTML(facesContext, dataTableSelection);
		encodeJavaScript(facesContext, dataTableSelection);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DataTableSelection dataTableSelection) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DataTableSelection dataTableSelection) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, dataTableSelection);

		bufferedResponseWriter.write("var dataTableSelection = new Y.DataTableSelection");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderActiveCell(bufferedResponseWriter, dataTableSelection);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderActiveCoord(bufferedResponseWriter, dataTableSelection);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderActiveRow(bufferedResponseWriter, dataTableSelection);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelection(bufferedResponseWriter, dataTableSelection);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, dataTableSelection);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, dataTableSelection);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveCell(ResponseWriter responseWriter, DataTableSelection dataTableSelection) throws IOException {
		renderString(responseWriter, "activeCell", dataTableSelection.getActiveCell());
	}

	protected void renderActiveCoord(ResponseWriter responseWriter, DataTableSelection dataTableSelection) throws IOException {
		renderArray(responseWriter, "activeCoord", dataTableSelection.getActiveCoord());
	}

	protected void renderActiveRow(ResponseWriter responseWriter, DataTableSelection dataTableSelection) throws IOException {
		renderString(responseWriter, "activeRow", dataTableSelection.getActiveRow());
	}

	protected void renderSelection(ResponseWriter responseWriter, DataTableSelection dataTableSelection) throws IOException {
		renderString(responseWriter, "selection", dataTableSelection.getSelection());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, DataTableSelection dataTableSelection) throws IOException {
		renderNumber(responseWriter, "tabIndex", dataTableSelection.getTabIndex());
	}

}