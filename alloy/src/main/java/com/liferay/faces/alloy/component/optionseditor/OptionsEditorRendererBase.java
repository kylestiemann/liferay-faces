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
package com.liferay.faces.alloy.component.optionseditor;

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
public abstract class OptionsEditorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-multiple-choice";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		OptionsEditor optionsEditor = (OptionsEditor) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var optionsEditor = new A.OptionsEditor");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (optionsEditor.getEditable() != null) {
			renderEditable(renderedAttributes, optionsEditor);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (optionsEditor.getAfterEditableChange() != null) {
			renderAfterEditableChange(renderedAfterEvents, optionsEditor);
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

		if (optionsEditor.getOnEditableChange() != null) {
			renderOnEditableChange(renderedOnEvents, optionsEditor);
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

	protected void renderEditable(List<String> renderedAttributes, OptionsEditor optionsEditor) throws IOException {
		java.lang.String editable = optionsEditor.getEditable();
		renderedAttributes.add(renderString(OptionsEditor.EDITABLE, editable));
	}

	protected void renderAfterEditableChange(List<String> renderedAttributes, OptionsEditor optionsEditor) throws IOException {
		java.lang.String afterEditableChange = optionsEditor.getAfterEditableChange();
		renderedAttributes.add(renderString(OptionsEditor.AFTER_EDITABLE_CHANGE, afterEditableChange));
	}

	protected void renderOnEditableChange(List<String> renderedAttributes, OptionsEditor optionsEditor) throws IOException {
		java.lang.String onEditableChange = optionsEditor.getOnEditableChange();
		renderedAttributes.add(renderString(OptionsEditor.ON_EDITABLE_CHANGE, onEditableChange));
	}

}