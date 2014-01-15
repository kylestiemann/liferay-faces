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

		bufferedResponseWriter.write("var formBuilderFieldsetField = new A.FormBuilderFieldsetField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderFieldsetField);
		renderBuilder(renrederedAttributes, formBuilderFieldsetField);
		renderControlsToolbar(renrederedAttributes, formBuilderFieldsetField);
		renderDataType(renrederedAttributes, formBuilderFieldsetField);
		renderDisabled(renrederedAttributes, formBuilderFieldsetField);
		renderDropZoneNode(renrederedAttributes, formBuilderFieldsetField);
		renderHiddenAttributes(renrederedAttributes, formBuilderFieldsetField);
		renderFormbuilderfieldsetfieldId(renrederedAttributes, formBuilderFieldsetField);
		renderLabel(renrederedAttributes, formBuilderFieldsetField);
		renderLabelNode(renrederedAttributes, formBuilderFieldsetField);
		renderLocalizationMap(renrederedAttributes, formBuilderFieldsetField);
		renderName(renrederedAttributes, formBuilderFieldsetField);
		renderFormbuilderfieldsetfieldParent(renrederedAttributes, formBuilderFieldsetField);
		renderPredefinedValue(renrederedAttributes, formBuilderFieldsetField);
		renderReadOnly(renrederedAttributes, formBuilderFieldsetField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderFieldsetField);
		renderRequired(renrederedAttributes, formBuilderFieldsetField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderFieldsetField);
		renderSelected(renrederedAttributes, formBuilderFieldsetField);
		renderShowLabel(renrederedAttributes, formBuilderFieldsetField);
		renderStrings(renrederedAttributes, formBuilderFieldsetField);
		renderTabIndex(renrederedAttributes, formBuilderFieldsetField);
		renderTemplate(renrederedAttributes, formBuilderFieldsetField);
		renderTemplateNode(renrederedAttributes, formBuilderFieldsetField);
		renderTip(renrederedAttributes, formBuilderFieldsetField);
		renderTipFlagNode(renrederedAttributes, formBuilderFieldsetField);
		renderType(renrederedAttributes, formBuilderFieldsetField);
		renderUnique(renrederedAttributes, formBuilderFieldsetField);
		renderZIndex(renrederedAttributes, formBuilderFieldsetField);

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

		handleBuffer(facesContext, formBuilderFieldsetField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderFieldsetField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderFieldsetField.getBuilder()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderFieldsetField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderFieldsetField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderFieldsetField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderFieldsetField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderFieldsetField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuilderfieldsetfieldId(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getFormbuilderfieldsetfieldId() != null) {
			renrederedAttributes.add(renderString("formbuilderfieldsetfieldId", formBuilderFieldsetField.getFormbuilderfieldsetfieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderFieldsetField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderFieldsetField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderFieldsetField.getLocalizationMap()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderFieldsetField.getName()));
		}
	}

	protected void renderFormbuilderfieldsetfieldParent(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getFormbuilderfieldsetfieldParent() != null) {
			renrederedAttributes.add(renderString("formbuilderfieldsetfieldParent", formBuilderFieldsetField.getFormbuilderfieldsetfieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderFieldsetField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderFieldsetField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderFieldsetField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderFieldsetField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderFieldsetField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderFieldsetField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderFieldsetField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderFieldsetField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderFieldsetField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderFieldsetField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderFieldsetField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderFieldsetField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderFieldsetField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderFieldsetField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderFieldsetField.getUnique()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		if (formBuilderFieldsetField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderFieldsetField.getZIndex()));
		}
	}

}