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
package com.liferay.faces.alloy.component.toggler;

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
public abstract class TogglerRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toggler";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Toggler toggler = (Toggler) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var toggler = new A.Toggler");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (toggler.getAnimated() != null) {
			renderAnimated(renderedAttributes, toggler);
		}
		
		if (toggler.getAnimating() != null) {
			renderAnimating(renderedAttributes, toggler);
		}
		
		if (toggler.getBindDOMEvents() != null) {
			renderBindDOMEvents(renderedAttributes, toggler);
		}
		
		if (toggler.getContent() != null) {
			renderContent(renderedAttributes, toggler);
		}
		
		if (toggler.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, toggler);
		}
		
		if (toggler.getExpanded() != null) {
			renderExpanded(renderedAttributes, toggler);
		}
		
		if (toggler.getHeader() != null) {
			renderHeader(renderedAttributes, toggler);
		}
		
		if (toggler.getInitialized() != null) {
			renderInitialized(renderedAttributes, toggler);
		}
		
		if (toggler.getTransition() != null) {
			renderTransition(renderedAttributes, toggler);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (toggler.getAfterAnimatedChange() != null) {
			renderAfterAnimatedChange(renderedAfterEvents, toggler);
		}
		
		if (toggler.getAfterAnimatingChange() != null) {
			renderAfterAnimatingChange(renderedAfterEvents, toggler);
		}
		
		if (toggler.getAfterBindDOMEventsChange() != null) {
			renderAfterBindDOMEventsChange(renderedAfterEvents, toggler);
		}
		
		if (toggler.getAfterContentChange() != null) {
			renderAfterContentChange(renderedAfterEvents, toggler);
		}
		
		if (toggler.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, toggler);
		}
		
		if (toggler.getAfterExpandedChange() != null) {
			renderAfterExpandedChange(renderedAfterEvents, toggler);
		}
		
		if (toggler.getAfterHeaderChange() != null) {
			renderAfterHeaderChange(renderedAfterEvents, toggler);
		}
		
		if (toggler.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, toggler);
		}
		
		if (toggler.getAfterTransitionChange() != null) {
			renderAfterTransitionChange(renderedAfterEvents, toggler);
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

		if (toggler.getOnAnimatedChange() != null) {
			renderOnAnimatedChange(renderedOnEvents, toggler);
		}
		
		if (toggler.getOnAnimatingChange() != null) {
			renderOnAnimatingChange(renderedOnEvents, toggler);
		}
		
		if (toggler.getOnBindDOMEventsChange() != null) {
			renderOnBindDOMEventsChange(renderedOnEvents, toggler);
		}
		
		if (toggler.getOnContentChange() != null) {
			renderOnContentChange(renderedOnEvents, toggler);
		}
		
		if (toggler.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, toggler);
		}
		
		if (toggler.getOnExpandedChange() != null) {
			renderOnExpandedChange(renderedOnEvents, toggler);
		}
		
		if (toggler.getOnHeaderChange() != null) {
			renderOnHeaderChange(renderedOnEvents, toggler);
		}
		
		if (toggler.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, toggler);
		}
		
		if (toggler.getOnTransitionChange() != null) {
			renderOnTransitionChange(renderedOnEvents, toggler);
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

	protected void renderAnimated(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean animated = toggler.getAnimated();
		renderedAttributes.add(renderBoolean(Toggler.ANIMATED, animated));
	}

	protected void renderAnimating(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean animating = toggler.getAnimating();
		renderedAttributes.add(renderBoolean(Toggler.ANIMATING, animating));
	}

	protected void renderBindDOMEvents(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean bindDOMEvents = toggler.getBindDOMEvents();
		renderedAttributes.add(renderBoolean(Toggler.BIND_DOMEVENTS, bindDOMEvents));
	}

	protected void renderContent(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String content = toggler.getContent();
		renderedAttributes.add(renderString(Toggler.CONTENT, content));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean destroyed = toggler.getDestroyed();
		renderedAttributes.add(renderBoolean(Toggler.DESTROYED, destroyed));
	}

	protected void renderExpanded(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean expanded = toggler.getExpanded();
		renderedAttributes.add(renderBoolean(Toggler.EXPANDED, expanded));
	}

	protected void renderHeader(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String header = toggler.getHeader();
		renderedAttributes.add(renderString(Toggler.HEADER, header));
	}

	protected void renderInitialized(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean initialized = toggler.getInitialized();
		renderedAttributes.add(renderBoolean(Toggler.INITIALIZED, initialized));
	}

	protected void renderTransition(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Object transition = toggler.getTransition();
		renderedAttributes.add(renderObject(Toggler.TRANSITION, transition));
	}

	protected void renderAfterAnimatedChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String afterAnimatedChange = toggler.getAfterAnimatedChange();
		renderedAttributes.add(renderString(Toggler.AFTER_ANIMATED_CHANGE, afterAnimatedChange));
	}

	protected void renderAfterAnimatingChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String afterAnimatingChange = toggler.getAfterAnimatingChange();
		renderedAttributes.add(renderString(Toggler.AFTER_ANIMATING_CHANGE, afterAnimatingChange));
	}

	protected void renderAfterBindDOMEventsChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String afterBindDOMEventsChange = toggler.getAfterBindDOMEventsChange();
		renderedAttributes.add(renderString(Toggler.AFTER_BIND_DOMEVENTS_CHANGE, afterBindDOMEventsChange));
	}

	protected void renderAfterContentChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String afterContentChange = toggler.getAfterContentChange();
		renderedAttributes.add(renderString(Toggler.AFTER_CONTENT_CHANGE, afterContentChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String afterDestroyedChange = toggler.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Toggler.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterExpandedChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String afterExpandedChange = toggler.getAfterExpandedChange();
		renderedAttributes.add(renderString(Toggler.AFTER_EXPANDED_CHANGE, afterExpandedChange));
	}

	protected void renderAfterHeaderChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String afterHeaderChange = toggler.getAfterHeaderChange();
		renderedAttributes.add(renderString(Toggler.AFTER_HEADER_CHANGE, afterHeaderChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String afterInitializedChange = toggler.getAfterInitializedChange();
		renderedAttributes.add(renderString(Toggler.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterTransitionChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String afterTransitionChange = toggler.getAfterTransitionChange();
		renderedAttributes.add(renderString(Toggler.AFTER_TRANSITION_CHANGE, afterTransitionChange));
	}

	protected void renderOnAnimatedChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String onAnimatedChange = toggler.getOnAnimatedChange();
		renderedAttributes.add(renderString(Toggler.ON_ANIMATED_CHANGE, onAnimatedChange));
	}

	protected void renderOnAnimatingChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String onAnimatingChange = toggler.getOnAnimatingChange();
		renderedAttributes.add(renderString(Toggler.ON_ANIMATING_CHANGE, onAnimatingChange));
	}

	protected void renderOnBindDOMEventsChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String onBindDOMEventsChange = toggler.getOnBindDOMEventsChange();
		renderedAttributes.add(renderString(Toggler.ON_BIND_DOMEVENTS_CHANGE, onBindDOMEventsChange));
	}

	protected void renderOnContentChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String onContentChange = toggler.getOnContentChange();
		renderedAttributes.add(renderString(Toggler.ON_CONTENT_CHANGE, onContentChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String onDestroyedChange = toggler.getOnDestroyedChange();
		renderedAttributes.add(renderString(Toggler.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnExpandedChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String onExpandedChange = toggler.getOnExpandedChange();
		renderedAttributes.add(renderString(Toggler.ON_EXPANDED_CHANGE, onExpandedChange));
	}

	protected void renderOnHeaderChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String onHeaderChange = toggler.getOnHeaderChange();
		renderedAttributes.add(renderString(Toggler.ON_HEADER_CHANGE, onHeaderChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String onInitializedChange = toggler.getOnInitializedChange();
		renderedAttributes.add(renderString(Toggler.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnTransitionChange(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String onTransitionChange = toggler.getOnTransitionChange();
		renderedAttributes.add(renderString(Toggler.ON_TRANSITION_CHANGE, onTransitionChange));
	}

}