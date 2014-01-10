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
package com.liferay.faces.alloy.component.autosizeiframe;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AutosizeIframeBase extends javax.faces.component.UIPanel {

	private static final String HEIGHT = "height";
	private static final String MONITOR_HEIGHT = "monitorHeight";
	private static final String WIDTH = "width";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_MONITOR_HEIGHT_CHANGE = "afterMonitorHeightChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_MONITOR_HEIGHT_CHANGE = "onMonitorHeightChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";

	protected java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	protected void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	protected java.lang.Boolean getMonitorHeight() {
		return (java.lang.Boolean) getStateHelper().eval(MONITOR_HEIGHT, null);
	}

	protected void setMonitorHeight(java.lang.Boolean monitorHeight) {
		getStateHelper().put(MONITOR_HEIGHT, monitorHeight);
	}

	protected java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	protected void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	protected java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	protected void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	protected java.lang.String getAfterMonitorHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MONITOR_HEIGHT_CHANGE, null);
	}

	protected void setAfterMonitorHeightChange(java.lang.String afterMonitorHeightChange) {
		getStateHelper().put(AFTER_MONITOR_HEIGHT_CHANGE, afterMonitorHeightChange);
	}

	protected java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	protected void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	protected java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	protected void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	protected java.lang.String getOnMonitorHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_MONITOR_HEIGHT_CHANGE, null);
	}

	protected void setOnMonitorHeightChange(java.lang.String onMonitorHeightChange) {
		getStateHelper().put(ON_MONITOR_HEIGHT_CHANGE, onMonitorHeightChange);
	}

	protected java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	protected void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

}