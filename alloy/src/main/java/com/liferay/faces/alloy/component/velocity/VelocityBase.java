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
package com.liferay.faces.alloy.component.velocity;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class VelocityBase extends javax.faces.component.UIPanel {

	private static final String DIRECTIVES = "directives";
	private static final String DIRECTIVES_MATCHER = "directivesMatcher";
	private static final String HOST = "host";
	private static final String VARIABLES = "variables";
	private static final String VARIABLES_MATCHER = "variablesMatcher";
	private static final String AFTER_DIRECTIVES_CHANGE = "afterDirectivesChange";
	private static final String AFTER_DIRECTIVES_MATCHER_CHANGE = "afterDirectivesMatcherChange";
	private static final String AFTER_HOST_CHANGE = "afterHostChange";
	private static final String AFTER_VARIABLES_CHANGE = "afterVariablesChange";
	private static final String AFTER_VARIABLES_MATCHER_CHANGE = "afterVariablesMatcherChange";
	private static final String ON_DIRECTIVES_CHANGE = "onDirectivesChange";
	private static final String ON_DIRECTIVES_MATCHER_CHANGE = "onDirectivesMatcherChange";
	private static final String ON_HOST_CHANGE = "onHostChange";
	private static final String ON_VARIABLES_CHANGE = "onVariablesChange";
	private static final String ON_VARIABLES_MATCHER_CHANGE = "onVariablesMatcherChange";

	public java.lang.Object getDirectives() {
		return (java.lang.Object) getStateHelper().eval(DIRECTIVES, null);
	}

	public void setDirectives(java.lang.Object directives) {
		getStateHelper().put(DIRECTIVES, directives);
	}

	public java.lang.String getDirectivesMatcher() {
		return (java.lang.String) getStateHelper().eval(DIRECTIVES_MATCHER, null);
	}

	public void setDirectivesMatcher(java.lang.String directivesMatcher) {
		getStateHelper().put(DIRECTIVES_MATCHER, directivesMatcher);
	}

	public java.lang.Object getHost() {
		return (java.lang.Object) getStateHelper().eval(HOST, null);
	}

	public void setHost(java.lang.Object host) {
		getStateHelper().put(HOST, host);
	}

	public java.lang.Object getVariables() {
		return (java.lang.Object) getStateHelper().eval(VARIABLES, null);
	}

	public void setVariables(java.lang.Object variables) {
		getStateHelper().put(VARIABLES, variables);
	}

	public java.lang.String getVariablesMatcher() {
		return (java.lang.String) getStateHelper().eval(VARIABLES_MATCHER, null);
	}

	public void setVariablesMatcher(java.lang.String variablesMatcher) {
		getStateHelper().put(VARIABLES_MATCHER, variablesMatcher);
	}

	public java.lang.String getAfterDirectivesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DIRECTIVES_CHANGE, null);
	}

	public void setAfterDirectivesChange(java.lang.String afterDirectivesChange) {
		getStateHelper().put(AFTER_DIRECTIVES_CHANGE, afterDirectivesChange);
	}

	public java.lang.String getAfterDirectivesMatcherChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DIRECTIVES_MATCHER_CHANGE, null);
	}

	public void setAfterDirectivesMatcherChange(java.lang.String afterDirectivesMatcherChange) {
		getStateHelper().put(AFTER_DIRECTIVES_MATCHER_CHANGE, afterDirectivesMatcherChange);
	}

	public java.lang.String getAfterHostChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HOST_CHANGE, null);
	}

	public void setAfterHostChange(java.lang.String afterHostChange) {
		getStateHelper().put(AFTER_HOST_CHANGE, afterHostChange);
	}

	public java.lang.String getAfterVariablesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VARIABLES_CHANGE, null);
	}

	public void setAfterVariablesChange(java.lang.String afterVariablesChange) {
		getStateHelper().put(AFTER_VARIABLES_CHANGE, afterVariablesChange);
	}

	public java.lang.String getAfterVariablesMatcherChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VARIABLES_MATCHER_CHANGE, null);
	}

	public void setAfterVariablesMatcherChange(java.lang.String afterVariablesMatcherChange) {
		getStateHelper().put(AFTER_VARIABLES_MATCHER_CHANGE, afterVariablesMatcherChange);
	}

	public java.lang.String getOnDirectivesChange() {
		return (java.lang.String) getStateHelper().eval(ON_DIRECTIVES_CHANGE, null);
	}

	public void setOnDirectivesChange(java.lang.String onDirectivesChange) {
		getStateHelper().put(ON_DIRECTIVES_CHANGE, onDirectivesChange);
	}

	public java.lang.String getOnDirectivesMatcherChange() {
		return (java.lang.String) getStateHelper().eval(ON_DIRECTIVES_MATCHER_CHANGE, null);
	}

	public void setOnDirectivesMatcherChange(java.lang.String onDirectivesMatcherChange) {
		getStateHelper().put(ON_DIRECTIVES_MATCHER_CHANGE, onDirectivesMatcherChange);
	}

	public java.lang.String getOnHostChange() {
		return (java.lang.String) getStateHelper().eval(ON_HOST_CHANGE, null);
	}

	public void setOnHostChange(java.lang.String onHostChange) {
		getStateHelper().put(ON_HOST_CHANGE, onHostChange);
	}

	public java.lang.String getOnVariablesChange() {
		return (java.lang.String) getStateHelper().eval(ON_VARIABLES_CHANGE, null);
	}

	public void setOnVariablesChange(java.lang.String onVariablesChange) {
		getStateHelper().put(ON_VARIABLES_CHANGE, onVariablesChange);
	}

	public java.lang.String getOnVariablesMatcherChange() {
		return (java.lang.String) getStateHelper().eval(ON_VARIABLES_MATCHER_CHANGE, null);
	}

	public void setOnVariablesMatcherChange(java.lang.String onVariablesMatcherChange) {
		getStateHelper().put(ON_VARIABLES_MATCHER_CHANGE, onVariablesMatcherChange);
	}

}