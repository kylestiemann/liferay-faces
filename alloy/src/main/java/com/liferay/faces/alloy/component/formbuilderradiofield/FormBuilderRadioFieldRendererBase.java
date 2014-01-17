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
package com.liferay.faces.alloy.component.formbuilderradiofield;

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
public abstract class FormBuilderRadioFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-radio";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderRadioField formBuilderRadioField = (FormBuilderRadioField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderRadioField = new A.FormBuilderRadioField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderRadioField);
		renderBuilder(renderedAttributes, formBuilderRadioField);
		renderControlsToolbar(renderedAttributes, formBuilderRadioField);
		renderDataType(renderedAttributes, formBuilderRadioField);
		renderDisabled(renderedAttributes, formBuilderRadioField);
		renderDropZoneNode(renderedAttributes, formBuilderRadioField);
		renderHiddenAttributes(renderedAttributes, formBuilderRadioField);
		renderFormbuilderradiofieldId(renderedAttributes, formBuilderRadioField);
		renderLabel(renderedAttributes, formBuilderRadioField);
		renderLabelNode(renderedAttributes, formBuilderRadioField);
		renderLocalizationMap(renderedAttributes, formBuilderRadioField);
		renderName(renderedAttributes, formBuilderRadioField);
		renderOptionTemplate(renderedAttributes, formBuilderRadioField);
		renderOptions(renderedAttributes, formBuilderRadioField);
		renderFormbuilderradiofieldParent(renderedAttributes, formBuilderRadioField);
		renderPredefinedValue(renderedAttributes, formBuilderRadioField);
		renderReadOnly(renderedAttributes, formBuilderRadioField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderRadioField);
		renderRequired(renderedAttributes, formBuilderRadioField);
		renderRequiredFlagNode(renderedAttributes, formBuilderRadioField);
		renderSelected(renderedAttributes, formBuilderRadioField);
		renderShowLabel(renderedAttributes, formBuilderRadioField);
		renderStrings(renderedAttributes, formBuilderRadioField);
		renderTabIndex(renderedAttributes, formBuilderRadioField);
		renderTemplate(renderedAttributes, formBuilderRadioField);
		renderTemplateNode(renderedAttributes, formBuilderRadioField);
		renderTip(renderedAttributes, formBuilderRadioField);
		renderTipFlagNode(renderedAttributes, formBuilderRadioField);
		renderType(renderedAttributes, formBuilderRadioField);
		renderUnique(renderedAttributes, formBuilderRadioField);
		renderZIndex(renderedAttributes, formBuilderRadioField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderRadioField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderRadioField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean builder = formBuilderRadioField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderRadioField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderRadioField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderRadioField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String dataType = formBuilderRadioField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean disabled = formBuilderRadioField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderRadioField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String dropZoneNode = formBuilderRadioField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderRadioField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderRadioField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormbuilderradiofieldId(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String formbuilderradiofieldId = formBuilderRadioField.getFormbuilderradiofieldId();

		if (formbuilderradiofieldId != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.FORMBUILDERRADIOFIELD_ID, formbuilderradiofieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String label = formBuilderRadioField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String labelNode = formBuilderRadioField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object localizationMap = formBuilderRadioField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderRadioField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String name = formBuilderRadioField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.NAME, name));
		}
	}

	protected void renderOptionTemplate(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String optionTemplate = formBuilderRadioField.getOptionTemplate();

		if (optionTemplate != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.OPTION_TEMPLATE, optionTemplate));
		}
	}

	protected void renderOptions(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object options = formBuilderRadioField.getOptions();

		if (options != null) {
			renderedAttributes.add(renderObject(FormBuilderRadioField.OPTIONS, options));
		}
	}

	protected void renderFormbuilderradiofieldParent(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String formbuilderradiofieldParent = formBuilderRadioField.getFormbuilderradiofieldParent();

		if (formbuilderradiofieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.FORMBUILDERRADIOFIELD_PARENT, formbuilderradiofieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String predefinedValue = formBuilderRadioField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean readOnly = formBuilderRadioField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderRadioField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderRadioField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderRadioField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean required = formBuilderRadioField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderRadioField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderRadioField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean selected = formBuilderRadioField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderRadioField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean showLabel = formBuilderRadioField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderRadioField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object strings = formBuilderRadioField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderRadioField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object tabIndex = formBuilderRadioField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderRadioField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String template = formBuilderRadioField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String templateNode = formBuilderRadioField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String tip = formBuilderRadioField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String tipFlagNode = formBuilderRadioField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String type = formBuilderRadioField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean unique = formBuilderRadioField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderRadioField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object zIndex = formBuilderRadioField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderRadioField.Z_INDEX, zIndex));
		}
	}

}