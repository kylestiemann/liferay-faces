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
package com.liferay.faces.alloy.component.autocompletebase;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AutoCompleteBaseBase extends javax.faces.component.UIPanel {

	private static final String FILL_MODE = "fillMode";
	private static final String FILTERS = "filters";
	private static final String PROCESSOR = "processor";
	private static final String SHOW_LIST_KEY = "showListKey";
	private static final String SORTERS = "sorters";
	private static final String AFTER_FILL_MODE_CHANGE = "afterFillModeChange";
	private static final String AFTER_FILTERS_CHANGE = "afterFiltersChange";
	private static final String AFTER_PROCESSOR_CHANGE = "afterProcessorChange";
	private static final String AFTER_SHOW_LIST_KEY_CHANGE = "afterShowListKeyChange";
	private static final String AFTER_SORTERS_CHANGE = "afterSortersChange";
	private static final String ON_FILL_MODE_CHANGE = "onFillModeChange";
	private static final String ON_FILTERS_CHANGE = "onFiltersChange";
	private static final String ON_PROCESSOR_CHANGE = "onProcessorChange";
	private static final String ON_SHOW_LIST_KEY_CHANGE = "onShowListKeyChange";
	private static final String ON_SORTERS_CHANGE = "onSortersChange";

	protected java.lang.Object getFillMode() {
		return (java.lang.Object) getStateHelper().eval(FILL_MODE, null);
	}

	protected void setFillMode(java.lang.Object fillMode) {
		getStateHelper().put(FILL_MODE, fillMode);
	}

	protected java.lang.Object getFilters() {
		return (java.lang.Object) getStateHelper().eval(FILTERS, null);
	}

	protected void setFilters(java.lang.Object filters) {
		getStateHelper().put(FILTERS, filters);
	}

	protected java.lang.Object getProcessor() {
		return (java.lang.Object) getStateHelper().eval(PROCESSOR, null);
	}

	protected void setProcessor(java.lang.Object processor) {
		getStateHelper().put(PROCESSOR, processor);
	}

	protected java.lang.Object getShowListKey() {
		return (java.lang.Object) getStateHelper().eval(SHOW_LIST_KEY, null);
	}

	protected void setShowListKey(java.lang.Object showListKey) {
		getStateHelper().put(SHOW_LIST_KEY, showListKey);
	}

	protected java.lang.Object getSorters() {
		return (java.lang.Object) getStateHelper().eval(SORTERS, null);
	}

	protected void setSorters(java.lang.Object sorters) {
		getStateHelper().put(SORTERS, sorters);
	}

	protected java.lang.String getAfterFillModeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILL_MODE_CHANGE, null);
	}

	protected void setAfterFillModeChange(java.lang.String afterFillModeChange) {
		getStateHelper().put(AFTER_FILL_MODE_CHANGE, afterFillModeChange);
	}

	protected java.lang.String getAfterFiltersChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILTERS_CHANGE, null);
	}

	protected void setAfterFiltersChange(java.lang.String afterFiltersChange) {
		getStateHelper().put(AFTER_FILTERS_CHANGE, afterFiltersChange);
	}

	protected java.lang.String getAfterProcessorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PROCESSOR_CHANGE, null);
	}

	protected void setAfterProcessorChange(java.lang.String afterProcessorChange) {
		getStateHelper().put(AFTER_PROCESSOR_CHANGE, afterProcessorChange);
	}

	protected java.lang.String getAfterShowListKeyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHOW_LIST_KEY_CHANGE, null);
	}

	protected void setAfterShowListKeyChange(java.lang.String afterShowListKeyChange) {
		getStateHelper().put(AFTER_SHOW_LIST_KEY_CHANGE, afterShowListKeyChange);
	}

	protected java.lang.String getAfterSortersChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SORTERS_CHANGE, null);
	}

	protected void setAfterSortersChange(java.lang.String afterSortersChange) {
		getStateHelper().put(AFTER_SORTERS_CHANGE, afterSortersChange);
	}

	protected java.lang.String getOnFillModeChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILL_MODE_CHANGE, null);
	}

	protected void setOnFillModeChange(java.lang.String onFillModeChange) {
		getStateHelper().put(ON_FILL_MODE_CHANGE, onFillModeChange);
	}

	protected java.lang.String getOnFiltersChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILTERS_CHANGE, null);
	}

	protected void setOnFiltersChange(java.lang.String onFiltersChange) {
		getStateHelper().put(ON_FILTERS_CHANGE, onFiltersChange);
	}

	protected java.lang.String getOnProcessorChange() {
		return (java.lang.String) getStateHelper().eval(ON_PROCESSOR_CHANGE, null);
	}

	protected void setOnProcessorChange(java.lang.String onProcessorChange) {
		getStateHelper().put(ON_PROCESSOR_CHANGE, onProcessorChange);
	}

	protected java.lang.String getOnShowListKeyChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHOW_LIST_KEY_CHANGE, null);
	}

	protected void setOnShowListKeyChange(java.lang.String onShowListKeyChange) {
		getStateHelper().put(ON_SHOW_LIST_KEY_CHANGE, onShowListKeyChange);
	}

	protected java.lang.String getOnSortersChange() {
		return (java.lang.String) getStateHelper().eval(ON_SORTERS_CHANGE, null);
	}

	protected void setOnSortersChange(java.lang.String onSortersChange) {
		getStateHelper().put(ON_SORTERS_CHANGE, onSortersChange);
	}

}