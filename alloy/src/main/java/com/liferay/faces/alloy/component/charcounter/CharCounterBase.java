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
package com.liferay.faces.alloy.component.charcounter;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class CharCounterBase extends javax.faces.component.UIPanel {

	public static final String COUNTER = "counter";
	public static final String DESTROYED = "destroyed";
	public static final String INITIALIZED = "initialized";
	public static final String INPUT = "input";
	public static final String MAX_LENGTH = "maxLength";
	public static final String AFTER_COUNTER_CHANGE = "afterCounterChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_INPUT_CHANGE = "afterInputChange";
	public static final String AFTER_MAX_LENGTH_CHANGE = "afterMaxLengthChange";
	public static final String ON_COUNTER_CHANGE = "onCounterChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_INPUT_CHANGE = "onInputChange";
	public static final String ON_MAX_LENGTH_CHANGE = "onMaxLengthChange";

	public java.lang.Object getCounter() {
		return (java.lang.Object) getStateHelper().eval(COUNTER, null);
	}

	public void setCounter(java.lang.Object counter) {
		getStateHelper().put(COUNTER, counter);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Object getInput() {
		return (java.lang.Object) getStateHelper().eval(INPUT, null);
	}

	public void setInput(java.lang.Object input) {
		getStateHelper().put(INPUT, input);
	}

	public java.lang.Object getMaxLength() {
		return (java.lang.Object) getStateHelper().eval(MAX_LENGTH, null);
	}

	public void setMaxLength(java.lang.Object maxLength) {
		getStateHelper().put(MAX_LENGTH, maxLength);
	}

	public java.lang.String getAfterCounterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COUNTER_CHANGE, null);
	}

	public void setAfterCounterChange(java.lang.String afterCounterChange) {
		getStateHelper().put(AFTER_COUNTER_CHANGE, afterCounterChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INPUT_CHANGE, null);
	}

	public void setAfterInputChange(java.lang.String afterInputChange) {
		getStateHelper().put(AFTER_INPUT_CHANGE, afterInputChange);
	}

	public java.lang.String getAfterMaxLengthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_LENGTH_CHANGE, null);
	}

	public void setAfterMaxLengthChange(java.lang.String afterMaxLengthChange) {
		getStateHelper().put(AFTER_MAX_LENGTH_CHANGE, afterMaxLengthChange);
	}

	public java.lang.String getOnCounterChange() {
		return (java.lang.String) getStateHelper().eval(ON_COUNTER_CHANGE, null);
	}

	public void setOnCounterChange(java.lang.String onCounterChange) {
		getStateHelper().put(ON_COUNTER_CHANGE, onCounterChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_INPUT_CHANGE, null);
	}

	public void setOnInputChange(java.lang.String onInputChange) {
		getStateHelper().put(ON_INPUT_CHANGE, onInputChange);
	}

	public java.lang.String getOnMaxLengthChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_LENGTH_CHANGE, null);
	}

	public void setOnMaxLengthChange(java.lang.String onMaxLengthChange) {
		getStateHelper().put(ON_MAX_LENGTH_CHANGE, onMaxLengthChange);
	}

}