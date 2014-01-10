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
package com.liferay.faces.alloy.component.colorpalette;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ColorPaletteBase extends javax.faces.component.UIPanel {

	private static final String COLUMNS = "columns";
	private static final String CONTAINER_NODE = "containerNode";
	private static final String FORMATTER = "formatter";
	private static final String ITEMS = "items";
	private static final String SELECTED = "selected";
	private static final String TOGGLE_SELECTION = "toggleSelection";
	private static final String AFTER_COLUMNS_CHANGE = "afterColumnsChange";
	private static final String AFTER_CONTAINER_NODE_CHANGE = "afterContainerNodeChange";
	private static final String AFTER_FORMATTER_CHANGE = "afterFormatterChange";
	private static final String AFTER_ITEMS_CHANGE = "afterItemsChange";
	private static final String AFTER_SELECTED_CHANGE = "afterSelectedChange";
	private static final String AFTER_TOGGLE_SELECTION_CHANGE = "afterToggleSelectionChange";
	private static final String ON_COLUMNS_CHANGE = "onColumnsChange";
	private static final String ON_CONTAINER_NODE_CHANGE = "onContainerNodeChange";
	private static final String ON_FORMATTER_CHANGE = "onFormatterChange";
	private static final String ON_ITEMS_CHANGE = "onItemsChange";
	private static final String ON_SELECTED_CHANGE = "onSelectedChange";
	private static final String ON_TOGGLE_SELECTION_CHANGE = "onToggleSelectionChange";

	protected java.lang.Object getColumns() {
		return (java.lang.Object) getStateHelper().eval(COLUMNS, null);
	}

	protected void setColumns(java.lang.Object columns) {
		getStateHelper().put(COLUMNS, columns);
	}

	protected java.lang.Object getContainerNode() {
		return (java.lang.Object) getStateHelper().eval(CONTAINER_NODE, null);
	}

	protected void setContainerNode(java.lang.Object containerNode) {
		getStateHelper().put(CONTAINER_NODE, containerNode);
	}

	protected java.lang.Object getFormatter() {
		return (java.lang.Object) getStateHelper().eval(FORMATTER, null);
	}

	protected void setFormatter(java.lang.Object formatter) {
		getStateHelper().put(FORMATTER, formatter);
	}

	protected java.lang.Object getItems() {
		return (java.lang.Object) getStateHelper().eval(ITEMS, null);
	}

	protected void setItems(java.lang.Object items) {
		getStateHelper().put(ITEMS, items);
	}

	protected java.lang.Object getSelected() {
		return (java.lang.Object) getStateHelper().eval(SELECTED, null);
	}

	protected void setSelected(java.lang.Object selected) {
		getStateHelper().put(SELECTED, selected);
	}

	protected java.lang.Boolean getToggleSelection() {
		return (java.lang.Boolean) getStateHelper().eval(TOGGLE_SELECTION, null);
	}

	protected void setToggleSelection(java.lang.Boolean toggleSelection) {
		getStateHelper().put(TOGGLE_SELECTION, toggleSelection);
	}

	protected java.lang.String getAfterColumnsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLUMNS_CHANGE, null);
	}

	protected void setAfterColumnsChange(java.lang.String afterColumnsChange) {
		getStateHelper().put(AFTER_COLUMNS_CHANGE, afterColumnsChange);
	}

	protected java.lang.String getAfterContainerNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_NODE_CHANGE, null);
	}

	protected void setAfterContainerNodeChange(java.lang.String afterContainerNodeChange) {
		getStateHelper().put(AFTER_CONTAINER_NODE_CHANGE, afterContainerNodeChange);
	}

	protected java.lang.String getAfterFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FORMATTER_CHANGE, null);
	}

	protected void setAfterFormatterChange(java.lang.String afterFormatterChange) {
		getStateHelper().put(AFTER_FORMATTER_CHANGE, afterFormatterChange);
	}

	protected java.lang.String getAfterItemsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ITEMS_CHANGE, null);
	}

	protected void setAfterItemsChange(java.lang.String afterItemsChange) {
		getStateHelper().put(AFTER_ITEMS_CHANGE, afterItemsChange);
	}

	protected java.lang.String getAfterSelectedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTED_CHANGE, null);
	}

	protected void setAfterSelectedChange(java.lang.String afterSelectedChange) {
		getStateHelper().put(AFTER_SELECTED_CHANGE, afterSelectedChange);
	}

	protected java.lang.String getAfterToggleSelectionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOGGLE_SELECTION_CHANGE, null);
	}

	protected void setAfterToggleSelectionChange(java.lang.String afterToggleSelectionChange) {
		getStateHelper().put(AFTER_TOGGLE_SELECTION_CHANGE, afterToggleSelectionChange);
	}

	protected java.lang.String getOnColumnsChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLUMNS_CHANGE, null);
	}

	protected void setOnColumnsChange(java.lang.String onColumnsChange) {
		getStateHelper().put(ON_COLUMNS_CHANGE, onColumnsChange);
	}

	protected java.lang.String getOnContainerNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_NODE_CHANGE, null);
	}

	protected void setOnContainerNodeChange(java.lang.String onContainerNodeChange) {
		getStateHelper().put(ON_CONTAINER_NODE_CHANGE, onContainerNodeChange);
	}

	protected java.lang.String getOnFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_FORMATTER_CHANGE, null);
	}

	protected void setOnFormatterChange(java.lang.String onFormatterChange) {
		getStateHelper().put(ON_FORMATTER_CHANGE, onFormatterChange);
	}

	protected java.lang.String getOnItemsChange() {
		return (java.lang.String) getStateHelper().eval(ON_ITEMS_CHANGE, null);
	}

	protected void setOnItemsChange(java.lang.String onItemsChange) {
		getStateHelper().put(ON_ITEMS_CHANGE, onItemsChange);
	}

	protected java.lang.String getOnSelectedChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTED_CHANGE, null);
	}

	protected void setOnSelectedChange(java.lang.String onSelectedChange) {
		getStateHelper().put(ON_SELECTED_CHANGE, onSelectedChange);
	}

	protected java.lang.String getOnToggleSelectionChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOGGLE_SELECTION_CHANGE, null);
	}

	protected void setOnToggleSelectionChange(java.lang.String onToggleSelectionChange) {
		getStateHelper().put(ON_TOGGLE_SELECTION_CHANGE, onToggleSelectionChange);
	}

}