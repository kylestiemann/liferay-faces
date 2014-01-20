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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
public abstract class MediaViewerPluginRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-media-viewer-plugin";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		MediaViewerPlugin mediaViewerPlugin = (MediaViewerPlugin) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var mediaViewerPlugin = new A.MediaViewerPlugin");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderDestroyed(renderedAttributes, mediaViewerPlugin);
		renderHost(renderedAttributes, mediaViewerPlugin);
		renderInitialized(renderedAttributes, mediaViewerPlugin);
		renderProviders(renderedAttributes, mediaViewerPlugin);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterDestroyedChange(renderedAfterEvents, mediaViewerPlugin);
		renderAfterHostChange(renderedAfterEvents, mediaViewerPlugin);
		renderAfterInitializedChange(renderedAfterEvents, mediaViewerPlugin);
		renderAfterProvidersChange(renderedAfterEvents, mediaViewerPlugin);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnDestroyedChange(renderedOnEvents, mediaViewerPlugin);
		renderOnHostChange(renderedOnEvents, mediaViewerPlugin);
		renderOnInitializedChange(renderedOnEvents, mediaViewerPlugin);
		renderOnProvidersChange(renderedOnEvents, mediaViewerPlugin);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDestroyed(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.Boolean destroyed = mediaViewerPlugin.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(MediaViewerPlugin.DESTROYED, destroyed));
		}
	}

	protected void renderHost(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.Object host = mediaViewerPlugin.getHost();

		if (host != null) {
			renderedAttributes.add(renderString(MediaViewerPlugin.HOST, host));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.Boolean initialized = mediaViewerPlugin.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(MediaViewerPlugin.INITIALIZED, initialized));
		}
	}

	protected void renderProviders(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.Object providers = mediaViewerPlugin.getProviders();

		if (providers != null) {
			renderedAttributes.add(renderObject(MediaViewerPlugin.PROVIDERS, providers));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.String afterDestroyedChange = mediaViewerPlugin.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(MediaViewerPlugin.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterHostChange(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.String afterHostChange = mediaViewerPlugin.getAfterHostChange();

		if (afterHostChange != null) {
			renderedAttributes.add(renderString(MediaViewerPlugin.AFTER_HOST_CHANGE, afterHostChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.String afterInitializedChange = mediaViewerPlugin.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(MediaViewerPlugin.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterProvidersChange(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.String afterProvidersChange = mediaViewerPlugin.getAfterProvidersChange();

		if (afterProvidersChange != null) {
			renderedAttributes.add(renderString(MediaViewerPlugin.AFTER_PROVIDERS_CHANGE, afterProvidersChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.String onDestroyedChange = mediaViewerPlugin.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(MediaViewerPlugin.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnHostChange(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.String onHostChange = mediaViewerPlugin.getOnHostChange();

		if (onHostChange != null) {
			renderedAttributes.add(renderString(MediaViewerPlugin.ON_HOST_CHANGE, onHostChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.String onInitializedChange = mediaViewerPlugin.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(MediaViewerPlugin.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnProvidersChange(List<String> renderedAttributes, MediaViewerPlugin mediaViewerPlugin) throws IOException {
		java.lang.String onProvidersChange = mediaViewerPlugin.getOnProvidersChange();

		if (onProvidersChange != null) {
			renderedAttributes.add(renderString(MediaViewerPlugin.ON_PROVIDERS_CHANGE, onProvidersChange));
		}
	}

}