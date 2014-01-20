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

		if (hSVPalette.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getContentBox() != null) {
			renderContentBox(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getControls() != null) {
			renderControls(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getDisabled() != null) {
			renderDisabled(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getFieldValidator() != null) {
			renderFieldValidator(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getFocused() != null) {
			renderFocused(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getHeight() != null) {
			renderHeight(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getHSVPaletteId() != null) {
			renderHSVPaletteId(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getInitialized() != null) {
			renderInitialized(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getHSVPaletteLocale() != null) {
			renderHSVPaletteLocale(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getRender() != null) {
			renderRender(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getRendered() != null) {
			renderRendered(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getSelected() != null) {
			renderSelected(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getStrings() != null) {
			renderStrings(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getVisible() != null) {
			renderVisible(renderedAttributes, hSVPalette);
		}
		
		if (hSVPalette.getWidth() != null) {
			renderWidth(renderedAttributes, hSVPalette);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (hSVPalette.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterControlsChange() != null) {
			renderAfterControlsChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterFieldValidatorChange() != null) {
			renderAfterFieldValidatorChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, hSVPalette);
		}
		
		if (hSVPalette.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, hSVPalette);
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

		if (hSVPalette.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnControlsChange() != null) {
			renderOnControlsChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnFieldValidatorChange() != null) {
			renderOnFieldValidatorChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, hSVPalette);
		}
		
		if (hSVPalette.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, hSVPalette);
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

	protected void renderBoundingBox(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String boundingBox = hSVPalette.getBoundingBox();
		renderedAttributes.add(renderString(HSVPalette.BOUNDING_BOX, boundingBox));
	}

	protected void renderContentBox(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String contentBox = hSVPalette.getContentBox();
		renderedAttributes.add(renderString(HSVPalette.CONTENT_BOX, contentBox));
	}

	protected void renderControls(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean controls = hSVPalette.getControls();
		renderedAttributes.add(renderBoolean(HSVPalette.CONTROLS, controls));
	}

	protected void renderDestroyed(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean destroyed = hSVPalette.getDestroyed();
		renderedAttributes.add(renderBoolean(HSVPalette.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean disabled = hSVPalette.getDisabled();
		renderedAttributes.add(renderBoolean(HSVPalette.DISABLED, disabled));
	}

	protected void renderFieldValidator(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object fieldValidator = hSVPalette.getFieldValidator();
		renderedAttributes.add(renderObject(HSVPalette.FIELD_VALIDATOR, fieldValidator));
	}

	protected void renderFocused(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean focused = hSVPalette.getFocused();
		renderedAttributes.add(renderBoolean(HSVPalette.FOCUSED, focused));
	}

	protected void renderHeight(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object height = hSVPalette.getHeight();
		renderedAttributes.add(renderString(HSVPalette.HEIGHT, height));
	}

	protected void renderHSVPaletteId(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String hSVPaletteId = hSVPalette.getHSVPaletteId();
		renderedAttributes.add(renderString(HSVPalette.H_SVPALETTE_ID, hSVPaletteId));
	}

	protected void renderInitialized(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean initialized = hSVPalette.getInitialized();
		renderedAttributes.add(renderBoolean(HSVPalette.INITIALIZED, initialized));
	}

	protected void renderHSVPaletteLocale(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String hSVPaletteLocale = hSVPalette.getHSVPaletteLocale();
		renderedAttributes.add(renderString(HSVPalette.H_SVPALETTE_LOCALE, hSVPaletteLocale));
	}

	protected void renderRender(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object render = hSVPalette.getRender();
		renderedAttributes.add(renderString(HSVPalette.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean rendered = hSVPalette.getRendered();
		renderedAttributes.add(renderBoolean(HSVPalette.RENDERED, rendered));
	}

	protected void renderSelected(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String selected = hSVPalette.getSelected();
		renderedAttributes.add(renderString(HSVPalette.SELECTED, selected));
	}

	protected void renderSrcNode(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String srcNode = hSVPalette.getSrcNode();
		renderedAttributes.add(renderString(HSVPalette.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object strings = hSVPalette.getStrings();
		renderedAttributes.add(renderObject(HSVPalette.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object tabIndex = hSVPalette.getTabIndex();
		renderedAttributes.add(renderNumber(HSVPalette.TAB_INDEX, tabIndex));
	}

	protected void renderVisible(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Boolean visible = hSVPalette.getVisible();
		renderedAttributes.add(renderBoolean(HSVPalette.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.Object width = hSVPalette.getWidth();
		renderedAttributes.add(renderString(HSVPalette.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterBoundingBoxChange = hSVPalette.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterContentBoxChange = hSVPalette.getAfterContentBoxChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterControlsChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterControlsChange = hSVPalette.getAfterControlsChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_CONTROLS_CHANGE, afterControlsChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterDestroyedChange = hSVPalette.getAfterDestroyedChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterDisabledChange = hSVPalette.getAfterDisabledChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFieldValidatorChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterFieldValidatorChange = hSVPalette.getAfterFieldValidatorChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_FIELD_VALIDATOR_CHANGE, afterFieldValidatorChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterFocusedChange = hSVPalette.getAfterFocusedChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterHeightChange = hSVPalette.getAfterHeightChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterIdChange = hSVPalette.getAfterIdChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterInitializedChange = hSVPalette.getAfterInitializedChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterLocaleChange = hSVPalette.getAfterLocaleChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterRenderChange = hSVPalette.getAfterRenderChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterRenderedChange = hSVPalette.getAfterRenderedChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterSelectedChange = hSVPalette.getAfterSelectedChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterSrcNodeChange = hSVPalette.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterStringsChange = hSVPalette.getAfterStringsChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterTabIndexChange = hSVPalette.getAfterTabIndexChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterVisibleChange = hSVPalette.getAfterVisibleChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String afterWidthChange = hSVPalette.getAfterWidthChange();
		renderedAttributes.add(renderString(HSVPalette.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onBoundingBoxChange = hSVPalette.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(HSVPalette.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onContentBoxChange = hSVPalette.getOnContentBoxChange();
		renderedAttributes.add(renderString(HSVPalette.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnControlsChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onControlsChange = hSVPalette.getOnControlsChange();
		renderedAttributes.add(renderString(HSVPalette.ON_CONTROLS_CHANGE, onControlsChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onDestroyedChange = hSVPalette.getOnDestroyedChange();
		renderedAttributes.add(renderString(HSVPalette.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onDisabledChange = hSVPalette.getOnDisabledChange();
		renderedAttributes.add(renderString(HSVPalette.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFieldValidatorChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onFieldValidatorChange = hSVPalette.getOnFieldValidatorChange();
		renderedAttributes.add(renderString(HSVPalette.ON_FIELD_VALIDATOR_CHANGE, onFieldValidatorChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onFocusedChange = hSVPalette.getOnFocusedChange();
		renderedAttributes.add(renderString(HSVPalette.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onHeightChange = hSVPalette.getOnHeightChange();
		renderedAttributes.add(renderString(HSVPalette.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onIdChange = hSVPalette.getOnIdChange();
		renderedAttributes.add(renderString(HSVPalette.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onInitializedChange = hSVPalette.getOnInitializedChange();
		renderedAttributes.add(renderString(HSVPalette.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onLocaleChange = hSVPalette.getOnLocaleChange();
		renderedAttributes.add(renderString(HSVPalette.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onRenderChange = hSVPalette.getOnRenderChange();
		renderedAttributes.add(renderString(HSVPalette.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onRenderedChange = hSVPalette.getOnRenderedChange();
		renderedAttributes.add(renderString(HSVPalette.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onSelectedChange = hSVPalette.getOnSelectedChange();
		renderedAttributes.add(renderString(HSVPalette.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onSrcNodeChange = hSVPalette.getOnSrcNodeChange();
		renderedAttributes.add(renderString(HSVPalette.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onStringsChange = hSVPalette.getOnStringsChange();
		renderedAttributes.add(renderString(HSVPalette.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onTabIndexChange = hSVPalette.getOnTabIndexChange();
		renderedAttributes.add(renderString(HSVPalette.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onVisibleChange = hSVPalette.getOnVisibleChange();
		renderedAttributes.add(renderString(HSVPalette.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, HSVPalette hSVPalette) throws IOException {
		java.lang.String onWidthChange = hSVPalette.getOnWidthChange();
		renderedAttributes.add(renderString(HSVPalette.ON_WIDTH_CHANGE, onWidthChange));
	}

}