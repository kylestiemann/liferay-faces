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
package com.liferay.faces.alloy.component.togglebutton;

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
public abstract class ToggleButtonRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ToggleButton toggleButton = (ToggleButton) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var toggleButton = new A.ToggleButton");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderCssClass(renderedAttributes, toggleButton);
		renderIcon(renderedAttributes, toggleButton);
		renderIconAlign(renderedAttributes, toggleButton);
		renderIconElement(renderedAttributes, toggleButton);
		renderPrimary(renderedAttributes, toggleButton);
		renderType(renderedAttributes, toggleButton);

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

	protected void renderCssClass(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String cssClass = toggleButton.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(ToggleButton.CSS_CLASS, cssClass));
		}
	}

	protected void renderIcon(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String icon = toggleButton.getIcon();

		if (icon != null) {
			renderedAttributes.add(renderString(ToggleButton.ICON, icon));
		}
	}

	protected void renderIconAlign(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String iconAlign = toggleButton.getIconAlign();

		if (iconAlign != null) {
			renderedAttributes.add(renderString(ToggleButton.ICON_ALIGN, iconAlign));
		}
	}

	protected void renderIconElement(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String iconElement = toggleButton.getIconElement();

		if (iconElement != null) {
			renderedAttributes.add(renderString(ToggleButton.ICON_ELEMENT, iconElement));
		}
	}

	protected void renderPrimary(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.Boolean primary = toggleButton.getPrimary();

		if (primary != null) {
			renderedAttributes.add(renderBoolean(ToggleButton.PRIMARY, primary));
		}
	}

	protected void renderType(List<String> renderedAttributes, ToggleButton toggleButton) throws IOException {
		java.lang.String type = toggleButton.getType();

		if (type != null) {
			renderedAttributes.add(renderString(ToggleButton.TYPE, type));
		}
	}

}