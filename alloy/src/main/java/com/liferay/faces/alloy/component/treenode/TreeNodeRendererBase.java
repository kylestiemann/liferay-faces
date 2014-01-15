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
package com.liferay.faces.alloy.component.treenode;

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
public abstract class TreeNodeRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		TreeNode treeNode = (TreeNode) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var treeNode = new A.TreeNode");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlwaysShowHitArea(renrederedAttributes, treeNode);
		renderBoundingBox(renrederedAttributes, treeNode);
		renderTreenodeChildren(renrederedAttributes, treeNode);
		renderContainer(renrederedAttributes, treeNode);
		renderContentBox(renrederedAttributes, treeNode);
		renderCssClasses(renrederedAttributes, treeNode);
		renderDestroyed(renrederedAttributes, treeNode);
		renderDraggable(renrederedAttributes, treeNode);
		renderExpanded(renrederedAttributes, treeNode);
		renderHitAreaEl(renrederedAttributes, treeNode);
		renderIconEl(renrederedAttributes, treeNode);
		renderTreenodeId(renrederedAttributes, treeNode);
		renderIndex(renrederedAttributes, treeNode);
		renderInitialized(renrederedAttributes, treeNode);
		renderLabel(renrederedAttributes, treeNode);
		renderLabelEl(renrederedAttributes, treeNode);
		renderLeaf(renrederedAttributes, treeNode);
		renderNextSibling(renrederedAttributes, treeNode);
		renderOwnerTree(renrederedAttributes, treeNode);
		renderParentNode(renrederedAttributes, treeNode);
		renderPrevSibling(renrederedAttributes, treeNode);
		renderRendered(renrederedAttributes, treeNode);
		renderTabIndex(renrederedAttributes, treeNode);

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

	protected void renderAlwaysShowHitArea(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getAlwaysShowHitArea() != null) {
			renrederedAttributes.add(renderBoolean("alwaysShowHitArea", treeNode.getAlwaysShowHitArea()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", treeNode.getBoundingBox()));
		}
	}

	protected void renderTreenodeChildren(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getTreenodeChildren() != null) {
			renrederedAttributes.add(renderArray("treenodeChildren", treeNode.getTreenodeChildren()));
		}
	}

	protected void renderContainer(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getContainer() != null) {
			renrederedAttributes.add(renderString("container", treeNode.getContainer()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", treeNode.getContentBox()));
		}
	}

	protected void renderCssClasses(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getCssClasses() != null) {
			renrederedAttributes.add(renderObject("cssClasses", treeNode.getCssClasses()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", treeNode.getDestroyed()));
		}
	}

	protected void renderDraggable(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getDraggable() != null) {
			renrederedAttributes.add(renderBoolean("draggable", treeNode.getDraggable()));
		}
	}

	protected void renderExpanded(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getExpanded() != null) {
			renrederedAttributes.add(renderBoolean("expanded", treeNode.getExpanded()));
		}
	}

	protected void renderHitAreaEl(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getHitAreaEl() != null) {
			renrederedAttributes.add(renderString("hitAreaEl", treeNode.getHitAreaEl()));
		}
	}

	protected void renderIconEl(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getIconEl() != null) {
			renrederedAttributes.add(renderString("iconEl", treeNode.getIconEl()));
		}
	}

	protected void renderTreenodeId(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getTreenodeId() != null) {
			renrederedAttributes.add(renderString("treenodeId", treeNode.getTreenodeId()));
		}
	}

	protected void renderIndex(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getIndex() != null) {
			renrederedAttributes.add(renderObject("index", treeNode.getIndex()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", treeNode.getInitialized()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getLabel() != null) {
			renrederedAttributes.add(renderString("label", treeNode.getLabel()));
		}
	}

	protected void renderLabelEl(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getLabelEl() != null) {
			renrederedAttributes.add(renderString("labelEl", treeNode.getLabelEl()));
		}
	}

	protected void renderLeaf(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getLeaf() != null) {
			renrederedAttributes.add(renderBoolean("leaf", treeNode.getLeaf()));
		}
	}

	protected void renderNextSibling(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getNextSibling() != null) {
			renrederedAttributes.add(renderString("nextSibling", treeNode.getNextSibling()));
		}
	}

	protected void renderOwnerTree(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getOwnerTree() != null) {
			renrederedAttributes.add(renderString("ownerTree", treeNode.getOwnerTree()));
		}
	}

	protected void renderParentNode(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getParentNode() != null) {
			renrederedAttributes.add(renderString("parentNode", treeNode.getParentNode()));
		}
	}

	protected void renderPrevSibling(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getPrevSibling() != null) {
			renrederedAttributes.add(renderString("prevSibling", treeNode.getPrevSibling()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", treeNode.getRendered()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, TreeNode treeNode) throws IOException {
		if (treeNode.getTabIndex() != null) {
			renrederedAttributes.add(renderString("tabIndex", treeNode.getTabIndex()));
		}
	}

}