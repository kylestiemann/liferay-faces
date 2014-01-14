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
package com.liferay.faces.alloy.component.formbuildertextfield;

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
public abstract class FormBuilderTextFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-text";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderTextField formBuilderTextField = (FormBuilderTextField) uiComponent;
		encodeHTML(facesContext, formBuilderTextField);
		encodeJavaScript(facesContext, formBuilderTextField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderTextField formBuilderTextField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderTextField formBuilderTextField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		beginJavaScript(facesContext, formBuilderTextField);

		bufferedResponseWriter.write("var formBuilderTextField = new Y.FormBuilderTextField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderBuilder(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderControlsToolbar(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderDataType(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderDisabled(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderDropZoneNode(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuildertextfieldId(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderLabel(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderLabelNode(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderLocalizationMap(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderName(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderFormbuildertextfieldParent(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderPredefinedValue(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnly(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderRequired(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderSelected(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderShowLabel(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderStrings(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderTabIndex(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderTemplate(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderTemplateNode(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderTip(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderTipFlagNode(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderType(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderUnique(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderWidth(responseWriter, formBuilderTextField);
		responseWriter.write(StringPool.COMMA);
		renderZIndex(responseWriter, formBuilderTextField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderTextField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderTextField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderTextField.getBuilder());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderTextField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderTextField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderTextField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderTextField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderTextField.getHiddenAttributes());
	}

	protected void renderFormbuildertextfieldId(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "formbuildertextfieldId", formBuilderTextField.getFormbuildertextfieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "label", formBuilderTextField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderTextField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderTextField.getLocalizationMap());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "name", formBuilderTextField.getName());
	}

	protected void renderFormbuildertextfieldParent(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "formbuildertextfieldParent", formBuilderTextField.getFormbuildertextfieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderTextField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderTextField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderTextField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderTextField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderTextField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderTextField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderTextField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderTextField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderTextField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "template", formBuilderTextField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderTextField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "tip", formBuilderTextField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderTextField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "type", formBuilderTextField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderTextField.getUnique());
	}

	protected void renderWidth(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderString(responseWriter, "width", formBuilderTextField.getWidth());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderTextField formBuilderTextField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderTextField.getZIndex());
	}

}