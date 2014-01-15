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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, video);

		bufferedResponseWriter.write("var video = new A.Video");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, video);
		renderContentBox(renrederedAttributes, video);
		renderCssClass(renrederedAttributes, video);
		renderDestroyed(renrederedAttributes, video);
		renderDisabled(renrederedAttributes, video);
		renderFixedAttributes(renrederedAttributes, video);
		renderFlashVars(renrederedAttributes, video);
		renderFocused(renrederedAttributes, video);
		renderHeight(renrederedAttributes, video);
		renderHideClass(renrederedAttributes, video);
		renderVideoId(renrederedAttributes, video);
		renderInitialized(renrederedAttributes, video);
		renderVideoLocale(renrederedAttributes, video);
		renderOgvUrl(renrederedAttributes, video);
		renderPoster(renrederedAttributes, video);
		renderRender(renrederedAttributes, video);
		renderRendered(renrederedAttributes, video);
		renderSrcNode(renrederedAttributes, video);
		renderStrings(renrederedAttributes, video);
		renderSwfUrl(renrederedAttributes, video);
		renderTabIndex(renrederedAttributes, video);
		renderUrl(renrederedAttributes, video);
		renderUseARIA(renrederedAttributes, video);
		renderVisible(renrederedAttributes, video);
		renderWidth(renrederedAttributes, video);

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

		endJavaScript(facesContext);

		handleBuffer(facesContext, video);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", video.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", video.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", video.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", video.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", video.getDisabled()));
		}
	}

	protected void renderFixedAttributes(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getFixedAttributes() != null) {
			renrederedAttributes.add(renderObject("fixedAttributes", video.getFixedAttributes()));
		}
	}

	protected void renderFlashVars(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getFlashVars() != null) {
			renrederedAttributes.add(renderObject("flashVars", video.getFlashVars()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", video.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getHeight() != null) {
			renrederedAttributes.add(renderString("height", video.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", video.getHideClass()));
		}
	}

	protected void renderVideoId(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getVideoId() != null) {
			renrederedAttributes.add(renderString("videoId", video.getVideoId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", video.getInitialized()));
		}
	}

	protected void renderVideoLocale(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getVideoLocale() != null) {
			renrederedAttributes.add(renderString("videoLocale", video.getVideoLocale()));
		}
	}

	protected void renderOgvUrl(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getOgvUrl() != null) {
			renrederedAttributes.add(renderString("ogvUrl", video.getOgvUrl()));
		}
	}

	protected void renderPoster(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getPoster() != null) {
			renrederedAttributes.add(renderString("poster", video.getPoster()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getRender() != null) {
			renrederedAttributes.add(renderBoolean("render", video.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", video.getRendered()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", video.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", video.getStrings()));
		}
	}

	protected void renderSwfUrl(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getSwfUrl() != null) {
			renrederedAttributes.add(renderString("swfUrl", video.getSwfUrl()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", video.getTabIndex()));
		}
	}

	protected void renderUrl(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getUrl() != null) {
			renrederedAttributes.add(renderString("url", video.getUrl()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", video.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", video.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Video video) throws IOException {
		if (video.getWidth() != null) {
			renrederedAttributes.add(renderString("width", video.getWidth()));
		}
	}

}