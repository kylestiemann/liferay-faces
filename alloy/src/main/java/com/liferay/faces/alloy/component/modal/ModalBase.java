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
package com.liferay.faces.alloy.component.modal;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ModalBase extends javax.faces.component.UIPanel {

	private static final String MODAL_BODY_CONTENT = "modalBodyContent";
	private static final String DESTROY_ON_HIDE = "destroyOnHide";
	private static final String DRAGGABLE = "draggable";
	private static final String RESIZABLE = "resizable";
	private static final String TOOLBARS = "toolbars";
	private static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	private static final String AFTER_DESTROY_ON_HIDE_CHANGE = "afterDestroyOnHideChange";
	private static final String AFTER_DRAGGABLE_CHANGE = "afterDraggableChange";
	private static final String AFTER_RESIZABLE_CHANGE = "afterResizableChange";
	private static final String AFTER_TOOLBARS_CHANGE = "afterToolbarsChange";
	private static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	private static final String ON_DESTROY_ON_HIDE_CHANGE = "onDestroyOnHideChange";
	private static final String ON_DRAGGABLE_CHANGE = "onDraggableChange";
	private static final String ON_RESIZABLE_CHANGE = "onResizableChange";
	private static final String ON_TOOLBARS_CHANGE = "onToolbarsChange";

	protected java.lang.String getModalBodyContent() {
		return (java.lang.String) getStateHelper().eval(MODAL_BODY_CONTENT, null);
	}

	protected void setModalBodyContent(java.lang.String modalBodyContent) {
		getStateHelper().put(MODAL_BODY_CONTENT, modalBodyContent);
	}

	protected java.lang.Boolean getDestroyOnHide() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROY_ON_HIDE, null);
	}

	protected void setDestroyOnHide(java.lang.Boolean destroyOnHide) {
		getStateHelper().put(DESTROY_ON_HIDE, destroyOnHide);
	}

	protected java.lang.Object getDraggable() {
		return (java.lang.Object) getStateHelper().eval(DRAGGABLE, null);
	}

	protected void setDraggable(java.lang.Object draggable) {
		getStateHelper().put(DRAGGABLE, draggable);
	}

	protected java.lang.Object getResizable() {
		return (java.lang.Object) getStateHelper().eval(RESIZABLE, null);
	}

	protected void setResizable(java.lang.Object resizable) {
		getStateHelper().put(RESIZABLE, resizable);
	}

	protected java.lang.Object getToolbars() {
		return (java.lang.Object) getStateHelper().eval(TOOLBARS, null);
	}

	protected void setToolbars(java.lang.Object toolbars) {
		getStateHelper().put(TOOLBARS, toolbars);
	}

	protected java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	protected void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	protected java.lang.String getAfterDestroyOnHideChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROY_ON_HIDE_CHANGE, null);
	}

	protected void setAfterDestroyOnHideChange(java.lang.String afterDestroyOnHideChange) {
		getStateHelper().put(AFTER_DESTROY_ON_HIDE_CHANGE, afterDestroyOnHideChange);
	}

	protected java.lang.String getAfterDraggableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DRAGGABLE_CHANGE, null);
	}

	protected void setAfterDraggableChange(java.lang.String afterDraggableChange) {
		getStateHelper().put(AFTER_DRAGGABLE_CHANGE, afterDraggableChange);
	}

	protected java.lang.String getAfterResizableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESIZABLE_CHANGE, null);
	}

	protected void setAfterResizableChange(java.lang.String afterResizableChange) {
		getStateHelper().put(AFTER_RESIZABLE_CHANGE, afterResizableChange);
	}

	protected java.lang.String getAfterToolbarsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBARS_CHANGE, null);
	}

	protected void setAfterToolbarsChange(java.lang.String afterToolbarsChange) {
		getStateHelper().put(AFTER_TOOLBARS_CHANGE, afterToolbarsChange);
	}

	protected java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	protected void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	protected java.lang.String getOnDestroyOnHideChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROY_ON_HIDE_CHANGE, null);
	}

	protected void setOnDestroyOnHideChange(java.lang.String onDestroyOnHideChange) {
		getStateHelper().put(ON_DESTROY_ON_HIDE_CHANGE, onDestroyOnHideChange);
	}

	protected java.lang.String getOnDraggableChange() {
		return (java.lang.String) getStateHelper().eval(ON_DRAGGABLE_CHANGE, null);
	}

	protected void setOnDraggableChange(java.lang.String onDraggableChange) {
		getStateHelper().put(ON_DRAGGABLE_CHANGE, onDraggableChange);
	}

	protected java.lang.String getOnResizableChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESIZABLE_CHANGE, null);
	}

	protected void setOnResizableChange(java.lang.String onResizableChange) {
		getStateHelper().put(ON_RESIZABLE_CHANGE, onResizableChange);
	}

	protected java.lang.String getOnToolbarsChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBARS_CHANGE, null);
	}

	protected void setOnToolbarsChange(java.lang.String onToolbarsChange) {
		getStateHelper().put(ON_TOOLBARS_CHANGE, onToolbarsChange);
	}

}