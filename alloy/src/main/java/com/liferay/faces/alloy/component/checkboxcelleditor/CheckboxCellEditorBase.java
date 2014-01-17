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
package com.liferay.faces.alloy.component.checkboxcelleditor;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class CheckboxCellEditorBase extends javax.faces.component.UIPanel {

	public static final String SELECTED_ATTR_NAME = "selectedAttrName";
	public static final String AFTER_SELECTED_ATTR_NAME_CHANGE = "afterSelectedAttrNameChange";
	public static final String ON_SELECTED_ATTR_NAME_CHANGE = "onSelectedAttrNameChange";

	public java.lang.String getSelectedAttrName() {
		return (java.lang.String) getStateHelper().eval(SELECTED_ATTR_NAME, null);
	}

	public void setSelectedAttrName(java.lang.String selectedAttrName) {
		getStateHelper().put(SELECTED_ATTR_NAME, selectedAttrName);
	}

	public java.lang.String getAfterSelectedAttrNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_ATTR_NAME_CHANGE, null);
	}

	public void setAfterSelectedAttrNameChange(java.lang.String afterSelectedAttrNameChange) {
		getStateHelper().put(AFTER_SELECTED_ATTR_NAME_CHANGE, afterSelectedAttrNameChange);
	}

	public java.lang.String getOnSelectedAttrNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_ATTR_NAME_CHANGE, null);
	}

	public void setOnSelectedAttrNameChange(java.lang.String onSelectedAttrNameChange) {
		getStateHelper().put(ON_SELECTED_ATTR_NAME_CHANGE, onSelectedAttrNameChange);
	}

}