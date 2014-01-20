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
package com.liferay.faces.alloy.component.formbuildermultiplechoicefield;

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
public abstract class FormBuilderMultipleChoiceFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-multiple-choice";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderMultipleChoiceField formBuilderMultipleChoiceField = (FormBuilderMultipleChoiceField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderMultipleChoiceField = new A.FormBuilderMultipleChoiceField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (formBuilderMultipleChoiceField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getFormBuilderMultipleChoiceFieldId() != null) {
			renderFormBuilderMultipleChoiceFieldId(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getName() != null) {
			renderName(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOptionTemplate() != null) {
			renderOptionTemplate(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOptions() != null) {
			renderOptions(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getFormBuilderMultipleChoiceFieldParent() != null) {
			renderFormBuilderMultipleChoiceFieldParent(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getType() != null) {
			renderType(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderMultipleChoiceField);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderMultipleChoiceField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterOptionTemplateChange() != null) {
			renderAfterOptionTemplateChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterOptionsChange() != null) {
			renderAfterOptionsChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderMultipleChoiceField);
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

		if (formBuilderMultipleChoiceField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnOptionTemplateChange() != null) {
			renderOnOptionTemplateChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnOptionsChange() != null) {
			renderOnOptionsChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderMultipleChoiceField);
		}
		
		if (formBuilderMultipleChoiceField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderMultipleChoiceField);
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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderMultipleChoiceField.getAcceptChildren();
		renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean builder = formBuilderMultipleChoiceField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.BUILDER, builder));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderMultipleChoiceField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderMultipleChoiceField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String dataType = formBuilderMultipleChoiceField.getDataType();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean disabled = formBuilderMultipleChoiceField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String dropZoneNode = formBuilderMultipleChoiceField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderMultipleChoiceField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderMultipleChoiceField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderMultipleChoiceFieldId(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String formBuilderMultipleChoiceFieldId = formBuilderMultipleChoiceField.getFormBuilderMultipleChoiceFieldId();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.FORM_BUILDER_MULTIPLE_CHOICE_FIELD_ID, formBuilderMultipleChoiceFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String label = formBuilderMultipleChoiceField.getLabel();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String labelNode = formBuilderMultipleChoiceField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object localizationMap = formBuilderMultipleChoiceField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderMultipleChoiceField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String name = formBuilderMultipleChoiceField.getName();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.NAME, name));
	}

	protected void renderOptionTemplate(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String optionTemplate = formBuilderMultipleChoiceField.getOptionTemplate();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.OPTION_TEMPLATE, optionTemplate));
	}

	protected void renderOptions(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object options = formBuilderMultipleChoiceField.getOptions();
		renderedAttributes.add(renderObject(FormBuilderMultipleChoiceField.OPTIONS, options));
	}

	protected void renderFormBuilderMultipleChoiceFieldParent(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String formBuilderMultipleChoiceFieldParent = formBuilderMultipleChoiceField.getFormBuilderMultipleChoiceFieldParent();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.FORM_BUILDER_MULTIPLE_CHOICE_FIELD_PARENT, formBuilderMultipleChoiceFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String predefinedValue = formBuilderMultipleChoiceField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean readOnly = formBuilderMultipleChoiceField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderMultipleChoiceField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderMultipleChoiceField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean required = formBuilderMultipleChoiceField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderMultipleChoiceField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean selected = formBuilderMultipleChoiceField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean showLabel = formBuilderMultipleChoiceField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object strings = formBuilderMultipleChoiceField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderMultipleChoiceField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object tabIndex = formBuilderMultipleChoiceField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderMultipleChoiceField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String template = formBuilderMultipleChoiceField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String templateNode = formBuilderMultipleChoiceField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String tip = formBuilderMultipleChoiceField.getTip();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String tipFlagNode = formBuilderMultipleChoiceField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String type = formBuilderMultipleChoiceField.getType();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Boolean unique = formBuilderMultipleChoiceField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderMultipleChoiceField.UNIQUE, unique));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.Object zIndex = formBuilderMultipleChoiceField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderMultipleChoiceField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderMultipleChoiceField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderMultipleChoiceField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderMultipleChoiceField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderMultipleChoiceField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderMultipleChoiceField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderMultipleChoiceField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderMultipleChoiceField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterIdChange = formBuilderMultipleChoiceField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterLabelChange = formBuilderMultipleChoiceField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderMultipleChoiceField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderMultipleChoiceField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterNameChange = formBuilderMultipleChoiceField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterOptionTemplateChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterOptionTemplateChange = formBuilderMultipleChoiceField.getAfterOptionTemplateChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_OPTION_TEMPLATE_CHANGE, afterOptionTemplateChange));
	}

	protected void renderAfterOptionsChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterOptionsChange = formBuilderMultipleChoiceField.getAfterOptionsChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_OPTIONS_CHANGE, afterOptionsChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterParentChange = formBuilderMultipleChoiceField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderMultipleChoiceField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderMultipleChoiceField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderMultipleChoiceField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderMultipleChoiceField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderMultipleChoiceField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderMultipleChoiceField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderMultipleChoiceField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterStringsChange = formBuilderMultipleChoiceField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderMultipleChoiceField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderMultipleChoiceField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderMultipleChoiceField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTipChange = formBuilderMultipleChoiceField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderMultipleChoiceField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterTypeChange = formBuilderMultipleChoiceField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderMultipleChoiceField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderMultipleChoiceField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderMultipleChoiceField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onBuilderChange = formBuilderMultipleChoiceField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderMultipleChoiceField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderMultipleChoiceField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onDisabledChange = formBuilderMultipleChoiceField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderMultipleChoiceField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderMultipleChoiceField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onIdChange = formBuilderMultipleChoiceField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onLabelChange = formBuilderMultipleChoiceField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderMultipleChoiceField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderMultipleChoiceField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onNameChange = formBuilderMultipleChoiceField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnOptionTemplateChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onOptionTemplateChange = formBuilderMultipleChoiceField.getOnOptionTemplateChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_OPTION_TEMPLATE_CHANGE, onOptionTemplateChange));
	}

	protected void renderOnOptionsChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onOptionsChange = formBuilderMultipleChoiceField.getOnOptionsChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_OPTIONS_CHANGE, onOptionsChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onParentChange = formBuilderMultipleChoiceField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderMultipleChoiceField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderMultipleChoiceField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderMultipleChoiceField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onRequiredChange = formBuilderMultipleChoiceField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderMultipleChoiceField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onSelectedChange = formBuilderMultipleChoiceField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderMultipleChoiceField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onStringsChange = formBuilderMultipleChoiceField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderMultipleChoiceField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTemplateChange = formBuilderMultipleChoiceField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderMultipleChoiceField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTipChange = formBuilderMultipleChoiceField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderMultipleChoiceField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onTypeChange = formBuilderMultipleChoiceField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onUniqueChange = formBuilderMultipleChoiceField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderMultipleChoiceField formBuilderMultipleChoiceField) throws IOException {
		java.lang.String onZIndexChange = formBuilderMultipleChoiceField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderMultipleChoiceField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}