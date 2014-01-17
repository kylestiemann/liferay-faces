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

		renderAnimated(renderedAttributes, togglerDelegate);
		renderCloseAllOnExpand(renderedAttributes, togglerDelegate);
		renderContainer(renderedAttributes, togglerDelegate);
		renderContent(renderedAttributes, togglerDelegate);
		renderDestroyed(renderedAttributes, togglerDelegate);
		renderExpanded(renderedAttributes, togglerDelegate);
		renderHeader(renderedAttributes, togglerDelegate);
		renderInitialized(renderedAttributes, togglerDelegate);
		renderTransition(renderedAttributes, togglerDelegate);

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

	protected void renderAnimated(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean animated = togglerDelegate.getAnimated();

		if (animated != null) {
			renderedAttributes.add(renderBoolean(TogglerDelegate.ANIMATED, animated));
		}
	}

	protected void renderCloseAllOnExpand(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean closeAllOnExpand = togglerDelegate.getCloseAllOnExpand();

		if (closeAllOnExpand != null) {
			renderedAttributes.add(renderBoolean(TogglerDelegate.CLOSE_ALL_ON_EXPAND, closeAllOnExpand));
		}
	}

	protected void renderContainer(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String container = togglerDelegate.getContainer();

		if (container != null) {
			renderedAttributes.add(renderString(TogglerDelegate.CONTAINER, container));
		}
	}

	protected void renderContent(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String content = togglerDelegate.getContent();

		if (content != null) {
			renderedAttributes.add(renderString(TogglerDelegate.CONTENT, content));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean destroyed = togglerDelegate.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(TogglerDelegate.DESTROYED, destroyed));
		}
	}

	protected void renderExpanded(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean expanded = togglerDelegate.getExpanded();

		if (expanded != null) {
			renderedAttributes.add(renderBoolean(TogglerDelegate.EXPANDED, expanded));
		}
	}

	protected void renderHeader(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.String header = togglerDelegate.getHeader();

		if (header != null) {
			renderedAttributes.add(renderString(TogglerDelegate.HEADER, header));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Boolean initialized = togglerDelegate.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(TogglerDelegate.INITIALIZED, initialized));
		}
	}

	protected void renderTransition(List<String> renderedAttributes, TogglerDelegate togglerDelegate) throws IOException {
		java.lang.Object transition = togglerDelegate.getTransition();

		if (transition != null) {
			renderedAttributes.add(renderObject(TogglerDelegate.TRANSITION, transition));
		}
	}

}