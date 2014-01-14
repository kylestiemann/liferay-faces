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
package com.liferay.faces.alloy.component.hsvapalettemodal;

import java.io.IOException;

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
public abstract class HSVAPaletteModalRendererBase extends AUIRenderer {

	// Private Constants
	private static final String  AUI_HSV_PALETTE_MODAL = "aui-hsv-palette-modal";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		HSVAPaletteModal hSVAPaletteModal = (HSVAPaletteModal) uiComponent;
		encodeHTML(facesContext, hSVAPaletteModal);
		encodeJavaScript(facesContext, hSVAPaletteModal);
	}

	protected abstract void encodeHTML(FacesContext facesContext, HSVAPaletteModal hSVAPaletteModal) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, HSVAPaletteModal hSVAPaletteModal) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, hSVAPaletteModal, AUI_HSV_PALETTE_MODAL);

		bufferedResponseWriter.write("var hSVAPaletteModal = new Y.HSVAPaletteModal");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);

		if(hSVAPaletteModal.getHsvapalettemodalBodyContent() != null)
		{

			bufferedResponseWriter.write("hsvapalettemodalBodyContent: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(hSVAPaletteModal.getHsvapalettemodalBodyContent().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(hSVAPaletteModal.getDestroyOnHide() != null)
		{

			bufferedResponseWriter.write("destroyOnHide: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(hSVAPaletteModal.getDestroyOnHide().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(hSVAPaletteModal.getDraggable() != null)
		{

			bufferedResponseWriter.write("draggable: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(hSVAPaletteModal.getDraggable().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(hSVAPaletteModal.getHsv() != null)
		{

			bufferedResponseWriter.write("hsv: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(hSVAPaletteModal.getHsv().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(hSVAPaletteModal.getResizable() != null)
		{

			bufferedResponseWriter.write("resizable: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(hSVAPaletteModal.getResizable().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(hSVAPaletteModal.getSelected() != null)
		{

			bufferedResponseWriter.write("selected: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(hSVAPaletteModal.getSelected().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		if(hSVAPaletteModal.getToolbars() != null)
		{

			bufferedResponseWriter.write("toolbars: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(hSVAPaletteModal.getToolbars().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);
		
		endJavaScript(facesContext);
		
		handleBuffer(facesContext, hSVAPaletteModal, AUI_HSV_PALETTE_MODAL);
		
		facesContext.setResponseWriter(backupResponseWriter);
	}

}