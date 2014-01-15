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

		bufferedResponseWriter.write("var formBuilderCheckBoxField = new A.FormBuilderCheckBoxField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderCheckBoxField);
		renderBuilder(renrederedAttributes, formBuilderCheckBoxField);
		renderControlsToolbar(renrederedAttributes, formBuilderCheckBoxField);
		renderDataType(renrederedAttributes, formBuilderCheckBoxField);
		renderDisabled(renrederedAttributes, formBuilderCheckBoxField);
		renderDropZoneNode(renrederedAttributes, formBuilderCheckBoxField);
		renderHiddenAttributes(renrederedAttributes, formBuilderCheckBoxField);
		renderFormbuildercheckboxfieldId(renrederedAttributes, formBuilderCheckBoxField);
		renderLabel(renrederedAttributes, formBuilderCheckBoxField);
		renderLabelNode(renrederedAttributes, formBuilderCheckBoxField);
		renderLocalizationMap(renrederedAttributes, formBuilderCheckBoxField);
		renderName(renrederedAttributes, formBuilderCheckBoxField);
		renderFormbuildercheckboxfieldParent(renrederedAttributes, formBuilderCheckBoxField);
		renderPredefinedValue(renrederedAttributes, formBuilderCheckBoxField);
		renderReadOnly(renrederedAttributes, formBuilderCheckBoxField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderCheckBoxField);
		renderRequired(renrederedAttributes, formBuilderCheckBoxField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderCheckBoxField);
		renderSelected(renrederedAttributes, formBuilderCheckBoxField);
		renderShowLabel(renrederedAttributes, formBuilderCheckBoxField);
		renderStrings(renrederedAttributes, formBuilderCheckBoxField);
		renderTabIndex(renrederedAttributes, formBuilderCheckBoxField);
		renderTemplate(renrederedAttributes, formBuilderCheckBoxField);
		renderTemplateNode(renrederedAttributes, formBuilderCheckBoxField);
		renderTip(renrederedAttributes, formBuilderCheckBoxField);
		renderTipFlagNode(renrederedAttributes, formBuilderCheckBoxField);
		renderType(renrederedAttributes, formBuilderCheckBoxField);
		renderUnique(renrederedAttributes, formBuilderCheckBoxField);
		renderZIndex(renrederedAttributes, formBuilderCheckBoxField);

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

		handleBuffer(facesContext, formBuilderCheckBoxField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderCheckBoxField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderCheckBoxField.getBuilder()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderCheckBoxField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderCheckBoxField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderCheckBoxField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderCheckBoxField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderCheckBoxField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuildercheckboxfieldId(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getFormbuildercheckboxfieldId() != null) {
			renrederedAttributes.add(renderString("formbuildercheckboxfieldId", formBuilderCheckBoxField.getFormbuildercheckboxfieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderCheckBoxField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderCheckBoxField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderCheckBoxField.getLocalizationMap()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderCheckBoxField.getName()));
		}
	}

	protected void renderFormbuildercheckboxfieldParent(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getFormbuildercheckboxfieldParent() != null) {
			renrederedAttributes.add(renderString("formbuildercheckboxfieldParent", formBuilderCheckBoxField.getFormbuildercheckboxfieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderBoolean("predefinedValue", formBuilderCheckBoxField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderCheckBoxField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderCheckBoxField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderCheckBoxField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderCheckBoxField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderCheckBoxField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderCheckBoxField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderCheckBoxField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderCheckBoxField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderCheckBoxField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderCheckBoxField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderCheckBoxField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderCheckBoxField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderCheckBoxField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderCheckBoxField.getUnique()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		if (formBuilderCheckBoxField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderCheckBoxField.getZIndex()));
		}
	}

}