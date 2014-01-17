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
package com.liferay.faces.alloy.component.aria;

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
public abstract class AriaRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-aria";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Aria aria = (Aria) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var aria = new A.Aria");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAttributeNode(renderedAttributes, aria);
		renderAttributeValueFormat(renderedAttributes, aria);
		renderAriaAttributes(renderedAttributes, aria);
		renderDestroyed(renderedAttributes, aria);
		renderHost(renderedAttributes, aria);
		renderInitialized(renderedAttributes, aria);
		renderRoleName(renderedAttributes, aria);
		renderRoleNode(renderedAttributes, aria);
		renderValidateW3C(renderedAttributes, aria);

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

	protected void renderAttributeNode(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String attributeNode = aria.getAttributeNode();

		if (attributeNode != null) {
			renderedAttributes.add(renderString(Aria.ATTRIBUTE_NODE, attributeNode));
		}
	}

	protected void renderAttributeValueFormat(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Object attributeValueFormat = aria.getAttributeValueFormat();

		if (attributeValueFormat != null) {
			renderedAttributes.add(renderString(Aria.ATTRIBUTE_VALUE_FORMAT, attributeValueFormat));
		}
	}

	protected void renderAriaAttributes(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Object ariaAttributes = aria.getAriaAttributes();

		if (ariaAttributes != null) {
			renderedAttributes.add(renderObject(Aria.ARIA_ATTRIBUTES, ariaAttributes));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Boolean destroyed = aria.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Aria.DESTROYED, destroyed));
		}
	}

	protected void renderHost(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Object host = aria.getHost();

		if (host != null) {
			renderedAttributes.add(renderString(Aria.HOST, host));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Boolean initialized = aria.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Aria.INITIALIZED, initialized));
		}
	}

	protected void renderRoleName(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String roleName = aria.getRoleName();

		if (roleName != null) {
			renderedAttributes.add(renderString(Aria.ROLE_NAME, roleName));
		}
	}

	protected void renderRoleNode(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String roleNode = aria.getRoleNode();

		if (roleNode != null) {
			renderedAttributes.add(renderString(Aria.ROLE_NODE, roleNode));
		}
	}

	protected void renderValidateW3C(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Boolean validateW3C = aria.getValidateW3C();

		if (validateW3C != null) {
			renderedAttributes.add(renderBoolean(Aria.VALIDATE_W3_C, validateW3C));
		}
	}

}