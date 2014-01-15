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
public abstract class SortableListRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-sortable-list";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		SortableList sortableList = (SortableList) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var sortableList = new A.SortableList");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderDd(renrederedAttributes, sortableList);
		renderDestroyed(renrederedAttributes, sortableList);
		renderDropCondition(renrederedAttributes, sortableList);
		renderDropContainer(renrederedAttributes, sortableList);
		renderDropOn(renrederedAttributes, sortableList);
		renderHelper(renrederedAttributes, sortableList);
		renderInitialized(renrederedAttributes, sortableList);
		renderNodes(renrederedAttributes, sortableList);
		renderPlaceholder(renrederedAttributes, sortableList);
		renderProxy(renrederedAttributes, sortableList);
		renderSortCondition(renrederedAttributes, sortableList);

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

	protected void renderDd(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getDd() != null) {
			renrederedAttributes.add(renderString("dd", sortableList.getDd()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", sortableList.getDestroyed()));
		}
	}

	protected void renderDropCondition(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getDropCondition() != null) {
			renrederedAttributes.add(renderString("dropCondition", sortableList.getDropCondition()));
		}
	}

	protected void renderDropContainer(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getDropContainer() != null) {
			renrederedAttributes.add(renderString("dropContainer", sortableList.getDropContainer()));
		}
	}

	protected void renderDropOn(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getDropOn() != null) {
			renrederedAttributes.add(renderString("dropOn", sortableList.getDropOn()));
		}
	}

	protected void renderHelper(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getHelper() != null) {
			renrederedAttributes.add(renderString("helper", sortableList.getHelper()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", sortableList.getInitialized()));
		}
	}

	protected void renderNodes(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getNodes() != null) {
			renrederedAttributes.add(renderString("nodes", sortableList.getNodes()));
		}
	}

	protected void renderPlaceholder(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getPlaceholder() != null) {
			renrederedAttributes.add(renderString("placeholder", sortableList.getPlaceholder()));
		}
	}

	protected void renderProxy(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getProxy() != null) {
			renrederedAttributes.add(renderString("proxy", sortableList.getProxy()));
		}
	}

	protected void renderSortCondition(ArrayList<String> renrederedAttributes, SortableList sortableList) throws IOException {
		if (sortableList.getSortCondition() != null) {
			renrederedAttributes.add(renderString("sortCondition", sortableList.getSortCondition()));
		}
	}

}