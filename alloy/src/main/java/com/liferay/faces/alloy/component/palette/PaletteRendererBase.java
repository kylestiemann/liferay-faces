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

		if (palette.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, palette);
		}

		if (palette.getColumns() != null) {
			renderColumns(renderedAttributes, palette);
		}

		if (palette.getContainerNode() != null) {
			renderContainerNode(renderedAttributes, palette);
		}

		if (palette.getContentBox() != null) {
			renderContentBox(renderedAttributes, palette);
		}

		if (palette.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, palette);
		}

		if (palette.getDisabled() != null) {
			renderDisabled(renderedAttributes, palette);
		}

		if (palette.getFocused() != null) {
			renderFocused(renderedAttributes, palette);
		}

		if (palette.getFormatter() != null) {
			renderFormatter(renderedAttributes, palette);
		}

		if (palette.getHeight() != null) {
			renderHeight(renderedAttributes, palette);
		}

		if (palette.getPaletteId() != null) {
			renderPaletteId(renderedAttributes, palette);
		}

		if (palette.getInitialized() != null) {
			renderInitialized(renderedAttributes, palette);
		}

		if (palette.getItems() != null) {
			renderItems(renderedAttributes, palette);
		}

		if (palette.getPaletteLocale() != null) {
			renderPaletteLocale(renderedAttributes, palette);
		}

		if (palette.getRender() != null) {
			renderRender(renderedAttributes, palette);
		}

		if (palette.getRendered() != null) {
			renderRendered(renderedAttributes, palette);
		}

		if (palette.getSelected() != null) {
			renderSelected(renderedAttributes, palette);
		}

		if (palette.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, palette);
		}

		if (palette.getStrings() != null) {
			renderStrings(renderedAttributes, palette);
		}

		if (palette.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, palette);
		}

		if (palette.getToggleSelection() != null) {
			renderToggleSelection(renderedAttributes, palette);
		}

		if (palette.getVisible() != null) {
			renderVisible(renderedAttributes, palette);
		}

		if (palette.getWidth() != null) {
			renderWidth(renderedAttributes, palette);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (palette.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterColumnsChange() != null) {
			renderAfterColumnsChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterContainerNodeChange() != null) {
			renderAfterContainerNodeChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterFormatterChange() != null) {
			renderAfterFormatterChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterItemsChange() != null) {
			renderAfterItemsChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterToggleSelectionChange() != null) {
			renderAfterToggleSelectionChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, palette);
		}

		if (palette.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, palette);
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

		if (palette.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, palette);
		}

		if (palette.getOnColumnsChange() != null) {
			renderOnColumnsChange(renderedOnEvents, palette);
		}

		if (palette.getOnContainerNodeChange() != null) {
			renderOnContainerNodeChange(renderedOnEvents, palette);
		}

		if (palette.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, palette);
		}

		if (palette.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, palette);
		}

		if (palette.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, palette);
		}

		if (palette.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, palette);
		}

		if (palette.getOnFormatterChange() != null) {
			renderOnFormatterChange(renderedOnEvents, palette);
		}

		if (palette.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, palette);
		}

		if (palette.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, palette);
		}

		if (palette.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, palette);
		}

		if (palette.getOnItemsChange() != null) {
			renderOnItemsChange(renderedOnEvents, palette);
		}

		if (palette.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, palette);
		}

		if (palette.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, palette);
		}

		if (palette.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, palette);
		}

		if (palette.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, palette);
		}

		if (palette.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, palette);
		}

		if (palette.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, palette);
		}

		if (palette.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, palette);
		}

		if (palette.getOnToggleSelectionChange() != null) {
			renderOnToggleSelectionChange(renderedOnEvents, palette);
		}

		if (palette.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, palette);
		}

		if (palette.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, palette);
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

	protected void renderBoundingBox(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String boundingBox = palette.getBoundingBox();
		renderedAttributes.add(renderString(Palette.BOUNDING_BOX, boundingBox));
	}

	protected void renderColumns(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object columns = palette.getColumns();
		renderedAttributes.add(renderNumber(Palette.COLUMNS, columns));
	}

	protected void renderContainerNode(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object containerNode = palette.getContainerNode();
		renderedAttributes.add(renderString(Palette.CONTAINER_NODE, containerNode));
	}

	protected void renderContentBox(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String contentBox = palette.getContentBox();
		renderedAttributes.add(renderString(Palette.CONTENT_BOX, contentBox));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean destroyed = palette.getDestroyed();
		renderedAttributes.add(renderBoolean(Palette.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean disabled = palette.getDisabled();
		renderedAttributes.add(renderBoolean(Palette.DISABLED, disabled));
	}

	protected void renderFocused(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean focused = palette.getFocused();
		renderedAttributes.add(renderBoolean(Palette.FOCUSED, focused));
	}

	protected void renderFormatter(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object formatter = palette.getFormatter();
		renderedAttributes.add(renderString(Palette.FORMATTER, formatter));
	}

	protected void renderHeight(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object height = palette.getHeight();
		renderedAttributes.add(renderString(Palette.HEIGHT, height));
	}

	protected void renderPaletteId(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String paletteId = palette.getPaletteId();
		renderedAttributes.add(renderString(Palette.PALETTE_ID, paletteId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean initialized = palette.getInitialized();
		renderedAttributes.add(renderBoolean(Palette.INITIALIZED, initialized));
	}

	protected void renderItems(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object items = palette.getItems();
		renderedAttributes.add(renderArray(Palette.ITEMS, items));
	}

	protected void renderPaletteLocale(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String paletteLocale = palette.getPaletteLocale();
		renderedAttributes.add(renderString(Palette.PALETTE_LOCALE, paletteLocale));
	}

	protected void renderRender(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object render = palette.getRender();
		renderedAttributes.add(renderString(Palette.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean rendered = palette.getRendered();
		renderedAttributes.add(renderBoolean(Palette.RENDERED, rendered));
	}

	protected void renderSelected(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object selected = palette.getSelected();
		renderedAttributes.add(renderNumber(Palette.SELECTED, selected));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String srcNode = palette.getSrcNode();
		renderedAttributes.add(renderString(Palette.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object strings = palette.getStrings();
		renderedAttributes.add(renderObject(Palette.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object tabIndex = palette.getTabIndex();
		renderedAttributes.add(renderNumber(Palette.TAB_INDEX, tabIndex));
	}

	protected void renderToggleSelection(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean toggleSelection = palette.getToggleSelection();
		renderedAttributes.add(renderBoolean(Palette.TOGGLE_SELECTION, toggleSelection));
	}

	protected void renderVisible(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Boolean visible = palette.getVisible();
		renderedAttributes.add(renderBoolean(Palette.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.Object width = palette.getWidth();
		renderedAttributes.add(renderString(Palette.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterBoundingBoxChange = palette.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Palette.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterColumnsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterColumnsChange = palette.getAfterColumnsChange();
		renderedAttributes.add(renderString(Palette.AFTER_COLUMNS_CHANGE, afterColumnsChange));
	}

	protected void renderAfterContainerNodeChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterContainerNodeChange = palette.getAfterContainerNodeChange();
		renderedAttributes.add(renderString(Palette.AFTER_CONTAINER_NODE_CHANGE, afterContainerNodeChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterContentBoxChange = palette.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Palette.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterDestroyedChange = palette.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Palette.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterDisabledChange = palette.getAfterDisabledChange();
		renderedAttributes.add(renderString(Palette.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterFocusedChange = palette.getAfterFocusedChange();
		renderedAttributes.add(renderString(Palette.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFormatterChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterFormatterChange = palette.getAfterFormatterChange();
		renderedAttributes.add(renderString(Palette.AFTER_FORMATTER_CHANGE, afterFormatterChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterHeightChange = palette.getAfterHeightChange();
		renderedAttributes.add(renderString(Palette.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterIdChange = palette.getAfterIdChange();
		renderedAttributes.add(renderString(Palette.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterInitializedChange = palette.getAfterInitializedChange();
		renderedAttributes.add(renderString(Palette.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterItemsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterItemsChange = palette.getAfterItemsChange();
		renderedAttributes.add(renderString(Palette.AFTER_ITEMS_CHANGE, afterItemsChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterLocaleChange = palette.getAfterLocaleChange();
		renderedAttributes.add(renderString(Palette.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterRenderChange = palette.getAfterRenderChange();
		renderedAttributes.add(renderString(Palette.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterRenderedChange = palette.getAfterRenderedChange();
		renderedAttributes.add(renderString(Palette.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterSelectedChange = palette.getAfterSelectedChange();
		renderedAttributes.add(renderString(Palette.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterSrcNodeChange = palette.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Palette.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterStringsChange = palette.getAfterStringsChange();
		renderedAttributes.add(renderString(Palette.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterTabIndexChange = palette.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Palette.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterToggleSelectionChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterToggleSelectionChange = palette.getAfterToggleSelectionChange();
		renderedAttributes.add(renderString(Palette.AFTER_TOGGLE_SELECTION_CHANGE, afterToggleSelectionChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterVisibleChange = palette.getAfterVisibleChange();
		renderedAttributes.add(renderString(Palette.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String afterWidthChange = palette.getAfterWidthChange();
		renderedAttributes.add(renderString(Palette.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onBoundingBoxChange = palette.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Palette.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnColumnsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onColumnsChange = palette.getOnColumnsChange();
		renderedAttributes.add(renderString(Palette.ON_COLUMNS_CHANGE, onColumnsChange));
	}

	protected void renderOnContainerNodeChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onContainerNodeChange = palette.getOnContainerNodeChange();
		renderedAttributes.add(renderString(Palette.ON_CONTAINER_NODE_CHANGE, onContainerNodeChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onContentBoxChange = palette.getOnContentBoxChange();
		renderedAttributes.add(renderString(Palette.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onDestroyedChange = palette.getOnDestroyedChange();
		renderedAttributes.add(renderString(Palette.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onDisabledChange = palette.getOnDisabledChange();
		renderedAttributes.add(renderString(Palette.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onFocusedChange = palette.getOnFocusedChange();
		renderedAttributes.add(renderString(Palette.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFormatterChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onFormatterChange = palette.getOnFormatterChange();
		renderedAttributes.add(renderString(Palette.ON_FORMATTER_CHANGE, onFormatterChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onHeightChange = palette.getOnHeightChange();
		renderedAttributes.add(renderString(Palette.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onIdChange = palette.getOnIdChange();
		renderedAttributes.add(renderString(Palette.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onInitializedChange = palette.getOnInitializedChange();
		renderedAttributes.add(renderString(Palette.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnItemsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onItemsChange = palette.getOnItemsChange();
		renderedAttributes.add(renderString(Palette.ON_ITEMS_CHANGE, onItemsChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onLocaleChange = palette.getOnLocaleChange();
		renderedAttributes.add(renderString(Palette.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onRenderChange = palette.getOnRenderChange();
		renderedAttributes.add(renderString(Palette.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onRenderedChange = palette.getOnRenderedChange();
		renderedAttributes.add(renderString(Palette.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onSelectedChange = palette.getOnSelectedChange();
		renderedAttributes.add(renderString(Palette.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onSrcNodeChange = palette.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Palette.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onStringsChange = palette.getOnStringsChange();
		renderedAttributes.add(renderString(Palette.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onTabIndexChange = palette.getOnTabIndexChange();
		renderedAttributes.add(renderString(Palette.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnToggleSelectionChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onToggleSelectionChange = palette.getOnToggleSelectionChange();
		renderedAttributes.add(renderString(Palette.ON_TOGGLE_SELECTION_CHANGE, onToggleSelectionChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onVisibleChange = palette.getOnVisibleChange();
		renderedAttributes.add(renderString(Palette.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Palette palette) throws IOException {
		java.lang.String onWidthChange = palette.getOnWidthChange();
		renderedAttributes.add(renderString(Palette.ON_WIDTH_CHANGE, onWidthChange));
	}

}