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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, thumbRating);
		renderAfterCanResetChange(renderedAfterEvents, thumbRating);
		renderAfterContentBoxChange(renderedAfterEvents, thumbRating);
		renderAfterCssClassChange(renderedAfterEvents, thumbRating);
		renderAfterCssClassesChange(renderedAfterEvents, thumbRating);
		renderAfterDefaultSelectedChange(renderedAfterEvents, thumbRating);
		renderAfterDestroyedChange(renderedAfterEvents, thumbRating);
		renderAfterDisabledChange(renderedAfterEvents, thumbRating);
		renderAfterElementsChange(renderedAfterEvents, thumbRating);
		renderAfterFocusedChange(renderedAfterEvents, thumbRating);
		renderAfterHeightChange(renderedAfterEvents, thumbRating);
		renderAfterHiddenInputChange(renderedAfterEvents, thumbRating);
		renderAfterHideClassChange(renderedAfterEvents, thumbRating);
		renderAfterIdChange(renderedAfterEvents, thumbRating);
		renderAfterInitializedChange(renderedAfterEvents, thumbRating);
		renderAfterInputNameChange(renderedAfterEvents, thumbRating);
		renderAfterLabelChange(renderedAfterEvents, thumbRating);
		renderAfterLabelNodeChange(renderedAfterEvents, thumbRating);
		renderAfterLocaleChange(renderedAfterEvents, thumbRating);
		renderAfterRenderChange(renderedAfterEvents, thumbRating);
		renderAfterRenderedChange(renderedAfterEvents, thumbRating);
		renderAfterSelectedIndexChange(renderedAfterEvents, thumbRating);
		renderAfterShowTitleChange(renderedAfterEvents, thumbRating);
		renderAfterSizeChange(renderedAfterEvents, thumbRating);
		renderAfterSrcNodeChange(renderedAfterEvents, thumbRating);
		renderAfterStringsChange(renderedAfterEvents, thumbRating);
		renderAfterTabIndexChange(renderedAfterEvents, thumbRating);
		renderAfterTitleChange(renderedAfterEvents, thumbRating);
		renderAfterUseARIAChange(renderedAfterEvents, thumbRating);
		renderAfterValueChange(renderedAfterEvents, thumbRating);
		renderAfterVisibleChange(renderedAfterEvents, thumbRating);
		renderAfterWidthChange(renderedAfterEvents, thumbRating);

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

		renderOnBoundingBoxChange(renderedOnEvents, thumbRating);
		renderOnCanResetChange(renderedOnEvents, thumbRating);
		renderOnContentBoxChange(renderedOnEvents, thumbRating);
		renderOnCssClassChange(renderedOnEvents, thumbRating);
		renderOnCssClassesChange(renderedOnEvents, thumbRating);
		renderOnDefaultSelectedChange(renderedOnEvents, thumbRating);
		renderOnDestroyedChange(renderedOnEvents, thumbRating);
		renderOnDisabledChange(renderedOnEvents, thumbRating);
		renderOnElementsChange(renderedOnEvents, thumbRating);
		renderOnFocusedChange(renderedOnEvents, thumbRating);
		renderOnHeightChange(renderedOnEvents, thumbRating);
		renderOnHiddenInputChange(renderedOnEvents, thumbRating);
		renderOnHideClassChange(renderedOnEvents, thumbRating);
		renderOnIdChange(renderedOnEvents, thumbRating);
		renderOnInitializedChange(renderedOnEvents, thumbRating);
		renderOnInputNameChange(renderedOnEvents, thumbRating);
		renderOnLabelChange(renderedOnEvents, thumbRating);
		renderOnLabelNodeChange(renderedOnEvents, thumbRating);
		renderOnLocaleChange(renderedOnEvents, thumbRating);
		renderOnRenderChange(renderedOnEvents, thumbRating);
		renderOnRenderedChange(renderedOnEvents, thumbRating);
		renderOnSelectedIndexChange(renderedOnEvents, thumbRating);
		renderOnShowTitleChange(renderedOnEvents, thumbRating);
		renderOnSizeChange(renderedOnEvents, thumbRating);
		renderOnSrcNodeChange(renderedOnEvents, thumbRating);
		renderOnStringsChange(renderedOnEvents, thumbRating);
		renderOnTabIndexChange(renderedOnEvents, thumbRating);
		renderOnTitleChange(renderedOnEvents, thumbRating);
		renderOnUseARIAChange(renderedOnEvents, thumbRating);
		renderOnValueChange(renderedOnEvents, thumbRating);
		renderOnVisibleChange(renderedOnEvents, thumbRating);
		renderOnWidthChange(renderedOnEvents, thumbRating);

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

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterBoundingBoxChange = thumbRating.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCanResetChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterCanResetChange = thumbRating.getAfterCanResetChange();

		if (afterCanResetChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_CAN_RESET_CHANGE, afterCanResetChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterContentBoxChange = thumbRating.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterCssClassChange = thumbRating.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterCssClassesChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterCssClassesChange = thumbRating.getAfterCssClassesChange();

		if (afterCssClassesChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_CSS_CLASSES_CHANGE, afterCssClassesChange));
		}
	}

	protected void renderAfterDefaultSelectedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterDefaultSelectedChange = thumbRating.getAfterDefaultSelectedChange();

		if (afterDefaultSelectedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_DEFAULT_SELECTED_CHANGE, afterDefaultSelectedChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterDestroyedChange = thumbRating.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterDisabledChange = thumbRating.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterElementsChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterElementsChange = thumbRating.getAfterElementsChange();

		if (afterElementsChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_ELEMENTS_CHANGE, afterElementsChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterFocusedChange = thumbRating.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterHeightChange = thumbRating.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHiddenInputChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterHiddenInputChange = thumbRating.getAfterHiddenInputChange();

		if (afterHiddenInputChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_HIDDEN_INPUT_CHANGE, afterHiddenInputChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterHideClassChange = thumbRating.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterIdChange = thumbRating.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterInitializedChange = thumbRating.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterInputNameChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterInputNameChange = thumbRating.getAfterInputNameChange();

		if (afterInputNameChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_INPUT_NAME_CHANGE, afterInputNameChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterLabelChange = thumbRating.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterLabelNodeChange = thumbRating.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterLocaleChange = thumbRating.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterRenderChange = thumbRating.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterRenderedChange = thumbRating.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSelectedIndexChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterSelectedIndexChange = thumbRating.getAfterSelectedIndexChange();

		if (afterSelectedIndexChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_SELECTED_INDEX_CHANGE, afterSelectedIndexChange));
		}
	}

	protected void renderAfterShowTitleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterShowTitleChange = thumbRating.getAfterShowTitleChange();

		if (afterShowTitleChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_SHOW_TITLE_CHANGE, afterShowTitleChange));
		}
	}

	protected void renderAfterSizeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterSizeChange = thumbRating.getAfterSizeChange();

		if (afterSizeChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_SIZE_CHANGE, afterSizeChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterSrcNodeChange = thumbRating.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterStringsChange = thumbRating.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterTabIndexChange = thumbRating.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTitleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterTitleChange = thumbRating.getAfterTitleChange();

		if (afterTitleChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_TITLE_CHANGE, afterTitleChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterUseARIAChange = thumbRating.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterValueChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterValueChange = thumbRating.getAfterValueChange();

		if (afterValueChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_VALUE_CHANGE, afterValueChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterVisibleChange = thumbRating.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String afterWidthChange = thumbRating.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(ThumbRating.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onBoundingBoxChange = thumbRating.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCanResetChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onCanResetChange = thumbRating.getOnCanResetChange();

		if (onCanResetChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_CAN_RESET_CHANGE, onCanResetChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onContentBoxChange = thumbRating.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onCssClassChange = thumbRating.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnCssClassesChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onCssClassesChange = thumbRating.getOnCssClassesChange();

		if (onCssClassesChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_CSS_CLASSES_CHANGE, onCssClassesChange));
		}
	}

	protected void renderOnDefaultSelectedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onDefaultSelectedChange = thumbRating.getOnDefaultSelectedChange();

		if (onDefaultSelectedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_DEFAULT_SELECTED_CHANGE, onDefaultSelectedChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onDestroyedChange = thumbRating.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onDisabledChange = thumbRating.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnElementsChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onElementsChange = thumbRating.getOnElementsChange();

		if (onElementsChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_ELEMENTS_CHANGE, onElementsChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onFocusedChange = thumbRating.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onHeightChange = thumbRating.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHiddenInputChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onHiddenInputChange = thumbRating.getOnHiddenInputChange();

		if (onHiddenInputChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_HIDDEN_INPUT_CHANGE, onHiddenInputChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onHideClassChange = thumbRating.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onIdChange = thumbRating.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onInitializedChange = thumbRating.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnInputNameChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onInputNameChange = thumbRating.getOnInputNameChange();

		if (onInputNameChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_INPUT_NAME_CHANGE, onInputNameChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onLabelChange = thumbRating.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onLabelNodeChange = thumbRating.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onLocaleChange = thumbRating.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onRenderChange = thumbRating.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onRenderedChange = thumbRating.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSelectedIndexChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onSelectedIndexChange = thumbRating.getOnSelectedIndexChange();

		if (onSelectedIndexChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_SELECTED_INDEX_CHANGE, onSelectedIndexChange));
		}
	}

	protected void renderOnShowTitleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onShowTitleChange = thumbRating.getOnShowTitleChange();

		if (onShowTitleChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_SHOW_TITLE_CHANGE, onShowTitleChange));
		}
	}

	protected void renderOnSizeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onSizeChange = thumbRating.getOnSizeChange();

		if (onSizeChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_SIZE_CHANGE, onSizeChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onSrcNodeChange = thumbRating.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onStringsChange = thumbRating.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onTabIndexChange = thumbRating.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTitleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onTitleChange = thumbRating.getOnTitleChange();

		if (onTitleChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_TITLE_CHANGE, onTitleChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onUseARIAChange = thumbRating.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnValueChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onValueChange = thumbRating.getOnValueChange();

		if (onValueChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_VALUE_CHANGE, onValueChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onVisibleChange = thumbRating.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ThumbRating thumbRating) throws IOException {
		java.lang.String onWidthChange = thumbRating.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(ThumbRating.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}