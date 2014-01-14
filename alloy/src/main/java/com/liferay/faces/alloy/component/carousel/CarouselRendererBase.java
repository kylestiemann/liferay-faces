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
package com.liferay.faces.alloy.component.carousel;

import java.io.IOException;

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
public abstract class CarouselRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-carousel";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Carousel carousel = (Carousel) uiComponent;
		encodeHTML(facesContext, carousel);
		encodeJavaScript(facesContext, carousel);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Carousel carousel) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Carousel carousel) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, carousel);

		bufferedResponseWriter.write("var carousel = new Y.Carousel");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderActiveIndex(bufferedResponseWriter, carousel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderAnimationTime(bufferedResponseWriter, carousel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideClass(bufferedResponseWriter, carousel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIntervalTime(bufferedResponseWriter, carousel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderItemSelector(bufferedResponseWriter, carousel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNodeMenu(bufferedResponseWriter, carousel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNodeMenuItemSelector(bufferedResponseWriter, carousel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPlaying(bufferedResponseWriter, carousel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, carousel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseARIA(bufferedResponseWriter, carousel);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, carousel);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderActiveIndex(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderNumber(responseWriter, "activeIndex", carousel.getActiveIndex());
	}

	protected void renderAnimationTime(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderNumber(responseWriter, "animationTime", carousel.getAnimationTime());
	}

	protected void renderHideClass(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderString(responseWriter, "hideClass", carousel.getHideClass());
	}

	protected void renderIntervalTime(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderNumber(responseWriter, "intervalTime", carousel.getIntervalTime());
	}

	protected void renderItemSelector(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderString(responseWriter, "itemSelector", carousel.getItemSelector());
	}

	protected void renderNodeMenu(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderString(responseWriter, "nodeMenu", carousel.getNodeMenu());
	}

	protected void renderNodeMenuItemSelector(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderString(responseWriter, "nodeMenuItemSelector", carousel.getNodeMenuItemSelector());
	}

	protected void renderPlaying(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderBoolean(responseWriter, "playing", carousel.getPlaying());
	}

	protected void renderRender(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderString(responseWriter, "render", carousel.getRender());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, Carousel carousel) throws IOException {
		renderBoolean(responseWriter, "useARIA", carousel.getUseARIA());
	}

}