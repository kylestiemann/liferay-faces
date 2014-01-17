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
public abstract class CarouselRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-carousel";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Carousel carousel = (Carousel) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var carousel = new A.Carousel");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderActiveIndex(renderedAttributes, carousel);
		renderAnimationTime(renderedAttributes, carousel);
		renderHideClass(renderedAttributes, carousel);
		renderIntervalTime(renderedAttributes, carousel);
		renderItemSelector(renderedAttributes, carousel);
		renderNodeMenu(renderedAttributes, carousel);
		renderNodeMenuItemSelector(renderedAttributes, carousel);
		renderPlaying(renderedAttributes, carousel);
		renderRender(renderedAttributes, carousel);
		renderUseARIA(renderedAttributes, carousel);

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

	protected void renderActiveIndex(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Object activeIndex = carousel.getActiveIndex();

		if (activeIndex != null) {
			renderedAttributes.add(renderNumber(Carousel.ACTIVE_INDEX, activeIndex));
		}
	}

	protected void renderAnimationTime(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Object animationTime = carousel.getAnimationTime();

		if (animationTime != null) {
			renderedAttributes.add(renderNumber(Carousel.ANIMATION_TIME, animationTime));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String hideClass = carousel.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(Carousel.HIDE_CLASS, hideClass));
		}
	}

	protected void renderIntervalTime(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Object intervalTime = carousel.getIntervalTime();

		if (intervalTime != null) {
			renderedAttributes.add(renderNumber(Carousel.INTERVAL_TIME, intervalTime));
		}
	}

	protected void renderItemSelector(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String itemSelector = carousel.getItemSelector();

		if (itemSelector != null) {
			renderedAttributes.add(renderString(Carousel.ITEM_SELECTOR, itemSelector));
		}
	}

	protected void renderNodeMenu(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String nodeMenu = carousel.getNodeMenu();

		if (nodeMenu != null) {
			renderedAttributes.add(renderString(Carousel.NODE_MENU, nodeMenu));
		}
	}

	protected void renderNodeMenuItemSelector(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String nodeMenuItemSelector = carousel.getNodeMenuItemSelector();

		if (nodeMenuItemSelector != null) {
			renderedAttributes.add(renderString(Carousel.NODE_MENU_ITEM_SELECTOR, nodeMenuItemSelector));
		}
	}

	protected void renderPlaying(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Boolean playing = carousel.getPlaying();

		if (playing != null) {
			renderedAttributes.add(renderBoolean(Carousel.PLAYING, playing));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Object render = carousel.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Carousel.RENDER, render));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Boolean useARIA = carousel.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(Carousel.USE_ARIA, useARIA));
		}
	}

}