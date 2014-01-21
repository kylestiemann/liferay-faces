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
package com.liferay.faces.alloy.component.togglerdelegate;

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
public abstract class TogglerDelegateRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toggler";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		TogglerDelegate togglerDelegate = (TogglerDelegate) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var togglerDelegate = new A.TogglerDelegate");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (togglerDelegate.getAnimated() != null) {
			renderAnimated(renderedAttributes, togglerDelegate);
		}

		if (togglerDelegate.getCloseAllOnExpand() != null) {
			renderCloseAllOnExpand(renderedAttributes, togglerDelegate);
		}

		if (togglerDelegate.getContainer() != null) {
			renderContainer(renderedAttributes, togglerDelegate);
		}

		if (togglerDelegate.getContent() != null) {
			renderContent(renderedAttributes, togglerDelegate);
		}

		if (togglerDelegate.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, togglerDelegate);
		}

		if (togglerDelegate.getExpanded() != null) {
			renderExpanded(renderedAttributes, togglerDelegate);
		}

		if (togglerDelegate.getHeader() != null) {
			renderHeader(renderedAttributes, togglerDelegate);
		}

		if (togglerDelegate.getInitialized() != null) {
			renderInitialized(renderedAttributes, togglerDelegate);
		}

		if (togglerDelegate.getTransition() != null) {
			renderTransition(renderedAttributes, togglerDelegate);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (togglerDelegate.getAfterAnimatedChange() != null) {
			renderAfterAnimatedChange(renderedAfterEvents, togglerDelegate);
		}

		if (togglerDelegate.getAfterCloseAllOnExpandChange() != null) {
			renderAfterCloseAllOnExpandChange(renderedAfterEvents, togglerDelegate);
		}

		if (togglerDelegate.getAfterContainerChange() != null) {
			renderAfterContainerChange(renderedAfterEvents, togglerDelegate);
		}

		if (togglerDelegate.getAfterContentChange() != null) {
			renderAfterContentChange(renderedAfterEvents, togglerDelegate);
		}

		if (togglerDelegate.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, togglerDelegate);
		}

		if (togglerDelegate.getAfterExpandedChange() != null) {
			renderAfterExpandedChange(renderedAfterEvents, togglerDelegate);
		}

		if (togglerDelegate.getAfterHeaderChange() != null) {
			renderAfterHeaderChange(renderedAfterEvents, togglerDelegate);
		}

		if (togglerDelegate.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, togglerDelegate);
		}

		if (togglerDelegate.getAfterTransitionChange() != null) {
			renderAfterTransitionChange(renderedAfterEvents, togglerDelegate);
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

		if (togglerDelegate.getOnAnimatedChange() != null) {
			renderOnAnimatedChange(renderedOnEvents, togglerDelegate);
		}

		if (togglerDelegate.getOnCloseAllOnExpandChange() != null) {
			renderOnCloseAllOnExpandChange(renderedOnEvents, togglerDelegate);
		}

		if (togglerDelegate.getOnContainerChange() != null) {
			renderOnContainerChange(renderedOnEvents, togglerDelegate);
		}

		if (togglerDelegate.getOnContentChange() != null) {
			renderOnContentChange(renderedOnEvents, togglerDelegate);
		}

		if (togglerDelegate.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, togglerDelegate);
		}

		if (togglerDelegate.getOnExpandedChange() != null) {
			renderOnExpandedChange(renderedOnEvents, togglerDelegate);
		}

		if (togglerDelegate.getOnHeaderChange() != null) {
			renderOnHeaderChange(renderedOnEvents, togglerDelegate);
		}

		if (togglerDelegate.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, togglerDelegate);
		}

		if (togglerDelegate.getOnTransitionChange() != null) {
			renderOnTransitionChange(renderedOnEvents, togglerDelegate);
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

	protected void renderAnimated(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean animated = togglerDelegate.getAnimated();
		renderedAttributes.add(renderBoolean(TogglerDelegate.ANIMATED, animated));
	}

	protected void renderCloseAllOnExpand(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean closeAllOnExpand = togglerDelegate.getCloseAllOnExpand();
		renderedAttributes.add(renderBoolean(TogglerDelegate.CLOSE_ALL_ON_EXPAND, closeAllOnExpand));
	}

	protected void renderContainer(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String container = togglerDelegate.getContainer();
		renderedAttributes.add(renderString(TogglerDelegate.CONTAINER, container));
	}

	protected void renderContent(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String content = togglerDelegate.getContent();
		renderedAttributes.add(renderString(TogglerDelegate.CONTENT, content));
	}

	protected void renderDestroyed(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean destroyed = togglerDelegate.getDestroyed();
		renderedAttributes.add(renderBoolean(TogglerDelegate.DESTROYED, destroyed));
	}

	protected void renderExpanded(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean expanded = togglerDelegate.getExpanded();
		renderedAttributes.add(renderBoolean(TogglerDelegate.EXPANDED, expanded));
	}

	protected void renderHeader(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String header = togglerDelegate.getHeader();
		renderedAttributes.add(renderString(TogglerDelegate.HEADER, header));
	}

	protected void renderInitialized(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean initialized = togglerDelegate.getInitialized();
		renderedAttributes.add(renderBoolean(TogglerDelegate.INITIALIZED, initialized));
	}

	protected void renderTransition(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Object transition = togglerDelegate.getTransition();
		renderedAttributes.add(renderObject(TogglerDelegate.TRANSITION, transition));
	}

	protected void renderAfterAnimatedChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String afterAnimatedChange = togglerDelegate.getAfterAnimatedChange();
		renderedAttributes.add(renderString(TogglerDelegate.AFTER_ANIMATED_CHANGE, afterAnimatedChange));
	}

	protected void renderAfterCloseAllOnExpandChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String afterCloseAllOnExpandChange = togglerDelegate.getAfterCloseAllOnExpandChange();
		renderedAttributes.add(renderString(TogglerDelegate.AFTER_CLOSE_ALL_ON_EXPAND_CHANGE, afterCloseAllOnExpandChange));
	}

	protected void renderAfterContainerChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String afterContainerChange = togglerDelegate.getAfterContainerChange();
		renderedAttributes.add(renderString(TogglerDelegate.AFTER_CONTAINER_CHANGE, afterContainerChange));
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String afterContentChange = togglerDelegate.getAfterContentChange();
		renderedAttributes.add(renderString(TogglerDelegate.AFTER_CONTENT_CHANGE, afterContentChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String afterDestroyedChange = togglerDelegate.getAfterDestroyedChange();
		renderedAttributes.add(renderString(TogglerDelegate.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String afterExpandedChange = togglerDelegate.getAfterExpandedChange();
		renderedAttributes.add(renderString(TogglerDelegate.AFTER_EXPANDED_CHANGE, afterExpandedChange));
	}

	protected void renderAfterHeaderChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String afterHeaderChange = togglerDelegate.getAfterHeaderChange();
		renderedAttributes.add(renderString(TogglerDelegate.AFTER_HEADER_CHANGE, afterHeaderChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String afterInitializedChange = togglerDelegate.getAfterInitializedChange();
		renderedAttributes.add(renderString(TogglerDelegate.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterTransitionChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String afterTransitionChange = togglerDelegate.getAfterTransitionChange();
		renderedAttributes.add(renderString(TogglerDelegate.AFTER_TRANSITION_CHANGE, afterTransitionChange));
	}

	protected void renderOnAnimatedChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String onAnimatedChange = togglerDelegate.getOnAnimatedChange();
		renderedAttributes.add(renderString(TogglerDelegate.ON_ANIMATED_CHANGE, onAnimatedChange));
	}

	protected void renderOnCloseAllOnExpandChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String onCloseAllOnExpandChange = togglerDelegate.getOnCloseAllOnExpandChange();
		renderedAttributes.add(renderString(TogglerDelegate.ON_CLOSE_ALL_ON_EXPAND_CHANGE, onCloseAllOnExpandChange));
	}

	protected void renderOnContainerChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String onContainerChange = togglerDelegate.getOnContainerChange();
		renderedAttributes.add(renderString(TogglerDelegate.ON_CONTAINER_CHANGE, onContainerChange));
	}

	protected void renderOnContentChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String onContentChange = togglerDelegate.getOnContentChange();
		renderedAttributes.add(renderString(TogglerDelegate.ON_CONTENT_CHANGE, onContentChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String onDestroyedChange = togglerDelegate.getOnDestroyedChange();
		renderedAttributes.add(renderString(TogglerDelegate.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String onExpandedChange = togglerDelegate.getOnExpandedChange();
		renderedAttributes.add(renderString(TogglerDelegate.ON_EXPANDED_CHANGE, onExpandedChange));
	}

	protected void renderOnHeaderChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String onHeaderChange = togglerDelegate.getOnHeaderChange();
		renderedAttributes.add(renderString(TogglerDelegate.ON_HEADER_CHANGE, onHeaderChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String onInitializedChange = togglerDelegate.getOnInitializedChange();
		renderedAttributes.add(renderString(TogglerDelegate.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnTransitionChange(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String onTransitionChange = togglerDelegate.getOnTransitionChange();
		renderedAttributes.add(renderString(TogglerDelegate.ON_TRANSITION_CHANGE, onTransitionChange));
	}

}