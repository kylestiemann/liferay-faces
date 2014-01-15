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
package com.liferay.faces.alloy.component.fieldsupport;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class FieldSupportBase extends javax.faces.component.UIPanel {

	private static final String FIELDS = "fields";
	private static final String MAX_FIELDS = "maxFields";
	private static final String AFTER_FIELDS_CHANGE = "afterFieldsChange";
	private static final String AFTER_MAX_FIELDS_CHANGE = "afterMaxFieldsChange";
	private static final String ON_FIELDS_CHANGE = "onFieldsChange";
	private static final String ON_MAX_FIELDS_CHANGE = "onMaxFieldsChange";

	public java.lang.Object getFields() {
		return (java.lang.Object) getStateHelper().eval(FIELDS, null);
	}

	public void setFields(java.lang.Object fields) {
		getStateHelper().put(FIELDS, fields);
	}

	public java.lang.Object getMaxFields() {
		return (java.lang.Object) getStateHelper().eval(MAX_FIELDS, null);
	}

	public void setMaxFields(java.lang.Object maxFields) {
		getStateHelper().put(MAX_FIELDS, maxFields);
	}

	public java.lang.String getAfterFieldsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELDS_CHANGE, null);
	}

	public void setAfterFieldsChange(java.lang.String afterFieldsChange) {
		getStateHelper().put(AFTER_FIELDS_CHANGE, afterFieldsChange);
	}

	public java.lang.String getAfterMaxFieldsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_FIELDS_CHANGE, null);
	}

	public void setAfterMaxFieldsChange(java.lang.String afterMaxFieldsChange) {
		getStateHelper().put(AFTER_MAX_FIELDS_CHANGE, afterMaxFieldsChange);
	}

	public java.lang.String getOnFieldsChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELDS_CHANGE, null);
	}

	public void setOnFieldsChange(java.lang.String onFieldsChange) {
		getStateHelper().put(ON_FIELDS_CHANGE, onFieldsChange);
	}

	public java.lang.String getOnMaxFieldsChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_FIELDS_CHANGE, null);
	}

	public void setOnMaxFieldsChange(java.lang.String onMaxFieldsChange) {
		getStateHelper().put(ON_MAX_FIELDS_CHANGE, onMaxFieldsChange);
	}

}