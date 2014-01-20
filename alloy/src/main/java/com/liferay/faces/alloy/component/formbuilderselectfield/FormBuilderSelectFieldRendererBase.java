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
package com.liferay.faces.alloy.component.formbuilderselectfield;

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
public abstract class FormBuilderSelectFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-select";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderSelectField formBuilderSelectField = (FormBuilderSelectField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderSelectField = new A.FormBuilderSelectField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (formBuilderSelectField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getFormBuilderSelectFieldId() != null) {
			renderFormBuilderSelectFieldId(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getMultiple() != null) {
			renderMultiple(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getName() != null) {
			renderName(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOptionTemplate() != null) {
			renderOptionTemplate(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOptions() != null) {
			renderOptions(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getFormBuilderSelectFieldParent() != null) {
			renderFormBuilderSelectFieldParent(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getType() != null) {
			renderType(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderSelectField);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderSelectField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterMultipleChange() != null) {
			renderAfterMultipleChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterOptionTemplateChange() != null) {
			renderAfterOptionTemplateChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterOptionsChange() != null) {
			renderAfterOptionsChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderSelectField);
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

		if (formBuilderSelectField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnMultipleChange() != null) {
			renderOnMultipleChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnOptionTemplateChange() != null) {
			renderOnOptionTemplateChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnOptionsChange() != null) {
			renderOnOptionsChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderSelectField);
		}
		
		if (formBuilderSelectField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderSelectField);
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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderSelectField.getAcceptChildren();
		renderedAttributes.add(renderBoolean(FormBuilderSelectField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean builder = formBuilderSelectField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderSelectField.BUILDER, builder));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderSelectField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderSelectField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String dataType = formBuilderSelectField.getDataType();
		renderedAttributes.add(renderString(FormBuilderSelectField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean disabled = formBuilderSelectField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderSelectField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String dropZoneNode = formBuilderSelectField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderSelectField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderSelectField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderSelectField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderSelectFieldId(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String formBuilderSelectFieldId = formBuilderSelectField.getFormBuilderSelectFieldId();
		renderedAttributes.add(renderString(FormBuilderSelectField.FORM_BUILDER_SELECT_FIELD_ID, formBuilderSelectFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String label = formBuilderSelectField.getLabel();
		renderedAttributes.add(renderString(FormBuilderSelectField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String labelNode = formBuilderSelectField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderSelectField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object localizationMap = formBuilderSelectField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderSelectField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderMultiple(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean multiple = formBuilderSelectField.getMultiple();
		renderedAttributes.add(renderBoolean(FormBuilderSelectField.MULTIPLE, multiple));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String name = formBuilderSelectField.getName();
		renderedAttributes.add(renderString(FormBuilderSelectField.NAME, name));
	}

	protected void renderOptionTemplate(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String optionTemplate = formBuilderSelectField.getOptionTemplate();
		renderedAttributes.add(renderString(FormBuilderSelectField.OPTION_TEMPLATE, optionTemplate));
	}

	protected void renderOptions(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object options = formBuilderSelectField.getOptions();
		renderedAttributes.add(renderObject(FormBuilderSelectField.OPTIONS, options));
	}

	protected void renderFormBuilderSelectFieldParent(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String formBuilderSelectFieldParent = formBuilderSelectField.getFormBuilderSelectFieldParent();
		renderedAttributes.add(renderString(FormBuilderSelectField.FORM_BUILDER_SELECT_FIELD_PARENT, formBuilderSelectFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String predefinedValue = formBuilderSelectField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderSelectField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean readOnly = formBuilderSelectField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderSelectField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderSelectField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderSelectField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean required = formBuilderSelectField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderSelectField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderSelectField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderSelectField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean selected = formBuilderSelectField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderSelectField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean showLabel = formBuilderSelectField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderSelectField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object strings = formBuilderSelectField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderSelectField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object tabIndex = formBuilderSelectField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderSelectField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String template = formBuilderSelectField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderSelectField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String templateNode = formBuilderSelectField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderSelectField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String tip = formBuilderSelectField.getTip();
		renderedAttributes.add(renderString(FormBuilderSelectField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String tipFlagNode = formBuilderSelectField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderSelectField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String type = formBuilderSelectField.getType();
		renderedAttributes.add(renderString(FormBuilderSelectField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Boolean unique = formBuilderSelectField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderSelectField.UNIQUE, unique));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.Object zIndex = formBuilderSelectField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderSelectField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderSelectField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderSelectField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderSelectField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderSelectField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderSelectField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderSelectField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderSelectField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterIdChange = formBuilderSelectField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterLabelChange = formBuilderSelectField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderSelectField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderSelectField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterMultipleChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterMultipleChange = formBuilderSelectField.getAfterMultipleChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_MULTIPLE_CHANGE, afterMultipleChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterNameChange = formBuilderSelectField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterOptionTemplateChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterOptionTemplateChange = formBuilderSelectField.getAfterOptionTemplateChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_OPTION_TEMPLATE_CHANGE, afterOptionTemplateChange));
	}

	protected void renderAfterOptionsChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterOptionsChange = formBuilderSelectField.getAfterOptionsChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_OPTIONS_CHANGE, afterOptionsChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterParentChange = formBuilderSelectField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderSelectField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderSelectField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderSelectField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderSelectField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderSelectField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderSelectField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderSelectField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterStringsChange = formBuilderSelectField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderSelectField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderSelectField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderSelectField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTipChange = formBuilderSelectField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderSelectField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterTypeChange = formBuilderSelectField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderSelectField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderSelectField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderSelectField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onBuilderChange = formBuilderSelectField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderSelectField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderSelectField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onDisabledChange = formBuilderSelectField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderSelectField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderSelectField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onIdChange = formBuilderSelectField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onLabelChange = formBuilderSelectField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderSelectField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderSelectField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnMultipleChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onMultipleChange = formBuilderSelectField.getOnMultipleChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_MULTIPLE_CHANGE, onMultipleChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onNameChange = formBuilderSelectField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnOptionTemplateChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onOptionTemplateChange = formBuilderSelectField.getOnOptionTemplateChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_OPTION_TEMPLATE_CHANGE, onOptionTemplateChange));
	}

	protected void renderOnOptionsChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onOptionsChange = formBuilderSelectField.getOnOptionsChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_OPTIONS_CHANGE, onOptionsChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onParentChange = formBuilderSelectField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderSelectField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderSelectField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderSelectField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onRequiredChange = formBuilderSelectField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderSelectField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onSelectedChange = formBuilderSelectField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderSelectField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onStringsChange = formBuilderSelectField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderSelectField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTemplateChange = formBuilderSelectField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderSelectField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTipChange = formBuilderSelectField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderSelectField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onTypeChange = formBuilderSelectField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onUniqueChange = formBuilderSelectField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderSelectField formBuilderSelectField) throws IOException {
		java.lang.String onZIndexChange = formBuilderSelectField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderSelectField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}