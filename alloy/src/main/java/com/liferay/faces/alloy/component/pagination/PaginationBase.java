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
package com.liferay.faces.alloy.component.pagination;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class PaginationBase extends javax.faces.component.UIPanel {

	private static final String CIRCULAR = "circular";
	private static final String CSS_CLASS = "cssClass";
	private static final String FORMATTER = "formatter";
	private static final String HIDE_CLASS = "hideClass";
	private static final String ITEMS = "items";
	private static final String OFFSET = "offset";
	private static final String PAGINATION_PAGE = "paginationPage";
	private static final String RENDER = "render";
	private static final String STRINGS = "strings";
	private static final String TOTAL = "total";
	private static final String USE_ARIA = "useARIA";
	private static final String AFTER_CIRCULAR_CHANGE = "afterCircularChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_FORMATTER_CHANGE = "afterFormatterChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_ITEMS_CHANGE = "afterItemsChange";
	private static final String AFTER_OFFSET_CHANGE = "afterOffsetChange";
	private static final String AFTER_PAGE_CHANGE = "afterPageChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TOTAL_CHANGE = "afterTotalChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String ON_CIRCULAR_CHANGE = "onCircularChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_FORMATTER_CHANGE = "onFormatterChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_ITEMS_CHANGE = "onItemsChange";
	private static final String ON_OFFSET_CHANGE = "onOffsetChange";
	private static final String ON_PAGE_CHANGE = "onPageChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TOTAL_CHANGE = "onTotalChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";

	protected java.lang.Boolean getCircular() {
		return (java.lang.Boolean) getStateHelper().eval(CIRCULAR, null);
	}

	protected void setCircular(java.lang.Boolean circular) {
		getStateHelper().put(CIRCULAR, circular);
	}

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Object getFormatter() {
		return (java.lang.Object) getStateHelper().eval(FORMATTER, null);
	}

	protected void setFormatter(java.lang.Object formatter) {
		getStateHelper().put(FORMATTER, formatter);
	}

	protected java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	protected void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	protected java.lang.Object getItems() {
		return (java.lang.Object) getStateHelper().eval(ITEMS, null);
	}

	protected void setItems(java.lang.Object items) {
		getStateHelper().put(ITEMS, items);
	}

	protected java.lang.Object getOffset() {
		return (java.lang.Object) getStateHelper().eval(OFFSET, null);
	}

	protected void setOffset(java.lang.Object offset) {
		getStateHelper().put(OFFSET, offset);
	}

	protected java.lang.Object getPaginationPage() {
		return (java.lang.Object) getStateHelper().eval(PAGINATION_PAGE, null);
	}

	protected void setPaginationPage(java.lang.Object paginationPage) {
		getStateHelper().put(PAGINATION_PAGE, paginationPage);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.Object getTotal() {
		return (java.lang.Object) getStateHelper().eval(TOTAL, null);
	}

	protected void setTotal(java.lang.Object total) {
		getStateHelper().put(TOTAL, total);
	}

	protected java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	protected void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	protected java.lang.String getAfterCircularChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CIRCULAR_CHANGE, null);
	}

	protected void setAfterCircularChange(java.lang.String afterCircularChange) {
		getStateHelper().put(AFTER_CIRCULAR_CHANGE, afterCircularChange);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FORMATTER_CHANGE, null);
	}

	protected void setAfterFormatterChange(java.lang.String afterFormatterChange) {
		getStateHelper().put(AFTER_FORMATTER_CHANGE, afterFormatterChange);
	}

	protected java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	protected void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	protected java.lang.String getAfterItemsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ITEMS_CHANGE, null);
	}

	protected void setAfterItemsChange(java.lang.String afterItemsChange) {
		getStateHelper().put(AFTER_ITEMS_CHANGE, afterItemsChange);
	}

	protected java.lang.String getAfterOffsetChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OFFSET_CHANGE, null);
	}

	protected void setAfterOffsetChange(java.lang.String afterOffsetChange) {
		getStateHelper().put(AFTER_OFFSET_CHANGE, afterOffsetChange);
	}

	protected java.lang.String getAfterPageChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PAGE_CHANGE, null);
	}

	protected void setAfterPageChange(java.lang.String afterPageChange) {
		getStateHelper().put(AFTER_PAGE_CHANGE, afterPageChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterTotalChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOTAL_CHANGE, null);
	}

	protected void setAfterTotalChange(java.lang.String afterTotalChange) {
		getStateHelper().put(AFTER_TOTAL_CHANGE, afterTotalChange);
	}

	protected java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	protected void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	protected java.lang.String getOnCircularChange() {
		return (java.lang.String) getStateHelper().eval(ON_CIRCULAR_CHANGE, null);
	}

	protected void setOnCircularChange(java.lang.String onCircularChange) {
		getStateHelper().put(ON_CIRCULAR_CHANGE, onCircularChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_FORMATTER_CHANGE, null);
	}

	protected void setOnFormatterChange(java.lang.String onFormatterChange) {
		getStateHelper().put(ON_FORMATTER_CHANGE, onFormatterChange);
	}

	protected java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	protected void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	protected java.lang.String getOnItemsChange() {
		return (java.lang.String) getStateHelper().eval(ON_ITEMS_CHANGE, null);
	}

	protected void setOnItemsChange(java.lang.String onItemsChange) {
		getStateHelper().put(ON_ITEMS_CHANGE, onItemsChange);
	}

	protected java.lang.String getOnOffsetChange() {
		return (java.lang.String) getStateHelper().eval(ON_OFFSET_CHANGE, null);
	}

	protected void setOnOffsetChange(java.lang.String onOffsetChange) {
		getStateHelper().put(ON_OFFSET_CHANGE, onOffsetChange);
	}

	protected java.lang.String getOnPageChange() {
		return (java.lang.String) getStateHelper().eval(ON_PAGE_CHANGE, null);
	}

	protected void setOnPageChange(java.lang.String onPageChange) {
		getStateHelper().put(ON_PAGE_CHANGE, onPageChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnTotalChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOTAL_CHANGE, null);
	}

	protected void setOnTotalChange(java.lang.String onTotalChange) {
		getStateHelper().put(ON_TOTAL_CHANGE, onTotalChange);
	}

	protected java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	protected void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

}