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

		if (rating.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, rating);
		}
		
		if (rating.getCanReset() != null) {
			renderCanReset(renderedAttributes, rating);
		}
		
		if (rating.getContentBox() != null) {
			renderContentBox(renderedAttributes, rating);
		}
		
		if (rating.getCssClass() != null) {
			renderCssClass(renderedAttributes, rating);
		}
		
		if (rating.getCssClasses() != null) {
			renderCssClasses(renderedAttributes, rating);
		}
		
		if (rating.getDefaultSelected() != null) {
			renderDefaultSelected(renderedAttributes, rating);
		}
		
		if (rating.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, rating);
		}
		
		if (rating.getDisabled() != null) {
			renderDisabled(renderedAttributes, rating);
		}
		
		if (rating.getElements() != null) {
			renderElements(renderedAttributes, rating);
		}
		
		if (rating.getFocused() != null) {
			renderFocused(renderedAttributes, rating);
		}
		
		if (rating.getHeight() != null) {
			renderHeight(renderedAttributes, rating);
		}
		
		if (rating.getHiddenInput() != null) {
			renderHiddenInput(renderedAttributes, rating);
		}
		
		if (rating.getHideClass() != null) {
			renderHideClass(renderedAttributes, rating);
		}
		
		if (rating.getRatingId() != null) {
			renderRatingId(renderedAttributes, rating);
		}
		
		if (rating.getInitialized() != null) {
			renderInitialized(renderedAttributes, rating);
		}
		
		if (rating.getInputName() != null) {
			renderInputName(renderedAttributes, rating);
		}
		
		if (rating.getLabel() != null) {
			renderLabel(renderedAttributes, rating);
		}
		
		if (rating.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, rating);
		}
		
		if (rating.getRatingLocale() != null) {
			renderRatingLocale(renderedAttributes, rating);
		}
		
		if (rating.getRender() != null) {
			renderRender(renderedAttributes, rating);
		}
		
		if (rating.getRendered() != null) {
			renderRendered(renderedAttributes, rating);
		}
		
		if (rating.getSelectedIndex() != null) {
			renderSelectedIndex(renderedAttributes, rating);
		}
		
		if (rating.getShowTitle() != null) {
			renderShowTitle(renderedAttributes, rating);
		}
		
		if (rating.getSize() != null) {
			renderSize(renderedAttributes, rating);
		}
		
		if (rating.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, rating);
		}
		
		if (rating.getStrings() != null) {
			renderStrings(renderedAttributes, rating);
		}
		
		if (rating.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, rating);
		}
		
		if (rating.getTitle() != null) {
			renderTitle(renderedAttributes, rating);
		}
		
		if (rating.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, rating);
		}
		
		if (rating.getRatingValue() != null) {
			renderRatingValue(renderedAttributes, rating);
		}
		
		if (rating.getVisible() != null) {
			renderVisible(renderedAttributes, rating);
		}
		
		if (rating.getWidth() != null) {
			renderWidth(renderedAttributes, rating);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (rating.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterCanResetChange() != null) {
			renderAfterCanResetChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterCssClassesChange() != null) {
			renderAfterCssClassesChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterDefaultSelectedChange() != null) {
			renderAfterDefaultSelectedChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterElementsChange() != null) {
			renderAfterElementsChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterHiddenInputChange() != null) {
			renderAfterHiddenInputChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterInputNameChange() != null) {
			renderAfterInputNameChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterSelectedIndexChange() != null) {
			renderAfterSelectedIndexChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterShowTitleChange() != null) {
			renderAfterShowTitleChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterSizeChange() != null) {
			renderAfterSizeChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterTitleChange() != null) {
			renderAfterTitleChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterValueChange() != null) {
			renderAfterValueChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, rating);
		}
		
		if (rating.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, rating);
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

		if (rating.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnCanResetChange() != null) {
			renderOnCanResetChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnCssClassesChange() != null) {
			renderOnCssClassesChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnDefaultSelectedChange() != null) {
			renderOnDefaultSelectedChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnElementsChange() != null) {
			renderOnElementsChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnHiddenInputChange() != null) {
			renderOnHiddenInputChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnInputNameChange() != null) {
			renderOnInputNameChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnSelectedIndexChange() != null) {
			renderOnSelectedIndexChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnShowTitleChange() != null) {
			renderOnShowTitleChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnSizeChange() != null) {
			renderOnSizeChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnTitleChange() != null) {
			renderOnTitleChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnValueChange() != null) {
			renderOnValueChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, rating);
		}
		
		if (rating.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, rating);
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

	protected void renderBoundingBox(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String boundingBox = rating.getBoundingBox();
		renderedAttributes.add(renderString(Rating.BOUNDING_BOX, boundingBox));
	}

	protected void renderCanReset(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean canReset = rating.getCanReset();
		renderedAttributes.add(renderBoolean(Rating.CAN_RESET, canReset));
	}

	protected void renderContentBox(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String contentBox = rating.getContentBox();
		renderedAttributes.add(renderString(Rating.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String cssClass = rating.getCssClass();
		renderedAttributes.add(renderString(Rating.CSS_CLASS, cssClass));
	}

	protected void renderCssClasses(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object cssClasses = rating.getCssClasses();
		renderedAttributes.add(renderObject(Rating.CSS_CLASSES, cssClasses));
	}

	protected void renderDefaultSelected(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object defaultSelected = rating.getDefaultSelected();
		renderedAttributes.add(renderNumber(Rating.DEFAULT_SELECTED, defaultSelected));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean destroyed = rating.getDestroyed();
		renderedAttributes.add(renderBoolean(Rating.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean disabled = rating.getDisabled();
		renderedAttributes.add(renderBoolean(Rating.DISABLED, disabled));
	}

	protected void renderElements(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object elements = rating.getElements();
		renderedAttributes.add(renderString(Rating.ELEMENTS, elements));
	}

	protected void renderFocused(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean focused = rating.getFocused();
		renderedAttributes.add(renderBoolean(Rating.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object height = rating.getHeight();
		renderedAttributes.add(renderString(Rating.HEIGHT, height));
	}

	protected void renderHiddenInput(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object hiddenInput = rating.getHiddenInput();
		renderedAttributes.add(renderString(Rating.HIDDEN_INPUT, hiddenInput));
	}

	protected void renderHideClass(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String hideClass = rating.getHideClass();
		renderedAttributes.add(renderString(Rating.HIDE_CLASS, hideClass));
	}

	protected void renderRatingId(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String ratingId = rating.getRatingId();
		renderedAttributes.add(renderString(Rating.RATING_ID, ratingId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean initialized = rating.getInitialized();
		renderedAttributes.add(renderBoolean(Rating.INITIALIZED, initialized));
	}

	protected void renderInputName(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String inputName = rating.getInputName();
		renderedAttributes.add(renderString(Rating.INPUT_NAME, inputName));
	}

	protected void renderLabel(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String label = rating.getLabel();
		renderedAttributes.add(renderString(Rating.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String labelNode = rating.getLabelNode();
		renderedAttributes.add(renderString(Rating.LABEL_NODE, labelNode));
	}

	protected void renderRatingLocale(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String ratingLocale = rating.getRatingLocale();
		renderedAttributes.add(renderString(Rating.RATING_LOCALE, ratingLocale));
	}

	protected void renderRender(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object render = rating.getRender();
		renderedAttributes.add(renderString(Rating.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean rendered = rating.getRendered();
		renderedAttributes.add(renderBoolean(Rating.RENDERED, rendered));
	}

	protected void renderSelectedIndex(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object selectedIndex = rating.getSelectedIndex();
		renderedAttributes.add(renderNumber(Rating.SELECTED_INDEX, selectedIndex));
	}

	protected void renderShowTitle(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean showTitle = rating.getShowTitle();
		renderedAttributes.add(renderBoolean(Rating.SHOW_TITLE, showTitle));
	}

	protected void renderSize(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object size = rating.getSize();
		renderedAttributes.add(renderNumber(Rating.SIZE, size));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String srcNode = rating.getSrcNode();
		renderedAttributes.add(renderString(Rating.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object strings = rating.getStrings();
		renderedAttributes.add(renderObject(Rating.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object tabIndex = rating.getTabIndex();
		renderedAttributes.add(renderNumber(Rating.TAB_INDEX, tabIndex));
	}

	protected void renderTitle(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String title = rating.getTitle();
		renderedAttributes.add(renderString(Rating.TITLE, title));
	}

	protected void renderUseARIA(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean useARIA = rating.getUseARIA();
		renderedAttributes.add(renderBoolean(Rating.USE_ARIA, useARIA));
	}

	protected void renderRatingValue(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String ratingValue = rating.getRatingValue();
		renderedAttributes.add(renderString(Rating.RATING_VALUE, ratingValue));
	}

	protected void renderVisible(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Boolean visible = rating.getVisible();
		renderedAttributes.add(renderBoolean(Rating.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.Object width = rating.getWidth();
		renderedAttributes.add(renderString(Rating.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterBoundingBoxChange = rating.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Rating.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCanResetChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterCanResetChange = rating.getAfterCanResetChange();
		renderedAttributes.add(renderString(Rating.AFTER_CAN_RESET_CHANGE, afterCanResetChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterContentBoxChange = rating.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Rating.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterCssClassChange = rating.getAfterCssClassChange();
		renderedAttributes.add(renderString(Rating.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterCssClassesChange = rating.getAfterCssClassesChange();
		renderedAttributes.add(renderString(Rating.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
	}

	protected void renderAfterDefaultSelectedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterDefaultSelectedChange = rating.getAfterDefaultSelectedChange();
		renderedAttributes.add(renderString(Rating.AFTER_DEFAULT_SELECTED_CHANGE, afterDefaultSelectedChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterDestroyedChange = rating.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Rating.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterDisabledChange = rating.getAfterDisabledChange();
		renderedAttributes.add(renderString(Rating.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterElementsChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterElementsChange = rating.getAfterElementsChange();
		renderedAttributes.add(renderString(Rating.AFTER_ELEMENTS_CHANGE, afterElementsChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterFocusedChange = rating.getAfterFocusedChange();
		renderedAttributes.add(renderString(Rating.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterHeightChange = rating.getAfterHeightChange();
		renderedAttributes.add(renderString(Rating.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHiddenInputChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterHiddenInputChange = rating.getAfterHiddenInputChange();
		renderedAttributes.add(renderString(Rating.AFTER_HIDDEN_INPUT_CHANGE, afterHiddenInputChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterHideClassChange = rating.getAfterHideClassChange();
		renderedAttributes.add(renderString(Rating.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterIdChange = rating.getAfterIdChange();
		renderedAttributes.add(renderString(Rating.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterInitializedChange = rating.getAfterInitializedChange();
		renderedAttributes.add(renderString(Rating.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterInputNameChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterInputNameChange = rating.getAfterInputNameChange();
		renderedAttributes.add(renderString(Rating.AFTER_INPUT_NAME_CHANGE, afterInputNameChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterLabelChange = rating.getAfterLabelChange();
		renderedAttributes.add(renderString(Rating.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterLabelNodeChange = rating.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(Rating.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterLocaleChange = rating.getAfterLocaleChange();
		renderedAttributes.add(renderString(Rating.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterRenderChange = rating.getAfterRenderChange();
		renderedAttributes.add(renderString(Rating.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterRenderedChange = rating.getAfterRenderedChange();
		renderedAttributes.add(renderString(Rating.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSelectedIndexChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterSelectedIndexChange = rating.getAfterSelectedIndexChange();
		renderedAttributes.add(renderString(Rating.AFTER_SELECTED_INDEX_CHANGE, afterSelectedIndexChange));
	}

	protected void renderAfterShowTitleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterShowTitleChange = rating.getAfterShowTitleChange();
		renderedAttributes.add(renderString(Rating.AFTER_SHOW_TITLE_CHANGE, afterShowTitleChange));
	}

	protected void renderAfterSizeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterSizeChange = rating.getAfterSizeChange();
		renderedAttributes.add(renderString(Rating.AFTER_SIZE_CHANGE, afterSizeChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterSrcNodeChange = rating.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Rating.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterStringsChange = rating.getAfterStringsChange();
		renderedAttributes.add(renderString(Rating.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterTabIndexChange = rating.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Rating.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTitleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterTitleChange = rating.getAfterTitleChange();
		renderedAttributes.add(renderString(Rating.AFTER_TITLE_CHANGE, afterTitleChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterUseARIAChange = rating.getAfterUseARIAChange();
		renderedAttributes.add(renderString(Rating.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterValueChange = rating.getAfterValueChange();
		renderedAttributes.add(renderString(Rating.AFTER_VALUE_CHANGE, afterValueChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterVisibleChange = rating.getAfterVisibleChange();
		renderedAttributes.add(renderString(Rating.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String afterWidthChange = rating.getAfterWidthChange();
		renderedAttributes.add(renderString(Rating.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onBoundingBoxChange = rating.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Rating.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCanResetChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onCanResetChange = rating.getOnCanResetChange();
		renderedAttributes.add(renderString(Rating.ON_CAN_RESET_CHANGE, onCanResetChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onContentBoxChange = rating.getOnContentBoxChange();
		renderedAttributes.add(renderString(Rating.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onCssClassChange = rating.getOnCssClassChange();
		renderedAttributes.add(renderString(Rating.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onCssClassesChange = rating.getOnCssClassesChange();
		renderedAttributes.add(renderString(Rating.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
	}

	protected void renderOnDefaultSelectedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onDefaultSelectedChange = rating.getOnDefaultSelectedChange();
		renderedAttributes.add(renderString(Rating.ON_DEFAULT_SELECTED_CHANGE, onDefaultSelectedChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onDestroyedChange = rating.getOnDestroyedChange();
		renderedAttributes.add(renderString(Rating.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onDisabledChange = rating.getOnDisabledChange();
		renderedAttributes.add(renderString(Rating.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnElementsChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onElementsChange = rating.getOnElementsChange();
		renderedAttributes.add(renderString(Rating.ON_ELEMENTS_CHANGE, onElementsChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onFocusedChange = rating.getOnFocusedChange();
		renderedAttributes.add(renderString(Rating.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onHeightChange = rating.getOnHeightChange();
		renderedAttributes.add(renderString(Rating.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHiddenInputChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onHiddenInputChange = rating.getOnHiddenInputChange();
		renderedAttributes.add(renderString(Rating.ON_HIDDEN_INPUT_CHANGE, onHiddenInputChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onHideClassChange = rating.getOnHideClassChange();
		renderedAttributes.add(renderString(Rating.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onIdChange = rating.getOnIdChange();
		renderedAttributes.add(renderString(Rating.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onInitializedChange = rating.getOnInitializedChange();
		renderedAttributes.add(renderString(Rating.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnInputNameChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onInputNameChange = rating.getOnInputNameChange();
		renderedAttributes.add(renderString(Rating.ON_INPUT_NAME_CHANGE, onInputNameChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onLabelChange = rating.getOnLabelChange();
		renderedAttributes.add(renderString(Rating.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onLabelNodeChange = rating.getOnLabelNodeChange();
		renderedAttributes.add(renderString(Rating.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onLocaleChange = rating.getOnLocaleChange();
		renderedAttributes.add(renderString(Rating.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onRenderChange = rating.getOnRenderChange();
		renderedAttributes.add(renderString(Rating.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onRenderedChange = rating.getOnRenderedChange();
		renderedAttributes.add(renderString(Rating.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSelectedIndexChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onSelectedIndexChange = rating.getOnSelectedIndexChange();
		renderedAttributes.add(renderString(Rating.ON_SELECTED_INDEX_CHANGE, onSelectedIndexChange));
	}

	protected void renderOnShowTitleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onShowTitleChange = rating.getOnShowTitleChange();
		renderedAttributes.add(renderString(Rating.ON_SHOW_TITLE_CHANGE, onShowTitleChange));
	}

	protected void renderOnSizeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onSizeChange = rating.getOnSizeChange();
		renderedAttributes.add(renderString(Rating.ON_SIZE_CHANGE, onSizeChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onSrcNodeChange = rating.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Rating.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onStringsChange = rating.getOnStringsChange();
		renderedAttributes.add(renderString(Rating.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onTabIndexChange = rating.getOnTabIndexChange();
		renderedAttributes.add(renderString(Rating.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTitleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onTitleChange = rating.getOnTitleChange();
		renderedAttributes.add(renderString(Rating.ON_TITLE_CHANGE, onTitleChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onUseARIAChange = rating.getOnUseARIAChange();
		renderedAttributes.add(renderString(Rating.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnValueChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onValueChange = rating.getOnValueChange();
		renderedAttributes.add(renderString(Rating.ON_VALUE_CHANGE, onValueChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onVisibleChange = rating.getOnVisibleChange();
		renderedAttributes.add(renderString(Rating.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Rating rating) throws IOException {
		java.lang.String onWidthChange = rating.getOnWidthChange();
		renderedAttributes.add(renderString(Rating.ON_WIDTH_CHANGE, onWidthChange));
	}

}