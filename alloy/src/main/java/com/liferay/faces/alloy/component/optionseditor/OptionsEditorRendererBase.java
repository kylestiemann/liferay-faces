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
public abstract class OptionsEditorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String  AUI_FORM_BUILDER_FIELD_MULTIPLE_CHOICE = "aui-form-builder-field-multiple-choice";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		OptionsEditor optionsEditor = (OptionsEditor) uiComponent;
		encodeHTML(facesContext, optionsEditor);
		encodeJavaScript(facesContext, optionsEditor);
	}

	protected abstract void encodeHTML(FacesContext facesContext, OptionsEditor optionsEditor) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, OptionsEditor optionsEditor) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, optionsEditor, AUI_FORM_BUILDER_FIELD_MULTIPLE_CHOICE);

		bufferedResponseWriter.write("var optionsEditor = new Y.OptionsEditor");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);

		if(optionsEditor.getEditable() != null)
		{

			bufferedResponseWriter.write("editable: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(optionsEditor.getEditable().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);
		
		endJavaScript(facesContext);
		
		handleBuffer(facesContext, optionsEditor, AUI_FORM_BUILDER_FIELD_MULTIPLE_CHOICE);
		
		facesContext.setResponseWriter(backupResponseWriter);
	}

}