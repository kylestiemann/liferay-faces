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
public abstract class HSVAPaletteRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsva-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		HSVAPalette hSVAPalette = (HSVAPalette) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var hSVAPalette = new A.HSVAPalette");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, hSVAPalette);
		renderContentBox(renderedAttributes, hSVAPalette);
		renderControls(renderedAttributes, hSVAPalette);
		renderDestroyed(renderedAttributes, hSVAPalette);
		renderDisabled(renderedAttributes, hSVAPalette);
		renderFieldValidator(renderedAttributes, hSVAPalette);
		renderFocused(renderedAttributes, hSVAPalette);
		renderHeight(renderedAttributes, hSVAPalette);
		renderHSVAPaletteId(renderedAttributes, hSVAPalette);
		renderInitialized(renderedAttributes, hSVAPalette);
		renderHSVAPaletteLocale(renderedAttributes, hSVAPalette);
		renderRender(renderedAttributes, hSVAPalette);
		renderRendered(renderedAttributes, hSVAPalette);
		renderSelected(renderedAttributes, hSVAPalette);
		renderSrcNode(renderedAttributes, hSVAPalette);
		renderStrings(renderedAttributes, hSVAPalette);
		renderTabIndex(renderedAttributes, hSVAPalette);
		renderVisible(renderedAttributes, hSVAPalette);
		renderWidth(renderedAttributes, hSVAPalette);

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

	protected void renderBoundingBox(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String boundingBox = hSVAPalette.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(HSVAPalette.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String contentBox = hSVAPalette.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(HSVAPalette.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControls(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean controls = hSVAPalette.getControls();

		if (controls != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.CONTROLS, controls));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean destroyed = hSVAPalette.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean disabled = hSVAPalette.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.DISABLED, disabled));
		}
	}

	protected void renderFieldValidator(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object fieldValidator = hSVAPalette.getFieldValidator();

		if (fieldValidator != null) {
			renderedAttributes.add(renderObject(HSVAPalette.FIELD_VALIDATOR, fieldValidator));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean focused = hSVAPalette.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object height = hSVAPalette.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(HSVAPalette.HEIGHT, height));
		}
	}

	protected void renderHSVAPaletteId(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String hSVAPaletteId = hSVAPalette.getHSVAPaletteId();

		if (hSVAPaletteId != null) {
			renderedAttributes.add(renderString(HSVAPalette.H_SVAPALETTE_ID, hSVAPaletteId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean initialized = hSVAPalette.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.INITIALIZED, initialized));
		}
	}

	protected void renderHSVAPaletteLocale(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String hSVAPaletteLocale = hSVAPalette.getHSVAPaletteLocale();

		if (hSVAPaletteLocale != null) {
			renderedAttributes.add(renderString(HSVAPalette.H_SVAPALETTE_LOCALE, hSVAPaletteLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object render = hSVAPalette.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(HSVAPalette.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean rendered = hSVAPalette.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.RENDERED, rendered));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String selected = hSVAPalette.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderString(HSVAPalette.SELECTED, selected));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String srcNode = hSVAPalette.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(HSVAPalette.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object strings = hSVAPalette.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(HSVAPalette.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object tabIndex = hSVAPalette.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(HSVAPalette.TAB_INDEX, tabIndex));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean visible = hSVAPalette.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object width = hSVAPalette.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(HSVAPalette.WIDTH, width));
		}
	}

}