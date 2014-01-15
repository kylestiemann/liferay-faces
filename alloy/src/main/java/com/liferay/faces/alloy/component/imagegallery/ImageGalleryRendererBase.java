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
import java.util.ArrayList;
import java.util.Iterator;

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

		bufferedResponseWriter.write("var imageGallery = new A.ImageGallery");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, imageGallery);
		renderAlignOn(renrederedAttributes, imageGallery);
		renderAnim(renrederedAttributes, imageGallery);
		renderAutoPlay(renrederedAttributes, imageGallery);
		renderImagegalleryBodyContent(renrederedAttributes, imageGallery);
		renderBoundingBox(renrederedAttributes, imageGallery);
		renderCaption(renrederedAttributes, imageGallery);
		renderCaptionEl(renrederedAttributes, imageGallery);
		renderCaptionFromTitle(renrederedAttributes, imageGallery);
		renderCentered(renrederedAttributes, imageGallery);
		renderCloseEl(renrederedAttributes, imageGallery);
		renderConstrain(renrederedAttributes, imageGallery);
		renderContentBox(renrederedAttributes, imageGallery);
		renderControlLeftEl(renrederedAttributes, imageGallery);
		renderControlRightEl(renrederedAttributes, imageGallery);
		renderCurrentIndex(renrederedAttributes, imageGallery);
		renderDelay(renrederedAttributes, imageGallery);
		renderDestroyed(renrederedAttributes, imageGallery);
		renderDisabled(renrederedAttributes, imageGallery);
		renderFillHeight(renrederedAttributes, imageGallery);
		renderFocusOn(renrederedAttributes, imageGallery);
		renderFocused(renrederedAttributes, imageGallery);
		renderFooterContent(renrederedAttributes, imageGallery);
		renderHeaderContent(renrederedAttributes, imageGallery);
		renderHeight(renrederedAttributes, imageGallery);
		renderImagegalleryId(renrederedAttributes, imageGallery);
		renderImage(renrederedAttributes, imageGallery);
		renderImageAnim(renrederedAttributes, imageGallery);
		renderInfoEl(renrederedAttributes, imageGallery);
		renderInfoTemplate(renrederedAttributes, imageGallery);
		renderInitialized(renrederedAttributes, imageGallery);
		renderLinks(renrederedAttributes, imageGallery);
		renderLoader(renrederedAttributes, imageGallery);
		renderLoading(renrederedAttributes, imageGallery);
		renderLoadingEl(renrederedAttributes, imageGallery);
		renderImagegalleryLocale(renrederedAttributes, imageGallery);
		renderMaskNode(renrederedAttributes, imageGallery);
		renderMaxHeight(renrederedAttributes, imageGallery);
		renderMaxWidth(renrederedAttributes, imageGallery);
		renderModal(renrederedAttributes, imageGallery);
		renderPagination(renrederedAttributes, imageGallery);
		renderPaginationEl(renrederedAttributes, imageGallery);
		renderPaginationInstance(renrederedAttributes, imageGallery);
		renderPaused(renrederedAttributes, imageGallery);
		renderPausedLabel(renrederedAttributes, imageGallery);
		renderPlaying(renrederedAttributes, imageGallery);
		renderPlayingLabel(renrederedAttributes, imageGallery);
		renderPreloadAllImages(renrederedAttributes, imageGallery);
		renderPreventOverlap(renrederedAttributes, imageGallery);
		renderRender(renrederedAttributes, imageGallery);
		renderRendered(renrederedAttributes, imageGallery);
		renderRepeat(renrederedAttributes, imageGallery);
		renderShim(renrederedAttributes, imageGallery);
		renderShowClose(renrederedAttributes, imageGallery);
		renderShowControls(renrederedAttributes, imageGallery);
		renderShowPlayer(renrederedAttributes, imageGallery);
		renderSrcNode(renrederedAttributes, imageGallery);
		renderStrings(renrederedAttributes, imageGallery);
		renderTabIndex(renrederedAttributes, imageGallery);
		renderToolbar(renrederedAttributes, imageGallery);
		renderTotalLinks(renrederedAttributes, imageGallery);
		renderUseOriginalImage(renrederedAttributes, imageGallery);
		renderVisible(renrederedAttributes, imageGallery);
		renderWidth(renrederedAttributes, imageGallery);
		renderX(renrederedAttributes, imageGallery);
		renderXy(renrederedAttributes, imageGallery);
		renderY(renrederedAttributes, imageGallery);
		renderZIndex(renrederedAttributes, imageGallery);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, imageGallery);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", imageGallery.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", imageGallery.getAlignOn()));
		}
	}

	protected void renderAnim(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getAnim() != null) {
			renrederedAttributes.add(renderBoolean("anim", imageGallery.getAnim()));
		}
	}

	protected void renderAutoPlay(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getAutoPlay() != null) {
			renrederedAttributes.add(renderBoolean("autoPlay", imageGallery.getAutoPlay()));
		}
	}

	protected void renderImagegalleryBodyContent(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getImagegalleryBodyContent() != null) {
			renrederedAttributes.add(renderString("imagegalleryBodyContent", imageGallery.getImagegalleryBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", imageGallery.getBoundingBox()));
		}
	}

	protected void renderCaption(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getCaption() != null) {
			renrederedAttributes.add(renderString("caption", imageGallery.getCaption()));
		}
	}

	protected void renderCaptionEl(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getCaptionEl() != null) {
			renrederedAttributes.add(renderString("captionEl", imageGallery.getCaptionEl()));
		}
	}

	protected void renderCaptionFromTitle(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getCaptionFromTitle() != null) {
			renrederedAttributes.add(renderBoolean("captionFromTitle", imageGallery.getCaptionFromTitle()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getCentered() != null) {
			renrederedAttributes.add(renderBoolean("centered", imageGallery.getCentered()));
		}
	}

	protected void renderCloseEl(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getCloseEl() != null) {
			renrederedAttributes.add(renderString("closeEl", imageGallery.getCloseEl()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", imageGallery.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", imageGallery.getContentBox()));
		}
	}

	protected void renderControlLeftEl(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getControlLeftEl() != null) {
			renrederedAttributes.add(renderString("controlLeftEl", imageGallery.getControlLeftEl()));
		}
	}

	protected void renderControlRightEl(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getControlRightEl() != null) {
			renrederedAttributes.add(renderString("controlRightEl", imageGallery.getControlRightEl()));
		}
	}

	protected void renderCurrentIndex(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getCurrentIndex() != null) {
			renrederedAttributes.add(renderNumber("currentIndex", imageGallery.getCurrentIndex()));
		}
	}

	protected void renderDelay(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getDelay() != null) {
			renrederedAttributes.add(renderNumber("delay", imageGallery.getDelay()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", imageGallery.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", imageGallery.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", imageGallery.getFillHeight()));
		}
	}

	protected void renderFocusOn(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getFocusOn() != null) {
			renrederedAttributes.add(renderArray("focusOn", imageGallery.getFocusOn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", imageGallery.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", imageGallery.getFooterContent()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", imageGallery.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getHeight() != null) {
			renrederedAttributes.add(renderString("height", imageGallery.getHeight()));
		}
	}

	protected void renderImagegalleryId(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getImagegalleryId() != null) {
			renrederedAttributes.add(renderString("imagegalleryId", imageGallery.getImagegalleryId()));
		}
	}

	protected void renderImage(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getImage() != null) {
			renrederedAttributes.add(renderString("image", imageGallery.getImage()));
		}
	}

	protected void renderImageAnim(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getImageAnim() != null) {
			renrederedAttributes.add(renderObject("imageAnim", imageGallery.getImageAnim()));
		}
	}

	protected void renderInfoEl(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getInfoEl() != null) {
			renrederedAttributes.add(renderString("infoEl", imageGallery.getInfoEl()));
		}
	}

	protected void renderInfoTemplate(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getInfoTemplate() != null) {
			renrederedAttributes.add(renderString("infoTemplate", imageGallery.getInfoTemplate()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", imageGallery.getInitialized()));
		}
	}

	protected void renderLinks(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getLinks() != null) {
			renrederedAttributes.add(renderString("links", imageGallery.getLinks()));
		}
	}

	protected void renderLoader(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getLoader() != null) {
			renrederedAttributes.add(renderString("loader", imageGallery.getLoader()));
		}
	}

	protected void renderLoading(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getLoading() != null) {
			renrederedAttributes.add(renderBoolean("loading", imageGallery.getLoading()));
		}
	}

	protected void renderLoadingEl(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getLoadingEl() != null) {
			renrederedAttributes.add(renderString("loadingEl", imageGallery.getLoadingEl()));
		}
	}

	protected void renderImagegalleryLocale(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getImagegalleryLocale() != null) {
			renrederedAttributes.add(renderString("imagegalleryLocale", imageGallery.getImagegalleryLocale()));
		}
	}

	protected void renderMaskNode(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getMaskNode() != null) {
			renrederedAttributes.add(renderString("maskNode", imageGallery.getMaskNode()));
		}
	}

	protected void renderMaxHeight(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getMaxHeight() != null) {
			renrederedAttributes.add(renderNumber("maxHeight", imageGallery.getMaxHeight()));
		}
	}

	protected void renderMaxWidth(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getMaxWidth() != null) {
			renrederedAttributes.add(renderNumber("maxWidth", imageGallery.getMaxWidth()));
		}
	}

	protected void renderModal(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getModal() != null) {
			renrederedAttributes.add(renderBoolean("modal", imageGallery.getModal()));
		}
	}

	protected void renderPagination(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getPagination() != null) {
			renrederedAttributes.add(renderObject("pagination", imageGallery.getPagination()));
		}
	}

	protected void renderPaginationEl(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getPaginationEl() != null) {
			renrederedAttributes.add(renderString("paginationEl", imageGallery.getPaginationEl()));
		}
	}

	protected void renderPaginationInstance(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getPaginationInstance() != null) {
			renrederedAttributes.add(renderString("paginationInstance", imageGallery.getPaginationInstance()));
		}
	}

	protected void renderPaused(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getPaused() != null) {
			renrederedAttributes.add(renderBoolean("paused", imageGallery.getPaused()));
		}
	}

	protected void renderPausedLabel(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getPausedLabel() != null) {
			renrederedAttributes.add(renderString("pausedLabel", imageGallery.getPausedLabel()));
		}
	}

	protected void renderPlaying(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getPlaying() != null) {
			renrederedAttributes.add(renderBoolean("playing", imageGallery.getPlaying()));
		}
	}

	protected void renderPlayingLabel(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getPlayingLabel() != null) {
			renrederedAttributes.add(renderString("playingLabel", imageGallery.getPlayingLabel()));
		}
	}

	protected void renderPreloadAllImages(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getPreloadAllImages() != null) {
			renrederedAttributes.add(renderBoolean("preloadAllImages", imageGallery.getPreloadAllImages()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", imageGallery.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getRender() != null) {
			renrederedAttributes.add(renderString("render", imageGallery.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", imageGallery.getRendered()));
		}
	}

	protected void renderRepeat(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getRepeat() != null) {
			renrederedAttributes.add(renderBoolean("repeat", imageGallery.getRepeat()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", imageGallery.getShim()));
		}
	}

	protected void renderShowClose(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getShowClose() != null) {
			renrederedAttributes.add(renderBoolean("showClose", imageGallery.getShowClose()));
		}
	}

	protected void renderShowControls(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getShowControls() != null) {
			renrederedAttributes.add(renderBoolean("showControls", imageGallery.getShowControls()));
		}
	}

	protected void renderShowPlayer(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getShowPlayer() != null) {
			renrederedAttributes.add(renderBoolean("showPlayer", imageGallery.getShowPlayer()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", imageGallery.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", imageGallery.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", imageGallery.getTabIndex()));
		}
	}

	protected void renderToolbar(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getToolbar() != null) {
			renrederedAttributes.add(renderString("toolbar", imageGallery.getToolbar()));
		}
	}

	protected void renderTotalLinks(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getTotalLinks() != null) {
			renrederedAttributes.add(renderBoolean("totalLinks", imageGallery.getTotalLinks()));
		}
	}

	protected void renderUseOriginalImage(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getUseOriginalImage() != null) {
			renrederedAttributes.add(renderBoolean("useOriginalImage", imageGallery.getUseOriginalImage()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", imageGallery.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getWidth() != null) {
			renrederedAttributes.add(renderString("width", imageGallery.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getX() != null) {
			renrederedAttributes.add(renderNumber("x", imageGallery.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", imageGallery.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getY() != null) {
			renrederedAttributes.add(renderNumber("y", imageGallery.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, ImageGallery imageGallery) throws IOException {
		if (imageGallery.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", imageGallery.getZIndex()));
		}
	}

}