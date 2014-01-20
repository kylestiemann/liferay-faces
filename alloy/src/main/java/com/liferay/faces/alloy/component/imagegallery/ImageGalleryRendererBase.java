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
		renderImageGalleryBodyContent(renderedAttributes, imageGallery);
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
		renderImageGalleryId(renderedAttributes, imageGallery);
		renderImage(renderedAttributes, imageGallery);
		renderImageAnim(renderedAttributes, imageGallery);
		renderInfoEl(renderedAttributes, imageGallery);
		renderInfoTemplate(renderedAttributes, imageGallery);
		renderInitialized(renderedAttributes, imageGallery);
		renderLinks(renderedAttributes, imageGallery);
		renderLoader(renderedAttributes, imageGallery);
		renderLoading(renderedAttributes, imageGallery);
		renderLoadingEl(renderedAttributes, imageGallery);
		renderImageGalleryLocale(renderedAttributes, imageGallery);
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAlignChange(renderedAfterEvents, imageGallery);
		renderAfterAlignOnChange(renderedAfterEvents, imageGallery);
		renderAfterAnimChange(renderedAfterEvents, imageGallery);
		renderAfterAutoPlayChange(renderedAfterEvents, imageGallery);
		renderAfterBodyContentChange(renderedAfterEvents, imageGallery);
		renderAfterBoundingBoxChange(renderedAfterEvents, imageGallery);
		renderAfterCaptionChange(renderedAfterEvents, imageGallery);
		renderAfterCaptionElChange(renderedAfterEvents, imageGallery);
		renderAfterCaptionFromTitleChange(renderedAfterEvents, imageGallery);
		renderAfterCenteredChange(renderedAfterEvents, imageGallery);
		renderAfterCloseElChange(renderedAfterEvents, imageGallery);
		renderAfterConstrainChange(renderedAfterEvents, imageGallery);
		renderAfterContentBoxChange(renderedAfterEvents, imageGallery);
		renderAfterControlLeftElChange(renderedAfterEvents, imageGallery);
		renderAfterControlRightElChange(renderedAfterEvents, imageGallery);
		renderAfterCurrentIndexChange(renderedAfterEvents, imageGallery);
		renderAfterDelayChange(renderedAfterEvents, imageGallery);
		renderAfterDestroyedChange(renderedAfterEvents, imageGallery);
		renderAfterDisabledChange(renderedAfterEvents, imageGallery);
		renderAfterFillHeightChange(renderedAfterEvents, imageGallery);
		renderAfterFocusOnChange(renderedAfterEvents, imageGallery);
		renderAfterFocusedChange(renderedAfterEvents, imageGallery);
		renderAfterFooterContentChange(renderedAfterEvents, imageGallery);
		renderAfterHeaderContentChange(renderedAfterEvents, imageGallery);
		renderAfterHeightChange(renderedAfterEvents, imageGallery);
		renderAfterIdChange(renderedAfterEvents, imageGallery);
		renderAfterImageChange(renderedAfterEvents, imageGallery);
		renderAfterImageAnimChange(renderedAfterEvents, imageGallery);
		renderAfterInfoElChange(renderedAfterEvents, imageGallery);
		renderAfterInfoTemplateChange(renderedAfterEvents, imageGallery);
		renderAfterInitializedChange(renderedAfterEvents, imageGallery);
		renderAfterLinksChange(renderedAfterEvents, imageGallery);
		renderAfterLoaderChange(renderedAfterEvents, imageGallery);
		renderAfterLoadingChange(renderedAfterEvents, imageGallery);
		renderAfterLoadingElChange(renderedAfterEvents, imageGallery);
		renderAfterLocaleChange(renderedAfterEvents, imageGallery);
		renderAfterMaskNodeChange(renderedAfterEvents, imageGallery);
		renderAfterMaxHeightChange(renderedAfterEvents, imageGallery);
		renderAfterMaxWidthChange(renderedAfterEvents, imageGallery);
		renderAfterModalChange(renderedAfterEvents, imageGallery);
		renderAfterPaginationChange(renderedAfterEvents, imageGallery);
		renderAfterPaginationElChange(renderedAfterEvents, imageGallery);
		renderAfterPaginationInstanceChange(renderedAfterEvents, imageGallery);
		renderAfterPausedChange(renderedAfterEvents, imageGallery);
		renderAfterPausedLabelChange(renderedAfterEvents, imageGallery);
		renderAfterPlayingChange(renderedAfterEvents, imageGallery);
		renderAfterPlayingLabelChange(renderedAfterEvents, imageGallery);
		renderAfterPreloadAllImagesChange(renderedAfterEvents, imageGallery);
		renderAfterPreventOverlapChange(renderedAfterEvents, imageGallery);
		renderAfterRenderChange(renderedAfterEvents, imageGallery);
		renderAfterRenderedChange(renderedAfterEvents, imageGallery);
		renderAfterRepeatChange(renderedAfterEvents, imageGallery);
		renderAfterShimChange(renderedAfterEvents, imageGallery);
		renderAfterShowCloseChange(renderedAfterEvents, imageGallery);
		renderAfterShowControlsChange(renderedAfterEvents, imageGallery);
		renderAfterShowPlayerChange(renderedAfterEvents, imageGallery);
		renderAfterSrcNodeChange(renderedAfterEvents, imageGallery);
		renderAfterStringsChange(renderedAfterEvents, imageGallery);
		renderAfterTabIndexChange(renderedAfterEvents, imageGallery);
		renderAfterToolbarChange(renderedAfterEvents, imageGallery);
		renderAfterTotalLinksChange(renderedAfterEvents, imageGallery);
		renderAfterUseOriginalImageChange(renderedAfterEvents, imageGallery);
		renderAfterVisibleChange(renderedAfterEvents, imageGallery);
		renderAfterWidthChange(renderedAfterEvents, imageGallery);
		renderAfterXChange(renderedAfterEvents, imageGallery);
		renderAfterXyChange(renderedAfterEvents, imageGallery);
		renderAfterYChange(renderedAfterEvents, imageGallery);
		renderAfterZIndexChange(renderedAfterEvents, imageGallery);

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

		renderOnAlignChange(renderedOnEvents, imageGallery);
		renderOnAlignOnChange(renderedOnEvents, imageGallery);
		renderOnAnimChange(renderedOnEvents, imageGallery);
		renderOnAutoPlayChange(renderedOnEvents, imageGallery);
		renderOnBodyContentChange(renderedOnEvents, imageGallery);
		renderOnBoundingBoxChange(renderedOnEvents, imageGallery);
		renderOnCaptionChange(renderedOnEvents, imageGallery);
		renderOnCaptionElChange(renderedOnEvents, imageGallery);
		renderOnCaptionFromTitleChange(renderedOnEvents, imageGallery);
		renderOnCenteredChange(renderedOnEvents, imageGallery);
		renderOnCloseElChange(renderedOnEvents, imageGallery);
		renderOnConstrainChange(renderedOnEvents, imageGallery);
		renderOnContentBoxChange(renderedOnEvents, imageGallery);
		renderOnControlLeftElChange(renderedOnEvents, imageGallery);
		renderOnControlRightElChange(renderedOnEvents, imageGallery);
		renderOnCurrentIndexChange(renderedOnEvents, imageGallery);
		renderOnDelayChange(renderedOnEvents, imageGallery);
		renderOnDestroyedChange(renderedOnEvents, imageGallery);
		renderOnDisabledChange(renderedOnEvents, imageGallery);
		renderOnFillHeightChange(renderedOnEvents, imageGallery);
		renderOnFocusOnChange(renderedOnEvents, imageGallery);
		renderOnFocusedChange(renderedOnEvents, imageGallery);
		renderOnFooterContentChange(renderedOnEvents, imageGallery);
		renderOnHeaderContentChange(renderedOnEvents, imageGallery);
		renderOnHeightChange(renderedOnEvents, imageGallery);
		renderOnIdChange(renderedOnEvents, imageGallery);
		renderOnImageChange(renderedOnEvents, imageGallery);
		renderOnImageAnimChange(renderedOnEvents, imageGallery);
		renderOnInfoElChange(renderedOnEvents, imageGallery);
		renderOnInfoTemplateChange(renderedOnEvents, imageGallery);
		renderOnInitializedChange(renderedOnEvents, imageGallery);
		renderOnLinksChange(renderedOnEvents, imageGallery);
		renderOnLoaderChange(renderedOnEvents, imageGallery);
		renderOnLoadingChange(renderedOnEvents, imageGallery);
		renderOnLoadingElChange(renderedOnEvents, imageGallery);
		renderOnLocaleChange(renderedOnEvents, imageGallery);
		renderOnMaskNodeChange(renderedOnEvents, imageGallery);
		renderOnMaxHeightChange(renderedOnEvents, imageGallery);
		renderOnMaxWidthChange(renderedOnEvents, imageGallery);
		renderOnModalChange(renderedOnEvents, imageGallery);
		renderOnPaginationChange(renderedOnEvents, imageGallery);
		renderOnPaginationElChange(renderedOnEvents, imageGallery);
		renderOnPaginationInstanceChange(renderedOnEvents, imageGallery);
		renderOnPausedChange(renderedOnEvents, imageGallery);
		renderOnPausedLabelChange(renderedOnEvents, imageGallery);
		renderOnPlayingChange(renderedOnEvents, imageGallery);
		renderOnPlayingLabelChange(renderedOnEvents, imageGallery);
		renderOnPreloadAllImagesChange(renderedOnEvents, imageGallery);
		renderOnPreventOverlapChange(renderedOnEvents, imageGallery);
		renderOnRenderChange(renderedOnEvents, imageGallery);
		renderOnRenderedChange(renderedOnEvents, imageGallery);
		renderOnRepeatChange(renderedOnEvents, imageGallery);
		renderOnShimChange(renderedOnEvents, imageGallery);
		renderOnShowCloseChange(renderedOnEvents, imageGallery);
		renderOnShowControlsChange(renderedOnEvents, imageGallery);
		renderOnShowPlayerChange(renderedOnEvents, imageGallery);
		renderOnSrcNodeChange(renderedOnEvents, imageGallery);
		renderOnStringsChange(renderedOnEvents, imageGallery);
		renderOnTabIndexChange(renderedOnEvents, imageGallery);
		renderOnToolbarChange(renderedOnEvents, imageGallery);
		renderOnTotalLinksChange(renderedOnEvents, imageGallery);
		renderOnUseOriginalImageChange(renderedOnEvents, imageGallery);
		renderOnVisibleChange(renderedOnEvents, imageGallery);
		renderOnWidthChange(renderedOnEvents, imageGallery);
		renderOnXChange(renderedOnEvents, imageGallery);
		renderOnXyChange(renderedOnEvents, imageGallery);
		renderOnYChange(renderedOnEvents, imageGallery);
		renderOnZIndexChange(renderedOnEvents, imageGallery);

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

	protected void renderImageGalleryBodyContent(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String imageGalleryBodyContent = imageGallery.getImageGalleryBodyContent();

		if (imageGalleryBodyContent != null) {
			renderedAttributes.add(renderString(ImageGallery.IMAGE_GALLERY_BODY_CONTENT, imageGalleryBodyContent));
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

	protected void renderImageGalleryId(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String imageGalleryId = imageGallery.getImageGalleryId();

		if (imageGalleryId != null) {
			renderedAttributes.add(renderString(ImageGallery.IMAGE_GALLERY_ID, imageGalleryId));
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

	protected void renderImageGalleryLocale(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String imageGalleryLocale = imageGallery.getImageGalleryLocale();

		if (imageGalleryLocale != null) {
			renderedAttributes.add(renderString(ImageGallery.IMAGE_GALLERY_LOCALE, imageGalleryLocale));
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

	protected void renderAfterAlignChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterAlignChange = imageGallery.getAfterAlignChange();

		if (afterAlignChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_ALIGN_CHANGE, afterAlignChange));
		}
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterAlignOnChange = imageGallery.getAfterAlignOnChange();

		if (afterAlignOnChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
		}
	}

	protected void renderAfterAnimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterAnimChange = imageGallery.getAfterAnimChange();

		if (afterAnimChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_ANIM_CHANGE, afterAnimChange));
		}
	}

	protected void renderAfterAutoPlayChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterAutoPlayChange = imageGallery.getAfterAutoPlayChange();

		if (afterAutoPlayChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_AUTO_PLAY_CHANGE, afterAutoPlayChange));
		}
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterBodyContentChange = imageGallery.getAfterBodyContentChange();

		if (afterBodyContentChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterBoundingBoxChange = imageGallery.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCaptionChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCaptionChange = imageGallery.getAfterCaptionChange();

		if (afterCaptionChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CAPTION_CHANGE, afterCaptionChange));
		}
	}

	protected void renderAfterCaptionElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCaptionElChange = imageGallery.getAfterCaptionElChange();

		if (afterCaptionElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CAPTION_EL_CHANGE, afterCaptionElChange));
		}
	}

	protected void renderAfterCaptionFromTitleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCaptionFromTitleChange = imageGallery.getAfterCaptionFromTitleChange();

		if (afterCaptionFromTitleChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CAPTION_FROM_TITLE_CHANGE, afterCaptionFromTitleChange));
		}
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCenteredChange = imageGallery.getAfterCenteredChange();

		if (afterCenteredChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CENTERED_CHANGE, afterCenteredChange));
		}
	}

	protected void renderAfterCloseElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCloseElChange = imageGallery.getAfterCloseElChange();

		if (afterCloseElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CLOSE_EL_CHANGE, afterCloseElChange));
		}
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterConstrainChange = imageGallery.getAfterConstrainChange();

		if (afterConstrainChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterContentBoxChange = imageGallery.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlLeftElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterControlLeftElChange = imageGallery.getAfterControlLeftElChange();

		if (afterControlLeftElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CONTROL_LEFT_EL_CHANGE, afterControlLeftElChange));
		}
	}

	protected void renderAfterControlRightElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterControlRightElChange = imageGallery.getAfterControlRightElChange();

		if (afterControlRightElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CONTROL_RIGHT_EL_CHANGE, afterControlRightElChange));
		}
	}

	protected void renderAfterCurrentIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCurrentIndexChange = imageGallery.getAfterCurrentIndexChange();

		if (afterCurrentIndexChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_CURRENT_INDEX_CHANGE, afterCurrentIndexChange));
		}
	}

	protected void renderAfterDelayChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterDelayChange = imageGallery.getAfterDelayChange();

		if (afterDelayChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_DELAY_CHANGE, afterDelayChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterDestroyedChange = imageGallery.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterDisabledChange = imageGallery.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterFillHeightChange = imageGallery.getAfterFillHeightChange();

		if (afterFillHeightChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
		}
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterFocusOnChange = imageGallery.getAfterFocusOnChange();

		if (afterFocusOnChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterFocusedChange = imageGallery.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterFooterContentChange = imageGallery.getAfterFooterContentChange();

		if (afterFooterContentChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
		}
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterHeaderContentChange = imageGallery.getAfterHeaderContentChange();

		if (afterHeaderContentChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterHeightChange = imageGallery.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterIdChange = imageGallery.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterImageChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterImageChange = imageGallery.getAfterImageChange();

		if (afterImageChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_IMAGE_CHANGE, afterImageChange));
		}
	}

	protected void renderAfterImageAnimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterImageAnimChange = imageGallery.getAfterImageAnimChange();

		if (afterImageAnimChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_IMAGE_ANIM_CHANGE, afterImageAnimChange));
		}
	}

	protected void renderAfterInfoElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterInfoElChange = imageGallery.getAfterInfoElChange();

		if (afterInfoElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_INFO_EL_CHANGE, afterInfoElChange));
		}
	}

	protected void renderAfterInfoTemplateChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterInfoTemplateChange = imageGallery.getAfterInfoTemplateChange();

		if (afterInfoTemplateChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_INFO_TEMPLATE_CHANGE, afterInfoTemplateChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterInitializedChange = imageGallery.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLinksChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLinksChange = imageGallery.getAfterLinksChange();

		if (afterLinksChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_LINKS_CHANGE, afterLinksChange));
		}
	}

	protected void renderAfterLoaderChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLoaderChange = imageGallery.getAfterLoaderChange();

		if (afterLoaderChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_LOADER_CHANGE, afterLoaderChange));
		}
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLoadingChange = imageGallery.getAfterLoadingChange();

		if (afterLoadingChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_LOADING_CHANGE, afterLoadingChange));
		}
	}

	protected void renderAfterLoadingElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLoadingElChange = imageGallery.getAfterLoadingElChange();

		if (afterLoadingElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_LOADING_EL_CHANGE, afterLoadingElChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLocaleChange = imageGallery.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterMaskNodeChange = imageGallery.getAfterMaskNodeChange();

		if (afterMaskNodeChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
		}
	}

	protected void renderAfterMaxHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterMaxHeightChange = imageGallery.getAfterMaxHeightChange();

		if (afterMaxHeightChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_MAX_HEIGHT_CHANGE, afterMaxHeightChange));
		}
	}

	protected void renderAfterMaxWidthChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterMaxWidthChange = imageGallery.getAfterMaxWidthChange();

		if (afterMaxWidthChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_MAX_WIDTH_CHANGE, afterMaxWidthChange));
		}
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterModalChange = imageGallery.getAfterModalChange();

		if (afterModalChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_MODAL_CHANGE, afterModalChange));
		}
	}

	protected void renderAfterPaginationChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPaginationChange = imageGallery.getAfterPaginationChange();

		if (afterPaginationChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_PAGINATION_CHANGE, afterPaginationChange));
		}
	}

	protected void renderAfterPaginationElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPaginationElChange = imageGallery.getAfterPaginationElChange();

		if (afterPaginationElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_PAGINATION_EL_CHANGE, afterPaginationElChange));
		}
	}

	protected void renderAfterPaginationInstanceChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPaginationInstanceChange = imageGallery.getAfterPaginationInstanceChange();

		if (afterPaginationInstanceChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_PAGINATION_INSTANCE_CHANGE, afterPaginationInstanceChange));
		}
	}

	protected void renderAfterPausedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPausedChange = imageGallery.getAfterPausedChange();

		if (afterPausedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_PAUSED_CHANGE, afterPausedChange));
		}
	}

	protected void renderAfterPausedLabelChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPausedLabelChange = imageGallery.getAfterPausedLabelChange();

		if (afterPausedLabelChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_PAUSED_LABEL_CHANGE, afterPausedLabelChange));
		}
	}

	protected void renderAfterPlayingChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPlayingChange = imageGallery.getAfterPlayingChange();

		if (afterPlayingChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_PLAYING_CHANGE, afterPlayingChange));
		}
	}

	protected void renderAfterPlayingLabelChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPlayingLabelChange = imageGallery.getAfterPlayingLabelChange();

		if (afterPlayingLabelChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_PLAYING_LABEL_CHANGE, afterPlayingLabelChange));
		}
	}

	protected void renderAfterPreloadAllImagesChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPreloadAllImagesChange = imageGallery.getAfterPreloadAllImagesChange();

		if (afterPreloadAllImagesChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_PRELOAD_ALL_IMAGES_CHANGE, afterPreloadAllImagesChange));
		}
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPreventOverlapChange = imageGallery.getAfterPreventOverlapChange();

		if (afterPreventOverlapChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterRenderChange = imageGallery.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterRenderedChange = imageGallery.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterRepeatChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterRepeatChange = imageGallery.getAfterRepeatChange();

		if (afterRepeatChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_REPEAT_CHANGE, afterRepeatChange));
		}
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterShimChange = imageGallery.getAfterShimChange();

		if (afterShimChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_SHIM_CHANGE, afterShimChange));
		}
	}

	protected void renderAfterShowCloseChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterShowCloseChange = imageGallery.getAfterShowCloseChange();

		if (afterShowCloseChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_SHOW_CLOSE_CHANGE, afterShowCloseChange));
		}
	}

	protected void renderAfterShowControlsChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterShowControlsChange = imageGallery.getAfterShowControlsChange();

		if (afterShowControlsChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_SHOW_CONTROLS_CHANGE, afterShowControlsChange));
		}
	}

	protected void renderAfterShowPlayerChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterShowPlayerChange = imageGallery.getAfterShowPlayerChange();

		if (afterShowPlayerChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_SHOW_PLAYER_CHANGE, afterShowPlayerChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterSrcNodeChange = imageGallery.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterStringsChange = imageGallery.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterTabIndexChange = imageGallery.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterToolbarChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterToolbarChange = imageGallery.getAfterToolbarChange();

		if (afterToolbarChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_TOOLBAR_CHANGE, afterToolbarChange));
		}
	}

	protected void renderAfterTotalLinksChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterTotalLinksChange = imageGallery.getAfterTotalLinksChange();

		if (afterTotalLinksChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_TOTAL_LINKS_CHANGE, afterTotalLinksChange));
		}
	}

	protected void renderAfterUseOriginalImageChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterUseOriginalImageChange = imageGallery.getAfterUseOriginalImageChange();

		if (afterUseOriginalImageChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_USE_ORIGINAL_IMAGE_CHANGE, afterUseOriginalImageChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterVisibleChange = imageGallery.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterWidthChange = imageGallery.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterXChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterXChange = imageGallery.getAfterXChange();

		if (afterXChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_XCHANGE, afterXChange));
		}
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterXyChange = imageGallery.getAfterXyChange();

		if (afterXyChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_XY_CHANGE, afterXyChange));
		}
	}

	protected void renderAfterYChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterYChange = imageGallery.getAfterYChange();

		if (afterYChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_YCHANGE, afterYChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterZIndexChange = imageGallery.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(ImageGallery.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onAlignChange = imageGallery.getOnAlignChange();

		if (onAlignChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_ALIGN_CHANGE, onAlignChange));
		}
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onAlignOnChange = imageGallery.getOnAlignOnChange();

		if (onAlignOnChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_ALIGN_ON_CHANGE, onAlignOnChange));
		}
	}

	protected void renderOnAnimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onAnimChange = imageGallery.getOnAnimChange();

		if (onAnimChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_ANIM_CHANGE, onAnimChange));
		}
	}

	protected void renderOnAutoPlayChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onAutoPlayChange = imageGallery.getOnAutoPlayChange();

		if (onAutoPlayChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_AUTO_PLAY_CHANGE, onAutoPlayChange));
		}
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onBodyContentChange = imageGallery.getOnBodyContentChange();

		if (onBodyContentChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onBoundingBoxChange = imageGallery.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCaptionChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCaptionChange = imageGallery.getOnCaptionChange();

		if (onCaptionChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CAPTION_CHANGE, onCaptionChange));
		}
	}

	protected void renderOnCaptionElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCaptionElChange = imageGallery.getOnCaptionElChange();

		if (onCaptionElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CAPTION_EL_CHANGE, onCaptionElChange));
		}
	}

	protected void renderOnCaptionFromTitleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCaptionFromTitleChange = imageGallery.getOnCaptionFromTitleChange();

		if (onCaptionFromTitleChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CAPTION_FROM_TITLE_CHANGE, onCaptionFromTitleChange));
		}
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCenteredChange = imageGallery.getOnCenteredChange();

		if (onCenteredChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CENTERED_CHANGE, onCenteredChange));
		}
	}

	protected void renderOnCloseElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCloseElChange = imageGallery.getOnCloseElChange();

		if (onCloseElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CLOSE_EL_CHANGE, onCloseElChange));
		}
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onConstrainChange = imageGallery.getOnConstrainChange();

		if (onConstrainChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CONSTRAIN_CHANGE, onConstrainChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onContentBoxChange = imageGallery.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlLeftElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onControlLeftElChange = imageGallery.getOnControlLeftElChange();

		if (onControlLeftElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CONTROL_LEFT_EL_CHANGE, onControlLeftElChange));
		}
	}

	protected void renderOnControlRightElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onControlRightElChange = imageGallery.getOnControlRightElChange();

		if (onControlRightElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CONTROL_RIGHT_EL_CHANGE, onControlRightElChange));
		}
	}

	protected void renderOnCurrentIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCurrentIndexChange = imageGallery.getOnCurrentIndexChange();

		if (onCurrentIndexChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_CURRENT_INDEX_CHANGE, onCurrentIndexChange));
		}
	}

	protected void renderOnDelayChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onDelayChange = imageGallery.getOnDelayChange();

		if (onDelayChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_DELAY_CHANGE, onDelayChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onDestroyedChange = imageGallery.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onDisabledChange = imageGallery.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onFillHeightChange = imageGallery.getOnFillHeightChange();

		if (onFillHeightChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
		}
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onFocusOnChange = imageGallery.getOnFocusOnChange();

		if (onFocusOnChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_FOCUS_ON_CHANGE, onFocusOnChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onFocusedChange = imageGallery.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onFooterContentChange = imageGallery.getOnFooterContentChange();

		if (onFooterContentChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
		}
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onHeaderContentChange = imageGallery.getOnHeaderContentChange();

		if (onHeaderContentChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onHeightChange = imageGallery.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onIdChange = imageGallery.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnImageChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onImageChange = imageGallery.getOnImageChange();

		if (onImageChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_IMAGE_CHANGE, onImageChange));
		}
	}

	protected void renderOnImageAnimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onImageAnimChange = imageGallery.getOnImageAnimChange();

		if (onImageAnimChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_IMAGE_ANIM_CHANGE, onImageAnimChange));
		}
	}

	protected void renderOnInfoElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onInfoElChange = imageGallery.getOnInfoElChange();

		if (onInfoElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_INFO_EL_CHANGE, onInfoElChange));
		}
	}

	protected void renderOnInfoTemplateChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onInfoTemplateChange = imageGallery.getOnInfoTemplateChange();

		if (onInfoTemplateChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_INFO_TEMPLATE_CHANGE, onInfoTemplateChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onInitializedChange = imageGallery.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLinksChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLinksChange = imageGallery.getOnLinksChange();

		if (onLinksChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_LINKS_CHANGE, onLinksChange));
		}
	}

	protected void renderOnLoaderChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLoaderChange = imageGallery.getOnLoaderChange();

		if (onLoaderChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_LOADER_CHANGE, onLoaderChange));
		}
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLoadingChange = imageGallery.getOnLoadingChange();

		if (onLoadingChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_LOADING_CHANGE, onLoadingChange));
		}
	}

	protected void renderOnLoadingElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLoadingElChange = imageGallery.getOnLoadingElChange();

		if (onLoadingElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_LOADING_EL_CHANGE, onLoadingElChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLocaleChange = imageGallery.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onMaskNodeChange = imageGallery.getOnMaskNodeChange();

		if (onMaskNodeChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_MASK_NODE_CHANGE, onMaskNodeChange));
		}
	}

	protected void renderOnMaxHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onMaxHeightChange = imageGallery.getOnMaxHeightChange();

		if (onMaxHeightChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_MAX_HEIGHT_CHANGE, onMaxHeightChange));
		}
	}

	protected void renderOnMaxWidthChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onMaxWidthChange = imageGallery.getOnMaxWidthChange();

		if (onMaxWidthChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_MAX_WIDTH_CHANGE, onMaxWidthChange));
		}
	}

	protected void renderOnModalChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onModalChange = imageGallery.getOnModalChange();

		if (onModalChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_MODAL_CHANGE, onModalChange));
		}
	}

	protected void renderOnPaginationChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPaginationChange = imageGallery.getOnPaginationChange();

		if (onPaginationChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_PAGINATION_CHANGE, onPaginationChange));
		}
	}

	protected void renderOnPaginationElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPaginationElChange = imageGallery.getOnPaginationElChange();

		if (onPaginationElChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_PAGINATION_EL_CHANGE, onPaginationElChange));
		}
	}

	protected void renderOnPaginationInstanceChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPaginationInstanceChange = imageGallery.getOnPaginationInstanceChange();

		if (onPaginationInstanceChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_PAGINATION_INSTANCE_CHANGE, onPaginationInstanceChange));
		}
	}

	protected void renderOnPausedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPausedChange = imageGallery.getOnPausedChange();

		if (onPausedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_PAUSED_CHANGE, onPausedChange));
		}
	}

	protected void renderOnPausedLabelChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPausedLabelChange = imageGallery.getOnPausedLabelChange();

		if (onPausedLabelChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_PAUSED_LABEL_CHANGE, onPausedLabelChange));
		}
	}

	protected void renderOnPlayingChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPlayingChange = imageGallery.getOnPlayingChange();

		if (onPlayingChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_PLAYING_CHANGE, onPlayingChange));
		}
	}

	protected void renderOnPlayingLabelChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPlayingLabelChange = imageGallery.getOnPlayingLabelChange();

		if (onPlayingLabelChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_PLAYING_LABEL_CHANGE, onPlayingLabelChange));
		}
	}

	protected void renderOnPreloadAllImagesChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPreloadAllImagesChange = imageGallery.getOnPreloadAllImagesChange();

		if (onPreloadAllImagesChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_PRELOAD_ALL_IMAGES_CHANGE, onPreloadAllImagesChange));
		}
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPreventOverlapChange = imageGallery.getOnPreventOverlapChange();

		if (onPreventOverlapChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onRenderChange = imageGallery.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onRenderedChange = imageGallery.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnRepeatChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onRepeatChange = imageGallery.getOnRepeatChange();

		if (onRepeatChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_REPEAT_CHANGE, onRepeatChange));
		}
	}

	protected void renderOnShimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onShimChange = imageGallery.getOnShimChange();

		if (onShimChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_SHIM_CHANGE, onShimChange));
		}
	}

	protected void renderOnShowCloseChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onShowCloseChange = imageGallery.getOnShowCloseChange();

		if (onShowCloseChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_SHOW_CLOSE_CHANGE, onShowCloseChange));
		}
	}

	protected void renderOnShowControlsChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onShowControlsChange = imageGallery.getOnShowControlsChange();

		if (onShowControlsChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_SHOW_CONTROLS_CHANGE, onShowControlsChange));
		}
	}

	protected void renderOnShowPlayerChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onShowPlayerChange = imageGallery.getOnShowPlayerChange();

		if (onShowPlayerChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_SHOW_PLAYER_CHANGE, onShowPlayerChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onSrcNodeChange = imageGallery.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onStringsChange = imageGallery.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onTabIndexChange = imageGallery.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnToolbarChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onToolbarChange = imageGallery.getOnToolbarChange();

		if (onToolbarChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_TOOLBAR_CHANGE, onToolbarChange));
		}
	}

	protected void renderOnTotalLinksChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onTotalLinksChange = imageGallery.getOnTotalLinksChange();

		if (onTotalLinksChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_TOTAL_LINKS_CHANGE, onTotalLinksChange));
		}
	}

	protected void renderOnUseOriginalImageChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onUseOriginalImageChange = imageGallery.getOnUseOriginalImageChange();

		if (onUseOriginalImageChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_USE_ORIGINAL_IMAGE_CHANGE, onUseOriginalImageChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onVisibleChange = imageGallery.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onWidthChange = imageGallery.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnXChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onXChange = imageGallery.getOnXChange();

		if (onXChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_XCHANGE, onXChange));
		}
	}

	protected void renderOnXyChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onXyChange = imageGallery.getOnXyChange();

		if (onXyChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_XY_CHANGE, onXyChange));
		}
	}

	protected void renderOnYChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onYChange = imageGallery.getOnYChange();

		if (onYChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_YCHANGE, onYChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onZIndexChange = imageGallery.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(ImageGallery.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}