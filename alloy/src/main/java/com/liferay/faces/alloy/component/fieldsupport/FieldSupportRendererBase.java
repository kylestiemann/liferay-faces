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
package com.liferay.faces.alloy.component.fieldsupport;

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
public abstract class FieldSupportRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-base";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FieldSupport fieldSupport = (FieldSupport) uiComponent;
		encodeHTML(facesContext, fieldSupport);
		encodeJavaScript(facesContext, fieldSupport);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FieldSupport fieldSupport) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FieldSupport fieldSupport) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, fieldSupport);

		bufferedResponseWriter.write("var fieldSupport = new Y.FieldSupport");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderFields(responseWriter, fieldSupport);
		responseWriter.write(StringPool.COMMA);
		renderMaxFields(responseWriter, fieldSupport);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, fieldSupport);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderFields(ResponseWriter responseWriter, FieldSupport fieldSupport) throws IOException {
		renderArray(responseWriter, "fields", fieldSupport.getFields());
	}

	protected void renderMaxFields(ResponseWriter responseWriter, FieldSupport fieldSupport) throws IOException {
		renderNumber(responseWriter, "maxFields", fieldSupport.getMaxFields());
	}

}