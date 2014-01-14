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
package com.liferay.faces.alloy.component.video;

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
public abstract class VideoRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-video";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Video video = (Video) uiComponent;
		encodeHTML(facesContext, video);
		encodeJavaScript(facesContext, video);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Video video) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Video video) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, video);

		bufferedResponseWriter.write("var video = new Y.Video");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderCssClass(responseWriter, video);
		responseWriter.write(StringPool.COMMA);
		renderFixedAttributes(responseWriter, video);
		responseWriter.write(StringPool.COMMA);
		renderFlashVars(responseWriter, video);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, video);
		responseWriter.write(StringPool.COMMA);
		renderOgvUrl(responseWriter, video);
		responseWriter.write(StringPool.COMMA);
		renderPoster(responseWriter, video);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, video);
		responseWriter.write(StringPool.COMMA);
		renderSwfUrl(responseWriter, video);
		responseWriter.write(StringPool.COMMA);
		renderUrl(responseWriter, video);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, video);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, video);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCssClass(ResponseWriter responseWriter, Video video) throws IOException {
		renderString(responseWriter, "cssClass", video.getCssClass());
	}

	protected void renderFixedAttributes(ResponseWriter responseWriter, Video video) throws IOException {
		renderObject(responseWriter, "fixedAttributes", video.getFixedAttributes());
	}

	protected void renderFlashVars(ResponseWriter responseWriter, Video video) throws IOException {
		renderObject(responseWriter, "flashVars", video.getFlashVars());
	}

	protected void renderHideClass(ResponseWriter responseWriter, Video video) throws IOException {
		renderString(responseWriter, "hideClass", video.getHideClass());
	}

	protected void renderOgvUrl(ResponseWriter responseWriter, Video video) throws IOException {
		renderString(responseWriter, "ogvUrl", video.getOgvUrl());
	}

	protected void renderPoster(ResponseWriter responseWriter, Video video) throws IOException {
		renderString(responseWriter, "poster", video.getPoster());
	}

	protected void renderRender(ResponseWriter responseWriter, Video video) throws IOException {
		renderBoolean(responseWriter, "render", video.getRender());
	}

	protected void renderSwfUrl(ResponseWriter responseWriter, Video video) throws IOException {
		renderString(responseWriter, "swfUrl", video.getSwfUrl());
	}

	protected void renderUrl(ResponseWriter responseWriter, Video video) throws IOException {
		renderString(responseWriter, "url", video.getUrl());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, Video video) throws IOException {
		renderBoolean(responseWriter, "useARIA", video.getUseARIA());
	}

}