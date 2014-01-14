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
package com.liferay.faces.alloy.component.autocompletelist;

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
public abstract class AutoCompleteListRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-ace-autocomplete-list";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		AutoCompleteList autoCompleteList = (AutoCompleteList) uiComponent;
		encodeHTML(facesContext, autoCompleteList);
		encodeJavaScript(facesContext, autoCompleteList);
	}

	protected abstract void encodeHTML(FacesContext facesContext, AutoCompleteList autoCompleteList) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, AutoCompleteList autoCompleteList) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, autoCompleteList);

		bufferedResponseWriter.write("var autoCompleteList = new Y.AutoCompleteList");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderHost(bufferedResponseWriter, autoCompleteList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderListNode(bufferedResponseWriter, autoCompleteList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLoadingMessage(bufferedResponseWriter, autoCompleteList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderResults(bufferedResponseWriter, autoCompleteList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelectedEntry(bufferedResponseWriter, autoCompleteList);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, autoCompleteList);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, autoCompleteList);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderHost(ResponseWriter responseWriter, AutoCompleteList autoCompleteList) throws IOException {
		renderObject(responseWriter, "host", autoCompleteList.getHost());
	}

	protected void renderListNode(ResponseWriter responseWriter, AutoCompleteList autoCompleteList) throws IOException {
		renderString(responseWriter, "listNode", autoCompleteList.getListNode());
	}

	protected void renderLoadingMessage(ResponseWriter responseWriter, AutoCompleteList autoCompleteList) throws IOException {
		renderString(responseWriter, "loadingMessage", autoCompleteList.getLoadingMessage());
	}

	protected void renderResults(ResponseWriter responseWriter, AutoCompleteList autoCompleteList) throws IOException {
		renderArray(responseWriter, "results", autoCompleteList.getResults());
	}

	protected void renderSelectedEntry(ResponseWriter responseWriter, AutoCompleteList autoCompleteList) throws IOException {
		renderString(responseWriter, "selectedEntry", autoCompleteList.getSelectedEntry());
	}

	protected void renderStrings(ResponseWriter responseWriter, AutoCompleteList autoCompleteList) throws IOException {
		renderObject(responseWriter, "strings", autoCompleteList.getStrings());
	}

}