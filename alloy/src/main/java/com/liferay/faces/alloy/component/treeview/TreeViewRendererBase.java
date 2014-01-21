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

		if (treeView.getTreeViewChildren() != null) {
			renderTreeViewChildren(renderedAttributes, treeView);
		}

		if (treeView.getContainer() != null) {
			renderContainer(renderedAttributes, treeView);
		}

		if (treeView.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, treeView);
		}

		if (treeView.getIndex() != null) {
			renderIndex(renderedAttributes, treeView);
		}

		if (treeView.getInitialized() != null) {
			renderInitialized(renderedAttributes, treeView);
		}

		if (treeView.getLastSelected() != null) {
			renderLastSelected(renderedAttributes, treeView);
		}

		if (treeView.getLazyLoad() != null) {
			renderLazyLoad(renderedAttributes, treeView);
		}

		if (treeView.getSelectOnToggle() != null) {
			renderSelectOnToggle(renderedAttributes, treeView);
		}

		if (treeView.getType() != null) {
			renderType(renderedAttributes, treeView);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (treeView.getAfterChildrenChange() != null) {
			renderAfterChildrenChange(renderedAfterEvents, treeView);
		}

		if (treeView.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, treeView);
		}

		if (treeView.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, treeView);
		}

		if (treeView.getAfterIndexChange() != null) {
			renderAfterIndexChange(renderedAfterEvents, treeView);
		}

		if (treeView.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, treeView);
		}

		if (treeView.getAfterLastSelectedChange() != null) {
			renderAfterLastSelectedChange(renderedAfterEvents, treeView);
		}

		if (treeView.getAfterLazyLoadChange() != null) {
			renderAfterLazyLoadChange(renderedAfterEvents, treeView);
		}

		if (treeView.getAfterSelectOnToggleChange() != null) {
			renderAfterSelectOnToggleChange(renderedAfterEvents, treeView);
		}

		if (treeView.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, treeView);
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

		if (treeView.getOnChildrenChange() != null) {
			renderOnChildrenChange(renderedOnEvents, treeView);
		}

		if (treeView.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, treeView);
		}

		if (treeView.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, treeView);
		}

		if (treeView.getOnIndexChange() != null) {
			renderOnIndexChange(renderedOnEvents, treeView);
		}

		if (treeView.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, treeView);
		}

		if (treeView.getOnLastSelectedChange() != null) {
			renderOnLastSelectedChange(renderedOnEvents, treeView);
		}

		if (treeView.getOnLazyLoadChange() != null) {
			renderOnLazyLoadChange(renderedOnEvents, treeView);
		}

		if (treeView.getOnSelectOnToggleChange() != null) {
			renderOnSelectOnToggleChange(renderedOnEvents, treeView);
		}

		if (treeView.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, treeView);
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

	protected void renderTreeViewChildren(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Object treeViewChildren = treeView.getTreeViewChildren();
		renderedAttributes.add(renderArray(TreeView.TREE_VIEW_CHILDREN, treeViewChildren));
	}

	protected void renderContainer(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String container = treeView.getContainer();
		renderedAttributes.add(renderString(TreeView.CONTAINER, container));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean destroyed = treeView.getDestroyed();
		renderedAttributes.add(renderBoolean(TreeView.DESTROYED, destroyed));
	}

	protected void renderIndex(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Object index = treeView.getIndex();
		renderedAttributes.add(renderObject(TreeView.INDEX, index));
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean initialized = treeView.getInitialized();
		renderedAttributes.add(renderBoolean(TreeView.INITIALIZED, initialized));
	}

	protected void renderLastSelected(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Object lastSelected = treeView.getLastSelected();
		renderedAttributes.add(renderString(TreeView.LAST_SELECTED, lastSelected));
	}

	protected void renderLazyLoad(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean lazyLoad = treeView.getLazyLoad();
		renderedAttributes.add(renderBoolean(TreeView.LAZY_LOAD, lazyLoad));
	}

	protected void renderSelectOnToggle(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.Boolean selectOnToggle = treeView.getSelectOnToggle();
		renderedAttributes.add(renderBoolean(TreeView.SELECT_ON_TOGGLE, selectOnToggle));
	}

	protected void renderType(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String type = treeView.getType();
		renderedAttributes.add(renderString(TreeView.TYPE, type));
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterChildrenChange = treeView.getAfterChildrenChange();
		renderedAttributes.add(renderString(TreeView.AFTER_CHILDREN_CHANGE, afterChildrenChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterContainerChange = treeView.getAfterContainerChange();
		renderedAttributes.add(renderString(TreeView.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterDestroyedChange = treeView.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TreeView.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterIndexChange = treeView.getAfterIndexChange();
		renderedAttributes.add(renderString(TreeView.AFTER_INDEX_CHANGE, afterIndexChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterInitializedChange = treeView.getAfterInitializedChange();
		renderedAttributes.add(renderString(TreeView.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLastSelectedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterLastSelectedChange = treeView.getAfterLastSelectedChange();
		renderedAttributes.add(renderString(TreeView.AFTER_LAST_SELECTED_CHANGE, afterLastSelectedChange));
	}

	protected void renderAfterLazyLoadChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterLazyLoadChange = treeView.getAfterLazyLoadChange();
		renderedAttributes.add(renderString(TreeView.AFTER_LAZY_LOAD_CHANGE, afterLazyLoadChange));
	}

	protected void renderAfterSelectOnToggleChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterSelectOnToggleChange = treeView.getAfterSelectOnToggleChange();
		renderedAttributes.add(renderString(TreeView.AFTER_SELECT_ON_TOGGLE_CHANGE, afterSelectOnToggleChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String afterTypeChange = treeView.getAfterTypeChange();
		renderedAttributes.add(renderString(TreeView.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onChildrenChange = treeView.getOnChildrenChange();
		renderedAttributes.add(renderString(TreeView.ON_CHILDREN_CHANGE, onChildrenChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onContainerChange = treeView.getOnContainerChange();
		renderedAttributes.add(renderString(TreeView.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onDestroyedChange = treeView.getOnDestroyedChange();
		renderedAttributes.add(renderString(TreeView.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onIndexChange = treeView.getOnIndexChange();
		renderedAttributes.add(renderString(TreeView.ON_INDEX_CHANGE, onIndexChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onInitializedChange = treeView.getOnInitializedChange();
		renderedAttributes.add(renderString(TreeView.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLastSelectedChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onLastSelectedChange = treeView.getOnLastSelectedChange();
		renderedAttributes.add(renderString(TreeView.ON_LAST_SELECTED_CHANGE, onLastSelectedChange));
	}

	protected void renderOnLazyLoadChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onLazyLoadChange = treeView.getOnLazyLoadChange();
		renderedAttributes.add(renderString(TreeView.ON_LAZY_LOAD_CHANGE, onLazyLoadChange));
	}

	protected void renderOnSelectOnToggleChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onSelectOnToggleChange = treeView.getOnSelectOnToggleChange();
		renderedAttributes.add(renderString(TreeView.ON_SELECT_ON_TOGGLE_CHANGE, onSelectOnToggleChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, TreeView treeView) throws IOException {
		java.lang.String onTypeChange = treeView.getOnTypeChange();
		renderedAttributes.add(renderString(TreeView.ON_TYPE_CHANGE, onTypeChange));
	}

}