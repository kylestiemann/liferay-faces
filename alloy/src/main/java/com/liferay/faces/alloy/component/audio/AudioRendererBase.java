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
public abstract class AudioRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-audio";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Audio audio = (Audio) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var audio = new A.Audio");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, audio);
		renderContentBox(renderedAttributes, audio);
		renderCssClass(renderedAttributes, audio);
		renderDestroyed(renderedAttributes, audio);
		renderDisabled(renderedAttributes, audio);
		renderFixedAttributes(renderedAttributes, audio);
		renderFlashVars(renderedAttributes, audio);
		renderFocused(renderedAttributes, audio);
		renderHeight(renderedAttributes, audio);
		renderHideClass(renderedAttributes, audio);
		renderAudioId(renderedAttributes, audio);
		renderInitialized(renderedAttributes, audio);
		renderAudioLocale(renderedAttributes, audio);
		renderOggUrl(renderedAttributes, audio);
		renderRender(renderedAttributes, audio);
		renderRendered(renderedAttributes, audio);
		renderSrcNode(renderedAttributes, audio);
		renderStrings(renderedAttributes, audio);
		renderSwfHeight(renderedAttributes, audio);
		renderSwfUrl(renderedAttributes, audio);
		renderSwfWidth(renderedAttributes, audio);
		renderTabIndex(renderedAttributes, audio);
		renderType(renderedAttributes, audio);
		renderUrl(renderedAttributes, audio);
		renderUseARIA(renderedAttributes, audio);
		renderVisible(renderedAttributes, audio);
		renderWidth(renderedAttributes, audio);

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

	protected void renderBoundingBox(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String boundingBox = audio.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Audio.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String contentBox = audio.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Audio.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String cssClass = audio.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(Audio.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean destroyed = audio.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Audio.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean disabled = audio.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Audio.DISABLED, disabled));
		}
	}

	protected void renderFixedAttributes(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object fixedAttributes = audio.getFixedAttributes();

		if (fixedAttributes != null) {
			renderedAttributes.add(renderObject(Audio.FIXED_ATTRIBUTES, fixedAttributes));
		}
	}

	protected void renderFlashVars(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object flashVars = audio.getFlashVars();

		if (flashVars != null) {
			renderedAttributes.add(renderObject(Audio.FLASH_VARS, flashVars));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean focused = audio.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Audio.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object height = audio.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Audio.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String hideClass = audio.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(Audio.HIDE_CLASS, hideClass));
		}
	}

	protected void renderAudioId(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String audioId = audio.getAudioId();

		if (audioId != null) {
			renderedAttributes.add(renderString(Audio.AUDIO_ID, audioId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean initialized = audio.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Audio.INITIALIZED, initialized));
		}
	}

	protected void renderAudioLocale(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String audioLocale = audio.getAudioLocale();

		if (audioLocale != null) {
			renderedAttributes.add(renderString(Audio.AUDIO_LOCALE, audioLocale));
		}
	}

	protected void renderOggUrl(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String oggUrl = audio.getOggUrl();

		if (oggUrl != null) {
			renderedAttributes.add(renderString(Audio.OGG_URL, oggUrl));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean render = audio.getRender();

		if (render != null) {
			renderedAttributes.add(renderBoolean(Audio.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean rendered = audio.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Audio.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String srcNode = audio.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Audio.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object strings = audio.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Audio.STRINGS, strings));
		}
	}

	protected void renderSwfHeight(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String swfHeight = audio.getSwfHeight();

		if (swfHeight != null) {
			renderedAttributes.add(renderString(Audio.SWF_HEIGHT, swfHeight));
		}
	}

	protected void renderSwfUrl(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String swfUrl = audio.getSwfUrl();

		if (swfUrl != null) {
			renderedAttributes.add(renderString(Audio.SWF_URL, swfUrl));
		}
	}

	protected void renderSwfWidth(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String swfWidth = audio.getSwfWidth();

		if (swfWidth != null) {
			renderedAttributes.add(renderString(Audio.SWF_WIDTH, swfWidth));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object tabIndex = audio.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Audio.TAB_INDEX, tabIndex));
		}
	}

	protected void renderType(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String type = audio.getType();

		if (type != null) {
			renderedAttributes.add(renderString(Audio.TYPE, type));
		}
	}

	protected void renderUrl(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String url = audio.getUrl();

		if (url != null) {
			renderedAttributes.add(renderString(Audio.URL, url));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean useARIA = audio.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(Audio.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean visible = audio.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Audio.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object width = audio.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Audio.WIDTH, width));
		}
	}

}