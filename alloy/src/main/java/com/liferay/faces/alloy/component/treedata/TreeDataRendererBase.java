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
package com.liferay.faces.alloy.component.treedata;

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
public abstract class TreeDataRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-data";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeData treeData = (TreeData) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeData = new A.TreeData");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderTreeDataChildren(renderedAttributes, treeData);
		renderContainer(renderedAttributes, treeData);
		renderDestroyed(renderedAttributes, treeData);
		renderIndex(renderedAttributes, treeData);
		renderInitialized(renderedAttributes, treeData);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterChildrenChange(renderedAfterEvents, treeData);
		renderAfterContainerChange(renderedAfterEvents, treeData);
		renderAfterDestroyedChange(renderedAfterEvents, treeData);
		renderAfterIndexChange(renderedAfterEvents, treeData);
		renderAfterInitializedChange(renderedAfterEvents, treeData);

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

		renderOnChildrenChange(renderedOnEvents, treeData);
		renderOnContainerChange(renderedOnEvents, treeData);
		renderOnDestroyedChange(renderedOnEvents, treeData);
		renderOnIndexChange(renderedOnEvents, treeData);
		renderOnInitializedChange(renderedOnEvents, treeData);

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

	protected void renderTreeDataChildren(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.Object treeDataChildren = treeData.getTreeDataChildren();

		if (treeDataChildren != null) {
			renderedAttributes.add(renderArray(TreeData.TREE_DATA_CHILDREN, treeDataChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String container = treeData.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeData.CONTAINER, container));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.Boolean destroyed = treeData.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeData.DESTROYED, destroyed));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.Object index = treeData.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeData.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.Boolean initialized = treeData.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeData.INITIALIZED, initialized));
		}
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterChildrenChange = treeData.getAfterChildrenChange();

		if (afterChildrenChange != null) {
			renderedAttributes.add(renderString(TreeData.AFTER_CHILDREN_CHANGE, afterChildrenChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterContainerChange = treeData.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(TreeData.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterDestroyedChange = treeData.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeData.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterIndexChange = treeData.getAfterIndexChange();

		if (afterIndexChange != null) {
			renderedAttributes.add(renderString(TreeData.AFTER_INDEX_CHANGE, afterIndexChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterInitializedChange = treeData.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TreeData.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onChildrenChange = treeData.getOnChildrenChange();

		if (onChildrenChange != null) {
			renderedAttributes.add(renderString(TreeData.ON_CHILDREN_CHANGE, onChildrenChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onContainerChange = treeData.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(TreeData.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onDestroyedChange = treeData.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeData.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onIndexChange = treeData.getOnIndexChange();

		if (onIndexChange != null) {
			renderedAttributes.add(renderString(TreeData.ON_INDEX_CHANGE, onIndexChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onInitializedChange = treeData.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TreeData.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

}