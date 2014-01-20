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
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class ButtonSearchCancelBase extends javax.faces.component.UIPanel {

	public static final String CONTAINER = "container";
	public static final String DESTROYED = "destroyed";
	public static final String GUTTER = "gutter";
	public static final String ICON_CLASS = "iconClass";
	public static final String INITIALIZED = "initialized";
	public static final String TRIGGER = "trigger";
	public static final String Z_INDEX = "zIndex";
	public static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_GUTTER_CHANGE = "afterGutterChange";
	public static final String AFTER_ICON_CLASS_CHANGE = "afterIconClassChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_TRIGGER_CHANGE = "afterTriggerChange";
	public static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	public static final String ON_CONTAINER_CHANGE = "onContainerChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_GUTTER_CHANGE = "onGutterChange";
	public static final String ON_ICON_CLASS_CHANGE = "onIconClassChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_TRIGGER_CHANGE = "onTriggerChange";
	public static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	public java.lang.String getContainer() {
		return (java.lang.String) getStateHelper().eval(CONTAINER, null);
	}

	public void setContainer(java.lang.String container) {
		getStateHelper().put(CONTAINER, container);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Object getGutter() {
		return (java.lang.Object) getStateHelper().eval(GUTTER, null);
	}

	public void setGutter(java.lang.Object gutter) {
		getStateHelper().put(GUTTER, gutter);
	}

	public java.lang.String getIconClass() {
		return (java.lang.String) getStateHelper().eval(ICON_CLASS, null);
	}

	public void setIconClass(java.lang.String iconClass) {
		getStateHelper().put(ICON_CLASS, iconClass);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getTrigger() {
		return (java.lang.String) getStateHelper().eval(TRIGGER, null);
	}

	public void setTrigger(java.lang.String trigger) {
		getStateHelper().put(TRIGGER, trigger);
	}

	public java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	public void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	public java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	public void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterGutterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_GUTTER_CHANGE, null);
	}

	public void setAfterGutterChange(java.lang.String afterGutterChange) {
		getStateHelper().put(AFTER_GUTTER_CHANGE, afterGutterChange);
	}

	public java.lang.String getAfterIconClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ICON_CLASS_CHANGE, null);
	}

	public void setAfterIconClassChange(java.lang.String afterIconClassChange) {
		getStateHelper().put(AFTER_ICON_CLASS_CHANGE, afterIconClassChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterTriggerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_CHANGE, null);
	}

	public void setAfterTriggerChange(java.lang.String afterTriggerChange) {
		getStateHelper().put(AFTER_TRIGGER_CHANGE, afterTriggerChange);
	}

	public java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	public void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	public java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	public void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnGutterChange() {
		return (java.lang.String) getStateHelper().eval(ON_GUTTER_CHANGE, null);
	}

	public void setOnGutterChange(java.lang.String onGutterChange) {
		getStateHelper().put(ON_GUTTER_CHANGE, onGutterChange);
	}

	public java.lang.String getOnIconClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_ICON_CLASS_CHANGE, null);
	}

	public void setOnIconClassChange(java.lang.String onIconClassChange) {
		getStateHelper().put(ON_ICON_CLASS_CHANGE, onIconClassChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnTriggerChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_CHANGE, null);
	}

	public void setOnTriggerChange(java.lang.String onTriggerChange) {
		getStateHelper().put(ON_TRIGGER_CHANGE, onTriggerChange);
	}

	public java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	public void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}