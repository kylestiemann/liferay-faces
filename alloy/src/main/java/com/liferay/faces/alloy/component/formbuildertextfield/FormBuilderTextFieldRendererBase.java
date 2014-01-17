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
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class FormBuilderTextFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-text";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderTextField formBuilderTextField = (FormBuilderTextField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderTextField = new A.FormBuilderTextField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderTextField);
		renderBuilder(renderedAttributes, formBuilderTextField);
		renderControlsToolbar(renderedAttributes, formBuilderTextField);
		renderDataType(renderedAttributes, formBuilderTextField);
		renderDisabled(renderedAttributes, formBuilderTextField);
		renderDropZoneNode(renderedAttributes, formBuilderTextField);
		renderHiddenAttributes(renderedAttributes, formBuilderTextField);
		renderFormBuilderTextFieldId(renderedAttributes, formBuilderTextField);
		renderLabel(renderedAttributes, formBuilderTextField);
		renderLabelNode(renderedAttributes, formBuilderTextField);
		renderLocalizationMap(renderedAttributes, formBuilderTextField);
		renderName(renderedAttributes, formBuilderTextField);
		renderFormBuilderTextFieldParent(renderedAttributes, formBuilderTextField);
		renderPredefinedValue(renderedAttributes, formBuilderTextField);
		renderReadOnly(renderedAttributes, formBuilderTextField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderTextField);
		renderRequired(renderedAttributes, formBuilderTextField);
		renderRequiredFlagNode(renderedAttributes, formBuilderTextField);
		renderSelected(renderedAttributes, formBuilderTextField);
		renderShowLabel(renderedAttributes, formBuilderTextField);
		renderStrings(renderedAttributes, formBuilderTextField);
		renderTabIndex(renderedAttributes, formBuilderTextField);
		renderTemplate(renderedAttributes, formBuilderTextField);
		renderTemplateNode(renderedAttributes, formBuilderTextField);
		renderTip(renderedAttributes, formBuilderTextField);
		renderTipFlagNode(renderedAttributes, formBuilderTextField);
		renderType(renderedAttributes, formBuilderTextField);
		renderUnique(renderedAttributes, formBuilderTextField);
		renderWidth(renderedAttributes, formBuilderTextField);
		renderZIndex(renderedAttributes, formBuilderTextField);

		Iterator<String> it = renderedAttributes.iterator();

		while (it.hasNext()) {
			responseWriter.write(it.next());

			if (it.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.CLOSE_PARENTHESIS);
		responseWriter.write(".render()");
		responseWriter.write(StringPool.SEMICOLON);
	}

	protected String getModule() {
		return AUI_MODULE_NAME;
	}

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderTextField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean builder = formBuilderTextField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderTextField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderTextField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String dataType = formBuilderTextField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean disabled = formBuilderTextField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String dropZoneNode = formBuilderTextField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderTextField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderTextField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderTextFieldId(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String formBuilderTextFieldId = formBuilderTextField.getFormBuilderTextFieldId();

		if (formBuilderTextFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.FORM_BUILDER_TEXT_FIELD_ID, formBuilderTextFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String label = formBuilderTextField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String labelNode = formBuilderTextField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object localizationMap = formBuilderTextField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderTextField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String name = formBuilderTextField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.NAME, name));
		}
	}

	protected void renderFormBuilderTextFieldParent(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String formBuilderTextFieldParent = formBuilderTextField.getFormBuilderTextFieldParent();

		if (formBuilderTextFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.FORM_BUILDER_TEXT_FIELD_PARENT, formBuilderTextFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String predefinedValue = formBuilderTextField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean readOnly = formBuilderTextField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderTextField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderTextField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean required = formBuilderTextField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderTextField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean selected = formBuilderTextField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean showLabel = formBuilderTextField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object strings = formBuilderTextField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderTextField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object tabIndex = formBuilderTextField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderTextField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String template = formBuilderTextField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String templateNode = formBuilderTextField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String tip = formBuilderTextField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String tipFlagNode = formBuilderTextField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String type = formBuilderTextField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean unique = formBuilderTextField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.UNIQUE, unique));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String width = formBuilderTextField.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.WIDTH, width));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object zIndex = formBuilderTextField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderTextField.Z_INDEX, zIndex));
		}
	}

}