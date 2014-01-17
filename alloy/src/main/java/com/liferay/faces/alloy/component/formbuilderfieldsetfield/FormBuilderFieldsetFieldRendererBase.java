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
public abstract class FormBuilderFieldsetFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-fieldset";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderFieldsetField formBuilderFieldsetField = (FormBuilderFieldsetField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderFieldsetField = new A.FormBuilderFieldsetField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderFieldsetField);
		renderBuilder(renderedAttributes, formBuilderFieldsetField);
		renderControlsToolbar(renderedAttributes, formBuilderFieldsetField);
		renderDataType(renderedAttributes, formBuilderFieldsetField);
		renderDisabled(renderedAttributes, formBuilderFieldsetField);
		renderDropZoneNode(renderedAttributes, formBuilderFieldsetField);
		renderHiddenAttributes(renderedAttributes, formBuilderFieldsetField);
		renderFormBuilderFieldsetFieldId(renderedAttributes, formBuilderFieldsetField);
		renderLabel(renderedAttributes, formBuilderFieldsetField);
		renderLabelNode(renderedAttributes, formBuilderFieldsetField);
		renderLocalizationMap(renderedAttributes, formBuilderFieldsetField);
		renderName(renderedAttributes, formBuilderFieldsetField);
		renderFormBuilderFieldsetFieldParent(renderedAttributes, formBuilderFieldsetField);
		renderPredefinedValue(renderedAttributes, formBuilderFieldsetField);
		renderReadOnly(renderedAttributes, formBuilderFieldsetField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderFieldsetField);
		renderRequired(renderedAttributes, formBuilderFieldsetField);
		renderRequiredFlagNode(renderedAttributes, formBuilderFieldsetField);
		renderSelected(renderedAttributes, formBuilderFieldsetField);
		renderShowLabel(renderedAttributes, formBuilderFieldsetField);
		renderStrings(renderedAttributes, formBuilderFieldsetField);
		renderTabIndex(renderedAttributes, formBuilderFieldsetField);
		renderTemplate(renderedAttributes, formBuilderFieldsetField);
		renderTemplateNode(renderedAttributes, formBuilderFieldsetField);
		renderTip(renderedAttributes, formBuilderFieldsetField);
		renderTipFlagNode(renderedAttributes, formBuilderFieldsetField);
		renderType(renderedAttributes, formBuilderFieldsetField);
		renderUnique(renderedAttributes, formBuilderFieldsetField);
		renderZIndex(renderedAttributes, formBuilderFieldsetField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderFieldsetField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean builder = formBuilderFieldsetField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderFieldsetField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderFieldsetField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String dataType = formBuilderFieldsetField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean disabled = formBuilderFieldsetField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String dropZoneNode = formBuilderFieldsetField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderFieldsetField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderFieldsetField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderFieldsetFieldId(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String formBuilderFieldsetFieldId = formBuilderFieldsetField.getFormBuilderFieldsetFieldId();

		if (formBuilderFieldsetFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.FORM_BUILDER_FIELDSET_FIELD_ID, formBuilderFieldsetFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String label = formBuilderFieldsetField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String labelNode = formBuilderFieldsetField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object localizationMap = formBuilderFieldsetField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderFieldsetField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String name = formBuilderFieldsetField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.NAME, name));
		}
	}

	protected void renderFormBuilderFieldsetFieldParent(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String formBuilderFieldsetFieldParent = formBuilderFieldsetField.getFormBuilderFieldsetFieldParent();

		if (formBuilderFieldsetFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.FORM_BUILDER_FIELDSET_FIELD_PARENT, formBuilderFieldsetFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String predefinedValue = formBuilderFieldsetField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean readOnly = formBuilderFieldsetField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderFieldsetField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderFieldsetField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean required = formBuilderFieldsetField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderFieldsetField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean selected = formBuilderFieldsetField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean showLabel = formBuilderFieldsetField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object strings = formBuilderFieldsetField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderFieldsetField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object tabIndex = formBuilderFieldsetField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderFieldsetField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String template = formBuilderFieldsetField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String templateNode = formBuilderFieldsetField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String tip = formBuilderFieldsetField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String tipFlagNode = formBuilderFieldsetField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String type = formBuilderFieldsetField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean unique = formBuilderFieldsetField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object zIndex = formBuilderFieldsetField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderFieldsetField.Z_INDEX, zIndex));
		}
	}

}