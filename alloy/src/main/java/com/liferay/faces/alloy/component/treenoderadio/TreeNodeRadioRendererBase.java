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
package com.liferay.faces.alloy.component.treenoderadio;

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
public abstract class TreeNodeRadioRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		TreeNodeRadio treeNodeRadio = (TreeNodeRadio) uiComponent;
		encodeHTML(facesContext, treeNodeRadio);
		encodeJavaScript(facesContext, treeNodeRadio);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeRadio treeNodeRadio) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeRadio treeNodeRadio) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", treeNodeRadio);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-treenoderadio',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var treeNodeRadio = new Y.TreeNodeRadio");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(treeNodeRadio.getAlwaysShowHitArea() != null)
		{

			responseWriter.write("alwaysShowHitArea: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getAlwaysShowHitArea().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getBoundingBox() != null)
		{

			responseWriter.write("boundingBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getBoundingBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCache() != null)
		{

			responseWriter.write("cache: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getCache().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCheckContainerEl() != null)
		{

			responseWriter.write("checkContainerEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getCheckContainerEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCheckEl() != null)
		{

			responseWriter.write("checkEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getCheckEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCheckName() != null)
		{

			responseWriter.write("checkName: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getCheckName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getChecked() != null)
		{

			responseWriter.write("checked: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getChecked().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getTreenoderadioChildren() != null)
		{

			responseWriter.write("treenoderadioChildren: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getTreenoderadioChildren().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getContainer() != null)
		{

			responseWriter.write("container: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getContentBox() != null)
		{

			responseWriter.write("contentBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getContentBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCssClasses() != null)
		{

			responseWriter.write("cssClasses: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getCssClasses().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getDraggable() != null)
		{

			responseWriter.write("draggable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getDraggable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getExpanded() != null)
		{

			responseWriter.write("expanded: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getExpanded().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getHitAreaEl() != null)
		{

			responseWriter.write("hitAreaEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getHitAreaEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getIconEl() != null)
		{

			responseWriter.write("iconEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getIconEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getTreenoderadioId() != null)
		{

			responseWriter.write("treenoderadioId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getTreenoderadioId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getIndex() != null)
		{

			responseWriter.write("index: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getIo() != null)
		{

			responseWriter.write("io: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getIo().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLabelEl() != null)
		{

			responseWriter.write("labelEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getLabelEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLeaf() != null)
		{

			responseWriter.write("leaf: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getLeaf().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLoaded() != null)
		{

			responseWriter.write("loaded: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getLoaded().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLoading() != null)
		{

			responseWriter.write("loading: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getLoading().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getNextSibling() != null)
		{

			responseWriter.write("nextSibling: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getNextSibling().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getOwnerTree() != null)
		{

			responseWriter.write("ownerTree: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getOwnerTree().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getPaginator() != null)
		{

			responseWriter.write("paginator: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getPaginator().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getParentNode() != null)
		{

			responseWriter.write("parentNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getParentNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getPrevSibling() != null)
		{

			responseWriter.write("prevSibling: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getPrevSibling().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getRendered() != null)
		{

			responseWriter.write("rendered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getRendered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeRadio.getTabIndex().toString());
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