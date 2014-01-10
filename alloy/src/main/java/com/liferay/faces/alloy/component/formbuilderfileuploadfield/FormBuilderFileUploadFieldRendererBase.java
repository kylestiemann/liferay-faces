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
package com.liferay.faces.alloy.component.formbuilderfileuploadfield;

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
public abstract class FormBuilderFileUploadFieldRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		FormBuilderFileUploadField formBuilderFileUploadField = (FormBuilderFileUploadField) uiComponent;
		encodeHTML(facesContext, formBuilderFileUploadField);
		encodeJavaScript(facesContext, formBuilderFileUploadField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", formBuilderFileUploadField);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-formbuilderfileuploadfield',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var formBuilderFileUploadField = new Y.FormBuilderFileUploadField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(formBuilderFileUploadField.getAcceptChildren() != null)
		{

			responseWriter.write("acceptChildren: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getAcceptChildren().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getBuilder() != null)
		{

			responseWriter.write("builder: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getBuilder().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getControlsToolbar() != null)
		{

			responseWriter.write("controlsToolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getControlsToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getDataType() != null)
		{

			responseWriter.write("dataType: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getDataType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getDropZoneNode() != null)
		{

			responseWriter.write("dropZoneNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getDropZoneNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getHiddenAttributes() != null)
		{

			responseWriter.write("hiddenAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getHiddenAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getFormbuilderfileuploadfieldId() != null)
		{

			responseWriter.write("formbuilderfileuploadfieldId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getFormbuilderfileuploadfieldId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getLabelNode() != null)
		{

			responseWriter.write("labelNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getLabelNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getLocalizationMap() != null)
		{

			responseWriter.write("localizationMap: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getLocalizationMap().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getFormbuilderfileuploadfieldParent() != null)
		{

			responseWriter.write("formbuilderfileuploadfieldParent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getFormbuilderfileuploadfieldParent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getPredefinedValue() != null)
		{

			responseWriter.write("predefinedValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getPredefinedValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getReadOnly() != null)
		{

			responseWriter.write("readOnly: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getReadOnly().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getReadOnlyAttributes() != null)
		{

			responseWriter.write("readOnlyAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getReadOnlyAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getRequired() != null)
		{

			responseWriter.write("required: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getRequired().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getRequiredFlagNode() != null)
		{

			responseWriter.write("requiredFlagNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getRequiredFlagNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getSelected() != null)
		{

			responseWriter.write("selected: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getSelected().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getShowLabel() != null)
		{

			responseWriter.write("showLabel: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getShowLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getTemplate() != null)
		{

			responseWriter.write("template: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getTemplate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getTemplateNode() != null)
		{

			responseWriter.write("templateNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getTemplateNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getTip() != null)
		{

			responseWriter.write("tip: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getTip().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getTipFlagNode() != null)
		{

			responseWriter.write("tipFlagNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getTipFlagNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getType() != null)
		{

			responseWriter.write("type: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getUnique() != null)
		{

			responseWriter.write("unique: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getUnique().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderFileUploadField.getZIndex() != null)
		{

			responseWriter.write("zIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderFileUploadField.getZIndex().toString());
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