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
package com.liferay.faces.alloy.component.progressbar;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ProgressBarBase extends javax.faces.component.UIPanel {

	private static final String CSS_CLASS = "cssClass";
	private static final String HEIGHT = "height";
	private static final String HIDE_CLASS = "hideClass";
	private static final String LABEL = "label";
	private static final String MAX = "max";
	private static final String MIN = "min";
	private static final String ORIENTATION = "orientation";
	private static final String RATIO = "ratio";
	private static final String RENDER = "render";
	private static final String STEP = "step";
	private static final String TEXT_NODE = "textNode";
	private static final String USE_ARIA = "useARIA";
	private static final String PROGRESSBAR_VALUE = "progressbarValue";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HIDE_CLASS_CHANGE = "afterHideClassChange";
	private static final String AFTER_LABEL_CHANGE = "afterLabelChange";
	private static final String AFTER_MAX_CHANGE = "afterMaxChange";
	private static final String AFTER_MIN_CHANGE = "afterMinChange";
	private static final String AFTER_ORIENTATION_CHANGE = "afterOrientationChange";
	private static final String AFTER_RATIO_CHANGE = "afterRatioChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_STEP_CHANGE = "afterStepChange";
	private static final String AFTER_TEXT_NODE_CHANGE = "afterTextNodeChange";
	private static final String AFTER_USE_ARIACHANGE = "afterUseARIAChange";
	private static final String AFTER_VALUE_CHANGE = "afterValueChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HIDE_CLASS_CHANGE = "onHideClassChange";
	private static final String ON_LABEL_CHANGE = "onLabelChange";
	private static final String ON_MAX_CHANGE = "onMaxChange";
	private static final String ON_MIN_CHANGE = "onMinChange";
	private static final String ON_ORIENTATION_CHANGE = "onOrientationChange";
	private static final String ON_RATIO_CHANGE = "onRatioChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_STEP_CHANGE = "onStepChange";
	private static final String ON_TEXT_NODE_CHANGE = "onTextNodeChange";
	private static final String ON_USE_ARIACHANGE = "onUseARIAChange";
	private static final String ON_VALUE_CHANGE = "onValueChange";

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Integer getHeight() {
		return (java.lang.Integer) getStateHelper().eval(HEIGHT, null);
	}

	protected void setHeight(java.lang.Integer height) {
		getStateHelper().put(HEIGHT, height);
	}

	protected java.lang.String getHideClass() {
		return (java.lang.String) getStateHelper().eval(HIDE_CLASS, null);
	}

	protected void setHideClass(java.lang.String hideClass) {
		getStateHelper().put(HIDE_CLASS, hideClass);
	}

	protected java.lang.String getLabel() {
		return (java.lang.String) getStateHelper().eval(LABEL, null);
	}

	protected void setLabel(java.lang.String label) {
		getStateHelper().put(LABEL, label);
	}

	protected java.lang.Object getMax() {
		return (java.lang.Object) getStateHelper().eval(MAX, null);
	}

	protected void setMax(java.lang.Object max) {
		getStateHelper().put(MAX, max);
	}

	protected java.lang.Object getMin() {
		return (java.lang.Object) getStateHelper().eval(MIN, null);
	}

	protected void setMin(java.lang.Object min) {
		getStateHelper().put(MIN, min);
	}

	protected java.lang.String getOrientation() {
		return (java.lang.String) getStateHelper().eval(ORIENTATION, null);
	}

	protected void setOrientation(java.lang.String orientation) {
		getStateHelper().put(ORIENTATION, orientation);
	}

	protected java.lang.Object getRatio() {
		return (java.lang.Object) getStateHelper().eval(RATIO, null);
	}

	protected void setRatio(java.lang.Object ratio) {
		getStateHelper().put(RATIO, ratio);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Object getStep() {
		return (java.lang.Object) getStateHelper().eval(STEP, null);
	}

	protected void setStep(java.lang.Object step) {
		getStateHelper().put(STEP, step);
	}

	protected java.lang.String getTextNode() {
		return (java.lang.String) getStateHelper().eval(TEXT_NODE, null);
	}

	protected void setTextNode(java.lang.String textNode) {
		getStateHelper().put(TEXT_NODE, textNode);
	}

	protected java.lang.Boolean getUseARIA() {
		return (java.lang.Boolean) getStateHelper().eval(USE_ARIA, null);
	}

	protected void setUseARIA(java.lang.Boolean useARIA) {
		getStateHelper().put(USE_ARIA, useARIA);
	}

	protected java.lang.Object getProgressbarValue() {
		return (java.lang.Object) getStateHelper().eval(PROGRESSBAR_VALUE, null);
	}

	protected void setProgressbarValue(java.lang.Object progressbarValue) {
		getStateHelper().put(PROGRESSBAR_VALUE, progressbarValue);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	protected void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	protected java.lang.String getAfterHideClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_CLASS_CHANGE, null);
	}

	protected void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		getStateHelper().put(AFTER_HIDE_CLASS_CHANGE, afterHideClassChange);
	}

	protected java.lang.String getAfterLabelChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LABEL_CHANGE, null);
	}

	protected void setAfterLabelChange(java.lang.String afterLabelChange) {
		getStateHelper().put(AFTER_LABEL_CHANGE, afterLabelChange);
	}

	protected java.lang.String getAfterMaxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MAX_CHANGE, null);
	}

	protected void setAfterMaxChange(java.lang.String afterMaxChange) {
		getStateHelper().put(AFTER_MAX_CHANGE, afterMaxChange);
	}

	protected java.lang.String getAfterMinChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MIN_CHANGE, null);
	}

	protected void setAfterMinChange(java.lang.String afterMinChange) {
		getStateHelper().put(AFTER_MIN_CHANGE, afterMinChange);
	}

	protected java.lang.String getAfterOrientationChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ORIENTATION_CHANGE, null);
	}

	protected void setAfterOrientationChange(java.lang.String afterOrientationChange) {
		getStateHelper().put(AFTER_ORIENTATION_CHANGE, afterOrientationChange);
	}

	protected java.lang.String getAfterRatioChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RATIO_CHANGE, null);
	}

	protected void setAfterRatioChange(java.lang.String afterRatioChange) {
		getStateHelper().put(AFTER_RATIO_CHANGE, afterRatioChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterStepChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STEP_CHANGE, null);
	}

	protected void setAfterStepChange(java.lang.String afterStepChange) {
		getStateHelper().put(AFTER_STEP_CHANGE, afterStepChange);
	}

	protected java.lang.String getAfterTextNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TEXT_NODE_CHANGE, null);
	}

	protected void setAfterTextNodeChange(java.lang.String afterTextNodeChange) {
		getStateHelper().put(AFTER_TEXT_NODE_CHANGE, afterTextNodeChange);
	}

	protected java.lang.String getAfterUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_USE_ARIACHANGE, null);
	}

	protected void setAfterUseARIAChange(java.lang.String afterUseARIAChange) {
		getStateHelper().put(AFTER_USE_ARIACHANGE, afterUseARIAChange);
	}

	protected java.lang.String getAfterValueChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VALUE_CHANGE, null);
	}

	protected void setAfterValueChange(java.lang.String afterValueChange) {
		getStateHelper().put(AFTER_VALUE_CHANGE, afterValueChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	protected void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	protected java.lang.String getOnHideClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_CLASS_CHANGE, null);
	}

	protected void setOnHideClassChange(java.lang.String onHideClassChange) {
		getStateHelper().put(ON_HIDE_CLASS_CHANGE, onHideClassChange);
	}

	protected java.lang.String getOnLabelChange() {
		return (java.lang.String) getStateHelper().eval(ON_LABEL_CHANGE, null);
	}

	protected void setOnLabelChange(java.lang.String onLabelChange) {
		getStateHelper().put(ON_LABEL_CHANGE, onLabelChange);
	}

	protected java.lang.String getOnMaxChange() {
		return (java.lang.String) getStateHelper().eval(ON_MAX_CHANGE, null);
	}

	protected void setOnMaxChange(java.lang.String onMaxChange) {
		getStateHelper().put(ON_MAX_CHANGE, onMaxChange);
	}

	protected java.lang.String getOnMinChange() {
		return (java.lang.String) getStateHelper().eval(ON_MIN_CHANGE, null);
	}

	protected void setOnMinChange(java.lang.String onMinChange) {
		getStateHelper().put(ON_MIN_CHANGE, onMinChange);
	}

	protected java.lang.String getOnOrientationChange() {
		return (java.lang.String) getStateHelper().eval(ON_ORIENTATION_CHANGE, null);
	}

	protected void setOnOrientationChange(java.lang.String onOrientationChange) {
		getStateHelper().put(ON_ORIENTATION_CHANGE, onOrientationChange);
	}

	protected java.lang.String getOnRatioChange() {
		return (java.lang.String) getStateHelper().eval(ON_RATIO_CHANGE, null);
	}

	protected void setOnRatioChange(java.lang.String onRatioChange) {
		getStateHelper().put(ON_RATIO_CHANGE, onRatioChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnStepChange() {
		return (java.lang.String) getStateHelper().eval(ON_STEP_CHANGE, null);
	}

	protected void setOnStepChange(java.lang.String onStepChange) {
		getStateHelper().put(ON_STEP_CHANGE, onStepChange);
	}

	protected java.lang.String getOnTextNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_TEXT_NODE_CHANGE, null);
	}

	protected void setOnTextNodeChange(java.lang.String onTextNodeChange) {
		getStateHelper().put(ON_TEXT_NODE_CHANGE, onTextNodeChange);
	}

	protected java.lang.String getOnUseARIAChange() {
		return (java.lang.String) getStateHelper().eval(ON_USE_ARIACHANGE, null);
	}

	protected void setOnUseARIAChange(java.lang.String onUseARIAChange) {
		getStateHelper().put(ON_USE_ARIACHANGE, onUseARIAChange);
	}

	protected java.lang.String getOnValueChange() {
		return (java.lang.String) getStateHelper().eval(ON_VALUE_CHANGE, null);
	}

	protected void setOnValueChange(java.lang.String onValueChange) {
		getStateHelper().put(ON_VALUE_CHANGE, onValueChange);
	}

}