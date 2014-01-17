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
public abstract class FormValidatorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-validator";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormValidator formValidator = (FormValidator) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formValidator = new A.FormValidator");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, formValidator);
		renderContainerErrorClass(renderedAttributes, formValidator);
		renderContainerValidClass(renderedAttributes, formValidator);
		renderDestroyed(renderedAttributes, formValidator);
		renderErrorClass(renderedAttributes, formValidator);
		renderExtractRules(renderedAttributes, formValidator);
		renderFieldContainer(renderedAttributes, formValidator);
		renderFieldStrings(renderedAttributes, formValidator);
		renderInitialized(renderedAttributes, formValidator);
		renderLabelCssClass(renderedAttributes, formValidator);
		renderMessageContainer(renderedAttributes, formValidator);
		renderRules(renderedAttributes, formValidator);
		renderSelectText(renderedAttributes, formValidator);
		renderShowAllMessages(renderedAttributes, formValidator);
		renderShowMessages(renderedAttributes, formValidator);
		renderStackErrorContainer(renderedAttributes, formValidator);
		renderStrings(renderedAttributes, formValidator);
		renderValidClass(renderedAttributes, formValidator);
		renderValidateOnBlur(renderedAttributes, formValidator);
		renderValidateOnInput(renderedAttributes, formValidator);

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

	protected void renderBoundingBox(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String boundingBox = formValidator.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(FormValidator.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContainerErrorClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String containerErrorClass = formValidator.getContainerErrorClass();

		if (containerErrorClass != null) {
			renderedAttributes.add(renderString(FormValidator.CONTAINER_ERROR_CLASS, containerErrorClass));
		}
	}

	protected void renderContainerValidClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String containerValidClass = formValidator.getContainerValidClass();

		if (containerValidClass != null) {
			renderedAttributes.add(renderString(FormValidator.CONTAINER_VALID_CLASS, containerValidClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean destroyed = formValidator.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(FormValidator.DESTROYED, destroyed));
		}
	}

	protected void renderErrorClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String errorClass = formValidator.getErrorClass();

		if (errorClass != null) {
			renderedAttributes.add(renderString(FormValidator.ERROR_CLASS, errorClass));
		}
	}

	protected void renderExtractRules(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean extractRules = formValidator.getExtractRules();

		if (extractRules != null) {
			renderedAttributes.add(renderBoolean(FormValidator.EXTRACT_RULES, extractRules));
		}
	}

	protected void renderFieldContainer(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String fieldContainer = formValidator.getFieldContainer();

		if (fieldContainer != null) {
			renderedAttributes.add(renderString(FormValidator.FIELD_CONTAINER, fieldContainer));
		}
	}

	protected void renderFieldStrings(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Object fieldStrings = formValidator.getFieldStrings();

		if (fieldStrings != null) {
			renderedAttributes.add(renderObject(FormValidator.FIELD_STRINGS, fieldStrings));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean initialized = formValidator.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(FormValidator.INITIALIZED, initialized));
		}
	}

	protected void renderLabelCssClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String labelCssClass = formValidator.getLabelCssClass();

		if (labelCssClass != null) {
			renderedAttributes.add(renderString(FormValidator.LABEL_CSS_CLASS, labelCssClass));
		}
	}

	protected void renderMessageContainer(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String messageContainer = formValidator.getMessageContainer();

		if (messageContainer != null) {
			renderedAttributes.add(renderString(FormValidator.MESSAGE_CONTAINER, messageContainer));
		}
	}

	protected void renderRules(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Object rules = formValidator.getRules();

		if (rules != null) {
			renderedAttributes.add(renderObject(FormValidator.RULES, rules));
		}
	}

	protected void renderSelectText(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean selectText = formValidator.getSelectText();

		if (selectText != null) {
			renderedAttributes.add(renderBoolean(FormValidator.SELECT_TEXT, selectText));
		}
	}

	protected void renderShowAllMessages(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean showAllMessages = formValidator.getShowAllMessages();

		if (showAllMessages != null) {
			renderedAttributes.add(renderBoolean(FormValidator.SHOW_ALL_MESSAGES, showAllMessages));
		}
	}

	protected void renderShowMessages(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean showMessages = formValidator.getShowMessages();

		if (showMessages != null) {
			renderedAttributes.add(renderBoolean(FormValidator.SHOW_MESSAGES, showMessages));
		}
	}

	protected void renderStackErrorContainer(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String stackErrorContainer = formValidator.getStackErrorContainer();

		if (stackErrorContainer != null) {
			renderedAttributes.add(renderString(FormValidator.STACK_ERROR_CONTAINER, stackErrorContainer));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String strings = formValidator.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderString(FormValidator.STRINGS, strings));
		}
	}

	protected void renderValidClass(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.String validClass = formValidator.getValidClass();

		if (validClass != null) {
			renderedAttributes.add(renderString(FormValidator.VALID_CLASS, validClass));
		}
	}

	protected void renderValidateOnBlur(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean validateOnBlur = formValidator.getValidateOnBlur();

		if (validateOnBlur != null) {
			renderedAttributes.add(renderBoolean(FormValidator.VALIDATE_ON_BLUR, validateOnBlur));
		}
	}

	protected void renderValidateOnInput(List<String> renderedAttributes, FormValidator formValidator) throws IOException {
		java.lang.Boolean validateOnInput = formValidator.getValidateOnInput();

		if (validateOnInput != null) {
			renderedAttributes.add(renderBoolean(FormValidator.VALIDATE_ON_INPUT, validateOnInput));
		}
	}

}