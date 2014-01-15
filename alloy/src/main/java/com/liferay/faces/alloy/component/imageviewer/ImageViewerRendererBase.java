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

		bufferedResponseWriter.write("var imageViewer = new A.ImageViewer");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAlign(renrederedAttributes, imageViewer);
		renderAlignOn(renrederedAttributes, imageViewer);
		renderAnim(renrederedAttributes, imageViewer);
		renderImageviewerBodyContent(renrederedAttributes, imageViewer);
		renderBoundingBox(renrederedAttributes, imageViewer);
		renderCaption(renrederedAttributes, imageViewer);
		renderCaptionEl(renrederedAttributes, imageViewer);
		renderCaptionFromTitle(renrederedAttributes, imageViewer);
		renderCentered(renrederedAttributes, imageViewer);
		renderCloseEl(renrederedAttributes, imageViewer);
		renderConstrain(renrederedAttributes, imageViewer);
		renderContentBox(renrederedAttributes, imageViewer);
		renderControlLeftEl(renrederedAttributes, imageViewer);
		renderControlRightEl(renrederedAttributes, imageViewer);
		renderCurrentIndex(renrederedAttributes, imageViewer);
		renderDestroyed(renrederedAttributes, imageViewer);
		renderDisabled(renrederedAttributes, imageViewer);
		renderFillHeight(renrederedAttributes, imageViewer);
		renderFocusOn(renrederedAttributes, imageViewer);
		renderFocused(renrederedAttributes, imageViewer);
		renderFooterContent(renrederedAttributes, imageViewer);
		renderHeaderContent(renrederedAttributes, imageViewer);
		renderHeight(renrederedAttributes, imageViewer);
		renderImageviewerId(renrederedAttributes, imageViewer);
		renderImage(renrederedAttributes, imageViewer);
		renderImageAnim(renrederedAttributes, imageViewer);
		renderInfoEl(renrederedAttributes, imageViewer);
		renderInfoTemplate(renrederedAttributes, imageViewer);
		renderInitialized(renrederedAttributes, imageViewer);
		renderLinks(renrederedAttributes, imageViewer);
		renderLoader(renrederedAttributes, imageViewer);
		renderLoading(renrederedAttributes, imageViewer);
		renderLoadingEl(renrederedAttributes, imageViewer);
		renderImageviewerLocale(renrederedAttributes, imageViewer);
		renderMaskNode(renrederedAttributes, imageViewer);
		renderMaxHeight(renrederedAttributes, imageViewer);
		renderMaxWidth(renrederedAttributes, imageViewer);
		renderModal(renrederedAttributes, imageViewer);
		renderPreloadAllImages(renrederedAttributes, imageViewer);
		renderPreventOverlap(renrederedAttributes, imageViewer);
		renderRender(renrederedAttributes, imageViewer);
		renderRendered(renrederedAttributes, imageViewer);
		renderShim(renrederedAttributes, imageViewer);
		renderShowClose(renrederedAttributes, imageViewer);
		renderShowControls(renrederedAttributes, imageViewer);
		renderSrcNode(renrederedAttributes, imageViewer);
		renderStrings(renrederedAttributes, imageViewer);
		renderTabIndex(renrederedAttributes, imageViewer);
		renderTotalLinks(renrederedAttributes, imageViewer);
		renderVisible(renrederedAttributes, imageViewer);
		renderWidth(renrederedAttributes, imageViewer);
		renderX(renrederedAttributes, imageViewer);
		renderXy(renrederedAttributes, imageViewer);
		renderY(renrederedAttributes, imageViewer);
		renderZIndex(renrederedAttributes, imageViewer);

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

		handleBuffer(facesContext, imageViewer);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getAlign() != null) {
			renrederedAttributes.add(renderObject("align", imageViewer.getAlign()));
		}
	}

	protected void renderAlignOn(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getAlignOn() != null) {
			renrederedAttributes.add(renderArray("alignOn", imageViewer.getAlignOn()));
		}
	}

	protected void renderAnim(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getAnim() != null) {
			renrederedAttributes.add(renderBoolean("anim", imageViewer.getAnim()));
		}
	}

	protected void renderImageviewerBodyContent(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getImageviewerBodyContent() != null) {
			renrederedAttributes.add(renderString("imageviewerBodyContent", imageViewer.getImageviewerBodyContent()));
		}
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", imageViewer.getBoundingBox()));
		}
	}

	protected void renderCaption(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getCaption() != null) {
			renrederedAttributes.add(renderString("caption", imageViewer.getCaption()));
		}
	}

	protected void renderCaptionEl(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getCaptionEl() != null) {
			renrederedAttributes.add(renderString("captionEl", imageViewer.getCaptionEl()));
		}
	}

	protected void renderCaptionFromTitle(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getCaptionFromTitle() != null) {
			renrederedAttributes.add(renderBoolean("captionFromTitle", imageViewer.getCaptionFromTitle()));
		}
	}

	protected void renderCentered(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getCentered() != null) {
			renrederedAttributes.add(renderBoolean("centered", imageViewer.getCentered()));
		}
	}

	protected void renderCloseEl(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getCloseEl() != null) {
			renrederedAttributes.add(renderString("closeEl", imageViewer.getCloseEl()));
		}
	}

	protected void renderConstrain(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getConstrain() != null) {
			renrederedAttributes.add(renderString("constrain", imageViewer.getConstrain()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", imageViewer.getContentBox()));
		}
	}

	protected void renderControlLeftEl(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getControlLeftEl() != null) {
			renrederedAttributes.add(renderString("controlLeftEl", imageViewer.getControlLeftEl()));
		}
	}

	protected void renderControlRightEl(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getControlRightEl() != null) {
			renrederedAttributes.add(renderString("controlRightEl", imageViewer.getControlRightEl()));
		}
	}

	protected void renderCurrentIndex(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getCurrentIndex() != null) {
			renrederedAttributes.add(renderNumber("currentIndex", imageViewer.getCurrentIndex()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", imageViewer.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", imageViewer.getDisabled()));
		}
	}

	protected void renderFillHeight(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getFillHeight() != null) {
			renrederedAttributes.add(renderString("fillHeight", imageViewer.getFillHeight()));
		}
	}

	protected void renderFocusOn(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getFocusOn() != null) {
			renrederedAttributes.add(renderArray("focusOn", imageViewer.getFocusOn()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", imageViewer.getFocused()));
		}
	}

	protected void renderFooterContent(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getFooterContent() != null) {
			renrederedAttributes.add(renderString("footerContent", imageViewer.getFooterContent()));
		}
	}

	protected void renderHeaderContent(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getHeaderContent() != null) {
			renrederedAttributes.add(renderString("headerContent", imageViewer.getHeaderContent()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getHeight() != null) {
			renrederedAttributes.add(renderString("height", imageViewer.getHeight()));
		}
	}

	protected void renderImageviewerId(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getImageviewerId() != null) {
			renrederedAttributes.add(renderString("imageviewerId", imageViewer.getImageviewerId()));
		}
	}

	protected void renderImage(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getImage() != null) {
			renrederedAttributes.add(renderString("image", imageViewer.getImage()));
		}
	}

	protected void renderImageAnim(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getImageAnim() != null) {
			renrederedAttributes.add(renderObject("imageAnim", imageViewer.getImageAnim()));
		}
	}

	protected void renderInfoEl(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getInfoEl() != null) {
			renrederedAttributes.add(renderString("infoEl", imageViewer.getInfoEl()));
		}
	}

	protected void renderInfoTemplate(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getInfoTemplate() != null) {
			renrederedAttributes.add(renderString("infoTemplate", imageViewer.getInfoTemplate()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", imageViewer.getInitialized()));
		}
	}

	protected void renderLinks(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getLinks() != null) {
			renrederedAttributes.add(renderString("links", imageViewer.getLinks()));
		}
	}

	protected void renderLoader(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getLoader() != null) {
			renrederedAttributes.add(renderString("loader", imageViewer.getLoader()));
		}
	}

	protected void renderLoading(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getLoading() != null) {
			renrederedAttributes.add(renderBoolean("loading", imageViewer.getLoading()));
		}
	}

	protected void renderLoadingEl(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getLoadingEl() != null) {
			renrederedAttributes.add(renderString("loadingEl", imageViewer.getLoadingEl()));
		}
	}

	protected void renderImageviewerLocale(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getImageviewerLocale() != null) {
			renrederedAttributes.add(renderString("imageviewerLocale", imageViewer.getImageviewerLocale()));
		}
	}

	protected void renderMaskNode(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getMaskNode() != null) {
			renrederedAttributes.add(renderString("maskNode", imageViewer.getMaskNode()));
		}
	}

	protected void renderMaxHeight(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getMaxHeight() != null) {
			renrederedAttributes.add(renderNumber("maxHeight", imageViewer.getMaxHeight()));
		}
	}

	protected void renderMaxWidth(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getMaxWidth() != null) {
			renrederedAttributes.add(renderNumber("maxWidth", imageViewer.getMaxWidth()));
		}
	}

	protected void renderModal(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getModal() != null) {
			renrederedAttributes.add(renderBoolean("modal", imageViewer.getModal()));
		}
	}

	protected void renderPreloadAllImages(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getPreloadAllImages() != null) {
			renrederedAttributes.add(renderBoolean("preloadAllImages", imageViewer.getPreloadAllImages()));
		}
	}

	protected void renderPreventOverlap(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getPreventOverlap() != null) {
			renrederedAttributes.add(renderBoolean("preventOverlap", imageViewer.getPreventOverlap()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getRender() != null) {
			renrederedAttributes.add(renderString("render", imageViewer.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", imageViewer.getRendered()));
		}
	}

	protected void renderShim(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getShim() != null) {
			renrederedAttributes.add(renderBoolean("shim", imageViewer.getShim()));
		}
	}

	protected void renderShowClose(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getShowClose() != null) {
			renrederedAttributes.add(renderBoolean("showClose", imageViewer.getShowClose()));
		}
	}

	protected void renderShowControls(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getShowControls() != null) {
			renrederedAttributes.add(renderBoolean("showControls", imageViewer.getShowControls()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", imageViewer.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", imageViewer.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", imageViewer.getTabIndex()));
		}
	}

	protected void renderTotalLinks(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getTotalLinks() != null) {
			renrederedAttributes.add(renderBoolean("totalLinks", imageViewer.getTotalLinks()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", imageViewer.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getWidth() != null) {
			renrederedAttributes.add(renderString("width", imageViewer.getWidth()));
		}
	}

	protected void renderX(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getX() != null) {
			renrederedAttributes.add(renderNumber("x", imageViewer.getX()));
		}
	}

	protected void renderXy(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getXy() != null) {
			renrederedAttributes.add(renderArray("xy", imageViewer.getXy()));
		}
	}

	protected void renderY(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getY() != null) {
			renrederedAttributes.add(renderNumber("y", imageViewer.getY()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, ImageViewer imageViewer) throws IOException {
		if (imageViewer.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", imageViewer.getZIndex()));
		}
	}

}