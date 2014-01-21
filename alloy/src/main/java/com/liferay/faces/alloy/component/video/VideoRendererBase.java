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

		if (video.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, video);
		}

		if (video.getContentBox() != null) {
			renderContentBox(renderedAttributes, video);
		}

		if (video.getCssClass() != null) {
			renderCssClass(renderedAttributes, video);
		}

		if (video.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, video);
		}

		if (video.getDisabled() != null) {
			renderDisabled(renderedAttributes, video);
		}

		if (video.getFixedAttributes() != null) {
			renderFixedAttributes(renderedAttributes, video);
		}

		if (video.getFlashVars() != null) {
			renderFlashVars(renderedAttributes, video);
		}

		if (video.getFocused() != null) {
			renderFocused(renderedAttributes, video);
		}

		if (video.getHeight() != null) {
			renderHeight(renderedAttributes, video);
		}

		if (video.getHideClass() != null) {
			renderHideClass(renderedAttributes, video);
		}

		if (video.getVideoId() != null) {
			renderVideoId(renderedAttributes, video);
		}

		if (video.getInitialized() != null) {
			renderInitialized(renderedAttributes, video);
		}

		if (video.getVideoLocale() != null) {
			renderVideoLocale(renderedAttributes, video);
		}

		if (video.getOgvUrl() != null) {
			renderOgvUrl(renderedAttributes, video);
		}

		if (video.getPoster() != null) {
			renderPoster(renderedAttributes, video);
		}

		if (video.getRender() != null) {
			renderRender(renderedAttributes, video);
		}

		if (video.getRendered() != null) {
			renderRendered(renderedAttributes, video);
		}

		if (video.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, video);
		}

		if (video.getStrings() != null) {
			renderStrings(renderedAttributes, video);
		}

		if (video.getSwfUrl() != null) {
			renderSwfUrl(renderedAttributes, video);
		}

		if (video.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, video);
		}

		if (video.getUrl() != null) {
			renderUrl(renderedAttributes, video);
		}

		if (video.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, video);
		}

		if (video.getVisible() != null) {
			renderVisible(renderedAttributes, video);
		}

		if (video.getWidth() != null) {
			renderWidth(renderedAttributes, video);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (video.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, video);
		}

		if (video.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, video);
		}

		if (video.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, video);
		}

		if (video.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, video);
		}

		if (video.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, video);
		}

		if (video.getAfterFixedAttributesChange() != null) {
			renderAfterFixedAttributesChange(renderedAfterEvents, video);
		}

		if (video.getAfterFlashVarsChange() != null) {
			renderAfterFlashVarsChange(renderedAfterEvents, video);
		}

		if (video.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, video);
		}

		if (video.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, video);
		}

		if (video.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, video);
		}

		if (video.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, video);
		}

		if (video.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, video);
		}

		if (video.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, video);
		}

		if (video.getAfterOgvUrlChange() != null) {
			renderAfterOgvUrlChange(renderedAfterEvents, video);
		}

		if (video.getAfterPosterChange() != null) {
			renderAfterPosterChange(renderedAfterEvents, video);
		}

		if (video.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, video);
		}

		if (video.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, video);
		}

		if (video.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, video);
		}

		if (video.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, video);
		}

		if (video.getAfterSwfUrlChange() != null) {
			renderAfterSwfUrlChange(renderedAfterEvents, video);
		}

		if (video.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, video);
		}

		if (video.getAfterUrlChange() != null) {
			renderAfterUrlChange(renderedAfterEvents, video);
		}

		if (video.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, video);
		}

		if (video.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, video);
		}

		if (video.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, video);
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

		if (video.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, video);
		}

		if (video.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, video);
		}

		if (video.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, video);
		}

		if (video.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, video);
		}

		if (video.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, video);
		}

		if (video.getOnFixedAttributesChange() != null) {
			renderOnFixedAttributesChange(renderedOnEvents, video);
		}

		if (video.getOnFlashVarsChange() != null) {
			renderOnFlashVarsChange(renderedOnEvents, video);
		}

		if (video.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, video);
		}

		if (video.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, video);
		}

		if (video.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, video);
		}

		if (video.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, video);
		}

		if (video.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, video);
		}

		if (video.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, video);
		}

		if (video.getOnOgvUrlChange() != null) {
			renderOnOgvUrlChange(renderedOnEvents, video);
		}

		if (video.getOnPosterChange() != null) {
			renderOnPosterChange(renderedOnEvents, video);
		}

		if (video.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, video);
		}

		if (video.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, video);
		}

		if (video.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, video);
		}

		if (video.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, video);
		}

		if (video.getOnSwfUrlChange() != null) {
			renderOnSwfUrlChange(renderedOnEvents, video);
		}

		if (video.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, video);
		}

		if (video.getOnUrlChange() != null) {
			renderOnUrlChange(renderedOnEvents, video);
		}

		if (video.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, video);
		}

		if (video.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, video);
		}

		if (video.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, video);
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

	protected void renderBoundingBox(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String boundingBox = video.getBoundingBox();
		renderedAttributes.add(renderString(Video.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String contentBox = video.getContentBox();
		renderedAttributes.add(renderString(Video.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String cssClass = video.getCssClass();
		renderedAttributes.add(renderString(Video.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean destroyed = video.getDestroyed();
		renderedAttributes.add(renderBoolean(Video.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean disabled = video.getDisabled();
		renderedAttributes.add(renderBoolean(Video.DISABLED, disabled));
	}

	protected void renderFixedAttributes(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object fixedAttributes = video.getFixedAttributes();
		renderedAttributes.add(renderObject(Video.FIXED_ATTRIBUTES, fixedAttributes));
	}

	protected void renderFlashVars(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object flashVars = video.getFlashVars();
		renderedAttributes.add(renderObject(Video.FLASH_VARS, flashVars));
	}

	protected void renderFocused(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean focused = video.getFocused();
		renderedAttributes.add(renderBoolean(Video.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object height = video.getHeight();
		renderedAttributes.add(renderString(Video.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String hideClass = video.getHideClass();
		renderedAttributes.add(renderString(Video.HIDE_CLASS, hideClass));
	}

	protected void renderVideoId(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String videoId = video.getVideoId();
		renderedAttributes.add(renderString(Video.VIDEO_ID, videoId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean initialized = video.getInitialized();
		renderedAttributes.add(renderBoolean(Video.INITIALIZED, initialized));
	}

	protected void renderVideoLocale(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String videoLocale = video.getVideoLocale();
		renderedAttributes.add(renderString(Video.VIDEO_LOCALE, videoLocale));
	}

	protected void renderOgvUrl(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String ogvUrl = video.getOgvUrl();
		renderedAttributes.add(renderString(Video.OGV_URL, ogvUrl));
	}

	protected void renderPoster(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String poster = video.getPoster();
		renderedAttributes.add(renderString(Video.POSTER, poster));
	}

	protected void renderRender(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean render = video.getRender();
		renderedAttributes.add(renderBoolean(Video.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean rendered = video.getRendered();
		renderedAttributes.add(renderBoolean(Video.RENDERED, rendered));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String srcNode = video.getSrcNode();
		renderedAttributes.add(renderString(Video.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object strings = video.getStrings();
		renderedAttributes.add(renderObject(Video.STRINGS, strings));
	}

	protected void renderSwfUrl(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String swfUrl = video.getSwfUrl();
		renderedAttributes.add(renderString(Video.SWF_URL, swfUrl));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object tabIndex = video.getTabIndex();
		renderedAttributes.add(renderNumber(Video.TAB_INDEX, tabIndex));
	}

	protected void renderUrl(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String url = video.getUrl();
		renderedAttributes.add(renderString(Video.URL, url));
	}

	protected void renderUseARIA(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean useARIA = video.getUseARIA();
		renderedAttributes.add(renderBoolean(Video.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Boolean visible = video.getVisible();
		renderedAttributes.add(renderBoolean(Video.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.Object width = video.getWidth();
		renderedAttributes.add(renderString(Video.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterBoundingBoxChange = video.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Video.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterContentBoxChange = video.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Video.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterCssClassChange = video.getAfterCssClassChange();
		renderedAttributes.add(renderString(Video.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterDestroyedChange = video.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Video.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterDisabledChange = video.getAfterDisabledChange();
		renderedAttributes.add(renderString(Video.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFixedAttributesChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterFixedAttributesChange = video.getAfterFixedAttributesChange();
		renderedAttributes.add(renderString(Video.AFTER_FIXED_ATTRIBUTES_CHANGE, afterFixedAttributesChange));
	}

	protected void renderAfterFlashVarsChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterFlashVarsChange = video.getAfterFlashVarsChange();
		renderedAttributes.add(renderString(Video.AFTER_FLASH_VARS_CHANGE, afterFlashVarsChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterFocusedChange = video.getAfterFocusedChange();
		renderedAttributes.add(renderString(Video.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterHeightChange = video.getAfterHeightChange();
		renderedAttributes.add(renderString(Video.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterHideClassChange = video.getAfterHideClassChange();
		renderedAttributes.add(renderString(Video.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterIdChange = video.getAfterIdChange();
		renderedAttributes.add(renderString(Video.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterInitializedChange = video.getAfterInitializedChange();
		renderedAttributes.add(renderString(Video.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterLocaleChange = video.getAfterLocaleChange();
		renderedAttributes.add(renderString(Video.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterOgvUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterOgvUrlChange = video.getAfterOgvUrlChange();
		renderedAttributes.add(renderString(Video.AFTER_OGV_URL_CHANGE, afterOgvUrlChange));
	}

	protected void renderAfterPosterChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterPosterChange = video.getAfterPosterChange();
		renderedAttributes.add(renderString(Video.AFTER_POSTER_CHANGE, afterPosterChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterRenderChange = video.getAfterRenderChange();
		renderedAttributes.add(renderString(Video.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterRenderedChange = video.getAfterRenderedChange();
		renderedAttributes.add(renderString(Video.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterSrcNodeChange = video.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Video.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterStringsChange = video.getAfterStringsChange();
		renderedAttributes.add(renderString(Video.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterSwfUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterSwfUrlChange = video.getAfterSwfUrlChange();
		renderedAttributes.add(renderString(Video.AFTER_SWF_URL_CHANGE, afterSwfUrlChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterTabIndexChange = video.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Video.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterUrlChange = video.getAfterUrlChange();
		renderedAttributes.add(renderString(Video.AFTER_URL_CHANGE, afterUrlChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterUseARIAChange = video.getAfterUseARIAChange();
		renderedAttributes.add(renderString(Video.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterVisibleChange = video.getAfterVisibleChange();
		renderedAttributes.add(renderString(Video.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String afterWidthChange = video.getAfterWidthChange();
		renderedAttributes.add(renderString(Video.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onBoundingBoxChange = video.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Video.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onContentBoxChange = video.getOnContentBoxChange();
		renderedAttributes.add(renderString(Video.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onCssClassChange = video.getOnCssClassChange();
		renderedAttributes.add(renderString(Video.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onDestroyedChange = video.getOnDestroyedChange();
		renderedAttributes.add(renderString(Video.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onDisabledChange = video.getOnDisabledChange();
		renderedAttributes.add(renderString(Video.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFixedAttributesChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onFixedAttributesChange = video.getOnFixedAttributesChange();
		renderedAttributes.add(renderString(Video.ON_FIXED_ATTRIBUTES_CHANGE, onFixedAttributesChange));
	}

	protected void renderOnFlashVarsChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onFlashVarsChange = video.getOnFlashVarsChange();
		renderedAttributes.add(renderString(Video.ON_FLASH_VARS_CHANGE, onFlashVarsChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onFocusedChange = video.getOnFocusedChange();
		renderedAttributes.add(renderString(Video.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onHeightChange = video.getOnHeightChange();
		renderedAttributes.add(renderString(Video.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onHideClassChange = video.getOnHideClassChange();
		renderedAttributes.add(renderString(Video.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onIdChange = video.getOnIdChange();
		renderedAttributes.add(renderString(Video.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onInitializedChange = video.getOnInitializedChange();
		renderedAttributes.add(renderString(Video.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onLocaleChange = video.getOnLocaleChange();
		renderedAttributes.add(renderString(Video.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnOgvUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onOgvUrlChange = video.getOnOgvUrlChange();
		renderedAttributes.add(renderString(Video.ON_OGV_URL_CHANGE, onOgvUrlChange));
	}

	protected void renderOnPosterChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onPosterChange = video.getOnPosterChange();
		renderedAttributes.add(renderString(Video.ON_POSTER_CHANGE, onPosterChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onRenderChange = video.getOnRenderChange();
		renderedAttributes.add(renderString(Video.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onRenderedChange = video.getOnRenderedChange();
		renderedAttributes.add(renderString(Video.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onSrcNodeChange = video.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Video.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onStringsChange = video.getOnStringsChange();
		renderedAttributes.add(renderString(Video.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnSwfUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onSwfUrlChange = video.getOnSwfUrlChange();
		renderedAttributes.add(renderString(Video.ON_SWF_URL_CHANGE, onSwfUrlChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onTabIndexChange = video.getOnTabIndexChange();
		renderedAttributes.add(renderString(Video.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnUrlChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onUrlChange = video.getOnUrlChange();
		renderedAttributes.add(renderString(Video.ON_URL_CHANGE, onUrlChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onUseARIAChange = video.getOnUseARIAChange();
		renderedAttributes.add(renderString(Video.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onVisibleChange = video.getOnVisibleChange();
		renderedAttributes.add(renderString(Video.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Video video) throws IOException {
		java.lang.String onWidthChange = video.getOnWidthChange();
		renderedAttributes.add(renderString(Video.ON_WIDTH_CHANGE, onWidthChange));
	}

}