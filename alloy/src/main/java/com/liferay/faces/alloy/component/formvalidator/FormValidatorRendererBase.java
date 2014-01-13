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
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class FormValidatorRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		FormValidator formValidator = (FormValidator) uiComponent;
		encodeHTML(facesContext, formValidator);
		encodeJavaScript(facesContext, formValidator);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormValidator formValidator) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormValidator formValidator) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", formValidator);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-formvalidator',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var formValidator = new Y.FormValidator");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(formValidator.getBoundingBox() != null)
		{

			responseWriter.write("boundingBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getBoundingBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getContainerErrorClass() != null)
		{

			responseWriter.write("containerErrorClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getContainerErrorClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getContainerValidClass() != null)
		{

			responseWriter.write("containerValidClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getContainerValidClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getErrorClass() != null)
		{

			responseWriter.write("errorClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getErrorClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getExtractRules() != null)
		{

			responseWriter.write("extractRules: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getExtractRules().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getFieldContainer() != null)
		{

			responseWriter.write("fieldContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getFieldContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getFieldStrings() != null)
		{

			responseWriter.write("fieldStrings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getFieldStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getLabelCssClass() != null)
		{

			responseWriter.write("labelCssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getLabelCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getMessageContainer() != null)
		{

			responseWriter.write("messageContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getMessageContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getRules() != null)
		{

			responseWriter.write("rules: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getRules().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getSelectText() != null)
		{

			responseWriter.write("selectText: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getSelectText().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getShowAllMessages() != null)
		{

			responseWriter.write("showAllMessages: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getShowAllMessages().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getShowMessages() != null)
		{

			responseWriter.write("showMessages: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getShowMessages().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getStackErrorContainer() != null)
		{

			responseWriter.write("stackErrorContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getStackErrorContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getValidClass() != null)
		{

			responseWriter.write("validClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getValidClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getValidateOnBlur() != null)
		{

			responseWriter.write("validateOnBlur: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getValidateOnBlur().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formValidator.getValidateOnInput() != null)
		{

			responseWriter.write("validateOnInput: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formValidator.getValidateOnInput().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_CLOSE);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.endElement("script");
		responseWriter.write(StringPool.NEW_LINE);
	}

}