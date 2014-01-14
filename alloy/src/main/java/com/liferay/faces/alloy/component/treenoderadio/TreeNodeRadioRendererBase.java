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

		bufferedResponseWriter.write("var treeNodeRadio = new Y.TreeNodeRadio");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlwaysShowHitArea(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBoundingBox(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCache(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCheckContainerEl(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCheckEl(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCheckName(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderChecked(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTreenoderadioChildren(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContainer(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderContentBox(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClasses(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDraggable(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderExpanded(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHitAreaEl(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIconEl(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTreenoderadioId(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIndex(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIo(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelEl(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLeaf(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoaded(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoading(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNextSibling(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOwnerTree(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPaginator(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderParentNode(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPrevSibling(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRendered(bufferedResponseWriter, treeNodeRadio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, treeNodeRadio);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, treeNodeRadio);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlwaysShowHitArea(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderBoolean(responseWriter, "alwaysShowHitArea", treeNodeRadio.getAlwaysShowHitArea());
	}

	protected void renderBoundingBox(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "boundingBox", treeNodeRadio.getBoundingBox());
	}

	protected void renderCache(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderBoolean(responseWriter, "cache", treeNodeRadio.getCache());
	}

	protected void renderCheckContainerEl(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "checkContainerEl", treeNodeRadio.getCheckContainerEl());
	}

	protected void renderCheckEl(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "checkEl", treeNodeRadio.getCheckEl());
	}

	protected void renderCheckName(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "checkName", treeNodeRadio.getCheckName());
	}

	protected void renderChecked(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderBoolean(responseWriter, "checked", treeNodeRadio.getChecked());
	}

	protected void renderTreenoderadioChildren(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderArray(responseWriter, "treenoderadioChildren", treeNodeRadio.getTreenoderadioChildren());
	}

	protected void renderContainer(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "container", treeNodeRadio.getContainer());
	}

	protected void renderContentBox(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "contentBox", treeNodeRadio.getContentBox());
	}

	protected void renderCssClasses(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderObject(responseWriter, "cssClasses", treeNodeRadio.getCssClasses());
	}

	protected void renderDraggable(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderBoolean(responseWriter, "draggable", treeNodeRadio.getDraggable());
	}

	protected void renderExpanded(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderBoolean(responseWriter, "expanded", treeNodeRadio.getExpanded());
	}

	protected void renderHitAreaEl(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "hitAreaEl", treeNodeRadio.getHitAreaEl());
	}

	protected void renderIconEl(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "iconEl", treeNodeRadio.getIconEl());
	}

	protected void renderTreenoderadioId(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "treenoderadioId", treeNodeRadio.getTreenoderadioId());
	}

	protected void renderIndex(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderObject(responseWriter, "index", treeNodeRadio.getIndex());
	}

	protected void renderIo(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderObject(responseWriter, "io", treeNodeRadio.getIo());
	}

	protected void renderLabel(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "label", treeNodeRadio.getLabel());
	}

	protected void renderLabelEl(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "labelEl", treeNodeRadio.getLabelEl());
	}

	protected void renderLeaf(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderBoolean(responseWriter, "leaf", treeNodeRadio.getLeaf());
	}

	protected void renderLoaded(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderBoolean(responseWriter, "loaded", treeNodeRadio.getLoaded());
	}

	protected void renderLoading(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderBoolean(responseWriter, "loading", treeNodeRadio.getLoading());
	}

	protected void renderNextSibling(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "nextSibling", treeNodeRadio.getNextSibling());
	}

	protected void renderOwnerTree(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "ownerTree", treeNodeRadio.getOwnerTree());
	}

	protected void renderPaginator(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderObject(responseWriter, "paginator", treeNodeRadio.getPaginator());
	}

	protected void renderParentNode(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "parentNode", treeNodeRadio.getParentNode());
	}

	protected void renderPrevSibling(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "prevSibling", treeNodeRadio.getPrevSibling());
	}

	protected void renderRendered(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderBoolean(responseWriter, "rendered", treeNodeRadio.getRendered());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, TreeNodeRadio treeNodeRadio) throws IOException {
		renderString(responseWriter, "tabIndex", treeNodeRadio.getTabIndex());
	}

}