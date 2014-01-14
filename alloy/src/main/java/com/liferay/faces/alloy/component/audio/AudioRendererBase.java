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
package com.liferay.faces.alloy.component.audio;

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
public abstract class AudioRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-audio";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Audio audio = (Audio) uiComponent;
		encodeHTML(facesContext, audio);
		encodeJavaScript(facesContext, audio);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Audio audio) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Audio audio) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, audio);

		bufferedResponseWriter.write("var audio = new Y.Audio");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderCssClass(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFixedAttributes(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFlashVars(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideClass(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOggUrl(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSwfHeight(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSwfUrl(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSwfWidth(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUrl(bufferedResponseWriter, audio);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseARIA(bufferedResponseWriter, audio);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, audio);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCssClass(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderString(responseWriter, "cssClass", audio.getCssClass());
	}

	protected void renderFixedAttributes(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderObject(responseWriter, "fixedAttributes", audio.getFixedAttributes());
	}

	protected void renderFlashVars(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderObject(responseWriter, "flashVars", audio.getFlashVars());
	}

	protected void renderHideClass(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderString(responseWriter, "hideClass", audio.getHideClass());
	}

	protected void renderOggUrl(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderString(responseWriter, "oggUrl", audio.getOggUrl());
	}

	protected void renderRender(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderBoolean(responseWriter, "render", audio.getRender());
	}

	protected void renderSwfHeight(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderString(responseWriter, "swfHeight", audio.getSwfHeight());
	}

	protected void renderSwfUrl(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderString(responseWriter, "swfUrl", audio.getSwfUrl());
	}

	protected void renderSwfWidth(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderString(responseWriter, "swfWidth", audio.getSwfWidth());
	}

	protected void renderType(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderString(responseWriter, "type", audio.getType());
	}

	protected void renderUrl(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderString(responseWriter, "url", audio.getUrl());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, Audio audio) throws IOException {
		renderBoolean(responseWriter, "useARIA", audio.getUseARIA());
	}

}