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
public abstract class FormBuilderButtonFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-button";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderButtonField formBuilderButtonField = (FormBuilderButtonField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderButtonField = new A.FormBuilderButtonField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderButtonField);
		renderBuilder(renderedAttributes, formBuilderButtonField);
		renderButtonType(renderedAttributes, formBuilderButtonField);
		renderControlsToolbar(renderedAttributes, formBuilderButtonField);
		renderDataType(renderedAttributes, formBuilderButtonField);
		renderDisabled(renderedAttributes, formBuilderButtonField);
		renderDropZoneNode(renderedAttributes, formBuilderButtonField);
		renderHiddenAttributes(renderedAttributes, formBuilderButtonField);
		renderFormBuilderButtonFieldId(renderedAttributes, formBuilderButtonField);
		renderLabel(renderedAttributes, formBuilderButtonField);
		renderLabelNode(renderedAttributes, formBuilderButtonField);
		renderLocalizationMap(renderedAttributes, formBuilderButtonField);
		renderName(renderedAttributes, formBuilderButtonField);
		renderFormBuilderButtonFieldParent(renderedAttributes, formBuilderButtonField);
		renderPredefinedValue(renderedAttributes, formBuilderButtonField);
		renderReadOnly(renderedAttributes, formBuilderButtonField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderButtonField);
		renderRequired(renderedAttributes, formBuilderButtonField);
		renderRequiredFlagNode(renderedAttributes, formBuilderButtonField);
		renderSelected(renderedAttributes, formBuilderButtonField);
		renderShowLabel(renderedAttributes, formBuilderButtonField);
		renderStrings(renderedAttributes, formBuilderButtonField);
		renderTabIndex(renderedAttributes, formBuilderButtonField);
		renderTemplate(renderedAttributes, formBuilderButtonField);
		renderTemplateNode(renderedAttributes, formBuilderButtonField);
		renderTip(renderedAttributes, formBuilderButtonField);
		renderTipFlagNode(renderedAttributes, formBuilderButtonField);
		renderType(renderedAttributes, formBuilderButtonField);
		renderUnique(renderedAttributes, formBuilderButtonField);
		renderZIndex(renderedAttributes, formBuilderButtonField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderButtonField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderButtonField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean builder = formBuilderButtonField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderButtonField.BUILDER, builder));
		}
	}

	protected void renderButtonType(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String buttonType = formBuilderButtonField.getButtonType();

		if (buttonType != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.BUTTON_TYPE, buttonType));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderButtonField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderButtonField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String dataType = formBuilderButtonField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean disabled = formBuilderButtonField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderButtonField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String dropZoneNode = formBuilderButtonField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderButtonField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderButtonField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderButtonFieldId(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String formBuilderButtonFieldId = formBuilderButtonField.getFormBuilderButtonFieldId();

		if (formBuilderButtonFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.FORM_BUILDER_BUTTON_FIELD_ID, formBuilderButtonFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String label = formBuilderButtonField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String labelNode = formBuilderButtonField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object localizationMap = formBuilderButtonField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderButtonField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String name = formBuilderButtonField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.NAME, name));
		}
	}

	protected void renderFormBuilderButtonFieldParent(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String formBuilderButtonFieldParent = formBuilderButtonField.getFormBuilderButtonFieldParent();

		if (formBuilderButtonFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.FORM_BUILDER_BUTTON_FIELD_PARENT, formBuilderButtonFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String predefinedValue = formBuilderButtonField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean readOnly = formBuilderButtonField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderButtonField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderButtonField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderButtonField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean required = formBuilderButtonField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderButtonField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderButtonField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean selected = formBuilderButtonField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderButtonField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean showLabel = formBuilderButtonField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderButtonField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object strings = formBuilderButtonField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderButtonField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object tabIndex = formBuilderButtonField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderButtonField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String template = formBuilderButtonField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String templateNode = formBuilderButtonField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String tip = formBuilderButtonField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String tipFlagNode = formBuilderButtonField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String type = formBuilderButtonField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean unique = formBuilderButtonField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderButtonField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object zIndex = formBuilderButtonField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderButtonField.Z_INDEX, zIndex));
		}
	}

}