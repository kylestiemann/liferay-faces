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
package com.liferay.faces.alloy.component.audio;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class AudioBase extends javax.faces.component.UIPanel {

	private static final String BOUNDING_BOX = "boundingBox";
	private static final String CONTENT_BOX = "contentBox";
	private static final String CSS_CLASS = "cssClass";
	private static final String DESTROYED = "destroyed";
	private static final String DISABLED = "disabled";
	private static final String FIXED_ATTRIBUTES = "fixedAttributes";
	private static final String FLASH_VARS = "flashVars";
	private static final String FOCUSED = "focused";
	private static final String HEIGHT = "height";
	private static final String HIDE_CLASS = "hideClass";
	private static final String AUDIO_ID = "audioId";
	private static final String INITIALIZED = "initialized";
	private static final String AUDIO_LOCALE = "audioLocale";
	private static final String OGG_URL = "oggUrl";
	private static final String RENDER = "render";
	private static final String RENDERED = "rendered";
	private static final String SRC_NODE = "srcNode";
	private static final String STRINGS = "strings";
	private static final String SWF_HEIGHT = "swfHeight";
	private static final String SWF_URL = "swfUrl";
	private static final String SWF_WIDTH = "swfWidth";
	private static final String TAB_INDEX = "tabIndex";
	private static final String TYPE = "type";
	private static final String URL = "url";
	private static final String USE_ARIA = "useARIA";
	private static final String VISIBLE = "visible";
	private static final String WIDTH = "width";
	private static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	private static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_FIXED_ATTRIBUTES_CHANGE = "afterFixedAttributesChange";
	private static final String AFTER_FLASH_VARS_CHANGE = "afterFlashVarsChange";
	private static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	private static final String AFTER_OGG_URL_CHANGE = "afterOggUrlChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	private static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_SWF_HEIGHT_CHANGE = "afterSwfHeightChange";
	private static final String AFTER_SWF_URL_CHANGE = "afterSwfUrlChange";
	private static final String AFTER_SWF_WIDTH_CHANGE = "afterSwfWidthChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_TYPE_CHANGE = "afterTypeChange";
	private static final String AFTER_URL_CHANGE = "afterUrlChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	private static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_FIXED_ATTRIBUTES_CHANGE = "onFixedAttributesChange";
	private static final String ON_FLASH_VARS_CHANGE = "onFlashVarsChange";
	private static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_LOCALE_CHANGE = "onLocaleChange";
	private static final String ON_OGG_URL_CHANGE = "onOggUrlChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_RENDERED_CHANGE = "onRenderedChange";
	private static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_SWF_HEIGHT_CHANGE = "onSwfHeightChange";
	private static final String ON_SWF_URL_CHANGE = "onSwfUrlChange";
	private static final String ON_SWF_WIDTH_CHANGE = "onSwfWidthChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_TYPE_CHANGE = "onTypeChange";
	private static final String ON_URL_CHANGE = "onUrlChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	public void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	public java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	public void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	public java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	public java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	public void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	public java.lang.Object getFixedAttributes() {
		return (java.lang.Object) getStateHelper().eval(FIXED_ATTRIBUTES, null);
	}

	public void setFixedAttributes(java.lang.Object fixedAttributes) {
		getStateHelper().put(FIXED_ATTRIBUTES, fixedAttributes);
	}

	public java.lang.Object getFlashVars() {
		return (java.lang.Object) getStateHelper().eval(FLASH_VARS, null);
	}

	public void setFlashVars(java.lang.Object flashVars) {
		getStateHelper().put(FLASH_VARS, flashVars);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	public void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	public java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	public void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	public java.lang.String getAudioId() {
		return (java.lang.String) getStateHelper().eval(AUDIO_ID, null);
	}

	public void setAudioId(java.lang.String audioId) {
		getStateHelper().put(AUDIO_ID, audioId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getAudioLocale() {
		return (java.lang.String) getStateHelper().eval(AUDIO_LOCALE, null);
	}

	public void setAudioLocale(java.lang.String audioLocale) {
		getStateHelper().put(AUDIO_LOCALE, audioLocale);
	}

	public java.lang.String getOggUrl() {
		return (java.lang.String) getStateHelper().eval(OGG_URL, null);
	}

	public void setOggUrl(java.lang.String oggUrl) {
		getStateHelper().put(OGG_URL, oggUrl);
	}

	public java.lang.Boolean getRender() {
		return (java.lang.Boolean) getStateHelper().eval(RENDER, null);
	}

	public void setRender(java.lang.Boolean render) {
		getStateHelper().put(RENDER, render);
	}

	public java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	public void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	public java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	public void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
	}

	public java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	public void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	public java.lang.String getSwfHeight() {
		return (java.lang.String) getStateHelper().eval(SWF_HEIGHT, null);
	}

	public void setSwfHeight(java.lang.String swfHeight) {
		getStateHelper().put(SWF_HEIGHT, swfHeight);
	}

	public java.lang.String getSwfUrl() {
		return (java.lang.String) getStateHelper().eval(SWF_URL, null);
	}

	public void setSwfUrl(java.lang.String swfUrl) {
		getStateHelper().put(SWF_URL, swfUrl);
	}

	public java.lang.String getSwfWidth() {
		return (java.lang.String) getStateHelper().eval(SWF_WIDTH, null);
	}

	public void setSwfWidth(java.lang.String swfWidth) {
		getStateHelper().put(SWF_WIDTH, swfWidth);
	}

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	public java.lang.String getType() {
		return (java.lang.String) getStateHelper().eval(TYPE, null);
	}

	public void setType(java.lang.String type) {
		getStateHelper().put(TYPE, type);
	}

	public java.lang.String getUrl() {
		return (java.lang.String) getStateHelper().eval(URL, null);
	}

	public void setUrl(java.lang.String url) {
		getStateHelper().put(URL, url);
	}

	public java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	public void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	public java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	public void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	public java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	public void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	public java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	public void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	public java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	public java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	public java.lang.String getAfterFixedAttributesChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FIXED_ATTRIBUTES_CHANGE, null);
	}

	public void setAfterFixedAttributesChange(java.lang.String afterFixedAttributesChange) {
		getStateHelper().put(AFTER_FIXED_ATTRIBUTES_CHANGE, afterFixedAttributesChange);
	}

	public java.lang.String getAfterFlashVarsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FLASH_VARS_CHANGE, null);
	}

	public void setAfterFlashVarsChange(java.lang.String afterFlashVarsChange) {
		getStateHelper().put(AFTER_FLASH_VARS_CHANGE, afterFlashVarsChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	public java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	public void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	public java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	public void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	public java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	public java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	public void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	public java.lang.String getAfterOggUrlChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OGG_URL_CHANGE, null);
	}

	public void setAfterOggUrlChange(java.lang.String afterOggUrlChange) {
		getStateHelper().put(AFTER_OGG_URL_CHANGE, afterOggUrlChange);
	}

	public java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	public void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	public java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	public void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	public java.lang.String getAfterSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SRC_NODE_CHANGE, null);
	}

	public void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		getStateHelper().put(AFTER_SRC_NODE_CHANGE, afterSrcNodeChange);
	}

	public java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	public void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	public java.lang.String getAfterSwfHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SWF_HEIGHT_CHANGE, null);
	}

	public void setAfterSwfHeightChange(java.lang.String afterSwfHeightChange) {
		getStateHelper().put(AFTER_SWF_HEIGHT_CHANGE, afterSwfHeightChange);
	}

	public java.lang.String getAfterSwfUrlChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SWF_URL_CHANGE, null);
	}

	public void setAfterSwfUrlChange(java.lang.String afterSwfUrlChange) {
		getStateHelper().put(AFTER_SWF_URL_CHANGE, afterSwfUrlChange);
	}

	public java.lang.String getAfterSwfWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SWF_WIDTH_CHANGE, null);
	}

	public void setAfterSwfWidthChange(java.lang.String afterSwfWidthChange) {
		getStateHelper().put(AFTER_SWF_WIDTH_CHANGE, afterSwfWidthChange);
	}

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	public java.lang.String getAfterTypeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TYPE_CHANGE, null);
	}

	public void setAfterTypeChange(java.lang.String afterTypeChange) {
		getStateHelper().put(AFTER_TYPE_CHANGE, afterTypeChange);
	}

	public java.lang.String getAfterUrlChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_URL_CHANGE, null);
	}

	public void setAfterUrlChange(java.lang.String afterUrlChange) {
		getStateHelper().put(AFTER_URL_CHANGE, afterUrlChange);
	}

	public java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	public void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	public java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	public java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	public void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	public java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	public void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	public java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	public java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	public java.lang.String getOnFixedAttributesChange() {
		return (java.lang.String) getStateHelper().eval(ON_FIXED_ATTRIBUTES_CHANGE, null);
	}

	public void setOnFixedAttributesChange(java.lang.String onFixedAttributesChange) {
		getStateHelper().put(ON_FIXED_ATTRIBUTES_CHANGE, onFixedAttributesChange);
	}

	public java.lang.String getOnFlashVarsChange() {
		return (java.lang.String) getStateHelper().eval(ON_FLASH_VARS_CHANGE, null);
	}

	public void setOnFlashVarsChange(java.lang.String onFlashVarsChange) {
		getStateHelper().put(ON_FLASH_VARS_CHANGE, onFlashVarsChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	public java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	public void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	public java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	public void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	public java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	public java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	public void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	public java.lang.String getOnOggUrlChange() {
		return (java.lang.String) getStateHelper().eval(ON_OGG_URL_CHANGE, null);
	}

	public void setOnOggUrlChange(java.lang.String onOggUrlChange) {
		getStateHelper().put(ON_OGG_URL_CHANGE, onOggUrlChange);
	}

	public java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	public void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	public java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	public void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	public java.lang.String getOnSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SRC_NODE_CHANGE, null);
	}

	public void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		getStateHelper().put(ON_SRC_NODE_CHANGE, onSrcNodeChange);
	}

	public java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	public void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	public java.lang.String getOnSwfHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_SWF_HEIGHT_CHANGE, null);
	}

	public void setOnSwfHeightChange(java.lang.String onSwfHeightChange) {
		getStateHelper().put(ON_SWF_HEIGHT_CHANGE, onSwfHeightChange);
	}

	public java.lang.String getOnSwfUrlChange() {
		return (java.lang.String) getStateHelper().eval(ON_SWF_URL_CHANGE, null);
	}

	public void setOnSwfUrlChange(java.lang.String onSwfUrlChange) {
		getStateHelper().put(ON_SWF_URL_CHANGE, onSwfUrlChange);
	}

	public java.lang.String getOnSwfWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_SWF_WIDTH_CHANGE, null);
	}

	public void setOnSwfWidthChange(java.lang.String onSwfWidthChange) {
		getStateHelper().put(ON_SWF_WIDTH_CHANGE, onSwfWidthChange);
	}

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	public java.lang.String getOnTypeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TYPE_CHANGE, null);
	}

	public void setOnTypeChange(java.lang.String onTypeChange) {
		getStateHelper().put(ON_TYPE_CHANGE, onTypeChange);
	}

	public java.lang.String getOnUrlChange() {
		return (java.lang.String) getStateHelper().eval(ON_URL_CHANGE, null);
	}

	public void setOnUrlChange(java.lang.String onUrlChange) {
		getStateHelper().put(ON_URL_CHANGE, onUrlChange);
	}

	public java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	public void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

	public java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

	public java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	public void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

}