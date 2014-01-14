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
package com.liferay.faces.alloy.component.ternarysearchtree;

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
public abstract class TernarySearchTreeRendererBase extends AUIRenderer {

	// Private Constants
	private static final String  AUI_SEARCH_TERNARY_SEARCH_TREE = "aui-search-ternary-search-tree";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		TernarySearchTree ternarySearchTree = (TernarySearchTree) uiComponent;
		encodeHTML(facesContext, ternarySearchTree);
		encodeJavaScript(facesContext, ternarySearchTree);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TernarySearchTree ternarySearchTree) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TernarySearchTree ternarySearchTree) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, ternarySearchTree, AUI_SEARCH_TERNARY_SEARCH_TREE);

		bufferedResponseWriter.write("var ternarySearchTree = new Y.TernarySearchTree");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);

		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);
		
		endJavaScript(facesContext);
		
		handleBuffer(facesContext, ternarySearchTree, AUI_SEARCH_TERNARY_SEARCH_TREE);
		
		facesContext.setResponseWriter(backupResponseWriter);
	}

}