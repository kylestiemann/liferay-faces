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
		renderFormBuilderRadioFieldId(renderedAttributes, formBuilderRadioField);
		renderLabel(renderedAttributes, formBuilderRadioField);
		renderLabelNode(renderedAttributes, formBuilderRadioField);
		renderLocalizationMap(renderedAttributes, formBuilderRadioField);
		renderName(renderedAttributes, formBuilderRadioField);
		renderOptionTemplate(renderedAttributes, formBuilderRadioField);
		renderOptions(renderedAttributes, formBuilderRadioField);
		renderFormBuilderRadioFieldParent(renderedAttributes, formBuilderRadioField);
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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterIdChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterNameChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterOptionTemplateChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterOptionsChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterParentChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterTipChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderRadioField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderRadioField);

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

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderRadioField);
		renderOnBuilderChange(renderedOnEvents, formBuilderRadioField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderRadioField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderRadioField);
		renderOnDisabledChange(renderedOnEvents, formBuilderRadioField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderRadioField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderRadioField);
		renderOnIdChange(renderedOnEvents, formBuilderRadioField);
		renderOnLabelChange(renderedOnEvents, formBuilderRadioField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderRadioField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderRadioField);
		renderOnNameChange(renderedOnEvents, formBuilderRadioField);
		renderOnOptionTemplateChange(renderedOnEvents, formBuilderRadioField);
		renderOnOptionsChange(renderedOnEvents, formBuilderRadioField);
		renderOnParentChange(renderedOnEvents, formBuilderRadioField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderRadioField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderRadioField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderRadioField);
		renderOnRequiredChange(renderedOnEvents, formBuilderRadioField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderRadioField);
		renderOnSelectedChange(renderedOnEvents, formBuilderRadioField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderRadioField);
		renderOnStringsChange(renderedOnEvents, formBuilderRadioField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderRadioField);
		renderOnTemplateChange(renderedOnEvents, formBuilderRadioField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderRadioField);
		renderOnTipChange(renderedOnEvents, formBuilderRadioField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderRadioField);
		renderOnTypeChange(renderedOnEvents, formBuilderRadioField);
		renderOnUniqueChange(renderedOnEvents, formBuilderRadioField);
		renderOnZIndexChange(renderedOnEvents, formBuilderRadioField);

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

	protected void renderFormBuilderRadioFieldId(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String formBuilderRadioFieldId = formBuilderRadioField.getFormBuilderRadioFieldId();

		if (formBuilderRadioFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.FORM_BUILDER_RADIO_FIELD_ID, formBuilderRadioFieldId));
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

	protected void renderFormBuilderRadioFieldParent(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String formBuilderRadioFieldParent = formBuilderRadioField.getFormBuilderRadioFieldParent();

		if (formBuilderRadioFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.FORM_BUILDER_RADIO_FIELD_PARENT, formBuilderRadioFieldParent));
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

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderRadioField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderRadioField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderRadioField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderRadioField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderRadioField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderRadioField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderRadioField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterIdChange = formBuilderRadioField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterLabelChange = formBuilderRadioField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderRadioField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderRadioField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterNameChange = formBuilderRadioField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterOptionTemplateChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterOptionTemplateChange = formBuilderRadioField.getAfterOptionTemplateChange();

		if (afterOptionTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_OPTION_TEMPLATE_CHANGE, afterOptionTemplateChange));
		}
	}

	protected void renderAfterOptionsChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterOptionsChange = formBuilderRadioField.getAfterOptionsChange();

		if (afterOptionsChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_OPTIONS_CHANGE, afterOptionsChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterParentChange = formBuilderRadioField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderRadioField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderRadioField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderRadioField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderRadioField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderRadioField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderRadioField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderRadioField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterStringsChange = formBuilderRadioField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderRadioField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderRadioField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderRadioField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTipChange = formBuilderRadioField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderRadioField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTypeChange = formBuilderRadioField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderRadioField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderRadioField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderRadioField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onBuilderChange = formBuilderRadioField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderRadioField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderRadioField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onDisabledChange = formBuilderRadioField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderRadioField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderRadioField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onIdChange = formBuilderRadioField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onLabelChange = formBuilderRadioField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderRadioField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderRadioField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onNameChange = formBuilderRadioField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnOptionTemplateChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onOptionTemplateChange = formBuilderRadioField.getOnOptionTemplateChange();

		if (onOptionTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_OPTION_TEMPLATE_CHANGE, onOptionTemplateChange));
		}
	}

	protected void renderOnOptionsChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onOptionsChange = formBuilderRadioField.getOnOptionsChange();

		if (onOptionsChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_OPTIONS_CHANGE, onOptionsChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onParentChange = formBuilderRadioField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderRadioField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderRadioField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderRadioField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onRequiredChange = formBuilderRadioField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderRadioField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onSelectedChange = formBuilderRadioField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderRadioField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onStringsChange = formBuilderRadioField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderRadioField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTemplateChange = formBuilderRadioField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderRadioField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTipChange = formBuilderRadioField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderRadioField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTypeChange = formBuilderRadioField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onUniqueChange = formBuilderRadioField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onZIndexChange = formBuilderRadioField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderRadioField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}