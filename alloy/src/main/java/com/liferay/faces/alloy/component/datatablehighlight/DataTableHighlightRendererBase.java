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

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
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

		if (dataTableHighlight.getActiveBorderWidth() != null) {
			renderActiveBorderWidth(renderedAttributes, dataTableHighlight);
		}

		if (dataTableHighlight.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, dataTableHighlight);
		}

		if (dataTableHighlight.getHighlightRange() != null) {
			renderHighlightRange(renderedAttributes, dataTableHighlight);
		}

		if (dataTableHighlight.getHost() != null) {
			renderHost(renderedAttributes, dataTableHighlight);
		}

		if (dataTableHighlight.getInitialized() != null) {
			renderInitialized(renderedAttributes, dataTableHighlight);
		}

		if (dataTableHighlight.getOverlayActiveNode() != null) {
			renderOverlayActiveNode(renderedAttributes, dataTableHighlight);
		}

		if (dataTableHighlight.getOverlayNode() != null) {
			renderOverlayNode(renderedAttributes, dataTableHighlight);
		}

		if (dataTableHighlight.getRangeBorderWidth() != null) {
			renderRangeBorderWidth(renderedAttributes, dataTableHighlight);
		}

		if (dataTableHighlight.getType() != null) {
			renderType(renderedAttributes, dataTableHighlight);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (dataTableHighlight.getAfterActiveBorderWidthChange() != null) {
			renderAfterActiveBorderWidthChange(renderedAfterEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getAfterHighlightRangeChange() != null) {
			renderAfterHighlightRangeChange(renderedAfterEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getAfterHostChange() != null) {
			renderAfterHostChange(renderedAfterEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getAfterOverlayActiveNodeChange() != null) {
			renderAfterOverlayActiveNodeChange(renderedAfterEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getAfterOverlayNodeChange() != null) {
			renderAfterOverlayNodeChange(renderedAfterEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getAfterRangeBorderWidthChange() != null) {
			renderAfterRangeBorderWidthChange(renderedAfterEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, dataTableHighlight);
		}


		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		if (dataTableHighlight.getOnActiveBorderWidthChange() != null) {
			renderOnActiveBorderWidthChange(renderedOnEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getOnHighlightRangeChange() != null) {
			renderOnHighlightRangeChange(renderedOnEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getOnHostChange() != null) {
			renderOnHostChange(renderedOnEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getOnOverlayActiveNodeChange() != null) {
			renderOnOverlayActiveNodeChange(renderedOnEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getOnOverlayNodeChange() != null) {
			renderOnOverlayNodeChange(renderedOnEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getOnRangeBorderWidthChange() != null) {
			renderOnRangeBorderWidthChange(renderedOnEvents, dataTableHighlight);
		}

		if (dataTableHighlight.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, dataTableHighlight);
		}


		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
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
		renderedAttributes.add(renderNumber(DataTableHighlight.ACTIVE_BORDER_WIDTH, activeBorderWidth));
	}

	protected void renderDestroyed(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Boolean destroyed = dataTableHighlight.getDestroyed();
		renderedAttributes.add(renderBoolean(DataTableHighlight.DESTROYED, destroyed));
	}

	protected void renderHighlightRange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Boolean highlightRange = dataTableHighlight.getHighlightRange();
		renderedAttributes.add(renderBoolean(DataTableHighlight.HIGHLIGHT_RANGE, highlightRange));
	}

	protected void renderHost(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Object host = dataTableHighlight.getHost();
		renderedAttributes.add(renderString(DataTableHighlight.HOST, host));
	}

	protected void renderInitialized(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Boolean initialized = dataTableHighlight.getInitialized();
		renderedAttributes.add(renderBoolean(DataTableHighlight.INITIALIZED, initialized));
	}

	protected void renderOverlayActiveNode(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String overlayActiveNode = dataTableHighlight.getOverlayActiveNode();
		renderedAttributes.add(renderString(DataTableHighlight.OVERLAY_ACTIVE_NODE, overlayActiveNode));
	}

	protected void renderOverlayNode(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String overlayNode = dataTableHighlight.getOverlayNode();
		renderedAttributes.add(renderString(DataTableHighlight.OVERLAY_NODE, overlayNode));
	}

	protected void renderRangeBorderWidth(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.Object rangeBorderWidth = dataTableHighlight.getRangeBorderWidth();
		renderedAttributes.add(renderNumber(DataTableHighlight.RANGE_BORDER_WIDTH, rangeBorderWidth));
	}

	protected void renderType(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String type = dataTableHighlight.getType();
		renderedAttributes.add(renderString(DataTableHighlight.TYPE, type));
	}

	protected void renderAfterActiveBorderWidthChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String afterActiveBorderWidthChange = dataTableHighlight.getAfterActiveBorderWidthChange();
		renderedAttributes.add(renderString(DataTableHighlight.AFTER_ACTIVE_BORDER_WIDTH_CHANGE, afterActiveBorderWidthChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String afterDestroyedChange = dataTableHighlight.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DataTableHighlight.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterHighlightRangeChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String afterHighlightRangeChange = dataTableHighlight.getAfterHighlightRangeChange();
		renderedAttributes.add(renderString(DataTableHighlight.AFTER_HIGHLIGHT_RANGE_CHANGE, afterHighlightRangeChange));
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String afterHostChange = dataTableHighlight.getAfterHostChange();
		renderedAttributes.add(renderString(DataTableHighlight.AFTER_HOST_CHANGE, afterHostChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String afterInitializedChange = dataTableHighlight.getAfterInitializedChange();
		renderedAttributes.add(renderString(DataTableHighlight.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterOverlayActiveNodeChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String afterOverlayActiveNodeChange = dataTableHighlight.getAfterOverlayActiveNodeChange();
		renderedAttributes.add(renderString(DataTableHighlight.AFTER_OVERLAY_ACTIVE_NODE_CHANGE, afterOverlayActiveNodeChange));
	}

	protected void renderAfterOverlayNodeChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String afterOverlayNodeChange = dataTableHighlight.getAfterOverlayNodeChange();
		renderedAttributes.add(renderString(DataTableHighlight.AFTER_OVERLAY_NODE_CHANGE, afterOverlayNodeChange));
	}

	protected void renderAfterRangeBorderWidthChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String afterRangeBorderWidthChange = dataTableHighlight.getAfterRangeBorderWidthChange();
		renderedAttributes.add(renderString(DataTableHighlight.AFTER_RANGE_BORDER_WIDTH_CHANGE, afterRangeBorderWidthChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String afterTypeChange = dataTableHighlight.getAfterTypeChange();
		renderedAttributes.add(renderString(DataTableHighlight.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderOnActiveBorderWidthChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String onActiveBorderWidthChange = dataTableHighlight.getOnActiveBorderWidthChange();
		renderedAttributes.add(renderString(DataTableHighlight.ON_ACTIVE_BORDER_WIDTH_CHANGE, onActiveBorderWidthChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String onDestroyedChange = dataTableHighlight.getOnDestroyedChange();
		renderedAttributes.add(renderString(DataTableHighlight.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnHighlightRangeChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String onHighlightRangeChange = dataTableHighlight.getOnHighlightRangeChange();
		renderedAttributes.add(renderString(DataTableHighlight.ON_HIGHLIGHT_RANGE_CHANGE, onHighlightRangeChange));
	}

	protected void renderOnHostChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String onHostChange = dataTableHighlight.getOnHostChange();
		renderedAttributes.add(renderString(DataTableHighlight.ON_HOST_CHANGE, onHostChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String onInitializedChange = dataTableHighlight.getOnInitializedChange();
		renderedAttributes.add(renderString(DataTableHighlight.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnOverlayActiveNodeChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String onOverlayActiveNodeChange = dataTableHighlight.getOnOverlayActiveNodeChange();
		renderedAttributes.add(renderString(DataTableHighlight.ON_OVERLAY_ACTIVE_NODE_CHANGE, onOverlayActiveNodeChange));
	}

	protected void renderOnOverlayNodeChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String onOverlayNodeChange = dataTableHighlight.getOnOverlayNodeChange();
		renderedAttributes.add(renderString(DataTableHighlight.ON_OVERLAY_NODE_CHANGE, onOverlayNodeChange));
	}

	protected void renderOnRangeBorderWidthChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String onRangeBorderWidthChange = dataTableHighlight.getOnRangeBorderWidthChange();
		renderedAttributes.add(renderString(DataTableHighlight.ON_RANGE_BORDER_WIDTH_CHANGE, onRangeBorderWidthChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, DataTableHighlight dataTableHighlight) throws IOException {
		java.lang.String onTypeChange = dataTableHighlight.getOnTypeChange();
		renderedAttributes.add(renderString(DataTableHighlight.ON_TYPE_CHANGE, onTypeChange));
	}

}