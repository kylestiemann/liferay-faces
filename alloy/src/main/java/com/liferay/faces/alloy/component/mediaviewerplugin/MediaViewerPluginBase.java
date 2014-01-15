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

	private static final String DESTROYED = "destroyed";
	private static final String HOST = "host";
	private static final String INITIALIZED = "initialized";
	private static final String PROVIDERS = "providers";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_HOST_CHANGE = "afterHostChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_PROVIDERS_CHANGE = "afterProvidersChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_HOST_CHANGE = "onHostChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_PROVIDERS_CHANGE = "onProvidersChange";

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
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

	public java.lang.Object getProviders() {
		return (java.lang.Object) getStateHelper().eval(PROVIDERS, null);
	}

	public void setProviders(java.lang.Object providers) {
		getStateHelper().put(PROVIDERS, providers);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
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

	public java.lang.String getAfterProvidersChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PROVIDERS_CHANGE, null);
	}

	public void setAfterProvidersChange(java.lang.String afterProvidersChange) {
		getStateHelper().put(AFTER_PROVIDERS_CHANGE, afterProvidersChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
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

	public java.lang.String getOnProvidersChange() {
		return (java.lang.String) getStateHelper().eval(ON_PROVIDERS_CHANGE, null);
	}

	public void setOnProvidersChange(java.lang.String onProvidersChange) {
		getStateHelper().put(ON_PROVIDERS_CHANGE, onProvidersChange);
	}

}