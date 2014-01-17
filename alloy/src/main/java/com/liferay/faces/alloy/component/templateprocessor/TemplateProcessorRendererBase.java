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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TemplateProcessorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-templateprocessor";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TemplateProcessor templateProcessor = (TemplateProcessor) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var templateProcessor = new A.TemplateProcessor");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderDestroyed(renderedAttributes, templateProcessor);
		renderDirectives(renderedAttributes, templateProcessor);
		renderHost(renderedAttributes, templateProcessor);
		renderInitialized(renderedAttributes, templateProcessor);
		renderVariables(renderedAttributes, templateProcessor);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDestroyed(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Boolean destroyed = templateProcessor.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TemplateProcessor.DESTROYED, destroyed));
		}
	}

	protected void renderDirectives(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Object directives = templateProcessor.getDirectives();

		if (directives != null) {
			renderedAttributes.add(renderArray(TemplateProcessor.DIRECTIVES, directives));
		}
	}

	protected void renderHost(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Object host = templateProcessor.getHost();

		if (host != null) {
			renderedAttributes.add(renderObject(TemplateProcessor.HOST, host));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Boolean initialized = templateProcessor.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TemplateProcessor.INITIALIZED, initialized));
		}
	}

	protected void renderVariables(List<String> renderedAttributes, TemplateProcessor templateProcessor) throws IOException {
		java.lang.Object variables = templateProcessor.getVariables();

		if (variables != null) {
			renderedAttributes.add(renderObject(TemplateProcessor.VARIABLES, variables));
		}
	}

}