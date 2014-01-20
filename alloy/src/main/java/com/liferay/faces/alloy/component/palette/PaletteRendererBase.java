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
package com.liferay.faces.alloy.component.palette;

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
public abstract class PaletteRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-palette";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Palette palette = (Palette) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var palette = new A.Palette");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, palette);
		renderColumns(renderedAttributes, palette);
		renderContainerNode(renderedAttributes, palette);
		renderContentBox(renderedAttributes, palette);
		renderDestroyed(renderedAttributes, palette);
		renderDisabled(renderedAttributes, palette);
		renderFocused(renderedAttributes, palette);
		renderFormatter(renderedAttributes, palette);
		renderHeight(renderedAttributes, palette);
		renderPaletteId(renderedAttributes, palette);
		renderInitialized(renderedAttributes, palette);
		renderItems(renderedAttributes, palette);
		renderPaletteLocale(renderedAttributes, palette);
		renderRender(renderedAttributes, palette);
		renderRendered(renderedAttributes, palette);
		renderSelected(renderedAttributes, palette);
		renderSrcNode(renderedAttributes, palette);
		renderStrings(renderedAttributes, palette);
		renderTabIndex(renderedAttributes, palette);
		renderToggleSelection(renderedAttributes, palette);
		renderVisible(renderedAttributes, palette);
		renderWidth(renderedAttributes, palette);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, palette);
		renderAfterColumnsChange(renderedAfterEvents, palette);
		renderAfterContainerNodeChange(renderedAfterEvents, palette);
		renderAfterContentBoxChange(renderedAfterEvents, palette);
		renderAfterDestroyedChange(renderedAfterEvents, palette);
		renderAfterDisabledChange(renderedAfterEvents, palette);
		renderAfterFocusedChange(renderedAfterEvents, palette);
		renderAfterFormatterChange(renderedAfterEvents, palette);
		renderAfterHeightChange(renderedAfterEvents, palette);
		renderAfterIdChange(renderedAfterEvents, palette);
		renderAfterInitializedChange(renderedAfterEvents, palette);
		renderAfterItemsChange(renderedAfterEvents, palette);
		renderAfterLocaleChange(renderedAfterEvents, palette);
		renderAfterRenderChange(renderedAfterEvents, palette);
		renderAfterRenderedChange(renderedAfterEvents, palette);
		renderAfterSelectedChange(renderedAfterEvents, palette);
		renderAfterSrcNodeChange(renderedAfterEvents, palette);
		renderAfterStringsChange(renderedAfterEvents, palette);
		renderAfterTabIndexChange(renderedAfterEvents, palette);
		renderAfterToggleSelectionChange(renderedAfterEvents, palette);
		renderAfterVisibleChange(renderedAfterEvents, palette);
		renderAfterWidthChange(renderedAfterEvents, palette);

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

		renderOnBoundingBoxChange(renderedOnEvents, palette);
		renderOnColumnsChange(renderedOnEvents, palette);
		renderOnContainerNodeChange(renderedOnEvents, palette);
		renderOnContentBoxChange(renderedOnEvents, palette);
		renderOnDestroyedChange(renderedOnEvents, palette);
		renderOnDisabledChange(renderedOnEvents, palette);
		renderOnFocusedChange(renderedOnEvents, palette);
		renderOnFormatterChange(renderedOnEvents, palette);
		renderOnHeightChange(renderedOnEvents, palette);
		renderOnIdChange(renderedOnEvents, palette);
		renderOnInitializedChange(renderedOnEvents, palette);
		renderOnItemsChange(renderedOnEvents, palette);
		renderOnLocaleChange(renderedOnEvents, palette);
		renderOnRenderChange(renderedOnEvents, palette);
		renderOnRenderedChange(renderedOnEvents, palette);
		renderOnSelectedChange(renderedOnEvents, palette);
		renderOnSrcNodeChange(renderedOnEvents, palette);
		renderOnStringsChange(renderedOnEvents, palette);
		renderOnTabIndexChange(renderedOnEvents, palette);
		renderOnToggleSelectionChange(renderedOnEvents, palette);
		renderOnVisibleChange(renderedOnEvents, palette);
		renderOnWidthChange(renderedOnEvents, palette);

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

	protected void renderBoundingBox(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String boundingBox = palette.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Palette.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderColumns(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object columns = palette.getColumns();

		if (columns != null) {
			renderedAttributes.add(renderNumber(Palette.COLUMNS, columns));
		}
	}

	protected void renderContainerNode(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object containerNode = palette.getContainerNode();

		if (containerNode != null) {
			renderedAttributes.add(renderString(Palette.CONTAINER_NODE, containerNode));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String contentBox = palette.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Palette.CONTENT_BOX, contentBox));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean destroyed = palette.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Palette.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean disabled = palette.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Palette.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean focused = palette.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Palette.FOCUSED, focused));
		}
	}

	protected void renderFormatter(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object formatter = palette.getFormatter();

		if (formatter != null) {
			renderedAttributes.add(renderString(Palette.FORMATTER, formatter));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object height = palette.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Palette.HEIGHT, height));
		}
	}

	protected void renderPaletteId(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String paletteId = palette.getPaletteId();

		if (paletteId != null) {
			renderedAttributes.add(renderString(Palette.PALETTE_ID, paletteId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean initialized = palette.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Palette.INITIALIZED, initialized));
		}
	}

	protected void renderItems(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object items = palette.getItems();

		if (items != null) {
			renderedAttributes.add(renderArray(Palette.ITEMS, items));
		}
	}

	protected void renderPaletteLocale(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String paletteLocale = palette.getPaletteLocale();

		if (paletteLocale != null) {
			renderedAttributes.add(renderString(Palette.PALETTE_LOCALE, paletteLocale));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object render = palette.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Palette.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean rendered = palette.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Palette.RENDERED, rendered));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object selected = palette.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderNumber(Palette.SELECTED, selected));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String srcNode = palette.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Palette.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object strings = palette.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Palette.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object tabIndex = palette.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Palette.TAB_INDEX, tabIndex));
		}
	}

	protected void renderToggleSelection(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean toggleSelection = palette.getToggleSelection();

		if (toggleSelection != null) {
			renderedAttributes.add(renderBoolean(Palette.TOGGLE_SELECTION, toggleSelection));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean visible = palette.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Palette.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object width = palette.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Palette.WIDTH, width));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterBoundingBoxChange = palette.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterColumnsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterColumnsChange = palette.getAfterColumnsChange();

		if (afterColumnsChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_COLUMNS_CHANGE, afterColumnsChange));
		}
	}

	protected void renderAfterContainerNodeChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterContainerNodeChange = palette.getAfterContainerNodeChange();

		if (afterContainerNodeChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_CONTAINER_NODE_CHANGE, afterContainerNodeChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterContentBoxChange = palette.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterDestroyedChange = palette.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterDisabledChange = palette.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterFocusedChange = palette.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFormatterChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterFormatterChange = palette.getAfterFormatterChange();

		if (afterFormatterChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_FORMATTER_CHANGE, afterFormatterChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterHeightChange = palette.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterIdChange = palette.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterInitializedChange = palette.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterItemsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterItemsChange = palette.getAfterItemsChange();

		if (afterItemsChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_ITEMS_CHANGE, afterItemsChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterLocaleChange = palette.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterRenderChange = palette.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterRenderedChange = palette.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterSelectedChange = palette.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterSrcNodeChange = palette.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterStringsChange = palette.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterTabIndexChange = palette.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterToggleSelectionChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterToggleSelectionChange = palette.getAfterToggleSelectionChange();

		if (afterToggleSelectionChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_TOGGLE_SELECTION_CHANGE, afterToggleSelectionChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterVisibleChange = palette.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterWidthChange = palette.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(Palette.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onBoundingBoxChange = palette.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Palette.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnColumnsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onColumnsChange = palette.getOnColumnsChange();

		if (onColumnsChange != null) {
			renderedAttributes.add(renderString(Palette.ON_COLUMNS_CHANGE, onColumnsChange));
		}
	}

	protected void renderOnContainerNodeChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onContainerNodeChange = palette.getOnContainerNodeChange();

		if (onContainerNodeChange != null) {
			renderedAttributes.add(renderString(Palette.ON_CONTAINER_NODE_CHANGE, onContainerNodeChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onContentBoxChange = palette.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(Palette.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onDestroyedChange = palette.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Palette.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onDisabledChange = palette.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Palette.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onFocusedChange = palette.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(Palette.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFormatterChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onFormatterChange = palette.getOnFormatterChange();

		if (onFormatterChange != null) {
			renderedAttributes.add(renderString(Palette.ON_FORMATTER_CHANGE, onFormatterChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onHeightChange = palette.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(Palette.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onIdChange = palette.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(Palette.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onInitializedChange = palette.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Palette.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnItemsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onItemsChange = palette.getOnItemsChange();

		if (onItemsChange != null) {
			renderedAttributes.add(renderString(Palette.ON_ITEMS_CHANGE, onItemsChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onLocaleChange = palette.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(Palette.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onRenderChange = palette.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Palette.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onRenderedChange = palette.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(Palette.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onSelectedChange = palette.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(Palette.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onSrcNodeChange = palette.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(Palette.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onStringsChange = palette.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(Palette.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onTabIndexChange = palette.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(Palette.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnToggleSelectionChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onToggleSelectionChange = palette.getOnToggleSelectionChange();

		if (onToggleSelectionChange != null) {
			renderedAttributes.add(renderString(Palette.ON_TOGGLE_SELECTION_CHANGE, onToggleSelectionChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onVisibleChange = palette.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Palette.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onWidthChange = palette.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(Palette.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}