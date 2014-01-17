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
package com.liferay.faces.alloy.component.togglerdelegate;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TogglerDelegateBase extends javax.faces.component.UIPanel {

	public static final String ANIMATED = "animated";
	public static final String CLOSE_ALL_ON_EXPAND = "closeAllOnExpand";
	public static final String CONTAINER = "container";
	public static final String CONTENT = "content";
	public static final String DESTROYED = "destroyed";
	public static final String EXPANDED = "expanded";
	public static final String HEADER = "header";
	public static final String INITIALIZED = "initialized";
	public static final String TRANSITION = "transition";
	public static final String AFTER_ANIMATED_CHANGE = "afterAnimatedChange";
	public static final String AFTER_CLOSE_ALL_ON_EXPAND_CHANGE = "afterCloseAllOnExpandChange";
	public static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	public static final String AFTER_CONTENT_CHANGE = "afterContentChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_EXPANDED_CHANGE = "afterExpandedChange";
	public static final String AFTER_HEADER_CHANGE = "afterHeaderChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_TRANSITION_CHANGE = "afterTransitionChange";
	public static final String ON_ANIMATED_CHANGE = "onAnimatedChange";
	public static final String ON_CLOSE_ALL_ON_EXPAND_CHANGE = "onCloseAllOnExpandChange";
	public static final String ON_CONTAINER_CHANGE = "onContainerChange";
	public static final String ON_CONTENT_CHANGE = "onContentChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_EXPANDED_CHANGE = "onExpandedChange";
	public static final String ON_HEADER_CHANGE = "onHeaderChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_TRANSITION_CHANGE = "onTransitionChange";

	public java.lang.Boolean getAnimated() {
		return (java.lang.Boolean) getStateHelper().eval(ANIMATED, null);
	}

	public void setAnimated(java.lang.Boolean animated) {
		getStateHelper().put(ANIMATED, animated);
	}

	public java.lang.Boolean getCloseAllOnExpand() {
		return (java.lang.Boolean) getStateHelper().eval(CLOSE_ALL_ON_EXPAND, null);
	}

	public void setCloseAllOnExpand(java.lang.Boolean closeAllOnExpand) {
		getStateHelper().put(CLOSE_ALL_ON_EXPAND, closeAllOnExpand);
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

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getExpanded() {
		return (java.lang.Boolean) getStateHelper().eval(EXPANDED, null);
	}

	public void setExpanded(java.lang.Boolean expanded) {
		getStateHelper().put(EXPANDED, expanded);
	}

	public java.lang.String getHeader() {
		return (java.lang.String) getStateHelper().eval(HEADER, null);
	}

	public void setHeader(java.lang.String header) {
		getStateHelper().put(HEADER, header);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.Object getTransition() {
		return (java.lang.Object) getStateHelper().eval(TRANSITION, null);
	}

	public void setTransition(java.lang.Object transition) {
		getStateHelper().put(TRANSITION, transition);
	}

	public java.lang.String getAfterAnimatedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ANIMATED_CHANGE, null);
	}

	public void setAfterAnimatedChange(java.lang.String afterAnimatedChange) {
		getStateHelper().put(AFTER_ANIMATED_CHANGE, afterAnimatedChange);
	}

	public java.lang.String getAfterCloseAllOnExpandChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CLOSE_ALL_ON_EXPAND_CHANGE, null);
	}

	public void setAfterCloseAllOnExpandChange(java.lang.String afterCloseAllOnExpandChange) {
		getStateHelper().put(AFTER_CLOSE_ALL_ON_EXPAND_CHANGE, afterCloseAllOnExpandChange);
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

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterExpandedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EXPANDED_CHANGE, null);
	}

	public void setAfterExpandedChange(java.lang.String afterExpandedChange) {
		getStateHelper().put(AFTER_EXPANDED_CHANGE, afterExpandedChange);
	}

	public java.lang.String getAfterHeaderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_CHANGE, null);
	}

	public void setAfterHeaderChange(java.lang.String afterHeaderChange) {
		getStateHelper().put(AFTER_HEADER_CHANGE, afterHeaderChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterTransitionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRANSITION_CHANGE, null);
	}

	public void setAfterTransitionChange(java.lang.String afterTransitionChange) {
		getStateHelper().put(AFTER_TRANSITION_CHANGE, afterTransitionChange);
	}

	public java.lang.String getOnAnimatedChange() {
		return (java.lang.String) getStateHelper().eval(ON_ANIMATED_CHANGE, null);
	}

	public void setOnAnimatedChange(java.lang.String onAnimatedChange) {
		getStateHelper().put(ON_ANIMATED_CHANGE, onAnimatedChange);
	}

	public java.lang.String getOnCloseAllOnExpandChange() {
		return (java.lang.String) getStateHelper().eval(ON_CLOSE_ALL_ON_EXPAND_CHANGE, null);
	}

	public void setOnCloseAllOnExpandChange(java.lang.String onCloseAllOnExpandChange) {
		getStateHelper().put(ON_CLOSE_ALL_ON_EXPAND_CHANGE, onCloseAllOnExpandChange);
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

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnExpandedChange() {
		return (java.lang.String) getStateHelper().eval(ON_EXPANDED_CHANGE, null);
	}

	public void setOnExpandedChange(java.lang.String onExpandedChange) {
		getStateHelper().put(ON_EXPANDED_CHANGE, onExpandedChange);
	}

	public java.lang.String getOnHeaderChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_CHANGE, null);
	}

	public void setOnHeaderChange(java.lang.String onHeaderChange) {
		getStateHelper().put(ON_HEADER_CHANGE, onHeaderChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnTransitionChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRANSITION_CHANGE, null);
	}

	public void setOnTransitionChange(java.lang.String onTransitionChange) {
		getStateHelper().put(ON_TRANSITION_CHANGE, onTransitionChange);
	}

}