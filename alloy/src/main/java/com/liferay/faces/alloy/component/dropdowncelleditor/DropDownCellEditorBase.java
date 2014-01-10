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
package com.liferay.faces.alloy.component.dropdowncelleditor;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DropDownCellEditorBase extends javax.faces.component.UIPanel {

	private static final String MULTIPLE = "multiple";
	private static final String AFTER_MULTIPLE_CHANGE = "afterMultipleChange";
	private static final String ON_MULTIPLE_CHANGE = "onMultipleChange";

	protected java.lang.Boolean getMultiple() {
		return (java.lang.Boolean) getStateHelper().eval(MULTIPLE, null);
	}

	protected void setMultiple(java.lang.Boolean multiple) {
		getStateHelper().put(MULTIPLE, multiple);
	}

	protected java.lang.String getAfterMultipleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MULTIPLE_CHANGE, null);
	}

	protected void setAfterMultipleChange(java.lang.String afterMultipleChange) {
		getStateHelper().put(AFTER_MULTIPLE_CHANGE, afterMultipleChange);
	}

	protected java.lang.String getOnMultipleChange() {
		return (java.lang.String) getStateHelper().eval(ON_MULTIPLE_CHANGE, null);
	}

	protected void setOnMultipleChange(java.lang.String onMultipleChange) {
		getStateHelper().put(ON_MULTIPLE_CHANGE, onMultipleChange);
	}

}