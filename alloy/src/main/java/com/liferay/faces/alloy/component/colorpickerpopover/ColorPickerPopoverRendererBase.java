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

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
public abstract class ColorPickerPopoverRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-color-picker-popover";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ColorPickerPopover colorPickerPopover = (ColorPickerPopover) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var colorPickerPopover = new A.ColorPickerPopover");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, colorPickerPopover);
		renderAlignOn(renderedAttributes, colorPickerPopover);
		renderColorPickerPopoverBodyContent(renderedAttributes, colorPickerPopover);
		renderBoundingBox(renderedAttributes, colorPickerPopover);
		renderCentered(renderedAttributes, colorPickerPopover);
		renderColor(renderedAttributes, colorPickerPopover);
		renderColorPalette(renderedAttributes, colorPickerPopover);
		renderConstrain(renderedAttributes, colorPickerPopover);
		renderContentBox(renderedAttributes, colorPickerPopover);
		renderCssClass(renderedAttributes, colorPickerPopover);
		renderCurrentTrigger(renderedAttributes, colorPickerPopover);
		renderDefaultColor(renderedAttributes, colorPickerPopover);
		renderDestroyed(renderedAttributes, colorPickerPopover);
		renderDisabled(renderedAttributes, colorPickerPopover);
		renderFillHeight(renderedAttributes, colorPickerPopover);
		renderFocusOn(renderedAttributes, colorPickerPopover);
		renderFocused(renderedAttributes, colorPickerPopover);
		renderFooterContent(renderedAttributes, colorPickerPopover);
		renderHeaderContent(renderedAttributes, colorPickerPopover);
		renderHeight(renderedAttributes, colorPickerPopover);
		renderHideOn(renderedAttributes, colorPickerPopover);
		renderHsvPalette(renderedAttributes, colorPickerPopover);
		renderColorPickerPopoverId(renderedAttributes, colorPickerPopover);
		renderInitialized(renderedAttributes, colorPickerPopover);
		renderColorPickerPopoverLocale(renderedAttributes, colorPickerPopover);
		renderMaskNode(renderedAttributes, colorPickerPopover);
		renderModal(renderedAttributes, colorPickerPopover);
		renderPreventOverlap(renderedAttributes, colorPickerPopover);
		renderRecentColors(renderedAttributes, colorPickerPopover);
		renderRender(renderedAttributes, colorPickerPopover);
		renderRenderColorPalette(renderedAttributes, colorPickerPopover);
		renderRenderHSVPalette(renderedAttributes, colorPickerPopover);
		renderRendered(renderedAttributes, colorPickerPopover);
		renderShim(renderedAttributes, colorPickerPopover);
		renderSrcNode(renderedAttributes, colorPickerPopover);
		renderStrings(renderedAttributes, colorPickerPopover);
		renderTabIndex(renderedAttributes, colorPickerPopover);
		renderToolbarPosition(renderedAttributes, colorPickerPopover);
		renderToolbars(renderedAttributes, colorPickerPopover);
		renderTrigger(renderedAttributes, colorPickerPopover);
		renderTriggerEvent(renderedAttributes, colorPickerPopover);
		renderTriggerToggleEvent(renderedAttributes, colorPickerPopover);
		renderVisible(renderedAttributes, colorPickerPopover);
		renderWidth(renderedAttributes, colorPickerPopover);
		renderX(renderedAttributes, colorPickerPopover);
		renderXy(renderedAttributes, colorPickerPopover);
		renderY(renderedAttributes, colorPickerPopover);
		renderZIndex(renderedAttributes, colorPickerPopover);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, colorPickerPopover);
		renderAfterAlignOnChange(renderedAfterEvents, colorPickerPopover);
		renderAfterBodyContentChange(renderedAfterEvents, colorPickerPopover);
		renderAfterBoundingBoxChange(renderedAfterEvents, colorPickerPopover);
		renderAfterCenteredChange(renderedAfterEvents, colorPickerPopover);
		renderAfterColorChange(renderedAfterEvents, colorPickerPopover);
		renderAfterColorPaletteChange(renderedAfterEvents, colorPickerPopover);
		renderAfterConstrainChange(renderedAfterEvents, colorPickerPopover);
		renderAfterContentBoxChange(renderedAfterEvents, colorPickerPopover);
		renderAfterCssClassChange(renderedAfterEvents, colorPickerPopover);
		renderAfterCurrentTriggerChange(renderedAfterEvents, colorPickerPopover);
		renderAfterDefaultColorChange(renderedAfterEvents, colorPickerPopover);
		renderAfterDestroyedChange(renderedAfterEvents, colorPickerPopover);
		renderAfterDisabledChange(renderedAfterEvents, colorPickerPopover);
		renderAfterFillHeightChange(renderedAfterEvents, colorPickerPopover);
		renderAfterFocusOnChange(renderedAfterEvents, colorPickerPopover);
		renderAfterFocusedChange(renderedAfterEvents, colorPickerPopover);
		renderAfterFooterContentChange(renderedAfterEvents, colorPickerPopover);
		renderAfterHeaderContentChange(renderedAfterEvents, colorPickerPopover);
		renderAfterHeightChange(renderedAfterEvents, colorPickerPopover);
		renderAfterHideOnChange(renderedAfterEvents, colorPickerPopover);
		renderAfterHsvPaletteChange(renderedAfterEvents, colorPickerPopover);
		renderAfterIdChange(renderedAfterEvents, colorPickerPopover);
		renderAfterInitializedChange(renderedAfterEvents, colorPickerPopover);
		renderAfterLocaleChange(renderedAfterEvents, colorPickerPopover);
		renderAfterMaskNodeChange(renderedAfterEvents, colorPickerPopover);
		renderAfterModalChange(renderedAfterEvents, colorPickerPopover);
		renderAfterPreventOverlapChange(renderedAfterEvents, colorPickerPopover);
		renderAfterRecentColorsChange(renderedAfterEvents, colorPickerPopover);
		renderAfterRenderChange(renderedAfterEvents, colorPickerPopover);
		renderAfterRenderColorPaletteChange(renderedAfterEvents, colorPickerPopover);
		renderAfterRenderHSVPaletteChange(renderedAfterEvents, colorPickerPopover);
		renderAfterRenderedChange(renderedAfterEvents, colorPickerPopover);
		renderAfterShimChange(renderedAfterEvents, colorPickerPopover);
		renderAfterSrcNodeChange(renderedAfterEvents, colorPickerPopover);
		renderAfterStringsChange(renderedAfterEvents, colorPickerPopover);
		renderAfterTabIndexChange(renderedAfterEvents, colorPickerPopover);
		renderAfterToolbarPositionChange(renderedAfterEvents, colorPickerPopover);
		renderAfterToolbarsChange(renderedAfterEvents, colorPickerPopover);
		renderAfterTriggerChange(renderedAfterEvents, colorPickerPopover);
		renderAfterTriggerEventChange(renderedAfterEvents, colorPickerPopover);
		renderAfterTriggerToggleEventChange(renderedAfterEvents, colorPickerPopover);
		renderAfterVisibleChange(renderedAfterEvents, colorPickerPopover);
		renderAfterWidthChange(renderedAfterEvents, colorPickerPopover);
		renderAfterXChange(renderedAfterEvents, colorPickerPopover);
		renderAfterXyChange(renderedAfterEvents, colorPickerPopover);
		renderAfterYChange(renderedAfterEvents, colorPickerPopover);
		renderAfterZIndexChange(renderedAfterEvents, colorPickerPopover);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnAlignChange(renderedOnEvents, colorPickerPopover);
		renderOnAlignOnChange(renderedOnEvents, colorPickerPopover);
		renderOnBodyContentChange(renderedOnEvents, colorPickerPopover);
		renderOnBoundingBoxChange(renderedOnEvents, colorPickerPopover);
		renderOnCenteredChange(renderedOnEvents, colorPickerPopover);
		renderOnColorChange(renderedOnEvents, colorPickerPopover);
		renderOnColorPaletteChange(renderedOnEvents, colorPickerPopover);
		renderOnConstrainChange(renderedOnEvents, colorPickerPopover);
		renderOnContentBoxChange(renderedOnEvents, colorPickerPopover);
		renderOnCssClassChange(renderedOnEvents, colorPickerPopover);
		renderOnCurrentTriggerChange(renderedOnEvents, colorPickerPopover);
		renderOnDefaultColorChange(renderedOnEvents, colorPickerPopover);
		renderOnDestroyedChange(renderedOnEvents, colorPickerPopover);
		renderOnDisabledChange(renderedOnEvents, colorPickerPopover);
		renderOnFillHeightChange(renderedOnEvents, colorPickerPopover);
		renderOnFocusOnChange(renderedOnEvents, colorPickerPopover);
		renderOnFocusedChange(renderedOnEvents, colorPickerPopover);
		renderOnFooterContentChange(renderedOnEvents, colorPickerPopover);
		renderOnHeaderContentChange(renderedOnEvents, colorPickerPopover);
		renderOnHeightChange(renderedOnEvents, colorPickerPopover);
		renderOnHideOnChange(renderedOnEvents, colorPickerPopover);
		renderOnHsvPaletteChange(renderedOnEvents, colorPickerPopover);
		renderOnIdChange(renderedOnEvents, colorPickerPopover);
		renderOnInitializedChange(renderedOnEvents, colorPickerPopover);
		renderOnLocaleChange(renderedOnEvents, colorPickerPopover);
		renderOnMaskNodeChange(renderedOnEvents, colorPickerPopover);
		renderOnModalChange(renderedOnEvents, colorPickerPopover);
		renderOnPreventOverlapChange(renderedOnEvents, colorPickerPopover);
		renderOnRecentColorsChange(renderedOnEvents, colorPickerPopover);
		renderOnRenderChange(renderedOnEvents, colorPickerPopover);
		renderOnRenderColorPaletteChange(renderedOnEvents, colorPickerPopover);
		renderOnRenderHSVPaletteChange(renderedOnEvents, colorPickerPopover);
		renderOnRenderedChange(renderedOnEvents, colorPickerPopover);
		renderOnShimChange(renderedOnEvents, colorPickerPopover);
		renderOnSrcNodeChange(renderedOnEvents, colorPickerPopover);
		renderOnStringsChange(renderedOnEvents, colorPickerPopover);
		renderOnTabIndexChange(renderedOnEvents, colorPickerPopover);
		renderOnToolbarPositionChange(renderedOnEvents, colorPickerPopover);
		renderOnToolbarsChange(renderedOnEvents, colorPickerPopover);
		renderOnTriggerChange(renderedOnEvents, colorPickerPopover);
		renderOnTriggerEventChange(renderedOnEvents, colorPickerPopover);
		renderOnTriggerToggleEventChange(renderedOnEvents, colorPickerPopover);
		renderOnVisibleChange(renderedOnEvents, colorPickerPopover);
		renderOnWidthChange(renderedOnEvents, colorPickerPopover);
		renderOnXChange(renderedOnEvents, colorPickerPopover);
		renderOnXyChange(renderedOnEvents, colorPickerPopover);
		renderOnYChange(renderedOnEvents, colorPickerPopover);
		renderOnZIndexChange(renderedOnEvents, colorPickerPopover);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object align = colorPickerPopover.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(ColorPickerPopover.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object alignOn = colorPickerPopover.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(ColorPickerPopover.ALIGN_ON, alignOn));
		}
	}

	protected void renderColorPickerPopoverBodyContent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object colorPickerPopoverBodyContent = colorPickerPopover.getColorPickerPopoverBodyContent();

		if (colorPickerPopoverBodyContent != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.COLOR_PICKER_POPOVER_BODY_CONTENT, colorPickerPopoverBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String boundingBox = colorPickerPopover.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object centered = colorPickerPopover.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.CENTERED, centered));
		}
	}

	protected void renderColor(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String color = colorPickerPopover.getColor();

		if (color != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.COLOR, color));
		}
	}

	protected void renderColorPalette(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object colorPalette = colorPickerPopover.getColorPalette();

		if (colorPalette != null) {
			renderedAttributes.add(renderObject(ColorPickerPopover.COLOR_PALETTE, colorPalette));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object constrain = colorPickerPopover.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String contentBox = colorPickerPopover.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String cssClass = colorPickerPopover.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.CSS_CLASS, cssClass));
		}
	}

	protected void renderCurrentTrigger(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String currentTrigger = colorPickerPopover.getCurrentTrigger();

		if (currentTrigger != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.CURRENT_TRIGGER, currentTrigger));
		}
	}

	protected void renderDefaultColor(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String defaultColor = colorPickerPopover.getDefaultColor();

		if (defaultColor != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.DEFAULT_COLOR, defaultColor));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean destroyed = colorPickerPopover.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean disabled = colorPickerPopover.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object fillHeight = colorPickerPopover.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocusOn(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object focusOn = colorPickerPopover.getFocusOn();

		if (focusOn != null) {
			renderedAttributes.add(renderArray(ColorPickerPopover.FOCUS_ON, focusOn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean focused = colorPickerPopover.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object footerContent = colorPickerPopover.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object headerContent = colorPickerPopover.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object height = colorPickerPopover.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.HEIGHT, height));
		}
	}

	protected void renderHideOn(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object hideOn = colorPickerPopover.getHideOn();

		if (hideOn != null) {
			renderedAttributes.add(renderArray(ColorPickerPopover.HIDE_ON, hideOn));
		}
	}

	protected void renderHsvPalette(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object hsvPalette = colorPickerPopover.getHsvPalette();

		if (hsvPalette != null) {
			renderedAttributes.add(renderObject(ColorPickerPopover.HSV_PALETTE, hsvPalette));
		}
	}

	protected void renderColorPickerPopoverId(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String colorPickerPopoverId = colorPickerPopover.getColorPickerPopoverId();

		if (colorPickerPopoverId != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.COLOR_PICKER_POPOVER_ID, colorPickerPopoverId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean initialized = colorPickerPopover.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.INITIALIZED, initialized));
		}
	}

	protected void renderColorPickerPopoverLocale(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String colorPickerPopoverLocale = colorPickerPopover.getColorPickerPopoverLocale();

		if (colorPickerPopoverLocale != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.COLOR_PICKER_POPOVER_LOCALE, colorPickerPopoverLocale));
		}
	}

	protected void renderMaskNode(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object maskNode = colorPickerPopover.getMaskNode();

		if (maskNode != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.MASK_NODE, maskNode));
		}
	}

	protected void renderModal(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean modal = colorPickerPopover.getModal();

		if (modal != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.MODAL, modal));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean preventOverlap = colorPickerPopover.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRecentColors(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object recentColors = colorPickerPopover.getRecentColors();

		if (recentColors != null) {
			renderedAttributes.add(renderObject(ColorPickerPopover.RECENT_COLORS, recentColors));
		}
	}

	protected void renderRender(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object render = colorPickerPopover.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.RENDER, render));
		}
	}

	protected void renderRenderColorPalette(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean renderColorPalette = colorPickerPopover.getRenderColorPalette();

		if (renderColorPalette != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.RENDER_COLOR_PALETTE, renderColorPalette));
		}
	}

	protected void renderRenderHSVPalette(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean renderHSVPalette = colorPickerPopover.getRenderHSVPalette();

		if (renderHSVPalette != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.RENDER_HSVPALETTE, renderHSVPalette));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean rendered = colorPickerPopover.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.RENDERED, rendered));
		}
	}

	protected void renderShim(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean shim = colorPickerPopover.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.SHIM, shim));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String srcNode = colorPickerPopover.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object strings = colorPickerPopover.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(ColorPickerPopover.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object tabIndex = colorPickerPopover.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(ColorPickerPopover.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object toolbarPosition = colorPickerPopover.getToolbarPosition();

		if (toolbarPosition != null) {
			renderedAttributes.add(renderObject(ColorPickerPopover.TOOLBAR_POSITION, toolbarPosition));
		}
	}

	protected void renderToolbars(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String toolbars = colorPickerPopover.getToolbars();

		if (toolbars != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.TOOLBARS, toolbars));
		}
	}

	protected void renderTrigger(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String trigger = colorPickerPopover.getTrigger();

		if (trigger != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.TRIGGER, trigger));
		}
	}

	protected void renderTriggerEvent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String triggerEvent = colorPickerPopover.getTriggerEvent();

		if (triggerEvent != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.TRIGGER_EVENT, triggerEvent));
		}
	}

	protected void renderTriggerToggleEvent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String triggerToggleEvent = colorPickerPopover.getTriggerToggleEvent();

		if (triggerToggleEvent != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.TRIGGER_TOGGLE_EVENT, triggerToggleEvent));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean visible = colorPickerPopover.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object width = colorPickerPopover.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object x = colorPickerPopover.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(ColorPickerPopover.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object xy = colorPickerPopover.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(ColorPickerPopover.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object y = colorPickerPopover.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(ColorPickerPopover.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object zIndex = colorPickerPopover.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(ColorPickerPopover.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterAlignChange = colorPickerPopover.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterAlignOnChange = colorPickerPopover.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterBodyContentChange = colorPickerPopover.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterBoundingBoxChange = colorPickerPopover.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterCenteredChange = colorPickerPopover.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterColorChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterColorChange = colorPickerPopover.getAfterColorChange();

		if (afterColorChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_COLOR_CHANGE, afterColorChange));
		}
	}

	protected void renderAfterColorPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterColorPaletteChange = colorPickerPopover.getAfterColorPaletteChange();

		if (afterColorPaletteChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_COLOR_PALETTE_CHANGE, afterColorPaletteChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterConstrainChange = colorPickerPopover.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterContentBoxChange = colorPickerPopover.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterCssClassChange = colorPickerPopover.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterCurrentTriggerChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterCurrentTriggerChange = colorPickerPopover.getAfterCurrentTriggerChange();

		if (afterCurrentTriggerChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CURRENT_TRIGGER_CHANGE, afterCurrentTriggerChange));
		}
	}

	protected void renderAfterDefaultColorChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterDefaultColorChange = colorPickerPopover.getAfterDefaultColorChange();

		if (afterDefaultColorChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_DEFAULT_COLOR_CHANGE, afterDefaultColorChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterDestroyedChange = colorPickerPopover.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterDisabledChange = colorPickerPopover.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterFillHeightChange = colorPickerPopover.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterFocusOnChange = colorPickerPopover.getAfterFocusOnChange();

		if (afterFocusOnChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterFocusedChange = colorPickerPopover.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterFooterContentChange = colorPickerPopover.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterHeaderContentChange = colorPickerPopover.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterHeightChange = colorPickerPopover.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterHideOnChange = colorPickerPopover.getAfterHideOnChange();

		if (afterHideOnChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
		}
	}

	protected void renderAfterHsvPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterHsvPaletteChange = colorPickerPopover.getAfterHsvPaletteChange();

		if (afterHsvPaletteChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_HSV_PALETTE_CHANGE, afterHsvPaletteChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterIdChange = colorPickerPopover.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterInitializedChange = colorPickerPopover.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterLocaleChange = colorPickerPopover.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterMaskNodeChange = colorPickerPopover.getAfterMaskNodeChange();

		if (afterMaskNodeChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
		}
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterModalChange = colorPickerPopover.getAfterModalChange();

		if (afterModalChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_MODAL_CHANGE, afterModalChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterPreventOverlapChange = colorPickerPopover.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRecentColorsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRecentColorsChange = colorPickerPopover.getAfterRecentColorsChange();

		if (afterRecentColorsChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RECENT_COLORS_CHANGE, afterRecentColorsChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRenderChange = colorPickerPopover.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderColorPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRenderColorPaletteChange = colorPickerPopover.getAfterRenderColorPaletteChange();

		if (afterRenderColorPaletteChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RENDER_COLOR_PALETTE_CHANGE, afterRenderColorPaletteChange));
		}
	}

	protected void renderAfterRenderHSVPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRenderHSVPaletteChange = colorPickerPopover.getAfterRenderHSVPaletteChange();

		if (afterRenderHSVPaletteChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RENDER_HSVPALETTE_CHANGE, afterRenderHSVPaletteChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRenderedChange = colorPickerPopover.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterShimChange = colorPickerPopover.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterSrcNodeChange = colorPickerPopover.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterStringsChange = colorPickerPopover.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterTabIndexChange = colorPickerPopover.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterToolbarPositionChange = colorPickerPopover.getAfterToolbarPositionChange();

		if (afterToolbarPositionChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
		}
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterToolbarsChange = colorPickerPopover.getAfterToolbarsChange();

		if (afterToolbarsChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
		}
	}

	protected void renderAfterTriggerChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterTriggerChange = colorPickerPopover.getAfterTriggerChange();

		if (afterTriggerChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TRIGGER_CHANGE, afterTriggerChange));
		}
	}

	protected void renderAfterTriggerEventChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterTriggerEventChange = colorPickerPopover.getAfterTriggerEventChange();

		if (afterTriggerEventChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TRIGGER_EVENT_CHANGE, afterTriggerEventChange));
		}
	}

	protected void renderAfterTriggerToggleEventChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterTriggerToggleEventChange = colorPickerPopover.getAfterTriggerToggleEventChange();

		if (afterTriggerToggleEventChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TRIGGER_TOGGLE_EVENT_CHANGE, afterTriggerToggleEventChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterVisibleChange = colorPickerPopover.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterWidthChange = colorPickerPopover.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterXChange = colorPickerPopover.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterXyChange = colorPickerPopover.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterYChange = colorPickerPopover.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterZIndexChange = colorPickerPopover.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onAlignChange = colorPickerPopover.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onAlignOnChange = colorPickerPopover.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onBodyContentChange = colorPickerPopover.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onBoundingBoxChange = colorPickerPopover.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onCenteredChange = colorPickerPopover.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnColorChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onColorChange = colorPickerPopover.getOnColorChange();

		if (onColorChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_COLOR_CHANGE, onColorChange));
		}
	}

	protected void renderOnColorPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onColorPaletteChange = colorPickerPopover.getOnColorPaletteChange();

		if (onColorPaletteChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_COLOR_PALETTE_CHANGE, onColorPaletteChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onConstrainChange = colorPickerPopover.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onContentBoxChange = colorPickerPopover.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onCssClassChange = colorPickerPopover.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnCurrentTriggerChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onCurrentTriggerChange = colorPickerPopover.getOnCurrentTriggerChange();

		if (onCurrentTriggerChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_CURRENT_TRIGGER_CHANGE, onCurrentTriggerChange));
		}
	}

	protected void renderOnDefaultColorChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onDefaultColorChange = colorPickerPopover.getOnDefaultColorChange();

		if (onDefaultColorChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_DEFAULT_COLOR_CHANGE, onDefaultColorChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onDestroyedChange = colorPickerPopover.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onDisabledChange = colorPickerPopover.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onFillHeightChange = colorPickerPopover.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onFocusOnChange = colorPickerPopover.getOnFocusOnChange();

		if (onFocusOnChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_FOCUS_ON_CHANGE, onFocusOnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onFocusedChange = colorPickerPopover.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onFooterContentChange = colorPickerPopover.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onHeaderContentChange = colorPickerPopover.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onHeightChange = colorPickerPopover.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onHideOnChange = colorPickerPopover.getOnHideOnChange();

		if (onHideOnChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_HIDE_ON_CHANGE, onHideOnChange));
		}
	}

	protected void renderOnHsvPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onHsvPaletteChange = colorPickerPopover.getOnHsvPaletteChange();

		if (onHsvPaletteChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_HSV_PALETTE_CHANGE, onHsvPaletteChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onIdChange = colorPickerPopover.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onInitializedChange = colorPickerPopover.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onLocaleChange = colorPickerPopover.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onMaskNodeChange = colorPickerPopover.getOnMaskNodeChange();

		if (onMaskNodeChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_MASK_NODE_CHANGE, onMaskNodeChange));
		}
	}

	protected void renderOnModalChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onModalChange = colorPickerPopover.getOnModalChange();

		if (onModalChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_MODAL_CHANGE, onModalChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onPreventOverlapChange = colorPickerPopover.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRecentColorsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRecentColorsChange = colorPickerPopover.getOnRecentColorsChange();

		if (onRecentColorsChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_RECENT_COLORS_CHANGE, onRecentColorsChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRenderChange = colorPickerPopover.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderColorPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRenderColorPaletteChange = colorPickerPopover.getOnRenderColorPaletteChange();

		if (onRenderColorPaletteChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_RENDER_COLOR_PALETTE_CHANGE, onRenderColorPaletteChange));
		}
	}

	protected void renderOnRenderHSVPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRenderHSVPaletteChange = colorPickerPopover.getOnRenderHSVPaletteChange();

		if (onRenderHSVPaletteChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_RENDER_HSVPALETTE_CHANGE, onRenderHSVPaletteChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRenderedChange = colorPickerPopover.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onShimChange = colorPickerPopover.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onSrcNodeChange = colorPickerPopover.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onStringsChange = colorPickerPopover.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onTabIndexChange = colorPickerPopover.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onToolbarPositionChange = colorPickerPopover.getOnToolbarPositionChange();

		if (onToolbarPositionChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
		}
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onToolbarsChange = colorPickerPopover.getOnToolbarsChange();

		if (onToolbarsChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_TOOLBARS_CHANGE, onToolbarsChange));
		}
	}

	protected void renderOnTriggerChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onTriggerChange = colorPickerPopover.getOnTriggerChange();

		if (onTriggerChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_TRIGGER_CHANGE, onTriggerChange));
		}
	}

	protected void renderOnTriggerEventChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onTriggerEventChange = colorPickerPopover.getOnTriggerEventChange();

		if (onTriggerEventChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_TRIGGER_EVENT_CHANGE, onTriggerEventChange));
		}
	}

	protected void renderOnTriggerToggleEventChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onTriggerToggleEventChange = colorPickerPopover.getOnTriggerToggleEventChange();

		if (onTriggerToggleEventChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_TRIGGER_TOGGLE_EVENT_CHANGE, onTriggerToggleEventChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onVisibleChange = colorPickerPopover.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onWidthChange = colorPickerPopover.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onXChange = colorPickerPopover.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onXyChange = colorPickerPopover.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onYChange = colorPickerPopover.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onZIndexChange = colorPickerPopover.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}