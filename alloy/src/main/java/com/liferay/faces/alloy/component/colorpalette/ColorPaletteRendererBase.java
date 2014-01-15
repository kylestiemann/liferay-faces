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
public abstract class ColorPaletteRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-color-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		ColorPalette colorPalette = (ColorPalette) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var colorPalette = new A.ColorPalette");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, colorPalette);
		renderColumns(renrederedAttributes, colorPalette);
		renderContainerNode(renrederedAttributes, colorPalette);
		renderContentBox(renrederedAttributes, colorPalette);
		renderDestroyed(renrederedAttributes, colorPalette);
		renderDisabled(renrederedAttributes, colorPalette);
		renderFocused(renrederedAttributes, colorPalette);
		renderFormatter(renrederedAttributes, colorPalette);
		renderHeight(renrederedAttributes, colorPalette);
		renderColorpaletteId(renrederedAttributes, colorPalette);
		renderInitialized(renrederedAttributes, colorPalette);
		renderItems(renrederedAttributes, colorPalette);
		renderColorpaletteLocale(renrederedAttributes, colorPalette);
		renderRender(renrederedAttributes, colorPalette);
		renderRendered(renrederedAttributes, colorPalette);
		renderSelected(renrederedAttributes, colorPalette);
		renderSrcNode(renrederedAttributes, colorPalette);
		renderStrings(renrederedAttributes, colorPalette);
		renderTabIndex(renrederedAttributes, colorPalette);
		renderToggleSelection(renrederedAttributes, colorPalette);
		renderVisible(renrederedAttributes, colorPalette);
		renderWidth(renrederedAttributes, colorPalette);

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

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", colorPalette.getBoundingBox()));
		}
	}

	protected void renderColumns(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getColumns() != null) {
			renrederedAttributes.add(renderNumber("columns", colorPalette.getColumns()));
		}
	}

	protected void renderContainerNode(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getContainerNode() != null) {
			renrederedAttributes.add(renderString("containerNode", colorPalette.getContainerNode()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", colorPalette.getContentBox()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", colorPalette.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", colorPalette.getDisabled()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", colorPalette.getFocused()));
		}
	}

	protected void renderFormatter(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getFormatter() != null) {
			renrederedAttributes.add(renderString("formatter", colorPalette.getFormatter()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getHeight() != null) {
			renrederedAttributes.add(renderString("height", colorPalette.getHeight()));
		}
	}

	protected void renderColorpaletteId(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getColorpaletteId() != null) {
			renrederedAttributes.add(renderString("colorpaletteId", colorPalette.getColorpaletteId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", colorPalette.getInitialized()));
		}
	}

	protected void renderItems(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getItems() != null) {
			renrederedAttributes.add(renderArray("items", colorPalette.getItems()));
		}
	}

	protected void renderColorpaletteLocale(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getColorpaletteLocale() != null) {
			renrederedAttributes.add(renderString("colorpaletteLocale", colorPalette.getColorpaletteLocale()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getRender() != null) {
			renrederedAttributes.add(renderString("render", colorPalette.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", colorPalette.getRendered()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getSelected() != null) {
			renrederedAttributes.add(renderNumber("selected", colorPalette.getSelected()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", colorPalette.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", colorPalette.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", colorPalette.getTabIndex()));
		}
	}

	protected void renderToggleSelection(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getToggleSelection() != null) {
			renrederedAttributes.add(renderBoolean("toggleSelection", colorPalette.getToggleSelection()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", colorPalette.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, ColorPalette colorPalette) throws IOException {
		if (colorPalette.getWidth() != null) {
			renrederedAttributes.add(renderString("width", colorPalette.getWidth()));
		}
	}

}