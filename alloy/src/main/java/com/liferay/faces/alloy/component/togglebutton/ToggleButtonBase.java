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
package com.liferay.faces.alloy.component.togglebutton;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ToggleButtonBase extends javax.faces.component.UIPanel {

	private static final String CSS_CLASS = "cssClass";
	private static final String ICON = "icon";
	private static final String ICON_ALIGN = "iconAlign";
	private static final String ICON_ELEMENT = "iconElement";
	private static final String PRIMARY = "primary";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_ICON_CHANGE = "afterIconChange";
	private static final String AFTER_ICON_ALIGN_CHANGE = "afterIconAlignChange";
	private static final String AFTER_ICON_ELEMENT_CHANGE = "afterIconElementChange";
	private static final String AFTER_PRIMARY_CHANGE = "afterPrimaryChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_ICON_CHANGE = "onIconChange";
	private static final String ON_ICON_ALIGN_CHANGE = "onIconAlignChange";
	private static final String ON_ICON_ELEMENT_CHANGE = "onIconElementChange";
	private static final String ON_PRIMARY_CHANGE = "onPrimaryChange";

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Object getIcon() {
		return (java.lang.Object) getStateHelper().eval(ICON, null);
	}

	protected void setIcon(java.lang.Object icon) {
		getStateHelper().put(ICON, icon);
	}

	protected java.lang.String getIconAlign() {
		return (java.lang.String) getStateHelper().eval(ICON_ALIGN, null);
	}

	protected void setIconAlign(java.lang.String iconAlign) {
		getStateHelper().put(ICON_ALIGN, iconAlign);
	}

	protected java.lang.Object getIconElement() {
		return (java.lang.Object) getStateHelper().eval(ICON_ELEMENT, null);
	}

	protected void setIconElement(java.lang.Object iconElement) {
		getStateHelper().put(ICON_ELEMENT, iconElement);
	}

	protected java.lang.Boolean getPrimary() {
		return (java.lang.Boolean) getStateHelper().eval(PRIMARY, null);
	}

	protected void setPrimary(java.lang.Boolean primary) {
		getStateHelper().put(PRIMARY, primary);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterIconChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_CHANGE, null);
	}

	protected void setAfterIconChange(java.lang.String afterIconChange) {
		getStateHelper().put(AFTER_ICON_CHANGE, afterIconChange);
	}

	protected java.lang.String getAfterIconAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_ALIGN_CHANGE, null);
	}

	protected void setAfterIconAlignChange(java.lang.String afterIconAlignChange) {
		getStateHelper().put(AFTER_ICON_ALIGN_CHANGE, afterIconAlignChange);
	}

	protected java.lang.String getAfterIconElementChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_ELEMENT_CHANGE, null);
	}

	protected void setAfterIconElementChange(java.lang.String afterIconElementChange) {
		getStateHelper().put(AFTER_ICON_ELEMENT_CHANGE, afterIconElementChange);
	}

	protected java.lang.String getAfterPrimaryChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PRIMARY_CHANGE, null);
	}

	protected void setAfterPrimaryChange(java.lang.String afterPrimaryChange) {
		getStateHelper().put(AFTER_PRIMARY_CHANGE, afterPrimaryChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnIconChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_CHANGE, null);
	}

	protected void setOnIconChange(java.lang.String onIconChange) {
		getStateHelper().put(ON_ICON_CHANGE, onIconChange);
	}

	protected java.lang.String getOnIconAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_ALIGN_CHANGE, null);
	}

	protected void setOnIconAlignChange(java.lang.String onIconAlignChange) {
		getStateHelper().put(ON_ICON_ALIGN_CHANGE, onIconAlignChange);
	}

	protected java.lang.String getOnIconElementChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_ELEMENT_CHANGE, null);
	}

	protected void setOnIconElementChange(java.lang.String onIconElementChange) {
		getStateHelper().put(ON_ICON_ELEMENT_CHANGE, onIconElementChange);
	}

	protected java.lang.String getOnPrimaryChange() {
		return (java.lang.String) getStateHelper().eval(ON_PRIMARY_CHANGE, null);
	}

	protected void setOnPrimaryChange(java.lang.String onPrimaryChange) {
		getStateHelper().put(ON_PRIMARY_CHANGE, onPrimaryChange);
	}

}