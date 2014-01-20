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
package com.liferay.faces.alloy.component.formbuildertextareafield;

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
public abstract class FormBuilderTextAreaFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-textarea";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderTextAreaField formBuilderTextAreaField = (FormBuilderTextAreaField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderTextAreaField = new A.FormBuilderTextAreaField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderTextAreaField);
		renderBuilder(renderedAttributes, formBuilderTextAreaField);
		renderControlsToolbar(renderedAttributes, formBuilderTextAreaField);
		renderDataType(renderedAttributes, formBuilderTextAreaField);
		renderDisabled(renderedAttributes, formBuilderTextAreaField);
		renderDropZoneNode(renderedAttributes, formBuilderTextAreaField);
		renderHiddenAttributes(renderedAttributes, formBuilderTextAreaField);
		renderFormBuilderTextAreaFieldId(renderedAttributes, formBuilderTextAreaField);
		renderLabel(renderedAttributes, formBuilderTextAreaField);
		renderLabelNode(renderedAttributes, formBuilderTextAreaField);
		renderLocalizationMap(renderedAttributes, formBuilderTextAreaField);
		renderName(renderedAttributes, formBuilderTextAreaField);
		renderFormBuilderTextAreaFieldParent(renderedAttributes, formBuilderTextAreaField);
		renderPredefinedValue(renderedAttributes, formBuilderTextAreaField);
		renderReadOnly(renderedAttributes, formBuilderTextAreaField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderTextAreaField);
		renderRequired(renderedAttributes, formBuilderTextAreaField);
		renderRequiredFlagNode(renderedAttributes, formBuilderTextAreaField);
		renderSelected(renderedAttributes, formBuilderTextAreaField);
		renderShowLabel(renderedAttributes, formBuilderTextAreaField);
		renderStrings(renderedAttributes, formBuilderTextAreaField);
		renderTabIndex(renderedAttributes, formBuilderTextAreaField);
		renderTemplate(renderedAttributes, formBuilderTextAreaField);
		renderTemplateNode(renderedAttributes, formBuilderTextAreaField);
		renderTip(renderedAttributes, formBuilderTextAreaField);
		renderTipFlagNode(renderedAttributes, formBuilderTextAreaField);
		renderType(renderedAttributes, formBuilderTextAreaField);
		renderUnique(renderedAttributes, formBuilderTextAreaField);
		renderWidth(renderedAttributes, formBuilderTextAreaField);
		renderZIndex(renderedAttributes, formBuilderTextAreaField);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterIdChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterNameChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterParentChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterTipChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterWidthChange(renderedAfterEvents, formBuilderTextAreaField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderTextAreaField);

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

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnBuilderChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnDisabledChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnIdChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnLabelChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnNameChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnParentChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnRequiredChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnSelectedChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnStringsChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnTemplateChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnTipChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnTypeChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnUniqueChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnWidthChange(renderedOnEvents, formBuilderTextAreaField);
		renderOnZIndexChange(renderedOnEvents, formBuilderTextAreaField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderTextAreaField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean builder = formBuilderTextAreaField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderTextAreaField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderTextAreaField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String dataType = formBuilderTextAreaField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean disabled = formBuilderTextAreaField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String dropZoneNode = formBuilderTextAreaField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderTextAreaField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderTextAreaField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderTextAreaFieldId(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String formBuilderTextAreaFieldId = formBuilderTextAreaField.getFormBuilderTextAreaFieldId();

		if (formBuilderTextAreaFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.FORM_BUILDER_TEXT_AREA_FIELD_ID, formBuilderTextAreaFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String label = formBuilderTextAreaField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String labelNode = formBuilderTextAreaField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object localizationMap = formBuilderTextAreaField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderTextAreaField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String name = formBuilderTextAreaField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.NAME, name));
		}
	}

	protected void renderFormBuilderTextAreaFieldParent(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String formBuilderTextAreaFieldParent = formBuilderTextAreaField.getFormBuilderTextAreaFieldParent();

		if (formBuilderTextAreaFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.FORM_BUILDER_TEXT_AREA_FIELD_PARENT, formBuilderTextAreaFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String predefinedValue = formBuilderTextAreaField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean readOnly = formBuilderTextAreaField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderTextAreaField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderTextAreaField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean required = formBuilderTextAreaField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderTextAreaField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean selected = formBuilderTextAreaField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean showLabel = formBuilderTextAreaField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object strings = formBuilderTextAreaField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderTextAreaField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object tabIndex = formBuilderTextAreaField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderTextAreaField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String template = formBuilderTextAreaField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String templateNode = formBuilderTextAreaField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String tip = formBuilderTextAreaField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String tipFlagNode = formBuilderTextAreaField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String type = formBuilderTextAreaField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Boolean unique = formBuilderTextAreaField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderTextAreaField.UNIQUE, unique));
		}
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String width = formBuilderTextAreaField.getWidth();

		if (width != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.WIDTH, width));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.Object zIndex = formBuilderTextAreaField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderTextAreaField.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderTextAreaField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderTextAreaField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderTextAreaField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderTextAreaField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderTextAreaField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderTextAreaField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderTextAreaField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterIdChange = formBuilderTextAreaField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterLabelChange = formBuilderTextAreaField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderTextAreaField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderTextAreaField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterNameChange = formBuilderTextAreaField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterParentChange = formBuilderTextAreaField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderTextAreaField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderTextAreaField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderTextAreaField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderTextAreaField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderTextAreaField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderTextAreaField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderTextAreaField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterStringsChange = formBuilderTextAreaField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderTextAreaField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderTextAreaField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderTextAreaField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTipChange = formBuilderTextAreaField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderTextAreaField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterTypeChange = formBuilderTextAreaField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderTextAreaField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterWidthChange = formBuilderTextAreaField.getAfterWidthChange();

		if (afterWidthChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_WIDTH_CHANGE, afterWidthChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderTextAreaField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderTextAreaField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onBuilderChange = formBuilderTextAreaField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderTextAreaField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderTextAreaField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onDisabledChange = formBuilderTextAreaField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderTextAreaField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderTextAreaField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onIdChange = formBuilderTextAreaField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onLabelChange = formBuilderTextAreaField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderTextAreaField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderTextAreaField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onNameChange = formBuilderTextAreaField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onParentChange = formBuilderTextAreaField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderTextAreaField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderTextAreaField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderTextAreaField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onRequiredChange = formBuilderTextAreaField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderTextAreaField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onSelectedChange = formBuilderTextAreaField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderTextAreaField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onStringsChange = formBuilderTextAreaField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderTextAreaField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTemplateChange = formBuilderTextAreaField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderTextAreaField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTipChange = formBuilderTextAreaField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderTextAreaField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onTypeChange = formBuilderTextAreaField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onUniqueChange = formBuilderTextAreaField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onWidthChange = formBuilderTextAreaField.getOnWidthChange();

		if (onWidthChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_WIDTH_CHANGE, onWidthChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderTextAreaField formBuilderTextAreaField) throws IOException {
		java.lang.String onZIndexChange = formBuilderTextAreaField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderTextAreaField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}