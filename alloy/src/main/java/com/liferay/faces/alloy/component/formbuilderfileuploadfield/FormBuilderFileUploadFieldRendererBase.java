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
package com.liferay.faces.alloy.component.formbuilderfileuploadfield;

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
public abstract class FormBuilderFileUploadFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-upload";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderFileUploadField formBuilderFileUploadField = (FormBuilderFileUploadField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderFileUploadField = new A.FormBuilderFileUploadField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderFileUploadField);
		renderBuilder(renderedAttributes, formBuilderFileUploadField);
		renderControlsToolbar(renderedAttributes, formBuilderFileUploadField);
		renderDataType(renderedAttributes, formBuilderFileUploadField);
		renderDisabled(renderedAttributes, formBuilderFileUploadField);
		renderDropZoneNode(renderedAttributes, formBuilderFileUploadField);
		renderHiddenAttributes(renderedAttributes, formBuilderFileUploadField);
		renderFormbuilderfileuploadfieldId(renderedAttributes, formBuilderFileUploadField);
		renderLabel(renderedAttributes, formBuilderFileUploadField);
		renderLabelNode(renderedAttributes, formBuilderFileUploadField);
		renderLocalizationMap(renderedAttributes, formBuilderFileUploadField);
		renderName(renderedAttributes, formBuilderFileUploadField);
		renderFormbuilderfileuploadfieldParent(renderedAttributes, formBuilderFileUploadField);
		renderPredefinedValue(renderedAttributes, formBuilderFileUploadField);
		renderReadOnly(renderedAttributes, formBuilderFileUploadField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderFileUploadField);
		renderRequired(renderedAttributes, formBuilderFileUploadField);
		renderRequiredFlagNode(renderedAttributes, formBuilderFileUploadField);
		renderSelected(renderedAttributes, formBuilderFileUploadField);
		renderShowLabel(renderedAttributes, formBuilderFileUploadField);
		renderStrings(renderedAttributes, formBuilderFileUploadField);
		renderTabIndex(renderedAttributes, formBuilderFileUploadField);
		renderTemplate(renderedAttributes, formBuilderFileUploadField);
		renderTemplateNode(renderedAttributes, formBuilderFileUploadField);
		renderTip(renderedAttributes, formBuilderFileUploadField);
		renderTipFlagNode(renderedAttributes, formBuilderFileUploadField);
		renderType(renderedAttributes, formBuilderFileUploadField);
		renderUnique(renderedAttributes, formBuilderFileUploadField);
		renderZIndex(renderedAttributes, formBuilderFileUploadField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderFileUploadField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean builder = formBuilderFileUploadField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderFileUploadField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderFileUploadField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String dataType = formBuilderFileUploadField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean disabled = formBuilderFileUploadField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String dropZoneNode = formBuilderFileUploadField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderFileUploadField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderFileUploadField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormbuilderfileuploadfieldId(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String formbuilderfileuploadfieldId = formBuilderFileUploadField.getFormbuilderfileuploadfieldId();

		if (formbuilderfileuploadfieldId != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.FORMBUILDERFILEUPLOADFIELD_ID, formbuilderfileuploadfieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String label = formBuilderFileUploadField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String labelNode = formBuilderFileUploadField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object localizationMap = formBuilderFileUploadField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderFileUploadField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String name = formBuilderFileUploadField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.NAME, name));
		}
	}

	protected void renderFormbuilderfileuploadfieldParent(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String formbuilderfileuploadfieldParent = formBuilderFileUploadField.getFormbuilderfileuploadfieldParent();

		if (formbuilderfileuploadfieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.FORMBUILDERFILEUPLOADFIELD_PARENT, formbuilderfileuploadfieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String predefinedValue = formBuilderFileUploadField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean readOnly = formBuilderFileUploadField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderFileUploadField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderFileUploadField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean required = formBuilderFileUploadField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderFileUploadField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean selected = formBuilderFileUploadField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean showLabel = formBuilderFileUploadField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object strings = formBuilderFileUploadField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderFileUploadField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object tabIndex = formBuilderFileUploadField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderFileUploadField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String template = formBuilderFileUploadField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String templateNode = formBuilderFileUploadField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String tip = formBuilderFileUploadField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String tipFlagNode = formBuilderFileUploadField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String type = formBuilderFileUploadField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean unique = formBuilderFileUploadField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object zIndex = formBuilderFileUploadField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderFileUploadField.Z_INDEX, zIndex));
		}
	}

}