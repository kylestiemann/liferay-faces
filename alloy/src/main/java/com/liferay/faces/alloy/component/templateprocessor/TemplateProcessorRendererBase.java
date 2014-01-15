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
import java.util.ArrayList;
import java.util.Iterator;

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

		bufferedResponseWriter.write("var templateProcessor = new A.TemplateProcessor");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderDestroyed(renrederedAttributes, templateProcessor);
		renderDirectives(renrederedAttributes, templateProcessor);
		renderHost(renrederedAttributes, templateProcessor);
		renderInitialized(renrederedAttributes, templateProcessor);
		renderVariables(renrederedAttributes, templateProcessor);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, templateProcessor);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TemplateProcessor templateProcessor) throws IOException {
		if (templateProcessor.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", templateProcessor.getDestroyed()));
		}
	}

	protected void renderDirectives(ArrayList<String> renrederedAttributes, TemplateProcessor templateProcessor) throws IOException {
		if (templateProcessor.getDirectives() != null) {
			renrederedAttributes.add(renderArray("directives", templateProcessor.getDirectives()));
		}
	}

	protected void renderHost(ArrayList<String> renrederedAttributes, TemplateProcessor templateProcessor) throws IOException {
		if (templateProcessor.getHost() != null) {
			renrederedAttributes.add(renderObject("host", templateProcessor.getHost()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TemplateProcessor templateProcessor) throws IOException {
		if (templateProcessor.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", templateProcessor.getInitialized()));
		}
	}

	protected void renderVariables(ArrayList<String> renrederedAttributes, TemplateProcessor templateProcessor) throws IOException {
		if (templateProcessor.getVariables() != null) {
			renrederedAttributes.add(renderObject("variables", templateProcessor.getVariables()));
		}
	}

}