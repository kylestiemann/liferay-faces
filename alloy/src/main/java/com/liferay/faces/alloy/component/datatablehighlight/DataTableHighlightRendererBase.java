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
public abstract class DataTableHighlightRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-datatable-highlight";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DataTableHighlight dataTableHighlight = (DataTableHighlight) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var dataTableHighlight = new A.DataTableHighlight");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveBorderWidth(renderedAttributes, dataTableHighlight);
		renderDestroyed(renderedAttributes, dataTableHighlight);
		renderHighlightRange(renderedAttributes, dataTableHighlight);
		renderHost(renderedAttributes, dataTableHighlight);
		renderInitialized(renderedAttributes, dataTableHighlight);
		renderOverlayActiveNode(renderedAttributes, dataTableHighlight);
		renderOverlayNode(renderedAttributes, dataTableHighlight);
		renderRangeBorderWidth(renderedAttributes, dataTableHighlight);
		renderType(renderedAttributes, dataTableHighlight);

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

	protected void renderActiveBorderWidth(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Object activeBorderWidth = dataTableHighlight.getActiveBorderWidth();

		if (activeBorderWidth != null) {
			renderedAttributes.add(renderNumber(DataTableHighlight.ACTIVE_BORDER_WIDTH, activeBorderWidth));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Boolean destroyed = dataTableHighlight.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(DataTableHighlight.DESTROYED, destroyed));
		}
	}

	protected void renderHighlightRange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Boolean highlightRange = dataTableHighlight.getHighlightRange();

		if (highlightRange != null) {
			renderedAttributes.add(renderBoolean(DataTableHighlight.HIGHLIGHT_RANGE, highlightRange));
		}
	}

	protected void renderHost(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Object host = dataTableHighlight.getHost();

		if (host != null) {
			renderedAttributes.add(renderString(DataTableHighlight.HOST, host));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Boolean initialized = dataTableHighlight.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(DataTableHighlight.INITIALIZED, initialized));
		}
	}

	protected void renderOverlayActiveNode(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String overlayActiveNode = dataTableHighlight.getOverlayActiveNode();

		if (overlayActiveNode != null) {
			renderedAttributes.add(renderString(DataTableHighlight.OVERLAY_ACTIVE_NODE, overlayActiveNode));
		}
	}

	protected void renderOverlayNode(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String overlayNode = dataTableHighlight.getOverlayNode();

		if (overlayNode != null) {
			renderedAttributes.add(renderString(DataTableHighlight.OVERLAY_NODE, overlayNode));
		}
	}

	protected void renderRangeBorderWidth(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Object rangeBorderWidth = dataTableHighlight.getRangeBorderWidth();

		if (rangeBorderWidth != null) {
			renderedAttributes.add(renderNumber(DataTableHighlight.RANGE_BORDER_WIDTH, rangeBorderWidth));
		}
	}

	protected void renderType(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String type = dataTableHighlight.getType();

		if (type != null) {
			renderedAttributes.add(renderString(DataTableHighlight.TYPE, type));
		}
	}

}