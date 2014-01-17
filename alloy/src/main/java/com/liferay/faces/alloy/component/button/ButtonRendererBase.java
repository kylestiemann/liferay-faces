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
package com.liferay.faces.alloy.component.button;

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
public abstract class ButtonRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Button button = (Button) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var button = new A.Button");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, button);
		renderContentBox(renderedAttributes, button);
		renderCssClass(renderedAttributes, button);
		renderDestroyed(renderedAttributes, button);
		renderDisabled(renderedAttributes, button);
		renderFocused(renderedAttributes, button);
		renderHeight(renderedAttributes, button);
		renderIcon(renderedAttributes, button);
		renderIconAlign(renderedAttributes, button);
		renderIconElement(renderedAttributes, button);
		renderButtonId(renderedAttributes, button);
		renderInitialized(renderedAttributes, button);
		renderLabel(renderedAttributes, button);
		renderButtonLocale(renderedAttributes, button);
		renderPrimary(renderedAttributes, button);
		renderRender(renderedAttributes, button);
		renderRendered(renderedAttributes, button);
		renderSrcNode(renderedAttributes, button);
		renderStrings(renderedAttributes, button);
		renderTabIndex(renderedAttributes, button);
		renderVisible(renderedAttributes, button);
		renderWidth(renderedAttributes, button);

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

	protected void renderBoundingBox(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String boundingBox = button.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Button.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String contentBox = button.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Button.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String cssClass = button.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(Button.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean destroyed = button.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Button.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean disabled = button.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Button.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean focused = button.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Button.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object height = button.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Button.HEIGHT, height));
		}
	}

	protected void renderIcon(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String icon = button.getIcon();

		if (icon != null) {
			renderedAttributes.add(renderString(Button.ICON, icon));
		}
	}

	protected void renderIconAlign(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String iconAlign = button.getIconAlign();

		if (iconAlign != null) {
			renderedAttributes.add(renderString(Button.ICON_ALIGN, iconAlign));
		}
	}

	protected void renderIconElement(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String iconElement = button.getIconElement();

		if (iconElement != null) {
			renderedAttributes.add(renderString(Button.ICON_ELEMENT, iconElement));
		}
	}

	protected void renderButtonId(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String buttonId = button.getButtonId();

		if (buttonId != null) {
			renderedAttributes.add(renderString(Button.BUTTON_ID, buttonId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean initialized = button.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Button.INITIALIZED, initialized));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String label = button.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(Button.LABEL, label));
		}
	}

	protected void renderButtonLocale(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String buttonLocale = button.getButtonLocale();

		if (buttonLocale != null) {
			renderedAttributes.add(renderString(Button.BUTTON_LOCALE, buttonLocale));
		}
	}

	protected void renderPrimary(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean primary = button.getPrimary();

		if (primary != null) {
			renderedAttributes.add(renderBoolean(Button.PRIMARY, primary));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object render = button.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Button.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean rendered = button.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Button.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.String srcNode = button.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Button.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object strings = button.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Button.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object tabIndex = button.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Button.TAB_INDEX, tabIndex));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Boolean visible = button.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Button.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Button button) throws IOException {
		java.lang.Object width = button.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Button.WIDTH, width));
		}
	}

}