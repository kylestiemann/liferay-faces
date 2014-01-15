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
public abstract class AudioRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-audio";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		Audio audio = (Audio) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var audio = new A.Audio");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, audio);
		renderContentBox(renrederedAttributes, audio);
		renderCssClass(renrederedAttributes, audio);
		renderDestroyed(renrederedAttributes, audio);
		renderDisabled(renrederedAttributes, audio);
		renderFixedAttributes(renrederedAttributes, audio);
		renderFlashVars(renrederedAttributes, audio);
		renderFocused(renrederedAttributes, audio);
		renderHeight(renrederedAttributes, audio);
		renderHideClass(renrederedAttributes, audio);
		renderAudioId(renrederedAttributes, audio);
		renderInitialized(renrederedAttributes, audio);
		renderAudioLocale(renrederedAttributes, audio);
		renderOggUrl(renrederedAttributes, audio);
		renderRender(renrederedAttributes, audio);
		renderRendered(renrederedAttributes, audio);
		renderSrcNode(renrederedAttributes, audio);
		renderStrings(renrederedAttributes, audio);
		renderSwfHeight(renrederedAttributes, audio);
		renderSwfUrl(renrederedAttributes, audio);
		renderSwfWidth(renrederedAttributes, audio);
		renderTabIndex(renrederedAttributes, audio);
		renderType(renrederedAttributes, audio);
		renderUrl(renrederedAttributes, audio);
		renderUseARIA(renrederedAttributes, audio);
		renderVisible(renrederedAttributes, audio);
		renderWidth(renrederedAttributes, audio);

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

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", audio.getBoundingBox()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", audio.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", audio.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", audio.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", audio.getDisabled()));
		}
	}

	protected void renderFixedAttributes(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getFixedAttributes() != null) {
			renrederedAttributes.add(renderObject("fixedAttributes", audio.getFixedAttributes()));
		}
	}

	protected void renderFlashVars(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getFlashVars() != null) {
			renrederedAttributes.add(renderObject("flashVars", audio.getFlashVars()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", audio.getFocused()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getHeight() != null) {
			renrederedAttributes.add(renderString("height", audio.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", audio.getHideClass()));
		}
	}

	protected void renderAudioId(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getAudioId() != null) {
			renrederedAttributes.add(renderString("audioId", audio.getAudioId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", audio.getInitialized()));
		}
	}

	protected void renderAudioLocale(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getAudioLocale() != null) {
			renrederedAttributes.add(renderString("audioLocale", audio.getAudioLocale()));
		}
	}

	protected void renderOggUrl(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getOggUrl() != null) {
			renrederedAttributes.add(renderString("oggUrl", audio.getOggUrl()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getRender() != null) {
			renrederedAttributes.add(renderBoolean("render", audio.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", audio.getRendered()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", audio.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", audio.getStrings()));
		}
	}

	protected void renderSwfHeight(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getSwfHeight() != null) {
			renrederedAttributes.add(renderString("swfHeight", audio.getSwfHeight()));
		}
	}

	protected void renderSwfUrl(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getSwfUrl() != null) {
			renrederedAttributes.add(renderString("swfUrl", audio.getSwfUrl()));
		}
	}

	protected void renderSwfWidth(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getSwfWidth() != null) {
			renrederedAttributes.add(renderString("swfWidth", audio.getSwfWidth()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", audio.getTabIndex()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getType() != null) {
			renrederedAttributes.add(renderString("type", audio.getType()));
		}
	}

	protected void renderUrl(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getUrl() != null) {
			renrederedAttributes.add(renderString("url", audio.getUrl()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", audio.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", audio.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Audio audio) throws IOException {
		if (audio.getWidth() != null) {
			renrederedAttributes.add(renderString("width", audio.getWidth()));
		}
	}

}