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
package com.liferay.faces.alloy.component.formbuilderselectfield;

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
public abstract class FormBuilderSelectFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-select";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderSelectField formBuilderSelectField = (FormBuilderSelectField) uiComponent;
		encodeHTML(facesContext, formBuilderSelectField);
		encodeJavaScript(facesContext, formBuilderSelectField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderSelectField formBuilderSelectField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderSelectField formBuilderSelectField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, formBuilderSelectField);

		bufferedResponseWriter.write("var formBuilderSelectField = new Y.FormBuilderSelectField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderBuilder(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderDataType(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderDropZoneNode(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuilderselectfieldId(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderLabelNode(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderLocalizationMap(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderMultiple(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderOptionTemplate(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderOptions(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuilderselectfieldParent(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderPredefinedValue(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnly(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderShowLabel(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderTemplate(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderTemplateNode(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderTip(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderTipFlagNode(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderUnique(responseWriter, formBuilderSelectField);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, formBuilderSelectField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderSelectField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderSelectField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderSelectField.getBuilder());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderSelectField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderSelectField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderSelectField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderSelectField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderSelectField.getHiddenAttributes());
	}

	protected void renderFormbuilderselectfieldId(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "formbuilderselectfieldId", formBuilderSelectField.getFormbuilderselectfieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "label", formBuilderSelectField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderSelectField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderSelectField.getLocalizationMap());
	}

	protected void renderMultiple(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderBoolean(responseWriter, "multiple", formBuilderSelectField.getMultiple());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "name", formBuilderSelectField.getName());
	}

	protected void renderOptionTemplate(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "optionTemplate", formBuilderSelectField.getOptionTemplate());
	}

	protected void renderOptions(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderObject(responseWriter, "options", formBuilderSelectField.getOptions());
	}

	protected void renderFormbuilderselectfieldParent(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "formbuilderselectfieldParent", formBuilderSelectField.getFormbuilderselectfieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderSelectField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderSelectField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderSelectField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderSelectField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderSelectField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderSelectField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderSelectField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderSelectField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderSelectField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "template", formBuilderSelectField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderSelectField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "tip", formBuilderSelectField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderSelectField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderString(responseWriter, "type", formBuilderSelectField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderSelectField.getUnique());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderSelectField formBuilderSelectField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderSelectField.getZIndex());
	}

}