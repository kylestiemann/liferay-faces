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
package com.liferay.faces.alloy.component.formvalidator;

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
public abstract class FormValidatorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-validator";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormValidator formValidator = (FormValidator) uiComponent;
		encodeHTML(facesContext, formValidator);
		encodeJavaScript(facesContext, formValidator);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormValidator formValidator) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormValidator formValidator) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, formValidator);

		bufferedResponseWriter.write("var formValidator = new Y.FormValidator");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBoundingBox(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderContainerErrorClass(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderContainerValidClass(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderErrorClass(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderExtractRules(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderFieldContainer(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderFieldStrings(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderLabelCssClass(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderMessageContainer(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderRules(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderSelectText(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderShowAllMessages(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderShowMessages(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderStackErrorContainer(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderValidClass(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderValidateOnBlur(responseWriter, formValidator);
		responseWriter.write(StringPool.COMMA);
		renderValidateOnInput(responseWriter, formValidator);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formValidator);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "boundingBox", formValidator.getBoundingBox());
	}

	protected void renderContainerErrorClass(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "containerErrorClass", formValidator.getContainerErrorClass());
	}

	protected void renderContainerValidClass(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "containerValidClass", formValidator.getContainerValidClass());
	}

	protected void renderErrorClass(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "errorClass", formValidator.getErrorClass());
	}

	protected void renderExtractRules(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderBoolean(responseWriter, "extractRules", formValidator.getExtractRules());
	}

	protected void renderFieldContainer(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "fieldContainer", formValidator.getFieldContainer());
	}

	protected void renderFieldStrings(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderObject(responseWriter, "fieldStrings", formValidator.getFieldStrings());
	}

	protected void renderLabelCssClass(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "labelCssClass", formValidator.getLabelCssClass());
	}

	protected void renderMessageContainer(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "messageContainer", formValidator.getMessageContainer());
	}

	protected void renderRules(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderObject(responseWriter, "rules", formValidator.getRules());
	}

	protected void renderSelectText(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderBoolean(responseWriter, "selectText", formValidator.getSelectText());
	}

	protected void renderShowAllMessages(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderBoolean(responseWriter, "showAllMessages", formValidator.getShowAllMessages());
	}

	protected void renderShowMessages(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderBoolean(responseWriter, "showMessages", formValidator.getShowMessages());
	}

	protected void renderStackErrorContainer(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "stackErrorContainer", formValidator.getStackErrorContainer());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "strings", formValidator.getStrings());
	}

	protected void renderValidClass(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderString(responseWriter, "validClass", formValidator.getValidClass());
	}

	protected void renderValidateOnBlur(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderBoolean(responseWriter, "validateOnBlur", formValidator.getValidateOnBlur());
	}

	protected void renderValidateOnInput(ResponseWriter responseWriter, FormValidator formValidator) throws IOException {
		renderBoolean(responseWriter, "validateOnInput", formValidator.getValidateOnInput());
	}

}