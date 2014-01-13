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
package com.liferay.faces.alloy.component.hsvapalette;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class HSVAPaletteBase extends javax.faces.component.UIPanel {

	private static final String CONTROLS = "controls";
	private static final String FIELD_VALIDATOR = "fieldValidator";
	private static final String SELECTED = "selected";
	private static final String STRINGS = "strings";
	private static final String AFTER_CONTROLS_CHANGE = "afterControlsChange";
	private static final String AFTER_FIELD_VALIDATOR_CHANGE = "afterFieldValidatorChange";
	private static final String AFTER_SELECTED_CHANGE = "afterSelectedChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String ON_CONTROLS_CHANGE = "onControlsChange";
	private static final String ON_FIELD_VALIDATOR_CHANGE = "onFieldValidatorChange";
	private static final String ON_SELECTED_CHANGE = "onSelectedChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";

	protected java.lang.Boolean getControls() {
		return (java.lang.Boolean) getStateHelper().eval(CONTROLS, null);
	}

	protected void setControls(java.lang.Boolean controls) {
		getStateHelper().put(CONTROLS, controls);
	}

	protected java.lang.Object getFieldValidator() {
		return (java.lang.Object) getStateHelper().eval(FIELD_VALIDATOR, null);
	}

	protected void setFieldValidator(java.lang.Object fieldValidator) {
		getStateHelper().put(FIELD_VALIDATOR, fieldValidator);
	}

	protected java.lang.String getSelected() {
		return (java.lang.String) getStateHelper().eval(SELECTED, null);
	}

	protected void setSelected(java.lang.String selected) {
		getStateHelper().put(SELECTED, selected);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.String getAfterControlsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTROLS_CHANGE, null);
	}

	protected void setAfterControlsChange(java.lang.String afterControlsChange) {
		getStateHelper().put(AFTER_CONTROLS_CHANGE, afterControlsChange);
	}

	protected java.lang.String getAfterFieldValidatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIELD_VALIDATOR_CHANGE, null);
	}

	protected void setAfterFieldValidatorChange(java.lang.String afterFieldValidatorChange) {
		getStateHelper().put(AFTER_FIELD_VALIDATOR_CHANGE, afterFieldValidatorChange);
	}

	protected java.lang.String getAfterSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_CHANGE, null);
	}

	protected void setAfterSelectedChange(java.lang.String afterSelectedChange) {
		getStateHelper().put(AFTER_SELECTED_CHANGE, afterSelectedChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getOnControlsChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTROLS_CHANGE, null);
	}

	protected void setOnControlsChange(java.lang.String onControlsChange) {
		getStateHelper().put(ON_CONTROLS_CHANGE, onControlsChange);
	}

	protected java.lang.String getOnFieldValidatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIELD_VALIDATOR_CHANGE, null);
	}

	protected void setOnFieldValidatorChange(java.lang.String onFieldValidatorChange) {
		getStateHelper().put(ON_FIELD_VALIDATOR_CHANGE, onFieldValidatorChange);
	}

	protected java.lang.String getOnSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_CHANGE, null);
	}

	protected void setOnSelectedChange(java.lang.String onSelectedChange) {
		getStateHelper().put(ON_SELECTED_CHANGE, onSelectedChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

}