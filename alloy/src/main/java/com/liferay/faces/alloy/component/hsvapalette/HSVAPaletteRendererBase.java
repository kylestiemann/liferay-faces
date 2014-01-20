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

		if (hSVAPalette.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getContentBox() != null) {
			renderContentBox(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getControls() != null) {
			renderControls(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getDisabled() != null) {
			renderDisabled(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getFieldValidator() != null) {
			renderFieldValidator(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getFocused() != null) {
			renderFocused(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getHeight() != null) {
			renderHeight(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getHSVAPaletteId() != null) {
			renderHSVAPaletteId(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getInitialized() != null) {
			renderInitialized(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getHSVAPaletteLocale() != null) {
			renderHSVAPaletteLocale(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getRender() != null) {
			renderRender(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getRendered() != null) {
			renderRendered(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getSelected() != null) {
			renderSelected(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getStrings() != null) {
			renderStrings(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getVisible() != null) {
			renderVisible(renderedAttributes, hSVAPalette);
		}
		
		if (hSVAPalette.getWidth() != null) {
			renderWidth(renderedAttributes, hSVAPalette);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (hSVAPalette.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterControlsChange() != null) {
			renderAfterControlsChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterFieldValidatorChange() != null) {
			renderAfterFieldValidatorChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, hSVAPalette);
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

		if (hSVAPalette.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnControlsChange() != null) {
			renderOnControlsChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnFieldValidatorChange() != null) {
			renderOnFieldValidatorChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, hSVAPalette);
		}
		
		if (hSVAPalette.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, hSVAPalette);
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

	protected void renderBoundingBox(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String boundingBox = hSVAPalette.getBoundingBox();
		renderedAttributes.add(renderString(HSVAPalette.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String contentBox = hSVAPalette.getContentBox();
		renderedAttributes.add(renderString(HSVAPalette.CONTENT_BOX, contentBox));
	}

	protected void renderControls(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean controls = hSVAPalette.getControls();
		renderedAttributes.add(renderBoolean(HSVAPalette.CONTROLS, controls));
	}

	protected void renderDestroyed(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean destroyed = hSVAPalette.getDestroyed();
		renderedAttributes.add(renderBoolean(HSVAPalette.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean disabled = hSVAPalette.getDisabled();
		renderedAttributes.add(renderBoolean(HSVAPalette.DISABLED, disabled));
	}

	protected void renderFieldValidator(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object fieldValidator = hSVAPalette.getFieldValidator();
		renderedAttributes.add(renderObject(HSVAPalette.FIELD_VALIDATOR, fieldValidator));
	}

	protected void renderFocused(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean focused = hSVAPalette.getFocused();
		renderedAttributes.add(renderBoolean(HSVAPalette.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object height = hSVAPalette.getHeight();
		renderedAttributes.add(renderString(HSVAPalette.HEIGHT, height));
	}

	protected void renderHSVAPaletteId(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String hSVAPaletteId = hSVAPalette.getHSVAPaletteId();
		renderedAttributes.add(renderString(HSVAPalette.H_SVAPALETTE_ID, hSVAPaletteId));
	}

	protected void renderInitialized(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean initialized = hSVAPalette.getInitialized();
		renderedAttributes.add(renderBoolean(HSVAPalette.INITIALIZED, initialized));
	}

	protected void renderHSVAPaletteLocale(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String hSVAPaletteLocale = hSVAPalette.getHSVAPaletteLocale();
		renderedAttributes.add(renderString(HSVAPalette.H_SVAPALETTE_LOCALE, hSVAPaletteLocale));
	}

	protected void renderRender(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object render = hSVAPalette.getRender();
		renderedAttributes.add(renderString(HSVAPalette.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean rendered = hSVAPalette.getRendered();
		renderedAttributes.add(renderBoolean(HSVAPalette.RENDERED, rendered));
	}

	protected void renderSelected(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String selected = hSVAPalette.getSelected();
		renderedAttributes.add(renderString(HSVAPalette.SELECTED, selected));
	}

	protected void renderSrcNode(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String srcNode = hSVAPalette.getSrcNode();
		renderedAttributes.add(renderString(HSVAPalette.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object strings = hSVAPalette.getStrings();
		renderedAttributes.add(renderObject(HSVAPalette.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object tabIndex = hSVAPalette.getTabIndex();
		renderedAttributes.add(renderNumber(HSVAPalette.TAB_INDEX, tabIndex));
	}

	protected void renderVisible(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Boolean visible = hSVAPalette.getVisible();
		renderedAttributes.add(renderBoolean(HSVAPalette.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.Object width = hSVAPalette.getWidth();
		renderedAttributes.add(renderString(HSVAPalette.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterBoundingBoxChange = hSVAPalette.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterContentBoxChange = hSVAPalette.getAfterContentBoxChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterControlsChange = hSVAPalette.getAfterControlsChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_CONTROLS_CHANGE, afterControlsChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterDestroyedChange = hSVAPalette.getAfterDestroyedChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterDisabledChange = hSVAPalette.getAfterDisabledChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFieldValidatorChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterFieldValidatorChange = hSVAPalette.getAfterFieldValidatorChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_FIELD_VALIDATOR_CHANGE, afterFieldValidatorChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterFocusedChange = hSVAPalette.getAfterFocusedChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterHeightChange = hSVAPalette.getAfterHeightChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterIdChange = hSVAPalette.getAfterIdChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterInitializedChange = hSVAPalette.getAfterInitializedChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterLocaleChange = hSVAPalette.getAfterLocaleChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterRenderChange = hSVAPalette.getAfterRenderChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterRenderedChange = hSVAPalette.getAfterRenderedChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterSelectedChange = hSVAPalette.getAfterSelectedChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterSrcNodeChange = hSVAPalette.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterStringsChange = hSVAPalette.getAfterStringsChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterTabIndexChange = hSVAPalette.getAfterTabIndexChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterVisibleChange = hSVAPalette.getAfterVisibleChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String afterWidthChange = hSVAPalette.getAfterWidthChange();
		renderedAttributes.add(renderString(HSVAPalette.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onBoundingBoxChange = hSVAPalette.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onContentBoxChange = hSVAPalette.getOnContentBoxChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onControlsChange = hSVAPalette.getOnControlsChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_CONTROLS_CHANGE, onControlsChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onDestroyedChange = hSVAPalette.getOnDestroyedChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onDisabledChange = hSVAPalette.getOnDisabledChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFieldValidatorChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onFieldValidatorChange = hSVAPalette.getOnFieldValidatorChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_FIELD_VALIDATOR_CHANGE, onFieldValidatorChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onFocusedChange = hSVAPalette.getOnFocusedChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onHeightChange = hSVAPalette.getOnHeightChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onIdChange = hSVAPalette.getOnIdChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onInitializedChange = hSVAPalette.getOnInitializedChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onLocaleChange = hSVAPalette.getOnLocaleChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onRenderChange = hSVAPalette.getOnRenderChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onRenderedChange = hSVAPalette.getOnRenderedChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onSelectedChange = hSVAPalette.getOnSelectedChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onSrcNodeChange = hSVAPalette.getOnSrcNodeChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onStringsChange = hSVAPalette.getOnStringsChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onTabIndexChange = hSVAPalette.getOnTabIndexChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onVisibleChange = hSVAPalette.getOnVisibleChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, HSVAPalette hSVAPalette) throws IOException {
		java.lang.String onWidthChange = hSVAPalette.getOnWidthChange();
		renderedAttributes.add(renderString(HSVAPalette.ON_WIDTH_CHANGE, onWidthChange));
	}

}