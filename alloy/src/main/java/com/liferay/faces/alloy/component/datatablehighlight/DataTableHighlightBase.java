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

	public static final String ACTIVE_BORDER_WIDTH = "activeBorderWidth";
	public static final String DESTROYED = "destroyed";
	public static final String HIGHLIGHT_RANGE = "highlightRange";
	public static final String HOST = "host";
	public static final String INITIALIZED = "initialized";
	public static final String OVERLAY_ACTIVE_NODE = "overlayActiveNode";
	public static final String OVERLAY_NODE = "overlayNode";
	public static final String RANGE_BORDER_WIDTH = "rangeBorderWidth";
	public static final String TYPE = "type";
	public static final String AFTER_ACTIVE_BORDER_WIDTH_CHANGE = "afterActiveBorderWidthChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_HIGHLIGHT_RANGE_CHANGE = "afterHighlightRangeChange";
	public static final String AFTER_HOST_CHANGE = "afterHostChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_OVERLAY_ACTIVE_NODE_CHANGE = "afterOverlayActiveNodeChange";
	public static final String AFTER_OVERLAY_NODE_CHANGE = "afterOverlayNodeChange";
	public static final String AFTER_RANGE_BORDER_WIDTH_CHANGE = "afterRangeBorderWidthChange";
	public static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	public static final String ON_ACTIVE_BORDER_WIDTH_CHANGE = "onActiveBorderWidthChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_HIGHLIGHT_RANGE_CHANGE = "onHighlightRangeChange";
	public static final String ON_HOST_CHANGE = "onHostChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_OVERLAY_ACTIVE_NODE_CHANGE = "onOverlayActiveNodeChange";
	public static final String ON_OVERLAY_NODE_CHANGE = "onOverlayNodeChange";
	public static final String ON_RANGE_BORDER_WIDTH_CHANGE = "onRangeBorderWidthChange";
	public static final String ON_TYPE_CHANGE = "onTypeChange";

	public java.lang.Object getActiveBorderWidth() {
		return (java.lang.Object) getStateHelper().eval(ACTIVE_BORDER_WIDTH, null);
	}

	public void setActiveBorderWidth(java.lang.Object activeBorderWidth) {
		getStateHelper().put(ACTIVE_BORDER_WIDTH, activeBorderWidth);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getHighlightRange() {
		return (java.lang.Boolean) getStateHelper().eval(HIGHLIGHT_RANGE, null);
	}

	public void setHighlightRange(java.lang.Boolean highlightRange) {
		getStateHelper().put(HIGHLIGHT_RANGE, highlightRange);
	}

	public java.lang.Object getHost() {
		return (java.lang.Object) getStateHelper().eval(HOST, null);
	}

	public void setHost(java.lang.Object host) {
		getStateHelper().put(HOST, host);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getOverlayActiveNode() {
		return (java.lang.String) getStateHelper().eval(OVERLAY_ACTIVE_NODE, null);
	}

	public void setOverlayActiveNode(java.lang.String overlayActiveNode) {
		getStateHelper().put(OVERLAY_ACTIVE_NODE, overlayActiveNode);
	}

	public java.lang.String getOverlayNode() {
		return (java.lang.String) getStateHelper().eval(OVERLAY_NODE, null);
	}

	public void setOverlayNode(java.lang.String overlayNode) {
		getStateHelper().put(OVERLAY_NODE, overlayNode);
	}

	public java.lang.Object getRangeBorderWidth() {
		return (java.lang.Object) getStateHelper().eval(RANGE_BORDER_WIDTH, null);
	}

	public void setRangeBorderWidth(java.lang.Object rangeBorderWidth) {
		getStateHelper().put(RANGE_BORDER_WIDTH, rangeBorderWidth);
	}

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	public void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	public java.lang.String getAfterActiveBorderWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ACTIVE_BORDER_WIDTH_CHANGE, null);
	}

	public void setAfterActiveBorderWidthChange(java.lang.String afterActiveBorderWidthChange) {
		getStateHelper().put(AFTER_ACTIVE_BORDER_WIDTH_CHANGE, afterActiveBorderWidthChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterHighlightRangeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIGHLIGHT_RANGE_CHANGE, null);
	}

	public void setAfterHighlightRangeChange(java.lang.String afterHighlightRangeChange) {
		getStateHelper().put(AFTER_HIGHLIGHT_RANGE_CHANGE, afterHighlightRangeChange);
	}

	public java.lang.String getAfterHostChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HOST_CHANGE, null);
	}

	public void setAfterHostChange(java.lang.String afterHostChange) {
		getStateHelper().put(AFTER_HOST_CHANGE, afterHostChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterOverlayActiveNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OVERLAY_ACTIVE_NODE_CHANGE, null);
	}

	public void setAfterOverlayActiveNodeChange(java.lang.String afterOverlayActiveNodeChange) {
		getStateHelper().put(AFTER_OVERLAY_ACTIVE_NODE_CHANGE, afterOverlayActiveNodeChange);
	}

	public java.lang.String getAfterOverlayNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OVERLAY_NODE_CHANGE, null);
	}

	public void setAfterOverlayNodeChange(java.lang.String afterOverlayNodeChange) {
		getStateHelper().put(AFTER_OVERLAY_NODE_CHANGE, afterOverlayNodeChange);
	}

	public java.lang.String getAfterRangeBorderWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RANGE_BORDER_WIDTH_CHANGE, null);
	}

	public void setAfterRangeBorderWidthChange(java.lang.String afterRangeBorderWidthChange) {
		getStateHelper().put(AFTER_RANGE_BORDER_WIDTH_CHANGE, afterRangeBorderWidthChange);
	}

	public java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	public void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	public java.lang.String getOnActiveBorderWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_ACTIVE_BORDER_WIDTH_CHANGE, null);
	}

	public void setOnActiveBorderWidthChange(java.lang.String onActiveBorderWidthChange) {
		getStateHelper().put(ON_ACTIVE_BORDER_WIDTH_CHANGE, onActiveBorderWidthChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnHighlightRangeChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIGHLIGHT_RANGE_CHANGE, null);
	}

	public void setOnHighlightRangeChange(java.lang.String onHighlightRangeChange) {
		getStateHelper().put(ON_HIGHLIGHT_RANGE_CHANGE, onHighlightRangeChange);
	}

	public java.lang.String getOnHostChange() {
		return (java.lang.String) getStateHelper().eval(ON_HOST_CHANGE, null);
	}

	public void setOnHostChange(java.lang.String onHostChange) {
		getStateHelper().put(ON_HOST_CHANGE, onHostChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnOverlayActiveNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_OVERLAY_ACTIVE_NODE_CHANGE, null);
	}

	public void setOnOverlayActiveNodeChange(java.lang.String onOverlayActiveNodeChange) {
		getStateHelper().put(ON_OVERLAY_ACTIVE_NODE_CHANGE, onOverlayActiveNodeChange);
	}

	public java.lang.String getOnOverlayNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_OVERLAY_NODE_CHANGE, null);
	}

	public void setOnOverlayNodeChange(java.lang.String onOverlayNodeChange) {
		getStateHelper().put(ON_OVERLAY_NODE_CHANGE, onOverlayNodeChange);
	}

	public java.lang.String getOnRangeBorderWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_RANGE_BORDER_WIDTH_CHANGE, null);
	}

	public void setOnRangeBorderWidthChange(java.lang.String onRangeBorderWidthChange) {
		getStateHelper().put(ON_RANGE_BORDER_WIDTH_CHANGE, onRangeBorderWidthChange);
	}

	public java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	public void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

}