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
package com.liferay.faces.alloy.component.treenodetask;

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
public abstract class TreeNodeTaskRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		TreeNodeTask treeNodeTask = (TreeNodeTask) uiComponent;
		encodeHTML(facesContext, treeNodeTask);
		encodeJavaScript(facesContext, treeNodeTask);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeTask treeNodeTask) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeTask treeNodeTask) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", treeNodeTask);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-treenodetask',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var treeNodeTask = new Y.TreeNodeTask");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(treeNodeTask.getAlwaysShowHitArea() != null)
		{

			responseWriter.write("alwaysShowHitArea: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getAlwaysShowHitArea().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getBoundingBox() != null)
		{

			responseWriter.write("boundingBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getBoundingBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getCache() != null)
		{

			responseWriter.write("cache: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getCache().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getCheckContainerEl() != null)
		{

			responseWriter.write("checkContainerEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getCheckContainerEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getCheckEl() != null)
		{

			responseWriter.write("checkEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getCheckEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getCheckName() != null)
		{

			responseWriter.write("checkName: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getCheckName().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getChecked() != null)
		{

			responseWriter.write("checked: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getChecked().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getTreenodetaskChildren() != null)
		{

			responseWriter.write("treenodetaskChildren: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getTreenodetaskChildren().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getContainer() != null)
		{

			responseWriter.write("container: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getContainer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getContentBox() != null)
		{

			responseWriter.write("contentBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getContentBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getCssClasses() != null)
		{

			responseWriter.write("cssClasses: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getCssClasses().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getDraggable() != null)
		{

			responseWriter.write("draggable: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getDraggable().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getExpanded() != null)
		{

			responseWriter.write("expanded: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getExpanded().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getHitAreaEl() != null)
		{

			responseWriter.write("hitAreaEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getHitAreaEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getIconEl() != null)
		{

			responseWriter.write("iconEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getIconEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getTreenodetaskId() != null)
		{

			responseWriter.write("treenodetaskId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getTreenodetaskId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getIndex() != null)
		{

			responseWriter.write("index: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getIo() != null)
		{

			responseWriter.write("io: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getIo().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getLabelEl() != null)
		{

			responseWriter.write("labelEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getLabelEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getLeaf() != null)
		{

			responseWriter.write("leaf: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getLeaf().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getLoaded() != null)
		{

			responseWriter.write("loaded: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getLoaded().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getLoading() != null)
		{

			responseWriter.write("loading: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getLoading().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getNextSibling() != null)
		{

			responseWriter.write("nextSibling: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getNextSibling().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getOwnerTree() != null)
		{

			responseWriter.write("ownerTree: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getOwnerTree().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getPaginator() != null)
		{

			responseWriter.write("paginator: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getPaginator().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getParentNode() != null)
		{

			responseWriter.write("parentNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getParentNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getPrevSibling() != null)
		{

			responseWriter.write("prevSibling: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getPrevSibling().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getRendered() != null)
		{

			responseWriter.write("rendered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getRendered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeTask.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(treeNodeTask.getTabIndex().toString());
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