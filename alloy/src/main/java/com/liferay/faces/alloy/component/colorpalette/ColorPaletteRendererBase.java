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

		if (colorPalette.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getColumns() != null) {
			renderColumns(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getContainerNode() != null) {
			renderContainerNode(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getContentBox() != null) {
			renderContentBox(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getDisabled() != null) {
			renderDisabled(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getFocused() != null) {
			renderFocused(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getFormatter() != null) {
			renderFormatter(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getHeight() != null) {
			renderHeight(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getColorPaletteId() != null) {
			renderColorPaletteId(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getInitialized() != null) {
			renderInitialized(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getItems() != null) {
			renderItems(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getColorPaletteLocale() != null) {
			renderColorPaletteLocale(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getRender() != null) {
			renderRender(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getRendered() != null) {
			renderRendered(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getSelected() != null) {
			renderSelected(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getStrings() != null) {
			renderStrings(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getToggleSelection() != null) {
			renderToggleSelection(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getVisible() != null) {
			renderVisible(renderedAttributes, colorPalette);
		}
		
		if (colorPalette.getWidth() != null) {
			renderWidth(renderedAttributes, colorPalette);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (colorPalette.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterColumnsChange() != null) {
			renderAfterColumnsChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterContainerNodeChange() != null) {
			renderAfterContainerNodeChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterFormatterChange() != null) {
			renderAfterFormatterChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterItemsChange() != null) {
			renderAfterItemsChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterToggleSelectionChange() != null) {
			renderAfterToggleSelectionChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, colorPalette);
		}
		
		if (colorPalette.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, colorPalette);
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

		if (colorPalette.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnColumnsChange() != null) {
			renderOnColumnsChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnContainerNodeChange() != null) {
			renderOnContainerNodeChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnFormatterChange() != null) {
			renderOnFormatterChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnItemsChange() != null) {
			renderOnItemsChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnToggleSelectionChange() != null) {
			renderOnToggleSelectionChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, colorPalette);
		}
		
		if (colorPalette.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, colorPalette);
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

	protected void renderBoundingBox(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String boundingBox = colorPalette.getBoundingBox();
		renderedAttributes.add(renderString(ColorPalette.BOUNDING_BOX, boundingBox));
	}

	protected void renderColumns(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object columns = colorPalette.getColumns();
		renderedAttributes.add(renderNumber(ColorPalette.COLUMNS, columns));
	}

	protected void renderContainerNode(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object containerNode = colorPalette.getContainerNode();
		renderedAttributes.add(renderString(ColorPalette.CONTAINER_NODE, containerNode));
	}

	protected void renderContentBox(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String contentBox = colorPalette.getContentBox();
		renderedAttributes.add(renderString(ColorPalette.CONTENT_BOX, contentBox));
	}

	protected void renderDestroyed(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean destroyed = colorPalette.getDestroyed();
		renderedAttributes.add(renderBoolean(ColorPalette.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean disabled = colorPalette.getDisabled();
		renderedAttributes.add(renderBoolean(ColorPalette.DISABLED, disabled));
	}

	protected void renderFocused(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean focused = colorPalette.getFocused();
		renderedAttributes.add(renderBoolean(ColorPalette.FOCUSED, focused));
	}

	protected void renderFormatter(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object formatter = colorPalette.getFormatter();
		renderedAttributes.add(renderString(ColorPalette.FORMATTER, formatter));
	}

	protected void renderHeight(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object height = colorPalette.getHeight();
		renderedAttributes.add(renderString(ColorPalette.HEIGHT, height));
	}

	protected void renderColorPaletteId(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String colorPaletteId = colorPalette.getColorPaletteId();
		renderedAttributes.add(renderString(ColorPalette.COLOR_PALETTE_ID, colorPaletteId));
	}

	protected void renderInitialized(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean initialized = colorPalette.getInitialized();
		renderedAttributes.add(renderBoolean(ColorPalette.INITIALIZED, initialized));
	}

	protected void renderItems(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object items = colorPalette.getItems();
		renderedAttributes.add(renderArray(ColorPalette.ITEMS, items));
	}

	protected void renderColorPaletteLocale(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String colorPaletteLocale = colorPalette.getColorPaletteLocale();
		renderedAttributes.add(renderString(ColorPalette.COLOR_PALETTE_LOCALE, colorPaletteLocale));
	}

	protected void renderRender(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object render = colorPalette.getRender();
		renderedAttributes.add(renderString(ColorPalette.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean rendered = colorPalette.getRendered();
		renderedAttributes.add(renderBoolean(ColorPalette.RENDERED, rendered));
	}

	protected void renderSelected(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object selected = colorPalette.getSelected();
		renderedAttributes.add(renderNumber(ColorPalette.SELECTED, selected));
	}

	protected void renderSrcNode(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String srcNode = colorPalette.getSrcNode();
		renderedAttributes.add(renderString(ColorPalette.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object strings = colorPalette.getStrings();
		renderedAttributes.add(renderObject(ColorPalette.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object tabIndex = colorPalette.getTabIndex();
		renderedAttributes.add(renderNumber(ColorPalette.TAB_INDEX, tabIndex));
	}

	protected void renderToggleSelection(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean toggleSelection = colorPalette.getToggleSelection();
		renderedAttributes.add(renderBoolean(ColorPalette.TOGGLE_SELECTION, toggleSelection));
	}

	protected void renderVisible(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Boolean visible = colorPalette.getVisible();
		renderedAttributes.add(renderBoolean(ColorPalette.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.Object width = colorPalette.getWidth();
		renderedAttributes.add(renderString(ColorPalette.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterBoundingBoxChange = colorPalette.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterColumnsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterColumnsChange = colorPalette.getAfterColumnsChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_COLUMNS_CHANGE, afterColumnsChange));
	}

	protected void renderAfterContainerNodeChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterContainerNodeChange = colorPalette.getAfterContainerNodeChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_CONTAINER_NODE_CHANGE, afterContainerNodeChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterContentBoxChange = colorPalette.getAfterContentBoxChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterDestroyedChange = colorPalette.getAfterDestroyedChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterDisabledChange = colorPalette.getAfterDisabledChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterFocusedChange = colorPalette.getAfterFocusedChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFormatterChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterFormatterChange = colorPalette.getAfterFormatterChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_FORMATTER_CHANGE, afterFormatterChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterHeightChange = colorPalette.getAfterHeightChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterIdChange = colorPalette.getAfterIdChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterInitializedChange = colorPalette.getAfterInitializedChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterItemsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterItemsChange = colorPalette.getAfterItemsChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_ITEMS_CHANGE, afterItemsChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterLocaleChange = colorPalette.getAfterLocaleChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterRenderChange = colorPalette.getAfterRenderChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterRenderedChange = colorPalette.getAfterRenderedChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterSelectedChange = colorPalette.getAfterSelectedChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterSrcNodeChange = colorPalette.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterStringsChange = colorPalette.getAfterStringsChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterTabIndexChange = colorPalette.getAfterTabIndexChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToggleSelectionChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterToggleSelectionChange = colorPalette.getAfterToggleSelectionChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_TOGGLE_SELECTION_CHANGE, afterToggleSelectionChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterVisibleChange = colorPalette.getAfterVisibleChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String afterWidthChange = colorPalette.getAfterWidthChange();
		renderedAttributes.add(renderString(ColorPalette.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onBoundingBoxChange = colorPalette.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(ColorPalette.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnColumnsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onColumnsChange = colorPalette.getOnColumnsChange();
		renderedAttributes.add(renderString(ColorPalette.ON_COLUMNS_CHANGE, onColumnsChange));
	}

	protected void renderOnContainerNodeChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onContainerNodeChange = colorPalette.getOnContainerNodeChange();
		renderedAttributes.add(renderString(ColorPalette.ON_CONTAINER_NODE_CHANGE, onContainerNodeChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onContentBoxChange = colorPalette.getOnContentBoxChange();
		renderedAttributes.add(renderString(ColorPalette.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onDestroyedChange = colorPalette.getOnDestroyedChange();
		renderedAttributes.add(renderString(ColorPalette.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onDisabledChange = colorPalette.getOnDisabledChange();
		renderedAttributes.add(renderString(ColorPalette.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onFocusedChange = colorPalette.getOnFocusedChange();
		renderedAttributes.add(renderString(ColorPalette.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFormatterChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onFormatterChange = colorPalette.getOnFormatterChange();
		renderedAttributes.add(renderString(ColorPalette.ON_FORMATTER_CHANGE, onFormatterChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onHeightChange = colorPalette.getOnHeightChange();
		renderedAttributes.add(renderString(ColorPalette.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onIdChange = colorPalette.getOnIdChange();
		renderedAttributes.add(renderString(ColorPalette.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onInitializedChange = colorPalette.getOnInitializedChange();
		renderedAttributes.add(renderString(ColorPalette.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnItemsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onItemsChange = colorPalette.getOnItemsChange();
		renderedAttributes.add(renderString(ColorPalette.ON_ITEMS_CHANGE, onItemsChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onLocaleChange = colorPalette.getOnLocaleChange();
		renderedAttributes.add(renderString(ColorPalette.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onRenderChange = colorPalette.getOnRenderChange();
		renderedAttributes.add(renderString(ColorPalette.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onRenderedChange = colorPalette.getOnRenderedChange();
		renderedAttributes.add(renderString(ColorPalette.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onSelectedChange = colorPalette.getOnSelectedChange();
		renderedAttributes.add(renderString(ColorPalette.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onSrcNodeChange = colorPalette.getOnSrcNodeChange();
		renderedAttributes.add(renderString(ColorPalette.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onStringsChange = colorPalette.getOnStringsChange();
		renderedAttributes.add(renderString(ColorPalette.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onTabIndexChange = colorPalette.getOnTabIndexChange();
		renderedAttributes.add(renderString(ColorPalette.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToggleSelectionChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onToggleSelectionChange = colorPalette.getOnToggleSelectionChange();
		renderedAttributes.add(renderString(ColorPalette.ON_TOGGLE_SELECTION_CHANGE, onToggleSelectionChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onVisibleChange = colorPalette.getOnVisibleChange();
		renderedAttributes.add(renderString(ColorPalette.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, ColorPalette colorPalette) throws IOException {
		java.lang.String onWidthChange = colorPalette.getOnWidthChange();
		renderedAttributes.add(renderString(ColorPalette.ON_WIDTH_CHANGE, onWidthChange));
	}

}