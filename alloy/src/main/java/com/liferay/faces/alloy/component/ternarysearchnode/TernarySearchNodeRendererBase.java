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
public abstract class TernarySearchNodeRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-search-ternary-search-node";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TernarySearchNode ternarySearchNode = (TernarySearchNode) uiComponent;
		encodeHTML(facesContext, ternarySearchNode);
		encodeJavaScript(facesContext, ternarySearchNode);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TernarySearchNode ternarySearchNode) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TernarySearchNode ternarySearchNode) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, ternarySearchNode);

		bufferedResponseWriter.write("var ternarySearchNode = new A.TernarySearchNode");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderCharacter(renrederedAttributes, ternarySearchNode);
		renderChild(renrederedAttributes, ternarySearchNode);
		renderDestroyed(renrederedAttributes, ternarySearchNode);
		renderInitialized(renrederedAttributes, ternarySearchNode);
		renderLargerNode(renrederedAttributes, ternarySearchNode);
		renderSmallerNode(renrederedAttributes, ternarySearchNode);
		renderWord(renrederedAttributes, ternarySearchNode);

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

		handleBuffer(facesContext, ternarySearchNode);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCharacter(ArrayList<String> renrederedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		if (ternarySearchNode.getCharacter() != null) {
			renrederedAttributes.add(renderString("character", ternarySearchNode.getCharacter()));
		}
	}

	protected void renderChild(ArrayList<String> renrederedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		if (ternarySearchNode.getChild() != null) {
			renrederedAttributes.add(renderString("child", ternarySearchNode.getChild()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		if (ternarySearchNode.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", ternarySearchNode.getDestroyed()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		if (ternarySearchNode.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", ternarySearchNode.getInitialized()));
		}
	}

	protected void renderLargerNode(ArrayList<String> renrederedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		if (ternarySearchNode.getLargerNode() != null) {
			renrederedAttributes.add(renderString("largerNode", ternarySearchNode.getLargerNode()));
		}
	}

	protected void renderSmallerNode(ArrayList<String> renrederedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		if (ternarySearchNode.getSmallerNode() != null) {
			renrederedAttributes.add(renderString("smallerNode", ternarySearchNode.getSmallerNode()));
		}
	}

	protected void renderWord(ArrayList<String> renrederedAttributes, TernarySearchNode ternarySearchNode) throws IOException {
		if (ternarySearchNode.getWord() != null) {
			renrederedAttributes.add(renderString("word", ternarySearchNode.getWord()));
		}
	}

}