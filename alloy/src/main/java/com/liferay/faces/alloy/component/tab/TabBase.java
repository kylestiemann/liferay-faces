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
package com.liferay.faces.alloy.component.tab;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
public abstract class TabBase extends javax.faces.component.UIPanel {

	public static final String CONTENT = "content";
	public static final String DISABLED = "disabled";
	public static final String LABEL = "label";
	public static final String PANEL_NODE = "panelNode";
	public static final String TRIGGER_EVENT = "triggerEvent";
	public static final String AFTER_CONTENT_CHANGE = "afterContentChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	public static final String AFTER_PANEL_NODE_CHANGE = "afterPanelNodeChange";
	public static final String AFTER_TRIGGER_EVENT_CHANGE = "afterTriggerEventChange";
	public static final String ON_CONTENT_CHANGE = "onContentChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_LABEL_CHANGE = "onLabelChange";
	public static final String ON_PANEL_NODE_CHANGE = "onPanelNodeChange";
	public static final String ON_TRIGGER_EVENT_CHANGE = "onTriggerEventChange";

	public java.lang.Object getContent() {
		return (java.lang.Object) getStateHelper().eval(CONTENT, null);
	}

	public void setContent(java.lang.Object content) {
		getStateHelper().put(CONTENT, content);
	}

	public java.lang.String getDisabled() {
		return (java.lang.String) getStateHelper().eval(DISABLED, null);
	}

	public void setDisabled(java.lang.String disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	public java.lang.Object getLabel() {
		return (java.lang.Object) getStateHelper().eval(LABEL, null);
	}

	public void setLabel(java.lang.Object label) {
		getStateHelper().put(LABEL, label);
	}

	public java.lang.Object getPanelNode() {
		return (java.lang.Object) getStateHelper().eval(PANEL_NODE, null);
	}

	public void setPanelNode(java.lang.Object panelNode) {
		getStateHelper().put(PANEL_NODE, panelNode);
	}

	public java.lang.String getTriggerEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_EVENT, null);
	}

	public void setTriggerEvent(java.lang.String triggerEvent) {
		getStateHelper().put(TRIGGER_EVENT, triggerEvent);
	}

	public java.lang.String getAfterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_CHANGE, null);
	}

	public void setAfterContentChange(java.lang.String afterContentChange) {
		getStateHelper().put(AFTER_CONTENT_CHANGE, afterContentChange);
	}

	public java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	public java.lang.String getAfterLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_CHANGE, null);
	}

	public void setAfterLabelChange(java.lang.String afterLabelChange) {
		getStateHelper().put(AFTER_LABEL_CHANGE, afterLabelChange);
	}

	public java.lang.String getAfterPanelNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PANEL_NODE_CHANGE, null);
	}

	public void setAfterPanelNodeChange(java.lang.String afterPanelNodeChange) {
		getStateHelper().put(AFTER_PANEL_NODE_CHANGE, afterPanelNodeChange);
	}

	public java.lang.String getAfterTriggerEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_EVENT_CHANGE, null);
	}

	public void setAfterTriggerEventChange(java.lang.String afterTriggerEventChange) {
		getStateHelper().put(AFTER_TRIGGER_EVENT_CHANGE, afterTriggerEventChange);
	}

	public java.lang.String getOnContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_CHANGE, null);
	}

	public void setOnContentChange(java.lang.String onContentChange) {
		getStateHelper().put(ON_CONTENT_CHANGE, onContentChange);
	}

	public java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	public java.lang.String getOnLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_CHANGE, null);
	}

	public void setOnLabelChange(java.lang.String onLabelChange) {
		getStateHelper().put(ON_LABEL_CHANGE, onLabelChange);
	}

	public java.lang.String getOnPanelNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_PANEL_NODE_CHANGE, null);
	}

	public void setOnPanelNodeChange(java.lang.String onPanelNodeChange) {
		getStateHelper().put(ON_PANEL_NODE_CHANGE, onPanelNodeChange);
	}

	public java.lang.String getOnTriggerEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_EVENT_CHANGE, null);
	}

	public void setOnTriggerEventChange(java.lang.String onTriggerEventChange) {
		getStateHelper().put(ON_TRIGGER_EVENT_CHANGE, onTriggerEventChange);
	}

}