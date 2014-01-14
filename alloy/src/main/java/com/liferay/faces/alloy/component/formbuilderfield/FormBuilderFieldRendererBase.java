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

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderField);

		bufferedResponseWriter.write("var formBuilderField = new Y.FormBuilderField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBuilder(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDataType(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropZoneNode(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuilderfieldId(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelNode(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLocalizationMap(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuilderfieldParent(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPredefinedValue(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnly(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowLabel(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplate(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplateNode(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTip(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTipFlagNode(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUnique(bufferedResponseWriter, formBuilderField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, formBuilderField);

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