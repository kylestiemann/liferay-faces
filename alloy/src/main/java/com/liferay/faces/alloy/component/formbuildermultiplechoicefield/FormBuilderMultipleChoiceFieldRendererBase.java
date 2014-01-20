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

import javax.faces.application.ResourceDependency;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

import com.liferay.faces.alloy.component.base.RendererBase;
import com.liferay.faces.util.lang.StringPool;

/**
 * @author Bruno Basto
 * @author Kyle Stiemann
 * @generated
 */
@ResourceDependency(library = "aui", name = "aui.js")
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
		renderFormBuilderMultipleChoiceFieldId(renderedAttributes, formBuilderMultipleChoiceField);
		renderLabel(renderedAttributes, formBuilderMultipleChoiceField);
		renderLabelNode(renderedAttributes, formBuilderMultipleChoiceField);
		renderLocalizationMap(renderedAttributes, formBuilderMultipleChoiceField);
		renderName(renderedAttributes, formBuilderMultipleChoiceField);
		renderOptionTemplate(renderedAttributes, formBuilderMultipleChoiceField);
		renderOptions(renderedAttributes, formBuilderMultipleChoiceField);
		renderFormBuilderMultipleChoiceFieldParent(renderedAttributes, formBuilderMultipleChoiceField);
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterIdChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterNameChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterOptionTemplateChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterOptionsChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterParentChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterTipChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderMultipleChoiceField);

		Iterator<String> afterEventsIterator = renderedAfterEvents.iterator();

		while (afterEventsIterator.hasNext()) {
			responseWriter.write(afterEventsIterator.next());

			if (afterEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
		responseWriter.write(StringPool.COMMA);

		responseWriter.write("on");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedOnEvents = new ArrayList<String>();

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnBuilderChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnDisabledChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnIdChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnLabelChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnNameChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnOptionTemplateChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnOptionsChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnParentChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnRequiredChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnSelectedChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnStringsChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnTemplateChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnTipChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnTypeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnUniqueChange(renderedOnEvents, formBuilderMultipleChoiceField);
		renderOnZIndexChange(renderedOnEvents, formBuilderMultipleChoiceField);

		Iterator<String> onEventsIterator = renderedOnEvents.iterator();

		while (onEventsIterator.hasNext()) {
			responseWriter.write(onEventsIterator.next());

			if (onEventsIterator.hasNext()) {
				responseWriter.write(StringPool.COMMA);
			}
		}

		responseWriter.write(StringPool.CLOSE_CURLY_BRACE);
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

	protected void renderFormBuilderMultipleChoiceFieldId(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String formBuilderMultipleChoiceFieldId = formBuilderMultipleChoiceField.getFormBuilderMultipleChoiceFieldId();

		if (formBuilderMultipleChoiceFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.FORM_BUILDER_MULTIPLE_CHOICE_FIELD_ID, formBuilderMultipleChoiceFieldId));
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

	protected void renderFormBuilderMultipleChoiceFieldParent(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String formBuilderMultipleChoiceFieldParent = formBuilderMultipleChoiceField.getFormBuilderMultipleChoiceFieldParent();

		if (formBuilderMultipleChoiceFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.FORM_BUILDER_MULTIPLE_CHOICE_FIELD_PARENT, formBuilderMultipleChoiceFieldParent));
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

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderMultipleChoiceField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderMultipleChoiceField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderMultipleChoiceField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderMultipleChoiceField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderMultipleChoiceField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderMultipleChoiceField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderMultipleChoiceField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterIdChange = formBuilderMultipleChoiceField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterLabelChange = formBuilderMultipleChoiceField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderMultipleChoiceField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderMultipleChoiceField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterNameChange = formBuilderMultipleChoiceField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterOptionTemplateChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterOptionTemplateChange = formBuilderMultipleChoiceField.getAfterOptionTemplateChange();

		if (afterOptionTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_OPTION_TEMPLATE_CHANGE, afterOptionTemplateChange));
		}
	}

	protected void renderAfterOptionsChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterOptionsChange = formBuilderMultipleChoiceField.getAfterOptionsChange();

		if (afterOptionsChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_OPTIONS_CHANGE, afterOptionsChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterParentChange = formBuilderMultipleChoiceField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderMultipleChoiceField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderMultipleChoiceField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderMultipleChoiceField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderMultipleChoiceField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderMultipleChoiceField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderMultipleChoiceField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderMultipleChoiceField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterStringsChange = formBuilderMultipleChoiceField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderMultipleChoiceField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderMultipleChoiceField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderMultipleChoiceField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTipChange = formBuilderMultipleChoiceField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderMultipleChoiceField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTypeChange = formBuilderMultipleChoiceField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderMultipleChoiceField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderMultipleChoiceField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderMultipleChoiceField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onBuilderChange = formBuilderMultipleChoiceField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderMultipleChoiceField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderMultipleChoiceField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onDisabledChange = formBuilderMultipleChoiceField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderMultipleChoiceField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderMultipleChoiceField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onIdChange = formBuilderMultipleChoiceField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onLabelChange = formBuilderMultipleChoiceField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderMultipleChoiceField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderMultipleChoiceField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onNameChange = formBuilderMultipleChoiceField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnOptionTemplateChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onOptionTemplateChange = formBuilderMultipleChoiceField.getOnOptionTemplateChange();

		if (onOptionTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_OPTION_TEMPLATE_CHANGE, onOptionTemplateChange));
		}
	}

	protected void renderOnOptionsChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onOptionsChange = formBuilderMultipleChoiceField.getOnOptionsChange();

		if (onOptionsChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_OPTIONS_CHANGE, onOptionsChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onParentChange = formBuilderMultipleChoiceField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderMultipleChoiceField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderMultipleChoiceField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderMultipleChoiceField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onRequiredChange = formBuilderMultipleChoiceField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderMultipleChoiceField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onSelectedChange = formBuilderMultipleChoiceField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderMultipleChoiceField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onStringsChange = formBuilderMultipleChoiceField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderMultipleChoiceField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTemplateChange = formBuilderMultipleChoiceField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderMultipleChoiceField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTipChange = formBuilderMultipleChoiceField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderMultipleChoiceField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTypeChange = formBuilderMultipleChoiceField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onUniqueChange = formBuilderMultipleChoiceField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onZIndexChange = formBuilderMultipleChoiceField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}