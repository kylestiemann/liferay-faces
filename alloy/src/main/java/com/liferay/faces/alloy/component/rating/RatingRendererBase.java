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
package com.liferay.faces.alloy.component.rating;

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
public abstract class RatingRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-rating";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Rating rating = (Rating) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var rating = new A.Rating");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, rating);
		renderCanReset(renderedAttributes, rating);
		renderContentBox(renderedAttributes, rating);
		renderCssClass(renderedAttributes, rating);
		renderCssClasses(renderedAttributes, rating);
		renderDefaultSelected(renderedAttributes, rating);
		renderDestroyed(renderedAttributes, rating);
		renderDisabled(renderedAttributes, rating);
		renderElements(renderedAttributes, rating);
		renderFocused(renderedAttributes, rating);
		renderHeight(renderedAttributes, rating);
		renderHiddenInput(renderedAttributes, rating);
		renderHideClass(renderedAttributes, rating);
		renderRatingId(renderedAttributes, rating);
		renderInitialized(renderedAttributes, rating);
		renderInputName(renderedAttributes, rating);
		renderLabel(renderedAttributes, rating);
		renderLabelNode(renderedAttributes, rating);
		renderRatingLocale(renderedAttributes, rating);
		renderRender(renderedAttributes, rating);
		renderRendered(renderedAttributes, rating);
		renderSelectedIndex(renderedAttributes, rating);
		renderShowTitle(renderedAttributes, rating);
		renderSize(renderedAttributes, rating);
		renderSrcNode(renderedAttributes, rating);
		renderStrings(renderedAttributes, rating);
		renderTabIndex(renderedAttributes, rating);
		renderTitle(renderedAttributes, rating);
		renderUseARIA(renderedAttributes, rating);
		renderRatingValue(renderedAttributes, rating);
		renderVisible(renderedAttributes, rating);
		renderWidth(renderedAttributes, rating);

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

	protected void renderBoundingBox(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String boundingBox = rating.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Rating.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCanReset(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean canReset = rating.getCanReset();

		if (canReset != null) {
			renderedAttributes.add(renderBoolean(Rating.CAN_RESET, canReset));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String contentBox = rating.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Rating.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String cssClass = rating.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(Rating.CSS_CLASS, cssClass));
		}
	}

	protected void renderCssClasses(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object cssClasses = rating.getCssClasses();

		if (cssClasses != null) {
			renderedAttributes.add(renderObject(Rating.CSS_CLASSES, cssClasses));
		}
	}

	protected void renderDefaultSelected(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object defaultSelected = rating.getDefaultSelected();

		if (defaultSelected != null) {
			renderedAttributes.add(renderNumber(Rating.DEFAULT_SELECTED, defaultSelected));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean destroyed = rating.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Rating.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean disabled = rating.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Rating.DISABLED, disabled));
		}
	}

	protected void renderElements(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object elements = rating.getElements();

		if (elements != null) {
			renderedAttributes.add(renderString(Rating.ELEMENTS, elements));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean focused = rating.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Rating.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object height = rating.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Rating.HEIGHT, height));
		}
	}

	protected void renderHiddenInput(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object hiddenInput = rating.getHiddenInput();

		if (hiddenInput != null) {
			renderedAttributes.add(renderString(Rating.HIDDEN_INPUT, hiddenInput));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String hideClass = rating.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(Rating.HIDE_CLASS, hideClass));
		}
	}

	protected void renderRatingId(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String ratingId = rating.getRatingId();

		if (ratingId != null) {
			renderedAttributes.add(renderString(Rating.RATING_ID, ratingId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean initialized = rating.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Rating.INITIALIZED, initialized));
		}
	}

	protected void renderInputName(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String inputName = rating.getInputName();

		if (inputName != null) {
			renderedAttributes.add(renderString(Rating.INPUT_NAME, inputName));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String label = rating.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(Rating.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String labelNode = rating.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(Rating.LABEL_NODE, labelNode));
		}
	}

	protected void renderRatingLocale(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String ratingLocale = rating.getRatingLocale();

		if (ratingLocale != null) {
			renderedAttributes.add(renderString(Rating.RATING_LOCALE, ratingLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object render = rating.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Rating.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean rendered = rating.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Rating.RENDERED, rendered));
		}
	}

	protected void renderSelectedIndex(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object selectedIndex = rating.getSelectedIndex();

		if (selectedIndex != null) {
			renderedAttributes.add(renderNumber(Rating.SELECTED_INDEX, selectedIndex));
		}
	}

	protected void renderShowTitle(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean showTitle = rating.getShowTitle();

		if (showTitle != null) {
			renderedAttributes.add(renderBoolean(Rating.SHOW_TITLE, showTitle));
		}
	}

	protected void renderSize(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object size = rating.getSize();

		if (size != null) {
			renderedAttributes.add(renderNumber(Rating.SIZE, size));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String srcNode = rating.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Rating.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object strings = rating.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Rating.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object tabIndex = rating.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Rating.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTitle(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String title = rating.getTitle();

		if (title != null) {
			renderedAttributes.add(renderString(Rating.TITLE, title));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean useARIA = rating.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(Rating.USE_ARIA, useARIA));
		}
	}

	protected void renderRatingValue(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String ratingValue = rating.getRatingValue();

		if (ratingValue != null) {
			renderedAttributes.add(renderString(Rating.RATING_VALUE, ratingValue));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean visible = rating.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Rating.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object width = rating.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Rating.WIDTH, width));
		}
	}

}