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

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
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

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

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

}