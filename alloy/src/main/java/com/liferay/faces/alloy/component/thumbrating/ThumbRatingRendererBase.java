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

		if (thumbRating.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, thumbRating);
		}

		if (thumbRating.getCanReset() != null) {
			renderCanReset(renderedAttributes, thumbRating);
		}

		if (thumbRating.getContentBox() != null) {
			renderContentBox(renderedAttributes, thumbRating);
		}

		if (thumbRating.getCssClass() != null) {
			renderCssClass(renderedAttributes, thumbRating);
		}

		if (thumbRating.getCssClasses() != null) {
			renderCssClasses(renderedAttributes, thumbRating);
		}

		if (thumbRating.getDefaultSelected() != null) {
			renderDefaultSelected(renderedAttributes, thumbRating);
		}

		if (thumbRating.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, thumbRating);
		}

		if (thumbRating.getDisabled() != null) {
			renderDisabled(renderedAttributes, thumbRating);
		}

		if (thumbRating.getElements() != null) {
			renderElements(renderedAttributes, thumbRating);
		}

		if (thumbRating.getFocused() != null) {
			renderFocused(renderedAttributes, thumbRating);
		}

		if (thumbRating.getHeight() != null) {
			renderHeight(renderedAttributes, thumbRating);
		}

		if (thumbRating.getHiddenInput() != null) {
			renderHiddenInput(renderedAttributes, thumbRating);
		}

		if (thumbRating.getHideClass() != null) {
			renderHideClass(renderedAttributes, thumbRating);
		}

		if (thumbRating.getThumbRatingId() != null) {
			renderThumbRatingId(renderedAttributes, thumbRating);
		}

		if (thumbRating.getInitialized() != null) {
			renderInitialized(renderedAttributes, thumbRating);
		}

		if (thumbRating.getInputName() != null) {
			renderInputName(renderedAttributes, thumbRating);
		}

		if (thumbRating.getLabel() != null) {
			renderLabel(renderedAttributes, thumbRating);
		}

		if (thumbRating.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, thumbRating);
		}

		if (thumbRating.getThumbRatingLocale() != null) {
			renderThumbRatingLocale(renderedAttributes, thumbRating);
		}

		if (thumbRating.getRender() != null) {
			renderRender(renderedAttributes, thumbRating);
		}

		if (thumbRating.getRendered() != null) {
			renderRendered(renderedAttributes, thumbRating);
		}

		if (thumbRating.getSelectedIndex() != null) {
			renderSelectedIndex(renderedAttributes, thumbRating);
		}

		if (thumbRating.getShowTitle() != null) {
			renderShowTitle(renderedAttributes, thumbRating);
		}

		if (thumbRating.getSize() != null) {
			renderSize(renderedAttributes, thumbRating);
		}

		if (thumbRating.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, thumbRating);
		}

		if (thumbRating.getStrings() != null) {
			renderStrings(renderedAttributes, thumbRating);
		}

		if (thumbRating.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, thumbRating);
		}

		if (thumbRating.getTitle() != null) {
			renderTitle(renderedAttributes, thumbRating);
		}

		if (thumbRating.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, thumbRating);
		}

		if (thumbRating.getThumbRatingValue() != null) {
			renderThumbRatingValue(renderedAttributes, thumbRating);
		}

		if (thumbRating.getVisible() != null) {
			renderVisible(renderedAttributes, thumbRating);
		}

		if (thumbRating.getWidth() != null) {
			renderWidth(renderedAttributes, thumbRating);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (thumbRating.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterCanResetChange() != null) {
			renderAfterCanResetChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterCssClassesChange() != null) {
			renderAfterCssClassesChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterDefaultSelectedChange() != null) {
			renderAfterDefaultSelectedChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterElementsChange() != null) {
			renderAfterElementsChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterHiddenInputChange() != null) {
			renderAfterHiddenInputChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterInputNameChange() != null) {
			renderAfterInputNameChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterSelectedIndexChange() != null) {
			renderAfterSelectedIndexChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterShowTitleChange() != null) {
			renderAfterShowTitleChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterSizeChange() != null) {
			renderAfterSizeChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterTitleChange() != null) {
			renderAfterTitleChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterValueChange() != null) {
			renderAfterValueChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, thumbRating);
		}

		if (thumbRating.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, thumbRating);
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

		if (thumbRating.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnCanResetChange() != null) {
			renderOnCanResetChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnCssClassesChange() != null) {
			renderOnCssClassesChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnDefaultSelectedChange() != null) {
			renderOnDefaultSelectedChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnElementsChange() != null) {
			renderOnElementsChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnHiddenInputChange() != null) {
			renderOnHiddenInputChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnInputNameChange() != null) {
			renderOnInputNameChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnSelectedIndexChange() != null) {
			renderOnSelectedIndexChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnShowTitleChange() != null) {
			renderOnShowTitleChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnSizeChange() != null) {
			renderOnSizeChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnTitleChange() != null) {
			renderOnTitleChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnValueChange() != null) {
			renderOnValueChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, thumbRating);
		}

		if (thumbRating.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, thumbRating);
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

	protected void renderBoundingBox(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String boundingBox = thumbRating.getBoundingBox();
		renderedAttributes.add(renderString(ThumbRating.BOUNDING_BOX, boundingBox));
	}

	protected void renderCanReset(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean canReset = thumbRating.getCanReset();
		renderedAttributes.add(renderBoolean(ThumbRating.CAN_RESET, canReset));
	}

	protected void renderContentBox(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String contentBox = thumbRating.getContentBox();
		renderedAttributes.add(renderString(ThumbRating.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String cssClass = thumbRating.getCssClass();
		renderedAttributes.add(renderString(ThumbRating.CSS_CLASS, cssClass));
	}

	protected void renderCssClasses(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object cssClasses = thumbRating.getCssClasses();
		renderedAttributes.add(renderObject(ThumbRating.CSS_CLASSES, cssClasses));
	}

	protected void renderDefaultSelected(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object defaultSelected = thumbRating.getDefaultSelected();
		renderedAttributes.add(renderNumber(ThumbRating.DEFAULT_SELECTED, defaultSelected));
	}

	protected void renderDestroyed(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean destroyed = thumbRating.getDestroyed();
		renderedAttributes.add(renderBoolean(ThumbRating.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean disabled = thumbRating.getDisabled();
		renderedAttributes.add(renderBoolean(ThumbRating.DISABLED, disabled));
	}

	protected void renderElements(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object elements = thumbRating.getElements();
		renderedAttributes.add(renderString(ThumbRating.ELEMENTS, elements));
	}

	protected void renderFocused(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean focused = thumbRating.getFocused();
		renderedAttributes.add(renderBoolean(ThumbRating.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object height = thumbRating.getHeight();
		renderedAttributes.add(renderString(ThumbRating.HEIGHT, height));
	}

	protected void renderHiddenInput(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object hiddenInput = thumbRating.getHiddenInput();
		renderedAttributes.add(renderString(ThumbRating.HIDDEN_INPUT, hiddenInput));
	}

	protected void renderHideClass(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String hideClass = thumbRating.getHideClass();
		renderedAttributes.add(renderString(ThumbRating.HIDE_CLASS, hideClass));
	}

	protected void renderThumbRatingId(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String thumbRatingId = thumbRating.getThumbRatingId();
		renderedAttributes.add(renderString(ThumbRating.THUMB_RATING_ID, thumbRatingId));
	}

	protected void renderInitialized(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean initialized = thumbRating.getInitialized();
		renderedAttributes.add(renderBoolean(ThumbRating.INITIALIZED, initialized));
	}

	protected void renderInputName(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String inputName = thumbRating.getInputName();
		renderedAttributes.add(renderString(ThumbRating.INPUT_NAME, inputName));
	}

	protected void renderLabel(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String label = thumbRating.getLabel();
		renderedAttributes.add(renderString(ThumbRating.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String labelNode = thumbRating.getLabelNode();
		renderedAttributes.add(renderString(ThumbRating.LABEL_NODE, labelNode));
	}

	protected void renderThumbRatingLocale(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String thumbRatingLocale = thumbRating.getThumbRatingLocale();
		renderedAttributes.add(renderString(ThumbRating.THUMB_RATING_LOCALE, thumbRatingLocale));
	}

	protected void renderRender(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object render = thumbRating.getRender();
		renderedAttributes.add(renderString(ThumbRating.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean rendered = thumbRating.getRendered();
		renderedAttributes.add(renderBoolean(ThumbRating.RENDERED, rendered));
	}

	protected void renderSelectedIndex(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object selectedIndex = thumbRating.getSelectedIndex();
		renderedAttributes.add(renderNumber(ThumbRating.SELECTED_INDEX, selectedIndex));
	}

	protected void renderShowTitle(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean showTitle = thumbRating.getShowTitle();
		renderedAttributes.add(renderBoolean(ThumbRating.SHOW_TITLE, showTitle));
	}

	protected void renderSize(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object size = thumbRating.getSize();
		renderedAttributes.add(renderNumber(ThumbRating.SIZE, size));
	}

	protected void renderSrcNode(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String srcNode = thumbRating.getSrcNode();
		renderedAttributes.add(renderString(ThumbRating.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object strings = thumbRating.getStrings();
		renderedAttributes.add(renderObject(ThumbRating.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object tabIndex = thumbRating.getTabIndex();
		renderedAttributes.add(renderNumber(ThumbRating.TAB_INDEX, tabIndex));
	}

	protected void renderTitle(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String title = thumbRating.getTitle();
		renderedAttributes.add(renderString(ThumbRating.TITLE, title));
	}

	protected void renderUseARIA(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean useARIA = thumbRating.getUseARIA();
		renderedAttributes.add(renderBoolean(ThumbRating.USE_ARIA, useARIA));
	}

	protected void renderThumbRatingValue(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String thumbRatingValue = thumbRating.getThumbRatingValue();
		renderedAttributes.add(renderString(ThumbRating.THUMB_RATING_VALUE, thumbRatingValue));
	}

	protected void renderVisible(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Boolean visible = thumbRating.getVisible();
		renderedAttributes.add(renderBoolean(ThumbRating.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.Object width = thumbRating.getWidth();
		renderedAttributes.add(renderString(ThumbRating.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterBoundingBoxChange = thumbRating.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCanResetChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterCanResetChange = thumbRating.getAfterCanResetChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_CAN_RESET_CHANGE, afterCanResetChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterContentBoxChange = thumbRating.getAfterContentBoxChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterCssClassChange = thumbRating.getAfterCssClassChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterCssClassesChange = thumbRating.getAfterCssClassesChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
	}

	protected void renderAfterDefaultSelectedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterDefaultSelectedChange = thumbRating.getAfterDefaultSelectedChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_DEFAULT_SELECTED_CHANGE, afterDefaultSelectedChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterDestroyedChange = thumbRating.getAfterDestroyedChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterDisabledChange = thumbRating.getAfterDisabledChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterElementsChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterElementsChange = thumbRating.getAfterElementsChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_ELEMENTS_CHANGE, afterElementsChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterFocusedChange = thumbRating.getAfterFocusedChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterHeightChange = thumbRating.getAfterHeightChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHiddenInputChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterHiddenInputChange = thumbRating.getAfterHiddenInputChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_HIDDEN_INPUT_CHANGE, afterHiddenInputChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterHideClassChange = thumbRating.getAfterHideClassChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterIdChange = thumbRating.getAfterIdChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterInitializedChange = thumbRating.getAfterInitializedChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterInputNameChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterInputNameChange = thumbRating.getAfterInputNameChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_INPUT_NAME_CHANGE, afterInputNameChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterLabelChange = thumbRating.getAfterLabelChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterLabelNodeChange = thumbRating.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterLocaleChange = thumbRating.getAfterLocaleChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterRenderChange = thumbRating.getAfterRenderChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterRenderedChange = thumbRating.getAfterRenderedChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSelectedIndexChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterSelectedIndexChange = thumbRating.getAfterSelectedIndexChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_SELECTED_INDEX_CHANGE, afterSelectedIndexChange));
	}

	protected void renderAfterShowTitleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterShowTitleChange = thumbRating.getAfterShowTitleChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_SHOW_TITLE_CHANGE, afterShowTitleChange));
	}

	protected void renderAfterSizeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterSizeChange = thumbRating.getAfterSizeChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_SIZE_CHANGE, afterSizeChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterSrcNodeChange = thumbRating.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterStringsChange = thumbRating.getAfterStringsChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterTabIndexChange = thumbRating.getAfterTabIndexChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTitleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterTitleChange = thumbRating.getAfterTitleChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_TITLE_CHANGE, afterTitleChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterUseARIAChange = thumbRating.getAfterUseARIAChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterValueChange = thumbRating.getAfterValueChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_VALUE_CHANGE, afterValueChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterVisibleChange = thumbRating.getAfterVisibleChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterWidthChange = thumbRating.getAfterWidthChange();
		renderedAttributes.add(renderString(ThumbRating.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onBoundingBoxChange = thumbRating.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(ThumbRating.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCanResetChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onCanResetChange = thumbRating.getOnCanResetChange();
		renderedAttributes.add(renderString(ThumbRating.ON_CAN_RESET_CHANGE, onCanResetChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onContentBoxChange = thumbRating.getOnContentBoxChange();
		renderedAttributes.add(renderString(ThumbRating.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onCssClassChange = thumbRating.getOnCssClassChange();
		renderedAttributes.add(renderString(ThumbRating.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onCssClassesChange = thumbRating.getOnCssClassesChange();
		renderedAttributes.add(renderString(ThumbRating.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
	}

	protected void renderOnDefaultSelectedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onDefaultSelectedChange = thumbRating.getOnDefaultSelectedChange();
		renderedAttributes.add(renderString(ThumbRating.ON_DEFAULT_SELECTED_CHANGE, onDefaultSelectedChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onDestroyedChange = thumbRating.getOnDestroyedChange();
		renderedAttributes.add(renderString(ThumbRating.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onDisabledChange = thumbRating.getOnDisabledChange();
		renderedAttributes.add(renderString(ThumbRating.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnElementsChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onElementsChange = thumbRating.getOnElementsChange();
		renderedAttributes.add(renderString(ThumbRating.ON_ELEMENTS_CHANGE, onElementsChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onFocusedChange = thumbRating.getOnFocusedChange();
		renderedAttributes.add(renderString(ThumbRating.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onHeightChange = thumbRating.getOnHeightChange();
		renderedAttributes.add(renderString(ThumbRating.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHiddenInputChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onHiddenInputChange = thumbRating.getOnHiddenInputChange();
		renderedAttributes.add(renderString(ThumbRating.ON_HIDDEN_INPUT_CHANGE, onHiddenInputChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onHideClassChange = thumbRating.getOnHideClassChange();
		renderedAttributes.add(renderString(ThumbRating.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onIdChange = thumbRating.getOnIdChange();
		renderedAttributes.add(renderString(ThumbRating.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onInitializedChange = thumbRating.getOnInitializedChange();
		renderedAttributes.add(renderString(ThumbRating.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnInputNameChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onInputNameChange = thumbRating.getOnInputNameChange();
		renderedAttributes.add(renderString(ThumbRating.ON_INPUT_NAME_CHANGE, onInputNameChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onLabelChange = thumbRating.getOnLabelChange();
		renderedAttributes.add(renderString(ThumbRating.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onLabelNodeChange = thumbRating.getOnLabelNodeChange();
		renderedAttributes.add(renderString(ThumbRating.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onLocaleChange = thumbRating.getOnLocaleChange();
		renderedAttributes.add(renderString(ThumbRating.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onRenderChange = thumbRating.getOnRenderChange();
		renderedAttributes.add(renderString(ThumbRating.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onRenderedChange = thumbRating.getOnRenderedChange();
		renderedAttributes.add(renderString(ThumbRating.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSelectedIndexChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onSelectedIndexChange = thumbRating.getOnSelectedIndexChange();
		renderedAttributes.add(renderString(ThumbRating.ON_SELECTED_INDEX_CHANGE, onSelectedIndexChange));
	}

	protected void renderOnShowTitleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onShowTitleChange = thumbRating.getOnShowTitleChange();
		renderedAttributes.add(renderString(ThumbRating.ON_SHOW_TITLE_CHANGE, onShowTitleChange));
	}

	protected void renderOnSizeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onSizeChange = thumbRating.getOnSizeChange();
		renderedAttributes.add(renderString(ThumbRating.ON_SIZE_CHANGE, onSizeChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onSrcNodeChange = thumbRating.getOnSrcNodeChange();
		renderedAttributes.add(renderString(ThumbRating.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onStringsChange = thumbRating.getOnStringsChange();
		renderedAttributes.add(renderString(ThumbRating.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onTabIndexChange = thumbRating.getOnTabIndexChange();
		renderedAttributes.add(renderString(ThumbRating.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTitleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onTitleChange = thumbRating.getOnTitleChange();
		renderedAttributes.add(renderString(ThumbRating.ON_TITLE_CHANGE, onTitleChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onUseARIAChange = thumbRating.getOnUseARIAChange();
		renderedAttributes.add(renderString(ThumbRating.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnValueChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onValueChange = thumbRating.getOnValueChange();
		renderedAttributes.add(renderString(ThumbRating.ON_VALUE_CHANGE, onValueChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onVisibleChange = thumbRating.getOnVisibleChange();
		renderedAttributes.add(renderString(ThumbRating.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onWidthChange = thumbRating.getOnWidthChange();
		renderedAttributes.add(renderString(ThumbRating.ON_WIDTH_CHANGE, onWidthChange));
	}

}