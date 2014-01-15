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
public abstract class FormBuilderSelectFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-select";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		FormBuilderSelectField formBuilderSelectField = (FormBuilderSelectField) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var formBuilderSelectField = new A.FormBuilderSelectField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderSelectField);
		renderBuilder(renrederedAttributes, formBuilderSelectField);
		renderControlsToolbar(renrederedAttributes, formBuilderSelectField);
		renderDataType(renrederedAttributes, formBuilderSelectField);
		renderDisabled(renrederedAttributes, formBuilderSelectField);
		renderDropZoneNode(renrederedAttributes, formBuilderSelectField);
		renderHiddenAttributes(renrederedAttributes, formBuilderSelectField);
		renderFormbuilderselectfieldId(renrederedAttributes, formBuilderSelectField);
		renderLabel(renrederedAttributes, formBuilderSelectField);
		renderLabelNode(renrederedAttributes, formBuilderSelectField);
		renderLocalizationMap(renrederedAttributes, formBuilderSelectField);
		renderMultiple(renrederedAttributes, formBuilderSelectField);
		renderName(renrederedAttributes, formBuilderSelectField);
		renderOptionTemplate(renrederedAttributes, formBuilderSelectField);
		renderOptions(renrederedAttributes, formBuilderSelectField);
		renderFormbuilderselectfieldParent(renrederedAttributes, formBuilderSelectField);
		renderPredefinedValue(renrederedAttributes, formBuilderSelectField);
		renderReadOnly(renrederedAttributes, formBuilderSelectField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderSelectField);
		renderRequired(renrederedAttributes, formBuilderSelectField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderSelectField);
		renderSelected(renrederedAttributes, formBuilderSelectField);
		renderShowLabel(renrederedAttributes, formBuilderSelectField);
		renderStrings(renrederedAttributes, formBuilderSelectField);
		renderTabIndex(renrederedAttributes, formBuilderSelectField);
		renderTemplate(renrederedAttributes, formBuilderSelectField);
		renderTemplateNode(renrederedAttributes, formBuilderSelectField);
		renderTip(renrederedAttributes, formBuilderSelectField);
		renderTipFlagNode(renrederedAttributes, formBuilderSelectField);
		renderType(renrederedAttributes, formBuilderSelectField);
		renderUnique(renrederedAttributes, formBuilderSelectField);
		renderZIndex(renrederedAttributes, formBuilderSelectField);

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
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderSelectField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderSelectField.getBuilder()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderSelectField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderSelectField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderSelectField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderSelectField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderSelectField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuilderselectfieldId(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getFormbuilderselectfieldId() != null) {
			renrederedAttributes.add(renderString("formbuilderselectfieldId", formBuilderSelectField.getFormbuilderselectfieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderSelectField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderSelectField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderSelectField.getLocalizationMap()));
		}
	}

	protected void renderMultiple(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getMultiple() != null) {
			renrederedAttributes.add(renderBoolean("multiple", formBuilderSelectField.getMultiple()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderSelectField.getName()));
		}
	}

	protected void renderOptionTemplate(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getOptionTemplate() != null) {
			renrederedAttributes.add(renderString("optionTemplate", formBuilderSelectField.getOptionTemplate()));
		}
	}

	protected void renderOptions(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getOptions() != null) {
			renrederedAttributes.add(renderObject("options", formBuilderSelectField.getOptions()));
		}
	}

	protected void renderFormbuilderselectfieldParent(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getFormbuilderselectfieldParent() != null) {
			renrederedAttributes.add(renderString("formbuilderselectfieldParent", formBuilderSelectField.getFormbuilderselectfieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderSelectField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderSelectField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderSelectField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderSelectField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderSelectField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderSelectField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderSelectField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderSelectField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderSelectField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderSelectField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderSelectField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderSelectField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderSelectField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderSelectField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderSelectField.getUnique()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		if (formBuilderSelectField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderSelectField.getZIndex()));
		}
	}

}