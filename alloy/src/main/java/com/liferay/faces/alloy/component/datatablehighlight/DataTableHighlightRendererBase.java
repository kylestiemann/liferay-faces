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
package com.liferay.faces.alloy.component.datatablehighlight;

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
public abstract class DataTableHighlightRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-highlight";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		DataTableHighlight dataTableHighlight = (DataTableHighlight) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var dataTableHighlight = new A.DataTableHighlight");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderActiveBorderWidth(renrederedAttributes, dataTableHighlight);
		renderDestroyed(renrederedAttributes, dataTableHighlight);
		renderHighlightRange(renrederedAttributes, dataTableHighlight);
		renderHost(renrederedAttributes, dataTableHighlight);
		renderInitialized(renrederedAttributes, dataTableHighlight);
		renderOverlayActiveNode(renrederedAttributes, dataTableHighlight);
		renderOverlayNode(renrederedAttributes, dataTableHighlight);
		renderRangeBorderWidth(renrederedAttributes, dataTableHighlight);
		renderType(renrederedAttributes, dataTableHighlight);

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

	protected void renderActiveBorderWidth(ArrayList<String> renrederedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		if (dataTableHighlight.getActiveBorderWidth() != null) {
			renrederedAttributes.add(renderNumber("activeBorderWidth", dataTableHighlight.getActiveBorderWidth()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		if (dataTableHighlight.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", dataTableHighlight.getDestroyed()));
		}
	}

	protected void renderHighlightRange(ArrayList<String> renrederedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		if (dataTableHighlight.getHighlightRange() != null) {
			renrederedAttributes.add(renderBoolean("highlightRange", dataTableHighlight.getHighlightRange()));
		}
	}

	protected void renderHost(ArrayList<String> renrederedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		if (dataTableHighlight.getHost() != null) {
			renrederedAttributes.add(renderString("host", dataTableHighlight.getHost()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		if (dataTableHighlight.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", dataTableHighlight.getInitialized()));
		}
	}

	protected void renderOverlayActiveNode(ArrayList<String> renrederedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		if (dataTableHighlight.getOverlayActiveNode() != null) {
			renrederedAttributes.add(renderString("overlayActiveNode", dataTableHighlight.getOverlayActiveNode()));
		}
	}

	protected void renderOverlayNode(ArrayList<String> renrederedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		if (dataTableHighlight.getOverlayNode() != null) {
			renrederedAttributes.add(renderString("overlayNode", dataTableHighlight.getOverlayNode()));
		}
	}

	protected void renderRangeBorderWidth(ArrayList<String> renrederedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		if (dataTableHighlight.getRangeBorderWidth() != null) {
			renrederedAttributes.add(renderNumber("rangeBorderWidth", dataTableHighlight.getRangeBorderWidth()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		if (dataTableHighlight.getType() != null) {
			renrederedAttributes.add(renderString("type", dataTableHighlight.getType()));
		}
	}

}