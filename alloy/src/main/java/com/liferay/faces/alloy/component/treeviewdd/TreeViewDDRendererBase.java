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
public abstract class TreeViewDDRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-view";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeViewDD treeViewDD = (TreeViewDD) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeViewDD = new A.TreeViewDD");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderTreeViewDDChildren(renderedAttributes, treeViewDD);
		renderContainer(renderedAttributes, treeViewDD);
		renderDestroyed(renderedAttributes, treeViewDD);
		renderDropAction(renderedAttributes, treeViewDD);
		renderHelper(renderedAttributes, treeViewDD);
		renderIndex(renderedAttributes, treeViewDD);
		renderInitialized(renderedAttributes, treeViewDD);
		renderLastSelected(renderedAttributes, treeViewDD);
		renderLastY(renderedAttributes, treeViewDD);
		renderLazyLoad(renderedAttributes, treeViewDD);
		renderNode(renderedAttributes, treeViewDD);
		renderNodeContent(renderedAttributes, treeViewDD);
		renderScrollDelay(renderedAttributes, treeViewDD);
		renderSelectOnToggle(renderedAttributes, treeViewDD);
		renderType(renderedAttributes, treeViewDD);

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

	protected void renderTreeViewDDChildren(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object treeViewDDChildren = treeViewDD.getTreeViewDDChildren();

		if (treeViewDDChildren != null) {
			renderedAttributes.add(renderArray(TreeViewDD.TREE_VIEW_DDCHILDREN, treeViewDDChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String container = treeViewDD.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeViewDD.CONTAINER, container));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Boolean destroyed = treeViewDD.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeViewDD.DESTROYED, destroyed));
		}
	}

	protected void renderDropAction(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String dropAction = treeViewDD.getDropAction();

		if (dropAction != null) {
			renderedAttributes.add(renderString(TreeViewDD.DROP_ACTION, dropAction));
		}
	}

	protected void renderHelper(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String helper = treeViewDD.getHelper();

		if (helper != null) {
			renderedAttributes.add(renderString(TreeViewDD.HELPER, helper));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object index = treeViewDD.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeViewDD.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Boolean initialized = treeViewDD.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeViewDD.INITIALIZED, initialized));
		}
	}

	protected void renderLastSelected(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object lastSelected = treeViewDD.getLastSelected();

		if (lastSelected != null) {
			renderedAttributes.add(renderString(TreeViewDD.LAST_SELECTED, lastSelected));
		}
	}

	protected void renderLastY(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object lastY = treeViewDD.getLastY();

		if (lastY != null) {
			renderedAttributes.add(renderNumber(TreeViewDD.LAST_Y, lastY));
		}
	}

	protected void renderLazyLoad(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Boolean lazyLoad = treeViewDD.getLazyLoad();

		if (lazyLoad != null) {
			renderedAttributes.add(renderBoolean(TreeViewDD.LAZY_LOAD, lazyLoad));
		}
	}

	protected void renderNode(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String node = treeViewDD.getNode();

		if (node != null) {
			renderedAttributes.add(renderString(TreeViewDD.NODE, node));
		}
	}

	protected void renderNodeContent(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object nodeContent = treeViewDD.getNodeContent();

		if (nodeContent != null) {
			renderedAttributes.add(renderString(TreeViewDD.NODE_CONTENT, nodeContent));
		}
	}

	protected void renderScrollDelay(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object scrollDelay = treeViewDD.getScrollDelay();

		if (scrollDelay != null) {
			renderedAttributes.add(renderNumber(TreeViewDD.SCROLL_DELAY, scrollDelay));
		}
	}

	protected void renderSelectOnToggle(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Boolean selectOnToggle = treeViewDD.getSelectOnToggle();

		if (selectOnToggle != null) {
			renderedAttributes.add(renderBoolean(TreeViewDD.SELECT_ON_TOGGLE, selectOnToggle));
		}
	}

	protected void renderType(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String type = treeViewDD.getType();

		if (type != null) {
			renderedAttributes.add(renderString(TreeViewDD.TYPE, type));
		}
	}

}