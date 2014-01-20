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
package com.liferay.faces.alloy.component.formbuilderradiofield;

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
public abstract class FormBuilderRadioFieldRendererBase extends RendererBase {

	// Private Constants
	private static final String AUI_MODULE_NAME = "aui-form-builder-field-radio";

	protected void encodeJavaScriptMain(FacesContext facesContext, UIComponent uiComponent) throws IOException {

		FormBuilderRadioField formBuilderRadioField = (FormBuilderRadioField) uiComponent;

		ResponseWriter responseWriter = facesContext.getResponseWriter();

		responseWriter.write("var formBuilderRadioField = new A.FormBuilderRadioField");
		responseWriter.write(StringPool.OPEN_PARENTHESIS);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAttributes = new ArrayList<String>();

		if (formBuilderRadioField.getAcceptChildren() != null) {
			renderAcceptChildren(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getBuilder() != null) {
			renderBuilder(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getControlsToolbar() != null) {
			renderControlsToolbar(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getDataType() != null) {
			renderDataType(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getDisabled() != null) {
			renderDisabled(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getDropZoneNode() != null) {
			renderDropZoneNode(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getHiddenAttributes() != null) {
			renderHiddenAttributes(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getFormBuilderRadioFieldId() != null) {
			renderFormBuilderRadioFieldId(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getLabel() != null) {
			renderLabel(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getLabelNode() != null) {
			renderLabelNode(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getLocalizationMap() != null) {
			renderLocalizationMap(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getName() != null) {
			renderName(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOptionTemplate() != null) {
			renderOptionTemplate(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOptions() != null) {
			renderOptions(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getFormBuilderRadioFieldParent() != null) {
			renderFormBuilderRadioFieldParent(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getPredefinedValue() != null) {
			renderPredefinedValue(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getReadOnly() != null) {
			renderReadOnly(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getReadOnlyAttributes() != null) {
			renderReadOnlyAttributes(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getRequired() != null) {
			renderRequired(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getRequiredFlagNode() != null) {
			renderRequiredFlagNode(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getSelected() != null) {
			renderSelected(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getShowLabel() != null) {
			renderShowLabel(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getStrings() != null) {
			renderStrings(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getTabIndex() != null) {
			renderTabIndex(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getTemplate() != null) {
			renderTemplate(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getTemplateNode() != null) {
			renderTemplateNode(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getTip() != null) {
			renderTip(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getTipFlagNode() != null) {
			renderTipFlagNode(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getType() != null) {
			renderType(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getUnique() != null) {
			renderUnique(renderedAttributes, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getZIndex() != null) {
			renderZIndex(renderedAttributes, formBuilderRadioField);
		}
		

		for (String renderedAttribute : renderedAttributes) {
			responseWriter.write(renderedAttribute);
			responseWriter.write(StringPool.COMMA);
		}

		responseWriter.write("after");
		responseWriter.write(StringPool.COLON);
		responseWriter.write(StringPool.OPEN_CURLY_BRACE);

		List<String> renderedAfterEvents = new ArrayList<String>();

		if (formBuilderRadioField.getAfterAcceptChildrenChange() != null) {
			renderAfterAcceptChildrenChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterBuilderChange() != null) {
			renderAfterBuilderChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterControlsToolbarChange() != null) {
			renderAfterControlsToolbarChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterDataTypeChange() != null) {
			renderAfterDataTypeChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterDisabledChange() != null) {
			renderAfterDisabledChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterDropZoneNodeChange() != null) {
			renderAfterDropZoneNodeChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterHiddenAttributesChange() != null) {
			renderAfterHiddenAttributesChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterIdChange() != null) {
			renderAfterIdChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterLabelChange() != null) {
			renderAfterLabelChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterLabelNodeChange() != null) {
			renderAfterLabelNodeChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterLocalizationMapChange() != null) {
			renderAfterLocalizationMapChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterNameChange() != null) {
			renderAfterNameChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterOptionTemplateChange() != null) {
			renderAfterOptionTemplateChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterOptionsChange() != null) {
			renderAfterOptionsChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterParentChange() != null) {
			renderAfterParentChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterPredefinedValueChange() != null) {
			renderAfterPredefinedValueChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterReadOnlyChange() != null) {
			renderAfterReadOnlyChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterReadOnlyAttributesChange() != null) {
			renderAfterReadOnlyAttributesChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterRequiredChange() != null) {
			renderAfterRequiredChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterRequiredFlagNodeChange() != null) {
			renderAfterRequiredFlagNodeChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterSelectedChange() != null) {
			renderAfterSelectedChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterShowLabelChange() != null) {
			renderAfterShowLabelChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterStringsChange() != null) {
			renderAfterStringsChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterTabIndexChange() != null) {
			renderAfterTabIndexChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterTemplateChange() != null) {
			renderAfterTemplateChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterTemplateNodeChange() != null) {
			renderAfterTemplateNodeChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterTipChange() != null) {
			renderAfterTipChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterTipFlagNodeChange() != null) {
			renderAfterTipFlagNodeChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterTypeChange() != null) {
			renderAfterTypeChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterUniqueChange() != null) {
			renderAfterUniqueChange(renderedAfterEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getAfterZIndexChange() != null) {
			renderAfterZIndexChange(renderedAfterEvents, formBuilderRadioField);
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

		if (formBuilderRadioField.getOnAcceptChildrenChange() != null) {
			renderOnAcceptChildrenChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnBuilderChange() != null) {
			renderOnBuilderChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnControlsToolbarChange() != null) {
			renderOnControlsToolbarChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnDataTypeChange() != null) {
			renderOnDataTypeChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnDisabledChange() != null) {
			renderOnDisabledChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnDropZoneNodeChange() != null) {
			renderOnDropZoneNodeChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnHiddenAttributesChange() != null) {
			renderOnHiddenAttributesChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnIdChange() != null) {
			renderOnIdChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnLabelChange() != null) {
			renderOnLabelChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnLabelNodeChange() != null) {
			renderOnLabelNodeChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnLocalizationMapChange() != null) {
			renderOnLocalizationMapChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnNameChange() != null) {
			renderOnNameChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnOptionTemplateChange() != null) {
			renderOnOptionTemplateChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnOptionsChange() != null) {
			renderOnOptionsChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnParentChange() != null) {
			renderOnParentChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnPredefinedValueChange() != null) {
			renderOnPredefinedValueChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnReadOnlyChange() != null) {
			renderOnReadOnlyChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnReadOnlyAttributesChange() != null) {
			renderOnReadOnlyAttributesChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnRequiredChange() != null) {
			renderOnRequiredChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnRequiredFlagNodeChange() != null) {
			renderOnRequiredFlagNodeChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnSelectedChange() != null) {
			renderOnSelectedChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnShowLabelChange() != null) {
			renderOnShowLabelChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnStringsChange() != null) {
			renderOnStringsChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnTabIndexChange() != null) {
			renderOnTabIndexChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnTemplateChange() != null) {
			renderOnTemplateChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnTemplateNodeChange() != null) {
			renderOnTemplateNodeChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnTipChange() != null) {
			renderOnTipChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnTipFlagNodeChange() != null) {
			renderOnTipFlagNodeChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnTypeChange() != null) {
			renderOnTypeChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnUniqueChange() != null) {
			renderOnUniqueChange(renderedOnEvents, formBuilderRadioField);
		}
		
		if (formBuilderRadioField.getOnZIndexChange() != null) {
			renderOnZIndexChange(renderedOnEvents, formBuilderRadioField);
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

	protected void renderAcceptChildren(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean acceptChildren = formBuilderRadioField.getAcceptChildren();
		renderedAttributes.add(renderBoolean(FormBuilderRadioField.ACCEPT_CHILDREN, acceptChildren));
	}

	protected void renderBuilder(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean builder = formBuilderRadioField.getBuilder();
		renderedAttributes.add(renderBoolean(FormBuilderRadioField.BUILDER, builder));
	}

	protected void renderControlsToolbar(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object controlsToolbar = formBuilderRadioField.getControlsToolbar();
		renderedAttributes.add(renderObject(FormBuilderRadioField.CONTROLS_TOOLBAR, controlsToolbar));
	}

	protected void renderDataType(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String dataType = formBuilderRadioField.getDataType();
		renderedAttributes.add(renderString(FormBuilderRadioField.DATA_TYPE, dataType));
	}

	protected void renderDisabled(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean disabled = formBuilderRadioField.getDisabled();
		renderedAttributes.add(renderBoolean(FormBuilderRadioField.DISABLED, disabled));
	}

	protected void renderDropZoneNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String dropZoneNode = formBuilderRadioField.getDropZoneNode();
		renderedAttributes.add(renderString(FormBuilderRadioField.DROP_ZONE_NODE, dropZoneNode));
	}

	protected void renderHiddenAttributes(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object hiddenAttributes = formBuilderRadioField.getHiddenAttributes();
		renderedAttributes.add(renderArray(FormBuilderRadioField.HIDDEN_ATTRIBUTES, hiddenAttributes));
	}

	protected void renderFormBuilderRadioFieldId(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String formBuilderRadioFieldId = formBuilderRadioField.getFormBuilderRadioFieldId();
		renderedAttributes.add(renderString(FormBuilderRadioField.FORM_BUILDER_RADIO_FIELD_ID, formBuilderRadioFieldId));
	}

	protected void renderLabel(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String label = formBuilderRadioField.getLabel();
		renderedAttributes.add(renderString(FormBuilderRadioField.LABEL, label));
	}

	protected void renderLabelNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String labelNode = formBuilderRadioField.getLabelNode();
		renderedAttributes.add(renderString(FormBuilderRadioField.LABEL_NODE, labelNode));
	}

	protected void renderLocalizationMap(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object localizationMap = formBuilderRadioField.getLocalizationMap();
		renderedAttributes.add(renderObject(FormBuilderRadioField.LOCALIZATION_MAP, localizationMap));
	}

	protected void renderName(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String name = formBuilderRadioField.getName();
		renderedAttributes.add(renderString(FormBuilderRadioField.NAME, name));
	}

	protected void renderOptionTemplate(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String optionTemplate = formBuilderRadioField.getOptionTemplate();
		renderedAttributes.add(renderString(FormBuilderRadioField.OPTION_TEMPLATE, optionTemplate));
	}

	protected void renderOptions(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object options = formBuilderRadioField.getOptions();
		renderedAttributes.add(renderObject(FormBuilderRadioField.OPTIONS, options));
	}

	protected void renderFormBuilderRadioFieldParent(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String formBuilderRadioFieldParent = formBuilderRadioField.getFormBuilderRadioFieldParent();
		renderedAttributes.add(renderString(FormBuilderRadioField.FORM_BUILDER_RADIO_FIELD_PARENT, formBuilderRadioFieldParent));
	}

	protected void renderPredefinedValue(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String predefinedValue = formBuilderRadioField.getPredefinedValue();
		renderedAttributes.add(renderString(FormBuilderRadioField.PREDEFINED_VALUE, predefinedValue));
	}

	protected void renderReadOnly(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean readOnly = formBuilderRadioField.getReadOnly();
		renderedAttributes.add(renderBoolean(FormBuilderRadioField.READ_ONLY, readOnly));
	}

	protected void renderReadOnlyAttributes(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object readOnlyAttributes = formBuilderRadioField.getReadOnlyAttributes();
		renderedAttributes.add(renderArray(FormBuilderRadioField.READ_ONLY_ATTRIBUTES, readOnlyAttributes));
	}

	protected void renderRequired(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean required = formBuilderRadioField.getRequired();
		renderedAttributes.add(renderBoolean(FormBuilderRadioField.REQUIRED, required));
	}

	protected void renderRequiredFlagNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String requiredFlagNode = formBuilderRadioField.getRequiredFlagNode();
		renderedAttributes.add(renderString(FormBuilderRadioField.REQUIRED_FLAG_NODE, requiredFlagNode));
	}

	protected void renderSelected(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean selected = formBuilderRadioField.getSelected();
		renderedAttributes.add(renderBoolean(FormBuilderRadioField.SELECTED, selected));
	}

	protected void renderShowLabel(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean showLabel = formBuilderRadioField.getShowLabel();
		renderedAttributes.add(renderBoolean(FormBuilderRadioField.SHOW_LABEL, showLabel));
	}

	protected void renderStrings(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object strings = formBuilderRadioField.getStrings();
		renderedAttributes.add(renderObject(FormBuilderRadioField.STRINGS, strings));
	}

	protected void renderTabIndex(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object tabIndex = formBuilderRadioField.getTabIndex();
		renderedAttributes.add(renderNumber(FormBuilderRadioField.TAB_INDEX, tabIndex));
	}

	protected void renderTemplate(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String template = formBuilderRadioField.getTemplate();
		renderedAttributes.add(renderString(FormBuilderRadioField.TEMPLATE, template));
	}

	protected void renderTemplateNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String templateNode = formBuilderRadioField.getTemplateNode();
		renderedAttributes.add(renderString(FormBuilderRadioField.TEMPLATE_NODE, templateNode));
	}

	protected void renderTip(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String tip = formBuilderRadioField.getTip();
		renderedAttributes.add(renderString(FormBuilderRadioField.TIP, tip));
	}

	protected void renderTipFlagNode(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String tipFlagNode = formBuilderRadioField.getTipFlagNode();
		renderedAttributes.add(renderString(FormBuilderRadioField.TIP_FLAG_NODE, tipFlagNode));
	}

	protected void renderType(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String type = formBuilderRadioField.getType();
		renderedAttributes.add(renderString(FormBuilderRadioField.TYPE, type));
	}

	protected void renderUnique(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Boolean unique = formBuilderRadioField.getUnique();
		renderedAttributes.add(renderBoolean(FormBuilderRadioField.UNIQUE, unique));
	}

	protected void renderZIndex(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.Object zIndex = formBuilderRadioField.getZIndex();
		renderedAttributes.add(renderNumber(FormBuilderRadioField.Z_INDEX, zIndex));
	}

	protected void renderAfterAcceptChildrenChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterAcceptChildrenChange = formBuilderRadioField.getAfterAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_ACCEPT_CHILDREN_CHANGE, afterAcceptChildrenChange));
	}

	protected void renderAfterBuilderChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterBuilderChange = formBuilderRadioField.getAfterBuilderChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_BUILDER_CHANGE, afterBuilderChange));
	}

	protected void renderAfterControlsToolbarChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterControlsToolbarChange = formBuilderRadioField.getAfterControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_CONTROLS_TOOLBAR_CHANGE, afterControlsToolbarChange));
	}

	protected void renderAfterDataTypeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterDataTypeChange = formBuilderRadioField.getAfterDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_DATA_TYPE_CHANGE, afterDataTypeChange));
	}

	protected void renderAfterDisabledChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterDisabledChange = formBuilderRadioField.getAfterDisabledChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_DISABLED_CHANGE, afterDisabledChange));
	}

	protected void renderAfterDropZoneNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterDropZoneNodeChange = formBuilderRadioField.getAfterDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_DROP_ZONE_NODE_CHANGE, afterDropZoneNodeChange));
	}

	protected void renderAfterHiddenAttributesChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterHiddenAttributesChange = formBuilderRadioField.getAfterHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_HIDDEN_ATTRIBUTES_CHANGE, afterHiddenAttributesChange));
	}

	protected void renderAfterIdChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterIdChange = formBuilderRadioField.getAfterIdChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_ID_CHANGE, afterIdChange));
	}

	protected void renderAfterLabelChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterLabelChange = formBuilderRadioField.getAfterLabelChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_LABEL_CHANGE, afterLabelChange));
	}

	protected void renderAfterLabelNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterLabelNodeChange = formBuilderRadioField.getAfterLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_LABEL_NODE_CHANGE, afterLabelNodeChange));
	}

	protected void renderAfterLocalizationMapChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterLocalizationMapChange = formBuilderRadioField.getAfterLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_LOCALIZATION_MAP_CHANGE, afterLocalizationMapChange));
	}

	protected void renderAfterNameChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterNameChange = formBuilderRadioField.getAfterNameChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_NAME_CHANGE, afterNameChange));
	}

	protected void renderAfterOptionTemplateChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterOptionTemplateChange = formBuilderRadioField.getAfterOptionTemplateChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_OPTION_TEMPLATE_CHANGE, afterOptionTemplateChange));
	}

	protected void renderAfterOptionsChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterOptionsChange = formBuilderRadioField.getAfterOptionsChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_OPTIONS_CHANGE, afterOptionsChange));
	}

	protected void renderAfterParentChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterParentChange = formBuilderRadioField.getAfterParentChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_PARENT_CHANGE, afterParentChange));
	}

	protected void renderAfterPredefinedValueChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterPredefinedValueChange = formBuilderRadioField.getAfterPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_PREDEFINED_VALUE_CHANGE, afterPredefinedValueChange));
	}

	protected void renderAfterReadOnlyChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterReadOnlyChange = formBuilderRadioField.getAfterReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_READ_ONLY_CHANGE, afterReadOnlyChange));
	}

	protected void renderAfterReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterReadOnlyAttributesChange = formBuilderRadioField.getAfterReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_READ_ONLY_ATTRIBUTES_CHANGE, afterReadOnlyAttributesChange));
	}

	protected void renderAfterRequiredChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterRequiredChange = formBuilderRadioField.getAfterRequiredChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_REQUIRED_CHANGE, afterRequiredChange));
	}

	protected void renderAfterRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterRequiredFlagNodeChange = formBuilderRadioField.getAfterRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_REQUIRED_FLAG_NODE_CHANGE, afterRequiredFlagNodeChange));
	}

	protected void renderAfterSelectedChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterSelectedChange = formBuilderRadioField.getAfterSelectedChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_SELECTED_CHANGE, afterSelectedChange));
	}

	protected void renderAfterShowLabelChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterShowLabelChange = formBuilderRadioField.getAfterShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_SHOW_LABEL_CHANGE, afterShowLabelChange));
	}

	protected void renderAfterStringsChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterStringsChange = formBuilderRadioField.getAfterStringsChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_STRINGS_CHANGE, afterStringsChange));
	}

	protected void renderAfterTabIndexChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTabIndexChange = formBuilderRadioField.getAfterTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TAB_INDEX_CHANGE, afterTabIndexChange));
	}

	protected void renderAfterTemplateChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTemplateChange = formBuilderRadioField.getAfterTemplateChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TEMPLATE_CHANGE, afterTemplateChange));
	}

	protected void renderAfterTemplateNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTemplateNodeChange = formBuilderRadioField.getAfterTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TEMPLATE_NODE_CHANGE, afterTemplateNodeChange));
	}

	protected void renderAfterTipChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTipChange = formBuilderRadioField.getAfterTipChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TIP_CHANGE, afterTipChange));
	}

	protected void renderAfterTipFlagNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTipFlagNodeChange = formBuilderRadioField.getAfterTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TIP_FLAG_NODE_CHANGE, afterTipFlagNodeChange));
	}

	protected void renderAfterTypeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterTypeChange = formBuilderRadioField.getAfterTypeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_TYPE_CHANGE, afterTypeChange));
	}

	protected void renderAfterUniqueChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterUniqueChange = formBuilderRadioField.getAfterUniqueChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_UNIQUE_CHANGE, afterUniqueChange));
	}

	protected void renderAfterZIndexChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String afterZIndexChange = formBuilderRadioField.getAfterZIndexChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.AFTER_ZINDEX_CHANGE, afterZIndexChange));
	}

	protected void renderOnAcceptChildrenChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onAcceptChildrenChange = formBuilderRadioField.getOnAcceptChildrenChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_ACCEPT_CHILDREN_CHANGE, onAcceptChildrenChange));
	}

	protected void renderOnBuilderChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onBuilderChange = formBuilderRadioField.getOnBuilderChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_BUILDER_CHANGE, onBuilderChange));
	}

	protected void renderOnControlsToolbarChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onControlsToolbarChange = formBuilderRadioField.getOnControlsToolbarChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_CONTROLS_TOOLBAR_CHANGE, onControlsToolbarChange));
	}

	protected void renderOnDataTypeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onDataTypeChange = formBuilderRadioField.getOnDataTypeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_DATA_TYPE_CHANGE, onDataTypeChange));
	}

	protected void renderOnDisabledChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onDisabledChange = formBuilderRadioField.getOnDisabledChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_DISABLED_CHANGE, onDisabledChange));
	}

	protected void renderOnDropZoneNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onDropZoneNodeChange = formBuilderRadioField.getOnDropZoneNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_DROP_ZONE_NODE_CHANGE, onDropZoneNodeChange));
	}

	protected void renderOnHiddenAttributesChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onHiddenAttributesChange = formBuilderRadioField.getOnHiddenAttributesChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_HIDDEN_ATTRIBUTES_CHANGE, onHiddenAttributesChange));
	}

	protected void renderOnIdChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onIdChange = formBuilderRadioField.getOnIdChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_ID_CHANGE, onIdChange));
	}

	protected void renderOnLabelChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onLabelChange = formBuilderRadioField.getOnLabelChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_LABEL_CHANGE, onLabelChange));
	}

	protected void renderOnLabelNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onLabelNodeChange = formBuilderRadioField.getOnLabelNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_LABEL_NODE_CHANGE, onLabelNodeChange));
	}

	protected void renderOnLocalizationMapChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onLocalizationMapChange = formBuilderRadioField.getOnLocalizationMapChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_LOCALIZATION_MAP_CHANGE, onLocalizationMapChange));
	}

	protected void renderOnNameChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onNameChange = formBuilderRadioField.getOnNameChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_NAME_CHANGE, onNameChange));
	}

	protected void renderOnOptionTemplateChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onOptionTemplateChange = formBuilderRadioField.getOnOptionTemplateChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_OPTION_TEMPLATE_CHANGE, onOptionTemplateChange));
	}

	protected void renderOnOptionsChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onOptionsChange = formBuilderRadioField.getOnOptionsChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_OPTIONS_CHANGE, onOptionsChange));
	}

	protected void renderOnParentChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onParentChange = formBuilderRadioField.getOnParentChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_PARENT_CHANGE, onParentChange));
	}

	protected void renderOnPredefinedValueChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onPredefinedValueChange = formBuilderRadioField.getOnPredefinedValueChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_PREDEFINED_VALUE_CHANGE, onPredefinedValueChange));
	}

	protected void renderOnReadOnlyChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onReadOnlyChange = formBuilderRadioField.getOnReadOnlyChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_READ_ONLY_CHANGE, onReadOnlyChange));
	}

	protected void renderOnReadOnlyAttributesChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onReadOnlyAttributesChange = formBuilderRadioField.getOnReadOnlyAttributesChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_READ_ONLY_ATTRIBUTES_CHANGE, onReadOnlyAttributesChange));
	}

	protected void renderOnRequiredChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onRequiredChange = formBuilderRadioField.getOnRequiredChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_REQUIRED_CHANGE, onRequiredChange));
	}

	protected void renderOnRequiredFlagNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onRequiredFlagNodeChange = formBuilderRadioField.getOnRequiredFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_REQUIRED_FLAG_NODE_CHANGE, onRequiredFlagNodeChange));
	}

	protected void renderOnSelectedChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onSelectedChange = formBuilderRadioField.getOnSelectedChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_SELECTED_CHANGE, onSelectedChange));
	}

	protected void renderOnShowLabelChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onShowLabelChange = formBuilderRadioField.getOnShowLabelChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_SHOW_LABEL_CHANGE, onShowLabelChange));
	}

	protected void renderOnStringsChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onStringsChange = formBuilderRadioField.getOnStringsChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_STRINGS_CHANGE, onStringsChange));
	}

	protected void renderOnTabIndexChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTabIndexChange = formBuilderRadioField.getOnTabIndexChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_TAB_INDEX_CHANGE, onTabIndexChange));
	}

	protected void renderOnTemplateChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTemplateChange = formBuilderRadioField.getOnTemplateChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_TEMPLATE_CHANGE, onTemplateChange));
	}

	protected void renderOnTemplateNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTemplateNodeChange = formBuilderRadioField.getOnTemplateNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_TEMPLATE_NODE_CHANGE, onTemplateNodeChange));
	}

	protected void renderOnTipChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTipChange = formBuilderRadioField.getOnTipChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_TIP_CHANGE, onTipChange));
	}

	protected void renderOnTipFlagNodeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTipFlagNodeChange = formBuilderRadioField.getOnTipFlagNodeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_TIP_FLAG_NODE_CHANGE, onTipFlagNodeChange));
	}

	protected void renderOnTypeChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onTypeChange = formBuilderRadioField.getOnTypeChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_TYPE_CHANGE, onTypeChange));
	}

	protected void renderOnUniqueChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onUniqueChange = formBuilderRadioField.getOnUniqueChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_UNIQUE_CHANGE, onUniqueChange));
	}

	protected void renderOnZIndexChange(List<String> renderedAttributes, FormBuilderRadioField formBuilderRadioField) throws IOException {
		java.lang.String onZIndexChange = formBuilderRadioField.getOnZIndexChange();
		renderedAttributes.add(renderString(FormBuilderRadioField.ON_ZINDEX_CHANGE, onZIndexChange));
	}

}