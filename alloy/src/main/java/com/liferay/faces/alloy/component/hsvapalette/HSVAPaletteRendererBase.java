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
package com.liferay.faces.alloy.component.hsvapalette;

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
public abstract class HSVAPaletteRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsva-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		HSVAPalette hSVAPalette = (HSVAPalette) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var hSVAPalette = new A.HSVAPalette");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, hSVAPalette);
		renderContentBox(renrederedAttributes, hSVAPalette);
		renderControls(renrederedAttributes, hSVAPalette);
		renderDestroyed(renrederedAttributes, hSVAPalette);
		renderDisabled(renrederedAttributes, hSVAPalette);
		renderFieldValidator(renrederedAttributes, hSVAPalette);
		renderFocused(renrederedAttributes, hSVAPalette);
		renderHeight(renrederedAttributes, hSVAPalette);
		renderHsvapaletteId(renrederedAttributes, hSVAPalette);
		renderInitialized(renrederedAttributes, hSVAPalette);
		renderHsvapaletteLocale(renrederedAttributes, hSVAPalette);
		renderRender(renrederedAttributes, hSVAPalette);
		renderRendered(renrederedAttributes, hSVAPalette);
		renderSelected(renrederedAttributes, hSVAPalette);
		renderSrcNode(renrederedAttributes, hSVAPalette);
		renderStrings(renrederedAttributes, hSVAPalette);
		renderTabIndex(renrederedAttributes, hSVAPalette);
		renderVisible(renrederedAttributes, hSVAPalette);
		renderWidth(renrederedAttributes, hSVAPalette);

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

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", hSVAPalette.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", hSVAPalette.getContentBox()));
		}
	}

	protected void renderControls(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getControls() != null) {
			renrederedAttributes.add(renderBoolean("controls", hSVAPalette.getControls()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", hSVAPalette.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", hSVAPalette.getDisabled()));
		}
	}

	protected void renderFieldValidator(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getFieldValidator() != null) {
			renrederedAttributes.add(renderObject("fieldValidator", hSVAPalette.getFieldValidator()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", hSVAPalette.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getHeight() != null) {
			renrederedAttributes.add(renderString("height", hSVAPalette.getHeight()));
		}
	}

	protected void renderHsvapaletteId(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getHsvapaletteId() != null) {
			renrederedAttributes.add(renderString("hsvapaletteId", hSVAPalette.getHsvapaletteId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", hSVAPalette.getInitialized()));
		}
	}

	protected void renderHsvapaletteLocale(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getHsvapaletteLocale() != null) {
			renrederedAttributes.add(renderString("hsvapaletteLocale", hSVAPalette.getHsvapaletteLocale()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getRender() != null) {
			renrederedAttributes.add(renderString("render", hSVAPalette.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", hSVAPalette.getRendered()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getSelected() != null) {
			renrederedAttributes.add(renderString("selected", hSVAPalette.getSelected()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", hSVAPalette.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", hSVAPalette.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", hSVAPalette.getTabIndex()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", hSVAPalette.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, HSVAPalette hSVAPalette) throws IOException {
		if (hSVAPalette.getWidth() != null) {
			renrederedAttributes.add(renderString("width", hSVAPalette.getWidth()));
		}
	}

}