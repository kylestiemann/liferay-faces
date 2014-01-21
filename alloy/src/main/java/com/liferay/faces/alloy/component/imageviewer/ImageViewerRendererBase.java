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

		if (imageViewer.getAlign() != null) {
			renderAlign(renderedAttributes, imageViewer);
		}

		if (imageViewer.getAlignOn() != null) {
			renderAlignOn(renderedAttributes, imageViewer);
		}

		if (imageViewer.getAnim() != null) {
			renderAnim(renderedAttributes, imageViewer);
		}

		if (imageViewer.getImageViewerBodyContent() != null) {
			renderImageViewerBodyContent(renderedAttributes, imageViewer);
		}

		if (imageViewer.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, imageViewer);
		}

		if (imageViewer.getCaption() != null) {
			renderCaption(renderedAttributes, imageViewer);
		}

		if (imageViewer.getCaptionEl() != null) {
			renderCaptionEl(renderedAttributes, imageViewer);
		}

		if (imageViewer.getCaptionFromTitle() != null) {
			renderCaptionFromTitle(renderedAttributes, imageViewer);
		}

		if (imageViewer.getCentered() != null) {
			renderCentered(renderedAttributes, imageViewer);
		}

		if (imageViewer.getCloseEl() != null) {
			renderCloseEl(renderedAttributes, imageViewer);
		}

		if (imageViewer.getConstrain() != null) {
			renderConstrain(renderedAttributes, imageViewer);
		}

		if (imageViewer.getContentBox() != null) {
			renderContentBox(renderedAttributes, imageViewer);
		}

		if (imageViewer.getControlLeftEl() != null) {
			renderControlLeftEl(renderedAttributes, imageViewer);
		}

		if (imageViewer.getControlRightEl() != null) {
			renderControlRightEl(renderedAttributes, imageViewer);
		}

		if (imageViewer.getCurrentIndex() != null) {
			renderCurrentIndex(renderedAttributes, imageViewer);
		}

		if (imageViewer.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, imageViewer);
		}

		if (imageViewer.getDisabled() != null) {
			renderDisabled(renderedAttributes, imageViewer);
		}

		if (imageViewer.getFillHeight() != null) {
			renderFillHeight(renderedAttributes, imageViewer);
		}

		if (imageViewer.getFocusOn() != null) {
			renderFocusOn(renderedAttributes, imageViewer);
		}

		if (imageViewer.getFocused() != null) {
			renderFocused(renderedAttributes, imageViewer);
		}

		if (imageViewer.getFooterContent() != null) {
			renderFooterContent(renderedAttributes, imageViewer);
		}

		if (imageViewer.getHeaderContent() != null) {
			renderHeaderContent(renderedAttributes, imageViewer);
		}

		if (imageViewer.getHeight() != null) {
			renderHeight(renderedAttributes, imageViewer);
		}

		if (imageViewer.getImageViewerId() != null) {
			renderImageViewerId(renderedAttributes, imageViewer);
		}

		if (imageViewer.getImage() != null) {
			renderImage(renderedAttributes, imageViewer);
		}

		if (imageViewer.getImageAnim() != null) {
			renderImageAnim(renderedAttributes, imageViewer);
		}

		if (imageViewer.getInfoEl() != null) {
			renderInfoEl(renderedAttributes, imageViewer);
		}

		if (imageViewer.getInfoTemplate() != null) {
			renderInfoTemplate(renderedAttributes, imageViewer);
		}

		if (imageViewer.getInitialized() != null) {
			renderInitialized(renderedAttributes, imageViewer);
		}

		if (imageViewer.getLinks() != null) {
			renderLinks(renderedAttributes, imageViewer);
		}

		if (imageViewer.getLoader() != null) {
			renderLoader(renderedAttributes, imageViewer);
		}

		if (imageViewer.getLoading() != null) {
			renderLoading(renderedAttributes, imageViewer);
		}

		if (imageViewer.getLoadingEl() != null) {
			renderLoadingEl(renderedAttributes, imageViewer);
		}

		if (imageViewer.getImageViewerLocale() != null) {
			renderImageViewerLocale(renderedAttributes, imageViewer);
		}

		if (imageViewer.getMaskNode() != null) {
			renderMaskNode(renderedAttributes, imageViewer);
		}

		if (imageViewer.getMaxHeight() != null) {
			renderMaxHeight(renderedAttributes, imageViewer);
		}

		if (imageViewer.getMaxWidth() != null) {
			renderMaxWidth(renderedAttributes, imageViewer);
		}

		if (imageViewer.getModal() != null) {
			renderModal(renderedAttributes, imageViewer);
		}

		if (imageViewer.getPreloadAllImages() != null) {
			renderPreloadAllImages(renderedAttributes, imageViewer);
		}

		if (imageViewer.getPreventOverlap() != null) {
			renderPreventOverlap(renderedAttributes, imageViewer);
		}

		if (imageViewer.getRender() != null) {
			renderRender(renderedAttributes, imageViewer);
		}

		if (imageViewer.getRendered() != null) {
			renderRendered(renderedAttributes, imageViewer);
		}

		if (imageViewer.getShim() != null) {
			renderShim(renderedAttributes, imageViewer);
		}

		if (imageViewer.getShowClose() != null) {
			renderShowClose(renderedAttributes, imageViewer);
		}

		if (imageViewer.getShowControls() != null) {
			renderShowControls(renderedAttributes, imageViewer);
		}

		if (imageViewer.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, imageViewer);
		}

		if (imageViewer.getStrings() != null) {
			renderStrings(renderedAttributes, imageViewer);
		}

		if (imageViewer.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, imageViewer);
		}

		if (imageViewer.getTotalLinks() != null) {
			renderTotalLinks(renderedAttributes, imageViewer);
		}

		if (imageViewer.getVisible() != null) {
			renderVisible(renderedAttributes, imageViewer);
		}

		if (imageViewer.getWidth() != null) {
			renderWidth(renderedAttributes, imageViewer);
		}

		if (imageViewer.getX() != null) {
			renderX(renderedAttributes, imageViewer);
		}

		if (imageViewer.getXy() != null) {
			renderXy(renderedAttributes, imageViewer);
		}

		if (imageViewer.getY() != null) {
			renderY(renderedAttributes, imageViewer);
		}

		if (imageViewer.getZIndex() != null) {
			renderZIndex(renderedAttributes, imageViewer);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (imageViewer.getAfterAlignChange() != null) {
			renderAfterAlignChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterAlignOnChange() != null) {
			renderAfterAlignOnChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterAnimChange() != null) {
			renderAfterAnimChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterBodyContentChange() != null) {
			renderAfterBodyContentChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterCaptionChange() != null) {
			renderAfterCaptionChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterCaptionElChange() != null) {
			renderAfterCaptionElChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterCaptionFromTitleChange() != null) {
			renderAfterCaptionFromTitleChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterCenteredChange() != null) {
			renderAfterCenteredChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterCloseElChange() != null) {
			renderAfterCloseElChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterConstrainChange() != null) {
			renderAfterConstrainChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterControlLeftElChange() != null) {
			renderAfterControlLeftElChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterControlRightElChange() != null) {
			renderAfterControlRightElChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterCurrentIndexChange() != null) {
			renderAfterCurrentIndexChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterFillHeightChange() != null) {
			renderAfterFillHeightChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterFocusOnChange() != null) {
			renderAfterFocusOnChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterFooterContentChange() != null) {
			renderAfterFooterContentChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterHeaderContentChange() != null) {
			renderAfterHeaderContentChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterImageChange() != null) {
			renderAfterImageChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterImageAnimChange() != null) {
			renderAfterImageAnimChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterInfoElChange() != null) {
			renderAfterInfoElChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterInfoTemplateChange() != null) {
			renderAfterInfoTemplateChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterLinksChange() != null) {
			renderAfterLinksChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterLoaderChange() != null) {
			renderAfterLoaderChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterLoadingChange() != null) {
			renderAfterLoadingChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterLoadingElChange() != null) {
			renderAfterLoadingElChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterMaskNodeChange() != null) {
			renderAfterMaskNodeChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterMaxHeightChange() != null) {
			renderAfterMaxHeightChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterMaxWidthChange() != null) {
			renderAfterMaxWidthChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterModalChange() != null) {
			renderAfterModalChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterPreloadAllImagesChange() != null) {
			renderAfterPreloadAllImagesChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterPreventOverlapChange() != null) {
			renderAfterPreventOverlapChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterShimChange() != null) {
			renderAfterShimChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterShowCloseChange() != null) {
			renderAfterShowCloseChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterShowControlsChange() != null) {
			renderAfterShowControlsChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterTotalLinksChange() != null) {
			renderAfterTotalLinksChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterXChange() != null) {
			renderAfterXChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterXyChange() != null) {
			renderAfterXyChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterYChange() != null) {
			renderAfterYChange(renderedAfterEvents, imageViewer);
		}

		if (imageViewer.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, imageViewer);
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

		if (imageViewer.getOnAlignChange() != null) {
			renderOnAlignChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnAlignOnChange() != null) {
			renderOnAlignOnChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnAnimChange() != null) {
			renderOnAnimChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnBodyContentChange() != null) {
			renderOnBodyContentChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnCaptionChange() != null) {
			renderOnCaptionChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnCaptionElChange() != null) {
			renderOnCaptionElChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnCaptionFromTitleChange() != null) {
			renderOnCaptionFromTitleChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnCenteredChange() != null) {
			renderOnCenteredChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnCloseElChange() != null) {
			renderOnCloseElChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnConstrainChange() != null) {
			renderOnConstrainChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnControlLeftElChange() != null) {
			renderOnControlLeftElChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnControlRightElChange() != null) {
			renderOnControlRightElChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnCurrentIndexChange() != null) {
			renderOnCurrentIndexChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnFillHeightChange() != null) {
			renderOnFillHeightChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnFocusOnChange() != null) {
			renderOnFocusOnChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnFooterContentChange() != null) {
			renderOnFooterContentChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnHeaderContentChange() != null) {
			renderOnHeaderContentChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnImageChange() != null) {
			renderOnImageChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnImageAnimChange() != null) {
			renderOnImageAnimChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnInfoElChange() != null) {
			renderOnInfoElChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnInfoTemplateChange() != null) {
			renderOnInfoTemplateChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnLinksChange() != null) {
			renderOnLinksChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnLoaderChange() != null) {
			renderOnLoaderChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnLoadingChange() != null) {
			renderOnLoadingChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnLoadingElChange() != null) {
			renderOnLoadingElChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnMaskNodeChange() != null) {
			renderOnMaskNodeChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnMaxHeightChange() != null) {
			renderOnMaxHeightChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnMaxWidthChange() != null) {
			renderOnMaxWidthChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnModalChange() != null) {
			renderOnModalChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnPreloadAllImagesChange() != null) {
			renderOnPreloadAllImagesChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnPreventOverlapChange() != null) {
			renderOnPreventOverlapChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnShimChange() != null) {
			renderOnShimChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnShowCloseChange() != null) {
			renderOnShowCloseChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnShowControlsChange() != null) {
			renderOnShowControlsChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnTotalLinksChange() != null) {
			renderOnTotalLinksChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnXChange() != null) {
			renderOnXChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnXyChange() != null) {
			renderOnXyChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnYChange() != null) {
			renderOnYChange(renderedOnEvents, imageViewer);
		}

		if (imageViewer.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, imageViewer);
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

	protected void renderAlign(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object align = imageViewer.getAlign();
		renderedAttributes.add(renderObject(ImageViewer.ALIGN, align));
	}

	protected void renderAlignOn(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object alignOn = imageViewer.getAlignOn();
		renderedAttributes.add(renderArray(ImageViewer.ALIGN_ON, alignOn));
	}

	protected void renderAnim(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean anim = imageViewer.getAnim();
		renderedAttributes.add(renderBoolean(ImageViewer.ANIM, anim));
	}

	protected void renderImageViewerBodyContent(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String imageViewerBodyContent = imageViewer.getImageViewerBodyContent();
		renderedAttributes.add(renderString(ImageViewer.IMAGE_VIEWER_BODY_CONTENT, imageViewerBodyContent));
	}

	protected void renderBoundingBox(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String boundingBox = imageViewer.getBoundingBox();
		renderedAttributes.add(renderString(ImageViewer.BOUNDING_BOX, boundingBox));
	}

	protected void renderCaption(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String caption = imageViewer.getCaption();
		renderedAttributes.add(renderString(ImageViewer.CAPTION, caption));
	}

	protected void renderCaptionEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object captionEl = imageViewer.getCaptionEl();
		renderedAttributes.add(renderString(ImageViewer.CAPTION_EL, captionEl));
	}

	protected void renderCaptionFromTitle(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean captionFromTitle = imageViewer.getCaptionFromTitle();
		renderedAttributes.add(renderBoolean(ImageViewer.CAPTION_FROM_TITLE, captionFromTitle));
	}

	protected void renderCentered(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean centered = imageViewer.getCentered();
		renderedAttributes.add(renderBoolean(ImageViewer.CENTERED, centered));
	}

	protected void renderCloseEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object closeEl = imageViewer.getCloseEl();
		renderedAttributes.add(renderString(ImageViewer.CLOSE_EL, closeEl));
	}

	protected void renderConstrain(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object constrain = imageViewer.getConstrain();
		renderedAttributes.add(renderString(ImageViewer.CONSTRAIN, constrain));
	}

	protected void renderContentBox(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String contentBox = imageViewer.getContentBox();
		renderedAttributes.add(renderString(ImageViewer.CONTENT_BOX, contentBox));
	}

	protected void renderControlLeftEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object controlLeftEl = imageViewer.getControlLeftEl();
		renderedAttributes.add(renderString(ImageViewer.CONTROL_LEFT_EL, controlLeftEl));
	}

	protected void renderControlRightEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object controlRightEl = imageViewer.getControlRightEl();
		renderedAttributes.add(renderString(ImageViewer.CONTROL_RIGHT_EL, controlRightEl));
	}

	protected void renderCurrentIndex(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object currentIndex = imageViewer.getCurrentIndex();
		renderedAttributes.add(renderNumber(ImageViewer.CURRENT_INDEX, currentIndex));
	}

	protected void renderDestroyed(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean destroyed = imageViewer.getDestroyed();
		renderedAttributes.add(renderBoolean(ImageViewer.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean disabled = imageViewer.getDisabled();
		renderedAttributes.add(renderBoolean(ImageViewer.DISABLED, disabled));
	}

	protected void renderFillHeight(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object fillHeight = imageViewer.getFillHeight();
		renderedAttributes.add(renderString(ImageViewer.FILL_HEIGHT, fillHeight));
	}

	protected void renderFocusOn(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object focusOn = imageViewer.getFocusOn();
		renderedAttributes.add(renderArray(ImageViewer.FOCUS_ON, focusOn));
	}

	protected void renderFocused(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean focused = imageViewer.getFocused();
		renderedAttributes.add(renderBoolean(ImageViewer.FOCUSED, focused));
	}

	protected void renderFooterContent(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object footerContent = imageViewer.getFooterContent();
		renderedAttributes.add(renderString(ImageViewer.FOOTER_CONTENT, footerContent));
	}

	protected void renderHeaderContent(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object headerContent = imageViewer.getHeaderContent();
		renderedAttributes.add(renderString(ImageViewer.HEADER_CONTENT, headerContent));
	}

	protected void renderHeight(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object height = imageViewer.getHeight();
		renderedAttributes.add(renderString(ImageViewer.HEIGHT, height));
	}

	protected void renderImageViewerId(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String imageViewerId = imageViewer.getImageViewerId();
		renderedAttributes.add(renderString(ImageViewer.IMAGE_VIEWER_ID, imageViewerId));
	}

	protected void renderImage(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object image = imageViewer.getImage();
		renderedAttributes.add(renderString(ImageViewer.IMAGE, image));
	}

	protected void renderImageAnim(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object imageAnim = imageViewer.getImageAnim();
		renderedAttributes.add(renderObject(ImageViewer.IMAGE_ANIM, imageAnim));
	}

	protected void renderInfoEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object infoEl = imageViewer.getInfoEl();
		renderedAttributes.add(renderString(ImageViewer.INFO_EL, infoEl));
	}

	protected void renderInfoTemplate(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String infoTemplate = imageViewer.getInfoTemplate();
		renderedAttributes.add(renderString(ImageViewer.INFO_TEMPLATE, infoTemplate));
	}

	protected void renderInitialized(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean initialized = imageViewer.getInitialized();
		renderedAttributes.add(renderBoolean(ImageViewer.INITIALIZED, initialized));
	}

	protected void renderLinks(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object links = imageViewer.getLinks();
		renderedAttributes.add(renderString(ImageViewer.LINKS, links));
	}

	protected void renderLoader(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object loader = imageViewer.getLoader();
		renderedAttributes.add(renderString(ImageViewer.LOADER, loader));
	}

	protected void renderLoading(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean loading = imageViewer.getLoading();
		renderedAttributes.add(renderBoolean(ImageViewer.LOADING, loading));
	}

	protected void renderLoadingEl(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object loadingEl = imageViewer.getLoadingEl();
		renderedAttributes.add(renderString(ImageViewer.LOADING_EL, loadingEl));
	}

	protected void renderImageViewerLocale(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String imageViewerLocale = imageViewer.getImageViewerLocale();
		renderedAttributes.add(renderString(ImageViewer.IMAGE_VIEWER_LOCALE, imageViewerLocale));
	}

	protected void renderMaskNode(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object maskNode = imageViewer.getMaskNode();
		renderedAttributes.add(renderString(ImageViewer.MASK_NODE, maskNode));
	}

	protected void renderMaxHeight(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object maxHeight = imageViewer.getMaxHeight();
		renderedAttributes.add(renderNumber(ImageViewer.MAX_HEIGHT, maxHeight));
	}

	protected void renderMaxWidth(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object maxWidth = imageViewer.getMaxWidth();
		renderedAttributes.add(renderNumber(ImageViewer.MAX_WIDTH, maxWidth));
	}

	protected void renderModal(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean modal = imageViewer.getModal();
		renderedAttributes.add(renderBoolean(ImageViewer.MODAL, modal));
	}

	protected void renderPreloadAllImages(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean preloadAllImages = imageViewer.getPreloadAllImages();
		renderedAttributes.add(renderBoolean(ImageViewer.PRELOAD_ALL_IMAGES, preloadAllImages));
	}

	protected void renderPreventOverlap(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean preventOverlap = imageViewer.getPreventOverlap();
		renderedAttributes.add(renderBoolean(ImageViewer.PREVENT_OVERLAP, preventOverlap));
	}

	protected void renderRender(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object render = imageViewer.getRender();
		renderedAttributes.add(renderString(ImageViewer.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean rendered = imageViewer.getRendered();
		renderedAttributes.add(renderBoolean(ImageViewer.RENDERED, rendered));
	}

	protected void renderShim(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean shim = imageViewer.getShim();
		renderedAttributes.add(renderBoolean(ImageViewer.SHIM, shim));
	}

	protected void renderShowClose(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean showClose = imageViewer.getShowClose();
		renderedAttributes.add(renderBoolean(ImageViewer.SHOW_CLOSE, showClose));
	}

	protected void renderShowControls(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean showControls = imageViewer.getShowControls();
		renderedAttributes.add(renderBoolean(ImageViewer.SHOW_CONTROLS, showControls));
	}

	protected void renderSrcNode(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String srcNode = imageViewer.getSrcNode();
		renderedAttributes.add(renderString(ImageViewer.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object strings = imageViewer.getStrings();
		renderedAttributes.add(renderObject(ImageViewer.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object tabIndex = imageViewer.getTabIndex();
		renderedAttributes.add(renderNumber(ImageViewer.TAB_INDEX, tabIndex));
	}

	protected void renderTotalLinks(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean totalLinks = imageViewer.getTotalLinks();
		renderedAttributes.add(renderBoolean(ImageViewer.TOTAL_LINKS, totalLinks));
	}

	protected void renderVisible(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Boolean visible = imageViewer.getVisible();
		renderedAttributes.add(renderBoolean(ImageViewer.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object width = imageViewer.getWidth();
		renderedAttributes.add(renderString(ImageViewer.WIDTH, width));
	}

	protected void renderX(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object x = imageViewer.getX();
		renderedAttributes.add(renderNumber(ImageViewer.X, x));
	}

	protected void renderXy(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object xy = imageViewer.getXy();
		renderedAttributes.add(renderArray(ImageViewer.XY, xy));
	}

	protected void renderY(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object y = imageViewer.getY();
		renderedAttributes.add(renderNumber(ImageViewer.Y, y));
	}

	protected void renderZIndex(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.Object zIndex = imageViewer.getZIndex();
		renderedAttributes.add(renderNumber(ImageViewer.Z_INDEX, zIndex));
	}

	protected void renderAfterAlignChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterAlignChange = imageViewer.getAfterAlignChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_ALIGN_CHANGE, afterAlignChange));
	}

	protected void renderAfterAlignOnChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterAlignOnChange = imageViewer.getAfterAlignOnChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_ALIGN_ON_CHANGE, afterAlignOnChange));
	}

	protected void renderAfterAnimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterAnimChange = imageViewer.getAfterAnimChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_ANIM_CHANGE, afterAnimChange));
	}

	protected void renderAfterBodyContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterBodyContentChange = imageViewer.getAfterBodyContentChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_BODY_CONTENT_CHANGE, afterBodyContentChange));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterBoundingBoxChange = imageViewer.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCaptionChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCaptionChange = imageViewer.getAfterCaptionChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CAPTION_CHANGE, afterCaptionChange));
	}

	protected void renderAfterCaptionElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCaptionElChange = imageViewer.getAfterCaptionElChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CAPTION_EL_CHANGE, afterCaptionElChange));
	}

	protected void renderAfterCaptionFromTitleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCaptionFromTitleChange = imageViewer.getAfterCaptionFromTitleChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CAPTION_FROM_TITLE_CHANGE, afterCaptionFromTitleChange));
	}

	protected void renderAfterCenteredChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCenteredChange = imageViewer.getAfterCenteredChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CENTERED_CHANGE, afterCenteredChange));
	}

	protected void renderAfterCloseElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCloseElChange = imageViewer.getAfterCloseElChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CLOSE_EL_CHANGE, afterCloseElChange));
	}

	protected void renderAfterConstrainChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterConstrainChange = imageViewer.getAfterConstrainChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CONSTRAIN_CHANGE, afterConstrainChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterContentBoxChange = imageViewer.getAfterContentBoxChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlLeftElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterControlLeftElChange = imageViewer.getAfterControlLeftElChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CONTROL_LEFT_EL_CHANGE, afterControlLeftElChange));
	}

	protected void renderAfterControlRightElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterControlRightElChange = imageViewer.getAfterControlRightElChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CONTROL_RIGHT_EL_CHANGE, afterControlRightElChange));
	}

	protected void renderAfterCurrentIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterCurrentIndexChange = imageViewer.getAfterCurrentIndexChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_CURRENT_INDEX_CHANGE, afterCurrentIndexChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterDestroyedChange = imageViewer.getAfterDestroyedChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterDisabledChange = imageViewer.getAfterDisabledChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFillHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterFillHeightChange = imageViewer.getAfterFillHeightChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_FILL_HEIGHT_CHANGE, afterFillHeightChange));
	}

	protected void renderAfterFocusOnChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterFocusOnChange = imageViewer.getAfterFocusOnChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_FOCUS_ON_CHANGE, afterFocusOnChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterFocusedChange = imageViewer.getAfterFocusedChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFooterContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterFooterContentChange = imageViewer.getAfterFooterContentChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_FOOTER_CONTENT_CHANGE, afterFooterContentChange));
	}

	protected void renderAfterHeaderContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterHeaderContentChange = imageViewer.getAfterHeaderContentChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_HEADER_CONTENT_CHANGE, afterHeaderContentChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterHeightChange = imageViewer.getAfterHeightChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterIdChange = imageViewer.getAfterIdChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterImageChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterImageChange = imageViewer.getAfterImageChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_IMAGE_CHANGE, afterImageChange));
	}

	protected void renderAfterImageAnimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterImageAnimChange = imageViewer.getAfterImageAnimChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_IMAGE_ANIM_CHANGE, afterImageAnimChange));
	}

	protected void renderAfterInfoElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterInfoElChange = imageViewer.getAfterInfoElChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_INFO_EL_CHANGE, afterInfoElChange));
	}

	protected void renderAfterInfoTemplateChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterInfoTemplateChange = imageViewer.getAfterInfoTemplateChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_INFO_TEMPLATE_CHANGE, afterInfoTemplateChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterInitializedChange = imageViewer.getAfterInitializedChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLinksChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLinksChange = imageViewer.getAfterLinksChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_LINKS_CHANGE, afterLinksChange));
	}

	protected void renderAfterLoaderChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLoaderChange = imageViewer.getAfterLoaderChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_LOADER_CHANGE, afterLoaderChange));
	}

	protected void renderAfterLoadingChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLoadingChange = imageViewer.getAfterLoadingChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_LOADING_CHANGE, afterLoadingChange));
	}

	protected void renderAfterLoadingElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLoadingElChange = imageViewer.getAfterLoadingElChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_LOADING_EL_CHANGE, afterLoadingElChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterLocaleChange = imageViewer.getAfterLocaleChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMaskNodeChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterMaskNodeChange = imageViewer.getAfterMaskNodeChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_MASK_NODE_CHANGE, afterMaskNodeChange));
	}

	protected void renderAfterMaxHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterMaxHeightChange = imageViewer.getAfterMaxHeightChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_MAX_HEIGHT_CHANGE, afterMaxHeightChange));
	}

	protected void renderAfterMaxWidthChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterMaxWidthChange = imageViewer.getAfterMaxWidthChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_MAX_WIDTH_CHANGE, afterMaxWidthChange));
	}

	protected void renderAfterModalChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterModalChange = imageViewer.getAfterModalChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_MODAL_CHANGE, afterModalChange));
	}

	protected void renderAfterPreloadAllImagesChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterPreloadAllImagesChange = imageViewer.getAfterPreloadAllImagesChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_PRELOAD_ALL_IMAGES_CHANGE, afterPreloadAllImagesChange));
	}

	protected void renderAfterPreventOverlapChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterPreventOverlapChange = imageViewer.getAfterPreventOverlapChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_PREVENT_OVERLAP_CHANGE, afterPreventOverlapChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterRenderChange = imageViewer.getAfterRenderChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterRenderedChange = imageViewer.getAfterRenderedChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterShimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterShimChange = imageViewer.getAfterShimChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_SHIM_CHANGE, afterShimChange));
	}

	protected void renderAfterShowCloseChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterShowCloseChange = imageViewer.getAfterShowCloseChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_SHOW_CLOSE_CHANGE, afterShowCloseChange));
	}

	protected void renderAfterShowControlsChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterShowControlsChange = imageViewer.getAfterShowControlsChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_SHOW_CONTROLS_CHANGE, afterShowControlsChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterSrcNodeChange = imageViewer.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterStringsChange = imageViewer.getAfterStringsChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterTabIndexChange = imageViewer.getAfterTabIndexChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTotalLinksChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterTotalLinksChange = imageViewer.getAfterTotalLinksChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_TOTAL_LINKS_CHANGE, afterTotalLinksChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterVisibleChange = imageViewer.getAfterVisibleChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterWidthChange = imageViewer.getAfterWidthChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterXChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterXChange = imageViewer.getAfterXChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_XCHANGE, afterXChange));
	}

	protected void renderAfterXyChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterXyChange = imageViewer.getAfterXyChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_XY_CHANGE, afterXyChange));
	}

	protected void renderAfterYChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterYChange = imageViewer.getAfterYChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_YCHANGE, afterYChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String afterZIndexChange = imageViewer.getAfterZIndexChange();
		renderedAttributes.add(renderString(ImageViewer.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAlignChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onAlignChange = imageViewer.getOnAlignChange();
		renderedAttributes.add(renderString(ImageViewer.ON_ALIGN_CHANGE, onAlignChange));
	}

	protected void renderOnAlignOnChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onAlignOnChange = imageViewer.getOnAlignOnChange();
		renderedAttributes.add(renderString(ImageViewer.ON_ALIGN_ON_CHANGE, onAlignOnChange));
	}

	protected void renderOnAnimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onAnimChange = imageViewer.getOnAnimChange();
		renderedAttributes.add(renderString(ImageViewer.ON_ANIM_CHANGE, onAnimChange));
	}

	protected void renderOnBodyContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onBodyContentChange = imageViewer.getOnBodyContentChange();
		renderedAttributes.add(renderString(ImageViewer.ON_BODY_CONTENT_CHANGE, onBodyContentChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onBoundingBoxChange = imageViewer.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(ImageViewer.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCaptionChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCaptionChange = imageViewer.getOnCaptionChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CAPTION_CHANGE, onCaptionChange));
	}

	protected void renderOnCaptionElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCaptionElChange = imageViewer.getOnCaptionElChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CAPTION_EL_CHANGE, onCaptionElChange));
	}

	protected void renderOnCaptionFromTitleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCaptionFromTitleChange = imageViewer.getOnCaptionFromTitleChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CAPTION_FROM_TITLE_CHANGE, onCaptionFromTitleChange));
	}

	protected void renderOnCenteredChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCenteredChange = imageViewer.getOnCenteredChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CENTERED_CHANGE, onCenteredChange));
	}

	protected void renderOnCloseElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCloseElChange = imageViewer.getOnCloseElChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CLOSE_EL_CHANGE, onCloseElChange));
	}

	protected void renderOnConstrainChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onConstrainChange = imageViewer.getOnConstrainChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CONSTRAIN_CHANGE, onConstrainChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onContentBoxChange = imageViewer.getOnContentBoxChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlLeftElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onControlLeftElChange = imageViewer.getOnControlLeftElChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CONTROL_LEFT_EL_CHANGE, onControlLeftElChange));
	}

	protected void renderOnControlRightElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onControlRightElChange = imageViewer.getOnControlRightElChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CONTROL_RIGHT_EL_CHANGE, onControlRightElChange));
	}

	protected void renderOnCurrentIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onCurrentIndexChange = imageViewer.getOnCurrentIndexChange();
		renderedAttributes.add(renderString(ImageViewer.ON_CURRENT_INDEX_CHANGE, onCurrentIndexChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onDestroyedChange = imageViewer.getOnDestroyedChange();
		renderedAttributes.add(renderString(ImageViewer.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onDisabledChange = imageViewer.getOnDisabledChange();
		renderedAttributes.add(renderString(ImageViewer.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFillHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onFillHeightChange = imageViewer.getOnFillHeightChange();
		renderedAttributes.add(renderString(ImageViewer.ON_FILL_HEIGHT_CHANGE, onFillHeightChange));
	}

	protected void renderOnFocusOnChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onFocusOnChange = imageViewer.getOnFocusOnChange();
		renderedAttributes.add(renderString(ImageViewer.ON_FOCUS_ON_CHANGE, onFocusOnChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onFocusedChange = imageViewer.getOnFocusedChange();
		renderedAttributes.add(renderString(ImageViewer.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFooterContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onFooterContentChange = imageViewer.getOnFooterContentChange();
		renderedAttributes.add(renderString(ImageViewer.ON_FOOTER_CONTENT_CHANGE, onFooterContentChange));
	}

	protected void renderOnHeaderContentChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onHeaderContentChange = imageViewer.getOnHeaderContentChange();
		renderedAttributes.add(renderString(ImageViewer.ON_HEADER_CONTENT_CHANGE, onHeaderContentChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onHeightChange = imageViewer.getOnHeightChange();
		renderedAttributes.add(renderString(ImageViewer.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onIdChange = imageViewer.getOnIdChange();
		renderedAttributes.add(renderString(ImageViewer.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnImageChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onImageChange = imageViewer.getOnImageChange();
		renderedAttributes.add(renderString(ImageViewer.ON_IMAGE_CHANGE, onImageChange));
	}

	protected void renderOnImageAnimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onImageAnimChange = imageViewer.getOnImageAnimChange();
		renderedAttributes.add(renderString(ImageViewer.ON_IMAGE_ANIM_CHANGE, onImageAnimChange));
	}

	protected void renderOnInfoElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onInfoElChange = imageViewer.getOnInfoElChange();
		renderedAttributes.add(renderString(ImageViewer.ON_INFO_EL_CHANGE, onInfoElChange));
	}

	protected void renderOnInfoTemplateChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onInfoTemplateChange = imageViewer.getOnInfoTemplateChange();
		renderedAttributes.add(renderString(ImageViewer.ON_INFO_TEMPLATE_CHANGE, onInfoTemplateChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onInitializedChange = imageViewer.getOnInitializedChange();
		renderedAttributes.add(renderString(ImageViewer.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLinksChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLinksChange = imageViewer.getOnLinksChange();
		renderedAttributes.add(renderString(ImageViewer.ON_LINKS_CHANGE, onLinksChange));
	}

	protected void renderOnLoaderChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLoaderChange = imageViewer.getOnLoaderChange();
		renderedAttributes.add(renderString(ImageViewer.ON_LOADER_CHANGE, onLoaderChange));
	}

	protected void renderOnLoadingChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLoadingChange = imageViewer.getOnLoadingChange();
		renderedAttributes.add(renderString(ImageViewer.ON_LOADING_CHANGE, onLoadingChange));
	}

	protected void renderOnLoadingElChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLoadingElChange = imageViewer.getOnLoadingElChange();
		renderedAttributes.add(renderString(ImageViewer.ON_LOADING_EL_CHANGE, onLoadingElChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onLocaleChange = imageViewer.getOnLocaleChange();
		renderedAttributes.add(renderString(ImageViewer.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMaskNodeChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onMaskNodeChange = imageViewer.getOnMaskNodeChange();
		renderedAttributes.add(renderString(ImageViewer.ON_MASK_NODE_CHANGE, onMaskNodeChange));
	}

	protected void renderOnMaxHeightChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onMaxHeightChange = imageViewer.getOnMaxHeightChange();
		renderedAttributes.add(renderString(ImageViewer.ON_MAX_HEIGHT_CHANGE, onMaxHeightChange));
	}

	protected void renderOnMaxWidthChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onMaxWidthChange = imageViewer.getOnMaxWidthChange();
		renderedAttributes.add(renderString(ImageViewer.ON_MAX_WIDTH_CHANGE, onMaxWidthChange));
	}

	protected void renderOnModalChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onModalChange = imageViewer.getOnModalChange();
		renderedAttributes.add(renderString(ImageViewer.ON_MODAL_CHANGE, onModalChange));
	}

	protected void renderOnPreloadAllImagesChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onPreloadAllImagesChange = imageViewer.getOnPreloadAllImagesChange();
		renderedAttributes.add(renderString(ImageViewer.ON_PRELOAD_ALL_IMAGES_CHANGE, onPreloadAllImagesChange));
	}

	protected void renderOnPreventOverlapChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onPreventOverlapChange = imageViewer.getOnPreventOverlapChange();
		renderedAttributes.add(renderString(ImageViewer.ON_PREVENT_OVERLAP_CHANGE, onPreventOverlapChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onRenderChange = imageViewer.getOnRenderChange();
		renderedAttributes.add(renderString(ImageViewer.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onRenderedChange = imageViewer.getOnRenderedChange();
		renderedAttributes.add(renderString(ImageViewer.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnShimChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onShimChange = imageViewer.getOnShimChange();
		renderedAttributes.add(renderString(ImageViewer.ON_SHIM_CHANGE, onShimChange));
	}

	protected void renderOnShowCloseChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onShowCloseChange = imageViewer.getOnShowCloseChange();
		renderedAttributes.add(renderString(ImageViewer.ON_SHOW_CLOSE_CHANGE, onShowCloseChange));
	}

	protected void renderOnShowControlsChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onShowControlsChange = imageViewer.getOnShowControlsChange();
		renderedAttributes.add(renderString(ImageViewer.ON_SHOW_CONTROLS_CHANGE, onShowControlsChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onSrcNodeChange = imageViewer.getOnSrcNodeChange();
		renderedAttributes.add(renderString(ImageViewer.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onStringsChange = imageViewer.getOnStringsChange();
		renderedAttributes.add(renderString(ImageViewer.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onTabIndexChange = imageViewer.getOnTabIndexChange();
		renderedAttributes.add(renderString(ImageViewer.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTotalLinksChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onTotalLinksChange = imageViewer.getOnTotalLinksChange();
		renderedAttributes.add(renderString(ImageViewer.ON_TOTAL_LINKS_CHANGE, onTotalLinksChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onVisibleChange = imageViewer.getOnVisibleChange();
		renderedAttributes.add(renderString(ImageViewer.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onWidthChange = imageViewer.getOnWidthChange();
		renderedAttributes.add(renderString(ImageViewer.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnXChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onXChange = imageViewer.getOnXChange();
		renderedAttributes.add(renderString(ImageViewer.ON_XCHANGE, onXChange));
	}

	protected void renderOnXyChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onXyChange = imageViewer.getOnXyChange();
		renderedAttributes.add(renderString(ImageViewer.ON_XY_CHANGE, onXyChange));
	}

	protected void renderOnYChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onYChange = imageViewer.getOnYChange();
		renderedAttributes.add(renderString(ImageViewer.ON_YCHANGE, onYChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, ImageViewer imageViewer) throws IOException {
		java.lang.String onZIndexChange = imageViewer.getOnZIndexChange();
		renderedAttributes.add(renderString(ImageViewer.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}