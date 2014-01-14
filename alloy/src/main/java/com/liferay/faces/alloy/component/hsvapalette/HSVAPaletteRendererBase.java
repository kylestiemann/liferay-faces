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
public abstract class HSVAPaletteRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsva-palette";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		HSVAPalette hSVAPalette = (HSVAPalette) uiComponent;
		encodeHTML(facesContext, hSVAPalette);
		encodeJavaScript(facesContext, hSVAPalette);
	}

	protected abstract void encodeHTML(FacesContext facesContext, HSVAPalette hSVAPalette) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, HSVAPalette hSVAPalette) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, hSVAPalette);

		bufferedResponseWriter.write("var hSVAPalette = new Y.HSVAPalette");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderControls(bufferedResponseWriter, hSVAPalette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFieldValidator(bufferedResponseWriter, hSVAPalette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, hSVAPalette);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, hSVAPalette);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, hSVAPalette);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderControls(ResponseWriter responseWriter, HSVAPalette hSVAPalette) throws IOException {
		renderBoolean(responseWriter, "controls", hSVAPalette.getControls());
	}

	protected void renderFieldValidator(ResponseWriter responseWriter, HSVAPalette hSVAPalette) throws IOException {
		renderObject(responseWriter, "fieldValidator", hSVAPalette.getFieldValidator());
	}

	protected void renderSelected(ResponseWriter responseWriter, HSVAPalette hSVAPalette) throws IOException {
		renderString(responseWriter, "selected", hSVAPalette.getSelected());
	}

	protected void renderStrings(ResponseWriter responseWriter, HSVAPalette hSVAPalette) throws IOException {
		renderObject(responseWriter, "strings", hSVAPalette.getStrings());
	}

}