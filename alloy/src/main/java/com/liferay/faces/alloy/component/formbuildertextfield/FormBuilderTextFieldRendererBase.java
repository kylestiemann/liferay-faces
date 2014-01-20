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
package com.liferay.faces.alloy.component.formbuildertextfield;

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
public abstract class FormBuilderTextFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-text";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderTextField formBuilderTextField = (FormBuilderTextField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderTextField = new A.FormBuilderTextField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderTextField);
		renderBuilder(renderedAttributes, formBuilderTextField);
		renderControlsToolbar(renderedAttributes, formBuilderTextField);
		renderDataType(renderedAttributes, formBuilderTextField);
		renderDisabled(renderedAttributes, formBuilderTextField);
		renderDropZoneNode(renderedAttributes, formBuilderTextField);
		renderHiddenAttributes(renderedAttributes, formBuilderTextField);
		renderFormBuilderTextFieldId(renderedAttributes, formBuilderTextField);
		renderLabel(renderedAttributes, formBuilderTextField);
		renderLabelNode(renderedAttributes, formBuilderTextField);
		renderLocalizationMap(renderedAttributes, formBuilderTextField);
		renderName(renderedAttributes, formBuilderTextField);
		renderFormBuilderTextFieldParent(renderedAttributes, formBuilderTextField);
		renderPredefinedValue(renderedAttributes, formBuilderTextField);
		renderReadOnly(renderedAttributes, formBuilderTextField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderTextField);
		renderRequired(renderedAttributes, formBuilderTextField);
		renderRequiredFlagNode(renderedAttributes, formBuilderTextField);
		renderSelected(renderedAttributes, formBuilderTextField);
		renderShowLabel(renderedAttributes, formBuilderTextField);
		renderStrings(renderedAttributes, formBuilderTextField);
		renderTabIndex(renderedAttributes, formBuilderTextField);
		renderTemplate(renderedAttributes, formBuilderTextField);
		renderTemplateNode(renderedAttributes, formBuilderTextField);
		renderTip(renderedAttributes, formBuilderTextField);
		renderTipFlagNode(renderedAttributes, formBuilderTextField);
		renderType(renderedAttributes, formBuilderTextField);
		renderUnique(renderedAttributes, formBuilderTextField);
		renderWidth(renderedAttributes, formBuilderTextField);
		renderZIndex(renderedAttributes, formBuilderTextField);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderTextField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderTextField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderTextField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderTextField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderTextField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderTextField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderTextField);
		renderAfterIdChange(renderedAfterEvents, formBuilderTextField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderTextField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderTextField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderTextField);
		renderAfterNameChange(renderedAfterEvents, formBuilderTextField);
		renderAfterParentChange(renderedAfterEvents, formBuilderTextField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderTextField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderTextField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderTextField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderTextField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderTextField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderTextField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderTextField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderTextField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderTextField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderTextField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderTextField);
		renderAfterTipChange(renderedAfterEvents, formBuilderTextField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderTextField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderTextField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderTextField);
		renderAfterWidthChange(renderedAfterEvents, formBuilderTextField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderTextField);

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

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderTextField);
		renderOnBuilderChange(renderedOnEvents, formBuilderTextField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderTextField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderTextField);
		renderOnDisabledChange(renderedOnEvents, formBuilderTextField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderTextField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderTextField);
		renderOnIdChange(renderedOnEvents, formBuilderTextField);
		renderOnLabelChange(renderedOnEvents, formBuilderTextField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderTextField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderTextField);
		renderOnNameChange(renderedOnEvents, formBuilderTextField);
		renderOnParentChange(renderedOnEvents, formBuilderTextField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderTextField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderTextField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderTextField);
		renderOnRequiredChange(renderedOnEvents, formBuilderTextField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderTextField);
		renderOnSelectedChange(renderedOnEvents, formBuilderTextField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderTextField);
		renderOnStringsChange(renderedOnEvents, formBuilderTextField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderTextField);
		renderOnTemplateChange(renderedOnEvents, formBuilderTextField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderTextField);
		renderOnTipChange(renderedOnEvents, formBuilderTextField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderTextField);
		renderOnTypeChange(renderedOnEvents, formBuilderTextField);
		renderOnUniqueChange(renderedOnEvents, formBuilderTextField);
		renderOnWidthChange(renderedOnEvents, formBuilderTextField);
		renderOnZIndexChange(renderedOnEvents, formBuilderTextField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderTextField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean builder = formBuilderTextField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderTextField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderTextField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String dataType = formBuilderTextField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean disabled = formBuilderTextField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String dropZoneNode = formBuilderTextField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderTextField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderTextField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderTextFieldId(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String formBuilderTextFieldId = formBuilderTextField.getFormBuilderTextFieldId();

		if (formBuilderTextFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.FORM_BUILDER_TEXT_FIELD_ID, formBuilderTextFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String label = formBuilderTextField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String labelNode = formBuilderTextField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object localizationMap = formBuilderTextField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderTextField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String name = formBuilderTextField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.NAME, name));
		}
	}

	protected void renderFormBuilderTextFieldParent(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String formBuilderTextFieldParent = formBuilderTextField.getFormBuilderTextFieldParent();

		if (formBuilderTextFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.FORM_BUILDER_TEXT_FIELD_PARENT, formBuilderTextFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String predefinedValue = formBuilderTextField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean readOnly = formBuilderTextField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderTextField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderTextField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean required = formBuilderTextField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderTextField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean selected = formBuilderTextField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean showLabel = formBuilderTextField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object strings = formBuilderTextField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderTextField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object tabIndex = formBuilderTextField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderTextField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String template = formBuilderTextField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String templateNode = formBuilderTextField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String tip = formBuilderTextField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String tipFlagNode = formBuilderTextField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String type = formBuilderTextField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean unique = formBuilderTextField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextField.UNIQUE, unique));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String width = formBuilderTextField.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.WIDTH, width));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object zIndex = formBuilderTextField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderTextField.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderTextField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderTextField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderTextField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderTextField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderTextField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderTextField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderTextField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterIdChange = formBuilderTextField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterLabelChange = formBuilderTextField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderTextField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderTextField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterNameChange = formBuilderTextField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterParentChange = formBuilderTextField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderTextField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderTextField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderTextField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderTextField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderTextField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderTextField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderTextField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterStringsChange = formBuilderTextField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderTextField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderTextField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderTextField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTipChange = formBuilderTextField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderTextField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTypeChange = formBuilderTextField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderTextField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterWidthChange = formBuilderTextField.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderTextField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderTextField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onBuilderChange = formBuilderTextField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderTextField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderTextField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onDisabledChange = formBuilderTextField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderTextField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderTextField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onIdChange = formBuilderTextField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onLabelChange = formBuilderTextField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderTextField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderTextField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onNameChange = formBuilderTextField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onParentChange = formBuilderTextField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderTextField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderTextField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderTextField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onRequiredChange = formBuilderTextField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderTextField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onSelectedChange = formBuilderTextField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderTextField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onStringsChange = formBuilderTextField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderTextField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTemplateChange = formBuilderTextField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderTextField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTipChange = formBuilderTextField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderTextField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTypeChange = formBuilderTextField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onUniqueChange = formBuilderTextField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onWidthChange = formBuilderTextField.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onZIndexChange = formBuilderTextField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}