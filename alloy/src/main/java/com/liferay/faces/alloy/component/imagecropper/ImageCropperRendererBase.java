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
package com.liferay.faces.alloy.component.imagecropper;

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
public abstract class ImageCropperRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-image-cropper";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ImageCropper imageCropper = (ImageCropper) uiComponent;
		encodeHTML(facesContext, imageCropper);
		encodeJavaScript(facesContext, imageCropper);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ImageCropper imageCropper) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ImageCropper imageCropper) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, imageCropper);

		bufferedResponseWriter.write("var imageCropper = new Y.ImageCropper");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderCropHeight(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderCropWidth(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderMinHeight(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderMinWidth(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderMovable(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderPreserveRatio(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderRegion(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderResizable(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderX(responseWriter, imageCropper);
		responseWriter.write(StringPool.COMMA);
		renderY(responseWriter, imageCropper);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, imageCropper);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCropHeight(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderNumber(responseWriter, "cropHeight", imageCropper.getCropHeight());
	}

	protected void renderCropWidth(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderNumber(responseWriter, "cropWidth", imageCropper.getCropWidth());
	}

	protected void renderCssClass(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderString(responseWriter, "cssClass", imageCropper.getCssClass());
	}

	protected void renderHideClass(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderString(responseWriter, "hideClass", imageCropper.getHideClass());
	}

	protected void renderMinHeight(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderNumber(responseWriter, "minHeight", imageCropper.getMinHeight());
	}

	protected void renderMinWidth(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderNumber(responseWriter, "minWidth", imageCropper.getMinWidth());
	}

	protected void renderMovable(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderBoolean(responseWriter, "movable", imageCropper.getMovable());
	}

	protected void renderPreserveRatio(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderBoolean(responseWriter, "preserveRatio", imageCropper.getPreserveRatio());
	}

	protected void renderRegion(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderObject(responseWriter, "region", imageCropper.getRegion());
	}

	protected void renderRender(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderString(responseWriter, "render", imageCropper.getRender());
	}

	protected void renderResizable(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderBoolean(responseWriter, "resizable", imageCropper.getResizable());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderBoolean(responseWriter, "useARIA", imageCropper.getUseARIA());
	}

	protected void renderX(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderNumber(responseWriter, "x", imageCropper.getX());
	}

	protected void renderY(ResponseWriter responseWriter, ImageCropper imageCropper) throws IOException {
		renderNumber(responseWriter, "y", imageCropper.getY());
	}

}