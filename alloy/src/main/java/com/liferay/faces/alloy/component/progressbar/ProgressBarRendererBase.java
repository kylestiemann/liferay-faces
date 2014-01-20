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
package com.liferay.faces.alloy.component.progressbar;

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
public abstract class ProgressBarRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-progressbar";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ProgressBar progressBar = (ProgressBar) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var progressBar = new A.ProgressBar");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, progressBar);
		renderContentBox(renderedAttributes, progressBar);
		renderCssClass(renderedAttributes, progressBar);
		renderDestroyed(renderedAttributes, progressBar);
		renderDisabled(renderedAttributes, progressBar);
		renderFocused(renderedAttributes, progressBar);
		renderHeight(renderedAttributes, progressBar);
		renderHideClass(renderedAttributes, progressBar);
		renderProgressBarId(renderedAttributes, progressBar);
		renderInitialized(renderedAttributes, progressBar);
		renderLabel(renderedAttributes, progressBar);
		renderProgressBarLocale(renderedAttributes, progressBar);
		renderMax(renderedAttributes, progressBar);
		renderMin(renderedAttributes, progressBar);
		renderOrientation(renderedAttributes, progressBar);
		renderRatio(renderedAttributes, progressBar);
		renderRender(renderedAttributes, progressBar);
		renderRendered(renderedAttributes, progressBar);
		renderSrcNode(renderedAttributes, progressBar);
		renderStep(renderedAttributes, progressBar);
		renderStrings(renderedAttributes, progressBar);
		renderTabIndex(renderedAttributes, progressBar);
		renderTextNode(renderedAttributes, progressBar);
		renderUseARIA(renderedAttributes, progressBar);
		renderProgressBarValue(renderedAttributes, progressBar);
		renderVisible(renderedAttributes, progressBar);
		renderWidth(renderedAttributes, progressBar);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, progressBar);
		renderAfterContentBoxChange(renderedAfterEvents, progressBar);
		renderAfterCssClassChange(renderedAfterEvents, progressBar);
		renderAfterDestroyedChange(renderedAfterEvents, progressBar);
		renderAfterDisabledChange(renderedAfterEvents, progressBar);
		renderAfterFocusedChange(renderedAfterEvents, progressBar);
		renderAfterHeightChange(renderedAfterEvents, progressBar);
		renderAfterHideClassChange(renderedAfterEvents, progressBar);
		renderAfterIdChange(renderedAfterEvents, progressBar);
		renderAfterInitializedChange(renderedAfterEvents, progressBar);
		renderAfterLabelChange(renderedAfterEvents, progressBar);
		renderAfterLocaleChange(renderedAfterEvents, progressBar);
		renderAfterMaxChange(renderedAfterEvents, progressBar);
		renderAfterMinChange(renderedAfterEvents, progressBar);
		renderAfterOrientationChange(renderedAfterEvents, progressBar);
		renderAfterRatioChange(renderedAfterEvents, progressBar);
		renderAfterRenderChange(renderedAfterEvents, progressBar);
		renderAfterRenderedChange(renderedAfterEvents, progressBar);
		renderAfterSrcNodeChange(renderedAfterEvents, progressBar);
		renderAfterStepChange(renderedAfterEvents, progressBar);
		renderAfterStringsChange(renderedAfterEvents, progressBar);
		renderAfterTabIndexChange(renderedAfterEvents, progressBar);
		renderAfterTextNodeChange(renderedAfterEvents, progressBar);
		renderAfterUseARIAChange(renderedAfterEvents, progressBar);
		renderAfterValueChange(renderedAfterEvents, progressBar);
		renderAfterVisibleChange(renderedAfterEvents, progressBar);
		renderAfterWidthChange(renderedAfterEvents, progressBar);

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

		renderOnBoundingBoxChange(renderedOnEvents, progressBar);
		renderOnContentBoxChange(renderedOnEvents, progressBar);
		renderOnCssClassChange(renderedOnEvents, progressBar);
		renderOnDestroyedChange(renderedOnEvents, progressBar);
		renderOnDisabledChange(renderedOnEvents, progressBar);
		renderOnFocusedChange(renderedOnEvents, progressBar);
		renderOnHeightChange(renderedOnEvents, progressBar);
		renderOnHideClassChange(renderedOnEvents, progressBar);
		renderOnIdChange(renderedOnEvents, progressBar);
		renderOnInitializedChange(renderedOnEvents, progressBar);
		renderOnLabelChange(renderedOnEvents, progressBar);
		renderOnLocaleChange(renderedOnEvents, progressBar);
		renderOnMaxChange(renderedOnEvents, progressBar);
		renderOnMinChange(renderedOnEvents, progressBar);
		renderOnOrientationChange(renderedOnEvents, progressBar);
		renderOnRatioChange(renderedOnEvents, progressBar);
		renderOnRenderChange(renderedOnEvents, progressBar);
		renderOnRenderedChange(renderedOnEvents, progressBar);
		renderOnSrcNodeChange(renderedOnEvents, progressBar);
		renderOnStepChange(renderedOnEvents, progressBar);
		renderOnStringsChange(renderedOnEvents, progressBar);
		renderOnTabIndexChange(renderedOnEvents, progressBar);
		renderOnTextNodeChange(renderedOnEvents, progressBar);
		renderOnUseARIAChange(renderedOnEvents, progressBar);
		renderOnValueChange(renderedOnEvents, progressBar);
		renderOnVisibleChange(renderedOnEvents, progressBar);
		renderOnWidthChange(renderedOnEvents, progressBar);

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

	protected void renderBoundingBox(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String boundingBox = progressBar.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(ProgressBar.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String contentBox = progressBar.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(ProgressBar.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String cssClass = progressBar.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(ProgressBar.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean destroyed = progressBar.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(ProgressBar.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean disabled = progressBar.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(ProgressBar.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean focused = progressBar.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(ProgressBar.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Integer height = progressBar.getHeight();

		if (height != null) {
			renderedAttributes.add(renderNumber(ProgressBar.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String hideClass = progressBar.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(ProgressBar.HIDE_CLASS, hideClass));
		}
	}

	protected void renderProgressBarId(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String progressBarId = progressBar.getProgressBarId();

		if (progressBarId != null) {
			renderedAttributes.add(renderString(ProgressBar.PROGRESS_BAR_ID, progressBarId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean initialized = progressBar.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ProgressBar.INITIALIZED, initialized));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String label = progressBar.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(ProgressBar.LABEL, label));
		}
	}

	protected void renderProgressBarLocale(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String progressBarLocale = progressBar.getProgressBarLocale();

		if (progressBarLocale != null) {
			renderedAttributes.add(renderString(ProgressBar.PROGRESS_BAR_LOCALE, progressBarLocale));
		}
	}

	protected void renderMax(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object max = progressBar.getMax();

		if (max != null) {
			renderedAttributes.add(renderNumber(ProgressBar.MAX, max));
		}
	}

	protected void renderMin(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object min = progressBar.getMin();

		if (min != null) {
			renderedAttributes.add(renderNumber(ProgressBar.MIN, min));
		}
	}

	protected void renderOrientation(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String orientation = progressBar.getOrientation();

		if (orientation != null) {
			renderedAttributes.add(renderString(ProgressBar.ORIENTATION, orientation));
		}
	}

	protected void renderRatio(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object ratio = progressBar.getRatio();

		if (ratio != null) {
			renderedAttributes.add(renderNumber(ProgressBar.RATIO, ratio));
		}
	}

	protected void renderRender(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object render = progressBar.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(ProgressBar.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean rendered = progressBar.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(ProgressBar.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String srcNode = progressBar.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(ProgressBar.SRC_NODE, srcNode));
		}
	}

	protected void renderStep(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object step = progressBar.getStep();

		if (step != null) {
			renderedAttributes.add(renderNumber(ProgressBar.STEP, step));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object strings = progressBar.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(ProgressBar.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object tabIndex = progressBar.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(ProgressBar.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTextNode(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String textNode = progressBar.getTextNode();

		if (textNode != null) {
			renderedAttributes.add(renderString(ProgressBar.TEXT_NODE, textNode));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean useARIA = progressBar.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(ProgressBar.USE_ARIA, useARIA));
		}
	}

	protected void renderProgressBarValue(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object progressBarValue = progressBar.getProgressBarValue();

		if (progressBarValue != null) {
			renderedAttributes.add(renderString(ProgressBar.PROGRESS_BAR_VALUE, progressBarValue));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean visible = progressBar.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(ProgressBar.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object width = progressBar.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(ProgressBar.WIDTH, width));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterBoundingBoxChange = progressBar.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterContentBoxChange = progressBar.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterCssClassChange = progressBar.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterDestroyedChange = progressBar.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterDisabledChange = progressBar.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterFocusedChange = progressBar.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterHeightChange = progressBar.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterHideClassChange = progressBar.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterIdChange = progressBar.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterInitializedChange = progressBar.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterLabelChange = progressBar.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterLocaleChange = progressBar.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterMaxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterMaxChange = progressBar.getAfterMaxChange();

		if (afterMaxChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_MAX_CHANGE, afterMaxChange));
		}
	}

	protected void renderAfterMinChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterMinChange = progressBar.getAfterMinChange();

		if (afterMinChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_MIN_CHANGE, afterMinChange));
		}
	}

	protected void renderAfterOrientationChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterOrientationChange = progressBar.getAfterOrientationChange();

		if (afterOrientationChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_ORIENTATION_CHANGE, afterOrientationChange));
		}
	}

	protected void renderAfterRatioChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterRatioChange = progressBar.getAfterRatioChange();

		if (afterRatioChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_RATIO_CHANGE, afterRatioChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterRenderChange = progressBar.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterRenderedChange = progressBar.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterSrcNodeChange = progressBar.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStepChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterStepChange = progressBar.getAfterStepChange();

		if (afterStepChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_STEP_CHANGE, afterStepChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterStringsChange = progressBar.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterTabIndexChange = progressBar.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTextNodeChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterTextNodeChange = progressBar.getAfterTextNodeChange();

		if (afterTextNodeChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_TEXT_NODE_CHANGE, afterTextNodeChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterUseARIAChange = progressBar.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterValueChange = progressBar.getAfterValueChange();

		if (afterValueChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_VALUE_CHANGE, afterValueChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterVisibleChange = progressBar.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterWidthChange = progressBar.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(ProgressBar.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onBoundingBoxChange = progressBar.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onContentBoxChange = progressBar.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onCssClassChange = progressBar.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onDestroyedChange = progressBar.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onDisabledChange = progressBar.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onFocusedChange = progressBar.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onHeightChange = progressBar.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onHideClassChange = progressBar.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onIdChange = progressBar.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onInitializedChange = progressBar.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onLabelChange = progressBar.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onLocaleChange = progressBar.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnMaxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onMaxChange = progressBar.getOnMaxChange();

		if (onMaxChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_MAX_CHANGE, onMaxChange));
		}
	}

	protected void renderOnMinChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onMinChange = progressBar.getOnMinChange();

		if (onMinChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_MIN_CHANGE, onMinChange));
		}
	}

	protected void renderOnOrientationChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onOrientationChange = progressBar.getOnOrientationChange();

		if (onOrientationChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_ORIENTATION_CHANGE, onOrientationChange));
		}
	}

	protected void renderOnRatioChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onRatioChange = progressBar.getOnRatioChange();

		if (onRatioChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_RATIO_CHANGE, onRatioChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onRenderChange = progressBar.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onRenderedChange = progressBar.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onSrcNodeChange = progressBar.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStepChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onStepChange = progressBar.getOnStepChange();

		if (onStepChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_STEP_CHANGE, onStepChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onStringsChange = progressBar.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onTabIndexChange = progressBar.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTextNodeChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onTextNodeChange = progressBar.getOnTextNodeChange();

		if (onTextNodeChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_TEXT_NODE_CHANGE, onTextNodeChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onUseARIAChange = progressBar.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnValueChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onValueChange = progressBar.getOnValueChange();

		if (onValueChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_VALUE_CHANGE, onValueChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onVisibleChange = progressBar.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onWidthChange = progressBar.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(ProgressBar.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}