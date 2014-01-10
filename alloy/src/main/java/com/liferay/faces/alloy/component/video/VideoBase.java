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
package com.liferay.faces.alloy.component.video;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class VideoBase extends javax.faces.component.UIPanel {

	private static final String CSS_CLASS = "cssClass";
	private static final String FIXED_ATTRIBUTES = "fixedAttributes";
	private static final String FLASH_VARS = "flashVars";
	private static final String HIDE_CLASS = "hideClass";
	private static final String OGV_URL = "ogvUrl";
	private static final String POSTER = "poster";
	private static final String RENDER = "render";
	private static final String SWF_URL = "swfUrl";
	private static final String URL = "url";
	private static final String USE_ARIA = "useARIA";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_FIXED_ATTRIBUTES_CHANGE = "afterFixedAttributesChange";
	private static final String AFTER_FLASH_VARS_CHANGE = "afterFlashVarsChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_OGV_URL_CHANGE = "afterOgvUrlChange";
	private static final String AFTER_POSTER_CHANGE = "afterPosterChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_SWF_URL_CHANGE = "afterSwfUrlChange";
	private static final String AFTER_URL_CHANGE = "afterUrlChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_FIXED_ATTRIBUTES_CHANGE = "onFixedAttributesChange";
	private static final String ON_FLASH_VARS_CHANGE = "onFlashVarsChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_OGV_URL_CHANGE = "onOgvUrlChange";
	private static final String ON_POSTER_CHANGE = "onPosterChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_SWF_URL_CHANGE = "onSwfUrlChange";
	private static final String ON_URL_CHANGE = "onUrlChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Object getFixedAttributes() {
		return (java.lang.Object) getStateHelper().eval(FIXED_ATTRIBUTES, null);
	}

	protected void setFixedAttributes(java.lang.Object fixedAttributes) {
		getStateHelper().put(FIXED_ATTRIBUTES, fixedAttributes);
	}

	protected java.lang.Object getFlashVars() {
		return (java.lang.Object) getStateHelper().eval(FLASH_VARS, null);
	}

	protected void setFlashVars(java.lang.Object flashVars) {
		getStateHelper().put(FLASH_VARS, flashVars);
	}

	protected java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	protected void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	protected java.lang.String getOgvUrl() {
		return (java.lang.String) getStateHelper().eval(OGV_URL, null);
	}

	protected void setOgvUrl(java.lang.String ogvUrl) {
		getStateHelper().put(OGV_URL, ogvUrl);
	}

	protected java.lang.String getPoster() {
		return (java.lang.String) getStateHelper().eval(POSTER, null);
	}

	protected void setPoster(java.lang.String poster) {
		getStateHelper().put(POSTER, poster);
	}

	protected java.lang.Boolean getRender() {
		return (java.lang.Boolean) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Boolean render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.String getSwfUrl() {
		return (java.lang.String) getStateHelper().eval(SWF_URL, null);
	}

	protected void setSwfUrl(java.lang.String swfUrl) {
		getStateHelper().put(SWF_URL, swfUrl);
	}

	protected java.lang.String getUrl() {
		return (java.lang.String) getStateHelper().eval(URL, null);
	}

	protected void setUrl(java.lang.String url) {
		getStateHelper().put(URL, url);
	}

	protected java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	protected void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterFixedAttributesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIXED_ATTRIBUTES_CHANGE, null);
	}

	protected void setAfterFixedAttributesChange(java.lang.String afterFixedAttributesChange) {
		getStateHelper().put(AFTER_FIXED_ATTRIBUTES_CHANGE, afterFixedAttributesChange);
	}

	protected java.lang.String getAfterFlashVarsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FLASH_VARS_CHANGE, null);
	}

	protected void setAfterFlashVarsChange(java.lang.String afterFlashVarsChange) {
		getStateHelper().put(AFTER_FLASH_VARS_CHANGE, afterFlashVarsChange);
	}

	protected java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	protected void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	protected java.lang.String getAfterOgvUrlChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OGV_URL_CHANGE, null);
	}

	protected void setAfterOgvUrlChange(java.lang.String afterOgvUrlChange) {
		getStateHelper().put(AFTER_OGV_URL_CHANGE, afterOgvUrlChange);
	}

	protected java.lang.String getAfterPosterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_POSTER_CHANGE, null);
	}

	protected void setAfterPosterChange(java.lang.String afterPosterChange) {
		getStateHelper().put(AFTER_POSTER_CHANGE, afterPosterChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterSwfUrlChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SWF_URL_CHANGE, null);
	}

	protected void setAfterSwfUrlChange(java.lang.String afterSwfUrlChange) {
		getStateHelper().put(AFTER_SWF_URL_CHANGE, afterSwfUrlChange);
	}

	protected java.lang.String getAfterUrlChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_URL_CHANGE, null);
	}

	protected void setAfterUrlChange(java.lang.String afterUrlChange) {
		getStateHelper().put(AFTER_URL_CHANGE, afterUrlChange);
	}

	protected java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	protected void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnFixedAttributesChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIXED_ATTRIBUTES_CHANGE, null);
	}

	protected void setOnFixedAttributesChange(java.lang.String onFixedAttributesChange) {
		getStateHelper().put(ON_FIXED_ATTRIBUTES_CHANGE, onFixedAttributesChange);
	}

	protected java.lang.String getOnFlashVarsChange() {
		return (java.lang.String) getStateHelper().eval(ON_FLASH_VARS_CHANGE, null);
	}

	protected void setOnFlashVarsChange(java.lang.String onFlashVarsChange) {
		getStateHelper().put(ON_FLASH_VARS_CHANGE, onFlashVarsChange);
	}

	protected java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	protected void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	protected java.lang.String getOnOgvUrlChange() {
		return (java.lang.String) getStateHelper().eval(ON_OGV_URL_CHANGE, null);
	}

	protected void setOnOgvUrlChange(java.lang.String onOgvUrlChange) {
		getStateHelper().put(ON_OGV_URL_CHANGE, onOgvUrlChange);
	}

	protected java.lang.String getOnPosterChange() {
		return (java.lang.String) getStateHelper().eval(ON_POSTER_CHANGE, null);
	}

	protected void setOnPosterChange(java.lang.String onPosterChange) {
		getStateHelper().put(ON_POSTER_CHANGE, onPosterChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnSwfUrlChange() {
		return (java.lang.String) getStateHelper().eval(ON_SWF_URL_CHANGE, null);
	}

	protected void setOnSwfUrlChange(java.lang.String onSwfUrlChange) {
		getStateHelper().put(ON_SWF_URL_CHANGE, onSwfUrlChange);
	}

	protected java.lang.String getOnUrlChange() {
		return (java.lang.String) getStateHelper().eval(ON_URL_CHANGE, null);
	}

	protected void setOnUrlChange(java.lang.String onUrlChange) {
		getStateHelper().put(ON_URL_CHANGE, onUrlChange);
	}

	protected java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	protected void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

}