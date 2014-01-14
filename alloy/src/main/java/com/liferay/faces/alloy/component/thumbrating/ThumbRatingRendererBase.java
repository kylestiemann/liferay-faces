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
package com.liferay.faces.alloy.component.thumbrating;

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
public abstract class ThumbRatingRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-rating";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ThumbRating thumbRating = (ThumbRating) uiComponent;
		encodeHTML(facesContext, thumbRating);
		encodeJavaScript(facesContext, thumbRating);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ThumbRating thumbRating) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ThumbRating thumbRating) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, thumbRating);

		bufferedResponseWriter.write("var thumbRating = new Y.ThumbRating");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderCanReset(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderCssClasses(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderDefaultSelected(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderElements(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderHiddenInput(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderInputName(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderLabelNode(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderSelectedIndex(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderShowTitle(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderSize(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderTitle(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, thumbRating);
		responseWriter.write(StringPool.COMMA);
		renderThumbratingValue(responseWriter, thumbRating);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, thumbRating);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCanReset(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderBoolean(responseWriter, "canReset", thumbRating.getCanReset());
	}

	protected void renderCssClass(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "cssClass", thumbRating.getCssClass());
	}

	protected void renderCssClasses(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderObject(responseWriter, "cssClasses", thumbRating.getCssClasses());
	}

	protected void renderDefaultSelected(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderNumber(responseWriter, "defaultSelected", thumbRating.getDefaultSelected());
	}

	protected void renderDisabled(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderBoolean(responseWriter, "disabled", thumbRating.getDisabled());
	}

	protected void renderElements(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "elements", thumbRating.getElements());
	}

	protected void renderHiddenInput(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "hiddenInput", thumbRating.getHiddenInput());
	}

	protected void renderHideClass(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "hideClass", thumbRating.getHideClass());
	}

	protected void renderInputName(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "inputName", thumbRating.getInputName());
	}

	protected void renderLabel(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "label", thumbRating.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "labelNode", thumbRating.getLabelNode());
	}

	protected void renderRender(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "render", thumbRating.getRender());
	}

	protected void renderSelectedIndex(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderNumber(responseWriter, "selectedIndex", thumbRating.getSelectedIndex());
	}

	protected void renderShowTitle(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderBoolean(responseWriter, "showTitle", thumbRating.getShowTitle());
	}

	protected void renderSize(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderNumber(responseWriter, "size", thumbRating.getSize());
	}

	protected void renderTitle(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "title", thumbRating.getTitle());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderBoolean(responseWriter, "useARIA", thumbRating.getUseARIA());
	}

	protected void renderThumbratingValue(ResponseWriter responseWriter, ThumbRating thumbRating) throws IOException {
		renderString(responseWriter, "thumbratingValue", thumbRating.getThumbratingValue());
	}

}