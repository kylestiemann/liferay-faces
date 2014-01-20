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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAttributeNodeChange(renderedAfterEvents, aria);
		renderAfterAttributeValueFormatChange(renderedAfterEvents, aria);
		renderAfterAttributesChange(renderedAfterEvents, aria);
		renderAfterDestroyedChange(renderedAfterEvents, aria);
		renderAfterHostChange(renderedAfterEvents, aria);
		renderAfterInitializedChange(renderedAfterEvents, aria);
		renderAfterRoleNameChange(renderedAfterEvents, aria);
		renderAfterRoleNodeChange(renderedAfterEvents, aria);
		renderAfterValidateW3CChange(renderedAfterEvents, aria);

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

		renderOnAttributeNodeChange(renderedOnEvents, aria);
		renderOnAttributeValueFormatChange(renderedOnEvents, aria);
		renderOnAttributesChange(renderedOnEvents, aria);
		renderOnDestroyedChange(renderedOnEvents, aria);
		renderOnHostChange(renderedOnEvents, aria);
		renderOnInitializedChange(renderedOnEvents, aria);
		renderOnRoleNameChange(renderedOnEvents, aria);
		renderOnRoleNodeChange(renderedOnEvents, aria);
		renderOnValidateW3CChange(renderedOnEvents, aria);

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

	protected void renderAfterAttributeNodeChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterAttributeNodeChange = aria.getAfterAttributeNodeChange();

		if (afterAttributeNodeChange != null) {
			renderedAttributes.add(renderString(Aria.AFTER_ATTRIBUTE_NODE_CHANGE, afterAttributeNodeChange));
		}
	}

	protected void renderAfterAttributeValueFormatChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterAttributeValueFormatChange = aria.getAfterAttributeValueFormatChange();

		if (afterAttributeValueFormatChange != null) {
			renderedAttributes.add(renderString(Aria.AFTER_ATTRIBUTE_VALUE_FORMAT_CHANGE, afterAttributeValueFormatChange));
		}
	}

	protected void renderAfterAttributesChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterAttributesChange = aria.getAfterAttributesChange();

		if (afterAttributesChange != null) {
			renderedAttributes.add(renderString(Aria.AFTER_ATTRIBUTES_CHANGE, afterAttributesChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterDestroyedChange = aria.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Aria.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterHostChange = aria.getAfterHostChange();

		if (afterHostChange != null) {
			renderedAttributes.add(renderString(Aria.AFTER_HOST_CHANGE, afterHostChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterInitializedChange = aria.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Aria.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterRoleNameChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterRoleNameChange = aria.getAfterRoleNameChange();

		if (afterRoleNameChange != null) {
			renderedAttributes.add(renderString(Aria.AFTER_ROLE_NAME_CHANGE, afterRoleNameChange));
		}
	}

	protected void renderAfterRoleNodeChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterRoleNodeChange = aria.getAfterRoleNodeChange();

		if (afterRoleNodeChange != null) {
			renderedAttributes.add(renderString(Aria.AFTER_ROLE_NODE_CHANGE, afterRoleNodeChange));
		}
	}

	protected void renderAfterValidateW3CChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterValidateW3CChange = aria.getAfterValidateW3CChange();

		if (afterValidateW3CChange != null) {
			renderedAttributes.add(renderString(Aria.AFTER_VALIDATE_W3_CCHANGE, afterValidateW3CChange));
		}
	}

	protected void renderOnAttributeNodeChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onAttributeNodeChange = aria.getOnAttributeNodeChange();

		if (onAttributeNodeChange != null) {
			renderedAttributes.add(renderString(Aria.ON_ATTRIBUTE_NODE_CHANGE, onAttributeNodeChange));
		}
	}

	protected void renderOnAttributeValueFormatChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onAttributeValueFormatChange = aria.getOnAttributeValueFormatChange();

		if (onAttributeValueFormatChange != null) {
			renderedAttributes.add(renderString(Aria.ON_ATTRIBUTE_VALUE_FORMAT_CHANGE, onAttributeValueFormatChange));
		}
	}

	protected void renderOnAttributesChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onAttributesChange = aria.getOnAttributesChange();

		if (onAttributesChange != null) {
			renderedAttributes.add(renderString(Aria.ON_ATTRIBUTES_CHANGE, onAttributesChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onDestroyedChange = aria.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Aria.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnHostChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onHostChange = aria.getOnHostChange();

		if (onHostChange != null) {
			renderedAttributes.add(renderString(Aria.ON_HOST_CHANGE, onHostChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onInitializedChange = aria.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Aria.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnRoleNameChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onRoleNameChange = aria.getOnRoleNameChange();

		if (onRoleNameChange != null) {
			renderedAttributes.add(renderString(Aria.ON_ROLE_NAME_CHANGE, onRoleNameChange));
		}
	}

	protected void renderOnRoleNodeChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onRoleNodeChange = aria.getOnRoleNodeChange();

		if (onRoleNodeChange != null) {
			renderedAttributes.add(renderString(Aria.ON_ROLE_NODE_CHANGE, onRoleNodeChange));
		}
	}

	protected void renderOnValidateW3CChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onValidateW3CChange = aria.getOnValidateW3CChange();

		if (onValidateW3CChange != null) {
			renderedAttributes.add(renderString(Aria.ON_VALIDATE_W3_CCHANGE, onValidateW3CChange));
		}
	}

}