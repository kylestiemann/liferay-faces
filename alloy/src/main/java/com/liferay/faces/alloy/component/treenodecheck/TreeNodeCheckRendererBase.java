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
public abstract class TreeNodeCheckRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeNodeCheck treeNodeCheck = (TreeNodeCheck) uiComponent;
		encodeHTML(facesContext, treeNodeCheck);
		encodeJavaScript(facesContext, treeNodeCheck);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeCheck treeNodeCheck) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeCheck treeNodeCheck) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, treeNodeCheck);

		bufferedResponseWriter.write("var treeNodeCheck = new A.TreeNodeCheck");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renrederedAttributes, treeNodeCheck);
		renderBoundingBox(renrederedAttributes, treeNodeCheck);
		renderCache(renrederedAttributes, treeNodeCheck);
		renderCheckContainerEl(renrederedAttributes, treeNodeCheck);
		renderCheckEl(renrederedAttributes, treeNodeCheck);
		renderCheckName(renrederedAttributes, treeNodeCheck);
		renderChecked(renrederedAttributes, treeNodeCheck);
		renderTreenodecheckChildren(renrederedAttributes, treeNodeCheck);
		renderContainer(renrederedAttributes, treeNodeCheck);
		renderContentBox(renrederedAttributes, treeNodeCheck);
		renderCssClasses(renrederedAttributes, treeNodeCheck);
		renderDestroyed(renrederedAttributes, treeNodeCheck);
		renderDraggable(renrederedAttributes, treeNodeCheck);
		renderExpanded(renrederedAttributes, treeNodeCheck);
		renderHitAreaEl(renrederedAttributes, treeNodeCheck);
		renderIconEl(renrederedAttributes, treeNodeCheck);
		renderTreenodecheckId(renrederedAttributes, treeNodeCheck);
		renderIndex(renrederedAttributes, treeNodeCheck);
		renderInitialized(renrederedAttributes, treeNodeCheck);
		renderIo(renrederedAttributes, treeNodeCheck);
		renderLabel(renrederedAttributes, treeNodeCheck);
		renderLabelEl(renrederedAttributes, treeNodeCheck);
		renderLeaf(renrederedAttributes, treeNodeCheck);
		renderLoaded(renrederedAttributes, treeNodeCheck);
		renderLoading(renrederedAttributes, treeNodeCheck);
		renderNextSibling(renrederedAttributes, treeNodeCheck);
		renderOwnerTree(renrederedAttributes, treeNodeCheck);
		renderPaginator(renrederedAttributes, treeNodeCheck);
		renderParentNode(renrederedAttributes, treeNodeCheck);
		renderPrevSibling(renrederedAttributes, treeNodeCheck);
		renderRendered(renrederedAttributes, treeNodeCheck);
		renderTabIndex(renrederedAttributes, treeNodeCheck);

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

		handleBuffer(facesContext, treeNodeCheck);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getAlwaysShowHitArea() != null) {
			renrederedAttributes.add(renderBoolean("alwaysShowHitArea", treeNodeCheck.getAlwaysShowHitArea()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", treeNodeCheck.getBoundingBox()));
		}
	}

	protected void renderCache(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getCache() != null) {
			renrederedAttributes.add(renderBoolean("cache", treeNodeCheck.getCache()));
		}
	}

	protected void renderCheckContainerEl(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getCheckContainerEl() != null) {
			renrederedAttributes.add(renderString("checkContainerEl", treeNodeCheck.getCheckContainerEl()));
		}
	}

	protected void renderCheckEl(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getCheckEl() != null) {
			renrederedAttributes.add(renderString("checkEl", treeNodeCheck.getCheckEl()));
		}
	}

	protected void renderCheckName(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getCheckName() != null) {
			renrederedAttributes.add(renderString("checkName", treeNodeCheck.getCheckName()));
		}
	}

	protected void renderChecked(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getChecked() != null) {
			renrederedAttributes.add(renderBoolean("checked", treeNodeCheck.getChecked()));
		}
	}

	protected void renderTreenodecheckChildren(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getTreenodecheckChildren() != null) {
			renrederedAttributes.add(renderArray("treenodecheckChildren", treeNodeCheck.getTreenodecheckChildren()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getContainer() != null) {
			renrederedAttributes.add(renderString("container", treeNodeCheck.getContainer()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", treeNodeCheck.getContentBox()));
		}
	}

	protected void renderCssClasses(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getCssClasses() != null) {
			renrederedAttributes.add(renderObject("cssClasses", treeNodeCheck.getCssClasses()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", treeNodeCheck.getDestroyed()));
		}
	}

	protected void renderDraggable(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getDraggable() != null) {
			renrederedAttributes.add(renderBoolean("draggable", treeNodeCheck.getDraggable()));
		}
	}

	protected void renderExpanded(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getExpanded() != null) {
			renrederedAttributes.add(renderBoolean("expanded", treeNodeCheck.getExpanded()));
		}
	}

	protected void renderHitAreaEl(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getHitAreaEl() != null) {
			renrederedAttributes.add(renderString("hitAreaEl", treeNodeCheck.getHitAreaEl()));
		}
	}

	protected void renderIconEl(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getIconEl() != null) {
			renrederedAttributes.add(renderString("iconEl", treeNodeCheck.getIconEl()));
		}
	}

	protected void renderTreenodecheckId(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getTreenodecheckId() != null) {
			renrederedAttributes.add(renderString("treenodecheckId", treeNodeCheck.getTreenodecheckId()));
		}
	}

	protected void renderIndex(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getIndex() != null) {
			renrederedAttributes.add(renderObject("index", treeNodeCheck.getIndex()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", treeNodeCheck.getInitialized()));
		}
	}

	protected void renderIo(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getIo() != null) {
			renrederedAttributes.add(renderObject("io", treeNodeCheck.getIo()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getLabel() != null) {
			renrederedAttributes.add(renderString("label", treeNodeCheck.getLabel()));
		}
	}

	protected void renderLabelEl(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getLabelEl() != null) {
			renrederedAttributes.add(renderString("labelEl", treeNodeCheck.getLabelEl()));
		}
	}

	protected void renderLeaf(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getLeaf() != null) {
			renrederedAttributes.add(renderBoolean("leaf", treeNodeCheck.getLeaf()));
		}
	}

	protected void renderLoaded(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getLoaded() != null) {
			renrederedAttributes.add(renderBoolean("loaded", treeNodeCheck.getLoaded()));
		}
	}

	protected void renderLoading(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getLoading() != null) {
			renrederedAttributes.add(renderBoolean("loading", treeNodeCheck.getLoading()));
		}
	}

	protected void renderNextSibling(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getNextSibling() != null) {
			renrederedAttributes.add(renderString("nextSibling", treeNodeCheck.getNextSibling()));
		}
	}

	protected void renderOwnerTree(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getOwnerTree() != null) {
			renrederedAttributes.add(renderString("ownerTree", treeNodeCheck.getOwnerTree()));
		}
	}

	protected void renderPaginator(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getPaginator() != null) {
			renrederedAttributes.add(renderObject("paginator", treeNodeCheck.getPaginator()));
		}
	}

	protected void renderParentNode(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getParentNode() != null) {
			renrederedAttributes.add(renderString("parentNode", treeNodeCheck.getParentNode()));
		}
	}

	protected void renderPrevSibling(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getPrevSibling() != null) {
			renrederedAttributes.add(renderString("prevSibling", treeNodeCheck.getPrevSibling()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", treeNodeCheck.getRendered()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, TreeNodeCheck treeNodeCheck) throws IOException {
		if (treeNodeCheck.getTabIndex() != null) {
			renrederedAttributes.add(renderString("tabIndex", treeNodeCheck.getTabIndex()));
		}
	}

}