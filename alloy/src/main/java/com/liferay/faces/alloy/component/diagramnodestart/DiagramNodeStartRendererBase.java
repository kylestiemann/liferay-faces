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
package com.liferay.faces.alloy.component.diagramnodestart;

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
public abstract class DiagramNodeStartRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		DiagramNodeStart diagramNodeStart = (DiagramNodeStart) uiComponent;
		encodeHTML(facesContext, diagramNodeStart);
		encodeJavaScript(facesContext, diagramNodeStart);
	}

	protected abstract void encodeHTML(FacesContext facesContext, DiagramNodeStart diagramNodeStart) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, DiagramNodeStart diagramNodeStart) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", diagramNodeStart);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-diagramnodestart',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var diagramNodeStart = new Y.DiagramNodeStart");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(diagramNodeStart.getBuilder() != null)
		{

			responseWriter.write("builder: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getBuilder().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getConnectors() != null)
		{

			responseWriter.write("connectors: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getConnectors().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getControlsToolbar() != null)
		{

			responseWriter.write("controlsToolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getControlsToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getDescription() != null)
		{

			responseWriter.write("description: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getDescription().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getGraphic() != null)
		{

			responseWriter.write("graphic: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getGraphic().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getHeight() != null)
		{

			responseWriter.write("height: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getHighlightBoundaryStroke() != null)
		{

			responseWriter.write("highlightBoundaryStroke: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getHighlightBoundaryStroke().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getHighlighted() != null)
		{

			responseWriter.write("highlighted: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getHighlighted().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getName() != null)
		{

			responseWriter.write("name: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getRequired() != null)
		{

			responseWriter.write("required: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getRequired().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getSelected() != null)
		{

			responseWriter.write("selected: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getSelected().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getShapeBoundary() != null)
		{

			responseWriter.write("shapeBoundary: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getShapeBoundary().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getShapeInvite() != null)
		{

			responseWriter.write("shapeInvite: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getShapeInvite().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getTransitions() != null)
		{

			responseWriter.write("transitions: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getTransitions().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getType() != null)
		{

			responseWriter.write("type: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getType().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getWidth() != null)
		{

			responseWriter.write("width: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getWidth().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(diagramNodeStart.getZIndex() != null)
		{

			responseWriter.write("zIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(diagramNodeStart.getZIndex().toString());
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