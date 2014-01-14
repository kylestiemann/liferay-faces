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
package com.liferay.faces.alloy.component.imagegallery;

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
public abstract class ImageGalleryRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-image-viewer-gallery";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ImageGallery imageGallery = (ImageGallery) uiComponent;
		encodeHTML(facesContext, imageGallery);
		encodeJavaScript(facesContext, imageGallery);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ImageGallery imageGallery) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ImageGallery imageGallery) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, imageGallery);

		bufferedResponseWriter.write("var imageGallery = new Y.ImageGallery");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAnim(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderAutoPlay(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderImagegalleryBodyContent(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCaption(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCaptionEl(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCaptionFromTitle(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCentered(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCloseEl(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlLeftEl(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlRightEl(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCurrentIndex(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDelay(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderImage(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderImageAnim(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInfoEl(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderInfoTemplate(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLinks(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoader(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoading(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoadingEl(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMaxHeight(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMaxWidth(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderModal(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPagination(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPaginationEl(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPaginationInstance(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPaused(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPausedLabel(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPlaying(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPlayingLabel(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPreloadAllImages(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRepeat(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowClose(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowControls(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowPlayer(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToolbar(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTotalLinks(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseOriginalImage(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderVisible(bufferedResponseWriter, imageGallery);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, imageGallery);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, imageGallery);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAnim(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "anim", imageGallery.getAnim());
	}

	protected void renderAutoPlay(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "autoPlay", imageGallery.getAutoPlay());
	}

	protected void renderImagegalleryBodyContent(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "imagegalleryBodyContent", imageGallery.getImagegalleryBodyContent());
	}

	protected void renderCaption(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "caption", imageGallery.getCaption());
	}

	protected void renderCaptionEl(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "captionEl", imageGallery.getCaptionEl());
	}

	protected void renderCaptionFromTitle(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "captionFromTitle", imageGallery.getCaptionFromTitle());
	}

	protected void renderCentered(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "centered", imageGallery.getCentered());
	}

	protected void renderCloseEl(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "closeEl", imageGallery.getCloseEl());
	}

	protected void renderControlLeftEl(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "controlLeftEl", imageGallery.getControlLeftEl());
	}

	protected void renderControlRightEl(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "controlRightEl", imageGallery.getControlRightEl());
	}

	protected void renderCurrentIndex(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderNumber(responseWriter, "currentIndex", imageGallery.getCurrentIndex());
	}

	protected void renderDelay(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderNumber(responseWriter, "delay", imageGallery.getDelay());
	}

	protected void renderImage(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "image", imageGallery.getImage());
	}

	protected void renderImageAnim(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderObject(responseWriter, "imageAnim", imageGallery.getImageAnim());
	}

	protected void renderInfoEl(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "infoEl", imageGallery.getInfoEl());
	}

	protected void renderInfoTemplate(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "infoTemplate", imageGallery.getInfoTemplate());
	}

	protected void renderLinks(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "links", imageGallery.getLinks());
	}

	protected void renderLoader(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "loader", imageGallery.getLoader());
	}

	protected void renderLoading(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "loading", imageGallery.getLoading());
	}

	protected void renderLoadingEl(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "loadingEl", imageGallery.getLoadingEl());
	}

	protected void renderMaxHeight(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderNumber(responseWriter, "maxHeight", imageGallery.getMaxHeight());
	}

	protected void renderMaxWidth(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderNumber(responseWriter, "maxWidth", imageGallery.getMaxWidth());
	}

	protected void renderModal(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "modal", imageGallery.getModal());
	}

	protected void renderPagination(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderObject(responseWriter, "pagination", imageGallery.getPagination());
	}

	protected void renderPaginationEl(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "paginationEl", imageGallery.getPaginationEl());
	}

	protected void renderPaginationInstance(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "paginationInstance", imageGallery.getPaginationInstance());
	}

	protected void renderPaused(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "paused", imageGallery.getPaused());
	}

	protected void renderPausedLabel(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "pausedLabel", imageGallery.getPausedLabel());
	}

	protected void renderPlaying(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "playing", imageGallery.getPlaying());
	}

	protected void renderPlayingLabel(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "playingLabel", imageGallery.getPlayingLabel());
	}

	protected void renderPreloadAllImages(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "preloadAllImages", imageGallery.getPreloadAllImages());
	}

	protected void renderRepeat(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "repeat", imageGallery.getRepeat());
	}

	protected void renderShowClose(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "showClose", imageGallery.getShowClose());
	}

	protected void renderShowControls(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "showControls", imageGallery.getShowControls());
	}

	protected void renderShowPlayer(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "showPlayer", imageGallery.getShowPlayer());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderNumber(responseWriter, "tabIndex", imageGallery.getTabIndex());
	}

	protected void renderToolbar(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderString(responseWriter, "toolbar", imageGallery.getToolbar());
	}

	protected void renderTotalLinks(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "totalLinks", imageGallery.getTotalLinks());
	}

	protected void renderUseOriginalImage(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "useOriginalImage", imageGallery.getUseOriginalImage());
	}

	protected void renderVisible(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderBoolean(responseWriter, "visible", imageGallery.getVisible());
	}

	protected void renderZIndex(ResponseWriter responseWriter, ImageGallery imageGallery) throws IOException {
		renderNumber(responseWriter, "zIndex", imageGallery.getZIndex());
	}

}