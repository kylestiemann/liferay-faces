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
package com.liferay.faces.alloy.component.datatablehighlight;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class DataTableHighlightBase extends javax.faces.component.UIPanel {

	private static final String ACTIVE_BORDER_WIDTH = "activeBorderWidth";
	private static final String HIGHLIGHT_RANGE = "highlightRange";
	private static final String OVERLAY_ACTIVE_NODE = "overlayActiveNode";
	private static final String OVERLAY_NODE = "overlayNode";
	private static final String RANGE_BORDER_WIDTH = "rangeBorderWidth";
	private static final String TYPE = "type";
	private static final String AFTER_ACTIVE_BORDER_WIDTH_CHANGE = "afterActiveBorderWidthChange";
	private static final String AFTER_HIGHLIGHT_RANGE_CHANGE = "afterHighlightRangeChange";
	private static final String AFTER_OVERLAY_ACTIVE_NODE_CHANGE = "afterOverlayActiveNodeChange";
	private static final String AFTER_OVERLAY_NODE_CHANGE = "afterOverlayNodeChange";
	private static final String AFTER_RANGE_BORDER_WIDTH_CHANGE = "afterRangeBorderWidthChange";
	private static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	private static final String ON_ACTIVE_BORDER_WIDTH_CHANGE = "onActiveBorderWidthChange";
	private static final String ON_HIGHLIGHT_RANGE_CHANGE = "onHighlightRangeChange";
	private static final String ON_OVERLAY_ACTIVE_NODE_CHANGE = "onOverlayActiveNodeChange";
	private static final String ON_OVERLAY_NODE_CHANGE = "onOverlayNodeChange";
	private static final String ON_RANGE_BORDER_WIDTH_CHANGE = "onRangeBorderWidthChange";
	private static final String ON_TYPE_CHANGE = "onTypeChange";

	protected java.lang.Object getActiveBorderWidth() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_BORDER_WIDTH, null);
	}

	protected void setActiveBorderWidth(java.lang.Object activeBorderWidth) {
		getStateHelper().put(ACTIVE_BORDER_WIDTH, activeBorderWidth);
	}

	protected java.lang.Boolean getHighlightRange() {
		return (java.lang.Boolean) getStateHelper().eval(HIGHLIGHT_RANGE, null);
	}

	protected void setHighlightRange(java.lang.Boolean highlightRange) {
		getStateHelper().put(HIGHLIGHT_RANGE, highlightRange);
	}

	protected java.lang.String getOverlayActiveNode() {
		return (java.lang.String) getStateHelper().eval(OVERLAY_ACTIVE_NODE, null);
	}

	protected void setOverlayActiveNode(java.lang.String overlayActiveNode) {
		getStateHelper().put(OVERLAY_ACTIVE_NODE, overlayActiveNode);
	}

	protected java.lang.String getOverlayNode() {
		return (java.lang.String) getStateHelper().eval(OVERLAY_NODE, null);
	}

	protected void setOverlayNode(java.lang.String overlayNode) {
		getStateHelper().put(OVERLAY_NODE, overlayNode);
	}

	protected java.lang.Object getRangeBorderWidth() {
		return (java.lang.Object) getStateHelper().eval(RANGE_BORDER_WIDTH, null);
	}

	protected void setRangeBorderWidth(java.lang.Object rangeBorderWidth) {
		getStateHelper().put(RANGE_BORDER_WIDTH, rangeBorderWidth);
	}

	protected java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	protected void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	protected java.lang.String getAfterActiveBorderWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_BORDER_WIDTH_CHANGE, null);
	}

	protected void setAfterActiveBorderWidthChange(java.lang.String afterActiveBorderWidthChange) {
		getStateHelper().put(AFTER_ACTIVE_BORDER_WIDTH_CHANGE, afterActiveBorderWidthChange);
	}

	protected java.lang.String getAfterHighlightRangeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHT_RANGE_CHANGE, null);
	}

	protected void setAfterHighlightRangeChange(java.lang.String afterHighlightRangeChange) {
		getStateHelper().put(AFTER_HIGHLIGHT_RANGE_CHANGE, afterHighlightRangeChange);
	}

	protected java.lang.String getAfterOverlayActiveNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OVERLAY_ACTIVE_NODE_CHANGE, null);
	}

	protected void setAfterOverlayActiveNodeChange(java.lang.String afterOverlayActiveNodeChange) {
		getStateHelper().put(AFTER_OVERLAY_ACTIVE_NODE_CHANGE, afterOverlayActiveNodeChange);
	}

	protected java.lang.String getAfterOverlayNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OVERLAY_NODE_CHANGE, null);
	}

	protected void setAfterOverlayNodeChange(java.lang.String afterOverlayNodeChange) {
		getStateHelper().put(AFTER_OVERLAY_NODE_CHANGE, afterOverlayNodeChange);
	}

	protected java.lang.String getAfterRangeBorderWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RANGE_BORDER_WIDTH_CHANGE, null);
	}

	protected void setAfterRangeBorderWidthChange(java.lang.String afterRangeBorderWidthChange) {
		getStateHelper().put(AFTER_RANGE_BORDER_WIDTH_CHANGE, afterRangeBorderWidthChange);
	}

	protected java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	protected void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	protected java.lang.String getOnActiveBorderWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_BORDER_WIDTH_CHANGE, null);
	}

	protected void setOnActiveBorderWidthChange(java.lang.String onActiveBorderWidthChange) {
		getStateHelper().put(ON_ACTIVE_BORDER_WIDTH_CHANGE, onActiveBorderWidthChange);
	}

	protected java.lang.String getOnHighlightRangeChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHT_RANGE_CHANGE, null);
	}

	protected void setOnHighlightRangeChange(java.lang.String onHighlightRangeChange) {
		getStateHelper().put(ON_HIGHLIGHT_RANGE_CHANGE, onHighlightRangeChange);
	}

	protected java.lang.String getOnOverlayActiveNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_OVERLAY_ACTIVE_NODE_CHANGE, null);
	}

	protected void setOnOverlayActiveNodeChange(java.lang.String onOverlayActiveNodeChange) {
		getStateHelper().put(ON_OVERLAY_ACTIVE_NODE_CHANGE, onOverlayActiveNodeChange);
	}

	protected java.lang.String getOnOverlayNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_OVERLAY_NODE_CHANGE, null);
	}

	protected void setOnOverlayNodeChange(java.lang.String onOverlayNodeChange) {
		getStateHelper().put(ON_OVERLAY_NODE_CHANGE, onOverlayNodeChange);
	}

	protected java.lang.String getOnRangeBorderWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_RANGE_BORDER_WIDTH_CHANGE, null);
	}

	protected void setOnRangeBorderWidthChange(java.lang.String onRangeBorderWidthChange) {
		getStateHelper().put(ON_RANGE_BORDER_WIDTH_CHANGE, onRangeBorderWidthChange);
	}

	protected java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	protected void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

}