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

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterButtonTypeChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterIdChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterNameChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterParentChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterTipChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderButtonField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderButtonField);

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

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderButtonField);
		renderOnBuilderChange(renderedOnEvents, formBuilderButtonField);
		renderOnButtonTypeChange(renderedOnEvents, formBuilderButtonField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderButtonField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderButtonField);
		renderOnDisabledChange(renderedOnEvents, formBuilderButtonField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderButtonField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderButtonField);
		renderOnIdChange(renderedOnEvents, formBuilderButtonField);
		renderOnLabelChange(renderedOnEvents, formBuilderButtonField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderButtonField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderButtonField);
		renderOnNameChange(renderedOnEvents, formBuilderButtonField);
		renderOnParentChange(renderedOnEvents, formBuilderButtonField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderButtonField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderButtonField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderButtonField);
		renderOnRequiredChange(renderedOnEvents, formBuilderButtonField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderButtonField);
		renderOnSelectedChange(renderedOnEvents, formBuilderButtonField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderButtonField);
		renderOnStringsChange(renderedOnEvents, formBuilderButtonField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderButtonField);
		renderOnTemplateChange(renderedOnEvents, formBuilderButtonField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderButtonField);
		renderOnTipChange(renderedOnEvents, formBuilderButtonField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderButtonField);
		renderOnTypeChange(renderedOnEvents, formBuilderButtonField);
		renderOnUniqueChange(renderedOnEvents, formBuilderButtonField);
		renderOnZIndexChange(renderedOnEvents, formBuilderButtonField);

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

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderButtonField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderButtonField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterButtonTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterButtonTypeChange = formBuilderButtonField.getAfterButtonTypeChange();

		if (afterButtonTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_BUTTON_TYPE_CHANGE, afterButtonTypeChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderButtonField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderButtonField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderButtonField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderButtonField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderButtonField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterIdChange = formBuilderButtonField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterLabelChange = formBuilderButtonField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderButtonField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderButtonField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterNameChange = formBuilderButtonField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterParentChange = formBuilderButtonField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderButtonField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderButtonField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderButtonField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderButtonField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderButtonField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderButtonField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderButtonField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterStringsChange = formBuilderButtonField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderButtonField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderButtonField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderButtonField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTipChange = formBuilderButtonField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderButtonField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTypeChange = formBuilderButtonField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderButtonField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderButtonField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderButtonField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onBuilderChange = formBuilderButtonField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnButtonTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onButtonTypeChange = formBuilderButtonField.getOnButtonTypeChange();

		if (onButtonTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_BUTTON_TYPE_CHANGE, onButtonTypeChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderButtonField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderButtonField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onDisabledChange = formBuilderButtonField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderButtonField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderButtonField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onIdChange = formBuilderButtonField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onLabelChange = formBuilderButtonField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderButtonField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderButtonField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onNameChange = formBuilderButtonField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onParentChange = formBuilderButtonField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderButtonField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderButtonField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderButtonField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onRequiredChange = formBuilderButtonField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderButtonField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onSelectedChange = formBuilderButtonField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderButtonField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onStringsChange = formBuilderButtonField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderButtonField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTemplateChange = formBuilderButtonField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderButtonField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTipChange = formBuilderButtonField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderButtonField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTypeChange = formBuilderButtonField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onUniqueChange = formBuilderButtonField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onZIndexChange = formBuilderButtonField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderButtonField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}