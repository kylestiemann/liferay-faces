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

}