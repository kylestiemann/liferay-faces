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
public abstract class TreeNodeRadioRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, treeNodeRadio);

		bufferedResponseWriter.write("var treeNodeRadio = new A.TreeNodeRadio");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renrederedAttributes, treeNodeRadio);
		renderBoundingBox(renrederedAttributes, treeNodeRadio);
		renderCache(renrederedAttributes, treeNodeRadio);
		renderCheckContainerEl(renrederedAttributes, treeNodeRadio);
		renderCheckEl(renrederedAttributes, treeNodeRadio);
		renderCheckName(renrederedAttributes, treeNodeRadio);
		renderChecked(renrederedAttributes, treeNodeRadio);
		renderTreenoderadioChildren(renrederedAttributes, treeNodeRadio);
		renderContainer(renrederedAttributes, treeNodeRadio);
		renderContentBox(renrederedAttributes, treeNodeRadio);
		renderCssClasses(renrederedAttributes, treeNodeRadio);
		renderDestroyed(renrederedAttributes, treeNodeRadio);
		renderDraggable(renrederedAttributes, treeNodeRadio);
		renderExpanded(renrederedAttributes, treeNodeRadio);
		renderHitAreaEl(renrederedAttributes, treeNodeRadio);
		renderIconEl(renrederedAttributes, treeNodeRadio);
		renderTreenoderadioId(renrederedAttributes, treeNodeRadio);
		renderIndex(renrederedAttributes, treeNodeRadio);
		renderInitialized(renrederedAttributes, treeNodeRadio);
		renderIo(renrederedAttributes, treeNodeRadio);
		renderLabel(renrederedAttributes, treeNodeRadio);
		renderLabelEl(renrederedAttributes, treeNodeRadio);
		renderLeaf(renrederedAttributes, treeNodeRadio);
		renderLoaded(renrederedAttributes, treeNodeRadio);
		renderLoading(renrederedAttributes, treeNodeRadio);
		renderNextSibling(renrederedAttributes, treeNodeRadio);
		renderOwnerTree(renrederedAttributes, treeNodeRadio);
		renderPaginator(renrederedAttributes, treeNodeRadio);
		renderParentNode(renrederedAttributes, treeNodeRadio);
		renderPrevSibling(renrederedAttributes, treeNodeRadio);
		renderRendered(renrederedAttributes, treeNodeRadio);
		renderTabIndex(renrederedAttributes, treeNodeRadio);

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

		handleBuffer(facesContext, treeNodeRadio);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getAlwaysShowHitArea() != null) {
			renrederedAttributes.add(renderBoolean("alwaysShowHitArea", treeNodeRadio.getAlwaysShowHitArea()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", treeNodeRadio.getBoundingBox()));
		}
	}

	protected void renderCache(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getCache() != null) {
			renrederedAttributes.add(renderBoolean("cache", treeNodeRadio.getCache()));
		}
	}

	protected void renderCheckContainerEl(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getCheckContainerEl() != null) {
			renrederedAttributes.add(renderString("checkContainerEl", treeNodeRadio.getCheckContainerEl()));
		}
	}

	protected void renderCheckEl(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getCheckEl() != null) {
			renrederedAttributes.add(renderString("checkEl", treeNodeRadio.getCheckEl()));
		}
	}

	protected void renderCheckName(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getCheckName() != null) {
			renrederedAttributes.add(renderString("checkName", treeNodeRadio.getCheckName()));
		}
	}

	protected void renderChecked(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getChecked() != null) {
			renrederedAttributes.add(renderBoolean("checked", treeNodeRadio.getChecked()));
		}
	}

	protected void renderTreenoderadioChildren(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getTreenoderadioChildren() != null) {
			renrederedAttributes.add(renderArray("treenoderadioChildren", treeNodeRadio.getTreenoderadioChildren()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getContainer() != null) {
			renrederedAttributes.add(renderString("container", treeNodeRadio.getContainer()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", treeNodeRadio.getContentBox()));
		}
	}

	protected void renderCssClasses(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getCssClasses() != null) {
			renrederedAttributes.add(renderObject("cssClasses", treeNodeRadio.getCssClasses()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", treeNodeRadio.getDestroyed()));
		}
	}

	protected void renderDraggable(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getDraggable() != null) {
			renrederedAttributes.add(renderBoolean("draggable", treeNodeRadio.getDraggable()));
		}
	}

	protected void renderExpanded(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getExpanded() != null) {
			renrederedAttributes.add(renderBoolean("expanded", treeNodeRadio.getExpanded()));
		}
	}

	protected void renderHitAreaEl(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getHitAreaEl() != null) {
			renrederedAttributes.add(renderString("hitAreaEl", treeNodeRadio.getHitAreaEl()));
		}
	}

	protected void renderIconEl(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getIconEl() != null) {
			renrederedAttributes.add(renderString("iconEl", treeNodeRadio.getIconEl()));
		}
	}

	protected void renderTreenoderadioId(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getTreenoderadioId() != null) {
			renrederedAttributes.add(renderString("treenoderadioId", treeNodeRadio.getTreenoderadioId()));
		}
	}

	protected void renderIndex(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getIndex() != null) {
			renrederedAttributes.add(renderObject("index", treeNodeRadio.getIndex()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", treeNodeRadio.getInitialized()));
		}
	}

	protected void renderIo(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getIo() != null) {
			renrederedAttributes.add(renderObject("io", treeNodeRadio.getIo()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getLabel() != null) {
			renrederedAttributes.add(renderString("label", treeNodeRadio.getLabel()));
		}
	}

	protected void renderLabelEl(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getLabelEl() != null) {
			renrederedAttributes.add(renderString("labelEl", treeNodeRadio.getLabelEl()));
		}
	}

	protected void renderLeaf(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getLeaf() != null) {
			renrederedAttributes.add(renderBoolean("leaf", treeNodeRadio.getLeaf()));
		}
	}

	protected void renderLoaded(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getLoaded() != null) {
			renrederedAttributes.add(renderBoolean("loaded", treeNodeRadio.getLoaded()));
		}
	}

	protected void renderLoading(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getLoading() != null) {
			renrederedAttributes.add(renderBoolean("loading", treeNodeRadio.getLoading()));
		}
	}

	protected void renderNextSibling(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getNextSibling() != null) {
			renrederedAttributes.add(renderString("nextSibling", treeNodeRadio.getNextSibling()));
		}
	}

	protected void renderOwnerTree(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getOwnerTree() != null) {
			renrederedAttributes.add(renderString("ownerTree", treeNodeRadio.getOwnerTree()));
		}
	}

	protected void renderPaginator(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getPaginator() != null) {
			renrederedAttributes.add(renderObject("paginator", treeNodeRadio.getPaginator()));
		}
	}

	protected void renderParentNode(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getParentNode() != null) {
			renrederedAttributes.add(renderString("parentNode", treeNodeRadio.getParentNode()));
		}
	}

	protected void renderPrevSibling(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getPrevSibling() != null) {
			renrederedAttributes.add(renderString("prevSibling", treeNodeRadio.getPrevSibling()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", treeNodeRadio.getRendered()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, TreeNodeRadio treeNodeRadio) throws IOException {
		if (treeNodeRadio.getTabIndex() != null) {
			renrederedAttributes.add(renderString("tabIndex", treeNodeRadio.getTabIndex()));
		}
	}

}