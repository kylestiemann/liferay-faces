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
package com.liferay.faces.alloy.component.freemarker;

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
public abstract class FreemarkerRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-freemarker";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Freemarker freemarker = (Freemarker) uiComponent;
		encodeHTML(facesContext, freemarker);
		encodeJavaScript(facesContext, freemarker);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Freemarker freemarker) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Freemarker freemarker) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, freemarker);

		bufferedResponseWriter.write("var freemarker = new Y.Freemarker");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderDirectives(bufferedResponseWriter, freemarker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDirectivesMatcher(bufferedResponseWriter, freemarker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHost(bufferedResponseWriter, freemarker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVariables(bufferedResponseWriter, freemarker);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVariablesMatcher(bufferedResponseWriter, freemarker);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, freemarker);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDirectives(ResponseWriter responseWriter, Freemarker freemarker) throws IOException {
		renderArray(responseWriter, "directives", freemarker.getDirectives());
	}

	protected void renderDirectivesMatcher(ResponseWriter responseWriter, Freemarker freemarker) throws IOException {
		renderString(responseWriter, "directivesMatcher", freemarker.getDirectivesMatcher());
	}

	protected void renderHost(ResponseWriter responseWriter, Freemarker freemarker) throws IOException {
		renderObject(responseWriter, "host", freemarker.getHost());
	}

	protected void renderVariables(ResponseWriter responseWriter, Freemarker freemarker) throws IOException {
		renderObject(responseWriter, "variables", freemarker.getVariables());
	}

	protected void renderVariablesMatcher(ResponseWriter responseWriter, Freemarker freemarker) throws IOException {
		renderString(responseWriter, "variablesMatcher", freemarker.getVariablesMatcher());
	}

}