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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formValidator);

		bufferedResponseWriter.write("var formValidator = new Y.FormValidator");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderBoundingBox(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainerErrorClass(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainerValidClass(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderErrorClass(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderExtractRules(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFieldContainer(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFieldStrings(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelCssClass(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMessageContainer(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRules(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelectText(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowAllMessages(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowMessages(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStackErrorContainer(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderValidClass(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderValidateOnBlur(bufferedResponseWriter, formValidator);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderValidateOnInput(bufferedResponseWriter, formValidator);

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