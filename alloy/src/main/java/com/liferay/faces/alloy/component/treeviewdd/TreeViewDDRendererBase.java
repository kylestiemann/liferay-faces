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
package com.liferay.faces.alloy.component.treeviewdd;

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
public abstract class TreeViewDDRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tree-view";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TreeViewDD treeViewDD = (TreeViewDD) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var treeViewDD = new A.TreeViewDD");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (treeViewDD.getTreeViewDDChildren() != null) {
			renderTreeViewDDChildren(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getContainer() != null) {
			renderContainer(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getDropAction() != null) {
			renderDropAction(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getHelper() != null) {
			renderHelper(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getIndex() != null) {
			renderIndex(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getInitialized() != null) {
			renderInitialized(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getLastSelected() != null) {
			renderLastSelected(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getLastY() != null) {
			renderLastY(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getLazyLoad() != null) {
			renderLazyLoad(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getNode() != null) {
			renderNode(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getNodeContent() != null) {
			renderNodeContent(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getScrollDelay() != null) {
			renderScrollDelay(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getSelectOnToggle() != null) {
			renderSelectOnToggle(renderedAttributes, treeViewDD);
		}

		if (treeViewDD.getType() != null) {
			renderType(renderedAttributes, treeViewDD);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (treeViewDD.getAfterChildrenChange() != null) {
			renderAfterChildrenChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterDropActionChange() != null) {
			renderAfterDropActionChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterHelperChange() != null) {
			renderAfterHelperChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterIndexChange() != null) {
			renderAfterIndexChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterLastSelectedChange() != null) {
			renderAfterLastSelectedChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterLastYChange() != null) {
			renderAfterLastYChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterLazyLoadChange() != null) {
			renderAfterLazyLoadChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterNodeChange() != null) {
			renderAfterNodeChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterNodeContentChange() != null) {
			renderAfterNodeContentChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterScrollDelayChange() != null) {
			renderAfterScrollDelayChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterSelectOnToggleChange() != null) {
			renderAfterSelectOnToggleChange(renderedAfterEvents, treeViewDD);
		}

		if (treeViewDD.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, treeViewDD);
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

		if (treeViewDD.getOnChildrenChange() != null) {
			renderOnChildrenChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnDropActionChange() != null) {
			renderOnDropActionChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnHelperChange() != null) {
			renderOnHelperChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnIndexChange() != null) {
			renderOnIndexChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnLastSelectedChange() != null) {
			renderOnLastSelectedChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnLastYChange() != null) {
			renderOnLastYChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnLazyLoadChange() != null) {
			renderOnLazyLoadChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnNodeChange() != null) {
			renderOnNodeChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnNodeContentChange() != null) {
			renderOnNodeContentChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnScrollDelayChange() != null) {
			renderOnScrollDelayChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnSelectOnToggleChange() != null) {
			renderOnSelectOnToggleChange(renderedOnEvents, treeViewDD);
		}

		if (treeViewDD.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, treeViewDD);
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

	protected void renderTreeViewDDChildren(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object treeViewDDChildren = treeViewDD.getTreeViewDDChildren();
		renderedAttributes.add(renderArray(TreeViewDD.TREE_VIEW_DDCHILDREN, treeViewDDChildren));
	}

	protected void renderContainer(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String container = treeViewDD.getContainer();
		renderedAttributes.add(renderString(TreeViewDD.CONTAINER, container));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Boolean destroyed = treeViewDD.getDestroyed();
		renderedAttributes.add(renderBoolean(TreeViewDD.DESTROYED, destroyed));
	}

	protected void renderDropAction(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String dropAction = treeViewDD.getDropAction();
		renderedAttributes.add(renderString(TreeViewDD.DROP_ACTION, dropAction));
	}

	protected void renderHelper(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String helper = treeViewDD.getHelper();
		renderedAttributes.add(renderString(TreeViewDD.HELPER, helper));
	}

	protected void renderIndex(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object index = treeViewDD.getIndex();
		renderedAttributes.add(renderObject(TreeViewDD.INDEX, index));
	}

	protected void renderInitialized(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Boolean initialized = treeViewDD.getInitialized();
		renderedAttributes.add(renderBoolean(TreeViewDD.INITIALIZED, initialized));
	}

	protected void renderLastSelected(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object lastSelected = treeViewDD.getLastSelected();
		renderedAttributes.add(renderString(TreeViewDD.LAST_SELECTED, lastSelected));
	}

	protected void renderLastY(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object lastY = treeViewDD.getLastY();
		renderedAttributes.add(renderNumber(TreeViewDD.LAST_Y, lastY));
	}

	protected void renderLazyLoad(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Boolean lazyLoad = treeViewDD.getLazyLoad();
		renderedAttributes.add(renderBoolean(TreeViewDD.LAZY_LOAD, lazyLoad));
	}

	protected void renderNode(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String node = treeViewDD.getNode();
		renderedAttributes.add(renderString(TreeViewDD.NODE, node));
	}

	protected void renderNodeContent(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object nodeContent = treeViewDD.getNodeContent();
		renderedAttributes.add(renderString(TreeViewDD.NODE_CONTENT, nodeContent));
	}

	protected void renderScrollDelay(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Object scrollDelay = treeViewDD.getScrollDelay();
		renderedAttributes.add(renderNumber(TreeViewDD.SCROLL_DELAY, scrollDelay));
	}

	protected void renderSelectOnToggle(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.Boolean selectOnToggle = treeViewDD.getSelectOnToggle();
		renderedAttributes.add(renderBoolean(TreeViewDD.SELECT_ON_TOGGLE, selectOnToggle));
	}

	protected void renderType(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String type = treeViewDD.getType();
		renderedAttributes.add(renderString(TreeViewDD.TYPE, type));
	}

	protected void renderAfterChildrenChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterChildrenChange = treeViewDD.getAfterChildrenChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_CHILDREN_CHANGE, afterChildrenChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterContainerChange = treeViewDD.getAfterContainerChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterDestroyedChange = treeViewDD.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDropActionChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterDropActionChange = treeViewDD.getAfterDropActionChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_DROP_ACTION_CHANGE, afterDropActionChange));
	}

	protected void renderAfterHelperChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterHelperChange = treeViewDD.getAfterHelperChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_HELPER_CHANGE, afterHelperChange));
	}

	protected void renderAfterIndexChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterIndexChange = treeViewDD.getAfterIndexChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_INDEX_CHANGE, afterIndexChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterInitializedChange = treeViewDD.getAfterInitializedChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLastSelectedChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterLastSelectedChange = treeViewDD.getAfterLastSelectedChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_LAST_SELECTED_CHANGE, afterLastSelectedChange));
	}

	protected void renderAfterLastYChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterLastYChange = treeViewDD.getAfterLastYChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_LAST_YCHANGE, afterLastYChange));
	}

	protected void renderAfterLazyLoadChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterLazyLoadChange = treeViewDD.getAfterLazyLoadChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_LAZY_LOAD_CHANGE, afterLazyLoadChange));
	}

	protected void renderAfterNodeChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterNodeChange = treeViewDD.getAfterNodeChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_NODE_CHANGE, afterNodeChange));
	}

	protected void renderAfterNodeContentChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterNodeContentChange = treeViewDD.getAfterNodeContentChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_NODE_CONTENT_CHANGE, afterNodeContentChange));
	}

	protected void renderAfterScrollDelayChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterScrollDelayChange = treeViewDD.getAfterScrollDelayChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_SCROLL_DELAY_CHANGE, afterScrollDelayChange));
	}

	protected void renderAfterSelectOnToggleChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterSelectOnToggleChange = treeViewDD.getAfterSelectOnToggleChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_SELECT_ON_TOGGLE_CHANGE, afterSelectOnToggleChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String afterTypeChange = treeViewDD.getAfterTypeChange();
		renderedAttributes.add(renderString(TreeViewDD.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderOnChildrenChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onChildrenChange = treeViewDD.getOnChildrenChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_CHILDREN_CHANGE, onChildrenChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onContainerChange = treeViewDD.getOnContainerChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onDestroyedChange = treeViewDD.getOnDestroyedChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDropActionChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onDropActionChange = treeViewDD.getOnDropActionChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_DROP_ACTION_CHANGE, onDropActionChange));
	}

	protected void renderOnHelperChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onHelperChange = treeViewDD.getOnHelperChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_HELPER_CHANGE, onHelperChange));
	}

	protected void renderOnIndexChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onIndexChange = treeViewDD.getOnIndexChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_INDEX_CHANGE, onIndexChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onInitializedChange = treeViewDD.getOnInitializedChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLastSelectedChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onLastSelectedChange = treeViewDD.getOnLastSelectedChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_LAST_SELECTED_CHANGE, onLastSelectedChange));
	}

	protected void renderOnLastYChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onLastYChange = treeViewDD.getOnLastYChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_LAST_YCHANGE, onLastYChange));
	}

	protected void renderOnLazyLoadChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onLazyLoadChange = treeViewDD.getOnLazyLoadChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_LAZY_LOAD_CHANGE, onLazyLoadChange));
	}

	protected void renderOnNodeChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onNodeChange = treeViewDD.getOnNodeChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_NODE_CHANGE, onNodeChange));
	}

	protected void renderOnNodeContentChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onNodeContentChange = treeViewDD.getOnNodeContentChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_NODE_CONTENT_CHANGE, onNodeContentChange));
	}

	protected void renderOnScrollDelayChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onScrollDelayChange = treeViewDD.getOnScrollDelayChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_SCROLL_DELAY_CHANGE, onScrollDelayChange));
	}

	protected void renderOnSelectOnToggleChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onSelectOnToggleChange = treeViewDD.getOnSelectOnToggleChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_SELECT_ON_TOGGLE_CHANGE, onSelectOnToggleChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, TreeViewDD treeViewDD) throws IOException {
		java.lang.String onTypeChange = treeViewDD.getOnTypeChange();
		renderedAttributes.add(renderString(TreeViewDD.ON_TYPE_CHANGE, onTypeChange));
	}

}