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
package com.liferay.faces.alloy.component.togglebutton;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class ToggleButtonBase extends javax.faces.component.UIPanel {

	public static final String CSS_CLASS = "cssClass";
	public static final String ICON = "icon";
	public static final String ICON_ALIGN = "iconAlign";
	public static final String ICON_ELEMENT = "iconElement";
	public static final String PRIMARY = "primary";
	public static final String TYPE = "type";
	public static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	public static final String AFTER_ICON_CHANGE = "afterIconChange";
	public static final String AFTER_ICON_ALIGN_CHANGE = "afterIconAlignChange";
	public static final String AFTER_ICON_ELEMENT_CHANGE = "afterIconElementChange";
	public static final String AFTER_PRIMARY_CHANGE = "afterPrimaryChange";
	public static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	public static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	public static final String ON_ICON_CHANGE = "onIconChange";
	public static final String ON_ICON_ALIGN_CHANGE = "onIconAlignChange";
	public static final String ON_ICON_ELEMENT_CHANGE = "onIconElementChange";
	public static final String ON_PRIMARY_CHANGE = "onPrimaryChange";
	public static final String ON_TYPE_CHANGE = "onTypeChange";

	public java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	public void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	public java.lang.String getIcon() {
		return (java.lang.String) getStateHelper().eval(ICON, null);
	}

	public void setIcon(java.lang.String icon) {
		getStateHelper().put(ICON, icon);
	}

	public java.lang.String getIconAlign() {
		return (java.lang.String) getStateHelper().eval(ICON_ALIGN, null);
	}

	public void setIconAlign(java.lang.String iconAlign) {
		getStateHelper().put(ICON_ALIGN, iconAlign);
	}

	public java.lang.String getIconElement() {
		return (java.lang.String) getStateHelper().eval(ICON_ELEMENT, null);
	}

	public void setIconElement(java.lang.String iconElement) {
		getStateHelper().put(ICON_ELEMENT, iconElement);
	}

	public java.lang.Boolean getPrimary() {
		return (java.lang.Boolean) getStateHelper().eval(PRIMARY, null);
	}

	public void setPrimary(java.lang.Boolean primary) {
		getStateHelper().put(PRIMARY, primary);
	}

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	public void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	public java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	public void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	public java.lang.String getAfterIconChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_CHANGE, null);
	}

	public void setAfterIconChange(java.lang.String afterIconChange) {
		getStateHelper().put(AFTER_ICON_CHANGE, afterIconChange);
	}

	public java.lang.String getAfterIconAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_ALIGN_CHANGE, null);
	}

	public void setAfterIconAlignChange(java.lang.String afterIconAlignChange) {
		getStateHelper().put(AFTER_ICON_ALIGN_CHANGE, afterIconAlignChange);
	}

	public java.lang.String getAfterIconElementChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_ELEMENT_CHANGE, null);
	}

	public void setAfterIconElementChange(java.lang.String afterIconElementChange) {
		getStateHelper().put(AFTER_ICON_ELEMENT_CHANGE, afterIconElementChange);
	}

	public java.lang.String getAfterPrimaryChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PRIMARY_CHANGE, null);
	}

	public void setAfterPrimaryChange(java.lang.String afterPrimaryChange) {
		getStateHelper().put(AFTER_PRIMARY_CHANGE, afterPrimaryChange);
	}

	public java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	public void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	public java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	public void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	public java.lang.String getOnIconChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_CHANGE, null);
	}

	public void setOnIconChange(java.lang.String onIconChange) {
		getStateHelper().put(ON_ICON_CHANGE, onIconChange);
	}

	public java.lang.String getOnIconAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_ALIGN_CHANGE, null);
	}

	public void setOnIconAlignChange(java.lang.String onIconAlignChange) {
		getStateHelper().put(ON_ICON_ALIGN_CHANGE, onIconAlignChange);
	}

	public java.lang.String getOnIconElementChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_ELEMENT_CHANGE, null);
	}

	public void setOnIconElementChange(java.lang.String onIconElementChange) {
		getStateHelper().put(ON_ICON_ELEMENT_CHANGE, onIconElementChange);
	}

	public java.lang.String getOnPrimaryChange() {
		return (java.lang.String) getStateHelper().eval(ON_PRIMARY_CHANGE, null);
	}

	public void setOnPrimaryChange(java.lang.String onPrimaryChange) {
		getStateHelper().put(ON_PRIMARY_CHANGE, onPrimaryChange);
	}

	public java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	public void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

}