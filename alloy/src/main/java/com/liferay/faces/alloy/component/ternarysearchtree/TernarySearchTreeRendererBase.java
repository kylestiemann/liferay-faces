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
package com.liferay.faces.alloy.component.ternarysearchtree;

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
public abstract class TernarySearchTreeRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-search-ternary-search-tree";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TernarySearchTree ternarySearchTree = (TernarySearchTree) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var ternarySearchTree = new A.TernarySearchTree");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (ternarySearchTree.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, ternarySearchTree);
		}
		
		if (ternarySearchTree.getInitialized() != null) {
			renderInitialized(renderedAttributes, ternarySearchTree);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (ternarySearchTree.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, ternarySearchTree);
		}
		
		if (ternarySearchTree.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, ternarySearchTree);
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

		if (ternarySearchTree.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, ternarySearchTree);
		}
		
		if (ternarySearchTree.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, ternarySearchTree);
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

	protected void renderDestroyed(List<String> renderedAttributes, TernarySearchTree ternarySearchTree) throws IOException {
		java.lang.Boolean destroyed = ternarySearchTree.getDestroyed();
		renderedAttributes.add(renderBoolean(TernarySearchTree.DESTROYED, destroyed));
	}

	protected void renderInitialized(List<String> renderedAttributes, TernarySearchTree ternarySearchTree) throws IOException {
		java.lang.Boolean initialized = ternarySearchTree.getInitialized();
		renderedAttributes.add(renderBoolean(TernarySearchTree.INITIALIZED, initialized));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TernarySearchTree ternarySearchTree) throws IOException {
		java.lang.String afterDestroyedChange = ternarySearchTree.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TernarySearchTree.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TernarySearchTree ternarySearchTree) throws IOException {
		java.lang.String afterInitializedChange = ternarySearchTree.getAfterInitializedChange();
		renderedAttributes.add(renderString(TernarySearchTree.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TernarySearchTree ternarySearchTree) throws IOException {
		java.lang.String onDestroyedChange = ternarySearchTree.getOnDestroyedChange();
		renderedAttributes.add(renderString(TernarySearchTree.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TernarySearchTree ternarySearchTree) throws IOException {
		java.lang.String onInitializedChange = ternarySearchTree.getOnInitializedChange();
		renderedAttributes.add(renderString(TernarySearchTree.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

}