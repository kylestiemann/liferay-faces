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
package com.liferay.faces.alloy.component.widgettoolbars;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class WidgetToolbarsBase extends javax.faces.component.UIPanel {

	private static final String TOOLBAR_POSITION = "toolbarPosition";
	private static final String TOOLBARS = "toolbars";
	private static final String AFTER_TOOLBAR_POSITION_CHANGE = "afterToolbarPositionChange";
	private static final String AFTER_TOOLBARS_CHANGE = "afterToolbarsChange";
	private static final String ON_TOOLBAR_POSITION_CHANGE = "onToolbarPositionChange";
	private static final String ON_TOOLBARS_CHANGE = "onToolbarsChange";

	protected java.lang.Object getToolbarPosition() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR_POSITION, null);
	}

	protected void setToolbarPosition(java.lang.Object toolbarPosition) {
		getStateHelper().put(TOOLBAR_POSITION, toolbarPosition);
	}

	protected java.lang.Object getToolbars() {
		return (java.lang.Object) getStateHelper().eval(TOOLBARS, null);
	}

	protected void setToolbars(java.lang.Object toolbars) {
		getStateHelper().put(TOOLBARS, toolbars);
	}

	protected java.lang.String getAfterToolbarPositionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_POSITION_CHANGE, null);
	}

	protected void setAfterToolbarPositionChange(java.lang.String afterToolbarPositionChange) {
		getStateHelper().put(AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange);
	}

	protected java.lang.String getAfterToolbarsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBARS_CHANGE, null);
	}

	protected void setAfterToolbarsChange(java.lang.String afterToolbarsChange) {
		getStateHelper().put(AFTER_TOOLBARS_CHANGE, afterToolbarsChange);
	}

	protected java.lang.String getOnToolbarPositionChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_POSITION_CHANGE, null);
	}

	protected void setOnToolbarPositionChange(java.lang.String onToolbarPositionChange) {
		getStateHelper().put(ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange);
	}

	protected java.lang.String getOnToolbarsChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBARS_CHANGE, null);
	}

	protected void setOnToolbarsChange(java.lang.String onToolbarsChange) {
		getStateHelper().put(ON_TOOLBARS_CHANGE, onToolbarsChange);
	}

}