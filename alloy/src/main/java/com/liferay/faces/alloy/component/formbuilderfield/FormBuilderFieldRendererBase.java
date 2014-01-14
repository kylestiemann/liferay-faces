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
package com.liferay.faces.alloy.component.formbuilderfield;

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
public abstract class FormBuilderFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-base";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderField formBuilderField = (FormBuilderField) uiComponent;
		encodeHTML(facesContext, formBuilderField);
		encodeJavaScript(facesContext, formBuilderField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderField formBuilderField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderField formBuilderField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, formBuilderField);

		bufferedResponseWriter.write("var formBuilderField = new Y.FormBuilderField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderBuilder(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderDataType(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderDropZoneNode(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuilderfieldId(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderLabelNode(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderLocalizationMap(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuilderfieldParent(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderPredefinedValue(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnly(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderShowLabel(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderTemplate(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderTemplateNode(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderTip(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderTipFlagNode(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderUnique(responseWriter, formBuilderField);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, formBuilderField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderField.getBuilder());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderField.getHiddenAttributes());
	}

	protected void renderFormbuilderfieldId(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "formbuilderfieldId", formBuilderField.getFormbuilderfieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "label", formBuilderField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderField.getLocalizationMap());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "name", formBuilderField.getName());
	}

	protected void renderFormbuilderfieldParent(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "formbuilderfieldParent", formBuilderField.getFormbuilderfieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "template", formBuilderField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "tip", formBuilderField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderString(responseWriter, "type", formBuilderField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderField.getUnique());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderField formBuilderField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderField.getZIndex());
	}

}