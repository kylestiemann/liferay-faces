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
package com.liferay.faces.alloy.component.tooltipdelegate;

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
public abstract class TooltipDelegateRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-tooltip";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		TooltipDelegate tooltipDelegate = (TooltipDelegate) uiComponent;
		encodeHTML(facesContext, tooltipDelegate);
		encodeJavaScript(facesContext, tooltipDelegate);
	}

	protected abstract void encodeHTML(FacesContext facesContext, TooltipDelegate tooltipDelegate) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, TooltipDelegate tooltipDelegate) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, tooltipDelegate);

		bufferedResponseWriter.write("var tooltipDelegate = new Y.TooltipDelegate");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAlign(responseWriter, tooltipDelegate);
		responseWriter.write(StringPool.COMMA);
		renderContainer(responseWriter, tooltipDelegate);
		responseWriter.write(StringPool.COMMA);
		renderDuration(responseWriter, tooltipDelegate);
		responseWriter.write(StringPool.COMMA);
		renderOpacity(responseWriter, tooltipDelegate);
		responseWriter.write(StringPool.COMMA);
		renderTriggerHideEvent(responseWriter, tooltipDelegate);
		responseWriter.write(StringPool.COMMA);
		renderTriggerShowEvent(responseWriter, tooltipDelegate);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, tooltipDelegate);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, tooltipDelegate);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAlign(ResponseWriter responseWriter, TooltipDelegate tooltipDelegate) throws IOException {
		renderObject(responseWriter, "align", tooltipDelegate.getAlign());
	}

	protected void renderContainer(ResponseWriter responseWriter, TooltipDelegate tooltipDelegate) throws IOException {
		renderString(responseWriter, "container", tooltipDelegate.getContainer());
	}

	protected void renderDuration(ResponseWriter responseWriter, TooltipDelegate tooltipDelegate) throws IOException {
		renderString(responseWriter, "duration", tooltipDelegate.getDuration());
	}

	protected void renderOpacity(ResponseWriter responseWriter, TooltipDelegate tooltipDelegate) throws IOException {
		renderString(responseWriter, "opacity", tooltipDelegate.getOpacity());
	}

	protected void renderTriggerHideEvent(ResponseWriter responseWriter, TooltipDelegate tooltipDelegate) throws IOException {
		renderString(responseWriter, "triggerHideEvent", tooltipDelegate.getTriggerHideEvent());
	}

	protected void renderTriggerShowEvent(ResponseWriter responseWriter, TooltipDelegate tooltipDelegate) throws IOException {
		renderString(responseWriter, "triggerShowEvent", tooltipDelegate.getTriggerShowEvent());
	}

	protected void renderZIndex(ResponseWriter responseWriter, TooltipDelegate tooltipDelegate) throws IOException {
		renderString(responseWriter, "zIndex", tooltipDelegate.getZIndex());
	}

}