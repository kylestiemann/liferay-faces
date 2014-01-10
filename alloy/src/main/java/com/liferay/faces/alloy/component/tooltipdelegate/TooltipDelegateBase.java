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
	private static final String DURATION = "duration";
	private static final String OPACITY = "opacity";
	private static final String TRIGGER_HIDE_EVENT = "triggerHideEvent";
	private static final String TRIGGER_SHOW_EVENT = "triggerShowEvent";
	private static final String Z_INDEX = "zIndex";
	private static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_DURATION_CHANGE = "afterDurationChange";
	private static final String AFTER_OPACITY_CHANGE = "afterOpacityChange";
	private static final String AFTER_TRIGGER_HIDE_EVENT_CHANGE = "afterTriggerHideEventChange";
	private static final String AFTER_TRIGGER_SHOW_EVENT_CHANGE = "afterTriggerShowEventChange";
	private static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	private static final String ON_ALIGN_CHANGE = "onAlignChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_DURATION_CHANGE = "onDurationChange";
	private static final String ON_OPACITY_CHANGE = "onOpacityChange";
	private static final String ON_TRIGGER_HIDE_EVENT_CHANGE = "onTriggerHideEventChange";
	private static final String ON_TRIGGER_SHOW_EVENT_CHANGE = "onTriggerShowEventChange";
	private static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	protected java.lang.Object getAlign() {
		return (java.lang.Object) getStateHelper().eval(ALIGN, null);
	}

	protected void setAlign(java.lang.Object align) {
		getStateHelper().put(ALIGN, align);
	}

	protected java.lang.Object getContainer() {
		return (java.lang.Object) getStateHelper().eval(CONTAINER, null);
	}

	protected void setContainer(java.lang.Object container) {
		getStateHelper().put(CONTAINER, container);
	}

	protected java.lang.Object getDuration() {
		return (java.lang.Object) getStateHelper().eval(DURATION, null);
	}

	protected void setDuration(java.lang.Object duration) {
		getStateHelper().put(DURATION, duration);
	}

	protected java.lang.Object getOpacity() {
		return (java.lang.Object) getStateHelper().eval(OPACITY, null);
	}

	protected void setOpacity(java.lang.Object opacity) {
		getStateHelper().put(OPACITY, opacity);
	}

	protected java.lang.String getTriggerHideEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_HIDE_EVENT, null);
	}

	protected void setTriggerHideEvent(java.lang.String triggerHideEvent) {
		getStateHelper().put(TRIGGER_HIDE_EVENT, triggerHideEvent);
	}

	protected java.lang.String getTriggerShowEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_SHOW_EVENT, null);
	}

	protected void setTriggerShowEvent(java.lang.String triggerShowEvent) {
		getStateHelper().put(TRIGGER_SHOW_EVENT, triggerShowEvent);
	}

	protected java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	protected void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	protected java.lang.String getAfterAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_CHANGE, null);
	}

	protected void setAfterAlignChange(java.lang.String afterAlignChange) {
		getStateHelper().put(AFTER_ALIGN_CHANGE, afterAlignChange);
	}

	protected java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	protected void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	protected java.lang.String getAfterDurationChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DURATION_CHANGE, null);
	}

	protected void setAfterDurationChange(java.lang.String afterDurationChange) {
		getStateHelper().put(AFTER_DURATION_CHANGE, afterDurationChange);
	}

	protected java.lang.String getAfterOpacityChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OPACITY_CHANGE, null);
	}

	protected void setAfterOpacityChange(java.lang.String afterOpacityChange) {
		getStateHelper().put(AFTER_OPACITY_CHANGE, afterOpacityChange);
	}

	protected java.lang.String getAfterTriggerHideEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_HIDE_EVENT_CHANGE, null);
	}

	protected void setAfterTriggerHideEventChange(java.lang.String afterTriggerHideEventChange) {
		getStateHelper().put(AFTER_TRIGGER_HIDE_EVENT_CHANGE, afterTriggerHideEventChange);
	}

	protected java.lang.String getAfterTriggerShowEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_SHOW_EVENT_CHANGE, null);
	}

	protected void setAfterTriggerShowEventChange(java.lang.String afterTriggerShowEventChange) {
		getStateHelper().put(AFTER_TRIGGER_SHOW_EVENT_CHANGE, afterTriggerShowEventChange);
	}

	protected java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	protected void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	protected java.lang.String getOnAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_CHANGE, null);
	}

	protected void setOnAlignChange(java.lang.String onAlignChange) {
		getStateHelper().put(ON_ALIGN_CHANGE, onAlignChange);
	}

	protected java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	protected void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	protected java.lang.String getOnDurationChange() {
		return (java.lang.String) getStateHelper().eval(ON_DURATION_CHANGE, null);
	}

	protected void setOnDurationChange(java.lang.String onDurationChange) {
		getStateHelper().put(ON_DURATION_CHANGE, onDurationChange);
	}

	protected java.lang.String getOnOpacityChange() {
		return (java.lang.String) getStateHelper().eval(ON_OPACITY_CHANGE, null);
	}

	protected void setOnOpacityChange(java.lang.String onOpacityChange) {
		getStateHelper().put(ON_OPACITY_CHANGE, onOpacityChange);
	}

	protected java.lang.String getOnTriggerHideEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_HIDE_EVENT_CHANGE, null);
	}

	protected void setOnTriggerHideEventChange(java.lang.String onTriggerHideEventChange) {
		getStateHelper().put(ON_TRIGGER_HIDE_EVENT_CHANGE, onTriggerHideEventChange);
	}

	protected java.lang.String getOnTriggerShowEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_SHOW_EVENT_CHANGE, null);
	}

	protected void setOnTriggerShowEventChange(java.lang.String onTriggerShowEventChange) {
		getStateHelper().put(ON_TRIGGER_SHOW_EVENT_CHANGE, onTriggerShowEventChange);
	}

	protected java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	protected void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}