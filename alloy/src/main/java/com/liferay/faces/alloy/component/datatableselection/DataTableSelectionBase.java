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
package com.liferay.faces.alloy.component.datatableselection;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DataTableSelectionBase extends javax.faces.component.UIPanel {

	private static final String ACTIVE_CELL = "activeCell";
	private static final String ACTIVE_COORD = "activeCoord";
	private static final String ACTIVE_ROW = "activeRow";
	private static final String SELECTION = "selection";
	private static final String TAB_INDEX = "tabIndex";
	private static final String AFTER_ACTIVE_CELL_CHANGE = "afterActiveCellChange";
	private static final String AFTER_ACTIVE_COORD_CHANGE = "afterActiveCoordChange";
	private static final String AFTER_ACTIVE_ROW_CHANGE = "afterActiveRowChange";
	private static final String AFTER_SELECTION_CHANGE = "afterSelectionChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String ON_ACTIVE_CELL_CHANGE = "onActiveCellChange";
	private static final String ON_ACTIVE_COORD_CHANGE = "onActiveCoordChange";
	private static final String ON_ACTIVE_ROW_CHANGE = "onActiveRowChange";
	private static final String ON_SELECTION_CHANGE = "onSelectionChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";

	public java.lang.String getActiveCell() {
		return (java.lang.String) getStateHelper().eval(ACTIVE_CELL, null);
	}

	public void setActiveCell(java.lang.String activeCell) {
		getStateHelper().put(ACTIVE_CELL, activeCell);
	}

	public java.lang.Object getActiveCoord() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_COORD, null);
	}

	public void setActiveCoord(java.lang.Object activeCoord) {
		getStateHelper().put(ACTIVE_COORD, activeCoord);
	}

	public java.lang.String getActiveRow() {
		return (java.lang.String) getStateHelper().eval(ACTIVE_ROW, null);
	}

	public void setActiveRow(java.lang.String activeRow) {
		getStateHelper().put(ACTIVE_ROW, activeRow);
	}

	public java.lang.String getSelection() {
		return (java.lang.String) getStateHelper().eval(SELECTION, null);
	}

	public void setSelection(java.lang.String selection) {
		getStateHelper().put(SELECTION, selection);
	}

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.String getAfterActiveCellChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_CELL_CHANGE, null);
	}

	public void setAfterActiveCellChange(java.lang.String afterActiveCellChange) {
		getStateHelper().put(AFTER_ACTIVE_CELL_CHANGE, afterActiveCellChange);
	}

	public java.lang.String getAfterActiveCoordChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_COORD_CHANGE, null);
	}

	public void setAfterActiveCoordChange(java.lang.String afterActiveCoordChange) {
		getStateHelper().put(AFTER_ACTIVE_COORD_CHANGE, afterActiveCoordChange);
	}

	public java.lang.String getAfterActiveRowChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_ROW_CHANGE, null);
	}

	public void setAfterActiveRowChange(java.lang.String afterActiveRowChange) {
		getStateHelper().put(AFTER_ACTIVE_ROW_CHANGE, afterActiveRowChange);
	}

	public java.lang.String getAfterSelectionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SELECTION_CHANGE, null);
	}

	public void setAfterSelectionChange(java.lang.String afterSelectionChange) {
		getStateHelper().put(AFTER_SELECTION_CHANGE, afterSelectionChange);
	}

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	public java.lang.String getOnActiveCellChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_CELL_CHANGE, null);
	}

	public void setOnActiveCellChange(java.lang.String onActiveCellChange) {
		getStateHelper().put(ON_ACTIVE_CELL_CHANGE, onActiveCellChange);
	}

	public java.lang.String getOnActiveCoordChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_COORD_CHANGE, null);
	}

	public void setOnActiveCoordChange(java.lang.String onActiveCoordChange) {
		getStateHelper().put(ON_ACTIVE_COORD_CHANGE, onActiveCoordChange);
	}

	public java.lang.String getOnActiveRowChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_ROW_CHANGE, null);
	}

	public void setOnActiveRowChange(java.lang.String onActiveRowChange) {
		getStateHelper().put(ON_ACTIVE_ROW_CHANGE, onActiveRowChange);
	}

	public java.lang.String getOnSelectionChange() {
		return (java.lang.String) getStateHelper().eval(ON_SELECTION_CHANGE, null);
	}

	public void setOnSelectionChange(java.lang.String onSelectionChange) {
		getStateHelper().put(ON_SELECTION_CHANGE, onSelectionChange);
	}

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

}