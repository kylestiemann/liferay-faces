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
package com.liferay.faces.alloy.component.togglerdelegate;

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
public abstract class TogglerDelegateRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toggler";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TogglerDelegate togglerDelegate = (TogglerDelegate) uiComponent;
		encodeHTML(facesContext, togglerDelegate);
		encodeJavaScript(facesContext, togglerDelegate);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TogglerDelegate togglerDelegate) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TogglerDelegate togglerDelegate) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, togglerDelegate);

		bufferedResponseWriter.write("var togglerDelegate = new Y.TogglerDelegate");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAnimated(responseWriter, togglerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderCloseAllOnExpand(responseWriter, togglerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderContainer(responseWriter, togglerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderContent(responseWriter, togglerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderExpanded(responseWriter, togglerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderHeader(responseWriter, togglerDelegate);
		responseWriter.write(StringPool.COMMA);
		renderTransition(responseWriter, togglerDelegate);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, togglerDelegate);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAnimated(ResponseWriter responseWriter, TogglerDelegate togglerDelegate) throws IOException {
		renderBoolean(responseWriter, "animated", togglerDelegate.getAnimated());
	}

	protected void renderCloseAllOnExpand(ResponseWriter responseWriter, TogglerDelegate togglerDelegate) throws IOException {
		renderBoolean(responseWriter, "closeAllOnExpand", togglerDelegate.getCloseAllOnExpand());
	}

	protected void renderContainer(ResponseWriter responseWriter, TogglerDelegate togglerDelegate) throws IOException {
		renderString(responseWriter, "container", togglerDelegate.getContainer());
	}

	protected void renderContent(ResponseWriter responseWriter, TogglerDelegate togglerDelegate) throws IOException {
		renderString(responseWriter, "content", togglerDelegate.getContent());
	}

	protected void renderExpanded(ResponseWriter responseWriter, TogglerDelegate togglerDelegate) throws IOException {
		renderBoolean(responseWriter, "expanded", togglerDelegate.getExpanded());
	}

	protected void renderHeader(ResponseWriter responseWriter, TogglerDelegate togglerDelegate) throws IOException {
		renderString(responseWriter, "header", togglerDelegate.getHeader());
	}

	protected void renderTransition(ResponseWriter responseWriter, TogglerDelegate togglerDelegate) throws IOException {
		renderObject(responseWriter, "transition", togglerDelegate.getTransition());
	}

}