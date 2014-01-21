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

		if (formBuilderCheckBoxField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getFormBuilderCheckBoxFieldId() != null) {
			renderFormBuilderCheckBoxFieldId(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getName() != null) {
			renderName(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getFormBuilderCheckBoxFieldParent() != null) {
			renderFormBuilderCheckBoxFieldParent(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getType() != null) {
			renderType(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderCheckBoxField);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderCheckBoxField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderCheckBoxField);
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

		if (formBuilderCheckBoxField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderCheckBoxField);
		}

		if (formBuilderCheckBoxField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderCheckBoxField);
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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderCheckBoxField.getAcceptChildren();
		renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean builder = formBuilderCheckBoxField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.BUILDER, builder));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderCheckBoxField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderCheckBoxField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String dataType = formBuilderCheckBoxField.getDataType();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean disabled = formBuilderCheckBoxField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String dropZoneNode = formBuilderCheckBoxField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderCheckBoxField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderCheckBoxField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderCheckBoxFieldId(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String formBuilderCheckBoxFieldId = formBuilderCheckBoxField.getFormBuilderCheckBoxFieldId();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.FORM_BUILDER_CHECK_BOX_FIELD_ID, formBuilderCheckBoxFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String label = formBuilderCheckBoxField.getLabel();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String labelNode = formBuilderCheckBoxField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object localizationMap = formBuilderCheckBoxField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderCheckBoxField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String name = formBuilderCheckBoxField.getName();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.NAME, name));
	}

	protected void renderFormBuilderCheckBoxFieldParent(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String formBuilderCheckBoxFieldParent = formBuilderCheckBoxField.getFormBuilderCheckBoxFieldParent();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.FORM_BUILDER_CHECK_BOX_FIELD_PARENT, formBuilderCheckBoxFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean predefinedValue = formBuilderCheckBoxField.getPredefinedValue();
		renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean readOnly = formBuilderCheckBoxField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderCheckBoxField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderCheckBoxField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean required = formBuilderCheckBoxField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderCheckBoxField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean selected = formBuilderCheckBoxField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean showLabel = formBuilderCheckBoxField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object strings = formBuilderCheckBoxField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderCheckBoxField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object tabIndex = formBuilderCheckBoxField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderCheckBoxField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String template = formBuilderCheckBoxField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String templateNode = formBuilderCheckBoxField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String tip = formBuilderCheckBoxField.getTip();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String tipFlagNode = formBuilderCheckBoxField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String type = formBuilderCheckBoxField.getType();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Boolean unique = formBuilderCheckBoxField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderCheckBoxField.UNIQUE, unique));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.Object zIndex = formBuilderCheckBoxField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderCheckBoxField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderCheckBoxField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderCheckBoxField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderCheckBoxField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderCheckBoxField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderCheckBoxField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderCheckBoxField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderCheckBoxField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterIdChange = formBuilderCheckBoxField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterLabelChange = formBuilderCheckBoxField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderCheckBoxField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderCheckBoxField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterNameChange = formBuilderCheckBoxField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterParentChange = formBuilderCheckBoxField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderCheckBoxField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderCheckBoxField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderCheckBoxField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderCheckBoxField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderCheckBoxField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderCheckBoxField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderCheckBoxField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterStringsChange = formBuilderCheckBoxField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderCheckBoxField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderCheckBoxField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderCheckBoxField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTipChange = formBuilderCheckBoxField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderCheckBoxField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterTypeChange = formBuilderCheckBoxField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderCheckBoxField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderCheckBoxField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderCheckBoxField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onBuilderChange = formBuilderCheckBoxField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderCheckBoxField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderCheckBoxField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onDisabledChange = formBuilderCheckBoxField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderCheckBoxField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderCheckBoxField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onIdChange = formBuilderCheckBoxField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onLabelChange = formBuilderCheckBoxField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderCheckBoxField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderCheckBoxField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onNameChange = formBuilderCheckBoxField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onParentChange = formBuilderCheckBoxField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderCheckBoxField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderCheckBoxField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderCheckBoxField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onRequiredChange = formBuilderCheckBoxField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderCheckBoxField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onSelectedChange = formBuilderCheckBoxField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderCheckBoxField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onStringsChange = formBuilderCheckBoxField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderCheckBoxField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTemplateChange = formBuilderCheckBoxField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderCheckBoxField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTipChange = formBuilderCheckBoxField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderCheckBoxField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onTypeChange = formBuilderCheckBoxField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onUniqueChange = formBuilderCheckBoxField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderCheckBoxField formBuilderCheckBoxField) throws IOException {
		java.lang.String onZIndexChange = formBuilderCheckBoxField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderCheckBoxField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}