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
package com.liferay.faces.alloy.component.treeviewdd;

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
public abstract class TreeViewDDRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		TreeViewDD treeViewDD = (TreeViewDD) uiComponent;
		encodeHTML(facesContext, treeViewDD);
		encodeJavaScript(facesContext, treeViewDD);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeViewDD treeViewDD) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeViewDD treeViewDD) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", treeViewDD);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-treeviewdd',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var treeViewDD = new Y.TreeViewDD");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(treeViewDD.getTreeviewddChildren() != null)
		{

			responseWriter.write("treeviewddChildren: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getTreeviewddChildren().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getContainer() != null)
		{

			responseWriter.write("container: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getDropAction() != null)
		{

			responseWriter.write("dropAction: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getDropAction().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getHelper() != null)
		{

			responseWriter.write("helper: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getHelper().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getIndex() != null)
		{

			responseWriter.write("index: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getLastSelected() != null)
		{

			responseWriter.write("lastSelected: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getLastSelected().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getLastY() != null)
		{

			responseWriter.write("lastY: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getLastY().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getLazyLoad() != null)
		{

			responseWriter.write("lazyLoad: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getLazyLoad().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getNode() != null)
		{

			responseWriter.write("node: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getNodeContent() != null)
		{

			responseWriter.write("nodeContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getNodeContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getScrollDelay() != null)
		{

			responseWriter.write("scrollDelay: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getScrollDelay().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getSelectOnToggle() != null)
		{

			responseWriter.write("selectOnToggle: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getSelectOnToggle().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getType() != null)
		{

			responseWriter.write("type: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeViewDD.getType().toString());
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