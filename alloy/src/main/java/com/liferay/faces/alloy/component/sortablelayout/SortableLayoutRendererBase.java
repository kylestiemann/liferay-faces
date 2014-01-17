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
public abstract class SortableLayoutRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-sortable-layout";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SortableLayout sortableLayout = (SortableLayout) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var sortableLayout = new A.SortableLayout");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderDelegateConfig(renderedAttributes, sortableLayout);
		renderDestroyed(renderedAttributes, sortableLayout);
		renderDragNodes(renderedAttributes, sortableLayout);
		renderDropContainer(renderedAttributes, sortableLayout);
		renderDropNodes(renderedAttributes, sortableLayout);
		renderGroups(renderedAttributes, sortableLayout);
		renderInitialized(renderedAttributes, sortableLayout);
		renderLazyStart(renderedAttributes, sortableLayout);
		renderPlaceholder(renderedAttributes, sortableLayout);
		renderProxy(renderedAttributes, sortableLayout);
		renderProxyNode(renderedAttributes, sortableLayout);

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

	protected void renderDelegateConfig(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Object delegateConfig = sortableLayout.getDelegateConfig();

		if (delegateConfig != null) {
			renderedAttributes.add(renderObject(SortableLayout.DELEGATE_CONFIG, delegateConfig));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Boolean destroyed = sortableLayout.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SortableLayout.DESTROYED, destroyed));
		}
	}

	protected void renderDragNodes(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String dragNodes = sortableLayout.getDragNodes();

		if (dragNodes != null) {
			renderedAttributes.add(renderString(SortableLayout.DRAG_NODES, dragNodes));
		}
	}

	protected void renderDropContainer(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Object dropContainer = sortableLayout.getDropContainer();

		if (dropContainer != null) {
			renderedAttributes.add(renderString(SortableLayout.DROP_CONTAINER, dropContainer));
		}
	}

	protected void renderDropNodes(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String dropNodes = sortableLayout.getDropNodes();

		if (dropNodes != null) {
			renderedAttributes.add(renderString(SortableLayout.DROP_NODES, dropNodes));
		}
	}

	protected void renderGroups(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String groups = sortableLayout.getGroups();

		if (groups != null) {
			renderedAttributes.add(renderString(SortableLayout.GROUPS, groups));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Boolean initialized = sortableLayout.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SortableLayout.INITIALIZED, initialized));
		}
	}

	protected void renderLazyStart(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Boolean lazyStart = sortableLayout.getLazyStart();

		if (lazyStart != null) {
			renderedAttributes.add(renderBoolean(SortableLayout.LAZY_START, lazyStart));
		}
	}

	protected void renderPlaceholder(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String placeholder = sortableLayout.getPlaceholder();

		if (placeholder != null) {
			renderedAttributes.add(renderString(SortableLayout.PLACEHOLDER, placeholder));
		}
	}

	protected void renderProxy(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String proxy = sortableLayout.getProxy();

		if (proxy != null) {
			renderedAttributes.add(renderString(SortableLayout.PROXY, proxy));
		}
	}

	protected void renderProxyNode(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String proxyNode = sortableLayout.getProxyNode();

		if (proxyNode != null) {
			renderedAttributes.add(renderString(SortableLayout.PROXY_NODE, proxyNode));
		}
	}

}