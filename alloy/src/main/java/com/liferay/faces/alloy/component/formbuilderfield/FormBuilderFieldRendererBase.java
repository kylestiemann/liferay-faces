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
public abstract class FormBuilderFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderField formBuilderField = (FormBuilderField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderField = new A.FormBuilderField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderField);
		renderBuilder(renderedAttributes, formBuilderField);
		renderControlsToolbar(renderedAttributes, formBuilderField);
		renderDataType(renderedAttributes, formBuilderField);
		renderDisabled(renderedAttributes, formBuilderField);
		renderDropZoneNode(renderedAttributes, formBuilderField);
		renderHiddenAttributes(renderedAttributes, formBuilderField);
		renderFormBuilderFieldId(renderedAttributes, formBuilderField);
		renderLabel(renderedAttributes, formBuilderField);
		renderLabelNode(renderedAttributes, formBuilderField);
		renderLocalizationMap(renderedAttributes, formBuilderField);
		renderName(renderedAttributes, formBuilderField);
		renderFormBuilderFieldParent(renderedAttributes, formBuilderField);
		renderPredefinedValue(renderedAttributes, formBuilderField);
		renderReadOnly(renderedAttributes, formBuilderField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderField);
		renderRequired(renderedAttributes, formBuilderField);
		renderRequiredFlagNode(renderedAttributes, formBuilderField);
		renderSelected(renderedAttributes, formBuilderField);
		renderShowLabel(renderedAttributes, formBuilderField);
		renderStrings(renderedAttributes, formBuilderField);
		renderTabIndex(renderedAttributes, formBuilderField);
		renderTemplate(renderedAttributes, formBuilderField);
		renderTemplateNode(renderedAttributes, formBuilderField);
		renderTip(renderedAttributes, formBuilderField);
		renderTipFlagNode(renderedAttributes, formBuilderField);
		renderType(renderedAttributes, formBuilderField);
		renderUnique(renderedAttributes, formBuilderField);
		renderZIndex(renderedAttributes, formBuilderField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean builder = formBuilderField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String dataType = formBuilderField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean disabled = formBuilderField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String dropZoneNode = formBuilderField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderFieldId(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String formBuilderFieldId = formBuilderField.getFormBuilderFieldId();

		if (formBuilderFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderField.FORM_BUILDER_FIELD_ID, formBuilderFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String label = formBuilderField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String labelNode = formBuilderField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object localizationMap = formBuilderField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String name = formBuilderField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderField.NAME, name));
		}
	}

	protected void renderFormBuilderFieldParent(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String formBuilderFieldParent = formBuilderField.getFormBuilderFieldParent();

		if (formBuilderFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderField.FORM_BUILDER_FIELD_PARENT, formBuilderFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String predefinedValue = formBuilderField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean readOnly = formBuilderField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean required = formBuilderField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean selected = formBuilderField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean showLabel = formBuilderField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object strings = formBuilderField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object tabIndex = formBuilderField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String template = formBuilderField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String templateNode = formBuilderField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String tip = formBuilderField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String tipFlagNode = formBuilderField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String type = formBuilderField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean unique = formBuilderField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object zIndex = formBuilderField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderField.Z_INDEX, zIndex));
		}
	}

}