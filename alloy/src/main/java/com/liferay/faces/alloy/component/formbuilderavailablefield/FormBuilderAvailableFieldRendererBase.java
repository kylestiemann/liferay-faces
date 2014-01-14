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
package com.liferay.faces.alloy.component.formbuilderavailablefield;

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
public abstract class FormBuilderAvailableFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-base";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderAvailableField formBuilderAvailableField = (FormBuilderAvailableField) uiComponent;
		encodeHTML(facesContext, formBuilderAvailableField);
		encodeJavaScript(facesContext, formBuilderAvailableField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderAvailableField formBuilderAvailableField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderAvailableField formBuilderAvailableField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderAvailableField);

		bufferedResponseWriter.write("var formBuilderAvailableField = new Y.FormBuilderAvailableField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderDraggable(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderIconClass(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuilderavailablefieldId(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderNode(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOptions(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPredefinedValue(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowLabel(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTip(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUnique(bufferedResponseWriter, formBuilderAvailableField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, formBuilderAvailableField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderAvailableField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderDraggable(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderBoolean(responseWriter, "draggable", formBuilderAvailableField.getDraggable());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderAvailableField.getHiddenAttributes());
	}

	protected void renderIconClass(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderString(responseWriter, "iconClass", formBuilderAvailableField.getIconClass());
	}

	protected void renderFormbuilderavailablefieldId(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderString(responseWriter, "formbuilderavailablefieldId", formBuilderAvailableField.getFormbuilderavailablefieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderString(responseWriter, "label", formBuilderAvailableField.getLabel());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderString(responseWriter, "name", formBuilderAvailableField.getName());
	}

	protected void renderNode(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderString(responseWriter, "node", formBuilderAvailableField.getNode());
	}

	protected void renderOptions(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderObject(responseWriter, "options", formBuilderAvailableField.getOptions());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderAvailableField.getPredefinedValue());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderAvailableField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderAvailableField.getRequired());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderAvailableField.getShowLabel());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderString(responseWriter, "tip", formBuilderAvailableField.getTip());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderString(responseWriter, "type", formBuilderAvailableField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderAvailableField.getUnique());
	}

	protected void renderWidth(ResponseWriter responseWriter, FormBuilderAvailableField formBuilderAvailableField) throws IOException {
		renderString(responseWriter, "width", formBuilderAvailableField.getWidth());
	}

}