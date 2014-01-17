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
public abstract class ImageViewerRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-image-viewer-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ImageViewer imageViewer = (ImageViewer) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var imageViewer = new A.ImageViewer");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAlign(renderedAttributes, imageViewer);
		renderAlignOn(renderedAttributes, imageViewer);
		renderAnim(renderedAttributes, imageViewer);
		renderImageViewerBodyContent(renderedAttributes, imageViewer);
		renderBoundingBox(renderedAttributes, imageViewer);
		renderCaption(renderedAttributes, imageViewer);
		renderCaptionEl(renderedAttributes, imageViewer);
		renderCaptionFromTitle(renderedAttributes, imageViewer);
		renderCentered(renderedAttributes, imageViewer);
		renderCloseEl(renderedAttributes, imageViewer);
		renderConstrain(renderedAttributes, imageViewer);
		renderContentBox(renderedAttributes, imageViewer);
		renderControlLeftEl(renderedAttributes, imageViewer);
		renderControlRightEl(renderedAttributes, imageViewer);
		renderCurrentIndex(renderedAttributes, imageViewer);
		renderDestroyed(renderedAttributes, imageViewer);
		renderDisabled(renderedAttributes, imageViewer);
		renderFillHeight(renderedAttributes, imageViewer);
		renderFocusOn(renderedAttributes, imageViewer);
		renderFocused(renderedAttributes, imageViewer);
		renderFooterContent(renderedAttributes, imageViewer);
		renderHeaderContent(renderedAttributes, imageViewer);
		renderHeight(renderedAttributes, imageViewer);
		renderImageViewerId(renderedAttributes, imageViewer);
		renderImage(renderedAttributes, imageViewer);
		renderImageAnim(renderedAttributes, imageViewer);
		renderInfoEl(renderedAttributes, imageViewer);
		renderInfoTemplate(renderedAttributes, imageViewer);
		renderInitialized(renderedAttributes, imageViewer);
		renderLinks(renderedAttributes, imageViewer);
		renderLoader(renderedAttributes, imageViewer);
		renderLoading(renderedAttributes, imageViewer);
		renderLoadingEl(renderedAttributes, imageViewer);
		renderImageViewerLocale(renderedAttributes, imageViewer);
		renderMaskNode(renderedAttributes, imageViewer);
		renderMaxHeight(renderedAttributes, imageViewer);
		renderMaxWidth(renderedAttributes, imageViewer);
		renderModal(renderedAttributes, imageViewer);
		renderPreloadAllImages(renderedAttributes, imageViewer);
		renderPreventOverlap(renderedAttributes, imageViewer);
		renderRender(renderedAttributes, imageViewer);
		renderRendered(renderedAttributes, imageViewer);
		renderShim(renderedAttributes, imageViewer);
		renderShowClose(renderedAttributes, imageViewer);
		renderShowControls(renderedAttributes, imageViewer);
		renderSrcNode(renderedAttributes, imageViewer);
		renderStrings(renderedAttributes, imageViewer);
		renderTabIndex(renderedAttributes, imageViewer);
		renderTotalLinks(renderedAttributes, imageViewer);
		renderVisible(renderedAttributes, imageViewer);
		renderWidth(renderedAttributes, imageViewer);
		renderX(renderedAttributes, imageViewer);
		renderXy(renderedAttributes, imageViewer);
		renderY(renderedAttributes, imageViewer);
		renderZIndex(renderedAttributes, imageViewer);

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

	protected void renderAlign(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object align = imageViewer.getAlign();

		if (align != null) {
			renderedAttributes.add(renderObject(ImageViewer.ALIGN, align));
		}
	}

	protected void renderAlignOn(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object alignOn = imageViewer.getAlignOn();

		if (alignOn != null) {
			renderedAttributes.add(renderArray(ImageViewer.ALIGN_ON, alignOn));
		}
	}

	protected void renderAnim(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean anim = imageViewer.getAnim();

		if (anim != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.ANIM, anim));
		}
	}

	protected void renderImageViewerBodyContent(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String imageViewerBodyContent = imageViewer.getImageViewerBodyContent();

		if (imageViewerBodyContent != null) {
			renderedAttributes.add(renderString(ImageViewer.IMAGE_VIEWER_BODY_CONTENT, imageViewerBodyContent));
		}
	}

	protected void renderBoundingBox(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String boundingBox = imageViewer.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(ImageViewer.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCaption(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String caption = imageViewer.getCaption();

		if (caption != null) {
			renderedAttributes.add(renderString(ImageViewer.CAPTION, caption));
		}
	}

	protected void renderCaptionEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object captionEl = imageViewer.getCaptionEl();

		if (captionEl != null) {
			renderedAttributes.add(renderString(ImageViewer.CAPTION_EL, captionEl));
		}
	}

	protected void renderCaptionFromTitle(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean captionFromTitle = imageViewer.getCaptionFromTitle();

		if (captionFromTitle != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.CAPTION_FROM_TITLE, captionFromTitle));
		}
	}

	protected void renderCentered(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean centered = imageViewer.getCentered();

		if (centered != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.CENTERED, centered));
		}
	}

	protected void renderCloseEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object closeEl = imageViewer.getCloseEl();

		if (closeEl != null) {
			renderedAttributes.add(renderString(ImageViewer.CLOSE_EL, closeEl));
		}
	}

	protected void renderConstrain(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object constrain = imageViewer.getConstrain();

		if (constrain != null) {
			renderedAttributes.add(renderString(ImageViewer.CONSTRAIN, constrain));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String contentBox = imageViewer.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(ImageViewer.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControlLeftEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object controlLeftEl = imageViewer.getControlLeftEl();

		if (controlLeftEl != null) {
			renderedAttributes.add(renderString(ImageViewer.CONTROL_LEFT_EL, controlLeftEl));
		}
	}

	protected void renderControlRightEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object controlRightEl = imageViewer.getControlRightEl();

		if (controlRightEl != null) {
			renderedAttributes.add(renderString(ImageViewer.CONTROL_RIGHT_EL, controlRightEl));
		}
	}

	protected void renderCurrentIndex(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object currentIndex = imageViewer.getCurrentIndex();

		if (currentIndex != null) {
			renderedAttributes.add(renderNumber(ImageViewer.CURRENT_INDEX, currentIndex));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean destroyed = imageViewer.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean disabled = imageViewer.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.DISABLED, disabled));
		}
	}

	protected void renderFillHeight(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object fillHeight = imageViewer.getFillHeight();

		if (fillHeight != null) {
			renderedAttributes.add(renderString(ImageViewer.FILL_HEIGHT, fillHeight));
		}
	}

	protected void renderFocusOn(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object focusOn = imageViewer.getFocusOn();

		if (focusOn != null) {
			renderedAttributes.add(renderArray(ImageViewer.FOCUS_ON, focusOn));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean focused = imageViewer.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.FOCUSED, focused));
		}
	}

	protected void renderFooterContent(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object footerContent = imageViewer.getFooterContent();

		if (footerContent != null) {
			renderedAttributes.add(renderString(ImageViewer.FOOTER_CONTENT, footerContent));
		}
	}

	protected void renderHeaderContent(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object headerContent = imageViewer.getHeaderContent();

		if (headerContent != null) {
			renderedAttributes.add(renderString(ImageViewer.HEADER_CONTENT, headerContent));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object height = imageViewer.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(ImageViewer.HEIGHT, height));
		}
	}

	protected void renderImageViewerId(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String imageViewerId = imageViewer.getImageViewerId();

		if (imageViewerId != null) {
			renderedAttributes.add(renderString(ImageViewer.IMAGE_VIEWER_ID, imageViewerId));
		}
	}

	protected void renderImage(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object image = imageViewer.getImage();

		if (image != null) {
			renderedAttributes.add(renderString(ImageViewer.IMAGE, image));
		}
	}

	protected void renderImageAnim(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object imageAnim = imageViewer.getImageAnim();

		if (imageAnim != null) {
			renderedAttributes.add(renderObject(ImageViewer.IMAGE_ANIM, imageAnim));
		}
	}

	protected void renderInfoEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object infoEl = imageViewer.getInfoEl();

		if (infoEl != null) {
			renderedAttributes.add(renderString(ImageViewer.INFO_EL, infoEl));
		}
	}

	protected void renderInfoTemplate(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String infoTemplate = imageViewer.getInfoTemplate();

		if (infoTemplate != null) {
			renderedAttributes.add(renderString(ImageViewer.INFO_TEMPLATE, infoTemplate));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean initialized = imageViewer.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.INITIALIZED, initialized));
		}
	}

	protected void renderLinks(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object links = imageViewer.getLinks();

		if (links != null) {
			renderedAttributes.add(renderString(ImageViewer.LINKS, links));
		}
	}

	protected void renderLoader(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object loader = imageViewer.getLoader();

		if (loader != null) {
			renderedAttributes.add(renderString(ImageViewer.LOADER, loader));
		}
	}

	protected void renderLoading(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean loading = imageViewer.getLoading();

		if (loading != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.LOADING, loading));
		}
	}

	protected void renderLoadingEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object loadingEl = imageViewer.getLoadingEl();

		if (loadingEl != null) {
			renderedAttributes.add(renderString(ImageViewer.LOADING_EL, loadingEl));
		}
	}

	protected void renderImageViewerLocale(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String imageViewerLocale = imageViewer.getImageViewerLocale();

		if (imageViewerLocale != null) {
			renderedAttributes.add(renderString(ImageViewer.IMAGE_VIEWER_LOCALE, imageViewerLocale));
		}
	}

	protected void renderMaskNode(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object maskNode = imageViewer.getMaskNode();

		if (maskNode != null) {
			renderedAttributes.add(renderString(ImageViewer.MASK_NODE, maskNode));
		}
	}

	protected void renderMaxHeight(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object maxHeight = imageViewer.getMaxHeight();

		if (maxHeight != null) {
			renderedAttributes.add(renderNumber(ImageViewer.MAX_HEIGHT, maxHeight));
		}
	}

	protected void renderMaxWidth(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object maxWidth = imageViewer.getMaxWidth();

		if (maxWidth != null) {
			renderedAttributes.add(renderNumber(ImageViewer.MAX_WIDTH, maxWidth));
		}
	}

	protected void renderModal(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean modal = imageViewer.getModal();

		if (modal != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.MODAL, modal));
		}
	}

	protected void renderPreloadAllImages(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean preloadAllImages = imageViewer.getPreloadAllImages();

		if (preloadAllImages != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.PRELOAD_ALL_IMAGES, preloadAllImages));
		}
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean preventOverlap = imageViewer.getPreventOverlap();

		if (preventOverlap != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.PREVENT_OVERLAP, preventOverlap));
		}
	}

	protected void renderRender(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object render = imageViewer.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(ImageViewer.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean rendered = imageViewer.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.RENDERED, rendered));
		}
	}

	protected void renderShim(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean shim = imageViewer.getShim();

		if (shim != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.SHIM, shim));
		}
	}

	protected void renderShowClose(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean showClose = imageViewer.getShowClose();

		if (showClose != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.SHOW_CLOSE, showClose));
		}
	}

	protected void renderShowControls(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean showControls = imageViewer.getShowControls();

		if (showControls != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.SHOW_CONTROLS, showControls));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String srcNode = imageViewer.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(ImageViewer.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object strings = imageViewer.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(ImageViewer.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object tabIndex = imageViewer.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(ImageViewer.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTotalLinks(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean totalLinks = imageViewer.getTotalLinks();

		if (totalLinks != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.TOTAL_LINKS, totalLinks));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean visible = imageViewer.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(ImageViewer.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object width = imageViewer.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(ImageViewer.WIDTH, width));
		}
	}

	protected void renderX(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object x = imageViewer.getX();

		if (x != null) {
			renderedAttributes.add(renderNumber(ImageViewer.X, x));
		}
	}

	protected void renderXy(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object xy = imageViewer.getXy();

		if (xy != null) {
			renderedAttributes.add(renderArray(ImageViewer.XY, xy));
		}
	}

	protected void renderY(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object y = imageViewer.getY();

		if (y != null) {
			renderedAttributes.add(renderNumber(ImageViewer.Y, y));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object zIndex = imageViewer.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(ImageViewer.Z_INDEX, zIndex));
		}
	}

}