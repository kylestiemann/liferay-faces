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
public abstract class HSVPaletteRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsv-palette";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		HSVPalette hSVPalette = (HSVPalette) uiComponent;
		encodeHTML(facesContext, hSVPalette);
		encodeJavaScript(facesContext, hSVPalette);
	}

	protected abstract void encodeHTML(FacesContext facesContext, HSVPalette hSVPalette) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, HSVPalette hSVPalette) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, hSVPalette);

		bufferedResponseWriter.write("var hSVPalette = new Y.HSVPalette");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderControls(responseWriter, hSVPalette);
		responseWriter.write(StringPool.COMMA);
		renderFieldValidator(responseWriter, hSVPalette);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, hSVPalette);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, hSVPalette);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, hSVPalette);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderControls(ResponseWriter responseWriter, HSVPalette hSVPalette) throws IOException {
		renderBoolean(responseWriter, "controls", hSVPalette.getControls());
	}

	protected void renderFieldValidator(ResponseWriter responseWriter, HSVPalette hSVPalette) throws IOException {
		renderObject(responseWriter, "fieldValidator", hSVPalette.getFieldValidator());
	}

	protected void renderSelected(ResponseWriter responseWriter, HSVPalette hSVPalette) throws IOException {
		renderString(responseWriter, "selected", hSVPalette.getSelected());
	}

	protected void renderStrings(ResponseWriter responseWriter, HSVPalette hSVPalette) throws IOException {
		renderObject(responseWriter, "strings", hSVPalette.getStrings());
	}

}