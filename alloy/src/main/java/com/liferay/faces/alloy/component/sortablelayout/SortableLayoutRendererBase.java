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
package com.liferay.faces.alloy.component.sortablelayout;

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
public abstract class SortableLayoutRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-sortable-layout";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SortableLayout sortableLayout = (SortableLayout) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var sortableLayout = new A.SortableLayout");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderDelegateConfig(renrederedAttributes, sortableLayout);
		renderDestroyed(renrederedAttributes, sortableLayout);
		renderDragNodes(renrederedAttributes, sortableLayout);
		renderDropContainer(renrederedAttributes, sortableLayout);
		renderDropNodes(renrederedAttributes, sortableLayout);
		renderGroups(renrederedAttributes, sortableLayout);
		renderInitialized(renrederedAttributes, sortableLayout);
		renderLazyStart(renrederedAttributes, sortableLayout);
		renderPlaceholder(renrederedAttributes, sortableLayout);
		renderProxy(renrederedAttributes, sortableLayout);
		renderProxyNode(renrederedAttributes, sortableLayout);

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

	protected void renderDelegateConfig(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getDelegateConfig() != null) {
			renrederedAttributes.add(renderObject("delegateConfig", sortableLayout.getDelegateConfig()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", sortableLayout.getDestroyed()));
		}
	}

	protected void renderDragNodes(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getDragNodes() != null) {
			renrederedAttributes.add(renderString("dragNodes", sortableLayout.getDragNodes()));
		}
	}

	protected void renderDropContainer(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getDropContainer() != null) {
			renrederedAttributes.add(renderString("dropContainer", sortableLayout.getDropContainer()));
		}
	}

	protected void renderDropNodes(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getDropNodes() != null) {
			renrederedAttributes.add(renderString("dropNodes", sortableLayout.getDropNodes()));
		}
	}

	protected void renderGroups(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getGroups() != null) {
			renrederedAttributes.add(renderString("groups", sortableLayout.getGroups()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", sortableLayout.getInitialized()));
		}
	}

	protected void renderLazyStart(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getLazyStart() != null) {
			renrederedAttributes.add(renderBoolean("lazyStart", sortableLayout.getLazyStart()));
		}
	}

	protected void renderPlaceholder(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getPlaceholder() != null) {
			renrederedAttributes.add(renderString("placeholder", sortableLayout.getPlaceholder()));
		}
	}

	protected void renderProxy(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getProxy() != null) {
			renrederedAttributes.add(renderString("proxy", sortableLayout.getProxy()));
		}
	}

	protected void renderProxyNode(ArrayList<String> renrederedAttributes, SortableLayout sortableLayout) throws IOException {
		if (sortableLayout.getProxyNode() != null) {
			renrederedAttributes.add(renderString("proxyNode", sortableLayout.getProxyNode()));
		}
	}

}