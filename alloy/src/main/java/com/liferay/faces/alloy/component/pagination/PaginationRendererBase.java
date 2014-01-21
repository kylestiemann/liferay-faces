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

		if (pagination.getBoundingBox() != null) {
			renderBoundingBox(renderedAttributes, pagination);
		}

		if (pagination.getCircular() != null) {
			renderCircular(renderedAttributes, pagination);
		}

		if (pagination.getContentBox() != null) {
			renderContentBox(renderedAttributes, pagination);
		}

		if (pagination.getCssClass() != null) {
			renderCssClass(renderedAttributes, pagination);
		}

		if (pagination.getDestroyed() != null) {
			renderDestroyed(renderedAttributes, pagination);
		}

		if (pagination.getDisabled() != null) {
			renderDisabled(renderedAttributes, pagination);
		}

		if (pagination.getFocused() != null) {
			renderFocused(renderedAttributes, pagination);
		}

		if (pagination.getFormatter() != null) {
			renderFormatter(renderedAttributes, pagination);
		}

		if (pagination.getHeight() != null) {
			renderHeight(renderedAttributes, pagination);
		}

		if (pagination.getHideClass() != null) {
			renderHideClass(renderedAttributes, pagination);
		}

		if (pagination.getPaginationId() != null) {
			renderPaginationId(renderedAttributes, pagination);
		}

		if (pagination.getInitialized() != null) {
			renderInitialized(renderedAttributes, pagination);
		}

		if (pagination.getItems() != null) {
			renderItems(renderedAttributes, pagination);
		}

		if (pagination.getPaginationLocale() != null) {
			renderPaginationLocale(renderedAttributes, pagination);
		}

		if (pagination.getOffset() != null) {
			renderOffset(renderedAttributes, pagination);
		}

		if (pagination.getPaginationPage() != null) {
			renderPaginationPage(renderedAttributes, pagination);
		}

		if (pagination.getRender() != null) {
			renderRender(renderedAttributes, pagination);
		}

		if (pagination.getRendered() != null) {
			renderRendered(renderedAttributes, pagination);
		}

		if (pagination.getSrcNode() != null) {
			renderSrcNode(renderedAttributes, pagination);
		}

		if (pagination.getStrings() != null) {
			renderStrings(renderedAttributes, pagination);
		}

		if (pagination.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, pagination);
		}

		if (pagination.getTotal() != null) {
			renderTotal(renderedAttributes, pagination);
		}

		if (pagination.getUseARIA() != null) {
			renderUseARIA(renderedAttributes, pagination);
		}

		if (pagination.getVisible() != null) {
			renderVisible(renderedAttributes, pagination);
		}

		if (pagination.getWidth() != null) {
			renderWidth(renderedAttributes, pagination);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (pagination.getAfterBoundingBoxChange() != null) {
			renderAfterBoundingBoxChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterCircularChange() != null) {
			renderAfterCircularChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterContentBoxChange() != null) {
			renderAfterContentBoxChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterCssClassChange() != null) {
			renderAfterCssClassChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterDestroyedChange() != null) {
			renderAfterDestroyedChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterFocusedChange() != null) {
			renderAfterFocusedChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterFormatterChange() != null) {
			renderAfterFormatterChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterHeightChange() != null) {
			renderAfterHeightChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterHideClassChange() != null) {
			renderAfterHideClassChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterInitializedChange() != null) {
			renderAfterInitializedChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterItemsChange() != null) {
			renderAfterItemsChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterLocaleChange() != null) {
			renderAfterLocaleChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterOffsetChange() != null) {
			renderAfterOffsetChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterPageChange() != null) {
			renderAfterPageChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterRenderChange() != null) {
			renderAfterRenderChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterRenderedChange() != null) {
			renderAfterRenderedChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterSrcNodeChange() != null) {
			renderAfterSrcNodeChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterTotalChange() != null) {
			renderAfterTotalChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterUseARIAChange() != null) {
			renderAfterUseARIAChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterVisibleChange() != null) {
			renderAfterVisibleChange(renderedAfterEvents, pagination);
		}

		if (pagination.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, pagination);
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

		if (pagination.getOnBoundingBoxChange() != null) {
			renderOnBoundingBoxChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnCircularChange() != null) {
			renderOnCircularChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnContentBoxChange() != null) {
			renderOnContentBoxChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnCssClassChange() != null) {
			renderOnCssClassChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnDestroyedChange() != null) {
			renderOnDestroyedChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnFocusedChange() != null) {
			renderOnFocusedChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnFormatterChange() != null) {
			renderOnFormatterChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnHeightChange() != null) {
			renderOnHeightChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnHideClassChange() != null) {
			renderOnHideClassChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnInitializedChange() != null) {
			renderOnInitializedChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnItemsChange() != null) {
			renderOnItemsChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnLocaleChange() != null) {
			renderOnLocaleChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnOffsetChange() != null) {
			renderOnOffsetChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnPageChange() != null) {
			renderOnPageChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnRenderChange() != null) {
			renderOnRenderChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnRenderedChange() != null) {
			renderOnRenderedChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnSrcNodeChange() != null) {
			renderOnSrcNodeChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnTotalChange() != null) {
			renderOnTotalChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnUseARIAChange() != null) {
			renderOnUseARIAChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnVisibleChange() != null) {
			renderOnVisibleChange(renderedOnEvents, pagination);
		}

		if (pagination.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, pagination);
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

	protected void renderBoundingBox(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String boundingBox = pagination.getBoundingBox();
		renderedAttributes.add(renderString(Pagination.BOUNDING_BOX, boundingBox));
	}

	protected void renderCircular(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean circular = pagination.getCircular();
		renderedAttributes.add(renderBoolean(Pagination.CIRCULAR, circular));
	}

	protected void renderContentBox(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String contentBox = pagination.getContentBox();
		renderedAttributes.add(renderString(Pagination.CONTENT_BOX, contentBox));
	}

	protected void renderCssClass(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String cssClass = pagination.getCssClass();
		renderedAttributes.add(renderString(Pagination.CSS_CLASS, cssClass));
	}

	protected void renderDestroyed(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean destroyed = pagination.getDestroyed();
		renderedAttributes.add(renderBoolean(Pagination.DESTROYED, destroyed));
	}

	protected void renderDisabled(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean disabled = pagination.getDisabled();
		renderedAttributes.add(renderBoolean(Pagination.DISABLED, disabled));
	}

	protected void renderFocused(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean focused = pagination.getFocused();
		renderedAttributes.add(renderBoolean(Pagination.FOCUSED, focused));
	}

	protected void renderFormatter(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object formatter = pagination.getFormatter();
		renderedAttributes.add(renderString(Pagination.FORMATTER, formatter));
	}

	protected void renderHeight(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object height = pagination.getHeight();
		renderedAttributes.add(renderString(Pagination.HEIGHT, height));
	}

	protected void renderHideClass(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String hideClass = pagination.getHideClass();
		renderedAttributes.add(renderString(Pagination.HIDE_CLASS, hideClass));
	}

	protected void renderPaginationId(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String paginationId = pagination.getPaginationId();
		renderedAttributes.add(renderString(Pagination.PAGINATION_ID, paginationId));
	}

	protected void renderInitialized(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean initialized = pagination.getInitialized();
		renderedAttributes.add(renderBoolean(Pagination.INITIALIZED, initialized));
	}

	protected void renderItems(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object items = pagination.getItems();
		renderedAttributes.add(renderString(Pagination.ITEMS, items));
	}

	protected void renderPaginationLocale(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String paginationLocale = pagination.getPaginationLocale();
		renderedAttributes.add(renderString(Pagination.PAGINATION_LOCALE, paginationLocale));
	}

	protected void renderOffset(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object offset = pagination.getOffset();
		renderedAttributes.add(renderNumber(Pagination.OFFSET, offset));
	}

	protected void renderPaginationPage(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object paginationPage = pagination.getPaginationPage();
		renderedAttributes.add(renderNumber(Pagination.PAGINATION_PAGE, paginationPage));
	}

	protected void renderRender(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object render = pagination.getRender();
		renderedAttributes.add(renderString(Pagination.RENDER, render));
	}

	protected void renderRendered(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean rendered = pagination.getRendered();
		renderedAttributes.add(renderBoolean(Pagination.RENDERED, rendered));
	}

	protected void renderSrcNode(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String srcNode = pagination.getSrcNode();
		renderedAttributes.add(renderString(Pagination.SRC_NODE, srcNode));
	}

	protected void renderStrings(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object strings = pagination.getStrings();
		renderedAttributes.add(renderObject(Pagination.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object tabIndex = pagination.getTabIndex();
		renderedAttributes.add(renderNumber(Pagination.TAB_INDEX, tabIndex));
	}

	protected void renderTotal(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object total = pagination.getTotal();
		renderedAttributes.add(renderNumber(Pagination.TOTAL, total));
	}

	protected void renderUseARIA(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean useARIA = pagination.getUseARIA();
		renderedAttributes.add(renderBoolean(Pagination.USE_ARIA, useARIA));
	}

	protected void renderVisible(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Boolean visible = pagination.getVisible();
		renderedAttributes.add(renderBoolean(Pagination.VISIBLE, visible));
	}

	protected void renderWidth(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.Object width = pagination.getWidth();
		renderedAttributes.add(renderString(Pagination.WIDTH, width));
	}

	protected void renderAfterBoundingBoxChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterBoundingBoxChange = pagination.getAfterBoundingBoxChange();
		renderedAttributes.add(renderString(Pagination.AFTER_BOUNDING_BOX_CHANGE, afterBoundingBoxChange));
	}

	protected void renderAfterCircularChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterCircularChange = pagination.getAfterCircularChange();
		renderedAttributes.add(renderString(Pagination.AFTER_CIRCULAR_CHANGE, afterCircularChange));
	}

	protected void renderAfterContentBoxChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterContentBoxChange = pagination.getAfterContentBoxChange();
		renderedAttributes.add(renderString(Pagination.AFTER_CONTENT_BOX_CHANGE, afterContentBoxChange));
	}

	protected void renderAfterCssClassChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterCssClassChange = pagination.getAfterCssClassChange();
		renderedAttributes.add(renderString(Pagination.AFTER_CSS_CLASS_CHANGE, afterCssClassChange));
	}

	protected void renderAfterDestroyedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterDestroyedChange = pagination.getAfterDestroyedChange();
		renderedAttributes.add(renderString(Pagination.AFTER_DESTROYED_CHANGE, afterDestroyedChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterDisabledChange = pagination.getAfterDisabledChange();
		renderedAttributes.add(renderString(Pagination.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterFocusedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterFocusedChange = pagination.getAfterFocusedChange();
		renderedAttributes.add(renderString(Pagination.AFTER_FOCUSED_CHANGE, afterFocusedChange));
	}

	protected void renderAfterFormatterChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterFormatterChange = pagination.getAfterFormatterChange();
		renderedAttributes.add(renderString(Pagination.AFTER_FORMATTER_CHANGE, afterFormatterChange));
	}

	protected void renderAfterHeightChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterHeightChange = pagination.getAfterHeightChange();
		renderedAttributes.add(renderString(Pagination.AFTER_HEIGHT_CHANGE, afterHeightChange));
	}

	protected void renderAfterHideClassChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterHideClassChange = pagination.getAfterHideClassChange();
		renderedAttributes.add(renderString(Pagination.AFTER_HIDE_CLASS_CHANGE, afterHideClassChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterIdChange = pagination.getAfterIdChange();
		renderedAttributes.add(renderString(Pagination.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterInitializedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterInitializedChange = pagination.getAfterInitializedChange();
		renderedAttributes.add(renderString(Pagination.AFTER_INITIALIZED_CHANGE, afterInitializedChange));
	}

	protected void renderAfterItemsChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterItemsChange = pagination.getAfterItemsChange();
		renderedAttributes.add(renderString(Pagination.AFTER_ITEMS_CHANGE, afterItemsChange));
	}

	protected void renderAfterLocaleChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterLocaleChange = pagination.getAfterLocaleChange();
		renderedAttributes.add(renderString(Pagination.AFTER_LOCALE_CHANGE, afterLocaleChange));
	}

	protected void renderAfterOffsetChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterOffsetChange = pagination.getAfterOffsetChange();
		renderedAttributes.add(renderString(Pagination.AFTER_OFFSET_CHANGE, afterOffsetChange));
	}

	protected void renderAfterPageChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterPageChange = pagination.getAfterPageChange();
		renderedAttributes.add(renderString(Pagination.AFTER_PAGE_CHANGE, afterPageChange));
	}

	protected void renderAfterRenderChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterRenderChange = pagination.getAfterRenderChange();
		renderedAttributes.add(renderString(Pagination.AFTER_RENDER_CHANGE, afterRenderChange));
	}

	protected void renderAfterRenderedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterRenderedChange = pagination.getAfterRenderedChange();
		renderedAttributes.add(renderString(Pagination.AFTER_RENDERED_CHANGE, afterRenderedChange));
	}

	protected void renderAfterSrcNodeChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterSrcNodeChange = pagination.getAfterSrcNodeChange();
		renderedAttributes.add(renderString(Pagination.AFTER_SRC_NODE_CHANGE, afterSrcNodeChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterStringsChange = pagination.getAfterStringsChange();
		renderedAttributes.add(renderString(Pagination.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterTabIndexChange = pagination.getAfterTabIndexChange();
		renderedAttributes.add(renderString(Pagination.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTotalChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterTotalChange = pagination.getAfterTotalChange();
		renderedAttributes.add(renderString(Pagination.AFTER_TOTAL_CHANGE, afterTotalChange));
	}

	protected void renderAfterUseARIAChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterUseARIAChange = pagination.getAfterUseARIAChange();
		renderedAttributes.add(renderString(Pagination.AFTER_USE_ARIACHANGE, afterUseARIAChange));
	}

	protected void renderAfterVisibleChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterVisibleChange = pagination.getAfterVisibleChange();
		renderedAttributes.add(renderString(Pagination.AFTER_VISIBLE_CHANGE, afterVisibleChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String afterWidthChange = pagination.getAfterWidthChange();
		renderedAttributes.add(renderString(Pagination.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderOnBoundingBoxChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onBoundingBoxChange = pagination.getOnBoundingBoxChange();
		renderedAttributes.add(renderString(Pagination.ON_BOUNDING_BOX_CHANGE, onBoundingBoxChange));
	}

	protected void renderOnCircularChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onCircularChange = pagination.getOnCircularChange();
		renderedAttributes.add(renderString(Pagination.ON_CIRCULAR_CHANGE, onCircularChange));
	}

	protected void renderOnContentBoxChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onContentBoxChange = pagination.getOnContentBoxChange();
		renderedAttributes.add(renderString(Pagination.ON_CONTENT_BOX_CHANGE, onContentBoxChange));
	}

	protected void renderOnCssClassChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onCssClassChange = pagination.getOnCssClassChange();
		renderedAttributes.add(renderString(Pagination.ON_CSS_CLASS_CHANGE, onCssClassChange));
	}

	protected void renderOnDestroyedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onDestroyedChange = pagination.getOnDestroyedChange();
		renderedAttributes.add(renderString(Pagination.ON_DESTROYED_CHANGE, onDestroyedChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onDisabledChange = pagination.getOnDisabledChange();
		renderedAttributes.add(renderString(Pagination.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnFocusedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onFocusedChange = pagination.getOnFocusedChange();
		renderedAttributes.add(renderString(Pagination.ON_FOCUSED_CHANGE, onFocusedChange));
	}

	protected void renderOnFormatterChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onFormatterChange = pagination.getOnFormatterChange();
		renderedAttributes.add(renderString(Pagination.ON_FORMATTER_CHANGE, onFormatterChange));
	}

	protected void renderOnHeightChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onHeightChange = pagination.getOnHeightChange();
		renderedAttributes.add(renderString(Pagination.ON_HEIGHT_CHANGE, onHeightChange));
	}

	protected void renderOnHideClassChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onHideClassChange = pagination.getOnHideClassChange();
		renderedAttributes.add(renderString(Pagination.ON_HIDE_CLASS_CHANGE, onHideClassChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onIdChange = pagination.getOnIdChange();
		renderedAttributes.add(renderString(Pagination.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnInitializedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onInitializedChange = pagination.getOnInitializedChange();
		renderedAttributes.add(renderString(Pagination.ON_INITIALIZED_CHANGE, onInitializedChange));
	}

	protected void renderOnItemsChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onItemsChange = pagination.getOnItemsChange();
		renderedAttributes.add(renderString(Pagination.ON_ITEMS_CHANGE, onItemsChange));
	}

	protected void renderOnLocaleChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onLocaleChange = pagination.getOnLocaleChange();
		renderedAttributes.add(renderString(Pagination.ON_LOCALE_CHANGE, onLocaleChange));
	}

	protected void renderOnOffsetChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onOffsetChange = pagination.getOnOffsetChange();
		renderedAttributes.add(renderString(Pagination.ON_OFFSET_CHANGE, onOffsetChange));
	}

	protected void renderOnPageChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onPageChange = pagination.getOnPageChange();
		renderedAttributes.add(renderString(Pagination.ON_PAGE_CHANGE, onPageChange));
	}

	protected void renderOnRenderChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onRenderChange = pagination.getOnRenderChange();
		renderedAttributes.add(renderString(Pagination.ON_RENDER_CHANGE, onRenderChange));
	}

	protected void renderOnRenderedChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onRenderedChange = pagination.getOnRenderedChange();
		renderedAttributes.add(renderString(Pagination.ON_RENDERED_CHANGE, onRenderedChange));
	}

	protected void renderOnSrcNodeChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onSrcNodeChange = pagination.getOnSrcNodeChange();
		renderedAttributes.add(renderString(Pagination.ON_SRC_NODE_CHANGE, onSrcNodeChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onStringsChange = pagination.getOnStringsChange();
		renderedAttributes.add(renderString(Pagination.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onTabIndexChange = pagination.getOnTabIndexChange();
		renderedAttributes.add(renderString(Pagination.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTotalChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onTotalChange = pagination.getOnTotalChange();
		renderedAttributes.add(renderString(Pagination.ON_TOTAL_CHANGE, onTotalChange));
	}

	protected void renderOnUseARIAChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onUseARIAChange = pagination.getOnUseARIAChange();
		renderedAttributes.add(renderString(Pagination.ON_USE_ARIACHANGE, onUseARIAChange));
	}

	protected void renderOnVisibleChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onVisibleChange = pagination.getOnVisibleChange();
		renderedAttributes.add(renderString(Pagination.ON_VISIBLE_CHANGE, onVisibleChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, Pagination pagination) throws IOException {
		java.lang.String onWidthChange = pagination.getOnWidthChange();
		renderedAttributes.add(renderString(Pagination.ON_WIDTH_CHANGE, onWidthChange));
	}

}