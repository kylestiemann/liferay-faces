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
package com.liferay.faces.alloy.component.imagecropper;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ImageCropperBase extends javax.faces.component.UIPanel {

	private static final String BOUNDING_BOX = "boundingBox";
	private static final String CONTENT_BOX = "contentBox";
	private static final String CROP_HEIGHT = "cropHeight";
	private static final String CROP_WIDTH = "cropWidth";
	private static final String CSS_CLASS = "cssClass";
	private static final String DESTROYED = "destroyed";
	private static final String DISABLED = "disabled";
	private static final String FOCUSED = "focused";
	private static final String HEIGHT = "height";
	private static final String HIDE_CLASS = "hideClass";
	private static final String IMAGECROPPER_ID = "imagecropperId";
	private static final String INITIALIZED = "initialized";
	private static final String IMAGECROPPER_LOCALE = "imagecropperLocale";
	private static final String MIN_HEIGHT = "minHeight";
	private static final String MIN_WIDTH = "minWidth";
	private static final String MOVABLE = "movable";
	private static final String PRESERVE_RATIO = "preserveRatio";
	private static final String REGION = "region";
	private static final String RENDER = "render";
	private static final String RENDERED = "rendered";
	private static final String RESIZABLE = "resizable";
	private static final String SRC_NODE = "srcNode";
	private static final String STRINGS = "strings";
	private static final String TAB_INDEX = "tabIndex";
	private static final String USE_ARIA = "useARIA";
	private static final String VISIBLE = "visible";
	private static final String WIDTH = "width";
	private static final String X = "x";
	private static final String Y = "y";
	private static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	private static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	private static final String AFTER_CROP_HEIGHT_CHANGE = "afterCropHeightChange";
	private static final String AFTER_CROP_WIDTH_CHANGE = "afterCropWidthChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	private static final String AFTER_MIN_HEIGHT_CHANGE = "afterMinHeightChange";
	private static final String AFTER_MIN_WIDTH_CHANGE = "afterMinWidthChange";
	private static final String AFTER_MOVABLE_CHANGE = "afterMovableChange";
	private static final String AFTER_PRESERVE_RATIO_CHANGE = "afterPreserveRatioChange";
	private static final String AFTER_REGION_CHANGE = "afterRegionChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	private static final String AFTER_RESIZABLE_CHANGE = "afterResizableChange";
	private static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String AFTER_XCHANGE = "afterXChange";
	private static final String AFTER_YCHANGE = "afterYChange";
	private static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	private static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	private static final String ON_CROP_HEIGHT_CHANGE = "onCropHeightChange";
	private static final String ON_CROP_WIDTH_CHANGE = "onCropWidthChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_LOCALE_CHANGE = "onLocaleChange";
	private static final String ON_MIN_HEIGHT_CHANGE = "onMinHeightChange";
	private static final String ON_MIN_WIDTH_CHANGE = "onMinWidthChange";
	private static final String ON_MOVABLE_CHANGE = "onMovableChange";
	private static final String ON_PRESERVE_RATIO_CHANGE = "onPreserveRatioChange";
	private static final String ON_REGION_CHANGE = "onRegionChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_RENDERED_CHANGE = "onRenderedChange";
	private static final String ON_RESIZABLE_CHANGE = "onResizableChange";
	private static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";
	private static final String ON_XCHANGE = "onXChange";
	private static final String ON_YCHANGE = "onYChange";

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

	public java.lang.Object getCropHeight() {
		return (java.lang.Object) getStateHelper().eval(CROP_HEIGHT, null);
	}

	public void setCropHeight(java.lang.Object cropHeight) {
		getStateHelper().put(CROP_HEIGHT, cropHeight);
	}

	public java.lang.Object getCropWidth() {
		return (java.lang.Object) getStateHelper().eval(CROP_WIDTH, null);
	}

	public void setCropWidth(java.lang.Object cropWidth) {
		getStateHelper().put(CROP_WIDTH, cropWidth);
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

	public java.lang.String getImagecropperId() {
		return (java.lang.String) getStateHelper().eval(IMAGECROPPER_ID, null);
	}

	public void setImagecropperId(java.lang.String imagecropperId) {
		getStateHelper().put(IMAGECROPPER_ID, imagecropperId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getImagecropperLocale() {
		return (java.lang.String) getStateHelper().eval(IMAGECROPPER_LOCALE, null);
	}

	public void setImagecropperLocale(java.lang.String imagecropperLocale) {
		getStateHelper().put(IMAGECROPPER_LOCALE, imagecropperLocale);
	}

	public java.lang.Object getMinHeight() {
		return (java.lang.Object) getStateHelper().eval(MIN_HEIGHT, null);
	}

	public void setMinHeight(java.lang.Object minHeight) {
		getStateHelper().put(MIN_HEIGHT, minHeight);
	}

	public java.lang.Object getMinWidth() {
		return (java.lang.Object) getStateHelper().eval(MIN_WIDTH, null);
	}

	public void setMinWidth(java.lang.Object minWidth) {
		getStateHelper().put(MIN_WIDTH, minWidth);
	}

	public java.lang.Boolean getMovable() {
		return (java.lang.Boolean) getStateHelper().eval(MOVABLE, null);
	}

	public void setMovable(java.lang.Boolean movable) {
		getStateHelper().put(MOVABLE, movable);
	}

	public java.lang.Boolean getPreserveRatio() {
		return (java.lang.Boolean) getStateHelper().eval(PRESERVE_RATIO, null);
	}

	public void setPreserveRatio(java.lang.Boolean preserveRatio) {
		getStateHelper().put(PRESERVE_RATIO, preserveRatio);
	}

	public java.lang.Object getRegion() {
		return (java.lang.Object) getStateHelper().eval(REGION, null);
	}

	public void setRegion(java.lang.Object region) {
		getStateHelper().put(REGION, region);
	}

	public java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	public void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	public java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	public void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	public java.lang.Boolean getResizable() {
		return (java.lang.Boolean) getStateHelper().eval(RESIZABLE, null);
	}

	public void setResizable(java.lang.Boolean resizable) {
		getStateHelper().put(RESIZABLE, resizable);
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

	public java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
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

	public java.lang.Object getX() {
		return (java.lang.Object) getStateHelper().eval(X, null);
	}

	public void setX(java.lang.Object x) {
		getStateHelper().put(X, x);
	}

	public java.lang.Object getY() {
		return (java.lang.Object) getStateHelper().eval(Y, null);
	}

	public void setY(java.lang.Object y) {
		getStateHelper().put(Y, y);
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

	public java.lang.String getAfterCropHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CROP_HEIGHT_CHANGE, null);
	}

	public void setAfterCropHeightChange(java.lang.String afterCropHeightChange) {
		getStateHelper().put(AFTER_CROP_HEIGHT_CHANGE, afterCropHeightChange);
	}

	public java.lang.String getAfterCropWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CROP_WIDTH_CHANGE, null);
	}

	public void setAfterCropWidthChange(java.lang.String afterCropWidthChange) {
		getStateHelper().put(AFTER_CROP_WIDTH_CHANGE, afterCropWidthChange);
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

	public java.lang.String getAfterMinHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MIN_HEIGHT_CHANGE, null);
	}

	public void setAfterMinHeightChange(java.lang.String afterMinHeightChange) {
		getStateHelper().put(AFTER_MIN_HEIGHT_CHANGE, afterMinHeightChange);
	}

	public java.lang.String getAfterMinWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MIN_WIDTH_CHANGE, null);
	}

	public void setAfterMinWidthChange(java.lang.String afterMinWidthChange) {
		getStateHelper().put(AFTER_MIN_WIDTH_CHANGE, afterMinWidthChange);
	}

	public java.lang.String getAfterMovableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MOVABLE_CHANGE, null);
	}

	public void setAfterMovableChange(java.lang.String afterMovableChange) {
		getStateHelper().put(AFTER_MOVABLE_CHANGE, afterMovableChange);
	}

	public java.lang.String getAfterPreserveRatioChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PRESERVE_RATIO_CHANGE, null);
	}

	public void setAfterPreserveRatioChange(java.lang.String afterPreserveRatioChange) {
		getStateHelper().put(AFTER_PRESERVE_RATIO_CHANGE, afterPreserveRatioChange);
	}

	public java.lang.String getAfterRegionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REGION_CHANGE, null);
	}

	public void setAfterRegionChange(java.lang.String afterRegionChange) {
		getStateHelper().put(AFTER_REGION_CHANGE, afterRegionChange);
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

	public java.lang.String getAfterResizableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESIZABLE_CHANGE, null);
	}

	public void setAfterResizableChange(java.lang.String afterResizableChange) {
		getStateHelper().put(AFTER_RESIZABLE_CHANGE, afterResizableChange);
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

	public java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
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

	public java.lang.String getAfterXChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XCHANGE, null);
	}

	public void setAfterXChange(java.lang.String afterXChange) {
		getStateHelper().put(AFTER_XCHANGE, afterXChange);
	}

	public java.lang.String getAfterYChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YCHANGE, null);
	}

	public void setAfterYChange(java.lang.String afterYChange) {
		getStateHelper().put(AFTER_YCHANGE, afterYChange);
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

	public java.lang.String getOnCropHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_CROP_HEIGHT_CHANGE, null);
	}

	public void setOnCropHeightChange(java.lang.String onCropHeightChange) {
		getStateHelper().put(ON_CROP_HEIGHT_CHANGE, onCropHeightChange);
	}

	public java.lang.String getOnCropWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_CROP_WIDTH_CHANGE, null);
	}

	public void setOnCropWidthChange(java.lang.String onCropWidthChange) {
		getStateHelper().put(ON_CROP_WIDTH_CHANGE, onCropWidthChange);
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

	public java.lang.String getOnMinHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_MIN_HEIGHT_CHANGE, null);
	}

	public void setOnMinHeightChange(java.lang.String onMinHeightChange) {
		getStateHelper().put(ON_MIN_HEIGHT_CHANGE, onMinHeightChange);
	}

	public java.lang.String getOnMinWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_MIN_WIDTH_CHANGE, null);
	}

	public void setOnMinWidthChange(java.lang.String onMinWidthChange) {
		getStateHelper().put(ON_MIN_WIDTH_CHANGE, onMinWidthChange);
	}

	public java.lang.String getOnMovableChange() {
		return (java.lang.String) getStateHelper().eval(ON_MOVABLE_CHANGE, null);
	}

	public void setOnMovableChange(java.lang.String onMovableChange) {
		getStateHelper().put(ON_MOVABLE_CHANGE, onMovableChange);
	}

	public java.lang.String getOnPreserveRatioChange() {
		return (java.lang.String) getStateHelper().eval(ON_PRESERVE_RATIO_CHANGE, null);
	}

	public void setOnPreserveRatioChange(java.lang.String onPreserveRatioChange) {
		getStateHelper().put(ON_PRESERVE_RATIO_CHANGE, onPreserveRatioChange);
	}

	public java.lang.String getOnRegionChange() {
		return (java.lang.String) getStateHelper().eval(ON_REGION_CHANGE, null);
	}

	public void setOnRegionChange(java.lang.String onRegionChange) {
		getStateHelper().put(ON_REGION_CHANGE, onRegionChange);
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

	public java.lang.String getOnResizableChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESIZABLE_CHANGE, null);
	}

	public void setOnResizableChange(java.lang.String onResizableChange) {
		getStateHelper().put(ON_RESIZABLE_CHANGE, onResizableChange);
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

	public java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
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

	public java.lang.String getOnXChange() {
		return (java.lang.String) getStateHelper().eval(ON_XCHANGE, null);
	}

	public void setOnXChange(java.lang.String onXChange) {
		getStateHelper().put(ON_XCHANGE, onXChange);
	}

	public java.lang.String getOnYChange() {
		return (java.lang.String) getStateHelper().eval(ON_YCHANGE, null);
	}

	public void setOnYChange(java.lang.String onYChange) {
		getStateHelper().put(ON_YCHANGE, onYChange);
	}

}