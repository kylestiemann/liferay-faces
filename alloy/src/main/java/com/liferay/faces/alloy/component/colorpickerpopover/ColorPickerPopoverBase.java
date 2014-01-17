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

	public static final String ALIGN = "align";
	public static final String ALIGN_ON = "alignOn";
	public static final String COLOR_PICKER_POPOVER_BODY_CONTENT = "bodyContent";
	public static final String BOUNDING_BOX = "boundingBox";
	public static final String CENTERED = "centered";
	public static final String COLOR = "color";
	public static final String COLOR_PALETTE = "colorPalette";
	public static final String CONSTRAIN = "constrain";
	public static final String CONTENT_BOX = "contentBox";
	public static final String CSS_CLASS = "cssClass";
	public static final String CURRENT_TRIGGER = "currentTrigger";
	public static final String DEFAULT_COLOR = "defaultColor";
	public static final String DESTROYED = "destroyed";
	public static final String DISABLED = "disabled";
	public static final String FILL_HEIGHT = "fillHeight";
	public static final String FOCUS_ON = "focusOn";
	public static final String FOCUSED = "focused";
	public static final String FOOTER_CONTENT = "footerContent";
	public static final String HEADER_CONTENT = "headerContent";
	public static final String HEIGHT = "height";
	public static final String HIDE_ON = "hideOn";
	public static final String HSV_PALETTE = "hsvPalette";
	public static final String COLOR_PICKER_POPOVER_ID = "id";
	public static final String INITIALIZED = "initialized";
	public static final String COLOR_PICKER_POPOVER_LOCALE = "locale";
	public static final String MASK_NODE = "maskNode";
	public static final String MODAL = "modal";
	public static final String PREVENT_OVERLAP = "preventOverlap";
	public static final String RECENT_COLORS = "recentColors";
	public static final String RENDER = "render";
	public static final String RENDER_COLOR_PALETTE = "renderColorPalette";
	public static final String RENDER_HSVPALETTE = "renderHSVPalette";
	public static final String RENDERED = "rendered";
	public static final String SHIM = "shim";
	public static final String SRC_NODE = "srcNode";
	public static final String STRINGS = "strings";
	public static final String TAB_INDEX = "tabIndex";
	public static final String TOOLBAR_POSITION = "toolbarPosition";
	public static final String TOOLBARS = "toolbars";
	public static final String TRIGGER = "trigger";
	public static final String TRIGGER_EVENT = "triggerEvent";
	public static final String TRIGGER_TOGGLE_EVENT = "triggerToggleEvent";
	public static final String VISIBLE = "visible";
	public static final String WIDTH = "width";
	public static final String X = "x";
	public static final String XY = "xy";
	public static final String Y = "y";
	public static final String Z_INDEX = "zIndex";
	public static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	public static final String AFTER_ALIGN_ON_CHANGE = "afterAlignOnChange";
	public static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	public static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	public static final String AFTER_CENTERED_CHANGE = "afterCenteredChange";
	public static final String AFTER_COLOR_CHANGE = "afterColorChange";
	public static final String AFTER_COLOR_PALETTE_CHANGE = "afterColorPaletteChange";
	public static final String AFTER_CONSTRAIN_CHANGE = "afterConstrainChange";
	public static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	public static final String AFTER_CSS_CLASS_CHANGE = "afterCssClassChange";
	public static final String AFTER_CURRENT_TRIGGER_CHANGE = "afterCurrentTriggerChange";
	public static final String AFTER_DEFAULT_COLOR_CHANGE = "afterDefaultColorChange";
	public static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	public static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	public static final String AFTER_FILL_HEIGHT_CHANGE = "afterFillHeightChange";
	public static final String AFTER_FOCUS_ON_CHANGE = "afterFocusOnChange";
	public static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	public static final String AFTER_FOOTER_CONTENT_CHANGE = "afterFooterContentChange";
	public static final String AFTER_HEADER_CONTENT_CHANGE = "afterHeaderContentChange";
	public static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	public static final String AFTER_HIDE_ON_CHANGE = "afterHideOnChange";
	public static final String AFTER_HSV_PALETTE_CHANGE = "afterHsvPaletteChange";
	public static final String AFTER_ID_CHANGE = "afterIdChange";
	public static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	public static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	public static final String AFTER_MASK_NODE_CHANGE = "afterMaskNodeChange";
	public static final String AFTER_MODAL_CHANGE = "afterModalChange";
	public static final String AFTER_PREVENT_OVERLAP_CHANGE = "afterPreventOverlapChange";
	public static final String AFTER_RECENT_COLORS_CHANGE = "afterRecentColorsChange";
	public static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	public static final String AFTER_RENDER_COLOR_PALETTE_CHANGE = "afterRenderColorPaletteChange";
	public static final String AFTER_RENDER_HSVPALETTE_CHANGE = "afterRenderHSVPaletteChange";
	public static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	public static final String AFTER_SHIM_CHANGE = "afterShimChange";
	public static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	public static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	public static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	public static final String AFTER_TOOLBAR_POSITION_CHANGE = "afterToolbarPositionChange";
	public static final String AFTER_TOOLBARS_CHANGE = "afterToolbarsChange";
	public static final String AFTER_TRIGGER_CHANGE = "afterTriggerChange";
	public static final String AFTER_TRIGGER_EVENT_CHANGE = "afterTriggerEventChange";
	public static final String AFTER_TRIGGER_TOGGLE_EVENT_CHANGE = "afterTriggerToggleEventChange";
	public static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	public static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	public static final String AFTER_XCHANGE = "afterXChange";
	public static final String AFTER_XY_CHANGE = "afterXyChange";
	public static final String AFTER_YCHANGE = "afterYChange";
	public static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	public static final String ON_ALIGN_CHANGE = "onAlignChange";
	public static final String ON_ALIGN_ON_CHANGE = "onAlignOnChange";
	public static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	public static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	public static final String ON_CENTERED_CHANGE = "onCenteredChange";
	public static final String ON_COLOR_CHANGE = "onColorChange";
	public static final String ON_COLOR_PALETTE_CHANGE = "onColorPaletteChange";
	public static final String ON_CONSTRAIN_CHANGE = "onConstrainChange";
	public static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	public static final String ON_CSS_CLASS_CHANGE = "onCssClassChange";
	public static final String ON_CURRENT_TRIGGER_CHANGE = "onCurrentTriggerChange";
	public static final String ON_DEFAULT_COLOR_CHANGE = "onDefaultColorChange";
	public static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	public static final String ON_DISABLED_CHANGE = "onDisabledChange";
	public static final String ON_FILL_HEIGHT_CHANGE = "onFillHeightChange";
	public static final String ON_FOCUS_ON_CHANGE = "onFocusOnChange";
	public static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	public static final String ON_FOOTER_CONTENT_CHANGE = "onFooterContentChange";
	public static final String ON_HEADER_CONTENT_CHANGE = "onHeaderContentChange";
	public static final String ON_HEIGHT_CHANGE = "onHeightChange";
	public static final String ON_HIDE_ON_CHANGE = "onHideOnChange";
	public static final String ON_HSV_PALETTE_CHANGE = "onHsvPaletteChange";
	public static final String ON_ID_CHANGE = "onIdChange";
	public static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	public static final String ON_LOCALE_CHANGE = "onLocaleChange";
	public static final String ON_MASK_NODE_CHANGE = "onMaskNodeChange";
	public static final String ON_MODAL_CHANGE = "onModalChange";
	public static final String ON_PREVENT_OVERLAP_CHANGE = "onPreventOverlapChange";
	public static final String ON_RECENT_COLORS_CHANGE = "onRecentColorsChange";
	public static final String ON_RENDER_CHANGE = "onRenderChange";
	public static final String ON_RENDER_COLOR_PALETTE_CHANGE = "onRenderColorPaletteChange";
	public static final String ON_RENDER_HSVPALETTE_CHANGE = "onRenderHSVPaletteChange";
	public static final String ON_RENDERED_CHANGE = "onRenderedChange";
	public static final String ON_SHIM_CHANGE = "onShimChange";
	public static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	public static final String ON_STRINGS_CHANGE = "onStringsChange";
	public static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	public static final String ON_TOOLBAR_POSITION_CHANGE = "onToolbarPositionChange";
	public static final String ON_TOOLBARS_CHANGE = "onToolbarsChange";
	public static final String ON_TRIGGER_CHANGE = "onTriggerChange";
	public static final String ON_TRIGGER_EVENT_CHANGE = "onTriggerEventChange";
	public static final String ON_TRIGGER_TOGGLE_EVENT_CHANGE = "onTriggerToggleEventChange";
	public static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	public static final String ON_WIDTH_CHANGE = "onWidthChange";
	public static final String ON_XCHANGE = "onXChange";
	public static final String ON_XY_CHANGE = "onXyChange";
	public static final String ON_YCHANGE = "onYChange";
	public static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	public java.lang.Object getAlign() {
		return (java.lang.Object) getStateHelper().eval(ALIGN, null);
	}

	public void setAlign(java.lang.Object align) {
		getStateHelper().put(ALIGN, align);
	}

	public java.lang.Object getAlignOn() {
		return (java.lang.Object) getStateHelper().eval(ALIGN_ON, null);
	}

	public void setAlignOn(java.lang.Object alignOn) {
		getStateHelper().put(ALIGN_ON, alignOn);
	}

	public java.lang.Object getColorPickerPopoverBodyContent() {
		return (java.lang.Object) getStateHelper().eval(COLOR_PICKER_POPOVER_BODY_CONTENT, null);
	}

	public void setColorPickerPopoverBodyContent(java.lang.Object colorPickerPopoverBodyContent) {
		getStateHelper().put(COLOR_PICKER_POPOVER_BODY_CONTENT, colorPickerPopoverBodyContent);
	}

	public java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	public java.lang.Object getCentered() {
		return (java.lang.Object) getStateHelper().eval(CENTERED, null);
	}

	public void setCentered(java.lang.Object centered) {
		getStateHelper().put(CENTERED, centered);
	}

	public java.lang.String getColor() {
		return (java.lang.String) getStateHelper().eval(COLOR, null);
	}

	public void setColor(java.lang.String color) {
		getStateHelper().put(COLOR, color);
	}

	public java.lang.Object getColorPalette() {
		return (java.lang.Object) getStateHelper().eval(COLOR_PALETTE, null);
	}

	public void setColorPalette(java.lang.Object colorPalette) {
		getStateHelper().put(COLOR_PALETTE, colorPalette);
	}

	public java.lang.Object getConstrain() {
		return (java.lang.Object) getStateHelper().eval(CONSTRAIN, null);
	}

	public void setConstrain(java.lang.Object constrain) {
		getStateHelper().put(CONSTRAIN, constrain);
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

	public java.lang.String getCurrentTrigger() {
		return (java.lang.String) getStateHelper().eval(CURRENT_TRIGGER, null);
	}

	public void setCurrentTrigger(java.lang.String currentTrigger) {
		getStateHelper().put(CURRENT_TRIGGER, currentTrigger);
	}

	public java.lang.String getDefaultColor() {
		return (java.lang.String) getStateHelper().eval(DEFAULT_COLOR, null);
	}

	public void setDefaultColor(java.lang.String defaultColor) {
		getStateHelper().put(DEFAULT_COLOR, defaultColor);
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

	public java.lang.Object getFillHeight() {
		return (java.lang.Object) getStateHelper().eval(FILL_HEIGHT, null);
	}

	public void setFillHeight(java.lang.Object fillHeight) {
		getStateHelper().put(FILL_HEIGHT, fillHeight);
	}

	public java.lang.Object getFocusOn() {
		return (java.lang.Object) getStateHelper().eval(FOCUS_ON, null);
	}

	public void setFocusOn(java.lang.Object focusOn) {
		getStateHelper().put(FOCUS_ON, focusOn);
	}

	public java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	public void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	public java.lang.Object getFooterContent() {
		return (java.lang.Object) getStateHelper().eval(FOOTER_CONTENT, null);
	}

	public void setFooterContent(java.lang.Object footerContent) {
		getStateHelper().put(FOOTER_CONTENT, footerContent);
	}

	public java.lang.Object getHeaderContent() {
		return (java.lang.Object) getStateHelper().eval(HEADER_CONTENT, null);
	}

	public void setHeaderContent(java.lang.Object headerContent) {
		getStateHelper().put(HEADER_CONTENT, headerContent);
	}

	public java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	public void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	public java.lang.Object getHideOn() {
		return (java.lang.Object) getStateHelper().eval(HIDE_ON, null);
	}

	public void setHideOn(java.lang.Object hideOn) {
		getStateHelper().put(HIDE_ON, hideOn);
	}

	public java.lang.Object getHsvPalette() {
		return (java.lang.Object) getStateHelper().eval(HSV_PALETTE, null);
	}

	public void setHsvPalette(java.lang.Object hsvPalette) {
		getStateHelper().put(HSV_PALETTE, hsvPalette);
	}

	public java.lang.String getColorPickerPopoverId() {
		return (java.lang.String) getStateHelper().eval(COLOR_PICKER_POPOVER_ID, null);
	}

	public void setColorPickerPopoverId(java.lang.String colorPickerPopoverId) {
		getStateHelper().put(COLOR_PICKER_POPOVER_ID, colorPickerPopoverId);
	}

	public java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	public java.lang.String getColorPickerPopoverLocale() {
		return (java.lang.String) getStateHelper().eval(COLOR_PICKER_POPOVER_LOCALE, null);
	}

	public void setColorPickerPopoverLocale(java.lang.String colorPickerPopoverLocale) {
		getStateHelper().put(COLOR_PICKER_POPOVER_LOCALE, colorPickerPopoverLocale);
	}

	public java.lang.Object getMaskNode() {
		return (java.lang.Object) getStateHelper().eval(MASK_NODE, null);
	}

	public void setMaskNode(java.lang.Object maskNode) {
		getStateHelper().put(MASK_NODE, maskNode);
	}

	public java.lang.Boolean getModal() {
		return (java.lang.Boolean) getStateHelper().eval(MODAL, null);
	}

	public void setModal(java.lang.Boolean modal) {
		getStateHelper().put(MODAL, modal);
	}

	public java.lang.Boolean getPreventOverlap() {
		return (java.lang.Boolean) getStateHelper().eval(PREVENT_OVERLAP, null);
	}

	public void setPreventOverlap(java.lang.Boolean preventOverlap) {
		getStateHelper().put(PREVENT_OVERLAP, preventOverlap);
	}

	public java.lang.Object getRecentColors() {
		return (java.lang.Object) getStateHelper().eval(RECENT_COLORS, null);
	}

	public void setRecentColors(java.lang.Object recentColors) {
		getStateHelper().put(RECENT_COLORS, recentColors);
	}

	public java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	public void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	public java.lang.Boolean getRenderColorPalette() {
		return (java.lang.Boolean) getStateHelper().eval(RENDER_COLOR_PALETTE, null);
	}

	public void setRenderColorPalette(java.lang.Boolean renderColorPalette) {
		getStateHelper().put(RENDER_COLOR_PALETTE, renderColorPalette);
	}

	public java.lang.Boolean getRenderHSVPalette() {
		return (java.lang.Boolean) getStateHelper().eval(RENDER_HSVPALETTE, null);
	}

	public void setRenderHSVPalette(java.lang.Boolean renderHSVPalette) {
		getStateHelper().put(RENDER_HSVPALETTE, renderHSVPalette);
	}

	public java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	public void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	public java.lang.Boolean getShim() {
		return (java.lang.Boolean) getStateHelper().eval(SHIM, null);
	}

	public void setShim(java.lang.Boolean shim) {
		getStateHelper().put(SHIM, shim);
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

	public java.lang.Object getToolbarPosition() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR_POSITION, null);
	}

	public void setToolbarPosition(java.lang.Object toolbarPosition) {
		getStateHelper().put(TOOLBAR_POSITION, toolbarPosition);
	}

	public java.lang.String getToolbars() {
		return (java.lang.String) getStateHelper().eval(TOOLBARS, null);
	}

	public void setToolbars(java.lang.String toolbars) {
		getStateHelper().put(TOOLBARS, toolbars);
	}

	public java.lang.String getTrigger() {
		return (java.lang.String) getStateHelper().eval(TRIGGER, null);
	}

	public void setTrigger(java.lang.String trigger) {
		getStateHelper().put(TRIGGER, trigger);
	}

	public java.lang.String getTriggerEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_EVENT, null);
	}

	public void setTriggerEvent(java.lang.String triggerEvent) {
		getStateHelper().put(TRIGGER_EVENT, triggerEvent);
	}

	public java.lang.String getTriggerToggleEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_TOGGLE_EVENT, null);
	}

	public void setTriggerToggleEvent(java.lang.String triggerToggleEvent) {
		getStateHelper().put(TRIGGER_TOGGLE_EVENT, triggerToggleEvent);
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

	public java.lang.Object getXy() {
		return (java.lang.Object) getStateHelper().eval(XY, null);
	}

	public void setXy(java.lang.Object xy) {
		getStateHelper().put(XY, xy);
	}

	public java.lang.Object getY() {
		return (java.lang.Object) getStateHelper().eval(Y, null);
	}

	public void setY(java.lang.Object y) {
		getStateHelper().put(Y, y);
	}

	public java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	public void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	public java.lang.String getAfterAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_CHANGE, null);
	}

	public void setAfterAlignChange(java.lang.String afterAlignChange) {
		getStateHelper().put(AFTER_ALIGN_CHANGE, afterAlignChange);
	}

	public java.lang.String getAfterAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_ON_CHANGE, null);
	}

	public void setAfterAlignOnChange(java.lang.String afterAlignOnChange) {
		getStateHelper().put(AFTER_ALIGN_ON_CHANGE, afterAlignOnChange);
	}

	public java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	public void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	public java.lang.String getAfterCenteredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CENTERED_CHANGE, null);
	}

	public void setAfterCenteredChange(java.lang.String afterCenteredChange) {
		getStateHelper().put(AFTER_CENTERED_CHANGE, afterCenteredChange);
	}

	public java.lang.String getAfterColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_CHANGE, null);
	}

	public void setAfterColorChange(java.lang.String afterColorChange) {
		getStateHelper().put(AFTER_COLOR_CHANGE, afterColorChange);
	}

	public java.lang.String getAfterColorPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_COLOR_PALETTE_CHANGE, null);
	}

	public void setAfterColorPaletteChange(java.lang.String afterColorPaletteChange) {
		getStateHelper().put(AFTER_COLOR_PALETTE_CHANGE, afterColorPaletteChange);
	}

	public java.lang.String getAfterConstrainChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONSTRAIN_CHANGE, null);
	}

	public void setAfterConstrainChange(java.lang.String afterConstrainChange) {
		getStateHelper().put(AFTER_CONSTRAIN_CHANGE, afterConstrainChange);
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

	public java.lang.String getAfterCurrentTriggerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CURRENT_TRIGGER_CHANGE, null);
	}

	public void setAfterCurrentTriggerChange(java.lang.String afterCurrentTriggerChange) {
		getStateHelper().put(AFTER_CURRENT_TRIGGER_CHANGE, afterCurrentTriggerChange);
	}

	public java.lang.String getAfterDefaultColorChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DEFAULT_COLOR_CHANGE, null);
	}

	public void setAfterDefaultColorChange(java.lang.String afterDefaultColorChange) {
		getStateHelper().put(AFTER_DEFAULT_COLOR_CHANGE, afterDefaultColorChange);
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

	public java.lang.String getAfterFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILL_HEIGHT_CHANGE, null);
	}

	public void setAfterFillHeightChange(java.lang.String afterFillHeightChange) {
		getStateHelper().put(AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange);
	}

	public java.lang.String getAfterFocusOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUS_ON_CHANGE, null);
	}

	public void setAfterFocusOnChange(java.lang.String afterFocusOnChange) {
		getStateHelper().put(AFTER_FOCUS_ON_CHANGE, afterFocusOnChange);
	}

	public java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	public java.lang.String getAfterFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOOTER_CONTENT_CHANGE, null);
	}

	public void setAfterFooterContentChange(java.lang.String afterFooterContentChange) {
		getStateHelper().put(AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange);
	}

	public java.lang.String getAfterHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_CONTENT_CHANGE, null);
	}

	public void setAfterHeaderContentChange(java.lang.String afterHeaderContentChange) {
		getStateHelper().put(AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange);
	}

	public java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	public java.lang.String getAfterHideOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_ON_CHANGE, null);
	}

	public void setAfterHideOnChange(java.lang.String afterHideOnChange) {
		getStateHelper().put(AFTER_HIDE_ON_CHANGE, afterHideOnChange);
	}

	public java.lang.String getAfterHsvPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HSV_PALETTE_CHANGE, null);
	}

	public void setAfterHsvPaletteChange(java.lang.String afterHsvPaletteChange) {
		getStateHelper().put(AFTER_HSV_PALETTE_CHANGE, afterHsvPaletteChange);
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

	public java.lang.String getAfterMaskNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MASK_NODE_CHANGE, null);
	}

	public void setAfterMaskNodeChange(java.lang.String afterMaskNodeChange) {
		getStateHelper().put(AFTER_MASK_NODE_CHANGE, afterMaskNodeChange);
	}

	public java.lang.String getAfterModalChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_MODAL_CHANGE, null);
	}

	public void setAfterModalChange(java.lang.String afterModalChange) {
		getStateHelper().put(AFTER_MODAL_CHANGE, afterModalChange);
	}

	public java.lang.String getAfterPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREVENT_OVERLAP_CHANGE, null);
	}

	public void setAfterPreventOverlapChange(java.lang.String afterPreventOverlapChange) {
		getStateHelper().put(AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange);
	}

	public java.lang.String getAfterRecentColorsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RECENT_COLORS_CHANGE, null);
	}

	public void setAfterRecentColorsChange(java.lang.String afterRecentColorsChange) {
		getStateHelper().put(AFTER_RECENT_COLORS_CHANGE, afterRecentColorsChange);
	}

	public java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	public void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	public java.lang.String getAfterRenderColorPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_COLOR_PALETTE_CHANGE, null);
	}

	public void setAfterRenderColorPaletteChange(java.lang.String afterRenderColorPaletteChange) {
		getStateHelper().put(AFTER_RENDER_COLOR_PALETTE_CHANGE, afterRenderColorPaletteChange);
	}

	public java.lang.String getAfterRenderHSVPaletteChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_HSVPALETTE_CHANGE, null);
	}

	public void setAfterRenderHSVPaletteChange(java.lang.String afterRenderHSVPaletteChange) {
		getStateHelper().put(AFTER_RENDER_HSVPALETTE_CHANGE, afterRenderHSVPaletteChange);
	}

	public java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	public void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	public java.lang.String getAfterShimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHIM_CHANGE, null);
	}

	public void setAfterShimChange(java.lang.String afterShimChange) {
		getStateHelper().put(AFTER_SHIM_CHANGE, afterShimChange);
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

	public java.lang.String getAfterToolbarPositionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_POSITION_CHANGE, null);
	}

	public void setAfterToolbarPositionChange(java.lang.String afterToolbarPositionChange) {
		getStateHelper().put(AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange);
	}

	public java.lang.String getAfterToolbarsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBARS_CHANGE, null);
	}

	public void setAfterToolbarsChange(java.lang.String afterToolbarsChange) {
		getStateHelper().put(AFTER_TOOLBARS_CHANGE, afterToolbarsChange);
	}

	public java.lang.String getAfterTriggerChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_CHANGE, null);
	}

	public void setAfterTriggerChange(java.lang.String afterTriggerChange) {
		getStateHelper().put(AFTER_TRIGGER_CHANGE, afterTriggerChange);
	}

	public java.lang.String getAfterTriggerEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_EVENT_CHANGE, null);
	}

	public void setAfterTriggerEventChange(java.lang.String afterTriggerEventChange) {
		getStateHelper().put(AFTER_TRIGGER_EVENT_CHANGE, afterTriggerEventChange);
	}

	public java.lang.String getAfterTriggerToggleEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_TOGGLE_EVENT_CHANGE, null);
	}

	public void setAfterTriggerToggleEventChange(java.lang.String afterTriggerToggleEventChange) {
		getStateHelper().put(AFTER_TRIGGER_TOGGLE_EVENT_CHANGE, afterTriggerToggleEventChange);
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

	public java.lang.String getAfterXyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XY_CHANGE, null);
	}

	public void setAfterXyChange(java.lang.String afterXyChange) {
		getStateHelper().put(AFTER_XY_CHANGE, afterXyChange);
	}

	public java.lang.String getAfterYChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YCHANGE, null);
	}

	public void setAfterYChange(java.lang.String afterYChange) {
		getStateHelper().put(AFTER_YCHANGE, afterYChange);
	}

	public java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	public void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	public java.lang.String getOnAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_CHANGE, null);
	}

	public void setOnAlignChange(java.lang.String onAlignChange) {
		getStateHelper().put(ON_ALIGN_CHANGE, onAlignChange);
	}

	public java.lang.String getOnAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_ON_CHANGE, null);
	}

	public void setOnAlignOnChange(java.lang.String onAlignOnChange) {
		getStateHelper().put(ON_ALIGN_ON_CHANGE, onAlignOnChange);
	}

	public java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	public void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	public java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	public java.lang.String getOnCenteredChange() {
		return (java.lang.String) getStateHelper().eval(ON_CENTERED_CHANGE, null);
	}

	public void setOnCenteredChange(java.lang.String onCenteredChange) {
		getStateHelper().put(ON_CENTERED_CHANGE, onCenteredChange);
	}

	public java.lang.String getOnColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_CHANGE, null);
	}

	public void setOnColorChange(java.lang.String onColorChange) {
		getStateHelper().put(ON_COLOR_CHANGE, onColorChange);
	}

	public java.lang.String getOnColorPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_COLOR_PALETTE_CHANGE, null);
	}

	public void setOnColorPaletteChange(java.lang.String onColorPaletteChange) {
		getStateHelper().put(ON_COLOR_PALETTE_CHANGE, onColorPaletteChange);
	}

	public java.lang.String getOnConstrainChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONSTRAIN_CHANGE, null);
	}

	public void setOnConstrainChange(java.lang.String onConstrainChange) {
		getStateHelper().put(ON_CONSTRAIN_CHANGE, onConstrainChange);
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

	public java.lang.String getOnCurrentTriggerChange() {
		return (java.lang.String) getStateHelper().eval(ON_CURRENT_TRIGGER_CHANGE, null);
	}

	public void setOnCurrentTriggerChange(java.lang.String onCurrentTriggerChange) {
		getStateHelper().put(ON_CURRENT_TRIGGER_CHANGE, onCurrentTriggerChange);
	}

	public java.lang.String getOnDefaultColorChange() {
		return (java.lang.String) getStateHelper().eval(ON_DEFAULT_COLOR_CHANGE, null);
	}

	public void setOnDefaultColorChange(java.lang.String onDefaultColorChange) {
		getStateHelper().put(ON_DEFAULT_COLOR_CHANGE, onDefaultColorChange);
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

	public java.lang.String getOnFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILL_HEIGHT_CHANGE, null);
	}

	public void setOnFillHeightChange(java.lang.String onFillHeightChange) {
		getStateHelper().put(ON_FILL_HEIGHT_CHANGE, onFillHeightChange);
	}

	public java.lang.String getOnFocusOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUS_ON_CHANGE, null);
	}

	public void setOnFocusOnChange(java.lang.String onFocusOnChange) {
		getStateHelper().put(ON_FOCUS_ON_CHANGE, onFocusOnChange);
	}

	public java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	public java.lang.String getOnFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOOTER_CONTENT_CHANGE, null);
	}

	public void setOnFooterContentChange(java.lang.String onFooterContentChange) {
		getStateHelper().put(ON_FOOTER_CONTENT_CHANGE, onFooterContentChange);
	}

	public java.lang.String getOnHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_CONTENT_CHANGE, null);
	}

	public void setOnHeaderContentChange(java.lang.String onHeaderContentChange) {
		getStateHelper().put(ON_HEADER_CONTENT_CHANGE, onHeaderContentChange);
	}

	public java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	public java.lang.String getOnHideOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_ON_CHANGE, null);
	}

	public void setOnHideOnChange(java.lang.String onHideOnChange) {
		getStateHelper().put(ON_HIDE_ON_CHANGE, onHideOnChange);
	}

	public java.lang.String getOnHsvPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_HSV_PALETTE_CHANGE, null);
	}

	public void setOnHsvPaletteChange(java.lang.String onHsvPaletteChange) {
		getStateHelper().put(ON_HSV_PALETTE_CHANGE, onHsvPaletteChange);
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

	public java.lang.String getOnMaskNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_MASK_NODE_CHANGE, null);
	}

	public void setOnMaskNodeChange(java.lang.String onMaskNodeChange) {
		getStateHelper().put(ON_MASK_NODE_CHANGE, onMaskNodeChange);
	}

	public java.lang.String getOnModalChange() {
		return (java.lang.String) getStateHelper().eval(ON_MODAL_CHANGE, null);
	}

	public void setOnModalChange(java.lang.String onModalChange) {
		getStateHelper().put(ON_MODAL_CHANGE, onModalChange);
	}

	public java.lang.String getOnPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREVENT_OVERLAP_CHANGE, null);
	}

	public void setOnPreventOverlapChange(java.lang.String onPreventOverlapChange) {
		getStateHelper().put(ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange);
	}

	public java.lang.String getOnRecentColorsChange() {
		return (java.lang.String) getStateHelper().eval(ON_RECENT_COLORS_CHANGE, null);
	}

	public void setOnRecentColorsChange(java.lang.String onRecentColorsChange) {
		getStateHelper().put(ON_RECENT_COLORS_CHANGE, onRecentColorsChange);
	}

	public java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	public void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	public java.lang.String getOnRenderColorPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_COLOR_PALETTE_CHANGE, null);
	}

	public void setOnRenderColorPaletteChange(java.lang.String onRenderColorPaletteChange) {
		getStateHelper().put(ON_RENDER_COLOR_PALETTE_CHANGE, onRenderColorPaletteChange);
	}

	public java.lang.String getOnRenderHSVPaletteChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_HSVPALETTE_CHANGE, null);
	}

	public void setOnRenderHSVPaletteChange(java.lang.String onRenderHSVPaletteChange) {
		getStateHelper().put(ON_RENDER_HSVPALETTE_CHANGE, onRenderHSVPaletteChange);
	}

	public java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	public void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	public java.lang.String getOnShimChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHIM_CHANGE, null);
	}

	public void setOnShimChange(java.lang.String onShimChange) {
		getStateHelper().put(ON_SHIM_CHANGE, onShimChange);
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

	public java.lang.String getOnToolbarPositionChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_POSITION_CHANGE, null);
	}

	public void setOnToolbarPositionChange(java.lang.String onToolbarPositionChange) {
		getStateHelper().put(ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange);
	}

	public java.lang.String getOnToolbarsChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBARS_CHANGE, null);
	}

	public void setOnToolbarsChange(java.lang.String onToolbarsChange) {
		getStateHelper().put(ON_TOOLBARS_CHANGE, onToolbarsChange);
	}

	public java.lang.String getOnTriggerChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_CHANGE, null);
	}

	public void setOnTriggerChange(java.lang.String onTriggerChange) {
		getStateHelper().put(ON_TRIGGER_CHANGE, onTriggerChange);
	}

	public java.lang.String getOnTriggerEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_EVENT_CHANGE, null);
	}

	public void setOnTriggerEventChange(java.lang.String onTriggerEventChange) {
		getStateHelper().put(ON_TRIGGER_EVENT_CHANGE, onTriggerEventChange);
	}

	public java.lang.String getOnTriggerToggleEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_TOGGLE_EVENT_CHANGE, null);
	}

	public void setOnTriggerToggleEventChange(java.lang.String onTriggerToggleEventChange) {
		getStateHelper().put(ON_TRIGGER_TOGGLE_EVENT_CHANGE, onTriggerToggleEventChange);
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

	public java.lang.String getOnXyChange() {
		return (java.lang.String) getStateHelper().eval(ON_XY_CHANGE, null);
	}

	public void setOnXyChange(java.lang.String onXyChange) {
		getStateHelper().put(ON_XY_CHANGE, onXyChange);
	}

	public java.lang.String getOnYChange() {
		return (java.lang.String) getStateHelper().eval(ON_YCHANGE, null);
	}

	public void setOnYChange(java.lang.String onYChange) {
		getStateHelper().put(ON_YCHANGE, onYChange);
	}

	public java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	public void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}