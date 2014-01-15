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
package com.liferay.faces.alloy.component.templateprocessor;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TemplateProcessorBase extends javax.faces.component.UIPanel {

	private static final String DESTROYED = "destroyed";
	private static final String DIRECTIVES = "directives";
	private static final String HOST = "host";
	private static final String INITIALIZED = "initialized";
	private static final String VARIABLES = "variables";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DIRECTIVES_CHANGE = "afterDirectivesChange";
	private static final String AFTER_HOST_CHANGE = "afterHostChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_VARIABLES_CHANGE = "afterVariablesChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DIRECTIVES_CHANGE = "onDirectivesChange";
	private static final String ON_HOST_CHANGE = "onHostChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_VARIABLES_CHANGE = "onVariablesChange";

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Object getDirectives() {
		return (java.lang.Object) getStateHelper().eval(DIRECTIVES, null);
	}

	public void setDirectives(java.lang.Object directives) {
		getStateHelper().put(DIRECTIVES, directives);
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

	public java.lang.Object getVariables() {
		return (java.lang.Object) getStateHelper().eval(VARIABLES, null);
	}

	public void setVariables(java.lang.Object variables) {
		getStateHelper().put(VARIABLES, variables);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDirectivesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DIRECTIVES_CHANGE, null);
	}

	public void setAfterDirectivesChange(java.lang.String afterDirectivesChange) {
		getStateHelper().put(AFTER_DIRECTIVES_CHANGE, afterDirectivesChange);
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

	public java.lang.String getAfterVariablesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VARIABLES_CHANGE, null);
	}

	public void setAfterVariablesChange(java.lang.String afterVariablesChange) {
		getStateHelper().put(AFTER_VARIABLES_CHANGE, afterVariablesChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDirectivesChange() {
		return (java.lang.String) getStateHelper().eval(ON_DIRECTIVES_CHANGE, null);
	}

	public void setOnDirectivesChange(java.lang.String onDirectivesChange) {
		getStateHelper().put(ON_DIRECTIVES_CHANGE, onDirectivesChange);
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

	public java.lang.String getOnVariablesChange() {
		return (java.lang.String) getStateHelper().eval(ON_VARIABLES_CHANGE, null);
	}

	public void setOnVariablesChange(java.lang.String onVariablesChange) {
		getStateHelper().put(ON_VARIABLES_CHANGE, onVariablesChange);
	}

}