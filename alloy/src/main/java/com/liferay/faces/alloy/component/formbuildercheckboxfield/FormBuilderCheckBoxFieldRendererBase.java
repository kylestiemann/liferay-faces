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
package com.liferay.faces.alloy.component.formbuildercheckboxfield;

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
public abstract class FormBuilderCheckBoxFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-checkbox";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderCheckBoxField formBuilderCheckBoxField = (FormBuilderCheckBoxField) uiComponent;
		encodeHTML(facesContext, formBuilderCheckBoxField);
		encodeJavaScript(facesContext, formBuilderCheckBoxField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderCheckBoxField);

		bufferedResponseWriter.write("var formBuilderCheckBoxField = new Y.FormBuilderCheckBoxField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBuilder(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDataType(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropZoneNode(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuildercheckboxfieldId(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelNode(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLocalizationMap(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuildercheckboxfieldParent(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPredefinedValue(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnly(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowLabel(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplate(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplateNode(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTip(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTipFlagNode(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUnique(bufferedResponseWriter, formBuilderCheckBoxField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, formBuilderCheckBoxField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderCheckBoxField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderCheckBoxField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderCheckBoxField.getBuilder());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderCheckBoxField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderCheckBoxField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderCheckBoxField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderCheckBoxField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderCheckBoxField.getHiddenAttributes());
	}

	protected void renderFormbuildercheckboxfieldId(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "formbuildercheckboxfieldId", formBuilderCheckBoxField.getFormbuildercheckboxfieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "label", formBuilderCheckBoxField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderCheckBoxField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderCheckBoxField.getLocalizationMap());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "name", formBuilderCheckBoxField.getName());
	}

	protected void renderFormbuildercheckboxfieldParent(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "formbuildercheckboxfieldParent", formBuilderCheckBoxField.getFormbuildercheckboxfieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderBoolean(responseWriter, "predefinedValue", formBuilderCheckBoxField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderCheckBoxField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderCheckBoxField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderCheckBoxField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderCheckBoxField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderCheckBoxField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderCheckBoxField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderCheckBoxField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderCheckBoxField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "template", formBuilderCheckBoxField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderCheckBoxField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "tip", formBuilderCheckBoxField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderCheckBoxField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderString(responseWriter, "type", formBuilderCheckBoxField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderCheckBoxField.getUnique());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderCheckBoxField.getZIndex());
	}

}