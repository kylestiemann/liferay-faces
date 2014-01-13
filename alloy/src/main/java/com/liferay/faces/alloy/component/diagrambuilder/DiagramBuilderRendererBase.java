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
package com.liferay.faces.alloy.component.diagrambuilder;

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
public abstract class DiagramBuilderRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		DiagramBuilder diagramBuilder = (DiagramBuilder) uiComponent;
		encodeHTML(facesContext, diagramBuilder);
		encodeJavaScript(facesContext, diagramBuilder);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramBuilder diagramBuilder) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramBuilder diagramBuilder) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", diagramBuilder);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-diagrambuilder',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var diagramBuilder = new Y.DiagramBuilder");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(diagramBuilder.getAvailableFields() != null)
		{

			responseWriter.write("availableFields: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getAvailableFields().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getAvailableFieldsDragConfig() != null)
		{

			responseWriter.write("availableFieldsDragConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getAvailableFieldsDragConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getCanvas() != null)
		{

			responseWriter.write("canvas: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getCanvas().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getConnector() != null)
		{

			responseWriter.write("connector: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getConnector().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getContentContainer() != null)
		{

			responseWriter.write("contentContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getContentContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getCssClass() != null)
		{

			responseWriter.write("cssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getDropConfig() != null)
		{

			responseWriter.write("dropConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getDropConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getDropContainer() != null)
		{

			responseWriter.write("dropContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getDropContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getFields() != null)
		{

			responseWriter.write("fields: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getFields().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getFieldsContainer() != null)
		{

			responseWriter.write("fieldsContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getFieldsContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getFieldsDragConfig() != null)
		{

			responseWriter.write("fieldsDragConfig: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getFieldsDragConfig().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getGraphic() != null)
		{

			responseWriter.write("graphic: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getGraphic().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getHideClass() != null)
		{

			responseWriter.write("hideClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getHideClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getHighlightDropZones() != null)
		{

			responseWriter.write("highlightDropZones: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getHighlightDropZones().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getMaxFields() != null)
		{

			responseWriter.write("maxFields: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getMaxFields().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getPropertyList() != null)
		{

			responseWriter.write("propertyList: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getPropertyList().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getShowSuggestConnector() != null)
		{

			responseWriter.write("showSuggestConnector: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getShowSuggestConnector().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getSuggestConnectorOverlay() != null)
		{

			responseWriter.write("suggestConnectorOverlay: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getSuggestConnectorOverlay().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getTabView() != null)
		{

			responseWriter.write("tabView: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getTabView().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getToolbar() != null)
		{

			responseWriter.write("toolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getToolbarContainer() != null)
		{

			responseWriter.write("toolbarContainer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getToolbarContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramBuilder.getUseARIA() != null)
		{

			responseWriter.write("useARIA: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramBuilder.getUseARIA().toString());
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