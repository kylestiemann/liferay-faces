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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
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

		renderAnimated(renderedAttributes, toggler);
		renderAnimating(renderedAttributes, toggler);
		renderBindDOMEvents(renderedAttributes, toggler);
		renderContent(renderedAttributes, toggler);
		renderDestroyed(renderedAttributes, toggler);
		renderExpanded(renderedAttributes, toggler);
		renderHeader(renderedAttributes, toggler);
		renderInitialized(renderedAttributes, toggler);
		renderTransition(renderedAttributes, toggler);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

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

		if (animated != null) {
			renderedAttributes.add(renderBoolean(Toggler.ANIMATED, animated));
		}
	}

	protected void renderAnimating(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean animating = toggler.getAnimating();

		if (animating != null) {
			renderedAttributes.add(renderBoolean(Toggler.ANIMATING, animating));
		}
	}

	protected void renderBindDOMEvents(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean bindDOMEvents = toggler.getBindDOMEvents();

		if (bindDOMEvents != null) {
			renderedAttributes.add(renderBoolean(Toggler.BIND_DOMEVENTS, bindDOMEvents));
		}
	}

	protected void renderContent(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String content = toggler.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(Toggler.CONTENT, content));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean destroyed = toggler.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Toggler.DESTROYED, destroyed));
		}
	}

	protected void renderExpanded(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean expanded = toggler.getExpanded();

		if (expanded != null) {
			renderedAttributes.add(renderBoolean(Toggler.EXPANDED, expanded));
		}
	}

	protected void renderHeader(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.String header = toggler.getHeader();

		if (header != null) {
			renderedAttributes.add(renderString(Toggler.HEADER, header));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Boolean initialized = toggler.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Toggler.INITIALIZED, initialized));
		}
	}

	protected void renderTransition(List<String> renderedAttributes, Toggler toggler) throws IOException {
		java.lang.Object transition = toggler.getTransition();

		if (transition != null) {
			renderedAttributes.add(renderObject(Toggler.TRANSITION, transition));
		}
	}

}