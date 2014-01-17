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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
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
		renderColorpickerpopoverBodyContent(renderedAttributes, colorPickerPopover);
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
		renderColorpickerpopoverId(renderedAttributes, colorPickerPopover);
		renderInitialized(renderedAttributes, colorPickerPopover);
		renderColorpickerpopoverLocale(renderedAttributes, colorPickerPopover);
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

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

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

	protected void renderColorpickerpopoverBodyContent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object colorpickerpopoverBodyContent = colorPickerPopover.getColorpickerpopoverBodyContent();

		if (colorpickerpopoverBodyContent != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.COLORPICKERPOPOVER_BODY_CONTENT, colorpickerpopoverBodyContent));
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

	protected void renderColorpickerpopoverId(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String colorpickerpopoverId = colorPickerPopover.getColorpickerpopoverId();

		if (colorpickerpopoverId != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.COLORPICKERPOPOVER_ID, colorpickerpopoverId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean initialized = colorPickerPopover.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ColorPickerPopover.INITIALIZED, initialized));
		}
	}

	protected void renderColorpickerpopoverLocale(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String colorpickerpopoverLocale = colorPickerPopover.getColorpickerpopoverLocale();

		if (colorpickerpopoverLocale != null) {
			renderedAttributes.add(renderString(ColorPickerPopover.COLORPICKERPOPOVER_LOCALE, colorpickerpopoverLocale));
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

}