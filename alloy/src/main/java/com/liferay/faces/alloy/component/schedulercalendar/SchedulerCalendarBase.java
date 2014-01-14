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
package com.liferay.faces.alloy.component.schedulercalendar;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SchedulerCalendarBase extends javax.faces.component.UIPanel {

	private static final String COLOR = "color";
	private static final String DISABLED = "disabled";
	private static final String NAME = "name";
	private static final String PALETTE = "palette";
	private static final String SCHEDULER = "scheduler";
	private static final String VISIBLE = "visible";
	private static final String AFTER_COLOR_CHANGE = "afterColorChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_NAME_CHANGE = "afterNameChange";
	private static final String AFTER_PALETTE_CHANGE = "afterPaletteChange";
	private static final String AFTER_SCHEDULER_CHANGE = "afterSchedulerChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String ON_COLOR_CHANGE = "onColorChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_NAME_CHANGE = "onNameChange";
	private static final String ON_PALETTE_CHANGE = "onPaletteChange";
	private static final String ON_SCHEDULER_CHANGE = "onSchedulerChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	protected java.lang.String getColor() {
		return (java.lang.String) getStateHelper().eval(COLOR, null);
	}

	protected void setColor(java.lang.String color) {
		getStateHelper().put(COLOR, color);
	}

	protected java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	protected void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	protected java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	protected void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	protected java.lang.Object getPalette() {
		return (java.lang.Object) getStateHelper().eval(PALETTE, null);
	}

	protected void setPalette(java.lang.Object palette) {
		getStateHelper().put(PALETTE, palette);
	}

	protected java.lang.String getScheduler() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER, null);
	}

	protected void setScheduler(java.lang.String scheduler) {
		getStateHelper().put(SCHEDULER, scheduler);
	}

	protected java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	protected void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	protected java.lang.String getAfterColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_CHANGE, null);
	}

	protected void setAfterColorChange(java.lang.String afterColorChange) {
		getStateHelper().put(AFTER_COLOR_CHANGE, afterColorChange);
	}

	protected java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	protected void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	protected java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	protected void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	protected java.lang.String getAfterPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PALETTE_CHANGE, null);
	}

	protected void setAfterPaletteChange(java.lang.String afterPaletteChange) {
		getStateHelper().put(AFTER_PALETTE_CHANGE, afterPaletteChange);
	}

	protected java.lang.String getAfterSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCHEDULER_CHANGE, null);
	}

	protected void setAfterSchedulerChange(java.lang.String afterSchedulerChange) {
		getStateHelper().put(AFTER_SCHEDULER_CHANGE, afterSchedulerChange);
	}

	protected java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	protected void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	protected java.lang.String getOnColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_CHANGE, null);
	}

	protected void setOnColorChange(java.lang.String onColorChange) {
		getStateHelper().put(ON_COLOR_CHANGE, onColorChange);
	}

	protected java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	protected void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	protected java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	protected void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	protected java.lang.String getOnPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_PALETTE_CHANGE, null);
	}

	protected void setOnPaletteChange(java.lang.String onPaletteChange) {
		getStateHelper().put(ON_PALETTE_CHANGE, onPaletteChange);
	}

	protected java.lang.String getOnSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCHEDULER_CHANGE, null);
	}

	protected void setOnSchedulerChange(java.lang.String onSchedulerChange) {
		getStateHelper().put(ON_SCHEDULER_CHANGE, onSchedulerChange);
	}

	protected java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	protected void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

}