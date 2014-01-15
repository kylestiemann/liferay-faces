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
package com.liferay.faces.alloy.component.tooltipdelegate;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TooltipDelegateBase extends javax.faces.component.UIPanel {

	private static final String ALIGN = "align";
	private static final String CONTAINER = "container";
	private static final String DESTROYED = "destroyed";
	private static final String DURATION = "duration";
	private static final String INITIALIZED = "initialized";
	private static final String OPACITY = "opacity";
	private static final String TRIGGER_HIDE_EVENT = "triggerHideEvent";
	private static final String TRIGGER_SHOW_EVENT = "triggerShowEvent";
	private static final String Z_INDEX = "zIndex";
	private static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DURATION_CHANGE = "afterDurationChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_OPACITY_CHANGE = "afterOpacityChange";
	private static final String AFTER_TRIGGER_HIDE_EVENT_CHANGE = "afterTriggerHideEventChange";
	private static final String AFTER_TRIGGER_SHOW_EVENT_CHANGE = "afterTriggerShowEventChange";
	private static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	private static final String ON_ALIGN_CHANGE = "onAlignChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DURATION_CHANGE = "onDurationChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_OPACITY_CHANGE = "onOpacityChange";
	private static final String ON_TRIGGER_HIDE_EVENT_CHANGE = "onTriggerHideEventChange";
	private static final String ON_TRIGGER_SHOW_EVENT_CHANGE = "onTriggerShowEventChange";
	private static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	public java.lang.Object getAlign() {
		return (java.lang.Object) getStateHelper().eval(ALIGN, null);
	}

	public void setAlign(java.lang.Object align) {
		getStateHelper().put(ALIGN, align);
	}

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

	public java.lang.Object getDuration() {
		return (java.lang.Object) getStateHelper().eval(DURATION, null);
	}

	public void setDuration(java.lang.Object duration) {
		getStateHelper().put(DURATION, duration);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Object getOpacity() {
		return (java.lang.Object) getStateHelper().eval(OPACITY, null);
	}

	public void setOpacity(java.lang.Object opacity) {
		getStateHelper().put(OPACITY, opacity);
	}

	public java.lang.String getTriggerHideEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_HIDE_EVENT, null);
	}

	public void setTriggerHideEvent(java.lang.String triggerHideEvent) {
		getStateHelper().put(TRIGGER_HIDE_EVENT, triggerHideEvent);
	}

	public java.lang.String getTriggerShowEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_SHOW_EVENT, null);
	}

	public void setTriggerShowEvent(java.lang.String triggerShowEvent) {
		getStateHelper().put(TRIGGER_SHOW_EVENT, triggerShowEvent);
	}

	public java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	public void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	public java.lang.String getAfterAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_CHANGE, null);
	}

	public void setAfterAlignChange(java.lang.String afterAlignChange) {
		getStateHelper().put(AFTER_ALIGN_CHANGE, afterAlignChange);
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

	public java.lang.String getAfterDurationChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DURATION_CHANGE, null);
	}

	public void setAfterDurationChange(java.lang.String afterDurationChange) {
		getStateHelper().put(AFTER_DURATION_CHANGE, afterDurationChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterOpacityChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OPACITY_CHANGE, null);
	}

	public void setAfterOpacityChange(java.lang.String afterOpacityChange) {
		getStateHelper().put(AFTER_OPACITY_CHANGE, afterOpacityChange);
	}

	public java.lang.String getAfterTriggerHideEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_HIDE_EVENT_CHANGE, null);
	}

	public void setAfterTriggerHideEventChange(java.lang.String afterTriggerHideEventChange) {
		getStateHelper().put(AFTER_TRIGGER_HIDE_EVENT_CHANGE, afterTriggerHideEventChange);
	}

	public java.lang.String getAfterTriggerShowEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_SHOW_EVENT_CHANGE, null);
	}

	public void setAfterTriggerShowEventChange(java.lang.String afterTriggerShowEventChange) {
		getStateHelper().put(AFTER_TRIGGER_SHOW_EVENT_CHANGE, afterTriggerShowEventChange);
	}

	public java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	public void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	public java.lang.String getOnAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_CHANGE, null);
	}

	public void setOnAlignChange(java.lang.String onAlignChange) {
		getStateHelper().put(ON_ALIGN_CHANGE, onAlignChange);
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

	public java.lang.String getOnDurationChange() {
		return (java.lang.String) getStateHelper().eval(ON_DURATION_CHANGE, null);
	}

	public void setOnDurationChange(java.lang.String onDurationChange) {
		getStateHelper().put(ON_DURATION_CHANGE, onDurationChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnOpacityChange() {
		return (java.lang.String) getStateHelper().eval(ON_OPACITY_CHANGE, null);
	}

	public void setOnOpacityChange(java.lang.String onOpacityChange) {
		getStateHelper().put(ON_OPACITY_CHANGE, onOpacityChange);
	}

	public java.lang.String getOnTriggerHideEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_HIDE_EVENT_CHANGE, null);
	}

	public void setOnTriggerHideEventChange(java.lang.String onTriggerHideEventChange) {
		getStateHelper().put(ON_TRIGGER_HIDE_EVENT_CHANGE, onTriggerHideEventChange);
	}

	public java.lang.String getOnTriggerShowEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_SHOW_EVENT_CHANGE, null);
	}

	public void setOnTriggerShowEventChange(java.lang.String onTriggerShowEventChange) {
		getStateHelper().put(ON_TRIGGER_SHOW_EVENT_CHANGE, onTriggerShowEventChange);
	}

	public java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	public void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}