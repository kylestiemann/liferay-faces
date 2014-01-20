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
package com.liferay.faces.alloy.component.dropdowncelleditor;

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
public abstract class DropDownCellEditorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-edit";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DropDownCellEditor dropDownCellEditor = (DropDownCellEditor) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var dropDownCellEditor = new A.DropDownCellEditor");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (dropDownCellEditor.getMultiple() != null) {
			renderMultiple(renderedAttributes, dropDownCellEditor);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (dropDownCellEditor.getAfterMultipleChange() != null) {
			renderAfterMultipleChange(renderedAfterEvents, dropDownCellEditor);
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

		if (dropDownCellEditor.getOnMultipleChange() != null) {
			renderOnMultipleChange(renderedOnEvents, dropDownCellEditor);
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

	protected void renderMultiple(List<String> renderedAttributes, DropDownCellEditor dropDownCellEditor) throws IOException {
		java.lang.Boolean multiple = dropDownCellEditor.getMultiple();
		renderedAttributes.add(renderBoolean(DropDownCellEditor.MULTIPLE, multiple));
	}

	protected void renderAfterMultipleChange(List<String> renderedAttributes, DropDownCellEditor dropDownCellEditor) throws IOException {
		java.lang.String afterMultipleChange = dropDownCellEditor.getAfterMultipleChange();
		renderedAttributes.add(renderString(DropDownCellEditor.AFTER_MULTIPLE_CHANGE, afterMultipleChange));
	}

	protected void renderOnMultipleChange(List<String> renderedAttributes, DropDownCellEditor dropDownCellEditor) throws IOException {
		java.lang.String onMultipleChange = dropDownCellEditor.getOnMultipleChange();
		renderedAttributes.add(renderString(DropDownCellEditor.ON_MULTIPLE_CHANGE, onMultipleChange));
	}

}