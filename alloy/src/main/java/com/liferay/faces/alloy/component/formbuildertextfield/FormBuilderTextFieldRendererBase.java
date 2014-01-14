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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderTextField);

		bufferedResponseWriter.write("var formBuilderTextField = new Y.FormBuilderTextField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBuilder(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDataType(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropZoneNode(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuildertextfieldId(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelNode(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLocalizationMap(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuildertextfieldParent(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPredefinedValue(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnly(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowLabel(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplate(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplateNode(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTip(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTipFlagNode(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUnique(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderWidth(bufferedResponseWriter, formBuilderTextField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, formBuilderTextField);

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