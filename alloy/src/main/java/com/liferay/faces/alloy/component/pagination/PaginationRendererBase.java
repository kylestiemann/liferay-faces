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

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, pagination);

		bufferedResponseWriter.write("var pagination = new Y.Pagination");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderCircular(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderFormatter(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderItems(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderOffset(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderPaginationPage(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderTotal(responseWriter, pagination);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, pagination);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, pagination);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCircular(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderBoolean(responseWriter, "circular", pagination.getCircular());
	}

	protected void renderCssClass(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderString(responseWriter, "cssClass", pagination.getCssClass());
	}

	protected void renderFormatter(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderString(responseWriter, "formatter", pagination.getFormatter());
	}

	protected void renderHideClass(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderString(responseWriter, "hideClass", pagination.getHideClass());
	}

	protected void renderItems(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderString(responseWriter, "items", pagination.getItems());
	}

	protected void renderOffset(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderNumber(responseWriter, "offset", pagination.getOffset());
	}

	protected void renderPaginationPage(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderNumber(responseWriter, "paginationPage", pagination.getPaginationPage());
	}

	protected void renderRender(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderString(responseWriter, "render", pagination.getRender());
	}

	protected void renderStrings(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderObject(responseWriter, "strings", pagination.getStrings());
	}

	protected void renderTotal(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderNumber(responseWriter, "total", pagination.getTotal());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, Pagination pagination) throws IOException {
		renderBoolean(responseWriter, "useARIA", pagination.getUseARIA());
	}

}