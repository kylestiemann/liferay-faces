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

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class AriaBase extends javax.faces.component.UIPanel {

	public static final String ATTRIBUTE_NODE = "attributeNode";
	public static final String ATTRIBUTE_VALUE_FORMAT = "attributeValueFormat";
	public static final String ARIA_ATTRIBUTES = "attributes";
	public static final String DESTROYED = "destroyed";
	public static final String HOST = "host";
	public static final String INITIALIZED = "initialized";
	public static final String ROLE_NAME = "roleName";
	public static final String ROLE_NODE = "roleNode";
	public static final String VALIDATE_W3_C = "validateW3C";
	public static final String AFTER_ATTRIBUTE_NODE_CHANGE = "afterAttributeNodeChange";
	public static final String AFTER_ATTRIBUTE_VALUE_FORMAT_CHANGE = "afterAttributeValueFormatChange";
	public static final String AFTER_ATTRIBUTES_CHANGE = "afterAttributesChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_HOST_CHANGE = "afterHostChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_ROLE_NAME_CHANGE = "afterRoleNameChange";
	public static final String AFTER_ROLE_NODE_CHANGE = "afterRoleNodeChange";
	public static final String AFTER_VALIDATE_W3_CCHANGE = "afterValidateW3CChange";
	public static final String ON_ATTRIBUTE_NODE_CHANGE = "onAttributeNodeChange";
	public static final String ON_ATTRIBUTE_VALUE_FORMAT_CHANGE = "onAttributeValueFormatChange";
	public static final String ON_ATTRIBUTES_CHANGE = "onAttributesChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_HOST_CHANGE = "onHostChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_ROLE_NAME_CHANGE = "onRoleNameChange";
	public static final String ON_ROLE_NODE_CHANGE = "onRoleNodeChange";
	public static final String ON_VALIDATE_W3_CCHANGE = "onValidateW3CChange";

	public java.lang.String getAttributeNode() {
		return (java.lang.String) getStateHelper().eval(ATTRIBUTE_NODE, null);
	}

	public void setAttributeNode(java.lang.String attributeNode) {
		getStateHelper().put(ATTRIBUTE_NODE, attributeNode);
	}

	public java.lang.Object getAttributeValueFormat() {
		return (java.lang.Object) getStateHelper().eval(ATTRIBUTE_VALUE_FORMAT, null);
	}

	public void setAttributeValueFormat(java.lang.Object attributeValueFormat) {
		getStateHelper().put(ATTRIBUTE_VALUE_FORMAT, attributeValueFormat);
	}

	public java.lang.Object getAriaAttributes() {
		return (java.lang.Object) getStateHelper().eval(ARIA_ATTRIBUTES, null);
	}

	public void setAriaAttributes(java.lang.Object ariaAttributes) {
		getStateHelper().put(ARIA_ATTRIBUTES, ariaAttributes);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Object getHost() {
		return (java.lang.Object) getStateHelper().eval(HOST, null);
	}

	public void setHost(java.lang.Object host) {
		getStateHelper().put(HOST, host);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getRoleName() {
		return (java.lang.String) getStateHelper().eval(ROLE_NAME, null);
	}

	public void setRoleName(java.lang.String roleName) {
		getStateHelper().put(ROLE_NAME, roleName);
	}

	public java.lang.String getRoleNode() {
		return (java.lang.String) getStateHelper().eval(ROLE_NODE, null);
	}

	public void setRoleNode(java.lang.String roleNode) {
		getStateHelper().put(ROLE_NODE, roleNode);
	}

	public java.lang.Boolean getValidateW3C() {
		return (java.lang.Boolean) getStateHelper().eval(VALIDATE_W3_C, null);
	}

	public void setValidateW3C(java.lang.Boolean validateW3C) {
		getStateHelper().put(VALIDATE_W3_C, validateW3C);
	}

	public java.lang.String getAfterAttributeNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ATTRIBUTE_NODE_CHANGE, null);
	}

	public void setAfterAttributeNodeChange(java.lang.String afterAttributeNodeChange) {
		getStateHelper().put(AFTER_ATTRIBUTE_NODE_CHANGE, afterAttributeNodeChange);
	}

	public java.lang.String getAfterAttributeValueFormatChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ATTRIBUTE_VALUE_FORMAT_CHANGE, null);
	}

	public void setAfterAttributeValueFormatChange(java.lang.String afterAttributeValueFormatChange) {
		getStateHelper().put(AFTER_ATTRIBUTE_VALUE_FORMAT_CHANGE, afterAttributeValueFormatChange);
	}

	public java.lang.String getAfterAttributesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ATTRIBUTES_CHANGE, null);
	}

	public void setAfterAttributesChange(java.lang.String afterAttributesChange) {
		getStateHelper().put(AFTER_ATTRIBUTES_CHANGE, afterAttributesChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterHostChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HOST_CHANGE, null);
	}

	public void setAfterHostChange(java.lang.String afterHostChange) {
		getStateHelper().put(AFTER_HOST_CHANGE, afterHostChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterRoleNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ROLE_NAME_CHANGE, null);
	}

	public void setAfterRoleNameChange(java.lang.String afterRoleNameChange) {
		getStateHelper().put(AFTER_ROLE_NAME_CHANGE, afterRoleNameChange);
	}

	public java.lang.String getAfterRoleNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ROLE_NODE_CHANGE, null);
	}

	public void setAfterRoleNodeChange(java.lang.String afterRoleNodeChange) {
		getStateHelper().put(AFTER_ROLE_NODE_CHANGE, afterRoleNodeChange);
	}

	public java.lang.String getAfterValidateW3CChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALIDATE_W3_CCHANGE, null);
	}

	public void setAfterValidateW3CChange(java.lang.String afterValidateW3CChange) {
		getStateHelper().put(AFTER_VALIDATE_W3_CCHANGE, afterValidateW3CChange);
	}

	public java.lang.String getOnAttributeNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_ATTRIBUTE_NODE_CHANGE, null);
	}

	public void setOnAttributeNodeChange(java.lang.String onAttributeNodeChange) {
		getStateHelper().put(ON_ATTRIBUTE_NODE_CHANGE, onAttributeNodeChange);
	}

	public java.lang.String getOnAttributeValueFormatChange() {
		return (java.lang.String) getStateHelper().eval(ON_ATTRIBUTE_VALUE_FORMAT_CHANGE, null);
	}

	public void setOnAttributeValueFormatChange(java.lang.String onAttributeValueFormatChange) {
		getStateHelper().put(ON_ATTRIBUTE_VALUE_FORMAT_CHANGE, onAttributeValueFormatChange);
	}

	public java.lang.String getOnAttributesChange() {
		return (java.lang.String) getStateHelper().eval(ON_ATTRIBUTES_CHANGE, null);
	}

	public void setOnAttributesChange(java.lang.String onAttributesChange) {
		getStateHelper().put(ON_ATTRIBUTES_CHANGE, onAttributesChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnHostChange() {
		return (java.lang.String) getStateHelper().eval(ON_HOST_CHANGE, null);
	}

	public void setOnHostChange(java.lang.String onHostChange) {
		getStateHelper().put(ON_HOST_CHANGE, onHostChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnRoleNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_ROLE_NAME_CHANGE, null);
	}

	public void setOnRoleNameChange(java.lang.String onRoleNameChange) {
		getStateHelper().put(ON_ROLE_NAME_CHANGE, onRoleNameChange);
	}

	public java.lang.String getOnRoleNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_ROLE_NODE_CHANGE, null);
	}

	public void setOnRoleNodeChange(java.lang.String onRoleNodeChange) {
		getStateHelper().put(ON_ROLE_NODE_CHANGE, onRoleNodeChange);
	}

	public java.lang.String getOnValidateW3CChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALIDATE_W3_CCHANGE, null);
	}

	public void setOnValidateW3CChange(java.lang.String onValidateW3CChange) {
		getStateHelper().put(ON_VALIDATE_W3_CCHANGE, onValidateW3CChange);
	}

}