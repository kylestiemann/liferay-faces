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
package com.liferay.faces.alloy.component.diagramnodemanagerbase;

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
public abstract class DiagramNodeManagerBaseRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-diagram-builder-impl";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		DiagramNodeManagerBase diagramNodeManagerBase = (DiagramNodeManagerBase) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var diagramNodeManagerBase = new A.DiagramNodeManagerBase");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (diagramNodeManagerBase.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, diagramNodeManagerBase);
		}

		if (diagramNodeManagerBase.getInitialized() != null) {
			renderInitialized(renderedAttributes, diagramNodeManagerBase);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (diagramNodeManagerBase.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, diagramNodeManagerBase);
		}

		if (diagramNodeManagerBase.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, diagramNodeManagerBase);
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

		if (diagramNodeManagerBase.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, diagramNodeManagerBase);
		}

		if (diagramNodeManagerBase.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, diagramNodeManagerBase);
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

	protected void renderDestroyed(List<String> renderedAttributes, DiagramNodeManagerBase diagramNodeManagerBase) throws IOException {
		java.lang.Boolean destroyed = diagramNodeManagerBase.getDestroyed();
		renderedAttributes.add(renderBoolean(DiagramNodeManagerBase.DESTROYED, destroyed));
	}

	protected void renderInitialized(List<String> renderedAttributes, DiagramNodeManagerBase diagramNodeManagerBase) throws IOException {
		java.lang.Boolean initialized = diagramNodeManagerBase.getInitialized();
		renderedAttributes.add(renderBoolean(DiagramNodeManagerBase.INITIALIZED, initialized));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, DiagramNodeManagerBase diagramNodeManagerBase) throws IOException {
		java.lang.String afterDestroyedChange = diagramNodeManagerBase.getAfterDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeManagerBase.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, DiagramNodeManagerBase diagramNodeManagerBase) throws IOException {
		java.lang.String afterInitializedChange = diagramNodeManagerBase.getAfterInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeManagerBase.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, DiagramNodeManagerBase diagramNodeManagerBase) throws IOException {
		java.lang.String onDestroyedChange = diagramNodeManagerBase.getOnDestroyedChange();
		renderedAttributes.add(renderString(DiagramNodeManagerBase.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, DiagramNodeManagerBase diagramNodeManagerBase) throws IOException {
		java.lang.String onInitializedChange = diagramNodeManagerBase.getOnInitializedChange();
		renderedAttributes.add(renderString(DiagramNodeManagerBase.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

}