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
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class TreeViewDDRendererBase extends AUIRenderer {

	// Private Constants
	private static final String  AUI_TREE_VIEW = "aui-tree-view";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		TreeViewDD treeViewDD = (TreeViewDD) uiComponent;
		encodeHTML(facesContext, treeViewDD);
		encodeJavaScript(facesContext, treeViewDD);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeViewDD treeViewDD) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeViewDD treeViewDD) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, treeViewDD, AUI_TREE_VIEW);

		bufferedResponseWriter.write("var treeViewDD = new Y.TreeViewDD");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);

		if(treeViewDD.getTreeviewddChildren() != null)
		{

			bufferedResponseWriter.write("treeviewddChildren: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getTreeviewddChildren().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getContainer() != null)
		{

			bufferedResponseWriter.write("container: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getContainer().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getDropAction() != null)
		{

			bufferedResponseWriter.write("dropAction: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getDropAction().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getHelper() != null)
		{

			bufferedResponseWriter.write("helper: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getHelper().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getIndex() != null)
		{

			bufferedResponseWriter.write("index: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getIndex().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getLastSelected() != null)
		{

			bufferedResponseWriter.write("lastSelected: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getLastSelected().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getLastY() != null)
		{

			bufferedResponseWriter.write("lastY: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getLastY().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getLazyLoad() != null)
		{

			bufferedResponseWriter.write("lazyLoad: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getLazyLoad().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getNode() != null)
		{

			bufferedResponseWriter.write("node: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getNode().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getNodeContent() != null)
		{

			bufferedResponseWriter.write("nodeContent: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getNodeContent().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getScrollDelay() != null)
		{

			bufferedResponseWriter.write("scrollDelay: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getScrollDelay().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getSelectOnToggle() != null)
		{

			bufferedResponseWriter.write("selectOnToggle: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getSelectOnToggle().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(treeViewDD.getType() != null)
		{

			bufferedResponseWriter.write("type: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(treeViewDD.getType().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);
		
		endJavaScript(facesContext);
		
		handleBuffer(facesContext, treeViewDD, AUI_TREE_VIEW);
		
		facesContext.setResponseWriter(backupResponseWriter);
	}

}