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
package com.liferay.faces.alloy.component.toolbar;

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
public abstract class ToolbarRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toolbar";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Toolbar toolbar = (Toolbar) uiComponent;
		encodeHTML(facesContext, toolbar);
		encodeJavaScript(facesContext, toolbar);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Toolbar toolbar) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Toolbar toolbar) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, toolbar);

		bufferedResponseWriter.write("var toolbar = new Y.Toolbar");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderToolbarChildren(bufferedResponseWriter, toolbar);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderCssClass(bufferedResponseWriter, toolbar);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHideClass(bufferedResponseWriter, toolbar);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRender(bufferedResponseWriter, toolbar);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToolbarRenderer(bufferedResponseWriter, toolbar);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUseARIA(bufferedResponseWriter, toolbar);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, toolbar);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderToolbarChildren(ResponseWriter responseWriter, Toolbar toolbar) throws IOException {
		renderArray(responseWriter, "toolbarChildren", toolbar.getToolbarChildren());
	}

	protected void renderCssClass(ResponseWriter responseWriter, Toolbar toolbar) throws IOException {
		renderString(responseWriter, "cssClass", toolbar.getCssClass());
	}

	protected void renderHideClass(ResponseWriter responseWriter, Toolbar toolbar) throws IOException {
		renderString(responseWriter, "hideClass", toolbar.getHideClass());
	}

	protected void renderRender(ResponseWriter responseWriter, Toolbar toolbar) throws IOException {
		renderString(responseWriter, "render", toolbar.getRender());
	}

	protected void renderToolbarRenderer(ResponseWriter responseWriter, Toolbar toolbar) throws IOException {
		renderString(responseWriter, "toolbarRenderer", toolbar.getToolbarRenderer());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, Toolbar toolbar) throws IOException {
		renderBoolean(responseWriter, "useARIA", toolbar.getUseARIA());
	}

}