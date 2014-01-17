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
package com.liferay.faces.alloy.component.formbuilderselectfield;

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
public abstract class FormBuilderSelectFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-select";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderSelectField formBuilderSelectField = (FormBuilderSelectField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderSelectField = new A.FormBuilderSelectField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderSelectField);
		renderBuilder(renderedAttributes, formBuilderSelectField);
		renderControlsToolbar(renderedAttributes, formBuilderSelectField);
		renderDataType(renderedAttributes, formBuilderSelectField);
		renderDisabled(renderedAttributes, formBuilderSelectField);
		renderDropZoneNode(renderedAttributes, formBuilderSelectField);
		renderHiddenAttributes(renderedAttributes, formBuilderSelectField);
		renderFormbuilderselectfieldId(renderedAttributes, formBuilderSelectField);
		renderLabel(renderedAttributes, formBuilderSelectField);
		renderLabelNode(renderedAttributes, formBuilderSelectField);
		renderLocalizationMap(renderedAttributes, formBuilderSelectField);
		renderMultiple(renderedAttributes, formBuilderSelectField);
		renderName(renderedAttributes, formBuilderSelectField);
		renderOptionTemplate(renderedAttributes, formBuilderSelectField);
		renderOptions(renderedAttributes, formBuilderSelectField);
		renderFormbuilderselectfieldParent(renderedAttributes, formBuilderSelectField);
		renderPredefinedValue(renderedAttributes, formBuilderSelectField);
		renderReadOnly(renderedAttributes, formBuilderSelectField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderSelectField);
		renderRequired(renderedAttributes, formBuilderSelectField);
		renderRequiredFlagNode(renderedAttributes, formBuilderSelectField);
		renderSelected(renderedAttributes, formBuilderSelectField);
		renderShowLabel(renderedAttributes, formBuilderSelectField);
		renderStrings(renderedAttributes, formBuilderSelectField);
		renderTabIndex(renderedAttributes, formBuilderSelectField);
		renderTemplate(renderedAttributes, formBuilderSelectField);
		renderTemplateNode(renderedAttributes, formBuilderSelectField);
		renderTip(renderedAttributes, formBuilderSelectField);
		renderTipFlagNode(renderedAttributes, formBuilderSelectField);
		renderType(renderedAttributes, formBuilderSelectField);
		renderUnique(renderedAttributes, formBuilderSelectField);
		renderZIndex(renderedAttributes, formBuilderSelectField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderSelectField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderSelectField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean builder = formBuilderSelectField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderSelectField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderSelectField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderSelectField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String dataType = formBuilderSelectField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean disabled = formBuilderSelectField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderSelectField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String dropZoneNode = formBuilderSelectField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderSelectField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderSelectField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormbuilderselectfieldId(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String formbuilderselectfieldId = formBuilderSelectField.getFormbuilderselectfieldId();

		if (formbuilderselectfieldId != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.FORMBUILDERSELECTFIELD_ID, formbuilderselectfieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String label = formBuilderSelectField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String labelNode = formBuilderSelectField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object localizationMap = formBuilderSelectField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderSelectField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderMultiple(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean multiple = formBuilderSelectField.getMultiple();

		if (multiple != null) {
			renderedAttributes.add(renderBoolean(FormBuilderSelectField.MULTIPLE, multiple));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String name = formBuilderSelectField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.NAME, name));
		}
	}

	protected void renderOptionTemplate(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String optionTemplate = formBuilderSelectField.getOptionTemplate();

		if (optionTemplate != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.OPTION_TEMPLATE, optionTemplate));
		}
	}

	protected void renderOptions(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object options = formBuilderSelectField.getOptions();

		if (options != null) {
			renderedAttributes.add(renderObject(FormBuilderSelectField.OPTIONS, options));
		}
	}

	protected void renderFormbuilderselectfieldParent(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String formbuilderselectfieldParent = formBuilderSelectField.getFormbuilderselectfieldParent();

		if (formbuilderselectfieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.FORMBUILDERSELECTFIELD_PARENT, formbuilderselectfieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String predefinedValue = formBuilderSelectField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean readOnly = formBuilderSelectField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderSelectField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderSelectField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderSelectField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean required = formBuilderSelectField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderSelectField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderSelectField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean selected = formBuilderSelectField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderSelectField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean showLabel = formBuilderSelectField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderSelectField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object strings = formBuilderSelectField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderSelectField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object tabIndex = formBuilderSelectField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderSelectField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String template = formBuilderSelectField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String templateNode = formBuilderSelectField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String tip = formBuilderSelectField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String tipFlagNode = formBuilderSelectField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String type = formBuilderSelectField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean unique = formBuilderSelectField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderSelectField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object zIndex = formBuilderSelectField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderSelectField.Z_INDEX, zIndex));
		}
	}

}