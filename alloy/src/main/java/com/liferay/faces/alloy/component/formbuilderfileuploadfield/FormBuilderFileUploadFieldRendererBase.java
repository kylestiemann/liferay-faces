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
package com.liferay.faces.alloy.component.formbuilderfileuploadfield;

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
public abstract class FormBuilderFileUploadFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-upload";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderFileUploadField formBuilderFileUploadField = (FormBuilderFileUploadField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderFileUploadField = new A.FormBuilderFileUploadField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		renderAcceptChildren(renderedAttributes, formBuilderFileUploadField);
		renderBuilder(renderedAttributes, formBuilderFileUploadField);
		renderControlsToolbar(renderedAttributes, formBuilderFileUploadField);
		renderDataType(renderedAttributes, formBuilderFileUploadField);
		renderDisabled(renderedAttributes, formBuilderFileUploadField);
		renderDropZoneNode(renderedAttributes, formBuilderFileUploadField);
		renderHiddenAttributes(renderedAttributes, formBuilderFileUploadField);
		renderFormBuilderFileUploadFieldId(renderedAttributes, formBuilderFileUploadField);
		renderLabel(renderedAttributes, formBuilderFileUploadField);
		renderLabelNode(renderedAttributes, formBuilderFileUploadField);
		renderLocalizationMap(renderedAttributes, formBuilderFileUploadField);
		renderName(renderedAttributes, formBuilderFileUploadField);
		renderFormBuilderFileUploadFieldParent(renderedAttributes, formBuilderFileUploadField);
		renderPredefinedValue(renderedAttributes, formBuilderFileUploadField);
		renderReadOnly(renderedAttributes, formBuilderFileUploadField);
		renderReadOnlyAttributes(renderedAttributes, formBuilderFileUploadField);
		renderRequired(renderedAttributes, formBuilderFileUploadField);
		renderRequiredFlagNode(renderedAttributes, formBuilderFileUploadField);
		renderSelected(renderedAttributes, formBuilderFileUploadField);
		renderShowLabel(renderedAttributes, formBuilderFileUploadField);
		renderStrings(renderedAttributes, formBuilderFileUploadField);
		renderTabIndex(renderedAttributes, formBuilderFileUploadField);
		renderTemplate(renderedAttributes, formBuilderFileUploadField);
		renderTemplateNode(renderedAttributes, formBuilderFileUploadField);
		renderTip(renderedAttributes, formBuilderFileUploadField);
		renderTipFlagNode(renderedAttributes, formBuilderFileUploadField);
		renderType(renderedAttributes, formBuilderFileUploadField);
		renderUnique(renderedAttributes, formBuilderFileUploadField);
		renderZIndex(renderedAttributes, formBuilderFileUploadField);

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterBuilderChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterDataTypeChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterDisabledChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterIdChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterLabelChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterLabelNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterNameChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterParentChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterReadOnlyChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterRequiredChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterSelectedChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterShowLabelChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterStringsChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterTabIndexChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterTemplateChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterTipChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterTypeChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterUniqueChange(renderedAfterEvents, formBuilderFileUploadField);
		renderAfterZIndexChange(renderedAfterEvents, formBuilderFileUploadField);

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

		renderOnAcceptChildrenChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnBuilderChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnControlsToolbarChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnDataTypeChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnDisabledChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnDropZoneNodeChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnHiddenAttributesChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnIdChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnLabelChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnLabelNodeChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnLocalizationMapChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnNameChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnParentChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnPredefinedValueChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnReadOnlyChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnRequiredChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnSelectedChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnShowLabelChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnStringsChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnTabIndexChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnTemplateChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnTemplateNodeChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnTipChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnTipFlagNodeChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnTypeChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnUniqueChange(renderedOnEvents, formBuilderFileUploadField);
		renderOnZIndexChange(renderedOnEvents, formBuilderFileUploadField);

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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderFileUploadField.getAcceptChildren();

		if (acceptChildren != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.ACCEPT_CHILDREN, acceptChildren));
		}
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean builder = formBuilderFileUploadField.getBuilder();

		if (builder != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.BUILDER, builder));
		}
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderFileUploadField.getControlsToolbar();

		if (controlsToolbar != null) {
			renderedAttributes.add(renderObject(FormBuilderFileUploadField.CONTROLS_TOOLBAR, controlsToolbar));
		}
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String dataType = formBuilderFileUploadField.getDataType();

		if (dataType != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.DATA_TYPE, dataType));
		}
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean disabled = formBuilderFileUploadField.getDisabled();

		if (disabled != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.DISABLED, disabled));
		}
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String dropZoneNode = formBuilderFileUploadField.getDropZoneNode();

		if (dropZoneNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.DROP_ZONE_NODE, dropZoneNode));
		}
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderFileUploadField.getHiddenAttributes();

		if (hiddenAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderFileUploadField.HIDDEN_ATTRIBUTES, hiddenAttributes));
		}
	}

	protected void renderFormBuilderFileUploadFieldId(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String formBuilderFileUploadFieldId = formBuilderFileUploadField.getFormBuilderFileUploadFieldId();

		if (formBuilderFileUploadFieldId != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.FORM_BUILDER_FILE_UPLOAD_FIELD_ID, formBuilderFileUploadFieldId));
		}
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String label = formBuilderFileUploadField.getLabel();

		if (label != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.LABEL, label));
		}
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String labelNode = formBuilderFileUploadField.getLabelNode();

		if (labelNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.LABEL_NODE, labelNode));
		}
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object localizationMap = formBuilderFileUploadField.getLocalizationMap();

		if (localizationMap != null) {
			renderedAttributes.add(renderObject(FormBuilderFileUploadField.LOCALIZATION_MAP, localizationMap));
		}
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String name = formBuilderFileUploadField.getName();

		if (name != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.NAME, name));
		}
	}

	protected void renderFormBuilderFileUploadFieldParent(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String formBuilderFileUploadFieldParent = formBuilderFileUploadField.getFormBuilderFileUploadFieldParent();

		if (formBuilderFileUploadFieldParent != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.FORM_BUILDER_FILE_UPLOAD_FIELD_PARENT, formBuilderFileUploadFieldParent));
		}
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String predefinedValue = formBuilderFileUploadField.getPredefinedValue();

		if (predefinedValue != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.PREDEFINED_VALUE, predefinedValue));
		}
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean readOnly = formBuilderFileUploadField.getReadOnly();

		if (readOnly != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.READ_ONLY, readOnly));
		}
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderFileUploadField.getReadOnlyAttributes();

		if (readOnlyAttributes != null) {
			renderedAttributes.add(renderArray(FormBuilderFileUploadField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
		}
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean required = formBuilderFileUploadField.getRequired();

		if (required != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.REQUIRED, required));
		}
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderFileUploadField.getRequiredFlagNode();

		if (requiredFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.REQUIRED_FLAG_NODE, requiredFlagNode));
		}
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean selected = formBuilderFileUploadField.getSelected();

		if (selected != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.SELECTED, selected));
		}
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean showLabel = formBuilderFileUploadField.getShowLabel();

		if (showLabel != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.SHOW_LABEL, showLabel));
		}
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object strings = formBuilderFileUploadField.getStrings();

		if (strings != null) {
			renderedAttributes.add(renderObject(FormBuilderFileUploadField.STRINGS, strings));
		}
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object tabIndex = formBuilderFileUploadField.getTabIndex();

		if (tabIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderFileUploadField.TAB_INDEX, tabIndex));
		}
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String template = formBuilderFileUploadField.getTemplate();

		if (template != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TEMPLATE, template));
		}
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String templateNode = formBuilderFileUploadField.getTemplateNode();

		if (templateNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TEMPLATE_NODE, templateNode));
		}
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String tip = formBuilderFileUploadField.getTip();

		if (tip != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TIP, tip));
		}
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String tipFlagNode = formBuilderFileUploadField.getTipFlagNode();

		if (tipFlagNode != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TIP_FLAG_NODE, tipFlagNode));
		}
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String type = formBuilderFileUploadField.getType();

		if (type != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.TYPE, type));
		}
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Boolean unique = formBuilderFileUploadField.getUnique();

		if (unique != null) {
			renderedAttributes.add(renderBoolean(FormBuilderFileUploadField.UNIQUE, unique));
		}
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.Object zIndex = formBuilderFileUploadField.getZIndex();

		if (zIndex != null) {
			renderedAttributes.add(renderNumber(FormBuilderFileUploadField.Z_INDEX, zIndex));
		}
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderFileUploadField.getAfterAcceptChildrenChange();

		if (afterAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
		}
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderFileUploadField.getAfterBuilderChange();

		if (afterBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_BUILDER_CHANGE, afterBuilderChange));
		}
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderFileUploadField.getAfterControlsToolbarChange();

		if (afterControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
		}
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderFileUploadField.getAfterDataTypeChange();

		if (afterDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
		}
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderFileUploadField.getAfterDisabledChange();

		if (afterDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_DISABLED_CHANGE, afterDisabledChange));
		}
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderFileUploadField.getAfterDropZoneNodeChange();

		if (afterDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
		}
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderFileUploadField.getAfterHiddenAttributesChange();

		if (afterHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
		}
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterIdChange = formBuilderFileUploadField.getAfterIdChange();

		if (afterIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_ID_CHANGE, afterIdChange));
		}
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterLabelChange = formBuilderFileUploadField.getAfterLabelChange();

		if (afterLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_LABEL_CHANGE, afterLabelChange));
		}
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderFileUploadField.getAfterLabelNodeChange();

		if (afterLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
		}
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderFileUploadField.getAfterLocalizationMapChange();

		if (afterLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
		}
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterNameChange = formBuilderFileUploadField.getAfterNameChange();

		if (afterNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_NAME_CHANGE, afterNameChange));
		}
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterParentChange = formBuilderFileUploadField.getAfterParentChange();

		if (afterParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_PARENT_CHANGE, afterParentChange));
		}
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderFileUploadField.getAfterPredefinedValueChange();

		if (afterPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
		}
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderFileUploadField.getAfterReadOnlyChange();

		if (afterReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
		}
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderFileUploadField.getAfterReadOnlyAttributesChange();

		if (afterReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
		}
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderFileUploadField.getAfterRequiredChange();

		if (afterRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
		}
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderFileUploadField.getAfterRequiredFlagNodeChange();

		if (afterRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
		}
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderFileUploadField.getAfterSelectedChange();

		if (afterSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_SELECTED_CHANGE, afterSelectedChange));
		}
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderFileUploadField.getAfterShowLabelChange();

		if (afterShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
		}
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterStringsChange = formBuilderFileUploadField.getAfterStringsChange();

		if (afterStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_STRINGS_CHANGE, afterStringsChange));
		}
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderFileUploadField.getAfterTabIndexChange();

		if (afterTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
		}
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderFileUploadField.getAfterTemplateChange();

		if (afterTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
		}
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderFileUploadField.getAfterTemplateNodeChange();

		if (afterTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
		}
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTipChange = formBuilderFileUploadField.getAfterTipChange();

		if (afterTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TIP_CHANGE, afterTipChange));
		}
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderFileUploadField.getAfterTipFlagNodeChange();

		if (afterTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
		}
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterTypeChange = formBuilderFileUploadField.getAfterTypeChange();

		if (afterTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_TYPE_CHANGE, afterTypeChange));
		}
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderFileUploadField.getAfterUniqueChange();

		if (afterUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
		}
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderFileUploadField.getAfterZIndexChange();

		if (afterZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
		}
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderFileUploadField.getOnAcceptChildrenChange();

		if (onAcceptChildrenChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
		}
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onBuilderChange = formBuilderFileUploadField.getOnBuilderChange();

		if (onBuilderChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_BUILDER_CHANGE, onBuilderChange));
		}
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderFileUploadField.getOnControlsToolbarChange();

		if (onControlsToolbarChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
		}
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderFileUploadField.getOnDataTypeChange();

		if (onDataTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
		}
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onDisabledChange = formBuilderFileUploadField.getOnDisabledChange();

		if (onDisabledChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_DISABLED_CHANGE, onDisabledChange));
		}
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderFileUploadField.getOnDropZoneNodeChange();

		if (onDropZoneNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
		}
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderFileUploadField.getOnHiddenAttributesChange();

		if (onHiddenAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
		}
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onIdChange = formBuilderFileUploadField.getOnIdChange();

		if (onIdChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_ID_CHANGE, onIdChange));
		}
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onLabelChange = formBuilderFileUploadField.getOnLabelChange();

		if (onLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_LABEL_CHANGE, onLabelChange));
		}
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderFileUploadField.getOnLabelNodeChange();

		if (onLabelNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
		}
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderFileUploadField.getOnLocalizationMapChange();

		if (onLocalizationMapChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
		}
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onNameChange = formBuilderFileUploadField.getOnNameChange();

		if (onNameChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_NAME_CHANGE, onNameChange));
		}
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onParentChange = formBuilderFileUploadField.getOnParentChange();

		if (onParentChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_PARENT_CHANGE, onParentChange));
		}
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderFileUploadField.getOnPredefinedValueChange();

		if (onPredefinedValueChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
		}
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderFileUploadField.getOnReadOnlyChange();

		if (onReadOnlyChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
		}
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderFileUploadField.getOnReadOnlyAttributesChange();

		if (onReadOnlyAttributesChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
		}
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onRequiredChange = formBuilderFileUploadField.getOnRequiredChange();

		if (onRequiredChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_REQUIRED_CHANGE, onRequiredChange));
		}
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderFileUploadField.getOnRequiredFlagNodeChange();

		if (onRequiredFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
		}
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onSelectedChange = formBuilderFileUploadField.getOnSelectedChange();

		if (onSelectedChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_SELECTED_CHANGE, onSelectedChange));
		}
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderFileUploadField.getOnShowLabelChange();

		if (onShowLabelChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
		}
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onStringsChange = formBuilderFileUploadField.getOnStringsChange();

		if (onStringsChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_STRINGS_CHANGE, onStringsChange));
		}
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderFileUploadField.getOnTabIndexChange();

		if (onTabIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
		}
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTemplateChange = formBuilderFileUploadField.getOnTemplateChange();

		if (onTemplateChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TEMPLATE_CHANGE, onTemplateChange));
		}
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderFileUploadField.getOnTemplateNodeChange();

		if (onTemplateNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
		}
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTipChange = formBuilderFileUploadField.getOnTipChange();

		if (onTipChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TIP_CHANGE, onTipChange));
		}
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderFileUploadField.getOnTipFlagNodeChange();

		if (onTipFlagNodeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
		}
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onTypeChange = formBuilderFileUploadField.getOnTypeChange();

		if (onTypeChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_TYPE_CHANGE, onTypeChange));
		}
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onUniqueChange = formBuilderFileUploadField.getOnUniqueChange();

		if (onUniqueChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_UNIQUE_CHANGE, onUniqueChange));
		}
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderFileUploadField formBuilderFileUploadField) throws IOException {
		java.lang.String onZIndexChange = formBuilderFileUploadField.getOnZIndexChange();

		if (onZIndexChange != null) {
			renderedAttributes.add(renderString(FormBuilderFileUploadField.ON_ZINDEX_CHANGE, onZIndexChange));
		}
	}

}