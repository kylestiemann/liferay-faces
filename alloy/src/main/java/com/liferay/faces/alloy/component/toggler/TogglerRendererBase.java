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
package com.liferay.faces.alloy.component.toggler;

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
public abstract class TogglerRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-toggler";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		Toggler toggler = (Toggler) uiComponent;
		encodeHTML(facesContext, toggler);
		encodeJavaScript(facesContext, toggler);
	}

	protected abstract void encodeHTML(FacesContext facesContext, Toggler toggler) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, Toggler toggler) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, toggler);

		bufferedResponseWriter.write("var toggler = new Y.Toggler");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAnimated(responseWriter, toggler);
		responseWriter.write(StringPool.COMMA);
		renderAnimating(responseWriter, toggler);
		responseWriter.write(StringPool.COMMA);
		renderBindDOMEvents(responseWriter, toggler);
		responseWriter.write(StringPool.COMMA);
		renderContent(responseWriter, toggler);
		responseWriter.write(StringPool.COMMA);
		renderExpanded(responseWriter, toggler);
		responseWriter.write(StringPool.COMMA);
		renderHeader(responseWriter, toggler);
		responseWriter.write(StringPool.COMMA);
		renderTransition(responseWriter, toggler);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, toggler);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAnimated(ResponseWriter responseWriter, Toggler toggler) throws IOException {
		renderBoolean(responseWriter, "animated", toggler.getAnimated());
	}

	protected void renderAnimating(ResponseWriter responseWriter, Toggler toggler) throws IOException {
		renderBoolean(responseWriter, "animating", toggler.getAnimating());
	}

	protected void renderBindDOMEvents(ResponseWriter responseWriter, Toggler toggler) throws IOException {
		renderBoolean(responseWriter, "bindDOMEvents", toggler.getBindDOMEvents());
	}

	protected void renderContent(ResponseWriter responseWriter, Toggler toggler) throws IOException {
		renderString(responseWriter, "content", toggler.getContent());
	}

	protected void renderExpanded(ResponseWriter responseWriter, Toggler toggler) throws IOException {
		renderBoolean(responseWriter, "expanded", toggler.getExpanded());
	}

	protected void renderHeader(ResponseWriter responseWriter, Toggler toggler) throws IOException {
		renderString(responseWriter, "header", toggler.getHeader());
	}

	protected void renderTransition(ResponseWriter responseWriter, Toggler toggler) throws IOException {
		renderObject(responseWriter, "transition", toggler.getTransition());
	}

}