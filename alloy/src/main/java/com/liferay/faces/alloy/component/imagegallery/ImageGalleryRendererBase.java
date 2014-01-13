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
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class ImageGalleryRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		ImageGallery imageGallery = (ImageGallery) uiComponent;
		encodeHTML(facesContext, imageGallery);
		encodeJavaScript(facesContext, imageGallery);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ImageGallery imageGallery) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ImageGallery imageGallery) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", imageGallery);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-imagegallery',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var imageGallery = new Y.ImageGallery");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(imageGallery.getAnim() != null)
		{

			responseWriter.write("anim: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getAnim().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getAutoPlay() != null)
		{

			responseWriter.write("autoPlay: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getAutoPlay().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getImagegalleryBodyContent() != null)
		{

			responseWriter.write("imagegalleryBodyContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getImagegalleryBodyContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getCaption() != null)
		{

			responseWriter.write("caption: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getCaption().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getCaptionEl() != null)
		{

			responseWriter.write("captionEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getCaptionEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getCaptionFromTitle() != null)
		{

			responseWriter.write("captionFromTitle: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getCaptionFromTitle().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getCentered() != null)
		{

			responseWriter.write("centered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getCentered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getCloseEl() != null)
		{

			responseWriter.write("closeEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getCloseEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getControlLeftEl() != null)
		{

			responseWriter.write("controlLeftEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getControlLeftEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getControlRightEl() != null)
		{

			responseWriter.write("controlRightEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getControlRightEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getCurrentIndex() != null)
		{

			responseWriter.write("currentIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getCurrentIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getDelay() != null)
		{

			responseWriter.write("delay: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getDelay().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getImage() != null)
		{

			responseWriter.write("image: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getImage().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getImageAnim() != null)
		{

			responseWriter.write("imageAnim: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getImageAnim().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getInfoEl() != null)
		{

			responseWriter.write("infoEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getInfoEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getInfoTemplate() != null)
		{

			responseWriter.write("infoTemplate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getInfoTemplate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getLinks() != null)
		{

			responseWriter.write("links: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getLinks().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getLoader() != null)
		{

			responseWriter.write("loader: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getLoader().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getLoading() != null)
		{

			responseWriter.write("loading: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getLoading().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getLoadingEl() != null)
		{

			responseWriter.write("loadingEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getLoadingEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getMaxHeight() != null)
		{

			responseWriter.write("maxHeight: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getMaxHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getMaxWidth() != null)
		{

			responseWriter.write("maxWidth: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getMaxWidth().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getModal() != null)
		{

			responseWriter.write("modal: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getModal().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getPagination() != null)
		{

			responseWriter.write("pagination: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getPagination().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getPaginationEl() != null)
		{

			responseWriter.write("paginationEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getPaginationEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getPaginationInstance() != null)
		{

			responseWriter.write("paginationInstance: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getPaginationInstance().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getPaused() != null)
		{

			responseWriter.write("paused: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getPaused().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getPausedLabel() != null)
		{

			responseWriter.write("pausedLabel: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getPausedLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getPlaying() != null)
		{

			responseWriter.write("playing: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getPlaying().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getPlayingLabel() != null)
		{

			responseWriter.write("playingLabel: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getPlayingLabel().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getPreloadAllImages() != null)
		{

			responseWriter.write("preloadAllImages: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getPreloadAllImages().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getRepeat() != null)
		{

			responseWriter.write("repeat: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getRepeat().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getShowClose() != null)
		{

			responseWriter.write("showClose: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getShowClose().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getShowControls() != null)
		{

			responseWriter.write("showControls: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getShowControls().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getShowPlayer() != null)
		{

			responseWriter.write("showPlayer: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getShowPlayer().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getToolbar() != null)
		{

			responseWriter.write("toolbar: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getToolbar().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getTotalLinks() != null)
		{

			responseWriter.write("totalLinks: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getTotalLinks().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getUseOriginalImage() != null)
		{

			responseWriter.write("useOriginalImage: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getUseOriginalImage().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getVisible().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageGallery.getZIndex() != null)
		{

			responseWriter.write("zIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageGallery.getZIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(StringPool.SEMICOLON);

		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_CLOSE);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.endElement("script");
		responseWriter.write(StringPool.NEW_LINE);
	}

}