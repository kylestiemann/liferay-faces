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
package com.liferay.faces.alloy.component.hsvpalette;

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
public abstract class HSVPaletteRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-hsv-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		HSVPalette hSVPalette = (HSVPalette) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var hSVPalette = new A.HSVPalette");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, hSVPalette);
		renderContentBox(renderedAttributes, hSVPalette);
		renderControls(renderedAttributes, hSVPalette);
		renderDestroyed(renderedAttributes, hSVPalette);
		renderDisabled(renderedAttributes, hSVPalette);
		renderFieldValidator(renderedAttributes, hSVPalette);
		renderFocused(renderedAttributes, hSVPalette);
		renderHeight(renderedAttributes, hSVPalette);
		renderHSVPaletteId(renderedAttributes, hSVPalette);
		renderInitialized(renderedAttributes, hSVPalette);
		renderHSVPaletteLocale(renderedAttributes, hSVPalette);
		renderRender(renderedAttributes, hSVPalette);
		renderRendered(renderedAttributes, hSVPalette);
		renderSelected(renderedAttributes, hSVPalette);
		renderSrcNode(renderedAttributes, hSVPalette);
		renderStrings(renderedAttributes, hSVPalette);
		renderTabIndex(renderedAttributes, hSVPalette);
		renderVisible(renderedAttributes, hSVPalette);
		renderWidth(renderedAttributes, hSVPalette);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, hSVPalette);
		renderAfterContentBoxChange(renderedAfterEvents, hSVPalette);
		renderAfterControlsChange(renderedAfterEvents, hSVPalette);
		renderAfterDestroyedChange(renderedAfterEvents, hSVPalette);
		renderAfterDisabledChange(renderedAfterEvents, hSVPalette);
		renderAfterFieldValidatorChange(renderedAfterEvents, hSVPalette);
		renderAfterFocusedChange(renderedAfterEvents, hSVPalette);
		renderAfterHeightChange(renderedAfterEvents, hSVPalette);
		renderAfterIdChange(renderedAfterEvents, hSVPalette);
		renderAfterInitializedChange(renderedAfterEvents, hSVPalette);
		renderAfterLocaleChange(renderedAfterEvents, hSVPalette);
		renderAfterRenderChange(renderedAfterEvents, hSVPalette);
		renderAfterRenderedChange(renderedAfterEvents, hSVPalette);
		renderAfterSelectedChange(renderedAfterEvents, hSVPalette);
		renderAfterSrcNodeChange(renderedAfterEvents, hSVPalette);
		renderAfterStringsChange(renderedAfterEvents, hSVPalette);
		renderAfterTabIndexChange(renderedAfterEvents, hSVPalette);
		renderAfterVisibleChange(renderedAfterEvents, hSVPalette);
		renderAfterWidthChange(renderedAfterEvents, hSVPalette);

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

		renderOnBoundingBoxChange(renderedOnEvents, hSVPalette);
		renderOnContentBoxChange(renderedOnEvents, hSVPalette);
		renderOnControlsChange(renderedOnEvents, hSVPalette);
		renderOnDestroyedChange(renderedOnEvents, hSVPalette);
		renderOnDisabledChange(renderedOnEvents, hSVPalette);
		renderOnFieldValidatorChange(renderedOnEvents, hSVPalette);
		renderOnFocusedChange(renderedOnEvents, hSVPalette);
		renderOnHeightChange(renderedOnEvents, hSVPalette);
		renderOnIdChange(renderedOnEvents, hSVPalette);
		renderOnInitializedChange(renderedOnEvents, hSVPalette);
		renderOnLocaleChange(renderedOnEvents, hSVPalette);
		renderOnRenderChange(renderedOnEvents, hSVPalette);
		renderOnRenderedChange(renderedOnEvents, hSVPalette);
		renderOnSelectedChange(renderedOnEvents, hSVPalette);
		renderOnSrcNodeChange(renderedOnEvents, hSVPalette);
		renderOnStringsChange(renderedOnEvents, hSVPalette);
		renderOnTabIndexChange(renderedOnEvents, hSVPalette);
		renderOnVisibleChange(renderedOnEvents, hSVPalette);
		renderOnWidthChange(renderedOnEvents, hSVPalette);

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

	protected void renderBoundingBox(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String boundingBox = hSVPalette.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(HSVPalette.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String contentBox = hSVPalette.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(HSVPalette.CONTENT_BOX, contentBox));
		}
	}

	protected void renderControls(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean controls = hSVPalette.getControls();

		if (controls != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.CONTROLS, controls));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean destroyed = hSVPalette.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean disabled = hSVPalette.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.DISABLED, disabled));
		}
	}

	protected void renderFieldValidator(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object fieldValidator = hSVPalette.getFieldValidator();

		if (fieldValidator != null) {
			renderedAttributes.add(renderObject(HSVPalette.FIELD_VALIDATOR, fieldValidator));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean focused = hSVPalette.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.FOCUSED, focused));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object height = hSVPalette.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(HSVPalette.HEIGHT, height));
		}
	}

	protected void renderHSVPaletteId(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String hSVPaletteId = hSVPalette.getHSVPaletteId();

		if (hSVPaletteId != null) {
			renderedAttributes.add(renderString(HSVPalette.H_SVPALETTE_ID, hSVPaletteId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean initialized = hSVPalette.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.INITIALIZED, initialized));
		}
	}

	protected void renderHSVPaletteLocale(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String hSVPaletteLocale = hSVPalette.getHSVPaletteLocale();

		if (hSVPaletteLocale != null) {
			renderedAttributes.add(renderString(HSVPalette.H_SVPALETTE_LOCALE, hSVPaletteLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object render = hSVPalette.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(HSVPalette.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean rendered = hSVPalette.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.RENDERED, rendered));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String selected = hSVPalette.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderString(HSVPalette.SELECTED, selected));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String srcNode = hSVPalette.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(HSVPalette.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object strings = hSVPalette.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(HSVPalette.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object tabIndex = hSVPalette.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(HSVPalette.TAB_INDEX, tabIndex));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean visible = hSVPalette.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(HSVPalette.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object width = hSVPalette.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(HSVPalette.WIDTH, width));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterBoundingBoxChange = hSVPalette.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterContentBoxChange = hSVPalette.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterControlsChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterControlsChange = hSVPalette.getAfterControlsChange();

		if (afterControlsChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_CONTROLS_CHANGE, afterControlsChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterDestroyedChange = hSVPalette.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterDisabledChange = hSVPalette.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFieldValidatorChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterFieldValidatorChange = hSVPalette.getAfterFieldValidatorChange();

		if (afterFieldValidatorChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_FIELD_VALIDATOR_CHANGE, afterFieldValidatorChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterFocusedChange = hSVPalette.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterHeightChange = hSVPalette.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterIdChange = hSVPalette.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterInitializedChange = hSVPalette.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterLocaleChange = hSVPalette.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterRenderChange = hSVPalette.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterRenderedChange = hSVPalette.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterSelectedChange = hSVPalette.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterSrcNodeChange = hSVPalette.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterStringsChange = hSVPalette.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterTabIndexChange = hSVPalette.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterVisibleChange = hSVPalette.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterWidthChange = hSVPalette.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(HSVPalette.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onBoundingBoxChange = hSVPalette.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onContentBoxChange = hSVPalette.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnControlsChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onControlsChange = hSVPalette.getOnControlsChange();

		if (onControlsChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_CONTROLS_CHANGE, onControlsChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onDestroyedChange = hSVPalette.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onDisabledChange = hSVPalette.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFieldValidatorChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onFieldValidatorChange = hSVPalette.getOnFieldValidatorChange();

		if (onFieldValidatorChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_FIELD_VALIDATOR_CHANGE, onFieldValidatorChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onFocusedChange = hSVPalette.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onHeightChange = hSVPalette.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onIdChange = hSVPalette.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onInitializedChange = hSVPalette.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onLocaleChange = hSVPalette.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onRenderChange = hSVPalette.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onRenderedChange = hSVPalette.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onSelectedChange = hSVPalette.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onSrcNodeChange = hSVPalette.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onStringsChange = hSVPalette.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onTabIndexChange = hSVPalette.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onVisibleChange = hSVPalette.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onWidthChange = hSVPalette.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(HSVPalette.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}