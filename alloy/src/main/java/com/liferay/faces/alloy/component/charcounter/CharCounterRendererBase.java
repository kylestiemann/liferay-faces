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
package com.liferay.faces.alloy.component.charcounter;

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
public abstract class CharCounterRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-char-counter";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		CharCounter charCounter = (CharCounter) uiComponent;
		encodeHTML(facesContext, charCounter);
		encodeJavaScript(facesContext, charCounter);
	}

	protected abstract void encodeHTML(FacesContext facesContext, CharCounter charCounter) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, CharCounter charCounter) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, charCounter);

		bufferedResponseWriter.write("var charCounter = new Y.CharCounter");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderCounter(responseWriter, charCounter);
		responseWriter.write(StringPool.COMMA);
		renderInput(responseWriter, charCounter);
		responseWriter.write(StringPool.COMMA);
		renderMaxLength(responseWriter, charCounter);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, charCounter);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCounter(ResponseWriter responseWriter, CharCounter charCounter) throws IOException {
		renderString(responseWriter, "counter", charCounter.getCounter());
	}

	protected void renderInput(ResponseWriter responseWriter, CharCounter charCounter) throws IOException {
		renderString(responseWriter, "input", charCounter.getInput());
	}

	protected void renderMaxLength(ResponseWriter responseWriter, CharCounter charCounter) throws IOException {
		renderNumber(responseWriter, "maxLength", charCounter.getMaxLength());
	}

}