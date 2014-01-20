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
package com.liferay.faces.alloy.component.formbuilderfieldsetfield;

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
public abstract class FormBuilderFieldsetFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-fieldset";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderFieldsetField formBuilderFieldsetField = (FormBuilderFieldsetField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderFieldsetField = new A.FormBuilderFieldsetField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderFieldsetField);
		renderBuilder(renderedAttributes, formBuilderFieldsetField);
		renderControlsToolbar(renderedAttributes, formBuilderFieldsetField);
		renderDataType(renderedAttributes, formBuilderFieldsetField);
		renderDisabled(renderedAttributes, formBuilderFieldsetField);
		renderDropZoneNode(renderedAttributes, formBuilderFieldsetField);
		renderHiddenAttributes(renderedAttributes, formBuilderFieldsetField);
		renderFormBuilderFieldsetFieldId(renderedAttributes, formBuilderFieldsetField);
		renderLabel(renderedAttributes, formBuilderFieldsetField);
		renderLabelNode(renderedAttributes, formBuilderFieldsetField);
		renderLocalizationMap(renderedAttributes, formBuilderFieldsetField);
		renderName(renderedAttributes, formBuilderFieldsetField);
		renderFormBuilderFieldsetFieldParent(renderedAttributes, formBuilderFieldsetField);
		renderPredefinedValue(renderedAttributes, formBuilderFieldsetField);
		renderReadOnly(renderedAttributes, formBuilderFieldsetField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderFieldsetField);
		renderRequired(renderedAttributes, formBuilderFieldsetField);
		renderRequiredFlagNode(renderedAttributes, formBuilderFieldsetField);
		renderSelected(renderedAttributes, formBuilderFieldsetField);
		renderShowLabel(renderedAttributes, formBuilderFieldsetField);
		renderStrings(renderedAttributes, formBuilderFieldsetField);
		renderTabIndex(renderedAttributes, formBuilderFieldsetField);
		renderTemplate(renderedAttributes, formBuilderFieldsetField);
		renderTemplateNode(renderedAttributes, formBuilderFieldsetField);
		renderTip(renderedAttributes, formBuilderFieldsetField);
		renderTipFlagNode(renderedAttributes, formBuilderFieldsetField);
		renderType(renderedAttributes, formBuilderFieldsetField);
		renderUnique(renderedAttributes, formBuilderFieldsetField);
		renderZIndex(renderedAttributes, formBuilderFieldsetField);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterIdChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterNameChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterParentChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterTipChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderFieldsetField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderFieldsetField);

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

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnBuilderChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnDisabledChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnIdChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnLabelChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnNameChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnParentChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnRequiredChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnSelectedChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnStringsChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnTemplateChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnTipChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnTypeChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnUniqueChange(renderedOnEvents, formBuilderFieldsetField);
		renderOnZIndexChange(renderedOnEvents, formBuilderFieldsetField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderFieldsetField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean builder = formBuilderFieldsetField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderFieldsetField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderFieldsetField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String dataType = formBuilderFieldsetField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean disabled = formBuilderFieldsetField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String dropZoneNode = formBuilderFieldsetField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderFieldsetField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderFieldsetField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderFieldsetFieldId(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String formBuilderFieldsetFieldId = formBuilderFieldsetField.getFormBuilderFieldsetFieldId();

		if (formBuilderFieldsetFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.FORM_BUILDER_FIELDSET_FIELD_ID, formBuilderFieldsetFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String label = formBuilderFieldsetField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String labelNode = formBuilderFieldsetField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object localizationMap = formBuilderFieldsetField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderFieldsetField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String name = formBuilderFieldsetField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.NAME, name));
		}
	}

	protected void renderFormBuilderFieldsetFieldParent(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String formBuilderFieldsetFieldParent = formBuilderFieldsetField.getFormBuilderFieldsetFieldParent();

		if (formBuilderFieldsetFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.FORM_BUILDER_FIELDSET_FIELD_PARENT, formBuilderFieldsetFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String predefinedValue = formBuilderFieldsetField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean readOnly = formBuilderFieldsetField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderFieldsetField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderFieldsetField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean required = formBuilderFieldsetField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderFieldsetField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean selected = formBuilderFieldsetField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean showLabel = formBuilderFieldsetField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object strings = formBuilderFieldsetField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderFieldsetField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object tabIndex = formBuilderFieldsetField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderFieldsetField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String template = formBuilderFieldsetField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String templateNode = formBuilderFieldsetField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String tip = formBuilderFieldsetField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String tipFlagNode = formBuilderFieldsetField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String type = formBuilderFieldsetField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Boolean unique = formBuilderFieldsetField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFieldsetField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.Object zIndex = formBuilderFieldsetField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderFieldsetField.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderFieldsetField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderFieldsetField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderFieldsetField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderFieldsetField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderFieldsetField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderFieldsetField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderFieldsetField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterIdChange = formBuilderFieldsetField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterLabelChange = formBuilderFieldsetField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderFieldsetField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderFieldsetField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterNameChange = formBuilderFieldsetField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterParentChange = formBuilderFieldsetField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderFieldsetField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderFieldsetField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderFieldsetField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderFieldsetField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderFieldsetField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderFieldsetField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderFieldsetField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterStringsChange = formBuilderFieldsetField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderFieldsetField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderFieldsetField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderFieldsetField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTipChange = formBuilderFieldsetField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderFieldsetField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterTypeChange = formBuilderFieldsetField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderFieldsetField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderFieldsetField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderFieldsetField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onBuilderChange = formBuilderFieldsetField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderFieldsetField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderFieldsetField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onDisabledChange = formBuilderFieldsetField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderFieldsetField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderFieldsetField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onIdChange = formBuilderFieldsetField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onLabelChange = formBuilderFieldsetField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderFieldsetField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderFieldsetField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onNameChange = formBuilderFieldsetField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onParentChange = formBuilderFieldsetField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderFieldsetField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderFieldsetField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderFieldsetField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onRequiredChange = formBuilderFieldsetField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderFieldsetField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onSelectedChange = formBuilderFieldsetField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderFieldsetField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onStringsChange = formBuilderFieldsetField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderFieldsetField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTemplateChange = formBuilderFieldsetField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderFieldsetField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTipChange = formBuilderFieldsetField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderFieldsetField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onTypeChange = formBuilderFieldsetField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onUniqueChange = formBuilderFieldsetField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderFieldsetField formBuilderFieldsetField) throws IOException {
		java.lang.String onZIndexChange = formBuilderFieldsetField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderFieldsetField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}