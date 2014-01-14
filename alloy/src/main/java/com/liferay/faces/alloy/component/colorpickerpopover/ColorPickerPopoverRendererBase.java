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

		bufferedResponseWriter.write("var colorPickerPopover = new Y.ColorPickerPopover");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlign(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColorpickerpopoverBodyContent(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColor(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderColorPalette(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClass(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCurrentTrigger(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDefaultColor(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHsvPalette(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRecentColors(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRenderColorPalette(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRenderHSVPalette(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTrigger(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTriggerEvent(bufferedResponseWriter, colorPickerPopover);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, colorPickerPopover);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, colorPickerPopover);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderObject(responseWriter, "align", colorPickerPopover.getAlign());
	}

	protected void renderColorpickerpopoverBodyContent(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderString(responseWriter, "colorpickerpopoverBodyContent", colorPickerPopover.getColorpickerpopoverBodyContent());
	}

	protected void renderColor(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderString(responseWriter, "color", colorPickerPopover.getColor());
	}

	protected void renderColorPalette(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderObject(responseWriter, "colorPalette", colorPickerPopover.getColorPalette());
	}

	protected void renderCssClass(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderString(responseWriter, "cssClass", colorPickerPopover.getCssClass());
	}

	protected void renderCurrentTrigger(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderString(responseWriter, "currentTrigger", colorPickerPopover.getCurrentTrigger());
	}

	protected void renderDefaultColor(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderString(responseWriter, "defaultColor", colorPickerPopover.getDefaultColor());
	}

	protected void renderHsvPalette(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderObject(responseWriter, "hsvPalette", colorPickerPopover.getHsvPalette());
	}

	protected void renderRecentColors(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderObject(responseWriter, "recentColors", colorPickerPopover.getRecentColors());
	}

	protected void renderRenderColorPalette(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderBoolean(responseWriter, "renderColorPalette", colorPickerPopover.getRenderColorPalette());
	}

	protected void renderRenderHSVPalette(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderBoolean(responseWriter, "renderHSVPalette", colorPickerPopover.getRenderHSVPalette());
	}

	protected void renderStrings(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderObject(responseWriter, "strings", colorPickerPopover.getStrings());
	}

	protected void renderTrigger(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderString(responseWriter, "trigger", colorPickerPopover.getTrigger());
	}

	protected void renderTriggerEvent(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderString(responseWriter, "triggerEvent", colorPickerPopover.getTriggerEvent());
	}

	protected void renderVisible(ResponseWriter responseWriter, ColorPickerPopover colorPickerPopover) throws IOException {
		renderBoolean(responseWriter, "visible", colorPickerPopover.getVisible());
	}

}