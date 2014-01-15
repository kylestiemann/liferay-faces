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
package com.liferay.faces.alloy.component.datepickernative;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DatePickerNativeBase extends javax.faces.component.UIPanel {

	private static final String ACTIVE_INPUT = "activeInput";
	private static final String CONTAINER = "container";
	private static final String CONTENT = "content";
	private static final String DATE_SEPARATOR = "dateSeparator";
	private static final String DESTROYED = "destroyed";
	private static final String INITIALIZED = "initialized";
	private static final String MASK = "mask";
	private static final String NATIVE_MASK = "nativeMask";
	private static final String NATIVE_TYPE = "nativeType";
	private static final String VALUE_EXTRACTOR = "valueExtractor";
	private static final String VALUE_FORMATTER = "valueFormatter";
	private static final String AFTER_ACTIVE_INPUT_CHANGE = "afterActiveInputChange";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_CONTENT_CHANGE = "afterContentChange";
	private static final String AFTER_DATE_SEPARATOR_CHANGE = "afterDateSeparatorChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_MASK_CHANGE = "afterMaskChange";
	private static final String AFTER_NATIVE_MASK_CHANGE = "afterNativeMaskChange";
	private static final String AFTER_NATIVE_TYPE_CHANGE = "afterNativeTypeChange";
	private static final String AFTER_VALUE_EXTRACTOR_CHANGE = "afterValueExtractorChange";
	private static final String AFTER_VALUE_FORMATTER_CHANGE = "afterValueFormatterChange";
	private static final String ON_ACTIVE_INPUT_CHANGE = "onActiveInputChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_CONTENT_CHANGE = "onContentChange";
	private static final String ON_DATE_SEPARATOR_CHANGE = "onDateSeparatorChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_MASK_CHANGE = "onMaskChange";
	private static final String ON_NATIVE_MASK_CHANGE = "onNativeMaskChange";
	private static final String ON_NATIVE_TYPE_CHANGE = "onNativeTypeChange";
	private static final String ON_VALUE_EXTRACTOR_CHANGE = "onValueExtractorChange";
	private static final String ON_VALUE_FORMATTER_CHANGE = "onValueFormatterChange";

	public java.lang.String getActiveInput() {
		return (java.lang.String) getStateHelper().eval(ACTIVE_INPUT, null);
	}

	public void setActiveInput(java.lang.String activeInput) {
		getStateHelper().put(ACTIVE_INPUT, activeInput);
	}

	public java.lang.String getContainer() {
		return (java.lang.String) getStateHelper().eval(CONTAINER, null);
	}

	public void setContainer(java.lang.String container) {
		getStateHelper().put(CONTAINER, container);
	}

	public java.lang.String getContent() {
		return (java.lang.String) getStateHelper().eval(CONTENT, null);
	}

	public void setContent(java.lang.String content) {
		getStateHelper().put(CONTENT, content);
	}

	public java.lang.String getDateSeparator() {
		return (java.lang.String) getStateHelper().eval(DATE_SEPARATOR, null);
	}

	public void setDateSeparator(java.lang.String dateSeparator) {
		getStateHelper().put(DATE_SEPARATOR, dateSeparator);
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

	public java.lang.String getMask() {
		return (java.lang.String) getStateHelper().eval(MASK, null);
	}

	public void setMask(java.lang.String mask) {
		getStateHelper().put(MASK, mask);
	}

	public java.lang.String getNativeMask() {
		return (java.lang.String) getStateHelper().eval(NATIVE_MASK, null);
	}

	public void setNativeMask(java.lang.String nativeMask) {
		getStateHelper().put(NATIVE_MASK, nativeMask);
	}

	public java.lang.String getNativeType() {
		return (java.lang.String) getStateHelper().eval(NATIVE_TYPE, null);
	}

	public void setNativeType(java.lang.String nativeType) {
		getStateHelper().put(NATIVE_TYPE, nativeType);
	}

	public java.lang.Object getValueExtractor() {
		return (java.lang.Object) getStateHelper().eval(VALUE_EXTRACTOR, null);
	}

	public void setValueExtractor(java.lang.Object valueExtractor) {
		getStateHelper().put(VALUE_EXTRACTOR, valueExtractor);
	}

	public java.lang.Object getValueFormatter() {
		return (java.lang.Object) getStateHelper().eval(VALUE_FORMATTER, null);
	}

	public void setValueFormatter(java.lang.Object valueFormatter) {
		getStateHelper().put(VALUE_FORMATTER, valueFormatter);
	}

	public java.lang.String getAfterActiveInputChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_INPUT_CHANGE, null);
	}

	public void setAfterActiveInputChange(java.lang.String afterActiveInputChange) {
		getStateHelper().put(AFTER_ACTIVE_INPUT_CHANGE, afterActiveInputChange);
	}

	public java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	public void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	public java.lang.String getAfterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_CHANGE, null);
	}

	public void setAfterContentChange(java.lang.String afterContentChange) {
		getStateHelper().put(AFTER_CONTENT_CHANGE, afterContentChange);
	}

	public java.lang.String getAfterDateSeparatorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DATE_SEPARATOR_CHANGE, null);
	}

	public void setAfterDateSeparatorChange(java.lang.String afterDateSeparatorChange) {
		getStateHelper().put(AFTER_DATE_SEPARATOR_CHANGE, afterDateSeparatorChange);
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

	public java.lang.String getAfterMaskChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MASK_CHANGE, null);
	}

	public void setAfterMaskChange(java.lang.String afterMaskChange) {
		getStateHelper().put(AFTER_MASK_CHANGE, afterMaskChange);
	}

	public java.lang.String getAfterNativeMaskChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NATIVE_MASK_CHANGE, null);
	}

	public void setAfterNativeMaskChange(java.lang.String afterNativeMaskChange) {
		getStateHelper().put(AFTER_NATIVE_MASK_CHANGE, afterNativeMaskChange);
	}

	public java.lang.String getAfterNativeTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_NATIVE_TYPE_CHANGE, null);
	}

	public void setAfterNativeTypeChange(java.lang.String afterNativeTypeChange) {
		getStateHelper().put(AFTER_NATIVE_TYPE_CHANGE, afterNativeTypeChange);
	}

	public java.lang.String getAfterValueExtractorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_EXTRACTOR_CHANGE, null);
	}

	public void setAfterValueExtractorChange(java.lang.String afterValueExtractorChange) {
		getStateHelper().put(AFTER_VALUE_EXTRACTOR_CHANGE, afterValueExtractorChange);
	}

	public java.lang.String getAfterValueFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_FORMATTER_CHANGE, null);
	}

	public void setAfterValueFormatterChange(java.lang.String afterValueFormatterChange) {
		getStateHelper().put(AFTER_VALUE_FORMATTER_CHANGE, afterValueFormatterChange);
	}

	public java.lang.String getOnActiveInputChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_INPUT_CHANGE, null);
	}

	public void setOnActiveInputChange(java.lang.String onActiveInputChange) {
		getStateHelper().put(ON_ACTIVE_INPUT_CHANGE, onActiveInputChange);
	}

	public java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	public void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	public java.lang.String getOnContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_CHANGE, null);
	}

	public void setOnContentChange(java.lang.String onContentChange) {
		getStateHelper().put(ON_CONTENT_CHANGE, onContentChange);
	}

	public java.lang.String getOnDateSeparatorChange() {
		return (java.lang.String) getStateHelper().eval(ON_DATE_SEPARATOR_CHANGE, null);
	}

	public void setOnDateSeparatorChange(java.lang.String onDateSeparatorChange) {
		getStateHelper().put(ON_DATE_SEPARATOR_CHANGE, onDateSeparatorChange);
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

	public java.lang.String getOnMaskChange() {
		return (java.lang.String) getStateHelper().eval(ON_MASK_CHANGE, null);
	}

	public void setOnMaskChange(java.lang.String onMaskChange) {
		getStateHelper().put(ON_MASK_CHANGE, onMaskChange);
	}

	public java.lang.String getOnNativeMaskChange() {
		return (java.lang.String) getStateHelper().eval(ON_NATIVE_MASK_CHANGE, null);
	}

	public void setOnNativeMaskChange(java.lang.String onNativeMaskChange) {
		getStateHelper().put(ON_NATIVE_MASK_CHANGE, onNativeMaskChange);
	}

	public java.lang.String getOnNativeTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_NATIVE_TYPE_CHANGE, null);
	}

	public void setOnNativeTypeChange(java.lang.String onNativeTypeChange) {
		getStateHelper().put(ON_NATIVE_TYPE_CHANGE, onNativeTypeChange);
	}

	public java.lang.String getOnValueExtractorChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_EXTRACTOR_CHANGE, null);
	}

	public void setOnValueExtractorChange(java.lang.String onValueExtractorChange) {
		getStateHelper().put(ON_VALUE_EXTRACTOR_CHANGE, onValueExtractorChange);
	}

	public java.lang.String getOnValueFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_FORMATTER_CHANGE, null);
	}

	public void setOnValueFormatterChange(java.lang.String onValueFormatterChange) {
		getStateHelper().put(ON_VALUE_FORMATTER_CHANGE, onValueFormatterChange);
	}

}