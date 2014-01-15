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
	private static final String DESTROYED = "destroyed";
	private static final String DISABLED = "disabled";
	private static final String INITIALIZED = "initialized";
	private static final String NAME = "name";
	private static final String PALETTE = "palette";
	private static final String SCHEDULER = "scheduler";
	private static final String VISIBLE = "visible";
	private static final String AFTER_COLOR_CHANGE = "afterColorChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_NAME_CHANGE = "afterNameChange";
	private static final String AFTER_PALETTE_CHANGE = "afterPaletteChange";
	private static final String AFTER_SCHEDULER_CHANGE = "afterSchedulerChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String ON_COLOR_CHANGE = "onColorChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_NAME_CHANGE = "onNameChange";
	private static final String ON_PALETTE_CHANGE = "onPaletteChange";
	private static final String ON_SCHEDULER_CHANGE = "onSchedulerChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	public java.lang.String getColor() {
		return (java.lang.String) getStateHelper().eval(COLOR, null);
	}

	public void setColor(java.lang.String color) {
		getStateHelper().put(COLOR, color);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	public void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getName() {
		return (java.lang.String) getStateHelper().eval(NAME, null);
	}

	public void setName(java.lang.String name) {
		getStateHelper().put(NAME, name);
	}

	public java.lang.Object getPalette() {
		return (java.lang.Object) getStateHelper().eval(PALETTE, null);
	}

	public void setPalette(java.lang.Object palette) {
		getStateHelper().put(PALETTE, palette);
	}

	public java.lang.String getScheduler() {
		return (java.lang.String) getStateHelper().eval(SCHEDULER, null);
	}

	public void setScheduler(java.lang.String scheduler) {
		getStateHelper().put(SCHEDULER, scheduler);
	}

	public java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	public void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	public java.lang.String getAfterColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_CHANGE, null);
	}

	public void setAfterColorChange(java.lang.String afterColorChange) {
		getStateHelper().put(AFTER_COLOR_CHANGE, afterColorChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterNameChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NAME_CHANGE, null);
	}

	public void setAfterNameChange(java.lang.String afterNameChange) {
		getStateHelper().put(AFTER_NAME_CHANGE, afterNameChange);
	}

	public java.lang.String getAfterPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PALETTE_CHANGE, null);
	}

	public void setAfterPaletteChange(java.lang.String afterPaletteChange) {
		getStateHelper().put(AFTER_PALETTE_CHANGE, afterPaletteChange);
	}

	public java.lang.String getAfterSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SCHEDULER_CHANGE, null);
	}

	public void setAfterSchedulerChange(java.lang.String afterSchedulerChange) {
		getStateHelper().put(AFTER_SCHEDULER_CHANGE, afterSchedulerChange);
	}

	public java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	public java.lang.String getOnColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_CHANGE, null);
	}

	public void setOnColorChange(java.lang.String onColorChange) {
		getStateHelper().put(ON_COLOR_CHANGE, onColorChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnNameChange() {
		return (java.lang.String) getStateHelper().eval(ON_NAME_CHANGE, null);
	}

	public void setOnNameChange(java.lang.String onNameChange) {
		getStateHelper().put(ON_NAME_CHANGE, onNameChange);
	}

	public java.lang.String getOnPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_PALETTE_CHANGE, null);
	}

	public void setOnPaletteChange(java.lang.String onPaletteChange) {
		getStateHelper().put(ON_PALETTE_CHANGE, onPaletteChange);
	}

	public java.lang.String getOnSchedulerChange() {
		return (java.lang.String) getStateHelper().eval(ON_SCHEDULER_CHANGE, null);
	}

	public void setOnSchedulerChange(java.lang.String onSchedulerChange) {
		getStateHelper().put(ON_SCHEDULER_CHANGE, onSchedulerChange);
	}

	public java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

}