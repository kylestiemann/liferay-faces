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

		if (formBuilderField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getFormBuilderFieldId() != null) {
			renderFormBuilderFieldId(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getName() != null) {
			renderName(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getFormBuilderFieldParent() != null) {
			renderFormBuilderFieldParent(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getType() != null) {
			renderType(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderField);
		}
		
		if (formBuilderField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderField);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderField);
		}
		
		if (formBuilderField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderField);
		}
		

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

		if (formBuilderField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderField);
		}
		
		if (formBuilderField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderField);
		}
		

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
		renderedAttributes.add(renderBoolean(FormBuilderField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean builder = formBuilderField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderField.BUILDER, builder));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String dataType = formBuilderField.getDataType();
		renderedAttributes.add(renderString(FormBuilderField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean disabled = formBuilderField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String dropZoneNode = formBuilderField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderFieldId(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String formBuilderFieldId = formBuilderField.getFormBuilderFieldId();
		renderedAttributes.add(renderString(FormBuilderField.FORM_BUILDER_FIELD_ID, formBuilderFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String label = formBuilderField.getLabel();
		renderedAttributes.add(renderString(FormBuilderField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String labelNode = formBuilderField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object localizationMap = formBuilderField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String name = formBuilderField.getName();
		renderedAttributes.add(renderString(FormBuilderField.NAME, name));
	}

	protected void renderFormBuilderFieldParent(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String formBuilderFieldParent = formBuilderField.getFormBuilderFieldParent();
		renderedAttributes.add(renderString(FormBuilderField.FORM_BUILDER_FIELD_PARENT, formBuilderFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String predefinedValue = formBuilderField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean readOnly = formBuilderField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean required = formBuilderField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean selected = formBuilderField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean showLabel = formBuilderField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object strings = formBuilderField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object tabIndex = formBuilderField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String template = formBuilderField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String templateNode = formBuilderField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String tip = formBuilderField.getTip();
		renderedAttributes.add(renderString(FormBuilderField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String tipFlagNode = formBuilderField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String type = formBuilderField.getType();
		renderedAttributes.add(renderString(FormBuilderField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Boolean unique = formBuilderField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderField.UNIQUE, unique));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.Object zIndex = formBuilderField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterIdChange = formBuilderField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterLabelChange = formBuilderField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterNameChange = formBuilderField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterParentChange = formBuilderField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterStringsChange = formBuilderField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTipChange = formBuilderField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterTypeChange = formBuilderField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onBuilderChange = formBuilderField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onDisabledChange = formBuilderField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onIdChange = formBuilderField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onLabelChange = formBuilderField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onNameChange = formBuilderField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onParentChange = formBuilderField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onRequiredChange = formBuilderField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onSelectedChange = formBuilderField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onStringsChange = formBuilderField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTemplateChange = formBuilderField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTipChange = formBuilderField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onTypeChange = formBuilderField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onUniqueChange = formBuilderField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderField formBuilderField) throws IOException {
		java.lang.String onZIndexChange = formBuilderField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}