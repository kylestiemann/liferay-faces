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
package com.liferay.faces.alloy.component.formbuilder;

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
public abstract class FormBuilderRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-base";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilder formBuilder = (FormBuilder) uiComponent;
		encodeHTML(facesContext, formBuilder);
		encodeJavaScript(facesContext, formBuilder);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilder formBuilder) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilder formBuilder) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, formBuilder);

		bufferedResponseWriter.write("var formBuilder = new Y.FormBuilder");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAllowRemoveRequiredFields(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderAvailableFields(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderAvailableFieldsDragConfig(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderCanvas(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderContentContainer(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderCssClass(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderDropConfig(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderDropContainer(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderEnableEditing(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderFields(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderFieldsContainer(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderFieldsSortableListConfig(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderHideClass(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderMaxFields(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderPropertyList(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderRender(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderTabView(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderToolbar(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderToolbarContainer(responseWriter, formBuilder);
		responseWriter.write(StringPool.COMMA);
		renderUseARIA(responseWriter, formBuilder);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilder);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAllowRemoveRequiredFields(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderBoolean(responseWriter, "allowRemoveRequiredFields", formBuilder.getAllowRemoveRequiredFields());
	}

	protected void renderAvailableFields(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderArray(responseWriter, "availableFields", formBuilder.getAvailableFields());
	}

	protected void renderAvailableFieldsDragConfig(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderObject(responseWriter, "availableFieldsDragConfig", formBuilder.getAvailableFieldsDragConfig());
	}

	protected void renderCanvas(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderString(responseWriter, "canvas", formBuilder.getCanvas());
	}

	protected void renderContentContainer(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderString(responseWriter, "contentContainer", formBuilder.getContentContainer());
	}

	protected void renderCssClass(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderString(responseWriter, "cssClass", formBuilder.getCssClass());
	}

	protected void renderDropConfig(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderObject(responseWriter, "dropConfig", formBuilder.getDropConfig());
	}

	protected void renderDropContainer(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderString(responseWriter, "dropContainer", formBuilder.getDropContainer());
	}

	protected void renderEnableEditing(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderBoolean(responseWriter, "enableEditing", formBuilder.getEnableEditing());
	}

	protected void renderFields(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderArray(responseWriter, "fields", formBuilder.getFields());
	}

	protected void renderFieldsContainer(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderString(responseWriter, "fieldsContainer", formBuilder.getFieldsContainer());
	}

	protected void renderFieldsSortableListConfig(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderObject(responseWriter, "fieldsSortableListConfig", formBuilder.getFieldsSortableListConfig());
	}

	protected void renderHideClass(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderString(responseWriter, "hideClass", formBuilder.getHideClass());
	}

	protected void renderMaxFields(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderNumber(responseWriter, "maxFields", formBuilder.getMaxFields());
	}

	protected void renderPropertyList(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderObject(responseWriter, "propertyList", formBuilder.getPropertyList());
	}

	protected void renderRender(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderString(responseWriter, "render", formBuilder.getRender());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderObject(responseWriter, "strings", formBuilder.getStrings());
	}

	protected void renderTabView(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderObject(responseWriter, "tabView", formBuilder.getTabView());
	}

	protected void renderToolbar(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderObject(responseWriter, "toolbar", formBuilder.getToolbar());
	}

	protected void renderToolbarContainer(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderString(responseWriter, "toolbarContainer", formBuilder.getToolbarContainer());
	}

	protected void renderUseARIA(ResponseWriter responseWriter, FormBuilder formBuilder) throws IOException {
		renderBoolean(responseWriter, "useARIA", formBuilder.getUseARIA());
	}

}