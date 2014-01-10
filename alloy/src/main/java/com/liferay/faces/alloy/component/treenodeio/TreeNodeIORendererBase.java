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
package com.liferay.faces.alloy.component.treenodeio;

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
public abstract class TreeNodeIORendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		TreeNodeIO treeNodeIO = (TreeNodeIO) uiComponent;
		encodeHTML(facesContext, treeNodeIO);
		encodeJavaScript(facesContext, treeNodeIO);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeIO treeNodeIO) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeIO treeNodeIO) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", treeNodeIO);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-treenodeio',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var treeNodeIO = new Y.TreeNodeIO");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(treeNodeIO.getAlwaysShowHitArea() != null)
		{

			responseWriter.write("alwaysShowHitArea: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getAlwaysShowHitArea().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getBoundingBox() != null)
		{

			responseWriter.write("boundingBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getBoundingBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getCache() != null)
		{

			responseWriter.write("cache: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getCache().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getTreenodeioChildren() != null)
		{

			responseWriter.write("treenodeioChildren: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getTreenodeioChildren().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getContainer() != null)
		{

			responseWriter.write("container: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getContentBox() != null)
		{

			responseWriter.write("contentBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getContentBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getCssClasses() != null)
		{

			responseWriter.write("cssClasses: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getCssClasses().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getDraggable() != null)
		{

			responseWriter.write("draggable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getDraggable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getExpanded() != null)
		{

			responseWriter.write("expanded: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getExpanded().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getHitAreaEl() != null)
		{

			responseWriter.write("hitAreaEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getHitAreaEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getIconEl() != null)
		{

			responseWriter.write("iconEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getIconEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getTreenodeioId() != null)
		{

			responseWriter.write("treenodeioId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getTreenodeioId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getIndex() != null)
		{

			responseWriter.write("index: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getIo() != null)
		{

			responseWriter.write("io: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getIo().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getLabelEl() != null)
		{

			responseWriter.write("labelEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getLabelEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getLeaf() != null)
		{

			responseWriter.write("leaf: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getLeaf().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getLoaded() != null)
		{

			responseWriter.write("loaded: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getLoaded().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getLoading() != null)
		{

			responseWriter.write("loading: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getLoading().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getNextSibling() != null)
		{

			responseWriter.write("nextSibling: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getNextSibling().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getOwnerTree() != null)
		{

			responseWriter.write("ownerTree: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getOwnerTree().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getPaginator() != null)
		{

			responseWriter.write("paginator: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getPaginator().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getParentNode() != null)
		{

			responseWriter.write("parentNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getParentNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getPrevSibling() != null)
		{

			responseWriter.write("prevSibling: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getPrevSibling().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getRendered() != null)
		{

			responseWriter.write("rendered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getRendered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeIO.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeIO.getTabIndex().toString());
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