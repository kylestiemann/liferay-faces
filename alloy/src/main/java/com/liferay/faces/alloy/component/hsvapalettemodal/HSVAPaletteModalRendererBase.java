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
	private static final String AUI_MODULE_NAME = "aui-hsv-palette-modal";

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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, hSVAPaletteModal);

		bufferedResponseWriter.write("var hSVAPaletteModal = new Y.HSVAPaletteModal");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderHsvapalettemodalBodyContent(bufferedResponseWriter, hSVAPaletteModal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDestroyOnHide(bufferedResponseWriter, hSVAPaletteModal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDraggable(bufferedResponseWriter, hSVAPaletteModal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHsv(bufferedResponseWriter, hSVAPaletteModal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderResizable(bufferedResponseWriter, hSVAPaletteModal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, hSVAPaletteModal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToolbars(bufferedResponseWriter, hSVAPaletteModal);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, hSVAPaletteModal);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderHsvapalettemodalBodyContent(ResponseWriter responseWriter, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		renderString(responseWriter, "hsvapalettemodalBodyContent", hSVAPaletteModal.getHsvapalettemodalBodyContent());
	}

	protected void renderDestroyOnHide(ResponseWriter responseWriter, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		renderBoolean(responseWriter, "destroyOnHide", hSVAPaletteModal.getDestroyOnHide());
	}

	protected void renderDraggable(ResponseWriter responseWriter, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		renderObject(responseWriter, "draggable", hSVAPaletteModal.getDraggable());
	}

	protected void renderHsv(ResponseWriter responseWriter, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		renderObject(responseWriter, "hsv", hSVAPaletteModal.getHsv());
	}

	protected void renderResizable(ResponseWriter responseWriter, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		renderObject(responseWriter, "resizable", hSVAPaletteModal.getResizable());
	}

	protected void renderSelected(ResponseWriter responseWriter, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		renderString(responseWriter, "selected", hSVAPaletteModal.getSelected());
	}

	protected void renderToolbars(ResponseWriter responseWriter, HSVAPaletteModal hSVAPaletteModal) throws IOException {
		renderString(responseWriter, "toolbars", hSVAPaletteModal.getToolbars());
	}

}