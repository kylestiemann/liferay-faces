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
package com.liferay.faces.alloy.component.tooltip;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class TooltipBase extends javax.faces.component.UIPanel {

	private static final String ALIGN = "align";
	private static final String ALIGN_ON = "alignOn";
	private static final String TOOLTIP_BODY_CONTENT = "tooltipBodyContent";
	private static final String BOUNDING_BOX = "boundingBox";
	private static final String CENTERED = "centered";
	private static final String CONSTRAIN = "constrain";
	private static final String CONTENT_BOX = "contentBox";
	private static final String DESTROYED = "destroyed";
	private static final String DISABLED = "disabled";
	private static final String DURATION = "duration";
	private static final String FILL_HEIGHT = "fillHeight";
	private static final String FOCUSED = "focused";
	private static final String FOOTER_CONTENT = "footerContent";
	private static final String FORMATTER = "formatter";
	private static final String HEADER_CONTENT = "headerContent";
	private static final String HEIGHT = "height";
	private static final String HIDE_ON = "hideOn";
	private static final String TOOLTIP_ID = "tooltipId";
	private static final String INITIALIZED = "initialized";
	private static final String TOOLTIP_LOCALE = "tooltipLocale";
	private static final String OPACITY = "opacity";
	private static final String PREVENT_OVERLAP = "preventOverlap";
	private static final String RENDER = "render";
	private static final String RENDERED = "rendered";
	private static final String SHIM = "shim";
	private static final String SRC_NODE = "srcNode";
	private static final String STRINGS = "strings";
	private static final String TAB_INDEX = "tabIndex";
	private static final String TOOLBAR_POSITION = "toolbarPosition";
	private static final String TOOLBARS = "toolbars";
	private static final String TRIGGER_HIDE_EVENT = "triggerHideEvent";
	private static final String TRIGGER_SHOW_EVENT = "triggerShowEvent";
	private static final String VISIBLE = "visible";
	private static final String WIDTH = "width";
	private static final String X = "x";
	private static final String XY = "xy";
	private static final String Y = "y";
	private static final String Z_INDEX = "zIndex";
	private static final String AFTER_ALIGN_CHANGE = "afterAlignChange";
	private static final String AFTER_ALIGN_ON_CHANGE = "afterAlignOnChange";
	private static final String AFTER_BODY_CONTENT_CHANGE = "afterBodyContentChange";
	private static final String AFTER_BOUNDING_BOX_CHANGE = "afterBoundingBoxChange";
	private static final String AFTER_CENTERED_CHANGE = "afterCenteredChange";
	private static final String AFTER_CONSTRAIN_CHANGE = "afterConstrainChange";
	private static final String AFTER_CONTENT_BOX_CHANGE = "afterContentBoxChange";
	private static final String AFTER_DESTROYED_CHANGE = "afterDestroyedChange";
	private static final String AFTER_DISABLED_CHANGE = "afterDisabledChange";
	private static final String AFTER_DURATION_CHANGE = "afterDurationChange";
	private static final String AFTER_FILL_HEIGHT_CHANGE = "afterFillHeightChange";
	private static final String AFTER_FOCUSED_CHANGE = "afterFocusedChange";
	private static final String AFTER_FOOTER_CONTENT_CHANGE = "afterFooterContentChange";
	private static final String AFTER_FORMATTER_CHANGE = "afterFormatterChange";
	private static final String AFTER_HEADER_CONTENT_CHANGE = "afterHeaderContentChange";
	private static final String AFTER_HEIGHT_CHANGE = "afterHeightChange";
	private static final String AFTER_HIDE_ON_CHANGE = "afterHideOnChange";
	private static final String AFTER_ID_CHANGE = "afterIdChange";
	private static final String AFTER_INITIALIZED_CHANGE = "afterInitializedChange";
	private static final String AFTER_LOCALE_CHANGE = "afterLocaleChange";
	private static final String AFTER_OPACITY_CHANGE = "afterOpacityChange";
	private static final String AFTER_PREVENT_OVERLAP_CHANGE = "afterPreventOverlapChange";
	private static final String AFTER_RENDER_CHANGE = "afterRenderChange";
	private static final String AFTER_RENDERED_CHANGE = "afterRenderedChange";
	private static final String AFTER_SHIM_CHANGE = "afterShimChange";
	private static final String AFTER_SRC_NODE_CHANGE = "afterSrcNodeChange";
	private static final String AFTER_STRINGS_CHANGE = "afterStringsChange";
	private static final String AFTER_TAB_INDEX_CHANGE = "afterTabIndexChange";
	private static final String AFTER_TOOLBAR_POSITION_CHANGE = "afterToolbarPositionChange";
	private static final String AFTER_TOOLBARS_CHANGE = "afterToolbarsChange";
	private static final String AFTER_TRIGGER_HIDE_EVENT_CHANGE = "afterTriggerHideEventChange";
	private static final String AFTER_TRIGGER_SHOW_EVENT_CHANGE = "afterTriggerShowEventChange";
	private static final String AFTER_VISIBLE_CHANGE = "afterVisibleChange";
	private static final String AFTER_WIDTH_CHANGE = "afterWidthChange";
	private static final String AFTER_XCHANGE = "afterXChange";
	private static final String AFTER_XY_CHANGE = "afterXyChange";
	private static final String AFTER_YCHANGE = "afterYChange";
	private static final String AFTER_ZINDEX_CHANGE = "afterZIndexChange";
	private static final String ON_ALIGN_CHANGE = "onAlignChange";
	private static final String ON_ALIGN_ON_CHANGE = "onAlignOnChange";
	private static final String ON_BODY_CONTENT_CHANGE = "onBodyContentChange";
	private static final String ON_BOUNDING_BOX_CHANGE = "onBoundingBoxChange";
	private static final String ON_CENTERED_CHANGE = "onCenteredChange";
	private static final String ON_CONSTRAIN_CHANGE = "onConstrainChange";
	private static final String ON_CONTENT_BOX_CHANGE = "onContentBoxChange";
	private static final String ON_DESTROYED_CHANGE = "onDestroyedChange";
	private static final String ON_DISABLED_CHANGE = "onDisabledChange";
	private static final String ON_DURATION_CHANGE = "onDurationChange";
	private static final String ON_FILL_HEIGHT_CHANGE = "onFillHeightChange";
	private static final String ON_FOCUSED_CHANGE = "onFocusedChange";
	private static final String ON_FOOTER_CONTENT_CHANGE = "onFooterContentChange";
	private static final String ON_FORMATTER_CHANGE = "onFormatterChange";
	private static final String ON_HEADER_CONTENT_CHANGE = "onHeaderContentChange";
	private static final String ON_HEIGHT_CHANGE = "onHeightChange";
	private static final String ON_HIDE_ON_CHANGE = "onHideOnChange";
	private static final String ON_ID_CHANGE = "onIdChange";
	private static final String ON_INITIALIZED_CHANGE = "onInitializedChange";
	private static final String ON_LOCALE_CHANGE = "onLocaleChange";
	private static final String ON_OPACITY_CHANGE = "onOpacityChange";
	private static final String ON_PREVENT_OVERLAP_CHANGE = "onPreventOverlapChange";
	private static final String ON_RENDER_CHANGE = "onRenderChange";
	private static final String ON_RENDERED_CHANGE = "onRenderedChange";
	private static final String ON_SHIM_CHANGE = "onShimChange";
	private static final String ON_SRC_NODE_CHANGE = "onSrcNodeChange";
	private static final String ON_STRINGS_CHANGE = "onStringsChange";
	private static final String ON_TAB_INDEX_CHANGE = "onTabIndexChange";
	private static final String ON_TOOLBAR_POSITION_CHANGE = "onToolbarPositionChange";
	private static final String ON_TOOLBARS_CHANGE = "onToolbarsChange";
	private static final String ON_TRIGGER_HIDE_EVENT_CHANGE = "onTriggerHideEventChange";
	private static final String ON_TRIGGER_SHOW_EVENT_CHANGE = "onTriggerShowEventChange";
	private static final String ON_VISIBLE_CHANGE = "onVisibleChange";
	private static final String ON_WIDTH_CHANGE = "onWidthChange";
	private static final String ON_XCHANGE = "onXChange";
	private static final String ON_XY_CHANGE = "onXyChange";
	private static final String ON_YCHANGE = "onYChange";
	private static final String ON_ZINDEX_CHANGE = "onZIndexChange";

	protected java.lang.Object getAlign() {
		return (java.lang.Object) getStateHelper().eval(ALIGN, null);
	}

	protected void setAlign(java.lang.Object align) {
		getStateHelper().put(ALIGN, align);
	}

	protected java.lang.Object getAlignOn() {
		return (java.lang.Object) getStateHelper().eval(ALIGN_ON, null);
	}

	protected void setAlignOn(java.lang.Object alignOn) {
		getStateHelper().put(ALIGN_ON, alignOn);
	}

	protected java.lang.Object getTooltipBodyContent() {
		return (java.lang.Object) getStateHelper().eval(TOOLTIP_BODY_CONTENT, null);
	}

	protected void setTooltipBodyContent(java.lang.Object tooltipBodyContent) {
		getStateHelper().put(TOOLTIP_BODY_CONTENT, tooltipBodyContent);
	}

	protected java.lang.String getBoundingBox() {
		return (java.lang.String) getStateHelper().eval(BOUNDING_BOX, null);
	}

	protected void setBoundingBox(java.lang.String boundingBox) {
		getStateHelper().put(BOUNDING_BOX, boundingBox);
	}

	protected java.lang.Object getCentered() {
		return (java.lang.Object) getStateHelper().eval(CENTERED, null);
	}

	protected void setCentered(java.lang.Object centered) {
		getStateHelper().put(CENTERED, centered);
	}

	protected java.lang.Object getConstrain() {
		return (java.lang.Object) getStateHelper().eval(CONSTRAIN, null);
	}

	protected void setConstrain(java.lang.Object constrain) {
		getStateHelper().put(CONSTRAIN, constrain);
	}

	protected java.lang.String getContentBox() {
		return (java.lang.String) getStateHelper().eval(CONTENT_BOX, null);
	}

	protected void setContentBox(java.lang.String contentBox) {
		getStateHelper().put(CONTENT_BOX, contentBox);
	}

	protected java.lang.Boolean getDestroyed() {
		return (java.lang.Boolean) getStateHelper().eval(DESTROYED, null);
	}

	protected void setDestroyed(java.lang.Boolean destroyed) {
		getStateHelper().put(DESTROYED, destroyed);
	}

	protected java.lang.Boolean getDisabled() {
		return (java.lang.Boolean) getStateHelper().eval(DISABLED, null);
	}

	protected void setDisabled(java.lang.Boolean disabled) {
		getStateHelper().put(DISABLED, disabled);
	}

	protected java.lang.Object getDuration() {
		return (java.lang.Object) getStateHelper().eval(DURATION, null);
	}

	protected void setDuration(java.lang.Object duration) {
		getStateHelper().put(DURATION, duration);
	}

	protected java.lang.Object getFillHeight() {
		return (java.lang.Object) getStateHelper().eval(FILL_HEIGHT, null);
	}

	protected void setFillHeight(java.lang.Object fillHeight) {
		getStateHelper().put(FILL_HEIGHT, fillHeight);
	}

	protected java.lang.Boolean getFocused() {
		return (java.lang.Boolean) getStateHelper().eval(FOCUSED, null);
	}

	protected void setFocused(java.lang.Boolean focused) {
		getStateHelper().put(FOCUSED, focused);
	}

	protected java.lang.Object getFooterContent() {
		return (java.lang.Object) getStateHelper().eval(FOOTER_CONTENT, null);
	}

	protected void setFooterContent(java.lang.Object footerContent) {
		getStateHelper().put(FOOTER_CONTENT, footerContent);
	}

	protected java.lang.Object getFormatter() {
		return (java.lang.Object) getStateHelper().eval(FORMATTER, null);
	}

	protected void setFormatter(java.lang.Object formatter) {
		getStateHelper().put(FORMATTER, formatter);
	}

	protected java.lang.Object getHeaderContent() {
		return (java.lang.Object) getStateHelper().eval(HEADER_CONTENT, null);
	}

	protected void setHeaderContent(java.lang.Object headerContent) {
		getStateHelper().put(HEADER_CONTENT, headerContent);
	}

	protected java.lang.Object getHeight() {
		return (java.lang.Object) getStateHelper().eval(HEIGHT, null);
	}

	protected void setHeight(java.lang.Object height) {
		getStateHelper().put(HEIGHT, height);
	}

	protected java.lang.Object getHideOn() {
		return (java.lang.Object) getStateHelper().eval(HIDE_ON, null);
	}

	protected void setHideOn(java.lang.Object hideOn) {
		getStateHelper().put(HIDE_ON, hideOn);
	}

	protected java.lang.String getTooltipId() {
		return (java.lang.String) getStateHelper().eval(TOOLTIP_ID, null);
	}

	protected void setTooltipId(java.lang.String tooltipId) {
		getStateHelper().put(TOOLTIP_ID, tooltipId);
	}

	protected java.lang.Boolean getInitialized() {
		return (java.lang.Boolean) getStateHelper().eval(INITIALIZED, null);
	}

	protected void setInitialized(java.lang.Boolean initialized) {
		getStateHelper().put(INITIALIZED, initialized);
	}

	protected java.lang.String getTooltipLocale() {
		return (java.lang.String) getStateHelper().eval(TOOLTIP_LOCALE, null);
	}

	protected void setTooltipLocale(java.lang.String tooltipLocale) {
		getStateHelper().put(TOOLTIP_LOCALE, tooltipLocale);
	}

	protected java.lang.Object getOpacity() {
		return (java.lang.Object) getStateHelper().eval(OPACITY, null);
	}

	protected void setOpacity(java.lang.Object opacity) {
		getStateHelper().put(OPACITY, opacity);
	}

	protected java.lang.Boolean getPreventOverlap() {
		return (java.lang.Boolean) getStateHelper().eval(PREVENT_OVERLAP, null);
	}

	protected void setPreventOverlap(java.lang.Boolean preventOverlap) {
		getStateHelper().put(PREVENT_OVERLAP, preventOverlap);
	}

	protected java.lang.Object getRender() {
		return (java.lang.Object) getStateHelper().eval(RENDER, null);
	}

	protected void setRender(java.lang.Object render) {
		getStateHelper().put(RENDER, render);
	}

	protected java.lang.Boolean getRendered() {
		return (java.lang.Boolean) getStateHelper().eval(RENDERED, null);
	}

	protected void setRendered(java.lang.Boolean rendered) {
		getStateHelper().put(RENDERED, rendered);
	}

	protected java.lang.Boolean getShim() {
		return (java.lang.Boolean) getStateHelper().eval(SHIM, null);
	}

	protected void setShim(java.lang.Boolean shim) {
		getStateHelper().put(SHIM, shim);
	}

	protected java.lang.String getSrcNode() {
		return (java.lang.String) getStateHelper().eval(SRC_NODE, null);
	}

	protected void setSrcNode(java.lang.String srcNode) {
		getStateHelper().put(SRC_NODE, srcNode);
	}

	protected java.lang.Object getStrings() {
		return (java.lang.Object) getStateHelper().eval(STRINGS, null);
	}

	protected void setStrings(java.lang.Object strings) {
		getStateHelper().put(STRINGS, strings);
	}

	protected java.lang.Object getTabIndex() {
		return (java.lang.Object) getStateHelper().eval(TAB_INDEX, null);
	}

	protected void setTabIndex(java.lang.Object tabIndex) {
		getStateHelper().put(TAB_INDEX, tabIndex);
	}

	protected java.lang.Object getToolbarPosition() {
		return (java.lang.Object) getStateHelper().eval(TOOLBAR_POSITION, null);
	}

	protected void setToolbarPosition(java.lang.Object toolbarPosition) {
		getStateHelper().put(TOOLBAR_POSITION, toolbarPosition);
	}

	protected java.lang.Object getToolbars() {
		return (java.lang.Object) getStateHelper().eval(TOOLBARS, null);
	}

	protected void setToolbars(java.lang.Object toolbars) {
		getStateHelper().put(TOOLBARS, toolbars);
	}

	protected java.lang.String getTriggerHideEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_HIDE_EVENT, null);
	}

	protected void setTriggerHideEvent(java.lang.String triggerHideEvent) {
		getStateHelper().put(TRIGGER_HIDE_EVENT, triggerHideEvent);
	}

	protected java.lang.String getTriggerShowEvent() {
		return (java.lang.String) getStateHelper().eval(TRIGGER_SHOW_EVENT, null);
	}

	protected void setTriggerShowEvent(java.lang.String triggerShowEvent) {
		getStateHelper().put(TRIGGER_SHOW_EVENT, triggerShowEvent);
	}

	protected java.lang.Boolean getVisible() {
		return (java.lang.Boolean) getStateHelper().eval(VISIBLE, null);
	}

	protected void setVisible(java.lang.Boolean visible) {
		getStateHelper().put(VISIBLE, visible);
	}

	protected java.lang.Object getWidth() {
		return (java.lang.Object) getStateHelper().eval(WIDTH, null);
	}

	protected void setWidth(java.lang.Object width) {
		getStateHelper().put(WIDTH, width);
	}

	protected java.lang.Object getX() {
		return (java.lang.Object) getStateHelper().eval(X, null);
	}

	protected void setX(java.lang.Object x) {
		getStateHelper().put(X, x);
	}

	protected java.lang.Object getXy() {
		return (java.lang.Object) getStateHelper().eval(XY, null);
	}

	protected void setXy(java.lang.Object xy) {
		getStateHelper().put(XY, xy);
	}

	protected java.lang.Object getY() {
		return (java.lang.Object) getStateHelper().eval(Y, null);
	}

	protected void setY(java.lang.Object y) {
		getStateHelper().put(Y, y);
	}

	protected java.lang.Object getZIndex() {
		return (java.lang.Object) getStateHelper().eval(Z_INDEX, null);
	}

	protected void setZIndex(java.lang.Object zIndex) {
		getStateHelper().put(Z_INDEX, zIndex);
	}

	protected java.lang.String getAfterAlignChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_CHANGE, null);
	}

	protected void setAfterAlignChange(java.lang.String afterAlignChange) {
		getStateHelper().put(AFTER_ALIGN_CHANGE, afterAlignChange);
	}

	protected java.lang.String getAfterAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ALIGN_ON_CHANGE, null);
	}

	protected void setAfterAlignOnChange(java.lang.String afterAlignOnChange) {
		getStateHelper().put(AFTER_ALIGN_ON_CHANGE, afterAlignOnChange);
	}

	protected java.lang.String getAfterBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BODY_CONTENT_CHANGE, null);
	}

	protected void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		getStateHelper().put(AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange);
	}

	protected java.lang.String getAfterBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_BOUNDING_BOX_CHANGE, null);
	}

	protected void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		getStateHelper().put(AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange);
	}

	protected java.lang.String getAfterCenteredChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CENTERED_CHANGE, null);
	}

	protected void setAfterCenteredChange(java.lang.String afterCenteredChange) {
		getStateHelper().put(AFTER_CENTERED_CHANGE, afterCenteredChange);
	}

	protected java.lang.String getAfterConstrainChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONSTRAIN_CHANGE, null);
	}

	protected void setAfterConstrainChange(java.lang.String afterConstrainChange) {
		getStateHelper().put(AFTER_CONSTRAIN_CHANGE, afterConstrainChange);
	}

	protected java.lang.String getAfterContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_CONTENT_BOX_CHANGE, null);
	}

	protected void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		getStateHelper().put(AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange);
	}

	protected java.lang.String getAfterDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DESTROYED_CHANGE, null);
	}

	protected void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		getStateHelper().put(AFTER_DESTROYED_CHANGE, afterDestroyedChange);
	}

	protected java.lang.String getAfterDisabledChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DISABLED_CHANGE, null);
	}

	protected void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		getStateHelper().put(AFTER_DISABLED_CHANGE, afterDisabledChange);
	}

	protected java.lang.String getAfterDurationChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_DURATION_CHANGE, null);
	}

	protected void setAfterDurationChange(java.lang.String afterDurationChange) {
		getStateHelper().put(AFTER_DURATION_CHANGE, afterDurationChange);
	}

	protected java.lang.String getAfterFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FILL_HEIGHT_CHANGE, null);
	}

	protected void setAfterFillHeightChange(java.lang.String afterFillHeightChange) {
		getStateHelper().put(AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange);
	}

	protected java.lang.String getAfterFocusedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOCUSED_CHANGE, null);
	}

	protected void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		getStateHelper().put(AFTER_FOCUSED_CHANGE, afterFocusedChange);
	}

	protected java.lang.String getAfterFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FOOTER_CONTENT_CHANGE, null);
	}

	protected void setAfterFooterContentChange(java.lang.String afterFooterContentChange) {
		getStateHelper().put(AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange);
	}

	protected java.lang.String getAfterFormatterChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_FORMATTER_CHANGE, null);
	}

	protected void setAfterFormatterChange(java.lang.String afterFormatterChange) {
		getStateHelper().put(AFTER_FORMATTER_CHANGE, afterFormatterChange);
	}

	protected java.lang.String getAfterHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEADER_CONTENT_CHANGE, null);
	}

	protected void setAfterHeaderContentChange(java.lang.String afterHeaderContentChange) {
		getStateHelper().put(AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange);
	}

	protected java.lang.String getAfterHeightChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HEIGHT_CHANGE, null);
	}

	protected void setAfterHeightChange(java.lang.String afterHeightChange) {
		getStateHelper().put(AFTER_HEIGHT_CHANGE, afterHeightChange);
	}

	protected java.lang.String getAfterHideOnChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_HIDE_ON_CHANGE, null);
	}

	protected void setAfterHideOnChange(java.lang.String afterHideOnChange) {
		getStateHelper().put(AFTER_HIDE_ON_CHANGE, afterHideOnChange);
	}

	protected java.lang.String getAfterIdChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ID_CHANGE, null);
	}

	protected void setAfterIdChange(java.lang.String afterIdChange) {
		getStateHelper().put(AFTER_ID_CHANGE, afterIdChange);
	}

	protected java.lang.String getAfterInitializedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_INITIALIZED_CHANGE, null);
	}

	protected void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		getStateHelper().put(AFTER_INITIALIZED_CHANGE, afterInitializedChange);
	}

	protected java.lang.String getAfterLocaleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_LOCALE_CHANGE, null);
	}

	protected void setAfterLocaleChange(java.lang.String afterLocaleChange) {
		getStateHelper().put(AFTER_LOCALE_CHANGE, afterLocaleChange);
	}

	protected java.lang.String getAfterOpacityChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_OPACITY_CHANGE, null);
	}

	protected void setAfterOpacityChange(java.lang.String afterOpacityChange) {
		getStateHelper().put(AFTER_OPACITY_CHANGE, afterOpacityChange);
	}

	protected java.lang.String getAfterPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_PREVENT_OVERLAP_CHANGE, null);
	}

	protected void setAfterPreventOverlapChange(java.lang.String afterPreventOverlapChange) {
		getStateHelper().put(AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange);
	}

	protected java.lang.String getAfterRenderChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDER_CHANGE, null);
	}

	protected void setAfterRenderChange(java.lang.String afterRenderChange) {
		getStateHelper().put(AFTER_RENDER_CHANGE, afterRenderChange);
	}

	protected java.lang.String getAfterRenderedChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_RENDERED_CHANGE, null);
	}

	protected void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		getStateHelper().put(AFTER_RENDERED_CHANGE, afterRenderedChange);
	}

	protected java.lang.String getAfterShimChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SHIM_CHANGE, null);
	}

	protected void setAfterShimChange(java.lang.String afterShimChange) {
		getStateHelper().put(AFTER_SHIM_CHANGE, afterShimChange);
	}

	protected java.lang.String getAfterSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_SRC_NODE_CHANGE, null);
	}

	protected void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		getStateHelper().put(AFTER_SRC_NODE_CHANGE, afterSrcNodeChange);
	}

	protected java.lang.String getAfterStringsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_STRINGS_CHANGE, null);
	}

	protected void setAfterStringsChange(java.lang.String afterStringsChange) {
		getStateHelper().put(AFTER_STRINGS_CHANGE, afterStringsChange);
	}

	protected java.lang.String getAfterTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TAB_INDEX_CHANGE, null);
	}

	protected void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		getStateHelper().put(AFTER_TAB_INDEX_CHANGE, afterTabIndexChange);
	}

	protected java.lang.String getAfterToolbarPositionChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBAR_POSITION_CHANGE, null);
	}

	protected void setAfterToolbarPositionChange(java.lang.String afterToolbarPositionChange) {
		getStateHelper().put(AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange);
	}

	protected java.lang.String getAfterToolbarsChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TOOLBARS_CHANGE, null);
	}

	protected void setAfterToolbarsChange(java.lang.String afterToolbarsChange) {
		getStateHelper().put(AFTER_TOOLBARS_CHANGE, afterToolbarsChange);
	}

	protected java.lang.String getAfterTriggerHideEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_HIDE_EVENT_CHANGE, null);
	}

	protected void setAfterTriggerHideEventChange(java.lang.String afterTriggerHideEventChange) {
		getStateHelper().put(AFTER_TRIGGER_HIDE_EVENT_CHANGE, afterTriggerHideEventChange);
	}

	protected java.lang.String getAfterTriggerShowEventChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_TRIGGER_SHOW_EVENT_CHANGE, null);
	}

	protected void setAfterTriggerShowEventChange(java.lang.String afterTriggerShowEventChange) {
		getStateHelper().put(AFTER_TRIGGER_SHOW_EVENT_CHANGE, afterTriggerShowEventChange);
	}

	protected java.lang.String getAfterVisibleChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_VISIBLE_CHANGE, null);
	}

	protected void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		getStateHelper().put(AFTER_VISIBLE_CHANGE, afterVisibleChange);
	}

	protected java.lang.String getAfterWidthChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_WIDTH_CHANGE, null);
	}

	protected void setAfterWidthChange(java.lang.String afterWidthChange) {
		getStateHelper().put(AFTER_WIDTH_CHANGE, afterWidthChange);
	}

	protected java.lang.String getAfterXChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XCHANGE, null);
	}

	protected void setAfterXChange(java.lang.String afterXChange) {
		getStateHelper().put(AFTER_XCHANGE, afterXChange);
	}

	protected java.lang.String getAfterXyChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_XY_CHANGE, null);
	}

	protected void setAfterXyChange(java.lang.String afterXyChange) {
		getStateHelper().put(AFTER_XY_CHANGE, afterXyChange);
	}

	protected java.lang.String getAfterYChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_YCHANGE, null);
	}

	protected void setAfterYChange(java.lang.String afterYChange) {
		getStateHelper().put(AFTER_YCHANGE, afterYChange);
	}

	protected java.lang.String getAfterZIndexChange() {
		return (java.lang.String) getStateHelper().eval(AFTER_ZINDEX_CHANGE, null);
	}

	protected void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		getStateHelper().put(AFTER_ZINDEX_CHANGE, afterZIndexChange);
	}

	protected java.lang.String getOnAlignChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_CHANGE, null);
	}

	protected void setOnAlignChange(java.lang.String onAlignChange) {
		getStateHelper().put(ON_ALIGN_CHANGE, onAlignChange);
	}

	protected java.lang.String getOnAlignOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_ALIGN_ON_CHANGE, null);
	}

	protected void setOnAlignOnChange(java.lang.String onAlignOnChange) {
		getStateHelper().put(ON_ALIGN_ON_CHANGE, onAlignOnChange);
	}

	protected java.lang.String getOnBodyContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_BODY_CONTENT_CHANGE, null);
	}

	protected void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		getStateHelper().put(ON_BODY_CONTENT_CHANGE, onBodyContentChange);
	}

	protected java.lang.String getOnBoundingBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_BOUNDING_BOX_CHANGE, null);
	}

	protected void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		getStateHelper().put(ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange);
	}

	protected java.lang.String getOnCenteredChange() {
		return (java.lang.String) getStateHelper().eval(ON_CENTERED_CHANGE, null);
	}

	protected void setOnCenteredChange(java.lang.String onCenteredChange) {
		getStateHelper().put(ON_CENTERED_CHANGE, onCenteredChange);
	}

	protected java.lang.String getOnConstrainChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONSTRAIN_CHANGE, null);
	}

	protected void setOnConstrainChange(java.lang.String onConstrainChange) {
		getStateHelper().put(ON_CONSTRAIN_CHANGE, onConstrainChange);
	}

	protected java.lang.String getOnContentBoxChange() {
		return (java.lang.String) getStateHelper().eval(ON_CONTENT_BOX_CHANGE, null);
	}

	protected void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		getStateHelper().put(ON_CONTENT_BOX_CHANGE, onContentBoxChange);
	}

	protected java.lang.String getOnDestroyedChange() {
		return (java.lang.String) getStateHelper().eval(ON_DESTROYED_CHANGE, null);
	}

	protected void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		getStateHelper().put(ON_DESTROYED_CHANGE, onDestroyedChange);
	}

	protected java.lang.String getOnDisabledChange() {
		return (java.lang.String) getStateHelper().eval(ON_DISABLED_CHANGE, null);
	}

	protected void setOnDisabledChange(java.lang.String onDisabledChange) {
		getStateHelper().put(ON_DISABLED_CHANGE, onDisabledChange);
	}

	protected java.lang.String getOnDurationChange() {
		return (java.lang.String) getStateHelper().eval(ON_DURATION_CHANGE, null);
	}

	protected void setOnDurationChange(java.lang.String onDurationChange) {
		getStateHelper().put(ON_DURATION_CHANGE, onDurationChange);
	}

	protected java.lang.String getOnFillHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_FILL_HEIGHT_CHANGE, null);
	}

	protected void setOnFillHeightChange(java.lang.String onFillHeightChange) {
		getStateHelper().put(ON_FILL_HEIGHT_CHANGE, onFillHeightChange);
	}

	protected java.lang.String getOnFocusedChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOCUSED_CHANGE, null);
	}

	protected void setOnFocusedChange(java.lang.String onFocusedChange) {
		getStateHelper().put(ON_FOCUSED_CHANGE, onFocusedChange);
	}

	protected java.lang.String getOnFooterContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_FOOTER_CONTENT_CHANGE, null);
	}

	protected void setOnFooterContentChange(java.lang.String onFooterContentChange) {
		getStateHelper().put(ON_FOOTER_CONTENT_CHANGE, onFooterContentChange);
	}

	protected java.lang.String getOnFormatterChange() {
		return (java.lang.String) getStateHelper().eval(ON_FORMATTER_CHANGE, null);
	}

	protected void setOnFormatterChange(java.lang.String onFormatterChange) {
		getStateHelper().put(ON_FORMATTER_CHANGE, onFormatterChange);
	}

	protected java.lang.String getOnHeaderContentChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEADER_CONTENT_CHANGE, null);
	}

	protected void setOnHeaderContentChange(java.lang.String onHeaderContentChange) {
		getStateHelper().put(ON_HEADER_CONTENT_CHANGE, onHeaderContentChange);
	}

	protected java.lang.String getOnHeightChange() {
		return (java.lang.String) getStateHelper().eval(ON_HEIGHT_CHANGE, null);
	}

	protected void setOnHeightChange(java.lang.String onHeightChange) {
		getStateHelper().put(ON_HEIGHT_CHANGE, onHeightChange);
	}

	protected java.lang.String getOnHideOnChange() {
		return (java.lang.String) getStateHelper().eval(ON_HIDE_ON_CHANGE, null);
	}

	protected void setOnHideOnChange(java.lang.String onHideOnChange) {
		getStateHelper().put(ON_HIDE_ON_CHANGE, onHideOnChange);
	}

	protected java.lang.String getOnIdChange() {
		return (java.lang.String) getStateHelper().eval(ON_ID_CHANGE, null);
	}

	protected void setOnIdChange(java.lang.String onIdChange) {
		getStateHelper().put(ON_ID_CHANGE, onIdChange);
	}

	protected java.lang.String getOnInitializedChange() {
		return (java.lang.String) getStateHelper().eval(ON_INITIALIZED_CHANGE, null);
	}

	protected void setOnInitializedChange(java.lang.String onInitializedChange) {
		getStateHelper().put(ON_INITIALIZED_CHANGE, onInitializedChange);
	}

	protected java.lang.String getOnLocaleChange() {
		return (java.lang.String) getStateHelper().eval(ON_LOCALE_CHANGE, null);
	}

	protected void setOnLocaleChange(java.lang.String onLocaleChange) {
		getStateHelper().put(ON_LOCALE_CHANGE, onLocaleChange);
	}

	protected java.lang.String getOnOpacityChange() {
		return (java.lang.String) getStateHelper().eval(ON_OPACITY_CHANGE, null);
	}

	protected void setOnOpacityChange(java.lang.String onOpacityChange) {
		getStateHelper().put(ON_OPACITY_CHANGE, onOpacityChange);
	}

	protected java.lang.String getOnPreventOverlapChange() {
		return (java.lang.String) getStateHelper().eval(ON_PREVENT_OVERLAP_CHANGE, null);
	}

	protected void setOnPreventOverlapChange(java.lang.String onPreventOverlapChange) {
		getStateHelper().put(ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange);
	}

	protected java.lang.String getOnRenderChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDER_CHANGE, null);
	}

	protected void setOnRenderChange(java.lang.String onRenderChange) {
		getStateHelper().put(ON_RENDER_CHANGE, onRenderChange);
	}

	protected java.lang.String getOnRenderedChange() {
		return (java.lang.String) getStateHelper().eval(ON_RENDERED_CHANGE, null);
	}

	protected void setOnRenderedChange(java.lang.String onRenderedChange) {
		getStateHelper().put(ON_RENDERED_CHANGE, onRenderedChange);
	}

	protected java.lang.String getOnShimChange() {
		return (java.lang.String) getStateHelper().eval(ON_SHIM_CHANGE, null);
	}

	protected void setOnShimChange(java.lang.String onShimChange) {
		getStateHelper().put(ON_SHIM_CHANGE, onShimChange);
	}

	protected java.lang.String getOnSrcNodeChange() {
		return (java.lang.String) getStateHelper().eval(ON_SRC_NODE_CHANGE, null);
	}

	protected void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		getStateHelper().put(ON_SRC_NODE_CHANGE, onSrcNodeChange);
	}

	protected java.lang.String getOnStringsChange() {
		return (java.lang.String) getStateHelper().eval(ON_STRINGS_CHANGE, null);
	}

	protected void setOnStringsChange(java.lang.String onStringsChange) {
		getStateHelper().put(ON_STRINGS_CHANGE, onStringsChange);
	}

	protected java.lang.String getOnTabIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_TAB_INDEX_CHANGE, null);
	}

	protected void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		getStateHelper().put(ON_TAB_INDEX_CHANGE, onTabIndexChange);
	}

	protected java.lang.String getOnToolbarPositionChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBAR_POSITION_CHANGE, null);
	}

	protected void setOnToolbarPositionChange(java.lang.String onToolbarPositionChange) {
		getStateHelper().put(ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange);
	}

	protected java.lang.String getOnToolbarsChange() {
		return (java.lang.String) getStateHelper().eval(ON_TOOLBARS_CHANGE, null);
	}

	protected void setOnToolbarsChange(java.lang.String onToolbarsChange) {
		getStateHelper().put(ON_TOOLBARS_CHANGE, onToolbarsChange);
	}

	protected java.lang.String getOnTriggerHideEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_HIDE_EVENT_CHANGE, null);
	}

	protected void setOnTriggerHideEventChange(java.lang.String onTriggerHideEventChange) {
		getStateHelper().put(ON_TRIGGER_HIDE_EVENT_CHANGE, onTriggerHideEventChange);
	}

	protected java.lang.String getOnTriggerShowEventChange() {
		return (java.lang.String) getStateHelper().eval(ON_TRIGGER_SHOW_EVENT_CHANGE, null);
	}

	protected void setOnTriggerShowEventChange(java.lang.String onTriggerShowEventChange) {
		getStateHelper().put(ON_TRIGGER_SHOW_EVENT_CHANGE, onTriggerShowEventChange);
	}

	protected java.lang.String getOnVisibleChange() {
		return (java.lang.String) getStateHelper().eval(ON_VISIBLE_CHANGE, null);
	}

	protected void setOnVisibleChange(java.lang.String onVisibleChange) {
		getStateHelper().put(ON_VISIBLE_CHANGE, onVisibleChange);
	}

	protected java.lang.String getOnWidthChange() {
		return (java.lang.String) getStateHelper().eval(ON_WIDTH_CHANGE, null);
	}

	protected void setOnWidthChange(java.lang.String onWidthChange) {
		getStateHelper().put(ON_WIDTH_CHANGE, onWidthChange);
	}

	protected java.lang.String getOnXChange() {
		return (java.lang.String) getStateHelper().eval(ON_XCHANGE, null);
	}

	protected void setOnXChange(java.lang.String onXChange) {
		getStateHelper().put(ON_XCHANGE, onXChange);
	}

	protected java.lang.String getOnXyChange() {
		return (java.lang.String) getStateHelper().eval(ON_XY_CHANGE, null);
	}

	protected void setOnXyChange(java.lang.String onXyChange) {
		getStateHelper().put(ON_XY_CHANGE, onXyChange);
	}

	protected java.lang.String getOnYChange() {
		return (java.lang.String) getStateHelper().eval(ON_YCHANGE, null);
	}

	protected void setOnYChange(java.lang.String onYChange) {
		getStateHelper().put(ON_YCHANGE, onYChange);
	}

	protected java.lang.String getOnZIndexChange() {
		return (java.lang.String) getStateHelper().eval(ON_ZINDEX_CHANGE, null);
	}

	protected void setOnZIndexChange(java.lang.String onZIndexChange) {
		getStateHelper().put(ON_ZINDEX_CHANGE, onZIndexChange);
	}

}