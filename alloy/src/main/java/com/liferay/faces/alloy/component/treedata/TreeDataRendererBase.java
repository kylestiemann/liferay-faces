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

		if (treeData.getTreeDataChildren() != null) {
			renderTreeDataChildren(renderedAttributes, treeData);
		}
		
		if (treeData.getContainer() != null) {
			renderContainer(renderedAttributes, treeData);
		}
		
		if (treeData.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, treeData);
		}
		
		if (treeData.getIndex() != null) {
			renderIndex(renderedAttributes, treeData);
		}
		
		if (treeData.getInitialized() != null) {
			renderInitialized(renderedAttributes, treeData);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (treeData.getAfterChildrenChange() != null) {
			renderAfterChildrenChange(renderedAfterEvents, treeData);
		}
		
		if (treeData.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, treeData);
		}
		
		if (treeData.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, treeData);
		}
		
		if (treeData.getAfterIndexChange() != null) {
			renderAfterIndexChange(renderedAfterEvents, treeData);
		}
		
		if (treeData.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, treeData);
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

		if (treeData.getOnChildrenChange() != null) {
			renderOnChildrenChange(renderedOnEvents, treeData);
		}
		
		if (treeData.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, treeData);
		}
		
		if (treeData.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, treeData);
		}
		
		if (treeData.getOnIndexChange() != null) {
			renderOnIndexChange(renderedOnEvents, treeData);
		}
		
		if (treeData.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, treeData);
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

	protected void renderTreeDataChildren(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.Object treeDataChildren = treeData.getTreeDataChildren();
		renderedAttributes.add(renderArray(TreeData.TREE_DATA_CHILDREN, treeDataChildren));
	}

	protected void renderContainer(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String container = treeData.getContainer();
		renderedAttributes.add(renderString(TreeData.CONTAINER, container));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.Boolean destroyed = treeData.getDestroyed();
		renderedAttributes.add(renderBoolean(TreeData.DESTROYED, destroyed));
	}

	protected void renderIndex(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.Object index = treeData.getIndex();
		renderedAttributes.add(renderObject(TreeData.INDEX, index));
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.Boolean initialized = treeData.getInitialized();
		renderedAttributes.add(renderBoolean(TreeData.INITIALIZED, initialized));
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterChildrenChange = treeData.getAfterChildrenChange();
		renderedAttributes.add(renderString(TreeData.AFTER_CHILDREN_CHANGE, afterChildrenChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterContainerChange = treeData.getAfterContainerChange();
		renderedAttributes.add(renderString(TreeData.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterDestroyedChange = treeData.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TreeData.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterIndexChange = treeData.getAfterIndexChange();
		renderedAttributes.add(renderString(TreeData.AFTER_INDEX_CHANGE, afterIndexChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String afterInitializedChange = treeData.getAfterInitializedChange();
		renderedAttributes.add(renderString(TreeData.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onChildrenChange = treeData.getOnChildrenChange();
		renderedAttributes.add(renderString(TreeData.ON_CHILDREN_CHANGE, onChildrenChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onContainerChange = treeData.getOnContainerChange();
		renderedAttributes.add(renderString(TreeData.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onDestroyedChange = treeData.getOnDestroyedChange();
		renderedAttributes.add(renderString(TreeData.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onIndexChange = treeData.getOnIndexChange();
		renderedAttributes.add(renderString(TreeData.ON_INDEX_CHANGE, onIndexChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeData treeData) throws IOException {
		java.lang.String onInitializedChange = treeData.getOnInitializedChange();
		renderedAttributes.add(renderString(TreeData.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

}