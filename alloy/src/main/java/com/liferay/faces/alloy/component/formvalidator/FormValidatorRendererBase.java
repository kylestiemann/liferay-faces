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
public abstract class FormValidatorRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-validator";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		FormValidator formValidator = (FormValidator) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var formValidator = new A.FormValidator");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, formValidator);
		renderContainerErrorClass(renrederedAttributes, formValidator);
		renderContainerValidClass(renrederedAttributes, formValidator);
		renderDestroyed(renrederedAttributes, formValidator);
		renderErrorClass(renrederedAttributes, formValidator);
		renderExtractRules(renrederedAttributes, formValidator);
		renderFieldContainer(renrederedAttributes, formValidator);
		renderFieldStrings(renrederedAttributes, formValidator);
		renderInitialized(renrederedAttributes, formValidator);
		renderLabelCssClass(renrederedAttributes, formValidator);
		renderMessageContainer(renrederedAttributes, formValidator);
		renderRules(renrederedAttributes, formValidator);
		renderSelectText(renrederedAttributes, formValidator);
		renderShowAllMessages(renrederedAttributes, formValidator);
		renderShowMessages(renrederedAttributes, formValidator);
		renderStackErrorContainer(renrederedAttributes, formValidator);
		renderStrings(renrederedAttributes, formValidator);
		renderValidClass(renrederedAttributes, formValidator);
		renderValidateOnBlur(renrederedAttributes, formValidator);
		renderValidateOnInput(renrederedAttributes, formValidator);

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

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", formValidator.getBoundingBox()));
		}
	}

	protected void renderContainerErrorClass(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getContainerErrorClass() != null) {
			renrederedAttributes.add(renderString("containerErrorClass", formValidator.getContainerErrorClass()));
		}
	}

	protected void renderContainerValidClass(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getContainerValidClass() != null) {
			renrederedAttributes.add(renderString("containerValidClass", formValidator.getContainerValidClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", formValidator.getDestroyed()));
		}
	}

	protected void renderErrorClass(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getErrorClass() != null) {
			renrederedAttributes.add(renderString("errorClass", formValidator.getErrorClass()));
		}
	}

	protected void renderExtractRules(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getExtractRules() != null) {
			renrederedAttributes.add(renderBoolean("extractRules", formValidator.getExtractRules()));
		}
	}

	protected void renderFieldContainer(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getFieldContainer() != null) {
			renrederedAttributes.add(renderString("fieldContainer", formValidator.getFieldContainer()));
		}
	}

	protected void renderFieldStrings(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getFieldStrings() != null) {
			renrederedAttributes.add(renderObject("fieldStrings", formValidator.getFieldStrings()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", formValidator.getInitialized()));
		}
	}

	protected void renderLabelCssClass(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getLabelCssClass() != null) {
			renrederedAttributes.add(renderString("labelCssClass", formValidator.getLabelCssClass()));
		}
	}

	protected void renderMessageContainer(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getMessageContainer() != null) {
			renrederedAttributes.add(renderString("messageContainer", formValidator.getMessageContainer()));
		}
	}

	protected void renderRules(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getRules() != null) {
			renrederedAttributes.add(renderObject("rules", formValidator.getRules()));
		}
	}

	protected void renderSelectText(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getSelectText() != null) {
			renrederedAttributes.add(renderBoolean("selectText", formValidator.getSelectText()));
		}
	}

	protected void renderShowAllMessages(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getShowAllMessages() != null) {
			renrederedAttributes.add(renderBoolean("showAllMessages", formValidator.getShowAllMessages()));
		}
	}

	protected void renderShowMessages(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getShowMessages() != null) {
			renrederedAttributes.add(renderBoolean("showMessages", formValidator.getShowMessages()));
		}
	}

	protected void renderStackErrorContainer(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getStackErrorContainer() != null) {
			renrederedAttributes.add(renderString("stackErrorContainer", formValidator.getStackErrorContainer()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getStrings() != null) {
			renrederedAttributes.add(renderString("strings", formValidator.getStrings()));
		}
	}

	protected void renderValidClass(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getValidClass() != null) {
			renrederedAttributes.add(renderString("validClass", formValidator.getValidClass()));
		}
	}

	protected void renderValidateOnBlur(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getValidateOnBlur() != null) {
			renrederedAttributes.add(renderBoolean("validateOnBlur", formValidator.getValidateOnBlur()));
		}
	}

	protected void renderValidateOnInput(ArrayList<String> renrederedAttributes, FormValidator formValidator) throws IOException {
		if (formValidator.getValidateOnInput() != null) {
			renrederedAttributes.add(renderBoolean("validateOnInput", formValidator.getValidateOnInput()));
		}
	}

}