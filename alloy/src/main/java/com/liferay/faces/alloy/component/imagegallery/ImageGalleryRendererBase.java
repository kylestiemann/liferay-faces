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
public abstract class ImageGalleryRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-image-viewer-gallery";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ImageGallery imageGallery = (ImageGallery) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var imageGallery = new A.ImageGallery");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, imageGallery);
		renderAlignOn(renderedAttributes, imageGallery);
		renderAnim(renderedAttributes, imageGallery);
		renderAutoPlay(renderedAttributes, imageGallery);
		renderImagegalleryBodyContent(renderedAttributes, imageGallery);
		renderBoundingBox(renderedAttributes, imageGallery);
		renderCaption(renderedAttributes, imageGallery);
		renderCaptionEl(renderedAttributes, imageGallery);
		renderCaptionFromTitle(renderedAttributes, imageGallery);
		renderCentered(renderedAttributes, imageGallery);
		renderCloseEl(renderedAttributes, imageGallery);
		renderConstrain(renderedAttributes, imageGallery);
		renderContentBox(renderedAttributes, imageGallery);
		renderControlLeftEl(renderedAttributes, imageGallery);
		renderControlRightEl(renderedAttributes, imageGallery);
		renderCurrentIndex(renderedAttributes, imageGallery);
		renderDelay(renderedAttributes, imageGallery);
		renderDestroyed(renderedAttributes, imageGallery);
		renderDisabled(renderedAttributes, imageGallery);
		renderFillHeight(renderedAttributes, imageGallery);
		renderFocusOn(renderedAttributes, imageGallery);
		renderFocused(renderedAttributes, imageGallery);
		renderFooterContent(renderedAttributes, imageGallery);
		renderHeaderContent(renderedAttributes, imageGallery);
		renderHeight(renderedAttributes, imageGallery);
		renderImagegalleryId(renderedAttributes, imageGallery);
		renderImage(renderedAttributes, imageGallery);
		renderImageAnim(renderedAttributes, imageGallery);
		renderInfoEl(renderedAttributes, imageGallery);
		renderInfoTemplate(renderedAttributes, imageGallery);
		renderInitialized(renderedAttributes, imageGallery);
		renderLinks(renderedAttributes, imageGallery);
		renderLoader(renderedAttributes, imageGallery);
		renderLoading(renderedAttributes, imageGallery);
		renderLoadingEl(renderedAttributes, imageGallery);
		renderImagegalleryLocale(renderedAttributes, imageGallery);
		renderMaskNode(renderedAttributes, imageGallery);
		renderMaxHeight(renderedAttributes, imageGallery);
		renderMaxWidth(renderedAttributes, imageGallery);
		renderModal(renderedAttributes, imageGallery);
		renderPagination(renderedAttributes, imageGallery);
		renderPaginationEl(renderedAttributes, imageGallery);
		renderPaginationInstance(renderedAttributes, imageGallery);
		renderPaused(renderedAttributes, imageGallery);
		renderPausedLabel(renderedAttributes, imageGallery);
		renderPlaying(renderedAttributes, imageGallery);
		renderPlayingLabel(renderedAttributes, imageGallery);
		renderPreloadAllImages(renderedAttributes, imageGallery);
		renderPreventOverlap(renderedAttributes, imageGallery);
		renderRender(renderedAttributes, imageGallery);
		renderRendered(renderedAttributes, imageGallery);
		renderRepeat(renderedAttributes, imageGallery);
		renderShim(renderedAttributes, imageGallery);
		renderShowClose(renderedAttributes, imageGallery);
		renderShowControls(renderedAttributes, imageGallery);
		renderShowPlayer(renderedAttributes, imageGallery);
		renderSrcNode(renderedAttributes, imageGallery);
		renderStrings(renderedAttributes, imageGallery);
		renderTabIndex(renderedAttributes, imageGallery);
		renderToolbar(renderedAttributes, imageGallery);
		renderTotalLinks(renderedAttributes, imageGallery);
		renderUseOriginalImage(renderedAttributes, imageGallery);
		renderVisible(renderedAttributes, imageGallery);
		renderWidth(renderedAttributes, imageGallery);
		renderX(renderedAttributes, imageGallery);
		renderXy(renderedAttributes, imageGallery);
		renderY(renderedAttributes, imageGallery);
		renderZIndex(renderedAttributes, imageGallery);

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

	protected void renderAlign(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object align = imageGallery.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(ImageGallery.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object alignOn = imageGallery.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(ImageGallery.ALIGN_ON, alignOn));
		}
	}

	protected void renderAnim(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean anim = imageGallery.getAnim();

		if (anim != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.ANIM, anim));
		}
	}

	protected void renderAutoPlay(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean autoPlay = imageGallery.getAutoPlay();

		if (autoPlay != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.AUTO_PLAY, autoPlay));
		}
	}

	protected void renderImagegalleryBodyContent(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String imagegalleryBodyContent = imageGallery.getImagegalleryBodyContent();

		if (imagegalleryBodyContent != null) {
			renderedAttributes.add(renderString(ImageGallery.IMAGEGALLERY_BODY_CONTENT, imagegalleryBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String boundingBox = imageGallery.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(ImageGallery.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCaption(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String caption = imageGallery.getCaption();

		if (caption != null) {
			renderedAttributes.add(renderString(ImageGallery.CAPTION, caption));
		}
	}

	protected void renderCaptionEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object captionEl = imageGallery.getCaptionEl();

		if (captionEl != null) {
			renderedAttributes.add(renderString(ImageGallery.CAPTION_EL, captionEl));
		}
	}

	protected void renderCaptionFromTitle(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean captionFromTitle = imageGallery.getCaptionFromTitle();

		if (captionFromTitle != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.CAPTION_FROM_TITLE, captionFromTitle));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean centered = imageGallery.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.CENTERED, centered));
		}
	}

	protected void renderCloseEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object closeEl = imageGallery.getCloseEl();

		if (closeEl != null) {
			renderedAttributes.add(renderString(ImageGallery.CLOSE_EL, closeEl));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object constrain = imageGallery.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(ImageGallery.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String contentBox = imageGallery.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(ImageGallery.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlLeftEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object controlLeftEl = imageGallery.getControlLeftEl();

		if (controlLeftEl != null) {
			renderedAttributes.add(renderString(ImageGallery.CONTROL_LEFT_EL, controlLeftEl));
		}
	}

	protected void renderControlRightEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object controlRightEl = imageGallery.getControlRightEl();

		if (controlRightEl != null) {
			renderedAttributes.add(renderString(ImageGallery.CONTROL_RIGHT_EL, controlRightEl));
		}
	}

	protected void renderCurrentIndex(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object currentIndex = imageGallery.getCurrentIndex();

		if (currentIndex != null) {
			renderedAttributes.add(renderNumber(ImageGallery.CURRENT_INDEX, currentIndex));
		}
	}

	protected void renderDelay(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object delay = imageGallery.getDelay();

		if (delay != null) {
			renderedAttributes.add(renderNumber(ImageGallery.DELAY, delay));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean destroyed = imageGallery.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean disabled = imageGallery.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object fillHeight = imageGallery.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(ImageGallery.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocusOn(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object focusOn = imageGallery.getFocusOn();

		if (focusOn != null) {
			renderedAttributes.add(renderArray(ImageGallery.FOCUS_ON, focusOn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean focused = imageGallery.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object footerContent = imageGallery.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(ImageGallery.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object headerContent = imageGallery.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(ImageGallery.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object height = imageGallery.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(ImageGallery.HEIGHT, height));
		}
	}

	protected void renderImagegalleryId(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String imagegalleryId = imageGallery.getImagegalleryId();

		if (imagegalleryId != null) {
			renderedAttributes.add(renderString(ImageGallery.IMAGEGALLERY_ID, imagegalleryId));
		}
	}

	protected void renderImage(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object image = imageGallery.getImage();

		if (image != null) {
			renderedAttributes.add(renderString(ImageGallery.IMAGE, image));
		}
	}

	protected void renderImageAnim(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object imageAnim = imageGallery.getImageAnim();

		if (imageAnim != null) {
			renderedAttributes.add(renderObject(ImageGallery.IMAGE_ANIM, imageAnim));
		}
	}

	protected void renderInfoEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object infoEl = imageGallery.getInfoEl();

		if (infoEl != null) {
			renderedAttributes.add(renderString(ImageGallery.INFO_EL, infoEl));
		}
	}

	protected void renderInfoTemplate(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String infoTemplate = imageGallery.getInfoTemplate();

		if (infoTemplate != null) {
			renderedAttributes.add(renderString(ImageGallery.INFO_TEMPLATE, infoTemplate));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean initialized = imageGallery.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.INITIALIZED, initialized));
		}
	}

	protected void renderLinks(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object links = imageGallery.getLinks();

		if (links != null) {
			renderedAttributes.add(renderString(ImageGallery.LINKS, links));
		}
	}

	protected void renderLoader(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object loader = imageGallery.getLoader();

		if (loader != null) {
			renderedAttributes.add(renderString(ImageGallery.LOADER, loader));
		}
	}

	protected void renderLoading(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean loading = imageGallery.getLoading();

		if (loading != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.LOADING, loading));
		}
	}

	protected void renderLoadingEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object loadingEl = imageGallery.getLoadingEl();

		if (loadingEl != null) {
			renderedAttributes.add(renderString(ImageGallery.LOADING_EL, loadingEl));
		}
	}

	protected void renderImagegalleryLocale(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String imagegalleryLocale = imageGallery.getImagegalleryLocale();

		if (imagegalleryLocale != null) {
			renderedAttributes.add(renderString(ImageGallery.IMAGEGALLERY_LOCALE, imagegalleryLocale));
		}
	}

	protected void renderMaskNode(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object maskNode = imageGallery.getMaskNode();

		if (maskNode != null) {
			renderedAttributes.add(renderString(ImageGallery.MASK_NODE, maskNode));
		}
	}

	protected void renderMaxHeight(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object maxHeight = imageGallery.getMaxHeight();

		if (maxHeight != null) {
			renderedAttributes.add(renderNumber(ImageGallery.MAX_HEIGHT, maxHeight));
		}
	}

	protected void renderMaxWidth(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object maxWidth = imageGallery.getMaxWidth();

		if (maxWidth != null) {
			renderedAttributes.add(renderNumber(ImageGallery.MAX_WIDTH, maxWidth));
		}
	}

	protected void renderModal(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean modal = imageGallery.getModal();

		if (modal != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.MODAL, modal));
		}
	}

	protected void renderPagination(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object pagination = imageGallery.getPagination();

		if (pagination != null) {
			renderedAttributes.add(renderObject(ImageGallery.PAGINATION, pagination));
		}
	}

	protected void renderPaginationEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object paginationEl = imageGallery.getPaginationEl();

		if (paginationEl != null) {
			renderedAttributes.add(renderString(ImageGallery.PAGINATION_EL, paginationEl));
		}
	}

	protected void renderPaginationInstance(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object paginationInstance = imageGallery.getPaginationInstance();

		if (paginationInstance != null) {
			renderedAttributes.add(renderString(ImageGallery.PAGINATION_INSTANCE, paginationInstance));
		}
	}

	protected void renderPaused(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean paused = imageGallery.getPaused();

		if (paused != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.PAUSED, paused));
		}
	}

	protected void renderPausedLabel(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String pausedLabel = imageGallery.getPausedLabel();

		if (pausedLabel != null) {
			renderedAttributes.add(renderString(ImageGallery.PAUSED_LABEL, pausedLabel));
		}
	}

	protected void renderPlaying(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean playing = imageGallery.getPlaying();

		if (playing != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.PLAYING, playing));
		}
	}

	protected void renderPlayingLabel(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String playingLabel = imageGallery.getPlayingLabel();

		if (playingLabel != null) {
			renderedAttributes.add(renderString(ImageGallery.PLAYING_LABEL, playingLabel));
		}
	}

	protected void renderPreloadAllImages(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean preloadAllImages = imageGallery.getPreloadAllImages();

		if (preloadAllImages != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.PRELOAD_ALL_IMAGES, preloadAllImages));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean preventOverlap = imageGallery.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object render = imageGallery.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(ImageGallery.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean rendered = imageGallery.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.RENDERED, rendered));
		}
	}

	protected void renderRepeat(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean repeat = imageGallery.getRepeat();

		if (repeat != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.REPEAT, repeat));
		}
	}

	protected void renderShim(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean shim = imageGallery.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.SHIM, shim));
		}
	}

	protected void renderShowClose(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean showClose = imageGallery.getShowClose();

		if (showClose != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.SHOW_CLOSE, showClose));
		}
	}

	protected void renderShowControls(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean showControls = imageGallery.getShowControls();

		if (showControls != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.SHOW_CONTROLS, showControls));
		}
	}

	protected void renderShowPlayer(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean showPlayer = imageGallery.getShowPlayer();

		if (showPlayer != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.SHOW_PLAYER, showPlayer));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String srcNode = imageGallery.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(ImageGallery.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object strings = imageGallery.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(ImageGallery.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object tabIndex = imageGallery.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(ImageGallery.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToolbar(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object toolbar = imageGallery.getToolbar();

		if (toolbar != null) {
			renderedAttributes.add(renderString(ImageGallery.TOOLBAR, toolbar));
		}
	}

	protected void renderTotalLinks(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean totalLinks = imageGallery.getTotalLinks();

		if (totalLinks != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.TOTAL_LINKS, totalLinks));
		}
	}

	protected void renderUseOriginalImage(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean useOriginalImage = imageGallery.getUseOriginalImage();

		if (useOriginalImage != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.USE_ORIGINAL_IMAGE, useOriginalImage));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean visible = imageGallery.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(ImageGallery.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object width = imageGallery.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(ImageGallery.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object x = imageGallery.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(ImageGallery.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object xy = imageGallery.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(ImageGallery.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object y = imageGallery.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(ImageGallery.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object zIndex = imageGallery.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(ImageGallery.Z_INDEX, zIndex));
		}
	}

}