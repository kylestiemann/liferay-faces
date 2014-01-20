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
		renderFormBuilderSelectFieldId(renderedAttributes, formBuilderSelectField);
		renderLabel(renderedAttributes, formBuilderSelectField);
		renderLabelNode(renderedAttributes, formBuilderSelectField);
		renderLocalizationMap(renderedAttributes, formBuilderSelectField);
		renderMultiple(renderedAttributes, formBuilderSelectField);
		renderName(renderedAttributes, formBuilderSelectField);
		renderOptionTemplate(renderedAttributes, formBuilderSelectField);
		renderOptions(renderedAttributes, formBuilderSelectField);
		renderFormBuilderSelectFieldParent(renderedAttributes, formBuilderSelectField);
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterIdChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterMultipleChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterNameChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterOptionTemplateChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterOptionsChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterParentChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterTipChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderSelectField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderSelectField);

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

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderSelectField);
		renderOnBuilderChange(renderedOnEvents, formBuilderSelectField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderSelectField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderSelectField);
		renderOnDisabledChange(renderedOnEvents, formBuilderSelectField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderSelectField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderSelectField);
		renderOnIdChange(renderedOnEvents, formBuilderSelectField);
		renderOnLabelChange(renderedOnEvents, formBuilderSelectField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderSelectField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderSelectField);
		renderOnMultipleChange(renderedOnEvents, formBuilderSelectField);
		renderOnNameChange(renderedOnEvents, formBuilderSelectField);
		renderOnOptionTemplateChange(renderedOnEvents, formBuilderSelectField);
		renderOnOptionsChange(renderedOnEvents, formBuilderSelectField);
		renderOnParentChange(renderedOnEvents, formBuilderSelectField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderSelectField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderSelectField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderSelectField);
		renderOnRequiredChange(renderedOnEvents, formBuilderSelectField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderSelectField);
		renderOnSelectedChange(renderedOnEvents, formBuilderSelectField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderSelectField);
		renderOnStringsChange(renderedOnEvents, formBuilderSelectField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderSelectField);
		renderOnTemplateChange(renderedOnEvents, formBuilderSelectField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderSelectField);
		renderOnTipChange(renderedOnEvents, formBuilderSelectField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderSelectField);
		renderOnTypeChange(renderedOnEvents, formBuilderSelectField);
		renderOnUniqueChange(renderedOnEvents, formBuilderSelectField);
		renderOnZIndexChange(renderedOnEvents, formBuilderSelectField);

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

	protected void renderFormBuilderSelectFieldId(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String formBuilderSelectFieldId = formBuilderSelectField.getFormBuilderSelectFieldId();

		if (formBuilderSelectFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.FORM_BUILDER_SELECT_FIELD_ID, formBuilderSelectFieldId));
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

	protected void renderFormBuilderSelectFieldParent(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String formBuilderSelectFieldParent = formBuilderSelectField.getFormBuilderSelectFieldParent();

		if (formBuilderSelectFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.FORM_BUILDER_SELECT_FIELD_PARENT, formBuilderSelectFieldParent));
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

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderSelectField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderSelectField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderSelectField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderSelectField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderSelectField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderSelectField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderSelectField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterIdChange = formBuilderSelectField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterLabelChange = formBuilderSelectField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderSelectField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderSelectField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterMultipleChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterMultipleChange = formBuilderSelectField.getAfterMultipleChange();

		if (afterMultipleChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_MULTIPLE_CHANGE, afterMultipleChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterNameChange = formBuilderSelectField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterOptionTemplateChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterOptionTemplateChange = formBuilderSelectField.getAfterOptionTemplateChange();

		if (afterOptionTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_OPTION_TEMPLATE_CHANGE, afterOptionTemplateChange));
		}
	}

	protected void renderAfterOptionsChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterOptionsChange = formBuilderSelectField.getAfterOptionsChange();

		if (afterOptionsChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_OPTIONS_CHANGE, afterOptionsChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterParentChange = formBuilderSelectField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderSelectField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderSelectField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderSelectField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderSelectField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderSelectField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderSelectField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderSelectField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterStringsChange = formBuilderSelectField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderSelectField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderSelectField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderSelectField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTipChange = formBuilderSelectField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderSelectField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTypeChange = formBuilderSelectField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderSelectField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderSelectField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderSelectField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onBuilderChange = formBuilderSelectField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderSelectField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderSelectField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onDisabledChange = formBuilderSelectField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderSelectField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderSelectField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onIdChange = formBuilderSelectField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onLabelChange = formBuilderSelectField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderSelectField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderSelectField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnMultipleChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onMultipleChange = formBuilderSelectField.getOnMultipleChange();

		if (onMultipleChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_MULTIPLE_CHANGE, onMultipleChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onNameChange = formBuilderSelectField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnOptionTemplateChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onOptionTemplateChange = formBuilderSelectField.getOnOptionTemplateChange();

		if (onOptionTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_OPTION_TEMPLATE_CHANGE, onOptionTemplateChange));
		}
	}

	protected void renderOnOptionsChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onOptionsChange = formBuilderSelectField.getOnOptionsChange();

		if (onOptionsChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_OPTIONS_CHANGE, onOptionsChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onParentChange = formBuilderSelectField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderSelectField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderSelectField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderSelectField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onRequiredChange = formBuilderSelectField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderSelectField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onSelectedChange = formBuilderSelectField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderSelectField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onStringsChange = formBuilderSelectField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderSelectField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTemplateChange = formBuilderSelectField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderSelectField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTipChange = formBuilderSelectField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderSelectField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTypeChange = formBuilderSelectField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onUniqueChange = formBuilderSelectField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onZIndexChange = formBuilderSelectField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderSelectField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}