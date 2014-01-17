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
public abstract class HSVPaletteRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsv-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		HSVPalette hSVPalette = (HSVPalette) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var hSVPalette = new A.HSVPalette");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, hSVPalette);
		renderContentBox(renderedAttributes, hSVPalette);
		renderControls(renderedAttributes, hSVPalette);
		renderDestroyed(renderedAttributes, hSVPalette);
		renderDisabled(renderedAttributes, hSVPalette);
		renderFieldValidator(renderedAttributes, hSVPalette);
		renderFocused(renderedAttributes, hSVPalette);
		renderHeight(renderedAttributes, hSVPalette);
		renderHsvpaletteId(renderedAttributes, hSVPalette);
		renderInitialized(renderedAttributes, hSVPalette);
		renderHsvpaletteLocale(renderedAttributes, hSVPalette);
		renderRender(renderedAttributes, hSVPalette);
		renderRendered(renderedAttributes, hSVPalette);
		renderSelected(renderedAttributes, hSVPalette);
		renderSrcNode(renderedAttributes, hSVPalette);
		renderStrings(renderedAttributes, hSVPalette);
		renderTabIndex(renderedAttributes, hSVPalette);
		renderVisible(renderedAttributes, hSVPalette);
		renderWidth(renderedAttributes, hSVPalette);

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

	protected void renderBoundingBox(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String boundingBox = hSVPalette.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(HSVPalette.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String contentBox = hSVPalette.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(HSVPalette.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControls(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean controls = hSVPalette.getControls();

		if (controls != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.CONTROLS, controls));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean destroyed = hSVPalette.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean disabled = hSVPalette.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.DISABLED, disabled));
		}
	}

	protected void renderFieldValidator(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object fieldValidator = hSVPalette.getFieldValidator();

		if (fieldValidator != null) {
			renderedAttributes.add(renderObject(HSVPalette.FIELD_VALIDATOR, fieldValidator));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean focused = hSVPalette.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object height = hSVPalette.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(HSVPalette.HEIGHT, height));
		}
	}

	protected void renderHsvpaletteId(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String hsvpaletteId = hSVPalette.getHsvpaletteId();

		if (hsvpaletteId != null) {
			renderedAttributes.add(renderString(HSVPalette.HSVPALETTE_ID, hsvpaletteId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean initialized = hSVPalette.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.INITIALIZED, initialized));
		}
	}

	protected void renderHsvpaletteLocale(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String hsvpaletteLocale = hSVPalette.getHsvpaletteLocale();

		if (hsvpaletteLocale != null) {
			renderedAttributes.add(renderString(HSVPalette.HSVPALETTE_LOCALE, hsvpaletteLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object render = hSVPalette.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(HSVPalette.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean rendered = hSVPalette.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.RENDERED, rendered));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String selected = hSVPalette.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderString(HSVPalette.SELECTED, selected));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String srcNode = hSVPalette.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(HSVPalette.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object strings = hSVPalette.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(HSVPalette.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object tabIndex = hSVPalette.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(HSVPalette.TAB_INDEX, tabIndex));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean visible = hSVPalette.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object width = hSVPalette.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(HSVPalette.WIDTH, width));
		}
	}

}