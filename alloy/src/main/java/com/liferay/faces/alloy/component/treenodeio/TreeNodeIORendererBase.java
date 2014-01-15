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
package com.liferay.faces.alloy.component.treenodeio;

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
public abstract class TreeNodeIORendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeNodeIO treeNodeIO = (TreeNodeIO) uiComponent;
		encodeHTML(facesContext, treeNodeIO);
		encodeJavaScript(facesContext, treeNodeIO);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeIO treeNodeIO) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeIO treeNodeIO) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, treeNodeIO);

		bufferedResponseWriter.write("var treeNodeIO = new A.TreeNodeIO");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renrederedAttributes, treeNodeIO);
		renderBoundingBox(renrederedAttributes, treeNodeIO);
		renderCache(renrederedAttributes, treeNodeIO);
		renderTreenodeioChildren(renrederedAttributes, treeNodeIO);
		renderContainer(renrederedAttributes, treeNodeIO);
		renderContentBox(renrederedAttributes, treeNodeIO);
		renderCssClasses(renrederedAttributes, treeNodeIO);
		renderDestroyed(renrederedAttributes, treeNodeIO);
		renderDraggable(renrederedAttributes, treeNodeIO);
		renderExpanded(renrederedAttributes, treeNodeIO);
		renderHitAreaEl(renrederedAttributes, treeNodeIO);
		renderIconEl(renrederedAttributes, treeNodeIO);
		renderTreenodeioId(renrederedAttributes, treeNodeIO);
		renderIndex(renrederedAttributes, treeNodeIO);
		renderInitialized(renrederedAttributes, treeNodeIO);
		renderIo(renrederedAttributes, treeNodeIO);
		renderLabel(renrederedAttributes, treeNodeIO);
		renderLabelEl(renrederedAttributes, treeNodeIO);
		renderLeaf(renrederedAttributes, treeNodeIO);
		renderLoaded(renrederedAttributes, treeNodeIO);
		renderLoading(renrederedAttributes, treeNodeIO);
		renderNextSibling(renrederedAttributes, treeNodeIO);
		renderOwnerTree(renrederedAttributes, treeNodeIO);
		renderPaginator(renrederedAttributes, treeNodeIO);
		renderParentNode(renrederedAttributes, treeNodeIO);
		renderPrevSibling(renrederedAttributes, treeNodeIO);
		renderRendered(renrederedAttributes, treeNodeIO);
		renderTabIndex(renrederedAttributes, treeNodeIO);

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

		handleBuffer(facesContext, treeNodeIO);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getAlwaysShowHitArea() != null) {
			renrederedAttributes.add(renderBoolean("alwaysShowHitArea", treeNodeIO.getAlwaysShowHitArea()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", treeNodeIO.getBoundingBox()));
		}
	}

	protected void renderCache(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getCache() != null) {
			renrederedAttributes.add(renderBoolean("cache", treeNodeIO.getCache()));
		}
	}

	protected void renderTreenodeioChildren(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getTreenodeioChildren() != null) {
			renrederedAttributes.add(renderArray("treenodeioChildren", treeNodeIO.getTreenodeioChildren()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getContainer() != null) {
			renrederedAttributes.add(renderString("container", treeNodeIO.getContainer()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", treeNodeIO.getContentBox()));
		}
	}

	protected void renderCssClasses(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getCssClasses() != null) {
			renrederedAttributes.add(renderObject("cssClasses", treeNodeIO.getCssClasses()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", treeNodeIO.getDestroyed()));
		}
	}

	protected void renderDraggable(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getDraggable() != null) {
			renrederedAttributes.add(renderBoolean("draggable", treeNodeIO.getDraggable()));
		}
	}

	protected void renderExpanded(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getExpanded() != null) {
			renrederedAttributes.add(renderBoolean("expanded", treeNodeIO.getExpanded()));
		}
	}

	protected void renderHitAreaEl(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getHitAreaEl() != null) {
			renrederedAttributes.add(renderString("hitAreaEl", treeNodeIO.getHitAreaEl()));
		}
	}

	protected void renderIconEl(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getIconEl() != null) {
			renrederedAttributes.add(renderString("iconEl", treeNodeIO.getIconEl()));
		}
	}

	protected void renderTreenodeioId(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getTreenodeioId() != null) {
			renrederedAttributes.add(renderString("treenodeioId", treeNodeIO.getTreenodeioId()));
		}
	}

	protected void renderIndex(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getIndex() != null) {
			renrederedAttributes.add(renderObject("index", treeNodeIO.getIndex()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", treeNodeIO.getInitialized()));
		}
	}

	protected void renderIo(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getIo() != null) {
			renrederedAttributes.add(renderObject("io", treeNodeIO.getIo()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getLabel() != null) {
			renrederedAttributes.add(renderString("label", treeNodeIO.getLabel()));
		}
	}

	protected void renderLabelEl(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getLabelEl() != null) {
			renrederedAttributes.add(renderString("labelEl", treeNodeIO.getLabelEl()));
		}
	}

	protected void renderLeaf(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getLeaf() != null) {
			renrederedAttributes.add(renderBoolean("leaf", treeNodeIO.getLeaf()));
		}
	}

	protected void renderLoaded(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getLoaded() != null) {
			renrederedAttributes.add(renderBoolean("loaded", treeNodeIO.getLoaded()));
		}
	}

	protected void renderLoading(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getLoading() != null) {
			renrederedAttributes.add(renderBoolean("loading", treeNodeIO.getLoading()));
		}
	}

	protected void renderNextSibling(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getNextSibling() != null) {
			renrederedAttributes.add(renderString("nextSibling", treeNodeIO.getNextSibling()));
		}
	}

	protected void renderOwnerTree(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getOwnerTree() != null) {
			renrederedAttributes.add(renderString("ownerTree", treeNodeIO.getOwnerTree()));
		}
	}

	protected void renderPaginator(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getPaginator() != null) {
			renrederedAttributes.add(renderObject("paginator", treeNodeIO.getPaginator()));
		}
	}

	protected void renderParentNode(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getParentNode() != null) {
			renrederedAttributes.add(renderString("parentNode", treeNodeIO.getParentNode()));
		}
	}

	protected void renderPrevSibling(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getPrevSibling() != null) {
			renrederedAttributes.add(renderString("prevSibling", treeNodeIO.getPrevSibling()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", treeNodeIO.getRendered()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, TreeNodeIO treeNodeIO) throws IOException {
		if (treeNodeIO.getTabIndex() != null) {
			renrederedAttributes.add(renderString("tabIndex", treeNodeIO.getTabIndex()));
		}
	}

}