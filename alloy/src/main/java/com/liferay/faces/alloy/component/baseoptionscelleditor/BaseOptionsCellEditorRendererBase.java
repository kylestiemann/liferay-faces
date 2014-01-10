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
package com.liferay.faces.alloy.component.baseoptionscelleditor;

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
public abstract class BaseOptionsCellEditorRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		BaseOptionsCellEditor baseOptionsCellEditor = (BaseOptionsCellEditor) uiComponent;
		encodeHTML(facesContext, baseOptionsCellEditor);
		encodeJavaScript(facesContext, baseOptionsCellEditor);
	}

	protected abstract void encodeHTML(FacesContext facesContext, BaseOptionsCellEditor baseOptionsCellEditor) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, BaseOptionsCellEditor baseOptionsCellEditor) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", baseOptionsCellEditor);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-baseoptionscelleditor',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var baseOptionsCellEditor = new Y.BaseOptionsCellEditor");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(baseOptionsCellEditor.getEditable() != null)
		{

			responseWriter.write("editable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getEditable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getElementName() != null)
		{

			responseWriter.write("elementName: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getElementName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getFooterContent() != null)
		{

			responseWriter.write("footerContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getFooterContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getHideOnSave() != null)
		{

			responseWriter.write("hideOnSave: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getHideOnSave().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getInputFormatter() != null)
		{

			responseWriter.write("inputFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getInputFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getOptions() != null)
		{

			responseWriter.write("options: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getOptions().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getOutputFormatter() != null)
		{

			responseWriter.write("outputFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getOutputFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getSelectedAttrName() != null)
		{

			responseWriter.write("selectedAttrName: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getSelectedAttrName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getShowToolbar() != null)
		{

			responseWriter.write("showToolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getShowToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getToolbar() != null)
		{

			responseWriter.write("toolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getUnescapeValue() != null)
		{

			responseWriter.write("unescapeValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getUnescapeValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getValidator() != null)
		{

			responseWriter.write("validator: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getValidator().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getBaseoptionscelleditorValue() != null)
		{

			responseWriter.write("baseoptionscelleditorValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getBaseoptionscelleditorValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseOptionsCellEditor.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseOptionsCellEditor.getVisible().toString());
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