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

		bufferedResponseWriter.write("var formBuilderRadioField = new A.FormBuilderRadioField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderRadioField);
		renderBuilder(renrederedAttributes, formBuilderRadioField);
		renderControlsToolbar(renrederedAttributes, formBuilderRadioField);
		renderDataType(renrederedAttributes, formBuilderRadioField);
		renderDisabled(renrederedAttributes, formBuilderRadioField);
		renderDropZoneNode(renrederedAttributes, formBuilderRadioField);
		renderHiddenAttributes(renrederedAttributes, formBuilderRadioField);
		renderFormbuilderradiofieldId(renrederedAttributes, formBuilderRadioField);
		renderLabel(renrederedAttributes, formBuilderRadioField);
		renderLabelNode(renrederedAttributes, formBuilderRadioField);
		renderLocalizationMap(renrederedAttributes, formBuilderRadioField);
		renderName(renrederedAttributes, formBuilderRadioField);
		renderOptionTemplate(renrederedAttributes, formBuilderRadioField);
		renderOptions(renrederedAttributes, formBuilderRadioField);
		renderFormbuilderradiofieldParent(renrederedAttributes, formBuilderRadioField);
		renderPredefinedValue(renrederedAttributes, formBuilderRadioField);
		renderReadOnly(renrederedAttributes, formBuilderRadioField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderRadioField);
		renderRequired(renrederedAttributes, formBuilderRadioField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderRadioField);
		renderSelected(renrederedAttributes, formBuilderRadioField);
		renderShowLabel(renrederedAttributes, formBuilderRadioField);
		renderStrings(renrederedAttributes, formBuilderRadioField);
		renderTabIndex(renrederedAttributes, formBuilderRadioField);
		renderTemplate(renrederedAttributes, formBuilderRadioField);
		renderTemplateNode(renrederedAttributes, formBuilderRadioField);
		renderTip(renrederedAttributes, formBuilderRadioField);
		renderTipFlagNode(renrederedAttributes, formBuilderRadioField);
		renderType(renrederedAttributes, formBuilderRadioField);
		renderUnique(renrederedAttributes, formBuilderRadioField);
		renderZIndex(renrederedAttributes, formBuilderRadioField);

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

		handleBuffer(facesContext, formBuilderRadioField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderRadioField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderRadioField.getBuilder()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderRadioField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderRadioField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderRadioField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderRadioField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderRadioField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuilderradiofieldId(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getFormbuilderradiofieldId() != null) {
			renrederedAttributes.add(renderString("formbuilderradiofieldId", formBuilderRadioField.getFormbuilderradiofieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderRadioField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderRadioField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderRadioField.getLocalizationMap()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderRadioField.getName()));
		}
	}

	protected void renderOptionTemplate(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getOptionTemplate() != null) {
			renrederedAttributes.add(renderString("optionTemplate", formBuilderRadioField.getOptionTemplate()));
		}
	}

	protected void renderOptions(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getOptions() != null) {
			renrederedAttributes.add(renderObject("options", formBuilderRadioField.getOptions()));
		}
	}

	protected void renderFormbuilderradiofieldParent(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getFormbuilderradiofieldParent() != null) {
			renrederedAttributes.add(renderString("formbuilderradiofieldParent", formBuilderRadioField.getFormbuilderradiofieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderRadioField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderRadioField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderRadioField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderRadioField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderRadioField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderRadioField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderRadioField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderRadioField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderRadioField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderRadioField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderRadioField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderRadioField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderRadioField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderRadioField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderRadioField.getUnique()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		if (formBuilderRadioField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderRadioField.getZIndex()));
		}
	}

}