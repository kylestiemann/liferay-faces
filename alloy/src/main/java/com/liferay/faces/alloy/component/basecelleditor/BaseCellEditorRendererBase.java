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
package com.liferay.faces.alloy.component.basecelleditor;

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
public abstract class BaseCellEditorRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		BaseCellEditor baseCellEditor = (BaseCellEditor) uiComponent;
		encodeHTML(facesContext, baseCellEditor);
		encodeJavaScript(facesContext, baseCellEditor);
	}

	protected abstract void encodeHTML(FacesContext facesContext, BaseCellEditor baseCellEditor) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, BaseCellEditor baseCellEditor) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", baseCellEditor);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-basecelleditor',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var baseCellEditor = new Y.BaseCellEditor");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(baseCellEditor.getEditable() != null)
		{

			responseWriter.write("editable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getEditable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getElementName() != null)
		{

			responseWriter.write("elementName: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getElementName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getFooterContent() != null)
		{

			responseWriter.write("footerContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getFooterContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getHideOnSave() != null)
		{

			responseWriter.write("hideOnSave: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getHideOnSave().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getInputFormatter() != null)
		{

			responseWriter.write("inputFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getInputFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getOutputFormatter() != null)
		{

			responseWriter.write("outputFormatter: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getOutputFormatter().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getShowToolbar() != null)
		{

			responseWriter.write("showToolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getShowToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getToolbar() != null)
		{

			responseWriter.write("toolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getUnescapeValue() != null)
		{

			responseWriter.write("unescapeValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getUnescapeValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getValidator() != null)
		{

			responseWriter.write("validator: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getValidator().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getBasecelleditorValue() != null)
		{

			responseWriter.write("basecelleditorValue: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getBasecelleditorValue().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(baseCellEditor.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(baseCellEditor.getVisible().toString());
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