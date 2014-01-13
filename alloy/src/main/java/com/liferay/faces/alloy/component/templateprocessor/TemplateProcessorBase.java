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

	private static final String DIRECTIVES = "directives";
	private static final String HOST = "host";
	private static final String VARIABLES = "variables";
	private static final String AFTER_DIRECTIVES_CHANGE = "afterDirectivesChange";
	private static final String AFTER_HOST_CHANGE = "afterHostChange";
	private static final String AFTER_VARIABLES_CHANGE = "afterVariablesChange";
	private static final String ON_DIRECTIVES_CHANGE = "onDirectivesChange";
	private static final String ON_HOST_CHANGE = "onHostChange";
	private static final String ON_VARIABLES_CHANGE = "onVariablesChange";

	protected java.lang.Object getDirectives() {
		return (java.lang.Object) getStateHelper().eval(DIRECTIVES, null);
	}

	protected void setDirectives(java.lang.Object directives) {
		getStateHelper().put(DIRECTIVES, directives);
	}

	protected java.lang.Object getHost() {
		return (java.lang.Object) getStateHelper().eval(HOST, null);
	}

	protected void setHost(java.lang.Object host) {
		getStateHelper().put(HOST, host);
	}

	protected java.lang.Object getVariables() {
		return (java.lang.Object) getStateHelper().eval(VARIABLES, null);
	}

	protected void setVariables(java.lang.Object variables) {
		getStateHelper().put(VARIABLES, variables);
	}

	protected java.lang.String getAfterDirectivesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DIRECTIVES_CHANGE, null);
	}

	protected void setAfterDirectivesChange(java.lang.String afterDirectivesChange) {
		getStateHelper().put(AFTER_DIRECTIVES_CHANGE, afterDirectivesChange);
	}

	protected java.lang.String getAfterHostChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HOST_CHANGE, null);
	}

	protected void setAfterHostChange(java.lang.String afterHostChange) {
		getStateHelper().put(AFTER_HOST_CHANGE, afterHostChange);
	}

	protected java.lang.String getAfterVariablesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VARIABLES_CHANGE, null);
	}

	protected void setAfterVariablesChange(java.lang.String afterVariablesChange) {
		getStateHelper().put(AFTER_VARIABLES_CHANGE, afterVariablesChange);
	}

	protected java.lang.String getOnDirectivesChange() {
		return (java.lang.String) getStateHelper().eval(ON_DIRECTIVES_CHANGE, null);
	}

	protected void setOnDirectivesChange(java.lang.String onDirectivesChange) {
		getStateHelper().put(ON_DIRECTIVES_CHANGE, onDirectivesChange);
	}

	protected java.lang.String getOnHostChange() {
		return (java.lang.String) getStateHelper().eval(ON_HOST_CHANGE, null);
	}

	protected void setOnHostChange(java.lang.String onHostChange) {
		getStateHelper().put(ON_HOST_CHANGE, onHostChange);
	}

	protected java.lang.String getOnVariablesChange() {
		return (java.lang.String) getStateHelper().eval(ON_VARIABLES_CHANGE, null);
	}

	protected void setOnVariablesChange(java.lang.String onVariablesChange) {
		getStateHelper().put(ON_VARIABLES_CHANGE, onVariablesChange);
	}

}