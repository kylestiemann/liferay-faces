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
package com.liferay.faces.alloy.component.mediaviewerplugin;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class MediaViewerPluginBase extends javax.faces.component.UIPanel {

	private static final String PROVIDERS = "providers";
	private static final String AFTER_PROVIDERS_CHANGE = "afterProvidersChange";
	private static final String ON_PROVIDERS_CHANGE = "onProvidersChange";

	protected java.lang.Object getProviders() {
		return (java.lang.Object) getStateHelper().eval(PROVIDERS, null);
	}

	protected void setProviders(java.lang.Object providers) {
		getStateHelper().put(PROVIDERS, providers);
	}

	protected java.lang.String getAfterProvidersChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PROVIDERS_CHANGE, null);
	}

	protected void setAfterProvidersChange(java.lang.String afterProvidersChange) {
		getStateHelper().put(AFTER_PROVIDERS_CHANGE, afterProvidersChange);
	}

	protected java.lang.String getOnProvidersChange() {
		return (java.lang.String) getStateHelper().eval(ON_PROVIDERS_CHANGE, null);
	}

	protected void setOnProvidersChange(java.lang.String onProvidersChange) {
		getStateHelper().put(ON_PROVIDERS_CHANGE, onProvidersChange);
	}

}