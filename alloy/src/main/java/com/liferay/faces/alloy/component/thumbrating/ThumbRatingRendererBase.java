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
package com.liferay.faces.alloy.component.thumbrating;

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
public abstract class ThumbRatingRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-rating";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ThumbRating thumbRating = (ThumbRating) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var thumbRating = new A.ThumbRating");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, thumbRating);
		renderCanReset(renderedAttributes, thumbRating);
		renderContentBox(renderedAttributes, thumbRating);
		renderCssClass(renderedAttributes, thumbRating);
		renderCssClasses(renderedAttributes, thumbRating);
		renderDefaultSelected(renderedAttributes, thumbRating);
		renderDestroyed(renderedAttributes, thumbRating);
		renderDisabled(renderedAttributes, thumbRating);
		renderElements(renderedAttributes, thumbRating);
		renderFocused(renderedAttributes, thumbRating);
		renderHeight(renderedAttributes, thumbRating);
		renderHiddenInput(renderedAttributes, thumbRating);
		renderHideClass(renderedAttributes, thumbRating);
		renderThumbRatingId(renderedAttributes, thumbRating);
		renderInitialized(renderedAttributes, thumbRating);
		renderInputName(renderedAttributes, thumbRating);
		renderLabel(renderedAttributes, thumbRating);
		renderLabelNode(renderedAttributes, thumbRating);
		renderThumbRatingLocale(renderedAttributes, thumbRating);
		renderRender(renderedAttributes, thumbRating);
		renderRendered(renderedAttributes, thumbRating);
		renderSelectedIndex(renderedAttributes, thumbRating);
		renderShowTitle(renderedAttributes, thumbRating);
		renderSize(renderedAttributes, thumbRating);
		renderSrcNode(renderedAttributes, thumbRating);
		renderStrings(renderedAttributes, thumbRating);
		renderTabIndex(renderedAttributes, thumbRating);
		renderTitle(renderedAttributes, thumbRating);
		renderUseARIA(renderedAttributes, thumbRating);
		renderThumbRatingValue(renderedAttributes, thumbRating);
		renderVisible(renderedAttributes, thumbRating);
		renderWidth(renderedAttributes, thumbRating);

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

	protected void renderBoundingBox(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String boundingBox = thumbRating.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(ThumbRating.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCanReset(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean canReset = thumbRating.getCanReset();

		if (canReset != null) {
			renderedAttributes.add(renderBoolean(ThumbRating.CAN_RESET, canReset));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String contentBox = thumbRating.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(ThumbRating.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String cssClass = thumbRating.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(ThumbRating.CSS_CLASS, cssClass));
		}
	}

	protected void renderCssClasses(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object cssClasses = thumbRating.getCssClasses();

		if (cssClasses != null) {
			renderedAttributes.add(renderObject(ThumbRating.CSS_CLASSES, cssClasses));
		}
	}

	protected void renderDefaultSelected(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object defaultSelected = thumbRating.getDefaultSelected();

		if (defaultSelected != null) {
			renderedAttributes.add(renderNumber(ThumbRating.DEFAULT_SELECTED, defaultSelected));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean destroyed = thumbRating.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(ThumbRating.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean disabled = thumbRating.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(ThumbRating.DISABLED, disabled));
		}
	}

	protected void renderElements(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object elements = thumbRating.getElements();

		if (elements != null) {
			renderedAttributes.add(renderString(ThumbRating.ELEMENTS, elements));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean focused = thumbRating.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(ThumbRating.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object height = thumbRating.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(ThumbRating.HEIGHT, height));
		}
	}

	protected void renderHiddenInput(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object hiddenInput = thumbRating.getHiddenInput();

		if (hiddenInput != null) {
			renderedAttributes.add(renderString(ThumbRating.HIDDEN_INPUT, hiddenInput));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String hideClass = thumbRating.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(ThumbRating.HIDE_CLASS, hideClass));
		}
	}

	protected void renderThumbRatingId(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String thumbRatingId = thumbRating.getThumbRatingId();

		if (thumbRatingId != null) {
			renderedAttributes.add(renderString(ThumbRating.THUMB_RATING_ID, thumbRatingId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean initialized = thumbRating.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ThumbRating.INITIALIZED, initialized));
		}
	}

	protected void renderInputName(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String inputName = thumbRating.getInputName();

		if (inputName != null) {
			renderedAttributes.add(renderString(ThumbRating.INPUT_NAME, inputName));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String label = thumbRating.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(ThumbRating.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String labelNode = thumbRating.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(ThumbRating.LABEL_NODE, labelNode));
		}
	}

	protected void renderThumbRatingLocale(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String thumbRatingLocale = thumbRating.getThumbRatingLocale();

		if (thumbRatingLocale != null) {
			renderedAttributes.add(renderString(ThumbRating.THUMB_RATING_LOCALE, thumbRatingLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object render = thumbRating.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(ThumbRating.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean rendered = thumbRating.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(ThumbRating.RENDERED, rendered));
		}
	}

	protected void renderSelectedIndex(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object selectedIndex = thumbRating.getSelectedIndex();

		if (selectedIndex != null) {
			renderedAttributes.add(renderNumber(ThumbRating.SELECTED_INDEX, selectedIndex));
		}
	}

	protected void renderShowTitle(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean showTitle = thumbRating.getShowTitle();

		if (showTitle != null) {
			renderedAttributes.add(renderBoolean(ThumbRating.SHOW_TITLE, showTitle));
		}
	}

	protected void renderSize(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object size = thumbRating.getSize();

		if (size != null) {
			renderedAttributes.add(renderNumber(ThumbRating.SIZE, size));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String srcNode = thumbRating.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(ThumbRating.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object strings = thumbRating.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(ThumbRating.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object tabIndex = thumbRating.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(ThumbRating.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTitle(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String title = thumbRating.getTitle();

		if (title != null) {
			renderedAttributes.add(renderString(ThumbRating.TITLE, title));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean useARIA = thumbRating.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(ThumbRating.USE_ARIA, useARIA));
		}
	}

	protected void renderThumbRatingValue(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String thumbRatingValue = thumbRating.getThumbRatingValue();

		if (thumbRatingValue != null) {
			renderedAttributes.add(renderString(ThumbRating.THUMB_RATING_VALUE, thumbRatingValue));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean visible = thumbRating.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(ThumbRating.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object width = thumbRating.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(ThumbRating.WIDTH, width));
		}
	}

}