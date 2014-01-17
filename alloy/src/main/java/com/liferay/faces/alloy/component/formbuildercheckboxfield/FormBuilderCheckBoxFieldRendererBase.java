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
public abstract class FormBuilderCheckBoxFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-checkbox";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderCheckBoxField formBuilderCheckBoxField = (FormBuilderCheckBoxField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderCheckBoxField = new A.FormBuilderCheckBoxField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderCheckBoxField);
		renderBuilder(renderedAttributes, formBuilderCheckBoxField);
		renderControlsToolbar(renderedAttributes, formBuilderCheckBoxField);
		renderDataType(renderedAttributes, formBuilderCheckBoxField);
		renderDisabled(renderedAttributes, formBuilderCheckBoxField);
		renderDropZoneNode(renderedAttributes, formBuilderCheckBoxField);
		renderHiddenAttributes(renderedAttributes, formBuilderCheckBoxField);
		renderFormBuilderCheckBoxFieldId(renderedAttributes, formBuilderCheckBoxField);
		renderLabel(renderedAttributes, formBuilderCheckBoxField);
		renderLabelNode(renderedAttributes, formBuilderCheckBoxField);
		renderLocalizationMap(renderedAttributes, formBuilderCheckBoxField);
		renderName(renderedAttributes, formBuilderCheckBoxField);
		renderFormBuilderCheckBoxFieldParent(renderedAttributes, formBuilderCheckBoxField);
		renderPredefinedValue(renderedAttributes, formBuilderCheckBoxField);
		renderReadOnly(renderedAttributes, formBuilderCheckBoxField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderCheckBoxField);
		renderRequired(renderedAttributes, formBuilderCheckBoxField);
		renderRequiredFlagNode(renderedAttributes, formBuilderCheckBoxField);
		renderSelected(renderedAttributes, formBuilderCheckBoxField);
		renderShowLabel(renderedAttributes, formBuilderCheckBoxField);
		renderStrings(renderedAttributes, formBuilderCheckBoxField);
		renderTabIndex(renderedAttributes, formBuilderCheckBoxField);
		renderTemplate(renderedAttributes, formBuilderCheckBoxField);
		renderTemplateNode(renderedAttributes, formBuilderCheckBoxField);
		renderTip(renderedAttributes, formBuilderCheckBoxField);
		renderTipFlagNode(renderedAttributes, formBuilderCheckBoxField);
		renderType(renderedAttributes, formBuilderCheckBoxField);
		renderUnique(renderedAttributes, formBuilderCheckBoxField);
		renderZIndex(renderedAttributes, formBuilderCheckBoxField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderCheckBoxField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean builder = formBuilderCheckBoxField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderCheckBoxField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderCheckBoxField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String dataType = formBuilderCheckBoxField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean disabled = formBuilderCheckBoxField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String dropZoneNode = formBuilderCheckBoxField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderCheckBoxField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderCheckBoxField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderCheckBoxFieldId(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String formBuilderCheckBoxFieldId = formBuilderCheckBoxField.getFormBuilderCheckBoxFieldId();

		if (formBuilderCheckBoxFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.FORM_BUILDER_CHECK_BOX_FIELD_ID, formBuilderCheckBoxFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String label = formBuilderCheckBoxField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String labelNode = formBuilderCheckBoxField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object localizationMap = formBuilderCheckBoxField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderCheckBoxField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String name = formBuilderCheckBoxField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.NAME, name));
		}
	}

	protected void renderFormBuilderCheckBoxFieldParent(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String formBuilderCheckBoxFieldParent = formBuilderCheckBoxField.getFormBuilderCheckBoxFieldParent();

		if (formBuilderCheckBoxFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.FORM_BUILDER_CHECK_BOX_FIELD_PARENT, formBuilderCheckBoxFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean predefinedValue = formBuilderCheckBoxField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean readOnly = formBuilderCheckBoxField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderCheckBoxField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderCheckBoxField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean required = formBuilderCheckBoxField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderCheckBoxField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean selected = formBuilderCheckBoxField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean showLabel = formBuilderCheckBoxField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object strings = formBuilderCheckBoxField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderCheckBoxField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object tabIndex = formBuilderCheckBoxField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderCheckBoxField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String template = formBuilderCheckBoxField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String templateNode = formBuilderCheckBoxField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String tip = formBuilderCheckBoxField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String tipFlagNode = formBuilderCheckBoxField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String type = formBuilderCheckBoxField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean unique = formBuilderCheckBoxField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object zIndex = formBuilderCheckBoxField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderCheckBoxField.Z_INDEX, zIndex));
		}
	}

}