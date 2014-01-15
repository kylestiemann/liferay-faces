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
public abstract class MediaViewerPluginRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-media-viewer-plugin";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		MediaViewerPlugin mediaViewerPlugin = (MediaViewerPlugin) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var mediaViewerPlugin = new A.MediaViewerPlugin");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderDestroyed(renrederedAttributes, mediaViewerPlugin);
		renderHost(renrederedAttributes, mediaViewerPlugin);
		renderInitialized(renrederedAttributes, mediaViewerPlugin);
		renderProviders(renrederedAttributes, mediaViewerPlugin);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		if (mediaViewerPlugin.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", mediaViewerPlugin.getDestroyed()));
		}
	}

	protected void renderHost(ArrayList<String> renrederedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		if (mediaViewerPlugin.getHost() != null) {
			renrederedAttributes.add(renderString("host", mediaViewerPlugin.getHost()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		if (mediaViewerPlugin.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", mediaViewerPlugin.getInitialized()));
		}
	}

	protected void renderProviders(ArrayList<String> renrederedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		if (mediaViewerPlugin.getProviders() != null) {
			renrederedAttributes.add(renderObject("providers", mediaViewerPlugin.getProviders()));
		}
	}

}