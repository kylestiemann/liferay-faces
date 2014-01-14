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
package com.liferay.faces.alloy.component.modal;

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
public abstract class ModalRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-modal";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Modal modal = (Modal) uiComponent;
		encodeHTML(facesContext, modal);
		encodeJavaScript(facesContext, modal);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Modal modal) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Modal modal) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, modal);

		bufferedResponseWriter.write("var modal = new Y.Modal");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderModalBodyContent(bufferedResponseWriter, modal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDestroyOnHide(bufferedResponseWriter, modal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDraggable(bufferedResponseWriter, modal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderResizable(bufferedResponseWriter, modal);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderToolbars(bufferedResponseWriter, modal);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, modal);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderModalBodyContent(ResponseWriter responseWriter, Modal modal) throws IOException {
		renderString(responseWriter, "modalBodyContent", modal.getModalBodyContent());
	}

	protected void renderDestroyOnHide(ResponseWriter responseWriter, Modal modal) throws IOException {
		renderBoolean(responseWriter, "destroyOnHide", modal.getDestroyOnHide());
	}

	protected void renderDraggable(ResponseWriter responseWriter, Modal modal) throws IOException {
		renderObject(responseWriter, "draggable", modal.getDraggable());
	}

	protected void renderResizable(ResponseWriter responseWriter, Modal modal) throws IOException {
		renderObject(responseWriter, "resizable", modal.getResizable());
	}

	protected void renderToolbars(ResponseWriter responseWriter, Modal modal) throws IOException {
		renderString(responseWriter, "toolbars", modal.getToolbars());
	}

}