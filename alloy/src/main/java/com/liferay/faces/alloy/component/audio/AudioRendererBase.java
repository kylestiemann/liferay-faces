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
package com.liferay.faces.alloy.component.audio;

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
public abstract class AudioRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-audio";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Audio audio = (Audio) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var audio = new A.Audio");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (audio.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, audio);
		}

		if (audio.getContentBox() != null) {
			renderContentBox(renderedAttributes, audio);
		}

		if (audio.getCssClass() != null) {
			renderCssClass(renderedAttributes, audio);
		}

		if (audio.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, audio);
		}

		if (audio.getDisabled() != null) {
			renderDisabled(renderedAttributes, audio);
		}

		if (audio.getFixedAttributes() != null) {
			renderFixedAttributes(renderedAttributes, audio);
		}

		if (audio.getFlashVars() != null) {
			renderFlashVars(renderedAttributes, audio);
		}

		if (audio.getFocused() != null) {
			renderFocused(renderedAttributes, audio);
		}

		if (audio.getHeight() != null) {
			renderHeight(renderedAttributes, audio);
		}

		if (audio.getHideClass() != null) {
			renderHideClass(renderedAttributes, audio);
		}

		if (audio.getAudioId() != null) {
			renderAudioId(renderedAttributes, audio);
		}

		if (audio.getInitialized() != null) {
			renderInitialized(renderedAttributes, audio);
		}

		if (audio.getAudioLocale() != null) {
			renderAudioLocale(renderedAttributes, audio);
		}

		if (audio.getOggUrl() != null) {
			renderOggUrl(renderedAttributes, audio);
		}

		if (audio.getRender() != null) {
			renderRender(renderedAttributes, audio);
		}

		if (audio.getRendered() != null) {
			renderRendered(renderedAttributes, audio);
		}

		if (audio.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, audio);
		}

		if (audio.getStrings() != null) {
			renderStrings(renderedAttributes, audio);
		}

		if (audio.getSwfHeight() != null) {
			renderSwfHeight(renderedAttributes, audio);
		}

		if (audio.getSwfUrl() != null) {
			renderSwfUrl(renderedAttributes, audio);
		}

		if (audio.getSwfWidth() != null) {
			renderSwfWidth(renderedAttributes, audio);
		}

		if (audio.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, audio);
		}

		if (audio.getType() != null) {
			renderType(renderedAttributes, audio);
		}

		if (audio.getUrl() != null) {
			renderUrl(renderedAttributes, audio);
		}

		if (audio.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, audio);
		}

		if (audio.getVisible() != null) {
			renderVisible(renderedAttributes, audio);
		}

		if (audio.getWidth() != null) {
			renderWidth(renderedAttributes, audio);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (audio.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterFixedAttributesChange() != null) {
			renderAfterFixedAttributesChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterFlashVarsChange() != null) {
			renderAfterFlashVarsChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterOggUrlChange() != null) {
			renderAfterOggUrlChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterSwfHeightChange() != null) {
			renderAfterSwfHeightChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterSwfUrlChange() != null) {
			renderAfterSwfUrlChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterSwfWidthChange() != null) {
			renderAfterSwfWidthChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterUrlChange() != null) {
			renderAfterUrlChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, audio);
		}

		if (audio.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, audio);
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

		if (audio.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, audio);
		}

		if (audio.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, audio);
		}

		if (audio.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, audio);
		}

		if (audio.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, audio);
		}

		if (audio.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, audio);
		}

		if (audio.getOnFixedAttributesChange() != null) {
			renderOnFixedAttributesChange(renderedOnEvents, audio);
		}

		if (audio.getOnFlashVarsChange() != null) {
			renderOnFlashVarsChange(renderedOnEvents, audio);
		}

		if (audio.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, audio);
		}

		if (audio.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, audio);
		}

		if (audio.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, audio);
		}

		if (audio.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, audio);
		}

		if (audio.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, audio);
		}

		if (audio.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, audio);
		}

		if (audio.getOnOggUrlChange() != null) {
			renderOnOggUrlChange(renderedOnEvents, audio);
		}

		if (audio.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, audio);
		}

		if (audio.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, audio);
		}

		if (audio.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, audio);
		}

		if (audio.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, audio);
		}

		if (audio.getOnSwfHeightChange() != null) {
			renderOnSwfHeightChange(renderedOnEvents, audio);
		}

		if (audio.getOnSwfUrlChange() != null) {
			renderOnSwfUrlChange(renderedOnEvents, audio);
		}

		if (audio.getOnSwfWidthChange() != null) {
			renderOnSwfWidthChange(renderedOnEvents, audio);
		}

		if (audio.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, audio);
		}

		if (audio.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, audio);
		}

		if (audio.getOnUrlChange() != null) {
			renderOnUrlChange(renderedOnEvents, audio);
		}

		if (audio.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, audio);
		}

		if (audio.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, audio);
		}

		if (audio.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, audio);
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

	protected void renderBoundingBox(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String boundingBox = audio.getBoundingBox();
		renderedAttributes.add(renderString(Audio.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String contentBox = audio.getContentBox();
		renderedAttributes.add(renderString(Audio.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String cssClass = audio.getCssClass();
		renderedAttributes.add(renderString(Audio.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean destroyed = audio.getDestroyed();
		renderedAttributes.add(renderBoolean(Audio.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean disabled = audio.getDisabled();
		renderedAttributes.add(renderBoolean(Audio.DISABLED, disabled));
	}

	protected void renderFixedAttributes(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object fixedAttributes = audio.getFixedAttributes();
		renderedAttributes.add(renderObject(Audio.FIXED_ATTRIBUTES, fixedAttributes));
	}

	protected void renderFlashVars(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object flashVars = audio.getFlashVars();
		renderedAttributes.add(renderObject(Audio.FLASH_VARS, flashVars));
	}

	protected void renderFocused(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean focused = audio.getFocused();
		renderedAttributes.add(renderBoolean(Audio.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object height = audio.getHeight();
		renderedAttributes.add(renderString(Audio.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String hideClass = audio.getHideClass();
		renderedAttributes.add(renderString(Audio.HIDE_CLASS, hideClass));
	}

	protected void renderAudioId(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String audioId = audio.getAudioId();
		renderedAttributes.add(renderString(Audio.AUDIO_ID, audioId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean initialized = audio.getInitialized();
		renderedAttributes.add(renderBoolean(Audio.INITIALIZED, initialized));
	}

	protected void renderAudioLocale(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String audioLocale = audio.getAudioLocale();
		renderedAttributes.add(renderString(Audio.AUDIO_LOCALE, audioLocale));
	}

	protected void renderOggUrl(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String oggUrl = audio.getOggUrl();
		renderedAttributes.add(renderString(Audio.OGG_URL, oggUrl));
	}

	protected void renderRender(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean render = audio.getRender();
		renderedAttributes.add(renderBoolean(Audio.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean rendered = audio.getRendered();
		renderedAttributes.add(renderBoolean(Audio.RENDERED, rendered));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String srcNode = audio.getSrcNode();
		renderedAttributes.add(renderString(Audio.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object strings = audio.getStrings();
		renderedAttributes.add(renderObject(Audio.STRINGS, strings));
	}

	protected void renderSwfHeight(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String swfHeight = audio.getSwfHeight();
		renderedAttributes.add(renderString(Audio.SWF_HEIGHT, swfHeight));
	}

	protected void renderSwfUrl(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String swfUrl = audio.getSwfUrl();
		renderedAttributes.add(renderString(Audio.SWF_URL, swfUrl));
	}

	protected void renderSwfWidth(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String swfWidth = audio.getSwfWidth();
		renderedAttributes.add(renderString(Audio.SWF_WIDTH, swfWidth));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object tabIndex = audio.getTabIndex();
		renderedAttributes.add(renderNumber(Audio.TAB_INDEX, tabIndex));
	}

	protected void renderType(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String type = audio.getType();
		renderedAttributes.add(renderString(Audio.TYPE, type));
	}

	protected void renderUrl(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String url = audio.getUrl();
		renderedAttributes.add(renderString(Audio.URL, url));
	}

	protected void renderUseARIA(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean useARIA = audio.getUseARIA();
		renderedAttributes.add(renderBoolean(Audio.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean visible = audio.getVisible();
		renderedAttributes.add(renderBoolean(Audio.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object width = audio.getWidth();
		renderedAttributes.add(renderString(Audio.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterBoundingBoxChange = audio.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Audio.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterContentBoxChange = audio.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Audio.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterCssClassChange = audio.getAfterCssClassChange();
		renderedAttributes.add(renderString(Audio.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterDestroyedChange = audio.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Audio.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterDisabledChange = audio.getAfterDisabledChange();
		renderedAttributes.add(renderString(Audio.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFixedAttributesChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterFixedAttributesChange = audio.getAfterFixedAttributesChange();
		renderedAttributes.add(renderString(Audio.AFTER_FIXED_ATTRIBUTES_CHANGE, afterFixedAttributesChange));
	}

	protected void renderAfterFlashVarsChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterFlashVarsChange = audio.getAfterFlashVarsChange();
		renderedAttributes.add(renderString(Audio.AFTER_FLASH_VARS_CHANGE, afterFlashVarsChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterFocusedChange = audio.getAfterFocusedChange();
		renderedAttributes.add(renderString(Audio.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterHeightChange = audio.getAfterHeightChange();
		renderedAttributes.add(renderString(Audio.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterHideClassChange = audio.getAfterHideClassChange();
		renderedAttributes.add(renderString(Audio.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterIdChange = audio.getAfterIdChange();
		renderedAttributes.add(renderString(Audio.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterInitializedChange = audio.getAfterInitializedChange();
		renderedAttributes.add(renderString(Audio.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterLocaleChange = audio.getAfterLocaleChange();
		renderedAttributes.add(renderString(Audio.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterOggUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterOggUrlChange = audio.getAfterOggUrlChange();
		renderedAttributes.add(renderString(Audio.AFTER_OGG_URL_CHANGE, afterOggUrlChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterRenderChange = audio.getAfterRenderChange();
		renderedAttributes.add(renderString(Audio.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterRenderedChange = audio.getAfterRenderedChange();
		renderedAttributes.add(renderString(Audio.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterSrcNodeChange = audio.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Audio.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterStringsChange = audio.getAfterStringsChange();
		renderedAttributes.add(renderString(Audio.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterSwfHeightChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterSwfHeightChange = audio.getAfterSwfHeightChange();
		renderedAttributes.add(renderString(Audio.AFTER_SWF_HEIGHT_CHANGE, afterSwfHeightChange));
	}

	protected void renderAfterSwfUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterSwfUrlChange = audio.getAfterSwfUrlChange();
		renderedAttributes.add(renderString(Audio.AFTER_SWF_URL_CHANGE, afterSwfUrlChange));
	}

	protected void renderAfterSwfWidthChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterSwfWidthChange = audio.getAfterSwfWidthChange();
		renderedAttributes.add(renderString(Audio.AFTER_SWF_WIDTH_CHANGE, afterSwfWidthChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterTabIndexChange = audio.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Audio.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterTypeChange = audio.getAfterTypeChange();
		renderedAttributes.add(renderString(Audio.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterUrlChange = audio.getAfterUrlChange();
		renderedAttributes.add(renderString(Audio.AFTER_URL_CHANGE, afterUrlChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterUseARIAChange = audio.getAfterUseARIAChange();
		renderedAttributes.add(renderString(Audio.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterVisibleChange = audio.getAfterVisibleChange();
		renderedAttributes.add(renderString(Audio.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterWidthChange = audio.getAfterWidthChange();
		renderedAttributes.add(renderString(Audio.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onBoundingBoxChange = audio.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Audio.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onContentBoxChange = audio.getOnContentBoxChange();
		renderedAttributes.add(renderString(Audio.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onCssClassChange = audio.getOnCssClassChange();
		renderedAttributes.add(renderString(Audio.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onDestroyedChange = audio.getOnDestroyedChange();
		renderedAttributes.add(renderString(Audio.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onDisabledChange = audio.getOnDisabledChange();
		renderedAttributes.add(renderString(Audio.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFixedAttributesChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onFixedAttributesChange = audio.getOnFixedAttributesChange();
		renderedAttributes.add(renderString(Audio.ON_FIXED_ATTRIBUTES_CHANGE, onFixedAttributesChange));
	}

	protected void renderOnFlashVarsChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onFlashVarsChange = audio.getOnFlashVarsChange();
		renderedAttributes.add(renderString(Audio.ON_FLASH_VARS_CHANGE, onFlashVarsChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onFocusedChange = audio.getOnFocusedChange();
		renderedAttributes.add(renderString(Audio.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onHeightChange = audio.getOnHeightChange();
		renderedAttributes.add(renderString(Audio.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onHideClassChange = audio.getOnHideClassChange();
		renderedAttributes.add(renderString(Audio.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onIdChange = audio.getOnIdChange();
		renderedAttributes.add(renderString(Audio.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onInitializedChange = audio.getOnInitializedChange();
		renderedAttributes.add(renderString(Audio.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onLocaleChange = audio.getOnLocaleChange();
		renderedAttributes.add(renderString(Audio.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnOggUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onOggUrlChange = audio.getOnOggUrlChange();
		renderedAttributes.add(renderString(Audio.ON_OGG_URL_CHANGE, onOggUrlChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onRenderChange = audio.getOnRenderChange();
		renderedAttributes.add(renderString(Audio.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onRenderedChange = audio.getOnRenderedChange();
		renderedAttributes.add(renderString(Audio.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onSrcNodeChange = audio.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Audio.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onStringsChange = audio.getOnStringsChange();
		renderedAttributes.add(renderString(Audio.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnSwfHeightChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onSwfHeightChange = audio.getOnSwfHeightChange();
		renderedAttributes.add(renderString(Audio.ON_SWF_HEIGHT_CHANGE, onSwfHeightChange));
	}

	protected void renderOnSwfUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onSwfUrlChange = audio.getOnSwfUrlChange();
		renderedAttributes.add(renderString(Audio.ON_SWF_URL_CHANGE, onSwfUrlChange));
	}

	protected void renderOnSwfWidthChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onSwfWidthChange = audio.getOnSwfWidthChange();
		renderedAttributes.add(renderString(Audio.ON_SWF_WIDTH_CHANGE, onSwfWidthChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onTabIndexChange = audio.getOnTabIndexChange();
		renderedAttributes.add(renderString(Audio.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onTypeChange = audio.getOnTypeChange();
		renderedAttributes.add(renderString(Audio.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onUrlChange = audio.getOnUrlChange();
		renderedAttributes.add(renderString(Audio.ON_URL_CHANGE, onUrlChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onUseARIAChange = audio.getOnUseARIAChange();
		renderedAttributes.add(renderString(Audio.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onVisibleChange = audio.getOnVisibleChange();
		renderedAttributes.add(renderString(Audio.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onWidthChange = audio.getOnWidthChange();
		renderedAttributes.add(renderString(Audio.ON_WIDTH_CHANGE, onWidthChange));
	}

}