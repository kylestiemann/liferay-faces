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
package com.liferay.faces.alloy.component.buttonsearchcancel;

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
public abstract class ButtonSearchCancelRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-button";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ButtonSearchCancel buttonSearchCancel = (ButtonSearchCancel) uiComponent;
		encodeHTML(facesContext, buttonSearchCancel);
		encodeJavaScript(facesContext, buttonSearchCancel);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ButtonSearchCancel buttonSearchCancel) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ButtonSearchCancel buttonSearchCancel) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, buttonSearchCancel);

		bufferedResponseWriter.write("var buttonSearchCancel = new Y.ButtonSearchCancel");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderContainer(bufferedResponseWriter, buttonSearchCancel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderGutter(bufferedResponseWriter, buttonSearchCancel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIconClass(bufferedResponseWriter, buttonSearchCancel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTrigger(bufferedResponseWriter, buttonSearchCancel);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, buttonSearchCancel);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, buttonSearchCancel);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderContainer(ResponseWriter responseWriter, ButtonSearchCancel buttonSearchCancel) throws IOException {
		renderString(responseWriter, "container", buttonSearchCancel.getContainer());
	}

	protected void renderGutter(ResponseWriter responseWriter, ButtonSearchCancel buttonSearchCancel) throws IOException {
		renderArray(responseWriter, "gutter", buttonSearchCancel.getGutter());
	}

	protected void renderIconClass(ResponseWriter responseWriter, ButtonSearchCancel buttonSearchCancel) throws IOException {
		renderString(responseWriter, "iconClass", buttonSearchCancel.getIconClass());
	}

	protected void renderTrigger(ResponseWriter responseWriter, ButtonSearchCancel buttonSearchCancel) throws IOException {
		renderString(responseWriter, "trigger", buttonSearchCancel.getTrigger());
	}

	protected void renderZIndex(ResponseWriter responseWriter, ButtonSearchCancel buttonSearchCancel) throws IOException {
		renderNumber(responseWriter, "zIndex", buttonSearchCancel.getZIndex());
	}

}