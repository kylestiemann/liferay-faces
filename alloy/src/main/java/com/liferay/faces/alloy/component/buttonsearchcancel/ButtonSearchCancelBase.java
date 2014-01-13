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
package com.liferay.faces.alloy.component.buttonsearchcancel;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ButtonSearchCancelBase extends javax.faces.component.UIPanel {

	private static final String CONTAINER = "container";
	private static final String GUTTER = "gutter";
	private static final String ICON_CLASS = "iconClass";
	private static final String TRIGGER = "trigger";
	private static final String Z_INDEX = "zIndex";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_GUTTER_CHANGE = "afterGutterChange";
	private static final String AFTER_ICON_CLASS_CHANGE = "afterIconClassChange";
	private static final String AFTER_TRIGGER_CHANGE = "afterTriggerChange";
	private static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_GUTTER_CHANGE = "onGutterChange";
	private static final String ON_ICON_CLASS_CHANGE = "onIconClassChange";
	private static final String ON_TRIGGER_CHANGE = "onTriggerChange";
	private static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	protected java.lang.Object getContainer() {
		return (java.lang.Object) getStateHelper().eval(CONTAINER, null);
	}

	protected void setContainer(java.lang.Object container) {
		getStateHelper().put(CONTAINER, container);
	}

	protected java.lang.Object getGutter() {
		return (java.lang.Object) getStateHelper().eval(GUTTER, null);
	}

	protected void setGutter(java.lang.Object gutter) {
		getStateHelper().put(GUTTER, gutter);
	}

	protected java.lang.String getIconClass() {
		return (java.lang.String) getStateHelper().eval(ICON_CLASS, null);
	}

	protected void setIconClass(java.lang.String iconClass) {
		getStateHelper().put(ICON_CLASS, iconClass);
	}

	protected java.lang.String getTrigger() {
		return (java.lang.String) getStateHelper().eval(TRIGGER, null);
	}

	protected void setTrigger(java.lang.String trigger) {
		getStateHelper().put(TRIGGER, trigger);
	}

	protected java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	protected void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	protected java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	protected void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	protected java.lang.String getAfterGutterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GUTTER_CHANGE, null);
	}

	protected void setAfterGutterChange(java.lang.String afterGutterChange) {
		getStateHelper().put(AFTER_GUTTER_CHANGE, afterGutterChange);
	}

	protected java.lang.String getAfterIconClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_CLASS_CHANGE, null);
	}

	protected void setAfterIconClassChange(java.lang.String afterIconClassChange) {
		getStateHelper().put(AFTER_ICON_CLASS_CHANGE, afterIconClassChange);
	}

	protected java.lang.String getAfterTriggerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_CHANGE, null);
	}

	protected void setAfterTriggerChange(java.lang.String afterTriggerChange) {
		getStateHelper().put(AFTER_TRIGGER_CHANGE, afterTriggerChange);
	}

	protected java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	protected void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	protected java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	protected void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	protected java.lang.String getOnGutterChange() {
		return (java.lang.String) getStateHelper().eval(ON_GUTTER_CHANGE, null);
	}

	protected void setOnGutterChange(java.lang.String onGutterChange) {
		getStateHelper().put(ON_GUTTER_CHANGE, onGutterChange);
	}

	protected java.lang.String getOnIconClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_CLASS_CHANGE, null);
	}

	protected void setOnIconClassChange(java.lang.String onIconClassChange) {
		getStateHelper().put(ON_ICON_CLASS_CHANGE, onIconClassChange);
	}

	protected java.lang.String getOnTriggerChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_CHANGE, null);
	}

	protected void setOnTriggerChange(java.lang.String onTriggerChange) {
		getStateHelper().put(ON_TRIGGER_CHANGE, onTriggerChange);
	}

	protected java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	protected void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}