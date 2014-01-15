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

		bufferedResponseWriter.write("var freemarker = new A.Freemarker");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderDirectives(renrederedAttributes, freemarker);
		renderDirectivesMatcher(renrederedAttributes, freemarker);
		renderHost(renrederedAttributes, freemarker);
		renderVariables(renrederedAttributes, freemarker);
		renderVariablesMatcher(renrederedAttributes, freemarker);

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

		handleBuffer(facesContext, freemarker);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDirectives(ArrayList<String> renrederedAttributes, Freemarker freemarker) throws IOException {
		if (freemarker.getDirectives() != null) {
			renrederedAttributes.add(renderArray("directives", freemarker.getDirectives()));
		}
	}

	protected void renderDirectivesMatcher(ArrayList<String> renrederedAttributes, Freemarker freemarker) throws IOException {
		if (freemarker.getDirectivesMatcher() != null) {
			renrederedAttributes.add(renderString("directivesMatcher", freemarker.getDirectivesMatcher()));
		}
	}

	protected void renderHost(ArrayList<String> renrederedAttributes, Freemarker freemarker) throws IOException {
		if (freemarker.getHost() != null) {
			renrederedAttributes.add(renderObject("host", freemarker.getHost()));
		}
	}

	protected void renderVariables(ArrayList<String> renrederedAttributes, Freemarker freemarker) throws IOException {
		if (freemarker.getVariables() != null) {
			renrederedAttributes.add(renderObject("variables", freemarker.getVariables()));
		}
	}

	protected void renderVariablesMatcher(ArrayList<String> renrederedAttributes, Freemarker freemarker) throws IOException {
		if (freemarker.getVariablesMatcher() != null) {
			renrederedAttributes.add(renderString("variablesMatcher", freemarker.getVariablesMatcher()));
		}
	}

}