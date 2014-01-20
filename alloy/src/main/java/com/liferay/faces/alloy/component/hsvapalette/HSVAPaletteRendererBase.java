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
package com.liferay.faces.alloy.component.hsvapalette;

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
public abstract class HSVAPaletteRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsva-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		HSVAPalette hSVAPalette = (HSVAPalette) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var hSVAPalette = new A.HSVAPalette");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, hSVAPalette);
		renderContentBox(renderedAttributes, hSVAPalette);
		renderControls(renderedAttributes, hSVAPalette);
		renderDestroyed(renderedAttributes, hSVAPalette);
		renderDisabled(renderedAttributes, hSVAPalette);
		renderFieldValidator(renderedAttributes, hSVAPalette);
		renderFocused(renderedAttributes, hSVAPalette);
		renderHeight(renderedAttributes, hSVAPalette);
		renderHSVAPaletteId(renderedAttributes, hSVAPalette);
		renderInitialized(renderedAttributes, hSVAPalette);
		renderHSVAPaletteLocale(renderedAttributes, hSVAPalette);
		renderRender(renderedAttributes, hSVAPalette);
		renderRendered(renderedAttributes, hSVAPalette);
		renderSelected(renderedAttributes, hSVAPalette);
		renderSrcNode(renderedAttributes, hSVAPalette);
		renderStrings(renderedAttributes, hSVAPalette);
		renderTabIndex(renderedAttributes, hSVAPalette);
		renderVisible(renderedAttributes, hSVAPalette);
		renderWidth(renderedAttributes, hSVAPalette);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, hSVAPalette);
		renderAfterContentBoxChange(renderedAfterEvents, hSVAPalette);
		renderAfterControlsChange(renderedAfterEvents, hSVAPalette);
		renderAfterDestroyedChange(renderedAfterEvents, hSVAPalette);
		renderAfterDisabledChange(renderedAfterEvents, hSVAPalette);
		renderAfterFieldValidatorChange(renderedAfterEvents, hSVAPalette);
		renderAfterFocusedChange(renderedAfterEvents, hSVAPalette);
		renderAfterHeightChange(renderedAfterEvents, hSVAPalette);
		renderAfterIdChange(renderedAfterEvents, hSVAPalette);
		renderAfterInitializedChange(renderedAfterEvents, hSVAPalette);
		renderAfterLocaleChange(renderedAfterEvents, hSVAPalette);
		renderAfterRenderChange(renderedAfterEvents, hSVAPalette);
		renderAfterRenderedChange(renderedAfterEvents, hSVAPalette);
		renderAfterSelectedChange(renderedAfterEvents, hSVAPalette);
		renderAfterSrcNodeChange(renderedAfterEvents, hSVAPalette);
		renderAfterStringsChange(renderedAfterEvents, hSVAPalette);
		renderAfterTabIndexChange(renderedAfterEvents, hSVAPalette);
		renderAfterVisibleChange(renderedAfterEvents, hSVAPalette);
		renderAfterWidthChange(renderedAfterEvents, hSVAPalette);

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

		renderOnBoundingBoxChange(renderedOnEvents, hSVAPalette);
		renderOnContentBoxChange(renderedOnEvents, hSVAPalette);
		renderOnControlsChange(renderedOnEvents, hSVAPalette);
		renderOnDestroyedChange(renderedOnEvents, hSVAPalette);
		renderOnDisabledChange(renderedOnEvents, hSVAPalette);
		renderOnFieldValidatorChange(renderedOnEvents, hSVAPalette);
		renderOnFocusedChange(renderedOnEvents, hSVAPalette);
		renderOnHeightChange(renderedOnEvents, hSVAPalette);
		renderOnIdChange(renderedOnEvents, hSVAPalette);
		renderOnInitializedChange(renderedOnEvents, hSVAPalette);
		renderOnLocaleChange(renderedOnEvents, hSVAPalette);
		renderOnRenderChange(renderedOnEvents, hSVAPalette);
		renderOnRenderedChange(renderedOnEvents, hSVAPalette);
		renderOnSelectedChange(renderedOnEvents, hSVAPalette);
		renderOnSrcNodeChange(renderedOnEvents, hSVAPalette);
		renderOnStringsChange(renderedOnEvents, hSVAPalette);
		renderOnTabIndexChange(renderedOnEvents, hSVAPalette);
		renderOnVisibleChange(renderedOnEvents, hSVAPalette);
		renderOnWidthChange(renderedOnEvents, hSVAPalette);

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

	protected void renderBoundingBox(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String boundingBox = hSVAPalette.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(HSVAPalette.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String contentBox = hSVAPalette.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(HSVAPalette.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControls(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean controls = hSVAPalette.getControls();

		if (controls != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.CONTROLS, controls));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean destroyed = hSVAPalette.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean disabled = hSVAPalette.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.DISABLED, disabled));
		}
	}

	protected void renderFieldValidator(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object fieldValidator = hSVAPalette.getFieldValidator();

		if (fieldValidator != null) {
			renderedAttributes.add(renderObject(HSVAPalette.FIELD_VALIDATOR, fieldValidator));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean focused = hSVAPalette.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object height = hSVAPalette.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(HSVAPalette.HEIGHT, height));
		}
	}

	protected void renderHSVAPaletteId(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String hSVAPaletteId = hSVAPalette.getHSVAPaletteId();

		if (hSVAPaletteId != null) {
			renderedAttributes.add(renderString(HSVAPalette.H_SVAPALETTE_ID, hSVAPaletteId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean initialized = hSVAPalette.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.INITIALIZED, initialized));
		}
	}

	protected void renderHSVAPaletteLocale(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String hSVAPaletteLocale = hSVAPalette.getHSVAPaletteLocale();

		if (hSVAPaletteLocale != null) {
			renderedAttributes.add(renderString(HSVAPalette.H_SVAPALETTE_LOCALE, hSVAPaletteLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object render = hSVAPalette.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(HSVAPalette.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean rendered = hSVAPalette.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.RENDERED, rendered));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String selected = hSVAPalette.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderString(HSVAPalette.SELECTED, selected));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String srcNode = hSVAPalette.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(HSVAPalette.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object strings = hSVAPalette.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(HSVAPalette.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object tabIndex = hSVAPalette.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(HSVAPalette.TAB_INDEX, tabIndex));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean visible = hSVAPalette.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(HSVAPalette.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object width = hSVAPalette.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(HSVAPalette.WIDTH, width));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterBoundingBoxChange = hSVAPalette.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterContentBoxChange = hSVAPalette.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterControlsChange = hSVAPalette.getAfterControlsChange();

		if (afterControlsChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_CONTROLS_CHANGE, afterControlsChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterDestroyedChange = hSVAPalette.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterDisabledChange = hSVAPalette.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFieldValidatorChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterFieldValidatorChange = hSVAPalette.getAfterFieldValidatorChange();

		if (afterFieldValidatorChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_FIELD_VALIDATOR_CHANGE, afterFieldValidatorChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterFocusedChange = hSVAPalette.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterHeightChange = hSVAPalette.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterIdChange = hSVAPalette.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterInitializedChange = hSVAPalette.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterLocaleChange = hSVAPalette.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterRenderChange = hSVAPalette.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterRenderedChange = hSVAPalette.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterSelectedChange = hSVAPalette.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterSrcNodeChange = hSVAPalette.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterStringsChange = hSVAPalette.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterTabIndexChange = hSVAPalette.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterVisibleChange = hSVAPalette.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterWidthChange = hSVAPalette.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onBoundingBoxChange = hSVAPalette.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onContentBoxChange = hSVAPalette.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onControlsChange = hSVAPalette.getOnControlsChange();

		if (onControlsChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_CONTROLS_CHANGE, onControlsChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onDestroyedChange = hSVAPalette.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onDisabledChange = hSVAPalette.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFieldValidatorChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onFieldValidatorChange = hSVAPalette.getOnFieldValidatorChange();

		if (onFieldValidatorChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_FIELD_VALIDATOR_CHANGE, onFieldValidatorChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onFocusedChange = hSVAPalette.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onHeightChange = hSVAPalette.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onIdChange = hSVAPalette.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onInitializedChange = hSVAPalette.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onLocaleChange = hSVAPalette.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onRenderChange = hSVAPalette.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onRenderedChange = hSVAPalette.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onSelectedChange = hSVAPalette.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onSrcNodeChange = hSVAPalette.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onStringsChange = hSVAPalette.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onTabIndexChange = hSVAPalette.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onVisibleChange = hSVAPalette.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onWidthChange = hSVAPalette.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(HSVAPalette.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}