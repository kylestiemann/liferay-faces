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
package com.liferay.faces.alloy.component.colorpickerpopover;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class ColorPickerPopoverBase extends javax.faces.component.UIPanel {

	private static final String ALIGN = "align";
	private static final String COLORPICKERPOPOVER_BODY_CONTENT = "colorpickerpopoverBodyContent";
	private static final String COLOR = "color";
	private static final String COLOR_PALETTE = "colorPalette";
	private static final String CSS_CLASS = "cssClass";
	private static final String CURRENT_TRIGGER = "currentTrigger";
	private static final String DEFAULT_COLOR = "defaultColor";
	private static final String HSV_PALETTE = "hsvPalette";
	private static final String RECENT_COLORS = "recentColors";
	private static final String RENDER_COLOR_PALETTE = "renderColorPalette";
	private static final String RENDER_HSVPALETTE = "renderHSVPalette";
	private static final String STRINGS = "strings";
	private static final String TRIGGER = "trigger";
	private static final String TRIGGER_EVENT = "triggerEvent";
	private static final String VISIBLE = "visible";
	private static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	private static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	private static final String AFTER_COLOR_CHANGE = "afterColorChange";
	private static final String AFTER_COLOR_PALETTE_CHANGE = "afterColorPaletteChange";
	private static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	private static final String AFTER_CURRENT_TRIGGER_CHANGE = "afterCurrentTriggerChange";
	private static final String AFTER_DEFAULT_COLOR_CHANGE = "afterDefaultColorChange";
	private static final String AFTER_HSV_PALETTE_CHANGE = "afterHsvPaletteChange";
	private static final String AFTER_RECENT_COLORS_CHANGE = "afterRecentColorsChange";
	private static final String AFTER_RENDER_COLOR_PALETTE_CHANGE = "afterRenderColorPaletteChange";
	private static final String AFTER_RENDER_HSVPALETTE_CHANGE = "afterRenderHSVPaletteChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TRIGGER_CHANGE = "afterTriggerChange";
	private static final String AFTER_TRIGGER_EVENT_CHANGE = "afterTriggerEventChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String ON_ALIGN_CHANGE = "onAlignChange";
	private static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	private static final String ON_COLOR_CHANGE = "onColorChange";
	private static final String ON_COLOR_PALETTE_CHANGE = "onColorPaletteChange";
	private static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	private static final String ON_CURRENT_TRIGGER_CHANGE = "onCurrentTriggerChange";
	private static final String ON_DEFAULT_COLOR_CHANGE = "onDefaultColorChange";
	private static final String ON_HSV_PALETTE_CHANGE = "onHsvPaletteChange";
	private static final String ON_RECENT_COLORS_CHANGE = "onRecentColorsChange";
	private static final String ON_RENDER_COLOR_PALETTE_CHANGE = "onRenderColorPaletteChange";
	private static final String ON_RENDER_HSVPALETTE_CHANGE = "onRenderHSVPaletteChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TRIGGER_CHANGE = "onTriggerChange";
	private static final String ON_TRIGGER_EVENT_CHANGE = "onTriggerEventChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";

	protected java.lang.Object getAlign() {
		return (java.lang.Object) getStateHelper().eval(ALIGN, null);
	}

	protected void setAlign(java.lang.Object align) {
		getStateHelper().put(ALIGN, align);
	}

	protected java.lang.String getColorpickerpopoverBodyContent() {
		return (java.lang.String) getStateHelper().eval(COLORPICKERPOPOVER_BODY_CONTENT, null);
	}

	protected void setColorpickerpopoverBodyContent(java.lang.String colorpickerpopoverBodyContent) {
		getStateHelper().put(COLORPICKERPOPOVER_BODY_CONTENT, colorpickerpopoverBodyContent);
	}

	protected java.lang.String getColor() {
		return (java.lang.String) getStateHelper().eval(COLOR, null);
	}

	protected void setColor(java.lang.String color) {
		getStateHelper().put(COLOR, color);
	}

	protected java.lang.Object getColorPalette() {
		return (java.lang.Object) getStateHelper().eval(COLOR_PALETTE, null);
	}

	protected void setColorPalette(java.lang.Object colorPalette) {
		getStateHelper().put(COLOR_PALETTE, colorPalette);
	}

	protected java.lang.String getCssClass() {
		return (java.lang.String) getStateHelper().eval(CSS_CLASS, null);
	}

	protected void setCssClass(java.lang.String cssClass) {
		getStateHelper().put(CSS_CLASS, cssClass);
	}

	protected java.lang.Object getCurrentTrigger() {
		return (java.lang.Object) getStateHelper().eval(CURRENT_TRIGGER, null);
	}

	protected void setCurrentTrigger(java.lang.Object currentTrigger) {
		getStateHelper().put(CURRENT_TRIGGER, currentTrigger);
	}

	protected java.lang.String getDefaultColor() {
		return (java.lang.String) getStateHelper().eval(DEFAULT_COLOR, null);
	}

	protected void setDefaultColor(java.lang.String defaultColor) {
		getStateHelper().put(DEFAULT_COLOR, defaultColor);
	}

	protected java.lang.Object getHsvPalette() {
		return (java.lang.Object) getStateHelper().eval(HSV_PALETTE, null);
	}

	protected void setHsvPalette(java.lang.Object hsvPalette) {
		getStateHelper().put(HSV_PALETTE, hsvPalette);
	}

	protected java.lang.Object getRecentColors() {
		return (java.lang.Object) getStateHelper().eval(RECENT_COLORS, null);
	}

	protected void setRecentColors(java.lang.Object recentColors) {
		getStateHelper().put(RECENT_COLORS, recentColors);
	}

	protected java.lang.Boolean getRenderColorPalette() {
		return (java.lang.Boolean) getStateHelper().eval(RENDER_COLOR_PALETTE, null);
	}

	protected void setRenderColorPalette(java.lang.Boolean renderColorPalette) {
		getStateHelper().put(RENDER_COLOR_PALETTE, renderColorPalette);
	}

	protected java.lang.Boolean getRenderHSVPalette() {
		return (java.lang.Boolean) getStateHelper().eval(RENDER_HSVPALETTE, null);
	}

	protected void setRenderHSVPalette(java.lang.Boolean renderHSVPalette) {
		getStateHelper().put(RENDER_HSVPALETTE, renderHSVPalette);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.Object getTrigger() {
		return (java.lang.Object) getStateHelper().eval(TRIGGER, null);
	}

	protected void setTrigger(java.lang.Object trigger) {
		getStateHelper().put(TRIGGER, trigger);
	}

	protected java.lang.String getTriggerEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_EVENT, null);
	}

	protected void setTriggerEvent(java.lang.String triggerEvent) {
		getStateHelper().put(TRIGGER_EVENT, triggerEvent);
	}

	protected java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	protected void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	protected java.lang.String getAfterAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_CHANGE, null);
	}

	protected void setAfterAlignChange(java.lang.String afterAlignChange) {
		getStateHelper().put(AFTER_ALIGN_CHANGE, afterAlignChange);
	}

	protected java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	protected void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	protected java.lang.String getAfterColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_CHANGE, null);
	}

	protected void setAfterColorChange(java.lang.String afterColorChange) {
		getStateHelper().put(AFTER_COLOR_CHANGE, afterColorChange);
	}

	protected java.lang.String getAfterColorPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_PALETTE_CHANGE, null);
	}

	protected void setAfterColorPaletteChange(java.lang.String afterColorPaletteChange) {
		getStateHelper().put(AFTER_COLOR_PALETTE_CHANGE, afterColorPaletteChange);
	}

	protected java.lang.String getAfterCssClassChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CSS_CLASS_CHANGE, null);
	}

	protected void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		getStateHelper().put(AFTER_CSS_CLASS_CHANGE, afterCssClassChange);
	}

	protected java.lang.String getAfterCurrentTriggerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CURRENT_TRIGGER_CHANGE, null);
	}

	protected void setAfterCurrentTriggerChange(java.lang.String afterCurrentTriggerChange) {
		getStateHelper().put(AFTER_CURRENT_TRIGGER_CHANGE, afterCurrentTriggerChange);
	}

	protected java.lang.String getAfterDefaultColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DEFAULT_COLOR_CHANGE, null);
	}

	protected void setAfterDefaultColorChange(java.lang.String afterDefaultColorChange) {
		getStateHelper().put(AFTER_DEFAULT_COLOR_CHANGE, afterDefaultColorChange);
	}

	protected java.lang.String getAfterHsvPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HSV_PALETTE_CHANGE, null);
	}

	protected void setAfterHsvPaletteChange(java.lang.String afterHsvPaletteChange) {
		getStateHelper().put(AFTER_HSV_PALETTE_CHANGE, afterHsvPaletteChange);
	}

	protected java.lang.String getAfterRecentColorsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RECENT_COLORS_CHANGE, null);
	}

	protected void setAfterRecentColorsChange(java.lang.String afterRecentColorsChange) {
		getStateHelper().put(AFTER_RECENT_COLORS_CHANGE, afterRecentColorsChange);
	}

	protected java.lang.String getAfterRenderColorPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_COLOR_PALETTE_CHANGE, null);
	}

	protected void setAfterRenderColorPaletteChange(java.lang.String afterRenderColorPaletteChange) {
		getStateHelper().put(AFTER_RENDER_COLOR_PALETTE_CHANGE, afterRenderColorPaletteChange);
	}

	protected java.lang.String getAfterRenderHSVPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_HSVPALETTE_CHANGE, null);
	}

	protected void setAfterRenderHSVPaletteChange(java.lang.String afterRenderHSVPaletteChange) {
		getStateHelper().put(AFTER_RENDER_HSVPALETTE_CHANGE, afterRenderHSVPaletteChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterTriggerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_CHANGE, null);
	}

	protected void setAfterTriggerChange(java.lang.String afterTriggerChange) {
		getStateHelper().put(AFTER_TRIGGER_CHANGE, afterTriggerChange);
	}

	protected java.lang.String getAfterTriggerEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_EVENT_CHANGE, null);
	}

	protected void setAfterTriggerEventChange(java.lang.String afterTriggerEventChange) {
		getStateHelper().put(AFTER_TRIGGER_EVENT_CHANGE, afterTriggerEventChange);
	}

	protected java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	protected void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	protected java.lang.String getOnAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_CHANGE, null);
	}

	protected void setOnAlignChange(java.lang.String onAlignChange) {
		getStateHelper().put(ON_ALIGN_CHANGE, onAlignChange);
	}

	protected java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	protected void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	protected java.lang.String getOnColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_CHANGE, null);
	}

	protected void setOnColorChange(java.lang.String onColorChange) {
		getStateHelper().put(ON_COLOR_CHANGE, onColorChange);
	}

	protected java.lang.String getOnColorPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_PALETTE_CHANGE, null);
	}

	protected void setOnColorPaletteChange(java.lang.String onColorPaletteChange) {
		getStateHelper().put(ON_COLOR_PALETTE_CHANGE, onColorPaletteChange);
	}

	protected java.lang.String getOnCssClassChange() {
		return (java.lang.String) getStateHelper().eval(ON_CSS_CLASS_CHANGE, null);
	}

	protected void setOnCssClassChange(java.lang.String onCssClassChange) {
		getStateHelper().put(ON_CSS_CLASS_CHANGE, onCssClassChange);
	}

	protected java.lang.String getOnCurrentTriggerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CURRENT_TRIGGER_CHANGE, null);
	}

	protected void setOnCurrentTriggerChange(java.lang.String onCurrentTriggerChange) {
		getStateHelper().put(ON_CURRENT_TRIGGER_CHANGE, onCurrentTriggerChange);
	}

	protected java.lang.String getOnDefaultColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_DEFAULT_COLOR_CHANGE, null);
	}

	protected void setOnDefaultColorChange(java.lang.String onDefaultColorChange) {
		getStateHelper().put(ON_DEFAULT_COLOR_CHANGE, onDefaultColorChange);
	}

	protected java.lang.String getOnHsvPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_HSV_PALETTE_CHANGE, null);
	}

	protected void setOnHsvPaletteChange(java.lang.String onHsvPaletteChange) {
		getStateHelper().put(ON_HSV_PALETTE_CHANGE, onHsvPaletteChange);
	}

	protected java.lang.String getOnRecentColorsChange() {
		return (java.lang.String) getStateHelper().eval(ON_RECENT_COLORS_CHANGE, null);
	}

	protected void setOnRecentColorsChange(java.lang.String onRecentColorsChange) {
		getStateHelper().put(ON_RECENT_COLORS_CHANGE, onRecentColorsChange);
	}

	protected java.lang.String getOnRenderColorPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_COLOR_PALETTE_CHANGE, null);
	}

	protected void setOnRenderColorPaletteChange(java.lang.String onRenderColorPaletteChange) {
		getStateHelper().put(ON_RENDER_COLOR_PALETTE_CHANGE, onRenderColorPaletteChange);
	}

	protected java.lang.String getOnRenderHSVPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_HSVPALETTE_CHANGE, null);
	}

	protected void setOnRenderHSVPaletteChange(java.lang.String onRenderHSVPaletteChange) {
		getStateHelper().put(ON_RENDER_HSVPALETTE_CHANGE, onRenderHSVPaletteChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnTriggerChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_CHANGE, null);
	}

	protected void setOnTriggerChange(java.lang.String onTriggerChange) {
		getStateHelper().put(ON_TRIGGER_CHANGE, onTriggerChange);
	}

	protected java.lang.String getOnTriggerEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_EVENT_CHANGE, null);
	}

	protected void setOnTriggerEventChange(java.lang.String onTriggerEventChange) {
		getStateHelper().put(ON_TRIGGER_EVENT_CHANGE, onTriggerEventChange);
	}

	protected java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	protected void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

}