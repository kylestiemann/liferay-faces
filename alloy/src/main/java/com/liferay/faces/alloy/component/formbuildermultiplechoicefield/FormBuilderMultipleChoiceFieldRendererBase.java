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
package com.liferay.faces.alloy.component.formbuildermultiplechoicefield;

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
public abstract class FormBuilderMultipleChoiceFieldRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		FormBuilderMultipleChoiceField formBuilderMultipleChoiceField = (FormBuilderMultipleChoiceField) uiComponent;
		encodeHTML(facesContext, formBuilderMultipleChoiceField);
		encodeJavaScript(facesContext, formBuilderMultipleChoiceField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", formBuilderMultipleChoiceField);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-formbuildermultiplechoicefield',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var formBuilderMultipleChoiceField = new Y.FormBuilderMultipleChoiceField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(formBuilderMultipleChoiceField.getAcceptChildren() != null)
		{

			responseWriter.write("acceptChildren: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getAcceptChildren().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getBuilder() != null)
		{

			responseWriter.write("builder: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getBuilder().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getControlsToolbar() != null)
		{

			responseWriter.write("controlsToolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getControlsToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getDataType() != null)
		{

			responseWriter.write("dataType: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getDataType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getDropZoneNode() != null)
		{

			responseWriter.write("dropZoneNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getDropZoneNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getHiddenAttributes() != null)
		{

			responseWriter.write("hiddenAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getHiddenAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldId() != null)
		{

			responseWriter.write("formbuildermultiplechoicefieldId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getLabelNode() != null)
		{

			responseWriter.write("labelNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getLabelNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getLocalizationMap() != null)
		{

			responseWriter.write("localizationMap: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getLocalizationMap().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getOptionTemplate() != null)
		{

			responseWriter.write("optionTemplate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getOptionTemplate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getOptions() != null)
		{

			responseWriter.write("options: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getOptions().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldParent() != null)
		{

			responseWriter.write("formbuildermultiplechoicefieldParent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldParent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getPredefinedValue() != null)
		{

			responseWriter.write("predefinedValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getPredefinedValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getReadOnly() != null)
		{

			responseWriter.write("readOnly: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getReadOnly().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getReadOnlyAttributes() != null)
		{

			responseWriter.write("readOnlyAttributes: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getReadOnlyAttributes().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getRequired() != null)
		{

			responseWriter.write("required: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getRequired().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getRequiredFlagNode() != null)
		{

			responseWriter.write("requiredFlagNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getRequiredFlagNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getSelected() != null)
		{

			responseWriter.write("selected: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getSelected().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getShowLabel() != null)
		{

			responseWriter.write("showLabel: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getShowLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getTemplate() != null)
		{

			responseWriter.write("template: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getTemplate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getTemplateNode() != null)
		{

			responseWriter.write("templateNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getTemplateNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getTip() != null)
		{

			responseWriter.write("tip: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getTip().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getTipFlagNode() != null)
		{

			responseWriter.write("tipFlagNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getTipFlagNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getType() != null)
		{

			responseWriter.write("type: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getUnique() != null)
		{

			responseWriter.write("unique: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getUnique().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(formBuilderMultipleChoiceField.getZIndex() != null)
		{

			responseWriter.write("zIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(formBuilderMultipleChoiceField.getZIndex().toString());
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