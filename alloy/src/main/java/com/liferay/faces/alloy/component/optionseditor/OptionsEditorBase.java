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
package com.liferay.faces.alloy.component.optionseditor;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class OptionsEditorBase extends javax.faces.component.UIPanel {

	private static final String EDITABLE = "editable";
	private static final String AFTER_EDITABLE_CHANGE = "afterEditableChange";
	private static final String ON_EDITABLE_CHANGE = "onEditableChange";

	protected java.lang.Object getEditable() {
		return (java.lang.Object) getStateHelper().eval(EDITABLE, null);
	}

	protected void setEditable(java.lang.Object editable) {
		getStateHelper().put(EDITABLE, editable);
	}

	protected java.lang.String getAfterEditableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EDITABLE_CHANGE, null);
	}

	protected void setAfterEditableChange(java.lang.String afterEditableChange) {
		getStateHelper().put(AFTER_EDITABLE_CHANGE, afterEditableChange);
	}

	protected java.lang.String getOnEditableChange() {
		return (java.lang.String) getStateHelper().eval(ON_EDITABLE_CHANGE, null);
	}

	protected void setOnEditableChange(java.lang.String onEditableChange) {
		getStateHelper().put(ON_EDITABLE_CHANGE, onEditableChange);
	}

}