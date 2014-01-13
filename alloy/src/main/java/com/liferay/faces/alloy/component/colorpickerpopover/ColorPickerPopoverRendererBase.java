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
package com.liferay.faces.alloy.component.colorpickerpopover;

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
public abstract class ColorPickerPopoverRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		ColorPickerPopover colorPickerPopover = (ColorPickerPopover) uiComponent;
		encodeHTML(facesContext, colorPickerPopover);
		encodeJavaScript(facesContext, colorPickerPopover);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ColorPickerPopover colorPickerPopover) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ColorPickerPopover colorPickerPopover) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", colorPickerPopover);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-colorpickerpopover',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var colorPickerPopover = new Y.ColorPickerPopover");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(colorPickerPopover.getAlign() != null)
		{

			responseWriter.write("align: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getAlign().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getColorpickerpopoverBodyContent() != null)
		{

			responseWriter.write("colorpickerpopoverBodyContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getColorpickerpopoverBodyContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getColor() != null)
		{

			responseWriter.write("color: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getColor().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getColorPalette() != null)
		{

			responseWriter.write("colorPalette: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getColorPalette().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getCssClass() != null)
		{

			responseWriter.write("cssClass: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getCssClass().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getCurrentTrigger() != null)
		{

			responseWriter.write("currentTrigger: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getCurrentTrigger().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getDefaultColor() != null)
		{

			responseWriter.write("defaultColor: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getDefaultColor().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getHsvPalette() != null)
		{

			responseWriter.write("hsvPalette: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getHsvPalette().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getRecentColors() != null)
		{

			responseWriter.write("recentColors: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getRecentColors().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getRenderColorPalette() != null)
		{

			responseWriter.write("renderColorPalette: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getRenderColorPalette().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getRenderHSVPalette() != null)
		{

			responseWriter.write("renderHSVPalette: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getRenderHSVPalette().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getStrings() != null)
		{

			responseWriter.write("strings: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getStrings().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getTrigger() != null)
		{

			responseWriter.write("trigger: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getTrigger().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getTriggerEvent() != null)
		{

			responseWriter.write("triggerEvent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getTriggerEvent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(colorPickerPopover.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(colorPickerPopover.getVisible().toString());
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