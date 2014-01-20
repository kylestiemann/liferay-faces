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
package com.liferay.faces.alloy.component.sortablelist;

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
public abstract class SortableListRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-sortable-list";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		SortableList sortableList = (SortableList) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var sortableList = new A.SortableList");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderDd(renderedAttributes, sortableList);
		renderDestroyed(renderedAttributes, sortableList);
		renderDropCondition(renderedAttributes, sortableList);
		renderDropContainer(renderedAttributes, sortableList);
		renderDropOn(renderedAttributes, sortableList);
		renderHelper(renderedAttributes, sortableList);
		renderInitialized(renderedAttributes, sortableList);
		renderNodes(renderedAttributes, sortableList);
		renderPlaceholder(renderedAttributes, sortableList);
		renderProxy(renderedAttributes, sortableList);
		renderSortCondition(renderedAttributes, sortableList);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterDdChange(renderedAfterEvents, sortableList);
		renderAfterDestroyedChange(renderedAfterEvents, sortableList);
		renderAfterDropConditionChange(renderedAfterEvents, sortableList);
		renderAfterDropContainerChange(renderedAfterEvents, sortableList);
		renderAfterDropOnChange(renderedAfterEvents, sortableList);
		renderAfterHelperChange(renderedAfterEvents, sortableList);
		renderAfterInitializedChange(renderedAfterEvents, sortableList);
		renderAfterNodesChange(renderedAfterEvents, sortableList);
		renderAfterPlaceholderChange(renderedAfterEvents, sortableList);
		renderAfterProxyChange(renderedAfterEvents, sortableList);
		renderAfterSortConditionChange(renderedAfterEvents, sortableList);

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

		renderOnDdChange(renderedOnEvents, sortableList);
		renderOnDestroyedChange(renderedOnEvents, sortableList);
		renderOnDropConditionChange(renderedOnEvents, sortableList);
		renderOnDropContainerChange(renderedOnEvents, sortableList);
		renderOnDropOnChange(renderedOnEvents, sortableList);
		renderOnHelperChange(renderedOnEvents, sortableList);
		renderOnInitializedChange(renderedOnEvents, sortableList);
		renderOnNodesChange(renderedOnEvents, sortableList);
		renderOnPlaceholderChange(renderedOnEvents, sortableList);
		renderOnProxyChange(renderedOnEvents, sortableList);
		renderOnSortConditionChange(renderedOnEvents, sortableList);

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

	protected void renderDd(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String dd = sortableList.getDd();

		if (dd != null) {
			renderedAttributes.add(renderString(SortableList.DD, dd));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Boolean destroyed = sortableList.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(SortableList.DESTROYED, destroyed));
		}
	}

	protected void renderDropCondition(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Object dropCondition = sortableList.getDropCondition();

		if (dropCondition != null) {
			renderedAttributes.add(renderString(SortableList.DROP_CONDITION, dropCondition));
		}
	}

	protected void renderDropContainer(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Object dropContainer = sortableList.getDropContainer();

		if (dropContainer != null) {
			renderedAttributes.add(renderString(SortableList.DROP_CONTAINER, dropContainer));
		}
	}

	protected void renderDropOn(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String dropOn = sortableList.getDropOn();

		if (dropOn != null) {
			renderedAttributes.add(renderString(SortableList.DROP_ON, dropOn));
		}
	}

	protected void renderHelper(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String helper = sortableList.getHelper();

		if (helper != null) {
			renderedAttributes.add(renderString(SortableList.HELPER, helper));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Boolean initialized = sortableList.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(SortableList.INITIALIZED, initialized));
		}
	}

	protected void renderNodes(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String nodes = sortableList.getNodes();

		if (nodes != null) {
			renderedAttributes.add(renderString(SortableList.NODES, nodes));
		}
	}

	protected void renderPlaceholder(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String placeholder = sortableList.getPlaceholder();

		if (placeholder != null) {
			renderedAttributes.add(renderString(SortableList.PLACEHOLDER, placeholder));
		}
	}

	protected void renderProxy(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String proxy = sortableList.getProxy();

		if (proxy != null) {
			renderedAttributes.add(renderString(SortableList.PROXY, proxy));
		}
	}

	protected void renderSortCondition(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.Object sortCondition = sortableList.getSortCondition();

		if (sortCondition != null) {
			renderedAttributes.add(renderString(SortableList.SORT_CONDITION, sortCondition));
		}
	}

	protected void renderAfterDdChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterDdChange = sortableList.getAfterDdChange();

		if (afterDdChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_DD_CHANGE, afterDdChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterDestroyedChange = sortableList.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDropConditionChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterDropConditionChange = sortableList.getAfterDropConditionChange();

		if (afterDropConditionChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_DROP_CONDITION_CHANGE, afterDropConditionChange));
		}
	}

	protected void renderAfterDropContainerChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterDropContainerChange = sortableList.getAfterDropContainerChange();

		if (afterDropContainerChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_DROP_CONTAINER_CHANGE, afterDropContainerChange));
		}
	}

	protected void renderAfterDropOnChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterDropOnChange = sortableList.getAfterDropOnChange();

		if (afterDropOnChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_DROP_ON_CHANGE, afterDropOnChange));
		}
	}

	protected void renderAfterHelperChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterHelperChange = sortableList.getAfterHelperChange();

		if (afterHelperChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_HELPER_CHANGE, afterHelperChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterInitializedChange = sortableList.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterNodesChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterNodesChange = sortableList.getAfterNodesChange();

		if (afterNodesChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_NODES_CHANGE, afterNodesChange));
		}
	}

	protected void renderAfterPlaceholderChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterPlaceholderChange = sortableList.getAfterPlaceholderChange();

		if (afterPlaceholderChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_PLACEHOLDER_CHANGE, afterPlaceholderChange));
		}
	}

	protected void renderAfterProxyChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterProxyChange = sortableList.getAfterProxyChange();

		if (afterProxyChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_PROXY_CHANGE, afterProxyChange));
		}
	}

	protected void renderAfterSortConditionChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String afterSortConditionChange = sortableList.getAfterSortConditionChange();

		if (afterSortConditionChange != null) {
			renderedAttributes.add(renderString(SortableList.AFTER_SORT_CONDITION_CHANGE, afterSortConditionChange));
		}
	}

	protected void renderOnDdChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onDdChange = sortableList.getOnDdChange();

		if (onDdChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_DD_CHANGE, onDdChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onDestroyedChange = sortableList.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDropConditionChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onDropConditionChange = sortableList.getOnDropConditionChange();

		if (onDropConditionChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_DROP_CONDITION_CHANGE, onDropConditionChange));
		}
	}

	protected void renderOnDropContainerChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onDropContainerChange = sortableList.getOnDropContainerChange();

		if (onDropContainerChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_DROP_CONTAINER_CHANGE, onDropContainerChange));
		}
	}

	protected void renderOnDropOnChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onDropOnChange = sortableList.getOnDropOnChange();

		if (onDropOnChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_DROP_ON_CHANGE, onDropOnChange));
		}
	}

	protected void renderOnHelperChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onHelperChange = sortableList.getOnHelperChange();

		if (onHelperChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_HELPER_CHANGE, onHelperChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onInitializedChange = sortableList.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnNodesChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onNodesChange = sortableList.getOnNodesChange();

		if (onNodesChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_NODES_CHANGE, onNodesChange));
		}
	}

	protected void renderOnPlaceholderChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onPlaceholderChange = sortableList.getOnPlaceholderChange();

		if (onPlaceholderChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_PLACEHOLDER_CHANGE, onPlaceholderChange));
		}
	}

	protected void renderOnProxyChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onProxyChange = sortableList.getOnProxyChange();

		if (onProxyChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_PROXY_CHANGE, onProxyChange));
		}
	}

	protected void renderOnSortConditionChange(List<String> renderedAttributes, SortableList sortableList) throws IOException {
		java.lang.String onSortConditionChange = sortableList.getOnSortConditionChange();

		if (onSortConditionChange != null) {
			renderedAttributes.add(renderString(SortableList.ON_SORT_CONDITION_CHANGE, onSortConditionChange));
		}
	}

}