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
package com.liferay.faces.alloy.component.formbuilderfileuploadfield;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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
public abstract class FormBuilderFileUploadFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-upload";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderFileUploadField formBuilderFileUploadField = (FormBuilderFileUploadField) uiComponent;
		encodeHTML(facesContext, formBuilderFileUploadField);
		encodeJavaScript(facesContext, formBuilderFileUploadField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderFileUploadField);

		bufferedResponseWriter.write("var formBuilderFileUploadField = new A.FormBuilderFileUploadField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderFileUploadField);
		renderBuilder(renrederedAttributes, formBuilderFileUploadField);
		renderControlsToolbar(renrederedAttributes, formBuilderFileUploadField);
		renderDataType(renrederedAttributes, formBuilderFileUploadField);
		renderDisabled(renrederedAttributes, formBuilderFileUploadField);
		renderDropZoneNode(renrederedAttributes, formBuilderFileUploadField);
		renderHiddenAttributes(renrederedAttributes, formBuilderFileUploadField);
		renderFormbuilderfileuploadfieldId(renrederedAttributes, formBuilderFileUploadField);
		renderLabel(renrederedAttributes, formBuilderFileUploadField);
		renderLabelNode(renrederedAttributes, formBuilderFileUploadField);
		renderLocalizationMap(renrederedAttributes, formBuilderFileUploadField);
		renderName(renrederedAttributes, formBuilderFileUploadField);
		renderFormbuilderfileuploadfieldParent(renrederedAttributes, formBuilderFileUploadField);
		renderPredefinedValue(renrederedAttributes, formBuilderFileUploadField);
		renderReadOnly(renrederedAttributes, formBuilderFileUploadField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderFileUploadField);
		renderRequired(renrederedAttributes, formBuilderFileUploadField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderFileUploadField);
		renderSelected(renrederedAttributes, formBuilderFileUploadField);
		renderShowLabel(renrederedAttributes, formBuilderFileUploadField);
		renderStrings(renrederedAttributes, formBuilderFileUploadField);
		renderTabIndex(renrederedAttributes, formBuilderFileUploadField);
		renderTemplate(renrederedAttributes, formBuilderFileUploadField);
		renderTemplateNode(renrederedAttributes, formBuilderFileUploadField);
		renderTip(renrederedAttributes, formBuilderFileUploadField);
		renderTipFlagNode(renrederedAttributes, formBuilderFileUploadField);
		renderType(renrederedAttributes, formBuilderFileUploadField);
		renderUnique(renrederedAttributes, formBuilderFileUploadField);
		renderZIndex(renrederedAttributes, formBuilderFileUploadField);

		Iterator<String> it = renrederedAttributes.iterator();

		while (it.hasNext()) {
			bufferedResponseWriter.write(it.next());

			if (it.hasNext()) {
				bufferedResponseWriter.write(StringPool.COMMA);
			}
		}

		bufferedResponseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		bufferedResponseWriter.write(StringPool.CLOSE_PARENTHESIS);
		bufferedResponseWriter.write(".render()");
		bufferedResponseWriter.write(StringPool.SEMICOLON);

		endJavaScript(facesContext);

		handleBuffer(facesContext, formBuilderFileUploadField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderFileUploadField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderFileUploadField.getBuilder()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderFileUploadField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderFileUploadField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderFileUploadField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderFileUploadField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderFileUploadField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuilderfileuploadfieldId(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getFormbuilderfileuploadfieldId() != null) {
			renrederedAttributes.add(renderString("formbuilderfileuploadfieldId", formBuilderFileUploadField.getFormbuilderfileuploadfieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderFileUploadField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderFileUploadField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderFileUploadField.getLocalizationMap()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderFileUploadField.getName()));
		}
	}

	protected void renderFormbuilderfileuploadfieldParent(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getFormbuilderfileuploadfieldParent() != null) {
			renrederedAttributes.add(renderString("formbuilderfileuploadfieldParent", formBuilderFileUploadField.getFormbuilderfileuploadfieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderFileUploadField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderFileUploadField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderFileUploadField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderFileUploadField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderFileUploadField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderFileUploadField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderFileUploadField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderFileUploadField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderFileUploadField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderFileUploadField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderFileUploadField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderFileUploadField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderFileUploadField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderFileUploadField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderFileUploadField.getUnique()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		if (formBuilderFileUploadField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderFileUploadField.getZIndex()));
		}
	}

}