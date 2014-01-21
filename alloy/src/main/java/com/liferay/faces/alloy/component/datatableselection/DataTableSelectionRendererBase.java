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

		if (dataTableSelection.getActiveCell() != null) {
			renderActiveCell(renderedAttributes, dataTableSelection);
		}

		if (dataTableSelection.getActiveCoord() != null) {
			renderActiveCoord(renderedAttributes, dataTableSelection);
		}

		if (dataTableSelection.getActiveRow() != null) {
			renderActiveRow(renderedAttributes, dataTableSelection);
		}

		if (dataTableSelection.getSelection() != null) {
			renderSelection(renderedAttributes, dataTableSelection);
		}

		if (dataTableSelection.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, dataTableSelection);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (dataTableSelection.getAfterActiveCellChange() != null) {
			renderAfterActiveCellChange(renderedAfterEvents, dataTableSelection);
		}

		if (dataTableSelection.getAfterActiveCoordChange() != null) {
			renderAfterActiveCoordChange(renderedAfterEvents, dataTableSelection);
		}

		if (dataTableSelection.getAfterActiveRowChange() != null) {
			renderAfterActiveRowChange(renderedAfterEvents, dataTableSelection);
		}

		if (dataTableSelection.getAfterSelectionChange() != null) {
			renderAfterSelectionChange(renderedAfterEvents, dataTableSelection);
		}

		if (dataTableSelection.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, dataTableSelection);
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

		if (dataTableSelection.getOnActiveCellChange() != null) {
			renderOnActiveCellChange(renderedOnEvents, dataTableSelection);
		}

		if (dataTableSelection.getOnActiveCoordChange() != null) {
			renderOnActiveCoordChange(renderedOnEvents, dataTableSelection);
		}

		if (dataTableSelection.getOnActiveRowChange() != null) {
			renderOnActiveRowChange(renderedOnEvents, dataTableSelection);
		}

		if (dataTableSelection.getOnSelectionChange() != null) {
			renderOnSelectionChange(renderedOnEvents, dataTableSelection);
		}

		if (dataTableSelection.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, dataTableSelection);
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

	protected void renderActiveCell(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String activeCell = dataTableSelection.getActiveCell();
		renderedAttributes.add(renderString(DataTableSelection.ACTIVE_CELL, activeCell));
	}

	protected void renderActiveCoord(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.Object activeCoord = dataTableSelection.getActiveCoord();
		renderedAttributes.add(renderArray(DataTableSelection.ACTIVE_COORD, activeCoord));
	}

	protected void renderActiveRow(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String activeRow = dataTableSelection.getActiveRow();
		renderedAttributes.add(renderString(DataTableSelection.ACTIVE_ROW, activeRow));
	}

	protected void renderSelection(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String selection = dataTableSelection.getSelection();
		renderedAttributes.add(renderString(DataTableSelection.SELECTION, selection));
	}

	protected void renderTabIndex(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.Object tabIndex = dataTableSelection.getTabIndex();
		renderedAttributes.add(renderNumber(DataTableSelection.TAB_INDEX, tabIndex));
	}

	protected void renderAfterActiveCellChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String afterActiveCellChange = dataTableSelection.getAfterActiveCellChange();
		renderedAttributes.add(renderString(DataTableSelection.AFTER_ACTIVE_CELL_CHANGE, afterActiveCellChange));
	}

	protected void renderAfterActiveCoordChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String afterActiveCoordChange = dataTableSelection.getAfterActiveCoordChange();
		renderedAttributes.add(renderString(DataTableSelection.AFTER_ACTIVE_COORD_CHANGE, afterActiveCoordChange));
	}

	protected void renderAfterActiveRowChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String afterActiveRowChange = dataTableSelection.getAfterActiveRowChange();
		renderedAttributes.add(renderString(DataTableSelection.AFTER_ACTIVE_ROW_CHANGE, afterActiveRowChange));
	}

	protected void renderAfterSelectionChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String afterSelectionChange = dataTableSelection.getAfterSelectionChange();
		renderedAttributes.add(renderString(DataTableSelection.AFTER_SELECTION_CHANGE, afterSelectionChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String afterTabIndexChange = dataTableSelection.getAfterTabIndexChange();
		renderedAttributes.add(renderString(DataTableSelection.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderOnActiveCellChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String onActiveCellChange = dataTableSelection.getOnActiveCellChange();
		renderedAttributes.add(renderString(DataTableSelection.ON_ACTIVE_CELL_CHANGE, onActiveCellChange));
	}

	protected void renderOnActiveCoordChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String onActiveCoordChange = dataTableSelection.getOnActiveCoordChange();
		renderedAttributes.add(renderString(DataTableSelection.ON_ACTIVE_COORD_CHANGE, onActiveCoordChange));
	}

	protected void renderOnActiveRowChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String onActiveRowChange = dataTableSelection.getOnActiveRowChange();
		renderedAttributes.add(renderString(DataTableSelection.ON_ACTIVE_ROW_CHANGE, onActiveRowChange));
	}

	protected void renderOnSelectionChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String onSelectionChange = dataTableSelection.getOnSelectionChange();
		renderedAttributes.add(renderString(DataTableSelection.ON_SELECTION_CHANGE, onSelectionChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, DataTableSelection dataTableSelection) throws IOException {
		java.lang.String onTabIndexChange = dataTableSelection.getOnTabIndexChange();
		renderedAttributes.add(renderString(DataTableSelection.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

}