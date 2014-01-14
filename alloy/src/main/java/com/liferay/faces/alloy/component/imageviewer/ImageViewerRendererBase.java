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
package com.liferay.faces.alloy.component.imageviewer;

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
public abstract class ImageViewerRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-image-viewer-base";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ImageViewer imageViewer = (ImageViewer) uiComponent;
		encodeHTML(facesContext, imageViewer);
		encodeJavaScript(facesContext, imageViewer);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ImageViewer imageViewer) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ImageViewer imageViewer) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, imageViewer);

		bufferedResponseWriter.write("var imageViewer = new Y.ImageViewer");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAnim(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderImageviewerBodyContent(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCaption(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCaptionEl(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCaptionFromTitle(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCentered(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCloseEl(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlLeftEl(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlRightEl(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCurrentIndex(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderImage(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderImageAnim(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInfoEl(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInfoTemplate(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLinks(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoader(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoading(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoadingEl(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMaxHeight(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMaxWidth(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderModal(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPreloadAllImages(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowClose(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowControls(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTotalLinks(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, imageViewer);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, imageViewer);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, imageViewer);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAnim(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "anim", imageViewer.getAnim());
	}

	protected void renderImageviewerBodyContent(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "imageviewerBodyContent", imageViewer.getImageviewerBodyContent());
	}

	protected void renderCaption(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "caption", imageViewer.getCaption());
	}

	protected void renderCaptionEl(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "captionEl", imageViewer.getCaptionEl());
	}

	protected void renderCaptionFromTitle(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "captionFromTitle", imageViewer.getCaptionFromTitle());
	}

	protected void renderCentered(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "centered", imageViewer.getCentered());
	}

	protected void renderCloseEl(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "closeEl", imageViewer.getCloseEl());
	}

	protected void renderControlLeftEl(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "controlLeftEl", imageViewer.getControlLeftEl());
	}

	protected void renderControlRightEl(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "controlRightEl", imageViewer.getControlRightEl());
	}

	protected void renderCurrentIndex(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderNumber(responseWriter, "currentIndex", imageViewer.getCurrentIndex());
	}

	protected void renderImage(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "image", imageViewer.getImage());
	}

	protected void renderImageAnim(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderObject(responseWriter, "imageAnim", imageViewer.getImageAnim());
	}

	protected void renderInfoEl(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "infoEl", imageViewer.getInfoEl());
	}

	protected void renderInfoTemplate(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "infoTemplate", imageViewer.getInfoTemplate());
	}

	protected void renderLinks(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "links", imageViewer.getLinks());
	}

	protected void renderLoader(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "loader", imageViewer.getLoader());
	}

	protected void renderLoading(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "loading", imageViewer.getLoading());
	}

	protected void renderLoadingEl(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderString(responseWriter, "loadingEl", imageViewer.getLoadingEl());
	}

	protected void renderMaxHeight(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderNumber(responseWriter, "maxHeight", imageViewer.getMaxHeight());
	}

	protected void renderMaxWidth(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderNumber(responseWriter, "maxWidth", imageViewer.getMaxWidth());
	}

	protected void renderModal(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "modal", imageViewer.getModal());
	}

	protected void renderPreloadAllImages(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "preloadAllImages", imageViewer.getPreloadAllImages());
	}

	protected void renderShowClose(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "showClose", imageViewer.getShowClose());
	}

	protected void renderShowControls(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "showControls", imageViewer.getShowControls());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderNumber(responseWriter, "tabIndex", imageViewer.getTabIndex());
	}

	protected void renderTotalLinks(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "totalLinks", imageViewer.getTotalLinks());
	}

	protected void renderVisible(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderBoolean(responseWriter, "visible", imageViewer.getVisible());
	}

	protected void renderZIndex(ResponseWriter responseWriter, ImageViewer imageViewer) throws IOException {
		renderNumber(responseWriter, "zIndex", imageViewer.getZIndex());
	}

}