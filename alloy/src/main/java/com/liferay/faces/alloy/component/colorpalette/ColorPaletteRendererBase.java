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
package com.liferay.faces.alloy.component.colorpalette;

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
public abstract class ColorPaletteRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-color-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ColorPalette colorPalette = (ColorPalette) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var colorPalette = new A.ColorPalette");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, colorPalette);
		renderColumns(renderedAttributes, colorPalette);
		renderContainerNode(renderedAttributes, colorPalette);
		renderContentBox(renderedAttributes, colorPalette);
		renderDestroyed(renderedAttributes, colorPalette);
		renderDisabled(renderedAttributes, colorPalette);
		renderFocused(renderedAttributes, colorPalette);
		renderFormatter(renderedAttributes, colorPalette);
		renderHeight(renderedAttributes, colorPalette);
		renderColorPaletteId(renderedAttributes, colorPalette);
		renderInitialized(renderedAttributes, colorPalette);
		renderItems(renderedAttributes, colorPalette);
		renderColorPaletteLocale(renderedAttributes, colorPalette);
		renderRender(renderedAttributes, colorPalette);
		renderRendered(renderedAttributes, colorPalette);
		renderSelected(renderedAttributes, colorPalette);
		renderSrcNode(renderedAttributes, colorPalette);
		renderStrings(renderedAttributes, colorPalette);
		renderTabIndex(renderedAttributes, colorPalette);
		renderToggleSelection(renderedAttributes, colorPalette);
		renderVisible(renderedAttributes, colorPalette);
		renderWidth(renderedAttributes, colorPalette);

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

	protected void renderBoundingBox(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String boundingBox = colorPalette.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(ColorPalette.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderColumns(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object columns = colorPalette.getColumns();

		if (columns != null) {
			renderedAttributes.add(renderNumber(ColorPalette.COLUMNS, columns));
		}
	}

	protected void renderContainerNode(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object containerNode = colorPalette.getContainerNode();

		if (containerNode != null) {
			renderedAttributes.add(renderString(ColorPalette.CONTAINER_NODE, containerNode));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String contentBox = colorPalette.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(ColorPalette.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean destroyed = colorPalette.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean disabled = colorPalette.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean focused = colorPalette.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.FOCUSED, focused));
		}
	}

	protected void renderFormatter(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object formatter = colorPalette.getFormatter();

		if (formatter != null) {
			renderedAttributes.add(renderString(ColorPalette.FORMATTER, formatter));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object height = colorPalette.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(ColorPalette.HEIGHT, height));
		}
	}

	protected void renderColorPaletteId(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String colorPaletteId = colorPalette.getColorPaletteId();

		if (colorPaletteId != null) {
			renderedAttributes.add(renderString(ColorPalette.COLOR_PALETTE_ID, colorPaletteId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean initialized = colorPalette.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.INITIALIZED, initialized));
		}
	}

	protected void renderItems(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object items = colorPalette.getItems();

		if (items != null) {
			renderedAttributes.add(renderArray(ColorPalette.ITEMS, items));
		}
	}

	protected void renderColorPaletteLocale(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String colorPaletteLocale = colorPalette.getColorPaletteLocale();

		if (colorPaletteLocale != null) {
			renderedAttributes.add(renderString(ColorPalette.COLOR_PALETTE_LOCALE, colorPaletteLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object render = colorPalette.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(ColorPalette.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean rendered = colorPalette.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.RENDERED, rendered));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object selected = colorPalette.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderNumber(ColorPalette.SELECTED, selected));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String srcNode = colorPalette.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(ColorPalette.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object strings = colorPalette.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(ColorPalette.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object tabIndex = colorPalette.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(ColorPalette.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToggleSelection(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean toggleSelection = colorPalette.getToggleSelection();

		if (toggleSelection != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.TOGGLE_SELECTION, toggleSelection));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean visible = colorPalette.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object width = colorPalette.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(ColorPalette.WIDTH, width));
		}
	}

}