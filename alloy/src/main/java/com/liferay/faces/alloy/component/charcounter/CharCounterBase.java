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

	private static final String COUNTER = "counter";
	private static final String INPUT = "input";
	private static final String MAX_LENGTH = "maxLength";
	private static final String AFTER_COUNTER_CHANGE = "afterCounterChange";
	private static final String AFTER_INPUT_CHANGE = "afterInputChange";
	private static final String AFTER_MAX_LENGTH_CHANGE = "afterMaxLengthChange";
	private static final String ON_COUNTER_CHANGE = "onCounterChange";
	private static final String ON_INPUT_CHANGE = "onInputChange";
	private static final String ON_MAX_LENGTH_CHANGE = "onMaxLengthChange";

	protected java.lang.Object getCounter() {
		return (java.lang.Object) getStateHelper().eval(COUNTER, null);
	}

	protected void setCounter(java.lang.Object counter) {
		getStateHelper().put(COUNTER, counter);
	}

	protected java.lang.Object getInput() {
		return (java.lang.Object) getStateHelper().eval(INPUT, null);
	}

	protected void setInput(java.lang.Object input) {
		getStateHelper().put(INPUT, input);
	}

	protected java.lang.Object getMaxLength() {
		return (java.lang.Object) getStateHelper().eval(MAX_LENGTH, null);
	}

	protected void setMaxLength(java.lang.Object maxLength) {
		getStateHelper().put(MAX_LENGTH, maxLength);
	}

	protected java.lang.String getAfterCounterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COUNTER_CHANGE, null);
	}

	protected void setAfterCounterChange(java.lang.String afterCounterChange) {
		getStateHelper().put(AFTER_COUNTER_CHANGE, afterCounterChange);
	}

	protected java.lang.String getAfterInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INPUT_CHANGE, null);
	}

	protected void setAfterInputChange(java.lang.String afterInputChange) {
		getStateHelper().put(AFTER_INPUT_CHANGE, afterInputChange);
	}

	protected java.lang.String getAfterMaxLengthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_LENGTH_CHANGE, null);
	}

	protected void setAfterMaxLengthChange(java.lang.String afterMaxLengthChange) {
		getStateHelper().put(AFTER_MAX_LENGTH_CHANGE, afterMaxLengthChange);
	}

	protected java.lang.String getOnCounterChange() {
		return (java.lang.String) getStateHelper().eval(ON_COUNTER_CHANGE, null);
	}

	protected void setOnCounterChange(java.lang.String onCounterChange) {
		getStateHelper().put(ON_COUNTER_CHANGE, onCounterChange);
	}

	protected java.lang.String getOnInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_INPUT_CHANGE, null);
	}

	protected void setOnInputChange(java.lang.String onInputChange) {
		getStateHelper().put(ON_INPUT_CHANGE, onInputChange);
	}

	protected java.lang.String getOnMaxLengthChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_LENGTH_CHANGE, null);
	}

	protected void setOnMaxLengthChange(java.lang.String onMaxLengthChange) {
		getStateHelper().put(ON_MAX_LENGTH_CHANGE, onMaxLengthChange);
	}

}