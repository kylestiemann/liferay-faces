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
package com.liferay.faces.alloy.component.formbuilderbuttonfield;

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
public abstract class FormBuilderButtonFieldRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		FormBuilderButtonField formBuilderButtonField = (FormBuilderButtonField) uiComponent;
		encodeHTML(facesContext, formBuilderButtonField);
		encodeJavaScript(facesContext, formBuilderButtonField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderButtonField formBuilderButtonField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderButtonField formBuilderButtonField) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", formBuilderButtonField);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-formbuilderbuttonfield',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var formBuilderButtonField = new Y.FormBuilderButtonField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(formBuilderButtonField.getAcceptChildren() != null)
		{

			responseWriter.write("acceptChildren: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getAcceptChildren().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getBuilder() != null)
		{

			responseWriter.write("builder: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getBuilder().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getButtonType() != null)
		{

			responseWriter.write("buttonType: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getButtonType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getControlsToolbar() != null)
		{

			responseWriter.write("controlsToolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getControlsToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getDataType() != null)
		{

			responseWriter.write("dataType: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getDataType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getDropZoneNode() != null)
		{

			responseWriter.write("dropZoneNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getDropZoneNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getHiddenAttributes() != null)
		{

			responseWriter.write("hiddenAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getHiddenAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getFormbuilderbuttonfieldId() != null)
		{

			responseWriter.write("formbuilderbuttonfieldId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getFormbuilderbuttonfieldId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getLabelNode() != null)
		{

			responseWriter.write("labelNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getLabelNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getLocalizationMap() != null)
		{

			responseWriter.write("localizationMap: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getLocalizationMap().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getFormbuilderbuttonfieldParent() != null)
		{

			responseWriter.write("formbuilderbuttonfieldParent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getFormbuilderbuttonfieldParent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getPredefinedValue() != null)
		{

			responseWriter.write("predefinedValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getPredefinedValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getReadOnly() != null)
		{

			responseWriter.write("readOnly: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getReadOnly().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getReadOnlyAttributes() != null)
		{

			responseWriter.write("readOnlyAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getReadOnlyAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getRequired() != null)
		{

			responseWriter.write("required: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getRequired().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getRequiredFlagNode() != null)
		{

			responseWriter.write("requiredFlagNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getRequiredFlagNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getSelected() != null)
		{

			responseWriter.write("selected: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getSelected().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getShowLabel() != null)
		{

			responseWriter.write("showLabel: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getShowLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getTemplate() != null)
		{

			responseWriter.write("template: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getTemplate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getTemplateNode() != null)
		{

			responseWriter.write("templateNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getTemplateNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getTip() != null)
		{

			responseWriter.write("tip: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getTip().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getTipFlagNode() != null)
		{

			responseWriter.write("tipFlagNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getTipFlagNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getType() != null)
		{

			responseWriter.write("type: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getUnique() != null)
		{

			responseWriter.write("unique: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getUnique().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderButtonField.getZIndex() != null)
		{

			responseWriter.write("zIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderButtonField.getZIndex().toString());
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