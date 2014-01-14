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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderSelectField);

		bufferedResponseWriter.write("var formBuilderSelectField = new Y.FormBuilderSelectField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBuilder(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDataType(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropZoneNode(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuilderselectfieldId(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelNode(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLocalizationMap(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderMultiple(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOptionTemplate(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOptions(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuilderselectfieldParent(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPredefinedValue(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnly(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowLabel(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplate(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplateNode(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTip(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTipFlagNode(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUnique(bufferedResponseWriter, formBuilderSelectField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, formBuilderSelectField);

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