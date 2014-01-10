/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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
public abstract class ImageViewerRendererBase extends AUIRenderer {

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);
		ImageViewer imageViewer = (ImageViewer) uiComponent;
		encodeHTML(facesContext, imageViewer);
		encodeJavaScript(facesContext, imageViewer);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ImageViewer imageViewer) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ImageViewer imageViewer) throws IOException {

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.startElement("script", imageViewer);
		responseWriter.writeAttribute("type", "text/javascript", null);

		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.FORWARD_SLASH);
		responseWriter.write(StringPool.SPACE);
		responseWriter.write(StringPool.CDATA_OPEN);
		responseWriter.write(StringPool.NEW_LINE);

		responseWriter.write("YUI().use");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("'aui-imageviewer',");
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("function(Y) ");
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);
		responseWriter.write("var imageViewer = new Y.ImageViewer");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);
		responseWriter.write(StringPool.NEW_LINE);

		if(imageViewer.getAnim() != null)
		{

			responseWriter.write("anim: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getAnim().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getImageviewerBodyContent() != null)
		{

			responseWriter.write("imageviewerBodyContent: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getImageviewerBodyContent().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getCaption() != null)
		{

			responseWriter.write("caption: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getCaption().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getCaptionEl() != null)
		{

			responseWriter.write("captionEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getCaptionEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getCaptionFromTitle() != null)
		{

			responseWriter.write("captionFromTitle: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getCaptionFromTitle().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getCentered() != null)
		{

			responseWriter.write("centered: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getCentered().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getCloseEl() != null)
		{

			responseWriter.write("closeEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getCloseEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getControlLeftEl() != null)
		{

			responseWriter.write("controlLeftEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getControlLeftEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getControlRightEl() != null)
		{

			responseWriter.write("controlRightEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getControlRightEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getCurrentIndex() != null)
		{

			responseWriter.write("currentIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getCurrentIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getImage() != null)
		{

			responseWriter.write("image: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getImage().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getImageAnim() != null)
		{

			responseWriter.write("imageAnim: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getImageAnim().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getInfoEl() != null)
		{

			responseWriter.write("infoEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getInfoEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getInfoTemplate() != null)
		{

			responseWriter.write("infoTemplate: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getInfoTemplate().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getLinks() != null)
		{

			responseWriter.write("links: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getLinks().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getLoader() != null)
		{

			responseWriter.write("loader: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getLoader().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getLoading() != null)
		{

			responseWriter.write("loading: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getLoading().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getLoadingEl() != null)
		{

			responseWriter.write("loadingEl: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getLoadingEl().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getMaxHeight() != null)
		{

			responseWriter.write("maxHeight: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getMaxHeight().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getMaxWidth() != null)
		{

			responseWriter.write("maxWidth: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getMaxWidth().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getModal() != null)
		{

			responseWriter.write("modal: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getModal().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getPreloadAllImages() != null)
		{

			responseWriter.write("preloadAllImages: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getPreloadAllImages().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getShowClose() != null)
		{

			responseWriter.write("showClose: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getShowClose().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getShowControls() != null)
		{

			responseWriter.write("showControls: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getShowControls().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getTabIndex() != null)
		{

			responseWriter.write("tabIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getTabIndex().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getTotalLinks() != null)
		{

			responseWriter.write("totalLinks: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getTotalLinks().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getVisible() != null)
		{

			responseWriter.write("visible: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getVisible().toString());
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(StringPool.COMMA);
			responseWriter.write(StringPool.NEW_LINE);
		}

		if(imageViewer.getZIndex() != null)
		{

			responseWriter.write("zIndex: ");
			responseWriter.write(StringPool.APOSTROPHE);
			responseWriter.write(imageViewer.getZIndex().toString());
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