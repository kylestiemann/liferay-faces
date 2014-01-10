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
package com.liferay.faces.alloy.component.schedulertableviewdd;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class SchedulerTableViewDDBase extends javax.faces.component.UIPanel {

	private static final String DELEGATE_CONFIG = "delegateConfig";
	private static final String AFTER_DELEGATE_CONFIG_CHANGE = "afterDelegateConfigChange";
	private static final String ON_DELEGATE_CONFIG_CHANGE = "onDelegateConfigChange";

	protected java.lang.Object getDelegateConfig() {
		return (java.lang.Object) getStateHelper().eval(DELEGATE_CONFIG, null);
	}

	protected void setDelegateConfig(java.lang.Object delegateConfig) {
		getStateHelper().put(DELEGATE_CONFIG, delegateConfig);
	}

	protected java.lang.String getAfterDelegateConfigChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DELEGATE_CONFIG_CHANGE, null);
	}

	protected void setAfterDelegateConfigChange(java.lang.String afterDelegateConfigChange) {
		getStateHelper().put(AFTER_DELEGATE_CONFIG_CHANGE, afterDelegateConfigChange);
	}

	protected java.lang.String getOnDelegateConfigChange() {
		return (java.lang.String) getStateHelper().eval(ON_DELEGATE_CONFIG_CHANGE, null);
	}

	protected void setOnDelegateConfigChange(java.lang.String onDelegateConfigChange) {
		getStateHelper().put(ON_DELEGATE_CONFIG_CHANGE, onDelegateConfigChange);
	}

}