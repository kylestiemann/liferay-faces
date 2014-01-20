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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterActiveIndexChange(renderedAfterEvents, carousel);
		renderAfterAnimationTimeChange(renderedAfterEvents, carousel);
		renderAfterHideClassChange(renderedAfterEvents, carousel);
		renderAfterIntervalTimeChange(renderedAfterEvents, carousel);
		renderAfterItemSelectorChange(renderedAfterEvents, carousel);
		renderAfterNodeMenuChange(renderedAfterEvents, carousel);
		renderAfterNodeMenuItemSelectorChange(renderedAfterEvents, carousel);
		renderAfterPlayingChange(renderedAfterEvents, carousel);
		renderAfterRenderChange(renderedAfterEvents, carousel);
		renderAfterUseARIAChange(renderedAfterEvents, carousel);

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

		renderOnActiveIndexChange(renderedOnEvents, carousel);
		renderOnAnimationTimeChange(renderedOnEvents, carousel);
		renderOnHideClassChange(renderedOnEvents, carousel);
		renderOnIntervalTimeChange(renderedOnEvents, carousel);
		renderOnItemSelectorChange(renderedOnEvents, carousel);
		renderOnNodeMenuChange(renderedOnEvents, carousel);
		renderOnNodeMenuItemSelectorChange(renderedOnEvents, carousel);
		renderOnPlayingChange(renderedOnEvents, carousel);
		renderOnRenderChange(renderedOnEvents, carousel);
		renderOnUseARIAChange(renderedOnEvents, carousel);

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

	protected void renderAfterActiveIndexChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterActiveIndexChange = carousel.getAfterActiveIndexChange();

		if (afterActiveIndexChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_ACTIVE_INDEX_CHANGE, afterActiveIndexChange));
		}
	}

	protected void renderAfterAnimationTimeChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterAnimationTimeChange = carousel.getAfterAnimationTimeChange();

		if (afterAnimationTimeChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_ANIMATION_TIME_CHANGE, afterAnimationTimeChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterHideClassChange = carousel.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIntervalTimeChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterIntervalTimeChange = carousel.getAfterIntervalTimeChange();

		if (afterIntervalTimeChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_INTERVAL_TIME_CHANGE, afterIntervalTimeChange));
		}
	}

	protected void renderAfterItemSelectorChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterItemSelectorChange = carousel.getAfterItemSelectorChange();

		if (afterItemSelectorChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_ITEM_SELECTOR_CHANGE, afterItemSelectorChange));
		}
	}

	protected void renderAfterNodeMenuChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterNodeMenuChange = carousel.getAfterNodeMenuChange();

		if (afterNodeMenuChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_NODE_MENU_CHANGE, afterNodeMenuChange));
		}
	}

	protected void renderAfterNodeMenuItemSelectorChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterNodeMenuItemSelectorChange = carousel.getAfterNodeMenuItemSelectorChange();

		if (afterNodeMenuItemSelectorChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_NODE_MENU_ITEM_SELECTOR_CHANGE, afterNodeMenuItemSelectorChange));
		}
	}

	protected void renderAfterPlayingChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterPlayingChange = carousel.getAfterPlayingChange();

		if (afterPlayingChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_PLAYING_CHANGE, afterPlayingChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterRenderChange = carousel.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterUseARIAChange = carousel.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(Carousel.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderOnActiveIndexChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onActiveIndexChange = carousel.getOnActiveIndexChange();

		if (onActiveIndexChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_ACTIVE_INDEX_CHANGE, onActiveIndexChange));
		}
	}

	protected void renderOnAnimationTimeChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onAnimationTimeChange = carousel.getOnAnimationTimeChange();

		if (onAnimationTimeChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_ANIMATION_TIME_CHANGE, onAnimationTimeChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onHideClassChange = carousel.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIntervalTimeChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onIntervalTimeChange = carousel.getOnIntervalTimeChange();

		if (onIntervalTimeChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_INTERVAL_TIME_CHANGE, onIntervalTimeChange));
		}
	}

	protected void renderOnItemSelectorChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onItemSelectorChange = carousel.getOnItemSelectorChange();

		if (onItemSelectorChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_ITEM_SELECTOR_CHANGE, onItemSelectorChange));
		}
	}

	protected void renderOnNodeMenuChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onNodeMenuChange = carousel.getOnNodeMenuChange();

		if (onNodeMenuChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_NODE_MENU_CHANGE, onNodeMenuChange));
		}
	}

	protected void renderOnNodeMenuItemSelectorChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onNodeMenuItemSelectorChange = carousel.getOnNodeMenuItemSelectorChange();

		if (onNodeMenuItemSelectorChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_NODE_MENU_ITEM_SELECTOR_CHANGE, onNodeMenuItemSelectorChange));
		}
	}

	protected void renderOnPlayingChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onPlayingChange = carousel.getOnPlayingChange();

		if (onPlayingChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_PLAYING_CHANGE, onPlayingChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onRenderChange = carousel.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onUseARIAChange = carousel.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(Carousel.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

}