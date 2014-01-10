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
package com.liferay.faces.alloy.component.diagrambuilderbase;

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
public abstract class DiagramBuilderBaseRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		DiagramBuilderBase diagramBuilderBase = (DiagramBuilderBase) uiComponent;
		encodeHTML(facesContext, diagramBuilderBase);
		encodeJavaScript(facesContext, diagramBuilderBase);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramBuilderBase diagramBuilderBase) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramBuilderBase diagramBuilderBase) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", diagramBuilderBase);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-diagrambuilderbase',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var diagramBuilderBase = new Y.DiagramBuilderBase");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(diagramBuilderBase.getAvailableFields() != null)
		{

			responseWriter.write("availableFields: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getAvailableFields().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getAvailableFieldsDragConfig() != null)
		{

			responseWriter.write("availableFieldsDragConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getAvailableFieldsDragConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getCanvas() != null)
		{

			responseWriter.write("canvas: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getCanvas().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getContentContainer() != null)
		{

			responseWriter.write("contentContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getContentContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getCssClass() != null)
		{

			responseWriter.write("cssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getDropConfig() != null)
		{

			responseWriter.write("dropConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getDropConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getDropContainer() != null)
		{

			responseWriter.write("dropContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getDropContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getFields() != null)
		{

			responseWriter.write("fields: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getFields().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getFieldsContainer() != null)
		{

			responseWriter.write("fieldsContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getFieldsContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getHideClass() != null)
		{

			responseWriter.write("hideClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getHideClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getMaxFields() != null)
		{

			responseWriter.write("maxFields: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getMaxFields().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getPropertyList() != null)
		{

			responseWriter.write("propertyList: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getPropertyList().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getTabView() != null)
		{

			responseWriter.write("tabView: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getTabView().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getToolbar() != null)
		{

			responseWriter.write("toolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getToolbarContainer() != null)
		{

			responseWriter.write("toolbarContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getToolbarContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilderBase.getUseARIA() != null)
		{

			responseWriter.write("useARIA: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilderBase.getUseARIA().toString());
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