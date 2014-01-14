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
package com.liferay.faces.alloy.component.progressbar;

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
public abstract class ProgressBarRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-progressbar";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		ProgressBar progressBar = (ProgressBar) uiComponent;
		encodeHTML(facesContext, progressBar);
		encodeJavaScript(facesContext, progressBar);
	}

	protected abstract void encodeHTML(FacesContext facesContext, ProgressBar progressBar) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, ProgressBar progressBar) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, progressBar);

		bufferedResponseWriter.write("var progressBar = new Y.ProgressBar");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderCssClass(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderHeight(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderMax(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderMin(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderOrientation(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderRatio(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderStep(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderTextNode(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, progressBar);
		responseWriter.write(StringPool.COMMA);
		renderProgressbarValue(responseWriter, progressBar);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, progressBar);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderCssClass(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderString(responseWriter, "cssClass", progressBar.getCssClass());
	}

	protected void renderHeight(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderNumber(responseWriter, "height", progressBar.getHeight());
	}

	protected void renderHideClass(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderString(responseWriter, "hideClass", progressBar.getHideClass());
	}

	protected void renderLabel(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderString(responseWriter, "label", progressBar.getLabel());
	}

	protected void renderMax(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderNumber(responseWriter, "max", progressBar.getMax());
	}

	protected void renderMin(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderNumber(responseWriter, "min", progressBar.getMin());
	}

	protected void renderOrientation(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderString(responseWriter, "orientation", progressBar.getOrientation());
	}

	protected void renderRatio(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderNumber(responseWriter, "ratio", progressBar.getRatio());
	}

	protected void renderRender(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderString(responseWriter, "render", progressBar.getRender());
	}

	protected void renderStep(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderNumber(responseWriter, "step", progressBar.getStep());
	}

	protected void renderTextNode(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderString(responseWriter, "textNode", progressBar.getTextNode());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderBoolean(responseWriter, "useARIA", progressBar.getUseARIA());
	}

	protected void renderProgressbarValue(ResponseWriter responseWriter, ProgressBar progressBar) throws IOException {
		renderString(responseWriter, "progressbarValue", progressBar.getProgressbarValue());
	}

}