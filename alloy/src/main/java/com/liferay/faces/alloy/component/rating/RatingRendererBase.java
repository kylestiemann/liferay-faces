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
package com.liferay.faces.alloy.component.rating;

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
public abstract class RatingRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-rating";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Rating rating = (Rating) uiComponent;
		encodeHTML(facesContext, rating);
		encodeJavaScript(facesContext, rating);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Rating rating) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Rating rating) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, rating);

		bufferedResponseWriter.write("var rating = new Y.Rating");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderCanReset(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClass(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClasses(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDefaultSelected(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderElements(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHiddenInput(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideClass(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInputName(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelNode(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelectedIndex(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowTitle(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSize(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTitle(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseARIA(bufferedResponseWriter, rating);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRatingValue(bufferedResponseWriter, rating);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, rating);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCanReset(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderBoolean(responseWriter, "canReset", rating.getCanReset());
	}

	protected void renderCssClass(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "cssClass", rating.getCssClass());
	}

	protected void renderCssClasses(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderObject(responseWriter, "cssClasses", rating.getCssClasses());
	}

	protected void renderDefaultSelected(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderNumber(responseWriter, "defaultSelected", rating.getDefaultSelected());
	}

	protected void renderDisabled(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderBoolean(responseWriter, "disabled", rating.getDisabled());
	}

	protected void renderElements(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "elements", rating.getElements());
	}

	protected void renderHiddenInput(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "hiddenInput", rating.getHiddenInput());
	}

	protected void renderHideClass(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "hideClass", rating.getHideClass());
	}

	protected void renderInputName(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "inputName", rating.getInputName());
	}

	protected void renderLabel(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "label", rating.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "labelNode", rating.getLabelNode());
	}

	protected void renderRender(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "render", rating.getRender());
	}

	protected void renderSelectedIndex(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderNumber(responseWriter, "selectedIndex", rating.getSelectedIndex());
	}

	protected void renderShowTitle(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderBoolean(responseWriter, "showTitle", rating.getShowTitle());
	}

	protected void renderSize(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderNumber(responseWriter, "size", rating.getSize());
	}

	protected void renderTitle(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "title", rating.getTitle());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderBoolean(responseWriter, "useARIA", rating.getUseARIA());
	}

	protected void renderRatingValue(ResponseWriter responseWriter, Rating rating) throws IOException {
		renderString(responseWriter, "ratingValue", rating.getRatingValue());
	}

}