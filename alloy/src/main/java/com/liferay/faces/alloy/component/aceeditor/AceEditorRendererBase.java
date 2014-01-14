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
package com.liferay.faces.alloy.component.aceeditor;

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
public abstract class AceEditorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-editor";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		AceEditor aceEditor = (AceEditor) uiComponent;
		encodeHTML(facesContext, aceEditor);
		encodeJavaScript(facesContext, aceEditor);
	}

	protected abstract void encodeHTML(FacesContext facesContext, AceEditor aceEditor) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, AceEditor aceEditor) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, aceEditor);

		bufferedResponseWriter.write("var aceEditor = new Y.AceEditor");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderHeight(bufferedResponseWriter, aceEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHighlightActiveLine(bufferedResponseWriter, aceEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMode(bufferedResponseWriter, aceEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnly(bufferedResponseWriter, aceEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowPrintMargin(bufferedResponseWriter, aceEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabSize(bufferedResponseWriter, aceEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseSoftTabs(bufferedResponseWriter, aceEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseWrapMode(bufferedResponseWriter, aceEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderAceeditorValue(bufferedResponseWriter, aceEditor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, aceEditor);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, aceEditor);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderHeight(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderNumber(responseWriter, "height", aceEditor.getHeight());
	}

	protected void renderHighlightActiveLine(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderBoolean(responseWriter, "highlightActiveLine", aceEditor.getHighlightActiveLine());
	}

	protected void renderMode(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderString(responseWriter, "mode", aceEditor.getMode());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderBoolean(responseWriter, "readOnly", aceEditor.getReadOnly());
	}

	protected void renderShowPrintMargin(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderBoolean(responseWriter, "showPrintMargin", aceEditor.getShowPrintMargin());
	}

	protected void renderTabSize(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderNumber(responseWriter, "tabSize", aceEditor.getTabSize());
	}

	protected void renderUseSoftTabs(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderBoolean(responseWriter, "useSoftTabs", aceEditor.getUseSoftTabs());
	}

	protected void renderUseWrapMode(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderBoolean(responseWriter, "useWrapMode", aceEditor.getUseWrapMode());
	}

	protected void renderAceeditorValue(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderString(responseWriter, "aceeditorValue", aceEditor.getAceeditorValue());
	}

	protected void renderWidth(ResponseWriter responseWriter, AceEditor aceEditor) throws IOException {
		renderNumber(responseWriter, "width", aceEditor.getWidth());
	}

}