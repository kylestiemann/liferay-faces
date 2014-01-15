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
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class ColorPickerPopoverRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-color-picker-popover";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ColorPickerPopover colorPickerPopover = (ColorPickerPopover) uiComponent;
		encodeHTML(facesContext, colorPickerPopover);
		encodeJavaScript(facesContext, colorPickerPopover);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ColorPickerPopover colorPickerPopover) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ColorPickerPopover colorPickerPopover) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, colorPickerPopover);

		bufferedResponseWriter.write("var colorPickerPopover = new A.ColorPickerPopover");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, colorPickerPopover);
		renderAlignOn(renrederedAttributes, colorPickerPopover);
		renderColorpickerpopoverBodyContent(renrederedAttributes, colorPickerPopover);
		renderBoundingBox(renrederedAttributes, colorPickerPopover);
		renderCentered(renrederedAttributes, colorPickerPopover);
		renderColor(renrederedAttributes, colorPickerPopover);
		renderColorPalette(renrederedAttributes, colorPickerPopover);
		renderConstrain(renrederedAttributes, colorPickerPopover);
		renderContentBox(renrederedAttributes, colorPickerPopover);
		renderCssClass(renrederedAttributes, colorPickerPopover);
		renderCurrentTrigger(renrederedAttributes, colorPickerPopover);
		renderDefaultColor(renrederedAttributes, colorPickerPopover);
		renderDestroyed(renrederedAttributes, colorPickerPopover);
		renderDisabled(renrederedAttributes, colorPickerPopover);
		renderFillHeight(renrederedAttributes, colorPickerPopover);
		renderFocusOn(renrederedAttributes, colorPickerPopover);
		renderFocused(renrederedAttributes, colorPickerPopover);
		renderFooterContent(renrederedAttributes, colorPickerPopover);
		renderHeaderContent(renrederedAttributes, colorPickerPopover);
		renderHeight(renrederedAttributes, colorPickerPopover);
		renderHideOn(renrederedAttributes, colorPickerPopover);
		renderHsvPalette(renrederedAttributes, colorPickerPopover);
		renderColorpickerpopoverId(renrederedAttributes, colorPickerPopover);
		renderInitialized(renrederedAttributes, colorPickerPopover);
		renderColorpickerpopoverLocale(renrederedAttributes, colorPickerPopover);
		renderMaskNode(renrederedAttributes, colorPickerPopover);
		renderModal(renrederedAttributes, colorPickerPopover);
		renderPreventOverlap(renrederedAttributes, colorPickerPopover);
		renderRecentColors(renrederedAttributes, colorPickerPopover);
		renderRender(renrederedAttributes, colorPickerPopover);
		renderRenderColorPalette(renrederedAttributes, colorPickerPopover);
		renderRenderHSVPalette(renrederedAttributes, colorPickerPopover);
		renderRendered(renrederedAttributes, colorPickerPopover);
		renderShim(renrederedAttributes, colorPickerPopover);
		renderSrcNode(renrederedAttributes, colorPickerPopover);
		renderStrings(renrederedAttributes, colorPickerPopover);
		renderTabIndex(renrederedAttributes, colorPickerPopover);
		renderToolbarPosition(renrederedAttributes, colorPickerPopover);
		renderToolbars(renrederedAttributes, colorPickerPopover);
		renderTrigger(renrederedAttributes, colorPickerPopover);
		renderTriggerEvent(renrederedAttributes, colorPickerPopover);
		renderTriggerToggleEvent(renrederedAttributes, colorPickerPopover);
		renderVisible(renrederedAttributes, colorPickerPopover);
		renderWidth(renrederedAttributes, colorPickerPopover);
		renderX(renrederedAttributes, colorPickerPopover);
		renderXy(renrederedAttributes, colorPickerPopover);
		renderY(renrederedAttributes, colorPickerPopover);
		renderZIndex(renrederedAttributes, colorPickerPopover);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, colorPickerPopover);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", colorPickerPopover.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", colorPickerPopover.getAlignOn()));
		}
	}

	protected void renderColorpickerpopoverBodyContent(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getColorpickerpopoverBodyContent() != null) {
			renrederedAttributes.add(renderString("colorpickerpopoverBodyContent", colorPickerPopover.getColorpickerpopoverBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", colorPickerPopover.getBoundingBox()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getCentered() != null) {
			renrederedAttributes.add(renderString("centered", colorPickerPopover.getCentered()));
		}
	}

	protected void renderColor(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getColor() != null) {
			renrederedAttributes.add(renderString("color", colorPickerPopover.getColor()));
		}
	}

	protected void renderColorPalette(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getColorPalette() != null) {
			renrederedAttributes.add(renderObject("colorPalette", colorPickerPopover.getColorPalette()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", colorPickerPopover.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", colorPickerPopover.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", colorPickerPopover.getCssClass()));
		}
	}

	protected void renderCurrentTrigger(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getCurrentTrigger() != null) {
			renrederedAttributes.add(renderString("currentTrigger", colorPickerPopover.getCurrentTrigger()));
		}
	}

	protected void renderDefaultColor(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getDefaultColor() != null) {
			renrederedAttributes.add(renderString("defaultColor", colorPickerPopover.getDefaultColor()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", colorPickerPopover.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", colorPickerPopover.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", colorPickerPopover.getFillHeight()));
		}
	}

	protected void renderFocusOn(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getFocusOn() != null) {
			renrederedAttributes.add(renderArray("focusOn", colorPickerPopover.getFocusOn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", colorPickerPopover.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", colorPickerPopover.getFooterContent()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", colorPickerPopover.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getHeight() != null) {
			renrederedAttributes.add(renderString("height", colorPickerPopover.getHeight()));
		}
	}

	protected void renderHideOn(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getHideOn() != null) {
			renrederedAttributes.add(renderArray("hideOn", colorPickerPopover.getHideOn()));
		}
	}

	protected void renderHsvPalette(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getHsvPalette() != null) {
			renrederedAttributes.add(renderObject("hsvPalette", colorPickerPopover.getHsvPalette()));
		}
	}

	protected void renderColorpickerpopoverId(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getColorpickerpopoverId() != null) {
			renrederedAttributes.add(renderString("colorpickerpopoverId", colorPickerPopover.getColorpickerpopoverId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", colorPickerPopover.getInitialized()));
		}
	}

	protected void renderColorpickerpopoverLocale(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getColorpickerpopoverLocale() != null) {
			renrederedAttributes.add(renderString("colorpickerpopoverLocale", colorPickerPopover.getColorpickerpopoverLocale()));
		}
	}

	protected void renderMaskNode(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getMaskNode() != null) {
			renrederedAttributes.add(renderString("maskNode", colorPickerPopover.getMaskNode()));
		}
	}

	protected void renderModal(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getModal() != null) {
			renrederedAttributes.add(renderBoolean("modal", colorPickerPopover.getModal()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", colorPickerPopover.getPreventOverlap()));
		}
	}

	protected void renderRecentColors(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getRecentColors() != null) {
			renrederedAttributes.add(renderObject("recentColors", colorPickerPopover.getRecentColors()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getRender() != null) {
			renrederedAttributes.add(renderString("render", colorPickerPopover.getRender()));
		}
	}

	protected void renderRenderColorPalette(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getRenderColorPalette() != null) {
			renrederedAttributes.add(renderBoolean("renderColorPalette", colorPickerPopover.getRenderColorPalette()));
		}
	}

	protected void renderRenderHSVPalette(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getRenderHSVPalette() != null) {
			renrederedAttributes.add(renderBoolean("renderHSVPalette", colorPickerPopover.getRenderHSVPalette()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", colorPickerPopover.getRendered()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", colorPickerPopover.getShim()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", colorPickerPopover.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", colorPickerPopover.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", colorPickerPopover.getTabIndex()));
		}
	}

	protected void renderToolbarPosition(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getToolbarPosition() != null) {
			renrederedAttributes.add(renderObject("toolbarPosition", colorPickerPopover.getToolbarPosition()));
		}
	}

	protected void renderToolbars(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getToolbars() != null) {
			renrederedAttributes.add(renderString("toolbars", colorPickerPopover.getToolbars()));
		}
	}

	protected void renderTrigger(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getTrigger() != null) {
			renrederedAttributes.add(renderString("trigger", colorPickerPopover.getTrigger()));
		}
	}

	protected void renderTriggerEvent(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getTriggerEvent() != null) {
			renrederedAttributes.add(renderString("triggerEvent", colorPickerPopover.getTriggerEvent()));
		}
	}

	protected void renderTriggerToggleEvent(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getTriggerToggleEvent() != null) {
			renrederedAttributes.add(renderString("triggerToggleEvent", colorPickerPopover.getTriggerToggleEvent()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", colorPickerPopover.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getWidth() != null) {
			renrederedAttributes.add(renderString("width", colorPickerPopover.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getX() != null) {
			renrederedAttributes.add(renderNumber("x", colorPickerPopover.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", colorPickerPopover.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getY() != null) {
			renrederedAttributes.add(renderNumber("y", colorPickerPopover.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, ColorPickerPopover colorPickerPopover) throws IOException {
		if (colorPickerPopover.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", colorPickerPopover.getZIndex()));
		}
	}

}