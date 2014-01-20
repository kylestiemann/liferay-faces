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
package com.liferay.faces.alloy.component.treeview;

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
public abstract class TreeViewRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-view";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeView treeView = (TreeView) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeView = new A.TreeView");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderTreeViewChildren(renderedAttributes, treeView);
		renderContainer(renderedAttributes, treeView);
		renderDestroyed(renderedAttributes, treeView);
		renderIndex(renderedAttributes, treeView);
		renderInitialized(renderedAttributes, treeView);
		renderLastSelected(renderedAttributes, treeView);
		renderLazyLoad(renderedAttributes, treeView);
		renderSelectOnToggle(renderedAttributes, treeView);
		renderType(renderedAttributes, treeView);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterChildrenChange(renderedAfterEvents, treeView);
		renderAfterContainerChange(renderedAfterEvents, treeView);
		renderAfterDestroyedChange(renderedAfterEvents, treeView);
		renderAfterIndexChange(renderedAfterEvents, treeView);
		renderAfterInitializedChange(renderedAfterEvents, treeView);
		renderAfterLastSelectedChange(renderedAfterEvents, treeView);
		renderAfterLazyLoadChange(renderedAfterEvents, treeView);
		renderAfterSelectOnToggleChange(renderedAfterEvents, treeView);
		renderAfterTypeChange(renderedAfterEvents, treeView);

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

		renderOnChildrenChange(renderedOnEvents, treeView);
		renderOnContainerChange(renderedOnEvents, treeView);
		renderOnDestroyedChange(renderedOnEvents, treeView);
		renderOnIndexChange(renderedOnEvents, treeView);
		renderOnInitializedChange(renderedOnEvents, treeView);
		renderOnLastSelectedChange(renderedOnEvents, treeView);
		renderOnLazyLoadChange(renderedOnEvents, treeView);
		renderOnSelectOnToggleChange(renderedOnEvents, treeView);
		renderOnTypeChange(renderedOnEvents, treeView);

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

	protected void renderTreeViewChildren(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Object treeViewChildren = treeView.getTreeViewChildren();

		if (treeViewChildren != null) {
			renderedAttributes.add(renderArray(TreeView.TREE_VIEW_CHILDREN, treeViewChildren));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String container = treeView.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TreeView.CONTAINER, container));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean destroyed = treeView.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TreeView.DESTROYED, destroyed));
		}
	}

	protected void renderIndex(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Object index = treeView.getIndex();

		if (index != null) {
			renderedAttributes.add(renderObject(TreeView.INDEX, index));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean initialized = treeView.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TreeView.INITIALIZED, initialized));
		}
	}

	protected void renderLastSelected(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Object lastSelected = treeView.getLastSelected();

		if (lastSelected != null) {
			renderedAttributes.add(renderString(TreeView.LAST_SELECTED, lastSelected));
		}
	}

	protected void renderLazyLoad(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean lazyLoad = treeView.getLazyLoad();

		if (lazyLoad != null) {
			renderedAttributes.add(renderBoolean(TreeView.LAZY_LOAD, lazyLoad));
		}
	}

	protected void renderSelectOnToggle(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean selectOnToggle = treeView.getSelectOnToggle();

		if (selectOnToggle != null) {
			renderedAttributes.add(renderBoolean(TreeView.SELECT_ON_TOGGLE, selectOnToggle));
		}
	}

	protected void renderType(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String type = treeView.getType();

		if (type != null) {
			renderedAttributes.add(renderString(TreeView.TYPE, type));
		}
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterChildrenChange = treeView.getAfterChildrenChange();

		if (afterChildrenChange != null) {
			renderedAttributes.add(renderString(TreeView.AFTER_CHILDREN_CHANGE, afterChildrenChange));
		}
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterContainerChange = treeView.getAfterContainerChange();

		if (afterContainerChange != null) {
			renderedAttributes.add(renderString(TreeView.AFTER_CONTAINER_CHANGE, afterContainerChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterDestroyedChange = treeView.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterIndexChange = treeView.getAfterIndexChange();

		if (afterIndexChange != null) {
			renderedAttributes.add(renderString(TreeView.AFTER_INDEX_CHANGE, afterIndexChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterInitializedChange = treeView.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(TreeView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLastSelectedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterLastSelectedChange = treeView.getAfterLastSelectedChange();

		if (afterLastSelectedChange != null) {
			renderedAttributes.add(renderString(TreeView.AFTER_LAST_SELECTED_CHANGE, afterLastSelectedChange));
		}
	}

	protected void renderAfterLazyLoadChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterLazyLoadChange = treeView.getAfterLazyLoadChange();

		if (afterLazyLoadChange != null) {
			renderedAttributes.add(renderString(TreeView.AFTER_LAZY_LOAD_CHANGE, afterLazyLoadChange));
		}
	}

	protected void renderAfterSelectOnToggleChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterSelectOnToggleChange = treeView.getAfterSelectOnToggleChange();

		if (afterSelectOnToggleChange != null) {
			renderedAttributes.add(renderString(TreeView.AFTER_SELECT_ON_TOGGLE_CHANGE, afterSelectOnToggleChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterTypeChange = treeView.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(TreeView.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onChildrenChange = treeView.getOnChildrenChange();

		if (onChildrenChange != null) {
			renderedAttributes.add(renderString(TreeView.ON_CHILDREN_CHANGE, onChildrenChange));
		}
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onContainerChange = treeView.getOnContainerChange();

		if (onContainerChange != null) {
			renderedAttributes.add(renderString(TreeView.ON_CONTAINER_CHANGE, onContainerChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onDestroyedChange = treeView.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(TreeView.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onIndexChange = treeView.getOnIndexChange();

		if (onIndexChange != null) {
			renderedAttributes.add(renderString(TreeView.ON_INDEX_CHANGE, onIndexChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onInitializedChange = treeView.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(TreeView.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLastSelectedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onLastSelectedChange = treeView.getOnLastSelectedChange();

		if (onLastSelectedChange != null) {
			renderedAttributes.add(renderString(TreeView.ON_LAST_SELECTED_CHANGE, onLastSelectedChange));
		}
	}

	protected void renderOnLazyLoadChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onLazyLoadChange = treeView.getOnLazyLoadChange();

		if (onLazyLoadChange != null) {
			renderedAttributes.add(renderString(TreeView.ON_LAZY_LOAD_CHANGE, onLazyLoadChange));
		}
	}

	protected void renderOnSelectOnToggleChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onSelectOnToggleChange = treeView.getOnSelectOnToggleChange();

		if (onSelectOnToggleChange != null) {
			renderedAttributes.add(renderString(TreeView.ON_SELECT_ON_TOGGLE_CHANGE, onSelectOnToggleChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onTypeChange = treeView.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(TreeView.ON_TYPE_CHANGE, onTypeChange));
		}
	}

}