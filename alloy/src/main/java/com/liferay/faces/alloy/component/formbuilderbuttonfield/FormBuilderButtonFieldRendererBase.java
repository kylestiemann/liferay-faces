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

		if (formBuilderButtonField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getButtonType() != null) {
			renderButtonType(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getFormBuilderButtonFieldId() != null) {
			renderFormBuilderButtonFieldId(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getName() != null) {
			renderName(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getFormBuilderButtonFieldParent() != null) {
			renderFormBuilderButtonFieldParent(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getType() != null) {
			renderType(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderButtonField);
		}

		if (formBuilderButtonField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderButtonField);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderButtonField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterButtonTypeChange() != null) {
			renderAfterButtonTypeChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderButtonField);
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

		if (formBuilderButtonField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnButtonTypeChange() != null) {
			renderOnButtonTypeChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderButtonField);
		}

		if (formBuilderButtonField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderButtonField);
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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderButtonField.getAcceptChildren();
		renderedAttributes.add(renderBoolean(FormBuilderButtonField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean builder = formBuilderButtonField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderButtonField.BUILDER, builder));
	}

	protected void renderButtonType(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String buttonType = formBuilderButtonField.getButtonType();
		renderedAttributes.add(renderString(FormBuilderButtonField.BUTTON_TYPE, buttonType));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderButtonField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderButtonField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String dataType = formBuilderButtonField.getDataType();
		renderedAttributes.add(renderString(FormBuilderButtonField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean disabled = formBuilderButtonField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderButtonField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String dropZoneNode = formBuilderButtonField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderButtonField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderButtonField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderButtonField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderButtonFieldId(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String formBuilderButtonFieldId = formBuilderButtonField.getFormBuilderButtonFieldId();
		renderedAttributes.add(renderString(FormBuilderButtonField.FORM_BUILDER_BUTTON_FIELD_ID, formBuilderButtonFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String label = formBuilderButtonField.getLabel();
		renderedAttributes.add(renderString(FormBuilderButtonField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String labelNode = formBuilderButtonField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderButtonField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object localizationMap = formBuilderButtonField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderButtonField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String name = formBuilderButtonField.getName();
		renderedAttributes.add(renderString(FormBuilderButtonField.NAME, name));
	}

	protected void renderFormBuilderButtonFieldParent(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String formBuilderButtonFieldParent = formBuilderButtonField.getFormBuilderButtonFieldParent();
		renderedAttributes.add(renderString(FormBuilderButtonField.FORM_BUILDER_BUTTON_FIELD_PARENT, formBuilderButtonFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String predefinedValue = formBuilderButtonField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderButtonField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean readOnly = formBuilderButtonField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderButtonField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderButtonField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderButtonField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean required = formBuilderButtonField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderButtonField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderButtonField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderButtonField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean selected = formBuilderButtonField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderButtonField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean showLabel = formBuilderButtonField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderButtonField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object strings = formBuilderButtonField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderButtonField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object tabIndex = formBuilderButtonField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderButtonField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String template = formBuilderButtonField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderButtonField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String templateNode = formBuilderButtonField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderButtonField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String tip = formBuilderButtonField.getTip();
		renderedAttributes.add(renderString(FormBuilderButtonField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String tipFlagNode = formBuilderButtonField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderButtonField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String type = formBuilderButtonField.getType();
		renderedAttributes.add(renderString(FormBuilderButtonField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Boolean unique = formBuilderButtonField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderButtonField.UNIQUE, unique));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.Object zIndex = formBuilderButtonField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderButtonField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderButtonField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderButtonField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterButtonTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterButtonTypeChange = formBuilderButtonField.getAfterButtonTypeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_BUTTON_TYPE_CHANGE, afterButtonTypeChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderButtonField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderButtonField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderButtonField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderButtonField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderButtonField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterIdChange = formBuilderButtonField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterLabelChange = formBuilderButtonField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderButtonField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderButtonField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterNameChange = formBuilderButtonField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterParentChange = formBuilderButtonField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderButtonField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderButtonField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderButtonField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderButtonField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderButtonField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderButtonField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderButtonField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterStringsChange = formBuilderButtonField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderButtonField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderButtonField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderButtonField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTipChange = formBuilderButtonField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderButtonField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterTypeChange = formBuilderButtonField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderButtonField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderButtonField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderButtonField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onBuilderChange = formBuilderButtonField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnButtonTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onButtonTypeChange = formBuilderButtonField.getOnButtonTypeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_BUTTON_TYPE_CHANGE, onButtonTypeChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderButtonField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderButtonField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onDisabledChange = formBuilderButtonField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderButtonField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderButtonField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onIdChange = formBuilderButtonField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onLabelChange = formBuilderButtonField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderButtonField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderButtonField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onNameChange = formBuilderButtonField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onParentChange = formBuilderButtonField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderButtonField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderButtonField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderButtonField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onRequiredChange = formBuilderButtonField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderButtonField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onSelectedChange = formBuilderButtonField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderButtonField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onStringsChange = formBuilderButtonField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderButtonField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTemplateChange = formBuilderButtonField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderButtonField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTipChange = formBuilderButtonField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderButtonField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onTypeChange = formBuilderButtonField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onUniqueChange = formBuilderButtonField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderButtonField formBuilderButtonField) throws IOException {
		java.lang.String onZIndexChange = formBuilderButtonField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderButtonField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}