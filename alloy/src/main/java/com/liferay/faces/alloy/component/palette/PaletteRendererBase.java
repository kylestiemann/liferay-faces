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
package com.liferay.faces.alloy.component.palette;

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
public abstract class PaletteRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Palette palette = (Palette) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var palette = new A.Palette");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, palette);
		renderColumns(renderedAttributes, palette);
		renderContainerNode(renderedAttributes, palette);
		renderContentBox(renderedAttributes, palette);
		renderDestroyed(renderedAttributes, palette);
		renderDisabled(renderedAttributes, palette);
		renderFocused(renderedAttributes, palette);
		renderFormatter(renderedAttributes, palette);
		renderHeight(renderedAttributes, palette);
		renderPaletteId(renderedAttributes, palette);
		renderInitialized(renderedAttributes, palette);
		renderItems(renderedAttributes, palette);
		renderPaletteLocale(renderedAttributes, palette);
		renderRender(renderedAttributes, palette);
		renderRendered(renderedAttributes, palette);
		renderSelected(renderedAttributes, palette);
		renderSrcNode(renderedAttributes, palette);
		renderStrings(renderedAttributes, palette);
		renderTabIndex(renderedAttributes, palette);
		renderToggleSelection(renderedAttributes, palette);
		renderVisible(renderedAttributes, palette);
		renderWidth(renderedAttributes, palette);

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

	protected void renderBoundingBox(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String boundingBox = palette.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Palette.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderColumns(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object columns = palette.getColumns();

		if (columns != null) {
			renderedAttributes.add(renderNumber(Palette.COLUMNS, columns));
		}
	}

	protected void renderContainerNode(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object containerNode = palette.getContainerNode();

		if (containerNode != null) {
			renderedAttributes.add(renderString(Palette.CONTAINER_NODE, containerNode));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String contentBox = palette.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Palette.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean destroyed = palette.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Palette.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean disabled = palette.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Palette.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean focused = palette.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Palette.FOCUSED, focused));
		}
	}

	protected void renderFormatter(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object formatter = palette.getFormatter();

		if (formatter != null) {
			renderedAttributes.add(renderString(Palette.FORMATTER, formatter));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object height = palette.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Palette.HEIGHT, height));
		}
	}

	protected void renderPaletteId(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String paletteId = palette.getPaletteId();

		if (paletteId != null) {
			renderedAttributes.add(renderString(Palette.PALETTE_ID, paletteId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean initialized = palette.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Palette.INITIALIZED, initialized));
		}
	}

	protected void renderItems(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object items = palette.getItems();

		if (items != null) {
			renderedAttributes.add(renderArray(Palette.ITEMS, items));
		}
	}

	protected void renderPaletteLocale(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String paletteLocale = palette.getPaletteLocale();

		if (paletteLocale != null) {
			renderedAttributes.add(renderString(Palette.PALETTE_LOCALE, paletteLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object render = palette.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Palette.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean rendered = palette.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Palette.RENDERED, rendered));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object selected = palette.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderNumber(Palette.SELECTED, selected));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String srcNode = palette.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Palette.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object strings = palette.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Palette.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object tabIndex = palette.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Palette.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToggleSelection(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean toggleSelection = palette.getToggleSelection();

		if (toggleSelection != null) {
			renderedAttributes.add(renderBoolean(Palette.TOGGLE_SELECTION, toggleSelection));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean visible = palette.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Palette.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object width = palette.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Palette.WIDTH, width));
		}
	}

}