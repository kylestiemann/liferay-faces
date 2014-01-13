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
package com.liferay.faces.alloy.component.treenodecheck;

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
public abstract class TreeNodeCheckRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		TreeNodeCheck treeNodeCheck = (TreeNodeCheck) uiComponent;
		encodeHTML(facesContext, treeNodeCheck);
		encodeJavaScript(facesContext, treeNodeCheck);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeCheck treeNodeCheck) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeCheck treeNodeCheck) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", treeNodeCheck);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-treenodecheck',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var treeNodeCheck = new Y.TreeNodeCheck");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(treeNodeCheck.getAlwaysShowHitArea() != null)
		{

			responseWriter.write("alwaysShowHitArea: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getAlwaysShowHitArea().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getBoundingBox() != null)
		{

			responseWriter.write("boundingBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getBoundingBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getCache() != null)
		{

			responseWriter.write("cache: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getCache().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getCheckContainerEl() != null)
		{

			responseWriter.write("checkContainerEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getCheckContainerEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getCheckEl() != null)
		{

			responseWriter.write("checkEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getCheckEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getCheckName() != null)
		{

			responseWriter.write("checkName: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getCheckName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getChecked() != null)
		{

			responseWriter.write("checked: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getChecked().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getTreenodecheckChildren() != null)
		{

			responseWriter.write("treenodecheckChildren: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getTreenodecheckChildren().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getContainer() != null)
		{

			responseWriter.write("container: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getContentBox() != null)
		{

			responseWriter.write("contentBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getContentBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getCssClasses() != null)
		{

			responseWriter.write("cssClasses: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getCssClasses().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getDraggable() != null)
		{

			responseWriter.write("draggable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getDraggable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getExpanded() != null)
		{

			responseWriter.write("expanded: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getExpanded().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getHitAreaEl() != null)
		{

			responseWriter.write("hitAreaEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getHitAreaEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getIconEl() != null)
		{

			responseWriter.write("iconEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getIconEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getTreenodecheckId() != null)
		{

			responseWriter.write("treenodecheckId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getTreenodecheckId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getIndex() != null)
		{

			responseWriter.write("index: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getIo() != null)
		{

			responseWriter.write("io: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getIo().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getLabelEl() != null)
		{

			responseWriter.write("labelEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getLabelEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getLeaf() != null)
		{

			responseWriter.write("leaf: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getLeaf().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getLoaded() != null)
		{

			responseWriter.write("loaded: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getLoaded().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getLoading() != null)
		{

			responseWriter.write("loading: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getLoading().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getNextSibling() != null)
		{

			responseWriter.write("nextSibling: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getNextSibling().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getOwnerTree() != null)
		{

			responseWriter.write("ownerTree: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getOwnerTree().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getPaginator() != null)
		{

			responseWriter.write("paginator: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getPaginator().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getParentNode() != null)
		{

			responseWriter.write("parentNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getParentNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getPrevSibling() != null)
		{

			responseWriter.write("prevSibling: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getPrevSibling().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getRendered() != null)
		{

			responseWriter.write("rendered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getRendered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeCheck.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeCheck.getTabIndex().toString());
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