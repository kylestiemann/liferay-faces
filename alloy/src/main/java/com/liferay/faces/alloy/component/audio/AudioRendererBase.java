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

		renderBoundingBox(renderedAttributes, audio);
		renderContentBox(renderedAttributes, audio);
		renderCssClass(renderedAttributes, audio);
		renderDestroyed(renderedAttributes, audio);
		renderDisabled(renderedAttributes, audio);
		renderFixedAttributes(renderedAttributes, audio);
		renderFlashVars(renderedAttributes, audio);
		renderFocused(renderedAttributes, audio);
		renderHeight(renderedAttributes, audio);
		renderHideClass(renderedAttributes, audio);
		renderAudioId(renderedAttributes, audio);
		renderInitialized(renderedAttributes, audio);
		renderAudioLocale(renderedAttributes, audio);
		renderOggUrl(renderedAttributes, audio);
		renderRender(renderedAttributes, audio);
		renderRendered(renderedAttributes, audio);
		renderSrcNode(renderedAttributes, audio);
		renderStrings(renderedAttributes, audio);
		renderSwfHeight(renderedAttributes, audio);
		renderSwfUrl(renderedAttributes, audio);
		renderSwfWidth(renderedAttributes, audio);
		renderTabIndex(renderedAttributes, audio);
		renderType(renderedAttributes, audio);
		renderUrl(renderedAttributes, audio);
		renderUseARIA(renderedAttributes, audio);
		renderVisible(renderedAttributes, audio);
		renderWidth(renderedAttributes, audio);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, audio);
		renderAfterContentBoxChange(renderedAfterEvents, audio);
		renderAfterCssClassChange(renderedAfterEvents, audio);
		renderAfterDestroyedChange(renderedAfterEvents, audio);
		renderAfterDisabledChange(renderedAfterEvents, audio);
		renderAfterFixedAttributesChange(renderedAfterEvents, audio);
		renderAfterFlashVarsChange(renderedAfterEvents, audio);
		renderAfterFocusedChange(renderedAfterEvents, audio);
		renderAfterHeightChange(renderedAfterEvents, audio);
		renderAfterHideClassChange(renderedAfterEvents, audio);
		renderAfterIdChange(renderedAfterEvents, audio);
		renderAfterInitializedChange(renderedAfterEvents, audio);
		renderAfterLocaleChange(renderedAfterEvents, audio);
		renderAfterOggUrlChange(renderedAfterEvents, audio);
		renderAfterRenderChange(renderedAfterEvents, audio);
		renderAfterRenderedChange(renderedAfterEvents, audio);
		renderAfterSrcNodeChange(renderedAfterEvents, audio);
		renderAfterStringsChange(renderedAfterEvents, audio);
		renderAfterSwfHeightChange(renderedAfterEvents, audio);
		renderAfterSwfUrlChange(renderedAfterEvents, audio);
		renderAfterSwfWidthChange(renderedAfterEvents, audio);
		renderAfterTabIndexChange(renderedAfterEvents, audio);
		renderAfterTypeChange(renderedAfterEvents, audio);
		renderAfterUrlChange(renderedAfterEvents, audio);
		renderAfterUseARIAChange(renderedAfterEvents, audio);
		renderAfterVisibleChange(renderedAfterEvents, audio);
		renderAfterWidthChange(renderedAfterEvents, audio);

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

		renderOnBoundingBoxChange(renderedOnEvents, audio);
		renderOnContentBoxChange(renderedOnEvents, audio);
		renderOnCssClassChange(renderedOnEvents, audio);
		renderOnDestroyedChange(renderedOnEvents, audio);
		renderOnDisabledChange(renderedOnEvents, audio);
		renderOnFixedAttributesChange(renderedOnEvents, audio);
		renderOnFlashVarsChange(renderedOnEvents, audio);
		renderOnFocusedChange(renderedOnEvents, audio);
		renderOnHeightChange(renderedOnEvents, audio);
		renderOnHideClassChange(renderedOnEvents, audio);
		renderOnIdChange(renderedOnEvents, audio);
		renderOnInitializedChange(renderedOnEvents, audio);
		renderOnLocaleChange(renderedOnEvents, audio);
		renderOnOggUrlChange(renderedOnEvents, audio);
		renderOnRenderChange(renderedOnEvents, audio);
		renderOnRenderedChange(renderedOnEvents, audio);
		renderOnSrcNodeChange(renderedOnEvents, audio);
		renderOnStringsChange(renderedOnEvents, audio);
		renderOnSwfHeightChange(renderedOnEvents, audio);
		renderOnSwfUrlChange(renderedOnEvents, audio);
		renderOnSwfWidthChange(renderedOnEvents, audio);
		renderOnTabIndexChange(renderedOnEvents, audio);
		renderOnTypeChange(renderedOnEvents, audio);
		renderOnUrlChange(renderedOnEvents, audio);
		renderOnUseARIAChange(renderedOnEvents, audio);
		renderOnVisibleChange(renderedOnEvents, audio);
		renderOnWidthChange(renderedOnEvents, audio);

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

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Audio.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String contentBox = audio.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Audio.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String cssClass = audio.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(Audio.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean destroyed = audio.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Audio.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean disabled = audio.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Audio.DISABLED, disabled));
		}
	}

	protected void renderFixedAttributes(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object fixedAttributes = audio.getFixedAttributes();

		if (fixedAttributes != null) {
			renderedAttributes.add(renderObject(Audio.FIXED_ATTRIBUTES, fixedAttributes));
		}
	}

	protected void renderFlashVars(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object flashVars = audio.getFlashVars();

		if (flashVars != null) {
			renderedAttributes.add(renderObject(Audio.FLASH_VARS, flashVars));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean focused = audio.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Audio.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object height = audio.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Audio.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String hideClass = audio.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(Audio.HIDE_CLASS, hideClass));
		}
	}

	protected void renderAudioId(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String audioId = audio.getAudioId();

		if (audioId != null) {
			renderedAttributes.add(renderString(Audio.AUDIO_ID, audioId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean initialized = audio.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Audio.INITIALIZED, initialized));
		}
	}

	protected void renderAudioLocale(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String audioLocale = audio.getAudioLocale();

		if (audioLocale != null) {
			renderedAttributes.add(renderString(Audio.AUDIO_LOCALE, audioLocale));
		}
	}

	protected void renderOggUrl(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String oggUrl = audio.getOggUrl();

		if (oggUrl != null) {
			renderedAttributes.add(renderString(Audio.OGG_URL, oggUrl));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean render = audio.getRender();

		if (render != null) {
			renderedAttributes.add(renderBoolean(Audio.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean rendered = audio.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Audio.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String srcNode = audio.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Audio.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object strings = audio.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Audio.STRINGS, strings));
		}
	}

	protected void renderSwfHeight(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String swfHeight = audio.getSwfHeight();

		if (swfHeight != null) {
			renderedAttributes.add(renderString(Audio.SWF_HEIGHT, swfHeight));
		}
	}

	protected void renderSwfUrl(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String swfUrl = audio.getSwfUrl();

		if (swfUrl != null) {
			renderedAttributes.add(renderString(Audio.SWF_URL, swfUrl));
		}
	}

	protected void renderSwfWidth(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String swfWidth = audio.getSwfWidth();

		if (swfWidth != null) {
			renderedAttributes.add(renderString(Audio.SWF_WIDTH, swfWidth));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object tabIndex = audio.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Audio.TAB_INDEX, tabIndex));
		}
	}

	protected void renderType(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String type = audio.getType();

		if (type != null) {
			renderedAttributes.add(renderString(Audio.TYPE, type));
		}
	}

	protected void renderUrl(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String url = audio.getUrl();

		if (url != null) {
			renderedAttributes.add(renderString(Audio.URL, url));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean useARIA = audio.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(Audio.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Boolean visible = audio.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Audio.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.Object width = audio.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Audio.WIDTH, width));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterBoundingBoxChange = audio.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterContentBoxChange = audio.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterCssClassChange = audio.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterDestroyedChange = audio.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterDisabledChange = audio.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFixedAttributesChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterFixedAttributesChange = audio.getAfterFixedAttributesChange();

		if (afterFixedAttributesChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_FIXED_ATTRIBUTES_CHANGE, afterFixedAttributesChange));
		}
	}

	protected void renderAfterFlashVarsChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterFlashVarsChange = audio.getAfterFlashVarsChange();

		if (afterFlashVarsChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_FLASH_VARS_CHANGE, afterFlashVarsChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterFocusedChange = audio.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterHeightChange = audio.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterHideClassChange = audio.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterIdChange = audio.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterInitializedChange = audio.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterLocaleChange = audio.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterOggUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterOggUrlChange = audio.getAfterOggUrlChange();

		if (afterOggUrlChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_OGG_URL_CHANGE, afterOggUrlChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterRenderChange = audio.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterRenderedChange = audio.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterSrcNodeChange = audio.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterStringsChange = audio.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterSwfHeightChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterSwfHeightChange = audio.getAfterSwfHeightChange();

		if (afterSwfHeightChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_SWF_HEIGHT_CHANGE, afterSwfHeightChange));
		}
	}

	protected void renderAfterSwfUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterSwfUrlChange = audio.getAfterSwfUrlChange();

		if (afterSwfUrlChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_SWF_URL_CHANGE, afterSwfUrlChange));
		}
	}

	protected void renderAfterSwfWidthChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterSwfWidthChange = audio.getAfterSwfWidthChange();

		if (afterSwfWidthChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_SWF_WIDTH_CHANGE, afterSwfWidthChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterTabIndexChange = audio.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterTypeChange = audio.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterUrlChange = audio.getAfterUrlChange();

		if (afterUrlChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_URL_CHANGE, afterUrlChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterUseARIAChange = audio.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterVisibleChange = audio.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String afterWidthChange = audio.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(Audio.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onBoundingBoxChange = audio.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Audio.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onContentBoxChange = audio.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(Audio.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onCssClassChange = audio.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(Audio.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onDestroyedChange = audio.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Audio.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onDisabledChange = audio.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Audio.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFixedAttributesChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onFixedAttributesChange = audio.getOnFixedAttributesChange();

		if (onFixedAttributesChange != null) {
			renderedAttributes.add(renderString(Audio.ON_FIXED_ATTRIBUTES_CHANGE, onFixedAttributesChange));
		}
	}

	protected void renderOnFlashVarsChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onFlashVarsChange = audio.getOnFlashVarsChange();

		if (onFlashVarsChange != null) {
			renderedAttributes.add(renderString(Audio.ON_FLASH_VARS_CHANGE, onFlashVarsChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onFocusedChange = audio.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(Audio.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onHeightChange = audio.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(Audio.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onHideClassChange = audio.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(Audio.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onIdChange = audio.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(Audio.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onInitializedChange = audio.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Audio.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onLocaleChange = audio.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(Audio.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnOggUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onOggUrlChange = audio.getOnOggUrlChange();

		if (onOggUrlChange != null) {
			renderedAttributes.add(renderString(Audio.ON_OGG_URL_CHANGE, onOggUrlChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onRenderChange = audio.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Audio.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onRenderedChange = audio.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(Audio.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onSrcNodeChange = audio.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(Audio.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onStringsChange = audio.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(Audio.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnSwfHeightChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onSwfHeightChange = audio.getOnSwfHeightChange();

		if (onSwfHeightChange != null) {
			renderedAttributes.add(renderString(Audio.ON_SWF_HEIGHT_CHANGE, onSwfHeightChange));
		}
	}

	protected void renderOnSwfUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onSwfUrlChange = audio.getOnSwfUrlChange();

		if (onSwfUrlChange != null) {
			renderedAttributes.add(renderString(Audio.ON_SWF_URL_CHANGE, onSwfUrlChange));
		}
	}

	protected void renderOnSwfWidthChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onSwfWidthChange = audio.getOnSwfWidthChange();

		if (onSwfWidthChange != null) {
			renderedAttributes.add(renderString(Audio.ON_SWF_WIDTH_CHANGE, onSwfWidthChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onTabIndexChange = audio.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(Audio.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onTypeChange = audio.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(Audio.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUrlChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onUrlChange = audio.getOnUrlChange();

		if (onUrlChange != null) {
			renderedAttributes.add(renderString(Audio.ON_URL_CHANGE, onUrlChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onUseARIAChange = audio.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(Audio.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onVisibleChange = audio.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Audio.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Audio audio) throws IOException {
		java.lang.String onWidthChange = audio.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(Audio.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}