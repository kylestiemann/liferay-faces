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
package com.liferay.faces.alloy.component.widgetpositionalignsuggestion;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class WidgetPositionAlignSuggestionBase extends javax.faces.component.UIPanel {

	private static final String ALIGN_NODE = "alignNode";
	private static final String POSITION = "position";
	private static final String AFTER_ALIGN_NODE_CHANGE = "afterAlignNodeChange";
	private static final String AFTER_POSITION_CHANGE = "afterPositionChange";
	private static final String ON_ALIGN_NODE_CHANGE = "onAlignNodeChange";
	private static final String ON_POSITION_CHANGE = "onPositionChange";

	protected java.lang.Object getAlignNode() {
		return (java.lang.Object) getStateHelper().eval(ALIGN_NODE, null);
	}

	protected void setAlignNode(java.lang.Object alignNode) {
		getStateHelper().put(ALIGN_NODE, alignNode);
	}

	protected java.lang.Object getPosition() {
		return (java.lang.Object) getStateHelper().eval(POSITION, null);
	}

	protected void setPosition(java.lang.Object position) {
		getStateHelper().put(POSITION, position);
	}

	protected java.lang.String getAfterAlignNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_NODE_CHANGE, null);
	}

	protected void setAfterAlignNodeChange(java.lang.String afterAlignNodeChange) {
		getStateHelper().put(AFTER_ALIGN_NODE_CHANGE, afterAlignNodeChange);
	}

	protected java.lang.String getAfterPositionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POSITION_CHANGE, null);
	}

	protected void setAfterPositionChange(java.lang.String afterPositionChange) {
		getStateHelper().put(AFTER_POSITION_CHANGE, afterPositionChange);
	}

	protected java.lang.String getOnAlignNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_NODE_CHANGE, null);
	}

	protected void setOnAlignNodeChange(java.lang.String onAlignNodeChange) {
		getStateHelper().put(ON_ALIGN_NODE_CHANGE, onAlignNodeChange);
	}

	protected java.lang.String getOnPositionChange() {
		return (java.lang.String) getStateHelper().eval(ON_POSITION_CHANGE, null);
	}

	protected void setOnPositionChange(java.lang.String onPositionChange) {
		getStateHelper().put(ON_POSITION_CHANGE, onPositionChange);
	}

}