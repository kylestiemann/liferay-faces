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
package com.liferay.faces.alloy.component.treenoderadio;

import java.io.IOException;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class TreeNodeRadioRendererBase extends AUIRenderer {

	// Private Constants
	private static final String  AUI_TREE_NODE = "aui-tree-node";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		TreeNodeRadio treeNodeRadio = (TreeNodeRadio) uiComponent;
		encodeHTML(facesContext, treeNodeRadio);
		encodeJavaScript(facesContext, treeNodeRadio);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeRadio treeNodeRadio) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeRadio treeNodeRadio) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, treeNodeRadio, AUI_TREE_NODE);

		bufferedResponseWriter.write("var treeNodeRadio = new Y.TreeNodeRadio");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);

		if(treeNodeRadio.getAlwaysShowHitArea() != null)
		{

			bufferedResponseWriter.write("alwaysShowHitArea: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getAlwaysShowHitArea().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getBoundingBox() != null)
		{

			bufferedResponseWriter.write("boundingBox: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getBoundingBox().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCache() != null)
		{

			bufferedResponseWriter.write("cache: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getCache().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCheckContainerEl() != null)
		{

			bufferedResponseWriter.write("checkContainerEl: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getCheckContainerEl().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCheckEl() != null)
		{

			bufferedResponseWriter.write("checkEl: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getCheckEl().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCheckName() != null)
		{

			bufferedResponseWriter.write("checkName: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getCheckName().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getChecked() != null)
		{

			bufferedResponseWriter.write("checked: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getChecked().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getTreenoderadioChildren() != null)
		{

			bufferedResponseWriter.write("treenoderadioChildren: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getTreenoderadioChildren().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getContainer() != null)
		{

			bufferedResponseWriter.write("container: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getContainer().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getContentBox() != null)
		{

			bufferedResponseWriter.write("contentBox: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getContentBox().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getCssClasses() != null)
		{

			bufferedResponseWriter.write("cssClasses: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getCssClasses().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getDraggable() != null)
		{

			bufferedResponseWriter.write("draggable: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getDraggable().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getExpanded() != null)
		{

			bufferedResponseWriter.write("expanded: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getExpanded().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getHitAreaEl() != null)
		{

			bufferedResponseWriter.write("hitAreaEl: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getHitAreaEl().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getIconEl() != null)
		{

			bufferedResponseWriter.write("iconEl: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getIconEl().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getTreenoderadioId() != null)
		{

			bufferedResponseWriter.write("treenoderadioId: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getTreenoderadioId().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getIndex() != null)
		{

			bufferedResponseWriter.write("index: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getIndex().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getIo() != null)
		{

			bufferedResponseWriter.write("io: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getIo().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLabel() != null)
		{

			bufferedResponseWriter.write("label: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getLabel().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLabelEl() != null)
		{

			bufferedResponseWriter.write("labelEl: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getLabelEl().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLeaf() != null)
		{

			bufferedResponseWriter.write("leaf: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getLeaf().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLoaded() != null)
		{

			bufferedResponseWriter.write("loaded: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getLoaded().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getLoading() != null)
		{

			bufferedResponseWriter.write("loading: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getLoading().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getNextSibling() != null)
		{

			bufferedResponseWriter.write("nextSibling: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getNextSibling().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getOwnerTree() != null)
		{

			bufferedResponseWriter.write("ownerTree: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getOwnerTree().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getPaginator() != null)
		{

			bufferedResponseWriter.write("paginator: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getPaginator().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getParentNode() != null)
		{

			bufferedResponseWriter.write("parentNode: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getParentNode().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getPrevSibling() != null)
		{

			bufferedResponseWriter.write("prevSibling: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getPrevSibling().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getRendered() != null)
		{

			bufferedResponseWriter.write("rendered: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getRendered().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeNodeRadio.getTabIndex() != null)
		{

			bufferedResponseWriter.write("tabIndex: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeNodeRadio.getTabIndex().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);
		
		endJavaScript(facesContext);
		
		handleBuffer(facesContext, treeNodeRadio, AUI_TREE_NODE);
		
		facesContext.setResponseWriter(backupResponseWriter);
	}

}