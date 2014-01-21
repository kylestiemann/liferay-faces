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

		if (carousel.getActiveIndex() != null) {
			renderActiveIndex(renderedAttributes, carousel);
		}

		if (carousel.getAnimationTime() != null) {
			renderAnimationTime(renderedAttributes, carousel);
		}

		if (carousel.getHideClass() != null) {
			renderHideClass(renderedAttributes, carousel);
		}

		if (carousel.getIntervalTime() != null) {
			renderIntervalTime(renderedAttributes, carousel);
		}

		if (carousel.getItemSelector() != null) {
			renderItemSelector(renderedAttributes, carousel);
		}

		if (carousel.getNodeMenu() != null) {
			renderNodeMenu(renderedAttributes, carousel);
		}

		if (carousel.getNodeMenuItemSelector() != null) {
			renderNodeMenuItemSelector(renderedAttributes, carousel);
		}

		if (carousel.getPlaying() != null) {
			renderPlaying(renderedAttributes, carousel);
		}

		if (carousel.getRender() != null) {
			renderRender(renderedAttributes, carousel);
		}

		if (carousel.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, carousel);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (carousel.getAfterActiveIndexChange() != null) {
			renderAfterActiveIndexChange(renderedAfterEvents, carousel);
		}

		if (carousel.getAfterAnimationTimeChange() != null) {
			renderAfterAnimationTimeChange(renderedAfterEvents, carousel);
		}

		if (carousel.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, carousel);
		}

		if (carousel.getAfterIntervalTimeChange() != null) {
			renderAfterIntervalTimeChange(renderedAfterEvents, carousel);
		}

		if (carousel.getAfterItemSelectorChange() != null) {
			renderAfterItemSelectorChange(renderedAfterEvents, carousel);
		}

		if (carousel.getAfterNodeMenuChange() != null) {
			renderAfterNodeMenuChange(renderedAfterEvents, carousel);
		}

		if (carousel.getAfterNodeMenuItemSelectorChange() != null) {
			renderAfterNodeMenuItemSelectorChange(renderedAfterEvents, carousel);
		}

		if (carousel.getAfterPlayingChange() != null) {
			renderAfterPlayingChange(renderedAfterEvents, carousel);
		}

		if (carousel.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, carousel);
		}

		if (carousel.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, carousel);
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

		if (carousel.getOnActiveIndexChange() != null) {
			renderOnActiveIndexChange(renderedOnEvents, carousel);
		}

		if (carousel.getOnAnimationTimeChange() != null) {
			renderOnAnimationTimeChange(renderedOnEvents, carousel);
		}

		if (carousel.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, carousel);
		}

		if (carousel.getOnIntervalTimeChange() != null) {
			renderOnIntervalTimeChange(renderedOnEvents, carousel);
		}

		if (carousel.getOnItemSelectorChange() != null) {
			renderOnItemSelectorChange(renderedOnEvents, carousel);
		}

		if (carousel.getOnNodeMenuChange() != null) {
			renderOnNodeMenuChange(renderedOnEvents, carousel);
		}

		if (carousel.getOnNodeMenuItemSelectorChange() != null) {
			renderOnNodeMenuItemSelectorChange(renderedOnEvents, carousel);
		}

		if (carousel.getOnPlayingChange() != null) {
			renderOnPlayingChange(renderedOnEvents, carousel);
		}

		if (carousel.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, carousel);
		}

		if (carousel.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, carousel);
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

	protected void renderActiveIndex(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Object activeIndex = carousel.getActiveIndex();
		renderedAttributes.add(renderNumber(Carousel.ACTIVE_INDEX, activeIndex));
	}

	protected void renderAnimationTime(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Object animationTime = carousel.getAnimationTime();
		renderedAttributes.add(renderNumber(Carousel.ANIMATION_TIME, animationTime));
	}

	protected void renderHideClass(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String hideClass = carousel.getHideClass();
		renderedAttributes.add(renderString(Carousel.HIDE_CLASS, hideClass));
	}

	protected void renderIntervalTime(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Object intervalTime = carousel.getIntervalTime();
		renderedAttributes.add(renderNumber(Carousel.INTERVAL_TIME, intervalTime));
	}

	protected void renderItemSelector(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String itemSelector = carousel.getItemSelector();
		renderedAttributes.add(renderString(Carousel.ITEM_SELECTOR, itemSelector));
	}

	protected void renderNodeMenu(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String nodeMenu = carousel.getNodeMenu();
		renderedAttributes.add(renderString(Carousel.NODE_MENU, nodeMenu));
	}

	protected void renderNodeMenuItemSelector(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String nodeMenuItemSelector = carousel.getNodeMenuItemSelector();
		renderedAttributes.add(renderString(Carousel.NODE_MENU_ITEM_SELECTOR, nodeMenuItemSelector));
	}

	protected void renderPlaying(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Boolean playing = carousel.getPlaying();
		renderedAttributes.add(renderBoolean(Carousel.PLAYING, playing));
	}

	protected void renderRender(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Object render = carousel.getRender();
		renderedAttributes.add(renderString(Carousel.RENDER, render));
	}

	protected void renderUseARIA(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.Boolean useARIA = carousel.getUseARIA();
		renderedAttributes.add(renderBoolean(Carousel.USE_ARIA, useARIA));
	}

	protected void renderAfterActiveIndexChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterActiveIndexChange = carousel.getAfterActiveIndexChange();
		renderedAttributes.add(renderString(Carousel.AFTER_ACTIVE_INDEX_CHANGE, afterActiveIndexChange));
	}

	protected void renderAfterAnimationTimeChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterAnimationTimeChange = carousel.getAfterAnimationTimeChange();
		renderedAttributes.add(renderString(Carousel.AFTER_ANIMATION_TIME_CHANGE, afterAnimationTimeChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterHideClassChange = carousel.getAfterHideClassChange();
		renderedAttributes.add(renderString(Carousel.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIntervalTimeChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterIntervalTimeChange = carousel.getAfterIntervalTimeChange();
		renderedAttributes.add(renderString(Carousel.AFTER_INTERVAL_TIME_CHANGE, afterIntervalTimeChange));
	}

	protected void renderAfterItemSelectorChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterItemSelectorChange = carousel.getAfterItemSelectorChange();
		renderedAttributes.add(renderString(Carousel.AFTER_ITEM_SELECTOR_CHANGE, afterItemSelectorChange));
	}

	protected void renderAfterNodeMenuChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterNodeMenuChange = carousel.getAfterNodeMenuChange();
		renderedAttributes.add(renderString(Carousel.AFTER_NODE_MENU_CHANGE, afterNodeMenuChange));
	}

	protected void renderAfterNodeMenuItemSelectorChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterNodeMenuItemSelectorChange = carousel.getAfterNodeMenuItemSelectorChange();
		renderedAttributes.add(renderString(Carousel.AFTER_NODE_MENU_ITEM_SELECTOR_CHANGE, afterNodeMenuItemSelectorChange));
	}

	protected void renderAfterPlayingChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterPlayingChange = carousel.getAfterPlayingChange();
		renderedAttributes.add(renderString(Carousel.AFTER_PLAYING_CHANGE, afterPlayingChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterRenderChange = carousel.getAfterRenderChange();
		renderedAttributes.add(renderString(Carousel.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String afterUseARIAChange = carousel.getAfterUseARIAChange();
		renderedAttributes.add(renderString(Carousel.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderOnActiveIndexChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onActiveIndexChange = carousel.getOnActiveIndexChange();
		renderedAttributes.add(renderString(Carousel.ON_ACTIVE_INDEX_CHANGE, onActiveIndexChange));
	}

	protected void renderOnAnimationTimeChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onAnimationTimeChange = carousel.getOnAnimationTimeChange();
		renderedAttributes.add(renderString(Carousel.ON_ANIMATION_TIME_CHANGE, onAnimationTimeChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onHideClassChange = carousel.getOnHideClassChange();
		renderedAttributes.add(renderString(Carousel.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIntervalTimeChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onIntervalTimeChange = carousel.getOnIntervalTimeChange();
		renderedAttributes.add(renderString(Carousel.ON_INTERVAL_TIME_CHANGE, onIntervalTimeChange));
	}

	protected void renderOnItemSelectorChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onItemSelectorChange = carousel.getOnItemSelectorChange();
		renderedAttributes.add(renderString(Carousel.ON_ITEM_SELECTOR_CHANGE, onItemSelectorChange));
	}

	protected void renderOnNodeMenuChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onNodeMenuChange = carousel.getOnNodeMenuChange();
		renderedAttributes.add(renderString(Carousel.ON_NODE_MENU_CHANGE, onNodeMenuChange));
	}

	protected void renderOnNodeMenuItemSelectorChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onNodeMenuItemSelectorChange = carousel.getOnNodeMenuItemSelectorChange();
		renderedAttributes.add(renderString(Carousel.ON_NODE_MENU_ITEM_SELECTOR_CHANGE, onNodeMenuItemSelectorChange));
	}

	protected void renderOnPlayingChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onPlayingChange = carousel.getOnPlayingChange();
		renderedAttributes.add(renderString(Carousel.ON_PLAYING_CHANGE, onPlayingChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onRenderChange = carousel.getOnRenderChange();
		renderedAttributes.add(renderString(Carousel.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Carousel carousel) throws IOException {
		java.lang.String onUseARIAChange = carousel.getOnUseARIAChange();
		renderedAttributes.add(renderString(Carousel.ON_USE_ARIACHANGE, onUseARIAChange));
	}

}