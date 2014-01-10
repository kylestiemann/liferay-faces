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
package com.liferay.faces.alloy.component.widgettrigger;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class WidgetTriggerBase extends javax.faces.component.UIPanel {

	private static final String BIND_DOMEVENTS = "bindDOMEvents";
	private static final String TRIGGER = "trigger";
	private static final String TRIGGER_HIDE_EVENT = "triggerHideEvent";
	private static final String TRIGGER_SHOW_EVENT = "triggerShowEvent";
	private static final String TRIGGER_TOGGLE_EVENT = "triggerToggleEvent";
	private static final String AFTER_BIND_DOMEVENTS_CHANGE = "afterBindDOMEventsChange";
	private static final String AFTER_TRIGGER_CHANGE = "afterTriggerChange";
	private static final String AFTER_TRIGGER_HIDE_EVENT_CHANGE = "afterTriggerHideEventChange";
	private static final String AFTER_TRIGGER_SHOW_EVENT_CHANGE = "afterTriggerShowEventChange";
	private static final String AFTER_TRIGGER_TOGGLE_EVENT_CHANGE = "afterTriggerToggleEventChange";
	private static final String ON_BIND_DOMEVENTS_CHANGE = "onBindDOMEventsChange";
	private static final String ON_TRIGGER_CHANGE = "onTriggerChange";
	private static final String ON_TRIGGER_HIDE_EVENT_CHANGE = "onTriggerHideEventChange";
	private static final String ON_TRIGGER_SHOW_EVENT_CHANGE = "onTriggerShowEventChange";
	private static final String ON_TRIGGER_TOGGLE_EVENT_CHANGE = "onTriggerToggleEventChange";

	protected java.lang.Boolean getBindDOMEvents() {
		return (java.lang.Boolean) getStateHelper().eval(BIND_DOMEVENTS, null);
	}

	protected void setBindDOMEvents(java.lang.Boolean bindDOMEvents) {
		getStateHelper().put(BIND_DOMEVENTS, bindDOMEvents);
	}

	protected java.lang.Object getTrigger() {
		return (java.lang.Object) getStateHelper().eval(TRIGGER, null);
	}

	protected void setTrigger(java.lang.Object trigger) {
		getStateHelper().put(TRIGGER, trigger);
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

	protected java.lang.String getTriggerToggleEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_TOGGLE_EVENT, null);
	}

	protected void setTriggerToggleEvent(java.lang.String triggerToggleEvent) {
		getStateHelper().put(TRIGGER_TOGGLE_EVENT, triggerToggleEvent);
	}

	protected java.lang.String getAfterBindDOMEventsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BIND_DOMEVENTS_CHANGE, null);
	}

	protected void setAfterBindDOMEventsChange(java.lang.String afterBindDOMEventsChange) {
		getStateHelper().put(AFTER_BIND_DOMEVENTS_CHANGE, afterBindDOMEventsChange);
	}

	protected java.lang.String getAfterTriggerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_CHANGE, null);
	}

	protected void setAfterTriggerChange(java.lang.String afterTriggerChange) {
		getStateHelper().put(AFTER_TRIGGER_CHANGE, afterTriggerChange);
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

	protected java.lang.String getAfterTriggerToggleEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_TOGGLE_EVENT_CHANGE, null);
	}

	protected void setAfterTriggerToggleEventChange(java.lang.String afterTriggerToggleEventChange) {
		getStateHelper().put(AFTER_TRIGGER_TOGGLE_EVENT_CHANGE, afterTriggerToggleEventChange);
	}

	protected java.lang.String getOnBindDOMEventsChange() {
		return (java.lang.String) getStateHelper().eval(ON_BIND_DOMEVENTS_CHANGE, null);
	}

	protected void setOnBindDOMEventsChange(java.lang.String onBindDOMEventsChange) {
		getStateHelper().put(ON_BIND_DOMEVENTS_CHANGE, onBindDOMEventsChange);
	}

	protected java.lang.String getOnTriggerChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_CHANGE, null);
	}

	protected void setOnTriggerChange(java.lang.String onTriggerChange) {
		getStateHelper().put(ON_TRIGGER_CHANGE, onTriggerChange);
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

	protected java.lang.String getOnTriggerToggleEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_TOGGLE_EVENT_CHANGE, null);
	}

	protected void setOnTriggerToggleEventChange(java.lang.String onTriggerToggleEventChange) {
		getStateHelper().put(ON_TRIGGER_TOGGLE_EVENT_CHANGE, onTriggerToggleEventChange);
	}

}