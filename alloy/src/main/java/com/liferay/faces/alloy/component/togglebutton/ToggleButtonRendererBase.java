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
public abstract class ToggleButtonRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ToggleButton toggleButton = (ToggleButton) uiComponent;
		encodeHTML(facesContext, toggleButton);
		encodeJavaScript(facesContext, toggleButton);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ToggleButton toggleButton) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ToggleButton toggleButton) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, toggleButton);

		bufferedResponseWriter.write("var toggleButton = new A.ToggleButton");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderCssClass(renrederedAttributes, toggleButton);
		renderIcon(renrederedAttributes, toggleButton);
		renderIconAlign(renrederedAttributes, toggleButton);
		renderIconElement(renrederedAttributes, toggleButton);
		renderPrimary(renrederedAttributes, toggleButton);
		renderType(renrederedAttributes, toggleButton);

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

		endJavaScript(facesContext);

		handleBuffer(facesContext, toggleButton);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, ToggleButton toggleButton) throws IOException {
		if (toggleButton.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", toggleButton.getCssClass()));
		}
	}

	protected void renderIcon(ArrayList<String> renrederedAttributes, ToggleButton toggleButton) throws IOException {
		if (toggleButton.getIcon() != null) {
			renrederedAttributes.add(renderString("icon", toggleButton.getIcon()));
		}
	}

	protected void renderIconAlign(ArrayList<String> renrederedAttributes, ToggleButton toggleButton) throws IOException {
		if (toggleButton.getIconAlign() != null) {
			renrederedAttributes.add(renderString("iconAlign", toggleButton.getIconAlign()));
		}
	}

	protected void renderIconElement(ArrayList<String> renrederedAttributes, ToggleButton toggleButton) throws IOException {
		if (toggleButton.getIconElement() != null) {
			renrederedAttributes.add(renderString("iconElement", toggleButton.getIconElement()));
		}
	}

	protected void renderPrimary(ArrayList<String> renrederedAttributes, ToggleButton toggleButton) throws IOException {
		if (toggleButton.getPrimary() != null) {
			renrederedAttributes.add(renderBoolean("primary", toggleButton.getPrimary()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, ToggleButton toggleButton) throws IOException {
		if (toggleButton.getType() != null) {
			renrederedAttributes.add(renderString("type", toggleButton.getType()));
		}
	}

}