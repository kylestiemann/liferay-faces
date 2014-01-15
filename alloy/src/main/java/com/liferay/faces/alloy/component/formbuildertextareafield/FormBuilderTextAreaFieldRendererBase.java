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
package com.liferay.faces.alloy.component.formbuildertextareafield;

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
public abstract class FormBuilderTextAreaFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-textarea";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		FormBuilderTextAreaField formBuilderTextAreaField = (FormBuilderTextAreaField) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var formBuilderTextAreaField = new A.FormBuilderTextAreaField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderTextAreaField);
		renderBuilder(renrederedAttributes, formBuilderTextAreaField);
		renderControlsToolbar(renrederedAttributes, formBuilderTextAreaField);
		renderDataType(renrederedAttributes, formBuilderTextAreaField);
		renderDisabled(renrederedAttributes, formBuilderTextAreaField);
		renderDropZoneNode(renrederedAttributes, formBuilderTextAreaField);
		renderHiddenAttributes(renrederedAttributes, formBuilderTextAreaField);
		renderFormbuildertextareafieldId(renrederedAttributes, formBuilderTextAreaField);
		renderLabel(renrederedAttributes, formBuilderTextAreaField);
		renderLabelNode(renrederedAttributes, formBuilderTextAreaField);
		renderLocalizationMap(renrederedAttributes, formBuilderTextAreaField);
		renderName(renrederedAttributes, formBuilderTextAreaField);
		renderFormbuildertextareafieldParent(renrederedAttributes, formBuilderTextAreaField);
		renderPredefinedValue(renrederedAttributes, formBuilderTextAreaField);
		renderReadOnly(renrederedAttributes, formBuilderTextAreaField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderTextAreaField);
		renderRequired(renrederedAttributes, formBuilderTextAreaField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderTextAreaField);
		renderSelected(renrederedAttributes, formBuilderTextAreaField);
		renderShowLabel(renrederedAttributes, formBuilderTextAreaField);
		renderStrings(renrederedAttributes, formBuilderTextAreaField);
		renderTabIndex(renrederedAttributes, formBuilderTextAreaField);
		renderTemplate(renrederedAttributes, formBuilderTextAreaField);
		renderTemplateNode(renrederedAttributes, formBuilderTextAreaField);
		renderTip(renrederedAttributes, formBuilderTextAreaField);
		renderTipFlagNode(renrederedAttributes, formBuilderTextAreaField);
		renderType(renrederedAttributes, formBuilderTextAreaField);
		renderUnique(renrederedAttributes, formBuilderTextAreaField);
		renderWidth(renrederedAttributes, formBuilderTextAreaField);
		renderZIndex(renrederedAttributes, formBuilderTextAreaField);

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

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderTextAreaField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderTextAreaField.getBuilder()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderTextAreaField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderTextAreaField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderTextAreaField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderTextAreaField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderTextAreaField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuildertextareafieldId(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getFormbuildertextareafieldId() != null) {
			renrederedAttributes.add(renderString("formbuildertextareafieldId", formBuilderTextAreaField.getFormbuildertextareafieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderTextAreaField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderTextAreaField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderTextAreaField.getLocalizationMap()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderTextAreaField.getName()));
		}
	}

	protected void renderFormbuildertextareafieldParent(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getFormbuildertextareafieldParent() != null) {
			renrederedAttributes.add(renderString("formbuildertextareafieldParent", formBuilderTextAreaField.getFormbuildertextareafieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderTextAreaField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderTextAreaField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderTextAreaField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderTextAreaField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderTextAreaField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderTextAreaField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderTextAreaField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderTextAreaField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderTextAreaField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderTextAreaField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderTextAreaField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderTextAreaField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderTextAreaField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderTextAreaField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderTextAreaField.getUnique()));
		}
	}

	protected void renderWidth(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getWidth() != null) {
			renrederedAttributes.add(renderString("width", formBuilderTextAreaField.getWidth()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		if (formBuilderTextAreaField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderTextAreaField.getZIndex()));
		}
	}

}