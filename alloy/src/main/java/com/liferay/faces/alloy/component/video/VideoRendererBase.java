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
package com.liferay.faces.alloy.component.video;

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
public abstract class VideoRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-video";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Video video = (Video) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var video = new A.Video");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, video);
		renderContentBox(renderedAttributes, video);
		renderCssClass(renderedAttributes, video);
		renderDestroyed(renderedAttributes, video);
		renderDisabled(renderedAttributes, video);
		renderFixedAttributes(renderedAttributes, video);
		renderFlashVars(renderedAttributes, video);
		renderFocused(renderedAttributes, video);
		renderHeight(renderedAttributes, video);
		renderHideClass(renderedAttributes, video);
		renderVideoId(renderedAttributes, video);
		renderInitialized(renderedAttributes, video);
		renderVideoLocale(renderedAttributes, video);
		renderOgvUrl(renderedAttributes, video);
		renderPoster(renderedAttributes, video);
		renderRender(renderedAttributes, video);
		renderRendered(renderedAttributes, video);
		renderSrcNode(renderedAttributes, video);
		renderStrings(renderedAttributes, video);
		renderSwfUrl(renderedAttributes, video);
		renderTabIndex(renderedAttributes, video);
		renderUrl(renderedAttributes, video);
		renderUseARIA(renderedAttributes, video);
		renderVisible(renderedAttributes, video);
		renderWidth(renderedAttributes, video);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, video);
		renderAfterContentBoxChange(renderedAfterEvents, video);
		renderAfterCssClassChange(renderedAfterEvents, video);
		renderAfterDestroyedChange(renderedAfterEvents, video);
		renderAfterDisabledChange(renderedAfterEvents, video);
		renderAfterFixedAttributesChange(renderedAfterEvents, video);
		renderAfterFlashVarsChange(renderedAfterEvents, video);
		renderAfterFocusedChange(renderedAfterEvents, video);
		renderAfterHeightChange(renderedAfterEvents, video);
		renderAfterHideClassChange(renderedAfterEvents, video);
		renderAfterIdChange(renderedAfterEvents, video);
		renderAfterInitializedChange(renderedAfterEvents, video);
		renderAfterLocaleChange(renderedAfterEvents, video);
		renderAfterOgvUrlChange(renderedAfterEvents, video);
		renderAfterPosterChange(renderedAfterEvents, video);
		renderAfterRenderChange(renderedAfterEvents, video);
		renderAfterRenderedChange(renderedAfterEvents, video);
		renderAfterSrcNodeChange(renderedAfterEvents, video);
		renderAfterStringsChange(renderedAfterEvents, video);
		renderAfterSwfUrlChange(renderedAfterEvents, video);
		renderAfterTabIndexChange(renderedAfterEvents, video);
		renderAfterUrlChange(renderedAfterEvents, video);
		renderAfterUseARIAChange(renderedAfterEvents, video);
		renderAfterVisibleChange(renderedAfterEvents, video);
		renderAfterWidthChange(renderedAfterEvents, video);

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

		renderOnBoundingBoxChange(renderedOnEvents, video);
		renderOnContentBoxChange(renderedOnEvents, video);
		renderOnCssClassChange(renderedOnEvents, video);
		renderOnDestroyedChange(renderedOnEvents, video);
		renderOnDisabledChange(renderedOnEvents, video);
		renderOnFixedAttributesChange(renderedOnEvents, video);
		renderOnFlashVarsChange(renderedOnEvents, video);
		renderOnFocusedChange(renderedOnEvents, video);
		renderOnHeightChange(renderedOnEvents, video);
		renderOnHideClassChange(renderedOnEvents, video);
		renderOnIdChange(renderedOnEvents, video);
		renderOnInitializedChange(renderedOnEvents, video);
		renderOnLocaleChange(renderedOnEvents, video);
		renderOnOgvUrlChange(renderedOnEvents, video);
		renderOnPosterChange(renderedOnEvents, video);
		renderOnRenderChange(renderedOnEvents, video);
		renderOnRenderedChange(renderedOnEvents, video);
		renderOnSrcNodeChange(renderedOnEvents, video);
		renderOnStringsChange(renderedOnEvents, video);
		renderOnSwfUrlChange(renderedOnEvents, video);
		renderOnTabIndexChange(renderedOnEvents, video);
		renderOnUrlChange(renderedOnEvents, video);
		renderOnUseARIAChange(renderedOnEvents, video);
		renderOnVisibleChange(renderedOnEvents, video);
		renderOnWidthChange(renderedOnEvents, video);

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

	protected void renderBoundingBox(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String boundingBox = video.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Video.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String contentBox = video.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Video.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String cssClass = video.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(Video.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean destroyed = video.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Video.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean disabled = video.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Video.DISABLED, disabled));
		}
	}

	protected void renderFixedAttributes(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object fixedAttributes = video.getFixedAttributes();

		if (fixedAttributes != null) {
			renderedAttributes.add(renderObject(Video.FIXED_ATTRIBUTES, fixedAttributes));
		}
	}

	protected void renderFlashVars(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object flashVars = video.getFlashVars();

		if (flashVars != null) {
			renderedAttributes.add(renderObject(Video.FLASH_VARS, flashVars));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean focused = video.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Video.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object height = video.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Video.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String hideClass = video.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(Video.HIDE_CLASS, hideClass));
		}
	}

	protected void renderVideoId(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String videoId = video.getVideoId();

		if (videoId != null) {
			renderedAttributes.add(renderString(Video.VIDEO_ID, videoId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean initialized = video.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Video.INITIALIZED, initialized));
		}
	}

	protected void renderVideoLocale(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String videoLocale = video.getVideoLocale();

		if (videoLocale != null) {
			renderedAttributes.add(renderString(Video.VIDEO_LOCALE, videoLocale));
		}
	}

	protected void renderOgvUrl(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String ogvUrl = video.getOgvUrl();

		if (ogvUrl != null) {
			renderedAttributes.add(renderString(Video.OGV_URL, ogvUrl));
		}
	}

	protected void renderPoster(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String poster = video.getPoster();

		if (poster != null) {
			renderedAttributes.add(renderString(Video.POSTER, poster));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean render = video.getRender();

		if (render != null) {
			renderedAttributes.add(renderBoolean(Video.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean rendered = video.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Video.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String srcNode = video.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Video.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object strings = video.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Video.STRINGS, strings));
		}
	}

	protected void renderSwfUrl(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String swfUrl = video.getSwfUrl();

		if (swfUrl != null) {
			renderedAttributes.add(renderString(Video.SWF_URL, swfUrl));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object tabIndex = video.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Video.TAB_INDEX, tabIndex));
		}
	}

	protected void renderUrl(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String url = video.getUrl();

		if (url != null) {
			renderedAttributes.add(renderString(Video.URL, url));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean useARIA = video.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(Video.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean visible = video.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Video.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object width = video.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Video.WIDTH, width));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterBoundingBoxChange = video.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterContentBoxChange = video.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterCssClassChange = video.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterDestroyedChange = video.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterDisabledChange = video.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFixedAttributesChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterFixedAttributesChange = video.getAfterFixedAttributesChange();

		if (afterFixedAttributesChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_FIXED_ATTRIBUTES_CHANGE, afterFixedAttributesChange));
		}
	}

	protected void renderAfterFlashVarsChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterFlashVarsChange = video.getAfterFlashVarsChange();

		if (afterFlashVarsChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_FLASH_VARS_CHANGE, afterFlashVarsChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterFocusedChange = video.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterHeightChange = video.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterHideClassChange = video.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterIdChange = video.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterInitializedChange = video.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterLocaleChange = video.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterOgvUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterOgvUrlChange = video.getAfterOgvUrlChange();

		if (afterOgvUrlChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_OGV_URL_CHANGE, afterOgvUrlChange));
		}
	}

	protected void renderAfterPosterChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterPosterChange = video.getAfterPosterChange();

		if (afterPosterChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_POSTER_CHANGE, afterPosterChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterRenderChange = video.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterRenderedChange = video.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterSrcNodeChange = video.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterStringsChange = video.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterSwfUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterSwfUrlChange = video.getAfterSwfUrlChange();

		if (afterSwfUrlChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_SWF_URL_CHANGE, afterSwfUrlChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterTabIndexChange = video.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterUrlChange = video.getAfterUrlChange();

		if (afterUrlChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_URL_CHANGE, afterUrlChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterUseARIAChange = video.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterVisibleChange = video.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterWidthChange = video.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(Video.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onBoundingBoxChange = video.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Video.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onContentBoxChange = video.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(Video.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onCssClassChange = video.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(Video.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onDestroyedChange = video.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Video.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onDisabledChange = video.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Video.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFixedAttributesChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onFixedAttributesChange = video.getOnFixedAttributesChange();

		if (onFixedAttributesChange != null) {
			renderedAttributes.add(renderString(Video.ON_FIXED_ATTRIBUTES_CHANGE, onFixedAttributesChange));
		}
	}

	protected void renderOnFlashVarsChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onFlashVarsChange = video.getOnFlashVarsChange();

		if (onFlashVarsChange != null) {
			renderedAttributes.add(renderString(Video.ON_FLASH_VARS_CHANGE, onFlashVarsChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onFocusedChange = video.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(Video.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onHeightChange = video.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(Video.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onHideClassChange = video.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(Video.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onIdChange = video.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(Video.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onInitializedChange = video.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Video.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onLocaleChange = video.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(Video.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnOgvUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onOgvUrlChange = video.getOnOgvUrlChange();

		if (onOgvUrlChange != null) {
			renderedAttributes.add(renderString(Video.ON_OGV_URL_CHANGE, onOgvUrlChange));
		}
	}

	protected void renderOnPosterChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onPosterChange = video.getOnPosterChange();

		if (onPosterChange != null) {
			renderedAttributes.add(renderString(Video.ON_POSTER_CHANGE, onPosterChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onRenderChange = video.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Video.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onRenderedChange = video.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(Video.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onSrcNodeChange = video.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(Video.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onStringsChange = video.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(Video.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnSwfUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onSwfUrlChange = video.getOnSwfUrlChange();

		if (onSwfUrlChange != null) {
			renderedAttributes.add(renderString(Video.ON_SWF_URL_CHANGE, onSwfUrlChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onTabIndexChange = video.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(Video.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onUrlChange = video.getOnUrlChange();

		if (onUrlChange != null) {
			renderedAttributes.add(renderString(Video.ON_URL_CHANGE, onUrlChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onUseARIAChange = video.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(Video.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onVisibleChange = video.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Video.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onWidthChange = video.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(Video.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}