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

		bufferedResponseWriter.write("var formBuilderField = new A.FormBuilderField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderField);
		renderBuilder(renrederedAttributes, formBuilderField);
		renderControlsToolbar(renrederedAttributes, formBuilderField);
		renderDataType(renrederedAttributes, formBuilderField);
		renderDisabled(renrederedAttributes, formBuilderField);
		renderDropZoneNode(renrederedAttributes, formBuilderField);
		renderHiddenAttributes(renrederedAttributes, formBuilderField);
		renderFormbuilderfieldId(renrederedAttributes, formBuilderField);
		renderLabel(renrederedAttributes, formBuilderField);
		renderLabelNode(renrederedAttributes, formBuilderField);
		renderLocalizationMap(renrederedAttributes, formBuilderField);
		renderName(renrederedAttributes, formBuilderField);
		renderFormbuilderfieldParent(renrederedAttributes, formBuilderField);
		renderPredefinedValue(renrederedAttributes, formBuilderField);
		renderReadOnly(renrederedAttributes, formBuilderField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderField);
		renderRequired(renrederedAttributes, formBuilderField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderField);
		renderSelected(renrederedAttributes, formBuilderField);
		renderShowLabel(renrederedAttributes, formBuilderField);
		renderStrings(renrederedAttributes, formBuilderField);
		renderTabIndex(renrederedAttributes, formBuilderField);
		renderTemplate(renrederedAttributes, formBuilderField);
		renderTemplateNode(renrederedAttributes, formBuilderField);
		renderTip(renrederedAttributes, formBuilderField);
		renderTipFlagNode(renrederedAttributes, formBuilderField);
		renderType(renrederedAttributes, formBuilderField);
		renderUnique(renrederedAttributes, formBuilderField);
		renderZIndex(renrederedAttributes, formBuilderField);

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

		handleBuffer(facesContext, formBuilderField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderField.getBuilder()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuilderfieldId(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getFormbuilderfieldId() != null) {
			renrederedAttributes.add(renderString("formbuilderfieldId", formBuilderField.getFormbuilderfieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderField.getLocalizationMap()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderField.getName()));
		}
	}

	protected void renderFormbuilderfieldParent(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getFormbuilderfieldParent() != null) {
			renrederedAttributes.add(renderString("formbuilderfieldParent", formBuilderField.getFormbuilderfieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderField.getUnique()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderField formBuilderField) throws IOException {
		if (formBuilderField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderField.getZIndex()));
		}
	}

}