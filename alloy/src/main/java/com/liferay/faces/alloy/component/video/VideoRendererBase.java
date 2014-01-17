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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class VideoRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-video";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Video video = (Video) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var video = new A.Video");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, video);
		renderContentBox(renderedAttributes, video);
		renderCssClass(renderedAttributes, video);
		renderDestroyed(renderedAttributes, video);
		renderDisabled(renderedAttributes, video);
		renderFixedAttributes(renderedAttributes, video);
		renderFlashVars(renderedAttributes, video);
		renderFocused(renderedAttributes, video);
		renderHeight(renderedAttributes, video);
		renderHideClass(renderedAttributes, video);
		renderVideoId(renderedAttributes, video);
		renderInitialized(renderedAttributes, video);
		renderVideoLocale(renderedAttributes, video);
		renderOgvUrl(renderedAttributes, video);
		renderPoster(renderedAttributes, video);
		renderRender(renderedAttributes, video);
		renderRendered(renderedAttributes, video);
		renderSrcNode(renderedAttributes, video);
		renderStrings(renderedAttributes, video);
		renderSwfUrl(renderedAttributes, video);
		renderTabIndex(renderedAttributes, video);
		renderUrl(renderedAttributes, video);
		renderUseARIA(renderedAttributes, video);
		renderVisible(renderedAttributes, video);
		renderWidth(renderedAttributes, video);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String boundingBox = video.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Video.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String contentBox = video.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Video.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String cssClass = video.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(Video.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean destroyed = video.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Video.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean disabled = video.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Video.DISABLED, disabled));
		}
	}

	protected void renderFixedAttributes(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object fixedAttributes = video.getFixedAttributes();

		if (fixedAttributes != null) {
			renderedAttributes.add(renderObject(Video.FIXED_ATTRIBUTES, fixedAttributes));
		}
	}

	protected void renderFlashVars(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object flashVars = video.getFlashVars();

		if (flashVars != null) {
			renderedAttributes.add(renderObject(Video.FLASH_VARS, flashVars));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean focused = video.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Video.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object height = video.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Video.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String hideClass = video.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(Video.HIDE_CLASS, hideClass));
		}
	}

	protected void renderVideoId(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String videoId = video.getVideoId();

		if (videoId != null) {
			renderedAttributes.add(renderString(Video.VIDEO_ID, videoId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean initialized = video.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Video.INITIALIZED, initialized));
		}
	}

	protected void renderVideoLocale(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String videoLocale = video.getVideoLocale();

		if (videoLocale != null) {
			renderedAttributes.add(renderString(Video.VIDEO_LOCALE, videoLocale));
		}
	}

	protected void renderOgvUrl(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String ogvUrl = video.getOgvUrl();

		if (ogvUrl != null) {
			renderedAttributes.add(renderString(Video.OGV_URL, ogvUrl));
		}
	}

	protected void renderPoster(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String poster = video.getPoster();

		if (poster != null) {
			renderedAttributes.add(renderString(Video.POSTER, poster));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean render = video.getRender();

		if (render != null) {
			renderedAttributes.add(renderBoolean(Video.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean rendered = video.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Video.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String srcNode = video.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Video.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object strings = video.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Video.STRINGS, strings));
		}
	}

	protected void renderSwfUrl(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String swfUrl = video.getSwfUrl();

		if (swfUrl != null) {
			renderedAttributes.add(renderString(Video.SWF_URL, swfUrl));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object tabIndex = video.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Video.TAB_INDEX, tabIndex));
		}
	}

	protected void renderUrl(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String url = video.getUrl();

		if (url != null) {
			renderedAttributes.add(renderString(Video.URL, url));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean useARIA = video.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(Video.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean visible = video.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Video.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object width = video.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Video.WIDTH, width));
		}
	}

}