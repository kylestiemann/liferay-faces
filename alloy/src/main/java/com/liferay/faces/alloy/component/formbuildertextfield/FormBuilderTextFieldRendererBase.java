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
public abstract class FormBuilderTextFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-text";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		FormBuilderTextField formBuilderTextField = (FormBuilderTextField) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var formBuilderTextField = new A.FormBuilderTextField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderTextField);
		renderBuilder(renrederedAttributes, formBuilderTextField);
		renderControlsToolbar(renrederedAttributes, formBuilderTextField);
		renderDataType(renrederedAttributes, formBuilderTextField);
		renderDisabled(renrederedAttributes, formBuilderTextField);
		renderDropZoneNode(renrederedAttributes, formBuilderTextField);
		renderHiddenAttributes(renrederedAttributes, formBuilderTextField);
		renderFormbuildertextfieldId(renrederedAttributes, formBuilderTextField);
		renderLabel(renrederedAttributes, formBuilderTextField);
		renderLabelNode(renrederedAttributes, formBuilderTextField);
		renderLocalizationMap(renrederedAttributes, formBuilderTextField);
		renderName(renrederedAttributes, formBuilderTextField);
		renderFormbuildertextfieldParent(renrederedAttributes, formBuilderTextField);
		renderPredefinedValue(renrederedAttributes, formBuilderTextField);
		renderReadOnly(renrederedAttributes, formBuilderTextField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderTextField);
		renderRequired(renrederedAttributes, formBuilderTextField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderTextField);
		renderSelected(renrederedAttributes, formBuilderTextField);
		renderShowLabel(renrederedAttributes, formBuilderTextField);
		renderStrings(renrederedAttributes, formBuilderTextField);
		renderTabIndex(renrederedAttributes, formBuilderTextField);
		renderTemplate(renrederedAttributes, formBuilderTextField);
		renderTemplateNode(renrederedAttributes, formBuilderTextField);
		renderTip(renrederedAttributes, formBuilderTextField);
		renderTipFlagNode(renrederedAttributes, formBuilderTextField);
		renderType(renrederedAttributes, formBuilderTextField);
		renderUnique(renrederedAttributes, formBuilderTextField);
		renderWidth(renrederedAttributes, formBuilderTextField);
		renderZIndex(renrederedAttributes, formBuilderTextField);

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

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderTextField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderTextField.getBuilder()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderTextField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderTextField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderTextField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderTextField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderTextField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuildertextfieldId(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getFormbuildertextfieldId() != null) {
			renrederedAttributes.add(renderString("formbuildertextfieldId", formBuilderTextField.getFormbuildertextfieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderTextField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderTextField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderTextField.getLocalizationMap()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderTextField.getName()));
		}
	}

	protected void renderFormbuildertextfieldParent(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getFormbuildertextfieldParent() != null) {
			renrederedAttributes.add(renderString("formbuildertextfieldParent", formBuilderTextField.getFormbuildertextfieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderTextField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderTextField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderTextField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderTextField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderTextField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderTextField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderTextField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderTextField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderTextField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderTextField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderTextField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderTextField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderTextField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderTextField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderTextField.getUnique()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getWidth() != null) {
			renrederedAttributes.add(renderString("width", formBuilderTextField.getWidth()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		if (formBuilderTextField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderTextField.getZIndex()));
		}
	}

}