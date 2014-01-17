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
public abstract class FormBuilderMultipleChoiceFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-multiple-choice";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderMultipleChoiceField formBuilderMultipleChoiceField = (FormBuilderMultipleChoiceField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderMultipleChoiceField = new A.FormBuilderMultipleChoiceField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderMultipleChoiceField);
		renderBuilder(renderedAttributes, formBuilderMultipleChoiceField);
		renderControlsToolbar(renderedAttributes, formBuilderMultipleChoiceField);
		renderDataType(renderedAttributes, formBuilderMultipleChoiceField);
		renderDisabled(renderedAttributes, formBuilderMultipleChoiceField);
		renderDropZoneNode(renderedAttributes, formBuilderMultipleChoiceField);
		renderHiddenAttributes(renderedAttributes, formBuilderMultipleChoiceField);
		renderFormbuildermultiplechoicefieldId(renderedAttributes, formBuilderMultipleChoiceField);
		renderLabel(renderedAttributes, formBuilderMultipleChoiceField);
		renderLabelNode(renderedAttributes, formBuilderMultipleChoiceField);
		renderLocalizationMap(renderedAttributes, formBuilderMultipleChoiceField);
		renderName(renderedAttributes, formBuilderMultipleChoiceField);
		renderOptionTemplate(renderedAttributes, formBuilderMultipleChoiceField);
		renderOptions(renderedAttributes, formBuilderMultipleChoiceField);
		renderFormbuildermultiplechoicefieldParent(renderedAttributes, formBuilderMultipleChoiceField);
		renderPredefinedValue(renderedAttributes, formBuilderMultipleChoiceField);
		renderReadOnly(renderedAttributes, formBuilderMultipleChoiceField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderMultipleChoiceField);
		renderRequired(renderedAttributes, formBuilderMultipleChoiceField);
		renderRequiredFlagNode(renderedAttributes, formBuilderMultipleChoiceField);
		renderSelected(renderedAttributes, formBuilderMultipleChoiceField);
		renderShowLabel(renderedAttributes, formBuilderMultipleChoiceField);
		renderStrings(renderedAttributes, formBuilderMultipleChoiceField);
		renderTabIndex(renderedAttributes, formBuilderMultipleChoiceField);
		renderTemplate(renderedAttributes, formBuilderMultipleChoiceField);
		renderTemplateNode(renderedAttributes, formBuilderMultipleChoiceField);
		renderTip(renderedAttributes, formBuilderMultipleChoiceField);
		renderTipFlagNode(renderedAttributes, formBuilderMultipleChoiceField);
		renderType(renderedAttributes, formBuilderMultipleChoiceField);
		renderUnique(renderedAttributes, formBuilderMultipleChoiceField);
		renderZIndex(renderedAttributes, formBuilderMultipleChoiceField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderMultipleChoiceField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean builder = formBuilderMultipleChoiceField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderMultipleChoiceField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderMultipleChoiceField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String dataType = formBuilderMultipleChoiceField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean disabled = formBuilderMultipleChoiceField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String dropZoneNode = formBuilderMultipleChoiceField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderMultipleChoiceField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderMultipleChoiceField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormbuildermultiplechoicefieldId(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String formbuildermultiplechoicefieldId = formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldId();

		if (formbuildermultiplechoicefieldId != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.FORMBUILDERMULTIPLECHOICEFIELD_ID, formbuildermultiplechoicefieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String label = formBuilderMultipleChoiceField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String labelNode = formBuilderMultipleChoiceField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object localizationMap = formBuilderMultipleChoiceField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderMultipleChoiceField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String name = formBuilderMultipleChoiceField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.NAME, name));
		}
	}

	protected void renderOptionTemplate(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String optionTemplate = formBuilderMultipleChoiceField.getOptionTemplate();

		if (optionTemplate != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.OPTION_TEMPLATE, optionTemplate));
		}
	}

	protected void renderOptions(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object options = formBuilderMultipleChoiceField.getOptions();

		if (options != null) {
			renderedAttributes.add(renderObject(FormBuilderMultipleChoiceField.OPTIONS, options));
		}
	}

	protected void renderFormbuildermultiplechoicefieldParent(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String formbuildermultiplechoicefieldParent = formBuilderMultipleChoiceField.getFormbuildermultiplechoicefieldParent();

		if (formbuildermultiplechoicefieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.FORMBUILDERMULTIPLECHOICEFIELD_PARENT, formbuildermultiplechoicefieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String predefinedValue = formBuilderMultipleChoiceField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean readOnly = formBuilderMultipleChoiceField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderMultipleChoiceField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderMultipleChoiceField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean required = formBuilderMultipleChoiceField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderMultipleChoiceField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean selected = formBuilderMultipleChoiceField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean showLabel = formBuilderMultipleChoiceField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object strings = formBuilderMultipleChoiceField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderMultipleChoiceField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object tabIndex = formBuilderMultipleChoiceField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderMultipleChoiceField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String template = formBuilderMultipleChoiceField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String templateNode = formBuilderMultipleChoiceField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String tip = formBuilderMultipleChoiceField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String tipFlagNode = formBuilderMultipleChoiceField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String type = formBuilderMultipleChoiceField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean unique = formBuilderMultipleChoiceField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object zIndex = formBuilderMultipleChoiceField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderMultipleChoiceField.Z_INDEX, zIndex));
		}
	}

}