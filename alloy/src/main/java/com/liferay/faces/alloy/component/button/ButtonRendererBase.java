/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class ButtonRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		Button button = (Button) uiComponent;
		encodeHTML(facesContext, button);
		encodeJavaScript(facesContext, button);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Button button) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Button button) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", button);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-button',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var button = new Y.Button");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(button.getBoundingBox() != null)
		{

			responseWriter.write("boundingBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getBoundingBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getContentBox() != null)
		{

			responseWriter.write("contentBox: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getContentBox().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getCssClass() != null)
		{

			responseWriter.write("cssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getDestroyed() != null)
		{

			responseWriter.write("destroyed: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getDestroyed().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getDisabled() != null)
		{

			responseWriter.write("disabled: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getDisabled().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getFocused() != null)
		{

			responseWriter.write("focused: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getFocused().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getHeight() != null)
		{

			responseWriter.write("height: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getIcon() != null)
		{

			responseWriter.write("icon: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getIcon().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getIconAlign() != null)
		{

			responseWriter.write("iconAlign: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getIconAlign().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getIconElement() != null)
		{

			responseWriter.write("iconElement: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getIconElement().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getButtonId() != null)
		{

			responseWriter.write("buttonId: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getButtonId().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getInitialized() != null)
		{

			responseWriter.write("initialized: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getInitialized().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getLabel() != null)
		{

			responseWriter.write("label: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getButtonLocale() != null)
		{

			responseWriter.write("buttonLocale: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getButtonLocale().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getPrimary() != null)
		{

			responseWriter.write("primary: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getPrimary().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getRender() != null)
		{

			responseWriter.write("render: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getRender().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getRendered() != null)
		{

			responseWriter.write("rendered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getRendered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getSrcNode() != null)
		{

			responseWriter.write("srcNode: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getSrcNode().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getVisible().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(button.getWidth() != null)
		{

			responseWriter.write("width: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(button.getWidth().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_CLOSE);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.endElement("script");
		responseWriter.write(StringPool.NEW_LINE);
	}

}