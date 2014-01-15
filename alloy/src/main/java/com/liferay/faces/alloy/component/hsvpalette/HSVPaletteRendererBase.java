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
package com.liferay.faces.alloy.component.hsvpalette;

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
public abstract class HSVPaletteRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsv-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		HSVPalette hSVPalette = (HSVPalette) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var hSVPalette = new A.HSVPalette");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, hSVPalette);
		renderContentBox(renrederedAttributes, hSVPalette);
		renderControls(renrederedAttributes, hSVPalette);
		renderDestroyed(renrederedAttributes, hSVPalette);
		renderDisabled(renrederedAttributes, hSVPalette);
		renderFieldValidator(renrederedAttributes, hSVPalette);
		renderFocused(renrederedAttributes, hSVPalette);
		renderHeight(renrederedAttributes, hSVPalette);
		renderHsvpaletteId(renrederedAttributes, hSVPalette);
		renderInitialized(renrederedAttributes, hSVPalette);
		renderHsvpaletteLocale(renrederedAttributes, hSVPalette);
		renderRender(renrederedAttributes, hSVPalette);
		renderRendered(renrederedAttributes, hSVPalette);
		renderSelected(renrederedAttributes, hSVPalette);
		renderSrcNode(renrederedAttributes, hSVPalette);
		renderStrings(renrederedAttributes, hSVPalette);
		renderTabIndex(renrederedAttributes, hSVPalette);
		renderVisible(renrederedAttributes, hSVPalette);
		renderWidth(renrederedAttributes, hSVPalette);

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

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", hSVPalette.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", hSVPalette.getContentBox()));
		}
	}

	protected void renderControls(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getControls() != null) {
			renrederedAttributes.add(renderBoolean("controls", hSVPalette.getControls()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", hSVPalette.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", hSVPalette.getDisabled()));
		}
	}

	protected void renderFieldValidator(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getFieldValidator() != null) {
			renrederedAttributes.add(renderObject("fieldValidator", hSVPalette.getFieldValidator()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", hSVPalette.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getHeight() != null) {
			renrederedAttributes.add(renderString("height", hSVPalette.getHeight()));
		}
	}

	protected void renderHsvpaletteId(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getHsvpaletteId() != null) {
			renrederedAttributes.add(renderString("hsvpaletteId", hSVPalette.getHsvpaletteId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", hSVPalette.getInitialized()));
		}
	}

	protected void renderHsvpaletteLocale(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getHsvpaletteLocale() != null) {
			renrederedAttributes.add(renderString("hsvpaletteLocale", hSVPalette.getHsvpaletteLocale()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getRender() != null) {
			renrederedAttributes.add(renderString("render", hSVPalette.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", hSVPalette.getRendered()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getSelected() != null) {
			renrederedAttributes.add(renderString("selected", hSVPalette.getSelected()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", hSVPalette.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", hSVPalette.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", hSVPalette.getTabIndex()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", hSVPalette.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, HSVPalette hSVPalette) throws IOException {
		if (hSVPalette.getWidth() != null) {
			renrederedAttributes.add(renderString("width", hSVPalette.getWidth()));
		}
	}

}