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
public abstract class TreeNodeTaskRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeNodeTask treeNodeTask = (TreeNodeTask) uiComponent;
		encodeHTML(facesContext, treeNodeTask);
		encodeJavaScript(facesContext, treeNodeTask);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeNodeTask treeNodeTask) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeNodeTask treeNodeTask) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, treeNodeTask);

		bufferedResponseWriter.write("var treeNodeTask = new A.TreeNodeTask");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renrederedAttributes, treeNodeTask);
		renderBoundingBox(renrederedAttributes, treeNodeTask);
		renderCache(renrederedAttributes, treeNodeTask);
		renderCheckContainerEl(renrederedAttributes, treeNodeTask);
		renderCheckEl(renrederedAttributes, treeNodeTask);
		renderCheckName(renrederedAttributes, treeNodeTask);
		renderChecked(renrederedAttributes, treeNodeTask);
		renderTreenodetaskChildren(renrederedAttributes, treeNodeTask);
		renderContainer(renrederedAttributes, treeNodeTask);
		renderContentBox(renrederedAttributes, treeNodeTask);
		renderCssClasses(renrederedAttributes, treeNodeTask);
		renderDestroyed(renrederedAttributes, treeNodeTask);
		renderDraggable(renrederedAttributes, treeNodeTask);
		renderExpanded(renrederedAttributes, treeNodeTask);
		renderHitAreaEl(renrederedAttributes, treeNodeTask);
		renderIconEl(renrederedAttributes, treeNodeTask);
		renderTreenodetaskId(renrederedAttributes, treeNodeTask);
		renderIndex(renrederedAttributes, treeNodeTask);
		renderInitialized(renrederedAttributes, treeNodeTask);
		renderIo(renrederedAttributes, treeNodeTask);
		renderLabel(renrederedAttributes, treeNodeTask);
		renderLabelEl(renrederedAttributes, treeNodeTask);
		renderLeaf(renrederedAttributes, treeNodeTask);
		renderLoaded(renrederedAttributes, treeNodeTask);
		renderLoading(renrederedAttributes, treeNodeTask);
		renderNextSibling(renrederedAttributes, treeNodeTask);
		renderOwnerTree(renrederedAttributes, treeNodeTask);
		renderPaginator(renrederedAttributes, treeNodeTask);
		renderParentNode(renrederedAttributes, treeNodeTask);
		renderPrevSibling(renrederedAttributes, treeNodeTask);
		renderRendered(renrederedAttributes, treeNodeTask);
		renderTabIndex(renrederedAttributes, treeNodeTask);

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

		handleBuffer(facesContext, treeNodeTask);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getAlwaysShowHitArea() != null) {
			renrederedAttributes.add(renderBoolean("alwaysShowHitArea", treeNodeTask.getAlwaysShowHitArea()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", treeNodeTask.getBoundingBox()));
		}
	}

	protected void renderCache(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getCache() != null) {
			renrederedAttributes.add(renderBoolean("cache", treeNodeTask.getCache()));
		}
	}

	protected void renderCheckContainerEl(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getCheckContainerEl() != null) {
			renrederedAttributes.add(renderString("checkContainerEl", treeNodeTask.getCheckContainerEl()));
		}
	}

	protected void renderCheckEl(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getCheckEl() != null) {
			renrederedAttributes.add(renderString("checkEl", treeNodeTask.getCheckEl()));
		}
	}

	protected void renderCheckName(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getCheckName() != null) {
			renrederedAttributes.add(renderString("checkName", treeNodeTask.getCheckName()));
		}
	}

	protected void renderChecked(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getChecked() != null) {
			renrederedAttributes.add(renderBoolean("checked", treeNodeTask.getChecked()));
		}
	}

	protected void renderTreenodetaskChildren(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getTreenodetaskChildren() != null) {
			renrederedAttributes.add(renderArray("treenodetaskChildren", treeNodeTask.getTreenodetaskChildren()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getContainer() != null) {
			renrederedAttributes.add(renderString("container", treeNodeTask.getContainer()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", treeNodeTask.getContentBox()));
		}
	}

	protected void renderCssClasses(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getCssClasses() != null) {
			renrederedAttributes.add(renderObject("cssClasses", treeNodeTask.getCssClasses()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", treeNodeTask.getDestroyed()));
		}
	}

	protected void renderDraggable(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getDraggable() != null) {
			renrederedAttributes.add(renderBoolean("draggable", treeNodeTask.getDraggable()));
		}
	}

	protected void renderExpanded(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getExpanded() != null) {
			renrederedAttributes.add(renderBoolean("expanded", treeNodeTask.getExpanded()));
		}
	}

	protected void renderHitAreaEl(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getHitAreaEl() != null) {
			renrederedAttributes.add(renderString("hitAreaEl", treeNodeTask.getHitAreaEl()));
		}
	}

	protected void renderIconEl(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getIconEl() != null) {
			renrederedAttributes.add(renderString("iconEl", treeNodeTask.getIconEl()));
		}
	}

	protected void renderTreenodetaskId(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getTreenodetaskId() != null) {
			renrederedAttributes.add(renderString("treenodetaskId", treeNodeTask.getTreenodetaskId()));
		}
	}

	protected void renderIndex(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getIndex() != null) {
			renrederedAttributes.add(renderObject("index", treeNodeTask.getIndex()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", treeNodeTask.getInitialized()));
		}
	}

	protected void renderIo(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getIo() != null) {
			renrederedAttributes.add(renderObject("io", treeNodeTask.getIo()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getLabel() != null) {
			renrederedAttributes.add(renderString("label", treeNodeTask.getLabel()));
		}
	}

	protected void renderLabelEl(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getLabelEl() != null) {
			renrederedAttributes.add(renderString("labelEl", treeNodeTask.getLabelEl()));
		}
	}

	protected void renderLeaf(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getLeaf() != null) {
			renrederedAttributes.add(renderBoolean("leaf", treeNodeTask.getLeaf()));
		}
	}

	protected void renderLoaded(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getLoaded() != null) {
			renrederedAttributes.add(renderBoolean("loaded", treeNodeTask.getLoaded()));
		}
	}

	protected void renderLoading(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getLoading() != null) {
			renrederedAttributes.add(renderBoolean("loading", treeNodeTask.getLoading()));
		}
	}

	protected void renderNextSibling(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getNextSibling() != null) {
			renrederedAttributes.add(renderString("nextSibling", treeNodeTask.getNextSibling()));
		}
	}

	protected void renderOwnerTree(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getOwnerTree() != null) {
			renrederedAttributes.add(renderString("ownerTree", treeNodeTask.getOwnerTree()));
		}
	}

	protected void renderPaginator(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getPaginator() != null) {
			renrederedAttributes.add(renderObject("paginator", treeNodeTask.getPaginator()));
		}
	}

	protected void renderParentNode(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getParentNode() != null) {
			renrederedAttributes.add(renderString("parentNode", treeNodeTask.getParentNode()));
		}
	}

	protected void renderPrevSibling(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getPrevSibling() != null) {
			renrederedAttributes.add(renderString("prevSibling", treeNodeTask.getPrevSibling()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", treeNodeTask.getRendered()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, TreeNodeTask treeNodeTask) throws IOException {
		if (treeNodeTask.getTabIndex() != null) {
			renrederedAttributes.add(renderString("tabIndex", treeNodeTask.getTabIndex()));
		}
	}

}