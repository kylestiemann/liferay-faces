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
package com.liferay.faces.alloy.component.treeviewpaginator;

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
public abstract class TreeViewPaginatorRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-paginator";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeViewPaginator treeViewPaginator = (TreeViewPaginator) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeViewPaginator = new A.TreeViewPaginator");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderPaginator(renderedAttributes, treeViewPaginator);

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

	protected void renderPaginator(List<String> renderedAttributes, TreeViewPaginator treeViewPaginator) throws IOException {
		java.lang.Object paginator = treeViewPaginator.getPaginator();

		if (paginator != null) {
			renderedAttributes.add(renderObject(TreeViewPaginator.PAGINATOR, paginator));
		}
	}

}