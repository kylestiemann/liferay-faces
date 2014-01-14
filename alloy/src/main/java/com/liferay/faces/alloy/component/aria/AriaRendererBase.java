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
package com.liferay.faces.alloy.component.aria;

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
public abstract class AriaRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-aria";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Aria aria = (Aria) uiComponent;
		encodeHTML(facesContext, aria);
		encodeJavaScript(facesContext, aria);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Aria aria) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Aria aria) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, aria);

		bufferedResponseWriter.write("var aria = new Y.Aria");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAttributeNode(responseWriter, aria);
		responseWriter.write(StringPool.COMMA);
		renderAttributeValueFormat(responseWriter, aria);
		responseWriter.write(StringPool.COMMA);
		renderAriaAttributes(responseWriter, aria);
		responseWriter.write(StringPool.COMMA);
		renderRoleName(responseWriter, aria);
		responseWriter.write(StringPool.COMMA);
		renderRoleNode(responseWriter, aria);
		responseWriter.write(StringPool.COMMA);
		renderValidateW3C(responseWriter, aria);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, aria);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAttributeNode(ResponseWriter responseWriter, Aria aria) throws IOException {
		renderString(responseWriter, "attributeNode", aria.getAttributeNode());
	}

	protected void renderAttributeValueFormat(ResponseWriter responseWriter, Aria aria) throws IOException {
		renderString(responseWriter, "attributeValueFormat", aria.getAttributeValueFormat());
	}

	protected void renderAriaAttributes(ResponseWriter responseWriter, Aria aria) throws IOException {
		renderObject(responseWriter, "ariaAttributes", aria.getAriaAttributes());
	}

	protected void renderRoleName(ResponseWriter responseWriter, Aria aria) throws IOException {
		renderString(responseWriter, "roleName", aria.getRoleName());
	}

	protected void renderRoleNode(ResponseWriter responseWriter, Aria aria) throws IOException {
		renderString(responseWriter, "roleNode", aria.getRoleNode());
	}

	protected void renderValidateW3C(ResponseWriter responseWriter, Aria aria) throws IOException {
		renderBoolean(responseWriter, "validateW3C", aria.getValidateW3C());
	}

}