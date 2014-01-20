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
package com.liferay.faces.alloy.component.formbuildercheckboxfield;

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
public abstract class FormBuilderCheckBoxFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-checkbox";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderCheckBoxField formBuilderCheckBoxField = (FormBuilderCheckBoxField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderCheckBoxField = new A.FormBuilderCheckBoxField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderCheckBoxField);
		renderBuilder(renderedAttributes, formBuilderCheckBoxField);
		renderControlsToolbar(renderedAttributes, formBuilderCheckBoxField);
		renderDataType(renderedAttributes, formBuilderCheckBoxField);
		renderDisabled(renderedAttributes, formBuilderCheckBoxField);
		renderDropZoneNode(renderedAttributes, formBuilderCheckBoxField);
		renderHiddenAttributes(renderedAttributes, formBuilderCheckBoxField);
		renderFormBuilderCheckBoxFieldId(renderedAttributes, formBuilderCheckBoxField);
		renderLabel(renderedAttributes, formBuilderCheckBoxField);
		renderLabelNode(renderedAttributes, formBuilderCheckBoxField);
		renderLocalizationMap(renderedAttributes, formBuilderCheckBoxField);
		renderName(renderedAttributes, formBuilderCheckBoxField);
		renderFormBuilderCheckBoxFieldParent(renderedAttributes, formBuilderCheckBoxField);
		renderPredefinedValue(renderedAttributes, formBuilderCheckBoxField);
		renderReadOnly(renderedAttributes, formBuilderCheckBoxField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderCheckBoxField);
		renderRequired(renderedAttributes, formBuilderCheckBoxField);
		renderRequiredFlagNode(renderedAttributes, formBuilderCheckBoxField);
		renderSelected(renderedAttributes, formBuilderCheckBoxField);
		renderShowLabel(renderedAttributes, formBuilderCheckBoxField);
		renderStrings(renderedAttributes, formBuilderCheckBoxField);
		renderTabIndex(renderedAttributes, formBuilderCheckBoxField);
		renderTemplate(renderedAttributes, formBuilderCheckBoxField);
		renderTemplateNode(renderedAttributes, formBuilderCheckBoxField);
		renderTip(renderedAttributes, formBuilderCheckBoxField);
		renderTipFlagNode(renderedAttributes, formBuilderCheckBoxField);
		renderType(renderedAttributes, formBuilderCheckBoxField);
		renderUnique(renderedAttributes, formBuilderCheckBoxField);
		renderZIndex(renderedAttributes, formBuilderCheckBoxField);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterIdChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterNameChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterParentChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterTipChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderCheckBoxField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderCheckBoxField);

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

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnBuilderChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnDisabledChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnIdChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnLabelChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnNameChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnParentChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnRequiredChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnSelectedChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnStringsChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnTemplateChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnTipChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnTypeChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnUniqueChange(renderedOnEvents, formBuilderCheckBoxField);
		renderOnZIndexChange(renderedOnEvents, formBuilderCheckBoxField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderCheckBoxField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean builder = formBuilderCheckBoxField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderCheckBoxField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderCheckBoxField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String dataType = formBuilderCheckBoxField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean disabled = formBuilderCheckBoxField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String dropZoneNode = formBuilderCheckBoxField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderCheckBoxField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderCheckBoxField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderCheckBoxFieldId(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String formBuilderCheckBoxFieldId = formBuilderCheckBoxField.getFormBuilderCheckBoxFieldId();

		if (formBuilderCheckBoxFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.FORM_BUILDER_CHECK_BOX_FIELD_ID, formBuilderCheckBoxFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String label = formBuilderCheckBoxField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String labelNode = formBuilderCheckBoxField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object localizationMap = formBuilderCheckBoxField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderCheckBoxField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String name = formBuilderCheckBoxField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.NAME, name));
		}
	}

	protected void renderFormBuilderCheckBoxFieldParent(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String formBuilderCheckBoxFieldParent = formBuilderCheckBoxField.getFormBuilderCheckBoxFieldParent();

		if (formBuilderCheckBoxFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.FORM_BUILDER_CHECK_BOX_FIELD_PARENT, formBuilderCheckBoxFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean predefinedValue = formBuilderCheckBoxField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean readOnly = formBuilderCheckBoxField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderCheckBoxField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderCheckBoxField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean required = formBuilderCheckBoxField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderCheckBoxField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean selected = formBuilderCheckBoxField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean showLabel = formBuilderCheckBoxField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object strings = formBuilderCheckBoxField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderCheckBoxField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object tabIndex = formBuilderCheckBoxField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderCheckBoxField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String template = formBuilderCheckBoxField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String templateNode = formBuilderCheckBoxField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String tip = formBuilderCheckBoxField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String tipFlagNode = formBuilderCheckBoxField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String type = formBuilderCheckBoxField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean unique = formBuilderCheckBoxField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object zIndex = formBuilderCheckBoxField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderCheckBoxField.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderCheckBoxField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderCheckBoxField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderCheckBoxField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderCheckBoxField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderCheckBoxField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderCheckBoxField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderCheckBoxField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterIdChange = formBuilderCheckBoxField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterLabelChange = formBuilderCheckBoxField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderCheckBoxField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderCheckBoxField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterNameChange = formBuilderCheckBoxField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterParentChange = formBuilderCheckBoxField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderCheckBoxField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderCheckBoxField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderCheckBoxField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderCheckBoxField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderCheckBoxField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderCheckBoxField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderCheckBoxField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterStringsChange = formBuilderCheckBoxField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderCheckBoxField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderCheckBoxField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderCheckBoxField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTipChange = formBuilderCheckBoxField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderCheckBoxField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTypeChange = formBuilderCheckBoxField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderCheckBoxField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderCheckBoxField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderCheckBoxField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onBuilderChange = formBuilderCheckBoxField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderCheckBoxField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderCheckBoxField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onDisabledChange = formBuilderCheckBoxField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderCheckBoxField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderCheckBoxField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onIdChange = formBuilderCheckBoxField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onLabelChange = formBuilderCheckBoxField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderCheckBoxField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderCheckBoxField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onNameChange = formBuilderCheckBoxField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onParentChange = formBuilderCheckBoxField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderCheckBoxField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderCheckBoxField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderCheckBoxField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onRequiredChange = formBuilderCheckBoxField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderCheckBoxField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onSelectedChange = formBuilderCheckBoxField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderCheckBoxField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onStringsChange = formBuilderCheckBoxField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderCheckBoxField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTemplateChange = formBuilderCheckBoxField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderCheckBoxField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTipChange = formBuilderCheckBoxField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderCheckBoxField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTypeChange = formBuilderCheckBoxField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onUniqueChange = formBuilderCheckBoxField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onZIndexChange = formBuilderCheckBoxField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}