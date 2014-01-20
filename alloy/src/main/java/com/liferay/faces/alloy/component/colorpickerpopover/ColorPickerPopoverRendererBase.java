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

		if (colorPickerPopover.getAlign() != null) {
			renderAlign(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getColorPickerPopoverBodyContent() != null) {
			renderColorPickerPopoverBodyContent(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getCentered() != null) {
			renderCentered(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getColor() != null) {
			renderColor(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getColorPalette() != null) {
			renderColorPalette(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getConstrain() != null) {
			renderConstrain(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getContentBox() != null) {
			renderContentBox(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getCssClass() != null) {
			renderCssClass(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getCurrentTrigger() != null) {
			renderCurrentTrigger(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getDefaultColor() != null) {
			renderDefaultColor(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getDisabled() != null) {
			renderDisabled(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getFocusOn() != null) {
			renderFocusOn(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getFocused() != null) {
			renderFocused(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getHeight() != null) {
			renderHeight(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getHideOn() != null) {
			renderHideOn(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getHsvPalette() != null) {
			renderHsvPalette(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getColorPickerPopoverId() != null) {
			renderColorPickerPopoverId(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getInitialized() != null) {
			renderInitialized(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getColorPickerPopoverLocale() != null) {
			renderColorPickerPopoverLocale(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getMaskNode() != null) {
			renderMaskNode(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getModal() != null) {
			renderModal(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getRecentColors() != null) {
			renderRecentColors(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getRender() != null) {
			renderRender(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getRenderColorPalette() != null) {
			renderRenderColorPalette(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getRenderHSVPalette() != null) {
			renderRenderHSVPalette(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getRendered() != null) {
			renderRendered(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getShim() != null) {
			renderShim(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getStrings() != null) {
			renderStrings(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getToolbarPosition() != null) {
			renderToolbarPosition(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getToolbars() != null) {
			renderToolbars(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getTrigger() != null) {
			renderTrigger(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getTriggerEvent() != null) {
			renderTriggerEvent(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getTriggerToggleEvent() != null) {
			renderTriggerToggleEvent(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getVisible() != null) {
			renderVisible(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getWidth() != null) {
			renderWidth(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getX() != null) {
			renderX(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getXy() != null) {
			renderXy(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getY() != null) {
			renderY(renderedAttributes, colorPickerPopover);
		}
		
		if (colorPickerPopover.getZIndex() != null) {
			renderZIndex(renderedAttributes, colorPickerPopover);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (colorPickerPopover.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterColorChange() != null) {
			renderAfterColorChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterColorPaletteChange() != null) {
			renderAfterColorPaletteChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterCurrentTriggerChange() != null) {
			renderAfterCurrentTriggerChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterDefaultColorChange() != null) {
			renderAfterDefaultColorChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterFocusOnChange() != null) {
			renderAfterFocusOnChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterHideOnChange() != null) {
			renderAfterHideOnChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterHsvPaletteChange() != null) {
			renderAfterHsvPaletteChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterMaskNodeChange() != null) {
			renderAfterMaskNodeChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterModalChange() != null) {
			renderAfterModalChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterRecentColorsChange() != null) {
			renderAfterRecentColorsChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterRenderColorPaletteChange() != null) {
			renderAfterRenderColorPaletteChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterRenderHSVPaletteChange() != null) {
			renderAfterRenderHSVPaletteChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterToolbarPositionChange() != null) {
			renderAfterToolbarPositionChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterToolbarsChange() != null) {
			renderAfterToolbarsChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterTriggerChange() != null) {
			renderAfterTriggerChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterTriggerEventChange() != null) {
			renderAfterTriggerEventChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterTriggerToggleEventChange() != null) {
			renderAfterTriggerToggleEventChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, colorPickerPopover);
		}
		

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

		if (colorPickerPopover.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnColorChange() != null) {
			renderOnColorChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnColorPaletteChange() != null) {
			renderOnColorPaletteChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnCurrentTriggerChange() != null) {
			renderOnCurrentTriggerChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnDefaultColorChange() != null) {
			renderOnDefaultColorChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnFocusOnChange() != null) {
			renderOnFocusOnChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnHideOnChange() != null) {
			renderOnHideOnChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnHsvPaletteChange() != null) {
			renderOnHsvPaletteChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnMaskNodeChange() != null) {
			renderOnMaskNodeChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnModalChange() != null) {
			renderOnModalChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnRecentColorsChange() != null) {
			renderOnRecentColorsChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnRenderColorPaletteChange() != null) {
			renderOnRenderColorPaletteChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnRenderHSVPaletteChange() != null) {
			renderOnRenderHSVPaletteChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnToolbarPositionChange() != null) {
			renderOnToolbarPositionChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnToolbarsChange() != null) {
			renderOnToolbarsChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnTriggerChange() != null) {
			renderOnTriggerChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnTriggerEventChange() != null) {
			renderOnTriggerEventChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnTriggerToggleEventChange() != null) {
			renderOnTriggerToggleEventChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, colorPickerPopover);
		}
		
		if (colorPickerPopover.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, colorPickerPopover);
		}
		

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
		renderedAttributes.add(renderObject(ColorPickerPopover.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object alignOn = colorPickerPopover.getAlignOn();
		renderedAttributes.add(renderArray(ColorPickerPopover.ALIGN_ON, alignOn));
	}

	protected void renderColorPickerPopoverBodyContent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object colorPickerPopoverBodyContent = colorPickerPopover.getColorPickerPopoverBodyContent();
		renderedAttributes.add(renderString(ColorPickerPopover.COLOR_PICKER_POPOVER_BODY_CONTENT, colorPickerPopoverBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String boundingBox = colorPickerPopover.getBoundingBox();
		renderedAttributes.add(renderString(ColorPickerPopover.BOUNDING_BOX, boundingBox));
	}

	protected void renderCentered(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object centered = colorPickerPopover.getCentered();
		renderedAttributes.add(renderString(ColorPickerPopover.CENTERED, centered));
	}

	protected void renderColor(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String color = colorPickerPopover.getColor();
		renderedAttributes.add(renderString(ColorPickerPopover.COLOR, color));
	}

	protected void renderColorPalette(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object colorPalette = colorPickerPopover.getColorPalette();
		renderedAttributes.add(renderObject(ColorPickerPopover.COLOR_PALETTE, colorPalette));
	}

	protected void renderConstrain(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object constrain = colorPickerPopover.getConstrain();
		renderedAttributes.add(renderString(ColorPickerPopover.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String contentBox = colorPickerPopover.getContentBox();
		renderedAttributes.add(renderString(ColorPickerPopover.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String cssClass = colorPickerPopover.getCssClass();
		renderedAttributes.add(renderString(ColorPickerPopover.CSS_CLASS, cssClass));
	}

	protected void renderCurrentTrigger(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String currentTrigger = colorPickerPopover.getCurrentTrigger();
		renderedAttributes.add(renderString(ColorPickerPopover.CURRENT_TRIGGER, currentTrigger));
	}

	protected void renderDefaultColor(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String defaultColor = colorPickerPopover.getDefaultColor();
		renderedAttributes.add(renderString(ColorPickerPopover.DEFAULT_COLOR, defaultColor));
	}

	protected void renderDestroyed(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean destroyed = colorPickerPopover.getDestroyed();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean disabled = colorPickerPopover.getDisabled();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object fillHeight = colorPickerPopover.getFillHeight();
		renderedAttributes.add(renderString(ColorPickerPopover.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocusOn(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object focusOn = colorPickerPopover.getFocusOn();
		renderedAttributes.add(renderArray(ColorPickerPopover.FOCUS_ON, focusOn));
	}

	protected void renderFocused(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean focused = colorPickerPopover.getFocused();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object footerContent = colorPickerPopover.getFooterContent();
		renderedAttributes.add(renderString(ColorPickerPopover.FOOTER_CONTENT, footerContent));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object headerContent = colorPickerPopover.getHeaderContent();
		renderedAttributes.add(renderString(ColorPickerPopover.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object height = colorPickerPopover.getHeight();
		renderedAttributes.add(renderString(ColorPickerPopover.HEIGHT, height));
	}

	protected void renderHideOn(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object hideOn = colorPickerPopover.getHideOn();
		renderedAttributes.add(renderArray(ColorPickerPopover.HIDE_ON, hideOn));
	}

	protected void renderHsvPalette(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object hsvPalette = colorPickerPopover.getHsvPalette();
		renderedAttributes.add(renderObject(ColorPickerPopover.HSV_PALETTE, hsvPalette));
	}

	protected void renderColorPickerPopoverId(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String colorPickerPopoverId = colorPickerPopover.getColorPickerPopoverId();
		renderedAttributes.add(renderString(ColorPickerPopover.COLOR_PICKER_POPOVER_ID, colorPickerPopoverId));
	}

	protected void renderInitialized(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean initialized = colorPickerPopover.getInitialized();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.INITIALIZED, initialized));
	}

	protected void renderColorPickerPopoverLocale(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String colorPickerPopoverLocale = colorPickerPopover.getColorPickerPopoverLocale();
		renderedAttributes.add(renderString(ColorPickerPopover.COLOR_PICKER_POPOVER_LOCALE, colorPickerPopoverLocale));
	}

	protected void renderMaskNode(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object maskNode = colorPickerPopover.getMaskNode();
		renderedAttributes.add(renderString(ColorPickerPopover.MASK_NODE, maskNode));
	}

	protected void renderModal(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean modal = colorPickerPopover.getModal();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.MODAL, modal));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean preventOverlap = colorPickerPopover.getPreventOverlap();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRecentColors(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object recentColors = colorPickerPopover.getRecentColors();
		renderedAttributes.add(renderObject(ColorPickerPopover.RECENT_COLORS, recentColors));
	}

	protected void renderRender(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object render = colorPickerPopover.getRender();
		renderedAttributes.add(renderString(ColorPickerPopover.RENDER, render));
	}

	protected void renderRenderColorPalette(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean renderColorPalette = colorPickerPopover.getRenderColorPalette();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.RENDER_COLOR_PALETTE, renderColorPalette));
	}

	protected void renderRenderHSVPalette(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean renderHSVPalette = colorPickerPopover.getRenderHSVPalette();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.RENDER_HSVPALETTE, renderHSVPalette));
	}

	protected void renderRendered(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean rendered = colorPickerPopover.getRendered();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.RENDERED, rendered));
	}

	protected void renderShim(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean shim = colorPickerPopover.getShim();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.SHIM, shim));
	}

	protected void renderSrcNode(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String srcNode = colorPickerPopover.getSrcNode();
		renderedAttributes.add(renderString(ColorPickerPopover.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object strings = colorPickerPopover.getStrings();
		renderedAttributes.add(renderObject(ColorPickerPopover.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object tabIndex = colorPickerPopover.getTabIndex();
		renderedAttributes.add(renderNumber(ColorPickerPopover.TAB_INDEX, tabIndex));
	}

	protected void renderToolbarPosition(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object toolbarPosition = colorPickerPopover.getToolbarPosition();
		renderedAttributes.add(renderObject(ColorPickerPopover.TOOLBAR_POSITION, toolbarPosition));
	}

	protected void renderToolbars(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String toolbars = colorPickerPopover.getToolbars();
		renderedAttributes.add(renderString(ColorPickerPopover.TOOLBARS, toolbars));
	}

	protected void renderTrigger(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String trigger = colorPickerPopover.getTrigger();
		renderedAttributes.add(renderString(ColorPickerPopover.TRIGGER, trigger));
	}

	protected void renderTriggerEvent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String triggerEvent = colorPickerPopover.getTriggerEvent();
		renderedAttributes.add(renderString(ColorPickerPopover.TRIGGER_EVENT, triggerEvent));
	}

	protected void renderTriggerToggleEvent(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String triggerToggleEvent = colorPickerPopover.getTriggerToggleEvent();
		renderedAttributes.add(renderString(ColorPickerPopover.TRIGGER_TOGGLE_EVENT, triggerToggleEvent));
	}

	protected void renderVisible(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Boolean visible = colorPickerPopover.getVisible();
		renderedAttributes.add(renderBoolean(ColorPickerPopover.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object width = colorPickerPopover.getWidth();
		renderedAttributes.add(renderString(ColorPickerPopover.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object x = colorPickerPopover.getX();
		renderedAttributes.add(renderNumber(ColorPickerPopover.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object xy = colorPickerPopover.getXy();
		renderedAttributes.add(renderArray(ColorPickerPopover.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object y = colorPickerPopover.getY();
		renderedAttributes.add(renderNumber(ColorPickerPopover.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.Object zIndex = colorPickerPopover.getZIndex();
		renderedAttributes.add(renderNumber(ColorPickerPopover.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterAlignChange = colorPickerPopover.getAfterAlignChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterAlignOnChange = colorPickerPopover.getAfterAlignOnChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterBodyContentChange = colorPickerPopover.getAfterBodyContentChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterBoundingBoxChange = colorPickerPopover.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterCenteredChange = colorPickerPopover.getAfterCenteredChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterColorChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterColorChange = colorPickerPopover.getAfterColorChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_COLOR_CHANGE, afterColorChange));
	}

	protected void renderAfterColorPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterColorPaletteChange = colorPickerPopover.getAfterColorPaletteChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_COLOR_PALETTE_CHANGE, afterColorPaletteChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterConstrainChange = colorPickerPopover.getAfterConstrainChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterContentBoxChange = colorPickerPopover.getAfterContentBoxChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterCssClassChange = colorPickerPopover.getAfterCssClassChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterCurrentTriggerChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterCurrentTriggerChange = colorPickerPopover.getAfterCurrentTriggerChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_CURRENT_TRIGGER_CHANGE, afterCurrentTriggerChange));
	}

	protected void renderAfterDefaultColorChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterDefaultColorChange = colorPickerPopover.getAfterDefaultColorChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_DEFAULT_COLOR_CHANGE, afterDefaultColorChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterDestroyedChange = colorPickerPopover.getAfterDestroyedChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterDisabledChange = colorPickerPopover.getAfterDisabledChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterFillHeightChange = colorPickerPopover.getAfterFillHeightChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterFocusOnChange = colorPickerPopover.getAfterFocusOnChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterFocusedChange = colorPickerPopover.getAfterFocusedChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterFooterContentChange = colorPickerPopover.getAfterFooterContentChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterHeaderContentChange = colorPickerPopover.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterHeightChange = colorPickerPopover.getAfterHeightChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterHideOnChange = colorPickerPopover.getAfterHideOnChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_HIDE_ON_CHANGE, afterHideOnChange));
	}

	protected void renderAfterHsvPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterHsvPaletteChange = colorPickerPopover.getAfterHsvPaletteChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_HSV_PALETTE_CHANGE, afterHsvPaletteChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterIdChange = colorPickerPopover.getAfterIdChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterInitializedChange = colorPickerPopover.getAfterInitializedChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterLocaleChange = colorPickerPopover.getAfterLocaleChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterMaskNodeChange = colorPickerPopover.getAfterMaskNodeChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterModalChange = colorPickerPopover.getAfterModalChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_MODAL_CHANGE, afterModalChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterPreventOverlapChange = colorPickerPopover.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRecentColorsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRecentColorsChange = colorPickerPopover.getAfterRecentColorsChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RECENT_COLORS_CHANGE, afterRecentColorsChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRenderChange = colorPickerPopover.getAfterRenderChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderColorPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRenderColorPaletteChange = colorPickerPopover.getAfterRenderColorPaletteChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RENDER_COLOR_PALETTE_CHANGE, afterRenderColorPaletteChange));
	}

	protected void renderAfterRenderHSVPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRenderHSVPaletteChange = colorPickerPopover.getAfterRenderHSVPaletteChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RENDER_HSVPALETTE_CHANGE, afterRenderHSVPaletteChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterRenderedChange = colorPickerPopover.getAfterRenderedChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterShimChange = colorPickerPopover.getAfterShimChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterSrcNodeChange = colorPickerPopover.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterStringsChange = colorPickerPopover.getAfterStringsChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterTabIndexChange = colorPickerPopover.getAfterTabIndexChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToolbarPositionChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterToolbarPositionChange = colorPickerPopover.getAfterToolbarPositionChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TOOLBAR_POSITION_CHANGE, afterToolbarPositionChange));
	}

	protected void renderAfterToolbarsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterToolbarsChange = colorPickerPopover.getAfterToolbarsChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TOOLBARS_CHANGE, afterToolbarsChange));
	}

	protected void renderAfterTriggerChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterTriggerChange = colorPickerPopover.getAfterTriggerChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TRIGGER_CHANGE, afterTriggerChange));
	}

	protected void renderAfterTriggerEventChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterTriggerEventChange = colorPickerPopover.getAfterTriggerEventChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TRIGGER_EVENT_CHANGE, afterTriggerEventChange));
	}

	protected void renderAfterTriggerToggleEventChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterTriggerToggleEventChange = colorPickerPopover.getAfterTriggerToggleEventChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_TRIGGER_TOGGLE_EVENT_CHANGE, afterTriggerToggleEventChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterVisibleChange = colorPickerPopover.getAfterVisibleChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterWidthChange = colorPickerPopover.getAfterWidthChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterXChange = colorPickerPopover.getAfterXChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterXyChange = colorPickerPopover.getAfterXyChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterYChange = colorPickerPopover.getAfterYChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String afterZIndexChange = colorPickerPopover.getAfterZIndexChange();
		renderedAttributes.add(renderString(ColorPickerPopover.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onAlignChange = colorPickerPopover.getOnAlignChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onAlignOnChange = colorPickerPopover.getOnAlignOnChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onBodyContentChange = colorPickerPopover.getOnBodyContentChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onBoundingBoxChange = colorPickerPopover.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onCenteredChange = colorPickerPopover.getOnCenteredChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnColorChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onColorChange = colorPickerPopover.getOnColorChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_COLOR_CHANGE, onColorChange));
	}

	protected void renderOnColorPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onColorPaletteChange = colorPickerPopover.getOnColorPaletteChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_COLOR_PALETTE_CHANGE, onColorPaletteChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onConstrainChange = colorPickerPopover.getOnConstrainChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onContentBoxChange = colorPickerPopover.getOnContentBoxChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onCssClassChange = colorPickerPopover.getOnCssClassChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnCurrentTriggerChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onCurrentTriggerChange = colorPickerPopover.getOnCurrentTriggerChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_CURRENT_TRIGGER_CHANGE, onCurrentTriggerChange));
	}

	protected void renderOnDefaultColorChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onDefaultColorChange = colorPickerPopover.getOnDefaultColorChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_DEFAULT_COLOR_CHANGE, onDefaultColorChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onDestroyedChange = colorPickerPopover.getOnDestroyedChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onDisabledChange = colorPickerPopover.getOnDisabledChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onFillHeightChange = colorPickerPopover.getOnFillHeightChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onFocusOnChange = colorPickerPopover.getOnFocusOnChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_FOCUS_ON_CHANGE, onFocusOnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onFocusedChange = colorPickerPopover.getOnFocusedChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onFooterContentChange = colorPickerPopover.getOnFooterContentChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onHeaderContentChange = colorPickerPopover.getOnHeaderContentChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onHeightChange = colorPickerPopover.getOnHeightChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideOnChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onHideOnChange = colorPickerPopover.getOnHideOnChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_HIDE_ON_CHANGE, onHideOnChange));
	}

	protected void renderOnHsvPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onHsvPaletteChange = colorPickerPopover.getOnHsvPaletteChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_HSV_PALETTE_CHANGE, onHsvPaletteChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onIdChange = colorPickerPopover.getOnIdChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onInitializedChange = colorPickerPopover.getOnInitializedChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onLocaleChange = colorPickerPopover.getOnLocaleChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onMaskNodeChange = colorPickerPopover.getOnMaskNodeChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_MASK_NODE_CHANGE, onMaskNodeChange));
	}

	protected void renderOnModalChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onModalChange = colorPickerPopover.getOnModalChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_MODAL_CHANGE, onModalChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onPreventOverlapChange = colorPickerPopover.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRecentColorsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRecentColorsChange = colorPickerPopover.getOnRecentColorsChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_RECENT_COLORS_CHANGE, onRecentColorsChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRenderChange = colorPickerPopover.getOnRenderChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderColorPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRenderColorPaletteChange = colorPickerPopover.getOnRenderColorPaletteChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_RENDER_COLOR_PALETTE_CHANGE, onRenderColorPaletteChange));
	}

	protected void renderOnRenderHSVPaletteChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRenderHSVPaletteChange = colorPickerPopover.getOnRenderHSVPaletteChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_RENDER_HSVPALETTE_CHANGE, onRenderHSVPaletteChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onRenderedChange = colorPickerPopover.getOnRenderedChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onShimChange = colorPickerPopover.getOnShimChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onSrcNodeChange = colorPickerPopover.getOnSrcNodeChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onStringsChange = colorPickerPopover.getOnStringsChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onTabIndexChange = colorPickerPopover.getOnTabIndexChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToolbarPositionChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onToolbarPositionChange = colorPickerPopover.getOnToolbarPositionChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_TOOLBAR_POSITION_CHANGE, onToolbarPositionChange));
	}

	protected void renderOnToolbarsChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onToolbarsChange = colorPickerPopover.getOnToolbarsChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_TOOLBARS_CHANGE, onToolbarsChange));
	}

	protected void renderOnTriggerChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onTriggerChange = colorPickerPopover.getOnTriggerChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_TRIGGER_CHANGE, onTriggerChange));
	}

	protected void renderOnTriggerEventChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onTriggerEventChange = colorPickerPopover.getOnTriggerEventChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_TRIGGER_EVENT_CHANGE, onTriggerEventChange));
	}

	protected void renderOnTriggerToggleEventChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onTriggerToggleEventChange = colorPickerPopover.getOnTriggerToggleEventChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_TRIGGER_TOGGLE_EVENT_CHANGE, onTriggerToggleEventChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onVisibleChange = colorPickerPopover.getOnVisibleChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onWidthChange = colorPickerPopover.getOnWidthChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onXChange = colorPickerPopover.getOnXChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onXyChange = colorPickerPopover.getOnXyChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onYChange = colorPickerPopover.getOnYChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		java.lang.String onZIndexChange = colorPickerPopover.getOnZIndexChange();
		renderedAttributes.add(renderString(ColorPickerPopover.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}