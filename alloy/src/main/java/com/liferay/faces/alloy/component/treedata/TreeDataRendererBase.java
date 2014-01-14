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
package com.liferay.faces.alloy.component.treedata;

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
public abstract class TreeDataRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-data";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TreeData treeData = (TreeData) uiComponent;
		encodeHTML(facesContext, treeData);
		encodeJavaScript(facesContext, treeData);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TreeData treeData) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TreeData treeData) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, treeData);

		bufferedResponseWriter.write("var treeData = new Y.TreeData");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderTreedataChildren(responseWriter, treeData);
		responseWriter.write(StringPool.COMMA);
		renderContainer(responseWriter, treeData);
		responseWriter.write(StringPool.COMMA);
		renderIndex(responseWriter, treeData);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, treeData);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderTreedataChildren(ResponseWriter responseWriter, TreeData treeData) throws IOException {
		renderArray(responseWriter, "treedataChildren", treeData.getTreedataChildren());
	}

	protected void renderContainer(ResponseWriter responseWriter, TreeData treeData) throws IOException {
		renderString(responseWriter, "container", treeData.getContainer());
	}

	protected void renderIndex(ResponseWriter responseWriter, TreeData treeData) throws IOException {
		renderObject(responseWriter, "index", treeData.getIndex());
	}

}