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
package com.liferay.faces.alloy.component.formbuilderbuttonfield;

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
public abstract class FormBuilderButtonFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-button";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent component) throws IOException {
	
		FormBuilderButtonField formBuilderButtonField = (FormBuilderButtonField) component; 

		BufferedResponseWriter bufferedResponseWriter = (BufferedResponseWriter) facesContext.getResponseWriter();

		bufferedResponseWriter.write("var formBuilderButtonField = new A.FormBuilderButtonField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderButtonField);
		renderBuilder(renrederedAttributes, formBuilderButtonField);
		renderButtonType(renrederedAttributes, formBuilderButtonField);
		renderControlsToolbar(renrederedAttributes, formBuilderButtonField);
		renderDataType(renrederedAttributes, formBuilderButtonField);
		renderDisabled(renrederedAttributes, formBuilderButtonField);
		renderDropZoneNode(renrederedAttributes, formBuilderButtonField);
		renderHiddenAttributes(renrederedAttributes, formBuilderButtonField);
		renderFormbuilderbuttonfieldId(renrederedAttributes, formBuilderButtonField);
		renderLabel(renrederedAttributes, formBuilderButtonField);
		renderLabelNode(renrederedAttributes, formBuilderButtonField);
		renderLocalizationMap(renrederedAttributes, formBuilderButtonField);
		renderName(renrederedAttributes, formBuilderButtonField);
		renderFormbuilderbuttonfieldParent(renrederedAttributes, formBuilderButtonField);
		renderPredefinedValue(renrederedAttributes, formBuilderButtonField);
		renderReadOnly(renrederedAttributes, formBuilderButtonField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderButtonField);
		renderRequired(renrederedAttributes, formBuilderButtonField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderButtonField);
		renderSelected(renrederedAttributes, formBuilderButtonField);
		renderShowLabel(renrederedAttributes, formBuilderButtonField);
		renderStrings(renrederedAttributes, formBuilderButtonField);
		renderTabIndex(renrederedAttributes, formBuilderButtonField);
		renderTemplate(renrederedAttributes, formBuilderButtonField);
		renderTemplateNode(renrederedAttributes, formBuilderButtonField);
		renderTip(renrederedAttributes, formBuilderButtonField);
		renderTipFlagNode(renrederedAttributes, formBuilderButtonField);
		renderType(renrederedAttributes, formBuilderButtonField);
		renderUnique(renrederedAttributes, formBuilderButtonField);
		renderZIndex(renrederedAttributes, formBuilderButtonField);

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

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderButtonField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderButtonField.getBuilder()));
		}
	}

	protected void renderButtonType(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getButtonType() != null) {
			renrederedAttributes.add(renderString("buttonType", formBuilderButtonField.getButtonType()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderButtonField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderButtonField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderButtonField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderButtonField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderButtonField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuilderbuttonfieldId(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getFormbuilderbuttonfieldId() != null) {
			renrederedAttributes.add(renderString("formbuilderbuttonfieldId", formBuilderButtonField.getFormbuilderbuttonfieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderButtonField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderButtonField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderButtonField.getLocalizationMap()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderButtonField.getName()));
		}
	}

	protected void renderFormbuilderbuttonfieldParent(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getFormbuilderbuttonfieldParent() != null) {
			renrederedAttributes.add(renderString("formbuilderbuttonfieldParent", formBuilderButtonField.getFormbuilderbuttonfieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderButtonField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderButtonField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderButtonField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderButtonField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderButtonField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderButtonField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderButtonField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderButtonField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderButtonField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderButtonField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderButtonField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderButtonField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderButtonField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderButtonField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderButtonField.getUnique()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		if (formBuilderButtonField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderButtonField.getZIndex()));
		}
	}

}