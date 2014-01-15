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
package com.liferay.faces.alloy.component.formbuildermultiplechoicefield;

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
public abstract class FormBuilderMultipleChoiceFieldRendererBase extends AUIRenderer {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-multiple-choice";

	@Override
	public void encodeBegin(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		super.encodeBegin(facesContext, uiComponent);

		FormBuilderMultipleChoiceField formBuilderMultipleChoiceField = (FormBuilderMultipleChoiceField) uiComponent;
		encodeHTML(facesContext, formBuilderMultipleChoiceField);
		encodeJavaScript(facesContext, formBuilderMultipleChoiceField);
	}

	protected abstract void encodeHTML(FacesContext facesContext, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException;

	protected void encodeJavaScript(FacesContext facesContext, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {

		ResponseWriter backupResponseWriter = facesContext.getResponseWriter();

		BufferedResponseWriter bufferedResponseWriter = new BufferedResponseWriter();
		facesContext.setResponseWriter(bufferedResponseWriter);

		beginJavaScript(facesContext, formBuilderMultipleChoiceField);

		bufferedResponseWriter.write("var formBuilderMultipleChoiceField = new A.FormBuilderMultipleChoiceField");
		bufferedResponseWriter.write(StringPool.OPEN_PARENTHESIS);
		bufferedResponseWriter.write(StringPool.OPEN_CURLY_BRACE);

		ArrayList<String> renrederedAttributes = new ArrayList<String>();

		renderAcceptChildren(renrederedAttributes, formBuilderMultipleChoiceField);
		renderBuilder(renrederedAttributes, formBuilderMultipleChoiceField);
		renderControlsToolbar(renrederedAttributes, formBuilderMultipleChoiceField);
		renderDataType(renrederedAttributes, formBuilderMultipleChoiceField);
		renderDisabled(renrederedAttributes, formBuilderMultipleChoiceField);
		renderDropZoneNode(renrederedAttributes, formBuilderMultipleChoiceField);
		renderHiddenAttributes(renrederedAttributes, formBuilderMultipleChoiceField);
		renderFormbuildermultiplechoicefieldId(renrederedAttributes, formBuilderMultipleChoiceField);
		renderLabel(renrederedAttributes, formBuilderMultipleChoiceField);
		renderLabelNode(renrederedAttributes, formBuilderMultipleChoiceField);
		renderLocalizationMap(renrederedAttributes, formBuilderMultipleChoiceField);
		renderName(renrederedAttributes, formBuilderMultipleChoiceField);
		renderOptionTemplate(renrederedAttributes, formBuilderMultipleChoiceField);
		renderOptions(renrederedAttributes, formBuilderMultipleChoiceField);
		renderFormbuildermultiplechoicefieldParent(renrederedAttributes, formBuilderMultipleChoiceField);
		renderPredefinedValue(renrederedAttributes, formBuilderMultipleChoiceField);
		renderReadOnly(renrederedAttributes, formBuilderMultipleChoiceField);
		renderReadOnlyAttributes(renrederedAttributes, formBuilderMultipleChoiceField);
		renderRequired(renrederedAttributes, formBuilderMultipleChoiceField);
		renderRequiredFlagNode(renrederedAttributes, formBuilderMultipleChoiceField);
		renderSelected(renrederedAttributes, formBuilderMultipleChoiceField);
		renderShowLabel(renrederedAttributes, formBuilderMultipleChoiceField);
		renderStrings(renrederedAttributes, formBuilderMultipleChoiceField);
		renderTabIndex(renrederedAttributes, formBuilderMultipleChoiceField);
		renderTemplate(renrederedAttributes, formBuilderMultipleChoiceField);
		renderTemplateNode(renrederedAttributes, formBuilderMultipleChoiceField);
		renderTip(renrederedAttributes, formBuilderMultipleChoiceField);
		renderTipFlagNode(renrederedAttributes, formBuilderMultipleChoiceField);
		renderType(renrederedAttributes, formBuilderMultipleChoiceField);
		renderUnique(renrederedAttributes, formBuilderMultipleChoiceField);
		renderZIndex(renrederedAttributes, formBuilderMultipleChoiceField);

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

		handleBuffer(facesContext, formBuilderMultipleChoiceField);

		facesContext.setResponseWriter(backupResponseWriter);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getAcceptChildren() != null) {
			renrederedAttributes.add(renderBoolean("acceptChildren", formBuilderMultipleChoiceField.getAcceptChildren()));
		}
	}

	protected void renderBuilder(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getBuilder() != null) {
			renrederedAttributes.add(renderBoolean("builder", formBuilderMultipleChoiceField.getBuilder()));
		}
	}

	protected void renderControlsToolbar(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getControlsToolbar() != null) {
			renrederedAttributes.add(renderObject("controlsToolbar", formBuilderMultipleChoiceField.getControlsToolbar()));
		}
	}

	protected void renderDataType(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getDataType() != null) {
			renrederedAttributes.add(renderString("dataType", formBuilderMultipleChoiceField.getDataType()));
		}
	}

	protected void renderDisabled(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getDisabled() != null) {
			renrederedAttributes.add(renderBoolean("disabled", formBuilderMultipleChoiceField.getDisabled()));
		}
	}

	protected void renderDropZoneNode(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getDropZoneNode() != null) {
			renrederedAttributes.add(renderString("dropZoneNode", formBuilderMultipleChoiceField.getDropZoneNode()));
		}
	}

	protected void renderHiddenAttributes(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getHiddenAttributes() != null) {
			renrederedAttributes.add(renderArray("hiddenAttributes", formBuilderMultipleChoiceField.getHiddenAttributes()));
		}
	}

	protected void renderFormbuildermultiplechoicefieldId(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldId() != null) {
			renrederedAttributes.add(renderString("formbuildermultiplechoicefieldId", formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldId()));
		}
	}

	protected void renderLabel(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getLabel() != null) {
			renrederedAttributes.add(renderString("label", formBuilderMultipleChoiceField.getLabel()));
		}
	}

	protected void renderLabelNode(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getLabelNode() != null) {
			renrederedAttributes.add(renderString("labelNode", formBuilderMultipleChoiceField.getLabelNode()));
		}
	}

	protected void renderLocalizationMap(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getLocalizationMap() != null) {
			renrederedAttributes.add(renderObject("localizationMap", formBuilderMultipleChoiceField.getLocalizationMap()));
		}
	}

	protected void renderName(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getName() != null) {
			renrederedAttributes.add(renderString("name", formBuilderMultipleChoiceField.getName()));
		}
	}

	protected void renderOptionTemplate(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getOptionTemplate() != null) {
			renrederedAttributes.add(renderString("optionTemplate", formBuilderMultipleChoiceField.getOptionTemplate()));
		}
	}

	protected void renderOptions(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getOptions() != null) {
			renrederedAttributes.add(renderObject("options", formBuilderMultipleChoiceField.getOptions()));
		}
	}

	protected void renderFormbuildermultiplechoicefieldParent(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldParent() != null) {
			renrederedAttributes.add(renderString("formbuildermultiplechoicefieldParent", formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldParent()));
		}
	}

	protected void renderPredefinedValue(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getPredefinedValue() != null) {
			renrederedAttributes.add(renderString("predefinedValue", formBuilderMultipleChoiceField.getPredefinedValue()));
		}
	}

	protected void renderReadOnly(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getReadOnly() != null) {
			renrederedAttributes.add(renderBoolean("readOnly", formBuilderMultipleChoiceField.getReadOnly()));
		}
	}

	protected void renderReadOnlyAttributes(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getReadOnlyAttributes() != null) {
			renrederedAttributes.add(renderArray("readOnlyAttributes", formBuilderMultipleChoiceField.getReadOnlyAttributes()));
		}
	}

	protected void renderRequired(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getRequired() != null) {
			renrederedAttributes.add(renderBoolean("required", formBuilderMultipleChoiceField.getRequired()));
		}
	}

	protected void renderRequiredFlagNode(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getRequiredFlagNode() != null) {
			renrederedAttributes.add(renderString("requiredFlagNode", formBuilderMultipleChoiceField.getRequiredFlagNode()));
		}
	}

	protected void renderSelected(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getSelected() != null) {
			renrederedAttributes.add(renderBoolean("selected", formBuilderMultipleChoiceField.getSelected()));
		}
	}

	protected void renderShowLabel(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getShowLabel() != null) {
			renrederedAttributes.add(renderBoolean("showLabel", formBuilderMultipleChoiceField.getShowLabel()));
		}
	}

	protected void renderStrings(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getStrings() != null) {
			renrederedAttributes.add(renderObject("strings", formBuilderMultipleChoiceField.getStrings()));
		}
	}

	protected void renderTabIndex(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getTabIndex() != null) {
			renrederedAttributes.add(renderNumber("tabIndex", formBuilderMultipleChoiceField.getTabIndex()));
		}
	}

	protected void renderTemplate(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getTemplate() != null) {
			renrederedAttributes.add(renderString("template", formBuilderMultipleChoiceField.getTemplate()));
		}
	}

	protected void renderTemplateNode(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getTemplateNode() != null) {
			renrederedAttributes.add(renderString("templateNode", formBuilderMultipleChoiceField.getTemplateNode()));
		}
	}

	protected void renderTip(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getTip() != null) {
			renrederedAttributes.add(renderString("tip", formBuilderMultipleChoiceField.getTip()));
		}
	}

	protected void renderTipFlagNode(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getTipFlagNode() != null) {
			renrederedAttributes.add(renderString("tipFlagNode", formBuilderMultipleChoiceField.getTipFlagNode()));
		}
	}

	protected void renderType(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getType() != null) {
			renrederedAttributes.add(renderString("type", formBuilderMultipleChoiceField.getType()));
		}
	}

	protected void renderUnique(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getUnique() != null) {
			renrederedAttributes.add(renderBoolean("unique", formBuilderMultipleChoiceField.getUnique()));
		}
	}

	protected void renderZIndex(ArrayList<String> renrederedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		if (formBuilderMultipleChoiceField.getZIndex() != null) {
			renrederedAttributes.add(renderNumber("zIndex", formBuilderMultipleChoiceField.getZIndex()));
		}
	}

}