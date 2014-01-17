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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TreeViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-view";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeView treeView = (TreeView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeView = new A.TreeView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderTreeViewChildren(renderedAttributes, treeView);
		renderContainer(renderedAttributes, treeView);
		renderDestroyed(renderedAttributes, treeView);
		renderIndex(renderedAttributes, treeView);
		renderInitialized(renderedAttributes, treeView);
		renderLastSelected(renderedAttributes, treeView);
		renderLazyLoad(renderedAttributes, treeView);
		renderSelectOnToggle(renderedAttributes, treeView);
		renderType(renderedAttributes, treeView);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderTreeViewChildren(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Object treeViewChildren = treeView.getTreeViewChildren();

		if (treeViewChildren != null) {
			renderedAttributes.add(renderArray(TreeView.TREE_VIEW_CHILDREN, treeViewChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String container = treeView.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeView.CONTAINER, container));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean destroyed = treeView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeView.DESTROYED, destroyed));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Object index = treeView.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeView.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean initialized = treeView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeView.INITIALIZED, initialized));
		}
	}

	protected void renderLastSelected(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Object lastSelected = treeView.getLastSelected();

		if (lastSelected != null) {
			renderedAttributes.add(renderString(TreeView.LAST_SELECTED, lastSelected));
		}
	}

	protected void renderLazyLoad(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean lazyLoad = treeView.getLazyLoad();

		if (lazyLoad != null) {
			renderedAttributes.add(renderBoolean(TreeView.LAZY_LOAD, lazyLoad));
		}
	}

	protected void renderSelectOnToggle(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean selectOnToggle = treeView.getSelectOnToggle();

		if (selectOnToggle != null) {
			renderedAttributes.add(renderBoolean(TreeView.SELECT_ON_TOGGLE, selectOnToggle));
		}
	}

	protected void renderType(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String type = treeView.getType();

		if (type != null) {
			renderedAttributes.add(renderString(TreeView.TYPE, type));
		}
	}

}