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

	private static final String ANIMATED = "animated";
	private static final String CLOSE_ALL_ON_EXPAND = "closeAllOnExpand";
	private static final String CONTAINER = "container";
	private static final String CONTENT = "content";
	private static final String EXPANDED = "expanded";
	private static final String HEADER = "header";
	private static final String TRANSITION = "transition";
	private static final String AFTER_ANIMATED_CHANGE = "afterAnimatedChange";
	private static final String AFTER_CLOSE_ALL_ON_EXPAND_CHANGE = "afterCloseAllOnExpandChange";
	private static final String AFTER_CONTAINER_CHANGE = "afterContainerChange";
	private static final String AFTER_CONTENT_CHANGE = "afterContentChange";
	private static final String AFTER_EXPANDED_CHANGE = "afterExpandedChange";
	private static final String AFTER_HEADER_CHANGE = "afterHeaderChange";
	private static final String AFTER_TRANSITION_CHANGE = "afterTransitionChange";
	private static final String ON_ANIMATED_CHANGE = "onAnimatedChange";
	private static final String ON_CLOSE_ALL_ON_EXPAND_CHANGE = "onCloseAllOnExpandChange";
	private static final String ON_CONTAINER_CHANGE = "onContainerChange";
	private static final String ON_CONTENT_CHANGE = "onContentChange";
	private static final String ON_EXPANDED_CHANGE = "onExpandedChange";
	private static final String ON_HEADER_CHANGE = "onHeaderChange";
	private static final String ON_TRANSITION_CHANGE = "onTransitionChange";

	protected java.lang.Boolean getAnimated() {
		return (java.lang.Boolean) getStateHelper().eval(ANIMATED, null);
	}

	protected void setAnimated(java.lang.Boolean animated) {
		getStateHelper().put(ANIMATED, animated);
	}

	protected java.lang.Boolean getCloseAllOnExpand() {
		return (java.lang.Boolean) getStateHelper().eval(CLOSE_ALL_ON_EXPAND, null);
	}

	protected void setCloseAllOnExpand(java.lang.Boolean closeAllOnExpand) {
		getStateHelper().put(CLOSE_ALL_ON_EXPAND, closeAllOnExpand);
	}

	protected java.lang.String getContainer() {
		return (java.lang.String) getStateHelper().eval(CONTAINER, null);
	}

	protected void setContainer(java.lang.String container) {
		getStateHelper().put(CONTAINER, container);
	}

	protected java.lang.String getContent() {
		return (java.lang.String) getStateHelper().eval(CONTENT, null);
	}

	protected void setContent(java.lang.String content) {
		getStateHelper().put(CONTENT, content);
	}

	protected java.lang.Boolean getExpanded() {
		return (java.lang.Boolean) getStateHelper().eval(EXPANDED, null);
	}

	protected void setExpanded(java.lang.Boolean expanded) {
		getStateHelper().put(EXPANDED, expanded);
	}

	protected java.lang.String getHeader() {
		return (java.lang.String) getStateHelper().eval(HEADER, null);
	}

	protected void setHeader(java.lang.String header) {
		getStateHelper().put(HEADER, header);
	}

	protected java.lang.Object getTransition() {
		return (java.lang.Object) getStateHelper().eval(TRANSITION, null);
	}

	protected void setTransition(java.lang.Object transition) {
		getStateHelper().put(TRANSITION, transition);
	}

	protected java.lang.String getAfterAnimatedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ANIMATED_CHANGE, null);
	}

	protected void setAfterAnimatedChange(java.lang.String afterAnimatedChange) {
		getStateHelper().put(AFTER_ANIMATED_CHANGE, afterAnimatedChange);
	}

	protected java.lang.String getAfterCloseAllOnExpandChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CLOSE_ALL_ON_EXPAND_CHANGE, null);
	}

	protected void setAfterCloseAllOnExpandChange(java.lang.String afterCloseAllOnExpandChange) {
		getStateHelper().put(AFTER_CLOSE_ALL_ON_EXPAND_CHANGE, afterCloseAllOnExpandChange);
	}

	protected java.lang.String getAfterContainerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTAINER_CHANGE, null);
	}

	protected void setAfterContainerChange(java.lang.String afterContainerChange) {
		getStateHelper().put(AFTER_CONTAINER_CHANGE, afterContainerChange);
	}

	protected java.lang.String getAfterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_CHANGE, null);
	}

	protected void setAfterContentChange(java.lang.String afterContentChange) {
		getStateHelper().put(AFTER_CONTENT_CHANGE, afterContentChange);
	}

	protected java.lang.String getAfterExpandedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_EXPANDED_CHANGE, null);
	}

	protected void setAfterExpandedChange(java.lang.String afterExpandedChange) {
		getStateHelper().put(AFTER_EXPANDED_CHANGE, afterExpandedChange);
	}

	protected java.lang.String getAfterHeaderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_CHANGE, null);
	}

	protected void setAfterHeaderChange(java.lang.String afterHeaderChange) {
		getStateHelper().put(AFTER_HEADER_CHANGE, afterHeaderChange);
	}

	protected java.lang.String getAfterTransitionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRANSITION_CHANGE, null);
	}

	protected void setAfterTransitionChange(java.lang.String afterTransitionChange) {
		getStateHelper().put(AFTER_TRANSITION_CHANGE, afterTransitionChange);
	}

	protected java.lang.String getOnAnimatedChange() {
		return (java.lang.String) getStateHelper().eval(ON_ANIMATED_CHANGE, null);
	}

	protected void setOnAnimatedChange(java.lang.String onAnimatedChange) {
		getStateHelper().put(ON_ANIMATED_CHANGE, onAnimatedChange);
	}

	protected java.lang.String getOnCloseAllOnExpandChange() {
		return (java.lang.String) getStateHelper().eval(ON_CLOSE_ALL_ON_EXPAND_CHANGE, null);
	}

	protected void setOnCloseAllOnExpandChange(java.lang.String onCloseAllOnExpandChange) {
		getStateHelper().put(ON_CLOSE_ALL_ON_EXPAND_CHANGE, onCloseAllOnExpandChange);
	}

	protected java.lang.String getOnContainerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTAINER_CHANGE, null);
	}

	protected void setOnContainerChange(java.lang.String onContainerChange) {
		getStateHelper().put(ON_CONTAINER_CHANGE, onContainerChange);
	}

	protected java.lang.String getOnContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_CHANGE, null);
	}

	protected void setOnContentChange(java.lang.String onContentChange) {
		getStateHelper().put(ON_CONTENT_CHANGE, onContentChange);
	}

	protected java.lang.String getOnExpandedChange() {
		return (java.lang.String) getStateHelper().eval(ON_EXPANDED_CHANGE, null);
	}

	protected void setOnExpandedChange(java.lang.String onExpandedChange) {
		getStateHelper().put(ON_EXPANDED_CHANGE, onExpandedChange);
	}

	protected java.lang.String getOnHeaderChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_CHANGE, null);
	}

	protected void setOnHeaderChange(java.lang.String onHeaderChange) {
		getStateHelper().put(ON_HEADER_CHANGE, onHeaderChange);
	}

	protected java.lang.String getOnTransitionChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRANSITION_CHANGE, null);
	}

	protected void setOnTransitionChange(java.lang.String onTransitionChange) {
		getStateHelper().put(ON_TRANSITION_CHANGE, onTransitionChange);
	}

}