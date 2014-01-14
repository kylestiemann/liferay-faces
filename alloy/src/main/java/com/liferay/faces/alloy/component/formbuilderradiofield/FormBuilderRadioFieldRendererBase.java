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
package com.liferay.faces.alloy.component.formbuilderradiofield;

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
public abstract class FormBuilderRadioFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-radio";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderRadioField formBuilderRadioField = (FormBuilderRadioField) uiComponent;
		encodeHTML(facesContext, formBuilderRadioField);
		encodeJavaScript(facesContext, formBuilderRadioField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderRadioField formBuilderRadioField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderRadioField formBuilderRadioField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderRadioField);

		bufferedResponseWriter.write("var formBuilderRadioField = new Y.FormBuilderRadioField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		renderAcceptChildren(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderBuilder(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderControlsToolbar(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDataType(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDisabled(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderDropZoneNode(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderHiddenAttributes(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuilderradiofieldId(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabel(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLabelNode(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderLocalizationMap(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderName(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOptionTemplate(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderOptions(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderFormbuilderradiofieldParent(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderPredefinedValue(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnly(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderReadOnlyAttributes(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequired(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderRequiredFlagNode(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderSelected(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderShowLabel(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderStrings(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTabIndex(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplate(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTemplateNode(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTip(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderTipFlagNode(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderType(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderUnique(bufferedResponseWriter, formBuilderRadioField);
		bufferedResponseWriter.write(StringPool.COMMA);
		renderZIndex(bufferedResponseWriter, formBuilderRadioField);

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderRadioField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderBoolean(responseWriter, "acceptChildren", formBuilderRadioField.getAcceptChildren());
	}

	protected void renderBuilder(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderBoolean(responseWriter, "builder", formBuilderRadioField.getBuilder());
	}

	protected void renderControlsToolbar(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderObject(responseWriter, "controlsToolbar", formBuilderRadioField.getControlsToolbar());
	}

	protected void renderDataType(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "dataType", formBuilderRadioField.getDataType());
	}

	protected void renderDisabled(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderBoolean(responseWriter, "disabled", formBuilderRadioField.getDisabled());
	}

	protected void renderDropZoneNode(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "dropZoneNode", formBuilderRadioField.getDropZoneNode());
	}

	protected void renderHiddenAttributes(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderArray(responseWriter, "hiddenAttributes", formBuilderRadioField.getHiddenAttributes());
	}

	protected void renderFormbuilderradiofieldId(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "formbuilderradiofieldId", formBuilderRadioField.getFormbuilderradiofieldId());
	}

	protected void renderLabel(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "label", formBuilderRadioField.getLabel());
	}

	protected void renderLabelNode(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "labelNode", formBuilderRadioField.getLabelNode());
	}

	protected void renderLocalizationMap(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderObject(responseWriter, "localizationMap", formBuilderRadioField.getLocalizationMap());
	}

	protected void renderName(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "name", formBuilderRadioField.getName());
	}

	protected void renderOptionTemplate(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "optionTemplate", formBuilderRadioField.getOptionTemplate());
	}

	protected void renderOptions(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderObject(responseWriter, "options", formBuilderRadioField.getOptions());
	}

	protected void renderFormbuilderradiofieldParent(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "formbuilderradiofieldParent", formBuilderRadioField.getFormbuilderradiofieldParent());
	}

	protected void renderPredefinedValue(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "predefinedValue", formBuilderRadioField.getPredefinedValue());
	}

	protected void renderReadOnly(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderBoolean(responseWriter, "readOnly", formBuilderRadioField.getReadOnly());
	}

	protected void renderReadOnlyAttributes(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderArray(responseWriter, "readOnlyAttributes", formBuilderRadioField.getReadOnlyAttributes());
	}

	protected void renderRequired(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderBoolean(responseWriter, "required", formBuilderRadioField.getRequired());
	}

	protected void renderRequiredFlagNode(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "requiredFlagNode", formBuilderRadioField.getRequiredFlagNode());
	}

	protected void renderSelected(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderBoolean(responseWriter, "selected", formBuilderRadioField.getSelected());
	}

	protected void renderShowLabel(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderBoolean(responseWriter, "showLabel", formBuilderRadioField.getShowLabel());
	}

	protected void renderStrings(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderObject(responseWriter, "strings", formBuilderRadioField.getStrings());
	}

	protected void renderTabIndex(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderNumber(responseWriter, "tabIndex", formBuilderRadioField.getTabIndex());
	}

	protected void renderTemplate(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "template", formBuilderRadioField.getTemplate());
	}

	protected void renderTemplateNode(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "templateNode", formBuilderRadioField.getTemplateNode());
	}

	protected void renderTip(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "tip", formBuilderRadioField.getTip());
	}

	protected void renderTipFlagNode(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "tipFlagNode", formBuilderRadioField.getTipFlagNode());
	}

	protected void renderType(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderString(responseWriter, "type", formBuilderRadioField.getType());
	}

	protected void renderUnique(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderBoolean(responseWriter, "unique", formBuilderRadioField.getUnique());
	}

	protected void renderZIndex(ResponseWriter responseWriter, FormBuilderRadioField formBuilderRadioField) throws IOException {
		renderNumber(responseWriter, "zIndex", formBuilderRadioField.getZIndex());
	}

}