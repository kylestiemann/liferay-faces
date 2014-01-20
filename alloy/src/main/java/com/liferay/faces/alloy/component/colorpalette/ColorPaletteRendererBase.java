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
package com.liferay.faces.alloy.component.colorpalette;

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
public abstract class ColorPaletteRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-color-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		ColorPalette colorPalette = (ColorPalette) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var colorPalette = new A.ColorPalette");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, colorPalette);
		renderColumns(renderedAttributes, colorPalette);
		renderContainerNode(renderedAttributes, colorPalette);
		renderContentBox(renderedAttributes, colorPalette);
		renderDestroyed(renderedAttributes, colorPalette);
		renderDisabled(renderedAttributes, colorPalette);
		renderFocused(renderedAttributes, colorPalette);
		renderFormatter(renderedAttributes, colorPalette);
		renderHeight(renderedAttributes, colorPalette);
		renderColorPaletteId(renderedAttributes, colorPalette);
		renderInitialized(renderedAttributes, colorPalette);
		renderItems(renderedAttributes, colorPalette);
		renderColorPaletteLocale(renderedAttributes, colorPalette);
		renderRender(renderedAttributes, colorPalette);
		renderRendered(renderedAttributes, colorPalette);
		renderSelected(renderedAttributes, colorPalette);
		renderSrcNode(renderedAttributes, colorPalette);
		renderStrings(renderedAttributes, colorPalette);
		renderTabIndex(renderedAttributes, colorPalette);
		renderToggleSelection(renderedAttributes, colorPalette);
		renderVisible(renderedAttributes, colorPalette);
		renderWidth(renderedAttributes, colorPalette);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, colorPalette);
		renderAfterColumnsChange(renderedAfterEvents, colorPalette);
		renderAfterContainerNodeChange(renderedAfterEvents, colorPalette);
		renderAfterContentBoxChange(renderedAfterEvents, colorPalette);
		renderAfterDestroyedChange(renderedAfterEvents, colorPalette);
		renderAfterDisabledChange(renderedAfterEvents, colorPalette);
		renderAfterFocusedChange(renderedAfterEvents, colorPalette);
		renderAfterFormatterChange(renderedAfterEvents, colorPalette);
		renderAfterHeightChange(renderedAfterEvents, colorPalette);
		renderAfterIdChange(renderedAfterEvents, colorPalette);
		renderAfterInitializedChange(renderedAfterEvents, colorPalette);
		renderAfterItemsChange(renderedAfterEvents, colorPalette);
		renderAfterLocaleChange(renderedAfterEvents, colorPalette);
		renderAfterRenderChange(renderedAfterEvents, colorPalette);
		renderAfterRenderedChange(renderedAfterEvents, colorPalette);
		renderAfterSelectedChange(renderedAfterEvents, colorPalette);
		renderAfterSrcNodeChange(renderedAfterEvents, colorPalette);
		renderAfterStringsChange(renderedAfterEvents, colorPalette);
		renderAfterTabIndexChange(renderedAfterEvents, colorPalette);
		renderAfterToggleSelectionChange(renderedAfterEvents, colorPalette);
		renderAfterVisibleChange(renderedAfterEvents, colorPalette);
		renderAfterWidthChange(renderedAfterEvents, colorPalette);

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

		renderOnBoundingBoxChange(renderedOnEvents, colorPalette);
		renderOnColumnsChange(renderedOnEvents, colorPalette);
		renderOnContainerNodeChange(renderedOnEvents, colorPalette);
		renderOnContentBoxChange(renderedOnEvents, colorPalette);
		renderOnDestroyedChange(renderedOnEvents, colorPalette);
		renderOnDisabledChange(renderedOnEvents, colorPalette);
		renderOnFocusedChange(renderedOnEvents, colorPalette);
		renderOnFormatterChange(renderedOnEvents, colorPalette);
		renderOnHeightChange(renderedOnEvents, colorPalette);
		renderOnIdChange(renderedOnEvents, colorPalette);
		renderOnInitializedChange(renderedOnEvents, colorPalette);
		renderOnItemsChange(renderedOnEvents, colorPalette);
		renderOnLocaleChange(renderedOnEvents, colorPalette);
		renderOnRenderChange(renderedOnEvents, colorPalette);
		renderOnRenderedChange(renderedOnEvents, colorPalette);
		renderOnSelectedChange(renderedOnEvents, colorPalette);
		renderOnSrcNodeChange(renderedOnEvents, colorPalette);
		renderOnStringsChange(renderedOnEvents, colorPalette);
		renderOnTabIndexChange(renderedOnEvents, colorPalette);
		renderOnToggleSelectionChange(renderedOnEvents, colorPalette);
		renderOnVisibleChange(renderedOnEvents, colorPalette);
		renderOnWidthChange(renderedOnEvents, colorPalette);

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

	protected void renderBoundingBox(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String boundingBox = colorPalette.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(ColorPalette.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderColumns(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object columns = colorPalette.getColumns();

		if (columns != null) {
			renderedAttributes.add(renderNumber(ColorPalette.COLUMNS, columns));
		}
	}

	protected void renderContainerNode(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object containerNode = colorPalette.getContainerNode();

		if (containerNode != null) {
			renderedAttributes.add(renderString(ColorPalette.CONTAINER_NODE, containerNode));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String contentBox = colorPalette.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(ColorPalette.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean destroyed = colorPalette.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean disabled = colorPalette.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean focused = colorPalette.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.FOCUSED, focused));
		}
	}

	protected void renderFormatter(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object formatter = colorPalette.getFormatter();

		if (formatter != null) {
			renderedAttributes.add(renderString(ColorPalette.FORMATTER, formatter));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object height = colorPalette.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(ColorPalette.HEIGHT, height));
		}
	}

	protected void renderColorPaletteId(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String colorPaletteId = colorPalette.getColorPaletteId();

		if (colorPaletteId != null) {
			renderedAttributes.add(renderString(ColorPalette.COLOR_PALETTE_ID, colorPaletteId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean initialized = colorPalette.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.INITIALIZED, initialized));
		}
	}

	protected void renderItems(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object items = colorPalette.getItems();

		if (items != null) {
			renderedAttributes.add(renderArray(ColorPalette.ITEMS, items));
		}
	}

	protected void renderColorPaletteLocale(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String colorPaletteLocale = colorPalette.getColorPaletteLocale();

		if (colorPaletteLocale != null) {
			renderedAttributes.add(renderString(ColorPalette.COLOR_PALETTE_LOCALE, colorPaletteLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object render = colorPalette.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(ColorPalette.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean rendered = colorPalette.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.RENDERED, rendered));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object selected = colorPalette.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderNumber(ColorPalette.SELECTED, selected));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String srcNode = colorPalette.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(ColorPalette.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object strings = colorPalette.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(ColorPalette.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object tabIndex = colorPalette.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(ColorPalette.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToggleSelection(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean toggleSelection = colorPalette.getToggleSelection();

		if (toggleSelection != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.TOGGLE_SELECTION, toggleSelection));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean visible = colorPalette.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(ColorPalette.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object width = colorPalette.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(ColorPalette.WIDTH, width));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterBoundingBoxChange = colorPalette.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterColumnsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterColumnsChange = colorPalette.getAfterColumnsChange();

		if (afterColumnsChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_COLUMNS_CHANGE, afterColumnsChange));
		}
	}

	protected void renderAfterContainerNodeChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterContainerNodeChange = colorPalette.getAfterContainerNodeChange();

		if (afterContainerNodeChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_CONTAINER_NODE_CHANGE, afterContainerNodeChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterContentBoxChange = colorPalette.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterDestroyedChange = colorPalette.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterDisabledChange = colorPalette.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterFocusedChange = colorPalette.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFormatterChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterFormatterChange = colorPalette.getAfterFormatterChange();

		if (afterFormatterChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_FORMATTER_CHANGE, afterFormatterChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterHeightChange = colorPalette.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterIdChange = colorPalette.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterInitializedChange = colorPalette.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterItemsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterItemsChange = colorPalette.getAfterItemsChange();

		if (afterItemsChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_ITEMS_CHANGE, afterItemsChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterLocaleChange = colorPalette.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterRenderChange = colorPalette.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterRenderedChange = colorPalette.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterSelectedChange = colorPalette.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterSrcNodeChange = colorPalette.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterStringsChange = colorPalette.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterTabIndexChange = colorPalette.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterToggleSelectionChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterToggleSelectionChange = colorPalette.getAfterToggleSelectionChange();

		if (afterToggleSelectionChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_TOGGLE_SELECTION_CHANGE, afterToggleSelectionChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterVisibleChange = colorPalette.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterWidthChange = colorPalette.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(ColorPalette.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onBoundingBoxChange = colorPalette.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnColumnsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onColumnsChange = colorPalette.getOnColumnsChange();

		if (onColumnsChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_COLUMNS_CHANGE, onColumnsChange));
		}
	}

	protected void renderOnContainerNodeChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onContainerNodeChange = colorPalette.getOnContainerNodeChange();

		if (onContainerNodeChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_CONTAINER_NODE_CHANGE, onContainerNodeChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onContentBoxChange = colorPalette.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onDestroyedChange = colorPalette.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onDisabledChange = colorPalette.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onFocusedChange = colorPalette.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFormatterChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onFormatterChange = colorPalette.getOnFormatterChange();

		if (onFormatterChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_FORMATTER_CHANGE, onFormatterChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onHeightChange = colorPalette.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onIdChange = colorPalette.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onInitializedChange = colorPalette.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnItemsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onItemsChange = colorPalette.getOnItemsChange();

		if (onItemsChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_ITEMS_CHANGE, onItemsChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onLocaleChange = colorPalette.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onRenderChange = colorPalette.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onRenderedChange = colorPalette.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onSelectedChange = colorPalette.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onSrcNodeChange = colorPalette.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onStringsChange = colorPalette.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onTabIndexChange = colorPalette.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnToggleSelectionChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onToggleSelectionChange = colorPalette.getOnToggleSelectionChange();

		if (onToggleSelectionChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_TOGGLE_SELECTION_CHANGE, onToggleSelectionChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onVisibleChange = colorPalette.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onWidthChange = colorPalette.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(ColorPalette.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}