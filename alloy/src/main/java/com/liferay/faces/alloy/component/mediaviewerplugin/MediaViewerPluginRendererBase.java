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
package com.liferay.faces.alloy.component.mediaviewerplugin;

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
public abstract class MediaViewerPluginRendererBase extends AUIRenderer {

	// Private Constants
	private static final String  AUI_MEDIA_VIEWER_PLUGIN = "aui-media-viewer-plugin";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		MediaViewerPlugin mediaViewerPlugin = (MediaViewerPlugin) uiComponent;
		encodeHTML(facesContext, mediaViewerPlugin);
		encodeJavaScript(facesContext, mediaViewerPlugin);
	}

	protected abstract void encodeHTML(FacesContext facesContext, MediaViewerPlugin mediaViewerPlugin) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, MediaViewerPlugin mediaViewerPlugin) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();
		
		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, mediaViewerPlugin, AUI_MEDIA_VIEWER_PLUGIN);

		bufferedResponseWriter.write("var mediaViewerPlugin = new Y.MediaViewerPlugin");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.NEW_LINE);

		if(mediaViewerPlugin.getProviders() != null)
		{

			bufferedResponseWriter.write("providers: ");
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(mediaViewerPlugin.getProviders().toString());
			bufferedResponseWriter.write(StringPool.APOSTROPHE);
			bufferedResponseWriter.write(StringPool.COMMA);
			bufferedResponseWriter.write(StringPool.NEW_LINE);
		}

		bufferedResponseWriter.write(StringPool.NEW_LINE);
		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);
		
		endJavaScript(facesContext);
		
		handleBuffer(facesContext, mediaViewerPlugin, AUI_MEDIA_VIEWER_PLUGIN);
		
		facesContext.setResponseWriter(backupResponseWriter);
	}

}