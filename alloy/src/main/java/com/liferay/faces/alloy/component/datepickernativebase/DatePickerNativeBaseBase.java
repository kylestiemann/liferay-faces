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
package com.liferay.faces.alloy.component.datepickernativebase;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DatePickerNativeBaseBase extends javax.faces.component.UIPanel {

	private static final String NATIVE_MASK = "nativeMask";
	private static final String NATIVE_TYPE = "nativeType";
	private static final String AFTER_NATIVE_MASK_CHANGE = "afterNativeMaskChange";
	private static final String AFTER_NATIVE_TYPE_CHANGE = "afterNativeTypeChange";
	private static final String ON_NATIVE_MASK_CHANGE = "onNativeMaskChange";
	private static final String ON_NATIVE_TYPE_CHANGE = "onNativeTypeChange";

	protected java.lang.String getNativeMask() {
		return (java.lang.String) getStateHelper().eval(NATIVE_MASK, null);
	}

	protected void setNativeMask(java.lang.String nativeMask) {
		getStateHelper().put(NATIVE_MASK, nativeMask);
	}

	protected java.lang.String getNativeType() {
		return (java.lang.String) getStateHelper().eval(NATIVE_TYPE, null);
	}

	protected void setNativeType(java.lang.String nativeType) {
		getStateHelper().put(NATIVE_TYPE, nativeType);
	}

	protected java.lang.String getAfterNativeMaskChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NATIVE_MASK_CHANGE, null);
	}

	protected void setAfterNativeMaskChange(java.lang.String afterNativeMaskChange) {
		getStateHelper().put(AFTER_NATIVE_MASK_CHANGE, afterNativeMaskChange);
	}

	protected java.lang.String getAfterNativeTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NATIVE_TYPE_CHANGE, null);
	}

	protected void setAfterNativeTypeChange(java.lang.String afterNativeTypeChange) {
		getStateHelper().put(AFTER_NATIVE_TYPE_CHANGE, afterNativeTypeChange);
	}

	protected java.lang.String getOnNativeMaskChange() {
		return (java.lang.String) getStateHelper().eval(ON_NATIVE_MASK_CHANGE, null);
	}

	protected void setOnNativeMaskChange(java.lang.String onNativeMaskChange) {
		getStateHelper().put(ON_NATIVE_MASK_CHANGE, onNativeMaskChange);
	}

	protected java.lang.String getOnNativeTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_NATIVE_TYPE_CHANGE, null);
	}

	protected void setOnNativeTypeChange(java.lang.String onNativeTypeChange) {
		getStateHelper().put(ON_NATIVE_TYPE_CHANGE, onNativeTypeChange);
	}

}