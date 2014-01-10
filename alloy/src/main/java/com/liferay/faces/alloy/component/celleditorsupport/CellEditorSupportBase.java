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
package com.liferay.faces.alloy.component.celleditorsupport;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class CellEditorSupportBase extends javax.faces.component.UIPanel {

	private static final String EDIT_EVENT = "editEvent";
	private static final String AFTER_EDIT_EVENT_CHANGE = "afterEditEventChange";
	private static final String ON_EDIT_EVENT_CHANGE = "onEditEventChange";

	protected java.lang.String getEditEvent() {
		return (java.lang.String) getStateHelper().eval(EDIT_EVENT, null);
	}

	protected void setEditEvent(java.lang.String editEvent) {
		getStateHelper().put(EDIT_EVENT, editEvent);
	}

	protected java.lang.String getAfterEditEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EDIT_EVENT_CHANGE, null);
	}

	protected void setAfterEditEventChange(java.lang.String afterEditEventChange) {
		getStateHelper().put(AFTER_EDIT_EVENT_CHANGE, afterEditEventChange);
	}

	protected java.lang.String getOnEditEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_EDIT_EVENT_CHANGE, null);
	}

	protected void setOnEditEventChange(java.lang.String onEditEventChange) {
		getStateHelper().put(ON_EDIT_EVENT_CHANGE, onEditEventChange);
	}

}