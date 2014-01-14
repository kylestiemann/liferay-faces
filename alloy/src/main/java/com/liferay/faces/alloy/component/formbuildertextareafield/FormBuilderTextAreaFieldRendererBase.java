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
package com.liferay.faces.alloy.component.formbuildertextareafield;

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
public abstract class FormBuilderTextAreaFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-textarea";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderTextAreaField formBuilderTextAreaField = (FormBuilderTextAreaField) uiComponent;
		encodeHTML(facesContext, formBuilderTextAreaField);
		encodeJavaScript(facesContext, formBuilderTextAreaField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, formBuilderTextAreaField);

		bufferedResponseWriter.write("var formBuilderTextAreaField = new Y.FormBuilderTextAreaField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderBuilder(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderDataType(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderDropZoneNode(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuildertextareafieldId(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderLabelNode(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderLocalizationMap(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuildertextareafieldParent(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderPredefinedValue(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnly(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderShowLabel(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderTemplate(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderTemplateNode(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderTip(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderTipFlagNode(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderUnique(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderWidth(responseWriter, formBuilderTextAreaField);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, formBuilderTextAreaField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderTextAreaField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderTextAreaField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderTextAreaField.getBuilder());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderTextAreaField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderTextAreaField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderTextAreaField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderTextAreaField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderTextAreaField.getHiddenAttributes());
	}

	protected void renderFormbuildertextareafieldId(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "formbuildertextareafieldId", formBuilderTextAreaField.getFormbuildertextareafieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "label", formBuilderTextAreaField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderTextAreaField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderTextAreaField.getLocalizationMap());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "name", formBuilderTextAreaField.getName());
	}

	protected void renderFormbuildertextareafieldParent(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "formbuildertextareafieldParent", formBuilderTextAreaField.getFormbuildertextareafieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderTextAreaField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderTextAreaField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderTextAreaField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderTextAreaField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderTextAreaField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderTextAreaField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderTextAreaField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderTextAreaField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderTextAreaField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "template", formBuilderTextAreaField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderTextAreaField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "tip", formBuilderTextAreaField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderTextAreaField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "type", formBuilderTextAreaField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderTextAreaField.getUnique());
	}

	protected void renderWidth(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderString(responseWriter, "width", formBuilderTextAreaField.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderTextAreaField.getZIndex());
	}

}