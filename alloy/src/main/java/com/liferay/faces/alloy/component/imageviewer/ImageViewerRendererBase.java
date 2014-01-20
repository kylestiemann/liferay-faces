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

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, imageViewer);
		renderAfterAlignOnChange(renderedAfterEvents, imageViewer);
		renderAfterAnimChange(renderedAfterEvents, imageViewer);
		renderAfterBodyContentChange(renderedAfterEvents, imageViewer);
		renderAfterBoundingBoxChange(renderedAfterEvents, imageViewer);
		renderAfterCaptionChange(renderedAfterEvents, imageViewer);
		renderAfterCaptionElChange(renderedAfterEvents, imageViewer);
		renderAfterCaptionFromTitleChange(renderedAfterEvents, imageViewer);
		renderAfterCenteredChange(renderedAfterEvents, imageViewer);
		renderAfterCloseElChange(renderedAfterEvents, imageViewer);
		renderAfterConstrainChange(renderedAfterEvents, imageViewer);
		renderAfterContentBoxChange(renderedAfterEvents, imageViewer);
		renderAfterControlLeftElChange(renderedAfterEvents, imageViewer);
		renderAfterControlRightElChange(renderedAfterEvents, imageViewer);
		renderAfterCurrentIndexChange(renderedAfterEvents, imageViewer);
		renderAfterDestroyedChange(renderedAfterEvents, imageViewer);
		renderAfterDisabledChange(renderedAfterEvents, imageViewer);
		renderAfterFillHeightChange(renderedAfterEvents, imageViewer);
		renderAfterFocusOnChange(renderedAfterEvents, imageViewer);
		renderAfterFocusedChange(renderedAfterEvents, imageViewer);
		renderAfterFooterContentChange(renderedAfterEvents, imageViewer);
		renderAfterHeaderContentChange(renderedAfterEvents, imageViewer);
		renderAfterHeightChange(renderedAfterEvents, imageViewer);
		renderAfterIdChange(renderedAfterEvents, imageViewer);
		renderAfterImageChange(renderedAfterEvents, imageViewer);
		renderAfterImageAnimChange(renderedAfterEvents, imageViewer);
		renderAfterInfoElChange(renderedAfterEvents, imageViewer);
		renderAfterInfoTemplateChange(renderedAfterEvents, imageViewer);
		renderAfterInitializedChange(renderedAfterEvents, imageViewer);
		renderAfterLinksChange(renderedAfterEvents, imageViewer);
		renderAfterLoaderChange(renderedAfterEvents, imageViewer);
		renderAfterLoadingChange(renderedAfterEvents, imageViewer);
		renderAfterLoadingElChange(renderedAfterEvents, imageViewer);
		renderAfterLocaleChange(renderedAfterEvents, imageViewer);
		renderAfterMaskNodeChange(renderedAfterEvents, imageViewer);
		renderAfterMaxHeightChange(renderedAfterEvents, imageViewer);
		renderAfterMaxWidthChange(renderedAfterEvents, imageViewer);
		renderAfterModalChange(renderedAfterEvents, imageViewer);
		renderAfterPreloadAllImagesChange(renderedAfterEvents, imageViewer);
		renderAfterPreventOverlapChange(renderedAfterEvents, imageViewer);
		renderAfterRenderChange(renderedAfterEvents, imageViewer);
		renderAfterRenderedChange(renderedAfterEvents, imageViewer);
		renderAfterShimChange(renderedAfterEvents, imageViewer);
		renderAfterShowCloseChange(renderedAfterEvents, imageViewer);
		renderAfterShowControlsChange(renderedAfterEvents, imageViewer);
		renderAfterSrcNodeChange(renderedAfterEvents, imageViewer);
		renderAfterStringsChange(renderedAfterEvents, imageViewer);
		renderAfterTabIndexChange(renderedAfterEvents, imageViewer);
		renderAfterTotalLinksChange(renderedAfterEvents, imageViewer);
		renderAfterVisibleChange(renderedAfterEvents, imageViewer);
		renderAfterWidthChange(renderedAfterEvents, imageViewer);
		renderAfterXChange(renderedAfterEvents, imageViewer);
		renderAfterXyChange(renderedAfterEvents, imageViewer);
		renderAfterYChange(renderedAfterEvents, imageViewer);
		renderAfterZIndexChange(renderedAfterEvents, imageViewer);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnAlignChange(renderedOnEvents, imageViewer);
		renderOnAlignOnChange(renderedOnEvents, imageViewer);
		renderOnAnimChange(renderedOnEvents, imageViewer);
		renderOnBodyContentChange(renderedOnEvents, imageViewer);
		renderOnBoundingBoxChange(renderedOnEvents, imageViewer);
		renderOnCaptionChange(renderedOnEvents, imageViewer);
		renderOnCaptionElChange(renderedOnEvents, imageViewer);
		renderOnCaptionFromTitleChange(renderedOnEvents, imageViewer);
		renderOnCenteredChange(renderedOnEvents, imageViewer);
		renderOnCloseElChange(renderedOnEvents, imageViewer);
		renderOnConstrainChange(renderedOnEvents, imageViewer);
		renderOnContentBoxChange(renderedOnEvents, imageViewer);
		renderOnControlLeftElChange(renderedOnEvents, imageViewer);
		renderOnControlRightElChange(renderedOnEvents, imageViewer);
		renderOnCurrentIndexChange(renderedOnEvents, imageViewer);
		renderOnDestroyedChange(renderedOnEvents, imageViewer);
		renderOnDisabledChange(renderedOnEvents, imageViewer);
		renderOnFillHeightChange(renderedOnEvents, imageViewer);
		renderOnFocusOnChange(renderedOnEvents, imageViewer);
		renderOnFocusedChange(renderedOnEvents, imageViewer);
		renderOnFooterContentChange(renderedOnEvents, imageViewer);
		renderOnHeaderContentChange(renderedOnEvents, imageViewer);
		renderOnHeightChange(renderedOnEvents, imageViewer);
		renderOnIdChange(renderedOnEvents, imageViewer);
		renderOnImageChange(renderedOnEvents, imageViewer);
		renderOnImageAnimChange(renderedOnEvents, imageViewer);
		renderOnInfoElChange(renderedOnEvents, imageViewer);
		renderOnInfoTemplateChange(renderedOnEvents, imageViewer);
		renderOnInitializedChange(renderedOnEvents, imageViewer);
		renderOnLinksChange(renderedOnEvents, imageViewer);
		renderOnLoaderChange(renderedOnEvents, imageViewer);
		renderOnLoadingChange(renderedOnEvents, imageViewer);
		renderOnLoadingElChange(renderedOnEvents, imageViewer);
		renderOnLocaleChange(renderedOnEvents, imageViewer);
		renderOnMaskNodeChange(renderedOnEvents, imageViewer);
		renderOnMaxHeightChange(renderedOnEvents, imageViewer);
		renderOnMaxWidthChange(renderedOnEvents, imageViewer);
		renderOnModalChange(renderedOnEvents, imageViewer);
		renderOnPreloadAllImagesChange(renderedOnEvents, imageViewer);
		renderOnPreventOverlapChange(renderedOnEvents, imageViewer);
		renderOnRenderChange(renderedOnEvents, imageViewer);
		renderOnRenderedChange(renderedOnEvents, imageViewer);
		renderOnShimChange(renderedOnEvents, imageViewer);
		renderOnShowCloseChange(renderedOnEvents, imageViewer);
		renderOnShowControlsChange(renderedOnEvents, imageViewer);
		renderOnSrcNodeChange(renderedOnEvents, imageViewer);
		renderOnStringsChange(renderedOnEvents, imageViewer);
		renderOnTabIndexChange(renderedOnEvents, imageViewer);
		renderOnTotalLinksChange(renderedOnEvents, imageViewer);
		renderOnVisibleChange(renderedOnEvents, imageViewer);
		renderOnWidthChange(renderedOnEvents, imageViewer);
		renderOnXChange(renderedOnEvents, imageViewer);
		renderOnXyChange(renderedOnEvents, imageViewer);
		renderOnYChange(renderedOnEvents, imageViewer);
		renderOnZIndexChange(renderedOnEvents, imageViewer);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
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

	protected void renderAfterAlignChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterAlignChange = imageViewer.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterAlignOnChange = imageViewer.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterAnimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterAnimChange = imageViewer.getAfterAnimChange();

		if (afterAnimChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_ANIM_CHANGE, afterAnimChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterBodyContentChange = imageViewer.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterBoundingBoxChange = imageViewer.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCaptionChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCaptionChange = imageViewer.getAfterCaptionChange();

		if (afterCaptionChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CAPTION_CHANGE, afterCaptionChange));
		}
	}

	protected void renderAfterCaptionElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCaptionElChange = imageViewer.getAfterCaptionElChange();

		if (afterCaptionElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CAPTION_EL_CHANGE, afterCaptionElChange));
		}
	}

	protected void renderAfterCaptionFromTitleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCaptionFromTitleChange = imageViewer.getAfterCaptionFromTitleChange();

		if (afterCaptionFromTitleChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CAPTION_FROM_TITLE_CHANGE, afterCaptionFromTitleChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCenteredChange = imageViewer.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterCloseElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCloseElChange = imageViewer.getAfterCloseElChange();

		if (afterCloseElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CLOSE_EL_CHANGE, afterCloseElChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterConstrainChange = imageViewer.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterContentBoxChange = imageViewer.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlLeftElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterControlLeftElChange = imageViewer.getAfterControlLeftElChange();

		if (afterControlLeftElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CONTROL_LEFT_EL_CHANGE, afterControlLeftElChange));
		}
	}

	protected void renderAfterControlRightElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterControlRightElChange = imageViewer.getAfterControlRightElChange();

		if (afterControlRightElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CONTROL_RIGHT_EL_CHANGE, afterControlRightElChange));
		}
	}

	protected void renderAfterCurrentIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCurrentIndexChange = imageViewer.getAfterCurrentIndexChange();

		if (afterCurrentIndexChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_CURRENT_INDEX_CHANGE, afterCurrentIndexChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterDestroyedChange = imageViewer.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterDisabledChange = imageViewer.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterFillHeightChange = imageViewer.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterFocusOnChange = imageViewer.getAfterFocusOnChange();

		if (afterFocusOnChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterFocusedChange = imageViewer.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterFooterContentChange = imageViewer.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterHeaderContentChange = imageViewer.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterHeightChange = imageViewer.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterIdChange = imageViewer.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterImageChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterImageChange = imageViewer.getAfterImageChange();

		if (afterImageChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_IMAGE_CHANGE, afterImageChange));
		}
	}

	protected void renderAfterImageAnimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterImageAnimChange = imageViewer.getAfterImageAnimChange();

		if (afterImageAnimChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_IMAGE_ANIM_CHANGE, afterImageAnimChange));
		}
	}

	protected void renderAfterInfoElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterInfoElChange = imageViewer.getAfterInfoElChange();

		if (afterInfoElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_INFO_EL_CHANGE, afterInfoElChange));
		}
	}

	protected void renderAfterInfoTemplateChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterInfoTemplateChange = imageViewer.getAfterInfoTemplateChange();

		if (afterInfoTemplateChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_INFO_TEMPLATE_CHANGE, afterInfoTemplateChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterInitializedChange = imageViewer.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLinksChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLinksChange = imageViewer.getAfterLinksChange();

		if (afterLinksChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_LINKS_CHANGE, afterLinksChange));
		}
	}

	protected void renderAfterLoaderChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLoaderChange = imageViewer.getAfterLoaderChange();

		if (afterLoaderChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_LOADER_CHANGE, afterLoaderChange));
		}
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLoadingChange = imageViewer.getAfterLoadingChange();

		if (afterLoadingChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_LOADING_CHANGE, afterLoadingChange));
		}
	}

	protected void renderAfterLoadingElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLoadingElChange = imageViewer.getAfterLoadingElChange();

		if (afterLoadingElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_LOADING_EL_CHANGE, afterLoadingElChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLocaleChange = imageViewer.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterMaskNodeChange = imageViewer.getAfterMaskNodeChange();

		if (afterMaskNodeChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
		}
	}

	protected void renderAfterMaxHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterMaxHeightChange = imageViewer.getAfterMaxHeightChange();

		if (afterMaxHeightChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_MAX_HEIGHT_CHANGE, afterMaxHeightChange));
		}
	}

	protected void renderAfterMaxWidthChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterMaxWidthChange = imageViewer.getAfterMaxWidthChange();

		if (afterMaxWidthChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_MAX_WIDTH_CHANGE, afterMaxWidthChange));
		}
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterModalChange = imageViewer.getAfterModalChange();

		if (afterModalChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_MODAL_CHANGE, afterModalChange));
		}
	}

	protected void renderAfterPreloadAllImagesChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterPreloadAllImagesChange = imageViewer.getAfterPreloadAllImagesChange();

		if (afterPreloadAllImagesChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_PRELOAD_ALL_IMAGES_CHANGE, afterPreloadAllImagesChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterPreventOverlapChange = imageViewer.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterRenderChange = imageViewer.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterRenderedChange = imageViewer.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterShimChange = imageViewer.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterShowCloseChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterShowCloseChange = imageViewer.getAfterShowCloseChange();

		if (afterShowCloseChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_SHOW_CLOSE_CHANGE, afterShowCloseChange));
		}
	}

	protected void renderAfterShowControlsChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterShowControlsChange = imageViewer.getAfterShowControlsChange();

		if (afterShowControlsChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_SHOW_CONTROLS_CHANGE, afterShowControlsChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterSrcNodeChange = imageViewer.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterStringsChange = imageViewer.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterTabIndexChange = imageViewer.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTotalLinksChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterTotalLinksChange = imageViewer.getAfterTotalLinksChange();

		if (afterTotalLinksChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_TOTAL_LINKS_CHANGE, afterTotalLinksChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterVisibleChange = imageViewer.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterWidthChange = imageViewer.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterXChange = imageViewer.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterXyChange = imageViewer.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterYChange = imageViewer.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterZIndexChange = imageViewer.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(ImageViewer.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onAlignChange = imageViewer.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onAlignOnChange = imageViewer.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnAnimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onAnimChange = imageViewer.getOnAnimChange();

		if (onAnimChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_ANIM_CHANGE, onAnimChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onBodyContentChange = imageViewer.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onBoundingBoxChange = imageViewer.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCaptionChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCaptionChange = imageViewer.getOnCaptionChange();

		if (onCaptionChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CAPTION_CHANGE, onCaptionChange));
		}
	}

	protected void renderOnCaptionElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCaptionElChange = imageViewer.getOnCaptionElChange();

		if (onCaptionElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CAPTION_EL_CHANGE, onCaptionElChange));
		}
	}

	protected void renderOnCaptionFromTitleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCaptionFromTitleChange = imageViewer.getOnCaptionFromTitleChange();

		if (onCaptionFromTitleChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CAPTION_FROM_TITLE_CHANGE, onCaptionFromTitleChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCenteredChange = imageViewer.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnCloseElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCloseElChange = imageViewer.getOnCloseElChange();

		if (onCloseElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CLOSE_EL_CHANGE, onCloseElChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onConstrainChange = imageViewer.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onContentBoxChange = imageViewer.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlLeftElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onControlLeftElChange = imageViewer.getOnControlLeftElChange();

		if (onControlLeftElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CONTROL_LEFT_EL_CHANGE, onControlLeftElChange));
		}
	}

	protected void renderOnControlRightElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onControlRightElChange = imageViewer.getOnControlRightElChange();

		if (onControlRightElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CONTROL_RIGHT_EL_CHANGE, onControlRightElChange));
		}
	}

	protected void renderOnCurrentIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCurrentIndexChange = imageViewer.getOnCurrentIndexChange();

		if (onCurrentIndexChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_CURRENT_INDEX_CHANGE, onCurrentIndexChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onDestroyedChange = imageViewer.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onDisabledChange = imageViewer.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onFillHeightChange = imageViewer.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onFocusOnChange = imageViewer.getOnFocusOnChange();

		if (onFocusOnChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_FOCUS_ON_CHANGE, onFocusOnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onFocusedChange = imageViewer.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onFooterContentChange = imageViewer.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onHeaderContentChange = imageViewer.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onHeightChange = imageViewer.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onIdChange = imageViewer.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnImageChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onImageChange = imageViewer.getOnImageChange();

		if (onImageChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_IMAGE_CHANGE, onImageChange));
		}
	}

	protected void renderOnImageAnimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onImageAnimChange = imageViewer.getOnImageAnimChange();

		if (onImageAnimChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_IMAGE_ANIM_CHANGE, onImageAnimChange));
		}
	}

	protected void renderOnInfoElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onInfoElChange = imageViewer.getOnInfoElChange();

		if (onInfoElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_INFO_EL_CHANGE, onInfoElChange));
		}
	}

	protected void renderOnInfoTemplateChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onInfoTemplateChange = imageViewer.getOnInfoTemplateChange();

		if (onInfoTemplateChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_INFO_TEMPLATE_CHANGE, onInfoTemplateChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onInitializedChange = imageViewer.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLinksChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLinksChange = imageViewer.getOnLinksChange();

		if (onLinksChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_LINKS_CHANGE, onLinksChange));
		}
	}

	protected void renderOnLoaderChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLoaderChange = imageViewer.getOnLoaderChange();

		if (onLoaderChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_LOADER_CHANGE, onLoaderChange));
		}
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLoadingChange = imageViewer.getOnLoadingChange();

		if (onLoadingChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_LOADING_CHANGE, onLoadingChange));
		}
	}

	protected void renderOnLoadingElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLoadingElChange = imageViewer.getOnLoadingElChange();

		if (onLoadingElChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_LOADING_EL_CHANGE, onLoadingElChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLocaleChange = imageViewer.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onMaskNodeChange = imageViewer.getOnMaskNodeChange();

		if (onMaskNodeChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_MASK_NODE_CHANGE, onMaskNodeChange));
		}
	}

	protected void renderOnMaxHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onMaxHeightChange = imageViewer.getOnMaxHeightChange();

		if (onMaxHeightChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_MAX_HEIGHT_CHANGE, onMaxHeightChange));
		}
	}

	protected void renderOnMaxWidthChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onMaxWidthChange = imageViewer.getOnMaxWidthChange();

		if (onMaxWidthChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_MAX_WIDTH_CHANGE, onMaxWidthChange));
		}
	}

	protected void renderOnModalChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onModalChange = imageViewer.getOnModalChange();

		if (onModalChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_MODAL_CHANGE, onModalChange));
		}
	}

	protected void renderOnPreloadAllImagesChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onPreloadAllImagesChange = imageViewer.getOnPreloadAllImagesChange();

		if (onPreloadAllImagesChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_PRELOAD_ALL_IMAGES_CHANGE, onPreloadAllImagesChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onPreventOverlapChange = imageViewer.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onRenderChange = imageViewer.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onRenderedChange = imageViewer.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onShimChange = imageViewer.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnShowCloseChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onShowCloseChange = imageViewer.getOnShowCloseChange();

		if (onShowCloseChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_SHOW_CLOSE_CHANGE, onShowCloseChange));
		}
	}

	protected void renderOnShowControlsChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onShowControlsChange = imageViewer.getOnShowControlsChange();

		if (onShowControlsChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_SHOW_CONTROLS_CHANGE, onShowControlsChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onSrcNodeChange = imageViewer.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onStringsChange = imageViewer.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onTabIndexChange = imageViewer.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTotalLinksChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onTotalLinksChange = imageViewer.getOnTotalLinksChange();

		if (onTotalLinksChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_TOTAL_LINKS_CHANGE, onTotalLinksChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onVisibleChange = imageViewer.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onWidthChange = imageViewer.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onXChange = imageViewer.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onXyChange = imageViewer.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onYChange = imageViewer.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onZIndexChange = imageViewer.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(ImageViewer.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}