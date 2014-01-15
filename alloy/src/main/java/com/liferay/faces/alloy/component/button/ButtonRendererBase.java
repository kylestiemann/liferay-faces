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
public abstract class ButtonRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Button button = (Button) uiComponent;
		encodeHTML(facesContext, button);
		encodeJavaScript(facesContext, button);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Button button) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Button button) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, button);

		bufferedResponseWriter.write("var button = new A.Button");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, button);
		renderContentBox(renrederedAttributes, button);
		renderCssClass(renrederedAttributes, button);
		renderDestroyed(renrederedAttributes, button);
		renderDisabled(renrederedAttributes, button);
		renderFocused(renrederedAttributes, button);
		renderHeight(renrederedAttributes, button);
		renderIcon(renrederedAttributes, button);
		renderIconAlign(renrederedAttributes, button);
		renderIconElement(renrederedAttributes, button);
		renderButtonId(renrederedAttributes, button);
		renderInitialized(renrederedAttributes, button);
		renderLabel(renrederedAttributes, button);
		renderButtonLocale(renrederedAttributes, button);
		renderPrimary(renrederedAttributes, button);
		renderRender(renrederedAttributes, button);
		renderRendered(renrederedAttributes, button);
		renderSrcNode(renrederedAttributes, button);
		renderStrings(renrederedAttributes, button);
		renderTabIndex(renrederedAttributes, button);
		renderVisible(renrederedAttributes, button);
		renderWidth(renrederedAttributes, button);

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

		handleBuffer(facesContext, button);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", button.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", button.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", button.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", button.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", button.getDisabled()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", button.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getHeight() != null) {
			renrederedAttributes.add(renderString("height", button.getHeight()));
		}
	}

	protected void renderIcon(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getIcon() != null) {
			renrederedAttributes.add(renderString("icon", button.getIcon()));
		}
	}

	protected void renderIconAlign(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getIconAlign() != null) {
			renrederedAttributes.add(renderString("iconAlign", button.getIconAlign()));
		}
	}

	protected void renderIconElement(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getIconElement() != null) {
			renrederedAttributes.add(renderString("iconElement", button.getIconElement()));
		}
	}

	protected void renderButtonId(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getButtonId() != null) {
			renrederedAttributes.add(renderString("buttonId", button.getButtonId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", button.getInitialized()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getLabel() != null) {
			renrederedAttributes.add(renderString("label", button.getLabel()));
		}
	}

	protected void renderButtonLocale(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getButtonLocale() != null) {
			renrederedAttributes.add(renderString("buttonLocale", button.getButtonLocale()));
		}
	}

	protected void renderPrimary(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getPrimary() != null) {
			renrederedAttributes.add(renderBoolean("primary", button.getPrimary()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getRender() != null) {
			renrederedAttributes.add(renderString("render", button.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", button.getRendered()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", button.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", button.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", button.getTabIndex()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", button.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Button button) throws IOException {
		if (button.getWidth() != null) {
			renrederedAttributes.add(renderString("width", button.getWidth()));
		}
	}

}