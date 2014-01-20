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

		if (imageGallery.getAlign() != null) {
			renderAlign(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getAnim() != null) {
			renderAnim(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getAutoPlay() != null) {
			renderAutoPlay(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getImageGalleryBodyContent() != null) {
			renderImageGalleryBodyContent(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getCaption() != null) {
			renderCaption(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getCaptionEl() != null) {
			renderCaptionEl(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getCaptionFromTitle() != null) {
			renderCaptionFromTitle(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getCentered() != null) {
			renderCentered(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getCloseEl() != null) {
			renderCloseEl(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getConstrain() != null) {
			renderConstrain(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getContentBox() != null) {
			renderContentBox(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getControlLeftEl() != null) {
			renderControlLeftEl(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getControlRightEl() != null) {
			renderControlRightEl(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getCurrentIndex() != null) {
			renderCurrentIndex(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getDelay() != null) {
			renderDelay(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getDisabled() != null) {
			renderDisabled(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getFocusOn() != null) {
			renderFocusOn(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getFocused() != null) {
			renderFocused(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getHeight() != null) {
			renderHeight(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getImageGalleryId() != null) {
			renderImageGalleryId(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getImage() != null) {
			renderImage(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getImageAnim() != null) {
			renderImageAnim(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getInfoEl() != null) {
			renderInfoEl(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getInfoTemplate() != null) {
			renderInfoTemplate(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getInitialized() != null) {
			renderInitialized(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getLinks() != null) {
			renderLinks(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getLoader() != null) {
			renderLoader(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getLoading() != null) {
			renderLoading(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getLoadingEl() != null) {
			renderLoadingEl(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getImageGalleryLocale() != null) {
			renderImageGalleryLocale(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getMaskNode() != null) {
			renderMaskNode(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getMaxHeight() != null) {
			renderMaxHeight(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getMaxWidth() != null) {
			renderMaxWidth(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getModal() != null) {
			renderModal(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getPagination() != null) {
			renderPagination(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getPaginationEl() != null) {
			renderPaginationEl(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getPaginationInstance() != null) {
			renderPaginationInstance(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getPaused() != null) {
			renderPaused(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getPausedLabel() != null) {
			renderPausedLabel(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getPlaying() != null) {
			renderPlaying(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getPlayingLabel() != null) {
			renderPlayingLabel(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getPreloadAllImages() != null) {
			renderPreloadAllImages(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getRender() != null) {
			renderRender(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getRendered() != null) {
			renderRendered(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getRepeat() != null) {
			renderRepeat(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getShim() != null) {
			renderShim(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getShowClose() != null) {
			renderShowClose(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getShowControls() != null) {
			renderShowControls(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getShowPlayer() != null) {
			renderShowPlayer(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getStrings() != null) {
			renderStrings(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getToolbar() != null) {
			renderToolbar(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getTotalLinks() != null) {
			renderTotalLinks(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getUseOriginalImage() != null) {
			renderUseOriginalImage(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getVisible() != null) {
			renderVisible(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getWidth() != null) {
			renderWidth(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getX() != null) {
			renderX(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getXy() != null) {
			renderXy(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getY() != null) {
			renderY(renderedAttributes, imageGallery);
		}
		
		if (imageGallery.getZIndex() != null) {
			renderZIndex(renderedAttributes, imageGallery);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (imageGallery.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterAnimChange() != null) {
			renderAfterAnimChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterAutoPlayChange() != null) {
			renderAfterAutoPlayChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterCaptionChange() != null) {
			renderAfterCaptionChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterCaptionElChange() != null) {
			renderAfterCaptionElChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterCaptionFromTitleChange() != null) {
			renderAfterCaptionFromTitleChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterCloseElChange() != null) {
			renderAfterCloseElChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterControlLeftElChange() != null) {
			renderAfterControlLeftElChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterControlRightElChange() != null) {
			renderAfterControlRightElChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterCurrentIndexChange() != null) {
			renderAfterCurrentIndexChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterDelayChange() != null) {
			renderAfterDelayChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterFocusOnChange() != null) {
			renderAfterFocusOnChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterImageChange() != null) {
			renderAfterImageChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterImageAnimChange() != null) {
			renderAfterImageAnimChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterInfoElChange() != null) {
			renderAfterInfoElChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterInfoTemplateChange() != null) {
			renderAfterInfoTemplateChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterLinksChange() != null) {
			renderAfterLinksChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterLoaderChange() != null) {
			renderAfterLoaderChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterLoadingChange() != null) {
			renderAfterLoadingChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterLoadingElChange() != null) {
			renderAfterLoadingElChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterMaskNodeChange() != null) {
			renderAfterMaskNodeChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterMaxHeightChange() != null) {
			renderAfterMaxHeightChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterMaxWidthChange() != null) {
			renderAfterMaxWidthChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterModalChange() != null) {
			renderAfterModalChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterPaginationChange() != null) {
			renderAfterPaginationChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterPaginationElChange() != null) {
			renderAfterPaginationElChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterPaginationInstanceChange() != null) {
			renderAfterPaginationInstanceChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterPausedChange() != null) {
			renderAfterPausedChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterPausedLabelChange() != null) {
			renderAfterPausedLabelChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterPlayingChange() != null) {
			renderAfterPlayingChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterPlayingLabelChange() != null) {
			renderAfterPlayingLabelChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterPreloadAllImagesChange() != null) {
			renderAfterPreloadAllImagesChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterRepeatChange() != null) {
			renderAfterRepeatChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterShowCloseChange() != null) {
			renderAfterShowCloseChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterShowControlsChange() != null) {
			renderAfterShowControlsChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterShowPlayerChange() != null) {
			renderAfterShowPlayerChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterToolbarChange() != null) {
			renderAfterToolbarChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterTotalLinksChange() != null) {
			renderAfterTotalLinksChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterUseOriginalImageChange() != null) {
			renderAfterUseOriginalImageChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, imageGallery);
		}
		
		if (imageGallery.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, imageGallery);
		}
		

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

		if (imageGallery.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnAnimChange() != null) {
			renderOnAnimChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnAutoPlayChange() != null) {
			renderOnAutoPlayChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnCaptionChange() != null) {
			renderOnCaptionChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnCaptionElChange() != null) {
			renderOnCaptionElChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnCaptionFromTitleChange() != null) {
			renderOnCaptionFromTitleChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnCloseElChange() != null) {
			renderOnCloseElChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnControlLeftElChange() != null) {
			renderOnControlLeftElChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnControlRightElChange() != null) {
			renderOnControlRightElChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnCurrentIndexChange() != null) {
			renderOnCurrentIndexChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnDelayChange() != null) {
			renderOnDelayChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnFocusOnChange() != null) {
			renderOnFocusOnChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnImageChange() != null) {
			renderOnImageChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnImageAnimChange() != null) {
			renderOnImageAnimChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnInfoElChange() != null) {
			renderOnInfoElChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnInfoTemplateChange() != null) {
			renderOnInfoTemplateChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnLinksChange() != null) {
			renderOnLinksChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnLoaderChange() != null) {
			renderOnLoaderChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnLoadingChange() != null) {
			renderOnLoadingChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnLoadingElChange() != null) {
			renderOnLoadingElChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnMaskNodeChange() != null) {
			renderOnMaskNodeChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnMaxHeightChange() != null) {
			renderOnMaxHeightChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnMaxWidthChange() != null) {
			renderOnMaxWidthChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnModalChange() != null) {
			renderOnModalChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnPaginationChange() != null) {
			renderOnPaginationChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnPaginationElChange() != null) {
			renderOnPaginationElChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnPaginationInstanceChange() != null) {
			renderOnPaginationInstanceChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnPausedChange() != null) {
			renderOnPausedChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnPausedLabelChange() != null) {
			renderOnPausedLabelChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnPlayingChange() != null) {
			renderOnPlayingChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnPlayingLabelChange() != null) {
			renderOnPlayingLabelChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnPreloadAllImagesChange() != null) {
			renderOnPreloadAllImagesChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnRepeatChange() != null) {
			renderOnRepeatChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnShowCloseChange() != null) {
			renderOnShowCloseChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnShowControlsChange() != null) {
			renderOnShowControlsChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnShowPlayerChange() != null) {
			renderOnShowPlayerChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnToolbarChange() != null) {
			renderOnToolbarChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnTotalLinksChange() != null) {
			renderOnTotalLinksChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnUseOriginalImageChange() != null) {
			renderOnUseOriginalImageChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, imageGallery);
		}
		
		if (imageGallery.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, imageGallery);
		}
		

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
		renderedAttributes.add(renderObject(ImageGallery.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object alignOn = imageGallery.getAlignOn();
		renderedAttributes.add(renderArray(ImageGallery.ALIGN_ON, alignOn));
	}

	protected void renderAnim(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean anim = imageGallery.getAnim();
		renderedAttributes.add(renderBoolean(ImageGallery.ANIM, anim));
	}

	protected void renderAutoPlay(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean autoPlay = imageGallery.getAutoPlay();
		renderedAttributes.add(renderBoolean(ImageGallery.AUTO_PLAY, autoPlay));
	}

	protected void renderImageGalleryBodyContent(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String imageGalleryBodyContent = imageGallery.getImageGalleryBodyContent();
		renderedAttributes.add(renderString(ImageGallery.IMAGE_GALLERY_BODY_CONTENT, imageGalleryBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String boundingBox = imageGallery.getBoundingBox();
		renderedAttributes.add(renderString(ImageGallery.BOUNDING_BOX, boundingBox));
	}

	protected void renderCaption(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String caption = imageGallery.getCaption();
		renderedAttributes.add(renderString(ImageGallery.CAPTION, caption));
	}

	protected void renderCaptionEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object captionEl = imageGallery.getCaptionEl();
		renderedAttributes.add(renderString(ImageGallery.CAPTION_EL, captionEl));
	}

	protected void renderCaptionFromTitle(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean captionFromTitle = imageGallery.getCaptionFromTitle();
		renderedAttributes.add(renderBoolean(ImageGallery.CAPTION_FROM_TITLE, captionFromTitle));
	}

	protected void renderCentered(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean centered = imageGallery.getCentered();
		renderedAttributes.add(renderBoolean(ImageGallery.CENTERED, centered));
	}

	protected void renderCloseEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object closeEl = imageGallery.getCloseEl();
		renderedAttributes.add(renderString(ImageGallery.CLOSE_EL, closeEl));
	}

	protected void renderConstrain(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object constrain = imageGallery.getConstrain();
		renderedAttributes.add(renderString(ImageGallery.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String contentBox = imageGallery.getContentBox();
		renderedAttributes.add(renderString(ImageGallery.CONTENT_BOX, contentBox));
	}

	protected void renderControlLeftEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object controlLeftEl = imageGallery.getControlLeftEl();
		renderedAttributes.add(renderString(ImageGallery.CONTROL_LEFT_EL, controlLeftEl));
	}

	protected void renderControlRightEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object controlRightEl = imageGallery.getControlRightEl();
		renderedAttributes.add(renderString(ImageGallery.CONTROL_RIGHT_EL, controlRightEl));
	}

	protected void renderCurrentIndex(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object currentIndex = imageGallery.getCurrentIndex();
		renderedAttributes.add(renderNumber(ImageGallery.CURRENT_INDEX, currentIndex));
	}

	protected void renderDelay(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object delay = imageGallery.getDelay();
		renderedAttributes.add(renderNumber(ImageGallery.DELAY, delay));
	}

	protected void renderDestroyed(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean destroyed = imageGallery.getDestroyed();
		renderedAttributes.add(renderBoolean(ImageGallery.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean disabled = imageGallery.getDisabled();
		renderedAttributes.add(renderBoolean(ImageGallery.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object fillHeight = imageGallery.getFillHeight();
		renderedAttributes.add(renderString(ImageGallery.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocusOn(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object focusOn = imageGallery.getFocusOn();
		renderedAttributes.add(renderArray(ImageGallery.FOCUS_ON, focusOn));
	}

	protected void renderFocused(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean focused = imageGallery.getFocused();
		renderedAttributes.add(renderBoolean(ImageGallery.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object footerContent = imageGallery.getFooterContent();
		renderedAttributes.add(renderString(ImageGallery.FOOTER_CONTENT, footerContent));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object headerContent = imageGallery.getHeaderContent();
		renderedAttributes.add(renderString(ImageGallery.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object height = imageGallery.getHeight();
		renderedAttributes.add(renderString(ImageGallery.HEIGHT, height));
	}

	protected void renderImageGalleryId(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String imageGalleryId = imageGallery.getImageGalleryId();
		renderedAttributes.add(renderString(ImageGallery.IMAGE_GALLERY_ID, imageGalleryId));
	}

	protected void renderImage(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object image = imageGallery.getImage();
		renderedAttributes.add(renderString(ImageGallery.IMAGE, image));
	}

	protected void renderImageAnim(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object imageAnim = imageGallery.getImageAnim();
		renderedAttributes.add(renderObject(ImageGallery.IMAGE_ANIM, imageAnim));
	}

	protected void renderInfoEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object infoEl = imageGallery.getInfoEl();
		renderedAttributes.add(renderString(ImageGallery.INFO_EL, infoEl));
	}

	protected void renderInfoTemplate(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String infoTemplate = imageGallery.getInfoTemplate();
		renderedAttributes.add(renderString(ImageGallery.INFO_TEMPLATE, infoTemplate));
	}

	protected void renderInitialized(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean initialized = imageGallery.getInitialized();
		renderedAttributes.add(renderBoolean(ImageGallery.INITIALIZED, initialized));
	}

	protected void renderLinks(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object links = imageGallery.getLinks();
		renderedAttributes.add(renderString(ImageGallery.LINKS, links));
	}

	protected void renderLoader(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object loader = imageGallery.getLoader();
		renderedAttributes.add(renderString(ImageGallery.LOADER, loader));
	}

	protected void renderLoading(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean loading = imageGallery.getLoading();
		renderedAttributes.add(renderBoolean(ImageGallery.LOADING, loading));
	}

	protected void renderLoadingEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object loadingEl = imageGallery.getLoadingEl();
		renderedAttributes.add(renderString(ImageGallery.LOADING_EL, loadingEl));
	}

	protected void renderImageGalleryLocale(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String imageGalleryLocale = imageGallery.getImageGalleryLocale();
		renderedAttributes.add(renderString(ImageGallery.IMAGE_GALLERY_LOCALE, imageGalleryLocale));
	}

	protected void renderMaskNode(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object maskNode = imageGallery.getMaskNode();
		renderedAttributes.add(renderString(ImageGallery.MASK_NODE, maskNode));
	}

	protected void renderMaxHeight(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object maxHeight = imageGallery.getMaxHeight();
		renderedAttributes.add(renderNumber(ImageGallery.MAX_HEIGHT, maxHeight));
	}

	protected void renderMaxWidth(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object maxWidth = imageGallery.getMaxWidth();
		renderedAttributes.add(renderNumber(ImageGallery.MAX_WIDTH, maxWidth));
	}

	protected void renderModal(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean modal = imageGallery.getModal();
		renderedAttributes.add(renderBoolean(ImageGallery.MODAL, modal));
	}

	protected void renderPagination(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object pagination = imageGallery.getPagination();
		renderedAttributes.add(renderObject(ImageGallery.PAGINATION, pagination));
	}

	protected void renderPaginationEl(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object paginationEl = imageGallery.getPaginationEl();
		renderedAttributes.add(renderString(ImageGallery.PAGINATION_EL, paginationEl));
	}

	protected void renderPaginationInstance(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object paginationInstance = imageGallery.getPaginationInstance();
		renderedAttributes.add(renderString(ImageGallery.PAGINATION_INSTANCE, paginationInstance));
	}

	protected void renderPaused(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean paused = imageGallery.getPaused();
		renderedAttributes.add(renderBoolean(ImageGallery.PAUSED, paused));
	}

	protected void renderPausedLabel(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String pausedLabel = imageGallery.getPausedLabel();
		renderedAttributes.add(renderString(ImageGallery.PAUSED_LABEL, pausedLabel));
	}

	protected void renderPlaying(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean playing = imageGallery.getPlaying();
		renderedAttributes.add(renderBoolean(ImageGallery.PLAYING, playing));
	}

	protected void renderPlayingLabel(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String playingLabel = imageGallery.getPlayingLabel();
		renderedAttributes.add(renderString(ImageGallery.PLAYING_LABEL, playingLabel));
	}

	protected void renderPreloadAllImages(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean preloadAllImages = imageGallery.getPreloadAllImages();
		renderedAttributes.add(renderBoolean(ImageGallery.PRELOAD_ALL_IMAGES, preloadAllImages));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean preventOverlap = imageGallery.getPreventOverlap();
		renderedAttributes.add(renderBoolean(ImageGallery.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object render = imageGallery.getRender();
		renderedAttributes.add(renderString(ImageGallery.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean rendered = imageGallery.getRendered();
		renderedAttributes.add(renderBoolean(ImageGallery.RENDERED, rendered));
	}

	protected void renderRepeat(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean repeat = imageGallery.getRepeat();
		renderedAttributes.add(renderBoolean(ImageGallery.REPEAT, repeat));
	}

	protected void renderShim(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean shim = imageGallery.getShim();
		renderedAttributes.add(renderBoolean(ImageGallery.SHIM, shim));
	}

	protected void renderShowClose(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean showClose = imageGallery.getShowClose();
		renderedAttributes.add(renderBoolean(ImageGallery.SHOW_CLOSE, showClose));
	}

	protected void renderShowControls(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean showControls = imageGallery.getShowControls();
		renderedAttributes.add(renderBoolean(ImageGallery.SHOW_CONTROLS, showControls));
	}

	protected void renderShowPlayer(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean showPlayer = imageGallery.getShowPlayer();
		renderedAttributes.add(renderBoolean(ImageGallery.SHOW_PLAYER, showPlayer));
	}

	protected void renderSrcNode(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String srcNode = imageGallery.getSrcNode();
		renderedAttributes.add(renderString(ImageGallery.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object strings = imageGallery.getStrings();
		renderedAttributes.add(renderObject(ImageGallery.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object tabIndex = imageGallery.getTabIndex();
		renderedAttributes.add(renderNumber(ImageGallery.TAB_INDEX, tabIndex));
	}

	protected void renderToolbar(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object toolbar = imageGallery.getToolbar();
		renderedAttributes.add(renderString(ImageGallery.TOOLBAR, toolbar));
	}

	protected void renderTotalLinks(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean totalLinks = imageGallery.getTotalLinks();
		renderedAttributes.add(renderBoolean(ImageGallery.TOTAL_LINKS, totalLinks));
	}

	protected void renderUseOriginalImage(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean useOriginalImage = imageGallery.getUseOriginalImage();
		renderedAttributes.add(renderBoolean(ImageGallery.USE_ORIGINAL_IMAGE, useOriginalImage));
	}

	protected void renderVisible(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Boolean visible = imageGallery.getVisible();
		renderedAttributes.add(renderBoolean(ImageGallery.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object width = imageGallery.getWidth();
		renderedAttributes.add(renderString(ImageGallery.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object x = imageGallery.getX();
		renderedAttributes.add(renderNumber(ImageGallery.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object xy = imageGallery.getXy();
		renderedAttributes.add(renderArray(ImageGallery.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object y = imageGallery.getY();
		renderedAttributes.add(renderNumber(ImageGallery.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.Object zIndex = imageGallery.getZIndex();
		renderedAttributes.add(renderNumber(ImageGallery.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterAlignChange = imageGallery.getAfterAlignChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterAlignOnChange = imageGallery.getAfterAlignOnChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterAnimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterAnimChange = imageGallery.getAfterAnimChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_ANIM_CHANGE, afterAnimChange));
	}

	protected void renderAfterAutoPlayChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterAutoPlayChange = imageGallery.getAfterAutoPlayChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_AUTO_PLAY_CHANGE, afterAutoPlayChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterBodyContentChange = imageGallery.getAfterBodyContentChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterBoundingBoxChange = imageGallery.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCaptionChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCaptionChange = imageGallery.getAfterCaptionChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CAPTION_CHANGE, afterCaptionChange));
	}

	protected void renderAfterCaptionElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCaptionElChange = imageGallery.getAfterCaptionElChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CAPTION_EL_CHANGE, afterCaptionElChange));
	}

	protected void renderAfterCaptionFromTitleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCaptionFromTitleChange = imageGallery.getAfterCaptionFromTitleChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CAPTION_FROM_TITLE_CHANGE, afterCaptionFromTitleChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCenteredChange = imageGallery.getAfterCenteredChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterCloseElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCloseElChange = imageGallery.getAfterCloseElChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CLOSE_EL_CHANGE, afterCloseElChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterConstrainChange = imageGallery.getAfterConstrainChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterContentBoxChange = imageGallery.getAfterContentBoxChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlLeftElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterControlLeftElChange = imageGallery.getAfterControlLeftElChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CONTROL_LEFT_EL_CHANGE, afterControlLeftElChange));
	}

	protected void renderAfterControlRightElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterControlRightElChange = imageGallery.getAfterControlRightElChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CONTROL_RIGHT_EL_CHANGE, afterControlRightElChange));
	}

	protected void renderAfterCurrentIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterCurrentIndexChange = imageGallery.getAfterCurrentIndexChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_CURRENT_INDEX_CHANGE, afterCurrentIndexChange));
	}

	protected void renderAfterDelayChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterDelayChange = imageGallery.getAfterDelayChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_DELAY_CHANGE, afterDelayChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterDestroyedChange = imageGallery.getAfterDestroyedChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterDisabledChange = imageGallery.getAfterDisabledChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterFillHeightChange = imageGallery.getAfterFillHeightChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterFocusOnChange = imageGallery.getAfterFocusOnChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterFocusedChange = imageGallery.getAfterFocusedChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterFooterContentChange = imageGallery.getAfterFooterContentChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterHeaderContentChange = imageGallery.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterHeightChange = imageGallery.getAfterHeightChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterIdChange = imageGallery.getAfterIdChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterImageChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterImageChange = imageGallery.getAfterImageChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_IMAGE_CHANGE, afterImageChange));
	}

	protected void renderAfterImageAnimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterImageAnimChange = imageGallery.getAfterImageAnimChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_IMAGE_ANIM_CHANGE, afterImageAnimChange));
	}

	protected void renderAfterInfoElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterInfoElChange = imageGallery.getAfterInfoElChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_INFO_EL_CHANGE, afterInfoElChange));
	}

	protected void renderAfterInfoTemplateChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterInfoTemplateChange = imageGallery.getAfterInfoTemplateChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_INFO_TEMPLATE_CHANGE, afterInfoTemplateChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterInitializedChange = imageGallery.getAfterInitializedChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLinksChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLinksChange = imageGallery.getAfterLinksChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_LINKS_CHANGE, afterLinksChange));
	}

	protected void renderAfterLoaderChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLoaderChange = imageGallery.getAfterLoaderChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_LOADER_CHANGE, afterLoaderChange));
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLoadingChange = imageGallery.getAfterLoadingChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_LOADING_CHANGE, afterLoadingChange));
	}

	protected void renderAfterLoadingElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLoadingElChange = imageGallery.getAfterLoadingElChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_LOADING_EL_CHANGE, afterLoadingElChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterLocaleChange = imageGallery.getAfterLocaleChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterMaskNodeChange = imageGallery.getAfterMaskNodeChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
	}

	protected void renderAfterMaxHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterMaxHeightChange = imageGallery.getAfterMaxHeightChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_MAX_HEIGHT_CHANGE, afterMaxHeightChange));
	}

	protected void renderAfterMaxWidthChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterMaxWidthChange = imageGallery.getAfterMaxWidthChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_MAX_WIDTH_CHANGE, afterMaxWidthChange));
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterModalChange = imageGallery.getAfterModalChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_MODAL_CHANGE, afterModalChange));
	}

	protected void renderAfterPaginationChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPaginationChange = imageGallery.getAfterPaginationChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_PAGINATION_CHANGE, afterPaginationChange));
	}

	protected void renderAfterPaginationElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPaginationElChange = imageGallery.getAfterPaginationElChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_PAGINATION_EL_CHANGE, afterPaginationElChange));
	}

	protected void renderAfterPaginationInstanceChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPaginationInstanceChange = imageGallery.getAfterPaginationInstanceChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_PAGINATION_INSTANCE_CHANGE, afterPaginationInstanceChange));
	}

	protected void renderAfterPausedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPausedChange = imageGallery.getAfterPausedChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_PAUSED_CHANGE, afterPausedChange));
	}

	protected void renderAfterPausedLabelChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPausedLabelChange = imageGallery.getAfterPausedLabelChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_PAUSED_LABEL_CHANGE, afterPausedLabelChange));
	}

	protected void renderAfterPlayingChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPlayingChange = imageGallery.getAfterPlayingChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_PLAYING_CHANGE, afterPlayingChange));
	}

	protected void renderAfterPlayingLabelChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPlayingLabelChange = imageGallery.getAfterPlayingLabelChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_PLAYING_LABEL_CHANGE, afterPlayingLabelChange));
	}

	protected void renderAfterPreloadAllImagesChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPreloadAllImagesChange = imageGallery.getAfterPreloadAllImagesChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_PRELOAD_ALL_IMAGES_CHANGE, afterPreloadAllImagesChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterPreventOverlapChange = imageGallery.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterRenderChange = imageGallery.getAfterRenderChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterRenderedChange = imageGallery.getAfterRenderedChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterRepeatChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterRepeatChange = imageGallery.getAfterRepeatChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_REPEAT_CHANGE, afterRepeatChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterShimChange = imageGallery.getAfterShimChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterShowCloseChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterShowCloseChange = imageGallery.getAfterShowCloseChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_SHOW_CLOSE_CHANGE, afterShowCloseChange));
	}

	protected void renderAfterShowControlsChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterShowControlsChange = imageGallery.getAfterShowControlsChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_SHOW_CONTROLS_CHANGE, afterShowControlsChange));
	}

	protected void renderAfterShowPlayerChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterShowPlayerChange = imageGallery.getAfterShowPlayerChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_SHOW_PLAYER_CHANGE, afterShowPlayerChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterSrcNodeChange = imageGallery.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterStringsChange = imageGallery.getAfterStringsChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterTabIndexChange = imageGallery.getAfterTabIndexChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToolbarChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterToolbarChange = imageGallery.getAfterToolbarChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_TOOLBAR_CHANGE, afterToolbarChange));
	}

	protected void renderAfterTotalLinksChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterTotalLinksChange = imageGallery.getAfterTotalLinksChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_TOTAL_LINKS_CHANGE, afterTotalLinksChange));
	}

	protected void renderAfterUseOriginalImageChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterUseOriginalImageChange = imageGallery.getAfterUseOriginalImageChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_USE_ORIGINAL_IMAGE_CHANGE, afterUseOriginalImageChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterVisibleChange = imageGallery.getAfterVisibleChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterWidthChange = imageGallery.getAfterWidthChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterXChange = imageGallery.getAfterXChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterXyChange = imageGallery.getAfterXyChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterYChange = imageGallery.getAfterYChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String afterZIndexChange = imageGallery.getAfterZIndexChange();
		renderedAttributes.add(renderString(ImageGallery.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onAlignChange = imageGallery.getOnAlignChange();
		renderedAttributes.add(renderString(ImageGallery.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onAlignOnChange = imageGallery.getOnAlignOnChange();
		renderedAttributes.add(renderString(ImageGallery.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnAnimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onAnimChange = imageGallery.getOnAnimChange();
		renderedAttributes.add(renderString(ImageGallery.ON_ANIM_CHANGE, onAnimChange));
	}

	protected void renderOnAutoPlayChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onAutoPlayChange = imageGallery.getOnAutoPlayChange();
		renderedAttributes.add(renderString(ImageGallery.ON_AUTO_PLAY_CHANGE, onAutoPlayChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onBodyContentChange = imageGallery.getOnBodyContentChange();
		renderedAttributes.add(renderString(ImageGallery.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onBoundingBoxChange = imageGallery.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(ImageGallery.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCaptionChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCaptionChange = imageGallery.getOnCaptionChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CAPTION_CHANGE, onCaptionChange));
	}

	protected void renderOnCaptionElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCaptionElChange = imageGallery.getOnCaptionElChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CAPTION_EL_CHANGE, onCaptionElChange));
	}

	protected void renderOnCaptionFromTitleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCaptionFromTitleChange = imageGallery.getOnCaptionFromTitleChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CAPTION_FROM_TITLE_CHANGE, onCaptionFromTitleChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCenteredChange = imageGallery.getOnCenteredChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnCloseElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCloseElChange = imageGallery.getOnCloseElChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CLOSE_EL_CHANGE, onCloseElChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onConstrainChange = imageGallery.getOnConstrainChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onContentBoxChange = imageGallery.getOnContentBoxChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlLeftElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onControlLeftElChange = imageGallery.getOnControlLeftElChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CONTROL_LEFT_EL_CHANGE, onControlLeftElChange));
	}

	protected void renderOnControlRightElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onControlRightElChange = imageGallery.getOnControlRightElChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CONTROL_RIGHT_EL_CHANGE, onControlRightElChange));
	}

	protected void renderOnCurrentIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onCurrentIndexChange = imageGallery.getOnCurrentIndexChange();
		renderedAttributes.add(renderString(ImageGallery.ON_CURRENT_INDEX_CHANGE, onCurrentIndexChange));
	}

	protected void renderOnDelayChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onDelayChange = imageGallery.getOnDelayChange();
		renderedAttributes.add(renderString(ImageGallery.ON_DELAY_CHANGE, onDelayChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onDestroyedChange = imageGallery.getOnDestroyedChange();
		renderedAttributes.add(renderString(ImageGallery.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onDisabledChange = imageGallery.getOnDisabledChange();
		renderedAttributes.add(renderString(ImageGallery.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onFillHeightChange = imageGallery.getOnFillHeightChange();
		renderedAttributes.add(renderString(ImageGallery.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onFocusOnChange = imageGallery.getOnFocusOnChange();
		renderedAttributes.add(renderString(ImageGallery.ON_FOCUS_ON_CHANGE, onFocusOnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onFocusedChange = imageGallery.getOnFocusedChange();
		renderedAttributes.add(renderString(ImageGallery.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onFooterContentChange = imageGallery.getOnFooterContentChange();
		renderedAttributes.add(renderString(ImageGallery.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onHeaderContentChange = imageGallery.getOnHeaderContentChange();
		renderedAttributes.add(renderString(ImageGallery.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onHeightChange = imageGallery.getOnHeightChange();
		renderedAttributes.add(renderString(ImageGallery.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onIdChange = imageGallery.getOnIdChange();
		renderedAttributes.add(renderString(ImageGallery.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnImageChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onImageChange = imageGallery.getOnImageChange();
		renderedAttributes.add(renderString(ImageGallery.ON_IMAGE_CHANGE, onImageChange));
	}

	protected void renderOnImageAnimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onImageAnimChange = imageGallery.getOnImageAnimChange();
		renderedAttributes.add(renderString(ImageGallery.ON_IMAGE_ANIM_CHANGE, onImageAnimChange));
	}

	protected void renderOnInfoElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onInfoElChange = imageGallery.getOnInfoElChange();
		renderedAttributes.add(renderString(ImageGallery.ON_INFO_EL_CHANGE, onInfoElChange));
	}

	protected void renderOnInfoTemplateChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onInfoTemplateChange = imageGallery.getOnInfoTemplateChange();
		renderedAttributes.add(renderString(ImageGallery.ON_INFO_TEMPLATE_CHANGE, onInfoTemplateChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onInitializedChange = imageGallery.getOnInitializedChange();
		renderedAttributes.add(renderString(ImageGallery.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLinksChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLinksChange = imageGallery.getOnLinksChange();
		renderedAttributes.add(renderString(ImageGallery.ON_LINKS_CHANGE, onLinksChange));
	}

	protected void renderOnLoaderChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLoaderChange = imageGallery.getOnLoaderChange();
		renderedAttributes.add(renderString(ImageGallery.ON_LOADER_CHANGE, onLoaderChange));
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLoadingChange = imageGallery.getOnLoadingChange();
		renderedAttributes.add(renderString(ImageGallery.ON_LOADING_CHANGE, onLoadingChange));
	}

	protected void renderOnLoadingElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLoadingElChange = imageGallery.getOnLoadingElChange();
		renderedAttributes.add(renderString(ImageGallery.ON_LOADING_EL_CHANGE, onLoadingElChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onLocaleChange = imageGallery.getOnLocaleChange();
		renderedAttributes.add(renderString(ImageGallery.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onMaskNodeChange = imageGallery.getOnMaskNodeChange();
		renderedAttributes.add(renderString(ImageGallery.ON_MASK_NODE_CHANGE, onMaskNodeChange));
	}

	protected void renderOnMaxHeightChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onMaxHeightChange = imageGallery.getOnMaxHeightChange();
		renderedAttributes.add(renderString(ImageGallery.ON_MAX_HEIGHT_CHANGE, onMaxHeightChange));
	}

	protected void renderOnMaxWidthChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onMaxWidthChange = imageGallery.getOnMaxWidthChange();
		renderedAttributes.add(renderString(ImageGallery.ON_MAX_WIDTH_CHANGE, onMaxWidthChange));
	}

	protected void renderOnModalChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onModalChange = imageGallery.getOnModalChange();
		renderedAttributes.add(renderString(ImageGallery.ON_MODAL_CHANGE, onModalChange));
	}

	protected void renderOnPaginationChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPaginationChange = imageGallery.getOnPaginationChange();
		renderedAttributes.add(renderString(ImageGallery.ON_PAGINATION_CHANGE, onPaginationChange));
	}

	protected void renderOnPaginationElChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPaginationElChange = imageGallery.getOnPaginationElChange();
		renderedAttributes.add(renderString(ImageGallery.ON_PAGINATION_EL_CHANGE, onPaginationElChange));
	}

	protected void renderOnPaginationInstanceChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPaginationInstanceChange = imageGallery.getOnPaginationInstanceChange();
		renderedAttributes.add(renderString(ImageGallery.ON_PAGINATION_INSTANCE_CHANGE, onPaginationInstanceChange));
	}

	protected void renderOnPausedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPausedChange = imageGallery.getOnPausedChange();
		renderedAttributes.add(renderString(ImageGallery.ON_PAUSED_CHANGE, onPausedChange));
	}

	protected void renderOnPausedLabelChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPausedLabelChange = imageGallery.getOnPausedLabelChange();
		renderedAttributes.add(renderString(ImageGallery.ON_PAUSED_LABEL_CHANGE, onPausedLabelChange));
	}

	protected void renderOnPlayingChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPlayingChange = imageGallery.getOnPlayingChange();
		renderedAttributes.add(renderString(ImageGallery.ON_PLAYING_CHANGE, onPlayingChange));
	}

	protected void renderOnPlayingLabelChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPlayingLabelChange = imageGallery.getOnPlayingLabelChange();
		renderedAttributes.add(renderString(ImageGallery.ON_PLAYING_LABEL_CHANGE, onPlayingLabelChange));
	}

	protected void renderOnPreloadAllImagesChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPreloadAllImagesChange = imageGallery.getOnPreloadAllImagesChange();
		renderedAttributes.add(renderString(ImageGallery.ON_PRELOAD_ALL_IMAGES_CHANGE, onPreloadAllImagesChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onPreventOverlapChange = imageGallery.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(ImageGallery.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onRenderChange = imageGallery.getOnRenderChange();
		renderedAttributes.add(renderString(ImageGallery.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onRenderedChange = imageGallery.getOnRenderedChange();
		renderedAttributes.add(renderString(ImageGallery.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnRepeatChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onRepeatChange = imageGallery.getOnRepeatChange();
		renderedAttributes.add(renderString(ImageGallery.ON_REPEAT_CHANGE, onRepeatChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onShimChange = imageGallery.getOnShimChange();
		renderedAttributes.add(renderString(ImageGallery.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnShowCloseChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onShowCloseChange = imageGallery.getOnShowCloseChange();
		renderedAttributes.add(renderString(ImageGallery.ON_SHOW_CLOSE_CHANGE, onShowCloseChange));
	}

	protected void renderOnShowControlsChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onShowControlsChange = imageGallery.getOnShowControlsChange();
		renderedAttributes.add(renderString(ImageGallery.ON_SHOW_CONTROLS_CHANGE, onShowControlsChange));
	}

	protected void renderOnShowPlayerChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onShowPlayerChange = imageGallery.getOnShowPlayerChange();
		renderedAttributes.add(renderString(ImageGallery.ON_SHOW_PLAYER_CHANGE, onShowPlayerChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onSrcNodeChange = imageGallery.getOnSrcNodeChange();
		renderedAttributes.add(renderString(ImageGallery.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onStringsChange = imageGallery.getOnStringsChange();
		renderedAttributes.add(renderString(ImageGallery.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onTabIndexChange = imageGallery.getOnTabIndexChange();
		renderedAttributes.add(renderString(ImageGallery.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToolbarChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onToolbarChange = imageGallery.getOnToolbarChange();
		renderedAttributes.add(renderString(ImageGallery.ON_TOOLBAR_CHANGE, onToolbarChange));
	}

	protected void renderOnTotalLinksChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onTotalLinksChange = imageGallery.getOnTotalLinksChange();
		renderedAttributes.add(renderString(ImageGallery.ON_TOTAL_LINKS_CHANGE, onTotalLinksChange));
	}

	protected void renderOnUseOriginalImageChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onUseOriginalImageChange = imageGallery.getOnUseOriginalImageChange();
		renderedAttributes.add(renderString(ImageGallery.ON_USE_ORIGINAL_IMAGE_CHANGE, onUseOriginalImageChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onVisibleChange = imageGallery.getOnVisibleChange();
		renderedAttributes.add(renderString(ImageGallery.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onWidthChange = imageGallery.getOnWidthChange();
		renderedAttributes.add(renderString(ImageGallery.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onXChange = imageGallery.getOnXChange();
		renderedAttributes.add(renderString(ImageGallery.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onXyChange = imageGallery.getOnXyChange();
		renderedAttributes.add(renderString(ImageGallery.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onYChange = imageGallery.getOnYChange();
		renderedAttributes.add(renderString(ImageGallery.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, ImageGallery imageGallery) throws IOException {
		java.lang.String onZIndexChange = imageGallery.getOnZIndexChange();
		renderedAttributes.add(renderString(ImageGallery.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}