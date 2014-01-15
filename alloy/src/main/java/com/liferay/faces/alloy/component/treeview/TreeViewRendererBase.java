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
package com.liferay.faces.alloy.component.treeview;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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
public abstract class TreeViewRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-view";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		TreeView treeView = (TreeView) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var treeView = new A.TreeView");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderTreeviewChildren(renrederedAttributes, treeView);
		renderContainer(renrederedAttributes, treeView);
		renderDestroyed(renrederedAttributes, treeView);
		renderIndex(renrederedAttributes, treeView);
		renderInitialized(renrederedAttributes, treeView);
		renderLastSelected(renrederedAttributes, treeView);
		renderLazyLoad(renrederedAttributes, treeView);
		renderSelectOnToggle(renrederedAttributes, treeView);
		renderType(renrederedAttributes, treeView);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderTreeviewChildren(ArrayList<String> renrederedAttributes, TreeView treeView) throws IOException {
		if (treeView.getTreeviewChildren() != null) {
			renrederedAttributes.add(renderArray("treeviewChildren", treeView.getTreeviewChildren()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TreeView treeView) throws IOException {
		if (treeView.getContainer() != null) {
			renrederedAttributes.add(renderString("container", treeView.getContainer()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TreeView treeView) throws IOException {
		if (treeView.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", treeView.getDestroyed()));
		}
	}

	protected void renderIndex(ArrayList<String> renrederedAttributes, TreeView treeView) throws IOException {
		if (treeView.getIndex() != null) {
			renrederedAttributes.add(renderObject("index", treeView.getIndex()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TreeView treeView) throws IOException {
		if (treeView.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", treeView.getInitialized()));
		}
	}

	protected void renderLastSelected(ArrayList<String> renrederedAttributes, TreeView treeView) throws IOException {
		if (treeView.getLastSelected() != null) {
			renrederedAttributes.add(renderString("lastSelected", treeView.getLastSelected()));
		}
	}

	protected void renderLazyLoad(ArrayList<String> renrederedAttributes, TreeView treeView) throws IOException {
		if (treeView.getLazyLoad() != null) {
			renrederedAttributes.add(renderBoolean("lazyLoad", treeView.getLazyLoad()));
		}
	}

	protected void renderSelectOnToggle(ArrayList<String> renrederedAttributes, TreeView treeView) throws IOException {
		if (treeView.getSelectOnToggle() != null) {
			renrederedAttributes.add(renderBoolean("selectOnToggle", treeView.getSelectOnToggle()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, TreeView treeView) throws IOException {
		if (treeView.getType() != null) {
			renrederedAttributes.add(renderString("type", treeView.getType()));
		}
	}

}