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

		if (progressBar.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, progressBar);
		}
		
		if (progressBar.getContentBox() != null) {
			renderContentBox(renderedAttributes, progressBar);
		}
		
		if (progressBar.getCssClass() != null) {
			renderCssClass(renderedAttributes, progressBar);
		}
		
		if (progressBar.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, progressBar);
		}
		
		if (progressBar.getDisabled() != null) {
			renderDisabled(renderedAttributes, progressBar);
		}
		
		if (progressBar.getFocused() != null) {
			renderFocused(renderedAttributes, progressBar);
		}
		
		if (progressBar.getHeight() != null) {
			renderHeight(renderedAttributes, progressBar);
		}
		
		if (progressBar.getHideClass() != null) {
			renderHideClass(renderedAttributes, progressBar);
		}
		
		if (progressBar.getProgressBarId() != null) {
			renderProgressBarId(renderedAttributes, progressBar);
		}
		
		if (progressBar.getInitialized() != null) {
			renderInitialized(renderedAttributes, progressBar);
		}
		
		if (progressBar.getLabel() != null) {
			renderLabel(renderedAttributes, progressBar);
		}
		
		if (progressBar.getProgressBarLocale() != null) {
			renderProgressBarLocale(renderedAttributes, progressBar);
		}
		
		if (progressBar.getMax() != null) {
			renderMax(renderedAttributes, progressBar);
		}
		
		if (progressBar.getMin() != null) {
			renderMin(renderedAttributes, progressBar);
		}
		
		if (progressBar.getOrientation() != null) {
			renderOrientation(renderedAttributes, progressBar);
		}
		
		if (progressBar.getRatio() != null) {
			renderRatio(renderedAttributes, progressBar);
		}
		
		if (progressBar.getRender() != null) {
			renderRender(renderedAttributes, progressBar);
		}
		
		if (progressBar.getRendered() != null) {
			renderRendered(renderedAttributes, progressBar);
		}
		
		if (progressBar.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, progressBar);
		}
		
		if (progressBar.getStep() != null) {
			renderStep(renderedAttributes, progressBar);
		}
		
		if (progressBar.getStrings() != null) {
			renderStrings(renderedAttributes, progressBar);
		}
		
		if (progressBar.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, progressBar);
		}
		
		if (progressBar.getTextNode() != null) {
			renderTextNode(renderedAttributes, progressBar);
		}
		
		if (progressBar.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, progressBar);
		}
		
		if (progressBar.getProgressBarValue() != null) {
			renderProgressBarValue(renderedAttributes, progressBar);
		}
		
		if (progressBar.getVisible() != null) {
			renderVisible(renderedAttributes, progressBar);
		}
		
		if (progressBar.getWidth() != null) {
			renderWidth(renderedAttributes, progressBar);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (progressBar.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterMaxChange() != null) {
			renderAfterMaxChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterMinChange() != null) {
			renderAfterMinChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterOrientationChange() != null) {
			renderAfterOrientationChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterRatioChange() != null) {
			renderAfterRatioChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterStepChange() != null) {
			renderAfterStepChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterTextNodeChange() != null) {
			renderAfterTextNodeChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterValueChange() != null) {
			renderAfterValueChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, progressBar);
		}
		
		if (progressBar.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, progressBar);
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

		if (progressBar.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnMaxChange() != null) {
			renderOnMaxChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnMinChange() != null) {
			renderOnMinChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnOrientationChange() != null) {
			renderOnOrientationChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnRatioChange() != null) {
			renderOnRatioChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnStepChange() != null) {
			renderOnStepChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnTextNodeChange() != null) {
			renderOnTextNodeChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnValueChange() != null) {
			renderOnValueChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, progressBar);
		}
		
		if (progressBar.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, progressBar);
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

	protected void renderBoundingBox(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String boundingBox = progressBar.getBoundingBox();
		renderedAttributes.add(renderString(ProgressBar.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String contentBox = progressBar.getContentBox();
		renderedAttributes.add(renderString(ProgressBar.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String cssClass = progressBar.getCssClass();
		renderedAttributes.add(renderString(ProgressBar.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean destroyed = progressBar.getDestroyed();
		renderedAttributes.add(renderBoolean(ProgressBar.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean disabled = progressBar.getDisabled();
		renderedAttributes.add(renderBoolean(ProgressBar.DISABLED, disabled));
	}

	protected void renderFocused(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean focused = progressBar.getFocused();
		renderedAttributes.add(renderBoolean(ProgressBar.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Integer height = progressBar.getHeight();
		renderedAttributes.add(renderNumber(ProgressBar.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String hideClass = progressBar.getHideClass();
		renderedAttributes.add(renderString(ProgressBar.HIDE_CLASS, hideClass));
	}

	protected void renderProgressBarId(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String progressBarId = progressBar.getProgressBarId();
		renderedAttributes.add(renderString(ProgressBar.PROGRESS_BAR_ID, progressBarId));
	}

	protected void renderInitialized(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean initialized = progressBar.getInitialized();
		renderedAttributes.add(renderBoolean(ProgressBar.INITIALIZED, initialized));
	}

	protected void renderLabel(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String label = progressBar.getLabel();
		renderedAttributes.add(renderString(ProgressBar.LABEL, label));
	}

	protected void renderProgressBarLocale(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String progressBarLocale = progressBar.getProgressBarLocale();
		renderedAttributes.add(renderString(ProgressBar.PROGRESS_BAR_LOCALE, progressBarLocale));
	}

	protected void renderMax(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object max = progressBar.getMax();
		renderedAttributes.add(renderNumber(ProgressBar.MAX, max));
	}

	protected void renderMin(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object min = progressBar.getMin();
		renderedAttributes.add(renderNumber(ProgressBar.MIN, min));
	}

	protected void renderOrientation(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String orientation = progressBar.getOrientation();
		renderedAttributes.add(renderString(ProgressBar.ORIENTATION, orientation));
	}

	protected void renderRatio(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object ratio = progressBar.getRatio();
		renderedAttributes.add(renderNumber(ProgressBar.RATIO, ratio));
	}

	protected void renderRender(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object render = progressBar.getRender();
		renderedAttributes.add(renderString(ProgressBar.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean rendered = progressBar.getRendered();
		renderedAttributes.add(renderBoolean(ProgressBar.RENDERED, rendered));
	}

	protected void renderSrcNode(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String srcNode = progressBar.getSrcNode();
		renderedAttributes.add(renderString(ProgressBar.SRC_NODE, srcNode));
	}

	protected void renderStep(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object step = progressBar.getStep();
		renderedAttributes.add(renderNumber(ProgressBar.STEP, step));
	}

	protected void renderStrings(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object strings = progressBar.getStrings();
		renderedAttributes.add(renderObject(ProgressBar.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object tabIndex = progressBar.getTabIndex();
		renderedAttributes.add(renderNumber(ProgressBar.TAB_INDEX, tabIndex));
	}

	protected void renderTextNode(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String textNode = progressBar.getTextNode();
		renderedAttributes.add(renderString(ProgressBar.TEXT_NODE, textNode));
	}

	protected void renderUseARIA(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean useARIA = progressBar.getUseARIA();
		renderedAttributes.add(renderBoolean(ProgressBar.USE_ARIA, useARIA));
	}

	protected void renderProgressBarValue(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object progressBarValue = progressBar.getProgressBarValue();
		renderedAttributes.add(renderString(ProgressBar.PROGRESS_BAR_VALUE, progressBarValue));
	}

	protected void renderVisible(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Boolean visible = progressBar.getVisible();
		renderedAttributes.add(renderBoolean(ProgressBar.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.Object width = progressBar.getWidth();
		renderedAttributes.add(renderString(ProgressBar.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterBoundingBoxChange = progressBar.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterContentBoxChange = progressBar.getAfterContentBoxChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterCssClassChange = progressBar.getAfterCssClassChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterDestroyedChange = progressBar.getAfterDestroyedChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterDisabledChange = progressBar.getAfterDisabledChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterFocusedChange = progressBar.getAfterFocusedChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterHeightChange = progressBar.getAfterHeightChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterHideClassChange = progressBar.getAfterHideClassChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterIdChange = progressBar.getAfterIdChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterInitializedChange = progressBar.getAfterInitializedChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterLabelChange = progressBar.getAfterLabelChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterLocaleChange = progressBar.getAfterLocaleChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterMaxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterMaxChange = progressBar.getAfterMaxChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_MAX_CHANGE, afterMaxChange));
	}

	protected void renderAfterMinChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterMinChange = progressBar.getAfterMinChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_MIN_CHANGE, afterMinChange));
	}

	protected void renderAfterOrientationChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterOrientationChange = progressBar.getAfterOrientationChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_ORIENTATION_CHANGE, afterOrientationChange));
	}

	protected void renderAfterRatioChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterRatioChange = progressBar.getAfterRatioChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_RATIO_CHANGE, afterRatioChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterRenderChange = progressBar.getAfterRenderChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterRenderedChange = progressBar.getAfterRenderedChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterSrcNodeChange = progressBar.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStepChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterStepChange = progressBar.getAfterStepChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_STEP_CHANGE, afterStepChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterStringsChange = progressBar.getAfterStringsChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterTabIndexChange = progressBar.getAfterTabIndexChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTextNodeChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterTextNodeChange = progressBar.getAfterTextNodeChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_TEXT_NODE_CHANGE, afterTextNodeChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterUseARIAChange = progressBar.getAfterUseARIAChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterValueChange = progressBar.getAfterValueChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_VALUE_CHANGE, afterValueChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterVisibleChange = progressBar.getAfterVisibleChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String afterWidthChange = progressBar.getAfterWidthChange();
		renderedAttributes.add(renderString(ProgressBar.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onBoundingBoxChange = progressBar.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(ProgressBar.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onContentBoxChange = progressBar.getOnContentBoxChange();
		renderedAttributes.add(renderString(ProgressBar.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onCssClassChange = progressBar.getOnCssClassChange();
		renderedAttributes.add(renderString(ProgressBar.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onDestroyedChange = progressBar.getOnDestroyedChange();
		renderedAttributes.add(renderString(ProgressBar.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onDisabledChange = progressBar.getOnDisabledChange();
		renderedAttributes.add(renderString(ProgressBar.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onFocusedChange = progressBar.getOnFocusedChange();
		renderedAttributes.add(renderString(ProgressBar.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onHeightChange = progressBar.getOnHeightChange();
		renderedAttributes.add(renderString(ProgressBar.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onHideClassChange = progressBar.getOnHideClassChange();
		renderedAttributes.add(renderString(ProgressBar.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onIdChange = progressBar.getOnIdChange();
		renderedAttributes.add(renderString(ProgressBar.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onInitializedChange = progressBar.getOnInitializedChange();
		renderedAttributes.add(renderString(ProgressBar.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onLabelChange = progressBar.getOnLabelChange();
		renderedAttributes.add(renderString(ProgressBar.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onLocaleChange = progressBar.getOnLocaleChange();
		renderedAttributes.add(renderString(ProgressBar.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnMaxChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onMaxChange = progressBar.getOnMaxChange();
		renderedAttributes.add(renderString(ProgressBar.ON_MAX_CHANGE, onMaxChange));
	}

	protected void renderOnMinChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onMinChange = progressBar.getOnMinChange();
		renderedAttributes.add(renderString(ProgressBar.ON_MIN_CHANGE, onMinChange));
	}

	protected void renderOnOrientationChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onOrientationChange = progressBar.getOnOrientationChange();
		renderedAttributes.add(renderString(ProgressBar.ON_ORIENTATION_CHANGE, onOrientationChange));
	}

	protected void renderOnRatioChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onRatioChange = progressBar.getOnRatioChange();
		renderedAttributes.add(renderString(ProgressBar.ON_RATIO_CHANGE, onRatioChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onRenderChange = progressBar.getOnRenderChange();
		renderedAttributes.add(renderString(ProgressBar.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onRenderedChange = progressBar.getOnRenderedChange();
		renderedAttributes.add(renderString(ProgressBar.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onSrcNodeChange = progressBar.getOnSrcNodeChange();
		renderedAttributes.add(renderString(ProgressBar.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStepChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onStepChange = progressBar.getOnStepChange();
		renderedAttributes.add(renderString(ProgressBar.ON_STEP_CHANGE, onStepChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onStringsChange = progressBar.getOnStringsChange();
		renderedAttributes.add(renderString(ProgressBar.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onTabIndexChange = progressBar.getOnTabIndexChange();
		renderedAttributes.add(renderString(ProgressBar.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTextNodeChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onTextNodeChange = progressBar.getOnTextNodeChange();
		renderedAttributes.add(renderString(ProgressBar.ON_TEXT_NODE_CHANGE, onTextNodeChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onUseARIAChange = progressBar.getOnUseARIAChange();
		renderedAttributes.add(renderString(ProgressBar.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnValueChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onValueChange = progressBar.getOnValueChange();
		renderedAttributes.add(renderString(ProgressBar.ON_VALUE_CHANGE, onValueChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onVisibleChange = progressBar.getOnVisibleChange();
		renderedAttributes.add(renderString(ProgressBar.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ProgressBar progressBar) throws IOException {
		java.lang.String onWidthChange = progressBar.getOnWidthChange();
		renderedAttributes.add(renderString(ProgressBar.ON_WIDTH_CHANGE, onWidthChange));
	}

}