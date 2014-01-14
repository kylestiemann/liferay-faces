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
package com.liferay.faces.alloy.component.textcelleditor;

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
public abstract class TextCellEditorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-edit";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TextCellEditor textCellEditor = (TextCellEditor) uiComponent;
		encodeHTML(facesContext, textCellEditor);
		encodeJavaScript(facesContext, textCellEditor);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TextCellEditor textCellEditor) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TextCellEditor textCellEditor) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, textCellEditor);

		bufferedResponseWriter.write("var textCellEditor = new Y.TextCellEditor");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderEditable(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderElementName(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFooterContent(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideOnSave(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInputFormatter(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOutputFormatter(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowToolbar(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToolbar(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUnescapeValue(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderValidator(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTextcelleditorValue(bufferedResponseWriter, textCellEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, textCellEditor);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, textCellEditor);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderEditable(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderBoolean(responseWriter, "editable", textCellEditor.getEditable());
	}

	protected void renderElementName(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderString(responseWriter, "elementName", textCellEditor.getElementName());
	}

	protected void renderFooterContent(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderString(responseWriter, "footerContent", textCellEditor.getFooterContent());
	}

	protected void renderHideOnSave(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderBoolean(responseWriter, "hideOnSave", textCellEditor.getHideOnSave());
	}

	protected void renderInputFormatter(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderString(responseWriter, "inputFormatter", textCellEditor.getInputFormatter());
	}

	protected void renderOutputFormatter(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderString(responseWriter, "outputFormatter", textCellEditor.getOutputFormatter());
	}

	protected void renderShowToolbar(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderBoolean(responseWriter, "showToolbar", textCellEditor.getShowToolbar());
	}

	protected void renderStrings(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderObject(responseWriter, "strings", textCellEditor.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderNumber(responseWriter, "tabIndex", textCellEditor.getTabIndex());
	}

	protected void renderToolbar(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderObject(responseWriter, "toolbar", textCellEditor.getToolbar());
	}

	protected void renderUnescapeValue(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderBoolean(responseWriter, "unescapeValue", textCellEditor.getUnescapeValue());
	}

	protected void renderValidator(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderObject(responseWriter, "validator", textCellEditor.getValidator());
	}

	protected void renderTextcelleditorValue(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderString(responseWriter, "textcelleditorValue", textCellEditor.getTextcelleditorValue());
	}

	protected void renderVisible(ResponseWriter responseWriter, TextCellEditor textCellEditor) throws IOException {
		renderBoolean(responseWriter, "visible", textCellEditor.getVisible());
	}

}