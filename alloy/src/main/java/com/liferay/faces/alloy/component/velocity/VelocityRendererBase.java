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
public abstract class VelocityRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-velocity";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		Velocity velocity = (Velocity) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var velocity = new A.Velocity");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderDirectives(renrederedAttributes, velocity);
		renderDirectivesMatcher(renrederedAttributes, velocity);
		renderHost(renrederedAttributes, velocity);
		renderVariables(renrederedAttributes, velocity);
		renderVariablesMatcher(renrederedAttributes, velocity);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDirectives(ArrayList<String> renrederedAttributes, Velocity velocity) throws IOException {
		if (velocity.getDirectives() != null) {
			renrederedAttributes.add(renderArray("directives", velocity.getDirectives()));
		}
	}

	protected void renderDirectivesMatcher(ArrayList<String> renrederedAttributes, Velocity velocity) throws IOException {
		if (velocity.getDirectivesMatcher() != null) {
			renrederedAttributes.add(renderString("directivesMatcher", velocity.getDirectivesMatcher()));
		}
	}

	protected void renderHost(ArrayList<String> renrederedAttributes, Velocity velocity) throws IOException {
		if (velocity.getHost() != null) {
			renrederedAttributes.add(renderObject("host", velocity.getHost()));
		}
	}

	protected void renderVariables(ArrayList<String> renrederedAttributes, Velocity velocity) throws IOException {
		if (velocity.getVariables() != null) {
			renrederedAttributes.add(renderObject("variables", velocity.getVariables()));
		}
	}

	protected void renderVariablesMatcher(ArrayList<String> renrederedAttributes, Velocity velocity) throws IOException {
		if (velocity.getVariablesMatcher() != null) {
			renrederedAttributes.add(renderString("variablesMatcher", velocity.getVariablesMatcher()));
		}
	}

}