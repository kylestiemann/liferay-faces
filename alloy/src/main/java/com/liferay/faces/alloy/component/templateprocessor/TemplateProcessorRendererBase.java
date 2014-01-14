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
package com.liferay.faces.alloy.component.templateprocessor;

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
public abstract class TemplateProcessorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-templateprocessor";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TemplateProcessor templateProcessor = (TemplateProcessor) uiComponent;
		encodeHTML(facesContext, templateProcessor);
		encodeJavaScript(facesContext, templateProcessor);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TemplateProcessor templateProcessor) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TemplateProcessor templateProcessor) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, templateProcessor);

		bufferedResponseWriter.write("var templateProcessor = new Y.TemplateProcessor");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderDirectives(bufferedResponseWriter, templateProcessor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHost(bufferedResponseWriter, templateProcessor);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVariables(bufferedResponseWriter, templateProcessor);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, templateProcessor);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDirectives(ResponseWriter responseWriter, TemplateProcessor templateProcessor) throws IOException {
		renderArray(responseWriter, "directives", templateProcessor.getDirectives());
	}

	protected void renderHost(ResponseWriter responseWriter, TemplateProcessor templateProcessor) throws IOException {
		renderObject(responseWriter, "host", templateProcessor.getHost());
	}

	protected void renderVariables(ResponseWriter responseWriter, TemplateProcessor templateProcessor) throws IOException {
		renderObject(responseWriter, "variables", templateProcessor.getVariables());
	}

}