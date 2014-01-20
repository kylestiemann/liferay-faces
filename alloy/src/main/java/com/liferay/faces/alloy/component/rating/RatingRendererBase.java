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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, rating);
		renderAfterCanResetChange(renderedAfterEvents, rating);
		renderAfterContentBoxChange(renderedAfterEvents, rating);
		renderAfterCssClassChange(renderedAfterEvents, rating);
		renderAfterCssClassesChange(renderedAfterEvents, rating);
		renderAfterDefaultSelectedChange(renderedAfterEvents, rating);
		renderAfterDestroyedChange(renderedAfterEvents, rating);
		renderAfterDisabledChange(renderedAfterEvents, rating);
		renderAfterElementsChange(renderedAfterEvents, rating);
		renderAfterFocusedChange(renderedAfterEvents, rating);
		renderAfterHeightChange(renderedAfterEvents, rating);
		renderAfterHiddenInputChange(renderedAfterEvents, rating);
		renderAfterHideClassChange(renderedAfterEvents, rating);
		renderAfterIdChange(renderedAfterEvents, rating);
		renderAfterInitializedChange(renderedAfterEvents, rating);
		renderAfterInputNameChange(renderedAfterEvents, rating);
		renderAfterLabelChange(renderedAfterEvents, rating);
		renderAfterLabelNodeChange(renderedAfterEvents, rating);
		renderAfterLocaleChange(renderedAfterEvents, rating);
		renderAfterRenderChange(renderedAfterEvents, rating);
		renderAfterRenderedChange(renderedAfterEvents, rating);
		renderAfterSelectedIndexChange(renderedAfterEvents, rating);
		renderAfterShowTitleChange(renderedAfterEvents, rating);
		renderAfterSizeChange(renderedAfterEvents, rating);
		renderAfterSrcNodeChange(renderedAfterEvents, rating);
		renderAfterStringsChange(renderedAfterEvents, rating);
		renderAfterTabIndexChange(renderedAfterEvents, rating);
		renderAfterTitleChange(renderedAfterEvents, rating);
		renderAfterUseARIAChange(renderedAfterEvents, rating);
		renderAfterValueChange(renderedAfterEvents, rating);
		renderAfterVisibleChange(renderedAfterEvents, rating);
		renderAfterWidthChange(renderedAfterEvents, rating);

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

		renderOnBoundingBoxChange(renderedOnEvents, rating);
		renderOnCanResetChange(renderedOnEvents, rating);
		renderOnContentBoxChange(renderedOnEvents, rating);
		renderOnCssClassChange(renderedOnEvents, rating);
		renderOnCssClassesChange(renderedOnEvents, rating);
		renderOnDefaultSelectedChange(renderedOnEvents, rating);
		renderOnDestroyedChange(renderedOnEvents, rating);
		renderOnDisabledChange(renderedOnEvents, rating);
		renderOnElementsChange(renderedOnEvents, rating);
		renderOnFocusedChange(renderedOnEvents, rating);
		renderOnHeightChange(renderedOnEvents, rating);
		renderOnHiddenInputChange(renderedOnEvents, rating);
		renderOnHideClassChange(renderedOnEvents, rating);
		renderOnIdChange(renderedOnEvents, rating);
		renderOnInitializedChange(renderedOnEvents, rating);
		renderOnInputNameChange(renderedOnEvents, rating);
		renderOnLabelChange(renderedOnEvents, rating);
		renderOnLabelNodeChange(renderedOnEvents, rating);
		renderOnLocaleChange(renderedOnEvents, rating);
		renderOnRenderChange(renderedOnEvents, rating);
		renderOnRenderedChange(renderedOnEvents, rating);
		renderOnSelectedIndexChange(renderedOnEvents, rating);
		renderOnShowTitleChange(renderedOnEvents, rating);
		renderOnSizeChange(renderedOnEvents, rating);
		renderOnSrcNodeChange(renderedOnEvents, rating);
		renderOnStringsChange(renderedOnEvents, rating);
		renderOnTabIndexChange(renderedOnEvents, rating);
		renderOnTitleChange(renderedOnEvents, rating);
		renderOnUseARIAChange(renderedOnEvents, rating);
		renderOnValueChange(renderedOnEvents, rating);
		renderOnVisibleChange(renderedOnEvents, rating);
		renderOnWidthChange(renderedOnEvents, rating);

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

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterBoundingBoxChange = rating.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCanResetChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterCanResetChange = rating.getAfterCanResetChange();

		if (afterCanResetChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_CAN_RESET_CHANGE, afterCanResetChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterContentBoxChange = rating.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterCssClassChange = rating.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterCssClassesChange = rating.getAfterCssClassesChange();

		if (afterCssClassesChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
		}
	}

	protected void renderAfterDefaultSelectedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterDefaultSelectedChange = rating.getAfterDefaultSelectedChange();

		if (afterDefaultSelectedChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_DEFAULT_SELECTED_CHANGE, afterDefaultSelectedChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterDestroyedChange = rating.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterDisabledChange = rating.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterElementsChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterElementsChange = rating.getAfterElementsChange();

		if (afterElementsChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_ELEMENTS_CHANGE, afterElementsChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterFocusedChange = rating.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterHeightChange = rating.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHiddenInputChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterHiddenInputChange = rating.getAfterHiddenInputChange();

		if (afterHiddenInputChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_HIDDEN_INPUT_CHANGE, afterHiddenInputChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterHideClassChange = rating.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterIdChange = rating.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterInitializedChange = rating.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterInputNameChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterInputNameChange = rating.getAfterInputNameChange();

		if (afterInputNameChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_INPUT_NAME_CHANGE, afterInputNameChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterLabelChange = rating.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterLabelNodeChange = rating.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterLocaleChange = rating.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterRenderChange = rating.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterRenderedChange = rating.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSelectedIndexChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterSelectedIndexChange = rating.getAfterSelectedIndexChange();

		if (afterSelectedIndexChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_SELECTED_INDEX_CHANGE, afterSelectedIndexChange));
		}
	}

	protected void renderAfterShowTitleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterShowTitleChange = rating.getAfterShowTitleChange();

		if (afterShowTitleChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_SHOW_TITLE_CHANGE, afterShowTitleChange));
		}
	}

	protected void renderAfterSizeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterSizeChange = rating.getAfterSizeChange();

		if (afterSizeChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_SIZE_CHANGE, afterSizeChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterSrcNodeChange = rating.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterStringsChange = rating.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterTabIndexChange = rating.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTitleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterTitleChange = rating.getAfterTitleChange();

		if (afterTitleChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_TITLE_CHANGE, afterTitleChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterUseARIAChange = rating.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterValueChange = rating.getAfterValueChange();

		if (afterValueChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_VALUE_CHANGE, afterValueChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterVisibleChange = rating.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterWidthChange = rating.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(Rating.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onBoundingBoxChange = rating.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Rating.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCanResetChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onCanResetChange = rating.getOnCanResetChange();

		if (onCanResetChange != null) {
			renderedAttributes.add(renderString(Rating.ON_CAN_RESET_CHANGE, onCanResetChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onContentBoxChange = rating.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(Rating.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onCssClassChange = rating.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(Rating.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onCssClassesChange = rating.getOnCssClassesChange();

		if (onCssClassesChange != null) {
			renderedAttributes.add(renderString(Rating.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
		}
	}

	protected void renderOnDefaultSelectedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onDefaultSelectedChange = rating.getOnDefaultSelectedChange();

		if (onDefaultSelectedChange != null) {
			renderedAttributes.add(renderString(Rating.ON_DEFAULT_SELECTED_CHANGE, onDefaultSelectedChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onDestroyedChange = rating.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Rating.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onDisabledChange = rating.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Rating.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnElementsChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onElementsChange = rating.getOnElementsChange();

		if (onElementsChange != null) {
			renderedAttributes.add(renderString(Rating.ON_ELEMENTS_CHANGE, onElementsChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onFocusedChange = rating.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(Rating.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onHeightChange = rating.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(Rating.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHiddenInputChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onHiddenInputChange = rating.getOnHiddenInputChange();

		if (onHiddenInputChange != null) {
			renderedAttributes.add(renderString(Rating.ON_HIDDEN_INPUT_CHANGE, onHiddenInputChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onHideClassChange = rating.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(Rating.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onIdChange = rating.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(Rating.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onInitializedChange = rating.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Rating.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnInputNameChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onInputNameChange = rating.getOnInputNameChange();

		if (onInputNameChange != null) {
			renderedAttributes.add(renderString(Rating.ON_INPUT_NAME_CHANGE, onInputNameChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onLabelChange = rating.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(Rating.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onLabelNodeChange = rating.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(Rating.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onLocaleChange = rating.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(Rating.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onRenderChange = rating.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Rating.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onRenderedChange = rating.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(Rating.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSelectedIndexChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onSelectedIndexChange = rating.getOnSelectedIndexChange();

		if (onSelectedIndexChange != null) {
			renderedAttributes.add(renderString(Rating.ON_SELECTED_INDEX_CHANGE, onSelectedIndexChange));
		}
	}

	protected void renderOnShowTitleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onShowTitleChange = rating.getOnShowTitleChange();

		if (onShowTitleChange != null) {
			renderedAttributes.add(renderString(Rating.ON_SHOW_TITLE_CHANGE, onShowTitleChange));
		}
	}

	protected void renderOnSizeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onSizeChange = rating.getOnSizeChange();

		if (onSizeChange != null) {
			renderedAttributes.add(renderString(Rating.ON_SIZE_CHANGE, onSizeChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onSrcNodeChange = rating.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(Rating.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onStringsChange = rating.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(Rating.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onTabIndexChange = rating.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(Rating.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTitleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onTitleChange = rating.getOnTitleChange();

		if (onTitleChange != null) {
			renderedAttributes.add(renderString(Rating.ON_TITLE_CHANGE, onTitleChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onUseARIAChange = rating.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(Rating.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnValueChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onValueChange = rating.getOnValueChange();

		if (onValueChange != null) {
			renderedAttributes.add(renderString(Rating.ON_VALUE_CHANGE, onValueChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onVisibleChange = rating.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Rating.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onWidthChange = rating.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(Rating.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}