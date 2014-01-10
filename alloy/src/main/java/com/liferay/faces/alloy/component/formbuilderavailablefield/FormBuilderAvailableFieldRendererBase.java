/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.alloy.component.formbuilderavailablefield;

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
public abstract class FormBuilderAvailableFieldRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		FormBuilderAvailableField formBuilderAvailableField = (FormBuilderAvailableField) uiComponent;
		encodeHTML(facesContext, formBuilderAvailableField);
		encodeJavaScript(facesContext, formBuilderAvailableField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderAvailableField formBuilderAvailableField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderAvailableField formBuilderAvailableField) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", formBuilderAvailableField);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-formbuilderavailablefield',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var formBuilderAvailableField = new Y.FormBuilderAvailableField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(formBuilderAvailableField.getDraggable() != null)
		{

			responseWriter.write("draggable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getDraggable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getHiddenAttributes() != null)
		{

			responseWriter.write("hiddenAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getHiddenAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getIconClass() != null)
		{

			responseWriter.write("iconClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getIconClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getFormbuilderavailablefieldId() != null)
		{

			responseWriter.write("formbuilderavailablefieldId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getFormbuilderavailablefieldId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getNode() != null)
		{

			responseWriter.write("node: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getOptions() != null)
		{

			responseWriter.write("options: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getOptions().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getPredefinedValue() != null)
		{

			responseWriter.write("predefinedValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getPredefinedValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getReadOnlyAttributes() != null)
		{

			responseWriter.write("readOnlyAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getReadOnlyAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getRequired() != null)
		{

			responseWriter.write("required: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getRequired().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getShowLabel() != null)
		{

			responseWriter.write("showLabel: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getShowLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getTip() != null)
		{

			responseWriter.write("tip: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getTip().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getType() != null)
		{

			responseWriter.write("type: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getUnique() != null)
		{

			responseWriter.write("unique: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getUnique().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderAvailableField.getWidth() != null)
		{

			responseWriter.write("width: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderAvailableField.getWidth().toString());
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