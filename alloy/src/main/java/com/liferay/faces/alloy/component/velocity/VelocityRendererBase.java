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
package com.liferay.faces.alloy.component.velocity;

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
public abstract class VelocityRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-velocity";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Velocity velocity = (Velocity) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var velocity = new A.Velocity");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderDirectives(renderedAttributes, velocity);
		renderDirectivesMatcher(renderedAttributes, velocity);
		renderHost(renderedAttributes, velocity);
		renderVariables(renderedAttributes, velocity);
		renderVariablesMatcher(renderedAttributes, velocity);

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

	protected void renderDirectives(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.Object directives = velocity.getDirectives();

		if (directives != null) {
			renderedAttributes.add(renderArray(Velocity.DIRECTIVES, directives));
		}
	}

	protected void renderDirectivesMatcher(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String directivesMatcher = velocity.getDirectivesMatcher();

		if (directivesMatcher != null) {
			renderedAttributes.add(renderString(Velocity.DIRECTIVES_MATCHER, directivesMatcher));
		}
	}

	protected void renderHost(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.Object host = velocity.getHost();

		if (host != null) {
			renderedAttributes.add(renderObject(Velocity.HOST, host));
		}
	}

	protected void renderVariables(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.Object variables = velocity.getVariables();

		if (variables != null) {
			renderedAttributes.add(renderObject(Velocity.VARIABLES, variables));
		}
	}

	protected void renderVariablesMatcher(List<String> renderedAttributes, Velocity velocity) throws IOException {
		java.lang.String variablesMatcher = velocity.getVariablesMatcher();

		if (variablesMatcher != null) {
			renderedAttributes.add(renderString(Velocity.VARIABLES_MATCHER, variablesMatcher));
		}
	}

}