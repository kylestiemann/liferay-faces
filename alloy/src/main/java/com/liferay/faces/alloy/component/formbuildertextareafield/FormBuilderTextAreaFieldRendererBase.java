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
public abstract class FormBuilderTextAreaFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-textarea";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderTextAreaField formBuilderTextAreaField = (FormBuilderTextAreaField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderTextAreaField = new A.FormBuilderTextAreaField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderTextAreaField);
		renderBuilder(renderedAttributes, formBuilderTextAreaField);
		renderControlsToolbar(renderedAttributes, formBuilderTextAreaField);
		renderDataType(renderedAttributes, formBuilderTextAreaField);
		renderDisabled(renderedAttributes, formBuilderTextAreaField);
		renderDropZoneNode(renderedAttributes, formBuilderTextAreaField);
		renderHiddenAttributes(renderedAttributes, formBuilderTextAreaField);
		renderFormBuilderTextAreaFieldId(renderedAttributes, formBuilderTextAreaField);
		renderLabel(renderedAttributes, formBuilderTextAreaField);
		renderLabelNode(renderedAttributes, formBuilderTextAreaField);
		renderLocalizationMap(renderedAttributes, formBuilderTextAreaField);
		renderName(renderedAttributes, formBuilderTextAreaField);
		renderFormBuilderTextAreaFieldParent(renderedAttributes, formBuilderTextAreaField);
		renderPredefinedValue(renderedAttributes, formBuilderTextAreaField);
		renderReadOnly(renderedAttributes, formBuilderTextAreaField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderTextAreaField);
		renderRequired(renderedAttributes, formBuilderTextAreaField);
		renderRequiredFlagNode(renderedAttributes, formBuilderTextAreaField);
		renderSelected(renderedAttributes, formBuilderTextAreaField);
		renderShowLabel(renderedAttributes, formBuilderTextAreaField);
		renderStrings(renderedAttributes, formBuilderTextAreaField);
		renderTabIndex(renderedAttributes, formBuilderTextAreaField);
		renderTemplate(renderedAttributes, formBuilderTextAreaField);
		renderTemplateNode(renderedAttributes, formBuilderTextAreaField);
		renderTip(renderedAttributes, formBuilderTextAreaField);
		renderTipFlagNode(renderedAttributes, formBuilderTextAreaField);
		renderType(renderedAttributes, formBuilderTextAreaField);
		renderUnique(renderedAttributes, formBuilderTextAreaField);
		renderWidth(renderedAttributes, formBuilderTextAreaField);
		renderZIndex(renderedAttributes, formBuilderTextAreaField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderTextAreaField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean builder = formBuilderTextAreaField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderTextAreaField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderTextAreaField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String dataType = formBuilderTextAreaField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean disabled = formBuilderTextAreaField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String dropZoneNode = formBuilderTextAreaField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderTextAreaField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderTextAreaField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderTextAreaFieldId(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String formBuilderTextAreaFieldId = formBuilderTextAreaField.getFormBuilderTextAreaFieldId();

		if (formBuilderTextAreaFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.FORM_BUILDER_TEXT_AREA_FIELD_ID, formBuilderTextAreaFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String label = formBuilderTextAreaField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String labelNode = formBuilderTextAreaField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object localizationMap = formBuilderTextAreaField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderTextAreaField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String name = formBuilderTextAreaField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.NAME, name));
		}
	}

	protected void renderFormBuilderTextAreaFieldParent(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String formBuilderTextAreaFieldParent = formBuilderTextAreaField.getFormBuilderTextAreaFieldParent();

		if (formBuilderTextAreaFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.FORM_BUILDER_TEXT_AREA_FIELD_PARENT, formBuilderTextAreaFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String predefinedValue = formBuilderTextAreaField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean readOnly = formBuilderTextAreaField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderTextAreaField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderTextAreaField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean required = formBuilderTextAreaField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderTextAreaField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean selected = formBuilderTextAreaField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean showLabel = formBuilderTextAreaField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object strings = formBuilderTextAreaField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderTextAreaField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object tabIndex = formBuilderTextAreaField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderTextAreaField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String template = formBuilderTextAreaField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String templateNode = formBuilderTextAreaField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String tip = formBuilderTextAreaField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String tipFlagNode = formBuilderTextAreaField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String type = formBuilderTextAreaField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean unique = formBuilderTextAreaField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.UNIQUE, unique));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String width = formBuilderTextAreaField.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.WIDTH, width));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object zIndex = formBuilderTextAreaField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderTextAreaField.Z_INDEX, zIndex));
		}
	}

}