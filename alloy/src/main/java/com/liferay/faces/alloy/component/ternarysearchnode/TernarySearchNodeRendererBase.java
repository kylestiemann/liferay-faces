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
package com.liferay.faces.alloy.component.ternarysearchnode;

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
public abstract class TernarySearchNodeRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-search-ternary-search-node";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TernarySearchNode ternarySearchNode = (TernarySearchNode) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var ternarySearchNode = new A.TernarySearchNode");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderCharacter(renderedAttributes, ternarySearchNode);
		renderChild(renderedAttributes, ternarySearchNode);
		renderDestroyed(renderedAttributes, ternarySearchNode);
		renderInitialized(renderedAttributes, ternarySearchNode);
		renderLargerNode(renderedAttributes, ternarySearchNode);
		renderSmallerNode(renderedAttributes, ternarySearchNode);
		renderWord(renderedAttributes, ternarySearchNode);

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

	protected void renderCharacter(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String character = ternarySearchNode.getCharacter();

		if (character != null) {
			renderedAttributes.add(renderString(TernarySearchNode.CHARACTER, character));
		}
	}

	protected void renderChild(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String child = ternarySearchNode.getChild();

		if (child != null) {
			renderedAttributes.add(renderString(TernarySearchNode.CHILD, child));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.Boolean destroyed = ternarySearchNode.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TernarySearchNode.DESTROYED, destroyed));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.Boolean initialized = ternarySearchNode.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TernarySearchNode.INITIALIZED, initialized));
		}
	}

	protected void renderLargerNode(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.Object largerNode = ternarySearchNode.getLargerNode();

		if (largerNode != null) {
			renderedAttributes.add(renderString(TernarySearchNode.LARGER_NODE, largerNode));
		}
	}

	protected void renderSmallerNode(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.Object smallerNode = ternarySearchNode.getSmallerNode();

		if (smallerNode != null) {
			renderedAttributes.add(renderString(TernarySearchNode.SMALLER_NODE, smallerNode));
		}
	}

	protected void renderWord(List<String> renderedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		java.lang.String word = ternarySearchNode.getWord();

		if (word != null) {
			renderedAttributes.add(renderString(TernarySearchNode.WORD, word));
		}
	}

}