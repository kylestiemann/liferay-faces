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
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.AUIRenderer;
import com.liferay.faces.alloy.renderkit.BufferedResponseWriter;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public abstract class PaginationRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-pagination";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Pagination pagination = (Pagination) uiComponent;
		encodeHTML(facesContext, pagination);
		encodeJavaScript(facesContext, pagination);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Pagination pagination) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Pagination pagination) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, pagination);

		bufferedResponseWriter.write("var pagination = new A.Pagination");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderBoundingBox(renrederedAttributes, pagination);
		renderCircular(renrederedAttributes, pagination);
		renderContentBox(renrederedAttributes, pagination);
		renderCssClass(renrederedAttributes, pagination);
		renderDestroyed(renrederedAttributes, pagination);
		renderDisabled(renrederedAttributes, pagination);
		renderFocused(renrederedAttributes, pagination);
		renderFormatter(renrederedAttributes, pagination);
		renderHeight(renrederedAttributes, pagination);
		renderHideClass(renrederedAttributes, pagination);
		renderPaginationId(renrederedAttributes, pagination);
		renderInitialized(renrederedAttributes, pagination);
		renderItems(renrederedAttributes, pagination);
		renderPaginationLocale(renrederedAttributes, pagination);
		renderOffset(renrederedAttributes, pagination);
		renderPaginationPage(renrederedAttributes, pagination);
		renderRender(renrederedAttributes, pagination);
		renderRendered(renrederedAttributes, pagination);
		renderSrcNode(renrederedAttributes, pagination);
		renderStrings(renrederedAttributes, pagination);
		renderTabIndex(renrederedAttributes, pagination);
		renderTotal(renrederedAttributes, pagination);
		renderUseARIA(renrederedAttributes, pagination);
		renderVisible(renrederedAttributes, pagination);
		renderWidth(renrederedAttributes, pagination);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, pagination);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderBoundingBox(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getBoundingBox() != null) {
			renrederedAttributes.add(renderString("boundingBox", pagination.getBoundingBox()));
		}
	}

	protected void renderCircular(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getCircular() != null) {
			renrederedAttributes.add(renderBoolean("circular", pagination.getCircular()));
		}
	}

	protected void renderContentBox(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getContentBox() != null) {
			renrederedAttributes.add(renderString("contentBox", pagination.getContentBox()));
		}
	}

	protected void renderCssClass(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getCssClass() != null) {
			renrederedAttributes.add(renderString("cssClass", pagination.getCssClass()));
		}
	}

	protected void renderDestroyed(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getDestroyed() != null) {
			renrederedAttributes.add(renderBoolean("destroyed", pagination.getDestroyed()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", pagination.getDisabled()));
		}
	}

	protected void renderFocused(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getFocused() != null) {
			renrederedAttributes.add(renderBoolean("focused", pagination.getFocused()));
		}
	}

	protected void renderFormatter(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getFormatter() != null) {
			renrederedAttributes.add(renderString("formatter", pagination.getFormatter()));
		}
	}

	protected void renderHeight(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getHeight() != null) {
			renrederedAttributes.add(renderString("height", pagination.getHeight()));
		}
	}

	protected void renderHideClass(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getHideClass() != null) {
			renrederedAttributes.add(renderString("hideClass", pagination.getHideClass()));
		}
	}

	protected void renderPaginationId(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getPaginationId() != null) {
			renrederedAttributes.add(renderString("paginationId", pagination.getPaginationId()));
		}
	}

	protected void renderInitialized(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getInitialized() != null) {
			renrederedAttributes.add(renderBoolean("initialized", pagination.getInitialized()));
		}
	}

	protected void renderItems(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getItems() != null) {
			renrederedAttributes.add(renderString("items", pagination.getItems()));
		}
	}

	protected void renderPaginationLocale(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getPaginationLocale() != null) {
			renrederedAttributes.add(renderString("paginationLocale", pagination.getPaginationLocale()));
		}
	}

	protected void renderOffset(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getOffset() != null) {
			renrederedAttributes.add(renderNumber("offset", pagination.getOffset()));
		}
	}

	protected void renderPaginationPage(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getPaginationPage() != null) {
			renrederedAttributes.add(renderNumber("paginationPage", pagination.getPaginationPage()));
		}
	}

	protected void renderRender(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getRender() != null) {
			renrederedAttributes.add(renderString("render", pagination.getRender()));
		}
	}

	protected void renderRendered(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getRendered() != null) {
			renrederedAttributes.add(renderBoolean("rendered", pagination.getRendered()));
		}
	}

	protected void renderSrcNode(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getSrcNode() != null) {
			renrederedAttributes.add(renderString("srcNode", pagination.getSrcNode()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", pagination.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", pagination.getTabIndex()));
		}
	}

	protected void renderTotal(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getTotal() != null) {
			renrederedAttributes.add(renderNumber("total", pagination.getTotal()));
		}
	}

	protected void renderUseARIA(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getUseARIA() != null) {
			renrederedAttributes.add(renderBoolean("useARIA", pagination.getUseARIA()));
		}
	}

	protected void renderVisible(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getVisible() != null) {
			renrederedAttributes.add(renderBoolean("visible", pagination.getVisible()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, Pagination pagination) throws IOException {
		if (pagination.getWidth() != null) {
			renrederedAttributes.add(renderString("width", pagination.getWidth()));
		}
	}

}