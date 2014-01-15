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
public abstract class PaletteRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		Palette palette = (Palette) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var palette = new A.Palette");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, palette);
		renderColumns(renrederedAttributes, palette);
		renderContainerNode(renrederedAttributes, palette);
		renderContentBox(renrederedAttributes, palette);
		renderDestroyed(renrederedAttributes, palette);
		renderDisabled(renrederedAttributes, palette);
		renderFocused(renrederedAttributes, palette);
		renderFormatter(renrederedAttributes, palette);
		renderHeight(renrederedAttributes, palette);
		renderPaletteId(renrederedAttributes, palette);
		renderInitialized(renrederedAttributes, palette);
		renderItems(renrederedAttributes, palette);
		renderPaletteLocale(renrederedAttributes, palette);
		renderRender(renrederedAttributes, palette);
		renderRendered(renrederedAttributes, palette);
		renderSelected(renrederedAttributes, palette);
		renderSrcNode(renrederedAttributes, palette);
		renderStrings(renrederedAttributes, palette);
		renderTabIndex(renrederedAttributes, palette);
		renderToggleSelection(renrederedAttributes, palette);
		renderVisible(renrederedAttributes, palette);
		renderWidth(renrederedAttributes, palette);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", palette.getBoundingBox()));
		}
	}

	protected void renderColumns(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getColumns() != null) {
			renrederedAttributes.add(renderNumber("columns", palette.getColumns()));
		}
	}

	protected void renderContainerNode(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getContainerNode() != null) {
			renrederedAttributes.add(renderString("containerNode", palette.getContainerNode()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", palette.getContentBox()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", palette.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", palette.getDisabled()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", palette.getFocused()));
		}
	}

	protected void renderFormatter(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getFormatter() != null) {
			renrederedAttributes.add(renderString("formatter", palette.getFormatter()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getHeight() != null) {
			renrederedAttributes.add(renderString("height", palette.getHeight()));
		}
	}

	protected void renderPaletteId(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getPaletteId() != null) {
			renrederedAttributes.add(renderString("paletteId", palette.getPaletteId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", palette.getInitialized()));
		}
	}

	protected void renderItems(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getItems() != null) {
			renrederedAttributes.add(renderArray("items", palette.getItems()));
		}
	}

	protected void renderPaletteLocale(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getPaletteLocale() != null) {
			renrederedAttributes.add(renderString("paletteLocale", palette.getPaletteLocale()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getRender() != null) {
			renrederedAttributes.add(renderString("render", palette.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", palette.getRendered()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getSelected() != null) {
			renrederedAttributes.add(renderNumber("selected", palette.getSelected()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", palette.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", palette.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", palette.getTabIndex()));
		}
	}

	protected void renderToggleSelection(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getToggleSelection() != null) {
			renrederedAttributes.add(renderBoolean("toggleSelection", palette.getToggleSelection()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", palette.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Palette palette) throws IOException {
		if (palette.getWidth() != null) {
			renrederedAttributes.add(renderString("width", palette.getWidth()));
		}
	}

}