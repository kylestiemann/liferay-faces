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
package com.liferay.faces.alloy.component.sortablelist;

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
public abstract class SortableListRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-sortable-list";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SortableList sortableList = (SortableList) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var sortableList = new A.SortableList");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderDd(renderedAttributes, sortableList);
		renderDestroyed(renderedAttributes, sortableList);
		renderDropCondition(renderedAttributes, sortableList);
		renderDropContainer(renderedAttributes, sortableList);
		renderDropOn(renderedAttributes, sortableList);
		renderHelper(renderedAttributes, sortableList);
		renderInitialized(renderedAttributes, sortableList);
		renderNodes(renderedAttributes, sortableList);
		renderPlaceholder(renderedAttributes, sortableList);
		renderProxy(renderedAttributes, sortableList);
		renderSortCondition(renderedAttributes, sortableList);

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

	protected void renderDd(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String dd = sortableList.getDd();

		if (dd != null) {
			renderedAttributes.add(renderString(SortableList.DD, dd));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Boolean destroyed = sortableList.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SortableList.DESTROYED, destroyed));
		}
	}

	protected void renderDropCondition(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Object dropCondition = sortableList.getDropCondition();

		if (dropCondition != null) {
			renderedAttributes.add(renderString(SortableList.DROP_CONDITION, dropCondition));
		}
	}

	protected void renderDropContainer(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Object dropContainer = sortableList.getDropContainer();

		if (dropContainer != null) {
			renderedAttributes.add(renderString(SortableList.DROP_CONTAINER, dropContainer));
		}
	}

	protected void renderDropOn(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String dropOn = sortableList.getDropOn();

		if (dropOn != null) {
			renderedAttributes.add(renderString(SortableList.DROP_ON, dropOn));
		}
	}

	protected void renderHelper(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String helper = sortableList.getHelper();

		if (helper != null) {
			renderedAttributes.add(renderString(SortableList.HELPER, helper));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Boolean initialized = sortableList.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SortableList.INITIALIZED, initialized));
		}
	}

	protected void renderNodes(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String nodes = sortableList.getNodes();

		if (nodes != null) {
			renderedAttributes.add(renderString(SortableList.NODES, nodes));
		}
	}

	protected void renderPlaceholder(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String placeholder = sortableList.getPlaceholder();

		if (placeholder != null) {
			renderedAttributes.add(renderString(SortableList.PLACEHOLDER, placeholder));
		}
	}

	protected void renderProxy(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String proxy = sortableList.getProxy();

		if (proxy != null) {
			renderedAttributes.add(renderString(SortableList.PROXY, proxy));
		}
	}

	protected void renderSortCondition(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Object sortCondition = sortableList.getSortCondition();

		if (sortCondition != null) {
			renderedAttributes.add(renderString(SortableList.SORT_CONDITION, sortCondition));
		}
	}

}