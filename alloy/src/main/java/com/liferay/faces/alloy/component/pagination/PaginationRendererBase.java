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
package com.liferay.faces.alloy.component.pagination;

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
public abstract class PaginationRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-pagination";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		Pagination pagination = (Pagination) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var pagination = new A.Pagination");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderBoundingBox(renderedAttributes, pagination);
		renderCircular(renderedAttributes, pagination);
		renderContentBox(renderedAttributes, pagination);
		renderCssClass(renderedAttributes, pagination);
		renderDestroyed(renderedAttributes, pagination);
		renderDisabled(renderedAttributes, pagination);
		renderFocused(renderedAttributes, pagination);
		renderFormatter(renderedAttributes, pagination);
		renderHeight(renderedAttributes, pagination);
		renderHideClass(renderedAttributes, pagination);
		renderPaginationId(renderedAttributes, pagination);
		renderInitialized(renderedAttributes, pagination);
		renderItems(renderedAttributes, pagination);
		renderPaginationLocale(renderedAttributes, pagination);
		renderOffset(renderedAttributes, pagination);
		renderPaginationPage(renderedAttributes, pagination);
		renderRender(renderedAttributes, pagination);
		renderRendered(renderedAttributes, pagination);
		renderSrcNode(renderedAttributes, pagination);
		renderStrings(renderedAttributes, pagination);
		renderTabIndex(renderedAttributes, pagination);
		renderTotal(renderedAttributes, pagination);
		renderUseARIA(renderedAttributes, pagination);
		renderVisible(renderedAttributes, pagination);
		renderWidth(renderedAttributes, pagination);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterBoundingBoxChange(renderedAfterEvents, pagination);
		renderAfterCircularChange(renderedAfterEvents, pagination);
		renderAfterContentBoxChange(renderedAfterEvents, pagination);
		renderAfterCssClassChange(renderedAfterEvents, pagination);
		renderAfterDestroyedChange(renderedAfterEvents, pagination);
		renderAfterDisabledChange(renderedAfterEvents, pagination);
		renderAfterFocusedChange(renderedAfterEvents, pagination);
		renderAfterFormatterChange(renderedAfterEvents, pagination);
		renderAfterHeightChange(renderedAfterEvents, pagination);
		renderAfterHideClassChange(renderedAfterEvents, pagination);
		renderAfterIdChange(renderedAfterEvents, pagination);
		renderAfterInitializedChange(renderedAfterEvents, pagination);
		renderAfterItemsChange(renderedAfterEvents, pagination);
		renderAfterLocaleChange(renderedAfterEvents, pagination);
		renderAfterOffsetChange(renderedAfterEvents, pagination);
		renderAfterPageChange(renderedAfterEvents, pagination);
		renderAfterRenderChange(renderedAfterEvents, pagination);
		renderAfterRenderedChange(renderedAfterEvents, pagination);
		renderAfterSrcNodeChange(renderedAfterEvents, pagination);
		renderAfterStringsChange(renderedAfterEvents, pagination);
		renderAfterTabIndexChange(renderedAfterEvents, pagination);
		renderAfterTotalChange(renderedAfterEvents, pagination);
		renderAfterUseARIAChange(renderedAfterEvents, pagination);
		renderAfterVisibleChange(renderedAfterEvents, pagination);
		renderAfterWidthChange(renderedAfterEvents, pagination);

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

		renderOnBoundingBoxChange(renderedOnEvents, pagination);
		renderOnCircularChange(renderedOnEvents, pagination);
		renderOnContentBoxChange(renderedOnEvents, pagination);
		renderOnCssClassChange(renderedOnEvents, pagination);
		renderOnDestroyedChange(renderedOnEvents, pagination);
		renderOnDisabledChange(renderedOnEvents, pagination);
		renderOnFocusedChange(renderedOnEvents, pagination);
		renderOnFormatterChange(renderedOnEvents, pagination);
		renderOnHeightChange(renderedOnEvents, pagination);
		renderOnHideClassChange(renderedOnEvents, pagination);
		renderOnIdChange(renderedOnEvents, pagination);
		renderOnInitializedChange(renderedOnEvents, pagination);
		renderOnItemsChange(renderedOnEvents, pagination);
		renderOnLocaleChange(renderedOnEvents, pagination);
		renderOnOffsetChange(renderedOnEvents, pagination);
		renderOnPageChange(renderedOnEvents, pagination);
		renderOnRenderChange(renderedOnEvents, pagination);
		renderOnRenderedChange(renderedOnEvents, pagination);
		renderOnSrcNodeChange(renderedOnEvents, pagination);
		renderOnStringsChange(renderedOnEvents, pagination);
		renderOnTabIndexChange(renderedOnEvents, pagination);
		renderOnTotalChange(renderedOnEvents, pagination);
		renderOnUseARIAChange(renderedOnEvents, pagination);
		renderOnVisibleChange(renderedOnEvents, pagination);
		renderOnWidthChange(renderedOnEvents, pagination);

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

	protected void renderBoundingBox(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String boundingBox = pagination.getBoundingBox();

		if (boundingBox != null) {
			renderedAttributes.add(renderString(Pagination.BOUNDING_BOX, boundingBox));
		}
	}

	protected void renderCircular(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean circular = pagination.getCircular();

		if (circular != null) {
			renderedAttributes.add(renderBoolean(Pagination.CIRCULAR, circular));
		}
	}

	protected void renderContentBox(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String contentBox = pagination.getContentBox();

		if (contentBox != null) {
			renderedAttributes.add(renderString(Pagination.CONTENT_BOX, contentBox));
		}
	}

	protected void renderCssClass(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String cssClass = pagination.getCssClass();

		if (cssClass != null) {
			renderedAttributes.add(renderString(Pagination.CSS_CLASS, cssClass));
		}
	}

	protected void renderDestroyed(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean destroyed = pagination.getDestroyed();

		if (destroyed != null) {
			renderedAttributes.add(renderBoolean(Pagination.DESTROYED, destroyed));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean disabled = pagination.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(Pagination.DISABLED, disabled));
		}
	}

	protected void renderFocused(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean focused = pagination.getFocused();

		if (focused != null) {
			renderedAttributes.add(renderBoolean(Pagination.FOCUSED, focused));
		}
	}

	protected void renderFormatter(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object formatter = pagination.getFormatter();

		if (formatter != null) {
			renderedAttributes.add(renderString(Pagination.FORMATTER, formatter));
		}
	}

	protected void renderHeight(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object height = pagination.getHeight();

		if (height != null) {
			renderedAttributes.add(renderString(Pagination.HEIGHT, height));
		}
	}

	protected void renderHideClass(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String hideClass = pagination.getHideClass();

		if (hideClass != null) {
			renderedAttributes.add(renderString(Pagination.HIDE_CLASS, hideClass));
		}
	}

	protected void renderPaginationId(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String paginationId = pagination.getPaginationId();

		if (paginationId != null) {
			renderedAttributes.add(renderString(Pagination.PAGINATION_ID, paginationId));
		}
	}

	protected void renderInitialized(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean initialized = pagination.getInitialized();

		if (initialized != null) {
			renderedAttributes.add(renderBoolean(Pagination.INITIALIZED, initialized));
		}
	}

	protected void renderItems(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object items = pagination.getItems();

		if (items != null) {
			renderedAttributes.add(renderString(Pagination.ITEMS, items));
		}
	}

	protected void renderPaginationLocale(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String paginationLocale = pagination.getPaginationLocale();

		if (paginationLocale != null) {
			renderedAttributes.add(renderString(Pagination.PAGINATION_LOCALE, paginationLocale));
		}
	}

	protected void renderOffset(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object offset = pagination.getOffset();

		if (offset != null) {
			renderedAttributes.add(renderNumber(Pagination.OFFSET, offset));
		}
	}

	protected void renderPaginationPage(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object paginationPage = pagination.getPaginationPage();

		if (paginationPage != null) {
			renderedAttributes.add(renderNumber(Pagination.PAGINATION_PAGE, paginationPage));
		}
	}

	protected void renderRender(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object render = pagination.getRender();

		if (render != null) {
			renderedAttributes.add(renderString(Pagination.RENDER, render));
		}
	}

	protected void renderRendered(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean rendered = pagination.getRendered();

		if (rendered != null) {
			renderedAttributes.add(renderBoolean(Pagination.RENDERED, rendered));
		}
	}

	protected void renderSrcNode(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String srcNode = pagination.getSrcNode();

		if (srcNode != null) {
			renderedAttributes.add(renderString(Pagination.SRC_NODE, srcNode));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object strings = pagination.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(Pagination.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object tabIndex = pagination.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(Pagination.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTotal(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object total = pagination.getTotal();

		if (total != null) {
			renderedAttributes.add(renderNumber(Pagination.TOTAL, total));
		}
	}

	protected void renderUseARIA(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean useARIA = pagination.getUseARIA();

		if (useARIA != null) {
			renderedAttributes.add(renderBoolean(Pagination.USE_ARIA, useARIA));
		}
	}

	protected void renderVisible(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean visible = pagination.getVisible();

		if (visible != null) {
			renderedAttributes.add(renderBoolean(Pagination.VISIBLE, visible));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object width = pagination.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(Pagination.WIDTH, width));
		}
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterBoundingBoxChange = pagination.getAfterBoundingBoxChange();

		if (afterBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
		}
	}

	protected void renderAfterCircularChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterCircularChange = pagination.getAfterCircularChange();

		if (afterCircularChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_CIRCULAR_CHANGE, afterCircularChange));
		}
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterContentBoxChange = pagination.getAfterContentBoxChange();

		if (afterContentBoxChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
		}
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterCssClassChange = pagination.getAfterCssClassChange();

		if (afterCssClassChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
		}
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterDestroyedChange = pagination.getAfterDestroyedChange();

		if (afterDestroyedChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterDisabledChange = pagination.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterFocusedChange = pagination.getAfterFocusedChange();

		if (afterFocusedChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_FOCUSED_CHANGE, afterFocusedChange));
		}
	}

	protected void renderAfterFormatterChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterFormatterChange = pagination.getAfterFormatterChange();

		if (afterFormatterChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_FORMATTER_CHANGE, afterFormatterChange));
		}
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterHeightChange = pagination.getAfterHeightChange();

		if (afterHeightChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_HEIGHT_CHANGE, afterHeightChange));
		}
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterHideClassChange = pagination.getAfterHideClassChange();

		if (afterHideClassChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterIdChange = pagination.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterInitializedChange = pagination.getAfterInitializedChange();

		if (afterInitializedChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
		}
	}

	protected void renderAfterItemsChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterItemsChange = pagination.getAfterItemsChange();

		if (afterItemsChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_ITEMS_CHANGE, afterItemsChange));
		}
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterLocaleChange = pagination.getAfterLocaleChange();

		if (afterLocaleChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_LOCALE_CHANGE, afterLocaleChange));
		}
	}

	protected void renderAfterOffsetChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterOffsetChange = pagination.getAfterOffsetChange();

		if (afterOffsetChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_OFFSET_CHANGE, afterOffsetChange));
		}
	}

	protected void renderAfterPageChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterPageChange = pagination.getAfterPageChange();

		if (afterPageChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_PAGE_CHANGE, afterPageChange));
		}
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterRenderChange = pagination.getAfterRenderChange();

		if (afterRenderChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_RENDER_CHANGE, afterRenderChange));
		}
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterRenderedChange = pagination.getAfterRenderedChange();

		if (afterRenderedChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_RENDERED_CHANGE, afterRenderedChange));
		}
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterSrcNodeChange = pagination.getAfterSrcNodeChange();

		if (afterSrcNodeChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterStringsChange = pagination.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterTabIndexChange = pagination.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTotalChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterTotalChange = pagination.getAfterTotalChange();

		if (afterTotalChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_TOTAL_CHANGE, afterTotalChange));
		}
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterUseARIAChange = pagination.getAfterUseARIAChange();

		if (afterUseARIAChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_USE_ARIACHANGE, afterUseARIAChange));
		}
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterVisibleChange = pagination.getAfterVisibleChange();

		if (afterVisibleChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_VISIBLE_CHANGE, afterVisibleChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterWidthChange = pagination.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(Pagination.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onBoundingBoxChange = pagination.getOnBoundingBoxChange();

		if (onBoundingBoxChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
		}
	}

	protected void renderOnCircularChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onCircularChange = pagination.getOnCircularChange();

		if (onCircularChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_CIRCULAR_CHANGE, onCircularChange));
		}
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onContentBoxChange = pagination.getOnContentBoxChange();

		if (onContentBoxChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
		}
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onCssClassChange = pagination.getOnCssClassChange();

		if (onCssClassChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_CSS_CLASS_CHANGE, onCssClassChange));
		}
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onDestroyedChange = pagination.getOnDestroyedChange();

		if (onDestroyedChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_DESTROYED_CHANGE, onDestroyedChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onDisabledChange = pagination.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onFocusedChange = pagination.getOnFocusedChange();

		if (onFocusedChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_FOCUSED_CHANGE, onFocusedChange));
		}
	}

	protected void renderOnFormatterChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onFormatterChange = pagination.getOnFormatterChange();

		if (onFormatterChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_FORMATTER_CHANGE, onFormatterChange));
		}
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onHeightChange = pagination.getOnHeightChange();

		if (onHeightChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_HEIGHT_CHANGE, onHeightChange));
		}
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onHideClassChange = pagination.getOnHideClassChange();

		if (onHideClassChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_HIDE_CLASS_CHANGE, onHideClassChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onIdChange = pagination.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onInitializedChange = pagination.getOnInitializedChange();

		if (onInitializedChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_INITIALIZED_CHANGE, onInitializedChange));
		}
	}

	protected void renderOnItemsChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onItemsChange = pagination.getOnItemsChange();

		if (onItemsChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_ITEMS_CHANGE, onItemsChange));
		}
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onLocaleChange = pagination.getOnLocaleChange();

		if (onLocaleChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_LOCALE_CHANGE, onLocaleChange));
		}
	}

	protected void renderOnOffsetChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onOffsetChange = pagination.getOnOffsetChange();

		if (onOffsetChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_OFFSET_CHANGE, onOffsetChange));
		}
	}

	protected void renderOnPageChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onPageChange = pagination.getOnPageChange();

		if (onPageChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_PAGE_CHANGE, onPageChange));
		}
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onRenderChange = pagination.getOnRenderChange();

		if (onRenderChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_RENDER_CHANGE, onRenderChange));
		}
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onRenderedChange = pagination.getOnRenderedChange();

		if (onRenderedChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_RENDERED_CHANGE, onRenderedChange));
		}
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onSrcNodeChange = pagination.getOnSrcNodeChange();

		if (onSrcNodeChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_SRC_NODE_CHANGE, onSrcNodeChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onStringsChange = pagination.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onTabIndexChange = pagination.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTotalChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onTotalChange = pagination.getOnTotalChange();

		if (onTotalChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_TOTAL_CHANGE, onTotalChange));
		}
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onUseARIAChange = pagination.getOnUseARIAChange();

		if (onUseARIAChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_USE_ARIACHANGE, onUseARIAChange));
		}
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onVisibleChange = pagination.getOnVisibleChange();

		if (onVisibleChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_VISIBLE_CHANGE, onVisibleChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onWidthChange = pagination.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(Pagination.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

}