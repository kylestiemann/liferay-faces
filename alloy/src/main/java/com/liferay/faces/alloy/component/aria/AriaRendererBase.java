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

		if (aria.getAttributeNode() != null) {
			renderAttributeNode(renderedAttributes, aria);
		}
		
		if (aria.getAttributeValueFormat() != null) {
			renderAttributeValueFormat(renderedAttributes, aria);
		}
		
		if (aria.getAriaAttributes() != null) {
			renderAriaAttributes(renderedAttributes, aria);
		}
		
		if (aria.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, aria);
		}
		
		if (aria.getHost() != null) {
			renderHost(renderedAttributes, aria);
		}
		
		if (aria.getInitialized() != null) {
			renderInitialized(renderedAttributes, aria);
		}
		
		if (aria.getRoleName() != null) {
			renderRoleName(renderedAttributes, aria);
		}
		
		if (aria.getRoleNode() != null) {
			renderRoleNode(renderedAttributes, aria);
		}
		
		if (aria.getValidateW3C() != null) {
			renderValidateW3C(renderedAttributes, aria);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (aria.getAfterAttributeNodeChange() != null) {
			renderAfterAttributeNodeChange(renderedAfterEvents, aria);
		}
		
		if (aria.getAfterAttributeValueFormatChange() != null) {
			renderAfterAttributeValueFormatChange(renderedAfterEvents, aria);
		}
		
		if (aria.getAfterAttributesChange() != null) {
			renderAfterAttributesChange(renderedAfterEvents, aria);
		}
		
		if (aria.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, aria);
		}
		
		if (aria.getAfterHostChange() != null) {
			renderAfterHostChange(renderedAfterEvents, aria);
		}
		
		if (aria.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, aria);
		}
		
		if (aria.getAfterRoleNameChange() != null) {
			renderAfterRoleNameChange(renderedAfterEvents, aria);
		}
		
		if (aria.getAfterRoleNodeChange() != null) {
			renderAfterRoleNodeChange(renderedAfterEvents, aria);
		}
		
		if (aria.getAfterValidateW3CChange() != null) {
			renderAfterValidateW3CChange(renderedAfterEvents, aria);
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

		if (aria.getOnAttributeNodeChange() != null) {
			renderOnAttributeNodeChange(renderedOnEvents, aria);
		}
		
		if (aria.getOnAttributeValueFormatChange() != null) {
			renderOnAttributeValueFormatChange(renderedOnEvents, aria);
		}
		
		if (aria.getOnAttributesChange() != null) {
			renderOnAttributesChange(renderedOnEvents, aria);
		}
		
		if (aria.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, aria);
		}
		
		if (aria.getOnHostChange() != null) {
			renderOnHostChange(renderedOnEvents, aria);
		}
		
		if (aria.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, aria);
		}
		
		if (aria.getOnRoleNameChange() != null) {
			renderOnRoleNameChange(renderedOnEvents, aria);
		}
		
		if (aria.getOnRoleNodeChange() != null) {
			renderOnRoleNodeChange(renderedOnEvents, aria);
		}
		
		if (aria.getOnValidateW3CChange() != null) {
			renderOnValidateW3CChange(renderedOnEvents, aria);
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

	protected void renderAttributeNode(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String attributeNode = aria.getAttributeNode();
		renderedAttributes.add(renderString(Aria.ATTRIBUTE_NODE, attributeNode));
	}

	protected void renderAttributeValueFormat(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Object attributeValueFormat = aria.getAttributeValueFormat();
		renderedAttributes.add(renderString(Aria.ATTRIBUTE_VALUE_FORMAT, attributeValueFormat));
	}

	protected void renderAriaAttributes(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Object ariaAttributes = aria.getAriaAttributes();
		renderedAttributes.add(renderObject(Aria.ARIA_ATTRIBUTES, ariaAttributes));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Boolean destroyed = aria.getDestroyed();
		renderedAttributes.add(renderBoolean(Aria.DESTROYED, destroyed));
	}

	protected void renderHost(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Object host = aria.getHost();
		renderedAttributes.add(renderString(Aria.HOST, host));
	}

	protected void renderInitialized(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Boolean initialized = aria.getInitialized();
		renderedAttributes.add(renderBoolean(Aria.INITIALIZED, initialized));
	}

	protected void renderRoleName(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String roleName = aria.getRoleName();
		renderedAttributes.add(renderString(Aria.ROLE_NAME, roleName));
	}

	protected void renderRoleNode(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String roleNode = aria.getRoleNode();
		renderedAttributes.add(renderString(Aria.ROLE_NODE, roleNode));
	}

	protected void renderValidateW3C(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.Boolean validateW3C = aria.getValidateW3C();
		renderedAttributes.add(renderBoolean(Aria.VALIDATE_W3_C, validateW3C));
	}

	protected void renderAfterAttributeNodeChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterAttributeNodeChange = aria.getAfterAttributeNodeChange();
		renderedAttributes.add(renderString(Aria.AFTER_ATTRIBUTE_NODE_CHANGE, afterAttributeNodeChange));
	}

	protected void renderAfterAttributeValueFormatChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterAttributeValueFormatChange = aria.getAfterAttributeValueFormatChange();
		renderedAttributes.add(renderString(Aria.AFTER_ATTRIBUTE_VALUE_FORMAT_CHANGE, afterAttributeValueFormatChange));
	}

	protected void renderAfterAttributesChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterAttributesChange = aria.getAfterAttributesChange();
		renderedAttributes.add(renderString(Aria.AFTER_ATTRIBUTES_CHANGE, afterAttributesChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterDestroyedChange = aria.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Aria.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterHostChange = aria.getAfterHostChange();
		renderedAttributes.add(renderString(Aria.AFTER_HOST_CHANGE, afterHostChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterInitializedChange = aria.getAfterInitializedChange();
		renderedAttributes.add(renderString(Aria.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterRoleNameChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterRoleNameChange = aria.getAfterRoleNameChange();
		renderedAttributes.add(renderString(Aria.AFTER_ROLE_NAME_CHANGE, afterRoleNameChange));
	}

	protected void renderAfterRoleNodeChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterRoleNodeChange = aria.getAfterRoleNodeChange();
		renderedAttributes.add(renderString(Aria.AFTER_ROLE_NODE_CHANGE, afterRoleNodeChange));
	}

	protected void renderAfterValidateW3CChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String afterValidateW3CChange = aria.getAfterValidateW3CChange();
		renderedAttributes.add(renderString(Aria.AFTER_VALIDATE_W3_CCHANGE, afterValidateW3CChange));
	}

	protected void renderOnAttributeNodeChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onAttributeNodeChange = aria.getOnAttributeNodeChange();
		renderedAttributes.add(renderString(Aria.ON_ATTRIBUTE_NODE_CHANGE, onAttributeNodeChange));
	}

	protected void renderOnAttributeValueFormatChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onAttributeValueFormatChange = aria.getOnAttributeValueFormatChange();
		renderedAttributes.add(renderString(Aria.ON_ATTRIBUTE_VALUE_FORMAT_CHANGE, onAttributeValueFormatChange));
	}

	protected void renderOnAttributesChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onAttributesChange = aria.getOnAttributesChange();
		renderedAttributes.add(renderString(Aria.ON_ATTRIBUTES_CHANGE, onAttributesChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onDestroyedChange = aria.getOnDestroyedChange();
		renderedAttributes.add(renderString(Aria.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnHostChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onHostChange = aria.getOnHostChange();
		renderedAttributes.add(renderString(Aria.ON_HOST_CHANGE, onHostChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onInitializedChange = aria.getOnInitializedChange();
		renderedAttributes.add(renderString(Aria.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnRoleNameChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onRoleNameChange = aria.getOnRoleNameChange();
		renderedAttributes.add(renderString(Aria.ON_ROLE_NAME_CHANGE, onRoleNameChange));
	}

	protected void renderOnRoleNodeChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onRoleNodeChange = aria.getOnRoleNodeChange();
		renderedAttributes.add(renderString(Aria.ON_ROLE_NODE_CHANGE, onRoleNodeChange));
	}

	protected void renderOnValidateW3CChange(List<String> renderedAttributes, Aria aria) throws IOException {
		java.lang.String onValidateW3CChange = aria.getOnValidateW3CChange();
		renderedAttributes.add(renderString(Aria.ON_VALIDATE_W3_CCHANGE, onValidateW3CChange));
	}

}