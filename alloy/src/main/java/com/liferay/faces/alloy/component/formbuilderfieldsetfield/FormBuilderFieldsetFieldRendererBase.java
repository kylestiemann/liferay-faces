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
package com.liferay.faces.alloy.component.formbuilderfieldsetfield;

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
public abstract class FormBuilderFieldsetFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-fieldset";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderFieldsetField formBuilderFieldsetField = (FormBuilderFieldsetField) uiComponent;
		encodeHTML(facesContext, formBuilderFieldsetField);
		encodeJavaScript(facesContext, formBuilderFieldsetField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderFieldsetField);

		bufferedResponseWriter.write("var formBuilderFieldsetField = new Y.FormBuilderFieldsetField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBuilder(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDataType(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropZoneNode(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuilderfieldsetfieldId(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelNode(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLocalizationMap(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuilderfieldsetfieldParent(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPredefinedValue(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnly(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowLabel(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplate(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplateNode(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTip(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTipFlagNode(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUnique(bufferedResponseWriter, formBuilderFieldsetField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, formBuilderFieldsetField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderFieldsetField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderFieldsetField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderFieldsetField.getBuilder());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderFieldsetField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderFieldsetField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderFieldsetField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderFieldsetField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderFieldsetField.getHiddenAttributes());
	}

	protected void renderFormbuilderfieldsetfieldId(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "formbuilderfieldsetfieldId", formBuilderFieldsetField.getFormbuilderfieldsetfieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "label", formBuilderFieldsetField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderFieldsetField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderFieldsetField.getLocalizationMap());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "name", formBuilderFieldsetField.getName());
	}

	protected void renderFormbuilderfieldsetfieldParent(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "formbuilderfieldsetfieldParent", formBuilderFieldsetField.getFormbuilderfieldsetfieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderFieldsetField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderFieldsetField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderFieldsetField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderFieldsetField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderFieldsetField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderFieldsetField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderFieldsetField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderFieldsetField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderFieldsetField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "template", formBuilderFieldsetField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderFieldsetField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "tip", formBuilderFieldsetField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderFieldsetField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderString(responseWriter, "type", formBuilderFieldsetField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderFieldsetField.getUnique());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderFieldsetField.getZIndex());
	}

}