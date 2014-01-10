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
package com.liferay.faces.alloy.component.formbuildercheckboxfield;

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
public abstract class FormBuilderCheckBoxFieldRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		FormBuilderCheckBoxField formBuilderCheckBoxField = (FormBuilderCheckBoxField) uiComponent;
		encodeHTML(facesContext, formBuilderCheckBoxField);
		encodeJavaScript(facesContext, formBuilderCheckBoxField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", formBuilderCheckBoxField);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-formbuildercheckboxfield',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var formBuilderCheckBoxField = new Y.FormBuilderCheckBoxField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(formBuilderCheckBoxField.getAcceptChildren() != null)
		{

			responseWriter.write("acceptChildren: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getAcceptChildren().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getBuilder() != null)
		{

			responseWriter.write("builder: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getBuilder().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getControlsToolbar() != null)
		{

			responseWriter.write("controlsToolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getControlsToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getDataType() != null)
		{

			responseWriter.write("dataType: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getDataType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getDropZoneNode() != null)
		{

			responseWriter.write("dropZoneNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getDropZoneNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getHiddenAttributes() != null)
		{

			responseWriter.write("hiddenAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getHiddenAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getFormbuildercheckboxfieldId() != null)
		{

			responseWriter.write("formbuildercheckboxfieldId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getFormbuildercheckboxfieldId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getLabelNode() != null)
		{

			responseWriter.write("labelNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getLabelNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getLocalizationMap() != null)
		{

			responseWriter.write("localizationMap: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getLocalizationMap().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getFormbuildercheckboxfieldParent() != null)
		{

			responseWriter.write("formbuildercheckboxfieldParent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getFormbuildercheckboxfieldParent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getPredefinedValue() != null)
		{

			responseWriter.write("predefinedValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getPredefinedValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getReadOnly() != null)
		{

			responseWriter.write("readOnly: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getReadOnly().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getReadOnlyAttributes() != null)
		{

			responseWriter.write("readOnlyAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getReadOnlyAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getRequired() != null)
		{

			responseWriter.write("required: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getRequired().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getRequiredFlagNode() != null)
		{

			responseWriter.write("requiredFlagNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getRequiredFlagNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getSelected() != null)
		{

			responseWriter.write("selected: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getSelected().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getShowLabel() != null)
		{

			responseWriter.write("showLabel: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getShowLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getTemplate() != null)
		{

			responseWriter.write("template: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getTemplate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getTemplateNode() != null)
		{

			responseWriter.write("templateNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getTemplateNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getTip() != null)
		{

			responseWriter.write("tip: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getTip().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getTipFlagNode() != null)
		{

			responseWriter.write("tipFlagNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getTipFlagNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getType() != null)
		{

			responseWriter.write("type: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getUnique() != null)
		{

			responseWriter.write("unique: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getUnique().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderCheckBoxField.getZIndex() != null)
		{

			responseWriter.write("zIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderCheckBoxField.getZIndex().toString());
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