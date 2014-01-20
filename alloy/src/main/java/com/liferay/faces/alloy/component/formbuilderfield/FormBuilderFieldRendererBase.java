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
package com.liferay.faces.alloy.component.formbuilderfield;

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
public abstract class FormBuilderFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-base";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderField formBuilderField = (FormBuilderField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderField = new A.FormBuilderField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderField);
		renderBuilder(renderedAttributes, formBuilderField);
		renderControlsToolbar(renderedAttributes, formBuilderField);
		renderDataType(renderedAttributes, formBuilderField);
		renderDisabled(renderedAttributes, formBuilderField);
		renderDropZoneNode(renderedAttributes, formBuilderField);
		renderHiddenAttributes(renderedAttributes, formBuilderField);
		renderFormBuilderFieldId(renderedAttributes, formBuilderField);
		renderLabel(renderedAttributes, formBuilderField);
		renderLabelNode(renderedAttributes, formBuilderField);
		renderLocalizationMap(renderedAttributes, formBuilderField);
		renderName(renderedAttributes, formBuilderField);
		renderFormBuilderFieldParent(renderedAttributes, formBuilderField);
		renderPredefinedValue(renderedAttributes, formBuilderField);
		renderReadOnly(renderedAttributes, formBuilderField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderField);
		renderRequired(renderedAttributes, formBuilderField);
		renderRequiredFlagNode(renderedAttributes, formBuilderField);
		renderSelected(renderedAttributes, formBuilderField);
		renderShowLabel(renderedAttributes, formBuilderField);
		renderStrings(renderedAttributes, formBuilderField);
		renderTabIndex(renderedAttributes, formBuilderField);
		renderTemplate(renderedAttributes, formBuilderField);
		renderTemplateNode(renderedAttributes, formBuilderField);
		renderTip(renderedAttributes, formBuilderField);
		renderTipFlagNode(renderedAttributes, formBuilderField);
		renderType(renderedAttributes, formBuilderField);
		renderUnique(renderedAttributes, formBuilderField);
		renderZIndex(renderedAttributes, formBuilderField);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderField);
		renderAfterIdChange(renderedAfterEvents, formBuilderField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderField);
		renderAfterNameChange(renderedAfterEvents, formBuilderField);
		renderAfterParentChange(renderedAfterEvents, formBuilderField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderField);
		renderAfterTipChange(renderedAfterEvents, formBuilderField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderField);

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

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderField);
		renderOnBuilderChange(renderedOnEvents, formBuilderField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderField);
		renderOnDisabledChange(renderedOnEvents, formBuilderField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderField);
		renderOnIdChange(renderedOnEvents, formBuilderField);
		renderOnLabelChange(renderedOnEvents, formBuilderField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderField);
		renderOnNameChange(renderedOnEvents, formBuilderField);
		renderOnParentChange(renderedOnEvents, formBuilderField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderField);
		renderOnRequiredChange(renderedOnEvents, formBuilderField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderField);
		renderOnSelectedChange(renderedOnEvents, formBuilderField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderField);
		renderOnStringsChange(renderedOnEvents, formBuilderField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderField);
		renderOnTemplateChange(renderedOnEvents, formBuilderField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderField);
		renderOnTipChange(renderedOnEvents, formBuilderField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderField);
		renderOnTypeChange(renderedOnEvents, formBuilderField);
		renderOnUniqueChange(renderedOnEvents, formBuilderField);
		renderOnZIndexChange(renderedOnEvents, formBuilderField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean builder = formBuilderField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String dataType = formBuilderField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean disabled = formBuilderField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String dropZoneNode = formBuilderField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderFieldId(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String formBuilderFieldId = formBuilderField.getFormBuilderFieldId();

		if (formBuilderFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderField.FORM_BUILDER_FIELD_ID, formBuilderFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String label = formBuilderField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String labelNode = formBuilderField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object localizationMap = formBuilderField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String name = formBuilderField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderField.NAME, name));
		}
	}

	protected void renderFormBuilderFieldParent(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String formBuilderFieldParent = formBuilderField.getFormBuilderFieldParent();

		if (formBuilderFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderField.FORM_BUILDER_FIELD_PARENT, formBuilderFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String predefinedValue = formBuilderField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean readOnly = formBuilderField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean required = formBuilderField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean selected = formBuilderField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean showLabel = formBuilderField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object strings = formBuilderField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object tabIndex = formBuilderField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String template = formBuilderField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String templateNode = formBuilderField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String tip = formBuilderField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String tipFlagNode = formBuilderField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String type = formBuilderField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean unique = formBuilderField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object zIndex = formBuilderField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderField.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterIdChange = formBuilderField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterLabelChange = formBuilderField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterNameChange = formBuilderField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterParentChange = formBuilderField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterStringsChange = formBuilderField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTipChange = formBuilderField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTypeChange = formBuilderField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onBuilderChange = formBuilderField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onDisabledChange = formBuilderField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onIdChange = formBuilderField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onLabelChange = formBuilderField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onNameChange = formBuilderField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onParentChange = formBuilderField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onRequiredChange = formBuilderField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onSelectedChange = formBuilderField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onStringsChange = formBuilderField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTemplateChange = formBuilderField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTipChange = formBuilderField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTypeChange = formBuilderField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onUniqueChange = formBuilderField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onZIndexChange = formBuilderField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}