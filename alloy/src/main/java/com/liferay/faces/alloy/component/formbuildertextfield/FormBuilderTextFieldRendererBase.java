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

		if (formBuilderTextField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getFormBuilderTextFieldId() != null) {
			renderFormBuilderTextFieldId(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getName() != null) {
			renderName(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getFormBuilderTextFieldParent() != null) {
			renderFormBuilderTextFieldParent(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getType() != null) {
			renderType(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getWidth() != null) {
			renderWidth(renderedAttributes, formBuilderTextField);
		}

		if (formBuilderTextField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderTextField);
		}


		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderTextField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterWidthChange() != null) {
			renderAfterWidthChange(renderedAfterEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderTextField);
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

		if (formBuilderTextField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnWidthChange() != null) {
			renderOnWidthChange(renderedOnEvents, formBuilderTextField);
		}

		if (formBuilderTextField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderTextField);
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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderTextField.getAcceptChildren();
		renderedAttributes.add(renderBoolean(FormBuilderTextField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean builder = formBuilderTextField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderTextField.BUILDER, builder));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderTextField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderTextField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String dataType = formBuilderTextField.getDataType();
		renderedAttributes.add(renderString(FormBuilderTextField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean disabled = formBuilderTextField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderTextField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String dropZoneNode = formBuilderTextField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderTextField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderTextField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderTextField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderTextFieldId(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String formBuilderTextFieldId = formBuilderTextField.getFormBuilderTextFieldId();
		renderedAttributes.add(renderString(FormBuilderTextField.FORM_BUILDER_TEXT_FIELD_ID, formBuilderTextFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String label = formBuilderTextField.getLabel();
		renderedAttributes.add(renderString(FormBuilderTextField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String labelNode = formBuilderTextField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderTextField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object localizationMap = formBuilderTextField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderTextField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String name = formBuilderTextField.getName();
		renderedAttributes.add(renderString(FormBuilderTextField.NAME, name));
	}

	protected void renderFormBuilderTextFieldParent(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String formBuilderTextFieldParent = formBuilderTextField.getFormBuilderTextFieldParent();
		renderedAttributes.add(renderString(FormBuilderTextField.FORM_BUILDER_TEXT_FIELD_PARENT, formBuilderTextFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String predefinedValue = formBuilderTextField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderTextField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean readOnly = formBuilderTextField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderTextField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderTextField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderTextField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean required = formBuilderTextField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderTextField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderTextField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderTextField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean selected = formBuilderTextField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderTextField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean showLabel = formBuilderTextField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderTextField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object strings = formBuilderTextField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderTextField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object tabIndex = formBuilderTextField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderTextField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String template = formBuilderTextField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderTextField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String templateNode = formBuilderTextField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderTextField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String tip = formBuilderTextField.getTip();
		renderedAttributes.add(renderString(FormBuilderTextField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String tipFlagNode = formBuilderTextField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderTextField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String type = formBuilderTextField.getType();
		renderedAttributes.add(renderString(FormBuilderTextField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Boolean unique = formBuilderTextField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderTextField.UNIQUE, unique));
	}

	protected void renderWidth(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String width = formBuilderTextField.getWidth();
		renderedAttributes.add(renderString(FormBuilderTextField.WIDTH, width));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.Object zIndex = formBuilderTextField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderTextField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderTextField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderTextField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderTextField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderTextField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderTextField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderTextField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderTextField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterIdChange = formBuilderTextField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterLabelChange = formBuilderTextField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderTextField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderTextField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterNameChange = formBuilderTextField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterParentChange = formBuilderTextField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderTextField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderTextField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderTextField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderTextField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderTextField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderTextField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderTextField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterStringsChange = formBuilderTextField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderTextField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderTextField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderTextField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTipChange = formBuilderTextField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderTextField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterTypeChange = formBuilderTextField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderTextField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterWidthChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterWidthChange = formBuilderTextField.getAfterWidthChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_WIDTH_CHANGE, afterWidthChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderTextField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderTextField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderTextField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onBuilderChange = formBuilderTextField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderTextField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderTextField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onDisabledChange = formBuilderTextField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderTextField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderTextField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onIdChange = formBuilderTextField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onLabelChange = formBuilderTextField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderTextField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderTextField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onNameChange = formBuilderTextField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onParentChange = formBuilderTextField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderTextField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderTextField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderTextField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onRequiredChange = formBuilderTextField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderTextField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onSelectedChange = formBuilderTextField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderTextField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onStringsChange = formBuilderTextField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderTextField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTemplateChange = formBuilderTextField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderTextField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTipChange = formBuilderTextField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderTextField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onTypeChange = formBuilderTextField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onUniqueChange = formBuilderTextField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnWidthChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onWidthChange = formBuilderTextField.getOnWidthChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_WIDTH_CHANGE, onWidthChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderTextField formBuilderTextField) throws IOException {
		java.lang.String onZIndexChange = formBuilderTextField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderTextField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}