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
package com.liferay.faces.alloy.component.datepickerpopover;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DatePickerPopoverBase extends javax.faces.component.UIPanel {

	public static final String AUTO_HIDE = "autoHide";
	public static final String POPOVER = "popover";
	public static final String POPOVER_CSS_CLASS = "popoverCssClass";
	public static final String AFTER_AUTO_HIDE_CHANGE = "afterAutoHideChange";
	public static final String AFTER_POPOVER_CHANGE = "afterPopoverChange";
	public static final String AFTER_POPOVER_CSS_CLASS_CHANGE = "afterPopoverCssClassChange";
	public static final String ON_AUTO_HIDE_CHANGE = "onAutoHideChange";
	public static final String ON_POPOVER_CHANGE = "onPopoverChange";
	public static final String ON_POPOVER_CSS_CLASS_CHANGE = "onPopoverCssClassChange";

	public java.lang.Boolean getAutoHide() {
		return (java.lang.Boolean) getStateHelper().eval(AUTO_HIDE, null);
	}

	public void setAutoHide(java.lang.Boolean autoHide) {
		getStateHelper().put(AUTO_HIDE, autoHide);
	}

	public java.lang.String getPopover() {
		return (java.lang.String) getStateHelper().eval(POPOVER, null);
	}

	public void setPopover(java.lang.String popover) {
		getStateHelper().put(POPOVER, popover);
	}

	public java.lang.String getPopoverCssClass() {
		return (java.lang.String) getStateHelper().eval(POPOVER_CSS_CLASS, null);
	}

	public void setPopoverCssClass(java.lang.String popoverCssClass) {
		getStateHelper().put(POPOVER_CSS_CLASS, popoverCssClass);
	}

	public java.lang.String getAfterAutoHideChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_AUTO_HIDE_CHANGE, null);
	}

	public void setAfterAutoHideChange(java.lang.String afterAutoHideChange) {
		getStateHelper().put(AFTER_AUTO_HIDE_CHANGE, afterAutoHideChange);
	}

	public java.lang.String getAfterPopoverChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POPOVER_CHANGE, null);
	}

	public void setAfterPopoverChange(java.lang.String afterPopoverChange) {
		getStateHelper().put(AFTER_POPOVER_CHANGE, afterPopoverChange);
	}

	public java.lang.String getAfterPopoverCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POPOVER_CSS_CLASS_CHANGE, null);
	}

	public void setAfterPopoverCssClassChange(java.lang.String afterPopoverCssClassChange) {
		getStateHelper().put(AFTER_POPOVER_CSS_CLASS_CHANGE, afterPopoverCssClassChange);
	}

	public java.lang.String getOnAutoHideChange() {
		return (java.lang.String) getStateHelper().eval(ON_AUTO_HIDE_CHANGE, null);
	}

	public void setOnAutoHideChange(java.lang.String onAutoHideChange) {
		getStateHelper().put(ON_AUTO_HIDE_CHANGE, onAutoHideChange);
	}

	public java.lang.String getOnPopoverChange() {
		return (java.lang.String) getStateHelper().eval(ON_POPOVER_CHANGE, null);
	}

	public void setOnPopoverChange(java.lang.String onPopoverChange) {
		getStateHelper().put(ON_POPOVER_CHANGE, onPopoverChange);
	}

	public java.lang.String getOnPopoverCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_POPOVER_CSS_CLASS_CHANGE, null);
	}

	public void setOnPopoverCssClassChange(java.lang.String onPopoverCssClassChange) {
		getStateHelper().put(ON_POPOVER_CSS_CLASS_CHANGE, onPopoverCssClassChange);
	}

}