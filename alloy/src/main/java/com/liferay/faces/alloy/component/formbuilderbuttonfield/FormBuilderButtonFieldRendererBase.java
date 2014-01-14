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
package com.liferay.faces.alloy.component.formbuilderbuttonfield;

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
public abstract class FormBuilderButtonFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-button";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderButtonField formBuilderButtonField = (FormBuilderButtonField) uiComponent;
		encodeHTML(facesContext, formBuilderButtonField);
		encodeJavaScript(facesContext, formBuilderButtonField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderButtonField formBuilderButtonField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderButtonField formBuilderButtonField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, formBuilderButtonField);

		bufferedResponseWriter.write("var formBuilderButtonField = new Y.FormBuilderButtonField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderBuilder(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderButtonType(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderDataType(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderDropZoneNode(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuilderbuttonfieldId(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderLabelNode(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderLocalizationMap(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuilderbuttonfieldParent(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderPredefinedValue(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnly(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderShowLabel(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderTemplate(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderTemplateNode(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderTip(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderTipFlagNode(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderUnique(responseWriter, formBuilderButtonField);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, formBuilderButtonField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderButtonField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderButtonField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderButtonField.getBuilder());
	}

	protected void renderButtonType(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "buttonType", formBuilderButtonField.getButtonType());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderButtonField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderButtonField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderButtonField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderButtonField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderButtonField.getHiddenAttributes());
	}

	protected void renderFormbuilderbuttonfieldId(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "formbuilderbuttonfieldId", formBuilderButtonField.getFormbuilderbuttonfieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "label", formBuilderButtonField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderButtonField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderButtonField.getLocalizationMap());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "name", formBuilderButtonField.getName());
	}

	protected void renderFormbuilderbuttonfieldParent(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "formbuilderbuttonfieldParent", formBuilderButtonField.getFormbuilderbuttonfieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderButtonField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderButtonField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderButtonField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderButtonField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderButtonField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderButtonField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderButtonField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderButtonField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderButtonField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "template", formBuilderButtonField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderButtonField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "tip", formBuilderButtonField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderButtonField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderString(responseWriter, "type", formBuilderButtonField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderButtonField.getUnique());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderButtonField formBuilderButtonField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderButtonField.getZIndex());
	}

}