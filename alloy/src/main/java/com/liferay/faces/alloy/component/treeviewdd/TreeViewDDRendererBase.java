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
public abstract class TreeViewDDRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-view";

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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, treeViewDD);

		bufferedResponseWriter.write("var treeViewDD = new A.TreeViewDD");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderTreeviewddChildren(renrederedAttributes, treeViewDD);
		renderContainer(renrederedAttributes, treeViewDD);
		renderDestroyed(renrederedAttributes, treeViewDD);
		renderDropAction(renrederedAttributes, treeViewDD);
		renderHelper(renrederedAttributes, treeViewDD);
		renderIndex(renrederedAttributes, treeViewDD);
		renderInitialized(renrederedAttributes, treeViewDD);
		renderLastSelected(renrederedAttributes, treeViewDD);
		renderLastY(renrederedAttributes, treeViewDD);
		renderLazyLoad(renrederedAttributes, treeViewDD);
		renderNode(renrederedAttributes, treeViewDD);
		renderNodeContent(renrederedAttributes, treeViewDD);
		renderScrollDelay(renrederedAttributes, treeViewDD);
		renderSelectOnToggle(renrederedAttributes, treeViewDD);
		renderType(renrederedAttributes, treeViewDD);

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

		endJavaScript(facesContext);

		handleBuffer(facesContext, treeViewDD);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderTreeviewddChildren(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getTreeviewddChildren() != null) {
			renrederedAttributes.add(renderArray("treeviewddChildren", treeViewDD.getTreeviewddChildren()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getContainer() != null) {
			renrederedAttributes.add(renderString("container", treeViewDD.getContainer()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", treeViewDD.getDestroyed()));
		}
	}

	protected void renderDropAction(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getDropAction() != null) {
			renrederedAttributes.add(renderString("dropAction", treeViewDD.getDropAction()));
		}
	}

	protected void renderHelper(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getHelper() != null) {
			renrederedAttributes.add(renderString("helper", treeViewDD.getHelper()));
		}
	}

	protected void renderIndex(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getIndex() != null) {
			renrederedAttributes.add(renderObject("index", treeViewDD.getIndex()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", treeViewDD.getInitialized()));
		}
	}

	protected void renderLastSelected(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getLastSelected() != null) {
			renrederedAttributes.add(renderString("lastSelected", treeViewDD.getLastSelected()));
		}
	}

	protected void renderLastY(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getLastY() != null) {
			renrederedAttributes.add(renderNumber("lastY", treeViewDD.getLastY()));
		}
	}

	protected void renderLazyLoad(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getLazyLoad() != null) {
			renrederedAttributes.add(renderBoolean("lazyLoad", treeViewDD.getLazyLoad()));
		}
	}

	protected void renderNode(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getNode() != null) {
			renrederedAttributes.add(renderString("node", treeViewDD.getNode()));
		}
	}

	protected void renderNodeContent(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getNodeContent() != null) {
			renrederedAttributes.add(renderString("nodeContent", treeViewDD.getNodeContent()));
		}
	}

	protected void renderScrollDelay(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getScrollDelay() != null) {
			renrederedAttributes.add(renderNumber("scrollDelay", treeViewDD.getScrollDelay()));
		}
	}

	protected void renderSelectOnToggle(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getSelectOnToggle() != null) {
			renrederedAttributes.add(renderBoolean("selectOnToggle", treeViewDD.getSelectOnToggle()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, TreeViewDD treeViewDD) throws IOException {
		if (treeViewDD.getType() != null) {
			renrederedAttributes.add(renderString("type", treeViewDD.getType()));
		}
	}

}