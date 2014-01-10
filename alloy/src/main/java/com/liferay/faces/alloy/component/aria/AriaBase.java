/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AriaBase extends javax.faces.component.UIPanel {

	private static final String ATTRIBUTE_NODE = "attributeNode";
	private static final String ATTRIBUTE_VALUE_FORMAT = "attributeValueFormat";
	private static final String ARIA_ATTRIBUTES = "ariaAttributes";
	private static final String ROLE_NAME = "roleName";
	private static final String ROLE_NODE = "roleNode";
	private static final String VALIDATE_W3_C = "validateW3C";
	private static final String AFTER_ATTRIBUTE_NODE_CHANGE = "afterAttributeNodeChange";
	private static final String AFTER_ATTRIBUTE_VALUE_FORMAT_CHANGE = "afterAttributeValueFormatChange";
	private static final String AFTER_ATTRIBUTES_CHANGE = "afterAttributesChange";
	private static final String AFTER_ROLE_NAME_CHANGE = "afterRoleNameChange";
	private static final String AFTER_ROLE_NODE_CHANGE = "afterRoleNodeChange";
	private static final String AFTER_VALIDATE_W3_CCHANGE = "afterValidateW3CChange";
	private static final String ON_ATTRIBUTE_NODE_CHANGE = "onAttributeNodeChange";
	private static final String ON_ATTRIBUTE_VALUE_FORMAT_CHANGE = "onAttributeValueFormatChange";
	private static final String ON_ATTRIBUTES_CHANGE = "onAttributesChange";
	private static final String ON_ROLE_NAME_CHANGE = "onRoleNameChange";
	private static final String ON_ROLE_NODE_CHANGE = "onRoleNodeChange";
	private static final String ON_VALIDATE_W3_CCHANGE = "onValidateW3CChange";

	protected java.lang.Object getAttributeNode() {
		return (java.lang.Object) getStateHelper().eval(ATTRIBUTE_NODE, null);
	}

	protected void setAttributeNode(java.lang.Object attributeNode) {
		getStateHelper().put(ATTRIBUTE_NODE, attributeNode);
	}

	protected java.lang.Object getAttributeValueFormat() {
		return (java.lang.Object) getStateHelper().eval(ATTRIBUTE_VALUE_FORMAT, null);
	}

	protected void setAttributeValueFormat(java.lang.Object attributeValueFormat) {
		getStateHelper().put(ATTRIBUTE_VALUE_FORMAT, attributeValueFormat);
	}

	protected java.lang.Object getAriaAttributes() {
		return (java.lang.Object) getStateHelper().eval(ARIA_ATTRIBUTES, null);
	}

	protected void setAriaAttributes(java.lang.Object ariaAttributes) {
		getStateHelper().put(ARIA_ATTRIBUTES, ariaAttributes);
	}

	protected java.lang.String getRoleName() {
		return (java.lang.String) getStateHelper().eval(ROLE_NAME, null);
	}

	protected void setRoleName(java.lang.String roleName) {
		getStateHelper().put(ROLE_NAME, roleName);
	}

	protected java.lang.Object getRoleNode() {
		return (java.lang.Object) getStateHelper().eval(ROLE_NODE, null);
	}

	protected void setRoleNode(java.lang.Object roleNode) {
		getStateHelper().put(ROLE_NODE, roleNode);
	}

	protected java.lang.Boolean getValidateW3C() {
		return (java.lang.Boolean) getStateHelper().eval(VALIDATE_W3_C, null);
	}

	protected void setValidateW3C(java.lang.Boolean validateW3C) {
		getStateHelper().put(VALIDATE_W3_C, validateW3C);
	}

	protected java.lang.String getAfterAttributeNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ATTRIBUTE_NODE_CHANGE, null);
	}

	protected void setAfterAttributeNodeChange(java.lang.String afterAttributeNodeChange) {
		getStateHelper().put(AFTER_ATTRIBUTE_NODE_CHANGE, afterAttributeNodeChange);
	}

	protected java.lang.String getAfterAttributeValueFormatChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ATTRIBUTE_VALUE_FORMAT_CHANGE, null);
	}

	protected void setAfterAttributeValueFormatChange(java.lang.String afterAttributeValueFormatChange) {
		getStateHelper().put(AFTER_ATTRIBUTE_VALUE_FORMAT_CHANGE, afterAttributeValueFormatChange);
	}

	protected java.lang.String getAfterAttributesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ATTRIBUTES_CHANGE, null);
	}

	protected void setAfterAttributesChange(java.lang.String afterAttributesChange) {
		getStateHelper().put(AFTER_ATTRIBUTES_CHANGE, afterAttributesChange);
	}

	protected java.lang.String getAfterRoleNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ROLE_NAME_CHANGE, null);
	}

	protected void setAfterRoleNameChange(java.lang.String afterRoleNameChange) {
		getStateHelper().put(AFTER_ROLE_NAME_CHANGE, afterRoleNameChange);
	}

	protected java.lang.String getAfterRoleNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ROLE_NODE_CHANGE, null);
	}

	protected void setAfterRoleNodeChange(java.lang.String afterRoleNodeChange) {
		getStateHelper().put(AFTER_ROLE_NODE_CHANGE, afterRoleNodeChange);
	}

	protected java.lang.String getAfterValidateW3CChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALIDATE_W3_CCHANGE, null);
	}

	protected void setAfterValidateW3CChange(java.lang.String afterValidateW3CChange) {
		getStateHelper().put(AFTER_VALIDATE_W3_CCHANGE, afterValidateW3CChange);
	}

	protected java.lang.String getOnAttributeNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_ATTRIBUTE_NODE_CHANGE, null);
	}

	protected void setOnAttributeNodeChange(java.lang.String onAttributeNodeChange) {
		getStateHelper().put(ON_ATTRIBUTE_NODE_CHANGE, onAttributeNodeChange);
	}

	protected java.lang.String getOnAttributeValueFormatChange() {
		return (java.lang.String) getStateHelper().eval(ON_ATTRIBUTE_VALUE_FORMAT_CHANGE, null);
	}

	protected void setOnAttributeValueFormatChange(java.lang.String onAttributeValueFormatChange) {
		getStateHelper().put(ON_ATTRIBUTE_VALUE_FORMAT_CHANGE, onAttributeValueFormatChange);
	}

	protected java.lang.String getOnAttributesChange() {
		return (java.lang.String) getStateHelper().eval(ON_ATTRIBUTES_CHANGE, null);
	}

	protected void setOnAttributesChange(java.lang.String onAttributesChange) {
		getStateHelper().put(ON_ATTRIBUTES_CHANGE, onAttributesChange);
	}

	protected java.lang.String getOnRoleNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_ROLE_NAME_CHANGE, null);
	}

	protected void setOnRoleNameChange(java.lang.String onRoleNameChange) {
		getStateHelper().put(ON_ROLE_NAME_CHANGE, onRoleNameChange);
	}

	protected java.lang.String getOnRoleNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_ROLE_NODE_CHANGE, null);
	}

	protected void setOnRoleNodeChange(java.lang.String onRoleNodeChange) {
		getStateHelper().put(ON_ROLE_NODE_CHANGE, onRoleNodeChange);
	}

	protected java.lang.String getOnValidateW3CChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALIDATE_W3_CCHANGE, null);
	}

	protected void setOnValidateW3CChange(java.lang.String onValidateW3CChange) {
		getStateHelper().put(ON_VALIDATE_W3_CCHANGE, onValidateW3CChange);
	}

}