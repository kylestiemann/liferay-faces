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
package com.liferay.faces.alloy.component.sortablelayout;

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
public abstract class SortableLayoutRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-sortable-layout";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SortableLayout sortableLayout = (SortableLayout) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var sortableLayout = new A.SortableLayout");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderDelegateConfig(renderedAttributes, sortableLayout);
		renderDestroyed(renderedAttributes, sortableLayout);
		renderDragNodes(renderedAttributes, sortableLayout);
		renderDropContainer(renderedAttributes, sortableLayout);
		renderDropNodes(renderedAttributes, sortableLayout);
		renderGroups(renderedAttributes, sortableLayout);
		renderInitialized(renderedAttributes, sortableLayout);
		renderLazyStart(renderedAttributes, sortableLayout);
		renderPlaceholder(renderedAttributes, sortableLayout);
		renderProxy(renderedAttributes, sortableLayout);
		renderProxyNode(renderedAttributes, sortableLayout);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterDelegateConfigChange(renderedAfterEvents, sortableLayout);
		renderAfterDestroyedChange(renderedAfterEvents, sortableLayout);
		renderAfterDragNodesChange(renderedAfterEvents, sortableLayout);
		renderAfterDropContainerChange(renderedAfterEvents, sortableLayout);
		renderAfterDropNodesChange(renderedAfterEvents, sortableLayout);
		renderAfterGroupsChange(renderedAfterEvents, sortableLayout);
		renderAfterInitializedChange(renderedAfterEvents, sortableLayout);
		renderAfterLazyStartChange(renderedAfterEvents, sortableLayout);
		renderAfterPlaceholderChange(renderedAfterEvents, sortableLayout);
		renderAfterProxyChange(renderedAfterEvents, sortableLayout);
		renderAfterProxyNodeChange(renderedAfterEvents, sortableLayout);

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

		renderOnDelegateConfigChange(renderedOnEvents, sortableLayout);
		renderOnDestroyedChange(renderedOnEvents, sortableLayout);
		renderOnDragNodesChange(renderedOnEvents, sortableLayout);
		renderOnDropContainerChange(renderedOnEvents, sortableLayout);
		renderOnDropNodesChange(renderedOnEvents, sortableLayout);
		renderOnGroupsChange(renderedOnEvents, sortableLayout);
		renderOnInitializedChange(renderedOnEvents, sortableLayout);
		renderOnLazyStartChange(renderedOnEvents, sortableLayout);
		renderOnPlaceholderChange(renderedOnEvents, sortableLayout);
		renderOnProxyChange(renderedOnEvents, sortableLayout);
		renderOnProxyNodeChange(renderedOnEvents, sortableLayout);

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

	protected void renderDelegateConfig(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Object delegateConfig = sortableLayout.getDelegateConfig();

		if (delegateConfig != null) {
			renderedAttributes.add(renderObject(SortableLayout.DELEGATE_CONFIG, delegateConfig));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Boolean destroyed = sortableLayout.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SortableLayout.DESTROYED, destroyed));
		}
	}

	protected void renderDragNodes(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String dragNodes = sortableLayout.getDragNodes();

		if (dragNodes != null) {
			renderedAttributes.add(renderString(SortableLayout.DRAG_NODES, dragNodes));
		}
	}

	protected void renderDropContainer(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Object dropContainer = sortableLayout.getDropContainer();

		if (dropContainer != null) {
			renderedAttributes.add(renderString(SortableLayout.DROP_CONTAINER, dropContainer));
		}
	}

	protected void renderDropNodes(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String dropNodes = sortableLayout.getDropNodes();

		if (dropNodes != null) {
			renderedAttributes.add(renderString(SortableLayout.DROP_NODES, dropNodes));
		}
	}

	protected void renderGroups(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String groups = sortableLayout.getGroups();

		if (groups != null) {
			renderedAttributes.add(renderString(SortableLayout.GROUPS, groups));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Boolean initialized = sortableLayout.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SortableLayout.INITIALIZED, initialized));
		}
	}

	protected void renderLazyStart(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.Boolean lazyStart = sortableLayout.getLazyStart();

		if (lazyStart != null) {
			renderedAttributes.add(renderBoolean(SortableLayout.LAZY_START, lazyStart));
		}
	}

	protected void renderPlaceholder(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String placeholder = sortableLayout.getPlaceholder();

		if (placeholder != null) {
			renderedAttributes.add(renderString(SortableLayout.PLACEHOLDER, placeholder));
		}
	}

	protected void renderProxy(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String proxy = sortableLayout.getProxy();

		if (proxy != null) {
			renderedAttributes.add(renderString(SortableLayout.PROXY, proxy));
		}
	}

	protected void renderProxyNode(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String proxyNode = sortableLayout.getProxyNode();

		if (proxyNode != null) {
			renderedAttributes.add(renderString(SortableLayout.PROXY_NODE, proxyNode));
		}
	}

	protected void renderAfterDelegateConfigChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterDelegateConfigChange = sortableLayout.getAfterDelegateConfigChange();

		if (afterDelegateConfigChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterDestroyedChange = sortableLayout.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDragNodesChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterDragNodesChange = sortableLayout.getAfterDragNodesChange();

		if (afterDragNodesChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_DRAG_NODES_CHANGE, afterDragNodesChange));
		}
	}

	protected void renderAfterDropContainerChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterDropContainerChange = sortableLayout.getAfterDropContainerChange();

		if (afterDropContainerChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange));
		}
	}

	protected void renderAfterDropNodesChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterDropNodesChange = sortableLayout.getAfterDropNodesChange();

		if (afterDropNodesChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_DROP_NODES_CHANGE, afterDropNodesChange));
		}
	}

	protected void renderAfterGroupsChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterGroupsChange = sortableLayout.getAfterGroupsChange();

		if (afterGroupsChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_GROUPS_CHANGE, afterGroupsChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterInitializedChange = sortableLayout.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLazyStartChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterLazyStartChange = sortableLayout.getAfterLazyStartChange();

		if (afterLazyStartChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_LAZY_START_CHANGE, afterLazyStartChange));
		}
	}

	protected void renderAfterPlaceholderChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterPlaceholderChange = sortableLayout.getAfterPlaceholderChange();

		if (afterPlaceholderChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_PLACEHOLDER_CHANGE, afterPlaceholderChange));
		}
	}

	protected void renderAfterProxyChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterProxyChange = sortableLayout.getAfterProxyChange();

		if (afterProxyChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_PROXY_CHANGE, afterProxyChange));
		}
	}

	protected void renderAfterProxyNodeChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String afterProxyNodeChange = sortableLayout.getAfterProxyNodeChange();

		if (afterProxyNodeChange != null) {
			renderedAttributes.add(renderString(SortableLayout.AFTER_PROXY_NODE_CHANGE, afterProxyNodeChange));
		}
	}

	protected void renderOnDelegateConfigChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onDelegateConfigChange = sortableLayout.getOnDelegateConfigChange();

		if (onDelegateConfigChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onDestroyedChange = sortableLayout.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDragNodesChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onDragNodesChange = sortableLayout.getOnDragNodesChange();

		if (onDragNodesChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_DRAG_NODES_CHANGE, onDragNodesChange));
		}
	}

	protected void renderOnDropContainerChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onDropContainerChange = sortableLayout.getOnDropContainerChange();

		if (onDropContainerChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_DROP_CONTAINER_CHANGE, onDropContainerChange));
		}
	}

	protected void renderOnDropNodesChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onDropNodesChange = sortableLayout.getOnDropNodesChange();

		if (onDropNodesChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_DROP_NODES_CHANGE, onDropNodesChange));
		}
	}

	protected void renderOnGroupsChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onGroupsChange = sortableLayout.getOnGroupsChange();

		if (onGroupsChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_GROUPS_CHANGE, onGroupsChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onInitializedChange = sortableLayout.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLazyStartChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onLazyStartChange = sortableLayout.getOnLazyStartChange();

		if (onLazyStartChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_LAZY_START_CHANGE, onLazyStartChange));
		}
	}

	protected void renderOnPlaceholderChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onPlaceholderChange = sortableLayout.getOnPlaceholderChange();

		if (onPlaceholderChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_PLACEHOLDER_CHANGE, onPlaceholderChange));
		}
	}

	protected void renderOnProxyChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onProxyChange = sortableLayout.getOnProxyChange();

		if (onProxyChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_PROXY_CHANGE, onProxyChange));
		}
	}

	protected void renderOnProxyNodeChange(List<String> renderedAttributes, SortableLayout sortableLayout) throws IOException {
		java.lang.String onProxyNodeChange = sortableLayout.getOnProxyNodeChange();

		if (onProxyNodeChange != null) {
			renderedAttributes.add(renderString(SortableLayout.ON_PROXY_NODE_CHANGE, onProxyNodeChange));
		}
	}

}