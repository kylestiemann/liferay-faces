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

	private static final String CROP_HEIGHT = "cropHeight";
	private static final String CROP_WIDTH = "cropWidth";
	private static final String CSS_CLASS = "cssClass";
	private static final String HIDE_CLASS = "hideClass";
	private static final String MIN_HEIGHT = "minHeight";
	private static final String MIN_WIDTH = "minWidth";
	private static final String MOVABLE = "movable";
	private static final String PRESERVE_RATIO = "preserveRatio";
	private static final String REGION = "region";
	private static final String RENDER = "render";
	private static final String RESIZABLE = "resizable";
	private static final String USE_ARIA = "useARIA";
	private static final String X = "x";
	private static final String Y = "y";
	private static final String AFTER_CROP_HEIGHT_CHANGE = "afterCropHeightChange";
	private static final String AFTER_CROP_WIDTH_CHANGE = "afterCropWidthChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_MIN_HEIGHT_CHANGE = "afterMinHeightChange";
	private static final String AFTER_MIN_WIDTH_CHANGE = "afterMinWidthChange";
	private static final String AFTER_MOVABLE_CHANGE = "afterMovableChange";
	private static final String AFTER_PRESERVE_RATIO_CHANGE = "afterPreserveRatioChange";
	private static final String AFTER_REGION_CHANGE = "afterRegionChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_RESIZABLE_CHANGE = "afterResizableChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String AFTER_XCHANGE = "afterXChange";
	private static final String AFTER_YCHANGE = "afterYChange";
	private static final String ON_CROP_HEIGHT_CHANGE = "onCropHeightChange";
	private static final String ON_CROP_WIDTH_CHANGE = "onCropWidthChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_MIN_HEIGHT_CHANGE = "onMinHeightChange";
	private static final String ON_MIN_WIDTH_CHANGE = "onMinWidthChange";
	private static final String ON_MOVABLE_CHANGE = "onMovableChange";
	private static final String ON_PRESERVE_RATIO_CHANGE = "onPreserveRatioChange";
	private static final String ON_REGION_CHANGE = "onRegionChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_RESIZABLE_CHANGE = "onResizableChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	private static final String ON_XCHANGE = "onXChange";
	private static final String ON_YCHANGE = "onYChange";

	protected java.lang.Object getCropHeight() {
		return (java.lang.Object) getStateHelper().eval(CROP_HEIGHT, null);
	}

	protected void setCropHeight(java.lang.Object cropHeight) {
		getStateHelper().put(CROP_HEIGHT, cropHeight);
	}

	protected java.lang.Object getCropWidth() {
		return (java.lang.Object) getStateHelper().eval(CROP_WIDTH, null);
	}

	protected void setCropWidth(java.lang.Object cropWidth) {
		getStateHelper().put(CROP_WIDTH, cropWidth);
	}

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	protected void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	protected java.lang.Object getMinHeight() {
		return (java.lang.Object) getStateHelper().eval(MIN_HEIGHT, null);
	}

	protected void setMinHeight(java.lang.Object minHeight) {
		getStateHelper().put(MIN_HEIGHT, minHeight);
	}

	protected java.lang.Object getMinWidth() {
		return (java.lang.Object) getStateHelper().eval(MIN_WIDTH, null);
	}

	protected void setMinWidth(java.lang.Object minWidth) {
		getStateHelper().put(MIN_WIDTH, minWidth);
	}

	protected java.lang.Boolean getMovable() {
		return (java.lang.Boolean) getStateHelper().eval(MOVABLE, null);
	}

	protected void setMovable(java.lang.Boolean movable) {
		getStateHelper().put(MOVABLE, movable);
	}

	protected java.lang.Boolean getPreserveRatio() {
		return (java.lang.Boolean) getStateHelper().eval(PRESERVE_RATIO, null);
	}

	protected void setPreserveRatio(java.lang.Boolean preserveRatio) {
		getStateHelper().put(PRESERVE_RATIO, preserveRatio);
	}

	protected java.lang.Object getRegion() {
		return (java.lang.Object) getStateHelper().eval(REGION, null);
	}

	protected void setRegion(java.lang.Object region) {
		getStateHelper().put(REGION, region);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Boolean getResizable() {
		return (java.lang.Boolean) getStateHelper().eval(RESIZABLE, null);
	}

	protected void setResizable(java.lang.Boolean resizable) {
		getStateHelper().put(RESIZABLE, resizable);
	}

	protected java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	protected void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	protected java.lang.Object getX() {
		return (java.lang.Object) getStateHelper().eval(X, null);
	}

	protected void setX(java.lang.Object x) {
		getStateHelper().put(X, x);
	}

	protected java.lang.Object getY() {
		return (java.lang.Object) getStateHelper().eval(Y, null);
	}

	protected void setY(java.lang.Object y) {
		getStateHelper().put(Y, y);
	}

	protected java.lang.String getAfterCropHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CROP_HEIGHT_CHANGE, null);
	}

	protected void setAfterCropHeightChange(java.lang.String afterCropHeightChange) {
		getStateHelper().put(AFTER_CROP_HEIGHT_CHANGE, afterCropHeightChange);
	}

	protected java.lang.String getAfterCropWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CROP_WIDTH_CHANGE, null);
	}

	protected void setAfterCropWidthChange(java.lang.String afterCropWidthChange) {
		getStateHelper().put(AFTER_CROP_WIDTH_CHANGE, afterCropWidthChange);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	protected void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	protected java.lang.String getAfterMinHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MIN_HEIGHT_CHANGE, null);
	}

	protected void setAfterMinHeightChange(java.lang.String afterMinHeightChange) {
		getStateHelper().put(AFTER_MIN_HEIGHT_CHANGE, afterMinHeightChange);
	}

	protected java.lang.String getAfterMinWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MIN_WIDTH_CHANGE, null);
	}

	protected void setAfterMinWidthChange(java.lang.String afterMinWidthChange) {
		getStateHelper().put(AFTER_MIN_WIDTH_CHANGE, afterMinWidthChange);
	}

	protected java.lang.String getAfterMovableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MOVABLE_CHANGE, null);
	}

	protected void setAfterMovableChange(java.lang.String afterMovableChange) {
		getStateHelper().put(AFTER_MOVABLE_CHANGE, afterMovableChange);
	}

	protected java.lang.String getAfterPreserveRatioChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PRESERVE_RATIO_CHANGE, null);
	}

	protected void setAfterPreserveRatioChange(java.lang.String afterPreserveRatioChange) {
		getStateHelper().put(AFTER_PRESERVE_RATIO_CHANGE, afterPreserveRatioChange);
	}

	protected java.lang.String getAfterRegionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_REGION_CHANGE, null);
	}

	protected void setAfterRegionChange(java.lang.String afterRegionChange) {
		getStateHelper().put(AFTER_REGION_CHANGE, afterRegionChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterResizableChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RESIZABLE_CHANGE, null);
	}

	protected void setAfterResizableChange(java.lang.String afterResizableChange) {
		getStateHelper().put(AFTER_RESIZABLE_CHANGE, afterResizableChange);
	}

	protected java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	protected void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	protected java.lang.String getAfterXChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XCHANGE, null);
	}

	protected void setAfterXChange(java.lang.String afterXChange) {
		getStateHelper().put(AFTER_XCHANGE, afterXChange);
	}

	protected java.lang.String getAfterYChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YCHANGE, null);
	}

	protected void setAfterYChange(java.lang.String afterYChange) {
		getStateHelper().put(AFTER_YCHANGE, afterYChange);
	}

	protected java.lang.String getOnCropHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_CROP_HEIGHT_CHANGE, null);
	}

	protected void setOnCropHeightChange(java.lang.String onCropHeightChange) {
		getStateHelper().put(ON_CROP_HEIGHT_CHANGE, onCropHeightChange);
	}

	protected java.lang.String getOnCropWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_CROP_WIDTH_CHANGE, null);
	}

	protected void setOnCropWidthChange(java.lang.String onCropWidthChange) {
		getStateHelper().put(ON_CROP_WIDTH_CHANGE, onCropWidthChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	protected void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	protected java.lang.String getOnMinHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_MIN_HEIGHT_CHANGE, null);
	}

	protected void setOnMinHeightChange(java.lang.String onMinHeightChange) {
		getStateHelper().put(ON_MIN_HEIGHT_CHANGE, onMinHeightChange);
	}

	protected java.lang.String getOnMinWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_MIN_WIDTH_CHANGE, null);
	}

	protected void setOnMinWidthChange(java.lang.String onMinWidthChange) {
		getStateHelper().put(ON_MIN_WIDTH_CHANGE, onMinWidthChange);
	}

	protected java.lang.String getOnMovableChange() {
		return (java.lang.String) getStateHelper().eval(ON_MOVABLE_CHANGE, null);
	}

	protected void setOnMovableChange(java.lang.String onMovableChange) {
		getStateHelper().put(ON_MOVABLE_CHANGE, onMovableChange);
	}

	protected java.lang.String getOnPreserveRatioChange() {
		return (java.lang.String) getStateHelper().eval(ON_PRESERVE_RATIO_CHANGE, null);
	}

	protected void setOnPreserveRatioChange(java.lang.String onPreserveRatioChange) {
		getStateHelper().put(ON_PRESERVE_RATIO_CHANGE, onPreserveRatioChange);
	}

	protected java.lang.String getOnRegionChange() {
		return (java.lang.String) getStateHelper().eval(ON_REGION_CHANGE, null);
	}

	protected void setOnRegionChange(java.lang.String onRegionChange) {
		getStateHelper().put(ON_REGION_CHANGE, onRegionChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnResizableChange() {
		return (java.lang.String) getStateHelper().eval(ON_RESIZABLE_CHANGE, null);
	}

	protected void setOnResizableChange(java.lang.String onResizableChange) {
		getStateHelper().put(ON_RESIZABLE_CHANGE, onResizableChange);
	}

	protected java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	protected void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

	protected java.lang.String getOnXChange() {
		return (java.lang.String) getStateHelper().eval(ON_XCHANGE, null);
	}

	protected void setOnXChange(java.lang.String onXChange) {
		getStateHelper().put(ON_XCHANGE, onXChange);
	}

	protected java.lang.String getOnYChange() {
		return (java.lang.String) getStateHelper().eval(ON_YCHANGE, null);
	}

	protected void setOnYChange(java.lang.String onYChange) {
		getStateHelper().put(ON_YCHANGE, onYChange);
	}

}